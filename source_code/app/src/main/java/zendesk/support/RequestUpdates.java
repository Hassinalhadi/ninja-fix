package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class RequestUpdates {
    private final Map<String, Integer> requestIds;

    public RequestUpdates(Map<String, Integer> map) {
        if (map == null) {
            this.requestIds = Collections.EMPTY_MAP;
        } else {
            this.requestIds = map;
        }
    }

    public Map<String, Integer> getRequestUpdates() {
        return CollectionUtils.copyOf(this.requestIds);
    }

    public boolean hasUpdatedRequests() {
        return !this.requestIds.isEmpty();
    }

    public boolean isRequestUnread(String str) {
        if (this.requestIds.containsKey(str) && this.requestIds.get(str).intValue() > 0) {
            return true;
        }
        return false;
    }

    public int totalUpdates() {
        Iterator<Integer> it = this.requestIds.values().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().intValue();
        }
        return i4;
    }
}
