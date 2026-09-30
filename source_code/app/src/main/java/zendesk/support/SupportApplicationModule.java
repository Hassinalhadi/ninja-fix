package zendesk.support;

import android.content.Context;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SupportApplicationModule {
    private ApplicationScope applicationScope;

    public SupportApplicationModule(ApplicationScope applicationScope) {
        this.applicationScope = applicationScope;
    }

    public Locale provideLocale() {
        return this.applicationScope.getLocale();
    }

    public SupportSdkMetadata provideMetadata(Context context) {
        return new SupportSdkMetadata(context);
    }

    public ZendeskTracker providesZendeskTracker() {
        return this.applicationScope.getZendeskTracker();
    }
}
