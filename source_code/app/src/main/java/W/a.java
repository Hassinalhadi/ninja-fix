package W;

import A0.p;
import O7.j;
import T.r;
import W.a;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import bv.C0762a;
import s0.AbstractC2557q;
import s0.F;
import s0.i0;
import t0.C2915g0;

/* loaded from: classes3.dex */
public final class a implements View.OnDragListener, c {
    public final g alpha;
    public final bv.f bravo;
    public final AndroidDragAndDropManager$modifier$1 charlie;

    /* JADX WARN: Type inference failed for: r0v0, types: [W.g, T.r] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public a() {
        ?? rVar = new r();
        rVar.red = 0L;
        this.alpha = rVar;
        this.bravo = new bv.f(0);
        this.charlie = new F() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            @Override // s0.F
            public final r create() {
                return a.this.alpha;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return a.this.alpha.hashCode();
            }

            @Override // s0.F
            public final void inspectableProperties(C2915g0 c2915g0) {
                c2915g0.alpha = "RootDragAndDropNode";
            }

            @Override // s0.F
            public final /* bridge */ /* synthetic */ void update(r rVar2) {
            }
        };
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.q, java.lang.Object] */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        j jVar = new j(12, dragEvent);
        int action = dragEvent.getAction();
        g gVar = this.alpha;
        bv.f fVar = this.bravo;
        switch (action) {
            case 1:
                ?? obj = new Object();
                e eVar = new e(jVar, gVar, obj);
                if (eVar.invoke(gVar) == i0.alpha) {
                    AbstractC2557q.romeo(gVar, eVar);
                }
                boolean z2 = obj.alpha;
                fVar.getClass();
                C0762a c0762a = new C0762a(fVar);
                while (c0762a.hasNext()) {
                    ((g) c0762a.next()).f(jVar);
                }
                return z2;
            case 2:
                gVar.e(jVar);
                return false;
            case 3:
                return gVar.b(jVar);
            case 4:
                p pVar = new p(20, jVar);
                if (pVar.invoke(gVar) == i0.alpha) {
                    AbstractC2557q.romeo(gVar, pVar);
                }
                fVar.clear();
                return false;
            case 5:
                gVar.c(jVar);
                return false;
            case 6:
                gVar.d(jVar);
                return false;
            default:
                return false;
        }
    }
}
