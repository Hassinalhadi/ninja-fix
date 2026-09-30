package Y2;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements i {
    public final Context alpha;

    public c(Context context) {
        this.alpha = context;
    }

    @Override // Y2.i
    public final Object delta(M2.h hVar) {
        DisplayMetrics displayMetrics = this.alpha.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            if (Intrinsics.areEqual(this.alpha, ((c) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }
}
