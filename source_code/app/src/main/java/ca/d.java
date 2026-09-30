package ca;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends f {
    public final String alpha;
    public final String bravo;
    public final String charlie;

    public d(String str, String str2, String str3) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Intrinsics.areEqual(this.alpha, dVar.alpha) && Intrinsics.areEqual(this.bravo, dVar.bravo) && Intrinsics.areEqual(this.charlie, dVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        String str = this.alpha;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.bravo;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str3 = this.charlie;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i10 + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Message(destination=");
        sb2.append(this.alpha);
        sb2.append(", subscription=");
        sb2.append(this.bravo);
        sb2.append(", body=");
        return P0.gold(sb2, this.charlie, ")");
    }
}
