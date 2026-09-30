package zendesk.support.request;

import zendesk.support.suas.Action;
import zendesk.support.suas.Reducer;

/* loaded from: classes.dex */
class ReducerAndroidLifecycle extends Reducer<StateAndroidLifecycle> {
    @Override // zendesk.support.suas.Reducer
    public /* bridge */ /* synthetic */ StateAndroidLifecycle reduce(StateAndroidLifecycle stateAndroidLifecycle, Action action) {
        return reduce2(stateAndroidLifecycle, (Action<?>) action);
    }

    @Override // zendesk.support.suas.Reducer
    public StateAndroidLifecycle getInitialState() {
        return new StateAndroidLifecycle();
    }

    /* renamed from: reduce, reason: avoid collision after fix types in other method */
    public StateAndroidLifecycle reduce2(StateAndroidLifecycle stateAndroidLifecycle, Action<?> action) {
        String actionType = action.getActionType();
        actionType.getClass();
        if (actionType.equals("ANDROID_ON_PAUSE")) {
            return new StateAndroidLifecycle(2);
        }
        if (actionType.equals("ANDROID_ON_RESUME")) {
            return new StateAndroidLifecycle(1);
        }
        return null;
    }
}
