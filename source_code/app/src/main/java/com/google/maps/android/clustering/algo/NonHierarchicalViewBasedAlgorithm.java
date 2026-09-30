package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public class NonHierarchicalViewBasedAlgorithm<T extends ClusterItem> extends NonHierarchicalDistanceBasedAlgorithm<T> implements ScreenBasedAlgorithm<T> {
    private static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0d);
    private LatLng mMapCenter;
    private int mViewHeight;
    private int mViewWidth;

    public NonHierarchicalViewBasedAlgorithm(int i4, int i5) {
        this.mViewWidth = i4;
        this.mViewHeight = i5;
    }

    private Bounds getVisibleBounds(float f5) {
        LatLng latLng = this.mMapCenter;
        if (latLng == null) {
            return new Bounds(0.0d, 0.0d, 0.0d, 0.0d);
        }
        Point point = PROJECTION.toPoint(latLng);
        double d4 = f5;
        double pow = ((this.mViewWidth / Math.pow(2.0d, d4)) / 256.0d) / 2.0d;
        double pow2 = ((this.mViewHeight / Math.pow(2.0d, d4)) / 256.0d) / 2.0d;
        double d9 = point.f8319x;
        double d10 = point.f8320y;
        return new Bounds(d9 - pow, d9 + pow, d10 - pow2, d10 + pow2);
    }

    @Override // com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm
    public Collection<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> getClusteringItems(PointQuadTree<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> pointQuadTree, float f5) {
        Bounds visibleBounds = getVisibleBounds(f5);
        ArrayList arrayList = new ArrayList();
        double d4 = visibleBounds.minX;
        if (d4 < 0.0d) {
            arrayList.addAll(pointQuadTree.search(new Bounds(d4 + 1.0d, 1.0d, visibleBounds.minY, visibleBounds.maxY)));
            visibleBounds = new Bounds(0.0d, visibleBounds.maxX, visibleBounds.minY, visibleBounds.maxY);
        }
        double d9 = visibleBounds.maxX;
        if (d9 > 1.0d) {
            arrayList.addAll(pointQuadTree.search(new Bounds(0.0d, d9 - 1.0d, visibleBounds.minY, visibleBounds.maxY)));
            visibleBounds = new Bounds(visibleBounds.minX, 1.0d, visibleBounds.minY, visibleBounds.maxY);
        }
        arrayList.addAll(pointQuadTree.search(visibleBounds));
        return arrayList;
    }

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public void onCameraChange(CameraPosition cameraPosition) {
        this.mMapCenter = cameraPosition.alpha;
    }

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public boolean shouldReclusterOnMapMovement() {
        return true;
    }

    public void updateViewSize(int i4, int i5) {
        this.mViewWidth = i4;
        this.mViewHeight = i5;
    }
}
