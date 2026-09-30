package r7;

import androidx.appcompat.widget.P0;
import com.google.android.gms.internal.measurement.J1;
import java.io.Serializable;

/* renamed from: r7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2503e implements InterfaceC2502d, Serializable {
    public final J1 alpha;
    public volatile transient boolean purple;
    public transient Object red;

    public C2503e(J1 j12) {
        this.alpha = j12;
    }

    @Override // r7.InterfaceC2502d
    public final Object get() {
        if (!this.purple) {
            synchronized (this) {
                try {
                    if (!this.purple) {
                        Object obj = this.alpha.get();
                        this.red = obj;
                        this.purple = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.red;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.purple) {
            obj = P0.emerald(new StringBuilder("<supplier that returned "), this.red, ">");
        } else {
            obj = this.alpha;
        }
        return P0.emerald(sb2, obj, ")");
    }
}
