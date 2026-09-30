package Ac;

import androidx.compose.runtime.ax;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;
    public final /* synthetic */ ax red;

    public /* synthetic */ j(int i4, ax axVar, Function1 function1) {
        this.alpha = i4;
        this.purple = function1;
        this.red = axVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.invoke(null);
                this.red.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                this.purple.invoke((String) this.red.getValue());
                return Unit.INSTANCE;
        }
    }
}
