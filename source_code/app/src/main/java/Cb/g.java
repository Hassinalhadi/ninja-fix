package Cb;

import D0.an;
import Ec.aw;
import Ec.ay;
import F.AbstractC0141o0;
import F.C0103e2;
import F.G2;
import F.K1;
import F.O;
import F.Q;
import F.S2;
import F.T2;
import F.ak;
import F.al;
import a0.C0366t;
import a0.ao;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.InterfaceC0550p;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.p0;
import com.app.network.network.models.ReasonItem;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.dialog.InfoDialogViewKt;
import com.checkout.components.ui.country.CountryPickerBottomSheetScreenKt;
import com.checkout.components.ui.country.CountryPickerViewModel;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.picker.PickerBottomSheetScreenKt;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import i.C1874w;
import i.InterfaceC1854c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2616b5;
import s6.AbstractC2636d7;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;
import wb.AbstractC3253e;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ g(CountryPickerViewModel countryPickerViewModel, Country country, CountryPickerType countryPickerType, Function1 function1, ax axVar) {
        this.alpha = 5;
        this.purple = countryPickerViewModel;
        this.teal = country;
        this.white = countryPickerType;
        this.silver = function1;
        this.red = axVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0124, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r12.jade(), java.lang.Integer.valueOf(r10)) == false) goto L26;
     */
    @Override // Xd.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        C2550j c2550j;
        Object obj4;
        boolean z10;
        boolean z11;
        long j5;
        long j6;
        float f5;
        long j7;
        int i4;
        boolean z12;
        boolean z13;
        Object obj5;
        boolean z14;
        boolean z15;
        boolean z16;
        long j10;
        long j11;
        boolean z17;
        float f10;
        long j12;
        int i5;
        Unit InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$2$lambda$1;
        Unit CountryPickerBottomSheetScreen$lambda$8;
        Unit PickerBottomSheetScreen_cf5BqRc$lambda$3;
        as asVar = C0580l.alpha;
        int i10 = 2;
        T.p pVar = T.p.alpha;
        Object obj6 = this.white;
        Object obj7 = this.teal;
        Object obj8 = this.silver;
        Object obj9 = this.red;
        Object obj10 = this.purple;
        switch (this.alpha) {
            case 0:
                L paddingValues = (L) obj;
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
                int intValue = ((Integer) obj3).intValue();
                Intrinsics.echo(paddingValues, "paddingValues");
                if ((intValue & 6) == 0) {
                    if (((C0585q) interfaceC0581m).golf(paddingValues)) {
                        i10 = 4;
                    }
                    intValue |= i10;
                }
                if ((intValue & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    FillElement fillElement = V.charlie;
                    T.s romeo = AbstractC0538d.romeo(fillElement, paddingValues);
                    C0537c c0537c = AbstractC0542h.charlie;
                    T.i iVar = T.d.f2062f;
                    C0554u alpha = AbstractC0553t.alpha(c0537c, iVar, c0585q, 0);
                    long j13 = c0585q.magenta;
                    int i11 = (int) (j13 ^ (j13 >>> 32));
                    I mike = c0585q.mike();
                    T.s charlie = T.a.charlie(romeo, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j2 = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j2);
                    } else {
                        c0585q.i();
                    }
                    C2549i c2549i = C2551k.foxtrot;
                    C0564b.blue(c2549i, c0585q, alpha);
                    C2549i c2549i2 = C2551k.echo;
                    C0564b.blue(c2549i2, c0585q, mike);
                    C2549i c2549i3 = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                        ao.ad.blue(i11, c0585q, i11, c2549i3);
                    }
                    C2549i c2549i4 = C2551k.delta;
                    C0564b.blue(c2549i4, c0585q, charlie);
                    ax axVar = (ax) obj9;
                    String str = (String) axVar.getValue();
                    String bravo = AbstractC3086y3.bravo(c0585q, R.string.showcase_search_placeholder);
                    T.s charlie2 = V.charlie(pVar, 1.0f);
                    float f11 = Db.d.bravo;
                    float f12 = Db.f.charlie;
                    T.s tango = AbstractC0538d.tango(charlie2, f11, f12);
                    Object jade = c0585q.jade();
                    if (jade == asVar) {
                        c2550j = c2550j2;
                        i iVar2 = new i(axVar, 0);
                        c0585q.f(iVar2);
                        obj4 = iVar2;
                    } else {
                        c2550j = c2550j2;
                        obj4 = jade;
                    }
                    Function1 function1 = (Function1) obj4;
                    C2550j c2550j3 = c2550j;
                    AbstractC3253e.juliet(str, function1, tango, bravo, null, c0585q, 48, 16);
                    ax axVar2 = (ax) obj8;
                    b bVar = (b) axVar2.getValue();
                    Object jade2 = c0585q.jade();
                    Object obj11 = jade2;
                    if (jade2 == asVar) {
                        i iVar3 = new i(axVar2, 1);
                        c0585q.f(iVar3);
                        obj11 = iVar3;
                    }
                    z.echo((List) obj10, bVar, (Function1) obj11, AbstractC0538d.tango(V.charlie(pVar, 1.0f), f11, Db.f.bravo), c0585q, 384);
                    Map map = (Map) obj7;
                    if (map.isEmpty()) {
                        c0585q.purple(-844622567);
                        T.s sierra = AbstractC0538d.sierra(fillElement, f11);
                        C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.echo, iVar, c0585q, 6);
                        long j14 = c0585q.magenta;
                        int i12 = (int) (j14 ^ (j14 >>> 32));
                        I mike2 = c0585q.mike();
                        T.s charlie3 = T.a.charlie(sierra, c0585q);
                        c0585q.white();
                        if (c0585q.lime) {
                            c0585q.lima(c2550j3);
                        } else {
                            c0585q.i();
                        }
                        C0564b.blue(c2549i, c0585q, alpha2);
                        C0564b.blue(c2549i2, c0585q, mike2);
                        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                            ao.ad.blue(i12, c0585q, i12, c2549i3);
                        }
                        C0564b.blue(c2549i4, c0585q, charlie3);
                        G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.showcase_no_components_found), null, ((O) c0585q.kilo(Q.alpha)).sierra, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((S2) c0585q.kilo(T2.alpha)).juliet, c0585q, 0, 0, 65530);
                        c0585q.quebec(true);
                        c0585q.quebec(false);
                    } else {
                        c0585q.purple(-844048106);
                        M m4 = new M(f11, f12, f11, f12);
                        C0540f golf = AbstractC0542h.golf(f12);
                        boolean india = c0585q.india(map);
                        Object jade3 = c0585q.jade();
                        Object obj12 = jade3;
                        if (india || jade3 == asVar) {
                            Aa.l lVar = new Aa.l(1, map);
                            c0585q.f(lVar);
                            obj12 = lVar;
                        }
                        AbstractC2616b5.alpha(fillElement, (C1874w) obj6, m4, golf, null, null, false, null, (Function1) obj12, c0585q, 6, 488);
                        c0585q.quebec(false);
                    }
                    c0585q.quebec(true);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0555v ModalBottomSheet = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Intrinsics.echo(ModalBottomSheet, "$this$ModalBottomSheet");
                if ((intValue2 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    float f13 = 20;
                    T.s whiskey = AbstractC0538d.whiskey(AbstractC0538d.uniform(V.charlie(pVar, 1.0f), f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, 32, 7);
                    C0537c c0537c2 = AbstractC0542h.charlie;
                    T.i iVar4 = T.d.f2062f;
                    C0554u alpha3 = AbstractC0553t.alpha(c0537c2, iVar4, c0585q2, 0);
                    long j15 = c0585q2.magenta;
                    int i13 = (int) (j15 ^ (j15 >>> 32));
                    I mike3 = c0585q2.mike();
                    T.s charlie4 = T.a.charlie(whiskey, c0585q2);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j4 = C2551k.bravo;
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j4);
                    } else {
                        c0585q2.i();
                    }
                    C2549i c2549i5 = C2551k.foxtrot;
                    C0564b.blue(c2549i5, c0585q2, alpha3);
                    C2549i c2549i6 = C2551k.echo;
                    C0564b.blue(c2549i6, c0585q2, mike3);
                    C2549i c2549i7 = C2551k.golf;
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i13))) {
                        ao.ad.blue(i13, c0585q2, i13, c2549i7);
                    }
                    C2549i c2549i8 = C2551k.delta;
                    C0564b.blue(c2549i8, c0585q2, charlie4);
                    T.s charlie5 = V.charlie(pVar, 1.0f);
                    C0554u alpha4 = AbstractC0553t.alpha(c0537c2, T.d.f2063g, c0585q2, 48);
                    long j16 = c0585q2.magenta;
                    int i14 = (int) (j16 ^ (j16 >>> 32));
                    I mike4 = c0585q2.mike();
                    T.s charlie6 = T.a.charlie(charlie5, c0585q2);
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j4);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(c2549i5, c0585q2, alpha4);
                    C0564b.blue(c2549i6, c0585q2, mike4);
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i14))) {
                        ao.ad.blue(i14, c0585q2, i14, c2549i7);
                    }
                    C0564b.blue(c2549i8, c0585q2, charlie6);
                    float f14 = 48;
                    T.s bravo2 = androidx.compose.foundation.a.bravo(V.kilo(pVar, f14), Ec.w.bravo, AbstractC2094g.alpha);
                    ap delta = AbstractC0547m.delta(T.d.teal, false);
                    long j17 = c0585q2.magenta;
                    int i15 = (int) (j17 ^ (j17 >>> 32));
                    I mike5 = c0585q2.mike();
                    T.s charlie7 = T.a.charlie(bravo2, c0585q2);
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j4);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(c2549i5, c0585q2, delta);
                    C0564b.blue(c2549i6, c0585q2, mike5);
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i15))) {
                        ao.ad.blue(i15, c0585q2, i15, c2549i7);
                    }
                    C0564b.blue(c2549i8, c0585q2, charlie7);
                    AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_logout_icon, c0585q2, 6), null, V.kilo(pVar, 22), Ec.w.alpha, c0585q2, 3504, 0);
                    c0585q2.quebec(true);
                    float f15 = 12;
                    String juliet = com.google.android.material.datepicker.j.juliet(pVar, f15, c0585q2, R.string.leave_shift, c0585q2);
                    long charlie8 = AbstractC2636d7.charlie(18);
                    H0.n nVar = ay.tango;
                    G2.bravo(juliet, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ay.echo, charlie8, new H0.v(700), null, nVar, 0L, 3, 0L, 0, 16744408), c0585q2, 0, 0, 65534);
                    G2.bravo(com.google.android.material.datepicker.j.juliet(pVar, 4, c0585q2, R.string.select_reason, c0585q2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ay.foxtrot, AbstractC2636d7.charlie(14), new H0.v(HttpConstants.HTTP_BLOCKED), null, nVar, 0L, 3, 0L, 0, 16744408), c0585q2, 0, 0, 65534);
                    c0585q2.quebec(true);
                    AbstractC0538d.echo(V.echo(pVar, f13), c0585q2);
                    float f16 = 8;
                    C0554u alpha5 = AbstractC0553t.alpha(AbstractC0542h.golf(f16), iVar4, c0585q2, 6);
                    long j18 = c0585q2.magenta;
                    int i16 = (int) (j18 ^ (j18 >>> 32));
                    I mike6 = c0585q2.mike();
                    T.s charlie9 = T.a.charlie(pVar, c0585q2);
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j4);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(c2549i5, c0585q2, alpha5);
                    C0564b.blue(c2549i6, c0585q2, mike6);
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i16))) {
                        ao.ad.blue(i16, c0585q2, i16, c2549i7);
                    }
                    C0564b.blue(c2549i8, c0585q2, charlie9);
                    c0585q2.purple(-1021841835);
                    Iterator it = ((List) obj10).iterator();
                    while (true) {
                        ax axVar3 = (ax) obj9;
                        ax axVar4 = (ax) obj8;
                        if (it.hasNext()) {
                            ReasonItem reasonItem = (ReasonItem) it.next();
                            boolean areEqual = Intrinsics.areEqual((ReasonItem) axVar3.getValue(), reasonItem);
                            long j19 = Ec.w.delta;
                            if (areEqual) {
                                j5 = ay.echo;
                            } else if (((Boolean) axVar4.getValue()).booleanValue() && ((ReasonItem) axVar3.getValue()) == null) {
                                j5 = Ec.w.alpha;
                            } else {
                                j5 = j19;
                            }
                            if (areEqual) {
                                j6 = Ec.w.charlie;
                            } else {
                                j6 = C0366t.echo;
                            }
                            Iterator it2 = it;
                            T.s alpha6 = AbstractC3087z.alpha(androidx.compose.foundation.a.bravo(R3.charlie(V.charlie(pVar, 1.0f), 1, j5, AbstractC2094g.bravo(f15)), j6, AbstractC2094g.bravo(f15)), AbstractC2094g.bravo(f15));
                            boolean india2 = c0585q2.india(reasonItem);
                            Object jade4 = c0585q2.jade();
                            Object obj13 = jade4;
                            if (india2 || jade4 == asVar) {
                                Ac.l lVar2 = new Ac.l((Object) reasonItem, axVar3, axVar4, 3);
                                c0585q2.f(lVar2);
                                obj13 = lVar2;
                            }
                            T.s tango2 = AbstractC0538d.tango(androidx.compose.foundation.a.echo(15, alpha6, null, (Function0) obj13, false), 16, 14);
                            S alpha7 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f15), T.d.f2061d, c0585q2, 54);
                            long j20 = c0585q2.magenta;
                            int i17 = (int) (j20 ^ (j20 >>> 32));
                            I mike7 = c0585q2.mike();
                            T.s charlie10 = T.a.charlie(tango2, c0585q2);
                            InterfaceC2552l.maroon.getClass();
                            C2550j c2550j5 = C2551k.bravo;
                            c0585q2.white();
                            if (c0585q2.lime) {
                                c0585q2.lima(c2550j5);
                            } else {
                                c0585q2.i();
                            }
                            C0564b.blue(C2551k.foxtrot, c0585q2, alpha7);
                            C0564b.blue(C2551k.echo, c0585q2, mike7);
                            C2549i c2549i9 = C2551k.golf;
                            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i17))) {
                                ao.ad.blue(i17, c0585q2, i17, c2549i9);
                            }
                            C0564b.blue(C2551k.delta, c0585q2, charlie10);
                            T.s kilo = V.kilo(pVar, f13);
                            if (areEqual) {
                                f5 = 6;
                            } else {
                                f5 = 2;
                            }
                            if (areEqual) {
                                j7 = ay.echo;
                            } else {
                                j7 = j19;
                            }
                            C2093f c2093f = AbstractC2094g.alpha;
                            AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(R3.charlie(kilo, f5, j7, c2093f), C0366t.echo, c2093f), c0585q2, 0);
                            String value = reasonItem.getValue();
                            long charlie11 = AbstractC2636d7.charlie(14);
                            H0.n nVar2 = ay.tango;
                            if (areEqual) {
                                i4 = 700;
                            } else {
                                i4 = HttpConstants.HTTP_BLOCKED;
                            }
                            G2.bravo(value, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ay.echo, charlie11, new H0.v(i4), null, nVar2, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
                            c0585q2.quebec(true);
                            it = it2;
                        } else {
                            c0585q2.quebec(false);
                            c0585q2.quebec(true);
                            if (((Boolean) axVar4.getValue()).booleanValue() && ((ReasonItem) axVar3.getValue()) == null) {
                                c0585q2.purple(1239347449);
                                AbstractC0538d.echo(V.echo(pVar, f16), c0585q2);
                                G2.bravo(AbstractC3086y3.bravo(c0585q2, R.string.please_select_reason), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(Ec.w.alpha, AbstractC2636d7.charlie(12), new H0.v(HttpConstants.HTTP_BLOCKED), null, ay.tango, 0L, 0, 0L, 0, 16777176), c0585q2, 0, 0, 65534);
                                z11 = false;
                            } else {
                                z11 = false;
                                c0585q2.purple(1232223370);
                            }
                            c0585q2.quebec(z11);
                            AbstractC0538d.echo(V.echo(pVar, 24), c0585q2);
                            Function1 function12 = (Function1) obj7;
                            boolean golf2 = c0585q2.golf(function12);
                            Object jade5 = c0585q2.jade();
                            Object obj14 = jade5;
                            if (golf2 || jade5 == asVar) {
                                Ac.l lVar3 = new Ac.l((Object) function12, axVar3, axVar4, 4);
                                c0585q2.f(lVar3);
                                obj14 = lVar3;
                            }
                            T.s echo = V.echo(V.charlie(pVar, 1.0f), 52);
                            C2093f bravo3 = AbstractC2094g.bravo(f15);
                            M m5 = al.alpha;
                            K1.bravo((Function0) obj14, echo, false, bravo3, al.alpha(Ec.w.alpha, C0366t.echo, 0L, 0L, c0585q2, 12), null, null, null, Ec.t.hotel, c0585q2, 805306416, 484);
                            K1.juliet((Function0) obj6, V.echo(com.google.android.material.datepicker.j.hotel(pVar, f16, c0585q2, pVar, 1.0f), f14), false, AbstractC2094g.bravo(f15), null, null, Ec.t.india, c0585q2, 805306416, HttpConstants.HTTP_INTERNAL_ERROR);
                            c0585q2.quebec(true);
                        }
                    }
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC0550p PullToRefreshBox = (InterfaceC0550p) obj;
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                Intrinsics.echo(PullToRefreshBox, "$this$PullToRefreshBox");
                if ((intValue3 & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z12)) {
                    Ec.t.alpha((Dc.e) obj10, (Xd.l) obj7, (Function1) obj6, (Function1) obj9, (Function0) obj8, c0585q3, 0);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC0555v ModalBottomSheet2 = (InterfaceC0555v) obj;
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                Intrinsics.echo(ModalBottomSheet2, "$this$ModalBottomSheet");
                if ((intValue4 & 17) != 16) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z13)) {
                    float f17 = 20;
                    T.s whiskey2 = AbstractC0538d.whiskey(AbstractC0538d.uniform(V.charlie(pVar, 1.0f), f17, 0.0f, 2), 0.0f, 0.0f, 0.0f, 32, 7);
                    C0537c c0537c3 = AbstractC0542h.charlie;
                    T.i iVar5 = T.d.f2062f;
                    C0554u alpha8 = AbstractC0553t.alpha(c0537c3, iVar5, c0585q4, 0);
                    long j21 = c0585q4.magenta;
                    int i18 = (int) (j21 ^ (j21 >>> 32));
                    I mike8 = c0585q4.mike();
                    T.s charlie12 = T.a.charlie(whiskey2, c0585q4);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j6 = C2551k.bravo;
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j6);
                    } else {
                        c0585q4.i();
                    }
                    C2549i c2549i10 = C2551k.foxtrot;
                    C0564b.blue(c2549i10, c0585q4, alpha8);
                    C2549i c2549i11 = C2551k.echo;
                    C0564b.blue(c2549i11, c0585q4, mike8);
                    C2549i c2549i12 = C2551k.golf;
                    if (!c0585q4.lime) {
                        obj5 = obj10;
                        break;
                    } else {
                        obj5 = obj10;
                    }
                    ao.ad.blue(i18, c0585q4, i18, c2549i12);
                    C2549i c2549i13 = C2551k.delta;
                    C0564b.blue(c2549i13, c0585q4, charlie12);
                    T.s charlie13 = V.charlie(pVar, 1.0f);
                    C0554u alpha9 = AbstractC0553t.alpha(c0537c3, T.d.f2063g, c0585q4, 48);
                    long j22 = c0585q4.magenta;
                    int i19 = (int) (j22 ^ (j22 >>> 32));
                    I mike9 = c0585q4.mike();
                    T.s charlie14 = T.a.charlie(charlie13, c0585q4);
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j6);
                    } else {
                        c0585q4.i();
                    }
                    C0564b.blue(c2549i10, c0585q4, alpha9);
                    C0564b.blue(c2549i11, c0585q4, mike9);
                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i19))) {
                        ao.ad.blue(i19, c0585q4, i19, c2549i12);
                    }
                    C0564b.blue(c2549i13, c0585q4, charlie14);
                    float f18 = 48;
                    T.s bravo4 = androidx.compose.foundation.a.bravo(V.kilo(pVar, f18), Ec.ax.bravo, AbstractC2094g.alpha);
                    ap delta2 = AbstractC0547m.delta(T.d.teal, false);
                    long j23 = c0585q4.magenta;
                    int i20 = (int) (j23 ^ (j23 >>> 32));
                    I mike10 = c0585q4.mike();
                    T.s charlie15 = T.a.charlie(bravo4, c0585q4);
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j6);
                    } else {
                        c0585q4.i();
                    }
                    C0564b.blue(c2549i10, c0585q4, delta2);
                    C0564b.blue(c2549i11, c0585q4, mike10);
                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i20))) {
                        ao.ad.blue(i20, c0585q4, i20, c2549i12);
                    }
                    C0564b.blue(c2549i13, c0585q4, charlie15);
                    AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_clock_icon, c0585q4, 6), null, V.kilo(pVar, 22), Ec.ax.alpha, c0585q4, 3504, 0);
                    c0585q4.quebec(true);
                    float f19 = 12;
                    String juliet2 = com.google.android.material.datepicker.j.juliet(pVar, f19, c0585q4, R.string.take_a_break_title, c0585q4);
                    long charlie16 = AbstractC2636d7.charlie(18);
                    H0.n nVar3 = ay.tango;
                    G2.bravo(juliet2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ay.echo, charlie16, new H0.v(700), null, nVar3, 0L, 3, 0L, 0, 16744408), c0585q4, 0, 0, 65534);
                    G2.bravo(com.google.android.material.datepicker.j.juliet(pVar, 4, c0585q4, R.string.take_a_break_subtitle, c0585q4), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ay.foxtrot, AbstractC2636d7.charlie(14), new H0.v(HttpConstants.HTTP_BLOCKED), null, nVar3, 0L, 3, 0L, 0, 16744408), c0585q4, 0, 0, 65534);
                    c0585q4.quebec(true);
                    AbstractC0538d.echo(V.echo(pVar, f17), c0585q4);
                    float f20 = 8;
                    C0554u alpha10 = AbstractC0553t.alpha(AbstractC0542h.golf(f20), iVar5, c0585q4, 6);
                    long j24 = c0585q4.magenta;
                    int i21 = (int) (j24 ^ (j24 >>> 32));
                    I mike11 = c0585q4.mike();
                    T.s charlie17 = T.a.charlie(pVar, c0585q4);
                    c0585q4.white();
                    if (c0585q4.lime) {
                        c0585q4.lima(c2550j6);
                    } else {
                        c0585q4.i();
                    }
                    C0564b.blue(c2549i10, c0585q4, alpha10);
                    C0564b.blue(c2549i11, c0585q4, mike11);
                    if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i21))) {
                        ao.ad.blue(i21, c0585q4, i21, c2549i12);
                    }
                    C0564b.blue(c2549i13, c0585q4, charlie17);
                    c0585q4.purple(-1876471495);
                    Iterator it3 = ((List) obj5).iterator();
                    while (true) {
                        p0 p0Var = (p0) obj8;
                        if (it3.hasNext()) {
                            int intValue5 = ((Number) it3.next()).intValue();
                            if (p0Var.juliet() == intValue5) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            String quantityString = ((Context) obj9).getResources().getQuantityString(R.plurals.number_of_minutes, intValue5, Integer.valueOf(intValue5));
                            Intrinsics.delta(quantityString, "getQuantityString(...)");
                            long j25 = Ec.ax.delta;
                            if (z15) {
                                z16 = z15;
                                j10 = ay.echo;
                            } else {
                                z16 = z15;
                                j10 = j25;
                            }
                            if (z16) {
                                j11 = Ec.ax.charlie;
                            } else {
                                j11 = C0366t.echo;
                            }
                            Iterator it4 = it3;
                            boolean z18 = z16;
                            T.s alpha11 = AbstractC3087z.alpha(androidx.compose.foundation.a.bravo(R3.charlie(V.charlie(pVar, 1.0f), 1, j10, AbstractC2094g.bravo(f19)), j11, AbstractC2094g.bravo(f19)), AbstractC2094g.bravo(f19));
                            boolean echo2 = c0585q4.echo(intValue5);
                            Object jade6 = c0585q4.jade();
                            if (!echo2 && jade6 != asVar) {
                                z17 = false;
                            } else {
                                z17 = false;
                                jade6 = new aw(intValue5, (Object) p0Var, (int) (false ? 1 : 0));
                                c0585q4.f(jade6);
                            }
                            T.s tango3 = AbstractC0538d.tango(androidx.compose.foundation.a.echo(15, alpha11, null, (Function0) jade6, z17), 16, 14);
                            S alpha12 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f19), T.d.f2061d, c0585q4, 54);
                            long j26 = c0585q4.magenta;
                            int i22 = (int) (j26 ^ (j26 >>> 32));
                            I mike12 = c0585q4.mike();
                            T.s charlie18 = T.a.charlie(tango3, c0585q4);
                            InterfaceC2552l.maroon.getClass();
                            C2550j c2550j7 = C2551k.bravo;
                            c0585q4.white();
                            if (c0585q4.lime) {
                                c0585q4.lima(c2550j7);
                            } else {
                                c0585q4.i();
                            }
                            C0564b.blue(C2551k.foxtrot, c0585q4, alpha12);
                            C0564b.blue(C2551k.echo, c0585q4, mike12);
                            C2549i c2549i14 = C2551k.golf;
                            if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(i22))) {
                                ao.ad.blue(i22, c0585q4, i22, c2549i14);
                            }
                            C0564b.blue(C2551k.delta, c0585q4, charlie18);
                            T.s kilo2 = V.kilo(pVar, f17);
                            if (z18) {
                                f10 = 6;
                            } else {
                                f10 = 2;
                            }
                            if (z18) {
                                j12 = ay.echo;
                            } else {
                                j12 = j25;
                            }
                            C2093f c2093f2 = AbstractC2094g.alpha;
                            AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(R3.charlie(kilo2, f10, j12, c2093f2), C0366t.echo, c2093f2), c0585q4, 0);
                            long charlie19 = AbstractC2636d7.charlie(14);
                            H0.n nVar4 = ay.tango;
                            if (z18) {
                                i5 = 700;
                            } else {
                                i5 = HttpConstants.HTTP_BLOCKED;
                            }
                            G2.bravo(quantityString, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ay.echo, charlie19, new H0.v(i5), null, nVar4, 0L, 0, 0L, 0, 16777176), c0585q4, 0, 0, 65534);
                            c0585q4.quebec(true);
                            it3 = it4;
                        } else {
                            c0585q4.quebec(false);
                            c0585q4.quebec(true);
                            AbstractC0538d.echo(V.echo(pVar, 24), c0585q4);
                            if (p0Var.juliet() > 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            T.s echo3 = V.echo(V.charlie(pVar, 1.0f), 52);
                            C2093f bravo5 = AbstractC2094g.bravo(f19);
                            M m8 = al.alpha;
                            long j27 = ay.echo;
                            long j28 = C0366t.echo;
                            ak alpha13 = al.alpha(j27, j28, ao.delta(4292138200L), j28, c0585q4, 0);
                            Function1 function13 = (Function1) obj7;
                            boolean golf3 = c0585q4.golf(function13);
                            Object jade7 = c0585q4.jade();
                            if (golf3 || jade7 == asVar) {
                                jade7 = new Ac.g(5, function13, p0Var);
                                c0585q4.f(jade7);
                            }
                            K1.bravo((Function0) jade7, echo3, z14, bravo5, alpha13, null, null, null, Ec.t.lima, c0585q4, 805306416, 480);
                            K1.juliet((Function0) obj6, V.echo(com.google.android.material.datepicker.j.hotel(pVar, f20, c0585q4, pVar, 1.0f), f18), false, AbstractC2094g.bravo(f19), null, null, Ec.t.mike, c0585q4, 805306416, HttpConstants.HTTP_INTERNAL_ERROR);
                            c0585q4.quebec(true);
                        }
                    }
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 4:
                InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$2$lambda$1 = InfoDialogViewKt.InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$2$lambda$1((DesignTokens) obj10, (Wf.e) obj7, (ResourceProvider) obj6, (Wf.ad) obj9, (Wf.ad) obj8, (InterfaceC1854c) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
                return InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$2$lambda$1;
            case 5:
                CountryPickerBottomSheetScreen$lambda$8 = CountryPickerBottomSheetScreenKt.CountryPickerBottomSheetScreen$lambda$8((CountryPickerViewModel) obj10, (Country) obj7, (CountryPickerType) obj6, (Function1) obj8, (ax) obj9, (Function0) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
                return CountryPickerBottomSheetScreen$lambda$8;
            default:
                PickerBottomSheetScreen_cf5BqRc$lambda$3 = PickerBottomSheetScreenKt.PickerBottomSheetScreen_cf5BqRc$lambda$3((Xd.m) obj10, (vf.ab) obj7, (C0103e2) obj6, (Y1.r) obj9, (Function0) obj8, (InterfaceC0555v) obj, (InterfaceC0581m) obj2, ((Integer) obj3).intValue());
                return PickerBottomSheetScreen_cf5BqRc$lambda$3;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.teal = obj2;
        this.white = obj3;
        this.red = obj4;
        this.silver = obj5;
    }

    public /* synthetic */ g(Function1 function1, Function0 function0, List list, Object obj, ax axVar, int i4) {
        this.alpha = i4;
        this.teal = function1;
        this.white = function0;
        this.purple = list;
        this.red = obj;
        this.silver = axVar;
    }
}
