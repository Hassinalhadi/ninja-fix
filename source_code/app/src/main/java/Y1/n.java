package Y1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ r purple;

    public /* synthetic */ n(r rVar, int i4) {
        this.alpha = i4;
        this.purple = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r0.bravo() > 1) goto L12;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z2;
        switch (this.alpha) {
            case 0:
                r rVar = this.purple;
                q qVar = rVar.foxtrot;
                if (rVar.golf) {
                    z2 = true;
                    break;
                }
                z2 = false;
                qVar.setEnabled(z2);
                return Unit.INSTANCE;
            default:
                r rVar2 = this.purple;
                rVar2.getClass();
                return new ah(rVar2.alpha, rVar2.bravo.sierra);
        }
    }
}
