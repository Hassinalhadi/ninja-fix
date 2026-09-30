package av;

import android.os.Trace;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.Z;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ k(D0.an anVar, Q0.n nVar, List list, D0.g gVar, Q0.d dVar, H0.j jVar) {
        this.alpha = 2;
        this.purple = anVar;
        this.red = nVar;
        this.yellow = list;
        this.silver = gVar;
        this.teal = dVar;
        this.white = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S.c cVar;
        S.c black;
        switch (this.alpha) {
            case 0:
                s sVar = (s) this.purple;
                String str = (String) this.red;
                P p4 = (P) this.silver;
                Z z2 = (Z) this.teal;
                C0509g c0509g = (C0509g) this.white;
                List list = (List) this.yellow;
                sVar.getClass();
                sVar.uniform("Use case " + str + " RESET", null);
                sVar.alpha.blue(str, p4, z2, c0509g, list);
                sVar.quebec();
                sVar.blue();
                sVar.gold();
                if (sVar.A == 9) {
                    sVar.beige();
                    return;
                }
                return;
            case 1:
                ((B9.ab) this.purple).yankee((InterfaceC0525x) this.red, (InterfaceC0525x) this.silver, (bj.k) this.teal, (bj.k) this.white, (Map.Entry) this.yellow);
                return;
            default:
                D0.an anVar = (D0.an) this.purple;
                Q0.n nVar = (Q0.n) this.red;
                D0.g gVar = (D0.g) this.silver;
                Q0.d dVar = (Q0.d) this.teal;
                H0.j jVar = (H0.j) this.white;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    S.g kilo = S.n.kilo();
                    if (kilo instanceof S.c) {
                        cVar = (S.c) kilo;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null && (black = cVar.black(null, null)) != null) {
                        try {
                            S.g juliet = black.juliet();
                            try {
                                D0.an hotel = D0.ae.hotel(anVar, nVar);
                                List list2 = (List) this.yellow;
                                if (list2 == null) {
                                    list2 = CollectionsKt.emptyList();
                                }
                                new B9.ab(gVar, hotel, list2, dVar, jVar).romeo();
                                S.g.quebec(juliet);
                                black.whiskey().bravo();
                                return;
                            } catch (Throwable th) {
                                S.g.quebec(juliet);
                                throw th;
                            }
                        } finally {
                        }
                    } else {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                } finally {
                    Trace.endSection();
                }
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
        this.white = obj5;
        this.yellow = obj6;
    }
}
