package zendesk.support.request;

import java.io.Serializable;
import zendesk.support.suas.State;

/* loaded from: classes.dex */
class StateUi implements Serializable {
    private final DialogState dialogState;

    /* loaded from: classes.dex */
    public interface DialogState {
        boolean isVisible();

        DialogState setVisible(boolean z2);
    }

    public StateUi(DialogState dialogState) {
        this.dialogState = dialogState;
    }

    public static StateUi fromState(State state) {
        StateUi stateUi = (StateUi) state.getState(StateUi.class);
        if (stateUi != null) {
            return stateUi;
        }
        return new StateUi();
    }

    public DialogState getDialogState() {
        return this.dialogState;
    }

    public StateUi setDialogState(DialogState dialogState) {
        return new StateUi(dialogState);
    }

    public String toString() {
        return "UiState{dialogState=" + this.dialogState + '}';
    }

    public StateUi() {
        this.dialogState = null;
    }
}
