package lf;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: lf.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2077c extends AbstractC2075a {
    public Object[] alpha;
    public int purple;

    @Override // lf.AbstractC2075a
    public final int alpha() {
        return this.purple;
    }

    @Override // lf.AbstractC2075a
    public final void bravo(int i4, kotlin.reflect.jvm.internal.impl.types.j jVar) {
        Object[] objArr = this.alpha;
        if (objArr.length <= i4) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            Intrinsics.delta(copyOf, "copyOf(this, newSize)");
            this.alpha = copyOf;
        }
        Object[] objArr2 = this.alpha;
        if (objArr2[i4] == null) {
            this.purple++;
        }
        objArr2[i4] = jVar;
    }

    @Override // lf.AbstractC2075a
    public final Object get(int i4) {
        return ArraysKt.ivory(i4, this.alpha);
    }

    @Override // lf.AbstractC2075a, java.lang.Iterable
    public final Iterator iterator() {
        return new C2076b(this);
    }
}
