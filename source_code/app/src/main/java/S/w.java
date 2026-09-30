package S;

import androidx.compose.runtime.C0564b;
import bv.al;
import bv.am;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.C2546f;
import s6.I5;

/* loaded from: classes3.dex */
public final class w {
    public final Function1 alpha;
    public Object bravo;
    public bv.ag charlie;
    public int juliet;
    public int delta = -1;
    public final al echo = I5.charlie();
    public final al foxtrot = new al();
    public final am golf = new am();
    public final J.e hotel = new J.e(new androidx.compose.runtime.ad[16]);
    public final v india = new v(0, this);
    public final al kilo = I5.charlie();
    public final HashMap lima = new HashMap();

    public w(Function1 function1) {
        this.alpha = function1;
    }

    public final void alpha(Object obj, Aa.l lVar, Function0 function0) {
        boolean z2;
        int i4;
        int i5;
        boolean z10;
        Object obj2 = this.bravo;
        bv.ag agVar = this.charlie;
        int i10 = this.delta;
        this.bravo = obj;
        this.charlie = (bv.ag) this.foxtrot.golf(obj);
        if (this.delta == -1) {
            long golf = n.kilo().golf();
            this.delta = (int) (golf ^ (golf >>> 32));
        }
        v vVar = this.india;
        J.e oscar = C0564b.oscar();
        boolean z11 = true;
        try {
            oscar.bravo(vVar);
            r6.u.hotel(function0, lVar);
            oscar.mike(oscar.red - 1);
            Object obj3 = this.bravo;
            Intrinsics.checkNotNull(obj3);
            int i11 = this.delta;
            bv.ag agVar2 = this.charlie;
            if (agVar2 != null) {
                long[] jArr = agVar2.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j5 = jArr[i12];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8;
                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                            z2 = z11;
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((j5 & 255) < 128) {
                                    int i16 = (i12 << 3) + i15;
                                    i5 = i13;
                                    Object obj4 = agVar2.bravo[i16];
                                    i4 = i15;
                                    if (agVar2.charlie[i16] != i11) {
                                        z10 = z2;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        delta(obj3, obj4);
                                    }
                                    if (z10) {
                                        agVar2.golf(i16);
                                    }
                                } else {
                                    i4 = i15;
                                    i5 = i13;
                                }
                                j5 >>= i5;
                                i15 = i4 + 1;
                                i13 = i5;
                            }
                            if (i14 != i13) {
                                break;
                            }
                        } else {
                            z2 = z11;
                        }
                        if (i12 == length) {
                            break;
                        }
                        i12++;
                        z11 = z2;
                    }
                }
            }
            this.bravo = obj2;
            this.charlie = agVar;
            this.delta = i10;
        } catch (Throwable th) {
            oscar.mike(oscar.red - 1);
            throw th;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean bravo(java.util.Set r47) {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S.w.bravo(java.util.Set):boolean");
    }

    public final void charlie(Object obj, int i4, Object obj2, bv.ag agVar) {
        int i5;
        if (this.juliet <= 0) {
            int charlie = agVar.charlie(obj);
            if (charlie < 0) {
                charlie = ~charlie;
                i5 = -1;
            } else {
                i5 = agVar.charlie[charlie];
            }
            agVar.bravo[charlie] = obj;
            agVar.charlie[charlie] = i4;
            if ((obj instanceof androidx.compose.runtime.ad) && i5 != i4) {
                androidx.compose.runtime.ac kilo = ((androidx.compose.runtime.ad) obj).kilo();
                this.lima.put(obj, kilo.foxtrot);
                bv.ag agVar2 = kilo.echo;
                al alVar = this.kilo;
                I5.echo(alVar, obj);
                Object[] objArr = agVar2.bravo;
                long[] jArr = agVar2.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j5 = jArr[i10];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j5 & 255) < 128) {
                                    ac acVar = (ac) objArr[(i10 << 3) + i12];
                                    if (acVar instanceof ad) {
                                        ((ad) acVar).golf(2);
                                    }
                                    I5.bravo(alVar, acVar, obj);
                                }
                                j5 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            if (i5 == -1) {
                if (obj instanceof ad) {
                    ((ad) obj).golf(2);
                }
                I5.bravo(this.echo, obj, obj2);
            }
        }
    }

    public final void delta(Object obj, Object obj2) {
        al alVar = this.echo;
        I5.delta(alVar, obj2, obj);
        if ((obj2 instanceof androidx.compose.runtime.ad) && !alVar.charlie(obj2)) {
            I5.echo(this.kilo, obj2);
            this.lima.remove(obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void echo(C2546f c2546f) {
        long[] jArr;
        long[] jArr2;
        long j5;
        char c3;
        long j6;
        int i4;
        long j7;
        al alVar = this.foxtrot;
        long[] jArr3 = alVar.alpha;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j10 = jArr3[i5];
                char c4 = 7;
                long j11 = -9187201950435737472L;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i5 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j10 & 255) < 128) {
                            int i13 = (i5 << 3) + i12;
                            c3 = c4;
                            Object obj = alVar.bravo[i13];
                            j6 = j11;
                            bv.ag agVar = (bv.ag) alVar.charlie[i13];
                            Boolean bool = (Boolean) c2546f.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = agVar.bravo;
                                int[] iArr = agVar.charlie;
                                long[] jArr4 = agVar.alpha;
                                int i14 = i10;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j5 = j10;
                                    int i15 = 0;
                                    while (true) {
                                        long j12 = jArr4[i15];
                                        long[] jArr5 = jArr4;
                                        if ((((~j12) << c3) & j12 & j6) != j6) {
                                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                            for (int i17 = 0; i17 < i16; i17++) {
                                                if ((j12 & 255) < 128) {
                                                    int i18 = (i15 << 3) + i17;
                                                    j7 = j12;
                                                    Object obj2 = objArr[i18];
                                                    int i19 = iArr[i18];
                                                    delta(obj, obj2);
                                                } else {
                                                    j7 = j12;
                                                }
                                                j12 = j7 >> i14;
                                            }
                                            if (i16 != i14) {
                                                break;
                                            }
                                        }
                                        if (i15 == length2) {
                                            break;
                                        }
                                        i15++;
                                        jArr4 = jArr5;
                                        i14 = 8;
                                    }
                                    if (bool.booleanValue()) {
                                        alVar.lima(i13);
                                    }
                                    i4 = 8;
                                }
                            }
                            jArr2 = jArr3;
                            j5 = j10;
                            if (bool.booleanValue()) {
                            }
                            i4 = 8;
                        } else {
                            jArr2 = jArr3;
                            j5 = j10;
                            c3 = c4;
                            j6 = j11;
                            i4 = i10;
                        }
                        i12++;
                        i10 = i4;
                        j10 = j5 >> i4;
                        c4 = c3;
                        j11 = j6;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i11 != i10) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i5 != length) {
                    i5++;
                    jArr3 = jArr;
                } else {
                    return;
                }
            }
        }
    }
}
