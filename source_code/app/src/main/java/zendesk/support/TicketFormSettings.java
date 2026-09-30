package zendesk.support;

/* loaded from: classes.dex */
public class TicketFormSettings {
    private static TicketFormSettings DEFAULT = new TicketFormSettings(false);
    private boolean available;

    public TicketFormSettings(boolean z2) {
        this.available = z2;
    }

    public static TicketFormSettings defaultSettings() {
        return DEFAULT;
    }

    public boolean isAvailable() {
        return this.available;
    }
}
