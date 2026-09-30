package R7;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class ae extends O {
    public final String alpha;
    public final String bravo;
    public final String charlie;

    public ae(String str, String str2, String str3) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O) {
            O o5 = (O) obj;
            if (this.alpha.equals(((ae) o5).alpha)) {
                ae aeVar = (ae) o5;
                if (this.bravo.equals(aeVar.bravo) && this.charlie.equals(aeVar.charlie)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.alpha);
        sb2.append(", libraryName=");
        sb2.append(this.bravo);
        sb2.append(", buildId=");
        return P0.gold(sb2, this.charlie, "}");
    }
}
