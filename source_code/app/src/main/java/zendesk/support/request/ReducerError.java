package zendesk.support.request;

import com.zendesk.service.ErrorResponse;
import zendesk.support.request.ActionFactory;
import zendesk.support.request.StateError;
import zendesk.support.suas.Action;
import zendesk.support.suas.Reducer;

/* loaded from: classes.dex */
class ReducerError extends Reducer<StateError> {
    @Override // zendesk.support.suas.Reducer
    public /* bridge */ /* synthetic */ StateError reduce(StateError stateError, Action action) {
        return reduce2(stateError, (Action<?>) action);
    }

    @Override // zendesk.support.suas.Reducer
    public StateError getInitialState() {
        return new StateError();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0076. Please report as an issue. */
    /* renamed from: reduce, reason: avoid collision after fix types in other method */
    public StateError reduce2(StateError stateError, Action<?> action) {
        if (action instanceof ActionFactory.ErrorAction) {
            ErrorResponse errorResponse = ((ActionFactory.ErrorAction) action).getErrorResponse();
            if (errorResponse.isHttpError() && errorResponse.getStatus() == 401) {
                return new StateError(StateError.ErrorType.NoAccess, errorResponse.getReason());
            }
        }
        String actionType = action.getActionType();
        actionType.getClass();
        char c3 = 65535;
        switch (actionType.hashCode()) {
            case -1193398337:
                if (actionType.equals("LOAD_COMMENTS_UPDATE_SUCCESS")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1063298693:
                if (actionType.equals("LOAD_COMMENTS_INITIAL_ERROR")) {
                    c3 = 1;
                    break;
                }
                break;
            case -292168757:
                if (actionType.equals("LOAD_COMMENT_INITIAL")) {
                    c3 = 2;
                    break;
                }
                break;
            case -16010570:
                if (actionType.equals("LOAD_COMMENTS_INITIAL_SUCCESS")) {
                    c3 = 3;
                    break;
                }
                break;
            case 1532422677:
                if (actionType.equals("CREATE_REQUEST_ERROR")) {
                    c3 = 4;
                    break;
                }
                break;
            case 1921186300:
                if (actionType.equals("CREATE_COMMENT")) {
                    c3 = 5;
                    break;
                }
                break;
        }
        switch (c3) {
            case 1:
                if (action instanceof ActionFactory.ErrorAction) {
                    return new StateError(StateError.ErrorType.InitialGetComments, ((ActionFactory.ErrorAction) action).getErrorResponse().getReason());
                }
            case 0:
            case 2:
            case 3:
                if (stateError.getState() == StateError.ErrorType.InitialGetComments) {
                    return new StateError();
                }
            case 4:
                if (action instanceof ActionFactory.ErrorAction) {
                    return new StateError(StateError.ErrorType.InputFormSubmission, ((ActionFactory.ErrorAction) action).getErrorResponse().getReason());
                }
            case 5:
                if (stateError.getState() == StateError.ErrorType.InputFormSubmission) {
                    return new StateError();
                }
                return null;
            default:
                return null;
        }
    }
}
