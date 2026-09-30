package zendesk.core;

/* loaded from: classes.dex */
public class ApplicationConfiguration {
    private String applicationId;
    private String oauthClientId;
    private String zendeskUrl;

    public ApplicationConfiguration(String str, String str2, String str3) {
        this.applicationId = str;
        this.zendeskUrl = str2;
        this.oauthClientId = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ApplicationConfiguration applicationConfiguration = (ApplicationConfiguration) obj;
            String str = this.applicationId;
            if (str == null ? applicationConfiguration.applicationId != null : !str.equals(applicationConfiguration.applicationId)) {
                return false;
            }
            String str2 = this.zendeskUrl;
            if (str2 == null ? applicationConfiguration.zendeskUrl != null : !str2.equals(applicationConfiguration.zendeskUrl)) {
                return false;
            }
            String str3 = this.oauthClientId;
            String str4 = applicationConfiguration.oauthClientId;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getOauthClientId() {
        return this.oauthClientId;
    }

    public String getZendeskUrl() {
        return this.zendeskUrl;
    }

    public int hashCode() {
        int i4;
        int i5;
        String str = this.applicationId;
        int i10 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = i4 * 31;
        String str2 = this.zendeskUrl;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        String str3 = this.oauthClientId;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i12 + i10;
    }
}
