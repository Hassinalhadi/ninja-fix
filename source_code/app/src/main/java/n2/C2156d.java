package n2;

import com.google.android.material.datepicker.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;

/* renamed from: n2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2156d {
    public final String alpha;
    public final boolean bravo;
    public final List charlie;
    public final List delta;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public C2156d(String str, boolean z2, List columns, List orders) {
        Intrinsics.echo(columns, "columns");
        Intrinsics.echo(orders, "orders");
        this.alpha = str;
        this.bravo = z2;
        this.charlie = columns;
        this.delta = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                orders.add("ASC");
            }
        }
        this.delta = orders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2156d) {
            C2156d c2156d = (C2156d) obj;
            if (this.bravo == c2156d.bravo && Intrinsics.areEqual(this.charlie, c2156d.charlie) && Intrinsics.areEqual(this.delta, c2156d.delta)) {
                String str = this.alpha;
                boolean quebec = r.quebec(str, "index_", false);
                String str2 = c2156d.alpha;
                if (quebec) {
                    return r.quebec(str2, "index_", false);
                }
                return Intrinsics.areEqual(str, str2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.alpha;
        if (r.quebec(str, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.delta.hashCode() + j.golf(((hashCode * 31) + (this.bravo ? 1 : 0)) * 31, 31, this.charlie);
    }

    public final String toString() {
        return "Index{name='" + this.alpha + "', unique=" + this.bravo + ", columns=" + this.charlie + ", orders=" + this.delta + "'}";
    }
}
