package Ec;

import com.app.network.network.models.Shift;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class j implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;
    public final /* synthetic */ Shift red;

    public /* synthetic */ j(Function1 function1, Shift shift, int i4) {
        this.alpha = i4;
        this.purple = function1;
        this.red = shift;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j5;
        switch (this.alpha) {
            case 0:
                this.purple.invoke(this.red);
                return Unit.INSTANCE;
            default:
                Long id2 = this.red.getId();
                if (id2 != null) {
                    j5 = id2.longValue();
                } else {
                    j5 = 0;
                }
                this.purple.invoke(Long.valueOf(j5));
                return Unit.INSTANCE;
        }
    }
}
