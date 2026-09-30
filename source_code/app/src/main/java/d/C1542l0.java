package d;

import android.widget.EdgeEffect;
import b.AbstractC0706v;
import b.C0704t;

/* renamed from: d.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1542l0 {
    public final /* synthetic */ C1548o0 alpha;

    public C1542l0(C1548o0 c1548o0) {
        this.alpha = c1548o0;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0257 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long alpha(int i4, long j5) {
        float f5;
        long j6;
        b.ao aoVar;
        float f10;
        int i5;
        char c3;
        float golf;
        float intBitsToFloat;
        long floatToRawIntBits;
        long foxtrot;
        long j7;
        boolean z2;
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        int i10;
        boolean z13;
        C1548o0 c1548o0 = this.alpha;
        c1548o0.juliet = i4;
        C0704t c0704t = c1548o0.bravo;
        if (c0704t != null && (c1548o0.alpha.delta() || c1548o0.alpha.charlie())) {
            int i11 = c1548o0.juliet;
            C1534h0 c1534h0 = c1548o0.mike;
            boolean echo = Z.e.echo(c0704t.golf);
            C1548o0 c1548o02 = (C1548o0) c1534h0.purple;
            if (echo) {
                return new Z.b(c1548o02.charlie(c1548o02.kilo, j5, c1548o02.juliet)).alpha;
            }
            boolean z14 = c0704t.foxtrot;
            b.ao aoVar2 = c0704t.charlie;
            if (!z14) {
                if (b.ao.golf(aoVar2.foxtrot)) {
                    c0704t.foxtrot(0L);
                }
                if (b.ao.golf(aoVar2.golf)) {
                    c0704t.golf(0L);
                }
                if (b.ao.golf(aoVar2.delta)) {
                    c0704t.hotel(0L);
                }
                if (b.ao.golf(aoVar2.echo)) {
                    c0704t.echo(0L);
                }
                c0704t.foxtrot = true;
            }
            int i12 = AbstractC0706v.alpha;
            if (i11 == 2) {
                f5 = 4.0f;
            } else {
                f5 = 1.0f;
            }
            long hotel = Z.b.hotel(f5, j5);
            int i13 = (int) (j5 & 4294967295L);
            if (Float.intBitsToFloat(i13) == 0.0f) {
                aoVar = aoVar2;
                j6 = 4294967295L;
            } else {
                if (b.ao.golf(aoVar2.delta) && Float.intBitsToFloat(i13) < 0.0f) {
                    float hotel2 = c0704t.hotel(hotel);
                    j6 = 4294967295L;
                    if (!b.ao.golf(aoVar2.delta)) {
                        aoVar2.echo().finish();
                    }
                    if (hotel2 == Float.intBitsToFloat((int) (hotel & 4294967295L))) {
                        f10 = Float.intBitsToFloat(i13);
                    } else {
                        f10 = hotel2 / f5;
                    }
                    aoVar = aoVar2;
                } else {
                    j6 = 4294967295L;
                    if (b.ao.golf(aoVar2.echo) && Float.intBitsToFloat(i13) > 0.0f) {
                        float echo2 = c0704t.echo(hotel);
                        if (!b.ao.golf(aoVar2.echo)) {
                            aoVar2.bravo().finish();
                        }
                        aoVar = aoVar2;
                        if (echo2 == Float.intBitsToFloat((int) (hotel & 4294967295L))) {
                            f10 = Float.intBitsToFloat(i13);
                        } else {
                            f10 = echo2 / f5;
                        }
                    } else {
                        aoVar = aoVar2;
                    }
                }
                i5 = (int) (j5 >> 32);
                if (Float.intBitsToFloat(i5) != 0.0f) {
                    c3 = ' ';
                } else {
                    if (b.ao.golf(aoVar.foxtrot) && Float.intBitsToFloat(i5) < 0.0f) {
                        golf = c0704t.foxtrot(hotel);
                        c3 = ' ';
                        if (!b.ao.golf(aoVar.foxtrot)) {
                            aoVar.charlie().finish();
                        }
                        if (golf == Float.intBitsToFloat((int) (hotel >> 32))) {
                            intBitsToFloat = Float.intBitsToFloat(i5);
                        }
                        intBitsToFloat = golf / f5;
                    } else {
                        c3 = ' ';
                        if (b.ao.golf(aoVar.golf) && Float.intBitsToFloat(i5) > 0.0f) {
                            golf = c0704t.golf(hotel);
                            if (!b.ao.golf(aoVar.golf)) {
                                aoVar.delta().finish();
                            }
                            if (golf == Float.intBitsToFloat((int) (hotel >> 32))) {
                                intBitsToFloat = Float.intBitsToFloat(i5);
                            }
                            intBitsToFloat = golf / f5;
                        }
                    }
                    floatToRawIntBits = (Float.floatToRawIntBits(f10) & j6) | (Float.floatToRawIntBits(intBitsToFloat) << c3);
                    if (!Z.b.bravo(floatToRawIntBits, 0L)) {
                        c0704t.delta();
                    }
                    foxtrot = Z.b.foxtrot(j5, floatToRawIntBits);
                    long j11 = new Z.b(c1548o02.charlie(c1548o02.kilo, foxtrot, c1548o02.juliet)).alpha;
                    long foxtrot2 = Z.b.foxtrot(foxtrot, j11);
                    if ((Float.intBitsToFloat((int) (foxtrot >> c3)) == 0.0f || Float.intBitsToFloat((int) (foxtrot & j6)) != 0.0f) && ((Float.intBitsToFloat((int) (j11 >> c3)) != 0.0f || Float.intBitsToFloat((int) (j11 & j6)) != 0.0f) && (b.ao.golf(aoVar.foxtrot) || b.ao.golf(aoVar.delta) || b.ao.golf(aoVar.golf) || b.ao.golf(aoVar.echo)))) {
                        c0704t.alpha();
                    }
                    if (i11 == 1) {
                        int i14 = (int) (foxtrot2 >> c3);
                        if (Float.intBitsToFloat(i14) > 0.5f) {
                            c0704t.foxtrot(foxtrot2);
                        } else if (Float.intBitsToFloat(i14) < -0.5f) {
                            c0704t.golf(foxtrot2);
                        } else {
                            j10 = foxtrot;
                            z12 = false;
                            i10 = (int) (foxtrot2 & j6);
                            if (Float.intBitsToFloat(i10) <= 0.5f) {
                                c0704t.hotel(foxtrot2);
                            } else if (Float.intBitsToFloat(i10) < -0.5f) {
                                c0704t.echo(foxtrot2);
                            } else {
                                z13 = false;
                                if (z12 && !z13) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                j7 = j10;
                            }
                            z13 = true;
                            if (z12) {
                            }
                            z2 = true;
                            j7 = j10;
                        }
                        j10 = foxtrot;
                        z12 = true;
                        i10 = (int) (foxtrot2 & j6);
                        if (Float.intBitsToFloat(i10) <= 0.5f) {
                        }
                        z13 = true;
                        if (z12) {
                        }
                        z2 = true;
                        j7 = j10;
                    } else {
                        j7 = foxtrot;
                        z2 = false;
                    }
                    if (!Z.b.bravo(j7, 0L)) {
                        if (b.ao.foxtrot(aoVar.foxtrot) && Float.intBitsToFloat(i5) < 0.0f) {
                            EdgeEffect charlie = aoVar.charlie();
                            float intBitsToFloat2 = Float.intBitsToFloat(i5);
                            if (charlie instanceof b.at) {
                                b.at atVar = (b.at) charlie;
                                float f11 = atVar.bravo + intBitsToFloat2;
                                atVar.bravo = f11;
                                if (Math.abs(f11) > atVar.alpha) {
                                    atVar.onRelease();
                                }
                            } else {
                                charlie.onRelease();
                            }
                            z10 = b.ao.foxtrot(aoVar.foxtrot);
                        } else {
                            z10 = false;
                        }
                        if (b.ao.foxtrot(aoVar.golf) && Float.intBitsToFloat(i5) > 0.0f) {
                            EdgeEffect delta = aoVar.delta();
                            float intBitsToFloat3 = Float.intBitsToFloat(i5);
                            if (delta instanceof b.at) {
                                b.at atVar2 = (b.at) delta;
                                float f12 = atVar2.bravo + intBitsToFloat3;
                                atVar2.bravo = f12;
                                if (Math.abs(f12) > atVar2.alpha) {
                                    atVar2.onRelease();
                                }
                            } else {
                                delta.onRelease();
                            }
                            if (!z10 && !b.ao.foxtrot(aoVar.golf)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        }
                        if (b.ao.foxtrot(aoVar.delta) && Float.intBitsToFloat(i13) < 0.0f) {
                            EdgeEffect echo3 = aoVar.echo();
                            float intBitsToFloat4 = Float.intBitsToFloat(i13);
                            if (echo3 instanceof b.at) {
                                b.at atVar3 = (b.at) echo3;
                                float f13 = atVar3.bravo + intBitsToFloat4;
                                atVar3.bravo = f13;
                                if (Math.abs(f13) > atVar3.alpha) {
                                    atVar3.onRelease();
                                }
                            } else {
                                echo3.onRelease();
                            }
                            if (!z10 && !b.ao.foxtrot(aoVar.delta)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        }
                        if (b.ao.foxtrot(aoVar.echo) && Float.intBitsToFloat(i13) > 0.0f) {
                            EdgeEffect bravo = aoVar.bravo();
                            float intBitsToFloat5 = Float.intBitsToFloat(i13);
                            if (bravo instanceof b.at) {
                                b.at atVar4 = (b.at) bravo;
                                float f14 = atVar4.bravo + intBitsToFloat5;
                                atVar4.bravo = f14;
                                if (Math.abs(f14) > atVar4.alpha) {
                                    atVar4.onRelease();
                                }
                            } else {
                                bravo.onRelease();
                            }
                            if (!z10 && !b.ao.foxtrot(aoVar.echo)) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        }
                        if (!z10 && !z2) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        z2 = z11;
                    }
                    if (z2) {
                        c0704t.delta();
                    }
                    return Z.b.golf(floatToRawIntBits, j11);
                }
                intBitsToFloat = 0.0f;
                floatToRawIntBits = (Float.floatToRawIntBits(f10) & j6) | (Float.floatToRawIntBits(intBitsToFloat) << c3);
                if (!Z.b.bravo(floatToRawIntBits, 0L)) {
                }
                foxtrot = Z.b.foxtrot(j5, floatToRawIntBits);
                long j112 = new Z.b(c1548o02.charlie(c1548o02.kilo, foxtrot, c1548o02.juliet)).alpha;
                long foxtrot22 = Z.b.foxtrot(foxtrot, j112);
                if (Float.intBitsToFloat((int) (foxtrot >> c3)) == 0.0f) {
                }
                c0704t.alpha();
                if (i11 == 1) {
                }
                if (!Z.b.bravo(j7, 0L)) {
                }
                if (z2) {
                }
                return Z.b.golf(floatToRawIntBits, j112);
            }
            f10 = 0.0f;
            i5 = (int) (j5 >> 32);
            if (Float.intBitsToFloat(i5) != 0.0f) {
            }
            intBitsToFloat = 0.0f;
            floatToRawIntBits = (Float.floatToRawIntBits(f10) & j6) | (Float.floatToRawIntBits(intBitsToFloat) << c3);
            if (!Z.b.bravo(floatToRawIntBits, 0L)) {
            }
            foxtrot = Z.b.foxtrot(j5, floatToRawIntBits);
            long j1122 = new Z.b(c1548o02.charlie(c1548o02.kilo, foxtrot, c1548o02.juliet)).alpha;
            long foxtrot222 = Z.b.foxtrot(foxtrot, j1122);
            if (Float.intBitsToFloat((int) (foxtrot >> c3)) == 0.0f) {
            }
            c0704t.alpha();
            if (i11 == 1) {
            }
            if (!Z.b.bravo(j7, 0L)) {
            }
            if (z2) {
            }
            return Z.b.golf(floatToRawIntBits, j1122);
        }
        return c1548o0.charlie(c1548o0.kilo, j5, i4);
    }
}
