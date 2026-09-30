package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class NonHierarchicalDistanceBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private static final int DEFAULT_MAX_DISTANCE_AT_ZOOM = 100;
    private static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0d);
    private int mMaxDistance = 100;
    private final Collection<QuadItem<T>> mItems = new LinkedHashSet();
    private final PointQuadTree<QuadItem<T>> mQuadTree = new PointQuadTree<>(0.0d, 1.0d, 0.0d, 1.0d);

    /* loaded from: classes2.dex */
    public static class QuadItem<T extends ClusterItem> implements PointQuadTree.Item, Cluster<T> {
        private final T mClusterItem;
        private final Point mPoint;
        private final LatLng mPosition;
        private Set<T> singletonSet;

        public /* synthetic */ QuadItem(ClusterItem clusterItem, int i4) {
            this(clusterItem);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof QuadItem)) {
                return false;
            }
            return ((QuadItem) obj).mClusterItem.equals(this.mClusterItem);
        }

        @Override // com.google.maps.android.quadtree.PointQuadTree.Item
        public Point getPoint() {
            return this.mPoint;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public LatLng getPosition() {
            return this.mPosition;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public int getSize() {
            return 1;
        }

        public int hashCode() {
            return this.mClusterItem.hashCode();
        }

        private QuadItem(T t5) {
            this.mClusterItem = t5;
            LatLng position = t5.getPosition();
            this.mPosition = position;
            this.mPoint = NonHierarchicalDistanceBasedAlgorithm.PROJECTION.toPoint(position);
            this.singletonSet = Collections.singleton(t5);
        }

        @Override // com.google.maps.android.clustering.Cluster
        public Set<T> getItems() {
            return this.singletonSet;
        }
    }

    private Bounds createBoundsFromSpan(Point point, double d4) {
        double d9 = d4 / 2.0d;
        double d10 = point.f8319x;
        double d11 = point.f8320y;
        return new Bounds(d10 - d9, d10 + d9, d11 - d9, d11 + d9);
    }

    private double distanceSquared(Point point, Point point2) {
        double d4 = point.f8319x;
        double d9 = point2.f8319x;
        double d10 = (d4 - d9) * (d4 - d9);
        double d11 = point.f8320y;
        double d12 = point2.f8320y;
        return ((d11 - d12) * (d11 - d12)) + d10;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t5) {
        boolean add;
        QuadItem<T> quadItem = new QuadItem<>(t5, 0);
        synchronized (this.mQuadTree) {
            try {
                add = this.mItems.add(quadItem);
                if (add) {
                    this.mQuadTree.add(quadItem);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return add;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        Iterator<T> it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (addItem(it.next())) {
                z2 = true;
            }
        }
        return z2;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        synchronized (this.mQuadTree) {
            this.mItems.clear();
            this.mQuadTree.clear();
        }
    }

    public Collection<QuadItem<T>> getClusteringItems(PointQuadTree<QuadItem<T>> pointQuadTree, float f5) {
        return this.mItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f5) {
        double pow = (this.mMaxDistance / Math.pow(2.0d, (int) f5)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        synchronized (this.mQuadTree) {
            try {
                Iterator<QuadItem<T>> it = getClusteringItems(this.mQuadTree, f5).iterator();
                while (it.hasNext()) {
                    QuadItem<T> next = it.next();
                    if (!hashSet.contains(next)) {
                        Collection<QuadItem<T>> search = this.mQuadTree.search(createBoundsFromSpan(next.getPoint(), pow));
                        if (search.size() == 1) {
                            hashSet2.add(next);
                            hashSet.add(next);
                            hashMap.put(next, Double.valueOf(0.0d));
                        } else {
                            StaticCluster staticCluster = new StaticCluster(((QuadItem) next).mClusterItem.getPosition());
                            hashSet2.add(staticCluster);
                            for (QuadItem<T> quadItem : search) {
                                Double d4 = (Double) hashMap.get(quadItem);
                                Iterator<QuadItem<T>> it2 = it;
                                double distanceSquared = distanceSquared(quadItem.getPoint(), next.getPoint());
                                if (d4 != null) {
                                    if (d4.doubleValue() < distanceSquared) {
                                        it = it2;
                                    } else {
                                        ((StaticCluster) hashMap2.get(quadItem)).remove(((QuadItem) quadItem).mClusterItem);
                                    }
                                }
                                hashMap.put(quadItem, Double.valueOf(distanceSquared));
                                staticCluster.add(((QuadItem) quadItem).mClusterItem);
                                hashMap2.put(quadItem, staticCluster);
                                it = it2;
                            }
                            hashSet.addAll(search);
                            it = it;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet2;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.mQuadTree) {
            try {
                Iterator<QuadItem<T>> it = this.mItems.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((QuadItem) it.next()).mClusterItem);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashSet;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mMaxDistance;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t5) {
        boolean remove;
        QuadItem<T> quadItem = new QuadItem<>(t5, 0);
        synchronized (this.mQuadTree) {
            try {
                remove = this.mItems.remove(quadItem);
                if (remove) {
                    this.mQuadTree.remove(quadItem);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        boolean z2;
        synchronized (this.mQuadTree) {
            try {
                Iterator<T> it = collection.iterator();
                int i4 = 0;
                z2 = false;
                while (it.hasNext()) {
                    QuadItem<T> quadItem = new QuadItem<>(it.next(), i4);
                    if (this.mItems.remove(quadItem)) {
                        this.mQuadTree.remove(quadItem);
                        z2 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i4) {
        this.mMaxDistance = i4;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t5) {
        boolean removeItem;
        synchronized (this.mQuadTree) {
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
