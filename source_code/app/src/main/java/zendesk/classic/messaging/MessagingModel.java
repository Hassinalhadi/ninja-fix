package zendesk.classic.messaging;

import android.content.res.Resources;
import androidx.lifecycle.au;
import androidx.lifecycle.az;
import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import zendesk.classic.messaging.Engine;
import zendesk.classic.messaging.Event;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.ObservableCounter;
import zendesk.classic.messaging.Update;
import zendesk.configurations.Configuration;

/* JADX INFO: Access modifiers changed from: package-private */
@MessagingScope
/* loaded from: classes.dex */
public class MessagingModel implements MessagingApi, EventListener, Engine.UpdateObserver {
    private static final boolean DEFAULT_ATTACHMENTS_ENABLED = false;
    private static final AttachmentSettings DEFAULT_ATTACHMENT_SETTINGS;
    private static final long DEFAULT_ATTACHMENT_SIZE = 0;
    private static final String DEFAULT_COMPOSER_HINT = "";
    private static final Update DEFAULT_INPUT_STATE_UPDATE;
    private static final Update DEFAULT_MENU_ITEMS;
    private final List<Configuration> configurations;
    private final MessagingConversationLog conversationLog;
    private Engine currentEngine;
    private final AgentDetails defaultAgentDetails;
    private final Map<Engine, List<MessagingItem>> engineItems;
    private final List<Engine> engines;
    private final az liveAttachmentSettings;
    private final az liveComposerEnabled;
    private final az liveComposerHint;
    private final az liveConnection;
    private final SingleLiveEvent<DialogContent> liveDialogUpdates;
    private final SingleLiveEvent<Banner> liveInterfaceUpdates;
    private final az liveKeyboardInputType;
    private final az liveMenuItems;
    private final az liveMessagingItems;
    private final SingleLiveEvent<Update.Action.Navigation> liveNavigationUpdates;
    private final az liveTyping;

