package zendesk.support;

import com.zendesk.service.ZendeskCallback;

/* loaded from: classes.dex */
public interface HelpCenterSettingsProvider {
    void getSettings(ZendeskCallback<HelpCenterSettings> zendeskCallback);
}
