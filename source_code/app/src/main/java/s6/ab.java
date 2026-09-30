package s6;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ab extends r implements Serializable {
    public final Object alpha;
    public final Object purple;

    public ab(Object obj, Object obj2) {
        this.alpha = obj;
        this.purple = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.alpha;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.purple;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
