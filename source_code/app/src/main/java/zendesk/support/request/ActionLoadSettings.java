package zendesk.support.request;

import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.StringUtils;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Identity;
import zendesk.support.SupportSdkSettings;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ActionLoadSettings implements AsyncMiddleware.AsyncAction {
    private final ActionFactory actionFactory;
    private final AuthenticationProvider authProvider;
    private final SupportSettingsProvider settingsProvider;

    public ActionLoadSettings(ActionFactory actionFactory, SupportSettingsProvider supportSettingsProvider, AuthenticationProvider authenticationProvider) {
        this.actionFactory = actionFactory;
        this.settingsProvider = supportSettingsProvider;
        this.authProvider = authenticationProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StateSettings constructSettings(SupportSdkSettings supportSdkSettings) {
        Identity identity = this.authProvider.getIdentity();
        if (identity instanceof AnonymousIdentity) {
            AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
            return StateSettings.fromSupportSettings(supportSdkSettings, StringUtils.hasLength(anonymousIdentity.getEmail()), StringUtils.hasLength(anonymousIdentity.getName()));
        }
        return StateSettings.fromSupportSettings(supportSdkSettings, true, true);
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.actionFactory.loadSettings());
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void execute(final Dispatcher dispatcher, GetState getState, final AsyncMiddleware.Callback callback) {
        this.settingsProvider.getSettings(new ZendeskCallback<SupportSdkSettings>() { // from class: zendesk.support.request.ActionLoadSettings.1
            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                Logger.w("RequestActivity", "Error loading settings. Error: '%s'", errorResponse.getReason());
                dispatcher.dispatch(ActionLoadSettings.this.actionFactory.loadSettingsError(errorResponse));
                callback.done();
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                dispatcher.dispatch(ActionLoadSettings.this.actionFactory.loadSettingsSuccess(ActionLoadSettings.this.constructSettings(supportSdkSettings)));
                callback.done();
            }
        });
    }
}
