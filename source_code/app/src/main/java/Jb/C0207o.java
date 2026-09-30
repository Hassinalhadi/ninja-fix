package Jb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import z3.C3462a;

/* renamed from: Jb.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0207o extends BroadcastReceiver {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0208p bravo;

    public /* synthetic */ C0207o(C0208p c0208p, int i4) {
        this.alpha = i4;
        this.bravo = c0208p;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        switch (this.alpha) {
            case 0:
                if (intent != null) {
                    str = intent.getStringExtra("ORDER_ID");
                } else {
                    str = null;
                }
                if (str != null) {
                    Integer.parseInt(str);
                    this.bravo.sierra();
                    return;
                }
                return;
            case 1:
                C3462a.alpha("FCM_DELIVERY", 12, "fetch source=broadcast fragment=ActiveOrdersFragmentV2", null);
                this.bravo.sierra();
                return;
            default:
                this.bravo.sierra();
                return;
        }
    }
}
