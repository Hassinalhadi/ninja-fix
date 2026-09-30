package s6;

import android.content.Context;
import com.app.network.network.models.Captain;
import com.app.network.network.models.UserInfo;
import com.google.firebase.analytics.FirebaseAnalytics;
import g0.C1726f;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class C0 {
    public static C1726f alpha;

    public static final void alpha(Context context, UserInfo userInfo) {
        String str;
        Captain captain;
        Integer id2;
        Intrinsics.echo(context, "context");
        if (userInfo == null) {
            try {
                userInfo = L9.d.sierra(context);
            } catch (Exception unused) {
                return;
            }
        }
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        Intrinsics.delta(firebaseAnalytics, "getInstance(...)");
        com.google.android.gms.internal.measurement.J j5 = firebaseAnalytics.alpha;
        if (userInfo != null && (captain = userInfo.getCaptain()) != null && (id2 = captain.getId()) != null) {
            str = id2.toString();
        } else {
            str = null;
        }
        j5.getClass();
        j5.bravo(new com.google.android.gms.internal.measurement.az(j5, str, 0));
        for (Map.Entry entry : B0.alpha(userInfo).entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            j5.getClass();
            j5.bravo(new com.google.android.gms.internal.measurement.aw(j5, null, str2, str3, false, 0));
        }
    }
}
