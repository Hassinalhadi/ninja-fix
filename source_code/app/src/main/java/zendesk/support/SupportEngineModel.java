package zendesk.support;

import android.content.Context;
import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import zendesk.classic.messaging.AgentDetails;
import zendesk.classic.messaging.MessagingApi;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.Update;
import zendesk.classic.messaging.components.bot.BotMessageDispatcher;
import zendesk.configurations.Configuration;
import zendesk.configurations.ConfigurationHelper;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Identity;
import zendesk.core.JwtIdentity;
import zendesk.core.Zendesk;
import zendesk.support.request.RequestConfiguration;
import zendesk.support.requestlist.RequestListActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SupportEngineModel {
    private static final String LOG_TAG = "SupportEngine";
    private static final String REQUEST_LIST_ACTION_ID = "REQUEST_LIST_ACTION_ID";
    private static final String RETRY_BUTTON_ID = "zs_engine_retry_request_creation";
    private AgentDetails agentDetails = new AgentDetails("", "", false);
    private final AuthenticationProvider authenticationProvider;
    private final ConfigurationHelper configHelper;
    private List<Configuration> configurations;
    private Context context;
    private final AtomicBoolean conversationStarted;
    private final EmailValidator emailValidator;
    private String message;
    private BotMessageDispatcher<MessagingItem> messageDispatcher;
    private final RequestCreator requestCreator;
    private final SupportSettingsProvider settingsProvider;
    private State state;

    /* renamed from: zendesk, reason: collision with root package name */
    private final Zendesk f14254zendesk;

    /* renamed from: zendesk.support.SupportEngineModel$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$SupportEngineModel$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$zendesk$support$SupportEngineModel$State = iArr;
            try {
                iArr[State.AWAITING_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$support$SupportEngineModel$State[State.AWAITING_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum State {
        AWAITING_MESSAGE,
        AWAITING_EMAIL,
        COMPLETE
    }

    public SupportEngineModel(SupportSettingsProvider supportSettingsProvider, RequestCreator requestCreator, Zendesk zendesk2, AuthenticationProvider authenticationProvider, EmailValidator emailValidator, ConfigurationHelper configurationHelper, AtomicBoolean atomicBoolean, BotMessageDispatcher<MessagingItem> botMessageDispatcher) {
        this.settingsProvider = supportSettingsProvider;
        this.requestCreator = requestCreator;
        this.f14254zendesk = zendesk2;
        this.authenticationProvider = authenticationProvider;
        this.emailValidator = emailValidator;
        this.configHelper = configurationHelper;
        this.conversationStarted = atomicBoolean;
        this.messageDispatcher = botMessageDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConversationsDisabledConfirmation() {
        Identity identity = this.authenticationProvider.getIdentity();
        if (((identity instanceof AnonymousIdentity) && StringUtils.hasLength(((AnonymousIdentity) identity).getEmail())) || (identity instanceof JwtIdentity)) {
            this.messageDispatcher.addMessageWithTypingIndicator((BotMessageDispatcher<MessagingItem>) new MessagingItem.TextResponse(new Date(), newId(), this.agentDetails, this.context.getString(R.string.zs_engine_request_created_conversations_off_message)), new Update[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConversationsEnabledConfirmation() {
        this.messageDispatcher.addMessageWithTypingIndicator((BotMessageDispatcher<MessagingItem>) new MessagingItem.ActionResponse(new Date(), newId(), this.agentDetails, this.context.getString(R.string.zs_engine_request_created_conversations_enabled_message), Collections.singletonList(new MessagingItem.Action(REQUEST_LIST_ACTION_ID, this.context.getString(R.string.zs_engine_request_created_request_list_button)))), new Update[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createRequest(String str) {
        this.messageDispatcher.dispatchUpdate(Update.State.UpdateInputFieldState.updateInputFieldEnabled(false));
        this.requestCreator.createRequest(str, getRequestConfiguration(), new ZendeskCallback<Request>() { // from class: zendesk.support.SupportEngineModel.2
            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                SupportEngineModel.this.showRequestCreatedErrorMessage();
                Logger.w(SupportEngineModel.LOG_TAG, "Ticket not created: ", errorResponse);
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(Request request) {
                SupportEngineModel.this.showRequestCreatedConfirmationMessage();
            }
        });
    }

    private void displayUserTextInput(String str) {
        this.messageDispatcher.addMessage(new MessagingItem.TextQuery(new Date(), newId(), MessagingItem.Query.Status.DELIVERED, str));
    }

    private RequestConfiguration getRequestConfiguration() {
        RequestConfiguration requestConfiguration = (RequestConfiguration) this.configHelper.findConfigForType(this.configurations, RequestConfiguration.class);
        if (requestConfiguration == null) {
            return (RequestConfiguration) new RequestConfiguration.Builder().config();
        }
        return requestConfiguration;
    }

    private static String newId() {
        return UUID.randomUUID().toString();
    }

    private void processUserRequestMessage(final String str) {
        this.message = str;
        this.settingsProvider.getSettings(new ZendeskCallback<SupportSdkSettings>() { // from class: zendesk.support.SupportEngineModel.1
            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                Logger.w(SupportEngineModel.LOG_TAG, "Error fetching settings.", errorResponse);
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (!SupportEngineModel.this.userNeedsToAddEmailAddress(supportSdkSettings)) {
                    SupportEngineModel.this.createRequest(str);
                    return;
                }
                SupportEngineModel.this.state = State.AWAITING_EMAIL;
                SupportEngineModel.this.promptForEmail();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void promptForEmail() {
        this.messageDispatcher.addMessageWithTypingIndicator((BotMessageDispatcher<MessagingItem>) new MessagingItem.TextResponse(new Date(), newId(), this.agentDetails, this.context.getString(R.string.zs_engine_request_creation_email_prompt_message)), Update.State.UpdateInputFieldState.updateHint(this.context.getString(R.string.zs_engine_request_creation_email_prompt_hint)));
    }

    private void showGreeting(boolean z2) {
        if (z2) {
            displayUserTextInput(this.context.getString(R.string.zs_request_contact_option_leave_a_message));
        } else {
            this.messageDispatcher.addMessageWithTypingIndicator((BotMessageDispatcher<MessagingItem>) new MessagingItem.TextResponse(new Date(), newId(), this.agentDetails, this.context.getString(R.string.zs_engine_greeting_message)), new Update[0]);
        }
    }

    private void showInvalidEmailMessage() {
        this.messageDispatcher.addMessageWithTypingIndicator((BotMessageDispatcher<MessagingItem>) new MessagingItem.TextResponse(new Date(), newId(), this.agentDetails, this.context.getString(R.string.zs_engine_request_creation_email_validation_failed_message)), new Update[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRequestCreatedConfirmationMessage() {
        this.settingsProvider.getSettings(new ZendeskCallback<SupportSdkSettings>() { // from class: zendesk.support.SupportEngineModel.3
            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                Logger.w(SupportEngineModel.LOG_TAG, "Error fetching settings after ticket creation.", errorResponse);
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings.isConversationsEnabled()) {
                    SupportEngineModel.this.addConversationsEnabledConfirmation();
                } else {
                    SupportEngineModel.this.addConversationsDisabledConfirmation();
                }
                SupportEngineModel.this.state = State.COMPLETE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRequestCreatedErrorMessage() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new MessagingItem.TextResponse(new Date(), newId(), this.agentDetails, this.context.getString(R.string.zs_engine_message_send_error_message)));
        arrayList.add(new MessagingItem.OptionsResponse(new Date(), RETRY_BUTTON_ID, Collections.singletonList(new MessagingItem.Option(newId(), this.context.getString(R.string.zs_engine_message_retry_button)))));
        this.messageDispatcher.addMessagesWithTypingIndicator(arrayList, new Update[0]);
    }

    private void updateIdentityAndCreateRequest(String str, String str2) {
        Identity identity = this.authenticationProvider.getIdentity();
        if (identity instanceof AnonymousIdentity) {
            this.f14254zendesk.setIdentity(new AnonymousIdentity.Builder().withNameIdentifier(((AnonymousIdentity) identity).getName()).withEmailIdentifier(str).build());
            createRequest(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean userNeedsToAddEmailAddress(SupportSdkSettings supportSdkSettings) {
        Identity identity = this.authenticationProvider.getIdentity();
        if (!supportSdkSettings.isConversationsEnabled() && (identity instanceof AnonymousIdentity) && StringUtils.isEmpty(((AnonymousIdentity) identity).getEmail())) {
            return true;
        }
        return false;
    }

    public void actionItemClicked() {
        this.messageDispatcher.dispatchUpdate(new Update.Action.Navigation(RequestListActivity.builder().intent(this.context, this.configurations)));
    }

    public void retryClicked() {
        this.messageDispatcher.replaceMessage(RETRY_BUTTON_ID, new MessagingItem.TextQuery(new Date(), newId(), MessagingItem.Query.Status.DELIVERED, this.context.getString(R.string.zs_engine_message_retry_button)));
        createRequest(this.message);
    }

    public void start(Context context, MessagingApi messagingApi) {
        this.context = context;
        this.configurations = messagingApi.getConfigurations();
        this.agentDetails = messagingApi.getBotAgentDetails();
        if (this.conversationStarted.get()) {
            return;
        }
        this.conversationStarted.set(true);
        String log = messagingApi.getConversationLog().getLog();
        this.message = log;
        boolean hasLength = StringUtils.hasLength(log);
        showGreeting(hasLength);
        if (hasLength) {
            processUserRequestMessage(this.message);
        } else {
            this.state = State.AWAITING_MESSAGE;
        }
    }

    public void textEntered(String str) {
        State state = this.state;
        if (state != null && state != State.COMPLETE) {
            displayUserTextInput(str);
            int i4 = AnonymousClass4.$SwitchMap$zendesk$support$SupportEngineModel$State[this.state.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    if (this.emailValidator.isValidEmail(str)) {
                        updateIdentityAndCreateRequest(str, this.message);
                        return;
                    } else {
                        showInvalidEmailMessage();
                        return;
                    }
                }
                return;
            }
            processUserRequestMessage(str);
        }
    }
}
