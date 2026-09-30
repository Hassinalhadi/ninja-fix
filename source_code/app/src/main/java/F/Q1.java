package F;

import androidx.compose.foundation.layout.C0535a;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2;
import q0.AbstractC2375K;
import t0.AbstractC2911e0;

/* loaded from: classes3.dex */
public abstract class Q1 {
    public static final float alpha = 16;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(T.s sVar, P.d dVar, P.d dVar2, P.d dVar3, P.d dVar4, int i4, long j5, long j6, C0535a c0535a, P.d dVar5, InterfaceC0581m interfaceC0581m, int i5, int i10) {
        T.s sVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        P.d dVar6;
        int i15;
        int i16;
        int i17;
        P.d dVar7;
        int i18;
        int i19;
        int i20;
        int i21;
        P.d dVar8;
        P.d dVar9;
        int i22;
        P.d dVar10;
        P.d dVar11;
        P.d dVar12;
        P.d dVar13;
        int i23;
        long j7;
        int i24;
        C0535a c0535a2;
        T.s sVar3;
        int i25;
        boolean z2;
        Object jade;
        boolean z10;
        boolean z11;
        Object jade2;
        C0585q c0585q;
        T.s sVar4;
        C0535a c0535a3;
        int i26;
        P.d dVar14;
        P.d dVar15;
        long j10;
        P.d dVar16;
        P.d dVar17;
        androidx.compose.runtime.Q uniform;
        int i27;
        int i28;
        int i29;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1219521777);
        int i30 = i10 & 1;
        if (i30 != 0) {
            i11 = i5 | 6;
            sVar2 = sVar;
        } else if ((i5 & 6) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i5;
        } else {
            sVar2 = sVar;
            i11 = i5;
        }
        int i31 = i10 & 2;
        if (i31 != 0) {
            i11 |= 48;
        } else if ((i5 & 48) == 0) {
            if (c0585q2.india(dVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
            i14 = 4 & i10;
            if (i14 == 0) {
                i11 |= 384;
                dVar6 = dVar2;
            } else if ((i5 & 384) == 0) {
                dVar6 = dVar2;
                if (c0585q2.india(dVar6)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i11 |= i15;
            } else {
                dVar6 = dVar2;
            }
            i16 = i11 | 3072;
            i17 = i10 & 16;
            if (i17 == 0) {
                i16 = i11 | 27648;
            } else if ((i5 & 24576) == 0) {
                dVar7 = dVar4;
                if (c0585q2.india(dVar7)) {
                    i18 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
                i19 = i10 & 32;
                if (i19 != 0) {
                    i16 |= 196608;
                    i20 = i4;
                } else {
                    i20 = i4;
                    if ((i5 & 196608) == 0) {
                        if (c0585q2.echo(i20)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i16 |= i21;
                    }
                }
                if ((i5 & 1572864) == 0) {
                    if (c0585q2.foxtrot(j5)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i16 |= i29;
                }
                if ((i5 & 12582912) == 0) {
                    i16 |= 4194304;
                }
                if ((i5 & 100663296) == 0) {
                    if ((i10 & Barcode.FORMAT_QR_CODE) == 0 && c0585q2.golf(c0535a)) {
                        i28 = 67108864;
                        i16 |= i28;
                    }
                    i28 = 33554432;
                    i16 |= i28;
                }
                if ((i5 & 805306368) == 0) {
                    if (c0585q2.india(dVar5)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i16 |= i27;
                }
                if ((i16 & 306783379) != 306783378 && c0585q2.bronze()) {
                    c0585q2.ochre();
                    dVar14 = dVar;
                    dVar15 = dVar6;
                    i26 = i20;
                    c0585q = c0585q2;
                    sVar4 = sVar2;
                    dVar17 = dVar7;
                    dVar16 = dVar3;
                    j10 = j6;
                    c0535a3 = c0535a;
                } else {
                    c0585q2.orange();
                    if ((i5 & 1) == 0 && !c0585q2.beige()) {
                        c0585q2.ochre();
                        int i32 = i16 & (-29360129);
                        if ((256 & i10) != 0) {
                            i32 = i16 & (-264241153);
                        }
                        dVar10 = dVar;
                        dVar12 = dVar3;
                        i23 = i32;
                        dVar11 = dVar6;
                        i24 = i20;
                        sVar3 = sVar2;
                        dVar13 = dVar7;
                        j7 = j6;
                        c0535a2 = c0535a;
                    } else {
                        if (i30 != 0) {
                            sVar2 = T.p.alpha;
                        }
                        if (i31 != 0) {
                            dVar8 = X.alpha;
                        } else {
                            dVar8 = dVar;
                        }
                        if (i14 != 0) {
                            dVar6 = X.bravo;
                        }
                        P.d dVar18 = X.charlie;
                        if (i17 != 0) {
                            dVar9 = X.delta;
                        } else {
                            dVar9 = dVar7;
                        }
                        if (i19 != 0) {
                            i22 = 2;
                        } else {
                            i22 = i20;
                        }
                        long bravo = Q.bravo(j5, c0585q2);
                        int i33 = i16 & (-29360129);
                        if ((256 & i10) != 0) {
                            WeakHashMap weakHashMap = androidx.compose.foundation.layout.b0.whiskey;
                            i23 = (-264241153) & i16;
                            dVar10 = dVar8;
                            dVar11 = dVar6;
                            dVar12 = dVar18;
                            c0535a2 = C0537c.foxtrot(c0585q2).golf;
                            dVar13 = dVar9;
                            j7 = bravo;
                            i24 = i22;
                        } else {
                            dVar10 = dVar8;
                            dVar11 = dVar6;
                            dVar12 = dVar18;
                            dVar13 = dVar9;
                            i23 = i33;
                            j7 = bravo;
                            i24 = i22;
                            c0535a2 = c0535a;
                        }
                        sVar3 = sVar2;
                    }
                    c0585q2.romeo();
                    i25 = (234881024 & i23) ^ 100663296;
                    if ((i25 <= 67108864 && c0585q2.golf(c0535a2)) || (i23 & 100663296) == 67108864) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jade = c0585q2.jade();
                    androidx.compose.runtime.as asVar = C0580l.alpha;
                    if (!z2 || jade == asVar) {
                        jade = new androidx.compose.material3.internal.ag(c0535a2);
                        c0585q2.f(jade);
                    }
                    androidx.compose.material3.internal.ag agVar = (androidx.compose.material3.internal.ag) jade;
                    boolean golf = c0585q2.golf(agVar);
                    if ((i25 <= 67108864 && c0585q2.golf(c0535a2)) || (i23 & 100663296) == 67108864) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z10 | golf;
                    jade2 = c0585q2.jade();
                    if (!z11 || jade2 == asVar) {
                        jade2 = new B2.ap(8, agVar, c0535a2);
                        c0585q2.f(jade2);
                    }
                    int i34 = ((i23 >> 12) & 896) | 12582912;
                    C0535a c0535a4 = c0535a2;
                    AbstractC0127k2.alpha(T.a.alpha(sVar3, AbstractC2911e0.alpha, new androidx.compose.foundation.layout.c0(0, (Function1) jade2)), null, j5, j7, 0.0f, 0.0f, null, P.e.echo(-1979205334, new N1(i24, dVar10, dVar5, dVar12, dVar13, agVar, dVar11), c0585q2), c0585q2, i34, 114);
                    c0585q = c0585q2;
                    sVar4 = sVar3;
                    c0535a3 = c0535a4;
                    i26 = i24;
                    dVar14 = dVar10;
                    dVar15 = dVar11;
                    j10 = j7;
                    dVar16 = dVar12;
                    dVar17 = dVar13;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new O1(sVar4, dVar14, dVar15, dVar16, dVar17, i26, j5, j10, c0535a3, dVar5, i5, i10);
                    return;
                }
                return;
            }
            dVar7 = dVar4;
            i19 = i10 & 32;
            if (i19 != 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if ((i5 & 100663296) == 0) {
            }
            if ((i5 & 805306368) == 0) {
            }
            if ((i16 & 306783379) != 306783378) {
            }
            c0585q2.orange();
            if ((i5 & 1) == 0) {
            }
            if (i30 != 0) {
            }
            if (i31 != 0) {
            }
            if (i14 != 0) {
            }
            P.d dVar182 = X.charlie;
            if (i17 != 0) {
            }
            if (i19 != 0) {
            }
            long bravo2 = Q.bravo(j5, c0585q2);
            int i332 = i16 & (-29360129);
            if ((256 & i10) != 0) {
            }
            sVar3 = sVar2;
            c0585q2.romeo();
            i25 = (234881024 & i23) ^ 100663296;
            if (i25 <= 67108864) {
            }
            z2 = false;
            jade = c0585q2.jade();
            androidx.compose.runtime.as asVar2 = C0580l.alpha;
            if (!z2) {
            }
            jade = new androidx.compose.material3.internal.ag(c0535a2);
            c0585q2.f(jade);
            androidx.compose.material3.internal.ag agVar2 = (androidx.compose.material3.internal.ag) jade;
            boolean golf2 = c0585q2.golf(agVar2);
            if (i25 <= 67108864) {
            }
            z10 = false;
            z11 = z10 | golf2;
            jade2 = c0585q2.jade();
            if (!z11) {
            }
            jade2 = new B2.ap(8, agVar2, c0535a2);
            c0585q2.f(jade2);
            int i342 = ((i23 >> 12) & 896) | 12582912;
            C0535a c0535a42 = c0535a2;
            AbstractC0127k2.alpha(T.a.alpha(sVar3, AbstractC2911e0.alpha, new androidx.compose.foundation.layout.c0(0, (Function1) jade2)), null, j5, j7, 0.0f, 0.0f, null, P.e.echo(-1979205334, new N1(i24, dVar10, dVar5, dVar12, dVar13, agVar2, dVar11), c0585q2), c0585q2, i342, 114);
            c0585q = c0585q2;
            sVar4 = sVar3;
            c0535a3 = c0535a42;
            i26 = i24;
            dVar14 = dVar10;
            dVar15 = dVar11;
            j10 = j7;
            dVar16 = dVar12;
            dVar17 = dVar13;
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        i14 = 4 & i10;
        if (i14 == 0) {
        }
        i16 = i11 | 3072;
        i17 = i10 & 16;
        if (i17 == 0) {
        }
        dVar7 = dVar4;
        i19 = i10 & 32;
        if (i19 != 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if ((i5 & 100663296) == 0) {
        }
        if ((i5 & 805306368) == 0) {
        }
        if ((i16 & 306783379) != 306783378) {
        }
        c0585q2.orange();
        if ((i5 & 1) == 0) {
        }
        if (i30 != 0) {
        }
        if (i31 != 0) {
        }
        if (i14 != 0) {
        }
        P.d dVar1822 = X.charlie;
        if (i17 != 0) {
        }
        if (i19 != 0) {
        }
        long bravo22 = Q.bravo(j5, c0585q2);
        int i3322 = i16 & (-29360129);
        if ((256 & i10) != 0) {
        }
        sVar3 = sVar2;
        c0585q2.romeo();
        i25 = (234881024 & i23) ^ 100663296;
        if (i25 <= 67108864) {
        }
        z2 = false;
        jade = c0585q2.jade();
        androidx.compose.runtime.as asVar22 = C0580l.alpha;
        if (!z2) {
        }
        jade = new androidx.compose.material3.internal.ag(c0535a2);
        c0585q2.f(jade);
        androidx.compose.material3.internal.ag agVar22 = (androidx.compose.material3.internal.ag) jade;
        boolean golf22 = c0585q2.golf(agVar22);
        if (i25 <= 67108864) {
        }
        z10 = false;
        z11 = z10 | golf22;
        jade2 = c0585q2.jade();
        if (!z11) {
        }
        jade2 = new B2.ap(8, agVar22, c0535a2);
        c0585q2.f(jade2);
        int i3422 = ((i23 >> 12) & 896) | 12582912;
        C0535a c0535a422 = c0535a2;
        AbstractC0127k2.alpha(T.a.alpha(sVar3, AbstractC2911e0.alpha, new androidx.compose.foundation.layout.c0(0, (Function1) jade2)), null, j5, j7, 0.0f, 0.0f, null, P.e.echo(-1979205334, new N1(i24, dVar10, dVar5, dVar12, dVar13, agVar22, dVar11), c0585q2), c0585q2, i3422, 114);
        c0585q = c0585q2;
        sVar4 = sVar3;
        c0535a3 = c0535a422;
        i26 = i24;
        dVar14 = dVar10;
        dVar15 = dVar11;
        j10 = j7;
        dVar16 = dVar12;
        dVar17 = dVar13;
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void bravo(int i4, P.d dVar, P.d dVar2, P.d dVar3, P.d dVar4, androidx.compose.foundation.layout.a0 a0Var, P.d dVar5, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        P.d dVar6;
        androidx.compose.foundation.layout.a0 a0Var2;
        P.d dVar7;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-975511942);
        if ((i5 & 6) == 0) {
            if (c0585q.echo(i4)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i10 = i17 | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q.india(dVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i10 |= i16;
        }
        if ((i5 & 384) == 0) {
            dVar6 = dVar2;
            if (c0585q.india(dVar6)) {
                i15 = Barcode.FORMAT_QR_CODE;
            } else {
                i15 = 128;
            }
            i10 |= i15;
        } else {
            dVar6 = dVar2;
        }
        if ((i5 & 3072) == 0) {
            if (c0585q.india(dVar3)) {
                i14 = 2048;
            } else {
                i14 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i14;
        }
        if ((i5 & 24576) == 0) {
            if (c0585q.india(dVar4)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i10 |= i13;
        }
        if ((196608 & i5) == 0) {
            a0Var2 = a0Var;
            if (c0585q.golf(a0Var2)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i10 |= i12;
        } else {
            a0Var2 = a0Var;
        }
        if ((1572864 & i5) == 0) {
            dVar7 = dVar5;
            if (c0585q.india(dVar7)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i10 |= i11;
        } else {
            dVar7 = dVar5;
        }
        if ((i10 & 599187) == 599186 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            if ((i10 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i10 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z16 = z2 | z10;
            if ((458752 & i10) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z17 = z16 | z11;
            if ((57344 & i10) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z18 = z17 | z12;
            if ((i10 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = z18 | z13;
            if ((3670016 & i10) == 1048576) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z20 = z19 | z14;
            if ((i10 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z21 = z15 | z20;
            Object jade = c0585q.jade();
            if (z21 || jade == C0580l.alpha) {
                N1 n1 = new N1(dVar, dVar3, dVar4, i4, a0Var2, dVar7, dVar6);
                c0585q.f(n1);
                jade = n1;
            }
            AbstractC2375K.alpha(null, (Xd.l) jade, c0585q, 0, 1);
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new av(i4, dVar, dVar2, dVar3, dVar4, a0Var, dVar5, i5);
        }
    }
}
