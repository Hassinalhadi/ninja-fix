package com.checkout.address.ui.state;

import P.b;
import P.d;
import Xd.l;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.address.W;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import d5.C1589a;
import g4.C1752a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$StatePickerFieldViewKt {

    @NotNull
    public static final ComposableSingletons$StatePickerFieldViewKt INSTANCE = new ComposableSingletons$StatePickerFieldViewKt();

    /* renamed from: a */
    private static final b f3823a = new d(new C1752a(0), 560349887, false);

    public static final Unit a(InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            InputComponentState inputComponentState = new InputComponentState(null, null, 3, null);
            InputComponentViewStyle inputComponentViewStyle = new InputComponentViewStyle(null, null, null, 7, null);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new C1589a(21);
                c0585q.f(jade);
            }
            W.a(inputComponentState, inputComponentViewStyle, (Function0) jade, "Select State", c0585q, InputComponentState.$stable | 3456 | (InputComponentViewStyle.$stable << 3));
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final l getLambda$560349887$address_standardRelease() {
        return f3823a;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }
}
