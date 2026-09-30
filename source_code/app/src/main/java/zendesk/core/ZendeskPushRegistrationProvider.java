package zendesk.core;

import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponseAdapter;
import com.zendesk.service.RetrofitZendeskCallbackAdapter;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.LocaleUtil;
import com.zendesk.util.StringUtils;
import java.io.IOException;
import java.util.Locale;
import vg.aq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ZendeskPushRegistrationProvider implements PushRegistrationProvider, PushRegistrationProviderInternal {
    private static final String LOG_TAG = "PushRegistrationProvider";
    private static final RetrofitZendeskCallbackAdapter.RequestExtractor<PushRegistrationResponseWrapper, String> PUSH_RESPONSE_EXTRACTOR = new RetrofitZendeskCallbackAdapter.RequestExtractor<PushRegistrationResponseWrapper, String>() { // from class: zendesk.core.ZendeskPushRegistrationProvider.4
        @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
        public String extract(PushRegistrationResponseWrapper pushRegistrationResponseWrapper) {
            if (pushRegistrationResponseWrapper != null && pushRegistrationResponseWrapper.getRegistrationResponse() != null && StringUtils.hasLength(pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier())) {
                return pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier();
            }
            return "";
        }
    };
    private final BlipsCoreProvider blipsProvider;
    private final IdentityManager identityManager;
    private final Locale locale;
    private final PushDeviceIdStorage pushIdStorage;
    private final PushRegistrationService pushService;
    private final SettingsProvider settingsProvider;

    /* loaded from: classes.dex */
    public enum TokenType {
        Identifier(null),
        UrbanAirshipChannelId("urban_airship_channel_id");

        final String name;

        TokenType(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public ZendeskPushRegistrationProvider(PushRegistrationService pushRegistrationService, IdentityManager identityManager, SettingsProvider settingsProvider, BlipsCoreProvider blipsCoreProvider, PushDeviceIdStorage pushDeviceIdStorage, Locale locale) {
        this.pushService = pushRegistrationService;
        this.identityManager = identityManager;
        this.settingsProvider = settingsProvider;
        this.blipsProvider = blipsCoreProvider;
        this.pushIdStorage = pushDeviceIdStorage;
        this.locale = locale;
    }

    private boolean checkForStoredPushRegistration(String str, ZendeskCallback<String> zendeskCallback) {
        if (!StringUtils.hasLength(str)) {
            if (zendeskCallback != null) {
                zendeskCallback.onError(new ErrorResponseAdapter("Invalid identifier provided."));
            }
            Logger.w(LOG_TAG, "Invalid identifier provided.", new Object[0]);
            return true;
        }
        if (this.pushIdStorage.hasRegisteredDeviceId() && str.equals(this.pushIdStorage.getRegisteredDeviceId())) {
            if (zendeskCallback != null) {
                zendeskCallback.onSuccess(str);
            }
            Logger.d(LOG_TAG, "Skipping registration because device is already registered with this ID.", new Object[0]);
            return true;
        }
        if (this.pushIdStorage.hasRegisteredDeviceId()) {
            this.pushIdStorage.removeRegisteredDeviceId();
            Logger.d(LOG_TAG, "Removing stored push registration response because a new one has been provided.", new Object[0]);
        }
        return false;
    }

    private void getAuthTypeAndRequest(final String str, final TokenType tokenType, final ZendeskCallback<String> zendeskCallback) {
        if (checkForStoredPushRegistration(str, zendeskCallback)) {
            return;
        }
        this.settingsProvider.getCoreSettings(new PassThroughErrorZendeskCallback<CoreSettings>(zendeskCallback) { // from class: zendesk.core.ZendeskPushRegistrationProvider.1
            @Override // zendesk.core.PassThroughErrorZendeskCallback, com.zendesk.service.ZendeskCallback
            public void onSuccess(CoreSettings coreSettings) {
                AuthenticationType authentication = coreSettings.getAuthentication();
                if (authentication == null) {
                    ZendeskCallback zendeskCallback2 = zendeskCallback;
                    if (zendeskCallback2 != null) {
                        zendeskCallback2.onError(new ErrorResponseAdapter("Authentication type is null."));
                        return;
                    }
                    return;
                }
                ZendeskPushRegistrationProvider zendeskPushRegistrationProvider = ZendeskPushRegistrationProvider.this;
                PushRegistrationRequest pushRegistrationRequest = zendeskPushRegistrationProvider.getPushRegistrationRequest(str, zendeskPushRegistrationProvider.locale, authentication, tokenType);
                if (ZendeskPushRegistrationProvider.this.hasNoStoredAccessToken()) {
                    ZendeskPushRegistrationProvider.this.storePendingPushRegistrationRequest(pushRegistrationRequest, zendeskCallback);
                } else {
                    ZendeskPushRegistrationProvider.this.sendPushRegistrationRequest(pushRegistrationRequest, zendeskCallback);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PushRegistrationRequest getPushRegistrationRequest(String str, Locale locale, AuthenticationType authenticationType, TokenType tokenType) {
        PushRegistrationRequest pushRegistrationRequest = new PushRegistrationRequest();
        pushRegistrationRequest.setIdentifier(str);
        pushRegistrationRequest.setLocale(LocaleUtil.toLanguageTag(locale));
        if (tokenType == TokenType.UrbanAirshipChannelId) {
            pushRegistrationRequest.setTokenType(tokenType.name);
        }
        if (AuthenticationType.ANONYMOUS == authenticationType) {
            pushRegistrationRequest.setSdkGuid(this.identityManager.getSdkGuid());
        }
        return pushRegistrationRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasNoStoredAccessToken() {
        if (this.identityManager.getStoredAccessTokenAsBearerToken() == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSuccessfulRegistration(String str) {
        this.pushIdStorage.storeRegisteredDeviceId(str);
        this.pushIdStorage.removePushRegistrationRequest();
        this.blipsProvider.corePushEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest, final ZendeskCallback<String> zendeskCallback) {
        this.pushService.registerDevice(new PushRegistrationRequestWrapper(pushRegistrationRequest)).o(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<String>(zendeskCallback) { // from class: zendesk.core.ZendeskPushRegistrationProvider.3
            @Override // zendesk.core.PassThroughErrorZendeskCallback, com.zendesk.service.ZendeskCallback
            public void onSuccess(String str) {
                ZendeskPushRegistrationProvider.this.onSuccessfulRegistration(str);
                ZendeskCallback zendeskCallback2 = zendeskCallback;
                if (zendeskCallback2 != null) {
                    zendeskCallback2.onSuccess(str);
                }
            }
        }, PUSH_RESPONSE_EXTRACTOR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void storePendingPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest, ZendeskCallback<String> zendeskCallback) {
        this.pushIdStorage.storePushRegistrationRequest(pushRegistrationRequest);
        if (zendeskCallback != null) {
            zendeskCallback.onSuccess(pushRegistrationRequest.getIdentifier());
        }
    }

    @Override // zendesk.core.PushRegistrationProvider
    public boolean isRegisteredForPush() {
        return this.pushIdStorage.hasRegisteredDeviceId();
    }

    @Override // zendesk.core.PushRegistrationProvider
    public void registerWithDeviceIdentifier(String str, ZendeskCallback<String> zendeskCallback) {
        getAuthTypeAndRequest(str, TokenType.Identifier, zendeskCallback);
    }

    @Override // zendesk.core.PushRegistrationProvider
    public void registerWithUAChannelId(String str, ZendeskCallback<String> zendeskCallback) {
        getAuthTypeAndRequest(str, TokenType.UrbanAirshipChannelId, zendeskCallback);
    }

    @Override // zendesk.core.PushRegistrationProvider
    public void unregisterDevice(final ZendeskCallback<Void> zendeskCallback) {
        String registeredDeviceId = this.pushIdStorage.getRegisteredDeviceId();
        final Long userId = this.identityManager.getUserId();
        if (registeredDeviceId != null) {
            this.pushService.unregisterDevice(registeredDeviceId).o(new RetrofitZendeskCallbackAdapter(new PassThroughErrorZendeskCallback<Void>(zendeskCallback) { // from class: zendesk.core.ZendeskPushRegistrationProvider.2
                @Override // zendesk.core.PassThroughErrorZendeskCallback, com.zendesk.service.ZendeskCallback
                public void onSuccess(Void r32) {
                    ZendeskPushRegistrationProvider.this.pushIdStorage.removeRegisteredDeviceId();
                    ZendeskPushRegistrationProvider.this.blipsProvider.corePushDisabled(userId);
                    ZendeskCallback zendeskCallback2 = zendeskCallback;
                    if (zendeskCallback2 != null) {
                        zendeskCallback2.onSuccess(r32);
                    }
                }
            }));
        }
    }

    @Override // zendesk.core.PushRegistrationProviderInternal
    public String sendPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest) {
        try {
            aq execute = this.pushService.registerDevice(new PushRegistrationRequestWrapper(pushRegistrationRequest)).execute();
            Object obj = execute.bravo;
            if (obj != null && ((PushRegistrationResponseWrapper) obj).getRegistrationResponse() != null) {
                String identifier = ((PushRegistrationResponseWrapper) execute.bravo).getRegistrationResponse().getIdentifier();
                onSuccessfulRegistration(identifier);
                return identifier;
            }
            return "";
        } catch (IOException e) {
            Logger.e(LOG_TAG, "Push registration request failed.", e, new Object[0]);
            return "";
        }
    }
}