    static {
        AttachmentSettings attachmentSettings = new AttachmentSettings(0L, false);
        DEFAULT_ATTACHMENT_SETTINGS = attachmentSettings;
        DEFAULT_INPUT_STATE_UPDATE = new Update.State.UpdateInputFieldState("", Boolean.TRUE, attachmentSettings, 131073);
        DEFAULT_MENU_ITEMS = new Update.ApplyMenuItems(new MenuItem[0]);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public MessagingModel(Resources resources, List<Engine> list, MessagingConfiguration messagingConfiguration, MessagingConversationLog messagingConversationLog) {
        this.engines = new ArrayList(list.size());
        for (Engine engine : list) {
            if (engine != null) {
                this.engines.add(engine);
            }
        }
        this.conversationLog = messagingConversationLog;
        this.configurations = messagingConfiguration.getConfigurations();
        this.defaultAgentDetails = messagingConfiguration.getBotAgentDetails(resources);
        this.engineItems = new LinkedHashMap();
        this.liveMessagingItems = new au();
        this.liveMenuItems = new au();
        this.liveTyping = new au();
        this.liveConnection = new au();
        this.liveComposerHint = new au();
        this.liveKeyboardInputType = new au();
        this.liveComposerEnabled = new au();
        this.liveAttachmentSettings = new au();
        this.liveNavigationUpdates = new SingleLiveEvent<>();
        this.liveInterfaceUpdates = new SingleLiveEvent<>();
        this.liveDialogUpdates = new SingleLiveEvent<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startEngine(Engine engine) {
        Engine engine2 = this.currentEngine;
        if (engine2 != null && engine2 != engine) {
            stopEngine(engine2);
        }
        this.currentEngine = engine;
        engine.registerObserver(this);
        update(DEFAULT_INPUT_STATE_UPDATE);
        update(DEFAULT_MENU_ITEMS);
        engine.start(this);
    }

    private void startInitialEngine(final List<Engine> list) {
        if (!CollectionUtils.isEmpty(list)) {
            if (list.size() == 1) {
                startEngine(list.get(0));
                return;
            }
            final ArrayList arrayList = new ArrayList();
            final ObservableCounter observableCounter = new ObservableCounter(new ObservableCounter.OnCountCompletedListener() { // from class: zendesk.classic.messaging.MessagingModel.1
                @Override // zendesk.classic.messaging.ObservableCounter.OnCountCompletedListener
                public void onCountCompleted() {
                    if (CollectionUtils.isNotEmpty(arrayList)) {
                        MessagingModel.this.startEngine((Engine) arrayList.get(0));
                    } else {
                        MessagingModel.this.startEngine((Engine) list.get(0));
                    }
                }
            });
            observableCounter.increment(list.size());
            Iterator<Engine> it = list.iterator();
            while (it.hasNext()) {
                it.next().isConversationOngoing(new Engine.ConversationOnGoingCallback() { // from class: zendesk.classic.messaging.MessagingModel.2
                    @Override // zendesk.classic.messaging.Engine.ConversationOnGoingCallback
                    public void onConversationOngoing(Engine engine, boolean z2) {
                        if (z2) {
                            arrayList.add(engine);
                        }
                        observableCounter.decrement();
                    }
                });
            }
        }
    }

    private void stopEngine(Engine engine) {
        engine.stop();
        engine.unregisterObserver(this);
    }

    @Override // zendesk.classic.messaging.MessagingApi
    public AgentDetails getBotAgentDetails() {
        return this.defaultAgentDetails;
    }

    @Override // zendesk.classic.messaging.MessagingApi
    public List<Configuration> getConfigurations() {
        return this.configurations;
    }

    @Override // zendesk.classic.messaging.MessagingApi
    public ConversationLog getConversationLog() {
        return this.conversationLog;
    }

    public az getLiveAttachmentSettings() {
        return this.liveAttachmentSettings;
    }

    public az getLiveComposerEnabled() {
        return this.liveComposerEnabled;
    }

    public az getLiveComposerHint() {
        return this.liveComposerHint;
    }

    public au getLiveConnection() {
        return this.liveConnection;
    }

    public SingleLiveEvent<DialogContent> getLiveDialogUpdates() {
        return this.liveDialogUpdates;
    }

    public SingleLiveEvent<Banner> getLiveInterfaceUpdates() {
        return this.liveInterfaceUpdates;
    }

    public az getLiveKeyboardInputType() {
        return this.liveKeyboardInputType;
    }

    public au getLiveMenuItems() {
        return this.liveMenuItems;
    }

    public au getLiveMessagingItems() {
        return this.liveMessagingItems;
    }

    public SingleLiveEvent<Update.Action.Navigation> getLiveNavigationUpdates() {
        return this.liveNavigationUpdates;
    }

    public au getLiveTyping() {
        return this.liveTyping;
    }

    @Override // zendesk.classic.messaging.MessagingApi
    public List<Engine.TransferOptionDescription> getTransferOptionDescriptions() {
        ArrayList arrayList = new ArrayList(this.engines.size());
        for (Engine engine : this.engines) {
            if (!engine.equals(this.currentEngine) && engine.getTransferOptionDescription() != null) {
                arrayList.add(engine.getTransferOptionDescription());
            }
        }
        return arrayList;
    }

    @Override // zendesk.classic.messaging.EventListener
    public void onEvent(Event event) {
        this.conversationLog.addEvent(event);
        if (event.getType().equals(Event.TRANSFER_OPTION_CLICKED)) {
            Event.EngineSelection engineSelection = (Event.EngineSelection) event;
            for (Engine engine : this.engines) {
                if (engineSelection.getSelectedEngine().getEngineId().equals(engine.getId())) {
                    startEngine(engine);
                    return;
                }
            }
            return;
        }
        Engine engine2 = this.currentEngine;
        if (engine2 != null) {
            engine2.onEvent(event);
        }
    }

    public void start() {
        update(Update.State.UpdateInputFieldState.updateInputFieldEnabled(false));
        startInitialEngine(this.engines);
    }

    public void stop() {
        Engine engine = this.currentEngine;
        if (engine != null) {
            engine.stop();
            this.currentEngine.unregisterObserver(this);
        }
    }

    @Override // zendesk.classic.messaging.Engine.UpdateObserver
    public void update(Update update) {
        boolean z2;
        String type = update.getType();
        type.getClass();
        char c3 = 65535;
        switch (type.hashCode()) {
            case -1524638175:
                if (type.equals(Update.UPDATE_INPUT_FIELD_STATE)) {
                    c3 = 0;
                    break;
                }
                break;
            case -358781964:
                if (type.equals(Update.APPLY_MESSAGING_ITEMS)) {
                    c3 = 1;
                    break;
                }
                break;
            case 35633838:
                if (type.equals(Update.SHOW_BANNER)) {
                    c3 = 2;
                    break;
                }
                break;
            case 64608020:
                if (type.equals(Update.HIDE_TYPING)) {
                    c3 = 3;
                    break;
                }
                break;
            case 99891402:
                if (type.equals(Update.SHOW_DIALOG)) {
                    c3 = 4;
                    break;
                }
                break;
            case 381787729:
                if (type.equals(Update.APPLY_MENU_ITEMS)) {
                    c3 = 5;
                    break;
                }
                break;
            case 573178105:
                if (type.equals(Update.SHOW_TYPING)) {
                    c3 = 6;
                    break;
                }
                break;
            case 1766276262:
                if (type.equals(Update.UPDATE_CONNECTION_STATE)) {
                    c3 = 7;
                    break;
                }
                break;
            case 1862666772:
                if (type.equals(Update.NAVIGATION)) {
                    c3 = '\b';
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                Update.State.UpdateInputFieldState updateInputFieldState = (Update.State.UpdateInputFieldState) update;
                String hint = updateInputFieldState.getHint();
                if (hint != null) {
                    this.liveComposerHint.postValue(hint);
                }
                Boolean isEnabled = updateInputFieldState.isEnabled();
                if (isEnabled != null) {
                    this.liveComposerEnabled.postValue(isEnabled);
                }
                AttachmentSettings attachmentSettings = updateInputFieldState.getAttachmentSettings();
                if (attachmentSettings != null) {
                    this.liveAttachmentSettings.postValue(attachmentSettings);
                }
                Integer inputType = updateInputFieldState.getInputType();
                if (inputType != null) {
                    this.liveKeyboardInputType.postValue(inputType);
                    return;
                } else {
                    this.liveKeyboardInputType.postValue(131073);
                    return;
                }
            case 1:
                this.engineItems.put(this.currentEngine, ((Update.State.ApplyMessagingItems) update).getMessagingItems());
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<Engine, List<MessagingItem>> entry : this.engineItems.entrySet()) {
                    for (MessagingItem messagingItem : entry.getValue()) {
                        if (messagingItem instanceof MessagingItem.TransferResponse) {
                            Date timestamp = messagingItem.getTimestamp();
                            String id2 = messagingItem.getId();
                            MessagingItem.TransferResponse transferResponse = (MessagingItem.TransferResponse) messagingItem;
                            AgentDetails agentDetails = transferResponse.getAgentDetails();
                            String message = transferResponse.getMessage();
                            List<Engine.TransferOptionDescription> engineOptions = transferResponse.getEngineOptions();
                            if (this.currentEngine != null && entry.getKey().equals(this.currentEngine)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            messagingItem = new MessagingItem.TransferResponse(timestamp, id2, agentDetails, message, engineOptions, z2);
                        }
                        arrayList.add(messagingItem);
                    }
                }
                this.liveMessagingItems.postValue(arrayList);
                this.conversationLog.setMessagingItems(arrayList);
                return;
            case 2:
                this.liveInterfaceUpdates.postValue(((Update.ShowBanner) update).getBanner());
                return;
            case 3:
                this.liveTyping.postValue(new Typing(false));
                return;
            case 4:
                this.liveDialogUpdates.postValue(((Update.ShowDialog) update).getDialogContent());
                return;
            case 5:
                this.liveMenuItems.postValue(((Update.ApplyMenuItems) update).getMenuItems());
                return;
            case 6:
                this.liveTyping.postValue(new Typing(true, ((Update.State.ShowTyping) update).getAgentDetails()));
                return;
            case 7:
                this.liveConnection.postValue(((Update.State.UpdateConnectionState) update).getConnectionState());
                return;
            case '\b':
                this.liveNavigationUpdates.postValue((Update.Action.Navigation) update);
                return;
            default:
                return;
        }
    }
}
