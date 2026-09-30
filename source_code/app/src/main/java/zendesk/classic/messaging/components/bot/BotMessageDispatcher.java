package zendesk.classic.messaging.components.bot;

import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import zendesk.classic.messaging.Update;
import zendesk.classic.messaging.components.ActionListener;
import zendesk.classic.messaging.components.Timer;

/* loaded from: classes.dex */
public class BotMessageDispatcher<T> {
    private static final int TYPING_INDICATOR_DELAY = (int) TimeUnit.MILLISECONDS.toMillis(1200);
    private final MessageIdentifier<T> messageIdentifier;
    private boolean showTypingIndicator;
    private final ActionListener<ConversationState<T>> stateActionListener;
    private Timer.Factory timerFactory;
    private final ActionListener<Update> updateActionListener;
    private List<T> messages = new ArrayList();
    private Queue<Dispatch<T>> messageQueue = new LinkedList();
    private boolean messageProcessing = false;

    /* loaded from: classes.dex */
    public static class ConversationState<T> {
        private final List<T> messages;
        private final boolean typingIndicator;

        public ConversationState(List<T> list, boolean z2) {
            this.messages = list;
            this.typingIndicator = z2;
        }

        public List<T> getMessages() {
            return this.messages;
        }

        public boolean shouldShowTypingIndicator() {
            return this.typingIndicator;
        }
    }

    /* loaded from: classes.dex */
    public static class Dispatch<T> {
        private final DispatchListener dispatchListener;
        private final List<T> messages;
        private final List<Update> updates;

        public Dispatch(List<T> list, DispatchListener dispatchListener, List<Update> list2) {
            this.messages = list;
            this.dispatchListener = dispatchListener;
            this.updates = list2;
        }
    }

    /* loaded from: classes.dex */
    public interface DispatchListener {
        void onDispatch();
    }

    /* loaded from: classes.dex */
    public interface MessageIdentifier<T> {
        String getId(T t5);
    }

    public BotMessageDispatcher(MessageIdentifier<T> messageIdentifier, ActionListener<ConversationState<T>> actionListener, ActionListener<Update> actionListener2, Timer.Factory factory) {
        this.messageIdentifier = messageIdentifier;
        this.stateActionListener = actionListener;
        this.updateActionListener = actionListener2;
        this.timerFactory = factory;
    }

    private List<T> getCopyOfMessages() {
        return CollectionUtils.copyOf(this.messages);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMessage() {
        final Dispatch<T> poll = this.messageQueue.poll();
        if (poll != null) {
            this.messageProcessing = true;
            this.showTypingIndicator = true;
            dispatchState();
            this.timerFactory.create(new Runnable() { // from class: zendesk.classic.messaging.components.bot.BotMessageDispatcher.1
                @Override // java.lang.Runnable
                public void run() {
                    BotMessageDispatcher.this.messages.addAll(poll.messages);
                    for (Update update : poll.updates) {
                        if (update != null) {
                            BotMessageDispatcher.this.dispatchUpdate(update);
                        }
                    }
                    BotMessageDispatcher.this.messageProcessing = false;
                    BotMessageDispatcher.this.showTypingIndicator = false;
                    BotMessageDispatcher.this.dispatchState();
                    BotMessageDispatcher.this.processMessage();
                    if (poll.dispatchListener != null) {
                        poll.dispatchListener.onDispatch();
                    }
                }
            }, TYPING_INDICATOR_DELAY).start();
        }
    }

    public void addMessage(T t5) {
        if (t5 != null) {
            this.messages.add(t5);
        }
        dispatchState();
    }

    public void addMessageWithTypingIndicator(T t5, Update... updateArr) {
        addMessagesWithTypingIndicator(Collections.singletonList(t5), null, updateArr);
    }

    public void addMessagesWithTypingIndicator(List<T> list, Update... updateArr) {
        addMessagesWithTypingIndicator(list, null, updateArr);
    }

    public void dispatchState() {
        this.stateActionListener.onAction(new ConversationState<>(getCopyOfMessages(), this.showTypingIndicator));
    }

    public void dispatchUpdate(Update update) {
        this.updateActionListener.onAction(update);
    }

    public T getLastMessage() {
        if (CollectionUtils.isEmpty(this.messages)) {
            return null;
        }
        return this.messages.get(r0.size() - 1);
    }

    public T getMessageById(String str) {
        for (T t5 : this.messages) {
            if (this.messageIdentifier.getId(t5).equals(str)) {
                return t5;
            }
        }
        return null;
    }

    public void removeLastMessages(int i4) {
        if (i4 <= 0) {
            return;
        }
        if (this.messages.size() < i4) {
            this.messages.clear();
        } else {
            List<T> list = this.messages;
            this.messages = list.subList(0, list.size() - i4);
        }
        dispatchState();
    }

    public void removeMessage(String str) {
        for (T t5 : this.messages) {
            if (str.equals(this.messageIdentifier.getId(t5))) {
                this.messages.remove(t5);
                dispatchState();
                return;
            }
        }
    }

    public void replaceMessage(String str, T t5) {
        removeMessage(str);
        this.messages.add(t5);
        dispatchState();
    }

    public void addMessageWithTypingIndicator(T t5, DispatchListener dispatchListener) {
        addMessagesWithTypingIndicator(Collections.singletonList(t5), dispatchListener, new Update[0]);
    }

    public void addMessagesWithTypingIndicator(List<T> list, DispatchListener dispatchListener, Update... updateArr) {
        this.messageQueue.add(new Dispatch<>(list, dispatchListener, Arrays.asList(updateArr)));
        if (this.messageProcessing) {
            return;
        }
        processMessage();
    }

    public void addMessageWithTypingIndicator(T t5, DispatchListener dispatchListener, Update... updateArr) {
        addMessagesWithTypingIndicator(Collections.singletonList(t5), dispatchListener, updateArr);
    }
}
