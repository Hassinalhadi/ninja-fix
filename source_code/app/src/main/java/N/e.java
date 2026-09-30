package N;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.x;

/* loaded from: classes3.dex */
public final class e extends d {

    /* renamed from: a, reason: collision with root package name */
    public int f1852a;
    public final c teal;
    public Object white;
    public boolean yellow;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(c cVar) {
        super(r1, r0);
        Object obj = cVar.purple;
        M.e eVar = cVar.silver;
        this.teal = cVar;
        this.f1852a = eVar.teal;
    }

    @Override // N.d, java.util.Iterator
    public final Object next() {
        if (this.teal.silver.teal == this.f1852a) {
            Object next = super.next();
            this.white = next;
            this.yellow = true;
            return next;
        }
        throw new ConcurrentModificationException();
    }

    @Override // N.d, java.util.Iterator
    public final void remove() {
        if (this.yellow) {
            Object obj = this.white;
            c cVar = this.teal;
            x.alpha(cVar).remove(obj);
            this.white = null;
            this.yellow = false;
            this.f1852a = cVar.silver.teal;
            this.purple--;
            return;
        }
        throw new IllegalStateException();
    }
}
