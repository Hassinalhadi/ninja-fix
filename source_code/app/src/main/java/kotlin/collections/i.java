package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class i extends AbstractSet implements Set, Yd.f {
    public abstract int alpha();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return alpha();
    }
}
