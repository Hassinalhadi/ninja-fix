package g0;

import a0.C0354h;
import android.graphics.Path;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes3.dex */
public abstract class ac {
    public static final void alpha(C0354h c0354h, double d4, double d9, double d10, double d11, double d12, double d13, double d14, boolean z2, boolean z10) {
        double d15;
        double d16;
        boolean z11;
        double d17 = d12;
        double d18 = (d14 / 180) * 3.141592653589793d;
        double cos = Math.cos(d18);
        double sin = Math.sin(d18);
        double d19 = ((d9 * sin) + (d4 * cos)) / d17;
        double d20 = ((d9 * cos) + ((-d4) * sin)) / d13;
        double d21 = ((d11 * sin) + (d10 * cos)) / d17;
        double d22 = ((d11 * cos) + ((-d10) * sin)) / d13;
        double d23 = d19 - d21;
        double d24 = d20 - d22;
        double d25 = 2;
        double d26 = (d19 + d21) / d25;
        double d27 = (d20 + d22) / d25;
        double d28 = (d24 * d24) + (d23 * d23);
        if (d28 != 0.0d) {
            double d29 = (1.0d / d28) - 0.25d;
            if (d29 < 0.0d) {
                double sqrt = (float) (Math.sqrt(d28) / 1.99999d);
                alpha(c0354h, d4, d9, d10, d11, d17 * sqrt, d13 * sqrt, d14, z2, z10);
                return;
            }
            double sqrt2 = Math.sqrt(d29);
            double d30 = d23 * sqrt2;
            double d31 = sqrt2 * d24;
            if (z2 == z10) {
                d15 = d26 - d31;
                d16 = d27 + d30;
            } else {
                d15 = d26 + d31;
                d16 = d27 - d30;
            }
            double atan2 = Math.atan2(d20 - d16, d19 - d15);
            double atan22 = Math.atan2(d22 - d16, d21 - d15) - atan2;
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
            double d32 = d15 * d17;
            double d33 = d16 * d13;
            double d34 = (d32 * cos) - (d33 * sin);
            double d35 = (d33 * cos) + (d32 * sin);
            double d36 = 4;
            int ceil = (int) Math.ceil(Math.abs((atan22 * d36) / 3.141592653589793d));
            double cos2 = Math.cos(d18);
            double sin2 = Math.sin(d18);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d37 = atan22;
            double d38 = -d17;
            double d39 = d38 * cos2;
            double d40 = d13 * sin2;
            double d41 = (d39 * sin3) - (d40 * cos3);
            double d42 = d38 * sin2;
            double d43 = d13 * cos2;
            double d44 = (cos3 * d43) + (sin3 * d42);
            double d45 = d37 / ceil;
            int i4 = 0;
            double d46 = d41;
            double d47 = d44;
            double d48 = d9;
            double d49 = atan2;
            double d50 = d4;
            while (i4 < ceil) {
                double d51 = d49 + d45;
                double sin4 = Math.sin(d51);
                double cos4 = Math.cos(d51);
                int i5 = i4;
                double d52 = (((d17 * cos2) * cos4) + d34) - (d40 * sin4);
                int i10 = ceil;
                double d53 = (d43 * sin4) + (d17 * sin2 * cos4) + d35;
                double d54 = (d39 * sin4) - (d40 * cos4);
                double d55 = (cos4 * d43) + (sin4 * d42);
                double d56 = d51 - d49;
                double tan = Math.tan(d56 / d25);
                double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d36) - 1) * Math.sin(d56)) / 3;
                double d57 = d36;
                c0354h.alpha.cubicTo((float) ((d46 * sqrt3) + d50), (float) ((d47 * sqrt3) + d48), (float) (d52 - (sqrt3 * d54)), (float) (d53 - (sqrt3 * d55)), (float) d52, (float) d53);
                sin2 = sin2;
                d50 = d52;
                i4 = i5 + 1;
                d34 = d34;
                d36 = d57;
                d49 = d51;
                d47 = d55;
                d46 = d54;
                d48 = d53;
                ceil = i10;
                d17 = d12;
            }
        }
    }

    public static final void bravo(List list, C0354h c0354h) {
        int i4;
        ab abVar;
        int i5;
        int i10;
        Path path;
        float f5;
        ab abVar2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        List list2 = list;
        C0354h c0354h2 = c0354h;
        int i11 = 0;
        if (c0354h2.alpha.getFillType() == Path.FillType.EVEN_ODD) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        Path path2 = c0354h2.alpha;
        path2.rewind();
        c0354h2.echo(i4);
        if (list2.isEmpty()) {
            abVar = C1730j.charlie;
        } else {
            abVar = (ab) list2.get(0);
        }
        int size = list2.size();
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        float f23 = 0.0f;
        float f24 = 0.0f;
        while (i11 < size) {
            ab abVar3 = (ab) list2.get(i11);
            if (abVar3 instanceof C1730j) {
                path2.close();
                i5 = size;
                i10 = i11;
                path = path2;
                f5 = f18;
                abVar2 = abVar3;
                f19 = f23;
                f21 = f19;
                f20 = f24;
            } else {
                if (abVar3 instanceof v) {
                    v vVar = (v) abVar3;
                    float f25 = vVar.charlie;
                    f21 += f25;
                    float f26 = vVar.delta;
                    f22 += f26;
                    path2.rMoveTo(f25, f26);
                    i5 = size;
                    i10 = i11;
                    path = path2;
                    f5 = f18;
                    f23 = f21;
                    f24 = f22;
                } else {
                    if (abVar3 instanceof n) {
                        n nVar = (n) abVar3;
                        float f27 = nVar.charlie;
                        float f28 = nVar.delta;
                        path2.moveTo(f27, f28);
                        f22 = f28;
                        f24 = f22;
                        i5 = size;
                        i10 = i11;
                        path = path2;
                        f21 = f27;
                        f23 = f21;
                    } else {
                        if (abVar3 instanceof u) {
                            u uVar = (u) abVar3;
                            float f29 = uVar.charlie;
                            float f30 = uVar.delta;
                            path2.rLineTo(f29, f30);
                            f21 += uVar.charlie;
                            f22 += f30;
                        } else {
                            if (abVar3 instanceof m) {
                                m mVar = (m) abVar3;
                                float f31 = mVar.charlie;
                                f12 = mVar.delta;
                                c0354h2.bravo(f31, f12);
                                f21 = mVar.charlie;
                                i5 = size;
                                i10 = i11;
                                path = path2;
                            } else if (abVar3 instanceof t) {
                                t tVar = (t) abVar3;
                                path2.rLineTo(tVar.charlie, f18);
                                f21 += tVar.charlie;
                            } else if (abVar3 instanceof l) {
                                l lVar = (l) abVar3;
                                c0354h2.bravo(lVar.charlie, f22);
                                f21 = lVar.charlie;
                            } else {
                                if (abVar3 instanceof z) {
                                    z zVar = (z) abVar3;
                                    path2.rLineTo(f18, zVar.charlie);
                                    f17 = zVar.charlie;
                                } else if (abVar3 instanceof aa) {
                                    aa aaVar = (aa) abVar3;
                                    c0354h2.bravo(f21, aaVar.charlie);
                                    f22 = aaVar.charlie;
                                } else if (abVar3 instanceof s) {
                                    s sVar = (s) abVar3;
                                    path2.rCubicTo(sVar.charlie, sVar.delta, sVar.echo, sVar.foxtrot, sVar.golf, sVar.hotel);
                                    f19 = sVar.echo + f21;
                                    f20 = sVar.foxtrot + f22;
                                    f21 += sVar.golf;
                                    f17 = sVar.hotel;
                                } else {
                                    if (abVar3 instanceof C1731k) {
                                        C1731k c1731k = (C1731k) abVar3;
                                        path2.cubicTo(c1731k.charlie, c1731k.delta, c1731k.echo, c1731k.foxtrot, c1731k.golf, c1731k.hotel);
                                        f19 = c1731k.echo;
                                        f20 = c1731k.foxtrot;
                                        f13 = c1731k.golf;
                                        f14 = c1731k.hotel;
                                    } else if (abVar3 instanceof x) {
                                        if (abVar.alpha) {
                                            f16 = f22 - f20;
                                            f15 = f21 - f19;
                                        } else {
                                            f15 = f18;
                                            f16 = f15;
                                        }
                                        x xVar = (x) abVar3;
                                        path2.rCubicTo(f15, f16, xVar.charlie, xVar.delta, xVar.echo, xVar.foxtrot);
                                        f19 = xVar.charlie + f21;
                                        f20 = xVar.delta + f22;
                                        f21 += xVar.echo;
                                        f17 = xVar.foxtrot;
                                    } else if (abVar3 instanceof p) {
                                        if (abVar.alpha) {
                                            float f32 = 2;
                                            f21 = (f21 * f32) - f19;
                                            f22 = (f32 * f22) - f20;
                                        }
                                        p pVar = (p) abVar3;
                                        path2.cubicTo(f21, f22, pVar.charlie, pVar.delta, pVar.echo, pVar.foxtrot);
                                        f19 = pVar.charlie;
                                        f20 = pVar.delta;
                                        f13 = pVar.echo;
                                        f14 = pVar.foxtrot;
                                    } else if (abVar3 instanceof w) {
                                        w wVar = (w) abVar3;
                                        float f33 = wVar.charlie;
                                        float f34 = wVar.delta;
                                        float f35 = wVar.echo;
                                        float f36 = wVar.foxtrot;
                                        path2.rQuadTo(f33, f34, f35, f36);
                                        float f37 = wVar.charlie + f21;
                                        f20 = f34 + f22;
                                        f21 += f35;
                                        f22 += f36;
                                        f19 = f37;
                                    } else if (abVar3 instanceof o) {
                                        o oVar = (o) abVar3;
                                        float f38 = oVar.charlie;
                                        f20 = oVar.delta;
                                        float f39 = oVar.echo;
                                        f12 = oVar.foxtrot;
                                        path2.quadTo(f38, f20, f39, f12);
                                        f19 = oVar.charlie;
                                        i5 = size;
                                        i10 = i11;
                                        path = path2;
                                        f21 = f39;
                                    } else {
                                        if (abVar3 instanceof y) {
                                            if (abVar.bravo) {
                                                f10 = f21 - f19;
                                                f11 = f22 - f20;
                                            } else {
                                                f10 = f18;
                                                f11 = f10;
                                            }
                                            y yVar = (y) abVar3;
                                            float f40 = yVar.charlie;
                                            float f41 = yVar.delta;
                                            path2.rQuadTo(f10, f11, f40, f41);
                                            float f42 = f10 + f21;
                                            float f43 = f11 + f22;
                                            f21 += yVar.charlie;
                                            f22 += f41;
                                            i5 = size;
                                            i10 = i11;
                                            path = path2;
                                            f20 = f43;
                                            f5 = f18;
                                            abVar2 = abVar3;
                                            f19 = f42;
                                        } else if (abVar3 instanceof q) {
                                            if (abVar.bravo) {
                                                float f44 = 2;
                                                f21 = (f21 * f44) - f19;
                                                f22 = (f44 * f22) - f20;
                                            }
                                            q qVar = (q) abVar3;
                                            float f45 = qVar.charlie;
                                            float f46 = qVar.delta;
                                            path2.quadTo(f21, f22, f45, f46);
                                            float f47 = f22;
                                            f22 = f46;
                                            f20 = f47;
                                            i5 = size;
                                            i10 = i11;
                                            path = path2;
                                            f5 = f18;
                                            f19 = f21;
                                            abVar2 = abVar3;
                                            f21 = qVar.charlie;
                                        } else if (abVar3 instanceof r) {
                                            r rVar = (r) abVar3;
                                            float f48 = rVar.hotel + f21;
                                            float f49 = rVar.india + f22;
                                            i5 = size;
                                            path = path2;
                                            i10 = i11;
                                            f5 = 0.0f;
                                            alpha(c0354h, f21, f22, f48, f49, rVar.charlie, rVar.delta, rVar.echo, rVar.foxtrot, rVar.golf);
                                            f19 = f48;
                                            f21 = f19;
                                            f20 = f49;
                                            f22 = f20;
                                            abVar2 = abVar3;
                                        } else {
                                            i5 = size;
                                            i10 = i11;
                                            path = path2;
                                            f5 = f18;
                                            if (abVar3 instanceof C1729i) {
                                                C1729i c1729i = (C1729i) abVar3;
                                                double d4 = c1729i.hotel;
                                                float f50 = c1729i.india;
                                                abVar2 = abVar3;
                                                alpha(c0354h, f21, f22, d4, f50, c1729i.charlie, c1729i.delta, c1729i.echo, c1729i.foxtrot, c1729i.golf);
                                                f19 = c1729i.hotel;
                                                f21 = f19;
                                                f20 = f50;
                                            } else {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                        i11 = i10 + 1;
                                        list2 = list;
                                        c0354h2 = c0354h;
                                        size = i5;
                                        f18 = f5;
                                        path2 = path;
                                        abVar = abVar2;
                                    }
                                    f22 = f14;
                                    i5 = size;
                                    i10 = i11;
                                    path = path2;
                                    f21 = f13;
                                }
                                f22 += f17;
                            }
                            f22 = f12;
                        }
                        i5 = size;
                        i10 = i11;
                        path = path2;
                    }
                    f5 = f18;
                }
                abVar2 = abVar3;
                i11 = i10 + 1;
                list2 = list;
                c0354h2 = c0354h;
                size = i5;
                f18 = f5;
                path2 = path;
                abVar = abVar2;
            }
            f22 = f20;
            i11 = i10 + 1;
            list2 = list;
            c0354h2 = c0354h;
            size = i5;
            f18 = f5;
            path2 = path;
            abVar = abVar2;
        }
    }
}
