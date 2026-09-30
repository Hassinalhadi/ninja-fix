package tf;

import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import t6.A2;
import t6.AbstractC3050r2;

/* renamed from: tf.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3121c extends AbstractC3119a {
    public final Object[] alpha;
    public final Object[] purple;
    public final int red;
    public final int silver;

    public C3121c(Object[] root, Object[] tail, int i4, int i5) {
        Intrinsics.echo(root, "root");
        Intrinsics.echo(tail, "tail");
        this.alpha = root;
        this.purple = tail;
        this.red = i4;
        this.silver = i5;
        if (alpha() > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + alpha()).toString());
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        return this.red;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        Object[] objArr;
        int i5 = this.red;
        A2.alpha(i4, i5);
        if (((i5 - 1) & (-32)) <= i4) {
            objArr = this.purple;
        } else {
            objArr = this.alpha;
            for (int i10 = this.silver; i10 > 0; i10 -= 5) {
                Object obj = objArr[AbstractC3050r2.echo(i4, i10)];
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i4 & 31];
    }

    @Override // kotlin.collections.e, java.util.List
    public final ListIterator listIterator(int i4) {
        A2.bravo(i4, this.red);
        return new C3123e(i4, this.red, (this.silver / 5) + 1, this.alpha, this.purple);
    }
}
