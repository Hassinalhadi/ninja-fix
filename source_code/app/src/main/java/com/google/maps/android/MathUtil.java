package com.google.maps.android;

/* loaded from: classes2.dex */
class MathUtil {
    static final double EARTH_RADIUS = 6371009.0d;

    public static double arcHav(double d4) {
        return Math.asin(Math.sqrt(d4)) * 2.0d;
    }

    public static double clamp(double d4, double d9, double d10) {
        return d4 < d9 ? d9 : d4 > d10 ? d10 : d4;
    }

    public static double hav(double d4) {
        double sin = Math.sin(d4 * 0.5d);
        return sin * sin;
    }

    public static double havDistance(double d4, double d9, double d10) {
        return (Math.cos(d9) * Math.cos(d4) * hav(d10)) + hav(d4 - d9);
    }

    public static double havFromSin(double d4) {
        double d9 = d4 * d4;
        return (d9 / (Math.sqrt(1.0d - d9) + 1.0d)) * 0.5d;
    }

    public static double inverseMercator(double d4) {
        return (Math.atan(Math.exp(d4)) * 2.0d) - 1.5707963267948966d;
    }

    public static double mercator(double d4) {
        return Math.log(Math.tan((d4 * 0.5d) + 0.7853981633974483d));
    }

    public static double mod(double d4, double d9) {
        return ((d4 % d9) + d9) % d9;
    }

    public static double sinFromHav(double d4) {
        return Math.sqrt((1.0d - d4) * d4) * 2.0d;
    }

    public static double sinSumFromHav(double d4, double d9) {
        double sqrt = Math.sqrt((1.0d - d4) * d4);
        double sqrt2 = Math.sqrt((1.0d - d9) * d9);
        return ((sqrt + sqrt2) - (((sqrt2 * d4) + (sqrt * d9)) * 2.0d)) * 2.0d;
    }

    public static double wrap(double d4, double d9, double d10) {
        if (d4 >= d9 && d4 < d10) {
            return d4;
        }
        return mod(d4 - d9, d10 - d9) + d9;
    }
}
