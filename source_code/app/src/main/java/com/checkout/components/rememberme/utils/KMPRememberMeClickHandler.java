package com.checkout.components.rememberme.utils;

import com.checkout.components.interfaces.component.RememberMeConfiguration;
import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.kmp.rememberme.shared.model.ClickTarget;
import com.checkout.components.rememberme.F;
import com.checkout.components.rememberme.model.RememberMeScreen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B)\b\u0007\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/rememberme/utils/KMPRememberMeClickHandler;", "", "configRepository", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", "screenEventNavigationRepository", "Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;", "Lcom/checkout/components/rememberme/model/RememberMeScreen;", "<init>", "(Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;)V", "getConfigRepository$annotations", "()V", "infoTextNavigator", "Lkotlin/Function0;", "", "setInfoTextNavigator", "navigator", "setInfoTextNavigator$rememberme_standardRelease", "onClick", "target", "Lcom/checkout/components/kmp/rememberme/shared/model/ClickTarget;", "onClick$rememberme_standardRelease", "(Lcom/checkout/components/kmp/rememberme/shared/model/ClickTarget;)Lkotlin/Unit;", "Companion", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KMPRememberMeClickHandler {

    @Nullable
    private static volatile KMPRememberMeClickHandler instance;

    @NotNull
    private final PrimitiveStateFlowRepository<RememberMeConfiguration> configRepository;

    @Nullable
    private Function0<Unit> infoTextNavigator;

    @NotNull
    private final PrimitiveSharedFlowRepository<RememberMeScreen> screenEventNavigationRepository;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u0015\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/rememberme/utils/KMPRememberMeClickHandler$Companion;", "", "<init>", "()V", "instance", "Lcom/checkout/components/rememberme/utils/KMPRememberMeClickHandler;", "getInstance", "setInstance", "", "newInstance", "staticOnClick", "target", "Lcom/checkout/components/kmp/rememberme/shared/model/ClickTarget;", "staticOnClick$rememberme_standardRelease", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final KMPRememberMeClickHandler getInstance() {
            return KMPRememberMeClickHandler.instance;
        }

        public final void setInstance(@NotNull KMPRememberMeClickHandler newInstance) {
            Intrinsics.echo(newInstance, "newInstance");
            KMPRememberMeClickHandler.instance = newInstance;
        }

        public final void staticOnClick$rememberme_standardRelease(@NotNull ClickTarget target) {
            Intrinsics.echo(target, "target");
            KMPRememberMeClickHandler companion = getInstance();
            if (companion != null) {
                companion.onClick$rememberme_standardRelease(target);
            }
        }

        private Companion() {
        }
    }

    public KMPRememberMeClickHandler(@NotNull PrimitiveStateFlowRepository<RememberMeConfiguration> configRepository, @NotNull PrimitiveSharedFlowRepository<RememberMeScreen> screenEventNavigationRepository) {
        Intrinsics.echo(configRepository, "configRepository");
        Intrinsics.echo(screenEventNavigationRepository, "screenEventNavigationRepository");
        this.configRepository = configRepository;
        this.screenEventNavigationRepository = screenEventNavigationRepository;
        INSTANCE.setInstance(this);
    }

    private static /* synthetic */ void getConfigRepository$annotations() {
    }

    @Nullable
    public final Unit onClick$rememberme_standardRelease(@NotNull ClickTarget target) {
        Intrinsics.echo(target, "target");
        int i4 = F.f5751a[target.ordinal()];
        RememberMeConfiguration rememberMeConfiguration = null;
        if (i4 != 1 && i4 != 2) {
            if (i4 == 3) {
                Function0<Unit> function0 = this.infoTextNavigator;
                if (function0 == null) {
                    return null;
                }
                function0.invoke();
                return Unit.INSTANCE;
            }
            throw new NoWhenBranchMatchedException();
        }
        this.screenEventNavigationRepository.tryEmit(RememberMeScreen.Alternative.INSTANCE);
        RememberMeConfiguration rememberMeConfiguration2 = (RememberMeConfiguration) this.configRepository.getFlow().getValue();
        PrimitiveStateFlowRepository<RememberMeConfiguration> primitiveStateFlowRepository = this.configRepository;
        if (rememberMeConfiguration2 != null) {
            rememberMeConfiguration = RememberMeConfiguration.copy$default(rememberMeConfiguration2, null, null, null, null, 14, null);
        }
        primitiveStateFlowRepository.update((PrimitiveStateFlowRepository<RememberMeConfiguration>) rememberMeConfiguration);
        return Unit.INSTANCE;
    }

    public final void setInfoTextNavigator$rememberme_standardRelease(@NotNull Function0<Unit> navigator) {
        Intrinsics.echo(navigator, "navigator");
        this.infoTextNavigator = navigator;
    }
}
