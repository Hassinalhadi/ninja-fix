package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class P {
    public float alpha = 0.0f;
    public boolean bravo = true;
    public C0558y charlie = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p4 = (P) obj;
        return Float.compare(this.alpha, p4.alpha) == 0 && this.bravo == p4.bravo && Intrinsics.areEqual(this.charlie, p4.charlie) && Intrinsics.areEqual(null, null);
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.alpha) * 31;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i5 = (floatToIntBits + i4) * 31;
        C0558y c0558y = this.charlie;
        if (c0558y == null) {
            hashCode = 0;
        } else {
            hashCode = c0558y.hashCode();
        }
        return (i5 + hashCode) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.alpha + ", fill=" + this.bravo + ", crossAxisAlignment=" + this.charlie + ", flowLayoutData=null)";
    }
}
