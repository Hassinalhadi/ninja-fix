package A2;

import android.os.Trace;
import androidx.lifecycle.az;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t6.P2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements Runnable {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ ag(aa aaVar, String str, Function0 function0, az azVar, V0.h hVar) {
        this.red = aaVar;
        this.purple = str;
        this.silver = function0;
        this.teal = azVar;
        this.white = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S.c cVar;
        S.c black;
        switch (this.alpha) {
            case 0:
                String label = this.purple;
                Function0 function0 = (Function0) this.silver;
                az azVar = (az) this.teal;
                V0.h hVar = (V0.h) this.white;
                ((aa) this.red).getClass();
                boolean delta = P2.delta();
                if (delta) {
                    try {
                        Intrinsics.echo(label, "label");
                        Trace.beginSection(P2.foxtrot(label));
                    } finally {
                        if (delta) {
                        }
                    }
                }
                try {
                    function0.invoke();
                    ae aeVar = aa.bravo;
                    azVar.postValue(aeVar);
                    hVar.bravo(aeVar);
                } catch (Throwable th) {
                    azVar.postValue(new ad(th));
                    hVar.delta(th);
                }
                if (delta) {
                    return;
                } else {
                    return;
                }
            default:
                D0.an anVar = (D0.an) this.red;
                Q0.n nVar = (Q0.n) this.silver;
                String str = this.purple;
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
                                new L0.d(str, D0.ae.hotel(anVar, nVar), CollectionsKt.emptyList(), CollectionsKt.emptyList(), jVar, dVar).romeo();
                                black.whiskey().bravo();
                                return;
                            } finally {
                                S.g.quebec(juliet);
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

    public /* synthetic */ ag(D0.an anVar, Q0.n nVar, String str, Q0.d dVar, H0.j jVar) {
        this.red = anVar;
        this.silver = nVar;
        this.purple = str;
        this.teal = dVar;
        this.white = jVar;
    }
}
