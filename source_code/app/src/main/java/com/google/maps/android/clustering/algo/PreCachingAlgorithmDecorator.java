package com.google.maps.android.clustering.algo;

import bv.w;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public class PreCachingAlgorithmDecorator<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private final Algorithm<T> mAlgorithm;
    private final w mCache = new w(5);
    private final ReadWriteLock mCacheLock = new ReentrantReadWriteLock();
    private final Executor mExecutor = Executors.newCachedThreadPool();

    /* loaded from: classes2.dex */
    public class PrecacheRunnable implements Runnable {
        private final int mZoom;

        public PrecacheRunnable(int i4) {
            this.mZoom = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            PreCachingAlgorithmDecorator.this.getClustersInternal(this.mZoom);
        }
    }

    public PreCachingAlgorithmDecorator(Algorithm<T> algorithm) {
        this.mAlgorithm = algorithm;
    }

    private void clearCache() {
        this.mCache.india(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<? extends Cluster<T>> getClustersInternal(int i4) {
        this.mCacheLock.readLock().lock();
        Set<? extends Cluster<T>> set = (Set) this.mCache.charlie(Integer.valueOf(i4));
        this.mCacheLock.readLock().unlock();
        if (set == null) {
            this.mCacheLock.writeLock().lock();
            set = (Set) this.mCache.charlie(Integer.valueOf(i4));
            if (set == null) {
                set = this.mAlgorithm.getClusters(i4);
                this.mCache.delta(Integer.valueOf(i4), set);
            }
            this.mCacheLock.writeLock().unlock();
        }
        return set;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t5) {
        boolean addItem = this.mAlgorithm.addItem(t5);
        if (addItem) {
            clearCache();
        }
        return addItem;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        boolean addItems = this.mAlgorithm.addItems(collection);
        if (addItems) {
            clearCache();
        }
        return addItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.mAlgorithm.clearItems();
        clearCache();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f5) {
        int i4 = (int) f5;
        Set<? extends Cluster<T>> clustersInternal = getClustersInternal(i4);
        int i5 = i4 + 1;
        if (this.mCache.charlie(Integer.valueOf(i5)) == null) {
            this.mExecutor.execute(new PrecacheRunnable(i5));
        }
        int i10 = i4 - 1;
        if (this.mCache.charlie(Integer.valueOf(i10)) == null) {
            this.mExecutor.execute(new PrecacheRunnable(i10));
        }
        return clustersInternal;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.mAlgorithm.getItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mAlgorithm.getMaxDistanceBetweenClusteredItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t5) {
        boolean removeItem = this.mAlgorithm.removeItem(t5);
        if (removeItem) {
            clearCache();
        }
        return removeItem;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        boolean removeItems = this.mAlgorithm.removeItems(collection);
        if (removeItems) {
            clearCache();
        }
        return removeItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i4) {
        this.mAlgorithm.setMaxDistanceBetweenClusteredItems(i4);
        clearCache();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t5) {
        boolean updateItem = this.mAlgorithm.updateItem(t5);
        if (updateItem) {
            clearCache();
        }
        return updateItem;
    }
}
