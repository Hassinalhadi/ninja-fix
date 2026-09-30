package t6;

import T.s;
import a0.C0360n;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import f0.AbstractC1680b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import q0.C2391j;
import q0.InterfaceC2392k;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t6.W3;

/* loaded from: classes2.dex */
public abstract class W3 {
    /* JADX WARN: Removed duplicated region for block: B:101:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(final AbstractC1680b abstractC1680b, final String str, T.s sVar, T.f fVar, InterfaceC2392k interfaceC2392k, float f5, C0360n c0360n, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        T.s sVar2;
        int i11;
        int i12;
        T.f fVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z2;
        final T.s sVar3;
        final T.f fVar3;
        final InterfaceC2392k interfaceC2392k2;
        final C0360n c0360n2;
        androidx.compose.runtime.Q uniform;
        T.f fVar4;
        int i21;
        InterfaceC2392k interfaceC2392k3;
        C0360n c0360n3;
        boolean z10;
        int i22;
        int i23;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1142754848);
        if ((i4 & 6) == 0) {
            if (c0585q.india(abstractC1680b)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i10 = i23 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(str)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i10 |= i22;
        }
        int i24 = i5 & 4;
        if (i24 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            i12 = i5 & 8;
            if (i12 == 0) {
                i10 |= 3072;
            } else if ((i4 & 3072) == 0) {
                fVar2 = fVar;
                if (c0585q.golf(fVar2)) {
                    i13 = 2048;
                } else {
                    i13 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i13;
                i14 = i5 & 16;
                if (i14 != 0) {
                    i10 |= 24576;
                } else if ((i4 & 24576) == 0) {
                    if (c0585q.golf(interfaceC2392k)) {
                        i15 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i15 = 8192;
                    }
                    i10 |= i15;
                    i16 = i5 & 32;
                    if (i16 == 0) {
                        i10 |= 196608;
                    } else if ((196608 & i4) == 0) {
                        f10 = f5;
                        if (c0585q.delta(f10)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i10 |= i17;
                        i18 = i5 & 64;
                        if (i18 != 0) {
                            i10 |= 1572864;
                        } else if ((1572864 & i4) == 0) {
                            if (c0585q.golf(c0360n)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i10 |= i19;
                            i20 = i10;
                            if ((i10 & 599187) == 599186) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!c0585q.magenta(i20 & 1, z2)) {
                                T.s sVar4 = T.p.alpha;
                                if (i24 != 0) {
                                    sVar2 = sVar4;
                                }
                                if (i12 != 0) {
                                    fVar4 = T.d.teal;
                                } else {
                                    fVar4 = fVar2;
                                }
                                if (i14 != 0) {
                                    interfaceC2392k3 = C2391j.bravo;
                                    i21 = i16;
                                } else {
                                    i21 = i16;
                                    interfaceC2392k3 = interfaceC2392k;
                                }
                                if (i21 != 0) {
                                    f10 = 1.0f;
                                }
                                if (i18 != 0) {
                                    c0360n3 = null;
                                } else {
                                    c0360n3 = c0360n;
                                }
                                androidx.compose.runtime.as asVar = C0580l.alpha;
                                if (str != null) {
                                    c0585q.purple(1899234820);
                                    if ((i20 & 112) == 32) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    Object jade = c0585q.jade();
                                    if (z10 || jade == asVar) {
                                        jade = new Lb.ae(str, 7);
                                        c0585q.f(jade);
                                    }
                                    sVar4 = A0.o.bravo(sVar4, false, (Function1) jade);
                                    c0585q.quebec(false);
                                } else {
                                    c0585q.purple(1899393602);
                                    c0585q.quebec(false);
                                }
                                T.s delta = androidx.compose.ui.draw.a.delta(AbstractC3087z.bravo(sVar2.then(sVar4)), abstractC1680b, fVar4, interfaceC2392k3, f10, c0360n3, 2);
                                Object jade2 = c0585q.jade();
                                if (jade2 == asVar) {
                                    jade2 = b.C.alpha;
                                    c0585q.f(jade2);
                                }
                                q0.ap apVar = (q0.ap) jade2;
                                long j5 = c0585q.magenta;
                                int i25 = (int) (j5 ^ (j5 >>> 32));
                                T.s charlie = T.a.charlie(delta, c0585q);
                                androidx.compose.runtime.I mike = c0585q.mike();
                                InterfaceC2552l.maroon.getClass();
                                C2550j c2550j = C2551k.bravo;
                                c0585q.white();
                                if (c0585q.lime) {
                                    c0585q.lima(c2550j);
                                } else {
                                    c0585q.i();
                                }
                                C0564b.blue(C2551k.foxtrot, c0585q, apVar);
                                C0564b.blue(C2551k.echo, c0585q, mike);
                                C0564b.blue(C2551k.delta, c0585q, charlie);
                                C2549i c2549i = C2551k.golf;
                                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i25))) {
                                    ao.ad.blue(i25, c0585q, i25, c2549i);
                                }
                                c0585q.quebec(true);
                                sVar3 = sVar2;
                                fVar3 = fVar4;
                                interfaceC2392k2 = interfaceC2392k3;
                                c0360n2 = c0360n3;
                            } else {
                                c0585q.ochre();
                                sVar3 = sVar2;
                                fVar3 = fVar2;
                                interfaceC2392k2 = interfaceC2392k;
                                c0360n2 = c0360n;
                            }
                            final float f11 = f10;
                            uniform = c0585q.uniform();
                            if (uniform == null) {
                                uniform.delta = new Xd.l() { // from class: b.B
                                    @Override // Xd.l
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int cyan = C0564b.cyan(i4 | 1);
                                        C0360n c0360n4 = c0360n2;
                                        W3.alpha(AbstractC1680b.this, str, sVar3, fVar3, interfaceC2392k2, f11, c0360n4, (InterfaceC0581m) obj, cyan, i5);
                                        return Unit.INSTANCE;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i20 = i10;
                        if ((i10 & 599187) == 599186) {
                        }
                        if (!c0585q.magenta(i20 & 1, z2)) {
                        }
                        final float f112 = f10;
                        uniform = c0585q.uniform();
                        if (uniform == null) {
                        }
                    }
                    f10 = f5;
                    i18 = i5 & 64;
                    if (i18 != 0) {
                    }
                    i20 = i10;
                    if ((i10 & 599187) == 599186) {
                    }
                    if (!c0585q.magenta(i20 & 1, z2)) {
                    }
                    final float f1122 = f10;
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                    }
                }
                i16 = i5 & 32;
                if (i16 == 0) {
                }
                f10 = f5;
                i18 = i5 & 64;
                if (i18 != 0) {
                }
                i20 = i10;
                if ((i10 & 599187) == 599186) {
                }
                if (!c0585q.magenta(i20 & 1, z2)) {
                }
                final float f11222 = f10;
                uniform = c0585q.uniform();
                if (uniform == null) {
                }
            }
            fVar2 = fVar;
            i14 = i5 & 16;
            if (i14 != 0) {
            }
            i16 = i5 & 32;
            if (i16 == 0) {
            }
            f10 = f5;
            i18 = i5 & 64;
            if (i18 != 0) {
            }
            i20 = i10;
            if ((i10 & 599187) == 599186) {
            }
            if (!c0585q.magenta(i20 & 1, z2)) {
            }
            final float f112222 = f10;
            uniform = c0585q.uniform();
            if (uniform == null) {
            }
        }
        sVar2 = sVar;
        i12 = i5 & 8;
        if (i12 == 0) {
        }
        fVar2 = fVar;
        i14 = i5 & 16;
        if (i14 != 0) {
        }
        i16 = i5 & 32;
        if (i16 == 0) {
        }
        f10 = f5;
        i18 = i5 & 64;
        if (i18 != 0) {
        }
        i20 = i10;
        if ((i10 & 599187) == 599186) {
        }
        if (!c0585q.magenta(i20 & 1, z2)) {
        }
        final float f1122222 = f10;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void bravo(final String str, final String str2, final D0.an anVar, final long j5, final D0.an anVar2, final long j6, final T.s sVar, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        D0.an anVar3;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1348995386);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i5 = i16 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(str2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i5 |= i15;
        }
        if ((i4 & 384) == 0) {
            anVar3 = anVar;
            if (c0585q.golf(anVar3)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i5 |= i14;
        } else {
            anVar3 = anVar;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.foxtrot(j5)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i13;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.golf(anVar2)) {
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i12 = 8192;
            }
            i5 |= i12;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.foxtrot(j6)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q.golf(sVar)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i5 |= i10;
        }
        if ((599187 & i5) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf, T.d.f2061d, c0585q, 54);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(sVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            int i17 = i5;
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            int i18 = i17 >> 3;
            F.G2.bravo(str, null, j5, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar3, c0585q, (i17 & 14) | (i18 & 896), (i17 << 12) & 3670016, 65530);
            F.G2.bravo(str2, null, j6, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar2, c0585q, (i18 & 14) | ((i17 >> 9) & 896), (i17 << 6) & 3670016, 65530);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: zb.j
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    String str3 = str2;
                    long j7 = j6;
                    s sVar2 = sVar;
                    W3.bravo(str, str3, anVar, j5, anVar2, j7, sVar2, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void charlie(final String statusLabel, final String statusValue, final String shiftStartsTimeLabel, final String str, final String shiftDateLabel, final String str2, final T.s sVar, C2093f c2093f, long j5, long j6, long j7, float f5, long j10, D0.an anVar, long j11, D0.an anVar2, long j12, D0.an anVar3, long j13, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        long j14;
        C0585q c0585q;
        final C2093f c2093f2;
        final long j15;
        final float f10;
        final long j16;
        final D0.an anVar4;
        final long j17;
        final D0.an anVar5;
        final long j18;
        final D0.an anVar6;
        final long j19;
        final long j20;
        final long j21;
        float f11;
        long charlie;
        long delta;
        long j22;
        long j23;
        int i11;
        long j24;
        D0.an anVar7;
        D0.an anVar8;
        D0.an anVar9;
        long j25;
        long j26;
        int i12;
        Intrinsics.echo(statusLabel, "statusLabel");
        Intrinsics.echo(statusValue, "statusValue");
        Intrinsics.echo(shiftStartsTimeLabel, "shiftStartsTimeLabel");
        Intrinsics.echo(shiftDateLabel, "shiftDateLabel");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1168194623);
        if ((i4 & 6) == 0) {
            i10 = (c0585q2.golf(statusLabel) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= c0585q2.golf(statusValue) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= c0585q2.golf(shiftStartsTimeLabel) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i10 |= c0585q2.golf(str) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i10 |= c0585q2.golf(shiftDateLabel) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i10 |= c0585q2.golf(str2) ? 131072 : 65536;
        }
        int i13 = i10 | 4194304;
        if ((100663296 & i4) == 0) {
            if ((i5 & Barcode.FORMAT_QR_CODE) == 0) {
                j14 = j5;
                if (c0585q2.foxtrot(j14)) {
                    i12 = 67108864;
                    i13 |= i12;
                }
            } else {
                j14 = j5;
            }
            i12 = 33554432;
            i13 |= i12;
        } else {
            j14 = j5;
        }
        int i14 = i13 | 268435456;
        if (c0585q2.magenta(i14 & 1, (306783379 & i14) != 306783378)) {
            c0585q2.orange();
            if ((i4 & 1) != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
                int i15 = i14 & (-29360129);
                if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
                    i15 = i14 & (-264241153);
                }
                int i16 = i15 & (-1879048193);
                j26 = j7;
                f11 = f5;
                charlie = j10;
                anVar9 = anVar;
                j25 = j11;
                anVar7 = anVar2;
                j22 = j12;
                anVar8 = anVar3;
                delta = j13;
                i11 = i16;
                j23 = j14;
                j24 = j6;
            } else {
                C2093f bravo = AbstractC2094g.bravo(24);
                int i17 = i14 & (-29360129);
                if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
                    j14 = ((F.O) c0585q2.kilo(F.Q.alpha)).papa;
                    i17 = i14 & (-264241153);
                }
                androidx.compose.runtime.E0 e02 = F.Q.alpha;
                long bravo2 = C0366t.bravo(0.5f, ((F.O) c0585q2.kilo(e02)).azure);
                c2093f = bravo;
                long bravo3 = C0366t.bravo(0.4f, ((F.O) c0585q2.kilo(e02)).azure);
                f11 = 44;
                charlie = a0.ao.charlie(251658240);
                long charlie2 = AbstractC2636d7.charlie(12);
                H0.v vVar = new H0.v(HttpConstants.HTTP_BLOCKED);
                androidx.compose.runtime.E0 e03 = F.T2.alpha;
                D0.an anVar10 = new D0.an(0L, charlie2, vVar, null, ((F.S2) c0585q2.kilo(e03)).delta.alpha.foxtrot, 0L, 0, 0L, 0, 16777177);
                long j27 = ((F.O) c0585q2.kilo(e02)).sierra;
                D0.an anVar11 = new D0.an(0L, AbstractC2636d7.charlie(13), new H0.v(900), null, ((F.S2) c0585q2.kilo(e03)).delta.alpha.foxtrot, 0L, 0, 0L, 0, 16777177);
                long j28 = ((F.O) c0585q2.kilo(e02)).quebec;
                D0.an anVar12 = new D0.an(0L, AbstractC2636d7.charlie(13), new H0.v(900), null, ((F.S2) c0585q2.kilo(e03)).delta.alpha.foxtrot, 0L, 0, 0L, 0, 16777177);
                delta = a0.ao.delta(4294937149L);
                j22 = j28;
                j23 = j14;
                i11 = i17 & (-1879048193);
                j24 = bravo2;
                anVar7 = anVar11;
                anVar8 = anVar12;
                anVar9 = anVar10;
                j25 = j27;
                j26 = bravo3;
            }
            C2093f c2093f3 = c2093f;
            c0585q2.romeo();
            float f12 = f11;
            long j29 = charlie;
            float f13 = 1;
            long j30 = j23;
            T.s tango = AbstractC0538d.tango(androidx.compose.foundation.a.bravo(R3.charlie(ac.alpha(sVar, f12, c2093f3, j29, charlie, 4), f13, j24, c2093f3), j23, c2093f3), 24, 18);
            q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
            int romeo = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie3 = T.a.charlie(tango, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            D0.an anVar13 = anVar9;
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q2, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q2, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q2, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie3);
            T.p pVar = T.p.alpha;
            T.s charlie4 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
            long j31 = j24;
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
            int romeo2 = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike2 = c0585q2.mike();
            T.s charlie5 = T.a.charlie(charlie4, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q2, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie5);
            T.s charlie6 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
            T.j jVar = T.d.f2061d;
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf, jVar, c0585q2, 54);
            int romeo3 = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike3 = c0585q2.mike();
            T.s charlie7 = T.a.charlie(charlie6, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha2);
            C0564b.blue(c2549i2, c0585q2, mike3);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo3))) {
                ao.ad.blue(romeo3, c0585q2, romeo3, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie7);
            long j32 = j25;
            F.G2.bravo(statusLabel, null, j32, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar13, c0585q2, i11 & 14, 0, 65530);
            D0.an anVar14 = anVar8;
            long j33 = delta;
            F.G2.bravo(statusValue, null, j33, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar14, c0585q2, ((i11 >> 3) & 14) | 384, 0, 65530);
            c0585q = c0585q2;
            c0585q.quebec(true);
            float f14 = 14;
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, f14), c0585q);
            long j34 = j26;
            F.K1.echo(null, f13, j34, c0585q, 48, 1);
            T.s hotel = com.google.android.material.datepicker.j.hotel(pVar, f14, c0585q, pVar, 1.0f);
            androidx.compose.foundation.layout.S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 48);
            int romeo4 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike4 = c0585q.mike();
            T.s charlie8 = T.a.charlie(hotel, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo4))) {
                ao.ad.blue(romeo4, c0585q, romeo4, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie8);
            D0.an anVar15 = anVar7;
            long j35 = j22;
            bravo(shiftStartsTimeLabel, str, anVar13, j32, anVar15, j35, androidx.appcompat.widget.P0.maroon(1.0f), c0585q, (i11 >> 6) & 126);
            float f15 = 12;
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.oscar(pVar, f15), c0585q);
            AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.oscar(pVar, f13), 26), j34, a0.ao.alpha), c0585q, 0);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.oscar(pVar, f15), c0585q);
            bravo(shiftDateLabel, str2, anVar13, j32, anVar15, j35, androidx.appcompat.widget.P0.maroon(1.0f), c0585q, (i11 >> 12) & 126);
            A0.z.papa(c0585q, true, true, true);
            j19 = j33;
            j15 = j34;
            anVar6 = anVar14;
            anVar5 = anVar15;
            f10 = f12;
            j16 = j29;
            anVar4 = anVar13;
            j17 = j32;
            c2093f2 = c2093f3;
            j18 = j35;
            j21 = j31;
            j20 = j30;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            c2093f2 = c2093f;
            j15 = j7;
            f10 = f5;
            j16 = j10;
            anVar4 = anVar;
            j17 = j11;
            anVar5 = anVar2;
            j18 = j12;
            anVar6 = anVar3;
            j19 = j13;
            j20 = j14;
            j21 = j6;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: zb.i
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    String str3 = str;
                    String str4 = str2;
                    long j36 = j19;
                    int i18 = i5;
                    W3.charlie(statusLabel, statusValue, shiftStartsTimeLabel, str3, shiftDateLabel, str4, sVar, c2093f2, j20, j21, j15, f10, j16, anVar4, j17, anVar5, j18, anVar6, j36, (InterfaceC0581m) obj, cyan, i18);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
