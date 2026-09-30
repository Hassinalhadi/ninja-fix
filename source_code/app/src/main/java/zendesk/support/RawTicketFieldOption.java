package zendesk.support;

import P8.c;

/* loaded from: classes.dex */
class RawTicketFieldOption {

    /* renamed from: id, reason: collision with root package name */
    private long f14247id;

    @c("default")
    private boolean isDefault;
    private String name;
    private String rawName;
    private String value;

    public static TicketFieldOption create(RawTicketFieldOption rawTicketFieldOption) {
        return new TicketFieldOption(rawTicketFieldOption.getId(), rawTicketFieldOption.getName(), rawTicketFieldOption.getValue(), rawTicketFieldOption.isDefault());
    }

    public long getId() {
        return this.f14247id;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isDefault() {
        return this.isDefault;
    }
}
