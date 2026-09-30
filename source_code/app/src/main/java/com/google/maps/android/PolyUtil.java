package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* loaded from: classes2.dex */
public class PolyUtil {
    public static final double DEFAULT_TOLERANCE = 0.1d;

    private PolyUtil() {
    }

    public static boolean containsLocation(LatLng latLng, List<LatLng> list, boolean z2) {
        return containsLocation(latLng.alpha, latLng.purple, list, z2);
    }

    public static List<LatLng> decode(String str) {
        int i4;
        int i5;
        int i10;
        int i11;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            int i15 = 1;
            int i16 = 0;
            int i17 = 1;
            while (true) {
                i4 = i12 + 1;
                int charAt = str.charAt(i12) - '@';
                i17 += charAt << i16;
                i16 += 5;
                if (charAt < 31) {
                    break;
                }
                i12 = i4;
            }
            if ((i17 & 1) != 0) {
                i5 = ~(i17 >> 1);
            } else {
                i5 = i17 >> 1;
            }
            int i18 = i5 + i13;
            int i19 = 0;
            while (true) {
                i10 = i4 + 1;
                int charAt2 = str.charAt(i4) - '@';
                i15 += charAt2 << i19;
                i19 += 5;
                if (charAt2 < 31) {
                    break;
                }
                i4 = i10;
            }
            if ((i15 & 1) != 0) {
                i11 = ~(i15 >> 1);
            } else {
                i11 = i15 >> 1;
            }
            i14 += i11;
            arrayList.add(new LatLng(i18 * 1.0E-5d, i14 * 1.0E-5d));
            i13 = i18;
            i12 = i10;
        }
        return arrayList;
    }

    public static double distanceToLine(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng2.equals(latLng3)) {
            return SphericalUtil.computeDistanceBetween(latLng3, latLng);
        }
        double radians = Math.toRadians(latLng.alpha);
        double radians2 = Math.toRadians(latLng.purple);
        double d4 = latLng2.alpha;
        double radians3 = Math.toRadians(d4);
        double d9 = latLng2.purple;
        double radians4 = Math.toRadians(d9);
        double radians5 = Math.toRadians(latLng3.alpha);
        double d10 = latLng3.purple;
        double radians6 = Math.toRadians(d10);
        double cos = Math.cos(radians3);
        double d11 = radians5 - radians3;
        double d12 = (radians6 - radians4) * cos;
        double d13 = ((((radians2 - radians4) * cos) * d12) + ((radians - radians3) * d11)) / ((d12 * d12) + (d11 * d11));
        if (d13 <= 0.0d) {
            return SphericalUtil.computeDistanceBetween(latLng, latLng2);
        }
        if (d13 >= 1.0d) {
            return SphericalUtil.computeDistanceBetween(latLng, latLng3);
        }
        return SphericalUtil.computeDistanceBetween(latLng, new LatLng(((latLng3.alpha - d4) * d13) + d4, ((d10 - d9) * d13) + d9));
    }

    public static String encode(List<LatLng> list) {
        StringBuffer stringBuffer = new StringBuffer();
        long j5 = 0;
        long j6 = 0;
        for (LatLng latLng : list) {
            long round = Math.round(latLng.alpha * 100000.0d);
            long round2 = Math.round(latLng.purple * 100000.0d);
            encode(round - j5, stringBuffer);
            encode(round2 - j6, stringBuffer);
            j5 = round;
            j6 = round2;
        }
        return stringBuffer.toString();
    }

    private static boolean intersects(double d4, double d9, double d10, double d11, double d12, boolean z2) {
        if ((d12 >= 0.0d && d12 >= d10) || ((d12 < 0.0d && d12 < d10) || d11 <= -1.5707963267948966d || d4 <= -1.5707963267948966d || d9 <= -1.5707963267948966d || d4 >= 1.5707963267948966d || d9 >= 1.5707963267948966d || d10 <= -3.141592653589793d)) {
            return false;
        }
        double d13 = ((d9 * d12) + ((d10 - d12) * d4)) / d10;
        if (d4 >= 0.0d && d9 >= 0.0d && d11 < d13) {
            return false;
        }
        if ((d4 <= 0.0d && d9 <= 0.0d && d11 >= d13) || d11 >= 1.5707963267948966d) {
            return true;
        }
        if (z2) {
            if (Math.tan(d11) < tanLatGC(d4, d9, d10, d12)) {
                return false;
            }
            return true;
        }
        if (MathUtil.mercator(d11) < mercatorLatRhumb(d4, d9, d10, d12)) {
            return false;
        }
        return true;
    }

    public static boolean isClosedPolygon(List<LatLng> list) {
        return list.get(0).equals(list.get(list.size() - 1));
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z2, double d4) {
        return isLocationOnEdgeOrPath(latLng, list, true, z2, d4);
    }

    private static boolean isLocationOnEdgeOrPath(LatLng latLng, List<LatLng> list, boolean z2, boolean z10, double d4) {
        if (locationIndexOnEdgeOrPath(latLng, list, z2, z10, d4) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z2, double d4) {
        return isLocationOnEdgeOrPath(latLng, list, false, z2, d4);
    }

    private static boolean isOnSegmentGC(double d4, double d9, double d10, double d11, double d12, double d13, double d14) {
        double havDistance = MathUtil.havDistance(d4, d12, d9 - d13);
        if (havDistance <= d14) {
            return true;
        }
        double havDistance2 = MathUtil.havDistance(d10, d12, d11 - d13);
        if (havDistance2 <= d14) {
            return true;
        }
        double havFromSin = MathUtil.havFromSin(MathUtil.sinFromHav(havDistance) * sinDeltaBearing(d4, d9, d10, d11, d12, d13));
        if (havFromSin > d14) {
            return false;
        }
        double havDistance3 = MathUtil.havDistance(d4, d10, d9 - d11);
        double d15 = ((1.0d - (havDistance3 * 2.0d)) * havFromSin) + havDistance3;
        if (havDistance <= d15 && havDistance2 <= d15) {
            if (havDistance3 < 0.74d) {
                return true;
            }
            double d16 = 1.0d - (2.0d * havFromSin);
            if (MathUtil.sinSumFromHav((havDistance - havFromSin) / d16, (havDistance2 - havFromSin) / d16) > 0.0d) {
                return true;
            }
        }
        return false;
    }

    public static int locationIndexOnEdgeOrPath(LatLng latLng, List<LatLng> list, boolean z2, boolean z10, double d4) {
        int i4;
        int i5;
        double d9;
        int i10 = 0;
        boolean z11 = true;
        int size = list.size();
        int i11 = -1;
        if (size == 0) {
            return -1;
        }
        double d10 = d4 / 6371009.0d;
        double hav = MathUtil.hav(d10);
        double radians = Math.toRadians(latLng.alpha);
        double radians2 = Math.toRadians(latLng.purple);
        if (z2) {
            i4 = size - 1;
        } else {
            i4 = 0;
        }
        LatLng latLng2 = list.get(i4);
        double radians3 = Math.toRadians(latLng2.alpha);
        double radians4 = Math.toRadians(latLng2.purple);
        if (z10) {
            int i12 = 0;
            for (LatLng latLng3 : list) {
                double radians5 = Math.toRadians(latLng3.alpha);
                double radians6 = Math.toRadians(latLng3.purple);
                if (isOnSegmentGC(radians3, radians4, radians5, radians6, radians, radians2, hav)) {
                    return Math.max(0, i12 - 1);
                }
                i12++;
                radians3 = radians5;
                radians4 = radians6;
            }
        } else {
            double d11 = radians - d10;
            double d12 = radians + d10;
            double mercator = MathUtil.mercator(radians3);
            double mercator2 = MathUtil.mercator(radians);
            int i13 = 0;
            for (LatLng latLng4 : list) {
                boolean z12 = z11;
                int i14 = i11;
                double d13 = d12;
                double radians7 = Math.toRadians(latLng4.alpha);
                double mercator3 = MathUtil.mercator(radians7);
                int i15 = i10;
                double radians8 = Math.toRadians(latLng4.purple);
                if (Math.max(radians3, radians7) >= d11 && Math.min(radians3, radians7) <= d13) {
                    double wrap = MathUtil.wrap(radians8 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double wrap2 = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double[] dArr = new double[3];
                    dArr[i15] = wrap2;
                    dArr[z12 ? 1 : 0] = wrap2 + 6.283185307179586d;
                    dArr[2] = wrap2 - 6.283185307179586d;
                    int i16 = i15;
                    while (i16 < 3) {
                        double d14 = dArr[i16];
                        double d15 = mercator3 - mercator;
                        double d16 = (d15 * d15) + (wrap * wrap);
                        double d17 = 0.0d;
                        if (d16 > 0.0d) {
                            d17 = MathUtil.clamp((((mercator2 - mercator) * d15) + (d14 * wrap)) / d16, 0.0d, 1.0d);
                        }
                        double d18 = radians;
                        if (MathUtil.havDistance(d18, MathUtil.inverseMercator((d17 * d15) + mercator), d14 - (d17 * wrap)) < hav) {
                            return Math.max(i15, i13 - 1);
                        }
                        i16++;
                        radians = d18;
                    }
                    d9 = radians;
                    i5 = i15;
                } else {
                    i5 = i15;
                    d9 = radians;
                }
                i13++;
                i10 = i5;
                radians4 = radians8;
                radians3 = radians7;
                i11 = i14;
                z11 = z12 ? 1 : 0;
                d12 = d13;
                mercator = mercator3;
                radians = d9;
            }
        }
        return i11;
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z2, double d4) {
        return locationIndexOnEdgeOrPath(latLng, list, false, z2, d4);
    }

    private static double mercatorLatRhumb(double d4, double d9, double d10, double d11) {
        return ((MathUtil.mercator(d9) * d11) + ((d10 - d11) * MathUtil.mercator(d4))) / d10;
    }

    public static List<LatLng> simplify(List<LatLng> list, double d4) {
        LatLng latLng;
        int size = list.size();
        int i4 = 1;
        if (size >= 1) {
            if (d4 > 0.0d) {
                boolean isClosedPolygon = isClosedPolygon(list);
                if (isClosedPolygon) {
                    latLng = list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                    list.add(new LatLng(latLng.alpha + 1.0E-11d, latLng.purple + 1.0E-11d));
                } else {
                    latLng = null;
                }
                Stack stack = new Stack();
                double[] dArr = new double[size];
                int i5 = 0;
                dArr[0] = 1.0d;
                int i10 = size - 1;
                dArr[i10] = 1.0d;
                if (size > 2) {
                    stack.push(new int[]{0, i10});
                    int i11 = 0;
                    while (stack.size() > 0) {
                        int[] iArr = (int[]) stack.pop();
                        int i12 = iArr[0] + i4;
                        double d9 = 0.0d;
                        while (i12 < iArr[i4]) {
                            int i13 = i4;
                            double distanceToLine = distanceToLine(list.get(i12), list.get(iArr[0]), list.get(iArr[i13]));
                            if (distanceToLine > d9) {
                                i11 = i12;
                                d9 = distanceToLine;
                            }
                            i12++;
                            i4 = i13;
                        }
                        int i14 = i4;
                        if (d9 > d4) {
                            dArr[i11] = d9;
                            stack.push(new int[]{iArr[0], i11});
                            stack.push(new int[]{i11, iArr[i14]});
                        }
                        i4 = i14;
                    }
                }
                if (isClosedPolygon) {
                    list.remove(list.size() - 1);
                    list.add(latLng);
                }
                ArrayList arrayList = new ArrayList();
                for (LatLng latLng2 : list) {
                    if (dArr[i5] != 0.0d) {
                        arrayList.add(latLng2);
                    }
                    i5++;
                }
                return arrayList;
            }
            throw new IllegalArgumentException("Tolerance must be greater than zero");
        }
        throw new IllegalArgumentException("Polyline must have at least 1 point");
    }

    private static double sinDeltaBearing(double d4, double d9, double d10, double d11, double d12, double d13) {
        double sin = Math.sin(d4);
        double cos = Math.cos(d10);
        double cos2 = Math.cos(d12);
        double d14 = d13 - d9;
        double d15 = d11 - d9;
        double sin2 = Math.sin(d14) * cos2;
        double sin3 = Math.sin(d15) * cos;
        double d16 = sin * 2.0d;
        double hav = (cos2 * d16 * MathUtil.hav(d14)) + Math.sin(d12 - d4);
        double hav2 = (d16 * cos * MathUtil.hav(d15)) + Math.sin(d10 - d4);
        double d17 = ((hav2 * hav2) + (sin3 * sin3)) * ((hav * hav) + (sin2 * sin2));
        if (d17 <= 0.0d) {
            return 1.0d;
        }
        return ((sin2 * hav2) - (hav * sin3)) / Math.sqrt(d17);
    }

    private static double tanLatGC(double d4, double d9, double d10, double d11) {
        return ((Math.sin(d11) * Math.tan(d9)) + (Math.sin(d10 - d11) * Math.tan(d4))) / Math.sin(d10);
    }

    public static boolean containsLocation(double d4, double d9, List<LatLng> list, boolean z2) {
        int size = list.size();
        boolean z10 = false;
        if (size == 0) {
            return false;
        }
        double radians = Math.toRadians(d4);
        double radians2 = Math.toRadians(d9);
        LatLng latLng = list.get(size - 1);
        double radians3 = Math.toRadians(latLng.alpha);
        double radians4 = Math.toRadians(latLng.purple);
        int i4 = 0;
        double d10 = radians3;
        for (LatLng latLng2 : list) {
            double wrap = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
            if (radians == d10 && wrap == 0.0d) {
                return true;
            }
            boolean z11 = z10;
            double radians5 = Math.toRadians(latLng2.alpha);
            double radians6 = Math.toRadians(latLng2.purple);
            if (intersects(d10, radians5, MathUtil.wrap(radians6 - radians4, -3.141592653589793d, 3.141592653589793d), radians, wrap, z2)) {
                i4++;
            }
            d10 = radians5;
            z10 = z11;
            radians4 = radians6;
        }
        boolean z12 = z10;
        if ((i4 & 1) != 0) {
            return true;
        }
        return z12;
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z2) {
        return isLocationOnEdge(latLng, list, z2, 0.1d);
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z2) {
        return isLocationOnPath(latLng, list, z2, 0.1d);
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z2) {
        return locationIndexOnPath(latLng, list, z2, 0.1d);
    }

    private static void encode(long j5, StringBuffer stringBuffer) {
        long j6 = j5 << 1;
        if (j5 < 0) {
            j6 = ~j6;
        }
        while (j6 >= 32) {
            stringBuffer.append(Character.toChars((int) ((32 | (31 & j6)) + 63)));
            j6 >>= 5;
        }
        stringBuffer.append(Character.toChars((int) (j6 + 63)));
    }
}
