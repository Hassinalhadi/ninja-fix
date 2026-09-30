package zendesk.support.request;

import java.util.List;
import zendesk.support.suas.Action;
import zendesk.support.suas.Reducer;

/* loaded from: classes.dex */
class ReducerUiState extends Reducer<StateUi> {
    @Override // zendesk.support.suas.Reducer
    public /* bridge */ /* synthetic */ StateUi reduce(StateUi stateUi, Action action) {
        return reduce2(stateUi, (Action<?>) action);
    }

    @Override // zendesk.support.suas.Reducer
    public StateUi getInitialState() {
        return new StateUi();
    }

    /* renamed from: reduce, reason: avoid collision after fix types in other method */
    public StateUi reduce2(StateUi stateUi, Action<?> action) {
        String actionType = action.getActionType();
        actionType.getClass();
        if (actionType.equals("DIALOG_DISMISSED")) {
            return stateUi.setDialogState(null);
        }
        if (actionType.equals("SHOW_RETRY_DIALOG")) {
            return stateUi.setDialogState(new StateRetryDialog((List) action.getData()));
        }
        return null;
    }
}
