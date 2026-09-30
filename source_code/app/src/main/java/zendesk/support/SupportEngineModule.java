package zendesk.support;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.Update;
import zendesk.classic.messaging.components.ActionListener;
import zendesk.classic.messaging.components.CompositeActionListener;
import zendesk.classic.messaging.components.Timer;
import zendesk.classic.messaging.components.bot.BotMessageDispatcher;
import zendesk.configurations.ConfigurationHelper;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Zendesk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SupportEngineModule {
    public BotMessageDispatcher<MessagingItem> botMessageDispatcher(BotMessageDispatcher.MessageIdentifier<MessagingItem> messageIdentifier, ActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> actionListener, ActionListener<Update> actionListener2, Timer.Factory factory) {
        return new BotMessageDispatcher<>(messageIdentifier, actionListener, actionListener2, factory);
    }

    public ConfigurationHelper configurationHelper() {
        return new ConfigurationHelper();
    }

    public EmailValidator emailValidator() {
        return new EmailValidator();
    }

    public BotMessageDispatcher.MessageIdentifier<MessagingItem> interactionIdentifier() {
        return new BotMessageDispatcher.MessageIdentifier<MessagingItem>() { // from class: zendesk.support.SupportEngineModule.3
            @Override // zendesk.classic.messaging.components.bot.BotMessageDispatcher.MessageIdentifier
            public String getId(MessagingItem messagingItem) {
                return messagingItem.getId();
            }
        };
    }

    public Handler provideHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public RequestCreator requestCreator(RequestProvider requestProvider, UploadProvider uploadProvider) {
        return new RequestCreator(requestProvider, uploadProvider);
    }

    public ActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> stateActionListener(final CompositeActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> compositeActionListener) {
        return new ActionListener<BotMessageDispatcher.ConversationState<MessagingItem>>() { // from class: zendesk.support.SupportEngineModule.1
            @Override // zendesk.classic.messaging.components.ActionListener
            public void onAction(BotMessageDispatcher.ConversationState<MessagingItem> conversationState) {
                compositeActionListener.onAction(conversationState);
            }
        };
    }

    public CompositeActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> stateCompositeActionListener() {
        return CompositeActionListener.create();
    }

    public SupportEngine supportEngine(Context context, SupportEngineModel supportEngineModel, CompositeActionListener<BotMessageDispatcher.ConversationState<MessagingItem>> compositeActionListener, CompositeActionListener<Update> compositeActionListener2) {
        return new SupportEngine(context, supportEngineModel, compositeActionListener, compositeActionListener2);
    }

    public SupportEngineModel supportEngineModel(SupportSettingsProvider supportSettingsProvider, RequestCreator requestCreator, AuthenticationProvider authenticationProvider, ConfigurationHelper configurationHelper, EmailValidator emailValidator, BotMessageDispatcher<MessagingItem> botMessageDispatcher) {
        return new SupportEngineModel(supportSettingsProvider, requestCreator, Zendesk.INSTANCE, authenticationProvider, emailValidator, configurationHelper, new AtomicBoolean(false), botMessageDispatcher);
    }

    public Timer.Factory timerFactory(Handler handler) {
        return new Timer.Factory(handler);
    }

    public ActionListener<Update> updateActionListener(final CompositeActionListener<Update> compositeActionListener) {
        return new ActionListener<Update>() { // from class: zendesk.support.SupportEngineModule.2
            @Override // zendesk.classic.messaging.components.ActionListener
            public void onAction(Update update) {
                compositeActionListener.onAction(update);
            }
        };
    }

    public CompositeActionListener<Update> updateViewObserver() {
        return CompositeActionListener.create();
    }
}
