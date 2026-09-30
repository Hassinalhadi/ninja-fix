package com.checkout.components.rememberme;

import Ec.al;
import Lb.ak;
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
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.lifecycle.InterfaceC0651v;
import bx.InterfaceC0775m;
import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.AbstractC0979s0;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.rememberme.RememberMeNavHostViewModel;
import com.checkout.components.rememberme.utils.NavControllerWrapper;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.mlkit.vision.barcode.common.Barcode;
import d2.AbstractC1579d;
import ge.InterfaceC1772d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2717m7;
import s6.F7;
import t0.AbstractC2901T;
import t6.AbstractC2996g2;
import t6.W2;
import t6.Y2;

/* renamed from: com.checkout.components.rememberme.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0979s0 {
    public static final Unit a(T.s sVar, DiComponent diComponent, Function0 function0, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(sVar, diComponent, function0, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit b(ag agVar) {
        Y1.r.delta(agVar, RememberMeScreen.GetToKnowUsDialog.INSTANCE);
        return Unit.INSTANCE;
    }

    public static final Unit a(TextLabelViewItem textLabelViewItem, RememberMeScreen rememberMeScreen, NavControllerWrapper navControllerWrapper, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(textLabelViewItem, rememberMeScreen, navControllerWrapper, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(T.s sVar, DiComponent diComponent, Xd.l lVar, Xd.l lVar2, Xd.n nVar, PrimitiveStateRepository primitiveStateRepository, Xd.l lVar3, Function0 function0, Function0 function02, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(sVar, diComponent, lVar, lVar2, nVar, primitiveStateRepository, lVar3, function0, function02, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(final T.s modifier, final DiComponent di, final Xd.l alternativeView, final Xd.l addCardView, final Xd.n onSubmitNewCard, PrimitiveStateRepository screenRepository, final Xd.l onSendCardMetaDataRequest, final Function0 isTokenizationInProgress, final Function0 rememberMeAddCardMetadataProvider, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        C0585q c0585q;
        T1.c cVar;
        ag agVar;
        Intrinsics.echo(modifier, "modifier");
        Intrinsics.echo(di, "di");
        Intrinsics.echo(alternativeView, "alternativeView");
        Intrinsics.echo(addCardView, "addCardView");
        Intrinsics.echo(onSubmitNewCard, "onSubmitNewCard");
        Intrinsics.echo(screenRepository, "screenRepository");
        Intrinsics.echo(onSendCardMetaDataRequest, "onSendCardMetaDataRequest");
        Intrinsics.echo(isTokenizationInProgress, "isTokenizationInProgress");
        Intrinsics.echo(rememberMeAddCardMetadataProvider, "rememberMeAddCardMetadataProvider");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1375410148);
        if ((i4 & 6) == 0) {
            i5 = (c0585q2.golf(modifier) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= (i4 & 64) == 0 ? c0585q2.golf(di) : c0585q2.india(di) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q2.india(alternativeView) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0585q2.india(addCardView) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0585q2.india(onSubmitNewCard) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= (262144 & i4) == 0 ? c0585q2.golf(screenRepository) : c0585q2.india(screenRepository) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= c0585q2.india(onSendCardMetaDataRequest) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= c0585q2.india(isTokenizationInProgress) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= c0585q2.india(rememberMeAddCardMetadataProvider) ? 67108864 : 33554432;
        }
        if (c0585q2.magenta(i5 & 1, (38347923 & i5) != 38347922)) {
            final ag bravo = W2.bravo(new at[0], c0585q2);
            ax bravo2 = AbstractC2717m7.bravo(di.isAccountAvailableRepository().getFlow(), c0585q2, 0);
            PrimitiveSharedFlowRepository<RememberMeScreen> screenEventNavigationRepository = di.screenEventNavigationRepository();
            Object obj = ((Boolean) bravo2.getValue()).booleanValue() ? RememberMeScreen.Authentication.INSTANCE : RememberMeScreen.Alternative.INSTANCE;
            Object jade = c0585q2.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new NavControllerWrapper(obj, bravo, screenRepository);
                c0585q2.f(jade);
            }
            final NavControllerWrapper navControllerWrapper = (NavControllerWrapper) jade;
            Unit unit = Unit.INSTANCE;
            boolean india = c0585q2.india(screenEventNavigationRepository) | c0585q2.india(navControllerWrapper);
            Object jade2 = c0585q2.jade();
            if (india || jade2 == asVar) {
                jade2 = new C0976r0(screenEventNavigationRepository, navControllerWrapper, null);
                c0585q2.f(jade2);
            }
            C0564b.foxtrot((Xd.l) jade2, c0585q2, unit);
            String valueOf = String.valueOf(di.hashCode());
            int i10 = i5 & 112;
            boolean india2 = (i10 == 32 || ((i5 & 64) != 0 && c0585q2.india(di))) | c0585q2.india(screenEventNavigationRepository);
            Object jade3 = c0585q2.jade();
            if (india2 || jade3 == asVar) {
                jade3 = new C0393r(4, di, screenEventNavigationRepository);
                c0585q2.f(jade3);
            }
            Function1 function1 = (Function1) jade3;
            androidx.lifecycle.d0 alpha = U1.a.alpha(c0585q2);
            if (alpha != null) {
                kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
                Object obj2 = obj;
                InterfaceC1772d bravo3 = vVar.bravo(RememberMeNavHostViewModel.class);
                Fe.t tVar = new Fe.t(1);
                tVar.alpha(vVar.bravo(RememberMeNavHostViewModel.class), function1);
                T1.d bravo4 = tVar.bravo();
                if (alpha instanceof InterfaceC0651v) {
                    cVar = ((InterfaceC0651v) alpha).getDefaultViewModelCreationExtras();
                } else {
                    cVar = T1.a.bravo;
                }
                F7.bravo(bravo3, alpha, valueOf, bravo4, cVar, c0585q2);
                final ax bravo5 = AbstractC2717m7.bravo(di.walletRepository().getFlow(), c0585q2, 0);
                Q0.n nVar = di.isRTL() ? Q0.n.purple : Q0.n.alpha;
                boolean india3 = ((i5 & 896) == 256) | (i10 == 32 || ((i5 & 64) != 0 && c0585q2.india(di))) | ((i5 & 14) == 4) | c0585q2.india(bravo) | c0585q2.golf(bravo5) | c0585q2.india(navControllerWrapper) | c0585q2.echo(nVar.ordinal()) | ((i5 & 7168) == 2048) | c0585q2.india(onSubmitNewCard) | c0585q2.india(onSendCardMetaDataRequest) | ((29360128 & i5) == 8388608) | ((234881024 & i5) == 67108864);
                Object jade4 = c0585q2.jade();
                if (india3 || jade4 == asVar) {
                    final Q0.n nVar2 = nVar;
                    Function1 function12 = new Function1() { // from class: a5.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            T.s sVar = T.s.this;
                            DiComponent diComponent = di;
                            Xd.l lVar = alternativeView;
                            Q0.n nVar3 = nVar2;
                            Xd.l lVar2 = addCardView;
                            Xd.n nVar4 = onSubmitNewCard;
                            Xd.l lVar3 = onSendCardMetaDataRequest;
                            Function0 function0 = isTokenizationInProgress;
                            return AbstractC0979s0.a(sVar, diComponent, bravo, lVar, bravo5, navControllerWrapper, nVar3, lVar2, nVar4, lVar3, function0, rememberMeAddCardMetadataProvider, (ad) obj3);
                        }
                    };
                    agVar = bravo;
                    c0585q2.f(function12);
                    jade4 = function12;
                } else {
                    agVar = bravo;
                }
                Y2.bravo(agVar, obj2, null, null, null, null, null, null, null, (Function1) jade4, c0585q2, 0);
                c0585q = c0585q2;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ak(modifier, di, alternativeView, addCardView, onSubmitNewCard, screenRepository, onSendCardMetaDataRequest, isTokenizationInProgress, rememberMeAddCardMetadataProvider, i4);
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
        String url = ((RememberMeScreen.WebViewDialog) AbstractC1579d.bravo(RememberMeScreen.WebViewDialog.Companion.serializer(), alpha, linkedHashMap)).getUrl();
        C0585q c0585q = (C0585q) interfaceC0581m;
        boolean india2 = c0585q.india(agVar);
        Object jade = c0585q.jade();
        if (india2 || jade == C0580l.alpha) {
            jade = new a5.m(agVar, 4);
            c0585q.f(jade);
        }
        AbstractC0942g.a(url, (Function0) jade, null, c0585q, 0, 4);
        return Unit.INSTANCE;
    }

    public static final Unit a(Q0.n nVar, T.s sVar, DiComponent diComponent, NavControllerWrapper navControllerWrapper, Xd.l lVar, Xd.n nVar2, Xd.l lVar2, Function0 function0, Function0 function02, InterfaceC0775m composable, Y1.l unused$var$, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(composable, "$this$composable");
        Intrinsics.echo(unused$var$, "$unused$var$");
        C0564b.alpha(AbstractC2901T.november.alpha(nVar), P.e.echo(706210755, new Lb.P(sVar, diComponent, navControllerWrapper, lVar, nVar2, lVar2, function0, function02), interfaceC0581m), interfaceC0581m, 56);
        return Unit.INSTANCE;
    }

    public static final RememberMeNavHostViewModel a(DiComponent diComponent, PrimitiveSharedFlowRepository primitiveSharedFlowRepository, T1.c viewModel) {
        Intrinsics.echo(viewModel, "$this$viewModel");
        return new RememberMeNavHostViewModel(diComponent.walletRepository(), diComponent.mapJWTTokenToWalletUseCase(), primitiveSharedFlowRepository, diComponent.onError(), diComponent.logDetails(), diComponent.logger());
    }

    public static final Unit a(final T.s sVar, final DiComponent diComponent, final ag agVar, final Xd.l lVar, final androidx.compose.runtime.D0 d02, final NavControllerWrapper navControllerWrapper, final Q0.n nVar, final Xd.l lVar2, final Xd.n nVar2, final Xd.l lVar3, final Function0 function0, final Function0 function02, ad NavHost) {
        Intrinsics.echo(NavHost, "$this$NavHost");
        P.d dVar = new P.d(new Xd.n() { // from class: a5.z
            @Override // Xd.n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int intValue = ((Integer) obj4).intValue();
                return AbstractC0979s0.a(T.s.this, diComponent, agVar, (InterfaceC0775m) obj, (Y1.l) obj2, (InterfaceC0581m) obj3, intValue);
            }
        }, 1978716987, true);
        List emptyList = CollectionsKt.emptyList();
        au auVar = NavHost.golf;
        auVar.getClass();
        C0384i c0384i = new C0384i((C0383h) auVar.bravo(AbstractC2996g2.bravo(C0383h.class)), kotlin.jvm.internal.u.alpha.bravo(RememberMeScreen.Authentication.class), dVar);
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            c0384i.bravo((Y1.w) it.next());
        }
        ArrayList arrayList = NavHost.juliet;
        arrayList.add(c0384i.alpha());
        P.d dVar2 = new P.d(new Xd.n() { // from class: a5.aa
            @Override // Xd.n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int intValue = ((Integer) obj4).intValue();
                return AbstractC0979s0.a(T.s.this, lVar, d02, diComponent, navControllerWrapper, (InterfaceC0775m) obj, (Y1.l) obj2, (InterfaceC0581m) obj3, intValue);
            }
        }, 684153316, true);
        List emptyList2 = CollectionsKt.emptyList();
        C0384i c0384i2 = new C0384i((C0383h) auVar.bravo(AbstractC2996g2.bravo(C0383h.class)), kotlin.jvm.internal.u.alpha.bravo(RememberMeScreen.Alternative.class), dVar2);
        Iterator it2 = emptyList2.iterator();
        while (it2.hasNext()) {
            c0384i2.bravo((Y1.w) it2.next());
        }
        arrayList.add(c0384i2.alpha());
        P.d dVar3 = new P.d(new Xd.n() { // from class: a5.ab
            @Override // Xd.n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int intValue = ((Integer) obj4).intValue();
                return AbstractC0979s0.a(Q0.n.this, sVar, diComponent, navControllerWrapper, lVar2, nVar2, lVar3, function0, function02, (InterfaceC0775m) obj, (Y1.l) obj2, (InterfaceC0581m) obj3, intValue);
            }
        }, 1028716675, true);
        List emptyList3 = CollectionsKt.emptyList();
        C0384i c0384i3 = new C0384i((C0383h) auVar.bravo(AbstractC2996g2.bravo(C0383h.class)), kotlin.jvm.internal.u.alpha.bravo(RememberMeScreen.Wallet.class), dVar3);
        Iterator it3 = emptyList3.iterator();
        while (it3.hasNext()) {
            c0384i3.bravo((Y1.w) it3.next());
        }
        arrayList.add(c0384i3.alpha());
        P.d dVar4 = new P.d(new a5.k(agVar, 1), -103854280, true);
        List emptyList4 = CollectionsKt.emptyList();
        C0390o c0390o = new C0390o((C0389n) auVar.bravo(AbstractC2996g2.bravo(C0389n.class)), kotlin.jvm.internal.u.alpha.bravo(RememberMeScreen.WebViewDialog.class), new U0.t(7, false), dVar4);
        Iterator it4 = emptyList4.iterator();
        while (it4.hasNext()) {
            c0390o.bravo((Y1.w) it4.next());
        }
        arrayList.add(c0390o.alpha());
        P.d dVar5 = new P.d(new a5.l(agVar, diComponent, 1), 787925665, true);
        List emptyList5 = CollectionsKt.emptyList();
        C0390o c0390o2 = new C0390o((C0389n) auVar.bravo(AbstractC2996g2.bravo(C0389n.class)), kotlin.jvm.internal.u.alpha.bravo(RememberMeScreen.GetToKnowUsDialog.class), new U0.t(7, false), dVar5);
        Iterator it5 = emptyList5.iterator();
        while (it5.hasNext()) {
            c0390o2.bravo((Y1.w) it5.next());
        }
        arrayList.add(c0390o2.alpha());
        return Unit.INSTANCE;
    }

    public static final Unit a(T.s sVar, DiComponent diComponent, ag agVar, InterfaceC0775m composable, Y1.l it, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(composable, "$this$composable");
        Intrinsics.echo(it, "it");
        C0585q c0585q = (C0585q) interfaceC0581m;
        boolean india = c0585q.india(agVar);
        Object jade = c0585q.jade();
        if (india || jade == C0580l.alpha) {
            jade = new a5.m(agVar, 3);
            c0585q.f(jade);
        }
        a(sVar, diComponent, (Function0) jade, c0585q, 0);
        return Unit.INSTANCE;
    }

    public static final Unit a(T.s sVar, Xd.l lVar, androidx.compose.runtime.D0 d02, DiComponent diComponent, NavControllerWrapper navControllerWrapper, InterfaceC0775m composable, Y1.l it, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(composable, "$this$composable");
        Intrinsics.echo(it, "it");
        T.s then = androidx.compose.animation.c.alpha(sVar, null, 3).then(androidx.compose.foundation.layout.V.charlie);
        C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(16), T.d.f2063g, interfaceC0581m, 54);
        C0585q c0585q = (C0585q) interfaceC0581m;
        long j5 = c0585q.magenta;
        int i5 = (int) (j5 ^ (j5 >>> 32));
        androidx.compose.runtime.I mike = c0585q.mike();
        T.s charlie = T.a.charlie(then, interfaceC0581m);
        C2551k c2551k = InterfaceC2552l.maroon;
        c2551k.getClass();
        C2550j c2550j = C2551k.bravo;
        C1298c c1298c = c0585q.alpha;
        c0585q.white();
        if (c0585q.lime) {
            c0585q.lima(c2550j);
        } else {
            c0585q.i();
        }
        Xd.l a6 = AbstractC0987v.a(c2551k, interfaceC0581m, alpha, interfaceC0581m, mike);
        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
            AbstractC0990w.a(i5, interfaceC0581m, i5, a6);
        }
        C0564b.blue(C2551k.delta, interfaceC0581m, charlie);
        lVar.invoke(interfaceC0581m, 0);
        if (d02.getValue() != null) {
            c0585q.purple(679921869);
            a(diComponent.styleProvider().useSavedPaymentMethodViewItem(), RememberMeScreen.Wallet.INSTANCE, navControllerWrapper, interfaceC0581m, TextLabelViewItem.$stable | 48);
        } else {
            c0585q.purple(674354548);
        }
        c0585q.quebec(false);
        c0585q.quebec(true);
        return Unit.INSTANCE;
    }

    public static final Unit a(T.s sVar, DiComponent diComponent, NavControllerWrapper navControllerWrapper, Xd.l lVar, Xd.n nVar, Xd.l lVar2, Function0 function0, Function0 function02, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            T.s then = androidx.compose.animation.c.alpha(sVar, null, 3).then(androidx.compose.foundation.layout.V.charlie);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(16), T.d.f2063g, c0585q, 54);
            long j5 = c0585q.magenta;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(then, c0585q);
            C2551k c2551k = InterfaceC2552l.maroon;
            c2551k.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            Xd.l a6 = AbstractC0987v.a(c2551k, c0585q, alpha, c0585q, mike);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                AbstractC0990w.a(i5, c0585q, i5, a6);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            T1.a(diComponent, navControllerWrapper, lVar, nVar, lVar2, function0, function02, c0585q, 0);
            a(diComponent.styleProvider().useDifferentPaymentMethodViewItem(), RememberMeScreen.Alternative.INSTANCE, navControllerWrapper, c0585q, TextLabelViewItem.$stable | 48);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
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

    public static final void a(T.s sVar, DiComponent diComponent, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(96334413);
        if ((i4 & 48) == 0) {
            i5 = ((i4 & 64) == 0 ? c0585q.golf(diComponent) : c0585q.india(diComponent) ? 32 : 16) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q.india(function0) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 145) != 144)) {
            diComponent.kmpRememberMeClickHandler().setInfoTextNavigator$rememberme_standardRelease(function0);
            diComponent.kmpRememberMe().AuthenticationView(c0585q, CheckoutKMPRememberMe.$stable);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new al(sVar, (Object) diComponent, (Object) function0, i4, 9);
        }
    }

    public static final void a(TextLabelViewItem textLabelViewItem, RememberMeScreen rememberMeScreen, NavControllerWrapper navControllerWrapper, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(450015654);
        if ((i4 & 6) == 0) {
            i5 = ((i4 & 8) == 0 ? c0585q.golf(textLabelViewItem) : c0585q.india(textLabelViewItem) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q.golf(rememberMeScreen) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q.india(navControllerWrapper) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 147) != 146)) {
            TextLabelViewStyle style = textLabelViewItem.getStyle();
            T.s modifier = textLabelViewItem.getStyle().getModifier();
            boolean india = c0585q.india(navControllerWrapper) | ((i5 & 112) == 32);
            Object jade = c0585q.jade();
            if (india || jade == C0580l.alpha) {
                jade = new Yb.F(4, navControllerWrapper, rememberMeScreen);
                c0585q.f(jade);
            }
            TextLabelViewKt.TextLabelView(TextLabelViewStyle.m180copyQstMH_w$default(style, androidx.compose.foundation.a.echo(15, modifier, null, (Function0) jade, false), 0, false, 0, null, null, false, 126, null), textLabelViewItem.getState(), c0585q, TextLabelViewStyle.$stable | (TextLabelState.$stable << 3));
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new al(textLabelViewItem, rememberMeScreen, navControllerWrapper, i4, 8);
        }
    }

    public static final Unit a(NavControllerWrapper navControllerWrapper, RememberMeScreen rememberMeScreen) {
        navControllerWrapper.navigate(rememberMeScreen);
        return Unit.INSTANCE;
    }
}
