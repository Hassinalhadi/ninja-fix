package com.google.maps.android.clustering.algo;

import bv.u;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class GridBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private static final int DEFAULT_GRID_SIZE = 100;
    private int mGridSize = 100;
    private final Set<T> mItems = Collections.synchronizedSet(new HashSet());

    private static long getCoord(long j5, double d4, double d9) {
        return (long) (Math.floor(d9) + (Math.floor(d4) * j5));
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t5) {
        return this.mItems.add(t5);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        return this.mItems.addAll(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.mItems.clear();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f5) {
        long j5;
        long ceil = (long) Math.ceil((Math.pow(2.0d, f5) * 256.0d) / this.mGridSize);
        SphericalMercatorProjection sphericalMercatorProjection = new SphericalMercatorProjection(ceil);
        HashSet hashSet = new HashSet();
        u uVar = new u((Object) null);
        synchronized (this.mItems) {
            try {
                for (T t5 : this.mItems) {
                    Point point = sphericalMercatorProjection.toPoint(t5.getPosition());
                    long coord = getCoord(ceil, point.f8319x, point.f8320y);
                    StaticCluster staticCluster = (StaticCluster) uVar.delta(coord);
                    if (staticCluster == null) {
                        j5 = ceil;
                        staticCluster = new StaticCluster(sphericalMercatorProjection.toLatLng(new com.google.maps.android.geometry.Point(Math.floor(point.f8319x) + 0.5d, Math.floor(point.f8320y) + 0.5d)));
                        uVar.hotel(coord, staticCluster);
                        hashSet.add(staticCluster);
                    } else {
                        j5 = ceil;
                    }
                    staticCluster.add(t5);
                    ceil = j5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.mItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mGridSize;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t5) {
        return this.mItems.remove(t5);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        return this.mItems.removeAll(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i4) {
        this.mGridSize = i4;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t5) {
        boolean removeItem;
        synchronized (this.mItems) {
            try {
                removeItem = removeItem(t5);
                if (removeItem) {
                    removeItem = addItem(t5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return removeItem;
    }
}
