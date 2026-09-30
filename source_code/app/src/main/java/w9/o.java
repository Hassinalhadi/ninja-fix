package w9;

import com.app.feature.location.api.AllowMockProvider;
import com.app.feature.location.store.LastSentLocationStore;
import da.C1596b;
import da.InterfaceC1597c;
import da.InterfaceC1598d;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dc.C1608a;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.injections.modules.AppModule_ProvideContext$app_ProductionReleaseFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideAllowMockProviderFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideAuthStateProviderFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideBackendPingProviderFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideComplianceCheckerFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideComplianceUiHandlerFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideConnectionDiagnosticsFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideConnectionDiagnosticsServiceProviderFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideConnectionDiagnosticsStringProviderFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideLastSentLocationStoreFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideLocationBroadcastConfigFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideLocationHealthCheckerFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideLocationPayloadMapperFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideLocationSendFacadeFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideLoggerFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideLoginStateProviderFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideSessionInvalidatorFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideStompRuntimeFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideStompStateHolderFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideStompTokenProviderFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideStompUrlProviderFactory;
import delivery.samurai.android.injections.modules.CoreProvidersModule_ProvideUserInfoProviderFactory;
import delivery.samurai.android.injections.modules.DataModule_GetAuthServiceFactory;
import delivery.samurai.android.injections.modules.DataModule_GetCaptainServiceFactory;
import delivery.samurai.android.injections.modules.DataModule_GetOrdersServiceFactory;
import delivery.samurai.android.injections.modules.DataModule_GetShiftServiceFactory;
import delivery.samurai.android.injections.modules.DataModule_GetSupportServiceFactory;
import delivery.samurai.android.injections.modules.DataModule_GetZonesServiceFactory;
import delivery.samurai.android.injections.modules.DataModule_ProvideRepositionServiceFactory;
import delivery.samurai.android.injections.modules.DataModule_ProvideTicketsServiceFactory;
import delivery.samurai.android.injections.modules.LocationModule_GetLocationManagerFactory;
import delivery.samurai.android.injections.modules.RetrofitModule_GetPublicRetrofitClientFactory;
import delivery.samurai.android.injections.modules.TelemetryModule_ProvideAnalyticsTrackerFactory;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import delivery.samurai.android.ui.about.viewmodel.MoreViewModel;
import delivery.samurai.android.ui.about.viewmodel.TrophiesCollectionsViewModel;
import delivery.samurai.android.ui.about.viewmodel.TrophiesListViewModel;
import delivery.samurai.android.ui.about.viewmodel.TrophyMilestonesViewModel;
import delivery.samurai.android.ui.agreement.viewmodel.AgreementViewModel;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import delivery.samurai.android.ui.areasV2.AreaViewModelV2;
import delivery.samurai.android.ui.assets.viewmodel.AssetViewModel;
import delivery.samurai.android.ui.attendanceRegistry.AttendanceRegistryViewModel;
import delivery.samurai.android.ui.captainsuniforms.viewmodel.CaptainsUniformsViewModel;
import delivery.samurai.android.ui.envelop.EnvelopsViewModel;
import delivery.samurai.android.ui.envelopV2.EnvelopsViewModelV2;
import delivery.samurai.android.ui.home.HomeViewModel;
import delivery.samurai.android.ui.homev2.ConnectionDiagnosticsViewModelV2;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import delivery.samurai.android.ui.missingAttributes.AttributeMissingViewModel;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import delivery.samurai.android.ui.orders.viewmodel.OrdersMainViewModel;
import delivery.samurai.android.ui.points.presentation.PointsViewModel;
import delivery.samurai.android.ui.redeem.presentation.RedeemViewModel;
import delivery.samurai.android.ui.reposition.presentation.RepositionViewModel;
import delivery.samurai.android.ui.score.ScoreViewModel;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingViewModelV2;
import delivery.samurai.android.ui.shiftsV2.ShiftSummariesViewModelV2;
import delivery.samurai.android.ui.shiftsV2.ShiftsViewModelV2;
import delivery.samurai.android.ui.splash.AuthViewModel;
import delivery.samurai.android.ui.support.SupportViewModel;
import delivery.samurai.android.ui.suspension.viewmodel.SuspensionViewModel;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsViewModel;
import delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsViewModel;
import delivery.samurai.android.ui.transfer.TransferCardViewModel;
import delivery.samurai.android.ui.wallet.WalletViewModel;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryViewModel;
import delivery.samurai.android.ui.zones.ZonesViewModel;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import ea.InterfaceC1643a;
import fc.C1706a;
import h3.InterfaceC1804a;
import h3.InterfaceC1805b;
import h3.InterfaceC1806c;
import h3.InterfaceC1807d;
import ia.InterfaceC1908a;
import j3.C1943b;
import j3.InterfaceC1942a;
import ja.C1955a;
import jc.C1958a;
import kc.InterfaceC2031a;
import qc.C2462d;
import rc.InterfaceC2515a;
import s6.AbstractC2763s0;
import t3.InterfaceC2956a;
import t3.InterfaceC2957b;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import ta.C3095a;
import u3.InterfaceC3143f;
import ua.InterfaceC3147a;
import vg.at;
import y9.C3403a;
import z3.InterfaceC3463b;
import z9.C3488e;
import z9.C3489f;
import z9.C3490g;

