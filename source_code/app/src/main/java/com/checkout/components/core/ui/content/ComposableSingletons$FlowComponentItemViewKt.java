package com.checkout.components.core.ui.content;

import D0.y;
import P.b;
import P.d;
import Xd.l;
import a0.C0366t;
import android.content.Context;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.checkout.components.core.common.Fixtures;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.insight.LogDetailsImpl;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.PaymentState;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import com.checkout.components.wallet.WalletComponent;
import com.checkout.components.wallet.ui.model.WalletComponentConfig;
import com.checkout.components.wallet.wrapper.GooglePayFlowCoordinator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yf.AbstractC3428A;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$FlowComponentItemViewKt {

    @NotNull
    public static final ComposableSingletons$FlowComponentItemViewKt INSTANCE = new ComposableSingletons$FlowComponentItemViewKt();

    /* renamed from: a */
    private static final b f5038a = new d(new y(20), 264259184, false);

    public static final Unit a(InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            E0 e02 = AndroidCompositionLocals_androidKt.bravo;
            Context context = (Context) c0585q.kilo(e02);
            Environment environment = Environment.SANDBOX;
            Fixtures fixtures = Fixtures.INSTANCE;
            PaymentSession dUMMY_PAYMENT_SESSION$core_standardRelease = fixtures.getDUMMY_PAYMENT_SESSION$core_standardRelease();
            Context context2 = (Context) c0585q.kilo(e02);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new y(19);
                c0585q.f(jade);
            }
            new WalletComponent(new WalletComponentConfig(context, environment, dUMMY_PAYMENT_SESSION$core_standardRelease, "", new ComponentCallback(null, null, null, null, null, null, null, null, null, 511, null), new GooglePayFlowCoordinator(context2, (l) jade), AbstractC3428A.charlie(PaymentState.Default.INSTANCE), fixtures.getDUMMY_LOGGER$core_standardRelease(), new LogDetailsImpl("", "", PaymentMethodName.INSTANCE.getGooglePay()), C0366t.india, false, null, null, null, null, null, 63488, null)).Render();
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final l getLambda$264259184$core_standardRelease() {
        return f5038a;
    }

    public static final Unit a(int i4, String str) {
        Intrinsics.echo(str, "<unused var>");
        return Unit.INSTANCE;
    }
}
