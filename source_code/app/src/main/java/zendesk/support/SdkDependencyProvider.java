package zendesk.support;

import android.annotation.SuppressLint;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.Zendesk;
import zendesk.support.requestlist.RequestListActivity;
import zendesk.support.requestlist.RequestListComponent;
import zendesk.support.requestlist.RequestListConfiguration;
import zendesk.support.requestlist.RequestListModule;
import zendesk.support.requestlist.RequestListViewModule;

/* loaded from: classes.dex */
public enum SdkDependencyProvider {
    INSTANCE;

    public static final String NOT_INITIALIZED_LOG = "Zendesk is not initialized or no identity was set. Make sure Zendesk.INSTANCE.init(...), Zendesk.INSTANCE.setIdentity(...), Support.INSTANCE.init(...) was called ";
    List<ActionHandler> actionHandlers;

    /* renamed from: id, reason: collision with root package name */
    private UUID f14251id;
    ActionHandlerRegistry registry;
    private RequestListModule requestListModule;
    private SupportSdkComponent supportSdkComponent;

    private void registerActionHandlers() {
        Iterator<ActionHandler> it = this.actionHandlers.iterator();
        while (it.hasNext()) {
            this.registry.add(it.next());
        }
    }

    public void initForTesting(SupportSdkComponent supportSdkComponent, UUID uuid) {
        this.supportSdkComponent = supportSdkComponent;
        this.f14251id = uuid;
    }

    public boolean isInitialized() {
        if (Zendesk.INSTANCE.isInitialized()) {
            Support support = Support.INSTANCE;
            if (support.isInitialized() && support.isAuthenticated()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public RequestListComponent provideRequestListComponent(RequestListActivity requestListActivity, RequestListConfiguration requestListConfiguration) {
        if (this.requestListModule == null) {
            this.requestListModule = new RequestListModule();
        }
        return provideSupportSdkComponent().plus(this.requestListModule, new RequestListViewModule(requestListActivity, requestListConfiguration));
    }

    @SuppressLint({"RestrictedApi"})
    public SupportSdkComponent provideSupportSdkComponent() {
        SupportModule supportModule = Support.INSTANCE.getSupportModule();
        UUID id2 = supportModule.getId();
        if (this.supportSdkComponent == null || !id2.equals(this.f14251id)) {
            this.supportSdkComponent = DaggerSupportSdkComponent.builder().coreModule(Zendesk.INSTANCE.coreModule()).supportModule(supportModule).supportSdkModule(new SupportSdkModule()).build();
            this.f14251id = supportModule.getId();
            this.supportSdkComponent.inject(this);
            registerActionHandlers();
        }
        return this.supportSdkComponent;
    }

    public void initForTesting(SupportSdkComponent supportSdkComponent, UUID uuid, RequestListModule requestListModule) {
        initForTesting(supportSdkComponent, uuid);
        this.requestListModule = requestListModule;
    }
}
