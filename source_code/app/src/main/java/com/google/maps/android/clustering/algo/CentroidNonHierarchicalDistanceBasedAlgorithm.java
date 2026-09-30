package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class CentroidNonHierarchicalDistanceBasedAlgorithm<T extends ClusterItem> extends NonHierarchicalDistanceBasedAlgorithm<T> {
    public LatLng computeCentroid(Collection<T> collection) {
        double d4 = 0.0d;
        int i4 = 0;
        double d9 = 0.0d;
        for (T t5 : collection) {
            d4 += t5.getPosition().alpha;
            d9 += t5.getPosition().purple;
            i4++;
        }
        double d10 = i4;
        return new LatLng(d4 / d10, d9 / d10);
    }

    @Override // com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm, com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f5) {
        Set<? extends Cluster<T>> clusters = super.getClusters(f5);
        HashSet hashSet = new HashSet();
        for (Cluster<T> cluster : clusters) {
            StaticCluster staticCluster = new StaticCluster(computeCentroid(cluster.getItems()));
            Iterator<T> it = cluster.getItems().iterator();
            while (it.hasNext()) {
                staticCluster.add(it.next());
            }
            hashSet.add(staticCluster);
        }
        return hashSet;
    }
}
