package g3;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o extends s {
    public final Intent alpha;

    public o(Intent intent) {
        this.alpha = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && Intrinsics.areEqual(this.alpha, ((o) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "NeedsManualSettings(intent=" + this.alpha + ")";
    }
}
