package zendesk.support;

import P8.c;
import com.zendesk.util.CollectionUtils;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
class RawTicketForm {
    private Date createdAt;
    private boolean endUserVisible;

    /* renamed from: id, reason: collision with root package name */
    private long f14248id;
    private boolean inAllBrands;
    private boolean inAllOrganizations;

    @c("active")
    private boolean isActive;

    @c("default")
    private boolean isDefault;
    private String name;
    private int position;
    private String rawDisplayName;
    private String rawName;
    private List<Long> restrictedBrandIds;
    private List<Long> restrictedOrganizationIds;
    private List<Long> ticketFieldIds;
    private Date updatedAt;
    private String url;

    public static TicketForm create(RawTicketForm rawTicketForm, List<TicketField> list) {
        return new TicketForm(rawTicketForm.getId(), rawTicketForm.getName(), list);
    }

    public long getId() {
        return this.f14248id;
    }

    public String getName() {
        return this.name;
    }

    public List<Long> getTicketFieldIds() {
        return CollectionUtils.copyOf(this.ticketFieldIds);
    }
}
