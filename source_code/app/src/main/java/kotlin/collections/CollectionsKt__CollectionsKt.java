package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "", "emptyList", "()Ljava/util/List;", "", "elements", "listOf", "([Ljava/lang/Object;)Ljava/util/List;", "", "throwIndexOverflow", "()V", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes2.dex */
public class CollectionsKt__CollectionsKt extends ab {
    @NotNull
    public static <T> List<T> emptyList() {
        return s.alpha;
    }

    @NotNull
    public static <T> List<T> listOf(@NotNull T... elements) {
        Intrinsics.echo(elements, "elements");
        if (elements.length > 0) {
            return ArraysKt.sierra(elements);
        }
        return emptyList();
    }

    public static final List papa(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return ab.juliet(list.get(0));
        }
        return emptyList();
    }

    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
