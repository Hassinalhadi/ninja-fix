package zendesk.support;

import java.util.Locale;
import zendesk.support.ZendeskTracker;

/* loaded from: classes.dex */
class ApplicationScope {
    private final Locale locale;
    private final ZendeskTracker zendeskTracker;

    public /* synthetic */ ApplicationScope(Builder builder, int i4) {
        this(builder);
    }

    public Locale getLocale() {
        return this.locale;
    }

    public ZendeskTracker getZendeskTracker() {
        return this.zendeskTracker;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    private ApplicationScope(Builder builder) {
        this.locale = builder.locale;
        this.zendeskTracker = builder.zendeskTracker;
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private Locale locale;
        private ZendeskTracker zendeskTracker;

        public Builder() {
            this.locale = Locale.getDefault();
            this.zendeskTracker = new ZendeskTracker.DefaultTracker();
        }

        public ApplicationScope build() {
            return new ApplicationScope(this, 0);
        }

        public Builder locale(Locale locale) {
            this.locale = locale;
            return this;
        }

        public Builder zendeskTracker(ZendeskTracker zendeskTracker) {
            this.zendeskTracker = zendeskTracker;
            return this;
        }

        public Builder(ApplicationScope applicationScope) {
            this.locale = applicationScope.getLocale();
        }
    }
}
