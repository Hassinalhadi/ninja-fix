package K4;

import Nd.c;
import com.checkout.components.insight.data.dto.Events;
import com.checkout.components.insight.data.remote.InsightApi;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ Object alpha(InsightApi insightApi, String str, String str2, String str3, String str4, Events events, c cVar, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                str = "application/json";
            }
            if ((i4 & 4) != 0) {
                str3 = "CheckoutAndroidComponents";
            }
            if ((i4 & 8) != 0) {
                str4 = "2.1.0";
            }
            return insightApi.sendLogBatch(str, str2, str3, str4, events, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendLogBatch");
    }
}
