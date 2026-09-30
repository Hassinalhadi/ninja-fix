package Jb;

import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b0 extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ OrdersFragmentV2 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(OrdersFragmentV2 ordersFragmentV2, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = ordersFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return this.purple.requireActivity().getViewModelStore();
            case 1:
                return this.purple.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return this.purple.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return this.purple;
        }
    }
}
