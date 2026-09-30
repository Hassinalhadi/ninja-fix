package zendesk.support.requestlist;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.i;
import com.zendesk.logger.Logger;
import zendesk.configurations.ConfigurationUtil;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.Constants;
import zendesk.support.R;
import zendesk.support.SdkDependencyProvider;
import zendesk.support.requestlist.RequestListConfiguration;

/* loaded from: classes.dex */
public class RequestListActivity extends i {
    static final String LOG_TAG = "RequestListActivity";
    ActionHandlerRegistry actionHandlerRegistry;
    RequestListModel model;
    RequestListPresenter presenter;
    RequestListSyncHandler syncHandler;
    RequestListView view;

    public static RequestListConfiguration.Builder builder() {
        return new RequestListConfiguration.Builder();
    }

    public static void refresh(Context context, ActionHandlerRegistry actionHandlerRegistry) {
        ActionHandler handlerByAction = actionHandlerRegistry.handlerByAction(Constants.ACTION_REFRESH_REQUEST_LIST);
        if (handlerByAction != null) {
            handlerByAction.handle(null, context);
        }
    }

    @Override // androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z2 = true;
        getTheme().applyStyle(R.style.ZendeskActivityDefaultTheme, true);
        SdkDependencyProvider sdkDependencyProvider = SdkDependencyProvider.INSTANCE;
        if (!sdkDependencyProvider.isInitialized()) {
            Logger.e(LOG_TAG, SdkDependencyProvider.NOT_INITIALIZED_LOG, new Object[0]);
            finish();
            return;
        }
        RequestListConfiguration requestListConfiguration = (RequestListConfiguration) ConfigurationUtil.fromBundle(getIntent().getExtras(), RequestListConfiguration.class);
        if (requestListConfiguration == null) {
            Logger.e(LOG_TAG, "No configuration found. Please use RequestListActivity.builder()", new Object[0]);
            finish();
            return;
        }
        sdkDependencyProvider.provideRequestListComponent(this, requestListConfiguration).inject(this);
        setContentView(this.view);
        RequestListPresenter requestListPresenter = this.presenter;
        if (bundle != null) {
            z2 = false;
        }
        requestListPresenter.onCreate(z2, this.view);
        this.actionHandlerRegistry.add(this.syncHandler);
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ActionHandlerRegistry actionHandlerRegistry = this.actionHandlerRegistry;
        if (actionHandlerRegistry != null) {
            actionHandlerRegistry.remove(this.syncHandler);
        }
        RequestListPresenter requestListPresenter = this.presenter;
        if (requestListPresenter != null) {
            requestListPresenter.onDestroy(isChangingConfigurations());
        }
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onPause() {
        super.onPause();
        this.syncHandler.setRunning(false);
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onResume() {
        super.onResume();
        this.syncHandler.setRunning(true);
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public void onStart() {
        super.onStart();
        this.view.onStart();
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public void onStop() {
        super.onStop();
        this.view.onStop();
    }
}
