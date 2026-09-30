package Jb;

import android.content.DialogInterface;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class ar implements DialogInterface.OnClickListener {
    public final /* synthetic */ int alpha;

    public /* synthetic */ ar(int i4) {
        this.alpha = i4;
    }

    private final void alpha(DialogInterface dialogInterface, int i4) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.alpha) {
            case 0:
                int i5 = HomeActivityV2.f12269k0;
                return;
            case 1:
                C3462a.alpha("LocationFlow", 12, "🔄 [SWITCH_TOGGLE] User cancelled disable", null);
                dialogInterface.dismiss();
                return;
            case 2:
                return;
            default:
                int i10 = ProcessOrderActivityV2.f12378N0;
                C3462a.alpha("LocationFlow", 12, "LOCATION_STUCK_DIALOG_DISMISSED", null);
                dialogInterface.dismiss();
                return;
        }
    }
}
