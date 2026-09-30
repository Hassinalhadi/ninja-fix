package V2;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public final Bitmap alpha;
    public final Map bravo;

    public a(Bitmap bitmap, Map map) {
        this.alpha = bitmap;
        this.bravo = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Intrinsics.areEqual(this.alpha, aVar.alpha) && Intrinsics.areEqual(this.bravo, aVar.bravo)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.alpha + ", extras=" + this.bravo + ')';
    }
}
