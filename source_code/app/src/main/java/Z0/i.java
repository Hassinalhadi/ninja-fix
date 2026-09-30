package Z0;

import a1.n;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class i extends d {

    /* renamed from: i, reason: collision with root package name */
    public d[] f2512i = new d[4];

    /* renamed from: j, reason: collision with root package name */
    public int f2513j = 0;

    public final void lavender(int i4, n nVar, ArrayList arrayList) {
        for (int i5 = 0; i5 < this.f2513j; i5++) {
            d dVar = this.f2512i[i5];
            ArrayList arrayList2 = nVar.alpha;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i10 = 0; i10 < this.f2513j; i10++) {
            a1.h.bravo(this.f2512i[i10], i4, arrayList, nVar);
        }
    }

    public void lime() {
    }
}
