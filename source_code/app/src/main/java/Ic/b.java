package Ic;

import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import s6.S6;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ List purple;
    public final /* synthetic */ Function1 red;

    public /* synthetic */ b(List list, Function1 function1, int i4, int i5) {
        this.alpha = i5;
        this.purple = list;
        this.red = function1;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                e.bravo(this.purple, this.red, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            default:
                S6.bravo(this.purple, this.red, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
        }
    }
}
