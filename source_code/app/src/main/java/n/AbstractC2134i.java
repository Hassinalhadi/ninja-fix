package n;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s6.Z6;

/* renamed from: n.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2134i {
    static {
        float f5 = 40;
        Z6.alpha(f5, f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(final String str, final Function1 function1, final T.s sVar, boolean z2, boolean z10, final D0.an anVar, final aw awVar, av avVar, final boolean z11, int i4, int i5, I0.aj ajVar, Function1 function12, InterfaceC1673j interfaceC1673j, final a0.au auVar, P.d dVar, InterfaceC0581m interfaceC0581m, final int i10, final int i11, final int i12) {
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        final av avVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        C0585q c0585q;
        final int i26;
        final Function1 function13;
        final InterfaceC1673j interfaceC1673j2;
        final P.d dVar2;
        final boolean z14;
        final boolean z15;
        final int i27;
        final I0.aj ajVar2;
        androidx.compose.runtime.Q uniform;
        int i28;
        int i29;
        I0.aj ajVar3;
        av avVar3;
        av avVar4;
        P.d dVar3;
        Function1 function14;
        InterfaceC1673j interfaceC1673j3;
        int i30;
        boolean z16;
        boolean z17;
        int i31;
        int i32;
        int i33;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(2026950908);
        if ((i10 & 6) == 0) {
            i13 = (c0585q2.golf(str) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= c0585q2.india(function1) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= c0585q2.golf(sVar) ? Barcode.FORMAT_QR_CODE : 128;
        }
        int i34 = i12 & 8;
        int i35 = Barcode.FORMAT_UPC_E;
        if (i34 != 0) {
            i13 |= 3072;
        } else if ((i10 & 3072) == 0) {
            z12 = z2;
            i13 |= c0585q2.hotel(z12) ? 2048 : 1024;
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i10 & 24576) == 0) {
                z13 = z10;
                i13 |= c0585q2.hotel(z13) ? 16384 : 8192;
                if ((i10 & 196608) == 0) {
                    i13 |= c0585q2.golf(anVar) ? 131072 : 65536;
                }
                if ((i10 & 1572864) == 0) {
                    i13 |= c0585q2.golf(awVar) ? 1048576 : 524288;
                }
                i15 = i12 & 128;
                if (i15 != 0) {
                    i13 |= 12582912;
                    avVar2 = avVar;
                } else {
                    avVar2 = avVar;
                    if ((i10 & 12582912) == 0) {
                        i13 |= c0585q2.golf(avVar2) ? 8388608 : 4194304;
                    }
                }
                if ((i10 & 100663296) == 0) {
                    i13 |= c0585q2.hotel(z11) ? 67108864 : 33554432;
                }
                if ((i10 & 805306368) == 0) {
                    if ((i12 & 512) == 0 && c0585q2.echo(i4)) {
                        i33 = 536870912;
                        i13 |= i33;
                    }
                    i33 = 268435456;
                    i13 |= i33;
                }
                i16 = i12 & Barcode.FORMAT_UPC_E;
                if (i16 != 0) {
                    i18 = i11 | 6;
                    i17 = i16;
                } else {
                    i17 = i16;
                    i18 = i11 | (c0585q2.echo(i5) ? 4 : 2);
                }
                i19 = i12 & 2048;
                if (i19 != 0) {
                    i21 = i18 | 48;
                    i20 = i19;
                } else {
                    i20 = i19;
                    i21 = i18 | (c0585q2.golf(ajVar) ? 32 : 16);
                }
                int i36 = i21;
                i22 = i13;
                int i37 = i36 | 384;
                i23 = i12 & 8192;
                if (i23 != 0) {
                    i24 = i36 | 3456;
                } else {
                    if (c0585q2.golf(interfaceC1673j)) {
                        i35 = 2048;
                    }
                    i24 = i37 | i35;
                }
                if ((i11 & 24576) == 0) {
                    i24 |= c0585q2.golf(auVar) ? 16384 : 8192;
                }
                i25 = i12 & 32768;
                if (i25 != 0) {
                    i24 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    i24 |= c0585q2.india(dVar) ? 131072 : 65536;
                }
                if (c0585q2.magenta(i22 & 1, (i22 & 306783379) == 306783378 || (i24 & 74899) != 74898)) {
                    c0585q2.orange();
                    int i38 = i10 & 1;
                    Object obj = C0580l.alpha;
                    if (i38 != 0 && !c0585q2.beige()) {
                        c0585q2.ochre();
                        if ((i12 & 512) != 0) {
                            i31 = i5;
                            ajVar3 = ajVar;
                            function14 = function12;
                            interfaceC1673j3 = interfaceC1673j;
                            dVar3 = dVar;
                            i29 = i22 & (-1879048193);
                            avVar4 = avVar2;
                            z16 = z12;
                            z17 = z13;
                            i32 = 32;
                            i30 = i4;
                        } else {
                            i30 = i4;
                            i31 = i5;
                            ajVar3 = ajVar;
                            function14 = function12;
                            interfaceC1673j3 = interfaceC1673j;
                            dVar3 = dVar;
                            z16 = z12;
                            z17 = z13;
                            i29 = i22;
                            i32 = 32;
                            avVar4 = avVar2;
                        }
                    } else {
                        if (i34 != 0) {
                            z12 = true;
                        }
                        if (i14 != 0) {
                            z13 = false;
                        }
                        av avVar5 = i15 != 0 ? av.bravo : avVar2;
                        if ((i12 & 512) != 0) {
                            i28 = z11 ? 1 : LottieConstants.IterateForever;
                            i29 = i22 & (-1879048193);
                        } else {
                            i28 = i4;
                            i29 = i22;
                        }
                        int i39 = i17 != 0 ? 1 : i5;
                        ajVar3 = i20 != 0 ? I0.ai.alpha : ajVar;
                        Object jade = c0585q2.jade();
                        if (jade == obj) {
                            avVar3 = avVar5;
                            jade = new kd.l(10);
                            c0585q2.f(jade);
                        } else {
                            avVar3 = avVar5;
                        }
                        Function1 function15 = (Function1) jade;
                        InterfaceC1673j interfaceC1673j4 = i23 != 0 ? null : interfaceC1673j;
                        if (i25 != 0) {
                            avVar4 = avVar3;
                            function14 = function15;
                            interfaceC1673j3 = interfaceC1673j4;
                            i30 = i28;
                            z16 = z12;
                            dVar3 = AbstractC2143s.alpha;
                        } else {
                            avVar4 = avVar3;
                            dVar3 = dVar;
                            function14 = function15;
                            interfaceC1673j3 = interfaceC1673j4;
                            i30 = i28;
                            z16 = z12;
                        }
                        z17 = z13;
                        i31 = i39;
                        i32 = 32;
                    }
                    c0585q2.romeo();
                    Object jade2 = c0585q2.jade();
                    if (jade2 == obj) {
                        jade2 = C0564b.zulu(new I0.aa(6, 0L, str));
                        c0585q2.f(jade2);
                    }
                    androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade2;
                    I0.aa aaVar = (I0.aa) axVar.getValue();
                    boolean z18 = z16;
                    I0.aa aaVar2 = new I0.aa(new D0.g(str), aaVar.bravo, aaVar.charlie);
                    boolean golf = c0585q2.golf(aaVar2);
                    Object jade3 = c0585q2.jade();
                    if (golf || jade3 == obj) {
                        jade3 = new Yb.F(22, aaVar2, axVar);
                        c0585q2.f(jade3);
                    }
                    C0564b.juliet((Function0) jade3, c0585q2);
                    boolean z19 = (i29 & 14) == 4;
                    Object jade4 = c0585q2.jade();
                    if (z19 || jade4 == obj) {
                        jade4 = C0564b.zulu(str);
                        c0585q2.f(jade4);
                    }
                    androidx.compose.runtime.ax axVar2 = (androidx.compose.runtime.ax) jade4;
                    awVar.getClass();
                    int i40 = awVar.alpha;
                    I0.m mVar = new I0.m(i40);
                    if (i40 == -1) {
                        mVar = null;
                    }
                    int i41 = mVar != null ? mVar.alpha : 0;
                    int i42 = awVar.bravo;
                    I0.n nVar = new I0.n(i42);
                    if (i42 == 0) {
                        nVar = null;
                    }
                    int i43 = nVar != null ? nVar.alpha : 1;
                    int i44 = awVar.charlie;
                    I0.k kVar = i44 == -1 ? null : new I0.k(i44);
                    int i45 = i29;
                    I0.l lVar = new I0.l(z11, i41, true, i43, kVar != null ? kVar.alpha : 1, K0.b.red);
                    int i46 = i24;
                    boolean z20 = !z11;
                    function13 = function14;
                    int i47 = z11 ? 1 : i31;
                    ajVar2 = ajVar3;
                    int i48 = z11 ? 1 : i30;
                    boolean golf2 = c0585q2.golf(axVar2) | ((i45 & 112) == i32);
                    Object jade5 = c0585q2.jade();
                    if (golf2 || jade5 == obj) {
                        jade5 = new Cb.ac(function1, axVar, axVar2);
                        c0585q2.f(jade5);
                    }
                    int i49 = i46 << 9;
                    int i50 = (i45 & 896) | ((i45 >> 6) & 7168) | (i49 & 57344) | 196608 | (3670016 & i49) | (i49 & 29360128);
                    int i51 = (i45 & 57344) | ((i45 >> 15) & 896) | (i45 & 7168) | (458752 & i46);
                    interfaceC1673j2 = interfaceC1673j3;
                    P.d dVar4 = dVar3;
                    c0585q = c0585q2;
                    at.golf(aaVar2, (Function1) jade5, sVar, anVar, ajVar2, function13, interfaceC1673j2, auVar, z20, i48, i47, lVar, avVar4, z18, z17, dVar4, c0585q, i50, i51);
                    i27 = i30;
                    avVar2 = avVar4;
                    z14 = z18;
                    z15 = z17;
                    dVar2 = dVar4;
                    i26 = i31;
                } else {
                    c0585q = c0585q2;
                    c0585q.ochre();
                    i26 = i5;
                    function13 = function12;
                    interfaceC1673j2 = interfaceC1673j;
                    dVar2 = dVar;
                    z14 = z12;
                    z15 = z13;
                    i27 = i4;
                    ajVar2 = ajVar;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new Xd.l() { // from class: n.h
                        @Override // Xd.l
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int cyan = C0564b.cyan(i10 | 1);
                            int cyan2 = C0564b.cyan(i11);
                            a0.au auVar2 = auVar;
                            P.d dVar5 = dVar2;
                            int i52 = i12;
                            AbstractC2134i.alpha(str, function1, sVar, z14, z15, anVar, awVar, avVar2, z11, i27, i26, ajVar2, function13, interfaceC1673j2, auVar2, dVar5, (InterfaceC0581m) obj2, cyan, cyan2, i52);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            z13 = z10;
            if ((i10 & 196608) == 0) {
            }
            if ((i10 & 1572864) == 0) {
            }
            i15 = i12 & 128;
            if (i15 != 0) {
            }
            if ((i10 & 100663296) == 0) {
            }
            if ((i10 & 805306368) == 0) {
            }
            i16 = i12 & Barcode.FORMAT_UPC_E;
            if (i16 != 0) {
            }
            i19 = i12 & 2048;
            if (i19 != 0) {
            }
            int i362 = i21;
            i22 = i13;
            int i372 = i362 | 384;
            i23 = i12 & 8192;
            if (i23 != 0) {
            }
            if ((i11 & 24576) == 0) {
            }
            i25 = i12 & 32768;
            if (i25 != 0) {
            }
            if (c0585q2.magenta(i22 & 1, (i22 & 306783379) == 306783378 || (i24 & 74899) != 74898)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        z12 = z2;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        z13 = z10;
        if ((i10 & 196608) == 0) {
        }
        if ((i10 & 1572864) == 0) {
        }
        i15 = i12 & 128;
        if (i15 != 0) {
        }
        if ((i10 & 100663296) == 0) {
        }
        if ((i10 & 805306368) == 0) {
        }
        i16 = i12 & Barcode.FORMAT_UPC_E;
        if (i16 != 0) {
        }
        i19 = i12 & 2048;
        if (i19 != 0) {
        }
        int i3622 = i21;
        i22 = i13;
        int i3722 = i3622 | 384;
        i23 = i12 & 8192;
        if (i23 != 0) {
        }
        if ((i11 & 24576) == 0) {
        }
        i25 = i12 & 32768;
        if (i25 != 0) {
        }
        if (c0585q2.magenta(i22 & 1, (i22 & 306783379) == 306783378 || (i24 & 74899) != 74898)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }
}
