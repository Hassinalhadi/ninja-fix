package g7;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1755a implements d {
    public final float alpha;

    public C1755a(float f5) {
        this.alpha = f5;
    }

    @Override // g7.d
    public final float alpha(RectF rectF) {
        return this.alpha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1755a) && this.alpha == ((C1755a) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.alpha)});
    }

    public final String toString() {
        return this.alpha + "px";
    }
}
