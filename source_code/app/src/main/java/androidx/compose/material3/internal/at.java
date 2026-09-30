package androidx.compose.material3.internal;

import F.AbstractC0174x1;
import F.C0096d;
import F.C0143o2;
import F.C0164u0;
import F.S2;
import F.T2;
import F.Y;
import F.z2;
import a0.C0366t;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.ax;
import b0.AbstractC0713c;
import bx.F;
import bz.AbstractC0779d;
import bz.AbstractC0782g;
import bz.X;
import bz.a0;
import bz.e0;
import bz.g0;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import q0.InterfaceC2401t;
import s6.J0;
import t6.S3;

/* loaded from: classes3.dex */
public abstract class at {
    public static final float bravo;
    public static final float golf;
    public static final float hotel;
    public static final T.s india;
    public static final long alpha = Q0.b.alpha(0, 0, 0, 0);
    public static final float charlie = 12;
    public static final float delta = 4;
    public static final float echo = 2;
    public static final float foxtrot = 24;

    static {
        float f5 = 16;
        bravo = f5;
        golf = f5;
        hotel = f5;
        float f10 = 48;
        india = V.alpha(T.p.alpha, f10, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x0352, code lost:
    
        if (r30 != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0324, code lost:
    
        if (r30 != false) goto L214;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x040e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(au auVar, String str, Xd.l lVar, I0.aj ajVar, Xd.l lVar2, Xd.l lVar3, Xd.l lVar4, Xd.l lVar5, P.d dVar, boolean z2, boolean z10, boolean z11, InterfaceC1673j interfaceC1673j, M m4, C0143o2 c0143o2, P.d dVar2, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        z zVar;
        long j5;
        float f5;
        boolean z12;
        int ordinal;
        float f10;
        boolean z13;
        int ordinal2;
        float f11;
        boolean z14;
        int ordinal3;
        float f12;
        boolean z15;
        X charlie2;
        int ordinal4;
        float f13;
        boolean z16;
        int ordinal5;
        float f14;
        int[] iArr;
        boolean golf2;
        Object jade;
        z zVar2;
        long j6;
        boolean golf3;
        Object jade2;
        C0143o2 c0143o22;
        boolean z17;
        float f15;
        P.d echo2;
        long j7;
        Object jade3;
        Object jade4;
        long j10;
        long j11;
        long j12;
        int ordinal6;
        P.d dVar3;
        C0585q c0585q;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1514469103);
        if ((i4 & 6) == 0) {
            i10 = i4 | (c0585q2.golf(auVar) ? 4 : 2);
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= c0585q2.golf(str) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= c0585q2.india(lVar) ? 256 : 128;
        }
        int i12 = i4 & 3072;
        int i13 = Barcode.FORMAT_UPC_E;
        if (i12 == 0) {
            i10 |= c0585q2.golf(ajVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i10 |= c0585q2.india(lVar2) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i10 |= c0585q2.india(lVar3) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i10 |= c0585q2.india(lVar4) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i10 |= c0585q2.india(lVar5) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i10 |= c0585q2.india(null) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i10 |= c0585q2.india(null) ? 536870912 : 268435456;
        }
        int i14 = i10;
        if ((i5 & 6) == 0) {
            i11 = i5 | (c0585q2.india(dVar) ? 4 : 2);
        } else {
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            i11 |= c0585q2.hotel(z2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i11 |= c0585q2.hotel(z10) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            if (c0585q2.hotel(z11)) {
                i13 = 2048;
            }
            i11 |= i13;
        }
        if ((i5 & 24576) == 0) {
            i11 |= c0585q2.golf(interfaceC1673j) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i11 |= c0585q2.golf(m4) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i11 |= c0585q2.golf(c0143o2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i11 |= c0585q2.india(dVar2) ? 8388608 : 4194304;
        }
        int i15 = i11;
        if ((i14 & 306783379) == 306783378 && (i15 & 4793491) == 4793490 && c0585q2.bronze()) {
            c0585q2.ochre();
            dVar3 = dVar2;
            c0143o22 = c0143o2;
            c0585q = c0585q2;
        } else {
            boolean z18 = ((i14 & 112) == 32) | ((i14 & 7168) == 2048);
            Object jade5 = c0585q2.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (z18 || jade5 == asVar) {
                jade5 = ajVar.filter(new D0.g(str, null, null, 6));
                c0585q2.f(jade5);
            }
            String str2 = ((I0.ah) jade5).alpha.purple;
            boolean booleanValue = ((Boolean) J0.alpha(interfaceC1673j, c0585q2, (i15 >> 12) & 14).getValue()).booleanValue();
            if (booleanValue) {
                zVar = z.alpha;
            } else {
                zVar = str2.length() == 0 ? z.purple : z.red;
            }
            if (!z10) {
                j5 = c0143o2.zulu;
            } else if (z11) {
                j5 = c0143o2.amber;
            } else if (booleanValue) {
                j5 = c0143o2.xray;
            } else {
                j5 = c0143o2.yankee;
            }
            S2 s22 = (S2) c0585q2.kilo(T2.alpha);
            D0.an anVar = s22.juliet;
            long bravo2 = anVar.bravo();
            long j13 = C0366t.kilo;
            boolean charlie3 = C0366t.charlie(bravo2, j13);
            D0.an anVar2 = s22.lima;
            boolean z19 = (charlie3 && !C0366t.charlie(anVar2.bravo(), j13)) || (!C0366t.charlie(anVar.bravo(), j13) && C0366t.charlie(anVar2.bravo(), j13));
            long bravo3 = anVar2.bravo();
            if (z19 && bravo3 == 16) {
                bravo3 = j5;
            }
            long bravo4 = anVar.bravo();
            long j14 = (z19 && bravo4 == 16) ? j5 : bravo4;
            boolean z20 = lVar2 != null;
            long j15 = bravo3;
            a0 echo3 = e0.echo(zVar, "TextFieldInputState", c0585q2, 48, 0);
            g0 g0Var = AbstractC0779d.juliet;
            G3.a aVar = echo3.alpha;
            z zVar3 = (z) aVar.L();
            c0585q2.purple(-2036730335);
            int ordinal7 = zVar3.ordinal();
            if (ordinal7 != 0) {
                if (ordinal7 == 1) {
                    z12 = false;
                    f5 = 0.0f;
                    c0585q2.quebec(z12);
                    Float valueOf = Float.valueOf(f5);
                    z zVar4 = (z) echo3.golf();
                    c0585q2.purple(-2036730335);
                    ordinal = zVar4.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            z13 = false;
                            f10 = 0.0f;
                            c0585q2.quebec(z13);
                            X charlie4 = e0.charlie(echo3, valueOf, Float.valueOf(f10), (bz.aa) ar.red.invoke(echo3.foxtrot(), c0585q2, Integer.valueOf(z13 ? 1 : 0)), g0Var, c0585q2, 196608);
                            z zVar5 = (z) aVar.L();
                            c0585q2.purple(1435837472);
                            ordinal2 = zVar5.ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                z14 = false;
                                f11 = 0.0f;
                                c0585q2.quebec(z14);
                                Float valueOf2 = Float.valueOf(f11);
                                z zVar6 = (z) echo3.golf();
                                c0585q2.purple(1435837472);
                                ordinal3 = zVar6.ordinal();
                                if (ordinal3 != 0) {
                                    if (ordinal3 != 1) {
                                        if (ordinal3 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    z15 = false;
                                    f12 = 0.0f;
                                    c0585q2.quebec(z15);
                                    charlie2 = e0.charlie(echo3, valueOf2, Float.valueOf(f12), (bz.aa) ar.teal.invoke(echo3.foxtrot(), c0585q2, Integer.valueOf(z15 ? 1 : 0)), g0Var, c0585q2, 196608);
                                    z zVar7 = (z) aVar.L();
                                    c0585q2.purple(1128033978);
                                    ordinal4 = zVar7.ordinal();
                                    if (ordinal4 != 0) {
                                        if (ordinal4 != 1) {
                                            if (ordinal4 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        } else if (z20) {
                                            z16 = false;
                                            f13 = 0.0f;
                                            c0585q2.quebec(z16);
                                            Float valueOf3 = Float.valueOf(f13);
                                            z zVar8 = (z) echo3.golf();
                                            c0585q2.purple(1128033978);
                                            ordinal5 = zVar8.ordinal();
                                            if (ordinal5 != 0) {
                                                if (ordinal5 != 1) {
                                                    if (ordinal5 != 2) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                } else if (z20) {
                                                    f14 = 0.0f;
                                                    c0585q2.quebec(false);
                                                    X charlie5 = e0.charlie(echo3, valueOf3, Float.valueOf(f14), (bz.aa) ar.white.invoke(echo3.foxtrot(), c0585q2, 0), g0Var, c0585q2, 196608);
                                                    z zVar9 = (z) echo3.golf();
                                                    c0585q2.purple(-107432127);
                                                    iArr = as.$EnumSwitchMapping$1;
                                                    long j16 = iArr[zVar9.ordinal()] == 1 ? j15 : j14;
                                                    c0585q2.quebec(false);
                                                    AbstractC0713c foxtrot2 = C0366t.foxtrot(j16);
                                                    golf2 = c0585q2.golf(foxtrot2);
                                                    jade = c0585q2.jade();
                                                    if (!golf2 || jade == asVar) {
                                                        jade = (g0) bx.ad.alpha.invoke(foxtrot2);
                                                        c0585q2.f(jade);
                                                    }
                                                    g0 g0Var2 = (g0) jade;
                                                    zVar2 = (z) aVar.L();
                                                    c0585q2.purple(-107432127);
                                                    if (iArr[zVar2.ordinal()] == 1) {
                                                        j6 = j14;
                                                        j14 = j15;
                                                    } else {
                                                        j6 = j14;
                                                    }
                                                    c0585q2.quebec(false);
                                                    C0366t c0366t = new C0366t(j14);
                                                    z zVar10 = (z) echo3.golf();
                                                    c0585q2.purple(-107432127);
                                                    long j17 = iArr[zVar10.ordinal()] == 1 ? j15 : j6;
                                                    c0585q2.quebec(false);
                                                    X charlie6 = e0.charlie(echo3, c0366t, new C0366t(j17), (bz.aa) ar.silver.invoke(echo3.foxtrot(), c0585q2, 0), g0Var2, c0585q2, 196608);
                                                    c0585q2.purple(1023351670);
                                                    c0585q2.quebec(false);
                                                    AbstractC0713c foxtrot3 = C0366t.foxtrot(j5);
                                                    golf3 = c0585q2.golf(foxtrot3);
                                                    jade2 = c0585q2.jade();
                                                    if (!golf3 || jade2 == asVar) {
                                                        jade2 = (g0) bx.ad.alpha.invoke(foxtrot3);
                                                        c0585q2.f(jade2);
                                                    }
                                                    g0 g0Var3 = (g0) jade2;
                                                    c0585q2.purple(1023351670);
                                                    c0585q2.quebec(false);
                                                    C0366t c0366t2 = new C0366t(j5);
                                                    c0585q2.purple(1023351670);
                                                    c0585q2.quebec(false);
                                                    X charlie7 = e0.charlie(echo3, c0366t2, new C0366t(j5), (bz.aa) ar.purple.invoke(echo3.foxtrot(), c0585q2, 0), g0Var3, c0585q2, 196608);
                                                    float floatValue = ((Number) charlie4.getValue()).floatValue();
                                                    c0585q2.purple(-156998101);
                                                    if (lVar2 == null) {
                                                        c0143o22 = c0143o2;
                                                        z17 = false;
                                                        f15 = floatValue;
                                                        echo2 = null;
                                                    } else {
                                                        c0143o22 = c0143o2;
                                                        z17 = false;
                                                        al alVar = new al(anVar, anVar2, floatValue, charlie7, lVar2, z19, charlie6);
                                                        f15 = floatValue;
                                                        echo2 = P.e.echo(-1236585568, alVar, c0585q2);
                                                    }
                                                    c0585q2.quebec(z17);
                                                    if (z10) {
                                                        j7 = z11 ? c0143o22.blue : booleanValue ? c0143o22.azure : c0143o22.beige;
                                                    } else {
                                                        j7 = c0143o22.black;
                                                    }
                                                    long j18 = j7;
                                                    jade3 = c0585q2.jade();
                                                    if (jade3 == asVar) {
                                                        jade3 = C0564b.papa(androidx.compose.runtime.as.white, new ap(charlie2, 0));
                                                        c0585q2.f(jade3);
                                                    }
                                                    D0 d02 = (D0) jade3;
                                                    c0585q2.purple(-156965270);
                                                    P.d echo4 = (lVar3 == null && str2.length() == 0 && ((Boolean) d02.getValue()).booleanValue()) ? P.e.echo(-660524084, new ao(charlie2, j18, anVar, lVar3), c0585q2) : null;
                                                    c0585q2.quebec(z17);
                                                    jade4 = c0585q2.jade();
                                                    if (jade4 == asVar) {
                                                        jade4 = C0564b.papa(androidx.compose.runtime.as.white, new ap(charlie5, 1));
                                                        c0585q2.f(jade4);
                                                    }
                                                    c0585q2.purple(-156940524);
                                                    c0585q2.quebec(z17);
                                                    c0585q2.purple(-156921964);
                                                    c0585q2.quebec(z17);
                                                    if (z10) {
                                                        j10 = z11 ? c0143o22.sierra : booleanValue ? c0143o22.papa : c0143o22.quebec;
                                                    } else {
                                                        j10 = c0143o22.romeo;
                                                    }
                                                    c0585q2.purple(-156902962);
                                                    P.d echo5 = lVar4 == null ? null : P.e.echo(-130107406, new am(j10, lVar4, 0), c0585q2);
                                                    c0585q2.quebec(z17);
                                                    if (z10) {
                                                        j11 = z11 ? c0143o22.whiskey : booleanValue ? c0143o22.tango : c0143o22.uniform;
                                                    } else {
                                                        j11 = c0143o22.victor;
                                                    }
                                                    c0585q2.purple(-156893937);
                                                    P.d echo6 = lVar5 == null ? null : P.e.echo(2079816678, new am(j11, lVar5, 1), c0585q2);
                                                    c0585q2.quebec(z17);
                                                    if (z10) {
                                                        j12 = z11 ? c0143o22.cyan : booleanValue ? c0143o22.bronze : c0143o22.coral;
                                                    } else {
                                                        j12 = c0143o22.crimson;
                                                    }
                                                    long j19 = j12;
                                                    c0585q2.purple(-156884470);
                                                    P.d echo7 = dVar == null ? null : P.e.echo(1263707005, new F.aq(j19, anVar2, dVar, 1), c0585q2);
                                                    c0585q2.quebec(z17);
                                                    ordinal6 = auVar.ordinal();
                                                    if (ordinal6 == 0) {
                                                        dVar3 = dVar2;
                                                        c0585q = c0585q2;
                                                        c0585q.purple(-568105095);
                                                        z2.bravo(lVar, echo2, echo4, echo5, echo6, null, null, z2, f15, P.e.echo(1750327932, new C0096d(dVar3, 7, (byte) 0), c0585q), echo7, m4, c0585q, ((i14 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 9) & 896) | 6);
                                                        c0585q.quebec(z17);
                                                    } else if (ordinal6 != 1) {
                                                        c0585q2.purple(-565271199);
                                                        c0585q2.quebec(z17);
                                                        dVar3 = dVar2;
                                                        c0585q = c0585q2;
                                                    } else {
                                                        c0585q2.purple(-567018607);
                                                        Object jade6 = c0585q2.jade();
                                                        if (jade6 == asVar) {
                                                            jade6 = C0564b.zulu(new Z.e(0L));
                                                            c0585q2.f(jade6);
                                                        }
                                                        ax axVar = (ax) jade6;
                                                        dVar3 = dVar2;
                                                        P.d echo8 = P.e.echo(157291737, new C0164u0(axVar, m4, dVar3, 1), c0585q2);
                                                        boolean delta2 = c0585q2.delta(f15);
                                                        Object jade7 = c0585q2.jade();
                                                        if (delta2 || jade7 == asVar) {
                                                            jade7 = new aj(f15, axVar);
                                                            c0585q2.f(jade7);
                                                        }
                                                        AbstractC0174x1.bravo(lVar, echo4, echo2, echo5, echo6, null, null, z2, f15, (Function1) jade7, echo8, echo7, m4, c0585q2, ((i14 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
                                                        c0585q = c0585q2;
                                                        c0585q.quebec(z17);
                                                    }
                                                }
                                            }
                                            f14 = 1.0f;
                                            c0585q2.quebec(false);
                                            X charlie52 = e0.charlie(echo3, valueOf3, Float.valueOf(f14), (bz.aa) ar.white.invoke(echo3.foxtrot(), c0585q2, 0), g0Var, c0585q2, 196608);
                                            z zVar92 = (z) echo3.golf();
                                            c0585q2.purple(-107432127);
                                            iArr = as.$EnumSwitchMapping$1;
                                            if (iArr[zVar92.ordinal()] == 1) {
                                            }
                                            c0585q2.quebec(false);
                                            AbstractC0713c foxtrot22 = C0366t.foxtrot(j16);
                                            golf2 = c0585q2.golf(foxtrot22);
                                            jade = c0585q2.jade();
                                            if (!golf2) {
                                            }
                                            jade = (g0) bx.ad.alpha.invoke(foxtrot22);
                                            c0585q2.f(jade);
                                            g0 g0Var22 = (g0) jade;
                                            zVar2 = (z) aVar.L();
                                            c0585q2.purple(-107432127);
                                            if (iArr[zVar2.ordinal()] == 1) {
                                            }
                                            c0585q2.quebec(false);
                                            C0366t c0366t3 = new C0366t(j14);
                                            z zVar102 = (z) echo3.golf();
                                            c0585q2.purple(-107432127);
                                            if (iArr[zVar102.ordinal()] == 1) {
                                            }
                                            c0585q2.quebec(false);
                                            X charlie62 = e0.charlie(echo3, c0366t3, new C0366t(j17), (bz.aa) ar.silver.invoke(echo3.foxtrot(), c0585q2, 0), g0Var22, c0585q2, 196608);
                                            c0585q2.purple(1023351670);
                                            c0585q2.quebec(false);
                                            AbstractC0713c foxtrot32 = C0366t.foxtrot(j5);
                                            golf3 = c0585q2.golf(foxtrot32);
                                            jade2 = c0585q2.jade();
                                            if (!golf3) {
                                            }
                                            jade2 = (g0) bx.ad.alpha.invoke(foxtrot32);
                                            c0585q2.f(jade2);
                                            g0 g0Var32 = (g0) jade2;
                                            c0585q2.purple(1023351670);
                                            c0585q2.quebec(false);
                                            C0366t c0366t22 = new C0366t(j5);
                                            c0585q2.purple(1023351670);
                                            c0585q2.quebec(false);
                                            X charlie72 = e0.charlie(echo3, c0366t22, new C0366t(j5), (bz.aa) ar.purple.invoke(echo3.foxtrot(), c0585q2, 0), g0Var32, c0585q2, 196608);
                                            float floatValue2 = ((Number) charlie4.getValue()).floatValue();
                                            c0585q2.purple(-156998101);
                                            if (lVar2 == null) {
                                            }
                                            c0585q2.quebec(z17);
                                            if (z10) {
                                            }
                                            long j182 = j7;
                                            jade3 = c0585q2.jade();
                                            if (jade3 == asVar) {
                                            }
                                            D0 d022 = (D0) jade3;
                                            c0585q2.purple(-156965270);
                                            if (lVar3 == null) {
                                            }
                                            c0585q2.quebec(z17);
                                            jade4 = c0585q2.jade();
                                            if (jade4 == asVar) {
                                            }
                                            c0585q2.purple(-156940524);
                                            c0585q2.quebec(z17);
                                            c0585q2.purple(-156921964);
                                            c0585q2.quebec(z17);
                                            if (z10) {
                                            }
                                            c0585q2.purple(-156902962);
                                            if (lVar4 == null) {
                                            }
                                            c0585q2.quebec(z17);
                                            if (z10) {
                                            }
                                            c0585q2.purple(-156893937);
                                            if (lVar5 == null) {
                                            }
                                            c0585q2.quebec(z17);
                                            if (z10) {
                                            }
                                            long j192 = j12;
                                            c0585q2.purple(-156884470);
                                            if (dVar == null) {
                                            }
                                            c0585q2.quebec(z17);
                                            ordinal6 = auVar.ordinal();
                                            if (ordinal6 == 0) {
                                            }
                                        }
                                    }
                                    f13 = 1.0f;
                                    z16 = false;
                                    c0585q2.quebec(z16);
                                    Float valueOf32 = Float.valueOf(f13);
                                    z zVar82 = (z) echo3.golf();
                                    c0585q2.purple(1128033978);
                                    ordinal5 = zVar82.ordinal();
                                    if (ordinal5 != 0) {
                                    }
                                    f14 = 1.0f;
                                    c0585q2.quebec(false);
                                    X charlie522 = e0.charlie(echo3, valueOf32, Float.valueOf(f14), (bz.aa) ar.white.invoke(echo3.foxtrot(), c0585q2, 0), g0Var, c0585q2, 196608);
                                    z zVar922 = (z) echo3.golf();
                                    c0585q2.purple(-107432127);
                                    iArr = as.$EnumSwitchMapping$1;
                                    if (iArr[zVar922.ordinal()] == 1) {
                                    }
                                    c0585q2.quebec(false);
                                    AbstractC0713c foxtrot222 = C0366t.foxtrot(j16);
                                    golf2 = c0585q2.golf(foxtrot222);
                                    jade = c0585q2.jade();
                                    if (!golf2) {
                                    }
                                    jade = (g0) bx.ad.alpha.invoke(foxtrot222);
                                    c0585q2.f(jade);
                                    g0 g0Var222 = (g0) jade;
                                    zVar2 = (z) aVar.L();
                                    c0585q2.purple(-107432127);
                                    if (iArr[zVar2.ordinal()] == 1) {
                                    }
                                    c0585q2.quebec(false);
                                    C0366t c0366t32 = new C0366t(j14);
                                    z zVar1022 = (z) echo3.golf();
                                    c0585q2.purple(-107432127);
                                    if (iArr[zVar1022.ordinal()] == 1) {
                                    }
                                    c0585q2.quebec(false);
                                    X charlie622 = e0.charlie(echo3, c0366t32, new C0366t(j17), (bz.aa) ar.silver.invoke(echo3.foxtrot(), c0585q2, 0), g0Var222, c0585q2, 196608);
                                    c0585q2.purple(1023351670);
                                    c0585q2.quebec(false);
                                    AbstractC0713c foxtrot322 = C0366t.foxtrot(j5);
                                    golf3 = c0585q2.golf(foxtrot322);
                                    jade2 = c0585q2.jade();
                                    if (!golf3) {
                                    }
                                    jade2 = (g0) bx.ad.alpha.invoke(foxtrot322);
                                    c0585q2.f(jade2);
                                    g0 g0Var322 = (g0) jade2;
                                    c0585q2.purple(1023351670);
                                    c0585q2.quebec(false);
                                    C0366t c0366t222 = new C0366t(j5);
                                    c0585q2.purple(1023351670);
                                    c0585q2.quebec(false);
                                    X charlie722 = e0.charlie(echo3, c0366t222, new C0366t(j5), (bz.aa) ar.purple.invoke(echo3.foxtrot(), c0585q2, 0), g0Var322, c0585q2, 196608);
                                    float floatValue22 = ((Number) charlie4.getValue()).floatValue();
                                    c0585q2.purple(-156998101);
                                    if (lVar2 == null) {
                                    }
                                    c0585q2.quebec(z17);
                                    if (z10) {
                                    }
                                    long j1822 = j7;
                                    jade3 = c0585q2.jade();
                                    if (jade3 == asVar) {
                                    }
                                    D0 d0222 = (D0) jade3;
                                    c0585q2.purple(-156965270);
                                    if (lVar3 == null) {
                                    }
                                    c0585q2.quebec(z17);
                                    jade4 = c0585q2.jade();
                                    if (jade4 == asVar) {
                                    }
                                    c0585q2.purple(-156940524);
                                    c0585q2.quebec(z17);
                                    c0585q2.purple(-156921964);
                                    c0585q2.quebec(z17);
                                    if (z10) {
                                    }
                                    c0585q2.purple(-156902962);
                                    if (lVar4 == null) {
                                    }
                                    c0585q2.quebec(z17);
                                    if (z10) {
                                    }
                                    c0585q2.purple(-156893937);
                                    if (lVar5 == null) {
                                    }
                                    c0585q2.quebec(z17);
                                    if (z10) {
                                    }
                                    long j1922 = j12;
                                    c0585q2.purple(-156884470);
                                    if (dVar == null) {
                                    }
                                    c0585q2.quebec(z17);
                                    ordinal6 = auVar.ordinal();
                                    if (ordinal6 == 0) {
                                    }
                                }
                                f12 = 1.0f;
                                z15 = false;
                                c0585q2.quebec(z15);
                                charlie2 = e0.charlie(echo3, valueOf2, Float.valueOf(f12), (bz.aa) ar.teal.invoke(echo3.foxtrot(), c0585q2, Integer.valueOf(z15 ? 1 : 0)), g0Var, c0585q2, 196608);
                                z zVar72 = (z) aVar.L();
                                c0585q2.purple(1128033978);
                                ordinal4 = zVar72.ordinal();
                                if (ordinal4 != 0) {
                                }
                                f13 = 1.0f;
                                z16 = false;
                                c0585q2.quebec(z16);
                                Float valueOf322 = Float.valueOf(f13);
                                z zVar822 = (z) echo3.golf();
                                c0585q2.purple(1128033978);
                                ordinal5 = zVar822.ordinal();
                                if (ordinal5 != 0) {
                                }
                                f14 = 1.0f;
                                c0585q2.quebec(false);
                                X charlie5222 = e0.charlie(echo3, valueOf322, Float.valueOf(f14), (bz.aa) ar.white.invoke(echo3.foxtrot(), c0585q2, 0), g0Var, c0585q2, 196608);
                                z zVar9222 = (z) echo3.golf();
                                c0585q2.purple(-107432127);
                                iArr = as.$EnumSwitchMapping$1;
                                if (iArr[zVar9222.ordinal()] == 1) {
                                }
                                c0585q2.quebec(false);
                                AbstractC0713c foxtrot2222 = C0366t.foxtrot(j16);
                                golf2 = c0585q2.golf(foxtrot2222);
                                jade = c0585q2.jade();
                                if (!golf2) {
                                }
                                jade = (g0) bx.ad.alpha.invoke(foxtrot2222);
                                c0585q2.f(jade);
                                g0 g0Var2222 = (g0) jade;
                                zVar2 = (z) aVar.L();
                                c0585q2.purple(-107432127);
                                if (iArr[zVar2.ordinal()] == 1) {
                                }
                                c0585q2.quebec(false);
                                C0366t c0366t322 = new C0366t(j14);
                                z zVar10222 = (z) echo3.golf();
                                c0585q2.purple(-107432127);
                                if (iArr[zVar10222.ordinal()] == 1) {
                                }
                                c0585q2.quebec(false);
                                X charlie6222 = e0.charlie(echo3, c0366t322, new C0366t(j17), (bz.aa) ar.silver.invoke(echo3.foxtrot(), c0585q2, 0), g0Var2222, c0585q2, 196608);
                                c0585q2.purple(1023351670);
                                c0585q2.quebec(false);
                                AbstractC0713c foxtrot3222 = C0366t.foxtrot(j5);
                                golf3 = c0585q2.golf(foxtrot3222);
                                jade2 = c0585q2.jade();
                                if (!golf3) {
                                }
                                jade2 = (g0) bx.ad.alpha.invoke(foxtrot3222);
                                c0585q2.f(jade2);
                                g0 g0Var3222 = (g0) jade2;
                                c0585q2.purple(1023351670);
                                c0585q2.quebec(false);
                                C0366t c0366t2222 = new C0366t(j5);
                                c0585q2.purple(1023351670);
                                c0585q2.quebec(false);
                                X charlie7222 = e0.charlie(echo3, c0366t2222, new C0366t(j5), (bz.aa) ar.purple.invoke(echo3.foxtrot(), c0585q2, 0), g0Var3222, c0585q2, 196608);
                                float floatValue222 = ((Number) charlie4.getValue()).floatValue();
                                c0585q2.purple(-156998101);
                                if (lVar2 == null) {
                                }
                                c0585q2.quebec(z17);
                                if (z10) {
                                }
                                long j18222 = j7;
                                jade3 = c0585q2.jade();
                                if (jade3 == asVar) {
                                }
                                D0 d02222 = (D0) jade3;
                                c0585q2.purple(-156965270);
                                if (lVar3 == null) {
                                }
                                c0585q2.quebec(z17);
                                jade4 = c0585q2.jade();
                                if (jade4 == asVar) {
                                }
                                c0585q2.purple(-156940524);
                                c0585q2.quebec(z17);
                                c0585q2.purple(-156921964);
                                c0585q2.quebec(z17);
                                if (z10) {
                                }
                                c0585q2.purple(-156902962);
                                if (lVar4 == null) {
                                }
                                c0585q2.quebec(z17);
                                if (z10) {
                                }
                                c0585q2.purple(-156893937);
                                if (lVar5 == null) {
                                }
                                c0585q2.quebec(z17);
                                if (z10) {
                                }
                                long j19222 = j12;
                                c0585q2.purple(-156884470);
                                if (dVar == null) {
                                }
                                c0585q2.quebec(z17);
                                ordinal6 = auVar.ordinal();
                                if (ordinal6 == 0) {
                                }
                            }
                            f11 = 1.0f;
                            z14 = false;
                            c0585q2.quebec(z14);
                            Float valueOf22 = Float.valueOf(f11);
                            z zVar62 = (z) echo3.golf();
                            c0585q2.purple(1435837472);
                            ordinal3 = zVar62.ordinal();
                            if (ordinal3 != 0) {
                            }
                            f12 = 1.0f;
                            z15 = false;
                            c0585q2.quebec(z15);
                            charlie2 = e0.charlie(echo3, valueOf22, Float.valueOf(f12), (bz.aa) ar.teal.invoke(echo3.foxtrot(), c0585q2, Integer.valueOf(z15 ? 1 : 0)), g0Var, c0585q2, 196608);
                            z zVar722 = (z) aVar.L();
                            c0585q2.purple(1128033978);
                            ordinal4 = zVar722.ordinal();
                            if (ordinal4 != 0) {
                            }
                            f13 = 1.0f;
                            z16 = false;
                            c0585q2.quebec(z16);
                            Float valueOf3222 = Float.valueOf(f13);
                            z zVar8222 = (z) echo3.golf();
                            c0585q2.purple(1128033978);
                            ordinal5 = zVar8222.ordinal();
                            if (ordinal5 != 0) {
                            }
                            f14 = 1.0f;
                            c0585q2.quebec(false);
                            X charlie52222 = e0.charlie(echo3, valueOf3222, Float.valueOf(f14), (bz.aa) ar.white.invoke(echo3.foxtrot(), c0585q2, 0), g0Var, c0585q2, 196608);
                            z zVar92222 = (z) echo3.golf();
                            c0585q2.purple(-107432127);
                            iArr = as.$EnumSwitchMapping$1;
                            if (iArr[zVar92222.ordinal()] == 1) {
                            }
                            c0585q2.quebec(false);
                            AbstractC0713c foxtrot22222 = C0366t.foxtrot(j16);
                            golf2 = c0585q2.golf(foxtrot22222);
                            jade = c0585q2.jade();
                            if (!golf2) {
                            }
                            jade = (g0) bx.ad.alpha.invoke(foxtrot22222);
                            c0585q2.f(jade);
                            g0 g0Var22222 = (g0) jade;
                            zVar2 = (z) aVar.L();
                            c0585q2.purple(-107432127);
                            if (iArr[zVar2.ordinal()] == 1) {
                            }
                            c0585q2.quebec(false);
                            C0366t c0366t3222 = new C0366t(j14);
                            z zVar102222 = (z) echo3.golf();
                            c0585q2.purple(-107432127);
                            if (iArr[zVar102222.ordinal()] == 1) {
                            }
                            c0585q2.quebec(false);
                            X charlie62222 = e0.charlie(echo3, c0366t3222, new C0366t(j17), (bz.aa) ar.silver.invoke(echo3.foxtrot(), c0585q2, 0), g0Var22222, c0585q2, 196608);
                            c0585q2.purple(1023351670);
                            c0585q2.quebec(false);
                            AbstractC0713c foxtrot32222 = C0366t.foxtrot(j5);
                            golf3 = c0585q2.golf(foxtrot32222);
                            jade2 = c0585q2.jade();
                            if (!golf3) {
                            }
                            jade2 = (g0) bx.ad.alpha.invoke(foxtrot32222);
                            c0585q2.f(jade2);
                            g0 g0Var32222 = (g0) jade2;
                            c0585q2.purple(1023351670);
                            c0585q2.quebec(false);
                            C0366t c0366t22222 = new C0366t(j5);
                            c0585q2.purple(1023351670);
                            c0585q2.quebec(false);
                            X charlie72222 = e0.charlie(echo3, c0366t22222, new C0366t(j5), (bz.aa) ar.purple.invoke(echo3.foxtrot(), c0585q2, 0), g0Var32222, c0585q2, 196608);
                            float floatValue2222 = ((Number) charlie4.getValue()).floatValue();
                            c0585q2.purple(-156998101);
                            if (lVar2 == null) {
                            }
                            c0585q2.quebec(z17);
                            if (z10) {
                            }
                            long j182222 = j7;
                            jade3 = c0585q2.jade();
                            if (jade3 == asVar) {
                            }
                            D0 d022222 = (D0) jade3;
                            c0585q2.purple(-156965270);
                            if (lVar3 == null) {
                            }
                            c0585q2.quebec(z17);
                            jade4 = c0585q2.jade();
                            if (jade4 == asVar) {
                            }
                            c0585q2.purple(-156940524);
                            c0585q2.quebec(z17);
                            c0585q2.purple(-156921964);
                            c0585q2.quebec(z17);
                            if (z10) {
                            }
                            c0585q2.purple(-156902962);
                            if (lVar4 == null) {
                            }
                            c0585q2.quebec(z17);
                            if (z10) {
                            }
                            c0585q2.purple(-156893937);
                            if (lVar5 == null) {
                            }
                            c0585q2.quebec(z17);
                            if (z10) {
                            }
                            long j192222 = j12;
                            c0585q2.purple(-156884470);
                            if (dVar == null) {
                            }
                            c0585q2.quebec(z17);
                            ordinal6 = auVar.ordinal();
                            if (ordinal6 == 0) {
                            }
                        } else if (ordinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    f10 = 1.0f;
                    z13 = false;
                    c0585q2.quebec(z13);
                    X charlie42 = e0.charlie(echo3, valueOf, Float.valueOf(f10), (bz.aa) ar.red.invoke(echo3.foxtrot(), c0585q2, Integer.valueOf(z13 ? 1 : 0)), g0Var, c0585q2, 196608);
                    z zVar52 = (z) aVar.L();
                    c0585q2.purple(1435837472);
                    ordinal2 = zVar52.ordinal();
                    if (ordinal2 != 0) {
                    }
                    f11 = 1.0f;
                    z14 = false;
                    c0585q2.quebec(z14);
                    Float valueOf222 = Float.valueOf(f11);
                    z zVar622 = (z) echo3.golf();
                    c0585q2.purple(1435837472);
                    ordinal3 = zVar622.ordinal();
                    if (ordinal3 != 0) {
                    }
                    f12 = 1.0f;
                    z15 = false;
                    c0585q2.quebec(z15);
                    charlie2 = e0.charlie(echo3, valueOf222, Float.valueOf(f12), (bz.aa) ar.teal.invoke(echo3.foxtrot(), c0585q2, Integer.valueOf(z15 ? 1 : 0)), g0Var, c0585q2, 196608);
                    z zVar7222 = (z) aVar.L();
                    c0585q2.purple(1128033978);
                    ordinal4 = zVar7222.ordinal();
                    if (ordinal4 != 0) {
                    }
                    f13 = 1.0f;
                    z16 = false;
                    c0585q2.quebec(z16);
                    Float valueOf32222 = Float.valueOf(f13);
                    z zVar82222 = (z) echo3.golf();
                    c0585q2.purple(1128033978);
                    ordinal5 = zVar82222.ordinal();
                    if (ordinal5 != 0) {
                    }
                    f14 = 1.0f;
                    c0585q2.quebec(false);
                    X charlie522222 = e0.charlie(echo3, valueOf32222, Float.valueOf(f14), (bz.aa) ar.white.invoke(echo3.foxtrot(), c0585q2, 0), g0Var, c0585q2, 196608);
                    z zVar922222 = (z) echo3.golf();
                    c0585q2.purple(-107432127);
                    iArr = as.$EnumSwitchMapping$1;
                    if (iArr[zVar922222.ordinal()] == 1) {
                    }
                    c0585q2.quebec(false);
                    AbstractC0713c foxtrot222222 = C0366t.foxtrot(j16);
                    golf2 = c0585q2.golf(foxtrot222222);
                    jade = c0585q2.jade();
                    if (!golf2) {
                    }
                    jade = (g0) bx.ad.alpha.invoke(foxtrot222222);
                    c0585q2.f(jade);
                    g0 g0Var222222 = (g0) jade;
                    zVar2 = (z) aVar.L();
                    c0585q2.purple(-107432127);
                    if (iArr[zVar2.ordinal()] == 1) {
                    }
                    c0585q2.quebec(false);
                    C0366t c0366t32222 = new C0366t(j14);
                    z zVar1022222 = (z) echo3.golf();
                    c0585q2.purple(-107432127);
                    if (iArr[zVar1022222.ordinal()] == 1) {
                    }
                    c0585q2.quebec(false);
                    X charlie622222 = e0.charlie(echo3, c0366t32222, new C0366t(j17), (bz.aa) ar.silver.invoke(echo3.foxtrot(), c0585q2, 0), g0Var222222, c0585q2, 196608);
                    c0585q2.purple(1023351670);
                    c0585q2.quebec(false);
                    AbstractC0713c foxtrot322222 = C0366t.foxtrot(j5);
                    golf3 = c0585q2.golf(foxtrot322222);
                    jade2 = c0585q2.jade();
                    if (!golf3) {
                    }
                    jade2 = (g0) bx.ad.alpha.invoke(foxtrot322222);
                    c0585q2.f(jade2);
                    g0 g0Var322222 = (g0) jade2;
                    c0585q2.purple(1023351670);
                    c0585q2.quebec(false);
                    C0366t c0366t222222 = new C0366t(j5);
                    c0585q2.purple(1023351670);
                    c0585q2.quebec(false);
                    X charlie722222 = e0.charlie(echo3, c0366t222222, new C0366t(j5), (bz.aa) ar.purple.invoke(echo3.foxtrot(), c0585q2, 0), g0Var322222, c0585q2, 196608);
                    float floatValue22222 = ((Number) charlie42.getValue()).floatValue();
                    c0585q2.purple(-156998101);
                    if (lVar2 == null) {
                    }
                    c0585q2.quebec(z17);
                    if (z10) {
                    }
                    long j1822222 = j7;
                    jade3 = c0585q2.jade();
                    if (jade3 == asVar) {
                    }
                    D0 d0222222 = (D0) jade3;
                    c0585q2.purple(-156965270);
                    if (lVar3 == null) {
                    }
                    c0585q2.quebec(z17);
                    jade4 = c0585q2.jade();
                    if (jade4 == asVar) {
                    }
                    c0585q2.purple(-156940524);
                    c0585q2.quebec(z17);
                    c0585q2.purple(-156921964);
                    c0585q2.quebec(z17);
                    if (z10) {
                    }
                    c0585q2.purple(-156902962);
                    if (lVar4 == null) {
                    }
                    c0585q2.quebec(z17);
                    if (z10) {
                    }
                    c0585q2.purple(-156893937);
                    if (lVar5 == null) {
                    }
                    c0585q2.quebec(z17);
                    if (z10) {
                    }
                    long j1922222 = j12;
                    c0585q2.purple(-156884470);
                    if (dVar == null) {
                    }
                    c0585q2.quebec(z17);
                    ordinal6 = auVar.ordinal();
                    if (ordinal6 == 0) {
                    }
                } else if (ordinal7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f5 = 1.0f;
            z12 = false;
            c0585q2.quebec(z12);
            Float valueOf4 = Float.valueOf(f5);
            z zVar42 = (z) echo3.golf();
            c0585q2.purple(-2036730335);
            ordinal = zVar42.ordinal();
            if (ordinal != 0) {
            }
            f10 = 1.0f;
            z13 = false;
            c0585q2.quebec(z13);
            X charlie422 = e0.charlie(echo3, valueOf4, Float.valueOf(f10), (bz.aa) ar.red.invoke(echo3.foxtrot(), c0585q2, Integer.valueOf(z13 ? 1 : 0)), g0Var, c0585q2, 196608);
            z zVar522 = (z) aVar.L();
            c0585q2.purple(1435837472);
            ordinal2 = zVar522.ordinal();
            if (ordinal2 != 0) {
            }
            f11 = 1.0f;
            z14 = false;
            c0585q2.quebec(z14);
            Float valueOf2222 = Float.valueOf(f11);
            z zVar6222 = (z) echo3.golf();
            c0585q2.purple(1435837472);
            ordinal3 = zVar6222.ordinal();
            if (ordinal3 != 0) {
            }
            f12 = 1.0f;
            z15 = false;
            c0585q2.quebec(z15);
            charlie2 = e0.charlie(echo3, valueOf2222, Float.valueOf(f12), (bz.aa) ar.teal.invoke(echo3.foxtrot(), c0585q2, Integer.valueOf(z15 ? 1 : 0)), g0Var, c0585q2, 196608);
            z zVar72222 = (z) aVar.L();
            c0585q2.purple(1128033978);
            ordinal4 = zVar72222.ordinal();
            if (ordinal4 != 0) {
            }
            f13 = 1.0f;
            z16 = false;
            c0585q2.quebec(z16);
            Float valueOf322222 = Float.valueOf(f13);
            z zVar822222 = (z) echo3.golf();
            c0585q2.purple(1128033978);
            ordinal5 = zVar822222.ordinal();
            if (ordinal5 != 0) {
            }
            f14 = 1.0f;
            c0585q2.quebec(false);
            X charlie5222222 = e0.charlie(echo3, valueOf322222, Float.valueOf(f14), (bz.aa) ar.white.invoke(echo3.foxtrot(), c0585q2, 0), g0Var, c0585q2, 196608);
            z zVar9222222 = (z) echo3.golf();
            c0585q2.purple(-107432127);
            iArr = as.$EnumSwitchMapping$1;
            if (iArr[zVar9222222.ordinal()] == 1) {
            }
            c0585q2.quebec(false);
            AbstractC0713c foxtrot2222222 = C0366t.foxtrot(j16);
            golf2 = c0585q2.golf(foxtrot2222222);
            jade = c0585q2.jade();
            if (!golf2) {
            }
            jade = (g0) bx.ad.alpha.invoke(foxtrot2222222);
            c0585q2.f(jade);
            g0 g0Var2222222 = (g0) jade;
            zVar2 = (z) aVar.L();
            c0585q2.purple(-107432127);
            if (iArr[zVar2.ordinal()] == 1) {
            }
            c0585q2.quebec(false);
            C0366t c0366t322222 = new C0366t(j14);
            z zVar10222222 = (z) echo3.golf();
            c0585q2.purple(-107432127);
            if (iArr[zVar10222222.ordinal()] == 1) {
            }
            c0585q2.quebec(false);
            X charlie6222222 = e0.charlie(echo3, c0366t322222, new C0366t(j17), (bz.aa) ar.silver.invoke(echo3.foxtrot(), c0585q2, 0), g0Var2222222, c0585q2, 196608);
            c0585q2.purple(1023351670);
            c0585q2.quebec(false);
            AbstractC0713c foxtrot3222222 = C0366t.foxtrot(j5);
            golf3 = c0585q2.golf(foxtrot3222222);
            jade2 = c0585q2.jade();
            if (!golf3) {
            }
            jade2 = (g0) bx.ad.alpha.invoke(foxtrot3222222);
            c0585q2.f(jade2);
            g0 g0Var3222222 = (g0) jade2;
            c0585q2.purple(1023351670);
            c0585q2.quebec(false);
            C0366t c0366t2222222 = new C0366t(j5);
            c0585q2.purple(1023351670);
            c0585q2.quebec(false);
            X charlie7222222 = e0.charlie(echo3, c0366t2222222, new C0366t(j5), (bz.aa) ar.purple.invoke(echo3.foxtrot(), c0585q2, 0), g0Var3222222, c0585q2, 196608);
            float floatValue222222 = ((Number) charlie422.getValue()).floatValue();
            c0585q2.purple(-156998101);
            if (lVar2 == null) {
            }
            c0585q2.quebec(z17);
            if (z10) {
            }
            long j18222222 = j7;
            jade3 = c0585q2.jade();
            if (jade3 == asVar) {
            }
            D0 d02222222 = (D0) jade3;
            c0585q2.purple(-156965270);
            if (lVar3 == null) {
            }
            c0585q2.quebec(z17);
            jade4 = c0585q2.jade();
            if (jade4 == asVar) {
            }
            c0585q2.purple(-156940524);
            c0585q2.quebec(z17);
            c0585q2.purple(-156921964);
            c0585q2.quebec(z17);
            if (z10) {
            }
            c0585q2.purple(-156902962);
            if (lVar4 == null) {
            }
            c0585q2.quebec(z17);
            if (z10) {
            }
            c0585q2.purple(-156893937);
            if (lVar5 == null) {
            }
            c0585q2.quebec(z17);
            if (z10) {
            }
            long j19222222 = j12;
            c0585q2.purple(-156884470);
            if (dVar == null) {
            }
            c0585q2.quebec(z17);
            ordinal6 = auVar.ordinal();
            if (ordinal6 == 0) {
            }
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aq(auVar, str, lVar, ajVar, lVar2, lVar3, lVar4, lVar5, dVar, z2, z10, z11, interfaceC1673j, m4, c0143o22, dVar3, i4, i5);
        }
    }

    public static final void bravo(long j5, D0.an anVar, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1208685580);
        if ((i4 & 6) == 0) {
            if (c0585q.foxtrot(j5)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(anVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(lVar)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        if ((i5 & 147) == 146 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            i.alpha(j5, anVar, lVar, c0585q, i5 & 1022);
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ai(j5, anVar, lVar, i4, 1);
        }
    }

    public static final void charlie(long j5, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(660142980);
        if ((i4 & 6) == 0) {
            if (c0585q.foxtrot(j5)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(lVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) == 18 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            C0564b.alpha(Y.alpha.alpha(new C0366t(j5)), lVar, c0585q, (i5 & 112) | 8);
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new G.f(j5, lVar, i4);
        }
    }

    public static final ax delta(boolean z2, boolean z10, boolean z11, C0143o2 c0143o2, float f5, float f10, InterfaceC0581m interfaceC0581m, int i4) {
        long j5;
        D0 d02;
        D0 black;
        if (!z2) {
            j5 = c0143o2.november;
        } else if (z10) {
            j5 = c0143o2.oscar;
        } else if (z11) {
            j5 = c0143o2.lima;
        } else {
            j5 = c0143o2.mike;
        }
        long j6 = j5;
        if (z2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            c0585q.purple(1023053998);
            d02 = F.alpha(j6, AbstractC0779d.kilo(150, 0, null, 6), c0585q, 48, 12);
            c0585q.quebec(false);
        } else {
            C0585q c0585q2 = (C0585q) interfaceC0581m;
            c0585q2.purple(1023165505);
            ax black2 = C0564b.black(new C0366t(j6), c0585q2);
            c0585q2.quebec(false);
            d02 = black2;
        }
        if (z2) {
            C0585q c0585q3 = (C0585q) interfaceC0581m;
            c0585q3.purple(1023269417);
            if (!z11) {
                f5 = f10;
            }
            black = AbstractC0782g.alpha(f5, AbstractC0779d.kilo(150, 0, null, 6), c0585q3);
            c0585q3.quebec(false);
        } else {
            C0585q c0585q4 = (C0585q) interfaceC0581m;
            c0585q4.purple(1023478388);
            black = C0564b.black(new Q0.g(f10), c0585q4);
            c0585q4.quebec(false);
        }
        return C0564b.black(S3.alpha(((Q0.g) black.getValue()).alpha, ((C0366t) d02.getValue()).alpha), interfaceC0581m);
    }

    public static final Object echo(InterfaceC2401t interfaceC2401t) {
        q0.aa aaVar;
        Object yankee = interfaceC2401t.yankee();
        if (yankee instanceof q0.aa) {
            aaVar = (q0.aa) yankee;
        } else {
            aaVar = null;
        }
        if (aaVar == null) {
            return null;
        }
        return aaVar.alpha;
    }
}
