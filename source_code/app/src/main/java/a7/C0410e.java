package a7;

import ae.C0423b;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: a7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0410e implements OnBackAnimationCallback {
    public final /* synthetic */ InterfaceC0407b alpha;
    public final /* synthetic */ C0411f bravo;

    public C0410e(C0411f c0411f, InterfaceC0407b interfaceC0407b) {
        this.bravo = c0411f;
        this.alpha = interfaceC0407b;
    }

    public final void onBackCancelled() {
        if (this.bravo.alpha != null) {
            this.alpha.delta();
        }
    }

    public final void onBackInvoked() {
        this.alpha.bravo();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.bravo.alpha != null) {
            this.alpha.alpha(new C0423b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.bravo.alpha != null) {
            this.alpha.charlie(new C0423b(backEvent));
        }
    }
}
