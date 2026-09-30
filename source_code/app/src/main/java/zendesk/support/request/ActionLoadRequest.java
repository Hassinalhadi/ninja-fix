package zendesk.support.request;

import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.StringUtils;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ActionLoadRequest implements AsyncMiddleware.AsyncAction {

    /* renamed from: af, reason: collision with root package name */
    private final ActionFactory f14267af;
    private final RequestProvider requestProvider;

    public ActionLoadRequest(ActionFactory actionFactory, RequestProvider requestProvider) {
        this.f14267af = actionFactory;
        this.requestProvider = requestProvider;
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.f14267af.loadRequest());
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void execute(final Dispatcher dispatcher, GetState getState, final AsyncMiddleware.Callback callback) {
        StateConversation fromState = StateConversation.fromState(getState.getState());
        String remoteId = fromState.getRemoteId();
        if (!StringUtils.hasLength(remoteId)) {
            Logger.d("RequestActivity", "Skip loading request. No remote id found.", new Object[0]);
            dispatcher.dispatch(this.f14267af.skipAction());
            callback.done();
        } else {
            if (fromState.getStatus() != null) {
                Logger.d("RequestActivity", "Skip loading request. Request status already available.", new Object[0]);
                dispatcher.dispatch(this.f14267af.skipAction());
                callback.done();
                return;
            }
            this.requestProvider.getRequest(remoteId, new ZendeskCallback<Request>() { // from class: zendesk.support.request.ActionLoadRequest.1
                @Override // com.zendesk.service.ZendeskCallback
                public void onError(ErrorResponse errorResponse) {
                    Logger.w("RequestActivity", "Error loading request. Error: '%s'", errorResponse.getReason());
                    dispatcher.dispatch(ActionLoadRequest.this.f14267af.loadRequestError(errorResponse));
                    callback.done();
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(Request request) {
                    dispatcher.dispatch(ActionLoadRequest.this.f14267af.loadRequestSuccess(request));
                    callback.done();
                }
            });
        }
    }
}
