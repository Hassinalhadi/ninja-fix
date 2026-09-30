package Ec;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class g implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;

    public /* synthetic */ g(Function0 function0, int i4) {
        this.alpha = i4;
        this.purple = function0;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        switch (this.alpha) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.purple.invoke();
                return Unit.INSTANCE;
            case 1:
                ((Boolean) obj).booleanValue();
                this.purple.invoke();
                return Unit.INSTANCE;
            default:
                ((Boolean) obj).booleanValue();
                this.purple.invoke();
                return Unit.INSTANCE;
        }
    }
}
