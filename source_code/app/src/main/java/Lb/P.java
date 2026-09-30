package Lb;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.redirecthandler.RedirectUtils;
import com.checkout.components.redirecthandler.model.RedirectResult;
import com.checkout.components.rememberme.AbstractC0979s0;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.utils.NavControllerWrapper;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class P implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1731a;
    public final /* synthetic */ int alpha = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1732b;
    public final /* synthetic */ kotlin.e purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ P(T.s sVar, DiComponent diComponent, NavControllerWrapper navControllerWrapper, Xd.l lVar, Xd.n nVar, Xd.l lVar2, Function0 function0, Function0 function02) {
        this.red = sVar;
        this.silver = diComponent;
        this.teal = navControllerWrapper;
        this.white = lVar;
        this.purple = nVar;
        this.f1732b = lVar2;
        this.yellow = function0;
        this.f1731a = function02;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        Unit a6;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    AbstractC0220c.quebec((OrdersFragmentV2) this.red, (androidx.lifecycle.az) this.silver, (yf.N) this.teal, ((Nb.h) this.white).charlie, null, (Function1) this.purple, (Function0) this.yellow, (Function0) this.f1731a, (Function0) this.f1732b, c0585q, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                a6 = RedirectUtils.a((LogDetails) this.red, (Logger) this.silver, (RedirectUtils) this.teal, (String) this.white, (String) this.yellow, (ComponentCallback) this.f1731a, (PaymentMethodComponent) this.f1732b, (Function1) this.purple, (RedirectResult) obj, (String) obj2);
                return a6;
            default:
                return AbstractC0979s0.a((T.s) this.red, (DiComponent) this.silver, (NavControllerWrapper) this.teal, (Xd.l) this.white, (Xd.n) this.purple, (Xd.l) this.f1732b, (Function0) this.yellow, (Function0) this.f1731a, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ P(LogDetails logDetails, Logger logger, RedirectUtils redirectUtils, String str, String str2, ComponentCallback componentCallback, PaymentMethodComponent paymentMethodComponent, Function1 function1) {
        this.red = logDetails;
        this.silver = logger;
        this.teal = redirectUtils;
        this.white = str;
        this.yellow = str2;
        this.f1731a = componentCallback;
        this.f1732b = paymentMethodComponent;
        this.purple = function1;
    }

    public /* synthetic */ P(OrdersFragmentV2 ordersFragmentV2, androidx.lifecycle.az azVar, yf.N n5, Nb.h hVar, Function1 function1, Function0 function0, Function0 function02, Function0 function03) {
        this.red = ordersFragmentV2;
        this.silver = azVar;
        this.teal = n5;
        this.white = hVar;
        this.purple = function1;
        this.yellow = function0;
        this.f1731a = function02;
        this.f1732b = function03;
    }
}
