package p7;

import java.util.Objects;
import s6.AbstractC2699k7;

/* loaded from: classes2.dex */
public final class i extends g {
    public static final i silver = new i(new Object[0]);
    public final transient Object[] red;

    public i(Object[] objArr) {
        this.red = objArr;
    }

    @Override // p7.g, p7.AbstractC2287d
    public final int alpha(Object[] objArr) {
        System.arraycopy(this.red, 0, objArr, 0, 0);
        return 0;
    }

    @Override // p7.AbstractC2287d
    public final int bravo() {
        return 0;
    }

    @Override // p7.AbstractC2287d
    public final int delta() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC2699k7.alpha(i4, 0);
        Object obj = this.red[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p7.AbstractC2287d
    public final Object[] hotel() {
        return this.red;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
