package Oe;

import com.google.android.gms.measurement.internal.zzbf;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class aj implements Iterator {
    public final /* synthetic */ int alpha = 0;
    public Iterator purple;

    public /* synthetic */ aj() {
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
        switch (this.alpha) {
            case 0:
                return (String) this.purple.next();
            case 1:
                return (String) this.purple.next();
            default:
                return ((Map.Entry) this.purple.next()).getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException("Remove not supported");
            default:
                this.purple.remove();
                return;
        }
    }

    public aj(zzbf zzbfVar) {
        this.purple = zzbfVar.alpha.keySet().iterator();
    }

    public aj(Iterator it) {
        it.getClass();
        this.purple = it;
    }
}
