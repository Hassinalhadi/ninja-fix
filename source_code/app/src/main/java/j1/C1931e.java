package j1;

import android.graphics.Path;
import android.util.Log;
import s6.C5;

/* renamed from: j1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1931e {
    public char alpha;
    public final float[] bravo;

    public C1931e(char c3, float[] fArr) {
        this.alpha = c3;
        this.bravo = fArr;
    }

    public static void alpha(Path path, float f5, float f10, float f11, float f12, float f13, float f14, float f15, boolean z2, boolean z10) {
        double d4;
        double d9;
        boolean z11;
        double radians = Math.toRadians(f15);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d10 = f5;
        double d11 = f10;
        double d12 = f13;
        double d13 = ((d11 * sin) + (d10 * cos)) / d12;
        double d14 = f14;
        double d15 = ((d11 * cos) + ((-f5) * sin)) / d14;
        double d16 = f12;
        double d17 = ((d16 * sin) + (f11 * cos)) / d12;
        double d18 = ((d16 * cos) + ((-f11) * sin)) / d14;
        double d19 = d13 - d17;
        double d20 = d15 - d18;
        double d21 = (d13 + d17) / 2.0d;
        double d22 = (d15 + d18) / 2.0d;
        double d23 = (d20 * d20) + (d19 * d19);
        if (d23 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d24 = (1.0d / d23) - 0.25d;
        if (d24 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d23);
            float sqrt = (float) (Math.sqrt(d23) / 1.99999d);
            alpha(path, f5, f10, f11, f12, f13 * sqrt, sqrt * f14, f15, z2, z10);
            return;
        }
        double sqrt2 = Math.sqrt(d24);
        double d25 = sqrt2 * d19;
        double d26 = sqrt2 * d20;
        if (z2 == z10) {
            d4 = d21 - d26;
            d9 = d22 + d25;
        } else {
            d4 = d21 + d26;
            d9 = d22 - d25;
        }
        double atan2 = Math.atan2(d15 - d9, d13 - d4);
        double atan22 = Math.atan2(d18 - d9, d17 - d4) - atan2;
        if (atan22 >= 0.0d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            if (atan22 > 0.0d) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d27 = d4 * d12;
        double d28 = d9 * d14;
        double d29 = (d27 * cos) - (d28 * sin);
        double d30 = (d28 * cos) + (d27 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d31 = -d12;
        double d32 = d31 * cos2;
        double d33 = d14 * sin2;
        double d34 = (d32 * sin3) - (d33 * cos3);
        double d35 = d31 * sin2;
        double d36 = d14 * cos2;
        double d37 = atan22 / ceil;
        double d38 = (cos3 * d36) + (sin3 * d35);
        double d39 = d10;
        double d40 = d11;
        int i4 = 0;
        double d41 = atan2;
        while (i4 < ceil) {
            double d42 = d41 + d37;
            double sin4 = Math.sin(d42);
            double cos4 = Math.cos(d42);
            int i5 = ceil;
            double d43 = (((d12 * cos2) * cos4) + d29) - (d33 * sin4);
            double d44 = (d36 * sin4) + (d12 * sin2 * cos4) + d30;
            double d45 = (d32 * sin4) - (d33 * cos4);
            double d46 = (cos4 * d36) + (sin4 * d35);
            double d47 = d42 - d41;
            double tan = Math.tan(d47 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
            double d48 = (d38 * sqrt3) + d40;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d34 * sqrt3) + d39), (float) d48, (float) (d43 - (sqrt3 * d45)), (float) (d44 - (sqrt3 * d46)), (float) d43, (float) d44);
            i4++;
            d40 = d44;
            cos2 = cos2;
            d35 = d35;
            d41 = d42;
            d38 = d46;
            d39 = d43;
            ceil = i5;
            d34 = d45;
            d37 = d37;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void bravo(C1931e[] c1931eArr, Path path) {
        int i4;
        int i5;
        C1931e c1931e;
        int i10;
        char c3;
        boolean z2;
        boolean z10;
        float f5;
        float f10;
        float f11;
        float f12;
        C1931e c1931e2;
        boolean z11;
        boolean z12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = c1931eArr.length;
        char c4 = 'm';
        int i11 = 0;
        char c10 = 'm';
        int i12 = 0;
        while (i12 < length) {
            C1931e c1931e3 = c1931eArr[i12];
            char c11 = c1931e3.alpha;
            float f21 = fArr[i11];
            float f22 = fArr[1];
            float f23 = fArr[2];
            float f24 = fArr[3];
            float f25 = fArr[4];
            float f26 = fArr[5];
            switch (c11) {
                case 'A':
                case 'a':
                    i4 = 7;
                    break;
                case 'C':
                case 'c':
                    i4 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i4 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i4 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f25, f26);
                    f21 = f25;
                    f23 = f21;
                    f22 = f26;
                    f24 = f22;
                    break;
            }
            i4 = 2;
            float f27 = f22;
            float f28 = f25;
            float f29 = f26;
            float f30 = f21;
            int i13 = i11;
            while (true) {
                float[] fArr2 = c1931e3.bravo;
                if (i13 < fArr2.length) {
                    int i14 = i11;
                    if (c11 != 'A') {
                        if (c11 != 'C') {
                            if (c11 != 'H') {
                                if (c11 != 'Q') {
                                    if (c11 != 'V') {
                                        if (c11 != 'a') {
                                            if (c11 != 'c') {
                                                if (c11 != 'h') {
                                                    if (c11 != 'q') {
                                                        if (c11 != 'v') {
                                                            if (c11 != 'L') {
                                                                if (c11 != 'M') {
                                                                    if (c11 != 'S') {
                                                                        if (c11 != 'T') {
                                                                            if (c11 != 'l') {
                                                                                if (c11 != c4) {
                                                                                    if (c11 != 's') {
                                                                                        if (c11 != 't') {
                                                                                            i5 = i13;
                                                                                        } else {
                                                                                            if (c10 != 'q' && c10 != 't' && c10 != 'Q' && c10 != 'T') {
                                                                                                f20 = 0.0f;
                                                                                                f19 = 0.0f;
                                                                                            } else {
                                                                                                f19 = f30 - f23;
                                                                                                f20 = f27 - f24;
                                                                                            }
                                                                                            int i15 = i13 + 1;
                                                                                            path2.rQuadTo(f19, f20, fArr2[i13], fArr2[i15]);
                                                                                            float f31 = f19 + f30;
                                                                                            float f32 = f27 + f20;
                                                                                            float f33 = f30 + fArr2[i13];
                                                                                            f27 += fArr2[i15];
                                                                                            f24 = f32;
                                                                                            i5 = i13;
                                                                                            c1931e = c1931e3;
                                                                                            f10 = f33;
                                                                                            f23 = f31;
                                                                                            f5 = f27;
                                                                                            i10 = i12;
                                                                                            c3 = c11;
                                                                                        }
                                                                                    } else {
                                                                                        if (c10 != 'c' && c10 != 's' && c10 != 'C' && c10 != 'S') {
                                                                                            f18 = 0.0f;
                                                                                            f17 = 0.0f;
                                                                                        } else {
                                                                                            f17 = f27 - f24;
                                                                                            f18 = f30 - f23;
                                                                                        }
                                                                                        int i16 = i13 + 1;
                                                                                        int i17 = i13 + 2;
                                                                                        int i18 = i13 + 3;
                                                                                        i5 = i13;
                                                                                        path2.rCubicTo(f18, f17, fArr2[i13], fArr2[i16], fArr2[i17], fArr2[i18]);
                                                                                        f13 = fArr2[i5] + f30;
                                                                                        f14 = f27 + fArr2[i16];
                                                                                        f30 += fArr2[i17];
                                                                                        f15 = fArr2[i18];
                                                                                    }
                                                                                } else {
                                                                                    i5 = i13;
                                                                                    float f34 = fArr2[i5];
                                                                                    f30 += f34;
                                                                                    float f35 = fArr2[i5 + 1];
                                                                                    f27 += f35;
                                                                                    if (i5 > 0) {
                                                                                        path2.rLineTo(f34, f35);
                                                                                    } else {
                                                                                        path2.rMoveTo(f34, f35);
                                                                                        c1931e = c1931e3;
                                                                                        f10 = f30;
                                                                                        f28 = f10;
                                                                                        f5 = f27;
                                                                                        f29 = f5;
                                                                                        i10 = i12;
                                                                                        c3 = c11;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i5 = i13;
                                                                                int i19 = i5 + 1;
                                                                                path2.rLineTo(fArr2[i5], fArr2[i19]);
                                                                                f30 += fArr2[i5];
                                                                                f16 = fArr2[i19];
                                                                            }
                                                                        } else {
                                                                            i5 = i13;
                                                                            if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                                                f30 = (f30 * 2.0f) - f23;
                                                                                f27 = (f27 * 2.0f) - f24;
                                                                            }
                                                                            float f36 = f27;
                                                                            float f37 = fArr2[i5];
                                                                            int i20 = i5 + 1;
                                                                            path2.quadTo(f30, f36, f37, fArr2[i20]);
                                                                            f24 = f36;
                                                                            f10 = fArr2[i5];
                                                                            f5 = fArr2[i20];
                                                                            i10 = i12;
                                                                            c1931e = c1931e3;
                                                                            f23 = f30;
                                                                            c3 = c11;
                                                                        }
                                                                    } else {
                                                                        i5 = i13;
                                                                        if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                                                            f30 = (f30 * 2.0f) - f23;
                                                                            f27 = (f27 * 2.0f) - f24;
                                                                        }
                                                                        float f38 = f30;
                                                                        float f39 = f27;
                                                                        int i21 = i5 + 1;
                                                                        int i22 = i5 + 2;
                                                                        int i23 = i5 + 3;
                                                                        path2.cubicTo(f38, f39, fArr2[i5], fArr2[i21], fArr2[i22], fArr2[i23]);
                                                                        f11 = fArr2[i5];
                                                                        float f40 = fArr2[i21];
                                                                        f12 = fArr2[i22];
                                                                        f24 = f40;
                                                                        f5 = fArr2[i23];
                                                                        i10 = i12;
                                                                        c1931e = c1931e3;
                                                                        c3 = c11;
                                                                    }
                                                                } else {
                                                                    i5 = i13;
                                                                    f10 = fArr2[i5];
                                                                    f5 = fArr2[i5 + 1];
                                                                    if (i5 > 0) {
                                                                        path2.lineTo(f10, f5);
                                                                    } else {
                                                                        path2.moveTo(f10, f5);
                                                                        f28 = f10;
                                                                        f29 = f5;
                                                                    }
                                                                }
                                                            } else {
                                                                i5 = i13;
                                                                int i24 = i5 + 1;
                                                                path2.lineTo(fArr2[i5], fArr2[i24]);
                                                                f10 = fArr2[i5];
                                                                f5 = fArr2[i24];
                                                            }
                                                            i10 = i12;
                                                            c1931e = c1931e3;
                                                            c3 = c11;
                                                        } else {
                                                            i5 = i13;
                                                            path2.rLineTo(0.0f, fArr2[i5]);
                                                            f16 = fArr2[i5];
                                                        }
                                                        f27 += f16;
                                                    } else {
                                                        i5 = i13;
                                                        int i25 = i5 + 1;
                                                        int i26 = i5 + 2;
                                                        int i27 = i5 + 3;
                                                        path2.rQuadTo(fArr2[i5], fArr2[i25], fArr2[i26], fArr2[i27]);
                                                        f13 = fArr2[i5] + f30;
                                                        f14 = f27 + fArr2[i25];
                                                        f30 += fArr2[i26];
                                                        f15 = fArr2[i27];
                                                    }
                                                    f27 += f15;
                                                    f23 = f13;
                                                    f24 = f14;
                                                } else {
                                                    i5 = i13;
                                                    path2.rLineTo(fArr2[i5], 0.0f);
                                                    f30 += fArr2[i5];
                                                }
                                            } else {
                                                i5 = i13;
                                                int i28 = i5 + 2;
                                                int i29 = i5 + 3;
                                                int i30 = i5 + 4;
                                                int i31 = i5 + 5;
                                                path2.rCubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i28], fArr2[i29], fArr2[i30], fArr2[i31]);
                                                float f41 = fArr2[i28] + f30;
                                                float f42 = f27 + fArr2[i29];
                                                f30 += fArr2[i30];
                                                f27 += fArr2[i31];
                                                f23 = f41;
                                                f24 = f42;
                                            }
                                            c1931e = c1931e3;
                                            f10 = f30;
                                            f5 = f27;
                                            i10 = i12;
                                            c3 = c11;
                                        } else {
                                            i5 = i13;
                                            int i32 = i5 + 5;
                                            float f43 = fArr2[i32] + f30;
                                            int i33 = i5 + 6;
                                            float f44 = fArr2[i33] + f27;
                                            float f45 = fArr2[i5];
                                            float f46 = fArr2[i5 + 1];
                                            float f47 = fArr2[i5 + 2];
                                            if (fArr2[i5 + 3] != 0.0f) {
                                                c1931e2 = c1931e3;
                                                z11 = 1;
                                            } else {
                                                c1931e2 = c1931e3;
                                                z11 = i14;
                                            }
                                            c1931e = c1931e2;
                                            float f48 = f30;
                                            c3 = c11;
                                            if (fArr2[i5 + 4] != 0.0f) {
                                                z12 = 1;
                                            } else {
                                                z12 = i14;
                                            }
                                            float f49 = f27;
                                            i10 = i12;
                                            alpha(path, f48, f49, f43, f44, f45, f46, f47, z11, z12);
                                            f10 = f48 + fArr2[i32];
                                            f5 = f49 + fArr2[i33];
                                            f23 = f10;
                                            f24 = f5;
                                        }
                                    } else {
                                        i5 = i13;
                                        i10 = i12;
                                        c1931e = c1931e3;
                                        f10 = f30;
                                        c3 = c11;
                                        path2.lineTo(f10, fArr2[i5]);
                                        f5 = fArr2[i5];
                                    }
                                } else {
                                    i5 = i13;
                                    i10 = i12;
                                    c1931e = c1931e3;
                                    c3 = c11;
                                    int i34 = i5 + 1;
                                    int i35 = i5 + 2;
                                    int i36 = i5 + 3;
                                    path2.quadTo(fArr2[i5], fArr2[i34], fArr2[i35], fArr2[i36]);
                                    f11 = fArr2[i5];
                                    float f50 = fArr2[i34];
                                    f12 = fArr2[i35];
                                    f24 = f50;
                                    f5 = fArr2[i36];
                                }
                                f23 = f11;
                                f10 = f12;
                            } else {
                                i5 = i13;
                                c1931e = c1931e3;
                                c3 = c11;
                                f5 = f27;
                                i10 = i12;
                                path2.lineTo(fArr2[i5], f5);
                                f10 = fArr2[i5];
                            }
                        } else {
                            i5 = i13;
                            i10 = i12;
                            c1931e = c1931e3;
                            c3 = c11;
                            int i37 = i5 + 2;
                            int i38 = i5 + 3;
                            int i39 = i5 + 4;
                            int i40 = i5 + 5;
                            path2.cubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                            float f51 = fArr2[i39];
                            float f52 = fArr2[i40];
                            f23 = fArr2[i37];
                            f24 = fArr2[i38];
                            f5 = f52;
                            f10 = f51;
                        }
                    } else {
                        i5 = i13;
                        c1931e = c1931e3;
                        float f53 = f30;
                        float f54 = f27;
                        i10 = i12;
                        c3 = c11;
                        int i41 = i5 + 5;
                        float f55 = fArr2[i41];
                        int i42 = i5 + 6;
                        float f56 = fArr2[i42];
                        float f57 = fArr2[i5];
                        float f58 = fArr2[i5 + 1];
                        float f59 = fArr2[i5 + 2];
                        if (fArr2[i5 + 3] != 0.0f) {
                            z2 = 1;
                        } else {
                            z2 = i14;
                        }
                        if (fArr2[i5 + 4] != 0.0f) {
                            z10 = 1;
                        } else {
                            z10 = i14;
                        }
                        alpha(path, f53, f54, f55, f56, f57, f58, f59, z2, z10);
                        f23 = fArr2[i41];
                        f5 = fArr2[i42];
                        f24 = f5;
                        f10 = f23;
                    }
                    c11 = c3;
                    c1931e3 = c1931e;
                    i12 = i10;
                    i11 = i14;
                    c4 = 'm';
                    f30 = f10;
                    f27 = f5;
                    c10 = c11;
                    i13 = i5 + i4;
                    path2 = path;
                }
            }
            int i43 = i11;
            fArr[i43] = f30;
            fArr[1] = f27;
            fArr[2] = f23;
            fArr[3] = f24;
            fArr[4] = f28;
            fArr[5] = f29;
            c10 = c1931e3.alpha;
            i12++;
            path2 = path;
            i11 = i43;
            c4 = 'm';
        }
    }

    public C1931e(C1931e c1931e) {
        this.alpha = c1931e.alpha;
        float[] fArr = c1931e.bravo;
        this.bravo = C5.bravo(fArr, fArr.length);
    }
}
