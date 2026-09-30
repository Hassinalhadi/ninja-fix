package g3;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n extends s {
    public final Intent alpha;

    public n(Intent intent) {
        this.alpha = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && Intrinsics.areEqual(this.alpha, ((n) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "NeedsAppSettings(intent=" + this.alpha + ")";
    }
}
