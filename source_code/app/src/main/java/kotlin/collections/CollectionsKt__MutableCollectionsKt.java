package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "", "elements", "", "addAll", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes2.dex */
public class CollectionsKt__MutableCollectionsKt extends p {
    public static <T> boolean addAll(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> elements) {
        Intrinsics.echo(collection, "<this>");
        Intrinsics.echo(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z2 = true;
            }
        }
        return z2;
    }

    public static final boolean sierra(Iterable iterable, Function1 function1, boolean z2) {
        Iterator it = iterable.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z2) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
