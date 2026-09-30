package com.checkout.components.rememberme;

import android.content.Context;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.usecase.SuspendUseCase;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.data.PaymentStateRepository;
import com.checkout.components.rememberme.di.DefaultStyleProvider;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.di.NetworkModule;
import com.checkout.components.rememberme.di.RMStateManagerModule;
import com.checkout.components.rememberme.di.RTLModule;
import com.checkout.components.rememberme.di.RememberMeModule;
import com.checkout.components.rememberme.di.RepositoryModule;
import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.rememberme.di.UseCaseModule;
import com.checkout.components.rememberme.model.RememberMeCallback;
import com.checkout.components.rememberme.savecard.SaveCardViewStateRepository;
import com.checkout.components.rememberme.ui.manager.RMStateManager;
import com.checkout.components.rememberme.usecase.LogoutUseCase;
import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import com.checkout.components.rememberme.usecase.SubmitSavedCardUseCase;
import com.checkout.components.rememberme.utils.KMPRememberMeClickHandler;
import com.checkout.components.ui.mapper.ButtonStyleToInternalStateMapper;
import com.checkout.components.ui.mapper.ButtonStyleToInternalViewStyleMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToInputFieldStateMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.utils.CountryPickerStyleUtils;
import com.checkout.components.ui.utils.ScreenHeaderStyleUtils;
import com.checkout.components.ui.utils.extensions.Utils;
import dagger.internal.InstanceFactory;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yf.at;

