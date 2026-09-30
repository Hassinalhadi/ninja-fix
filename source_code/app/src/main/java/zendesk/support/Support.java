package zendesk.support;

import android.content.Context;
import com.zendesk.logger.Logger;
import java.util.Locale;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;
import zendesk.core.CoreModule;
import zendesk.core.Zendesk;
import zendesk.support.ApplicationScope;

/* loaded from: classes.dex */
public enum Support {
    INSTANCE;

    private static final String LOG_TAG = "ZendeskConfiguration";
    ActionHandlerRegistry actionHandlerRegistry;
    private ApplicationScope applicationScope;
    AuthenticationProvider authenticationProvider;
    SupportBlipsProvider blipsProvider;
    private boolean initialised;
    ProviderStore providerStore;
    RequestMigrator requestMigrator;
    RequestProvider requestProvider;
    SupportModule supportModule;

    private void initApplicationScope(CoreModule coreModule, ApplicationScope applicationScope) {
        this.applicationScope = applicationScope;
        Guide guide = Guide.INSTANCE;
        guide.init(Zendesk.INSTANCE);
        DaggerSupportSdkProvidersComponent.builder().coreModule(coreModule).providerModule(new ProviderModule()).storageModule(new StorageModule()).supportApplicationModule(new SupportApplicationModule(applicationScope)).guideModule(guide.guideModule()).build().inject(this);
    }

    public Locale getHelpCenterLocaleOverride() {
        return Guide.INSTANCE.getHelpCenterLocaleOverride();
    }

    public SupportModule getSupportModule() {
        return this.supportModule;
    }

    public void init(Zendesk zendesk2) {
        if (zendesk2.isInitialized()) {
            initApplicationScope(zendesk2.coreModule(), new ApplicationScope.Builder().build());
            this.initialised = true;
            return;
        }
        Logger.e(LOG_TAG, "Cannot use SupportSDK without initializing Zendesk. Call Zendesk.INSTANCE.init(...)", new Object[0]);
    }

    public void installTracker(ZendeskTracker zendeskTracker) {
        initApplicationScope(Zendesk.INSTANCE.coreModule(), this.applicationScope.newBuilder().zendeskTracker(zendeskTracker).build());
    }

    public boolean isAuthenticated() {
        AuthenticationProvider authenticationProvider = this.authenticationProvider;
        if (authenticationProvider != null && authenticationProvider.getIdentity() != null) {
            return true;
        }
        return false;
    }

    public boolean isInitialized() {
        return this.initialised;
    }

    public ProviderStore provider() {
        if (!isInitialized()) {
            Logger.e(LOG_TAG, "Cannot get ProviderStore before SDK has been initialized. init() must be called before provider().", new Object[0]);
            return null;
        }
        if (!isAuthenticated()) {
            Logger.e(LOG_TAG, "Cannot get ProviderStore before an identity has been set. Zendesk.INSTANCE.setIdentity() must be called before provider().", new Object[0]);
            return null;
        }
        return this.providerStore;
    }

    public boolean refreshRequest(String str, Context context) {
        if (!isInitialized()) {
            Logger.e(LOG_TAG, "Cannot use Support SDK without initializing Zendesk. Call Zendesk.INSTANCE.init(...) and Support.INSTANCE.init(Zendesk)", new Object[0]);
            return false;
        }
        if (!isAuthenticated()) {
            Logger.e(LOG_TAG, "Cannot use Support SDK without setting an identity. Zendesk.INSTANCE.setIdentity(...) must be called before refreshRequest(...).", new Object[0]);
            return false;
        }
        ActionHandler handlerByAction = this.actionHandlerRegistry.handlerByAction(Constants.ACTION_REFRESH_REQUEST_CONVERSATION + str);
        if (handlerByAction != null) {
            handlerByAction.handle(null, context);
            return true;
        }
        ActionHandler handlerByAction2 = this.actionHandlerRegistry.handlerByAction(Constants.ACTION_REFRESH_REQUEST_LIST);
        if (handlerByAction2 != null) {
            handlerByAction2.handle(null, context);
        } else {
            this.requestProvider.markRequestAsUnread(str);
        }
        return false;
    }

    public void reset() {
        this.initialised = false;
    }

    public void setHelpCenterLocaleOverride(Locale locale) {
        Guide.INSTANCE.setHelpCenterLocaleOverride(locale);
    }
}
