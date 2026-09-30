package N2;

import a2.C0380e;
import a2.C0382g;
import bx.K;
import com.checkout.components.card.CardComponent;
import com.checkout.components.card.ui.component.address.AddressViewKt;
import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.rememberme.M1;
import com.checkout.components.ui.picker.PickerContentViewKt;
import com.checkout.components.ui.view.InputFieldViewKt;
import k3.C2004c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;

    public /* synthetic */ ae(int i4, Function1 function1) {
        this.alpha = i4;
        this.purple = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallbackResult a6;
        Unit InputFieldView$lambda$8$lambda$2$lambda$1;
        Unit a8;
        CallbackResult a10;
        switch (this.alpha) {
            case 0:
                h hVar = (h) obj;
                if (!(hVar instanceof f)) {
                    if (hVar instanceof g) {
                        Function1 function1 = this.purple;
                        if (function1 != null) {
                            function1.invoke(hVar);
                        }
                    } else if (!(hVar instanceof e) && !(hVar instanceof d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.INSTANCE;
            case 1:
                S.g gVar = (S.g) this.purple.invoke((S.l) obj);
                synchronized (S.n.charlie) {
                    S.n.delta = S.n.delta.india(gVar.golf());
                }
                return gVar;
            case 2:
                k3.f result = (k3.f) obj;
                Intrinsics.echo(result, "result");
                this.purple.invoke(Boolean.valueOf(result instanceof C2004c));
                return Unit.INSTANCE;
            case 3:
                k3.f result2 = (k3.f) obj;
                Intrinsics.echo(result2, "result");
                this.purple.invoke(Boolean.valueOf(result2 instanceof C2004c));
                return Unit.INSTANCE;
            case 4:
                bx.s sVar = (bx.s) obj;
                Y1.aa aaVar = ((Y1.l) sVar.charlie()).purple;
                Intrinsics.charlie(aaVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i4 = Y1.aa.white;
                for (Y1.aa aaVar2 : Y1.y.bravo((C0382g) aaVar)) {
                    if (aaVar2 instanceof C0382g) {
                        ((C0382g) aaVar2).getClass();
                    } else if (aaVar2 instanceof C0380e) {
                        ((C0380e) aaVar2).getClass();
                    }
                }
                Function1 function12 = this.purple;
                if (function12 != null) {
                    return (K) function12.invoke(sVar);
                }
                return null;
            case 5:
                return M1.a(this.purple, ((Boolean) obj).booleanValue());
            case 6:
                Long l10 = (Long) obj;
                l10.longValue();
                return this.purple.invoke(l10);
            case 7:
                return PickerContentViewKt.bravo(obj, this.purple);
            case 8:
                a6 = CardComponent.a(this.purple, (CardMetadata) obj);
                return a6;
            case 9:
                InputFieldView$lambda$8$lambda$2$lambda$1 = InputFieldViewKt.InputFieldView$lambda$8$lambda$2$lambda$1(this.purple, (Y.v) obj);
                return InputFieldView$lambda$8$lambda$2$lambda$1;
            case 10:
                a8 = AddressViewKt.a(this.purple, ((Boolean) obj).booleanValue());
                return a8;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.purple.invoke(bool);
                return Unit.INSTANCE;
            default:
                a10 = InternalCheckoutComponents.a(this.purple, (CardMetadata) obj);
                return a10;
        }
    }
}
