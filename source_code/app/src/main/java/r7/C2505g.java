package r7;

import androidx.appcompat.widget.P0;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: r7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2505g implements InterfaceC2502d, Serializable {
    public final Object alpha;

    public C2505g(Object obj) {
        this.alpha = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2505g)) {
            return false;
        }
        Object obj2 = this.alpha;
        Object obj3 = ((C2505g) obj).alpha;
        if (obj2 != obj3 && !obj2.equals(obj3)) {
            return false;
        }
        return true;
    }

    @Override // r7.InterfaceC2502d
    public final Object get() {
        return this.alpha;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha});
    }

    public final String toString() {
        return P0.emerald(new StringBuilder("Suppliers.ofInstance("), this.alpha, ")");
    }
}
