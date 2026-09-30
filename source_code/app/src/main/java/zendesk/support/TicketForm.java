package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.List;

/* loaded from: classes.dex */
public class TicketForm {

    /* renamed from: id, reason: collision with root package name */
    private long f14258id;
    private String name;
    private List<TicketField> ticketFields;

    public TicketForm(long j5, String str, List<TicketField> list) {
        this.f14258id = j5;
        this.name = str;
        this.ticketFields = CollectionUtils.copyOf(list);
    }

    public long getId() {
        return this.f14258id;
    }

    public String getName() {
        return this.name;
    }

    public List<TicketField> getTicketFields() {
        return CollectionUtils.copyOf(this.ticketFields);
    }
}
