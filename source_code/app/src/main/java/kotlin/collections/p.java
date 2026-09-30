package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class p extends CollectionsKt__IterablesKt {
    public static void quebec(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void romeo(List list, Comparator comparator) {
        Intrinsics.echo(list, "<this>");
        Intrinsics.echo(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
