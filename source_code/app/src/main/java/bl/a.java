package bl;

import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class a {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final String delta;

    public a(String str, String str2, String str3, String str4) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        this.delta = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.alpha.equals(aVar.alpha) && this.bravo.equals(aVar.bravo) && this.charlie.equals(aVar.charlie) && this.delta.equals(aVar.delta)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode()) * 1000003) ^ this.delta.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb2.append(this.alpha);
        sb2.append(", eglVersion=");
        sb2.append(this.bravo);
        sb2.append(", glExtensions=");
        sb2.append(this.charlie);
        sb2.append(", eglExtensions=");
        return P0.gold(sb2, this.delta, "}");
    }
}
