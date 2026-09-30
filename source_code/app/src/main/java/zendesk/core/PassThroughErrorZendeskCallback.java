package zendesk.core;

import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;

/* loaded from: classes.dex */
abstract class PassThroughErrorZendeskCallback<E> extends ZendeskCallback<E> {
    private final ZendeskCallback callback;

    public PassThroughErrorZendeskCallback(ZendeskCallback zendeskCallback) {
        this.callback = zendeskCallback;
    }

    @Override // com.zendesk.service.ZendeskCallback
    public void onError(ErrorResponse errorResponse) {
        ZendeskCallback zendeskCallback = this.callback;
        if (zendeskCallback != null) {
            zendeskCallback.onError(errorResponse);
        }
    }

    @Override // com.zendesk.service.ZendeskCallback
    public abstract void onSuccess(E e);
}
