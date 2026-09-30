package a2;

import Y1.aj;
import Y1.as;
import Y1.at;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import yf.N;

@as("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La2/n;", "LY1/at;", "La2/m;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: a2.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0389n extends at {
    @Override // Y1.at
    public final Y1.aa alpha() {
        return new C0388m(this, new U0.t(7, false), AbstractC0379d.alpha);
    }

    @Override // Y1.at
    public final void delta(List list, aj ajVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bravo().hotel((Y1.l) it.next());
        }
    }

    @Override // Y1.at
    public final void india(Y1.l lVar, boolean z2) {
        bravo().foxtrot(lVar, z2);
        int lavender = CollectionsKt.lavender((Iterable) ((N) bravo().foxtrot.alpha).getValue(), lVar);
        int i4 = 0;
        for (Object obj : (Iterable) ((N) bravo().foxtrot.alpha).getValue()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Y1.l lVar2 = (Y1.l) obj;
            if (i4 > lavender) {
                bravo().charlie(lVar2);
            }
            i4 = i5;
        }
    }
}
