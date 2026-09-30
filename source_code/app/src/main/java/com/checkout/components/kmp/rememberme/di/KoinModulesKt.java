package com.checkout.components.kmp.rememberme.di;

import Xd.l;
import com.checkout.components.kmp.rememberme.data.remote.HttpClientFactory;
import com.checkout.components.kmp.rememberme.data.remote.NetworkClient;
import com.checkout.components.kmp.rememberme.data.repositories.AuthInfoRepository;
import com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepository;
import com.checkout.components.kmp.rememberme.data.repositories.ChallengeRepositoryImpl;
import com.checkout.components.kmp.rememberme.data.repositories.ConsumerRepository;
import com.checkout.components.kmp.rememberme.data.repositories.ConsumerRepositoryImpl;
import com.checkout.components.kmp.rememberme.data.usecase.CreateHintChallengeUseCase;
import com.checkout.components.kmp.rememberme.data.usecase.CreateHintChallengeUseCaseImpl;
import com.checkout.components.kmp.rememberme.data.usecase.CreateHintUseCase;
import com.checkout.components.kmp.rememberme.data.usecase.RespondChallengeUseCase;
import com.checkout.components.kmp.rememberme.data.usecase.RespondChallengeUseCaseImpl;
import com.checkout.components.kmp.rememberme.logging.NoOpRememberMeLogger;
import com.checkout.components.kmp.rememberme.logging.RememberMeLogger;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeConfig;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeEnvironment;
import com.checkout.components.kmp.rememberme.shared.model.TranslationKey;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.LayoutDirectionStateRepository;
import com.checkout.components.kmp.rememberme.utils.LocaleStateRepository;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.authentication.AuthenticationViewModel;
import com.checkout.components.kmp.rememberme.view.challenge.ChallengeViewModel;
import com.checkout.components.kmp.rememberme.view.otp.OTPViewModel;
import fg.c;
import ge.InterfaceC1772d;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\r\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f\"\u001a\u0010\u000f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u001a\u0010\u0011\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeConfig;", com.clevertap.android.sdk.Constants.KEY_CONFIG, "Ljg/a;", "createConfigModule", "(Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeConfig;)Ljg/a;", "configModule", "", "rememberMeModules", "(Ljg/a;)Ljava/util/List;", "networkModule", "Ljg/a;", "getNetworkModule", "()Ljg/a;", "dataModule", "getDataModule", "useCaseModule", "getUseCaseModule", "viewModelModule", "getViewModelModule", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KoinModulesKt {

    @NotNull
    private static final jg.a dataModule;

    @NotNull
    private static final jg.a networkModule;

    @NotNull
    private static final jg.a useCaseModule;

    @NotNull
    private static final jg.a viewModelModule;

    static {
        jg.a aVar = new jg.a();
        networkModule$lambda$3(aVar);
        networkModule = aVar;
        jg.a aVar2 = new jg.a();
        dataModule$lambda$5(aVar2);
        dataModule = aVar2;
        jg.a aVar3 = new jg.a();
        useCaseModule$lambda$9(aVar3);
        useCaseModule = aVar3;
        jg.a aVar4 = new jg.a();
        viewModelModule$lambda$13(aVar4);
        viewModelModule = aVar4;
    }

    public static /* synthetic */ CreateHintChallengeUseCase alpha(og.a aVar, kg.a aVar2) {
        return useCaseModule$lambda$9$lambda$7(aVar, aVar2);
    }

    @NotNull
    public static final jg.a createConfigModule(@NotNull RememberMeConfig config) {
        Intrinsics.echo(config, "config");
        jg.a aVar = new jg.a();
        createConfigModule$lambda$25(config, aVar);
        return aVar;
    }

    private static final Unit createConfigModule$lambda$25(final RememberMeConfig rememberMeConfig, jg.a module) {
        Intrinsics.echo(module, "$this$module");
        final int i4 = 0;
        l lVar = new l() { // from class: com.checkout.components.kmp.rememberme.di.a
            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                RememberMeEnvironment createConfigModule$lambda$25$lambda$14;
                LayoutDirectionStateRepository createConfigModule$lambda$25$lambda$23;
                RememberMeLogger createConfigModule$lambda$25$lambda$24;
                String createConfigModule$lambda$25$lambda$15;
                String createConfigModule$lambda$25$lambda$16;
                String createConfigModule$lambda$25$lambda$17;
                Function1 createConfigModule$lambda$25$lambda$18;
                Function1 createConfigModule$lambda$25$lambda$19;
                DesignTokens createConfigModule$lambda$25$lambda$20;
                ResourceProvider createConfigModule$lambda$25$lambda$21;
                LocaleStateRepository createConfigModule$lambda$25$lambda$22;
                og.a aVar = (og.a) obj;
                kg.a aVar2 = (kg.a) obj2;
                switch (i4) {
                    case 0:
                        createConfigModule$lambda$25$lambda$14 = KoinModulesKt.createConfigModule$lambda$25$lambda$14(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$14;
                    case 1:
                        createConfigModule$lambda$25$lambda$23 = KoinModulesKt.createConfigModule$lambda$25$lambda$23(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$23;
                    case 2:
                        createConfigModule$lambda$25$lambda$24 = KoinModulesKt.createConfigModule$lambda$25$lambda$24(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$24;
                    case 3:
                        createConfigModule$lambda$25$lambda$15 = KoinModulesKt.createConfigModule$lambda$25$lambda$15(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$15;
                    case 4:
                        createConfigModule$lambda$25$lambda$16 = KoinModulesKt.createConfigModule$lambda$25$lambda$16(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$16;
                    case 5:
                        createConfigModule$lambda$25$lambda$17 = KoinModulesKt.createConfigModule$lambda$25$lambda$17(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$17;
                    case 6:
                        createConfigModule$lambda$25$lambda$18 = KoinModulesKt.createConfigModule$lambda$25$lambda$18(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$18;
                    case 7:
                        createConfigModule$lambda$25$lambda$19 = KoinModulesKt.createConfigModule$lambda$25$lambda$19(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$19;
                    case 8:
                        createConfigModule$lambda$25$lambda$20 = KoinModulesKt.createConfigModule$lambda$25$lambda$20(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$20;
                    case 9:
                        createConfigModule$lambda$25$lambda$21 = KoinModulesKt.createConfigModule$lambda$25$lambda$21(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$21;
                    default:
                        createConfigModule$lambda$25$lambda$22 = KoinModulesKt.createConfigModule$lambda$25$lambda$22(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$22;
                }
            }
        };
        c cVar = c.alpha;
        List emptyList = CollectionsKt.emptyList();
        v vVar = u.alpha;
        InterfaceC1772d bravo = vVar.bravo(RememberMeEnvironment.class);
        lg.b bVar = mg.a.echo;
        module.alpha(new hg.b(new fg.a(bVar, bravo, null, lVar, cVar, emptyList)));
        Constants constants = Constants.INSTANCE;
        final int i5 = 3;
        module.alpha(new hg.b(new fg.a(bVar, vVar.bravo(String.class), constants.getPUBLIC_KEY_NAME(), new l() { // from class: com.checkout.components.kmp.rememberme.di.a
            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                RememberMeEnvironment createConfigModule$lambda$25$lambda$14;
                LayoutDirectionStateRepository createConfigModule$lambda$25$lambda$23;
                RememberMeLogger createConfigModule$lambda$25$lambda$24;
                String createConfigModule$lambda$25$lambda$15;
                String createConfigModule$lambda$25$lambda$16;
                String createConfigModule$lambda$25$lambda$17;
                Function1 createConfigModule$lambda$25$lambda$18;
                Function1 createConfigModule$lambda$25$lambda$19;
                DesignTokens createConfigModule$lambda$25$lambda$20;
                ResourceProvider createConfigModule$lambda$25$lambda$21;
                LocaleStateRepository createConfigModule$lambda$25$lambda$22;
                og.a aVar = (og.a) obj;
                kg.a aVar2 = (kg.a) obj2;
                switch (i5) {
                    case 0:
                        createConfigModule$lambda$25$lambda$14 = KoinModulesKt.createConfigModule$lambda$25$lambda$14(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$14;
                    case 1:
                        createConfigModule$lambda$25$lambda$23 = KoinModulesKt.createConfigModule$lambda$25$lambda$23(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$23;
                    case 2:
                        createConfigModule$lambda$25$lambda$24 = KoinModulesKt.createConfigModule$lambda$25$lambda$24(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$24;
                    case 3:
                        createConfigModule$lambda$25$lambda$15 = KoinModulesKt.createConfigModule$lambda$25$lambda$15(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$15;
                    case 4:
                        createConfigModule$lambda$25$lambda$16 = KoinModulesKt.createConfigModule$lambda$25$lambda$16(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$16;
                    case 5:
                        createConfigModule$lambda$25$lambda$17 = KoinModulesKt.createConfigModule$lambda$25$lambda$17(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$17;
                    case 6:
                        createConfigModule$lambda$25$lambda$18 = KoinModulesKt.createConfigModule$lambda$25$lambda$18(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$18;
                    case 7:
                        createConfigModule$lambda$25$lambda$19 = KoinModulesKt.createConfigModule$lambda$25$lambda$19(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$19;
                    case 8:
                        createConfigModule$lambda$25$lambda$20 = KoinModulesKt.createConfigModule$lambda$25$lambda$20(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$20;
                    case 9:
                        createConfigModule$lambda$25$lambda$21 = KoinModulesKt.createConfigModule$lambda$25$lambda$21(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$21;
                    default:
                        createConfigModule$lambda$25$lambda$22 = KoinModulesKt.createConfigModule$lambda$25$lambda$22(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$22;
                }
            }
        }, cVar, CollectionsKt.emptyList())));
        final int i10 = 4;
        module.alpha(new hg.b(new fg.a(bVar, vVar.bravo(String.class), constants.getSERVICE_NAME(), new l() { // from class: com.checkout.components.kmp.rememberme.di.a
            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                RememberMeEnvironment createConfigModule$lambda$25$lambda$14;
                LayoutDirectionStateRepository createConfigModule$lambda$25$lambda$23;
                RememberMeLogger createConfigModule$lambda$25$lambda$24;
                String createConfigModule$lambda$25$lambda$15;
                String createConfigModule$lambda$25$lambda$16;
                String createConfigModule$lambda$25$lambda$17;
                Function1 createConfigModule$lambda$25$lambda$18;
                Function1 createConfigModule$lambda$25$lambda$19;
                DesignTokens createConfigModule$lambda$25$lambda$20;
                ResourceProvider createConfigModule$lambda$25$lambda$21;
                LocaleStateRepository createConfigModule$lambda$25$lambda$22;
                og.a aVar = (og.a) obj;
                kg.a aVar2 = (kg.a) obj2;
                switch (i10) {
                    case 0:
                        createConfigModule$lambda$25$lambda$14 = KoinModulesKt.createConfigModule$lambda$25$lambda$14(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$14;
                    case 1:
                        createConfigModule$lambda$25$lambda$23 = KoinModulesKt.createConfigModule$lambda$25$lambda$23(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$23;
                    case 2:
                        createConfigModule$lambda$25$lambda$24 = KoinModulesKt.createConfigModule$lambda$25$lambda$24(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$24;
                    case 3:
                        createConfigModule$lambda$25$lambda$15 = KoinModulesKt.createConfigModule$lambda$25$lambda$15(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$15;
                    case 4:
                        createConfigModule$lambda$25$lambda$16 = KoinModulesKt.createConfigModule$lambda$25$lambda$16(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$16;
                    case 5:
                        createConfigModule$lambda$25$lambda$17 = KoinModulesKt.createConfigModule$lambda$25$lambda$17(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$17;
                    case 6:
                        createConfigModule$lambda$25$lambda$18 = KoinModulesKt.createConfigModule$lambda$25$lambda$18(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$18;
                    case 7:
                        createConfigModule$lambda$25$lambda$19 = KoinModulesKt.createConfigModule$lambda$25$lambda$19(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$19;
                    case 8:
                        createConfigModule$lambda$25$lambda$20 = KoinModulesKt.createConfigModule$lambda$25$lambda$20(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$20;
                    case 9:
                        createConfigModule$lambda$25$lambda$21 = KoinModulesKt.createConfigModule$lambda$25$lambda$21(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$21;
                    default:
                        createConfigModule$lambda$25$lambda$22 = KoinModulesKt.createConfigModule$lambda$25$lambda$22(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$22;
                }
            }
        }, cVar, CollectionsKt.emptyList())));
        final int i11 = 5;
        module.alpha(new hg.b(new fg.a(bVar, vVar.bravo(String.class), constants.getSERVICE_VERSION(), new l() { // from class: com.checkout.components.kmp.rememberme.di.a
            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                RememberMeEnvironment createConfigModule$lambda$25$lambda$14;
                LayoutDirectionStateRepository createConfigModule$lambda$25$lambda$23;
                RememberMeLogger createConfigModule$lambda$25$lambda$24;
                String createConfigModule$lambda$25$lambda$15;
                String createConfigModule$lambda$25$lambda$16;
                String createConfigModule$lambda$25$lambda$17;
                Function1 createConfigModule$lambda$25$lambda$18;
                Function1 createConfigModule$lambda$25$lambda$19;
                DesignTokens createConfigModule$lambda$25$lambda$20;
                ResourceProvider createConfigModule$lambda$25$lambda$21;
                LocaleStateRepository createConfigModule$lambda$25$lambda$22;
                og.a aVar = (og.a) obj;
                kg.a aVar2 = (kg.a) obj2;
                switch (i11) {
                    case 0:
                        createConfigModule$lambda$25$lambda$14 = KoinModulesKt.createConfigModule$lambda$25$lambda$14(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$14;
                    case 1:
                        createConfigModule$lambda$25$lambda$23 = KoinModulesKt.createConfigModule$lambda$25$lambda$23(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$23;
                    case 2:
                        createConfigModule$lambda$25$lambda$24 = KoinModulesKt.createConfigModule$lambda$25$lambda$24(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$24;
                    case 3:
                        createConfigModule$lambda$25$lambda$15 = KoinModulesKt.createConfigModule$lambda$25$lambda$15(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$15;
                    case 4:
                        createConfigModule$lambda$25$lambda$16 = KoinModulesKt.createConfigModule$lambda$25$lambda$16(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$16;
                    case 5:
                        createConfigModule$lambda$25$lambda$17 = KoinModulesKt.createConfigModule$lambda$25$lambda$17(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$17;
                    case 6:
                        createConfigModule$lambda$25$lambda$18 = KoinModulesKt.createConfigModule$lambda$25$lambda$18(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$18;
                    case 7:
                        createConfigModule$lambda$25$lambda$19 = KoinModulesKt.createConfigModule$lambda$25$lambda$19(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$19;
                    case 8:
                        createConfigModule$lambda$25$lambda$20 = KoinModulesKt.createConfigModule$lambda$25$lambda$20(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$20;
                    case 9:
                        createConfigModule$lambda$25$lambda$21 = KoinModulesKt.createConfigModule$lambda$25$lambda$21(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$21;
                    default:
                        createConfigModule$lambda$25$lambda$22 = KoinModulesKt.createConfigModule$lambda$25$lambda$22(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$22;
                }
            }
        }, cVar, CollectionsKt.emptyList())));
        lg.b on_authenticated_name = constants.getON_AUTHENTICATED_NAME();
        final int i12 = 6;
        module.alpha(new hg.b(new fg.a(bVar, vVar.bravo(Function1.class), on_authenticated_name, new l() { // from class: com.checkout.components.kmp.rememberme.di.a
            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                RememberMeEnvironment createConfigModule$lambda$25$lambda$14;
                LayoutDirectionStateRepository createConfigModule$lambda$25$lambda$23;
                RememberMeLogger createConfigModule$lambda$25$lambda$24;
                String createConfigModule$lambda$25$lambda$15;
                String createConfigModule$lambda$25$lambda$16;
                String createConfigModule$lambda$25$lambda$17;
                Function1 createConfigModule$lambda$25$lambda$18;
                Function1 createConfigModule$lambda$25$lambda$19;
                DesignTokens createConfigModule$lambda$25$lambda$20;
                ResourceProvider createConfigModule$lambda$25$lambda$21;
                LocaleStateRepository createConfigModule$lambda$25$lambda$22;
                og.a aVar = (og.a) obj;
                kg.a aVar2 = (kg.a) obj2;
                switch (i12) {
                    case 0:
                        createConfigModule$lambda$25$lambda$14 = KoinModulesKt.createConfigModule$lambda$25$lambda$14(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$14;
                    case 1:
                        createConfigModule$lambda$25$lambda$23 = KoinModulesKt.createConfigModule$lambda$25$lambda$23(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$23;
                    case 2:
                        createConfigModule$lambda$25$lambda$24 = KoinModulesKt.createConfigModule$lambda$25$lambda$24(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$24;
                    case 3:
                        createConfigModule$lambda$25$lambda$15 = KoinModulesKt.createConfigModule$lambda$25$lambda$15(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$15;
                    case 4:
                        createConfigModule$lambda$25$lambda$16 = KoinModulesKt.createConfigModule$lambda$25$lambda$16(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$16;
                    case 5:
                        createConfigModule$lambda$25$lambda$17 = KoinModulesKt.createConfigModule$lambda$25$lambda$17(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$17;
                    case 6:
                        createConfigModule$lambda$25$lambda$18 = KoinModulesKt.createConfigModule$lambda$25$lambda$18(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$18;
                    case 7:
                        createConfigModule$lambda$25$lambda$19 = KoinModulesKt.createConfigModule$lambda$25$lambda$19(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$19;
                    case 8:
                        createConfigModule$lambda$25$lambda$20 = KoinModulesKt.createConfigModule$lambda$25$lambda$20(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$20;
                    case 9:
                        createConfigModule$lambda$25$lambda$21 = KoinModulesKt.createConfigModule$lambda$25$lambda$21(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$21;
                    default:
                        createConfigModule$lambda$25$lambda$22 = KoinModulesKt.createConfigModule$lambda$25$lambda$22(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$22;
                }
            }
        }, cVar, CollectionsKt.emptyList())));
        final int i13 = 7;
        module.alpha(new hg.b(new fg.a(bVar, vVar.bravo(Function1.class), null, new l() { // from class: com.checkout.components.kmp.rememberme.di.a
            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                RememberMeEnvironment createConfigModule$lambda$25$lambda$14;
                LayoutDirectionStateRepository createConfigModule$lambda$25$lambda$23;
                RememberMeLogger createConfigModule$lambda$25$lambda$24;
                String createConfigModule$lambda$25$lambda$15;
                String createConfigModule$lambda$25$lambda$16;
                String createConfigModule$lambda$25$lambda$17;
                Function1 createConfigModule$lambda$25$lambda$18;
                Function1 createConfigModule$lambda$25$lambda$19;
                DesignTokens createConfigModule$lambda$25$lambda$20;
                ResourceProvider createConfigModule$lambda$25$lambda$21;
                LocaleStateRepository createConfigModule$lambda$25$lambda$22;
                og.a aVar = (og.a) obj;
                kg.a aVar2 = (kg.a) obj2;
                switch (i13) {
                    case 0:
                        createConfigModule$lambda$25$lambda$14 = KoinModulesKt.createConfigModule$lambda$25$lambda$14(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$14;
                    case 1:
                        createConfigModule$lambda$25$lambda$23 = KoinModulesKt.createConfigModule$lambda$25$lambda$23(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$23;
                    case 2:
                        createConfigModule$lambda$25$lambda$24 = KoinModulesKt.createConfigModule$lambda$25$lambda$24(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$24;
                    case 3:
                        createConfigModule$lambda$25$lambda$15 = KoinModulesKt.createConfigModule$lambda$25$lambda$15(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$15;
                    case 4:
                        createConfigModule$lambda$25$lambda$16 = KoinModulesKt.createConfigModule$lambda$25$lambda$16(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$16;
                    case 5:
                        createConfigModule$lambda$25$lambda$17 = KoinModulesKt.createConfigModule$lambda$25$lambda$17(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$17;
                    case 6:
                        createConfigModule$lambda$25$lambda$18 = KoinModulesKt.createConfigModule$lambda$25$lambda$18(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$18;
                    case 7:
                        createConfigModule$lambda$25$lambda$19 = KoinModulesKt.createConfigModule$lambda$25$lambda$19(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$19;
                    case 8:
                        createConfigModule$lambda$25$lambda$20 = KoinModulesKt.createConfigModule$lambda$25$lambda$20(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$20;
                    case 9:
                        createConfigModule$lambda$25$lambda$21 = KoinModulesKt.createConfigModule$lambda$25$lambda$21(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$21;
                    default:
                        createConfigModule$lambda$25$lambda$22 = KoinModulesKt.createConfigModule$lambda$25$lambda$22(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$22;
                }
            }
        }, cVar, CollectionsKt.emptyList())));
        final int i14 = 8;
        module.alpha(new hg.b(new fg.a(bVar, vVar.bravo(DesignTokens.class), null, new l() { // from class: com.checkout.components.kmp.rememberme.di.a
            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                RememberMeEnvironment createConfigModule$lambda$25$lambda$14;
                LayoutDirectionStateRepository createConfigModule$lambda$25$lambda$23;
                RememberMeLogger createConfigModule$lambda$25$lambda$24;
                String createConfigModule$lambda$25$lambda$15;
                String createConfigModule$lambda$25$lambda$16;
                String createConfigModule$lambda$25$lambda$17;
                Function1 createConfigModule$lambda$25$lambda$18;
                Function1 createConfigModule$lambda$25$lambda$19;
                DesignTokens createConfigModule$lambda$25$lambda$20;
                ResourceProvider createConfigModule$lambda$25$lambda$21;
                LocaleStateRepository createConfigModule$lambda$25$lambda$22;
                og.a aVar = (og.a) obj;
                kg.a aVar2 = (kg.a) obj2;
                switch (i14) {
                    case 0:
                        createConfigModule$lambda$25$lambda$14 = KoinModulesKt.createConfigModule$lambda$25$lambda$14(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$14;
                    case 1:
                        createConfigModule$lambda$25$lambda$23 = KoinModulesKt.createConfigModule$lambda$25$lambda$23(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$23;
                    case 2:
                        createConfigModule$lambda$25$lambda$24 = KoinModulesKt.createConfigModule$lambda$25$lambda$24(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$24;
                    case 3:
                        createConfigModule$lambda$25$lambda$15 = KoinModulesKt.createConfigModule$lambda$25$lambda$15(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$15;
                    case 4:
                        createConfigModule$lambda$25$lambda$16 = KoinModulesKt.createConfigModule$lambda$25$lambda$16(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$16;
                    case 5:
                        createConfigModule$lambda$25$lambda$17 = KoinModulesKt.createConfigModule$lambda$25$lambda$17(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$17;
                    case 6:
                        createConfigModule$lambda$25$lambda$18 = KoinModulesKt.createConfigModule$lambda$25$lambda$18(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$18;
                    case 7:
                        createConfigModule$lambda$25$lambda$19 = KoinModulesKt.createConfigModule$lambda$25$lambda$19(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$19;
                    case 8:
                        createConfigModule$lambda$25$lambda$20 = KoinModulesKt.createConfigModule$lambda$25$lambda$20(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$20;
                    case 9:
                        createConfigModule$lambda$25$lambda$21 = KoinModulesKt.createConfigModule$lambda$25$lambda$21(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$21;
                    default:
                        createConfigModule$lambda$25$lambda$22 = KoinModulesKt.createConfigModule$lambda$25$lambda$22(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$22;
                }
            }
        }, cVar, CollectionsKt.emptyList())));
        final int i15 = 9;
        module.alpha(new hg.b(new fg.a(bVar, vVar.bravo(ResourceProvider.class), null, new l() { // from class: com.checkout.components.kmp.rememberme.di.a
            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                RememberMeEnvironment createConfigModule$lambda$25$lambda$14;
                LayoutDirectionStateRepository createConfigModule$lambda$25$lambda$23;
                RememberMeLogger createConfigModule$lambda$25$lambda$24;
                String createConfigModule$lambda$25$lambda$15;
                String createConfigModule$lambda$25$lambda$16;
                String createConfigModule$lambda$25$lambda$17;
                Function1 createConfigModule$lambda$25$lambda$18;
                Function1 createConfigModule$lambda$25$lambda$19;
                DesignTokens createConfigModule$lambda$25$lambda$20;
                ResourceProvider createConfigModule$lambda$25$lambda$21;
                LocaleStateRepository createConfigModule$lambda$25$lambda$22;
                og.a aVar = (og.a) obj;
                kg.a aVar2 = (kg.a) obj2;
                switch (i15) {
                    case 0:
                        createConfigModule$lambda$25$lambda$14 = KoinModulesKt.createConfigModule$lambda$25$lambda$14(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$14;
                    case 1:
                        createConfigModule$lambda$25$lambda$23 = KoinModulesKt.createConfigModule$lambda$25$lambda$23(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$23;
                    case 2:
                        createConfigModule$lambda$25$lambda$24 = KoinModulesKt.createConfigModule$lambda$25$lambda$24(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$24;
                    case 3:
                        createConfigModule$lambda$25$lambda$15 = KoinModulesKt.createConfigModule$lambda$25$lambda$15(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$15;
                    case 4:
                        createConfigModule$lambda$25$lambda$16 = KoinModulesKt.createConfigModule$lambda$25$lambda$16(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$16;
                    case 5:
                        createConfigModule$lambda$25$lambda$17 = KoinModulesKt.createConfigModule$lambda$25$lambda$17(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$17;
                    case 6:
                        createConfigModule$lambda$25$lambda$18 = KoinModulesKt.createConfigModule$lambda$25$lambda$18(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$18;
                    case 7:
                        createConfigModule$lambda$25$lambda$19 = KoinModulesKt.createConfigModule$lambda$25$lambda$19(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$19;
                    case 8:
                        createConfigModule$lambda$25$lambda$20 = KoinModulesKt.createConfigModule$lambda$25$lambda$20(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$20;
                    case 9:
                        createConfigModule$lambda$25$lambda$21 = KoinModulesKt.createConfigModule$lambda$25$lambda$21(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$21;
                    default:
                        createConfigModule$lambda$25$lambda$22 = KoinModulesKt.createConfigModule$lambda$25$lambda$22(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$22;
                }
            }
        }, cVar, CollectionsKt.emptyList())));
        final int i16 = 10;
        module.alpha(new hg.b(new fg.a(bVar, vVar.bravo(LocaleStateRepository.class), null, new l() { // from class: com.checkout.components.kmp.rememberme.di.a
            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                RememberMeEnvironment createConfigModule$lambda$25$lambda$14;
                LayoutDirectionStateRepository createConfigModule$lambda$25$lambda$23;
                RememberMeLogger createConfigModule$lambda$25$lambda$24;
                String createConfigModule$lambda$25$lambda$15;
                String createConfigModule$lambda$25$lambda$16;
                String createConfigModule$lambda$25$lambda$17;
                Function1 createConfigModule$lambda$25$lambda$18;
                Function1 createConfigModule$lambda$25$lambda$19;
                DesignTokens createConfigModule$lambda$25$lambda$20;
                ResourceProvider createConfigModule$lambda$25$lambda$21;
                LocaleStateRepository createConfigModule$lambda$25$lambda$22;
                og.a aVar = (og.a) obj;
                kg.a aVar2 = (kg.a) obj2;
                switch (i16) {
                    case 0:
                        createConfigModule$lambda$25$lambda$14 = KoinModulesKt.createConfigModule$lambda$25$lambda$14(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$14;
                    case 1:
                        createConfigModule$lambda$25$lambda$23 = KoinModulesKt.createConfigModule$lambda$25$lambda$23(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$23;
                    case 2:
                        createConfigModule$lambda$25$lambda$24 = KoinModulesKt.createConfigModule$lambda$25$lambda$24(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$24;
                    case 3:
                        createConfigModule$lambda$25$lambda$15 = KoinModulesKt.createConfigModule$lambda$25$lambda$15(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$15;
                    case 4:
                        createConfigModule$lambda$25$lambda$16 = KoinModulesKt.createConfigModule$lambda$25$lambda$16(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$16;
                    case 5:
                        createConfigModule$lambda$25$lambda$17 = KoinModulesKt.createConfigModule$lambda$25$lambda$17(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$17;
                    case 6:
                        createConfigModule$lambda$25$lambda$18 = KoinModulesKt.createConfigModule$lambda$25$lambda$18(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$18;
                    case 7:
                        createConfigModule$lambda$25$lambda$19 = KoinModulesKt.createConfigModule$lambda$25$lambda$19(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$19;
                    case 8:
                        createConfigModule$lambda$25$lambda$20 = KoinModulesKt.createConfigModule$lambda$25$lambda$20(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$20;
                    case 9:
                        createConfigModule$lambda$25$lambda$21 = KoinModulesKt.createConfigModule$lambda$25$lambda$21(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$21;
                    default:
                        createConfigModule$lambda$25$lambda$22 = KoinModulesKt.createConfigModule$lambda$25$lambda$22(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$22;
                }
            }
        }, cVar, CollectionsKt.emptyList())));
        final int i17 = 1;
        module.alpha(new hg.b(new fg.a(bVar, vVar.bravo(LayoutDirectionStateRepository.class), null, new l() { // from class: com.checkout.components.kmp.rememberme.di.a
            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                RememberMeEnvironment createConfigModule$lambda$25$lambda$14;
                LayoutDirectionStateRepository createConfigModule$lambda$25$lambda$23;
                RememberMeLogger createConfigModule$lambda$25$lambda$24;
                String createConfigModule$lambda$25$lambda$15;
                String createConfigModule$lambda$25$lambda$16;
                String createConfigModule$lambda$25$lambda$17;
                Function1 createConfigModule$lambda$25$lambda$18;
                Function1 createConfigModule$lambda$25$lambda$19;
                DesignTokens createConfigModule$lambda$25$lambda$20;
                ResourceProvider createConfigModule$lambda$25$lambda$21;
                LocaleStateRepository createConfigModule$lambda$25$lambda$22;
                og.a aVar = (og.a) obj;
                kg.a aVar2 = (kg.a) obj2;
                switch (i17) {
                    case 0:
                        createConfigModule$lambda$25$lambda$14 = KoinModulesKt.createConfigModule$lambda$25$lambda$14(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$14;
                    case 1:
                        createConfigModule$lambda$25$lambda$23 = KoinModulesKt.createConfigModule$lambda$25$lambda$23(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$23;
                    case 2:
                        createConfigModule$lambda$25$lambda$24 = KoinModulesKt.createConfigModule$lambda$25$lambda$24(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$24;
                    case 3:
                        createConfigModule$lambda$25$lambda$15 = KoinModulesKt.createConfigModule$lambda$25$lambda$15(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$15;
                    case 4:
                        createConfigModule$lambda$25$lambda$16 = KoinModulesKt.createConfigModule$lambda$25$lambda$16(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$16;
                    case 5:
                        createConfigModule$lambda$25$lambda$17 = KoinModulesKt.createConfigModule$lambda$25$lambda$17(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$17;
                    case 6:
                        createConfigModule$lambda$25$lambda$18 = KoinModulesKt.createConfigModule$lambda$25$lambda$18(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$18;
                    case 7:
                        createConfigModule$lambda$25$lambda$19 = KoinModulesKt.createConfigModule$lambda$25$lambda$19(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$19;
                    case 8:
                        createConfigModule$lambda$25$lambda$20 = KoinModulesKt.createConfigModule$lambda$25$lambda$20(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$20;
                    case 9:
                        createConfigModule$lambda$25$lambda$21 = KoinModulesKt.createConfigModule$lambda$25$lambda$21(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$21;
                    default:
                        createConfigModule$lambda$25$lambda$22 = KoinModulesKt.createConfigModule$lambda$25$lambda$22(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$22;
                }
            }
        }, cVar, CollectionsKt.emptyList())));
        final int i18 = 2;
        module.alpha(new hg.b(new fg.a(bVar, vVar.bravo(RememberMeLogger.class), null, new l() { // from class: com.checkout.components.kmp.rememberme.di.a
            @Override // Xd.l
            public final Object invoke(Object obj, Object obj2) {
                RememberMeEnvironment createConfigModule$lambda$25$lambda$14;
                LayoutDirectionStateRepository createConfigModule$lambda$25$lambda$23;
                RememberMeLogger createConfigModule$lambda$25$lambda$24;
                String createConfigModule$lambda$25$lambda$15;
                String createConfigModule$lambda$25$lambda$16;
                String createConfigModule$lambda$25$lambda$17;
                Function1 createConfigModule$lambda$25$lambda$18;
                Function1 createConfigModule$lambda$25$lambda$19;
                DesignTokens createConfigModule$lambda$25$lambda$20;
                ResourceProvider createConfigModule$lambda$25$lambda$21;
                LocaleStateRepository createConfigModule$lambda$25$lambda$22;
                og.a aVar = (og.a) obj;
                kg.a aVar2 = (kg.a) obj2;
                switch (i18) {
                    case 0:
                        createConfigModule$lambda$25$lambda$14 = KoinModulesKt.createConfigModule$lambda$25$lambda$14(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$14;
                    case 1:
                        createConfigModule$lambda$25$lambda$23 = KoinModulesKt.createConfigModule$lambda$25$lambda$23(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$23;
                    case 2:
                        createConfigModule$lambda$25$lambda$24 = KoinModulesKt.createConfigModule$lambda$25$lambda$24(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$24;
                    case 3:
                        createConfigModule$lambda$25$lambda$15 = KoinModulesKt.createConfigModule$lambda$25$lambda$15(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$15;
                    case 4:
                        createConfigModule$lambda$25$lambda$16 = KoinModulesKt.createConfigModule$lambda$25$lambda$16(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$16;
                    case 5:
                        createConfigModule$lambda$25$lambda$17 = KoinModulesKt.createConfigModule$lambda$25$lambda$17(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$17;
                    case 6:
                        createConfigModule$lambda$25$lambda$18 = KoinModulesKt.createConfigModule$lambda$25$lambda$18(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$18;
                    case 7:
                        createConfigModule$lambda$25$lambda$19 = KoinModulesKt.createConfigModule$lambda$25$lambda$19(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$19;
                    case 8:
                        createConfigModule$lambda$25$lambda$20 = KoinModulesKt.createConfigModule$lambda$25$lambda$20(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$20;
                    case 9:
                        createConfigModule$lambda$25$lambda$21 = KoinModulesKt.createConfigModule$lambda$25$lambda$21(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$21;
                    default:
                        createConfigModule$lambda$25$lambda$22 = KoinModulesKt.createConfigModule$lambda$25$lambda$22(rememberMeConfig, aVar, aVar2);
                        return createConfigModule$lambda$25$lambda$22;
                }
            }
        }, cVar, CollectionsKt.emptyList())));
        return Unit.INSTANCE;
    }

    public static final RememberMeEnvironment createConfigModule$lambda$25$lambda$14(RememberMeConfig rememberMeConfig, og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        return rememberMeConfig.getEnvironment();
    }

    public static final String createConfigModule$lambda$25$lambda$15(RememberMeConfig rememberMeConfig, og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        return rememberMeConfig.getPublicKey();
    }

    public static final String createConfigModule$lambda$25$lambda$16(RememberMeConfig rememberMeConfig, og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        return rememberMeConfig.getServiceName();
    }

    public static final String createConfigModule$lambda$25$lambda$17(RememberMeConfig rememberMeConfig, og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        return rememberMeConfig.getServiceVersion();
    }

    public static final Function1 createConfigModule$lambda$25$lambda$18(RememberMeConfig rememberMeConfig, og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        return rememberMeConfig.getOnAuthenticated();
    }

    public static final Function1 createConfigModule$lambda$25$lambda$19(RememberMeConfig rememberMeConfig, og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        return rememberMeConfig.getOnClick();
    }

    public static final DesignTokens createConfigModule$lambda$25$lambda$20(RememberMeConfig rememberMeConfig, og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        DesignTokens designTokens = rememberMeConfig.getDesignTokens();
        if (designTokens == null) {
            return DesignTokens.INSTANCE.getDEFAULT();
        }
        return designTokens;
    }

    public static final ResourceProvider createConfigModule$lambda$25$lambda$21(RememberMeConfig rememberMeConfig, og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        Map<TranslationKey, String> translation = rememberMeConfig.getTranslation();
        if (translation == null) {
            translation = t.alpha;
        }
        return new ResourceProvider(translation);
    }

    public static final LocaleStateRepository createConfigModule$lambda$25$lambda$22(RememberMeConfig rememberMeConfig, og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        return new LocaleStateRepository(rememberMeConfig.getLocale());
    }

    public static final LayoutDirectionStateRepository createConfigModule$lambda$25$lambda$23(RememberMeConfig rememberMeConfig, og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        return LayoutDirectionStateRepository.INSTANCE.fromLocale(rememberMeConfig.getLocale());
    }

    public static final RememberMeLogger createConfigModule$lambda$25$lambda$24(RememberMeConfig rememberMeConfig, og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        RememberMeLogger logger = rememberMeConfig.getLogger();
        if (logger == null) {
            return NoOpRememberMeLogger.INSTANCE;
        }
        return logger;
    }

    private static final Unit dataModule$lambda$5(jg.a module) {
        Intrinsics.echo(module, "$this$module");
        l lVar = new l() { // from class: com.checkout.components.kmp.rememberme.di.KoinModulesKt$dataModule$lambda$5$$inlined$singleOf$default$1
            @Override // Xd.l
            public final AuthInfoRepository invoke(og.a single, kg.a it) {
                Intrinsics.echo(single, "$this$single");
                Intrinsics.echo(it, "it");
                return new AuthInfoRepository();
            }
        };
        c cVar = c.alpha;
        List emptyList = CollectionsKt.emptyList();
        v vVar = u.alpha;
        InterfaceC1772d bravo = vVar.bravo(AuthInfoRepository.class);
        lg.b bVar = mg.a.echo;
        module.alpha(new hg.b(new fg.a(bVar, bravo, null, lVar, cVar, emptyList)));
        module.alpha(new hg.b(new fg.a(bVar, vVar.bravo(ChallengeRepository.class), null, new b(7), cVar, CollectionsKt.emptyList())));
        return Unit.INSTANCE;
    }

    public static final ChallengeRepository dataModule$lambda$5$lambda$4(og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        return new ChallengeRepositoryImpl();
    }

    public static /* synthetic */ OTPViewModel delta(og.a aVar, kg.a aVar2) {
        return viewModelModule$lambda$13$lambda$12(aVar, aVar2);
    }

    public static /* synthetic */ HttpClientFactory echo(og.a aVar, kg.a aVar2) {
        return networkModule$lambda$3$lambda$0(aVar, aVar2);
    }

    public static /* synthetic */ ConsumerRepository foxtrot(og.a aVar, kg.a aVar2) {
        return networkModule$lambda$3$lambda$2(aVar, aVar2);
    }

    @NotNull
    public static final jg.a getDataModule() {
        return dataModule;
    }

    @NotNull
    public static final jg.a getNetworkModule() {
        return networkModule;
    }

    @NotNull
    public static final jg.a getUseCaseModule() {
        return useCaseModule;
    }

    @NotNull
    public static final jg.a getViewModelModule() {
        return viewModelModule;
    }

    public static /* synthetic */ RespondChallengeUseCase hotel(og.a aVar, kg.a aVar2) {
        return useCaseModule$lambda$9$lambda$8(aVar, aVar2);
    }

    public static /* synthetic */ ChallengeRepository india(og.a aVar, kg.a aVar2) {
        return dataModule$lambda$5$lambda$4(aVar, aVar2);
    }

    public static /* synthetic */ CreateHintUseCase lima(og.a aVar, kg.a aVar2) {
        return useCaseModule$lambda$9$lambda$6(aVar, aVar2);
    }

    public static /* synthetic */ AuthenticationViewModel mike(og.a aVar, kg.a aVar2) {
        return viewModelModule$lambda$13$lambda$10(aVar, aVar2);
    }

    private static final Unit networkModule$lambda$3(jg.a module) {
        Intrinsics.echo(module, "$this$module");
        b bVar = new b(1);
        c cVar = c.alpha;
        List emptyList = CollectionsKt.emptyList();
        v vVar = u.alpha;
        InterfaceC1772d bravo = vVar.bravo(HttpClientFactory.class);
        lg.b bVar2 = mg.a.echo;
        module.alpha(new hg.b(new fg.a(bVar2, bravo, null, bVar, cVar, emptyList)));
        module.alpha(new hg.b(new fg.a(bVar2, vVar.bravo(NetworkClient.class), null, new b(2), cVar, CollectionsKt.emptyList())));
        module.alpha(new hg.b(new fg.a(bVar2, vVar.bravo(ConsumerRepository.class), null, new b(3), cVar, CollectionsKt.emptyList())));
        return Unit.INSTANCE;
    }

    public static final HttpClientFactory networkModule$lambda$3$lambda$0(og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        return new HttpClientFactory((RememberMeEnvironment) single.alpha(u.alpha.bravo(RememberMeEnvironment.class), null));
    }

    public static final NetworkClient networkModule$lambda$3$lambda$1(og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        Constants constants = Constants.INSTANCE;
        lg.b service_name = constants.getSERVICE_NAME();
        v vVar = u.alpha;
        return new NetworkClient(null, (String) single.alpha(vVar.bravo(String.class), service_name), (String) single.alpha(vVar.bravo(String.class), constants.getSERVICE_VERSION()), (HttpClientFactory) single.alpha(vVar.bravo(HttpClientFactory.class), null), 1, null);
    }

    public static final ConsumerRepository networkModule$lambda$3$lambda$2(og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        v vVar = u.alpha;
        return new ConsumerRepositoryImpl((NetworkClient) single.alpha(vVar.bravo(NetworkClient.class), null), (RememberMeEnvironment) single.alpha(vVar.bravo(RememberMeEnvironment.class), null));
    }

    public static /* synthetic */ ChallengeViewModel november(og.a aVar, kg.a aVar2) {
        return viewModelModule$lambda$13$lambda$11(aVar, aVar2);
    }

    @NotNull
    public static final List<jg.a> rememberMeModules(@NotNull jg.a configModule) {
        Intrinsics.echo(configModule, "configModule");
        return CollectionsKt.listOf(networkModule, dataModule, useCaseModule, viewModelModule, configModule);
    }

    public static /* synthetic */ NetworkClient sierra(og.a aVar, kg.a aVar2) {
        return networkModule$lambda$3$lambda$1(aVar, aVar2);
    }

    private static final Unit useCaseModule$lambda$9(jg.a module) {
        Intrinsics.echo(module, "$this$module");
        b bVar = new b(4);
        c cVar = c.alpha;
        List emptyList = CollectionsKt.emptyList();
        v vVar = u.alpha;
        InterfaceC1772d bravo = vVar.bravo(CreateHintUseCase.class);
        lg.b bVar2 = mg.a.echo;
        module.alpha(new hg.b(new fg.a(bVar2, bravo, null, bVar, cVar, emptyList)));
        module.alpha(new hg.b(new fg.a(bVar2, vVar.bravo(CreateHintChallengeUseCase.class), null, new b(5), cVar, CollectionsKt.emptyList())));
        module.alpha(new hg.b(new fg.a(bVar2, vVar.bravo(RespondChallengeUseCase.class), null, new b(6), cVar, CollectionsKt.emptyList())));
        return Unit.INSTANCE;
    }

    public static final CreateHintUseCase useCaseModule$lambda$9$lambda$6(og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        v vVar = u.alpha;
        return new CreateHintUseCase((ConsumerRepository) single.alpha(vVar.bravo(ConsumerRepository.class), null), (ChallengeRepository) single.alpha(vVar.bravo(ChallengeRepository.class), null), (AuthInfoRepository) single.alpha(vVar.bravo(AuthInfoRepository.class), null), (RememberMeLogger) single.alpha(vVar.bravo(RememberMeLogger.class), null));
    }

    public static final CreateHintChallengeUseCase useCaseModule$lambda$9$lambda$7(og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        v vVar = u.alpha;
        return new CreateHintChallengeUseCaseImpl((ConsumerRepository) single.alpha(vVar.bravo(ConsumerRepository.class), null), (String) single.alpha(vVar.bravo(String.class), Constants.INSTANCE.getPUBLIC_KEY_NAME()), (RememberMeLogger) single.alpha(vVar.bravo(RememberMeLogger.class), null));
    }

    public static final RespondChallengeUseCase useCaseModule$lambda$9$lambda$8(og.a single, kg.a it) {
        Intrinsics.echo(single, "$this$single");
        Intrinsics.echo(it, "it");
        v vVar = u.alpha;
        return new RespondChallengeUseCaseImpl((ConsumerRepository) single.alpha(vVar.bravo(ConsumerRepository.class), null), (RememberMeLogger) single.alpha(vVar.bravo(RememberMeLogger.class), null));
    }

    private static final Unit viewModelModule$lambda$13(jg.a module) {
        Intrinsics.echo(module, "$this$module");
        S4.b bVar = new S4.b(28);
        c cVar = c.purple;
        List emptyList = CollectionsKt.emptyList();
        v vVar = u.alpha;
        InterfaceC1772d bravo = vVar.bravo(AuthenticationViewModel.class);
        lg.b bVar2 = mg.a.echo;
        module.alpha(new hg.b(new fg.a(bVar2, bravo, null, bVar, cVar, emptyList)));
        module.alpha(new hg.b(new fg.a(bVar2, vVar.bravo(ChallengeViewModel.class), null, new S4.b(29), cVar, CollectionsKt.emptyList())));
        module.alpha(new hg.b(new fg.a(bVar2, vVar.bravo(OTPViewModel.class), null, new b(0), cVar, CollectionsKt.emptyList())));
        return Unit.INSTANCE;
    }

    public static final AuthenticationViewModel viewModelModule$lambda$13$lambda$10(og.a factory, kg.a it) {
        Intrinsics.echo(factory, "$this$factory");
        Intrinsics.echo(it, "it");
        v vVar = u.alpha;
        return new AuthenticationViewModel((ChallengeRepository) factory.alpha(vVar.bravo(ChallengeRepository.class), null), (AuthInfoRepository) factory.alpha(vVar.bravo(AuthInfoRepository.class), null));
    }

    public static final ChallengeViewModel viewModelModule$lambda$13$lambda$11(og.a factory, kg.a it) {
        Intrinsics.echo(factory, "$this$factory");
        Intrinsics.echo(it, "it");
        v vVar = u.alpha;
        return new ChallengeViewModel((AuthInfoRepository) factory.alpha(vVar.bravo(AuthInfoRepository.class), null), (CreateHintChallengeUseCase) factory.alpha(vVar.bravo(CreateHintChallengeUseCase.class), null), (ChallengeRepository) factory.alpha(vVar.bravo(ChallengeRepository.class), null));
    }

    public static final OTPViewModel viewModelModule$lambda$13$lambda$12(og.a factory, kg.a it) {
        Intrinsics.echo(factory, "$this$factory");
        Intrinsics.echo(it, "it");
        v vVar = u.alpha;
        return new OTPViewModel((ChallengeRepository) factory.alpha(vVar.bravo(ChallengeRepository.class), null), (RespondChallengeUseCase) factory.alpha(vVar.bravo(RespondChallengeUseCase.class), null), (AuthInfoRepository) factory.alpha(vVar.bravo(AuthInfoRepository.class), null), (CreateHintChallengeUseCase) factory.alpha(vVar.bravo(CreateHintChallengeUseCase.class), null), (Function1) factory.alpha(vVar.bravo(Function1.class), Constants.INSTANCE.getON_AUTHENTICATED_NAME()), (RememberMeLogger) factory.alpha(vVar.bravo(RememberMeLogger.class), null), null, null, 192, null);
    }
}
