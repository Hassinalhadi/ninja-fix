package zendesk.support.guide;

import zendesk.configurations.ConfigurationHelper;
import zendesk.core.ActionHandler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class GuideSdkModule {
    public static ActionHandler viewArticleActionHandler() {
        return new ViewArticleActionHandler();
    }

    public ConfigurationHelper configurationHelper() {
        return new ConfigurationHelper();
    }
}
