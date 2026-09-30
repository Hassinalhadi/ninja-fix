package zendesk.support;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface RequestSessionCache {
    boolean containsAllTicketForms(List<Long> list);

    List<TicketForm> getTicketFormsById(List<Long> list);

    void updateTicketFormCache(List<TicketForm> list);
}
