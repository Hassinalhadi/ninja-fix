package g3;

import androidx.activity.result.IntentSenderRequest;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g3.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1751l {
    public final IntentSenderRequest alpha;

    public C1751l(IntentSenderRequest intentSenderRequest) {
        this.alpha = intentSenderRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1751l) && Intrinsics.areEqual(this.alpha, ((C1751l) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "EnableGoogleImproveAccuracy(request=" + this.alpha + ")";
    }
}
