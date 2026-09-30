package zendesk.classic.messaging;

import androidx.lifecycle.A;
import androidx.lifecycle.Y;
import androidx.lifecycle.au;
import androidx.lifecycle.ay;
import androidx.lifecycle.az;
import java.util.List;
import zendesk.classic.messaging.ui.MessagingState;

@MessagingScope
/* loaded from: classes.dex */
public class MessagingViewModel extends Y implements EventListener {
    private final az counterLiveData;
    private final ay liveBannersState;
    private final ay liveDialogState;
    private final ay liveMessagingState;
    private final au liveNavigationStream;
    private final MessagingModel messagingModel;

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public MessagingViewModel(MessagingModel messagingModel) {
        this.messagingModel = messagingModel;
        ay ayVar = new ay();
        this.liveMessagingState = ayVar;
        this.liveNavigationStream = messagingModel.getLiveNavigationUpdates();
        ayVar.setValue(new MessagingState.Builder().withEnabled(true).build());
        ay ayVar2 = new ay();
        this.liveBannersState = ayVar2;
        this.liveDialogState = new ay();
        this.counterLiveData = new au();
        ayVar.bravo(messagingModel.getLiveMessagingItems(), new A() { // from class: zendesk.classic.messaging.MessagingViewModel.1
            @Override // androidx.lifecycle.A
            public void onChanged(List<MessagingItem> list) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withMessagingItems(list).build());
            }
        });
        ayVar.bravo(messagingModel.getLiveComposerEnabled(), new A() { // from class: zendesk.classic.messaging.MessagingViewModel.2
            @Override // androidx.lifecycle.A
            public void onChanged(Boolean bool) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withEnabled(bool.booleanValue()).build());
            }
        });
        ayVar.bravo(messagingModel.getLiveTyping(), new A() { // from class: zendesk.classic.messaging.MessagingViewModel.3
            @Override // androidx.lifecycle.A
            public void onChanged(Typing typing) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withTypingIndicatorState(new MessagingState.TypingState(typing.isTyping(), typing.getAgentDetails())).build());
            }
        });
        ayVar.bravo(messagingModel.getLiveConnection(), new A() { // from class: zendesk.classic.messaging.MessagingViewModel.4
            @Override // androidx.lifecycle.A
            public void onChanged(ConnectionState connectionState) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withConnectionState(connectionState).build());
            }
        });
        ayVar.bravo(messagingModel.getLiveComposerHint(), new A() { // from class: zendesk.classic.messaging.MessagingViewModel.5
            @Override // androidx.lifecycle.A
            public void onChanged(String str) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withComposerHint(str).build());
            }
        });
        ayVar.bravo(messagingModel.getLiveKeyboardInputType(), new A() { // from class: zendesk.classic.messaging.MessagingViewModel.6
            @Override // androidx.lifecycle.A
            public void onChanged(Integer num) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withKeyboardInputType(num.intValue()).build());
            }
        });
        ayVar.bravo(messagingModel.getLiveAttachmentSettings(), new A() { // from class: zendesk.classic.messaging.MessagingViewModel.7
            @Override // androidx.lifecycle.A
            public void onChanged(AttachmentSettings attachmentSettings) {
                MessagingViewModel.this.liveMessagingState.setValue(((MessagingState) MessagingViewModel.this.liveMessagingState.getValue()).newBuilder().withAttachmentSettings(attachmentSettings).build());
            }
        });
        ayVar2.bravo(messagingModel.getLiveInterfaceUpdates(), new A() { // from class: zendesk.classic.messaging.MessagingViewModel.8
            @Override // androidx.lifecycle.A
            public void onChanged(Banner banner) {
                MessagingViewModel.this.liveBannersState.setValue(banner);
            }
        });
    }

    public au getCounterLiveData() {
        return this.counterLiveData;
    }

    public SingleLiveEvent<DialogContent> getDialogUpdates() {
        return this.messagingModel.getLiveDialogUpdates();
    }

    public SingleLiveEvent<Banner> getLiveInterfaceUpdateItems() {
        return this.messagingModel.getLiveInterfaceUpdates();
    }

    public au getLiveMenuItems() {
        return this.messagingModel.getLiveMenuItems();
    }

    public au getLiveMessagingState() {
        return this.liveMessagingState;
    }

    public au getLiveNavigationStream() {
        return this.liveNavigationStream;
    }

    @Override // androidx.lifecycle.Y
    public void onCleared() {
        this.messagingModel.stop();
    }

    @Override // zendesk.classic.messaging.EventListener
    public void onEvent(Event event) {
        this.messagingModel.onEvent(event);
    }

    public void setCounterValue(int i4) {
        this.counterLiveData.setValue(Integer.valueOf(i4));
    }

    public void start() {
        this.messagingModel.start();
    }
}
