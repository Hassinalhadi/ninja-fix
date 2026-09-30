package R7;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class ak extends V {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final String echo;
    public final String foxtrot;

    public ak(String str, String str2, String str3, String str4, String str5, String str6) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        this.delta = str4;
        this.echo = str5;
        this.foxtrot = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof V) {
            V v4 = (V) obj;
            if (this.alpha.equals(((ak) v4).alpha)) {
                ak akVar = (ak) v4;
                if (this.bravo.equals(akVar.bravo)) {
                    String str = akVar.charlie;
                    String str2 = this.charlie;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        String str3 = akVar.delta;
                        String str4 = this.delta;
                        if (str4 != null ? str4.equals(str3) : str3 == null) {
                            String str5 = akVar.echo;
                            String str6 = this.echo;
                            if (str6 != null ? str6.equals(str5) : str5 == null) {
                                String str7 = akVar.foxtrot;
                                String str8 = this.foxtrot;
                                if (str8 != null ? str8.equals(str7) : str7 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003;
        int i4 = 0;
        String str = this.charlie;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (hashCode4 ^ hashCode) * (-721379959);
        String str2 = this.delta;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 ^ hashCode2) * 1000003;
        String str3 = this.echo;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        String str4 = this.foxtrot;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i11 ^ i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.alpha);
        sb2.append(", version=");
        sb2.append(this.bravo);
        sb2.append(", displayVersion=");
        sb2.append(this.charlie);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.delta);
        sb2.append(", developmentPlatform=");
        sb2.append(this.echo);
        sb2.append(", developmentPlatformVersion=");
        return P0.gold(sb2, this.foxtrot, "}");
    }
}
