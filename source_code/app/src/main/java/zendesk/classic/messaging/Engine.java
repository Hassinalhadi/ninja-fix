package zendesk.classic.messaging;

/* loaded from: classes.dex */
public interface Engine {

    /* loaded from: classes.dex */
    public interface ConversationOnGoingCallback {
        void onConversationOngoing(Engine engine, boolean z2);
    }

    /* loaded from: classes.dex */
    public static class TransferOptionDescription {
        private final String displayName;
        private final String engineId;

        public TransferOptionDescription(String str, String str2) {
            this.engineId = str;
            this.displayName = str2;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public String getEngineId() {
            return this.engineId;
        }
    }

    /* loaded from: classes.dex */
    public interface UpdateObserver {
        void update(Update update);
    }

    String getId();

    TransferOptionDescription getTransferOptionDescription();

    void isConversationOngoing(ConversationOnGoingCallback conversationOnGoingCallback);

    @Deprecated
    boolean isConversationOngoing();

    void notifyObservers(Update update);

    void onEvent(Event event);

    boolean registerObserver(UpdateObserver updateObserver);

    void start(MessagingApi messagingApi);

    void stop();

    boolean unregisterObserver(UpdateObserver updateObserver);
}
