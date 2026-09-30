package G3;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class k implements i {
    public final f alpha;
    public int bravo;
    public Bitmap.Config charlie;

    public k(f fVar) {
        this.alpha = fVar;
    }

    @Override // G3.i
    public final void alpha() {
        this.alpha.O(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.bravo == kVar.bravo && Y3.l.bravo(this.charlie, kVar.charlie)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5 = this.bravo * 31;
        Bitmap.Config config = this.charlie;
        if (config != null) {
            i4 = config.hashCode();
        } else {
            i4 = 0;
        }
        return i5 + i4;
    }

    public final String toString() {
        return l.charlie(this.bravo, this.charlie);
    }
}
