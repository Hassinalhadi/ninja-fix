package bv;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bv.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0762a implements Iterator, Yd.a {
    public int alpha;
    public int purple;
    public boolean red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;

    public C0762a(int i4) {
        this.alpha = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.purple < this.alpha) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object foxtrot;
        if (hasNext()) {
            int i4 = this.purple;
            switch (this.silver) {
                case 0:
                    foxtrot = ((e) this.teal).foxtrot(i4);
                    break;
                case 1:
                    foxtrot = ((e) this.teal).juliet(i4);
                    break;
                default:
                    foxtrot = ((f) this.teal).purple[i4];
                    break;
            }
            this.purple++;
            this.red = true;
            return foxtrot;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.red) {
            int i4 = this.purple - 1;
            this.purple = i4;
            switch (this.silver) {
                case 0:
                    ((e) this.teal).hotel(i4);
                    break;
                case 1:
                    ((e) this.teal).hotel(i4);
                    break;
                default:
                    ((f) this.teal).alpha(i4);
                    break;
            }
            this.alpha--;
            this.red = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0762a(f fVar) {
        this(fVar.red);
        this.silver = 2;
        this.teal = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0762a(e eVar, int i4) {
        this(eVar.red);
        this.silver = i4;
        switch (i4) {
            case 1:
                this.teal = eVar;
                this(eVar.red);
                return;
            default:
                this.teal = eVar;
                return;
        }
    }
}
