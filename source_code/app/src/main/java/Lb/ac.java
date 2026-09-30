package Lb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class ac implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ T.p red;
    public final /* synthetic */ int silver;

    public /* synthetic */ ac(Function0 function0, T.p pVar, int i4, int i5) {
        this.alpha = i5;
        this.purple = function0;
        this.red = pVar;
        this.silver = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Integer) obj2).getClass();
        switch (i4) {
            case 0:
                ad.alpha(C0564b.cyan(this.silver | 1), this.red, interfaceC0581m, this.purple);
                return Unit.INSTANCE;
            default:
                Qa.a.foxtrot(C0564b.cyan(this.silver | 1), this.red, interfaceC0581m, this.purple);
                return Unit.INSTANCE;
        }
    }
}
