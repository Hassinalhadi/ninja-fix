package s6;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ak extends af {
    public final /* synthetic */ al red;

    public ak(al alVar) {
        this.red = alVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        al alVar = this.red;
        t6.ae.bravo(i4, alVar.teal);
        int i5 = i4 + i4;
        Object[] objArr = alVar.silver;
        Object obj = objArr[i5];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i5 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.red.teal;
    }
}
