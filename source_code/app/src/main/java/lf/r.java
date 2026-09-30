package lf;

import java.util.Iterator;
import of.C2258m;

/* loaded from: classes2.dex */
public final class r extends AbstractC2075a {
    public final kotlin.reflect.jvm.internal.impl.types.j alpha;
    public final int purple;

    public r(int i4, kotlin.reflect.jvm.internal.impl.types.j jVar) {
        this.alpha = jVar;
        this.purple = i4;
    }

    @Override // lf.AbstractC2075a
    public final int alpha() {
        return 1;
    }

    @Override // lf.AbstractC2075a
    public final void bravo(int i4, kotlin.reflect.jvm.internal.impl.types.j jVar) {
        throw new IllegalStateException();
    }

    @Override // lf.AbstractC2075a
    public final Object get(int i4) {
        if (i4 == this.purple) {
            return this.alpha;
        }
        return null;
    }

    @Override // lf.AbstractC2075a, java.lang.Iterable
    public final Iterator iterator() {
        return new C2258m(2, this);
    }
}
