package Ec;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class aq implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;
    public final /* synthetic */ int red;

    public /* synthetic */ aq(int i4, int i5, Function1 function1) {
        this.alpha = i5;
        this.purple = function1;
        this.red = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.invoke(Integer.valueOf(this.red));
                return Unit.INSTANCE;
            default:
                this.purple.invoke(Integer.valueOf(this.red));
                return Unit.INSTANCE;
        }
    }
}
