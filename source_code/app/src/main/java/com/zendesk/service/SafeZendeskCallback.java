package com.zendesk.service;

import com.zendesk.logger.Logger;

/* loaded from: classes2.dex */
public class SafeZendeskCallback<T> extends ZendeskCallback<T> {
    private static final String LOG_TAG = "SafeZendeskCallback";
    private final ZendeskCallback<T> callback;
    private boolean cancelled = false;

    public SafeZendeskCallback(ZendeskCallback<T> zendeskCallback) {
        this.callback = zendeskCallback;
    }

    public static <T> SafeZendeskCallback<T> from(ZendeskCallback<T> zendeskCallback) {
        return new SafeZendeskCallback<>(zendeskCallback);
    }

    public void cancel() {
        this.cancelled = true;
    }

    @Override // com.zendesk.service.ZendeskCallback
    public void onError(ErrorResponse errorResponse) {
        ZendeskCallback<T> zendeskCallback;
        if (!this.cancelled && (zendeskCallback = this.callback) != null) {
            zendeskCallback.onError(errorResponse);
        } else {
            Logger.e(LOG_TAG, errorResponse);
        }
    }

    @Override // com.zendesk.service.ZendeskCallback
    public void onSuccess(T t5) {
        ZendeskCallback<T> zendeskCallback;
        if (!this.cancelled && (zendeskCallback = this.callback) != null) {
            zendeskCallback.onSuccess(t5);
        } else {
            Logger.w(LOG_TAG, "Operation was a success but callback is null or was cancelled", new Object[0]);
        }
    }
}
