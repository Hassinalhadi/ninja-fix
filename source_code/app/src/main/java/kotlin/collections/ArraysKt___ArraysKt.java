package kotlin.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0015\u0010\n\u001a\u00020\u0007*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"", "T", "", "", "filterNotNull", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "getLastIndex", "([B)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* loaded from: classes2.dex */
public class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {
    @NotNull
    public static <T> List<T> filterNotNull(@NotNull T[] tArr) {
        Intrinsics.echo(tArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (T t5 : tArr) {
            if (t5 != null) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    public static final int getLastIndex(@NotNull byte[] bArr) {
        Intrinsics.echo(bArr, "<this>");
        return bArr.length - 1;
    }

    public static final void papa(Object[] objArr, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        Intrinsics.echo(objArr, "<this>");
        sb2.append(charSequence2);
        int i4 = 0;
        for (Object obj : objArr) {
            i4++;
            if (i4 > 1) {
                sb2.append(charSequence);
            }
            kotlin.text.n.bravo(sb2, obj, function1);
        }
        sb2.append(charSequence3);
    }

    public static final void quebec(Object[] objArr, LinkedHashSet linkedHashSet) {
        Intrinsics.echo(objArr, "<this>");
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }
}
