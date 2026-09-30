package la;

import delivery.samurai.android.ui.agreement.Agreement;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Agreement purple;

    public /* synthetic */ c(Agreement agreement, int i4) {
        this.alpha = i4;
        this.purple = agreement;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return Agreement.gray(this.purple);
            default:
                return Agreement.gold(this.purple);
        }
    }
}
