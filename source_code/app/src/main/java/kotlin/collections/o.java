package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import pf.InterfaceC2358h;
import s6.AbstractC2770s7;
import t0.v0;

/* loaded from: classes2.dex */
public final class o implements InterfaceC2358h {
    public final /* synthetic */ int alpha;
    public final Object bravo;

    public /* synthetic */ o(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    public void bravo(Object obj, String str) {
        ((ArrayList) this.bravo).add(new v0(str, obj));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [Xd.l, Pd.h] */
    @Override // pf.InterfaceC2358h
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                return kotlin.jvm.internal.x.golf((Object[]) this.bravo);
            case 1:
                return ((Iterable) this.bravo).iterator();
            case 2:
                return new kotlin.io.j(this);
            case 3:
                return new kotlin.text.h((CharSequence) this.bravo);
            case 4:
                return AbstractC2770s7.bravo((Pd.h) this.bravo);
            case 5:
                return (Iterator) this.bravo;
            default:
                return ((ArrayList) this.bravo).iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(Xd.l lVar) {
        this.alpha = 4;
        this.bravo = (Pd.h) lVar;
    }

    public o() {
        this.alpha = 6;
        this.bravo = new ArrayList();
    }
}
