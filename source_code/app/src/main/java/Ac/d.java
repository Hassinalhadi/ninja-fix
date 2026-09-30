package Ac;

import Cb.ac;
import F.AbstractC0127k2;
import F.AbstractC0141o0;
import F.AbstractC0148q;
import F.G2;
import F.K1;
import F.al;
import H0.v;
import Y1.ag;
import a0.C0366t;
import android.content.Context;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import ao.ad;
import b.ab;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.Shift;
import com.app.network.network.models.StartingPoint;
import com.app.network.network.models.Zone;
import com.checkout.address.model.State;
import com.checkout.address.ui.state.StatePickerViewModel;
import com.checkout.components.address.U;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.rememberme.AbstractC0942g;
import com.checkout.components.rememberme.R0;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.webview.BottomSheetWebViewState;
import com.checkout.components.ui.country.CountryPickerContentViewKt;
import com.checkout.components.ui.country.CountryPickerViewModel;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.model.CountryPickerViewState;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.view.ScreenHeaderViewKt;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.captainsuniforms.viewmodel.CaptainsUniformsViewModel;
import f0.AbstractC1680b;
import g0.C1726f;
import i.C1874w;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t6.AbstractC3076w3;
import t6.AbstractC3081x3;
import t6.AbstractC3086y3;
import t6.S3;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        String str;
        boolean z10;
        boolean z11;
        float f5;
        int i4;
        Unit CountryPickerContentView$lambda$4;
        boolean z12;
        Unit ScreenHeaderView$lambda$10;
        switch (this.alpha) {
            case 0:
                InterfaceC0555v Card = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(Card, "$this$Card");
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    T.p pVar = T.p.alpha;
                    C0537c c0537c = AbstractC0542h.charlie;
                    T.i iVar = T.d.f2062f;
                    C0554u alpha = AbstractC0553t.alpha(c0537c, iVar, c0585q, 0);
                    long j5 = c0585q.magenta;
                    int i5 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q.mike();
                    T.s charlie = T.a.charlie(pVar, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C2549i c2549i = C2551k.foxtrot;
                    C0564b.blue(c2549i, c0585q, alpha);
                    C2549i c2549i2 = C2551k.echo;
                    C0564b.blue(c2549i2, c0585q, mike);
                    C2549i c2549i3 = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                        ad.blue(i5, c0585q, i5, c2549i3);
                    }
                    C2549i c2549i4 = C2551k.delta;
                    C0564b.blue(c2549i4, c0585q, charlie);
                    float f10 = 16;
                    T.s whiskey = AbstractC0538d.whiskey(pVar, f10, f10, f10, 0.0f, 8);
                    float f11 = 12;
                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f11), iVar, c0585q, 6);
                    long j6 = c0585q.magenta;
                    int i10 = (int) (j6 ^ (j6 >>> 32));
                    I mike2 = c0585q.mike();
                    T.s charlie2 = T.a.charlie(whiskey, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i, c0585q, alpha2);
                    C0564b.blue(c2549i2, c0585q, mike2);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                        ad.blue(i10, c0585q, i10, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q, charlie2);
                    float f12 = 8;
                    C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.golf(f12), iVar, c0585q, 6);
                    long j7 = c0585q.magenta;
                    int i11 = (int) (j7 ^ (j7 >>> 32));
                    I mike3 = c0585q.mike();
                    T.s charlie3 = T.a.charlie(pVar, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i, c0585q, alpha3);
                    C0564b.blue(c2549i2, c0585q, mike3);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                        ad.blue(i11, c0585q, i11, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q, charlie3);
                    T.j jVar = T.d.f2061d;
                    S alpha4 = Q.alpha(AbstractC0542h.golf(f12), jVar, c0585q, 54);
                    long j10 = c0585q.magenta;
                    int i12 = (int) (j10 ^ (j10 >>> 32));
                    I mike4 = c0585q.mike();
                    T.s charlie4 = T.a.charlie(pVar, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i, c0585q, alpha4);
                    C0564b.blue(c2549i2, c0585q, mike4);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                        ad.blue(i12, c0585q, i12, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q, charlie4);
                    Shift shift = (Shift) this.purple;
                    Shift.Branch branch = shift.getBranch();
                    if (branch == null || (str = branch.getName()) == null) {
                        Zone zone = shift.getZone();
                        if (zone != null) {
                            str = zone.getName();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "-";
                        }
                    }
                    long charlie5 = AbstractC2636d7.charlie(16);
                    v vVar = v.f1409c;
                    long j11 = q.alpha;
                    G2.bravo(str, null, j11, charlie5, vVar, null, 0L, null, 0L, 2, false, 1, 0, null, null, c0585q, 200064, 3120, 120786);
                    u.alpha(shift.getStatus(), c0585q, 0);
                    c0585q.quebec(true);
                    T.s charlie6 = V.charlie(pVar, 1.0f);
                    S alpha5 = Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 48);
                    long j12 = c0585q.magenta;
                    int i13 = (int) (j12 ^ (j12 >>> 32));
                    I mike5 = c0585q.mike();
                    T.s charlie7 = T.a.charlie(charlie6, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i, c0585q, alpha5);
                    C0564b.blue(c2549i2, c0585q, mike5);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                        ad.blue(i13, c0585q, i13, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q, charlie7);
                    AbstractC1680b charlie8 = AbstractC3076w3.charlie(R.drawable.time_calender_new, c0585q, 6);
                    T.s kilo = V.kilo(pVar, f10);
                    long j13 = q.bravo;
                    AbstractC0141o0.alpha(charlie8, null, kilo, j13, c0585q, 3504, 0);
                    AbstractC0538d.echo(V.oscar(pVar, 4), c0585q);
                    String dayOfWeek = shift.getDayOfWeek();
                    if (dayOfWeek == null) {
                        dayOfWeek = "-";
                    }
                    G2.bravo(dayOfWeek, null, j13, AbstractC2636d7.charlie(12), vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 200064, 0, 131026);
                    AbstractC0538d.echo(P0.maroon(1.0f), c0585q);
                    float f13 = 2;
                    C0540f golf = AbstractC0542h.golf(f13);
                    T.s echo = androidx.compose.foundation.a.echo(15, pVar, null, (Function0) this.red, false);
                    S alpha6 = Q.alpha(golf, jVar, c0585q, 54);
                    long j14 = c0585q.magenta;
                    int i14 = (int) (j14 ^ (j14 >>> 32));
                    I mike6 = c0585q.mike();
                    T.s charlie9 = T.a.charlie(echo, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i, c0585q, alpha6);
                    C0564b.blue(c2549i2, c0585q, mike6);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i14))) {
                        ad.blue(i14, c0585q, i14, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q, charlie9);
                    G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.shift_rules), null, j11, AbstractC2636d7.charlie(12), v.f1407a, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 200064, 0, 131026);
                    AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_baseline_info_24, c0585q, 6), null, V.kilo(pVar, 14), j11, c0585q, 3504, 0);
                    c0585q.quebec(true);
                    c0585q.quebec(true);
                    c0585q.quebec(true);
                    C2093f bravo = AbstractC2094g.bravo(f11);
                    float f14 = 1;
                    ab alpha7 = S3.alpha(f14, q.delta);
                    long j15 = C0366t.echo;
                    AbstractC0127k2.alpha(V.charlie(pVar, 1.0f), bravo, j15, 0L, 0.0f, 0.0f, alpha7, P.e.echo(709662045, new k(1, shift), c0585q), c0585q, 14156166, 56);
                    c0585q.quebec(true);
                    AbstractC0538d.echo(V.echo(pVar, f10), c0585q);
                    T.s whiskey2 = AbstractC0538d.whiskey(V.charlie(pVar, 1.0f), f10, 0.0f, f10, f10, 2);
                    S alpha8 = Q.alpha(AbstractC0542h.golf(f10), T.d.f2060c, c0585q, 6);
                    long j16 = c0585q.magenta;
                    int i15 = (int) (j16 ^ (j16 >>> 32));
                    I mike7 = c0585q.mike();
                    T.s charlie10 = T.a.charlie(whiskey2, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i, c0585q, alpha8);
                    C0564b.blue(c2549i2, c0585q, mike7);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                        ad.blue(i15, c0585q, i15, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q, charlie10);
                    float f15 = 44;
                    K1.hotel((Function0) this.silver, V.golf(P0.maroon(1.0f), f15, 0.0f, 2), false, AbstractC2094g.bravo(f11), al.delta(j15, 0L, 0L, 0L, c0585q, 14), al.bravo(f13, 30), S3.alpha(f14, q.charlie), new M(f12, f11, f12, f11), b.alpha, c0585q, 819462144, 260);
                    K1.bravo((Function0) this.teal, V.golf(P0.maroon(1.0f), f15, 0.0f, 2), false, AbstractC2094g.bravo(f11), al.alpha(q.golf, 0L, 0L, 0L, c0585q, 14), null, null, new M(f12, f11, f12, f11), b.bravo, c0585q, 817889280, 356);
                    c0585q.quebec(true);
                    c0585q.quebec(true);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0555v DropdownMenu = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Intrinsics.echo(DropdownMenu, "$this$DropdownMenu");
                if ((intValue2 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    P.d echo2 = P.e.echo(-1598023087, new i((String) this.silver, 0), c0585q2);
                    Function1 function1 = (Function1) this.purple;
                    boolean golf2 = c0585q2.golf(function1);
                    Object jade = c0585q2.jade();
                    Object obj4 = C0580l.alpha;
                    ax axVar = (ax) this.teal;
                    if (golf2 || jade == obj4) {
                        jade = new j(0, axVar, function1);
                        c0585q2.f(jade);
                    }
                    AbstractC0148q.bravo(echo2, (Function0) jade, null, false, null, null, c0585q2, 6, 508);
                    Iterator it = ((ArrayList) this.red).iterator();
                    while (it.hasNext()) {
                        Object obj5 = (StartingPoint) it.next();
                        P.d echo3 = P.e.echo(-1709977622, new k(0, obj5), c0585q2);
                        boolean golf3 = c0585q2.golf(function1) | c0585q2.india(obj5);
                        Object jade2 = c0585q2.jade();
                        if (golf3 || jade2 == obj4) {
                            jade2 = new l(function1, obj5, axVar, 0);
                            c0585q2.f(jade2);
                        }
                        AbstractC0148q.bravo(echo3, (Function0) jade2, null, false, null, null, c0585q2, 6, 508);
                    }
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                C1874w listState = (C1874w) obj;
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                Intrinsics.echo(listState, "listState");
                if ((intValue3 & 6) == 0) {
                    if (((C0585q) interfaceC0581m3).golf(listState)) {
                        i4 = 4;
                    } else {
                        i4 = 2;
                    }
                    intValue3 |= i4;
                }
                if ((intValue3 & 19) != 18) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    Oa.f fVar = (Oa.f) ((ax) this.silver).getValue();
                    CaptainsUniformsViewModel captainsUniformsViewModel = (CaptainsUniformsViewModel) this.purple;
                    boolean india = c0585q3.india(captainsUniformsViewModel);
                    Object jade3 = c0585q3.jade();
                    if (india || jade3 == C0580l.alpha) {
                        jade3 = new Oa.a(captainsUniformsViewModel, 1);
                        c0585q3.f(jade3);
                    }
                    Function0 function0 = (Function0) jade3;
                    boolean booleanValue = ((Boolean) ((ax) this.teal).getValue()).booleanValue();
                    float bravo2 = AbstractC3081x3.bravo(c0585q3, R.dimen.spacing_16);
                    if (booleanValue) {
                        f5 = 60;
                    } else {
                        f5 = 0;
                    }
                    float bravo3 = AbstractC3081x3.bravo(c0585q3, R.dimen.spacing_16);
                    Qa.a.echo(fVar, listState, function0, (Function1) this.red, AbstractC0538d.delta(0.0f, bravo2 + f5, 0.0f, 52 + bravo3 + bravo3, 5), V.charlie(T.p.alpha, 1.0f), c0585q3, ((intValue3 << 3) & 112) | 196608);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                return R0.a((D0) this.purple, (CountryPickerViewModel) this.red, (ag) this.silver, (DiComponent) this.teal, (Y1.l) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            case 4:
                return AbstractC0942g.a((String) this.purple, (Function0) this.red, (BottomSheetWebViewState) this.silver, (Context) this.teal, (InterfaceC0555v) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            case 5:
                CountryPickerContentView$lambda$4 = CountryPickerContentViewKt.CountryPickerContentView$lambda$4((Country) this.purple, (CountryPickerType) this.red, (Function1) this.silver, (CountryPickerViewState) this.teal, (Country) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
                return CountryPickerContentView$lambda$4;
            case 6:
                InterfaceC0555v ModalBottomSheet = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                Intrinsics.echo(ModalBottomSheet, "$this$ModalBottomSheet");
                if ((intValue4 & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z12)) {
                    Xd.l lVar = (Xd.l) this.red;
                    boolean golf4 = c0585q4.golf(lVar);
                    OrderTask orderTask = (OrderTask) this.silver;
                    boolean india2 = golf4 | c0585q4.india(orderTask);
                    ax axVar2 = (ax) this.teal;
                    boolean golf5 = india2 | c0585q4.golf(axVar2);
                    Object jade4 = c0585q4.jade();
                    if (golf5 || jade4 == C0580l.alpha) {
                        jade4 = new ac(lVar, orderTask, axVar2, 16);
                        c0585q4.f(jade4);
                    }
                    db.q.alpha((String) this.purple, (Function1) jade4, V.charlie(T.p.alpha, 1.0f), c0585q4, 384);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 7:
                return U.a((StatePickerViewModel) this.purple, (State) this.red, (Function1) this.silver, (ax) this.teal, (Function0) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
            default:
                ScreenHeaderView$lambda$10 = ScreenHeaderViewKt.ScreenHeaderView$lambda$10((C1726f) this.purple, (Function0) this.red, (String) this.silver, (TopAppBarViewStyle) this.teal, (T) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
                return ScreenHeaderView$lambda$10;
        }
    }
}
