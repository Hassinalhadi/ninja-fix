package zendesk.support.guide;

import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.CollectionUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import zendesk.classic.messaging.Engine;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.NetworkAware;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.RetryAction;
import zendesk.support.HelpCenterSettings;
import zendesk.support.SearchArticle;
import zendesk.support.guide.HelpCenterMvp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class HelpCenterPresenter implements HelpCenterMvp.Presenter, NetworkAware {
    private static final Integer NETWORK_AWARE_ID = 31;
    private static final Integer RETRY_ACTION_ID = 8642;
    private ActionHandlerRegistry actionHandlerRegistry;
    private HelpCenterConfiguration config;
    private List<Engine> engines;
    private HelpCenterSettings helpCenterSettings;
    private Set<RetryAction> internalRetryActions = new HashSet();
    private HelpCenterMvp.Model model;
    private NetworkInfoProvider networkInfoProvider;
    private boolean networkPreviouslyUnavailable;
    private HelpCenterMvp.View view;

    /* loaded from: classes.dex */
    public class ViewSafeRetryZendeskCallback extends ZendeskCallback<List<SearchArticle>> {
        private String query;

        public ViewSafeRetryZendeskCallback(String str) {
            this.query = str;
        }

        @Override // com.zendesk.service.ZendeskCallback
        public void onError(final ErrorResponse errorResponse) {
            if (HelpCenterPresenter.this.view != null) {
                HelpCenterPresenter.this.view.hideLoadingState();
                HelpCenterPresenter.this.view.showLoadArticleErrorWithRetry(HelpCenterMvp.ErrorType.ARTICLES_LOAD, new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.ViewSafeRetryZendeskCallback.2
                    @Override // zendesk.core.RetryAction
                    public void onRetry() {
                        ViewSafeRetryZendeskCallback viewSafeRetryZendeskCallback = ViewSafeRetryZendeskCallback.this;
                        HelpCenterPresenter.this.onSearchSubmit(viewSafeRetryZendeskCallback.query);
                    }
                });
            } else {
                HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.ViewSafeRetryZendeskCallback.3
                    @Override // zendesk.core.RetryAction
                    public void onRetry() {
                        ViewSafeRetryZendeskCallback.this.onError(errorResponse);
                    }
                });
            }
        }

        @Override // com.zendesk.service.ZendeskCallback
        public void onSuccess(final List<SearchArticle> list) {
            if (HelpCenterPresenter.this.view != null) {
                HelpCenterPresenter.this.view.hideLoadingState();
                HelpCenterPresenter.this.view.showSearchResults(list, this.query);
                if (HelpCenterPresenter.this.shouldShowContactUsButton()) {
                    HelpCenterPresenter.this.view.showContactUsButton();
                    return;
                }
                return;
            }
            HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.ViewSafeRetryZendeskCallback.1
                @Override // zendesk.core.RetryAction
                public void onRetry() {
                    ViewSafeRetryZendeskCallback.this.onSuccess(list);
                }
            });
        }
    }

    public HelpCenterPresenter(HelpCenterMvp.View view, HelpCenterMvp.Model model, NetworkInfoProvider networkInfoProvider, ActionHandlerRegistry actionHandlerRegistry) {
        this.view = view;
        this.model = model;
        this.networkInfoProvider = networkInfoProvider;
        this.actionHandlerRegistry = actionHandlerRegistry;
    }

    private void invokeRetryActions() {
        Iterator<RetryAction> it = this.internalRetryActions.iterator();
        while (it.hasNext()) {
            it.next().onRetry();
        }
        this.internalRetryActions.clear();
    }

    @Override // zendesk.support.guide.HelpCenterMvp.Presenter
    public void init(HelpCenterConfiguration helpCenterConfiguration, List<Engine> list) {
        this.config = helpCenterConfiguration;
        this.engines = list;
        this.view.showLoadingState();
        this.model.getSettings(new ZendeskCallback<HelpCenterSettings>() { // from class: zendesk.support.guide.HelpCenterPresenter.5
            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                Logger.e("HelpCenterActivity", "Failed to get mobile settings. Cannot determine start screen.", new Object[0]);
                Logger.e("HelpCenterActivity", errorResponse);
                if (HelpCenterPresenter.this.view != null) {
                    HelpCenterPresenter.this.view.hideLoadingState();
                    HelpCenterPresenter.this.view.exitActivity();
                } else {
                    HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.7
                        @Override // zendesk.core.RetryAction
                        public void onRetry() {
                            HelpCenterPresenter.this.view.hideLoadingState();
                            HelpCenterPresenter.this.view.exitActivity();
                        }
                    });
                }
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(HelpCenterSettings helpCenterSettings) {
                if (HelpCenterPresenter.this.view != null) {
                    HelpCenterPresenter.this.view.hideLoadingState();
                } else {
                    HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.1
                        @Override // zendesk.core.RetryAction
                        public void onRetry() {
                            HelpCenterPresenter.this.view.hideLoadingState();
                        }
                    });
                }
                HelpCenterPresenter.this.helpCenterSettings = helpCenterSettings;
                if (helpCenterSettings.isEnabled()) {
                    Logger.d("HelpCenterActivity", "Help center is enabled. starting with Help Center", new Object[0]);
                    if (HelpCenterPresenter.this.view != null) {
                        HelpCenterPresenter.this.view.showHelp(HelpCenterPresenter.this.config);
                    } else {
                        HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.2
                            @Override // zendesk.core.RetryAction
                            public void onRetry() {
                                HelpCenterPresenter.this.view.showHelp(HelpCenterPresenter.this.config);
                            }
                        });
                    }
                    if (HelpCenterPresenter.this.shouldShowContactUsButton()) {
                        Logger.d("HelpCenterActivity", "Saved instance states that we should show the contact FAB", new Object[0]);
                        if (HelpCenterPresenter.this.view != null) {
                            HelpCenterPresenter.this.view.showContactUsButton();
                            return;
                        } else {
                            HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.3
                                @Override // zendesk.core.RetryAction
                                public void onRetry() {
                                    HelpCenterPresenter.this.view.showContactUsButton();
                                }
                            });
                            return;
                        }
                    }
                    return;
                }
                Logger.d("HelpCenterActivity", "Help center is disabled", new Object[0]);
                if (HelpCenterPresenter.this.actionHandlerRegistry.handlerByAction("action_conversation_list") != null) {
                    Logger.d("HelpCenterActivity", "Starting with conversations", new Object[0]);
                    if (HelpCenterPresenter.this.view != null) {
                        HelpCenterPresenter.this.view.showRequestList();
                        HelpCenterPresenter.this.view.exitActivity();
                        return;
                    } else {
                        HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.4
                            @Override // zendesk.core.RetryAction
                            public void onRetry() {
                                HelpCenterPresenter.this.view.showRequestList();
                                HelpCenterPresenter.this.view.exitActivity();
                            }
                        });
                        return;
                    }
                }
                if (HelpCenterPresenter.this.actionHandlerRegistry.handlerByAction("action_contact_option") != null) {
                    Logger.d("HelpCenterActivity", "Starting with contact", new Object[0]);
                    if (HelpCenterPresenter.this.view != null) {
                        HelpCenterPresenter.this.view.showContactZendesk();
                        HelpCenterPresenter.this.view.exitActivity();
                        return;
                    } else {
                        HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.5
                            @Override // zendesk.core.RetryAction
                            public void onRetry() {
                                HelpCenterPresenter.this.view.showContactZendesk();
                                HelpCenterPresenter.this.view.exitActivity();
                            }
                        });
                        return;
                    }
                }
                Logger.d("HelpCenterActivity", "Support SDK is not present, nothing to fall back to. Closing Activity.", new Object[0]);
                if (HelpCenterPresenter.this.view != null) {
                    HelpCenterPresenter.this.view.exitActivity();
                } else {
                    HelpCenterPresenter.this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.5.6
                        @Override // zendesk.core.RetryAction
                        public void onRetry() {
                            HelpCenterPresenter.this.view.exitActivity();
                        }
                    });
                }
            }
        });
    }

    @Override // zendesk.support.guide.HelpCenterMvp.Presenter
    public void onErrorWithRetry(final HelpCenterMvp.ErrorType errorType, final RetryAction retryAction) {
        HelpCenterMvp.View view = this.view;
        if (view != null) {
            if (view.isShowingHelp()) {
                this.view.hideLoadingState();
                this.view.showLoadArticleErrorWithRetry(errorType, retryAction);
                return;
            }
            return;
        }
        this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.3
            @Override // zendesk.core.RetryAction
            public void onRetry() {
                if (HelpCenterPresenter.this.view != null && HelpCenterPresenter.this.view.isShowingHelp()) {
                    HelpCenterPresenter.this.view.hideLoadingState();
                    HelpCenterPresenter.this.view.showLoadArticleErrorWithRetry(errorType, retryAction);
                }
            }
        });
    }

    @Override // zendesk.support.guide.HelpCenterMvp.Presenter
    public void onLoad() {
        if (shouldShowContactUsButton()) {
            HelpCenterMvp.View view = this.view;
            if (view != null) {
                view.showContactUsButton();
            } else {
                this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.2
                    @Override // zendesk.core.RetryAction
                    public void onRetry() {
                        HelpCenterPresenter.this.view.showContactUsButton();
                    }
                });
            }
        }
        HelpCenterMvp.View view2 = this.view;
        if (view2 != null) {
            view2.announceContentLoaded();
        }
    }

    @Override // zendesk.core.NetworkAware
    public void onNetworkAvailable() {
        Logger.d("HelpCenterActivity", "Network is available.", new Object[0]);
        if (!this.networkPreviouslyUnavailable) {
            Logger.d("HelpCenterActivity", "Network was not previously unavailable, no need to dismiss Snackbar", new Object[0]);
            return;
        }
        this.networkPreviouslyUnavailable = false;
        HelpCenterMvp.View view = this.view;
        if (view != null) {
            view.setSearchEnabled(true);
            this.view.dismissError();
        } else {
            this.internalRetryActions.add(new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.4
                @Override // zendesk.core.RetryAction
                public void onRetry() {
                    HelpCenterPresenter.this.view.dismissError();
                }
            });
        }
    }

    @Override // zendesk.core.NetworkAware
    public void onNetworkUnavailable() {
        Logger.d("HelpCenterActivity", "Network is unavailable.", new Object[0]);
        this.networkPreviouslyUnavailable = true;
        HelpCenterMvp.View view = this.view;
        if (view != null) {
            view.setSearchEnabled(false);
            this.view.showNoConnectionError();
            this.view.hideLoadingState();
        }
    }

    @Override // zendesk.support.guide.HelpCenterMvp.Presenter
    public void onPause() {
        this.view = null;
        this.networkInfoProvider.removeNetworkAwareListener(NETWORK_AWARE_ID);
        this.networkInfoProvider.removeRetryAction(RETRY_ACTION_ID);
        this.networkInfoProvider.unregister();
    }

    @Override // zendesk.support.guide.HelpCenterMvp.Presenter
    public void onResume(HelpCenterMvp.View view) {
        this.view = view;
        this.networkInfoProvider.addNetworkAwareListener(NETWORK_AWARE_ID, this);
        this.networkInfoProvider.register();
        if (!this.networkInfoProvider.isNetworkAvailable()) {
            view.showNoConnectionError();
            view.hideLoadingState();
            this.networkPreviouslyUnavailable = true;
        }
        invokeRetryActions();
    }

    @Override // zendesk.support.guide.HelpCenterMvp.Presenter
    public void onSearchSubmit(final String str) {
        if (this.networkInfoProvider.isNetworkAvailable()) {
            this.view.dismissError();
            this.view.showLoadingState();
            this.view.clearSearchResults();
            this.model.search(this.config.getCategoryIds(), this.config.getSectionIds(), str, this.config.getLabelNames(), new ViewSafeRetryZendeskCallback(str));
            return;
        }
        this.networkInfoProvider.addRetryAction(RETRY_ACTION_ID, new RetryAction() { // from class: zendesk.support.guide.HelpCenterPresenter.1
            @Override // zendesk.core.RetryAction
            public void onRetry() {
                HelpCenterPresenter.this.onSearchSubmit(str);
            }
        });
    }

    public boolean shouldShowContactUsButton() {
        boolean z2;
        if (this.actionHandlerRegistry.handlerByAction("action_contact_option") != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean isNotEmpty = CollectionUtils.isNotEmpty(this.engines);
        if (!this.config.isContactUsButtonVisible() || (!z2 && !isNotEmpty)) {
            return false;
        }
        return true;
    }

    @Override // zendesk.support.guide.HelpCenterMvp.Presenter
    public boolean shouldShowConversationsMenuItem() {
        if (this.actionHandlerRegistry.handlerByAction("action_conversation_list") != null && this.config.isShowConversationsMenuButton()) {
            return true;
        }
        return false;
    }

    @Override // zendesk.support.guide.HelpCenterMvp.Presenter
    public boolean shouldShowSearchMenuItem() {
        HelpCenterSettings helpCenterSettings = this.helpCenterSettings;
        if (helpCenterSettings != null && helpCenterSettings.isEnabled()) {
            return true;
        }
        return false;
    }
}
