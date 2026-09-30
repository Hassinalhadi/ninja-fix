package Yb;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.app.feature.location.LocationBroadcastConfig;
import com.app.network.network.models.Order;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import kotlin.jvm.internal.Intrinsics;
import z3.C3462a;

/* renamed from: Yb.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0335v0 extends BroadcastReceiver {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ProcessOrderActivityV2 bravo;

    public /* synthetic */ C0335v0(ProcessOrderActivityV2 processOrderActivityV2, int i4) {
        this.alpha = i4;
        this.bravo = processOrderActivityV2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        String stringExtra;
        Integer tango;
        Integer id2;
        switch (this.alpha) {
            case 0:
                if (intent != null && (action = intent.getAction()) != null) {
                    ProcessOrderActivityV2 processOrderActivityV2 = this.bravo;
                    LocationBroadcastConfig locationBroadcastConfig = processOrderActivityV2.f12396M;
                    if (locationBroadcastConfig != null) {
                        if (Intrinsics.areEqual(action, locationBroadcastConfig.action("LOCATION_STUCK"))) {
                            C3462a.alpha("LocationFlow", 12, "ProcessOrderActivityV2 received LOCATION_STUCK", null);
                            if (!processOrderActivityV2.f12400P && !processOrderActivityV2.isDestroyed() && !processOrderActivityV2.isFinishing()) {
                                AlertDialog alertDialog = processOrderActivityV2.Q;
                                if (alertDialog != null) {
                                    alertDialog.dismiss();
                                }
                                processOrderActivityV2.Q = new AlertDialog.Builder(processOrderActivityV2).setTitle(R.string.location_stuck_title).setMessage(R.string.location_stuck_message).setCancelable(true).setPositiveButton(R.string.location_stuck_restart_service, new DialogInterfaceOnClickListenerC0318m0(processOrderActivityV2, 0)).setNeutralButton(R.string.location_stuck_open_settings, new DialogInterfaceOnClickListenerC0318m0(processOrderActivityV2, 1)).setNegativeButton(android.R.string.ok, new Jb.ar(3)).show();
                                processOrderActivityV2.f12400P = true;
                                return;
                            }
                            return;
                        }
                        LocationBroadcastConfig locationBroadcastConfig2 = processOrderActivityV2.f12396M;
                        if (locationBroadcastConfig2 != null) {
                            if (Intrinsics.areEqual(action, locationBroadcastConfig2.action("ACCURACY_RESTORED"))) {
                                C3462a.alpha("LocationFlow", 12, "ProcessOrderActivityV2 received ACCURACY_RESTORED — resetting stuck dialog flag", null);
                                processOrderActivityV2.f12400P = false;
                                AlertDialog alertDialog2 = processOrderActivityV2.Q;
                                if (alertDialog2 != null) {
                                    alertDialog2.dismiss();
                                }
                                processOrderActivityV2.Q = null;
                                return;
                            }
                            return;
                        }
                        Intrinsics.lima("broadcastConfig");
                        throw null;
                    }
                    Intrinsics.lima("broadcastConfig");
                    throw null;
                }
                return;
            default:
                if (intent != null && (stringExtra = intent.getStringExtra("ORDER_ID")) != null && (tango = kotlin.text.r.tango(stringExtra)) != null) {
                    int intValue = tango.intValue();
                    ProcessOrderActivityV2 processOrderActivityV22 = this.bravo;
                    Order order = processOrderActivityV22.f12418i0;
                    if (order != null && (id2 = order.getId()) != null && intValue == id2.intValue()) {
                        L9.d.uniform(processOrderActivityV22, intValue, true);
                        ((androidx.compose.runtime.t0) processOrderActivityV22.f12429t0).setValue(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
