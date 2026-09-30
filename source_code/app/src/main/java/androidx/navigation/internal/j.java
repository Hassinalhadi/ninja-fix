package androidx.navigation.internal;

import Y1.aa;
import bv.ax;
import bv.v;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class j implements Iterator, Yd.a {
    public int alpha = -1;
    public boolean purple;
    public final /* synthetic */ Be.e red;

    public j(Be.e eVar) {
        this.red = eVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.alpha + 1 < ((ax) this.red.charlie).golf()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.purple = true;
            ax axVar = (ax) this.red.charlie;
            int i4 = this.alpha + 1;
            this.alpha = i4;
            return (aa) axVar.hotel(i4);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.purple) {
            ax axVar = (ax) this.red.charlie;
            ((aa) axVar.hotel(this.alpha)).red = null;
            int i4 = this.alpha;
            Object[] objArr = axVar.red;
            Object obj = objArr[i4];
            Object obj2 = v.charlie;
            if (obj != obj2) {
                objArr[i4] = obj2;
                axVar.alpha = true;
            }
            this.alpha = i4 - 1;
            this.purple = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element");
    }
}
