package zendesk.support;

import com.zendesk.util.StringUtils;
import java.util.HashMap;
import java.util.Map;
import zendesk.core.BlipsGroup;
import zendesk.core.BlipsProvider;
import zendesk.core.UserAction;

/* loaded from: classes.dex */
class ZendeskSupportBlipsProvider implements SupportBlipsProvider {
    private static final String BLIPS_FIELD_NAME_REQUEST_ID = "requestId";
    private static final String BLIPS_SUPPORT_ACTION_INIT = "init";
    private static final String BLIPS_SUPPORT_ACTION_REQUEST_CREATED = "requestCreated";
    private static final String BLIPS_SUPPORT_ACTION_REQUEST_LIST_VIEWED = "requestListViewed";
    private static final String BLIPS_SUPPORT_ACTION_REQUEST_UPDATED = "requestUpdated";
    private static final String BLIPS_SUPPORT_ACTION_REQUEST_VIEWED = "requestViewed";
    private static final String BLIPS_SUPPORT_CATEGORY = "SupportSDK";
    private static final String BLIPS_SUPPORT_CHANNEL = "support_sdk";
    private static final String BLIPS_SUPPORT_VERSION = "5.3.0";
    private BlipsProvider blipsProvider;

    public ZendeskSupportBlipsProvider(BlipsProvider blipsProvider) {
        this.blipsProvider = blipsProvider;
    }

    private void sendUserAction(BlipsGroup blipsGroup, String str, Map<String, Object> map) {
        this.blipsProvider.sendBlip(new UserAction("5.3.0", BLIPS_SUPPORT_CHANNEL, BLIPS_SUPPORT_CATEGORY, str, null, map), blipsGroup);
    }

    @Override // zendesk.support.SupportBlipsProvider
    public void requestCreated(String str) {
        if (StringUtils.isEmpty(str)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(BLIPS_FIELD_NAME_REQUEST_ID, str);
        sendUserAction(BlipsGroup.BEHAVIOURAL, BLIPS_SUPPORT_ACTION_REQUEST_CREATED, hashMap);
    }

    @Override // zendesk.support.SupportBlipsProvider
    public void requestListViewed() {
        sendUserAction(BlipsGroup.BEHAVIOURAL, BLIPS_SUPPORT_ACTION_REQUEST_LIST_VIEWED, null);
    }

    @Override // zendesk.support.SupportBlipsProvider
    public void requestUpdated(String str) {
        if (StringUtils.isEmpty(str)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(BLIPS_FIELD_NAME_REQUEST_ID, str);
        sendUserAction(BlipsGroup.BEHAVIOURAL, BLIPS_SUPPORT_ACTION_REQUEST_UPDATED, hashMap);
    }

    @Override // zendesk.support.SupportBlipsProvider
    public void requestViewed(String str) {
        if (StringUtils.isEmpty(str)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(BLIPS_FIELD_NAME_REQUEST_ID, str);
        sendUserAction(BlipsGroup.BEHAVIOURAL, BLIPS_SUPPORT_ACTION_REQUEST_VIEWED, hashMap);
    }

    @Override // zendesk.support.SupportBlipsProvider
    public void supportSdkInit() {
        sendUserAction(BlipsGroup.REQUIRED, BLIPS_SUPPORT_ACTION_INIT, null);
    }
}
