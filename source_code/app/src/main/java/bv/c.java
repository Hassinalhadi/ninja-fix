package bv;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements Iterator, Map.Entry {
    public int alpha;
    public int purple = -1;
    public boolean red;
    public final /* synthetic */ e silver;

    public c(e eVar) {
        this.silver = eVar;
        this.alpha = eVar.red - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.red) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i4 = this.purple;
                e eVar = this.silver;
                if (Intrinsics.areEqual(key, eVar.foxtrot(i4)) && Intrinsics.areEqual(entry.getValue(), eVar.juliet(this.purple))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.red) {
            return this.silver.foxtrot(this.purple);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.red) {
            return this.silver.juliet(this.purple);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.purple < this.alpha) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.red) {
            int i4 = this.purple;
            e eVar = this.silver;
            Object foxtrot = eVar.foxtrot(i4);
            Object juliet = eVar.juliet(this.purple);
            int i5 = 0;
            if (foxtrot == null) {
                hashCode = 0;
            } else {
                hashCode = foxtrot.hashCode();
            }
            if (juliet != null) {
                i5 = juliet.hashCode();
            }
            return hashCode ^ i5;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.purple++;
            this.red = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.red) {
            this.silver.hotel(this.purple);
            this.purple--;
            this.alpha--;
            this.red = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.red) {
            return this.silver.india(this.purple, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
