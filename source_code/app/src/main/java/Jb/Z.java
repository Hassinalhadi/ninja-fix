package Jb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import kotlin.jvm.internal.Intrinsics;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class Z extends BroadcastReceiver {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ OrdersFragmentV2 bravo;

    public /* synthetic */ Z(OrdersFragmentV2 ordersFragmentV2, int i4) {
        this.alpha = i4;
        this.bravo = ordersFragmentV2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        switch (this.alpha) {
            case 0:
                if (intent != null) {
                    str = intent.getAction();
                } else {
                    str = null;
                }
                final OrdersFragmentV2 ordersFragmentV2 = this.bravo;
                if (Intrinsics.areEqual(str, ordersFragmentV2.uniform().action("ACCURACY_DEGRADED"))) {
                    C3462a.alpha("LocationFlow", 12, "Received accuracy degraded broadcast in OrdersFragment", null);
                    if (context == null) {
                        context = ordersFragmentV2.requireContext();
                        Intrinsics.delta(context, "requireContext(...)");
                    }
                    if (L9.d.victor(context)) {
                        C3462a.alpha("LocationFlow", 12, "[ACCURACY_FALSE_POSITIVE] Accuracy degraded broadcast received but accuracy is actually HIGH - ignoring (false positive)", null);
                        return;
                    }
                    C3462a.alpha("LocationFlow", 12, "[ACCURACY_VERIFIED] Accuracy is actually degraded - showing warning dialog", null);
                    if (!ordersFragmentV2.f12305m) {
                        ordersFragmentV2.f12305m = true;
                        Fe.c cVar = new Fe.c(ordersFragmentV2.requireContext());
                        String string = ordersFragmentV2.getString(R.string.location_accuracy_reduced_title);
                        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) cVar.red;
                        dVar.delta = string;
                        dVar.foxtrot = ordersFragmentV2.getString(R.string.location_accuracy_reduced_message);
                        final int i4 = 2;
                        cVar.mike(ordersFragmentV2.getString(R.string.open_settings), new DialogInterface.OnClickListener() { // from class: Jb.X
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                switch (i4) {
                                    case 0:
                                        OrdersFragmentV2 ordersFragmentV22 = ordersFragmentV2;
                                        try {
                                            ordersFragmentV22.startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
                                            return;
                                        } catch (Exception unused) {
                                            ordersFragmentV22.startActivity(new Intent("android.settings.SETTINGS"));
                                            return;
                                        }
                                    case 1:
                                        C3462a.alpha("LocationFlow", 12, "🔄 [SWITCH_TOGGLE] User confirmed disable - calling API", null);
                                        OrdersFragmentV2 ordersFragmentV23 = ordersFragmentV2;
                                        if (!ordersFragmentV23.f12314v.bravo(false)) {
                                            dialogInterface.dismiss();
                                            return;
                                        } else {
                                            ordersFragmentV23.azure(false);
                                            dialogInterface.dismiss();
                                            return;
                                        }
                                    case 2:
                                        OrdersFragmentV2 ordersFragmentV24 = ordersFragmentV2;
                                        try {
                                            ordersFragmentV24.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                                            return;
                                        } catch (Exception unused2) {
                                            Context requireContext = ordersFragmentV24.requireContext();
                                            Intrinsics.delta(requireContext, "requireContext(...)");
                                            String string2 = ordersFragmentV24.getString(R.string.unable_to_open_settings);
                                            Intrinsics.delta(string2, "getString(...)");
                                            L9.d.pink(requireContext, string2);
                                            return;
                                        }
                                    default:
                                        OrdersFragmentV2 ordersFragmentV25 = ordersFragmentV2;
                                        try {
                                            ordersFragmentV25.startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
                                            return;
                                        } catch (Exception unused3) {
                                            ordersFragmentV25.startActivity(new Intent("android.settings.SETTINGS"));
                                            return;
                                        }
                                }
                            }
                        });
                        cVar.lima(ordersFragmentV2.getString(R.string.later), new ar(2));
                        dVar.mike = true;
                        final int i5 = 1;
                        dVar.november = new DialogInterface.OnDismissListener() { // from class: Jb.Y
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                switch (i5) {
                                    case 0:
                                        ordersFragmentV2.f12308p = null;
                                        return;
                                    default:
                                        OrdersFragmentV2 ordersFragmentV22 = ordersFragmentV2;
                                        ordersFragmentV22.f12305m = false;
                                        ordersFragmentV22.f12307o = null;
                                        return;
                                }
                            }
                        };
                        androidx.appcompat.app.g foxtrot = cVar.foxtrot();
                        ordersFragmentV2.f12307o = foxtrot;
                        foxtrot.show();
                        return;
                    }
                    return;
                }
                if (Intrinsics.areEqual(str, ordersFragmentV2.uniform().action("ACCURACY_RESTORED"))) {
                    C3462a.alpha("LocationFlow", 12, "Received accuracy restored broadcast in OrdersFragment", null);
                    androidx.appcompat.app.g gVar = ordersFragmentV2.f12307o;
                    if (gVar != null) {
                        gVar.dismiss();
                    }
                    ordersFragmentV2.f12307o = null;
                    ordersFragmentV2.f12305m = false;
                    return;
                }
                if (Intrinsics.areEqual(str, ordersFragmentV2.uniform().action("LOCATION_STUCK"))) {
                    C3462a.alpha("LocationFlow", 12, "Received location stuck broadcast in OrdersFragmentV2", null);
                    if (ordersFragmentV2.isAdded() && !ordersFragmentV2.requireActivity().isFinishing()) {
                        androidx.appcompat.app.g gVar2 = ordersFragmentV2.f12308p;
                        if (gVar2 == null || !gVar2.isShowing()) {
                            Fe.c cVar2 = new Fe.c(ordersFragmentV2.requireContext());
                            String string2 = ordersFragmentV2.getString(R.string.location_stuck_title);
                            androidx.appcompat.app.d dVar2 = (androidx.appcompat.app.d) cVar2.red;
                            dVar2.delta = string2;
                            dVar2.foxtrot = ordersFragmentV2.getString(R.string.location_stuck_message);
                            final int i10 = 0;
                            cVar2.mike(ordersFragmentV2.getString(R.string.location_stuck_open_settings), new DialogInterface.OnClickListener() { // from class: Jb.X
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i52) {
                                    switch (i10) {
                                        case 0:
                                            OrdersFragmentV2 ordersFragmentV22 = ordersFragmentV2;
                                            try {
                                                ordersFragmentV22.startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
                                                return;
                                            } catch (Exception unused) {
                                                ordersFragmentV22.startActivity(new Intent("android.settings.SETTINGS"));
                                                return;
                                            }
                                        case 1:
                                            C3462a.alpha("LocationFlow", 12, "🔄 [SWITCH_TOGGLE] User confirmed disable - calling API", null);
                                            OrdersFragmentV2 ordersFragmentV23 = ordersFragmentV2;
                                            if (!ordersFragmentV23.f12314v.bravo(false)) {
                                                dialogInterface.dismiss();
                                                return;
                                            } else {
                                                ordersFragmentV23.azure(false);
                                                dialogInterface.dismiss();
                                                return;
                                            }
                                        case 2:
                                            OrdersFragmentV2 ordersFragmentV24 = ordersFragmentV2;
                                            try {
                                                ordersFragmentV24.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                                                return;
                                            } catch (Exception unused2) {
                                                Context requireContext = ordersFragmentV24.requireContext();
                                                Intrinsics.delta(requireContext, "requireContext(...)");
                                                String string22 = ordersFragmentV24.getString(R.string.unable_to_open_settings);
                                                Intrinsics.delta(string22, "getString(...)");
                                                L9.d.pink(requireContext, string22);
                                                return;
                                            }
                                        default:
                                            OrdersFragmentV2 ordersFragmentV25 = ordersFragmentV2;
                                            try {
                                                ordersFragmentV25.startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
                                                return;
                                            } catch (Exception unused3) {
                                                ordersFragmentV25.startActivity(new Intent("android.settings.SETTINGS"));
                                                return;
                                            }
                                    }
                                }
                            });
                            dVar2.india = dVar2.alpha.getText(android.R.string.ok);
                            dVar2.juliet = null;
                            final int i11 = 0;
                            dVar2.november = new DialogInterface.OnDismissListener() { // from class: Jb.Y
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i11) {
                                        case 0:
                                            ordersFragmentV2.f12308p = null;
                                            return;
                                        default:
                                            OrdersFragmentV2 ordersFragmentV22 = ordersFragmentV2;
                                            ordersFragmentV22.f12305m = false;
                                            ordersFragmentV22.f12307o = null;
                                            return;
                                    }
                                }
                            };
                            ordersFragmentV2.f12308p = cVar2.november();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C3462a.alpha("LocationFlow", 12, "Received compliance violation broadcast from service in OrdersFragment", null);
                this.bravo.romeo();
                return;
        }
    }
}
