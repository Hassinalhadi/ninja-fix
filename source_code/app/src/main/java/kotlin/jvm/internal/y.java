package kotlin.jvm.internal;

import ge.InterfaceC1772d;
import java.util.Collections;
import java.util.List;
import kotlin.collections.ab;

/* loaded from: classes2.dex */
public final class y implements ge.x {
    public final InterfaceC1772d alpha;
    public volatile List purple;

    public y(InterfaceC1772d interfaceC1772d) {
        ge.aa aaVar = ge.aa.alpha;
        this.alpha = interfaceC1772d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            if (Intrinsics.areEqual(this.alpha, ((y) obj).alpha) && Intrinsics.areEqual("PluginConfigT", "PluginConfigT")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // ge.x
    public final String getName() {
        return "PluginConfigT";
    }

    @Override // ge.x
    public final List getUpperBounds() {
        List list = this.purple;
        if (list == null) {
            v vVar = u.alpha;
            List juliet = ab.juliet(vVar.lima(vVar.bravo(Object.class), Collections.EMPTY_LIST, true));
            this.purple = juliet;
            return juliet;
        }
        return list;
    }

    public final int hashCode() {
        int i4;
        InterfaceC1772d interfaceC1772d = this.alpha;
        if (interfaceC1772d != null) {
            i4 = interfaceC1772d.hashCode();
        } else {
            i4 = 0;
        }
        return (i4 * 31) + 749883007;
    }

    public final String toString() {
        ge.aa aaVar = ge.aa.alpha;
        return "PluginConfigT";
    }
}
