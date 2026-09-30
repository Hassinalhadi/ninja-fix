package cb;

import com.google.android.material.datepicker.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cb.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0840e {
    public final String alpha;
    public final List bravo;

    public C0840e(String cabinetNumber, List items) {
        Intrinsics.echo(cabinetNumber, "cabinetNumber");
        Intrinsics.echo(items, "items");
        this.alpha = cabinetNumber;
        this.bravo = items;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0840e) {
                C0840e c0840e = (C0840e) obj;
                if (!Intrinsics.areEqual(this.alpha, c0840e.alpha) || !Intrinsics.areEqual(this.bravo, c0840e.bravo) || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return j.golf(this.alpha.hashCode() * 31, 31, this.bravo);
    }

    public final String toString() {
        return "CabinetWithItems(cabinetNumber=" + this.alpha + ", items=" + this.bravo + ", cabinetLabel=null)";
    }
}
