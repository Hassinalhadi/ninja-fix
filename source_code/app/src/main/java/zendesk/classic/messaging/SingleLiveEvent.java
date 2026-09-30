package zendesk.classic.messaging;

import androidx.lifecycle.A;
import androidx.lifecycle.al;
import androidx.lifecycle.az;
import com.zendesk.logger.Logger;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SingleLiveEvent<T> extends az {
    private static final String TAG = "SingleLiveEvent";
    private final AtomicBoolean pending = new AtomicBoolean(false);

    public void call() {
        setValue(null);
    }

    @Override // androidx.lifecycle.au
    public void observe(al alVar, final A a6) {
        if (hasActiveObservers()) {
            Logger.w(TAG, "Multiple observers registered but only one will be notified of changes.", new Object[0]);
        }
        super.observe(alVar, new A() { // from class: zendesk.classic.messaging.SingleLiveEvent.1
            @Override // androidx.lifecycle.A
            public void onChanged(T t5) {
                if (SingleLiveEvent.this.pending.compareAndSet(true, false)) {
                    a6.onChanged(t5);
                }
            }
        });
    }

    @Override // androidx.lifecycle.au
    public void setValue(T t5) {
        this.pending.set(true);
        super.setValue(t5);
    }
}
