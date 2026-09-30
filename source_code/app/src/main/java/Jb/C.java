package Jb;

import com.app.network.network.models.CaptainClaimUnsettled;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class C implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ HomeViewModelV2 purple;

    public /* synthetic */ C(HomeViewModelV2 homeViewModelV2, int i4) {
        this.alpha = i4;
        this.purple = homeViewModelV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f5;
        boolean z2;
        switch (this.alpha) {
            case 0:
                HomeViewModelV2 homeViewModelV2 = this.purple;
                Float amount = ((CaptainClaimUnsettled) obj).getAmount();
                if (amount != null) {
                    f5 = amount.floatValue();
                } else {
                    f5 = 0.0f;
                }
                if (f5 > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Boolean valueOf = Boolean.valueOf(z2);
                yf.N n5 = homeViewModelV2.delta;
                n5.getClass();
                n5.juliet(null, valueOf);
                return Unit.INSTANCE;
            case 1:
                HomeViewModelV2 homeViewModelV22 = this.purple;
                Boolean bool = Boolean.FALSE;
                yf.N n10 = homeViewModelV22.delta;
                n10.getClass();
                n10.juliet(null, bool);
                return Unit.INSTANCE;
            default:
                Throwable th = (Throwable) obj;
                Intrinsics.checkNotNull(th);
                this.purple.onHandleError(th);
                return Unit.INSTANCE;
        }
    }
}
