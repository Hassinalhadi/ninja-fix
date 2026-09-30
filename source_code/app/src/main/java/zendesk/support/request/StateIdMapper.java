package zendesk.support.request;

import android.annotation.SuppressLint;
import com.zendesk.util.CollectionUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StateIdMapper implements Serializable {
    private final Map<Long, Long> localToRemote;
    private final Map<Long, Long> remoteToLocal;

    private StateIdMapper(Map<Long, Long> map, Map<Long, Long> map2) {
        this.remoteToLocal = map;
        this.localToRemote = map2;
    }

    public StateIdMapper addIdMapping(Long l10, Long l11) {
        this.remoteToLocal.put(l10, l11);
        this.localToRemote.put(l11, l10);
        return copy();
    }

    public StateIdMapper copy() {
        return new StateIdMapper(CollectionUtils.copyOf(this.remoteToLocal), CollectionUtils.copyOf(this.localToRemote));
    }

    public Long getLocalId(Long l10) {
        return this.remoteToLocal.get(l10);
    }

    public Long getRemoteId(Long l10) {
        return this.localToRemote.get(l10);
    }

    public Set<Long> getRemoteIds() {
        return this.remoteToLocal.keySet();
    }

    public boolean hasLocalId(Long l10) {
        if (this.remoteToLocal.containsKey(l10) && this.localToRemote.containsValue(l10)) {
            return true;
        }
        return false;
    }

    public boolean hasRemoteId(Long l10) {
        if (this.localToRemote.containsKey(l10) && this.remoteToLocal.containsValue(l10)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "IdMapper{ remoteToLocal=" + this.remoteToLocal + " localToRemote=" + this.localToRemote + '}';
    }

    @SuppressLint({"UseSparseArrays"})
    public StateIdMapper() {
        this.localToRemote = new HashMap();
        this.remoteToLocal = new HashMap();
    }
}
