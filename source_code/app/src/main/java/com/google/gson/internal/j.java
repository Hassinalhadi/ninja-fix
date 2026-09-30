package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class j extends AbstractSet {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ m purple;

    public /* synthetic */ j(m mVar, int i4) {
        this.alpha = i4;
        this.purple = mVar;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        l alpha;
        switch (this.alpha) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                m mVar = this.purple;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                l lVar = null;
                if (key != null) {
                    try {
                        alpha = mVar.alpha(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (alpha != null && Objects.equals(alpha.f8315a, entry.getValue())) {
                        lVar = alpha;
                    }
                    if (lVar != null) {
                        return false;
                    }
                    return true;
                }
                alpha = null;
                if (alpha != null) {
                    lVar = alpha;
                }
                if (lVar != null) {
                }
            default:
                return this.purple.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                return new i(this.purple, 0);
            default:
                return new i(this.purple, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        l alpha;
        switch (this.alpha) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                m mVar = this.purple;
                Object key = entry.getKey();
                l lVar = null;
                if (key != null) {
                    try {
                        alpha = mVar.alpha(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (alpha != null && Objects.equals(alpha.f8315a, entry.getValue())) {
                        lVar = alpha;
                    }
                    if (lVar != null) {
                        return false;
                    }
                    mVar.charlie(lVar, true);
                    return true;
                }
                alpha = null;
                if (alpha != null) {
                    lVar = alpha;
                }
                if (lVar != null) {
                }
            default:
                m mVar2 = this.purple;
                l lVar2 = null;
                if (obj != null) {
                    try {
                        lVar2 = mVar2.alpha(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (lVar2 != null) {
                    mVar2.charlie(lVar2, true);
                }
                if (lVar2 == null) {
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
