package zendesk.support;

/* loaded from: classes.dex */
public class TicketFieldOption {

    /* renamed from: id, reason: collision with root package name */
    private long f14257id;
    private boolean isDefault;
    private String name;
    private String value;

    public TicketFieldOption(long j5, String str, String str2, boolean z2) {
        this.f14257id = j5;
        this.name = str;
        this.value = str2;
        this.isDefault = z2;
    }

    public static TicketFieldOption create(RawTicketFieldOption rawTicketFieldOption) {
        return new TicketFieldOption(rawTicketFieldOption.getId(), rawTicketFieldOption.getName(), rawTicketFieldOption.getValue(), rawTicketFieldOption.isDefault());
    }

    public long getId() {
        return this.f14257id;
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
