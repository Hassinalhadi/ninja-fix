package com.checkout.components.rememberme.rememberme;

import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.rememberme.C0988v0;
import com.checkout.components.rememberme.model.GetWalletResponse;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ad;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BS\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/rememberme/rememberme/RememberMeNavHostViewModel;", "Landroidx/lifecycle/Y;", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "Lcom/checkout/components/rememberme/model/GetWalletResponse;", "walletRepository", "Lcom/checkout/components/rememberme/usecase/MapJWTTokenToWalletUseCase;", "mapJWTTokenToWallet", "Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;", "Lcom/checkout/components/rememberme/model/RememberMeScreen;", "screenEventNavigationRepository", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "", "onError", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "<init>", "(Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;Lcom/checkout/components/rememberme/usecase/MapJWTTokenToWalletUseCase;Lcom/checkout/components/interfaces/data/PrimitiveSharedFlowRepository;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/interfaces/insight/Logger;)V", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RememberMeNavHostViewModel extends Y {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final PrimitiveStateFlowRepository f6207a;

    /* renamed from: b, reason: collision with root package name */
    private final MapJWTTokenToWalletUseCase f6208b;

    /* renamed from: c, reason: collision with root package name */
    private final PrimitiveSharedFlowRepository f6209c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f6210d;
    private final LogDetails e;

    /* renamed from: f, reason: collision with root package name */
    private final Logger f6211f;

    public RememberMeNavHostViewModel(@NotNull PrimitiveStateFlowRepository<GetWalletResponse> walletRepository, @NotNull MapJWTTokenToWalletUseCase mapJWTTokenToWallet, @NotNull PrimitiveSharedFlowRepository<RememberMeScreen> screenEventNavigationRepository, @Nullable Function1<? super CheckoutError, Unit> function1, @NotNull LogDetails logDetails, @NotNull Logger logger) {
        Intrinsics.echo(walletRepository, "walletRepository");
        Intrinsics.echo(mapJWTTokenToWallet, "mapJWTTokenToWallet");
        Intrinsics.echo(screenEventNavigationRepository, "screenEventNavigationRepository");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(logger, "logger");
        this.f6207a = walletRepository;
        this.f6208b = mapJWTTokenToWallet;
        this.f6209c = screenEventNavigationRepository;
        this.f6210d = function1;
        this.e = logDetails;
        this.f6211f = logger;
        ad.zulu(T.hotel(this), null, null, new C0988v0(this, null), 3);
    }
}
