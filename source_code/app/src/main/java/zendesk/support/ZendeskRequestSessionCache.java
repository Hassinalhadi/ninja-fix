package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class ZendeskRequestSessionCache implements RequestSessionCache {
    private final Map<Long, TicketForm> cachedTicketForms = new HashMap();

    @Override // zendesk.support.RequestSessionCache
    public boolean containsAllTicketForms(List<Long> list) {
        boolean z2;
        List ensureEmpty = CollectionUtils.ensureEmpty(list);
        synchronized (this.cachedTicketForms) {
            try {
                Iterator it = ensureEmpty.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!this.cachedTicketForms.containsKey((Long) it.next())) {
                            z2 = false;
                            break;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
            } finally {
            }
        }
        return z2;
    }

    @Override // zendesk.support.RequestSessionCache
    public synchronized List<TicketForm> getTicketFormsById(List<Long> list) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List ensureEmpty = CollectionUtils.ensureEmpty(list);
        synchronized (this.cachedTicketForms) {
            try {
                Iterator it = ensureEmpty.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.cachedTicketForms.get((Long) it.next()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    @Override // zendesk.support.RequestSessionCache
    public void updateTicketFormCache(List<TicketForm> list) {
        List<TicketForm> ensureEmpty = CollectionUtils.ensureEmpty(list);
        HashMap hashMap = new HashMap();
        for (TicketForm ticketForm : ensureEmpty) {
            hashMap.put(Long.valueOf(ticketForm.getId()), ticketForm);
        }
        synchronized (this.cachedTicketForms) {
            this.cachedTicketForms.putAll(hashMap);
        }
    }
}
