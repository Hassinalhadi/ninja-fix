package K2;

import A2.z;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {
    public static final String bravo;
    public final NetworkRequest alpha;

    static {
        String golf = z.golf("NetworkRequestCompat");
        Intrinsics.delta(golf, "tagWithPrefix(\"NetworkRequestCompat\")");
        bravo = golf;
    }

    public e(NetworkRequest networkRequest) {
        this.alpha = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof e) || !Intrinsics.areEqual(this.alpha, ((e) obj).alpha)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        NetworkRequest networkRequest = this.alpha;
        if (networkRequest == null) {
            return 0;
        }
        return networkRequest.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.alpha + ')';
    }
}
