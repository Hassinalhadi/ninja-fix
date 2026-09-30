package zendesk.support.requestlist;

import android.view.View;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.SafeZendeskCallback;
import com.zendesk.service.ZendeskCallback;
import java.util.List;
import v2.j;
import zendesk.support.SupportSdkSettings;
import zendesk.support.request.RequestActivity;
import zendesk.support.requestlist.RequestListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RequestListPresenter {
    private final CancelableCompositeCallback callbacks = new CancelableCompositeCallback();
    private final RequestListModel model;
    private RequestListView view;

    /* loaded from: classes.dex */
    public interface SettingsCallback {
        void onSettings(SupportSdkSettings supportSdkSettings);
    }

    public RequestListPresenter(RequestListModel requestListModel) {
        this.model = requestListModel;
    }

    private void fetchSettingsFromNetwork(final SettingsCallback settingsCallback) {
        SafeZendeskCallback from = SafeZendeskCallback.from(new ZendeskCallback<SupportSdkSettings>() { // from class: zendesk.support.requestlist.RequestListPresenter.4
            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                settingsCallback.onSettings(null);
                if (RequestListPresenter.this.view != null) {
                    RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
                }
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                RequestListPresenter.this.model.cacheSupportSdkSettings(supportSdkSettings);
                settingsCallback.onSettings(supportSdkSettings);
            }
        });
        this.callbacks.add(from);
        this.view.setLoading(true);
        this.model.loadSettings(from);
    }

    private void loadSettings(SettingsCallback settingsCallback) {
        SupportSdkSettings cachedSettings = this.model.getCachedSettings();
        if (cachedSettings == null) {
            fetchSettingsFromNetwork(settingsCallback);
        } else {
            settingsCallback.onSettings(cachedSettings);
        }
    }

    private void setupCreateTicketClickListener() {
        this.view.setCreateRequestListener(new View.OnClickListener() { // from class: zendesk.support.requestlist.RequestListPresenter.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RequestListPresenter.this.view.startRequestActivity(RequestActivity.builder());
            }
        });
    }

    private void setupErrorClickListener() {
        this.view.setRetryClickListener(new View.OnClickListener() { // from class: zendesk.support.requestlist.RequestListPresenter.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RequestListPresenter.this.refresh();
            }
        });
    }

    private void setupItemClickListener() {
        this.view.setItemClickListener(new RequestListView.OnItemClick() { // from class: zendesk.support.requestlist.RequestListPresenter.7
            @Override // zendesk.support.requestlist.RequestListView.OnItemClick
            public void onClick(RequestListItem requestListItem) {
                RequestListPresenter.this.view.startRequestActivity(requestListItem.configure(RequestActivity.builder()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupLogoView(final RequestListView requestListView, boolean z2, final String str) {
        requestListView.setLogoClickListener(z2, new View.OnClickListener() { // from class: zendesk.support.requestlist.RequestListPresenter.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                requestListView.startReferrerPage(str);
            }
        });
    }

    private void setupNavigationClickListener() {
        this.view.setBackClickListener(new View.OnClickListener() { // from class: zendesk.support.requestlist.RequestListPresenter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RequestListPresenter.this.view.finish();
            }
        });
    }

    private void setupPullToRefreshListener() {
        this.view.setSwipeRefreshListener(new j() { // from class: zendesk.support.requestlist.RequestListPresenter.8
            @Override // v2.j
            public void onRefresh() {
                RequestListPresenter.this.refresh();
            }
        });
    }

    public void loadItems(boolean z2, SupportSdkSettings supportSdkSettings) {
        ZendeskCallback<List<RequestListItem>> zendeskCallback = new ZendeskCallback<List<RequestListItem>>() { // from class: zendesk.support.requestlist.RequestListPresenter.3
            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                RequestListPresenter.this.showError(errorResponse);
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(List<RequestListItem> list) {
                RequestListPresenter.this.showRequestList(list);
            }
        };
        this.callbacks.add(SafeZendeskCallback.from(zendeskCallback));
        this.view.setLoading(true);
        this.model.loadItems(z2, supportSdkSettings, zendeskCallback);
    }

    public void onCreate(final boolean z2, RequestListView requestListView) {
        this.view = requestListView;
        setupItemClickListener();
        setupPullToRefreshListener();
        setupNavigationClickListener();
        setupErrorClickListener();
        setupCreateTicketClickListener();
        loadSettings(new SettingsCallback() { // from class: zendesk.support.requestlist.RequestListPresenter.1
            @Override // zendesk.support.requestlist.RequestListPresenter.SettingsCallback
            public void onSettings(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings != null && supportSdkSettings.isConversationsEnabled()) {
                    RequestListPresenter requestListPresenter = RequestListPresenter.this;
                    requestListPresenter.setupLogoView(requestListPresenter.view, supportSdkSettings.isShowReferrerLogoEnabled(), supportSdkSettings.getReferrerUrl());
                    RequestListPresenter.this.loadItems(z2, supportSdkSettings);
                    if (z2) {
                        RequestListPresenter.this.model.trackRequestListViewed();
                        return;
                    }
                    return;
                }
                if (RequestListPresenter.this.view != null) {
                    RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
                }
            }
        });
    }

    public void onDestroy(boolean z2) {
        if (!z2) {
            this.model.cleanup();
        }
        this.view = null;
        this.callbacks.cancel();
    }

    public void refresh() {
        loadSettings(new SettingsCallback() { // from class: zendesk.support.requestlist.RequestListPresenter.2
            @Override // zendesk.support.requestlist.RequestListPresenter.SettingsCallback
            public void onSettings(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings != null && supportSdkSettings.isConversationsEnabled()) {
                    RequestListPresenter.this.loadItems(true, supportSdkSettings);
                } else if (RequestListPresenter.this.view != null) {
                    RequestListPresenter.this.view.finish("Conversations are disabled in sdk settings, closing the request list screen!");
                }
            }
        });
    }

    public void showError(ErrorResponse errorResponse) {
        RequestListView requestListView = this.view;
        if (requestListView != null) {
            requestListView.setLoading(false);
            this.view.showErrorMessage();
        }
    }

    public void showRequestList(List<RequestListItem> list) {
        RequestListView requestListView = this.view;
        if (requestListView != null) {
            requestListView.showRequestList(list);
            this.view.setLoading(false);
        }
    }
}
