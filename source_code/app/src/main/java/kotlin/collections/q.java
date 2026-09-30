package kotlin.collections;

import fe.C1713e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class q extends CollectionsKt__MutableCollectionsKt {
    public static final int tango(int i4, List list) {
        if (i4 >= 0 && i4 <= CollectionsKt.ivory(list)) {
            return CollectionsKt.ivory(list) - i4;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Element index ", " must be in range [");
        sierra.append(new C1713e(0, CollectionsKt.ivory(list), 1));
        sierra.append("].");
        throw new IndexOutOfBoundsException(sierra.toString());
    }

    public static final int uniform(int i4, List list) {
        if (i4 >= 0 && i4 <= list.size()) {
            return list.size() - i4;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Position index ", " must be in range [");
        sierra.append(new C1713e(0, list.size(), 1));
        sierra.append("].");
        throw new IndexOutOfBoundsException(sierra.toString());
    }

    public static aa victor(List list) {
        Intrinsics.echo(list, "<this>");
        return new aa(list);
    }
}
