package F;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class B0 implements OnBackInvokedCallback {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 bravo;

    public /* synthetic */ B0(Function0 function0, int i4) {
        this.alpha = i4;
        this.bravo = function0;
    }

    public final void onBackInvoked() {
        switch (this.alpha) {
            case 0:
                this.bravo.invoke();
                return;
            default:
                Function0 function0 = this.bravo;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
        }
    }
}
