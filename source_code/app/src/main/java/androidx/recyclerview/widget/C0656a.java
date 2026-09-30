package androidx.recyclerview.widget;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;

/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0656a {
    public int alpha;
    public int bravo;
    public Object charlie;
    public int delta;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0656a) {
                C0656a c0656a = (C0656a) obj;
                int i4 = this.alpha;
                if (i4 == c0656a.alpha) {
                    if (i4 != 8 || Math.abs(this.delta - this.bravo) != 1 || this.delta != c0656a.bravo || this.bravo != c0656a.delta) {
                        if (this.delta == c0656a.delta && this.bravo == c0656a.bravo) {
                            Object obj2 = this.charlie;
                            if (obj2 != null) {
                                if (!obj2.equals(c0656a.charlie)) {
                                    return false;
                                }
                            } else if (c0656a.charlie != null) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.alpha * 31) + this.bravo) * 31) + this.delta;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(Constants.AES_PREFIX);
        int i4 = this.alpha;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.bravo);
        sb2.append("c:");
        sb2.append(this.delta);
        sb2.append(",p:");
        return P0.emerald(sb2, this.charlie, Constants.AES_SUFFIX);
    }
}
