package zendesk.core;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SessionConfiguration {
    private Identity identity;
    private Locale locale;

    /* loaded from: classes.dex */
    public static class Builder {
        private Identity identity;
        private Locale locale;

        public /* synthetic */ Builder(SessionConfiguration sessionConfiguration, int i4) {
            this(sessionConfiguration);
        }

        public SessionConfiguration build() {
            return new SessionConfiguration(this, 0);
        }

        public Builder setIdentity(Identity identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocale(Locale locale) {
            this.locale = locale;
            return this;
        }

        private Builder(SessionConfiguration sessionConfiguration) {
            this.identity = new Identity() { // from class: zendesk.core.SessionConfiguration.Builder.1
            };
            this.locale = Locale.getDefault();
            this.identity = sessionConfiguration.getIdentity();
        }

        public Builder() {
            this.identity = new Identity() { // from class: zendesk.core.SessionConfiguration.Builder.1
            };
            this.locale = Locale.getDefault();
        }
    }

    public /* synthetic */ SessionConfiguration(Builder builder, int i4) {
        this(builder);
    }

    public Identity getIdentity() {
        return this.identity;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public Builder newBuilder() {
        return new Builder(this, 0);
    }

    private SessionConfiguration(Builder builder) {
        this.identity = builder.identity;
        this.locale = builder.locale;
    }
}
