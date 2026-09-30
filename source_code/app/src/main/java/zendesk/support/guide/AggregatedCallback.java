package zendesk.support.guide;

import com.zendesk.service.ErrorResponse;
import com.zendesk.service.SafeZendeskCallback;
import com.zendesk.service.ZendeskCallback;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class AggregatedCallback<T> extends ZendeskCallback<T> {
    private final Set<SafeZendeskCallback<T>> callbackSet = Collections.synchronizedSet(new HashSet());

    public boolean add(ZendeskCallback<T> zendeskCallback) {
        boolean isEmpty = this.callbackSet.isEmpty();
        this.callbackSet.add(SafeZendeskCallback.from(zendeskCallback));
        return isEmpty;
    }

    public void cancel() {
        Iterator<SafeZendeskCallback<T>> it = this.callbackSet.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.callbackSet.clear();
    }

    @Override // com.zendesk.service.ZendeskCallback
    public void onError(ErrorResponse errorResponse) {
        Iterator<SafeZendeskCallback<T>> it = this.callbackSet.iterator();
        while (it.hasNext()) {
            it.next().onError(errorResponse);
        }
        this.callbackSet.clear();
    }

    @Override // com.zendesk.service.ZendeskCallback
    public void onSuccess(T t5) {
        Iterator<SafeZendeskCallback<T>> it = this.callbackSet.iterator();
        while (it.hasNext()) {
            it.next().onSuccess(t5);
        }
        this.callbackSet.clear();
    }
}
