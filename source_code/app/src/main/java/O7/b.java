package O7;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class b {
    public final String alpha;
    public final String bravo;
    public final String charlie;

    public b(String str, String str2, String str3) {
        if (str != null) {
            this.alpha = str;
            this.bravo = str2;
            this.charlie = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.alpha.equals(bVar.alpha)) {
                String str = bVar.bravo;
                String str2 = this.bravo;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = bVar.charlie;
                    String str4 = this.charlie;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.alpha.hashCode() ^ 1000003) * 1000003;
        int i4 = 0;
        String str = this.bravo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.charlie;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 ^ i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.alpha);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.bravo);
        sb2.append(", firebaseAuthenticationToken=");
        return P0.gold(sb2, this.charlie, "}");
    }
}
