package zendesk.classic.messaging.components;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class DefaultCompositeActionListener<T> extends CompositeActionListener<T> {
    private final List<ActionListener<T>> listeners = new ArrayList();

    @Override // zendesk.classic.messaging.components.CompositeActionListener
    public void addListener(ActionListener<T> actionListener) {
        synchronized (this.listeners) {
            this.listeners.add(actionListener);
        }
    }

    @Override // zendesk.classic.messaging.components.CompositeActionListener
    public void clearListeners() {
        this.listeners.clear();
    }

    @Override // zendesk.classic.messaging.components.ActionListener
    public void onAction(T t5) {
        synchronized (this.listeners) {
            try {
                Iterator<ActionListener<T>> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onAction(t5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
