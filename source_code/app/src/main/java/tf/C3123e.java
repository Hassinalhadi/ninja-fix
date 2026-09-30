package tf;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tf.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3123e extends L.a {
    public final Object[] silver;
    public final C3126h teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3123e(int i4, int i5, int i10, Object[] root, Object[] tail) {
        super(i4, i5, 1);
        Intrinsics.echo(root, "root");
        Intrinsics.echo(tail, "tail");
        this.silver = tail;
        int i11 = (i5 - 1) & (-32);
        this.teal = new C3126h(root, i4 > i11 ? i11 : i4, i11, i10);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            C3126h c3126h = this.teal;
            if (c3126h.hasNext()) {
                this.purple++;
                return c3126h.next();
            }
            int i4 = this.purple;
            this.purple = i4 + 1;
            return this.silver[i4 - c3126h.red];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i4 = this.purple;
            C3126h c3126h = this.teal;
            int i5 = c3126h.red;
            if (i4 > i5) {
                int i10 = i4 - 1;
                this.purple = i10;
                return this.silver[i10 - i5];
            }
            this.purple = i4 - 1;
            return c3126h.previous();
        }
        throw new NoSuchElementException();
    }
}
