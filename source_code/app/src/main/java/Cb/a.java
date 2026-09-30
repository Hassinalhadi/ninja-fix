package Cb;

import Jb.ah;
import Jb.aj;
import Jb.as;
import Jb.g0;
import a0.C0366t;
import a0.an;
import a0.ao;
import android.app.Dialog;
import android.os.Bundle;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.C0552s;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0565b0;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0583o;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0578j;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t0;
import androidx.compose.ui.platform.ComposeView;
import com.app.base.BaseViewModel;
import com.app.network.network.models.ActionType;
import com.app.network.network.models.ActiveSuspension;
import com.app.network.network.models.AddressNoteListItem;
import com.app.network.network.models.Root;
import com.app.network.network.models.TagDto;
import com.app.network.network.models.tickets.TicketResponse;
import com.checkout.address.model.AddressEditState;
import com.checkout.address.ui.edit.AddressEditActivity;
import com.checkout.components.kmp.rememberme.utils.LocaleStateRepository;
import com.checkout.components.kmp.rememberme.view.ui.EnvironmentProviderViewKt;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.view.ScreenHeaderViewKt;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import delivery.samurai.android.ui.support.AddSupportTicketActivity;
import delivery.samurai.android.ui.suspension.SuspensionFragment;
import delivery.samurai.android.ui.suspension.viewmodel.SuspensionViewModel;
import delivery.samurai.android.ui.wallet.WalletViewModel;
import h.AbstractC1797a;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import q0.C2391j;
import q0.InterfaceC2380P;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2717m7;
import s6.Q6;
import s6.R6;
import s6.S4;
import s6.S6;
import t6.U2;
import t6.V2;
import yf.N;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ a(int i4, int i5, Object obj, Object obj2) {
        this.alpha = i5;
        this.red = obj;
        this.purple = obj2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        String string;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Unit EnvironmentProviderView$lambda$2;
        boolean z16;
        boolean z17;
        C0551q c0551q;
        Unit a6;
        Unit ScreenHeaderView$lambda$4;
        an anVar = ao.alpha;
        int i4 = 4;
        C0551q c0551q2 = C0551q.alpha;
        T.p pVar = T.p.alpha;
        Object obj3 = C0580l.alpha;
        int i5 = 2;
        final int i10 = 0;
        final int i11 = 1;
        Object obj4 = this.purple;
        Object obj5 = this.red;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                z.alpha((b) obj5, (T.p) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                z.bravo((c) obj5, (T.p) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 2:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    Bundle arguments = ((Gb.w) obj5).getArguments();
                    if (arguments != null && (string = arguments.getString(Constants.KEY_URL)) != null) {
                        FillElement fillElement = V.charlie;
                        T.s bravo = androidx.compose.foundation.a.bravo(fillElement, C0366t.bravo, anVar);
                        ap delta = AbstractC0547m.delta(T.d.alpha, false);
                        long j5 = c0585q.magenta;
                        int i12 = (int) (j5 ^ (j5 >>> 32));
                        I mike = c0585q.mike();
                        T.s charlie = T.a.charlie(bravo, c0585q);
                        InterfaceC2552l.maroon.getClass();
                        C2550j c2550j = C2551k.bravo;
                        c0585q.white();
                        if (c0585q.lime) {
                            c0585q.lima(c2550j);
                        } else {
                            c0585q.i();
                        }
                        C0564b.blue(C2551k.foxtrot, c0585q, delta);
                        C0564b.blue(C2551k.echo, c0585q, mike);
                        C2549i c2549i = C2551k.golf;
                        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                            ao.ad.blue(i12, c0585q, i12, c2549i);
                        }
                        C0564b.blue(C2551k.delta, c0585q, charlie);
                        N2.p.charlie(string, null, fillElement, C2391j.bravo, c0585q, 1573296);
                        Dialog dialog = (Dialog) obj4;
                        boolean india = c0585q.india(dialog);
                        Object jade = c0585q.jade();
                        if (india || jade == obj3) {
                            jade = new B2.q(10, dialog);
                            c0585q.f(jade);
                        }
                        z.r.alpha(24576, Gb.a.alpha, androidx.compose.foundation.a.bravo(V.kilo(AbstractC0538d.whiskey(c0551q2.alpha(pVar, T.d.red), 0.0f, 48, 16, 0.0f, 9), 40), ao.charlie(1711276032), AbstractC2094g.alpha), c0585q, (Function0) jade, false);
                        c0585q.quebec(true);
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i13 = AddSupportTicketActivity.f12493K;
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    AddSupportTicketActivity addSupportTicketActivity = (AddSupportTicketActivity) obj4;
                    boolean india2 = c0585q2.india(addSupportTicketActivity);
                    Object jade2 = c0585q2.jade();
                    if (india2 || jade2 == obj3) {
                        jade2 = new Gc.a(addSupportTicketActivity, i11);
                        c0585q2.f(jade2);
                    }
                    Ic.e.bravo((List) obj5, (Function1) jade2, c0585q2, 0);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                Ic.e.alpha((Root) obj5, (Function0) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                Jb.ad.bravo((g0) obj5, (T.s) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                Jb.af.bravo((ah) obj5, (Function0) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 7:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i14 = HomeActivityV2.f12269k0;
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    T.s bravo2 = androidx.compose.foundation.a.bravo(V.charlie, C0366t.echo, anVar);
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(0), T.d.f2062f, c0585q3, 54);
                    long j6 = c0585q3.magenta;
                    int i15 = (int) (j6 ^ (j6 >>> 32));
                    I mike2 = c0585q3.mike();
                    T.s charlie2 = T.a.charlie(bravo2, c0585q3);
                    InterfaceC2552l.maroon.getClass();
                    Function0 function0 = C2551k.bravo;
                    c0585q3.white();
                    if (c0585q3.lime) {
                        c0585q3.lima(function0);
                    } else {
                        c0585q3.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q3, alpha);
                    C0564b.blue(C2551k.echo, c0585q3, mike2);
                    C2549i c2549i2 = C2551k.golf;
                    if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i15))) {
                        ao.ad.blue(i15, c0585q3, i15, c2549i2);
                    }
                    C0564b.blue(C2551k.delta, c0585q3, charlie2);
                    ax axVar = (ax) obj4;
                    Jb.r rVar = ((aj) axVar.getValue()).alpha;
                    HomeActivityV2 homeActivityV2 = (HomeActivityV2) obj5;
                    Ld.c hotel = kotlin.collections.ab.hotel();
                    String string2 = homeActivityV2.getString(R.string.menu_orders);
                    Intrinsics.delta(string2, "getString(...)");
                    hotel.add(new g0(string2, R.drawable.icon, new Jb.ao(homeActivityV2, 6)));
                    String string3 = homeActivityV2.getString(R.string.menu_shifts);
                    Intrinsics.delta(string3, "getString(...)");
                    hotel.add(new g0(string3, R.drawable.time_calender_new_fil, new Jb.ao(homeActivityV2, 7)));
                    String string4 = homeActivityV2.getString(R.string.menu_wallet);
                    Intrinsics.delta(string4, "getString(...)");
                    hotel.add(new g0(string4, R.drawable.vector_wallet, new Jb.ao(homeActivityV2, 8)));
                    if (((Boolean) ((t0) homeActivityV2.f12275M).getValue()).booleanValue()) {
                        String string5 = homeActivityV2.getString(R.string.support);
                        Intrinsics.delta(string5, "getString(...)");
                        hotel.add(new g0(string5, R.drawable.icon_customer, new Jb.ao(homeActivityV2, 9)));
                    }
                    Ld.c alpha2 = kotlin.collections.ab.alpha(hotel);
                    boolean india3 = c0585q3.india(homeActivityV2);
                    Object jade3 = c0585q3.jade();
                    if (india3 || jade3 == obj3) {
                        jade3 = new Jb.ao(homeActivityV2, i4);
                        c0585q3.f(jade3);
                    }
                    Function0 function02 = (Function0) jade3;
                    boolean india4 = c0585q3.india(homeActivityV2);
                    Object jade4 = c0585q3.jade();
                    if (india4 || jade4 == obj3) {
                        jade4 = new Jb.ao(homeActivityV2, 5);
                        c0585q3.f(jade4);
                    }
                    Jb.ad.alpha(rVar, alpha2, function02, (Function0) jade4, null, c0585q3, 0);
                    List list = ((aj) axVar.getValue()).bravo;
                    boolean india5 = c0585q3.india(homeActivityV2);
                    Object jade5 = c0585q3.jade();
                    if (india5 || jade5 == obj3) {
                        jade5 = new as(homeActivityV2, i5);
                        c0585q3.f(jade5);
                    }
                    Function1 function1 = (Function1) jade5;
                    if (1.0f <= 0.0d) {
                        AbstractC1797a.alpha("invalid weight; must be greater than zero");
                    }
                    Jb.af.charlie(list, function1, new LayoutWeightElement(1.0f, true), c0585q3, 0);
                    c0585q3.quebec(true);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 8:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z12)) {
                    final SuspensionFragment suspensionFragment = (SuspensionFragment) obj5;
                    ax bravo3 = AbstractC2717m7.bravo(suspensionFragment.quebec().charlie, c0585q4, 0);
                    ax bravo4 = AbstractC2717m7.bravo(suspensionFragment.quebec().echo, c0585q4, 0);
                    ax bravo5 = AbstractC2717m7.bravo(suspensionFragment.quebec().golf, c0585q4, 0);
                    Unit unit = Unit.INSTANCE;
                    ComposeView composeView = (ComposeView) obj4;
                    boolean india6 = c0585q4.india(suspensionFragment) | c0585q4.india(composeView);
                    Object jade6 = c0585q4.jade();
                    if (india6 || jade6 == obj3) {
                        jade6 = new Jc.d(suspensionFragment, composeView, null);
                        c0585q4.f(jade6);
                    }
                    C0564b.foxtrot((Xd.l) jade6, c0585q4, unit);
                    ActiveSuspension activeSuspension = (ActiveSuspension) bravo3.getValue();
                    Kc.e eVar = (Kc.e) bravo4.getValue();
                    boolean booleanValue = ((Boolean) bravo5.getValue()).booleanValue();
                    boolean india7 = c0585q4.india(suspensionFragment);
                    Object jade7 = c0585q4.jade();
                    if (india7 || jade7 == obj3) {
                        jade7 = new Function0() { // from class: Jc.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        SuspensionViewModel quebec = suspensionFragment.quebec();
                                        BaseViewModel.launchApi$default(quebec, null, new Kc.g(quebec, null), 1, null);
                                        quebec.alpha(true);
                                        return Unit.INSTANCE;
                                    default:
                                        SuspensionViewModel quebec2 = suspensionFragment.quebec();
                                        if (!quebec2.kilo && !quebec2.lima) {
                                            quebec2.juliet++;
                                            quebec2.lima = true;
                                            N n5 = quebec2.delta;
                                            Kc.e eVar2 = (Kc.e) n5.getValue();
                                            if (eVar2 instanceof Kc.d) {
                                                Kc.d dVar = (Kc.d) eVar2;
                                                List items = dVar.alpha;
                                                Intrinsics.echo(items, "items");
                                                n5.juliet(null, new Kc.d(items, dVar.bravo, true));
                                            }
                                            quebec2.alpha(false);
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q4.f(jade7);
                    }
                    Function0 function03 = (Function0) jade7;
                    boolean india8 = c0585q4.india(suspensionFragment);
                    Object jade8 = c0585q4.jade();
                    if (india8 || jade8 == obj3) {
                        jade8 = new Function0() { // from class: Jc.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        SuspensionViewModel quebec = suspensionFragment.quebec();
                                        BaseViewModel.launchApi$default(quebec, null, new Kc.g(quebec, null), 1, null);
                                        quebec.alpha(true);
                                        return Unit.INSTANCE;
                                    default:
                                        SuspensionViewModel quebec2 = suspensionFragment.quebec();
                                        if (!quebec2.kilo && !quebec2.lima) {
                                            quebec2.juliet++;
                                            quebec2.lima = true;
                                            N n5 = quebec2.delta;
                                            Kc.e eVar2 = (Kc.e) n5.getValue();
                                            if (eVar2 instanceof Kc.d) {
                                                Kc.d dVar = (Kc.d) eVar2;
                                                List items = dVar.alpha;
                                                Intrinsics.echo(items, "items");
                                                n5.juliet(null, new Kc.d(items, dVar.bravo, true));
                                            }
                                            quebec2.alpha(false);
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q4.f(jade8);
                    }
                    Jc.o.hotel(activeSuspension, eVar, booleanValue, function03, (Function0) jade8, c0585q4, 0);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                Jc.o.india((Jc.p) obj5, (Function1) obj4, (InterfaceC0581m) obj, C0564b.cyan(49));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                S6.alpha((ActionType) obj5, (Function0) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 11:
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue5 & 1, z13)) {
                    Rc.b bVar = (Rc.b) obj4;
                    TicketResponse ticketResponse = (TicketResponse) obj5;
                    boolean india9 = c0585q5.india(bVar) | c0585q5.india(ticketResponse);
                    Object jade9 = c0585q5.jade();
                    if (india9 || jade9 == obj3) {
                        jade9 = new Ac.g(20, bVar, ticketResponse);
                        c0585q5.f(jade9);
                    }
                    Q6.alpha(ticketResponse, (Function0) jade9, c0585q5, 0);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 12:
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (c0585q6.magenta(intValue6 & 1, z14)) {
                    Rc.b bVar2 = (Rc.b) obj4;
                    TicketResponse ticketResponse2 = (TicketResponse) obj5;
                    boolean india10 = c0585q6.india(bVar2) | c0585q6.india(ticketResponse2);
                    Object jade10 = c0585q6.jade();
                    if (india10 || jade10 == obj3) {
                        jade10 = new Ac.g(21, bVar2, ticketResponse2);
                        c0585q6.f(jade10);
                    }
                    R6.alpha(ticketResponse2, (Function0) jade10, c0585q6, 0);
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                Sb.d.delta((Sb.h) obj5, (T.s) obj4, (InterfaceC0581m) obj, C0564b.cyan(49));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                Vc.r.alpha((WalletViewModel) obj5, (T.s) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 15:
                InterfaceC0581m interfaceC0581m7 = (InterfaceC0581m) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                C0585q c0585q7 = (C0585q) interfaceC0581m7;
                if (c0585q7.magenta(intValue7 & 1, z15)) {
                    final Wb.y yVar = (Wb.y) obj5;
                    String str = yVar.f2220x;
                    boolean india11 = c0585q7.india(yVar);
                    Object jade11 = c0585q7.jade();
                    if (india11 || jade11 == obj3) {
                        jade11 = new Function0() { // from class: Wb.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        yVar.lima(false, false);
                                        return Unit.INSTANCE;
                                    default:
                                        y yVar2 = yVar;
                                        yVar2.lima(false, false);
                                        Function0 function04 = yVar2.f2217u;
                                        if (function04 != null) {
                                            function04.invoke();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q7.f(jade11);
                    }
                    Function0 function04 = (Function0) jade11;
                    File file = (File) obj4;
                    boolean india12 = c0585q7.india(yVar) | c0585q7.india(file);
                    Object jade12 = c0585q7.jade();
                    if (india12 || jade12 == obj3) {
                        jade12 = new Ac.g(26, yVar, file);
                        c0585q7.f(jade12);
                    }
                    Function0 function05 = (Function0) jade12;
                    boolean india13 = c0585q7.india(yVar);
                    Object jade13 = c0585q7.jade();
                    if (india13 || jade13 == obj3) {
                        jade13 = new Function0() { // from class: Wb.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        yVar.lima(false, false);
                                        return Unit.INSTANCE;
                                    default:
                                        y yVar2 = yVar;
                                        yVar2.lima(false, false);
                                        Function0 function042 = yVar2.f2217u;
                                        if (function042 != null) {
                                            function042.invoke();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q7.f(jade13);
                    }
                    Wb.t.alpha(file, function04, function05, (Function0) jade13, str, c0585q7, 0, 0);
                } else {
                    c0585q7.ochre();
                }
                return Unit.INSTANCE;
            case 16:
                EnvironmentProviderView$lambda$2 = EnvironmentProviderViewKt.EnvironmentProviderView$lambda$2((LocaleStateRepository) obj5, (Xd.l) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return EnvironmentProviderView$lambda$2;
            case 17:
                InterfaceC0581m interfaceC0581m8 = (InterfaceC0581m) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                C0585q c0585q8 = (C0585q) interfaceC0581m8;
                if (c0585q8.magenta(intValue8 & 1, z16)) {
                    T.s charlie3 = V.charlie(pVar, 1.0f);
                    C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q8, 0);
                    long j7 = c0585q8.magenta;
                    int i16 = (int) (j7 ^ (j7 >>> 32));
                    I mike3 = c0585q8.mike();
                    T.s charlie4 = T.a.charlie(charlie3, c0585q8);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q8.white();
                    if (c0585q8.lime) {
                        c0585q8.lima(c2550j2);
                    } else {
                        c0585q8.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q8, alpha3);
                    C0564b.blue(C2551k.echo, c0585q8, mike3);
                    C2549i c2549i3 = C2551k.golf;
                    if (c0585q8.lime || !Intrinsics.areEqual(c0585q8.jade(), Integer.valueOf(i16))) {
                        ao.ad.blue(i16, c0585q8, i16, c2549i3);
                    }
                    C0564b.blue(C2551k.delta, c0585q8, charlie4);
                    P.d dVar = (P.d) obj5;
                    if (dVar == null) {
                        c0585q8.purple(-1036847053);
                    } else {
                        c0585q8.purple(1213479310);
                        dVar.invoke(c0585q8, 0);
                    }
                    c0585q8.quebec(false);
                    ((P.d) obj4).invoke(c0585q8, 0);
                    c0585q8.quebec(true);
                } else {
                    c0585q8.ochre();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                U2.bravo((SnapshotStateList) obj5, (List) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                V2.bravo((R.e) obj5, (P.d) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 20:
                InterfaceC2380P interfaceC2380P = (InterfaceC2380P) obj;
                Q0.a aVar = (Q0.a) obj2;
                return ((ap) obj5).delta(interfaceC2380P, interfaceC2380P.pink(Unit.INSTANCE, new P.d(new P0.b(i4, (P.d) obj4, new C0552s(interfaceC2380P, aVar.alpha)), -431986394, true)), aVar.alpha);
            case 21:
                return ((androidx.compose.foundation.lazy.layout.y) obj4).alpha(new androidx.compose.foundation.lazy.layout.z((androidx.compose.foundation.lazy.layout.u) obj5, (InterfaceC2380P) obj), ((Q0.a) obj2).alpha);
            case 22:
                int intValue9 = ((Integer) obj).intValue();
                B9.r rVar2 = (B9.r) obj5;
                if (obj2 instanceof InterfaceC0578j) {
                    ((J.e) rVar2.foxtrot).bravo((InterfaceC0578j) obj2);
                } else {
                    j0 j0Var = (j0) obj4;
                    if (obj2 instanceof C0565b0) {
                        C0565b0 c0565b0 = (C0565b0) obj2;
                        if (!(c0565b0.alpha instanceof C0583o)) {
                            androidx.compose.runtime.r.foxtrot(j0Var, intValue9, obj2);
                            rVar2.echo(c0565b0);
                        }
                    } else if (obj2 instanceof Q) {
                        androidx.compose.runtime.r.foxtrot(j0Var, intValue9, obj2);
                        ((Q) obj2).delta();
                    }
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ((c.e) obj5).alpha((c.c) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                cc.g.alpha((AddressNoteListItem) obj5, (T.p) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 25:
                InterfaceC0581m interfaceC0581m9 = (InterfaceC0581m) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                C0585q c0585q9 = (C0585q) interfaceC0581m9;
                if (c0585q9.magenta(intValue10 & 1, z17)) {
                    T.s bravo6 = androidx.compose.foundation.a.bravo(V.echo(V.charlie(pVar, 1.0f), 520), C0366t.bravo, AbstractC2094g.bravo(16));
                    ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
                    long j10 = c0585q9.magenta;
                    int i17 = (int) (j10 ^ (j10 >>> 32));
                    I mike4 = c0585q9.mike();
                    T.s charlie5 = T.a.charlie(bravo6, c0585q9);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j3 = C2551k.bravo;
                    c0585q9.white();
                    if (c0585q9.lime) {
                        c0585q9.lima(c2550j3);
                    } else {
                        c0585q9.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q9, delta2);
                    C0564b.blue(C2551k.echo, c0585q9, mike4);
                    C2549i c2549i4 = C2551k.golf;
                    if (c0585q9.lime || !Intrinsics.areEqual(c0585q9.jade(), Integer.valueOf(i17))) {
                        ao.ad.blue(i17, c0585q9, i17, c2549i4);
                    }
                    C0564b.blue(C2551k.delta, c0585q9, charlie5);
                    p0 p0Var = (p0) obj4;
                    List list2 = (List) obj5;
                    N2.p.charlie((String) list2.get(p0Var.juliet()), null, V.charlie, C2391j.bravo, c0585q9, 1573296);
                    if (list2.size() > 1 && p0Var.juliet() > 0) {
                        c0585q9.purple(-801918340);
                        c0551q = c0551q2;
                        T.s whiskey = AbstractC0538d.whiskey(c0551q.alpha(pVar, T.d.silver), 12, 0.0f, 0.0f, 0.0f, 14);
                        boolean golf = c0585q9.golf(p0Var);
                        Object jade14 = c0585q9.jade();
                        if (golf || jade14 == obj3) {
                            jade14 = new cc.e(p0Var, 0);
                            c0585q9.f(jade14);
                        }
                        cc.g.delta((Function0) jade14, whiskey, c0585q9, R.drawable.ic_chevron_left, 6);
                    } else {
                        c0551q = c0551q2;
                        c0585q9.purple(-807292252);
                    }
                    c0585q9.quebec(false);
                    if (list2.size() > 1 && p0Var.juliet() < CollectionsKt.ivory(list2)) {
                        c0585q9.purple(-801535614);
                        T.s whiskey2 = AbstractC0538d.whiskey(c0551q.alpha(pVar, T.d.white), 0.0f, 0.0f, 12, 0.0f, 11);
                        boolean golf2 = c0585q9.golf(p0Var);
                        Object jade15 = c0585q9.jade();
                        if (golf2 || jade15 == obj3) {
                            jade15 = new cc.e(p0Var, 1);
                            c0585q9.f(jade15);
                        }
                        cc.g.delta((Function0) jade15, whiskey2, c0585q9, R.drawable.chevron_right, 6);
                    } else {
                        c0585q9.purple(-807292252);
                    }
                    c0585q9.quebec(false);
                    c0585q9.quebec(true);
                } else {
                    c0585q9.ochre();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                db.q.bravo((String) obj5, (Function1) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 27:
                a6 = AddressEditActivity.a((AddressEditActivity) obj5, (AddressEditState) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return a6;
            case 28:
                ((Integer) obj2).getClass();
                S4.alpha((TagDto) obj5, (T.p) obj4, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            default:
                ScreenHeaderView$lambda$4 = ScreenHeaderViewKt.ScreenHeaderView$lambda$4((TextLabelViewStyle) obj5, (TextLabelState) obj4, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return ScreenHeaderView$lambda$4;
        }
    }

    public /* synthetic */ a(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.red = obj;
        this.purple = obj2;
    }
}
