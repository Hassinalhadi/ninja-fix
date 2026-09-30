package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import t0.C2915g0;

/* loaded from: classes3.dex */
public final /* synthetic */ class H implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ float purple;
    public final /* synthetic */ float red;

    public /* synthetic */ H(int i4, float f5, float f10) {
        this.alpha = i4;
        this.purple = f5;
        this.red = f10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2915g0 c2915g0 = (C2915g0) obj;
        switch (this.alpha) {
            case 0:
                c2915g0.alpha = "offset";
                Q0.g gVar = new Q0.g(this.purple);
                kotlin.collections.o oVar = c2915g0.charlie;
                oVar.bravo(gVar, "x");
                oVar.bravo(new Q0.g(this.red), "y");
                return Unit.INSTANCE;
            default:
                c2915g0.alpha = "padding";
                Q0.g gVar2 = new Q0.g(this.purple);
                kotlin.collections.o oVar2 = c2915g0.charlie;
                oVar2.bravo(gVar2, "horizontal");
                oVar2.bravo(new Q0.g(this.red), "vertical");
                return Unit.INSTANCE;
        }
    }
}
