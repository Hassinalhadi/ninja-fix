package com.zendesk.service;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class CancellableCompositeZendeskCallback<T> extends ZendeskCallback<T> {
    private Set<SafeZendeskCallback<T>> callbacks = new LinkedHashSet();

    public void add(SafeZendeskCallback<T> safeZendeskCallback) {
        this.callbacks.add(safeZendeskCallback);
    }

    public void cancel() {
        Iterator<SafeZendeskCallback<T>> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.callbacks.clear();
    }

    @Override // com.zendesk.service.ZendeskCallback
    public void onError(ErrorResponse errorResponse) {
        Iterator<SafeZendeskCallback<T>> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onError(errorResponse);
        }
        this.callbacks.clear();
    }

    @Override // com.zendesk.service.ZendeskCallback
    public void onSuccess(T t5) {
        Iterator<SafeZendeskCallback<T>> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onSuccess(t5);
        }
        this.callbacks.clear();
    }

    public void remove(SafeZendeskCallback<T> safeZendeskCallback) {
        this.callbacks.remove(safeZendeskCallback);
    }
}
