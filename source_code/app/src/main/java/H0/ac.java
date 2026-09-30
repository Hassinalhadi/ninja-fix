package H0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ac {
    public final k alpha;
    public final v bravo;
    public final int charlie;
    public final int delta;
    public final Object echo;

    public ac(k kVar, v vVar, int i4, int i5, Object obj) {
        this.alpha = kVar;
        this.bravo = vVar;
        this.charlie = i4;
        this.delta = i5;
        this.echo = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        if (Intrinsics.areEqual(this.alpha, acVar.alpha) && Intrinsics.areEqual(this.bravo, acVar.bravo) && this.charlie == acVar.charlie && this.delta == acVar.delta && Intrinsics.areEqual(this.echo, acVar.echo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        k kVar = this.alpha;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        int i5 = ((((((hashCode * 31) + this.bravo.alpha) * 31) + this.charlie) * 31) + this.delta) * 31;
        Object obj = this.echo;
        if (obj != null) {
            i4 = obj.hashCode();
        }
        return i5 + i4;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.alpha);
        sb2.append(", fontWeight=");
        sb2.append(this.bravo);
        sb2.append(", fontStyle=");
        String str2 = "Invalid";
        int i4 = this.charlie;
        if (i4 == 0) {
            str = "Normal";
        } else if (i4 != 1) {
            str = "Invalid";
        } else {
            str = "Italic";
        }
        sb2.append((Object) str);
        sb2.append(", fontSynthesis=");
        int i5 = this.delta;
        if (i5 == 0) {
            str2 = "None";
        } else if (i5 == 1) {
            str2 = "Weight";
        } else if (i5 == 2) {
            str2 = "Style";
        } else if (i5 == 65535) {
            str2 = "All";
        }
        sb2.append((Object) str2);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.echo);
        sb2.append(')');
        return sb2.toString();
    }
}