/* renamed from: com.checkout.components.rememberme.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0978s implements DiComponent {
    public final dagger.internal.d A;
    public final dagger.internal.d B;
    public final C0992w1 C;

    /* renamed from: D, reason: collision with root package name */
    public final dagger.internal.b f6213D;

    /* renamed from: E, reason: collision with root package name */
    public final dagger.internal.d f6214E;

    /* renamed from: F, reason: collision with root package name */
    public final C1 f6215F;

    /* renamed from: G, reason: collision with root package name */
    public final dagger.internal.b f6216G;

    /* renamed from: H, reason: collision with root package name */
    public final dagger.internal.b f6217H;

    /* renamed from: I, reason: collision with root package name */
    public final dagger.internal.d f6218I;

    /* renamed from: J, reason: collision with root package name */
    public final dagger.internal.d f6219J;

    /* renamed from: K, reason: collision with root package name */
    public final dagger.internal.d f6220K;

    /* renamed from: L, reason: collision with root package name */
    public final dagger.internal.d f6221L;

    /* renamed from: M, reason: collision with root package name */
    public final dagger.internal.d f6222M;

    /* renamed from: N, reason: collision with root package name */
    public final dagger.internal.d f6223N;

    /* renamed from: O, reason: collision with root package name */
    public final dagger.internal.d f6224O;

    /* renamed from: P, reason: collision with root package name */
    public final dagger.internal.d f6225P;
    public final dagger.internal.d Q;

    /* renamed from: R, reason: collision with root package name */
    public final dagger.internal.d f6226R;

    /* renamed from: S, reason: collision with root package name */
    public final dagger.internal.d f6227S;

    /* renamed from: T, reason: collision with root package name */
    public final dagger.internal.b f6228T;

    /* renamed from: U, reason: collision with root package name */
    public final dagger.internal.d f6229U;

    /* renamed from: V, reason: collision with root package name */
    public final C0949i0 f6230V;

    /* renamed from: W, reason: collision with root package name */
    public final dagger.internal.d f6231W;

    /* renamed from: X, reason: collision with root package name */
    public final dagger.internal.d f6232X;

    /* renamed from: Y, reason: collision with root package name */
    public final dagger.internal.d f6233Y;

    /* renamed from: Z, reason: collision with root package name */
    public final dagger.internal.d f6234Z;

    /* renamed from: a, reason: collision with root package name */
    public final RememberMeConfiguration f6235a;

    /* renamed from: a0, reason: collision with root package name */
    public final dagger.internal.d f6236a0;

    /* renamed from: b, reason: collision with root package name */
    public final RememberMeCallback f6237b;

    /* renamed from: b0, reason: collision with root package name */
    public final dagger.internal.d f6238b0;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6239c;

    /* renamed from: c0, reason: collision with root package name */
    public final dagger.internal.d f6240c0;

    /* renamed from: d, reason: collision with root package name */
    public final RTLModule f6241d;

    /* renamed from: d0, reason: collision with root package name */
    public final dagger.internal.d f6242d0;
    public final Logger e;

    /* renamed from: e0, reason: collision with root package name */
    public final dagger.internal.d f6243e0;

    /* renamed from: f, reason: collision with root package name */
    public final DesignTokens f6244f;

    /* renamed from: f0, reason: collision with root package name */
    public final dagger.internal.d f6245f0;

    /* renamed from: g, reason: collision with root package name */
    public final LogDetails f6246g;

    /* renamed from: g0, reason: collision with root package name */
    public final dagger.internal.d f6247g0;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.b f6248h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.d f6249i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.b f6250j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.b f6251k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.d f6252l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.d f6253m;

    /* renamed from: n, reason: collision with root package name */
    public final G f6254n;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.b f6255o;

    /* renamed from: p, reason: collision with root package name */
    public final dagger.internal.b f6256p;

    /* renamed from: q, reason: collision with root package name */
    public final dagger.internal.d f6257q;

    /* renamed from: r, reason: collision with root package name */
    public final dagger.internal.b f6258r;

    /* renamed from: s, reason: collision with root package name */
    public final dagger.internal.d f6259s;

    /* renamed from: t, reason: collision with root package name */
    public final dagger.internal.d f6260t;

    /* renamed from: u, reason: collision with root package name */
    public final dagger.internal.d f6261u;

    /* renamed from: v, reason: collision with root package name */
    public final C0975r f6262v;

    /* renamed from: w, reason: collision with root package name */
    public final dagger.internal.b f6263w;

    /* renamed from: x, reason: collision with root package name */
    public final dagger.internal.d f6264x;

    /* renamed from: y, reason: collision with root package name */
    public final dagger.internal.d f6265y;

    /* renamed from: z, reason: collision with root package name */
    public final dagger.internal.d f6266z;

    public C0978s(RTLModule rTLModule, StyleModule styleModule, NetworkModule networkModule, RepositoryModule repositoryModule, UseCaseModule useCaseModule, RememberMeModule rememberMeModule, RMStateManagerModule rMStateManagerModule, String str, Environment environment, Context context, RememberMeConfiguration rememberMeConfiguration, List list, List list2, DesignTokens designTokens, Xd.l lVar, at atVar, Map map, Logger logger, RememberMeCallback rememberMeCallback, Locale locale, Function1 function1, LogDetails logDetails) {
        this.f6235a = rememberMeConfiguration;
        this.f6237b = rememberMeCallback;
        this.f6239c = context;
        this.f6241d = rTLModule;
        this.e = logger;
        this.f6244f = designTokens;
        this.f6246g = logDetails;
        InstanceFactory bravo = InstanceFactory.bravo(designTokens);
        this.f6248h = bravo;
        dagger.internal.d bravo2 = dagger.internal.a.bravo(new C0962m1(styleModule, bravo));
        this.f6249i = bravo2;
        InstanceFactory bravo3 = InstanceFactory.bravo(map);
        this.f6250j = bravo3;
        InstanceFactory alpha = InstanceFactory.alpha(locale);
        this.f6251k = alpha;
        dagger.internal.d bravo4 = dagger.internal.a.bravo(new H0(repositoryModule, InstanceFactory.bravo(rememberMeConfiguration)));
        this.f6252l = bravo4;
        dagger.internal.d bravo5 = dagger.internal.a.bravo(new N0(repositoryModule));
        this.f6253m = bravo5;
        G g2 = new G(bravo4, bravo5);
        this.f6254n = g2;
        InstanceFactory alpha2 = InstanceFactory.alpha(environment);
        this.f6255o = alpha2;
        InstanceFactory alpha3 = InstanceFactory.alpha(str);
        this.f6256p = alpha3;
        dagger.internal.d bravo6 = dagger.internal.a.bravo(new K0(repositoryModule));
        this.f6257q = bravo6;
        InstanceFactory alpha4 = InstanceFactory.alpha(logger);
        this.f6258r = alpha4;
        dagger.internal.d bravo7 = dagger.internal.a.bravo(new C0955k0(rememberMeModule, bravo3, alpha, g2, alpha2, bravo, alpha3, bravo6, dagger.internal.a.bravo(new C0964n0(rememberMeModule, alpha4))));
        this.f6259s = bravo7;
        dagger.internal.d bravo8 = dagger.internal.a.bravo(new C0928b0(networkModule, dagger.internal.a.bravo(new C0931c0(networkModule))));
        this.f6260t = bravo8;
        dagger.internal.d bravo9 = dagger.internal.a.bravo(new C0934d0(networkModule));
        this.f6261u = bravo9;
        C0975r c0975r = new C0975r(dagger.internal.a.bravo(new C0925a0(networkModule, bravo8, bravo9, alpha2)));
        this.f6262v = c0975r;
        InstanceFactory alpha5 = InstanceFactory.alpha(logDetails);
        this.f6263w = alpha5;
        this.f6264x = dagger.internal.a.bravo(new A1(useCaseModule, c0975r, bravo6, alpha5, alpha4));
        dagger.internal.d bravo10 = dagger.internal.a.bravo(new Q0(repositoryModule));
        this.f6265y = bravo10;
        this.f6266z = dagger.internal.a.bravo(new C0998y1(useCaseModule, bravo7, bravo5));
        dagger.internal.d bravo11 = dagger.internal.a.bravo(new J0(repositoryModule));
        this.A = bravo11;
        this.B = dagger.internal.a.bravo(new C0995x1(useCaseModule, bravo7, bravo11));
        C0992w1 c0992w1 = new C0992w1(dagger.internal.a.bravo(new C0937e0(networkModule, bravo8, bravo9, alpha2)));
        this.C = c0992w1;
        InstanceFactory alpha6 = InstanceFactory.alpha(lVar);
        this.f6213D = alpha6;
        dagger.internal.d bravo12 = dagger.internal.a.bravo(new P0(repositoryModule));
        this.f6214E = bravo12;
        C1 c12 = new C1(useCaseModule);
        this.f6215F = c12;
        InstanceFactory bravo13 = InstanceFactory.bravo(function1);
        this.f6216G = bravo13;
        InstanceFactory alpha7 = InstanceFactory.alpha(rememberMeCallback);
        this.f6217H = alpha7;
        dagger.internal.d bravo14 = dagger.internal.a.bravo(new C0946h0(rMStateManagerModule));
        this.f6218I = bravo14;
        dagger.internal.d bravo15 = dagger.internal.a.bravo(new G0(repositoryModule));
        this.f6219J = bravo15;
        this.f6220K = dagger.internal.a.bravo(new D1(useCaseModule, dagger.internal.a.bravo(new B1(useCaseModule, c0975r, c0992w1, bravo6, alpha3, alpha6, bravo12, bravo10, c12, bravo13, alpha5, alpha7, bravo14, alpha4, bravo15))));
        this.f6221L = dagger.internal.a.bravo(new C1001z1(useCaseModule, bravo12, bravo6));
        dagger.internal.d bravo16 = dagger.internal.a.bravo(new C0953j1(styleModule, dagger.internal.a.bravo(new C0944g1(styleModule))));
        this.f6222M = bravo16;
        dagger.internal.d bravo17 = dagger.internal.a.bravo(new C0971p1(styleModule));
        this.f6223N = bravo17;
        dagger.internal.d bravo18 = dagger.internal.a.bravo(new C0956k1(styleModule, bravo17));
        this.f6224O = bravo18;
        dagger.internal.d bravo19 = dagger.internal.a.bravo(new C0968o1(styleModule));
        this.f6225P = bravo19;
        this.Q = dagger.internal.a.bravo(new C0929b1(styleModule, bravo19));
        dagger.internal.d bravo20 = dagger.internal.a.bravo(new C0935d1(styleModule));
        this.f6226R = bravo20;
        this.f6227S = dagger.internal.a.bravo(new C0932c1(styleModule, bravo20, bravo17));
        InstanceFactory alpha8 = InstanceFactory.alpha(context);
        this.f6228T = alpha8;
        this.f6229U = dagger.internal.a.bravo(new C0941f1(styleModule, bravo, dagger.internal.a.bravo(new C0938e1(styleModule, alpha8, bravo3)), bravo2));
        C0949i0 c0949i0 = new C0949i0(rTLModule, alpha8);
        this.f6230V = c0949i0;
        dagger.internal.d bravo21 = dagger.internal.a.bravo(new C0959l1(styleModule, alpha8, bravo3));
        this.f6231W = bravo21;
        dagger.internal.d bravo22 = dagger.internal.a.bravo(new C0950i1(styleModule, bravo20, bravo17, bravo18));
        this.f6232X = bravo22;
        dagger.internal.d bravo23 = dagger.internal.a.bravo(new C0965n1(styleModule, bravo21, bravo22, dagger.internal.a.bravo(new C0947h1(styleModule, bravo19, bravo16)), bravo17, bravo19, bravo));
        this.f6233Y = bravo23;
        this.f6234Z = dagger.internal.a.bravo(new M0(repositoryModule, c0949i0, bravo23, bravo13, alpha5, alpha4));
        this.f6236a0 = dagger.internal.a.bravo(new I0(repositoryModule));
        this.f6238b0 = dagger.internal.a.bravo(new L0(repositoryModule, InstanceFactory.alpha(atVar)));
        this.f6240c0 = dagger.internal.a.bravo(new C0961m0(rememberMeModule, alpha6));
        this.f6242d0 = dagger.internal.a.bravo(new C0967o0(rememberMeModule, InstanceFactory.alpha(list)));
        this.f6243e0 = dagger.internal.a.bravo(new C0970p0(rememberMeModule, InstanceFactory.alpha(list2)));
        this.f6245f0 = dagger.internal.a.bravo(new O0(repositoryModule));
        this.f6247g0 = dagger.internal.a.bravo(new C0958l0(rememberMeModule, bravo13));
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final ButtonStyleToInternalStateMapper buttonStyleToInternalStateMapper() {
        return (ButtonStyleToInternalStateMapper) this.Q.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final ButtonStyleToInternalViewStyleMapper buttonStyleToInternalStyleMapper() {
        return (ButtonStyleToInternalViewStyleMapper) this.f6227S.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final PrimitiveStateRepository cardMetadataRepository() {
        return (PrimitiveStateRepository) this.f6219J.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final SuspendUseCase checkIsAccountAvailablePrefilledUseCase() {
        return (SuspendUseCase) this.B.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final SuspendUseCase checkIsAccountAvailableUseCase() {
        return (SuspendUseCase) this.f6266z.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final RememberMeConfiguration config() {
        return this.f6235a;
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final CountryPickerStyleUtils countryPickerStyleUtils() {
        return (CountryPickerStyleUtils) this.f6229U.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final DesignTokens designTokens() {
        return this.f6244f;
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final PrimitiveStateRepository hasInitialCheckedRepository() {
        return (PrimitiveStateRepository) this.f6236a0.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final InputFieldStyleToInputFieldStateMapper inputFieldStateMapper() {
        return (InputFieldStyleToInputFieldStateMapper) this.f6222M.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final Mapper inputFieldStyleMapper() {
        return (Mapper) this.f6224O.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final PrimitiveStateFlowRepository isAccountAvailableRepository() {
        return (PrimitiveStateFlowRepository) this.A.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final boolean isRTL() {
        RTLModule rTLModule = this.f6241d;
        Context context = this.f6239c;
        rTLModule.getClass();
        Intrinsics.echo(context, "context");
        return Utils.INSTANCE.isRtl(context);
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final PrimitiveStateFlowRepository jwtTokenRepository() {
        return (PrimitiveStateFlowRepository) this.f6257q.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final CheckoutKMPRememberMe kmpRememberMe() {
        return (CheckoutKMPRememberMe) this.f6259s.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final KMPRememberMeClickHandler kmpRememberMeClickHandler() {
        return new KMPRememberMeClickHandler((PrimitiveStateFlowRepository) this.f6252l.get(), (PrimitiveSharedFlowRepository) this.f6253m.get());
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final LogDetails logDetails() {
        return this.f6246g;
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final Logger logger() {
        return this.e;
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final LogoutUseCase logoutUseCase() {
        return (LogoutUseCase) this.f6221L.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final MapJWTTokenToWalletUseCase mapJWTTokenToWalletUseCase() {
        return (MapJWTTokenToWalletUseCase) this.f6264x.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final Function1 onError() {
        return (Function1) this.f6247g0.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final Xd.l onPayRememberMe() {
        return (Xd.l) this.f6240c0.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final PaymentStateRepository paymentStateRepository() {
        return (PaymentStateRepository) this.f6238b0.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final RememberMeCallback rememberMeCallback() {
        return this.f6237b;
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final ResourceProvider resourceProvider() {
        return (ResourceProvider) this.f6231W.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final RMStateManager rmStateManager() {
        return (RMStateManager) this.f6218I.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final SaveCardViewStateRepository saveCardViewStateRepository() {
        return (SaveCardViewStateRepository) this.f6234Z.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final PrimitiveSharedFlowRepository screenEventNavigationRepository() {
        return (PrimitiveSharedFlowRepository) this.f6253m.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final ScreenHeaderStyleUtils screenHeaderStyleUtils() {
        return (ScreenHeaderStyleUtils) this.f6249i.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final PrimitiveStateRepository screenRepository() {
        return (PrimitiveStateRepository) this.f6245f0.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final DefaultStyleProvider styleProvider() {
        return (DefaultStyleProvider) this.f6233Y.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final SubmitSavedCardUseCase submitSavedCardUseCase() {
        return (SubmitSavedCardUseCase) this.f6220K.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final List supportedSchemes() {
        return (List) this.f6242d0.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final List supportedTypes() {
        return (List) this.f6243e0.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final TextLabelStyleToStateMapper textLabelStateMapper() {
        return (TextLabelStyleToStateMapper) this.f6225P.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final Mapper textLabelViewStyleMapper() {
        return (Mapper) this.f6223N.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final PrimitiveStateFlowRepository walletRepository() {
        return (PrimitiveStateFlowRepository) this.f6214E.get();
    }

    @Override // com.checkout.components.rememberme.di.DiComponent
    public final PrimitiveStateFlowRepository walletScreenViewStateRepository() {
        return (PrimitiveStateFlowRepository) this.f6265y.get();
    }
}
