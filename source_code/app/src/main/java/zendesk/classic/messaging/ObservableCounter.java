package zendesk.classic.messaging;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class ObservableCounter {
    private final AtomicInteger counter = new AtomicInteger();
    private final OnCountCompletedListener onCountCompletedListener;

    /* loaded from: classes.dex */
    public interface OnCountCompletedListener {
        void onCountCompleted();
    }

    public ObservableCounter(OnCountCompletedListener onCountCompletedListener) {
        this.onCountCompletedListener = onCountCompletedListener;
    }

    public void decrement() {
        if (this.counter.decrementAndGet() == 0) {
            this.onCountCompletedListener.onCountCompleted();
        }
    }

    public void increment(int i4) {
        this.counter.addAndGet(i4);
    }
}
