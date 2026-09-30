package r6;

import java.util.AbstractMap;
import java.util.Objects;
import t6.AbstractC2998h;

/* loaded from: classes2.dex */
public final class h extends AbstractC2496d {
    public final /* synthetic */ i red;

    public h(i iVar) {
        this.red = iVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        i iVar = this.red;
        AbstractC2998h.foxtrot(i4, iVar.teal);
        int i5 = i4 + i4;
        Object[] objArr = iVar.silver;
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
