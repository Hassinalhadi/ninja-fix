package t6;

import java.util.AbstractMap;

/* loaded from: classes2.dex */
public final class r4 extends o4 {
    public final /* synthetic */ s4 red;

    public r4(s4 s4Var) {
        this.red = s4Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i4) {
        s4 s4Var = this.red;
        AbstractC3026m2.charlie(i4, s4Var.teal);
        int i5 = i4 + i4;
        Object[] objArr = s4Var.silver;
        Object obj = objArr[i5];
        obj.getClass();
        Object obj2 = objArr[i5 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.red.teal;
    }
}
