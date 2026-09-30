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
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.R;
import com.google.maps.android.RendererLogger;
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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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
public class ClusterRendererMultipleItems<T extends ClusterItem> implements ClusterRenderer<T> {
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
    private static TimeInterpolator animationInterp = new DecelerateInterpolator();
    private static final int[] BUCKETS = {10, 20, 50, 100, 200, HttpConstants.HTTP_INTERNAL_ERROR, 1000};
    private final Executor mExecutor = Executors.newSingleThreadExecutor();
    private final Queue<ClusterRendererMultipleItems<T>.AnimationTask> ongoingAnimations = new LinkedList();
    private Set<MarkerWithPosition> mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
    private final SparseArray<z6.b> mIcons = new SparseArray<>();
    private final MarkerCache<T> mMarkerCache = new MarkerCache<>(0);
    private int mMinClusterSize = 2;
    private final MarkerCache<Cluster<T>> mClusterMarkerCache = new MarkerCache<>(0);
    private final ClusterRendererMultipleItems<T>.ViewModifier mViewModifier = new ViewModifier(Looper.getMainLooper());
    private boolean mAnimate = true;
    private long mAnimationDurationMs = 300;

    /* renamed from: com.google.maps.android.clustering.view.ClusterRendererMultipleItems$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType;

        static {
            int[] iArr = new int[AnimationType.values().length];
            $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType = iArr;
            try {
                iArr[AnimationType.EASE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.ACCELERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.EASE_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.EASE_IN_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.FAST_OUT_SLOW_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.BOUNCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[AnimationType.DECELERATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public class AnimationTask extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private final LatLng from;
        private final Lock lock;
        private MarkerManager mMarkerManager;
        private boolean mRemoveOnComplete;
        private final f marker;
        private final MarkerWithPosition markerWithPosition;
        private final LatLng to;
        private ValueAnimator valueAnimator;

        public /* synthetic */ AnimationTask(ClusterRendererMultipleItems clusterRendererMultipleItems, MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2, Lock lock, int i4) {
            this(markerWithPosition, latLng, latLng2, lock);
        }

