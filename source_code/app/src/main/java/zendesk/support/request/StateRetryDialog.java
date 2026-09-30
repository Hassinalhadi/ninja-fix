package zendesk.support.request;

import java.io.Serializable;
import java.util.List;
import zendesk.support.request.StateUi;

/* loaded from: classes.dex */
class StateRetryDialog implements StateUi.DialogState, Serializable {
    private final List<StateMessage> message;
    private final boolean visible;

    public StateRetryDialog(List<StateMessage> list) {
        this(list, false);
    }

    public List<StateMessage> getMessage() {
        return this.message;
    }

    @Override // zendesk.support.request.StateUi.DialogState
    public boolean isVisible() {
        return this.visible;
    }

    @Override // zendesk.support.request.StateUi.DialogState
    public StateUi.DialogState setVisible(boolean z2) {
        return new StateRetryDialog(this.message, z2);
    }

    private StateRetryDialog(List<StateMessage> list, boolean z2) {
        this.message = list;
        this.visible = z2;
    }
}
