package androidx.compose.material3.internal;

import F.AbstractC0173x0;
import F.C0140o;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2618b7;

/* loaded from: classes3.dex */
public final class x implements U0.ac {

    /* renamed from: a, reason: collision with root package name */
    public final av f2990a;
    public final long alpha;

    /* renamed from: b, reason: collision with root package name */
    public final b f2991b;

    /* renamed from: c, reason: collision with root package name */
    public final b f2992c;

    /* renamed from: d, reason: collision with root package name */
    public final b f2993d;
    public final aw e;

    /* renamed from: f, reason: collision with root package name */
    public final aw f2994f;
    public final Q0.d purple;
    public final int red;
    public final C0140o silver;
    public final a teal;
    public final a white;
    public final av yellow;

    public x(long j5, Q0.d dVar, C0140o c0140o) {
        int ochre = dVar.ochre(AbstractC0173x0.alpha);
        this.alpha = j5;
        this.purple = dVar;
        this.red = ochre;
        this.silver = c0140o;
        int ochre2 = dVar.ochre(Float.intBitsToFloat((int) (j5 >> 32)));
        T.i iVar = T.d.f2062f;
        this.teal = new a(iVar, iVar, ochre2);
        T.i iVar2 = T.d.f2064h;
        this.white = new a(iVar2, iVar2, ochre2);
        this.yellow = new av(T.a.charlie);
        this.f2990a = new av(T.a.delta);
        int ochre3 = dVar.ochre(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        T.j jVar = T.d.f2060c;
        T.j jVar2 = T.d.e;
        this.f2991b = new b(jVar, jVar2, ochre3);
        this.f2992c = new b(jVar2, jVar, ochre3);
        this.f2993d = new b(T.d.f2061d, jVar, ochre3);
        this.e = new aw(jVar, ochre);
        this.f2994f = new aw(jVar2, ochre);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                if (this.alpha == xVar.alpha && Intrinsics.areEqual(this.purple, xVar.purple) && this.red == xVar.red && Intrinsics.areEqual(this.silver, xVar.silver)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j5 = this.alpha;
        return this.silver.hashCode() + ((((this.purple.hashCode() + (((int) (j5 ^ (j5 >>> 32))) * 31)) * 31) + this.red) * 31);
    }

    @Override // U0.ac
    public final long oscar(Q0.l lVar, long j5, Q0.n nVar, long j6) {
        av avVar;
        Q0.l lVar2;
        long j7;
        char c3;
        int i4;
        aw awVar;
        long j10;
        int i5;
        int i10;
        char c4 = 3;
        int i11 = (int) (j5 >> 32);
        if (((int) (lVar.alpha() >> 32)) < i11 / 2) {
            avVar = this.yellow;
        } else {
            avVar = this.f2990a;
        }
        List listOf = CollectionsKt.listOf(this.teal, this.white, avVar);
        int size = listOf.size();
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                ae aeVar = (ae) listOf.get(i12);
                int i13 = (int) (j6 >> 32);
                int i14 = size;
                c3 = c4;
                j7 = j5;
                int i15 = i12;
                lVar2 = lVar;
                i4 = aeVar.alpha(lVar2, j7, i13, nVar);
                if (i15 == CollectionsKt.ivory(listOf) || (i4 >= 0 && i13 + i4 <= i11)) {
                    break;
                }
                i12 = i15 + 1;
                size = i14;
                c4 = c3;
            } else {
                lVar2 = lVar;
                j7 = j5;
                c3 = c4;
                i4 = 0;
                break;
            }
        }
        long j11 = 4294967295L;
        int i16 = (int) (j7 & 4294967295L);
        if (((int) (lVar2.alpha() & 4294967295L)) < i16 / 2) {
            awVar = this.e;
        } else {
            awVar = this.f2994f;
        }
        b bVar = this.f2991b;
        b bVar2 = this.f2992c;
        b bVar3 = this.f2993d;
        af[] afVarArr = new af[4];
        afVarArr[0] = bVar;
        afVarArr[1] = bVar2;
        afVarArr[2] = bVar3;
        afVarArr[c3] = awVar;
        List listOf2 = CollectionsKt.listOf(afVarArr);
        int size2 = listOf2.size();
        int i17 = 0;
        while (i17 < size2) {
            j10 = j11;
            int i18 = (int) (j6 & j10);
            int alpha = ((af) listOf2.get(i17)).alpha(lVar2, j7, i18);
            if (i17 != CollectionsKt.ivory(listOf2) && (alpha < (i10 = this.red) || i18 + alpha > i16 - i10)) {
                i17++;
                j11 = j10;
            } else {
                i5 = alpha;
                break;
            }
        }
        j10 = j11;
        i5 = 0;
        long j12 = (i4 << 32) | (i5 & j10);
        this.silver.invoke(lVar2, AbstractC2618b7.alpha(j12, j6));
        return j12;
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) Q0.h.alpha(this.alpha)) + ", density=" + this.purple + ", verticalMargin=" + this.red + ", onPositionCalculated=" + this.silver + ')';
    }
}
