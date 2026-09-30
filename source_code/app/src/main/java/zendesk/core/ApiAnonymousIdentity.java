package zendesk.core;

import com.zendesk.logger.Logger;
import com.zendesk.util.StringUtils;

/* loaded from: classes.dex */
class ApiAnonymousIdentity implements Identity {
    private static final transient String LOG_TAG = "ApiAnonymousIdentity";
    private String email;
    private String name;
    private String sdkGuid;

    public ApiAnonymousIdentity(AnonymousIdentity anonymousIdentity, String str) {
        if (StringUtils.isEmpty(str)) {
            this.sdkGuid = "";
            Logger.w(LOG_TAG, "SdkGuid cannot be null or empty.", new Object[0]);
        } else {
            this.sdkGuid = str;
        }
        if (anonymousIdentity == null) {
            Logger.w(LOG_TAG, "Identity is null.", new Object[0]);
        } else {
            this.email = anonymousIdentity.getEmail();
            this.name = anonymousIdentity.getName();
        }
    }
}
