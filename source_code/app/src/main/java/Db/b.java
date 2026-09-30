package Db;

import Xd.l;
import androidx.compose.foundation.lazy.layout.j;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import s6.I0;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ P.d purple;

    public /* synthetic */ b(P.d dVar, int i4, int i5) {
        this.alpha = i5;
        this.purple = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                I0.alpha(this.purple, interfaceC0581m, C0564b.cyan(49));
                return Unit.INSTANCE;
            default:
                j.charlie(this.purple, interfaceC0581m, C0564b.cyan(7));
                return Unit.INSTANCE;
        }
    }
}
