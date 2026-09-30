package kotlin.collections;

import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m extends e implements RandomAccess {
    public final /* synthetic */ int[] alpha;

    public m(int[] iArr) {
        this.alpha = iArr;
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        return this.alpha.length;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return ArraysKt.uniform(((Number) obj).intValue(), this.alpha);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        return Integer.valueOf(this.alpha[i4]);
    }

    @Override // kotlin.collections.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.alpha;
        Intrinsics.echo(iArr, "<this>");
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (intValue == iArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final boolean isEmpty() {
        if (this.alpha.length == 0) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.alpha;
        Intrinsics.echo(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (intValue == iArr[length]) {
                    return length;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return -1;
    }
}
