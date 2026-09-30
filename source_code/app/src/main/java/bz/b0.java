package bz;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ a0 purple;

    public /* synthetic */ b0(a0 a0Var, int i4) {
        this.alpha = i4;
        this.purple = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return new d0(this.purple, 1);
            default:
                return new d0(this.purple, 0);
        }
    }
}
