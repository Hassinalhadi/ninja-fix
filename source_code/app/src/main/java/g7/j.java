package g7;

import android.graphics.RectF;
import androidx.appcompat.widget.P0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j implements d {
    public final float alpha;

    public j(float f5) {
        this.alpha = f5;
    }

    @Override // g7.d
    public final float alpha(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.alpha;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && this.alpha == ((j) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.alpha)});
    }

    public final String toString() {
        return P0.cyan(new StringBuilder(), (int) (this.alpha * 100.0f), "%");
    }
}
