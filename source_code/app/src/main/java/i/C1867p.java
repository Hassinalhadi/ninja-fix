package i;

import d.K;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import q0.aq;
import vf.ab;

/* renamed from: i.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1867p implements aq {
    public final C1868q alpha;
    public final int bravo;
    public final boolean charlie;
    public final float delta;
    public final aq echo;
    public final float foxtrot;
    public final boolean golf;
    public final ab hotel;
    public final Q0.d india;
    public final long juliet;
    public final List kilo;
    public final int lima;
    public final int mike;
    public final int november;
    public final K oscar;
    public final int papa;
    public final int quebec;

    public C1867p(C1868q c1868q, int i4, boolean z2, float f5, aq aqVar, float f10, boolean z10, ab abVar, Q0.d dVar, long j5, List list, int i5, int i10, int i11, K k6, int i12, int i13) {
        this.alpha = c1868q;
        this.bravo = i4;
        this.charlie = z2;
        this.delta = f5;
        this.echo = aqVar;
        this.foxtrot = f10;
        this.golf = z10;
        this.hotel = abVar;
        this.india = dVar;
        this.juliet = j5;
        this.kilo = list;
        this.lima = i5;
        this.mike = i10;
        this.november = i11;
        this.oscar = k6;
        this.papa = i12;
        this.quebec = i13;
    }

    @Override // q0.aq
    public final int alpha() {
        return this.echo.alpha();
    }

    @Override // q0.aq
    public final int bravo() {
        return this.echo.bravo();
    }

    @Override // q0.aq
    public final Map charlie() {
        return this.echo.charlie();
    }

    @Override // q0.aq
    public final void delta() {
        this.echo.delta();
    }

    @Override // q0.aq
    public final Function1 echo() {
        return this.echo.echo();
    }

    public final C1867p foxtrot(int i4, boolean z2) {
        C1868q c1868q;
        int i5;
        if (!this.golf) {
            List list = this.kilo;
            if (!list.isEmpty() && (c1868q = this.alpha) != null && (i5 = this.bravo - i4) >= 0 && i5 < c1868q.november) {
                C1868q c1868q2 = (C1868q) CollectionsKt.gold(list);
                C1868q c1868q3 = (C1868q) CollectionsKt.ochre(list);
                if (!c1868q2.papa && !c1868q3.papa) {
                    int i10 = this.mike;
                    int i11 = this.lima;
                    if (i4 < 0) {
                        if (Math.min((c1868q2.lima + c1868q2.november) - i11, (c1868q3.lima + c1868q3.november) - i10) <= (-i4)) {
                            return null;
                        }
                    } else if (Math.min(i11 - c1868q2.lima, i10 - c1868q3.lima) <= i4) {
                        return null;
                    }
                    int size = list.size();
                    boolean z10 = false;
                    for (int i12 = 0; i12 < size; i12++) {
                        C1868q c1868q4 = (C1868q) list.get(i12);
                        if (!c1868q4.papa) {
                            c1868q4.lima += i4;
                            int[] iArr = c1868q4.romeo;
                            int length = iArr.length;
                            for (int i13 = 0; i13 < length; i13++) {
                                int i14 = i13 & 1;
                                boolean z11 = c1868q4.charlie;
                                if ((z11 && i14 != 0) || (!z11 && i14 == 0)) {
                                    iArr[i13] = iArr[i13] + i4;
                                }
                            }
                            if (z2) {
                                int size2 = c1868q4.bravo.size();
                                for (int i15 = 0; i15 < size2; i15++) {
                                    c1868q4.kilo.alpha(i15, c1868q4.india);
                                }
                            }
                        }
                    }
                    if (this.charlie || i4 > 0) {
                        z10 = true;
                    }
                    return new C1867p(this.alpha, i5, z10, i4, this.echo, this.foxtrot, this.golf, this.hotel, this.india, this.juliet, this.kilo, this.lima, this.mike, this.november, this.oscar, this.papa, this.quebec);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long golf() {
        aq aqVar = this.echo;
        return (aqVar.bravo() << 32) | (aqVar.alpha() & 4294967295L);
    }
}
