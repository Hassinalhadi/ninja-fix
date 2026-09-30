package g3;

import androidx.activity.result.IntentSenderRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p extends s {
    public final IntentSenderRequest alpha;

    public p(IntentSenderRequest intentSenderRequest) {
        this.alpha = intentSenderRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && Intrinsics.areEqual(this.alpha, ((p) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "NeedsResolution(request=" + this.alpha + ")";
    }
}
