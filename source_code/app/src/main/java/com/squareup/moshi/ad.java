package com.squareup.moshi;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ad extends AbstractSet {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ af purple;

    public /* synthetic */ ad(af afVar, int i4) {
        this.alpha = i4;
        this.purple = afVar;
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        ae alpha;
        Object obj2;
        Object value;
        switch (this.alpha) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                af afVar = this.purple;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                ae aeVar = null;
                if (key != null) {
                    try {
                        alpha = afVar.alpha(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (alpha != null && ((obj2 = alpha.f11958a) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        aeVar = alpha;
                    }
                    if (aeVar != null) {
                        return false;
                    }
                    return true;
                }
                alpha = null;
                if (alpha != null) {
                    aeVar = alpha;
                }
                if (aeVar != null) {
                }
            default:
                return this.purple.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                return new ac(this.purple, 0);
            default:
                return new ac(this.purple, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        ae alpha;
        Object obj2;
        Object value;
        switch (this.alpha) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                af afVar = this.purple;
                Object key = entry.getKey();
                ae aeVar = null;
                if (key != null) {
                    try {
                        alpha = afVar.alpha(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (alpha != null && ((obj2 = alpha.f11958a) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        aeVar = alpha;
                    }
                    if (aeVar != null) {
                        return false;
                    }
                    afVar.charlie(aeVar, true);
                    return true;
                }
                alpha = null;
                if (alpha != null) {
                    aeVar = alpha;
                }
                if (aeVar != null) {
                }
            default:
                af afVar2 = this.purple;
                ae aeVar2 = null;
                if (obj != null) {
                    try {
                        aeVar2 = afVar2.alpha(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (aeVar2 != null) {
                    afVar2.charlie(aeVar2, true);
                }
                if (aeVar2 == null) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.alpha) {
            case 0:
                return this.purple.silver;
            default:
                return this.purple.silver;
        }
    }
}
