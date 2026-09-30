package zendesk.support;

import com.zendesk.service.ZendeskCallback;

/* loaded from: classes.dex */
public interface SupportSettingsProvider {
    void getSettings(ZendeskCallback<SupportSdkSettings> zendeskCallback);
}
