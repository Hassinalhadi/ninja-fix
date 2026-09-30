package com.google.maps.android.clustering;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.algo.Algorithm;
import com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.google.maps.android.clustering.algo.PreCachingAlgorithmDecorator;
import com.google.maps.android.clustering.algo.ScreenBasedAlgorithm;
import com.google.maps.android.clustering.algo.ScreenBasedAlgorithmAdapter;
import com.google.maps.android.clustering.view.ClusterRenderer;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.collections.MarkerManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import x6.InterfaceC3297b;
import x6.InterfaceC3300e;
import x6.InterfaceC3302g;
import x6.k;
import z6.f;

/* loaded from: classes2.dex */
public class ClusterManager<T extends ClusterItem> implements InterfaceC3297b, InterfaceC3302g, InterfaceC3300e {
    private ScreenBasedAlgorithm<T> mAlgorithm;
    private final MarkerManager.Collection mClusterMarkers;
    private ClusterManager<T>.ClusterTask mClusterTask;
    private final ReadWriteLock mClusterTaskLock;
    private k mMap;
    private final MarkerManager mMarkerManager;
    private final MarkerManager.Collection mMarkers;
    private OnClusterClickListener<T> mOnClusterClickListener;
    private OnClusterInfoWindowClickListener<T> mOnClusterInfoWindowClickListener;
    private OnClusterInfoWindowLongClickListener<T> mOnClusterInfoWindowLongClickListener;
    private OnClusterItemClickListener<T> mOnClusterItemClickListener;
    private OnClusterItemInfoWindowClickListener<T> mOnClusterItemInfoWindowClickListener;
    private OnClusterItemInfoWindowLongClickListener<T> mOnClusterItemInfoWindowLongClickListener;
    private CameraPosition mPreviousCameraPosition;
    private ClusterRenderer<T> mRenderer;

    /* loaded from: classes2.dex */
    public class ClusterTask extends AsyncTask<Float, Void, Set<? extends Cluster<T>>> {
        public /* synthetic */ ClusterTask(ClusterManager clusterManager, int i4) {
            this();
        }

        private ClusterTask() {
        }

        @Override // android.os.AsyncTask
        public Set<? extends Cluster<T>> doInBackground(Float... fArr) {
            Algorithm<T> algorithm = ClusterManager.this.getAlgorithm();
            algorithm.lock();
            try {
                return algorithm.getClusters(fArr[0].floatValue());
            } finally {
                algorithm.unlock();
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Set<? extends Cluster<T>> set) {
            ClusterManager.this.mRenderer.onClustersChanged(set);
        }
    }

    /* loaded from: classes2.dex */
    public interface OnClusterClickListener<T extends ClusterItem> {
        boolean onClusterClick(Cluster<T> cluster);
    }

    /* loaded from: classes2.dex */
    public interface OnClusterInfoWindowClickListener<T extends ClusterItem> {
        void onClusterInfoWindowClick(Cluster<T> cluster);
    }

    /* loaded from: classes2.dex */
    public interface OnClusterInfoWindowLongClickListener<T extends ClusterItem> {
        void onClusterInfoWindowLongClick(Cluster<T> cluster);
    }

    /* loaded from: classes2.dex */
    public interface OnClusterItemClickListener<T extends ClusterItem> {
        boolean onClusterItemClick(T t5);
    }

    /* loaded from: classes2.dex */
    public interface OnClusterItemInfoWindowClickListener<T extends ClusterItem> {
        void onClusterItemInfoWindowClick(T t5);
    }

    /* loaded from: classes2.dex */
    public interface OnClusterItemInfoWindowLongClickListener<T extends ClusterItem> {
        void onClusterItemInfoWindowLongClick(T t5);
    }

    public ClusterManager(Context context, k kVar) {
        this(context, kVar, new MarkerManager(kVar));
    }

    public boolean addItem(T t5) {
        Algorithm<T> algorithm = getAlgorithm();
        algorithm.lock();
        try {
            return algorithm.addItem(t5);
        } finally {
            algorithm.unlock();
        }
    }

