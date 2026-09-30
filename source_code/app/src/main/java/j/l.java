package j;

import d.K;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import q0.aq;
import s6.A0;
import vf.ab;

/* loaded from: classes3.dex */
public final class l implements aq {
    public final n alpha;
    public final int bravo;
    public final boolean charlie;
    public final float delta;
    public final aq echo;
    public final float foxtrot;
    public final boolean golf;
    public final ab hotel;
    public final Q0.d india;
    public final int juliet;
    public final Function1 kilo;
    public final Function1 lima;
    public final List mike;
    public final int november;
    public final int oscar;
    public final int papa;
    public final K quebec;
    public final int romeo;
    public final int sierra;

    public l(n nVar, int i4, boolean z2, float f5, aq aqVar, float f10, boolean z10, ab abVar, Q0.d dVar, int i5, Function1 function1, Function1 function12, List list, int i10, int i11, int i12, K k6, int i13, int i14) {
        this.alpha = nVar;
        this.bravo = i4;
        this.charlie = z2;
        this.delta = f5;
        this.echo = aqVar;
        this.foxtrot = f10;
        this.golf = z10;
        this.hotel = abVar;
        this.india = dVar;
        this.juliet = i5;
        this.kilo = function1;
        this.lima = function12;
        this.mike = list;
        this.november = i10;
        this.oscar = i11;
        this.papa = i12;
        this.quebec = k6;
        this.romeo = i13;
        this.sierra = i14;
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

    public final l foxtrot(int i4, boolean z2) {
        n nVar;
        int i5;
        boolean z10;
        K k6;
        if (!this.golf) {
            List list = this.mike;
            if (!list.isEmpty() && (nVar = this.alpha) != null && (i5 = this.bravo - i4) >= 0 && i5 < nVar.golf) {
                m mVar = (m) CollectionsKt.gold(list);
                m mVar2 = (m) CollectionsKt.ochre(list);
                if (!mVar.romeo && !mVar2.romeo) {
                    K k10 = this.quebec;
                    int i10 = this.oscar;
                    int i11 = this.november;
                    if (i4 < 0) {
                        if (Math.min((A0.alpha(mVar, k10) + mVar.lima) - i11, (A0.alpha(mVar2, k10) + mVar2.lima) - i10) <= (-i4)) {
                            return null;
                        }
                    } else if (Math.min(i11 - A0.alpha(mVar, k10), i10 - A0.alpha(mVar2, k10)) <= i4) {
                        return null;
                    }
                    int size = list.size();
                    int i12 = 0;
                    while (i12 < size) {
                        m mVar3 = (m) list.get(i12);
                        if (mVar3.romeo) {
                            k6 = k10;
                        } else {
                            long j5 = mVar3.oscar;
                            k6 = k10;
                            mVar3.oscar = (((int) (j5 >> 32)) << 32) | ((((int) (j5 & 4294967295L)) + i4) & 4294967295L);
                            if (z2) {
                                int size2 = mVar3.echo.size();
                                for (int i13 = 0; i13 < size2; i13++) {
                                    mVar3.hotel.alpha(i13, mVar3.bravo);
                                }
                            }
                        }
                        i12++;
                        k10 = k6;
                    }
                    K k11 = k10;
                    if (!this.charlie && i4 <= 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    return new l(this.alpha, i5, z10, i4, this.echo, this.foxtrot, this.golf, this.hotel, this.india, this.juliet, this.kilo, this.lima, this.mike, this.november, this.oscar, this.papa, k11, this.romeo, this.sierra);
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
