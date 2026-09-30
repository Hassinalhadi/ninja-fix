package zendesk.classic.messaging.components;

import android.view.View;

/* loaded from: classes.dex */
public abstract class CompositeActionListener<T> implements ActionListener<T> {
    public static View.OnClickListener clicks(CompositeActionListener<Void> compositeActionListener) {
        return clicks(null, compositeActionListener);
    }

    public static <T> CompositeActionListener<T> create() {
        return new DefaultCompositeActionListener();
    }

    public abstract void addListener(ActionListener<T> actionListener);

    public abstract void clearListeners();

    public static <T> View.OnClickListener clicks(final T t5, CompositeActionListener<T> compositeActionListener) {
        return new View.OnClickListener() { // from class: zendesk.classic.messaging.components.CompositeActionListener.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CompositeActionListener.this.onAction(t5);
            }
        };
    }
}
