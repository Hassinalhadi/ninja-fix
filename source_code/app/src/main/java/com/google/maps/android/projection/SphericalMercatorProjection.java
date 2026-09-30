package com.google.maps.android.projection;

import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public class SphericalMercatorProjection {
    final double mWorldWidth;

    public SphericalMercatorProjection(double d4) {
        this.mWorldWidth = d4;
    }

    public LatLng toLatLng(com.google.maps.android.geometry.Point point) {
        double d4 = point.f8319x;
        double d9 = this.mWorldWidth;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (point.f8320y / d9))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d4 / d9) - 0.5d) * 360.0d);
    }

    public Point toPoint(LatLng latLng) {
        double d4 = (latLng.purple / 360.0d) + 0.5d;
        double sin = Math.sin(Math.toRadians(latLng.alpha));
        double log = ((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d9 = this.mWorldWidth;
        return new Point(d4 * d9, log * d9);
    }
}
