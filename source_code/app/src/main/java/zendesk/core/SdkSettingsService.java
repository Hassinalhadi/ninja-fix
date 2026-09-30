package zendesk.core;

import com.google.gson.q;
import java.util.Map;
import vg.d;
import yg.f;
import yg.i;
import yg.s;

/* loaded from: classes.dex */
interface SdkSettingsService {
    @f("/api/private/mobile_sdk/settings/{applicationId}.json")
    d<Map<String, q>> getSettings(@i("Accept-Language") String str, @s("applicationId") String str2);
}
