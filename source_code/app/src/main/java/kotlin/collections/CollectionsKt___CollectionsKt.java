package kotlin.collections;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u001e\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "", "", "toByteArray", "(Ljava/util/Collection;)[B", "T", "element", "", "plus", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes2.dex */
public class CollectionsKt___CollectionsKt extends q {
    @NotNull
    public static <T> List<T> plus(@NotNull Collection<? extends T> collection, T t5) {
        Intrinsics.echo(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t5);
        return arrayList;
    }

    @NotNull
    public static byte[] toByteArray(@NotNull Collection<Byte> collection) {
        Intrinsics.echo(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            bArr[i4] = it.next().byteValue();
            i4++;
        }
        return bArr;
    }

    public static final void whiskey(Iterable iterable, StringBuilder buffer, CharSequence charSequence, CharSequence prefix, CharSequence postfix, CharSequence charSequence2, Function1 function1) {
        Intrinsics.echo(iterable, "<this>");
        Intrinsics.echo(buffer, "buffer");
        Intrinsics.echo(prefix, "prefix");
        Intrinsics.echo(postfix, "postfix");
        buffer.append(prefix);
        int i4 = 0;
        for (Object obj : iterable) {
            i4++;
            if (i4 > 1) {
                buffer.append(charSequence);
            }
            kotlin.text.n.bravo(buffer, obj, function1);
        }
        buffer.append(postfix);
    }

    public static final void xray(Iterable iterable, AbstractCollection abstractCollection) {
        Intrinsics.echo(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static final List yankee(Iterable iterable) {
        Intrinsics.echo(iterable, "<this>");
        if (iterable instanceof Collection) {
            return CollectionsKt.B((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        xray(iterable, arrayList);
        return arrayList;
    }
}
