package Lf;

import Nf.C0265x;
import java.util.Iterator;
import kotlin.collections.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.x;
import pf.InterfaceC2358h;

/* loaded from: classes2.dex */
public final class i implements Iterable, Yd.a {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ i(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                return new h((C0265x) this.purple);
            case 1:
                return x.golf((Object[]) this.purple);
            case 2:
                return new w((Iterator) ((Function0) this.purple).invoke());
            default:
                return ((InterfaceC2358h) this.purple).iterator();
        }
    }
}
