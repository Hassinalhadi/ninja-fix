package vf;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aa extends Nd.a {
    public static final H purple = new Object();
    public final String alpha;

    public aa(String str) {
        super(purple);
        this.alpha = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aa) && Intrinsics.areEqual(this.alpha, ((aa) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return P0.fuchsia(new StringBuilder("CoroutineName("), this.alpha, ')');
    }
}
