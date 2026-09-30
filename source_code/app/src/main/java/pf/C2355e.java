package pf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pf.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2355e implements Iterator, Yd.a {
    public final /* synthetic */ int alpha;
    public final Iterator purple;
    public int red;
    public Object silver;
    public final /* synthetic */ InterfaceC2358h teal;

    public C2355e(C2356f c2356f) {
        this.alpha = 0;
        this.teal = c2356f;
        this.purple = c2356f.alpha.iterator();
        this.red = -1;
    }

    public void alpha() {
        Object next;
        C2356f c2356f;
        do {
            Iterator it = this.purple;
            if (it.hasNext()) {
                next = it.next();
                c2356f = (C2356f) this.teal;
            } else {
                this.red = 0;
                return;
            }
        } while (((Boolean) c2356f.charlie.invoke(next)).booleanValue() != c2356f.bravo);
        this.silver = next;
        this.red = 1;
    }

    public void bravo() {
        Iterator it = this.purple;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((Function1) ((kotlin.io.h) this.teal).charlie).invoke(next)).booleanValue()) {
                this.red = 1;
                this.silver = next;
                return;
            }
        }
        this.red = 0;
    }

    public boolean charlie() {
        Iterator it;
        Iterator it2 = (Iterator) this.silver;
        if (it2 != null && it2.hasNext()) {
            this.red = 1;
            return true;
        }
        do {
            Iterator it3 = this.purple;
            if (it3.hasNext()) {
                Object next = it3.next();
                C2357g c2357g = (C2357g) this.teal;
                it = (Iterator) c2357g.charlie.invoke(c2357g.bravo.invoke(next));
            } else {
                this.red = 2;
                this.silver = null;
                return false;
            }
        } while (!it.hasNext());
        this.silver = it;
        this.red = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                if (this.red == -1) {
                    alpha();
                }
                if (this.red == 1) {
                    return true;
                }
                return false;
            case 1:
                int i4 = this.red;
                if (i4 == 1) {
                    return true;
                }
                if (i4 == 2) {
                    return false;
                }
                return charlie();
            default:
                if (this.red == -1) {
                    bravo();
                }
                if (this.red == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.alpha) {
            case 0:
                if (this.red == -1) {
                    alpha();
                }
                if (this.red != 0) {
                    Object obj = this.silver;
                    this.silver = null;
                    this.red = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            case 1:
                int i4 = this.red;
                if (i4 != 2) {
                    if (i4 == 0 && !charlie()) {
                        throw new NoSuchElementException();
                    }
                    this.red = 0;
                    Iterator it = (Iterator) this.silver;
                    Intrinsics.checkNotNull(it);
                    return it.next();
                }
                throw new NoSuchElementException();
            default:
                if (this.red == -1) {
                    bravo();
                }
                if (this.red != 0) {
                    Object obj2 = this.silver;
                    this.silver = null;
                    this.red = -1;
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2355e(C2357g c2357g) {
        this.alpha = 1;
        this.teal = c2357g;
        this.purple = c2357g.alpha.iterator();
    }

    public C2355e(kotlin.io.h hVar) {
        this.alpha = 2;
        this.teal = hVar;
        this.purple = ((InterfaceC2358h) hVar.bravo).iterator();
        this.red = -1;
    }
}
