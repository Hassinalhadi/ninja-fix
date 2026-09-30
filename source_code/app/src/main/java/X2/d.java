package X2;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends i {
    public final Drawable alpha;
    public final h bravo;
    public final Throwable charlie;

    public d(Drawable drawable, h hVar, Throwable th) {
        this.alpha = drawable;
        this.bravo = hVar;
        this.charlie = th;
    }

    @Override // X2.i
    public final Drawable alpha() {
        return this.alpha;
    }

    @Override // X2.i
    public final h bravo() {
        return this.bravo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (Intrinsics.areEqual(this.alpha, dVar.alpha)) {
                if (Intrinsics.areEqual(this.bravo, dVar.bravo) && Intrinsics.areEqual(this.charlie, dVar.charlie)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        Drawable drawable = this.alpha;
        if (drawable != null) {
            i4 = drawable.hashCode();
        } else {
            i4 = 0;
        }
        return this.charlie.hashCode() + ((this.bravo.hashCode() + (i4 * 31)) * 31);
    }
}
