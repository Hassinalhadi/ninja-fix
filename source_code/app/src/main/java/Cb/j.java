package Cb;

import com.checkout.components.kmp.rememberme.view.common.ContainerFooterViewKt;
import com.checkout.components.kmp.rememberme.view.common.ContainerViewKt;
import com.checkout.components.rememberme.Y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;

    public /* synthetic */ j(int i4, Function1 function1) {
        this.alpha = i4;
        this.purple = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                this.purple.invoke(null);
                return Unit.INSTANCE;
            case 1:
                this.purple.invoke(Boolean.TRUE);
                return Unit.INSTANCE;
            case 2:
                return ContainerFooterViewKt.bravo(this.purple);
            case 3:
                return ContainerViewKt.charlie(this.purple);
            case 4:
                return ContainerViewKt.alpha(this.purple);
            case 5:
                return Y0.a(this.purple);
            case 6:
                return Y0.b(this.purple);
            default:
                this.purple.invoke("");
                return Unit.INSTANCE;
        }
    }
}
