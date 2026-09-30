package com.checkout.components.rememberme;

import Ec.ar;
import Y1.ad;
import Y1.ag;
import Y1.at;
import Y1.au;
import a2.C0383h;
import a2.C0384i;
import a2.C0389n;
import a2.C0390o;
import a2.C0393r;
import android.os.Bundle;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.lifecycle.InterfaceC0651v;
import bx.InterfaceC0775m;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.country.CountryViewModelFactory;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.model.SaveCardScreen;
import com.checkout.components.rememberme.savecard.SaveCardViewState;
import com.checkout.components.rememberme.savecard.SaveCardViewStateRepository;
import com.checkout.components.rememberme.utils.KMPRememberMeClickHandler;
import com.checkout.components.ui.country.CountryPickerBottomSheetScreenKt;
import com.checkout.components.ui.country.CountryPickerViewModel;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.model.TextLabelViewItem;
import d2.AbstractC1579d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import s6.F7;
import t6.AbstractC2996g2;
import t6.W2;
import t6.Y2;

/* loaded from: classes3.dex */
public abstract class R0 {
    public static final Unit a(DiComponent diComponent, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(diComponent, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit b(ag agVar) {
        Y1.r.delta(agVar, SaveCardScreen.GetToKnowUsDialog.INSTANCE);
        return Unit.INSTANCE;
    }

    public static final Unit c(ag agVar) {
        Y1.r.delta(agVar, SaveCardScreen.CountryPicker.INSTANCE);
        return Unit.INSTANCE;
    }

    public static final void a(DiComponent di, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        C0585q c0585q;
        T1.c cVar;
        Intrinsics.echo(di, "di");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-919643225);
        if ((i4 & 6) == 0) {
            i5 = ((i4 & 8) == 0 ? c0585q2.golf(di) : c0585q2.india(di) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        boolean z2 = true;
        if (c0585q2.magenta(i5 & 1, (i5 & 3) != 2)) {
            ag bravo = W2.bravo(new at[0], c0585q2);
            String valueOf = String.valueOf(di.hashCode());
            CountryViewModelFactory countryViewModelFactory = new CountryViewModelFactory(di);
            androidx.lifecycle.d0 alpha = U1.a.alpha(c0585q2);
            if (alpha != null) {
                if (alpha instanceof InterfaceC0651v) {
                    cVar = ((InterfaceC0651v) alpha).getDefaultViewModelCreationExtras();
                } else {
                    cVar = T1.a.bravo;
                }
                CountryPickerViewModel countryPickerViewModel = (CountryPickerViewModel) F7.bravo(kotlin.jvm.internal.u.alpha.bravo(CountryPickerViewModel.class), alpha, valueOf, countryViewModelFactory, cVar, c0585q2);
                ax mike = C0564b.mike(di.saveCardViewStateRepository().getState(), c0585q2, 0);
                SaveCardScreen.SaveCard saveCard = SaveCardScreen.SaveCard.INSTANCE;
                if ((i5 & 14) != 4 && ((i5 & 8) == 0 || !c0585q2.india(di))) {
                    z2 = false;
                }
                boolean india = c0585q2.india(bravo) | z2 | c0585q2.golf(mike) | c0585q2.india(countryPickerViewModel);
                Object jade = c0585q2.jade();
                if (india || jade == C0580l.alpha) {
                    X9.e eVar = new X9.e(di, bravo, mike, countryPickerViewModel, 2);
                    c0585q2.f(eVar);
                    jade = eVar;
                }
                c0585q = c0585q2;
                Y2.bravo(bravo, saveCard, null, null, null, null, null, null, null, (Function1) jade, c0585q, 48);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ar(di, i4, 3);
        }
    }

    public static final Unit a(ag agVar, Y1.l backStackEntry, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(backStackEntry, "backStackEntry");
        Bundle alpha = backStackEntry.f2268a.alpha();
        if (alpha == null) {
            alpha = new Bundle();
        }
        Map india = backStackEntry.purple.india();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.y.quebec(india.size()));
        for (Map.Entry entry : india.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((Y1.k) entry.getValue()).alpha);
        }
        String url = ((SaveCardScreen.WebViewDialog) AbstractC1579d.bravo(SaveCardScreen.WebViewDialog.Companion.serializer(), alpha, linkedHashMap)).getUrl();
        C0585q c0585q = (C0585q) interfaceC0581m;
        boolean india2 = c0585q.india(agVar);
        Object jade = c0585q.jade();
        if (india2 || jade == C0580l.alpha) {
            jade = new a5.m(agVar, 2);
            c0585q.f(jade);
        }
        AbstractC0942g.a(url, (Function0) jade, null, c0585q, 0, 4);
        return Unit.INSTANCE;
    }

    public static final Unit a(DiComponent diComponent, ag agVar, androidx.compose.runtime.D0 d02, CountryPickerViewModel countryPickerViewModel, ad NavHost) {
        Intrinsics.echo(NavHost, "$this$NavHost");
        P.d dVar = new P.d(new a5.j(0, diComponent, agVar), -826623482, true);
        List emptyList = CollectionsKt.emptyList();
        au auVar = NavHost.golf;
        auVar.getClass();
        C0384i c0384i = new C0384i((C0383h) auVar.bravo(AbstractC2996g2.bravo(C0383h.class)), kotlin.jvm.internal.u.alpha.bravo(SaveCardScreen.SaveCard.class), dVar);
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            c0384i.bravo((Y1.w) it.next());
        }
        ArrayList arrayList = NavHost.juliet;
        arrayList.add(c0384i.alpha());
        P.d dVar2 = new P.d(new Ac.d(d02, countryPickerViewModel, agVar, diComponent, 3), 671745987, true);
        List emptyList2 = CollectionsKt.emptyList();
        C0390o c0390o = new C0390o((C0389n) auVar.bravo(AbstractC2996g2.bravo(C0389n.class)), kotlin.jvm.internal.u.alpha.bravo(SaveCardScreen.CountryPicker.class), new U0.t(7, false), dVar2);
        Iterator it2 = emptyList2.iterator();
        while (it2.hasNext()) {
            c0390o.bravo((Y1.w) it2.next());
        }
        arrayList.add(c0390o.alpha());
        P.d dVar3 = new P.d(new a5.k(agVar, 0), 1995707884, true);
        List emptyList3 = CollectionsKt.emptyList();
        C0390o c0390o2 = new C0390o((C0389n) auVar.bravo(AbstractC2996g2.bravo(C0389n.class)), kotlin.jvm.internal.u.alpha.bravo(SaveCardScreen.WebViewDialog.class), new U0.t(7, false), dVar3);
        Iterator it3 = emptyList3.iterator();
        while (it3.hasNext()) {
            c0390o2.bravo((Y1.w) it3.next());
        }
        arrayList.add(c0390o2.alpha());
        P.d dVar4 = new P.d(new a5.l(agVar, diComponent, 0), -1996372021, true);
        List emptyList4 = CollectionsKt.emptyList();
        C0390o c0390o3 = new C0390o((C0389n) auVar.bravo(AbstractC2996g2.bravo(C0389n.class)), kotlin.jvm.internal.u.alpha.bravo(SaveCardScreen.GetToKnowUsDialog.class), new U0.t(7, false), dVar4);
        Iterator it4 = emptyList4.iterator();
        while (it4.hasNext()) {
            c0390o3.bravo((Y1.w) it4.next());
        }
        arrayList.add(c0390o3.alpha());
        return Unit.INSTANCE;
    }

    public static final Unit a(DiComponent diComponent, ag agVar, InterfaceC0775m composable, Y1.l it, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(composable, "$this$composable");
        Intrinsics.echo(it, "it");
        KMPRememberMeClickHandler kmpRememberMeClickHandler = diComponent.kmpRememberMeClickHandler();
        C0585q c0585q = (C0585q) interfaceC0581m;
        boolean india = c0585q.india(agVar);
        Object jade = c0585q.jade();
        as asVar = C0580l.alpha;
        if (india || jade == asVar) {
            jade = new a5.m(agVar, 0);
            c0585q.f(jade);
        }
        kmpRememberMeClickHandler.setInfoTextNavigator$rememberme_standardRelease((Function0) jade);
        DesignTokens designTokens = diComponent.designTokens();
        SuspendUseCase<String, Unit> checkIsAccountAvailableUseCase = diComponent.checkIsAccountAvailableUseCase();
        SaveCardViewStateRepository saveCardViewStateRepository = diComponent.saveCardViewStateRepository();
        boolean india2 = c0585q.india(agVar);
        Object jade2 = c0585q.jade();
        if (india2 || jade2 == asVar) {
            jade2 = new a5.m(agVar, 1);
            c0585q.f(jade2);
        }
        Function0 function0 = (Function0) jade2;
        boolean india3 = c0585q.india(agVar);
        Object jade3 = c0585q.jade();
        if (india3 || jade3 == asVar) {
            jade3 = new a5.n(agVar, 0);
            c0585q.f(jade3);
        }
        Y0.a(designTokens, checkIsAccountAvailableUseCase, saveCardViewStateRepository, function0, (Function1) jade3, diComponent.kmpRememberMe(), diComponent.styleProvider().legalTextViewItem(), c0585q, DesignTokens.$stable | (CheckoutKMPRememberMe.$stable << 15) | (TextLabelViewItem.$stable << 18));
        return Unit.INSTANCE;
    }

    public static final Unit a(ag agVar, String url) {
        Intrinsics.echo(url, "url");
        Y1.r.delta(agVar, new SaveCardScreen.WebViewDialog(url, (String) null, 2, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final Unit a(DiComponent diComponent, ag agVar, Country it) {
        Intrinsics.echo(it, "it");
        diComponent.saveCardViewStateRepository().onCountryChange$rememberme_standardRelease(it);
        agVar.echo();
        return Unit.INSTANCE;
    }

    public static final Unit a(androidx.compose.runtime.D0 d02, CountryPickerViewModel countryPickerViewModel, ag agVar, DiComponent diComponent, Y1.l it, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(it, "it");
        CountryPickerType countryPickerType = CountryPickerType.Phone;
        Country country = ((SaveCardViewState) d02.getValue()).getCountry();
        C0585q c0585q = (C0585q) interfaceC0581m;
        boolean india = c0585q.india(diComponent) | c0585q.india(agVar);
        Object jade = c0585q.jade();
        if (india || jade == C0580l.alpha) {
            jade = new C0393r(1, diComponent, agVar);
            c0585q.f(jade);
        }
        CountryPickerBottomSheetScreenKt.CountryPickerBottomSheetScreen(countryPickerViewModel, agVar, countryPickerType, country, (Function1) jade, c0585q, CountryPickerViewModel.$stable | 384);
        return Unit.INSTANCE;
    }

    public static final Unit a(ag agVar) {
        agVar.echo();
        return Unit.INSTANCE;
    }

    public static final Unit a(ag agVar, DiComponent diComponent, Y1.l it, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(it, "it");
        AbstractC0993x.a(agVar, diComponent, interfaceC0581m, 0);
        return Unit.INSTANCE;
    }
}
