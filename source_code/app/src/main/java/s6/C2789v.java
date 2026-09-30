package s6;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: s6.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2789v implements Iterator {
    public int alpha;
    public int purple;
    public int red;
    public final /* synthetic */ C2825z silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ C2825z white;

    public C2789v(C2825z c2825z, int i4) {
        int i5;
        this.teal = i4;
        this.white = c2825z;
        this.silver = c2825z;
        this.alpha = c2825z.teal;
        if (c2825z.isEmpty()) {
            i5 = -1;
        } else {
            i5 = 0;
        }
        this.purple = i5;
        this.red = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.purple >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        C2825z c2825z = this.white;
        C2825z c2825z2 = this.silver;
        if (c2825z2.teal == this.alpha) {
            if (hasNext()) {
                int i4 = this.purple;
                this.red = i4;
                switch (this.teal) {
                    case 0:
                        Object obj2 = C2825z.f13696c;
                        obj = c2825z.bravo()[i4];
                        break;
                    case 1:
                        obj = new C2816y(c2825z, i4);
                        break;
                    default:
                        Object obj3 = C2825z.f13696c;
                        obj = c2825z.charlie()[i4];
                        break;
                }
                int i5 = this.purple + 1;
                if (i5 >= c2825z2.white) {
                    i5 = -1;
                }
                this.purple = i5;
                return obj;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z2;
        C2825z c2825z = this.silver;
        if (c2825z.teal == this.alpha) {
            if (this.red >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            t6.ae.delta("no calls to next() since the last call to remove()", z2);
            this.alpha += 32;
            c2825z.remove(c2825z.bravo()[this.red]);
            this.purple--;
            this.red = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
