package Sb;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class e {
    public final String alpha;
    public final String bravo;
    public final String charlie;

    public e(String str, String str2, String str3) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Intrinsics.areEqual(this.alpha, eVar.alpha) && Intrinsics.areEqual(this.bravo, eVar.bravo) && Intrinsics.areEqual(this.charlie, eVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int sierra = AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo);
        String str = this.charlie;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return sierra + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisclaimerUi(message=");
        sb2.append(this.alpha);
        sb2.append(", actionText=");
        sb2.append(this.bravo);
        sb2.append(", deepLink=");
        return P0.gold(sb2, this.charlie, ")");
    }
}
