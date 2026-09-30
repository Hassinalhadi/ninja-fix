package r7;

import androidx.appcompat.widget.P0;
import com.google.firebase.messaging.l;

/* renamed from: r7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2504f implements InterfaceC2502d {
    public static final l red = new l(18);
    public volatile InterfaceC2502d alpha;
    public Object purple;

    @Override // r7.InterfaceC2502d
    public final Object get() {
        InterfaceC2502d interfaceC2502d = this.alpha;
        l lVar = red;
        if (interfaceC2502d != lVar) {
            synchronized (this) {
                try {
                    if (this.alpha != lVar) {
                        Object obj = this.alpha.get();
                        this.purple = obj;
                        this.alpha = lVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.purple;
    }

    public final String toString() {
        Object obj = this.alpha;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == red) {
            obj = P0.emerald(new StringBuilder("<supplier that returned "), this.purple, ">");
        }
        return P0.emerald(sb2, obj, ")");
    }
}
