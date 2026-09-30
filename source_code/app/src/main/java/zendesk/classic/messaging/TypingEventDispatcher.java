package zendesk.classic.messaging;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

@MessagingActivityScope
/* loaded from: classes.dex */
public class TypingEventDispatcher {
    static final long TYPING_WINDOW = TimeUnit.SECONDS.toMillis(3);
    private final EventFactory eventFactory;
    private final EventListener eventListener;
    private final Handler handler;
    boolean isTyping = false;
    final Runnable typingStopRunnable;

    public TypingEventDispatcher(final EventListener eventListener, Handler handler, final EventFactory eventFactory) {
        this.eventListener = eventListener;
        this.handler = handler;
        this.eventFactory = eventFactory;
        this.typingStopRunnable = new Runnable() { // from class: zendesk.classic.messaging.TypingEventDispatcher.1
            @Override // java.lang.Runnable
            public void run() {
                eventListener.onEvent(eventFactory.typingStop());
                TypingEventDispatcher.this.isTyping = false;
            }
        };
    }

    public void onTyping() {
        if (this.isTyping) {
            this.handler.removeCallbacks(this.typingStopRunnable);
            this.handler.postDelayed(this.typingStopRunnable, TYPING_WINDOW);
        } else {
            this.isTyping = true;
            this.eventListener.onEvent(this.eventFactory.typingStart());
            this.handler.postDelayed(this.typingStopRunnable, TYPING_WINDOW);
        }
    }
}
