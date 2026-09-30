package k0;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1995b {
    public final KeyEvent alpha;

    public final boolean equals(Object obj) {
        if (obj instanceof C1995b) {
            if (!Intrinsics.areEqual(this.alpha, ((C1995b) obj).alpha)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.alpha + ')';
    }
}
