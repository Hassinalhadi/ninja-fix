package M;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class b extends a implements Yd.d {
    public final h silver;
    public Object teal;

    public b(h hVar, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.silver = hVar;
        this.teal = obj2;
    }

    @Override // M.a, java.util.Map.Entry
    public final Object getValue() {
        return this.teal;
    }

    @Override // M.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i4;
        Object obj2 = this.teal;
        this.teal = obj;
        f fVar = (f) this.silver.purple;
        e eVar = fVar.silver;
        Object obj3 = this.purple;
        if (!eVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z2 = fVar.red;
        if (z2) {
            if (z2) {
                n nVar = fVar.alpha[fVar.purple];
                Object obj4 = nVar.alpha[nVar.red];
                eVar.put(obj3, obj);
                if (obj4 != null) {
                    i4 = obj4.hashCode();
                } else {
                    i4 = 0;
                }
                fVar.charlie(i4, eVar.red, obj4, 0);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            eVar.put(obj3, obj);
        }
        fVar.yellow = eVar.teal;
        return obj2;
    }
}
