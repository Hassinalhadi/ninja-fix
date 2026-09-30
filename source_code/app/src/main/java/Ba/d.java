package Ba;

import android.content.DialogInterface;
import delivery.samurai.android.ui.auth.signup.step2personalinfo.AboutYouFragment;
import delivery.samurai.android.ui.homev2.HomeActivityV2;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ d(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.alpha) {
            case 0:
                ((AboutYouFragment) this.purple).f12219h = null;
                return;
            case 1:
                HomeActivityV2 homeActivityV2 = (HomeActivityV2) this.purple;
                homeActivityV2.f12296i0 = false;
                homeActivityV2.f12295h0 = null;
                return;
            default:
                ((V9.f) this.purple).invoke();
                return;
        }
    }
}
