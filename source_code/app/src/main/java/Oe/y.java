package Oe;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1431z;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1430y;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.L;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class y implements Iterator {
    public final /* synthetic */ int alpha;
    public final AbstractCollection purple;
    public Iterable red;

    public y(AbstractC1431z abstractC1431z) {
        this.alpha = 1;
        if (abstractC1431z instanceof L) {
            L l10 = (L) abstractC1431z;
            ArrayDeque arrayDeque = new ArrayDeque(l10.yellow);
            this.purple = arrayDeque;
            arrayDeque.push(l10);
            AbstractC1431z abstractC1431z2 = l10.silver;
            while (abstractC1431z2 instanceof L) {
                L l11 = (L) abstractC1431z2;
                ((ArrayDeque) this.purple).push(l11);
                abstractC1431z2 = l11.silver;
            }
            this.red = (C1430y) abstractC1431z2;
            return;
        }
        this.purple = null;
        this.red = (C1430y) abstractC1431z;
    }

    public u alpha() {
        u uVar;
        u uVar2 = (u) this.red;
        if (uVar2 == null) {
            throw new NoSuchElementException();
        }
        while (true) {
            Stack stack = (Stack) this.purple;
            if (stack.isEmpty()) {
                uVar = null;
                break;
            }
            Object obj = ((aa) stack.pop()).silver;
            while (obj instanceof aa) {
                aa aaVar = (aa) obj;
                stack.push(aaVar);
                obj = aaVar.red;
            }
            uVar = (u) obj;
            if (uVar.purple.length != 0) {
                break;
            }
        }
        this.red = uVar;
        return uVar2;
    }

    public C1430y bravo() {
        C1430y c1430y;
        C1430y c1430y2 = (C1430y) this.red;
        if (c1430y2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = (ArrayDeque) this.purple;
            c1430y = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            AbstractC1431z abstractC1431z = ((L) arrayDeque.pop()).teal;
            while (abstractC1431z instanceof L) {
                L l10 = (L) abstractC1431z;
                arrayDeque.push(l10);
                abstractC1431z = l10.silver;
            }
            c1430y = (C1430y) abstractC1431z;
        } while (c1430y.hotel() == 0);
        this.red = c1430y;
        return c1430y2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                if (((u) this.red) != null) {
                    return true;
                }
                return false;
            default:
                if (((C1430y) this.red) != null) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.alpha) {
            case 0:
                return alpha();
            default:
                return bravo();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public y(e eVar) {
        this.alpha = 0;
        this.purple = new Stack();
        while (eVar instanceof aa) {
            aa aaVar = (aa) eVar;
            ((Stack) this.purple).push(aaVar);
            eVar = aaVar.red;
        }
        this.red = (u) eVar;
    }
}
