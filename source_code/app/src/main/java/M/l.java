package M;

import fe.C1713e;
import fe.C1715g;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;
import pf.C2363m;
import s6.J4;

/* loaded from: classes3.dex */
public final class l extends kotlin.collections.a {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ l(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        switch (this.alpha) {
            case 0:
                c cVar = (c) this.purple;
                cVar.getClass();
                return cVar.purple;
            default:
                return ((kotlin.text.k) this.purple).alpha.groupCount() + 1;
        }
    }

    public kotlin.text.i bravo(int i4) {
        kotlin.text.k kVar = (kotlin.text.k) this.purple;
        Matcher matcher = kVar.alpha;
        C1715g hotel = J4.hotel(matcher.start(i4), matcher.end(i4));
        if (hotel.alpha >= 0) {
            String group = kVar.alpha.group(i4);
            Intrinsics.delta(group, "group(...)");
            return new kotlin.text.i(hotel, group);
        }
        return null;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                return ((c) this.purple).containsValue(obj);
            default:
                if (obj == null) {
                    z2 = true;
                } else {
                    z2 = obj instanceof kotlin.text.i;
                }
                if (!z2) {
                    return false;
                }
                return super.contains((kotlin.text.i) obj);
        }
    }

    @Override // kotlin.collections.a, java.util.Collection
    public boolean isEmpty() {
        switch (this.alpha) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                c cVar = (c) this.purple;
                n[] nVarArr = new n[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    nVarArr[i4] = new o(2);
                }
                return new d(cVar.alpha, nVarArr);
            default:
                return new C2363m(AbstractC2360j.oscar(CollectionsKt.beige(new C1713e(0, size() - 1, 1)), new Function1() { // from class: kotlin.text.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return M.l.this.bravo(((Integer) obj).intValue());
                    }
                }));
        }
    }
}
