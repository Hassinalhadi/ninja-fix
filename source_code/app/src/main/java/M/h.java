package M;

import g0.ag;
import g0.ai;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;

/* loaded from: classes3.dex */
public final class h implements Iterator, Yd.a {
    public final /* synthetic */ int alpha = 0;
    public final Object purple;

    public h(Enumeration enumeration) {
        this.purple = enumeration;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                return ((f) this.purple).red;
            case 1:
                return ((Iterator) this.purple).hasNext();
            case 2:
                return ((Enumeration) this.purple).hasMoreElements();
            default:
                return ((Lf.h) this.purple).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.alpha) {
            case 0:
                return (Map.Entry) ((f) this.purple).next();
            case 1:
                return (ai) ((Iterator) this.purple).next();
            case 2:
                return ((Enumeration) this.purple).nextElement();
            default:
                return ((Lf.h) this.purple).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.alpha) {
            case 0:
                ((f) this.purple).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }

    public h(Object[] array) {
        Intrinsics.echo(array, "array");
        this.purple = x.golf(array);
    }

    public h(e eVar) {
        n[] nVarArr = new n[8];
        for (int i4 = 0; i4 < 8; i4++) {
            nVarArr[i4] = new p(this);
        }
        this.purple = new f(eVar, nVarArr);
    }

    public h(ag agVar) {
        this.purple = agVar.f12634c.iterator();
    }
}
