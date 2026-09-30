package kotlin.collections;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0006\u001a#\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"", "", "fromIndex", "toIndex", "copyOfRange", "([BII)[B", "copyOfRangeImpl", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* loaded from: classes2.dex */
public class ArraysKt___ArraysJvmKt extends ab {
    @NotNull
    public static byte[] copyOfRange(@NotNull byte[] bArr, int i4, int i5) {
        Intrinsics.echo(bArr, "<this>");
        ab.golf(i5, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, i5);
        Intrinsics.delta(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }
}
