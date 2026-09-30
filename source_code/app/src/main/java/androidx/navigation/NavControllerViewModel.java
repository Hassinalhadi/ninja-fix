package androidx.navigation;

import androidx.lifecycle.Y;
import androidx.lifecycle.c0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2698k6;
import s6.AbstractC2743p6;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/navigation/NavControllerViewModel;", "Landroidx/lifecycle/Y;", "<init>", "()V", "t6/c2", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavControllerViewModel extends Y {
    public final LinkedHashMap alpha = new LinkedHashMap();

    @Override // androidx.lifecycle.Y
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.alpha;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((c0) it.next()).alpha();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        int m210constructorimpl = UInt.m210constructorimpl(System.identityHashCode(this));
        AbstractC2743p6.alpha(16);
        sb2.append(AbstractC2698k6.charlie(16, m210constructorimpl & 4294967295L));
        sb2.append("} ViewModelStores (");
        Iterator it = this.alpha.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
