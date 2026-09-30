package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public class SphericalUtil {
    private SphericalUtil() {
    }

    public static double computeAngleBetween(LatLng latLng, LatLng latLng2) {
        return distanceRadians(Math.toRadians(latLng.alpha), Math.toRadians(latLng.purple), Math.toRadians(latLng2.alpha), Math.toRadians(latLng2.purple));
    }

    public static double computeArea(List<LatLng> list) {
        return Math.abs(computeSignedArea(list));
    }

    public static double computeDistanceBetween(LatLng latLng, LatLng latLng2) {
        return computeAngleBetween(latLng, latLng2) * 6371009.0d;
    }

    public static double computeHeading(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.alpha);
        double radians2 = Math.toRadians(latLng.purple);
        double radians3 = Math.toRadians(latLng2.alpha);
        double radians4 = Math.toRadians(latLng2.purple) - radians2;
        return MathUtil.wrap(Math.toDegrees(Math.atan2(Math.cos(radians3) * Math.sin(radians4), (Math.sin(radians3) * Math.cos(radians)) - (Math.cos(radians4) * (Math.cos(radians3) * Math.sin(radians))))), -180.0d, 180.0d);
    }

    public static double computeLength(List<LatLng> list) {
        double d4 = 0.0d;
        if (list.size() < 2) {
            return 0.0d;
        }
        LatLng latLng = null;
        for (LatLng latLng2 : list) {
            if (latLng != null) {
                d4 += distanceRadians(Math.toRadians(latLng.alpha), Math.toRadians(latLng.purple), Math.toRadians(latLng2.alpha), Math.toRadians(latLng2.purple));
            }
            latLng = latLng2;
        }
        return d4 * 6371009.0d;
    }

    public static LatLng computeOffset(LatLng latLng, double d4, double d9) {
        double d10 = d4 / 6371009.0d;
        double radians = Math.toRadians(d9);
        double radians2 = Math.toRadians(latLng.alpha);
        double radians3 = Math.toRadians(latLng.purple);
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (Math.cos(radians) * cos2) + (cos * sin2);
        return new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(Math.sin(radians) * cos2, cos - (sin2 * cos3))));
    }

    public static LatLng computeOffsetOrigin(LatLng latLng, double d4, double d9) {
        double radians = Math.toRadians(d9);
        double d10 = d4 / 6371009.0d;
        double cos = Math.cos(d10);
        double cos2 = Math.cos(radians) * Math.sin(d10);
        double sin = Math.sin(radians) * Math.sin(d10);
        double sin2 = Math.sin(Math.toRadians(latLng.alpha));
        double d11 = cos * cos;
        double d12 = cos2 * cos2;
        double d13 = ((d11 * d11) + (d12 * d11)) - ((d11 * sin2) * sin2);
        if (d13 < 0.0d) {
            return null;
        }
        double d14 = cos2 * sin2;
        double d15 = d11 + d12;
        double sqrt = (Math.sqrt(d13) + d14) / d15;
        double d16 = (sin2 - (cos2 * sqrt)) / cos;
        double atan2 = Math.atan2(d16, sqrt);
        if (atan2 < -1.5707963267948966d || atan2 > 1.5707963267948966d) {
            atan2 = Math.atan2(d16, (d14 - Math.sqrt(d13)) / d15);
        }
        if (atan2 < -1.5707963267948966d || atan2 > 1.5707963267948966d) {
            return null;
        }
        return new LatLng(Math.toDegrees(atan2), Math.toDegrees(Math.toRadians(latLng.purple) - Math.atan2(sin, (Math.cos(atan2) * cos) - (Math.sin(atan2) * cos2))));
    }

    public static double computeSignedArea(List<LatLng> list) {
        return computeSignedArea(list, 6371009.0d);
    }

    private static double distanceRadians(double d4, double d9, double d10, double d11) {
        return MathUtil.arcHav(MathUtil.havDistance(d4, d10, d9 - d11));
    }

    public static LatLng interpolate(LatLng latLng, LatLng latLng2, double d4) {
        double radians = Math.toRadians(latLng.alpha);
        double d9 = latLng.purple;
        double radians2 = Math.toRadians(d9);
        double radians3 = Math.toRadians(latLng2.alpha);
        double d10 = latLng2.purple;
        double radians4 = Math.toRadians(d10);
        double cos = Math.cos(radians);
        double cos2 = Math.cos(radians3);
        double computeAngleBetween = computeAngleBetween(latLng, latLng2);
        double sin = Math.sin(computeAngleBetween);
        if (sin < 1.0E-6d) {
            double d11 = latLng2.alpha;
            double d12 = latLng.alpha;
            return new LatLng(((d11 - d12) * d4) + d12, ((d10 - d9) * d4) + d9);
        }
        double sin2 = Math.sin((1.0d - d4) * computeAngleBetween) / sin;
        double sin3 = Math.sin(d4 * computeAngleBetween) / sin;
        double d13 = cos * sin2;
        double d14 = cos2 * sin3;
        double cos3 = (Math.cos(radians4) * d14) + (Math.cos(radians2) * d13);
        double sin4 = (Math.sin(radians4) * d14) + (Math.sin(radians2) * d13);
        return new LatLng(Math.toDegrees(Math.atan2((Math.sin(radians3) * sin3) + (Math.sin(radians) * sin2), Math.sqrt((sin4 * sin4) + (cos3 * cos3)))), Math.toDegrees(Math.atan2(sin4, cos3)));
    }

    private static double polarTriangleArea(double d4, double d9, double d10, double d11) {
        double d12 = d9 - d11;
        double d13 = d4 * d10;
        return Math.atan2(Math.sin(d12) * d13, (Math.cos(d12) * d13) + 1.0d) * 2.0d;
    }

    public static double computeSignedArea(List<LatLng> list, double d4) {
        int size = list.size();
        double d9 = 0.0d;
        if (size < 3) {
            return 0.0d;
        }
        LatLng latLng = list.get(size - 1);
        double tan = Math.tan((1.5707963267948966d - Math.toRadians(latLng.alpha)) / 2.0d);
        double radians = Math.toRadians(latLng.purple);
        double d10 = tan;
        double d11 = radians;
        for (LatLng latLng2 : list) {
            double tan2 = Math.tan((1.5707963267948966d - Math.toRadians(latLng2.alpha)) / 2.0d);
            double radians2 = Math.toRadians(latLng2.purple);
            d9 += polarTriangleArea(tan2, radians2, d10, d11);
            d10 = tan2;
            d11 = radians2;
        }
        return d4 * d4 * d9;
    }
}
