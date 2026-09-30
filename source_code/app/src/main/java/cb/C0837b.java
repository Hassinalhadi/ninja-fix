package cb;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0837b {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final boolean delta;
    public final String echo;

    public C0837b(String str, String str2, String str3, String str4, boolean z2) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        this.delta = z2;
        this.echo = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0837b) {
                C0837b c0837b = (C0837b) obj;
                if (!Intrinsics.areEqual(this.alpha, c0837b.alpha) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.bravo, c0837b.bravo) || !Intrinsics.areEqual(this.charlie, c0837b.charlie) || this.delta != c0837b.delta || !Intrinsics.areEqual(this.echo, c0837b.echo)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i4;
        int hashCode3 = this.alpha.hashCode() * 961;
        int i5 = 0;
        String str = this.bravo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        String str2 = this.charlie;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        if (this.delta) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i12 = (i11 + i4) * 31;
        String str3 = this.echo;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return i12 + i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActiveOrderItem(quantity=");
        sb2.append(this.alpha);
        sb2.append(", icon=null, label=");
        sb2.append(this.bravo);
        sb2.append(", backendIconUrl=");
        sb2.append(this.charlie);
        sb2.append(", isChecked=");
        sb2.append(this.delta);
        sb2.append(", id=");
        return P0.gold(sb2, this.echo, ")");
    }
}
