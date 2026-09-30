package zendesk.support.requestlist;

import com.zendesk.service.SafeZendeskCallback;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
class CancelableCompositeCallback {
    private Set<SafeZendeskCallback> zendeskCallbacks = new HashSet();

    public void add(SafeZendeskCallback... safeZendeskCallbackArr) {
        for (SafeZendeskCallback safeZendeskCallback : safeZendeskCallbackArr) {
            add(safeZendeskCallback);
        }
    }

    public void cancel() {
        Iterator<SafeZendeskCallback> it = this.zendeskCallbacks.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.zendeskCallbacks.clear();
    }

    public void add(SafeZendeskCallback safeZendeskCallback) {
        this.zendeskCallbacks.add(safeZendeskCallback);
    }
}
