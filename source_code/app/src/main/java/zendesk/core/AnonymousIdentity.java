package zendesk.core;

/* loaded from: classes.dex */
public final class AnonymousIdentity implements Identity {
    private String email;
    private String name;
    private String sdkGuid;

    /* loaded from: classes.dex */
    public static class Builder {
        private String email;
        private String name;

        public Identity build() {
            return new AnonymousIdentity(this, 0);
        }

        public Builder withEmailIdentifier(String str) {
            this.email = str;
            return this;
        }

        public Builder withNameIdentifier(String str) {
            this.name = str;
            return this;
        }
    }

    public /* synthetic */ AnonymousIdentity(Builder builder, int i4) {
        this(builder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousIdentity.class != obj.getClass()) {
            return false;
        }
        AnonymousIdentity anonymousIdentity = (AnonymousIdentity) obj;
        String str = this.email;
        if (str == null ? anonymousIdentity.email != null : !str.equals(anonymousIdentity.email)) {
            return false;
        }
        String str2 = this.name;
        String str3 = anonymousIdentity.name;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getSdkGuid() {
        return this.sdkGuid;
    }

    public int hashCode() {
        int i4;
        String str = this.email;
        int i5 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * 31;
        String str2 = this.name;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return i10 + i5;
    }

    public void setSdkGuid(String str) {
        this.sdkGuid = str;
    }

    public AnonymousIdentity() {
    }

    private AnonymousIdentity(Builder builder) {
        this.email = builder.email;
        this.name = builder.name;
    }
}
