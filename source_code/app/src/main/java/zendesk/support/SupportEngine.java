package zendesk.support;

import android.content.Context;
import zendesk.classic.messaging.AgentDetails;
import zendesk.classic.messaging.Engine;
import zendesk.classic.messaging.Event;
import zendesk.classic.messaging.MessagingApi;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.ObservableEngine;
import zendesk.classic.messaging.Update;
import zendesk.classic.messaging.components.ActionListener;
import zendesk.classic.messaging.components.CompositeActionListener;
import zendesk.classic.messaging.components.bot.BotMessageDispatcher;
import zendesk.core.Zendesk;

/* loaded from: classes.dex */
public class SupportEngine extends ObservableEngine {
    private static final String SUPPORT_ENGINE_ID = "SUPPORT";
    private final Context context;
    private final Engine.TransferOptionDescription description;
    private final CompositeActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> stateViewObserver;
    private final SupportEngineModel supportModel;
    private final CompositeActionListener<Update> updateViewObserver;

    public SupportEngine(Context context, SupportEngineModel supportEngineModel, CompositeActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> compositeActionListener, CompositeActionListener<Update> compositeActionListener2) {
        this.context = context;
        this.supportModel = supportEngineModel;
        this.stateViewObserver = compositeActionListener;
        this.updateViewObserver = compositeActionListener2;
        this.description = new Engine.TransferOptionDescription(SUPPORT_ENGINE_ID, context.getString(R.string.zs_request_contact_option_leave_a_message));
    }

    public static Engine engine() {
        SupportModule supportModule = Support.INSTANCE.supportModule;
        return DaggerSupportEngineComponent.builder().coreModule(Zendesk.INSTANCE.coreModule()).supportModule(supportModule).supportEngineModule(new SupportEngineModule()).build().supportEngine();
    }

    private void setupViewObserver(final AgentDetails agentDetails) {
        this.stateViewObserver.addListener(new ActionListener<BotMessageDispatcher.ConversationState<MessagingItem>>() { // from class: zendesk.support.SupportEngine.1
            @Override // zendesk.classic.messaging.components.ActionListener
            public void onAction(BotMessageDispatcher.ConversationState<MessagingItem> conversationState) {
                if (conversationState.shouldShowTypingIndicator()) {
                    SupportEngine.this.notifyObservers(new Update.State.ShowTyping(agentDetails));
                } else {
                    SupportEngine.this.notifyObservers(new Update.State.HideTyping());
                }
                SupportEngine.this.notifyObservers(new Update.State.ApplyMessagingItems(conversationState.getMessages()));
            }
        });
        this.updateViewObserver.addListener(new ActionListener<Update>() { // from class: zendesk.support.SupportEngine.2
            @Override // zendesk.classic.messaging.components.ActionListener
            public void onAction(Update update) {
                SupportEngine.this.notifyObservers(update);
            }
        });
    }

    @Override // zendesk.classic.messaging.Engine
    public String getId() {
        return SUPPORT_ENGINE_ID;
    }

    @Override // zendesk.classic.messaging.Engine
    public Engine.TransferOptionDescription getTransferOptionDescription() {
        return this.description;
    }

    @Override // zendesk.classic.messaging.Engine
    public void onEvent(Event event) {
        String type = event.getType();
        type.getClass();
        char c3 = 65535;
        switch (type.hashCode()) {
            case -1961383397:
                if (type.equals(Event.RESPONSE_OPTION_CLICKED)) {
                    c3 = 0;
                    break;
                }
                break;
            case -1590069370:
                if (type.equals(Event.ACTION_OPTION_CLICKED)) {
                    c3 = 1;
                    break;
                }
                break;
            case 494225091:
                if (type.equals(Event.MESSAGE_SUBMITTED)) {
                    c3 = 2;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                this.supportModel.retryClicked();
                return;
            case 1:
                this.supportModel.actionItemClicked();
                return;
            case 2:
                this.supportModel.textEntered(((Event.MessageSubmitted) event).getTextInput());
                return;
            default:
                return;
        }
    }

    @Override // zendesk.classic.messaging.Engine
    public void start(MessagingApi messagingApi) {
        setupViewObserver(messagingApi.getBotAgentDetails());
        this.supportModel.start(this.context, messagingApi);
    }

    @Override // zendesk.classic.messaging.Engine
    public void stop() {
        this.stateViewObserver.clearListeners();
        this.updateViewObserver.clearListeners();
    }
}
