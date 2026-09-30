package a5;

import Y1.ag;
import com.checkout.components.address.AbstractC0870k;
import com.checkout.components.rememberme.AbstractC0979s0;
import com.checkout.components.rememberme.R0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ag purple;

    public /* synthetic */ m(ag agVar, int i4) {
        this.alpha = i4;
        this.purple = agVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return R0.b(this.purple);
            case 1:
                return R0.c(this.purple);
            case 2:
                return R0.a(this.purple);
            case 3:
                return AbstractC0979s0.b(this.purple);
            case 4:
                return AbstractC0979s0.a(this.purple);
            default:
                return AbstractC0870k.a(this.purple);
        }
    }
}
