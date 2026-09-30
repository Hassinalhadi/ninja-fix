package com.google.maps.android.clustering.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.R;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.ui.IconGenerator;
import com.google.maps.android.ui.SquareTextView;
import com.zendesk.service.HttpConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import t6.T3;
import x6.k;
import x6.n;
import z6.e;
import z6.f;

/* loaded from: classes2.dex */
public class DefaultClusterRenderer<T extends ClusterItem> implements ClusterRenderer<T> {
    private ClusterManager.OnClusterClickListener<T> mClickListener;
    private final ClusterManager<T> mClusterManager;
    private Set<? extends Cluster<T>> mClusters;
    private ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    private final IconGenerator mIconGenerator;
    private ClusterManager.OnClusterInfoWindowClickListener<T> mInfoWindowClickListener;
    private ClusterManager.OnClusterInfoWindowLongClickListener<T> mInfoWindowLongClickListener;
    private ClusterManager.OnClusterItemClickListener<T> mItemClickListener;
    private ClusterManager.OnClusterItemInfoWindowClickListener<T> mItemInfoWindowClickListener;
    private ClusterManager.OnClusterItemInfoWindowLongClickListener<T> mItemInfoWindowLongClickListener;
    private final k mMap;
    private float mZoom;
    private static final int[] BUCKETS = {10, 20, 50, 100, 200, HttpConstants.HTTP_INTERNAL_ERROR, 1000};
    private static final TimeInterpolator ANIMATION_INTERP = new DecelerateInterpolator();
    private final Executor mExecutor = Executors.newSingleThreadExecutor();
    private Set<MarkerWithPosition> mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
    private SparseArray<z6.b> mIcons = new SparseArray<>();
    private MarkerCache<T> mMarkerCache = new MarkerCache<>(0);
    private int mMinClusterSize = 4;
    private MarkerCache<Cluster<T>> mClusterMarkerCache = new MarkerCache<>(0);
    private final DefaultClusterRenderer<T>.ViewModifier mViewModifier = new ViewModifier(this, 0);
    private boolean mAnimate = true;
    private long mAnimationDurationMs = 300;

    /* loaded from: classes2.dex */
    public class AnimationTask extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private final LatLng from;
        private MarkerManager mMarkerManager;
        private boolean mRemoveOnComplete;
        private final f marker;
        private final MarkerWithPosition markerWithPosition;
        private final LatLng to;