/* loaded from: classes2.dex */
public final class o implements dagger.internal.d {
    public final /* synthetic */ int alpha;
    public final p bravo;
    public final int charlie;

    public /* synthetic */ o(p pVar, int i4, int i5) {
        this.alpha = i5;
        this.bravo = pVar;
        this.charlie = i4;
    }

    @Override // Kd.a
    public final Object get() {
        Object allAddressNoteViewModel;
        switch (this.alpha) {
            case 0:
                D9.a aVar = D9.a.alpha;
                Ka.a aVar2 = Ka.b.alpha;
                N9.f fVar = N9.f.alpha;
                p pVar = this.bravo;
                int i4 = this.charlie;
                switch (i4) {
                    case 0:
                        return new C1943b((InterfaceC1942a) pVar.india.get());
                    case 1:
                        InterfaceC1942a bindClogManager = pVar.alpha.bindClogManager((M9.a) pVar.hotel.get());
                        AbstractC2763s0.delta(bindClogManager);
                        return bindClogManager;
                    case 2:
                        return new Object();
                    case 3:
                        InterfaceC3463b provideCrashLogger = v.alpha.provideCrashLogger();
                        AbstractC2763s0.delta(provideCrashLogger);
                        return provideCrashLogger;
                    case 4:
                        return new N9.c((q3.g) pVar.november.get(), (q3.e) pVar.lima.get());
                    case 5:
                        q3.g provideFeatureFlagProvider = fVar.provideFeatureFlagProvider((q3.e) pVar.lima.get(), (q3.f) pVar.mike.get());
                        AbstractC2763s0.delta(provideFeatureFlagProvider);
                        return provideFeatureFlagProvider;
                    case 6:
                        q3.e provideFeatureFlagBackend = fVar.provideFeatureFlagBackend(ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo));
                        AbstractC2763s0.delta(provideFeatureFlagBackend);
                        return provideFeatureFlagBackend;
                    case 7:
                        q3.f provideFeatureFlagOverrides = fVar.provideFeatureFlagOverrides(ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo));
                        AbstractC2763s0.delta(provideFeatureFlagOverrides);
                        return provideFeatureFlagOverrides;
                    case 8:
                        return new N9.m((q3.e) pVar.lima.get());
                    case 9:
                        return new C1608a((q3.g) pVar.november.get());
                    case 10:
                        return new C1706a((q3.g) pVar.november.get());
                    case 11:
                        return new C3403a(ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo));
                    case 12:
                        return new C3490g((Y9.k) pVar.tango.get());
                    case 13:
                        return LocationModule_GetLocationManagerFactory.bravo(pVar.charlie, AppModule_ProvideContext$app_ProductionReleaseFactory.bravo(pVar.delta));
                    case 14:
                        return DataModule_GetOrdersServiceFactory.bravo(pVar.echo, (at) pVar.victor.get());
                    case 15:
                        return RetrofitModule_GetPublicRetrofitClientFactory.bravo(pVar.foxtrot);
                    case 16:
                        return DataModule_ProvideRepositionServiceFactory.bravo(pVar.echo, (at) pVar.victor.get());
                    case 17:
                        return DataModule_GetAuthServiceFactory.bravo(pVar.echo, (at) pVar.victor.get());
                    case 18:
                        InterfaceC1628b provideFirebaseRemoteConfigManager = fVar.provideFirebaseRemoteConfigManager((q3.g) pVar.november.get());
                        AbstractC2763s0.delta(provideFirebaseRemoteConfigManager);
                        return provideFirebaseRemoteConfigManager;
                    case 19:
                        return new z9.l((InterfaceC1628b) pVar.zulu.get(), ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo));
                    case 20:
                        return new A9.a((C3490g) pVar.uniform.get());
                    case 21:
                        return new z9.j(ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo), (LastSentLocationStore) pVar.beige.get());
                    case 22:
                        return CoreProvidersModule_ProvideLastSentLocationStoreFactory.bravo(ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo));
                    case 23:
                        return new C3488e((C3489f) pVar.blue.get());
                    case 24:
                        return new C3489f(ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo));
                    case 25:
                        return new Object();
                    case 26:
                        return new Object();
                    case 27:
                        return new z9.k((q3.g) pVar.november.get());
                    case 28:
                        return new Object();
                    case 29:
                        return new X9.g((InterfaceC2957b) pVar.fuchsia.get(), (C3490g) pVar.uniform.get(), (InterfaceC1627a) pVar.black.get());
                    case 30:
                        return DataModule_GetCaptainServiceFactory.bravo(pVar.echo, (at) pVar.victor.get());
                    case 31:
                        return CoreProvidersModule_ProvideLocationBroadcastConfigFactory.bravo();
                    case 32:
                        E9.d provideImageValidator = aVar.provideImageValidator();
                        AbstractC2763s0.delta(provideImageValidator);
                        return provideImageValidator;
                    case 33:
                        E9.a provideImageCompressor = aVar.provideImageCompressor();
                        AbstractC2763s0.delta(provideImageCompressor);
                        return provideImageCompressor;
                    case 34:
                        E9.c provideImageStorageProvider = aVar.provideImageStorageProvider();
                        AbstractC2763s0.delta(provideImageStorageProvider);
                        return provideImageStorageProvider;
                    case 35:
                        return new Nb.h(ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo));
                    case 36:
                        return CoreProvidersModule_ProvideConnectionDiagnosticsFactory.bravo(ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo), (o3.g) pVar.magenta.get(), (InterfaceC1806c) pVar.maroon.get(), (InterfaceC1807d) pVar.navy.get(), (InterfaceC1805b) pVar.ochre.get(), (InterfaceC1804a) pVar.olive.get());
                    case 37:
                        return CoreProvidersModule_ProvideLocationHealthCheckerFactory.bravo(ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo), (AllowMockProvider) pVar.lime.get());
                    case 38:
                        return CoreProvidersModule_ProvideAllowMockProviderFactory.bravo((InterfaceC3143f) pVar.lavender.get());
                    case 39:
                        InterfaceC3143f provideRemoteConfigProvider = fVar.provideRemoteConfigProvider((q3.g) pVar.november.get());
                        AbstractC2763s0.delta(provideRemoteConfigProvider);
                        return provideRemoteConfigProvider;
                    case 40:
                        return CoreProvidersModule_ProvideConnectionDiagnosticsServiceProviderFactory.bravo();
                    case 41:
                        return CoreProvidersModule_ProvideConnectionDiagnosticsStringProviderFactory.bravo(ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo));
                    case 42:
                        return CoreProvidersModule_ProvideBackendPingProviderFactory.bravo();
                    case 43:
                        return CoreProvidersModule_ProvideAuthStateProviderFactory.bravo();
                    case 44:
                        return DataModule_GetShiftServiceFactory.bravo(pVar.echo, (at) pVar.victor.get());
                    case 45:
                        return new C3095a((InterfaceC2956a) pVar.yankee.get());
                    case 46:
                        return TelemetryModule_ProvideAnalyticsTrackerFactory.bravo(ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo));
                    case 47:
                        Na.b provideGetUniformStoresUseCase = aVar2.provideGetUniformStoresUseCase((La.a) pVar.silver.get());
                        AbstractC2763s0.delta(provideGetUniformStoresUseCase);
                        return provideGetUniformStoresUseCase;
                    case 48:
                        return new Ja.b((Ia.a) pVar.red.get());
                    case 49:
                        Ia.a provideCaptainsUniformsRemoteDataSource = aVar2.provideCaptainsUniformsRemoteDataSource((Ha.a) pVar.purple.get());
                        AbstractC2763s0.delta(provideCaptainsUniformsRemoteDataSource);
                        return provideCaptainsUniformsRemoteDataSource;
                    case 50:
                        Ha.a provideCaptainsUniformsApi = aVar2.provideCaptainsUniformsApi((at) pVar.victor.get());
                        AbstractC2763s0.delta(provideCaptainsUniformsApi);
                        return provideCaptainsUniformsApi;
                    case 51:
                        return new C1955a((InterfaceC2957b) pVar.fuchsia.get());
                    case 52:
                        return new C1958a((InterfaceC2957b) pVar.fuchsia.get());
                    case 53:
                        return new C2462d((InterfaceC2960e) pVar.xray.get());
                    case 54:
                        return new Bc.a((t3.f) pVar.peach.get());
                    case 55:
                        return DataModule_GetSupportServiceFactory.bravo(pVar.echo, (at) pVar.victor.get());
                    case 56:
                        return new Lc.a((t3.h) pVar.f14009d.get());
                    case 57:
                        return DataModule_ProvideTicketsServiceFactory.bravo(pVar.echo, (at) pVar.victor.get());
                    case 58:
                        return DataModule_GetZonesServiceFactory.bravo(pVar.echo, (at) pVar.victor.get());
                    case 59:
                        return new C1596b((InterfaceC1597c) pVar.f14011g.get(), (InterfaceC1598d) pVar.f14012h.get());
                    case 60:
                        return CoreProvidersModule_ProvideLoginStateProviderFactory.bravo();
                    case 61:
                        return CoreProvidersModule_ProvideSessionInvalidatorFactory.bravo();
                    case 62:
                        return CoreProvidersModule_ProvideStompRuntimeFactory.bravo((Nb.h) pVar.jade.get());
                    case 63:
                        return CoreProvidersModule_ProvideStompUrlProviderFactory.bravo();
                    case 64:
                        return CoreProvidersModule_ProvideStompTokenProviderFactory.bravo();
                    case 65:
                        return CoreProvidersModule_ProvideLoggerFactory.bravo();
                    case 66:
                        return CoreProvidersModule_ProvideLocationSendFacadeFactory.bravo((Z9.c) pVar.f14018n.get());
                    case 67:
                        return new Z9.c(ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo));
                    case 68:
                        return CoreProvidersModule_ProvideUserInfoProviderFactory.bravo();
                    case 69:
                        return CoreProvidersModule_ProvideStompStateHolderFactory.bravo();
                    case 70:
                        return CoreProvidersModule_ProvideComplianceCheckerFactory.bravo(ApplicationContextModule_ProvideContextFactory.provideContext(pVar.bravo));
                    case 71:
                        return CoreProvidersModule_ProvideComplianceUiHandlerFactory.bravo();
                    case 72:
                        return CoreProvidersModule_ProvideLocationPayloadMapperFactory.bravo();
                    default:
                        throw new AssertionError(i4);
                }
            default:
                p pVar2 = this.bravo;
                int i5 = this.charlie;
                switch (i5) {
                    case 0:
                        return new AgreementViewModel(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get());
                    case 1:
                        allAddressNoteViewModel = new AllAddressNoteViewModel(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get(), (InterfaceC2958c) pVar2.whiskey.get(), pVar2.bravo(), (E9.d) pVar2.green.get());
                        break;
                    case 2:
                        return new AreaViewModelV2(pVar2.alpha(), (t3.f) pVar2.peach.get());
                    case 3:
                        return new AssetViewModel(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get());
                    case 4:
                        return new AttendanceRegistryViewModel(pVar2.alpha(), (t3.f) pVar2.peach.get());
                    case 5:
                        return new AttributeMissingViewModel(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get());
                    case 6:
                        return new AuthViewModel(pVar2.alpha(), (InterfaceC3147a) pVar2.pink.get(), (InterfaceC2956a) pVar2.yankee.get(), (N9.m) pVar2.papa.get(), (LastSentLocationStore) pVar2.beige.get(), (InterfaceC1643a) pVar2.plum.get());
                    case 7:
                        return new CaptainsUniformsViewModel(pVar2.alpha(), (Na.b) pVar2.teal.get(), (InterfaceC1627a) pVar2.black.get());
                    case 8:
                        return new ConnectionDiagnosticsViewModelV2(ApplicationContextModule_ProvideApplicationFactory.provideApplication(pVar2.bravo), (m3.d) pVar2.orange.get());
                    case 9:
                        return new EnvelopsViewModelV2(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get());
                    case 10:
                        return new EnvelopsViewModel(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get());
                    case 11:
                        return new HomeViewModelV2(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get(), (InterfaceC2956a) pVar2.yankee.get());
                    case 12:
                        return new HomeViewModel(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get(), (InterfaceC2956a) pVar2.yankee.get());
                    case 13:
                        return new MoreViewModel(pVar2.alpha(), (InterfaceC1908a) pVar2.white.get());
                    case 14:
                        return new MyAccountViewModel(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get());
                    case 15:
                        return new OrdersMainViewModel(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get(), (InterfaceC2958c) pVar2.whiskey.get());
                    case 16:
                        AndroidApp alpha = pVar2.alpha();
                        InterfaceC2958c interfaceC2958c = (InterfaceC2958c) pVar2.whiskey.get();
                        InterfaceC2957b interfaceC2957b = (InterfaceC2957b) pVar2.fuchsia.get();
                        t3.f fVar2 = (t3.f) pVar2.peach.get();
                        J9.a provideUploadRequestValidator = D9.a.alpha.provideUploadRequestValidator((E9.d) pVar2.green.get());
                        AbstractC2763s0.delta(provideUploadRequestValidator);
                        allAddressNoteViewModel = new OrdersViewModel(alpha, interfaceC2958c, interfaceC2957b, fVar2, provideUploadRequestValidator);
                        break;
                    case 17:
                        return new PointsViewModel(pVar2.alpha(), (InterfaceC2031a) pVar2.yellow.get());
                    case 18:
                        return new RedeemViewModel(pVar2.alpha(), (InterfaceC2031a) pVar2.yellow.get());
                    case 19:
                        return new RepositionViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(pVar2.bravo), (InterfaceC2515a) pVar2.f14006a.get());
                    case 20:
                        return new ScoreViewModel(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get());
                    case 21:
                        return new ShiftBookingViewModelV2(pVar2.alpha(), (t3.f) pVar2.peach.get());
                    case 22:
                        return new ShiftSummariesViewModelV2(pVar2.alpha(), (t3.f) pVar2.peach.get());
                    case 23:
                        return new ShiftsViewModelV2(pVar2.alpha(), (t3.f) pVar2.peach.get(), (Cc.a) pVar2.f14007b.get());
                    case 24:
                        return new SupportViewModel(pVar2.alpha(), (t3.g) pVar2.f14008c.get());
                    case 25:
                        return new SuspensionViewModel(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get());
                    case 26:
                        return new TicketDetailsViewModel(pVar2.alpha(), (Mc.a) pVar2.e.get());
                    case 27:
                        return new TicketsViewModel((Mc.a) pVar2.e.get(), pVar2.alpha());
                    case 28:
                        return new TransferCardViewModel(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get());
                    case 29:
                        return new TrophiesCollectionsViewModel(pVar2.alpha(), (InterfaceC1908a) pVar2.white.get());
                    case 30:
                        return new TrophiesListViewModel(pVar2.alpha(), (InterfaceC1908a) pVar2.white.get());
                    case 31:
                        return new TrophyMilestonesViewModel(pVar2.alpha(), (InterfaceC1908a) pVar2.white.get());
                    case 32:
                        return new WalletViewModel(pVar2.alpha(), (InterfaceC2957b) pVar2.fuchsia.get());
                    case 33:
                        return new WithDrawHistoryViewModel((InterfaceC2957b) pVar2.fuchsia.get(), pVar2.alpha());
                    case 34:
                        return new ZonesViewModel(pVar2.alpha(), (t3.i) pVar2.f14010f.get());
                    default:
                        throw new AssertionError(i5);
                }
                return allAddressNoteViewModel;
        }
    }
}
