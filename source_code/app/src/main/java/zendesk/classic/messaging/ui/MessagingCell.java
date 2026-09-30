package zendesk.classic.messaging.ui;

import android.view.View;
import zendesk.classic.messaging.ui.Updatable;

/* loaded from: classes.dex */
class MessagingCell<T, V extends View & Updatable<T>> {

    /* renamed from: id, reason: collision with root package name */
    private final String f14228id;
    private final int layoutRes;
    private final T state;
    private final Class<V> viewClassType;

    public MessagingCell(String str, T t5, int i4, Class<V> cls) {
        this.f14228id = str;
        this.state = t5;
        this.layoutRes = i4;
        this.viewClassType = cls;
    }

    public boolean areContentsTheSame(MessagingCell messagingCell) {
        if (getId().equals(messagingCell.getId()) && messagingCell.state.equals(this.state)) {
            return true;
        }
        return false;
    }

    public void bind(V v4) {
        ((Updatable) v4).update(this.state);
    }

    public String getId() {
        return this.f14228id;
    }

    public int getLayoutRes() {
        return this.layoutRes;
    }

    public Class<V> getViewClassType() {
        return this.viewClassType;
    }
}
