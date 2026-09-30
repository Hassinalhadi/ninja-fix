package d3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.L;
import ao.ad;
import com.app.network.network.models.PayLoad;
import com.app.util.log.FcmDeliveryDropException;
import delivery.samurai.android.R;
import java.io.Serializable;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import z3.C3462a;
import z9.C3488e;

/* renamed from: d3.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1587c extends BroadcastReceiver {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ k bravo;

    public /* synthetic */ C1587c(k kVar, int i4) {
        this.alpha = i4;
        this.bravo = kVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Serializable serializable;
        PayLoad payLoad;
        String str;
        String str2;
        String str3;
        String[] strArr;
        String str4;
        switch (this.alpha) {
            case 0:
                k kVar = this.bravo;
                if (!kVar.f12053s) {
                    C3488e mike = kVar.mike();
                    String string = kVar.getString(R.string.app_name);
                    Intrinsics.delta(string, "getString(...)");
                    String string2 = kVar.getString(R.string.delete_vpn_apps_message);
                    Intrinsics.delta(string2, "getString(...)");
                    String string3 = kVar.getString(android.R.string.ok);
                    Intrinsics.delta(string3, "getString(...)");
                    com.google.android.material.datepicker.j.uniform(mike, kVar, string, string2, string3, new X9.l(kVar, 5));
                    kVar.f12053s = true;
                    return;
                }
                return;
            case 1:
                String str5 = null;
                if (intent != null) {
                    serializable = intent.getSerializableExtra("payload");
                } else {
                    serializable = null;
                }
                if (serializable instanceof PayLoad) {
                    payLoad = (PayLoad) serializable;
                } else {
                    payLoad = null;
                }
                k kVar2 = this.bravo;
                if (!kVar2.isFinishing() && !kVar2.isDestroyed() && !kVar2.getSupportFragmentManager().jade()) {
                    if (payLoad != null) {
                        str3 = payLoad.getType();
                    } else {
                        str3 = null;
                    }
                    C3462a.alpha("FCM_DELIVERY", 12, av.q.foxtrot("deeplink_routed type=", str3, " activity=", kVar2.getClass().getSimpleName()), null);
                    if (payLoad != null) {
                        kVar2.beige(payLoad, true);
                        return;
                    }
                    return;
                }
                String simpleName = kVar2.getClass().getSimpleName();
                if (payLoad != null) {
                    str = payLoad.getType();
                } else {
                    str = null;
                }
                boolean isFinishing = kVar2.isFinishing();
                boolean isDestroyed = kVar2.isDestroyed();
                boolean jade = kVar2.getSupportFragmentManager().jade();
                StringBuilder india = av.q.india("deeplink_dropped reason=stateSaved activity=", simpleName, " type=", str, " isFinishing=");
                india.append(isFinishing);
                india.append(" isDestroyed=");
                india.append(isDestroyed);
                india.append(" isStateSaved=");
                india.append(jade);
                C3462a.alpha("FCM_DELIVERY", 12, india.toString(), null);
                w9.i iVar = C3462a.alpha;
                if (iVar != null) {
                    if (payLoad != null) {
                        str2 = payLoad.getType();
                    } else {
                        str2 = null;
                    }
                    String foxtrot = av.q.foxtrot("deeplink_dropped reason=stateSaved activity=", simpleName, " type=", str2);
                    if (payLoad != null) {
                        str5 = payLoad.getType();
                    }
                    iVar.alpha("FCM_DELIVERY", foxtrot, new FcmDeliveryDropException(av.q.foxtrot("stateSaved activity=", simpleName, " type=", str5)));
                    return;
                }
                return;
            case 2:
                if (intent != null) {
                    strArr = intent.getStringArrayExtra("FAKE_APP_NAMES");
                } else {
                    strArr = null;
                }
                String[] strArr2 = strArr;
                k kVar3 = this.bravo;
                if (!kVar3.f12052r && strArr2 != null) {
                    C3488e mike2 = kVar3.mike();
                    String string4 = kVar3.getString(R.string.app_name);
                    Intrinsics.delta(string4, "getString(...)");
                    String amber = ad.amber(kVar3.getString(R.string.delete_fake_gps_apps_message), " :\n", ArraysKt.magenta(strArr2, "\n", null, null, null, 62));
                    String string5 = kVar3.getString(android.R.string.ok);
                    Intrinsics.delta(string5, "getString(...)");
                    com.google.android.material.datepicker.j.uniform(mike2, kVar3, string4, amber, string5, new X9.l(kVar3, 6));
                    kVar3.f12052r = true;
                    return;
                }
                return;
            case 3:
                k kVar4 = this.bravo;
                kVar4.mike();
                L supportFragmentManager = kVar4.getSupportFragmentManager();
                Intrinsics.delta(supportFragmentManager, "getSupportFragmentManager(...)");
                if (supportFragmentManager.blue("FusedLocationFoundDialog") == null) {
                    new Ua.r().romeo(supportFragmentManager, "FusedLocationFoundDialog");
                    return;
                }
                return;
            case 4:
                boolean z2 = false;
                if (intent != null && intent.getBooleanExtra("REFRESH_SILENT", false)) {
                    z2 = true;
                }
                k kVar5 = this.bravo;
                k.fuchsia(kVar5);
                kVar5.amber(z2);
                return;
            default:
                if (intent != null) {
                    str4 = intent.getAction();
                } else {
                    str4 = null;
                }
                if (Intrinsics.areEqual(str4, "com.app.base.ACTION_SESSION_INVALIDATED")) {
                    k kVar6 = this.bravo;
                    if (!kVar6.isFinishing() && !kVar6.isDestroyed()) {
                        kVar6.romeo();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