        public /* synthetic */ AnimationTask(DefaultClusterRenderer defaultClusterRenderer, MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2, int i4) {
            this(markerWithPosition, latLng, latLng2);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.mRemoveOnComplete) {
                DefaultClusterRenderer.this.mMarkerCache.remove(this.marker);
                DefaultClusterRenderer.this.mClusterMarkerCache.remove(this.marker);
                this.mMarkerManager.remove(this.marker);
            }
            this.markerWithPosition.position = this.to;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.to != null && this.from != null && this.marker != null) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                LatLng latLng = this.to;
                double d4 = latLng.alpha;
                LatLng latLng2 = this.from;
                double d9 = latLng2.alpha;
                double d10 = animatedFraction;
                double d11 = ((d4 - d9) * d10) + d9;
                double d12 = latLng.purple - latLng2.purple;
                if (Math.abs(d12) > 180.0d) {
                    d12 -= Math.signum(d12) * 360.0d;
                }
                this.marker.golf(new LatLng(d11, (d12 * d10) + this.from.purple));
            }
        }

        public void perform() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(DefaultClusterRenderer.ANIMATION_INTERP);
            ofFloat.setDuration(DefaultClusterRenderer.this.mAnimationDurationMs);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        public void removeOnAnimationComplete(MarkerManager markerManager) {
            this.mMarkerManager = markerManager;
            this.mRemoveOnComplete = true;
        }

        private AnimationTask(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.markerWithPosition = markerWithPosition;
            this.marker = markerWithPosition.marker;
            this.from = latLng;
            this.to = latLng2;
        }
    }

    /* loaded from: classes2.dex */
    public class CreateMarkerTask {
        private final LatLng animateFrom;
        private final Cluster<T> cluster;
        private final Set<MarkerWithPosition> newMarkers;

        public CreateMarkerTask(Cluster<T> cluster, Set<MarkerWithPosition> set, LatLng latLng) {
            this.cluster = cluster;
            this.newMarkers = set;
            this.animateFrom = latLng;
        }

        public void perform(DefaultClusterRenderer<T>.MarkerModifier markerModifier) {
            MarkerWithPosition markerWithPosition;
            MarkerWithPosition markerWithPosition2;
            if (!DefaultClusterRenderer.this.shouldRenderAsCluster(this.cluster)) {
                for (T t5 : this.cluster.getItems()) {
                    f fVar = DefaultClusterRenderer.this.mMarkerCache.get((MarkerCache) t5);
                    if (fVar == null) {
                        MarkerOptions markerOptions = new MarkerOptions();
                        LatLng latLng = this.animateFrom;
                        if (latLng != null) {
                            markerOptions.alpha = latLng;
                        } else {
                            markerOptions.J(t5.getPosition());
                            if (t5.getZIndex() != null) {
                                markerOptions.f7482g = t5.getZIndex().floatValue();
                            }
                        }
                        DefaultClusterRenderer.this.onBeforeClusterItemRendered(t5, markerOptions);
                        fVar = DefaultClusterRenderer.this.mClusterManager.getMarkerCollection().addMarker(markerOptions);
                        markerWithPosition2 = new MarkerWithPosition(fVar, 0);
                        DefaultClusterRenderer.this.mMarkerCache.put(t5, fVar);
                        LatLng latLng2 = this.animateFrom;
                        if (latLng2 != null) {
                            markerModifier.animate(markerWithPosition2, latLng2, t5.getPosition());
                        }
                    } else {
                        markerWithPosition2 = new MarkerWithPosition(fVar, 0);
                        DefaultClusterRenderer.this.onClusterItemUpdated(t5, fVar);
                    }
                    DefaultClusterRenderer.this.onClusterItemRendered(t5, fVar);
                    this.newMarkers.add(markerWithPosition2);
                }
                return;
            }
            f fVar2 = DefaultClusterRenderer.this.mClusterMarkerCache.get((MarkerCache) this.cluster);
            if (fVar2 == null) {
                MarkerOptions markerOptions2 = new MarkerOptions();
                LatLng latLng3 = this.animateFrom;
                if (latLng3 == null) {
                    latLng3 = this.cluster.getPosition();
                }
                markerOptions2.J(latLng3);
                DefaultClusterRenderer.this.onBeforeClusterRendered(this.cluster, markerOptions2);
                fVar2 = DefaultClusterRenderer.this.mClusterManager.getClusterMarkerCollection().addMarker(markerOptions2);
                DefaultClusterRenderer.this.mClusterMarkerCache.put(this.cluster, fVar2);
                markerWithPosition = new MarkerWithPosition(fVar2, 0);
                LatLng latLng4 = this.animateFrom;
                if (latLng4 != null) {
                    markerModifier.animate(markerWithPosition, latLng4, this.cluster.getPosition());
                }
            } else {
                markerWithPosition = new MarkerWithPosition(fVar2, 0);
                DefaultClusterRenderer.this.onClusterUpdated(this.cluster, fVar2);
            }
            DefaultClusterRenderer.this.onClusterRendered(this.cluster, fVar2);
            this.newMarkers.add(markerWithPosition);
        }
    }

    /* loaded from: classes2.dex */
    public static class MarkerCache<T> {
        private Map<T, f> mCache;
        private Map<f, T> mCacheReverse;

        public /* synthetic */ MarkerCache(int i4) {
            this();
        }

        public f get(T t5) {
            return this.mCache.get(t5);
        }

        public void put(T t5, f fVar) {
            this.mCache.put(t5, fVar);
            this.mCacheReverse.put(fVar, t5);
        }

        public void remove(f fVar) {
            T t5 = this.mCacheReverse.get(fVar);
            this.mCacheReverse.remove(fVar);
            this.mCache.remove(t5);
        }

        private MarkerCache() {
            this.mCache = new HashMap();
            this.mCacheReverse = new HashMap();
        }

        public T get(f fVar) {
            return this.mCacheReverse.get(fVar);
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public class MarkerModifier extends Handler implements MessageQueue.IdleHandler {
        private static final int BLANK = 0;
        private final Condition busyCondition;
        private final Lock lock;
        private Queue<DefaultClusterRenderer<T>.AnimationTask> mAnimationTasks;
        private Queue<DefaultClusterRenderer<T>.CreateMarkerTask> mCreateMarkerTasks;
        private boolean mListenerAdded;
        private Queue<DefaultClusterRenderer<T>.CreateMarkerTask> mOnScreenCreateMarkerTasks;
        private Queue<f> mOnScreenRemoveMarkerTasks;
        private Queue<f> mRemoveMarkerTasks;

        public /* synthetic */ MarkerModifier(DefaultClusterRenderer defaultClusterRenderer, int i4) {
            this();
        }

        private void performNextTask() {
            if (!this.mOnScreenRemoveMarkerTasks.isEmpty()) {
                removeMarker(this.mOnScreenRemoveMarkerTasks.poll());
                return;
            }
            if (!this.mAnimationTasks.isEmpty()) {
                this.mAnimationTasks.poll().perform();
                return;
            }
            if (!this.mOnScreenCreateMarkerTasks.isEmpty()) {
                this.mOnScreenCreateMarkerTasks.poll().perform(this);
            } else if (!this.mCreateMarkerTasks.isEmpty()) {
                this.mCreateMarkerTasks.poll().perform(this);
            } else if (!this.mRemoveMarkerTasks.isEmpty()) {
                removeMarker(this.mRemoveMarkerTasks.poll());
            }
        }

        private void removeMarker(f fVar) {
            DefaultClusterRenderer.this.mMarkerCache.remove(fVar);
            DefaultClusterRenderer.this.mClusterMarkerCache.remove(fVar);
            DefaultClusterRenderer.this.mClusterManager.getMarkerManager().remove(fVar);
        }

        public void add(boolean z2, DefaultClusterRenderer<T>.CreateMarkerTask createMarkerTask) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z2) {
                this.mOnScreenCreateMarkerTasks.add(createMarkerTask);
            } else {
                this.mCreateMarkerTasks.add(createMarkerTask);
            }
            this.lock.unlock();
        }

        public void animate(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            this.mAnimationTasks.add(new AnimationTask(DefaultClusterRenderer.this, markerWithPosition, latLng, latLng2, 0));
            this.lock.unlock();
        }

        public void animateThenRemove(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            DefaultClusterRenderer<T>.AnimationTask animationTask = new AnimationTask(DefaultClusterRenderer.this, markerWithPosition, latLng, latLng2, 0);
            animationTask.removeOnAnimationComplete(DefaultClusterRenderer.this.mClusterManager.getMarkerManager());
            this.mAnimationTasks.add(animationTask);
            this.lock.unlock();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.mListenerAdded) {
                Looper.myQueue().addIdleHandler(this);
                this.mListenerAdded = true;
            }
            removeMessages(0);
            this.lock.lock();
            for (int i4 = 0; i4 < 10; i4++) {
                try {
                    performNextTask();
                } catch (Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            }
            if (!isBusy()) {
                this.mListenerAdded = false;
                Looper.myQueue().removeIdleHandler(this);
                this.busyCondition.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10L);
            }
            this.lock.unlock();
        }

        public boolean isBusy() {
            boolean z2;
            try {
                this.lock.lock();
                if (this.mCreateMarkerTasks.isEmpty() && this.mOnScreenCreateMarkerTasks.isEmpty() && this.mOnScreenRemoveMarkerTasks.isEmpty() && this.mRemoveMarkerTasks.isEmpty()) {
                    if (this.mAnimationTasks.isEmpty()) {
                        z2 = false;
                        return z2;
                    }
                }
                z2 = true;
                return z2;
            } finally {
                this.lock.unlock();
            }
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public void remove(boolean z2, f fVar) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z2) {
                this.mOnScreenRemoveMarkerTasks.add(fVar);
            } else {
                this.mRemoveMarkerTasks.add(fVar);
            }
            this.lock.unlock();
        }

        public void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                this.lock.lock();
                try {
                    try {
                        if (isBusy()) {
                            this.busyCondition.await();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    this.lock.unlock();
                }
            }
        }

        private MarkerModifier() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.busyCondition = reentrantLock.newCondition();
            this.mCreateMarkerTasks = new LinkedList();
            this.mOnScreenCreateMarkerTasks = new LinkedList();
            this.mRemoveMarkerTasks = new LinkedList();
            this.mOnScreenRemoveMarkerTasks = new LinkedList();
            this.mAnimationTasks = new LinkedList();
        }
    }

    /* loaded from: classes2.dex */
    public static class MarkerWithPosition {
        private final f marker;
        private LatLng position;

        public /* synthetic */ MarkerWithPosition(f fVar, int i4) {
            this(fVar);
        }

        public boolean equals(Object obj) {
            if (obj instanceof MarkerWithPosition) {
                return this.marker.equals(((MarkerWithPosition) obj).marker);
            }
            return false;
        }

        public int hashCode() {
            return this.marker.hashCode();
        }

        private MarkerWithPosition(f fVar) {
            this.marker = fVar;
            this.position = fVar.bravo();
        }
    }

    /* loaded from: classes2.dex */
    public class RenderTask implements Runnable {
        final Set<? extends Cluster<T>> clusters;
        private Runnable mCallback;
        private float mMapZoom;
        private n mProjection;
        private SphericalMercatorProjection mSphericalMercatorProjection;

        public /* synthetic */ RenderTask(DefaultClusterRenderer defaultClusterRenderer, Set set, int i4) {
            this(set);
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            LatLngBounds alpha;
            ArrayList arrayList;
            DefaultClusterRenderer defaultClusterRenderer = DefaultClusterRenderer.this;
            if (!defaultClusterRenderer.shouldRender(defaultClusterRenderer.immutableOf(defaultClusterRenderer.mClusters), DefaultClusterRenderer.this.immutableOf(this.clusters))) {
                this.mCallback.run();
                return;
            }
            boolean z2 = false;
            MarkerModifier markerModifier = new MarkerModifier(DefaultClusterRenderer.this, 0);
            float f5 = this.mMapZoom;
            if (f5 > DefaultClusterRenderer.this.mZoom) {
                z2 = true;
            }
            float f10 = f5 - DefaultClusterRenderer.this.mZoom;
            Set<MarkerWithPosition> set = DefaultClusterRenderer.this.mMarkers;
            try {
                alpha = this.mProjection.alpha().teal;
            } catch (Exception e) {
                e.printStackTrace();
                e o5 = LatLngBounds.o();
                o5.bravo(new LatLng(0.0d, 0.0d));
                alpha = o5.alpha();
            }
            ArrayList arrayList2 = null;
            if (DefaultClusterRenderer.this.mClusters != null && DefaultClusterRenderer.this.mAnimate) {
                arrayList = new ArrayList();
                for (Cluster<T> cluster : DefaultClusterRenderer.this.mClusters) {
                    if (DefaultClusterRenderer.this.shouldRenderAsCluster(cluster) && alpha.E(cluster.getPosition())) {
                        arrayList.add(this.mSphericalMercatorProjection.toPoint(cluster.getPosition()));
                    }
                }
            } else {
                arrayList = null;
            }
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (Cluster<T> cluster2 : this.clusters) {
                boolean E4 = alpha.E(cluster2.getPosition());
                if (z2 && E4 && DefaultClusterRenderer.this.mAnimate) {
                    Point findClosestCluster = DefaultClusterRenderer.this.findClosestCluster(arrayList, this.mSphericalMercatorProjection.toPoint(cluster2.getPosition()));
                    if (findClosestCluster != null) {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, newSetFromMap, this.mSphericalMercatorProjection.toLatLng(findClosestCluster)));
                    } else {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, newSetFromMap, null));
                    }
                } else {
                    markerModifier.add(E4, new CreateMarkerTask(cluster2, newSetFromMap, null));
                }
            }
            markerModifier.waitUntilFree();
            set.removeAll(newSetFromMap);
            if (DefaultClusterRenderer.this.mAnimate) {
                arrayList2 = new ArrayList();
                for (Cluster<T> cluster3 : this.clusters) {
                    if (DefaultClusterRenderer.this.shouldRenderAsCluster(cluster3) && alpha.E(cluster3.getPosition())) {
                        arrayList2.add(this.mSphericalMercatorProjection.toPoint(cluster3.getPosition()));
                    }
                }
            }
            for (MarkerWithPosition markerWithPosition : set) {
                boolean E10 = alpha.E(markerWithPosition.position);
                if (!z2 && f10 > -3.0f && E10 && DefaultClusterRenderer.this.mAnimate) {
                    Point findClosestCluster2 = DefaultClusterRenderer.this.findClosestCluster(arrayList2, this.mSphericalMercatorProjection.toPoint(markerWithPosition.position));
                    if (findClosestCluster2 != null) {
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.position, this.mSphericalMercatorProjection.toLatLng(findClosestCluster2));
                    } else {
                        markerModifier.remove(true, markerWithPosition.marker);
                    }
                } else {
                    markerModifier.remove(E10, markerWithPosition.marker);
                }
            }
            markerModifier.waitUntilFree();
            DefaultClusterRenderer.this.mMarkers = newSetFromMap;
            DefaultClusterRenderer.this.mClusters = this.clusters;
            DefaultClusterRenderer.this.mZoom = f5;
            this.mCallback.run();
        }

        public void setCallback(Runnable runnable) {
            this.mCallback = runnable;
        }

        public void setMapZoom(float f5) {
            this.mMapZoom = f5;
            this.mSphericalMercatorProjection = new SphericalMercatorProjection(Math.pow(2.0d, Math.min(f5, DefaultClusterRenderer.this.mZoom)) * 256.0d);
        }

        public void setProjection(n nVar) {
            this.mProjection = nVar;
        }

        private RenderTask(Set<? extends Cluster<T>> set) {
            this.clusters = set;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public class ViewModifier extends Handler {
        private static final int RUN_TASK = 0;
        private static final int TASK_FINISHED = 1;
        private DefaultClusterRenderer<T>.RenderTask mNextClusters;
        private boolean mViewModificationInProgress;

        public /* synthetic */ ViewModifier(DefaultClusterRenderer defaultClusterRenderer, int i4) {
            this();
        }

        public /* synthetic */ void lambda$handleMessage$0() {
            sendEmptyMessage(1);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            DefaultClusterRenderer<T>.RenderTask renderTask;
            if (message.what == 1) {
                this.mViewModificationInProgress = false;
                if (this.mNextClusters != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.mViewModificationInProgress || this.mNextClusters == null) {
                return;
            }
            n delta = DefaultClusterRenderer.this.mMap.delta();
            synchronized (this) {
                renderTask = this.mNextClusters;
                this.mNextClusters = null;
                this.mViewModificationInProgress = true;
            }
            renderTask.setCallback(new b(3, this));
            renderTask.setProjection(delta);
            renderTask.setMapZoom(DefaultClusterRenderer.this.mMap.charlie().purple);
            DefaultClusterRenderer.this.mExecutor.execute(renderTask);
        }

        public void queue(Set<? extends Cluster<T>> set) {
            synchronized (this) {
                this.mNextClusters = new RenderTask(DefaultClusterRenderer.this, set, 0);
            }
            sendEmptyMessage(0);
        }

        private ViewModifier() {
            this.mViewModificationInProgress = false;
            this.mNextClusters = null;
        }
    }

    public DefaultClusterRenderer(Context context, k kVar, ClusterManager<T> clusterManager) {
        this.mMap = kVar;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        IconGenerator iconGenerator = new IconGenerator(context);
        this.mIconGenerator = iconGenerator;
        iconGenerator.setContentView(makeSquareTextView(context));
        iconGenerator.setTextAppearance(R.style.amu_ClusterIcon_TextAppearance);
        iconGenerator.setBackground(makeClusterBackground());
        this.mClusterManager = clusterManager;
    }

    private static double distanceSquared(Point point, Point point2) {
        double d4 = point.f8319x;
        double d9 = point2.f8319x;
        double d10 = (d4 - d9) * (d4 - d9);
        double d11 = point.f8320y;
        double d12 = point2.f8320y;
        return ((d11 - d12) * (d11 - d12)) + d10;
    }

    public Point findClosestCluster(List<Point> list, Point point) {
        Point point2 = null;
        if (list != null && !list.isEmpty()) {
            int maxDistanceBetweenClusteredItems = this.mClusterManager.getAlgorithm().getMaxDistanceBetweenClusteredItems();
            double d4 = maxDistanceBetweenClusteredItems * maxDistanceBetweenClusteredItems;
            for (Point point3 : list) {
                double distanceSquared = distanceSquared(point3, point);
                if (distanceSquared < d4) {
                    point2 = point3;
                    d4 = distanceSquared;
                }
            }
        }
        return point2;
    }

    public Set<? extends Cluster<T>> immutableOf(Set<? extends Cluster<T>> set) {
        if (set != null) {
            return Collections.unmodifiableSet(set);
        }
        return Collections.EMPTY_SET;
    }

    public /* synthetic */ boolean lambda$onAdd$0(f fVar) {
        ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener = this.mItemClickListener;
        if (onClusterItemClickListener != null && onClusterItemClickListener.onClusterItemClick(this.mMarkerCache.get(fVar))) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$onAdd$1(f fVar) {
        ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener = this.mItemInfoWindowClickListener;
        if (onClusterItemInfoWindowClickListener != null) {
            onClusterItemInfoWindowClickListener.onClusterItemInfoWindowClick(this.mMarkerCache.get(fVar));
        }
    }

    public /* synthetic */ void lambda$onAdd$2(f fVar) {
        ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener = this.mItemInfoWindowLongClickListener;
        if (onClusterItemInfoWindowLongClickListener != null) {
            onClusterItemInfoWindowLongClickListener.onClusterItemInfoWindowLongClick(this.mMarkerCache.get(fVar));
        }
    }

    public /* synthetic */ boolean lambda$onAdd$3(f fVar) {
        ClusterManager.OnClusterClickListener<T> onClusterClickListener = this.mClickListener;
        if (onClusterClickListener != null && onClusterClickListener.onClusterClick(this.mClusterMarkerCache.get(fVar))) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$onAdd$4(f fVar) {
        ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener = this.mInfoWindowClickListener;
        if (onClusterInfoWindowClickListener != null) {
            onClusterInfoWindowClickListener.onClusterInfoWindowClick(this.mClusterMarkerCache.get(fVar));
        }
    }

    public /* synthetic */ void lambda$onAdd$5(f fVar) {
        ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener = this.mInfoWindowLongClickListener;
        if (onClusterInfoWindowLongClickListener != null) {
            onClusterInfoWindowLongClickListener.onClusterInfoWindowLongClick(this.mClusterMarkerCache.get(fVar));
        }
    }

    private LayerDrawable makeClusterBackground() {
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i4 = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i4, i4, i4, i4);
        return layerDrawable;
    }

    private SquareTextView makeSquareTextView(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(R.id.amu_text);
        int i4 = (int) (this.mDensity * 12.0f);
        squareTextView.setPadding(i4, i4, i4, i4);
        return squareTextView;
    }

    public int getBucket(Cluster<T> cluster) {
        int size = cluster.getSize();
        int i4 = 0;
        if (size <= BUCKETS[0]) {
            return size;
        }
        while (true) {
            int[] iArr = BUCKETS;
            if (i4 < iArr.length - 1) {
                int i5 = i4 + 1;
                if (size < iArr[i5]) {
                    return iArr[i4];
                }
                i4 = i5;
            } else {
                return iArr[iArr.length - 1];
            }
        }
    }

    public Cluster<T> getCluster(f fVar) {
        return this.mClusterMarkerCache.get(fVar);
    }

    public T getClusterItem(f fVar) {
        return this.mMarkerCache.get(fVar);
    }

    public String getClusterText(int i4) {
        if (i4 < BUCKETS[0]) {
            return String.valueOf(i4);
        }
        return i4 + "+";
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public int getClusterTextAppearance(int i4) {
        return R.style.amu_ClusterIcon_TextAppearance;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public int getColor(int i4) {
        float min = 300.0f - Math.min(i4, 300.0f);
        return Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    public z6.b getDescriptorForCluster(Cluster<T> cluster) {
        int bucket = getBucket(cluster);
        z6.b bVar = this.mIcons.get(bucket);
        if (bVar == null) {
            this.mColoredCircleBackground.getPaint().setColor(getColor(bucket));
            this.mIconGenerator.setTextAppearance(getClusterTextAppearance(bucket));
            z6.b charlie = T3.charlie(this.mIconGenerator.makeIcon(getClusterText(bucket)));
            this.mIcons.put(bucket, charlie);
            return charlie;
        }
        return bVar;
    }

    public f getMarker(T t5) {
        return this.mMarkerCache.get((MarkerCache<T>) t5);
    }

    public int getMinClusterSize() {
        return this.mMinClusterSize;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onAdd() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(new d(this, 0));
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(new d(this, 1));
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(new d(this, 2));
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(new d(this, 3));
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(new d(this, 4));
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(new d(this, 5));
    }

    public void onBeforeClusterItemRendered(T t5, MarkerOptions markerOptions) {
        if (t5.getTitle() != null && t5.getSnippet() != null) {
            markerOptions.M(t5.getTitle());
            markerOptions.L(t5.getSnippet());
        } else if (t5.getTitle() != null) {
            markerOptions.M(t5.getTitle());
        } else if (t5.getSnippet() != null) {
            markerOptions.M(t5.getSnippet());
        }
    }

    public void onBeforeClusterRendered(Cluster<T> cluster, MarkerOptions markerOptions) {
        markerOptions.H(getDescriptorForCluster(cluster));
    }

    public void onClusterItemRendered(T t5, f fVar) {
    }

    public void onClusterItemUpdated(T t5, f fVar) {
        boolean z2 = true;
        boolean z10 = false;
        if (t5.getTitle() != null && t5.getSnippet() != null) {
            if (!t5.getTitle().equals(fVar.delta())) {
                fVar.india(t5.getTitle());
                z10 = true;
            }
            if (!t5.getSnippet().equals(fVar.charlie())) {
                fVar.hotel(t5.getSnippet());
                z10 = true;
            }
        } else {
            if (t5.getSnippet() != null && !t5.getSnippet().equals(fVar.delta())) {
                fVar.india(t5.getSnippet());
            } else if (t5.getTitle() != null && !t5.getTitle().equals(fVar.delta())) {
                fVar.india(t5.getTitle());
            }
            z10 = true;
        }
        if (!fVar.bravo().equals(t5.getPosition())) {
            fVar.golf(t5.getPosition());
            if (t5.getZIndex() != null) {
                fVar.kilo(t5.getZIndex().floatValue());
            }
        } else {
            z2 = z10;
        }
        if (z2 && fVar.echo()) {
            fVar.lima();
        }
    }

    public void onClusterRendered(Cluster<T> cluster, f fVar) {
    }

    public void onClusterUpdated(Cluster<T> cluster, f fVar) {
        fVar.foxtrot(getDescriptorForCluster(cluster));
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onClustersChanged(Set<? extends Cluster<T>> set) {
        this.mViewModifier.queue(set);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onRemove() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(null);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimation(boolean z2) {
        this.mAnimate = z2;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimationDuration(long j5) {
        this.mAnimationDurationMs = j5;
    }

    public void setMinClusterSize(int i4) {
        this.mMinClusterSize = i4;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterClickListener(ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.mClickListener = onClusterClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowClickListener(ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.mInfoWindowClickListener = onClusterInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowLongClickListener(ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener) {
        this.mInfoWindowLongClickListener = onClusterInfoWindowLongClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemClickListener(ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.mItemClickListener = onClusterItemClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowClickListener(ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.mItemInfoWindowClickListener = onClusterItemInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowLongClickListener(ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener) {
        this.mItemInfoWindowLongClickListener = onClusterItemInfoWindowLongClickListener;
    }

    public boolean shouldRender(Set<? extends Cluster<T>> set, Set<? extends Cluster<T>> set2) {
        return !set2.equals(set);
    }

    public boolean shouldRenderAsCluster(Cluster<T> cluster) {
        if (cluster.getSize() >= this.mMinClusterSize) {
            return true;
        }
        return false;
    }

    public f getMarker(Cluster<T> cluster) {
        return this.mClusterMarkerCache.get((MarkerCache<Cluster<T>>) cluster);
    }
}
