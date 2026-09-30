package Dc;

import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import delivery.samurai.android.ui.shiftsV2.ShiftsFragmentV2;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class u extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ShiftsFragmentV2 purple;
    public final /* synthetic */ Object red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(ShiftsFragmentV2 shiftsFragmentV2, Lazy lazy, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = shiftsFragmentV2;
        this.red = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC0651v interfaceC0651v;
        a0 defaultViewModelProviderFactory;
        InterfaceC0651v interfaceC0651v2;
        a0 defaultViewModelProviderFactory2;
        switch (this.alpha) {
            case 0:
                d0 d0Var = (d0) this.red.getValue();
                if (d0Var instanceof InterfaceC0651v) {
                    interfaceC0651v = (InterfaceC0651v) d0Var;
                } else {
                    interfaceC0651v = null;
                }
                if (interfaceC0651v == null || (defaultViewModelProviderFactory = interfaceC0651v.getDefaultViewModelProviderFactory()) == null) {
                    return this.purple.getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory;
            default:
                d0 d0Var2 = (d0) this.red.getValue();
                if (d0Var2 instanceof InterfaceC0651v) {
                    interfaceC0651v2 = (InterfaceC0651v) d0Var2;
                } else {
                    interfaceC0651v2 = null;
                }
                if (interfaceC0651v2 == null || (defaultViewModelProviderFactory2 = interfaceC0651v2.getDefaultViewModelProviderFactory()) == null) {
                    return this.purple.getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory2;
        }
    }
}
