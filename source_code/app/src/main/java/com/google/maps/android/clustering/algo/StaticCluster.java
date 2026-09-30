package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class StaticCluster<T extends ClusterItem> implements Cluster<T> {
    private final LatLng mCenter;
    private final Collection<T> mItems = new LinkedHashSet();

    public StaticCluster(LatLng latLng) {
        this.mCenter = latLng;
    }

    public boolean add(T t5) {
        return this.mItems.add(t5);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StaticCluster)) {
            return false;
        }
        StaticCluster staticCluster = (StaticCluster) obj;
        if (!staticCluster.mCenter.equals(this.mCenter) || !staticCluster.mItems.equals(this.mItems)) {
            return false;
        }
        return true;
    }

    @Override // com.google.maps.android.clustering.Cluster
    public Collection<T> getItems() {
        return this.mItems;
    }

    @Override // com.google.maps.android.clustering.Cluster
    public LatLng getPosition() {
        return this.mCenter;
    }

    @Override // com.google.maps.android.clustering.Cluster
    public int getSize() {
        return this.mItems.size();
    }

    public int hashCode() {
        return this.mItems.hashCode() + this.mCenter.hashCode();
    }

    public boolean remove(T t5) {
        return this.mItems.remove(t5);
    }

    public String toString() {
        return "StaticCluster{mCenter=" + this.mCenter + ", mItems.size=" + this.mItems.size() + '}';
    }
}
