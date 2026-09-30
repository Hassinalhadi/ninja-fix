package s6;

import java.util.Map;

/* renamed from: s6.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2816y extends r {
    public final Object alpha;
    public int purple;
    public final /* synthetic */ C2825z red;

    public C2816y(C2825z c2825z, int i4) {
        this.red = c2825z;
        Object obj = C2825z.f13696c;
        this.alpha = c2825z.bravo()[i4];
        this.purple = i4;
    }

    public final void alpha() {
        int i4 = this.purple;
        Object obj = this.alpha;
        C2825z c2825z = this.red;
        if (i4 != -1 && i4 < c2825z.size()) {
            if (t6.ad.bravo(obj, c2825z.bravo()[this.purple])) {
                return;
            }
        }
        Object obj2 = C2825z.f13696c;
        this.purple = c2825z.hotel(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.alpha;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C2825z c2825z = this.red;
        Map delta = c2825z.delta();
        if (delta != null) {
            return delta.get(this.alpha);
        }
        alpha();
        int i4 = this.purple;
        if (i4 == -1) {
            return null;
        }
        return c2825z.charlie()[i4];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C2825z c2825z = this.red;
        Map delta = c2825z.delta();
        Object obj2 = this.alpha;
        if (delta != null) {
            return delta.put(obj2, obj);
        }
        alpha();
        int i4 = this.purple;
        if (i4 == -1) {
            c2825z.put(obj2, obj);
            return null;
        }
        Object obj3 = c2825z.charlie()[i4];
        c2825z.charlie()[this.purple] = obj;
        return obj3;
    }
}
