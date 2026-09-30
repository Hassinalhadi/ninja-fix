package W;

import O7.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import p0.AbstractC2264a;
import s0.i0;

/* loaded from: classes3.dex */
public final class e extends Lambda implements Function1 {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ q purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, g gVar, q qVar) {
        super(1);
        this.purple = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                g gVar = (g) obj;
                if (!gVar.isAttached()) {
                    return i0.purple;
                }
                if (gVar.purple != null) {
                    AbstractC2264a.bravo("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                gVar.purple = null;
                q qVar = this.purple;
                qVar.alpha = qVar.alpha;
                return i0.alpha;
            default:
                if (((m0.f) obj).red) {
                    this.purple.alpha = false;
                    return i0.red;
                }
                return i0.alpha;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar) {
        super(1);
        this.purple = qVar;
    }
}
