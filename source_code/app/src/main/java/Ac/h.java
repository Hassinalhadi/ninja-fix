package Ac;

import B9.ab;
import Cb.z;
import F.P2;
import F.ag;
import a0.C0366t;
import androidx.compose.foundation.lazy.layout.ai;
import androidx.compose.foundation.lazy.layout.y;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import com.app.network.network.models.Shift;
import com.checkout.address.model.AddressEditScreenStyle;
import com.checkout.components.address.AbstractC0870k;
import com.checkout.components.card.ui.component.base.InputComponentViewKt;
import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.view.InputContainerViewKt;
import com.checkout.components.ui.view.ScreenHeaderViewKt;
import db.C1602b;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.captainsuniforms.viewmodel.CaptainsUniformsViewModel;
import g0.C1726f;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2754r0;
import s6.AbstractC2799w0;
import s6.G6;
import sb.AbstractC2845d;
import t6.AbstractC3071v3;
import wc.AbstractC3255a;
import wc.C3257c;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ h(CaptainsUniformsViewModel captainsUniformsViewModel, Function1 function1, Function1 function12, Function0 function0, int i4) {
        this.alpha = 5;
        this.purple = captainsUniformsViewModel;
        this.silver = function1;
        this.red = function12;
        this.teal = function0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit InputComponentContainerPreview$lambda$8;
        Unit ScreenHeaderView$lambda$7;
        Unit RenderCardNumberInput$lambda$30$lambda$15$lambda$14;
        boolean z2;
        Object obj3 = this.red;
        Object obj4 = this.teal;
        Object obj5 = this.silver;
        Object obj6 = this.purple;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                q.echo((s) obj6, (List) obj3, (Function1) obj5, (T.s) obj4, (InterfaceC0581m) obj, C0564b.cyan(3073));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                q.charlie((Shift) obj6, (Function0) obj3, (Function0) obj5, (Function0) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC2754r0.alpha((String) obj6, (String) obj3, (Function0) obj5, (Function0) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC2799w0.alpha((String) obj6, (String) obj3, (T.s) obj4, (C0366t) obj5, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                z.echo((List) obj3, (Cb.b) obj6, (Function1) obj5, (T.s) obj4, (InterfaceC0581m) obj, C0564b.cyan(385));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                G6.alpha((CaptainsUniformsViewModel) obj6, (Function1) obj5, (Function1) obj3, (Function0) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.lazy.layout.j.alpha((ge.s) obj6, (T.s) obj4, (ai) obj3, (y) obj5, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                db.l.delta((String) obj6, (C1602b) obj3, (String) obj5, (T.p) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ga.e.bravo((ga.f) obj6, (Function0) obj3, (Function0) obj5, (T.s) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 9:
                return AbstractC0870k.a((TextLabelViewItem) obj6, (Function0) obj3, (ab) obj5, (AddressEditScreenStyle) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 10:
                InputComponentContainerPreview$lambda$8 = InputContainerViewKt.InputComponentContainerPreview$lambda$8((InputFieldViewStyle) obj6, (TextLabelViewStyle) obj3, (ax) obj5, (TextLabelState) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return InputComponentContainerPreview$lambda$8;
            case 11:
                ScreenHeaderView$lambda$7 = ScreenHeaderViewKt.ScreenHeaderView$lambda$7((C1726f) obj6, (Function0) obj3, (String) obj5, (TopAppBarViewStyle) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return ScreenHeaderView$lambda$7;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC2845d.echo((Function0) obj6, (String) obj3, (P.d) obj5, (P.d) obj4, (InterfaceC0581m) obj, C0564b.cyan(3511));
                return Unit.INSTANCE;
            case 13:
                RenderCardNumberInput$lambda$30$lambda$15$lambda$14 = InputComponentViewKt.RenderCardNumberInput$lambda$30$lambda$15$lambda$14((CardNumberViewModel) obj6, (CardNumberViewModel) obj3, (ax) obj5, (ax) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return RenderCardNumberInput$lambda$30$lambda$15$lambda$14;
            default:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(1 & intValue, z2)) {
                    P.d dVar = AbstractC3255a.alpha;
                    P.d echo = P.e.echo(1695722195, new Ec.l((Function0) obj6, 11), c0585q);
                    P.d echo2 = P.e.echo(2025892042, new Vc.o((C3257c) obj3, (ax) obj5, (ax) obj4), c0585q);
                    float f5 = P2.alpha;
                    long alpha = AbstractC3071v3.alpha(c0585q, R.color.coolgray_800);
                    long j5 = C0366t.echo;
                    ag.alpha(dVar, null, echo, echo2, 0.0f, null, P2.alpha(alpha, j5, j5, j5, c0585q), c0585q, 3462);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(ge.s sVar, T.s sVar2, ai aiVar, y yVar, int i4) {
        this.alpha = 6;
        this.purple = sVar;
        this.teal = sVar2;
        this.red = aiVar;
        this.silver = yVar;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i4, int i5) {
        this.alpha = i5;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
    }

    public /* synthetic */ h(String str, String str2, T.s sVar, C0366t c0366t, int i4) {
        this.alpha = 3;
        this.purple = str;
        this.red = str2;
        this.teal = sVar;
        this.silver = c0366t;
    }

    public /* synthetic */ h(List list, Cb.b bVar, Function1 function1, T.s sVar, int i4) {
        this.alpha = 4;
        this.red = list;
        this.purple = bVar;
        this.silver = function1;
        this.teal = sVar;
    }
}
