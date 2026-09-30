package vg;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class z extends A {
    public final /* synthetic */ int delta;
    public final /* synthetic */ A echo;

    public /* synthetic */ z(A a6, int i4) {
        this.delta = i4;
        this.echo = a6;
    }

    @Override // vg.A
    public final void alpha(an anVar, Object obj) {
        switch (this.delta) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.echo.alpha(anVar, it.next());
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i4 = 0; i4 < length; i4++) {
                        this.echo.alpha(anVar, Array.get(obj, i4));
                    }
                    return;
                }
                return;
        }
    }
}
