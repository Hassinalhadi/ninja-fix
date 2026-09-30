package g3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends s {
    public final String[] alpha;

    public m(String[] permissions) {
        Intrinsics.echo(permissions, "permissions");
        this.alpha = permissions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && Intrinsics.areEqual(this.alpha, ((m) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.alpha);
    }

    public final String toString() {
        return ao.ad.gray("MissingPermissions(permissions=", Arrays.toString(this.alpha), ")");
    }
}
