package R7;

/* loaded from: classes2.dex */
public final class L {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final int echo;
    public final J2.l foxtrot;

    public L(String str, String str2, String str3, String str4, int i4, J2.l lVar) {
        if (str != null) {
            this.alpha = str;
            if (str2 != null) {
                this.bravo = str2;
                if (str3 != null) {
                    this.charlie = str3;
                    if (str4 != null) {
                        this.delta = str4;
                        this.echo = i4;
                        this.foxtrot = lVar;
                        return;
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof L) {
                L l10 = (L) obj;
                if (this.alpha.equals(l10.alpha) && this.bravo.equals(l10.bravo) && this.charlie.equals(l10.charlie) && this.delta.equals(l10.delta) && this.echo == l10.echo && this.foxtrot.equals(l10.foxtrot)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode()) * 1000003) ^ this.delta.hashCode()) * 1000003) ^ this.echo) * 1000003) ^ this.foxtrot.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.alpha + ", versionCode=" + this.bravo + ", versionName=" + this.charlie + ", installUuid=" + this.delta + ", deliveryMechanism=" + this.echo + ", developmentPlatformProvider=" + this.foxtrot + "}";
    }
}
