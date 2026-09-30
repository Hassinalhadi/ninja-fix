package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RawTicketFormResponse {
    private List<RawTicketField> ticketFields;
    private List<RawTicketForm> ticketForms;

    public List<RawTicketField> getTicketFields() {
        return CollectionUtils.copyOf(this.ticketFields);
    }

    public List<RawTicketForm> getTicketForms() {
        return CollectionUtils.copyOf(this.ticketForms);
    }
}
