package a7;

import ae.ae;
import android.window.OnBackInvokedCallback;
import androidx.appcompat.app.ab;

/* renamed from: a7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0408c implements OnBackInvokedCallback {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ C0408c(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    public final void onBackInvoked() {
        switch (this.alpha) {
            case 0:
                ((InterfaceC0407b) this.bravo).bravo();
                return;
            case 1:
                ((ae) this.bravo).invoke();
                return;
            case 2:
                ((ab) this.bravo).bronze();
                return;
            default:
                ((Runnable) this.bravo).run();
                return;
        }
    }
}
