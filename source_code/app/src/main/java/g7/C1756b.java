package g7;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: g7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1756b implements d {
    public final d alpha;
    public final float bravo;

    public C1756b(float f5, d dVar) {
        while (dVar instanceof C1756b) {
            dVar = ((C1756b) dVar).alpha;
            f5 += ((C1756b) dVar).bravo;
        }
        this.alpha = dVar;
        this.bravo = f5;
    }

    @Override // g7.d
    public final float alpha(RectF rectF) {
        return Math.max(0.0f, this.alpha.alpha(rectF) + this.bravo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1756b)) {
            return false;
        }
        C1756b c1756b = (C1756b) obj;
        if (this.alpha.equals(c1756b.alpha) && this.bravo == c1756b.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha, Float.valueOf(this.bravo)});
    }
}