        public void cancel() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new b(0, this));
                return;
            }
            try {
                this.markerWithPosition.position = this.to;
                this.mRemoveOnComplete = false;
                this.valueAnimator.cancel();
                this.lock.lock();
                ClusterRendererMultipleItems.this.ongoingAnimations.remove(this);
            } finally {
                this.lock.unlock();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.mRemoveOnComplete) {
                ClusterRendererMultipleItems.this.mMarkerCache.remove(this.marker);
                ClusterRendererMultipleItems.this.mClusterMarkerCache.remove(this.marker);
                this.mMarkerManager.remove(this.marker);
            }
            this.markerWithPosition.position = this.to;
            this.lock.lock();
            ClusterRendererMultipleItems.this.ongoingAnimations.remove(this);
            this.lock.unlock();
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
                LatLng latLng3 = new LatLng(d11, (d12 * d10) + this.from.purple);
                this.marker.golf(latLng3);
                this.markerWithPosition.position = latLng3;
            }
        }

        public void perform() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.valueAnimator = ofFloat;
            ofFloat.setInterpolator(ClusterRendererMultipleItems.animationInterp);
            this.valueAnimator.setDuration(ClusterRendererMultipleItems.this.mAnimationDurationMs);
            this.valueAnimator.addUpdateListener(this);
            this.valueAnimator.addListener(this);
            this.valueAnimator.start();
        }

        public void removeOnAnimationComplete(MarkerManager markerManager) {
            this.mMarkerManager = markerManager;
            this.mRemoveOnComplete = true;
        }

        private AnimationTask(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2, Lock lock) {
            this.markerWithPosition = markerWithPosition;
            this.marker = markerWithPosition.marker;
            this.from = latLng;
            this.to = latLng2;
            this.lock = lock;
        }
    }

    /* loaded from: classes2.dex */
    public enum AnimationType {
        LINEAR,
        EASE_IN,
        EASE_OUT,
        EASE_IN_OUT,
        FAST_OUT_SLOW_IN,
        BOUNCE,
        ACCELERATE,
        DECELERATE
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

        public void perform(ClusterRendererMultipleItems<T>.MarkerModifier markerModifier) {
            MarkerWithPosition markerWithPosition;
            MarkerWithPosition markerWithPosition2;
            if (!ClusterRendererMultipleItems.this.shouldRenderAsCluster(this.cluster)) {
                RendererLogger.d("ClusterRenderer", "Rendering individual cluster items, count: " + this.cluster.getItems().size());
                for (T t5 : this.cluster.getItems()) {
                    f fVar = ClusterRendererMultipleItems.this.mMarkerCache.get((MarkerCache) t5);
                    LatLng position = t5.getPosition();
                    if (fVar == null) {
                        RendererLogger.d("ClusterRenderer", "Creating new marker for cluster item at position: " + position);
                        MarkerOptions markerOptions = new MarkerOptions();
                        if (this.animateFrom != null) {
                            RendererLogger.d("ClusterRenderer", "Animating from position: " + this.animateFrom);
                            markerOptions.J(this.animateFrom);
                        } else if (ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().hasNext() && ((Cluster) ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().next()).getItems().contains(t5)) {
                            Iterator it = ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator();
                            T t10 = null;
                            while (it.hasNext()) {
                                Iterator<T> it2 = ((Cluster) it.next()).getItems().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        T next = it2.next();
                                        if (next.equals(t5)) {
                                            t10 = next;
                                            break;
                                        }
                                    }
                                }
                            }
                            position = t10.getPosition();
                            RendererLogger.d("ClusterRenderer", "Found item in cache for animation at position: " + position);
                            markerOptions.J(position);
                        } else {
                            markerOptions.J(t5.getPosition());
                            if (t5.getZIndex() != null) {
                                markerOptions.f7482g = t5.getZIndex().floatValue();
                            }
                        }
                        ClusterRendererMultipleItems.this.onBeforeClusterItemRendered(t5, markerOptions);
                        fVar = ClusterRendererMultipleItems.this.mClusterManager.getMarkerCollection().addMarker(markerOptions);
                        markerWithPosition2 = new MarkerWithPosition(t5, fVar);
                        ClusterRendererMultipleItems.this.mMarkerCache.put(t5, fVar);
                        LatLng latLng = this.animateFrom;
                        if (latLng != null) {
                            markerModifier.animate(markerWithPosition2, latLng, t5.getPosition());
                            RendererLogger.d("ClusterRenderer", "Animating marker from " + this.animateFrom + " to " + t5.getPosition());
                        } else if (position != null) {
                            markerModifier.animate(markerWithPosition2, position, t5.getPosition());
                            RendererLogger.d("ClusterRenderer", "Animating marker from " + position + " to " + t5.getPosition());
                        }
                    } else {
                        markerWithPosition2 = new MarkerWithPosition(t5, fVar);
                        markerModifier.animate(markerWithPosition2, fVar.bravo(), t5.getPosition());
                        RendererLogger.d("ClusterRenderer", "Animating existing marker from " + fVar.bravo() + " to " + t5.getPosition());
                        if (!markerWithPosition2.position.equals(t5.getPosition())) {
                            RendererLogger.d("ClusterRenderer", "Updating cluster item marker position");
                            ClusterRendererMultipleItems.this.onClusterItemUpdated(t5, fVar);
                        }
                    }
                    ClusterRendererMultipleItems.this.onClusterItemRendered(t5, fVar);
                    this.newMarkers.add(markerWithPosition2);
                }
                return;
            }
            RendererLogger.d("ClusterRenderer", "Rendering cluster marker at position: " + this.cluster.getPosition());
            f fVar2 = ClusterRendererMultipleItems.this.mClusterMarkerCache.get((MarkerCache) this.cluster);
            if (fVar2 == null) {
                RendererLogger.d("ClusterRenderer", "Creating new cluster marker");
                MarkerOptions markerOptions2 = new MarkerOptions();
                LatLng latLng2 = this.animateFrom;
                if (latLng2 == null) {
                    latLng2 = this.cluster.getPosition();
                }
                markerOptions2.J(latLng2);
                ClusterRendererMultipleItems.this.onBeforeClusterRendered(this.cluster, markerOptions2);
                fVar2 = ClusterRendererMultipleItems.this.mClusterManager.getClusterMarkerCollection().addMarker(markerOptions2);
                ClusterRendererMultipleItems.this.mClusterMarkerCache.put(this.cluster, fVar2);
                markerWithPosition = new MarkerWithPosition((ClusterItem) null, fVar2);
                LatLng latLng3 = this.animateFrom;
                if (latLng3 != null) {
                    markerModifier.animate(markerWithPosition, latLng3, this.cluster.getPosition());
                    RendererLogger.d("ClusterRenderer", "Animating cluster marker from " + this.animateFrom + " to " + this.cluster.getPosition());
                }
            } else {
                markerWithPosition = new MarkerWithPosition((ClusterItem) null, fVar2);
                RendererLogger.d("ClusterRenderer", "Updating existing cluster marker");
                ClusterRendererMultipleItems.this.onClusterUpdated(this.cluster, fVar2);
            }
            ClusterRendererMultipleItems.this.onClusterRendered(this.cluster, fVar2);
            this.newMarkers.add(markerWithPosition);
        }
    }

    /* loaded from: classes2.dex */
    public static class MarkerCache<T> {
        private final Map<T, f> mCache;
        private final Map<f, T> mCacheReverse;

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
        private final Queue<ClusterRendererMultipleItems<T>.AnimationTask> mAnimationTasks;
        private final Queue<ClusterRendererMultipleItems<T>.CreateMarkerTask> mCreateMarkerTasks;
        private boolean mListenerAdded;
        private final Queue<ClusterRendererMultipleItems<T>.CreateMarkerTask> mOnScreenCreateMarkerTasks;
        private final Queue<f> mOnScreenRemoveMarkerTasks;
        private final Queue<f> mRemoveMarkerTasks;

        public /* synthetic */ MarkerModifier(ClusterRendererMultipleItems clusterRendererMultipleItems, int i4) {
            this();
        }

        private void performNextTask() {
            if (!this.mOnScreenRemoveMarkerTasks.isEmpty()) {
                removeMarker(this.mOnScreenRemoveMarkerTasks.poll());
                return;
            }
            if (!this.mAnimationTasks.isEmpty()) {
                ClusterRendererMultipleItems<T>.AnimationTask poll = this.mAnimationTasks.poll();
                Objects.requireNonNull(poll);
                poll.perform();
            } else if (!this.mOnScreenCreateMarkerTasks.isEmpty()) {
                ClusterRendererMultipleItems<T>.CreateMarkerTask poll2 = this.mOnScreenCreateMarkerTasks.poll();
                Objects.requireNonNull(poll2);
                poll2.perform(this);
            } else if (!this.mCreateMarkerTasks.isEmpty()) {
                ClusterRendererMultipleItems<T>.CreateMarkerTask poll3 = this.mCreateMarkerTasks.poll();
                Objects.requireNonNull(poll3);
                poll3.perform(this);
            } else if (!this.mRemoveMarkerTasks.isEmpty()) {
                removeMarker(this.mRemoveMarkerTasks.poll());
            }
        }

        private void removeMarker(f fVar) {
            ClusterRendererMultipleItems.this.mMarkerCache.remove(fVar);
            ClusterRendererMultipleItems.this.mClusterMarkerCache.remove(fVar);
            ClusterRendererMultipleItems.this.mClusterManager.getMarkerManager().remove(fVar);
        }

        public void add(boolean z2, ClusterRendererMultipleItems<T>.CreateMarkerTask createMarkerTask) {
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
            ClusterRendererMultipleItems<T>.AnimationTask animationTask = new AnimationTask(ClusterRendererMultipleItems.this, markerWithPosition, latLng, latLng2, this.lock, 0);
            Iterator it = ClusterRendererMultipleItems.this.ongoingAnimations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnimationTask animationTask2 = (AnimationTask) it.next();
                if (animationTask2.marker.alpha().equals(((AnimationTask) animationTask).marker.alpha())) {
                    animationTask2.cancel();
                    break;
                }
            }
            this.mAnimationTasks.add(animationTask);
            ClusterRendererMultipleItems.this.ongoingAnimations.add(animationTask);
            this.lock.unlock();
        }

        public void animateThenRemove(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            ClusterRendererMultipleItems<T>.AnimationTask animationTask = new AnimationTask(ClusterRendererMultipleItems.this, markerWithPosition, latLng, latLng2, this.lock, 0);
            Iterator it = ClusterRendererMultipleItems.this.ongoingAnimations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnimationTask animationTask2 = (AnimationTask) it.next();
                if (animationTask2.marker.alpha().equals(((AnimationTask) animationTask).marker.alpha())) {
                    animationTask2.cancel();
                    break;
                }
            }
            ClusterRendererMultipleItems.this.ongoingAnimations.add(animationTask);
            animationTask.removeOnAnimationComplete(ClusterRendererMultipleItems.this.mClusterManager.getMarkerManager());
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
    public static class MarkerWithPosition<T> {
        private final T clusterItem;
        private final f marker;
        private LatLng position;

        public /* synthetic */ MarkerWithPosition(ClusterItem clusterItem, f fVar) {
            this(fVar, clusterItem);
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

        private MarkerWithPosition(f fVar, T t5) {
            this.marker = fVar;
            this.clusterItem = t5;
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

        public /* synthetic */ RenderTask(ClusterRendererMultipleItems clusterRendererMultipleItems, Set set, int i4) {
            this(set);
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            LatLngBounds alpha;
            ArrayList arrayList;
            ArrayList arrayList2;
            MarkerModifier markerModifier = new MarkerModifier(ClusterRendererMultipleItems.this, 0);
            float f5 = this.mMapZoom;
            Set<MarkerWithPosition> set = ClusterRendererMultipleItems.this.mMarkers;
            try {
                alpha = this.mProjection.alpha().teal;
                RendererLogger.d("ClusterRenderer", "Visible bounds calculated: " + alpha);
            } catch (Exception unused) {
                RendererLogger.e("ClusterRenderer", "Error getting visible bounds, defaulting to (0,0)");
                e o5 = LatLngBounds.o();
                o5.bravo(new LatLng(0.0d, 0.0d));
                alpha = o5.alpha();
            }
            if (ClusterRendererMultipleItems.this.mClusters != null && ClusterRendererMultipleItems.this.mAnimate) {
                arrayList = new ArrayList();
                for (Cluster<T> cluster : ClusterRendererMultipleItems.this.mClusters) {
                    if (ClusterRendererMultipleItems.this.shouldRenderAsCluster(cluster) && alpha.E(cluster.getPosition())) {
                        arrayList.add(this.mSphericalMercatorProjection.toPoint(cluster.getPosition()));
                    }
                }
                RendererLogger.d("ClusterRenderer", "Existing clusters on screen found: " + arrayList.size());
            } else {
                arrayList = null;
            }
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (Cluster<T> cluster2 : this.clusters) {
                boolean E4 = alpha.E(cluster2.getPosition());
                if (ClusterRendererMultipleItems.this.mAnimate) {
                    Point findClosestCluster = ClusterRendererMultipleItems.this.findClosestCluster(arrayList, this.mSphericalMercatorProjection.toPoint(cluster2.getPosition()));
                    if (findClosestCluster != null) {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, newSetFromMap, this.mSphericalMercatorProjection.toLatLng(findClosestCluster)));
                        RendererLogger.d("ClusterRenderer", "Animating cluster from closest cluster: " + cluster2.getPosition());
                    } else {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, newSetFromMap, null));
                        RendererLogger.d("ClusterRenderer", "Animating cluster without closest point: " + cluster2.getPosition());
                    }
                } else {
                    markerModifier.add(E4, new CreateMarkerTask(cluster2, newSetFromMap, null));
                    RendererLogger.d("ClusterRenderer", "Adding cluster without animation: " + cluster2.getPosition());
                }
            }
            markerModifier.waitUntilFree();
            RendererLogger.d("ClusterRenderer", "All new markers added, count: " + newSetFromMap.size());
            set.removeAll(newSetFromMap);
            RendererLogger.d("ClusterRenderer", "Markers to remove after filtering new markers: " + set.size());
            if (ClusterRendererMultipleItems.this.mAnimate) {
                arrayList2 = new ArrayList();
                for (Cluster<T> cluster3 : this.clusters) {
                    if (ClusterRendererMultipleItems.this.shouldRenderAsCluster(cluster3) && alpha.E(cluster3.getPosition())) {
                        arrayList2.add(this.mSphericalMercatorProjection.toPoint(cluster3.getPosition()));
                    }
                }
                RendererLogger.d("ClusterRenderer", "New clusters on screen found: " + arrayList2.size());
            } else {
                arrayList2 = null;
            }
            for (MarkerWithPosition markerWithPosition : set) {
                boolean E10 = alpha.E(markerWithPosition.position);
                if (E10 && ClusterRendererMultipleItems.this.mAnimate) {
                    Point findClosestCluster2 = ClusterRendererMultipleItems.this.findClosestCluster(arrayList2, this.mSphericalMercatorProjection.toPoint(markerWithPosition.position));
                    if (findClosestCluster2 != null) {
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.position, this.mSphericalMercatorProjection.toLatLng(findClosestCluster2));
                        RendererLogger.d("ClusterRenderer", "Animating then removing marker at position: " + markerWithPosition.position);
                    } else if (ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().hasNext() && ((Cluster) ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().next()).getItems().contains(markerWithPosition.clusterItem)) {
                        Iterator it = ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator();
                        T t5 = null;
                        while (it.hasNext()) {
                            Iterator<T> it2 = ((Cluster) it.next()).getItems().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    T next = it2.next();
                                    if (next.equals(markerWithPosition.clusterItem)) {
                                        t5 = next;
                                        break;
                                    }
                                }
                            }
                        }
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.position, t5.getPosition());
                        RendererLogger.d("ClusterRenderer", "Animating then removing marker joining cluster at position: " + markerWithPosition.position);
                    } else {
                        markerModifier.remove(true, markerWithPosition.marker);
                        RendererLogger.d("ClusterRenderer", "Removing marker without animation at position: " + markerWithPosition.position);
                    }
                } else {
                    markerModifier.remove(E10, markerWithPosition.marker);
                    RendererLogger.d("ClusterRenderer", "Removing marker (onScreen=" + E10 + ") at position: " + markerWithPosition.position);
                }
            }
            markerModifier.waitUntilFree();
            RendererLogger.d("ClusterRenderer", "All marker removal operations completed.");
            ClusterRendererMultipleItems.this.mMarkers = newSetFromMap;
            ClusterRendererMultipleItems.this.mClusters = this.clusters;
            ClusterRendererMultipleItems.this.mZoom = f5;
            this.mCallback.run();
            RendererLogger.d("ClusterRenderer", "Cluster update callback executed.");
        }

        public void setCallback(Runnable runnable) {
            this.mCallback = runnable;
        }

        public void setMapZoom(float f5) {
            this.mMapZoom = f5;
            this.mSphericalMercatorProjection = new SphericalMercatorProjection(Math.pow(2.0d, Math.min(f5, ClusterRendererMultipleItems.this.mZoom)) * 256.0d);
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
        private ClusterRendererMultipleItems<T>.RenderTask mNextClusters;
        private boolean mViewModificationInProgress;

        public ViewModifier(Looper looper) {
            super(looper);
            this.mViewModificationInProgress = false;
            this.mNextClusters = null;
        }

        public /* synthetic */ void lambda$handleMessage$0() {
            sendEmptyMessage(1);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ClusterRendererMultipleItems<T>.RenderTask renderTask;
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
            n delta = ClusterRendererMultipleItems.this.mMap.delta();
            synchronized (this) {
                renderTask = this.mNextClusters;
                this.mNextClusters = null;
                this.mViewModificationInProgress = true;
            }
            renderTask.setCallback(new b(1, this));
            renderTask.setProjection(delta);
            renderTask.setMapZoom(ClusterRendererMultipleItems.this.mMap.charlie().purple);
            ClusterRendererMultipleItems.this.mExecutor.execute(renderTask);
        }

        public void queue(Set<? extends Cluster<T>> set) {
            synchronized (this) {
                this.mNextClusters = new RenderTask(ClusterRendererMultipleItems.this, set, 0);
            }
            sendEmptyMessage(0);
        }
    }

    public ClusterRendererMultipleItems(Context context, k kVar, ClusterManager<T> clusterManager) {
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

    public /* synthetic */ boolean lambda$onAdd$0(f fVar) {
        RendererLogger.d("ClusterRenderer", "Marker clicked: " + fVar);
        ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener = this.mItemClickListener;
        if (onClusterItemClickListener != null && onClusterItemClickListener.onClusterItemClick(this.mMarkerCache.get(fVar))) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$onAdd$1(f fVar) {
        RendererLogger.d("ClusterRenderer", "Info window clicked for marker: " + fVar);
        ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener = this.mItemInfoWindowClickListener;
        if (onClusterItemInfoWindowClickListener != null) {
            onClusterItemInfoWindowClickListener.onClusterItemInfoWindowClick(this.mMarkerCache.get(fVar));
        }
    }

    public /* synthetic */ void lambda$onAdd$2(f fVar) {
        RendererLogger.d("ClusterRenderer", "Info window long-clicked for marker: " + fVar);
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
        RendererLogger.d("ClusterRenderer", "Info window clicked for cluster marker: " + fVar);
        ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener = this.mInfoWindowClickListener;
        if (onClusterInfoWindowClickListener != null) {
            onClusterInfoWindowClickListener.onClusterInfoWindowClick(this.mClusterMarkerCache.get(fVar));
        }
    }

    public /* synthetic */ void lambda$onAdd$5(f fVar) {
        RendererLogger.d("ClusterRenderer", "Info window long-clicked for cluster marker: " + fVar);
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
        RendererLogger.d("ClusterRenderer", "Setting up MarkerCollection listeners");
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(new a(this, 0));
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(new a(this, 1));
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(new a(this, 2));
        RendererLogger.d("ClusterRenderer", "Setting up ClusterMarkerCollection listeners");
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(new a(this, 3));
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(new a(this, 4));
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(new a(this, 5));
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

    public void setAnimationType(AnimationType animationType) {
        switch (AnonymousClass1.$SwitchMap$com$google$maps$android$clustering$view$ClusterRendererMultipleItems$AnimationType[animationType.ordinal()]) {
            case 1:
            case 2:
                animationInterp = new AccelerateInterpolator();
                return;
            case 3:
                animationInterp = new DecelerateInterpolator();
                return;
            case 4:
                animationInterp = new AccelerateDecelerateInterpolator();
                return;
            case 5:
                animationInterp = new P1.a(1);
                return;
            case 6:
                animationInterp = new BounceInterpolator();
                return;
            case 7:
                animationInterp = new DecelerateInterpolator();
                return;
            default:
                animationInterp = new LinearInterpolator();
                return;
        }
    }

    public void setLoggingEnabled(boolean z2) {
        RendererLogger.setEnabled(z2);
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

    public boolean shouldRenderAsCluster(Cluster<T> cluster) {
        if (cluster.getSize() >= this.mMinClusterSize) {
            return true;
        }
        return false;
    }

    public void stopAnimation() {
        Iterator<ClusterRendererMultipleItems<T>.AnimationTask> it = this.ongoingAnimations.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public f getMarker(Cluster<T> cluster) {
        return this.mClusterMarkerCache.get((MarkerCache<Cluster<T>>) cluster);
    }
}
