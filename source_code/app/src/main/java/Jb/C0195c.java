package Jb;

import Lb.AbstractC0220c;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.ActionType;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.authentication.AuthenticationViewKt;
import com.checkout.components.kmp.rememberme.view.authentication.AuthenticationViewModel;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s6.I0;

/* renamed from: Jb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0195c implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ C0195c(ActionType actionType, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i4) {
        this.alpha = 2;
        this.silver = actionType;
        this.purple = function0;
        this.red = function02;
        this.teal = function03;
        this.white = function04;
        this.yellow = function05;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        Unit AuthenticationView$lambda$6;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(1);
                ((C0208p) this.silver).quebec((OrdersViewModel) this.teal, (androidx.lifecycle.al) this.white, (Function1) this.yellow, (Function0) this.purple, (Function0) this.red, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    Nb.h hVar = (Nb.h) this.white;
                    OrdersFragmentV2 ordersFragmentV2 = (OrdersFragmentV2) this.yellow;
                    boolean india = c0585q.india(ordersFragmentV2);
                    Object jade = c0585q.jade();
                    Object obj3 = C0580l.alpha;
                    if (india || jade == obj3) {
                        jade = new S(ordersFragmentV2, 9);
                        c0585q.f(jade);
                    }
                    Function1 function1 = (Function1) jade;
                    boolean india2 = c0585q.india(ordersFragmentV2);
                    Object jade2 = c0585q.jade();
                    if (india2 || jade2 == obj3) {
                        jade2 = new T(ordersFragmentV2, 26);
                        c0585q.f(jade2);
                    }
                    AbstractC0220c.alpha((HomeViewModelV2) this.silver, (yf.N) this.teal, hVar.charlie, null, (Function0) this.purple, (Function0) this.red, function1, (Function0) jade2, c0585q, 0, 8);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(1);
                Pc.d.bravo((ActionType) this.silver, (Function0) this.purple, (Function0) this.red, (Function0) this.teal, (Function0) this.white, (Function0) this.yellow, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
            case 3:
                int intValue2 = ((Integer) obj2).intValue();
                AuthenticationView$lambda$6 = AuthenticationViewKt.AuthenticationView$lambda$6((ResourceProvider) this.silver, (DesignTokens) this.teal, (androidx.compose.runtime.ax) this.white, (androidx.compose.runtime.ax) this.yellow, (androidx.compose.runtime.ax) this.purple, (AuthenticationViewModel) this.red, (InterfaceC0581m) obj, intValue2);
                return AuthenticationView$lambda$6;
            default:
                ((Integer) obj2).getClass();
                I0.bravo((androidx.compose.runtime.ax) this.silver, (androidx.compose.runtime.ax) this.teal, (androidx.compose.runtime.ax) this.white, (androidx.compose.runtime.ax) this.yellow, (androidx.compose.runtime.ax) this.purple, (Xd.l) this.red, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C0195c(ResourceProvider resourceProvider, DesignTokens designTokens, androidx.compose.runtime.ax axVar, androidx.compose.runtime.ax axVar2, androidx.compose.runtime.ax axVar3, AuthenticationViewModel authenticationViewModel) {
        this.alpha = 3;
        this.silver = resourceProvider;
        this.teal = designTokens;
        this.white = axVar;
        this.yellow = axVar2;
        this.purple = axVar3;
        this.red = authenticationViewModel;
    }

    public /* synthetic */ C0195c(HomeViewModelV2 homeViewModelV2, yf.N n5, Nb.h hVar, Function0 function0, Function0 function02, OrdersFragmentV2 ordersFragmentV2) {
        this.alpha = 1;
        this.silver = homeViewModelV2;
        this.teal = n5;
        this.white = hVar;
        this.purple = function0;
        this.red = function02;
        this.yellow = ordersFragmentV2;
    }

    public /* synthetic */ C0195c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, kotlin.e eVar, int i4, int i5) {
        this.alpha = i5;
        this.silver = obj;
        this.teal = obj2;
        this.white = obj3;
        this.yellow = obj4;
        this.purple = obj5;
        this.red = eVar;
    }
}
