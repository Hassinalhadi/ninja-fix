package tf;

import java.util.ListIterator;
import kotlin.collections.ArraysKt;
import t6.A2;

/* renamed from: tf.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3125g extends AbstractC3119a implements sf.b {
    public static final C3125g purple = new C3125g(new Object[0]);
    public final Object[] alpha;

    public C3125g(Object[] objArr) {
        this.alpha = objArr;
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        return this.alpha.length;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        A2.alpha(i4, alpha());
        return this.alpha[i4];
    }

    @Override // kotlin.collections.e, java.util.List
    public final int indexOf(Object obj) {
        return ArraysKt.jade(this.alpha, obj);
    }

    @Override // kotlin.collections.e, java.util.List
    public final int lastIndexOf(Object obj) {
        return ArraysKt.navy(this.alpha, obj);
    }

    @Override // kotlin.collections.e, java.util.List
    public final ListIterator listIterator(int i4) {
        Object[] objArr = this.alpha;
        A2.bravo(i4, objArr.length);
        return new C3120b(i4, objArr, objArr.length);
    }
}