    public boolean addItems(Collection<T> collection) {
        Algorithm<T> algorithm = getAlgorithm();
        algorithm.lock();
        try {
            return algorithm.addItems(collection);
        } finally {
            algorithm.unlock();
        }
    }

    public void clearItems() {
        Algorithm<T> algorithm = getAlgorithm();
        algorithm.lock();
        try {
            algorithm.clearItems();
        } finally {
            algorithm.unlock();
        }
    }

    public void cluster() {
        int i4 = 0;
        this.mClusterTaskLock.writeLock().lock();
        try {
            this.mClusterTask.cancel(true);
            ClusterManager<T>.ClusterTask clusterTask = new ClusterTask(this, i4);
            this.mClusterTask = clusterTask;
            clusterTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.mMap.charlie().purple));
        } finally {
            this.mClusterTaskLock.writeLock().unlock();
        }
    }

    public void diff(Collection<T> collection, Collection<T> collection2, Collection<T> collection3) {
        Algorithm<T> algorithm = getAlgorithm();
        algorithm.lock();
        if (collection != null) {
            try {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    algorithm.addItem(it.next());
                }
            } catch (Throwable th) {
                algorithm.unlock();
                throw th;
            }
        }
        if (collection2 != null) {
            algorithm.removeItems(collection2);
        }
        if (collection3 != null) {
            Iterator<T> it2 = collection3.iterator();
            while (it2.hasNext()) {
                updateItem(it2.next());
            }
        }
        algorithm.unlock();
    }

    public Algorithm<T> getAlgorithm() {
        return this.mAlgorithm;
    }

    public MarkerManager.Collection getClusterMarkerCollection() {
        return this.mClusterMarkers;
    }

    public MarkerManager.Collection getMarkerCollection() {
        return this.mMarkers;
    }

    public MarkerManager getMarkerManager() {
        return this.mMarkerManager;
    }

    public ClusterRenderer<T> getRenderer() {
        return this.mRenderer;
    }

    @Override // x6.InterfaceC3297b
    public void onCameraIdle() {
        ClusterRenderer<T> clusterRenderer = this.mRenderer;
        if (clusterRenderer instanceof InterfaceC3297b) {
            ((InterfaceC3297b) clusterRenderer).onCameraIdle();
        }
        this.mAlgorithm.onCameraChange(this.mMap.charlie());
        if (this.mAlgorithm.shouldReclusterOnMapMovement()) {
            cluster();
            return;
        }
        CameraPosition cameraPosition = this.mPreviousCameraPosition;
        if (cameraPosition != null && cameraPosition.purple == this.mMap.charlie().purple) {
            return;
        }
        this.mPreviousCameraPosition = this.mMap.charlie();
        cluster();
    }

    @Override // x6.InterfaceC3300e
    public void onInfoWindowClick(f fVar) {
        getMarkerManager().onInfoWindowClick(fVar);
    }

    @Override // x6.InterfaceC3302g
    public boolean onMarkerClick(f fVar) {
        return getMarkerManager().onMarkerClick(fVar);
    }

    public boolean removeItem(T t5) {
        Algorithm<T> algorithm = getAlgorithm();
        algorithm.lock();
        try {
            return algorithm.removeItem(t5);
        } finally {
            algorithm.unlock();
        }
    }

    public boolean removeItems(Collection<T> collection) {
        Algorithm<T> algorithm = getAlgorithm();
        algorithm.lock();
        try {
            return algorithm.removeItems(collection);
        } finally {
            algorithm.unlock();
        }
    }

    public void setAlgorithm(Algorithm<T> algorithm) {
        if (algorithm instanceof ScreenBasedAlgorithm) {
            setAlgorithm((ScreenBasedAlgorithm) algorithm);
        } else {
            setAlgorithm((ScreenBasedAlgorithm) new ScreenBasedAlgorithmAdapter(algorithm));
        }
    }

    public void setAnimation(boolean z2) {
        this.mRenderer.setAnimation(z2);
    }

    public void setOnClusterClickListener(OnClusterClickListener<T> onClusterClickListener) {
        this.mOnClusterClickListener = onClusterClickListener;
        this.mRenderer.setOnClusterClickListener(onClusterClickListener);
    }

    public void setOnClusterInfoWindowClickListener(OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.mOnClusterInfoWindowClickListener = onClusterInfoWindowClickListener;
        this.mRenderer.setOnClusterInfoWindowClickListener(onClusterInfoWindowClickListener);
    }

    public void setOnClusterInfoWindowLongClickListener(OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener) {
        this.mOnClusterInfoWindowLongClickListener = onClusterInfoWindowLongClickListener;
        this.mRenderer.setOnClusterInfoWindowLongClickListener(onClusterInfoWindowLongClickListener);
    }

    public void setOnClusterItemClickListener(OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.mOnClusterItemClickListener = onClusterItemClickListener;
        this.mRenderer.setOnClusterItemClickListener(onClusterItemClickListener);
    }

    public void setOnClusterItemInfoWindowClickListener(OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.mOnClusterItemInfoWindowClickListener = onClusterItemInfoWindowClickListener;
        this.mRenderer.setOnClusterItemInfoWindowClickListener(onClusterItemInfoWindowClickListener);
    }

    public void setOnClusterItemInfoWindowLongClickListener(OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener) {
        this.mOnClusterItemInfoWindowLongClickListener = onClusterItemInfoWindowLongClickListener;
        this.mRenderer.setOnClusterItemInfoWindowLongClickListener(onClusterItemInfoWindowLongClickListener);
    }

    public void setRenderer(ClusterRenderer<T> clusterRenderer) {
        this.mRenderer.setOnClusterClickListener(null);
        this.mRenderer.setOnClusterItemClickListener(null);
        this.mClusterMarkers.clear();
        this.mMarkers.clear();
        this.mRenderer.onRemove();
        this.mRenderer = clusterRenderer;
        clusterRenderer.onAdd();
        this.mRenderer.setOnClusterClickListener(this.mOnClusterClickListener);
        this.mRenderer.setOnClusterInfoWindowClickListener(this.mOnClusterInfoWindowClickListener);
        this.mRenderer.setOnClusterInfoWindowLongClickListener(this.mOnClusterInfoWindowLongClickListener);
        this.mRenderer.setOnClusterItemClickListener(this.mOnClusterItemClickListener);
        this.mRenderer.setOnClusterItemInfoWindowClickListener(this.mOnClusterItemInfoWindowClickListener);
        this.mRenderer.setOnClusterItemInfoWindowLongClickListener(this.mOnClusterItemInfoWindowLongClickListener);
        cluster();
    }

    public boolean updateItem(T t5) {
        Algorithm<T> algorithm = getAlgorithm();
        algorithm.lock();
        try {
            return algorithm.updateItem(t5);
        } finally {
            algorithm.unlock();
        }
    }

    public ClusterManager(Context context, k kVar, MarkerManager markerManager) {
        this.mClusterTaskLock = new ReentrantReadWriteLock();
        this.mMap = kVar;
        this.mMarkerManager = markerManager;
        this.mClusterMarkers = markerManager.newCollection();
        this.mMarkers = markerManager.newCollection();
        this.mRenderer = new DefaultClusterRenderer(context, kVar, this);
        this.mAlgorithm = new ScreenBasedAlgorithmAdapter(new PreCachingAlgorithmDecorator(new NonHierarchicalDistanceBasedAlgorithm()));
        this.mClusterTask = new ClusterTask(this, 0);
        this.mRenderer.onAdd();
    }

    public void setAlgorithm(ScreenBasedAlgorithm<T> screenBasedAlgorithm) {
        screenBasedAlgorithm.lock();
        try {
            Algorithm<T> algorithm = getAlgorithm();
            this.mAlgorithm = screenBasedAlgorithm;
            if (algorithm != null) {
                algorithm.lock();
                try {
                    screenBasedAlgorithm.addItems(algorithm.getItems());
                    algorithm.unlock();
                } catch (Throwable th) {
                    algorithm.unlock();
                    throw th;
                }
            }
            screenBasedAlgorithm.unlock();
            if (this.mAlgorithm.shouldReclusterOnMapMovement()) {
                this.mAlgorithm.onCameraChange(this.mMap.charlie());
            }
            cluster();
        } catch (Throwable th2) {
            screenBasedAlgorithm.unlock();
            throw th2;
        }
    }
}
