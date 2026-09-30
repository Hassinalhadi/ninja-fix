package N9;

import android.util.Log;
import com.app.network.network.models.Captain;
import com.app.network.network.models.UserInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m {
    public final q3.e alpha;

    public m(q3.e backend) {
        Intrinsics.echo(backend, "backend");
        this.alpha = backend;
    }

    public final void alpha(UserInfo userInfo) {
        Captain captain;
        Integer id2;
        Integer platformId;
        Integer defaultCityId;
        if (userInfo != null && (captain = userInfo.getCaptain()) != null && (id2 = captain.getId()) != null) {
            int intValue = id2.intValue();
            Ld.g gVar = new Ld.g();
            Captain captain2 = userInfo.getCaptain();
            if (captain2 != null && (defaultCityId = captain2.getDefaultCityId()) != null) {
            }
            Captain captain3 = userInfo.getCaptain();
            if (captain3 != null && (platformId = captain3.getPlatformId()) != null) {
            }
            gVar.put("versionCode", "516");
            Ld.g bravo = gVar.bravo();
            Log.d("UnleashContext", "updateContext → captainId=" + intValue + " cityId=" + bravo.get("cityId") + " platformId=" + bravo.get("platformId") + " versionCode=" + bravo.get("versionCode"));
            this.alpha.alpha(String.valueOf(intValue), bravo);
            return;
        }
        Log.d("UnleashContext", "updateContext SKIPPED — captain is null");
    }
}
