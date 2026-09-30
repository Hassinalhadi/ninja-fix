package pf;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* renamed from: pf.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2363m implements Iterator, Yd.a {
    public final /* synthetic */ int alpha;
    public Iterator purple;
    public final Object red;

    public C2363m(zd.j jVar) {
        this.alpha = 2;
        this.red = jVar;
        this.purple = jVar.alpha.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                return this.purple.hasNext();
            case 1:
                return this.purple.hasNext();
            default:
                return this.purple.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup;
        switch (this.alpha) {
            case 0:
                return ((C2364n) this.red).bravo.invoke(this.purple.next());
            case 1:
                Object next = this.purple.next();
                View view = (View) next;
                Lf.h hVar = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    hVar = new Lf.h(8, viewGroup);
                }
                ArrayList arrayList = (ArrayList) this.red;
                if (hVar != null && hVar.hasNext()) {
                    arrayList.add(this.purple);
                    this.purple = hVar;
                } else {
                    while (!this.purple.hasNext() && !arrayList.isEmpty()) {
                        this.purple = (Iterator) CollectionsKt.ochre(arrayList);
                        CollectionsKt.f(arrayList);
                    }
                }
                return next;
            default:
                return ((zd.j) this.red).purple.invoke(this.purple.next());
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
                this.purple.remove();
                return;
        }
    }

    public C2363m(Lf.h hVar) {
        this.alpha = 1;
        this.red = new ArrayList();
        this.purple = hVar;
    }

    public C2363m(C2364n c2364n) {
        this.alpha = 0;
        this.red = c2364n;
        this.purple = c2364n.alpha.iterator();
    }
}
