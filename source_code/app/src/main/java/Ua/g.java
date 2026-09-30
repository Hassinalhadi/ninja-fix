package Ua;

import android.content.DialogInterface;
import delivery.samurai.android.ui.common.LocationInfoActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ LocationInfoActivity purple;

    public /* synthetic */ g(LocationInfoActivity locationInfoActivity, int i4) {
        this.alpha = i4;
        this.purple = locationInfoActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.alpha) {
            case 0:
                LocationInfoActivity locationInfoActivity = this.purple;
                locationInfoActivity.f12241M = false;
                locationInfoActivity.f12240L = null;
                return;
            default:
                LocationInfoActivity locationInfoActivity2 = this.purple;
                locationInfoActivity2.f12242N = false;
                locationInfoActivity2.f12240L = null;
                return;
        }
    }
}
