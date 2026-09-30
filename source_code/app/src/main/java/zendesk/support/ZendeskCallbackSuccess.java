package zendesk.support;

import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;

/* loaded from: classes.dex */
abstract class ZendeskCallbackSuccess<E> extends ZendeskCallback<E> {
    private final ZendeskCallback callback;

    public ZendeskCallbackSuccess(ZendeskCallback zendeskCallback) {
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
