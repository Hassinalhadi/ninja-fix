package Y1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class q extends ae.ac {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ Object bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar) {
        super(false);
        this.bravo = rVar;
    }

    @Override // ae.ac
    public final void handleOnBackPressed() {
        switch (this.alpha) {
            case 0:
                ((r) this.bravo).echo();
                return;
            default:
                ((Function1) this.bravo).invoke(this);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Function1 function1) {
        super(true);
        this.bravo = function1;
    }
}
