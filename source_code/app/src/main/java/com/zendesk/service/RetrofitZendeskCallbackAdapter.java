package com.zendesk.service;

import vg.aq;
import vg.d;
import vg.g;

/* loaded from: classes2.dex */
public class RetrofitZendeskCallbackAdapter<E, F> implements g {
    protected static final RequestExtractor DEFAULT_EXTRACTOR = new DefaultExtractor();
    private final ZendeskCallback<F> callback;
    private final RequestExtractor<E, F> extractor;

    /* loaded from: classes2.dex */
    public static final class DefaultExtractor<E> implements RequestExtractor<E, E> {
        @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
        public E extract(E e) {
            return e;
        }
    }

    /* loaded from: classes2.dex */
    public interface RequestExtractor<E, F> {
        F extract(E e);
    }

    public RetrofitZendeskCallbackAdapter(ZendeskCallback<F> zendeskCallback, RequestExtractor<E, F> requestExtractor) {
        this.callback = zendeskCallback;
        this.extractor = requestExtractor;
    }

    @Override // vg.g
    public void onFailure(d<E> dVar, Throwable th) {
        ZendeskCallback<F> zendeskCallback = this.callback;
        if (zendeskCallback != null) {
            zendeskCallback.onError(RetrofitErrorResponse.throwable(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.g
    public void onResponse(d<E> dVar, aq<E> aqVar) {
        if (this.callback != null) {
            if (aqVar.alpha.getIsSuccessful()) {
                this.callback.onSuccess(this.extractor.extract(aqVar.bravo));
            } else {
                this.callback.onError(RetrofitErrorResponse.response(aqVar));
            }
        }
    }

    public RetrofitZendeskCallbackAdapter(ZendeskCallback<F> zendeskCallback) {
        this(zendeskCallback, DEFAULT_EXTRACTOR);
    }
}
