package Vc;

import Cb.t;
import D0.an;
import F.G1;
import F.G2;
import F.K1;
import H0.v;
import T.s;
import Y1.ag;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.C0556w;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.InterfaceC0550p;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import ao.ad;
import com.app.network.network.models.Currency;
import com.app.network.network.models.Wallet;
import com.checkout.address.model.State;
import com.checkout.address.model.StatePickerViewState;
import com.checkout.address.ui.edit.AddressEditViewModel;
import com.checkout.address.ui.state.StatePickerViewModel;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.checkout.components.interfaces.model.PaymentState;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.view.challenge.ChallengeButtonViewKt;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.view.InternalButtonViewKt;
import delivery.samurai.android.ui.wallet.WalletViewModel;
import i.C1860i;
import i.C1874w;
import i.InterfaceC1854c;
import i.InterfaceC1869r;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2616b5;
import s6.AbstractC2636d7;
import t6.Q2;
import wc.C3257c;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        String str;
        final float f5;
        Unit ChallengeButtonView_FHprtrg$lambda$1;
        Unit InternalButtonView$lambda$5;
        boolean z10;
        boolean z11;
        int i4;
        Object obj4 = C0580l.alpha;
        T.p pVar = T.p.alpha;
        boolean z12 = true;
        Object obj5 = this.silver;
        Object obj6 = this.red;
        Object obj7 = this.purple;
        switch (this.alpha) {
            case 0:
                InterfaceC0550p PullToRefreshBox = (InterfaceC0550p) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(PullToRefreshBox, "$this$PullToRefreshBox");
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    Object obj8 = (Tc.m) ((ax) obj5).getValue();
                    boolean z13 = obj8 instanceof Tc.k;
                    T.k kVar = T.d.teal;
                    if (z13) {
                        c0585q.purple(330500225);
                        FillElement fillElement = V.charlie;
                        ap delta = AbstractC0547m.delta(kVar, false);
                        long j5 = c0585q.magenta;
                        int i5 = (int) (j5 ^ (j5 >>> 32));
                        I mike = c0585q.mike();
                        s charlie = T.a.charlie(fillElement, c0585q);
                        InterfaceC2552l.maroon.getClass();
                        Function0 function0 = C2551k.bravo;
                        c0585q.white();
                        if (c0585q.lime) {
                            c0585q.lima(function0);
                        } else {
                            c0585q.i();
                        }
                        C0564b.blue(C2551k.foxtrot, c0585q, delta);
                        C0564b.blue(C2551k.echo, c0585q, mike);
                        C2549i c2549i = C2551k.golf;
                        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                            ad.blue(i5, c0585q, i5, c2549i);
                        }
                        C0564b.blue(C2551k.delta, c0585q, charlie);
                        G1.bravo(null, 0L, 0.0f, 0L, 0, c0585q, 0, 31);
                        c0585q.quebec(true);
                        c0585q.quebec(false);
                    } else if (obj8 instanceof Tc.j) {
                        c0585q.purple(330720976);
                        FillElement fillElement2 = V.charlie;
                        ap delta2 = AbstractC0547m.delta(kVar, false);
                        long j6 = c0585q.magenta;
                        int i10 = (int) (j6 ^ (j6 >>> 32));
                        I mike2 = c0585q.mike();
                        s charlie2 = T.a.charlie(fillElement2, c0585q);
                        InterfaceC2552l.maroon.getClass();
                        Function0 function02 = C2551k.bravo;
                        c0585q.white();
                        if (c0585q.lime) {
                            c0585q.lima(function02);
                        } else {
                            c0585q.i();
                        }
                        C0564b.blue(C2551k.foxtrot, c0585q, delta2);
                        C0564b.blue(C2551k.echo, c0585q, mike2);
                        C2549i c2549i2 = C2551k.golf;
                        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                            ad.blue(i10, c0585q, i10, c2549i2);
                        }
                        C0564b.blue(C2551k.delta, c0585q, charlie2);
                        G2.bravo(((Tc.j) obj8).alpha, AbstractC0538d.sierra(pVar, 32), 0L, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, new an(Db.c.black, AbstractC2636d7.charlie(14), null, null, null, 0L, 0, 0L, 0, 16777212), c0585q, 48, 0, 65020);
                        c0585q.quebec(true);
                        c0585q.quebec(false);
                    } else if (obj8 instanceof Tc.l) {
                        c0585q.purple(331308240);
                        Tc.l lVar = (Tc.l) obj8;
                        Wallet wallet = lVar.alpha;
                        Currency currency = wallet.getCurrency();
                        if (currency == null || (str = currency.getLocalizedName()) == null) {
                            str = "";
                        }
                        Float balance = wallet.getBalance();
                        if (balance != null) {
                            f5 = balance.floatValue();
                        } else {
                            f5 = 0.0f;
                        }
                        final Float f10 = lVar.delta;
                        if (f10 == null || f10.floatValue() <= 0.0f) {
                            z12 = false;
                        }
                        s uniform = AbstractC0538d.uniform(V.charlie, 16, 0.0f, 2);
                        final WalletViewModel walletViewModel = (WalletViewModel) obj6;
                        boolean delta3 = c0585q.delta(f5) | c0585q.golf(str) | c0585q.hotel(z12) | c0585q.golf(f10) | c0585q.india(walletViewModel);
                        final List list = lVar.bravo;
                        boolean india = c0585q.india(list) | delta3 | c0585q.golf(obj8);
                        Object jade = c0585q.jade();
                        if (india || jade == obj4) {
                            final Tc.l lVar2 = (Tc.l) obj8;
                            final boolean z14 = z12;
                            final String str2 = str;
                            jade = new Function1() { // from class: Vc.k
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj9) {
                                    InterfaceC1869r LazyColumn = (InterfaceC1869r) obj9;
                                    Intrinsics.echo(LazyColumn, "$this$LazyColumn");
                                    final String str3 = str2;
                                    final WalletViewModel walletViewModel2 = walletViewModel;
                                    final float f11 = f5;
                                    final boolean z15 = z14;
                                    final Float f12 = f10;
                                    com.google.android.material.datepicker.j.bravo(LazyColumn, "balance_card", new P.d(new Xd.m() { // from class: Vc.l
                                        @Override // Xd.m
                                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                            boolean z16;
                                            String str4;
                                            InterfaceC1854c item = (InterfaceC1854c) obj10;
                                            InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj11;
                                            int intValue2 = ((Integer) obj12).intValue();
                                            Intrinsics.echo(item, "$this$item");
                                            if ((intValue2 & 17) != 16) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            C0585q c0585q2 = (C0585q) interfaceC0581m2;
                                            if (c0585q2.magenta(intValue2 & 1, z16)) {
                                                AbstractC0538d.echo(V.echo(T.p.alpha, 16), c0585q2);
                                                Float f13 = f12;
                                                if (f13 != null) {
                                                    str4 = Q2.bravo(f13.floatValue());
                                                } else {
                                                    str4 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
                                                }
                                                String concat = "-".concat(str4);
                                                WalletViewModel walletViewModel3 = walletViewModel2;
                                                boolean india2 = c0585q2.india(walletViewModel3);
                                                Object jade2 = c0585q2.jade();
                                                if (india2 || jade2 == C0580l.alpha) {
                                                    jade2 = new n(walletViewModel3, 0);
                                                    c0585q2.f(jade2);
                                                }
                                                j.alpha(f11, str3, z15, concat, (Function0) jade2, null, c0585q2, 0, 32);
                                            } else {
                                                c0585q2.ochre();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, -1122265881, true), 2);
                                    com.google.android.material.datepicker.j.bravo(LazyColumn, "header", c.echo, 2);
                                    List list2 = list;
                                    if (list2.isEmpty()) {
                                        com.google.android.material.datepicker.j.bravo(LazyColumn, "empty", c.foxtrot, 2);
                                    } else {
                                        m mVar = new m(0, list2);
                                        ((C1860i) LazyColumn).quebec(list2.size(), new Cb.l(8, mVar, list2), new Cb.m(7, list2), new P.d(new Ic.d(list2, str3, 2), 802480018, true));
                                    }
                                    if (lVar2.charlie) {
                                        com.google.android.material.datepicker.j.bravo(LazyColumn, "loading_more", c.golf, 2);
                                    }
                                    com.google.android.material.datepicker.j.bravo(LazyColumn, null, c.hotel, 3);
                                    return Unit.INSTANCE;
                                }
                            };
                            c0585q.f(jade);
                        }
                        AbstractC2616b5.alpha(uniform, (C1874w) obj7, null, null, null, null, false, null, (Function1) jade, c0585q, 6, 508);
                        c0585q.quebec(false);
                    } else {
                        throw ad.black(c0585q, -543525082, false);
                    }
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                return com.checkout.components.rememberme.I.a((TextLabelViewItem) obj7, (Function0) obj6, (s) obj5, (InterfaceC0555v) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            case 2:
                ChallengeButtonView_FHprtrg$lambda$1 = ChallengeButtonViewKt.ChallengeButtonView_FHprtrg$lambda$1((Wf.e) obj7, (DesignTokens) obj6, (String) obj5, (T) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
                return ChallengeButtonView_FHprtrg$lambda$1;
            case 3:
                return com.checkout.address.ui.navigation.a.a((AddressEditViewModel) obj7, (StatePickerViewModel) obj6, (ag) obj5, (Y1.l) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            case 4:
                return com.checkout.components.address.V.a((State) obj7, (Function1) obj6, (StatePickerViewState) obj5, (State) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            case 5:
                InternalButtonView$lambda$5 = InternalButtonViewKt.InternalButtonView$lambda$5((InternalButtonViewStyle) obj7, (InternalButtonState) obj6, (PaymentState) obj5, (T) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
                return InternalButtonView$lambda$5;
            case 6:
                T CenterAlignedTopAppBar = (T) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Intrinsics.echo(CenterAlignedTopAppBar, "$this$CenterAlignedTopAppBar");
                if ((intValue2 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(1 & intValue2, z10)) {
                    if (((Boolean) ((ax) obj5).getValue()).booleanValue()) {
                        c0585q2.purple(469442328);
                        C3257c c3257c = (C3257c) obj7;
                        boolean india2 = c0585q2.india(c3257c);
                        Object jade2 = c0585q2.jade();
                        ax axVar = (ax) obj6;
                        if (india2 || jade2 == obj4) {
                            jade2 = new okhttp3.internal.ws.a(10, c3257c, axVar);
                            c0585q2.f(jade2);
                        }
                        K1.foxtrot((Function0) jade2, null, false, null, P.e.echo(-1716070206, new t(axVar, 8), c0585q2), c0585q2, 196608, 30);
                    } else {
                        c0585q2.purple(462342584);
                    }
                    c0585q2.quebec(false);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0555v Card = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                Intrinsics.echo(Card, "$this$Card");
                if ((intValue3 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    s sierra = AbstractC0538d.sierra(V.charlie(pVar, 1.0f), Db.d.alpha);
                    C0537c c0537c = AbstractC0542h.alpha;
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(Db.d.charlie), T.d.f2062f, c0585q3, 6);
                    int romeo = C0564b.romeo(c0585q3);
                    I mike3 = c0585q3.mike();
                    s charlie3 = T.a.charlie(sierra, c0585q3);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q3.white();
                    if (c0585q3.lime) {
                        c0585q3.lima(c2550j);
                    } else {
                        c0585q3.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q3, alpha);
                    C0564b.blue(C2551k.echo, c0585q3, mike3);
                    C2549i c2549i3 = C2551k.golf;
                    if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo))) {
                        ad.blue(romeo, c0585q3, romeo, c2549i3);
                    }
                    C0564b.blue(C2551k.delta, c0585q3, charlie3);
                    C0556w c0556w = C0556w.alpha;
                    String str3 = (String) obj7;
                    if (str3 != null) {
                        c0585q3.purple(-99579587);
                        i4 = 6;
                        G2.bravo(str3, null, 0L, 0L, v.f1408b, null, 0L, null, 0L, 0, false, 0, 0, null, (an) obj6, c0585q3, 196608, 0, 65502);
                    } else {
                        i4 = 6;
                        c0585q3.purple(-102539405);
                    }
                    c0585q3.quebec(false);
                    ((P.d) obj5).invoke(c0556w, c0585q3, Integer.valueOf(i4));
                    c0585q3.quebec(true);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ o(C3257c c3257c, ax axVar, ax axVar2) {
        this.alpha = 6;
        this.purple = c3257c;
        this.silver = axVar;
        this.red = axVar2;
    }
}
