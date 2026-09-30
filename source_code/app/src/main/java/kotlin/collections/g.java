package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class g extends AbstractList implements List, Yd.c {
    public abstract int alpha();

    public abstract Object bravo(int i4);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i4) {
        return bravo(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return alpha();
    }
}
