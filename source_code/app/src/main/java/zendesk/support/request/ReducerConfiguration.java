package zendesk.support.request;

import zendesk.support.suas.Action;
import zendesk.support.suas.Reducer;

/* loaded from: classes.dex */
class ReducerConfiguration extends Reducer<StateConfig> {
    @Override // zendesk.support.suas.Reducer
    public /* bridge */ /* synthetic */ StateConfig reduce(StateConfig stateConfig, Action action) {
        return reduce2(stateConfig, (Action<?>) action);
    }

    @Override // zendesk.support.suas.Reducer
    public StateConfig getInitialState() {
        return new StateConfig();
    }

    /* renamed from: reduce, reason: avoid collision after fix types in other method */
    public StateConfig reduce2(StateConfig stateConfig, Action<?> action) {
        String actionType = action.getActionType();
        actionType.getClass();
        if (actionType.equals("LOAD_SETTINGS_SUCCESS")) {
            return stateConfig.newBuilder().setSettings((StateSettings) action.getData()).build();
        }
        if (!actionType.equals("START_CONFIG")) {
            return null;
        }
        RequestConfiguration requestConfiguration = (RequestConfiguration) action.getData();
        return stateConfig.newBuilder().setTags(requestConfiguration.getTags()).setTicketForm(requestConfiguration.getTicketForm()).setSubject(requestConfiguration.getRequestSubject()).build();
    }
}
