package zendesk.core;

import P8.c;

/* loaded from: classes.dex */
class AccessToken {
    private String accessToken;

    @c("user_id")
    private String userId;

    public AccessToken() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AccessToken accessToken = (AccessToken) obj;
            String str = this.accessToken;
            if (str == null ? accessToken.accessToken != null : !str.equals(accessToken.accessToken)) {
                return false;
            }
            String str2 = this.userId;
            String str3 = accessToken.userId;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i4;
        String str = this.accessToken;
        int i5 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * 31;
        String str2 = this.userId;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return i10 + i5;
    }

    public AccessToken(String str, String str2) {
        this.accessToken = str;
        this.userId = str2;
    }
}
