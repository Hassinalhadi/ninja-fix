package g7;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c implements d {
    public final float alpha;

    public c(float f5) {
        this.alpha = f5;
    }

    @Override // g7.d
    public final float alpha(RectF rectF) {
        return O6.c.alpha(this.alpha, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.alpha == ((c) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.alpha)});
    }
}
