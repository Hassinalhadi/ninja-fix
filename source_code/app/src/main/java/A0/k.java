package A0;

import bv.al;
import bv.au;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import t0.W;

/* loaded from: classes3.dex */
public final class k implements ad, Iterable, Yd.a {
    public final al alpha;
    public bv.x purple;
    public boolean red;
    public boolean silver;

    public k() {
        long[] jArr = au.alpha;
        this.alpha = new al();
    }

    public final k alpha() {
        k kVar = new k();
        kVar.red = this.red;
        kVar.silver = this.silver;
        al alVar = kVar.alpha;
        alVar.getClass();
        al from = this.alpha;
        Intrinsics.echo(from, "from");
        Object[] objArr = from.bravo;
        Object[] objArr2 = from.charlie;
        long[] jArr = from.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128) {
                            int i11 = (i4 << 3) + i10;
                            alVar.mike(objArr[i11], objArr2[i11]);
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return kVar;
    }

    public final Object bravo(ac acVar) {
        Object golf = this.alpha.golf(acVar);
        if (golf != null) {
            return golf;
        }
        throw new IllegalStateException("Key not present: " + acVar + " - consider getOrElse or getOrNull");
    }

    public final void delta(k kVar) {
        al alVar = kVar.alpha;
        Object[] objArr = alVar.bravo;
        Object[] objArr2 = alVar.charlie;
        long[] jArr = alVar.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128) {
                            int i11 = (i4 << 3) + i10;
                            Object obj = objArr[i11];
                            Object obj2 = objArr2[i11];
                            ac acVar = (ac) obj;
                            al alVar2 = this.alpha;
                            Object golf = alVar2.golf(acVar);
                            Intrinsics.charlie(acVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                            Object invoke = acVar.bravo.invoke(golf, obj2);
                            if (invoke != null) {
                                alVar2.mike(acVar, invoke);
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i4 != length) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (!Intrinsics.areEqual(this.alpha, kVar.alpha) || this.red != kVar.red || this.silver != kVar.silver) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        int i5 = 1237;
        if (this.red) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = (hashCode + i4) * 31;
        if (this.silver) {
            i5 = 1231;
        }
        return i10 + i5;
    }

    public final void hotel(ac acVar, Object obj) {
        boolean z2 = obj instanceof a;
        al alVar = this.alpha;
        if (z2 && alVar.charlie(acVar)) {
            Object golf = alVar.golf(acVar);
            Intrinsics.charlie(golf, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) golf;
            a aVar2 = (a) obj;
            String str = aVar2.alpha;
            if (str == null) {
                str = aVar.alpha;
            }
            kotlin.e eVar = aVar2.bravo;
            if (eVar == null) {
                eVar = aVar.bravo;
            }
            alVar.mike(acVar, new a(str, eVar));
        } else {
            alVar.mike(acVar, obj);
        }
        acVar.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        bv.x xVar = this.purple;
        if (xVar == null) {
            al alVar = this.alpha;
            alVar.getClass();
            bv.x xVar2 = new bv.x(alVar);
            this.purple = xVar2;
            xVar = xVar2;
        }
        return ((bv.h) xVar.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.red) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.silver) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        al alVar = this.alpha;
        Object[] objArr = alVar.bravo;
        Object[] objArr2 = alVar.charlie;
        long[] jArr = alVar.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128) {
                            int i11 = (i4 << 3) + i10;
                            Object obj = objArr[i11];
                            Object obj2 = objArr2[i11];
                            sb2.append(str);
                            sb2.append(((ac) obj).alpha);
                            sb2.append(" : ");
                            sb2.append(obj2);
                            str = ", ";
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return W.november(this) + "{ " + ((Object) sb2) + " }";
    }
}
