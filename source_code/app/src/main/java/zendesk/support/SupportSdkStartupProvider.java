package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.SdkStartUpProvider;
import zendesk.core.Zendesk;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SupportSdkStartupProvider extends SdkStartUpProvider {
    private CreateRequestActionHandler createRequestActionHandler;
    private RequestListActionHandler requestListActionHandler;

    @Override // zendesk.core.SdkStartUpProvider
    public void onStartUp(Context context) {
        ActionHandlerRegistry actionHandlerRegistry = Zendesk.INSTANCE.actionHandlerRegistry();
        CreateRequestActionHandler createRequestActionHandler = this.createRequestActionHandler;
        if (createRequestActionHandler != null) {
            actionHandlerRegistry.remove(createRequestActionHandler);
        }
        RequestListActionHandler requestListActionHandler = this.requestListActionHandler;
        if (requestListActionHandler != null) {
            actionHandlerRegistry.remove(requestListActionHandler);
        }
        this.createRequestActionHandler = new CreateRequestActionHandler(context);
        this.requestListActionHandler = new RequestListActionHandler();
        actionHandlerRegistry.add(this.createRequestActionHandler);
        actionHandlerRegistry.add(this.requestListActionHandler);
    }
}
