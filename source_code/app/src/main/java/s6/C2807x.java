package s6;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: s6.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2807x extends AbstractSet {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C2825z purple;

    public /* synthetic */ C2807x(C2825z c2825z, int i4) {
        this.alpha = i4;
        this.purple = c2825z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.alpha) {
            case 0:
                this.purple.clear();
                return;
            default:
                this.purple.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.alpha) {
            case 0:
                C2825z c2825z = this.purple;
                Map delta = c2825z.delta();
                if (delta != null) {
                    return delta.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int hotel = c2825z.hotel(entry.getKey());
                    if (hotel != -1 && t6.ad.bravo(c2825z.charlie()[hotel], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.purple.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                C2825z c2825z = this.purple;
                Map delta = c2825z.delta();
                if (delta != null) {
                    return delta.entrySet().iterator();
                }
                return new C2789v(c2825z, 1);
            default:
                C2825z c2825z2 = this.purple;
                Map delta2 = c2825z2.delta();
                if (delta2 != null) {
                    return delta2.keySet().iterator();
                }
                return new C2789v(c2825z2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.alpha) {
            case 0:
                C2825z c2825z = this.purple;
                Map delta = c2825z.delta();
                if (delta != null) {
                    return delta.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c2825z.foxtrot()) {
                        int golf = c2825z.golf();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c2825z.alpha;
                        Objects.requireNonNull(obj2);
                        int alpha = t6.ag.alpha(key, value, golf, obj2, c2825z.alpha(), c2825z.bravo(), c2825z.charlie());
                        if (alpha != -1) {
                            c2825z.echo(alpha, golf);
                            c2825z.white--;
                            c2825z.teal += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C2825z c2825z2 = this.purple;
                Map delta2 = c2825z2.delta();
                if (delta2 != null) {
                    return delta2.keySet().remove(obj);
                }
                if (c2825z2.juliet(obj) == C2825z.f13696c) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.alpha) {
            case 0:
                return this.purple.size();
            default:
                return this.purple.size();
        }
    }
}
