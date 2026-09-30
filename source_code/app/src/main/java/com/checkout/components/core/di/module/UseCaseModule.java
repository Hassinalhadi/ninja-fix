package com.checkout.components.core.di.module;

import com.checkout.components.core.domain.repository.PaymentRepository;
import com.checkout.components.core.network.model.response.ErrorResponse;
import com.checkout.components.core.usecase.GetPaymentSessionUseCase;
import com.checkout.components.core.usecase.PayPaymentSessionUseCase;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001e\u0010\r\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, d2 = {"Lcom/checkout/components/core/di/module/UseCaseModule;", "", "<init>", "()V", "errorResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/core/network/model/response/ErrorResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "providePayPaymentSessionUseCase", "Lcom/checkout/components/core/usecase/PayPaymentSessionUseCase;", "repository", "Lcom/checkout/components/core/domain/repository/PaymentRepository;", "provideGetPaymentSessionUseCase", "Lcom/checkout/components/core/usecase/GetPaymentSessionUseCase;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UseCaseModule {
    public static final int $stable = 0;

    @NotNull
    public final JsonAdapter<ErrorResponse> errorResponseAdapter(@NotNull Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        JsonAdapter<ErrorResponse> adapter = moshi.adapter(ErrorResponse.class);
        Intrinsics.delta(adapter, "adapter(...)");
        return adapter;
    }

    @NotNull
    public final GetPaymentSessionUseCase provideGetPaymentSessionUseCase(@NotNull JsonAdapter<ErrorResponse> errorResponseAdapter, @NotNull PaymentRepository repository) {
        Intrinsics.echo(errorResponseAdapter, "errorResponseAdapter");
        Intrinsics.echo(repository, "repository");
        return new GetPaymentSessionUseCase(errorResponseAdapter, repository);
    }

    @NotNull
    public final PayPaymentSessionUseCase providePayPaymentSessionUseCase(@NotNull JsonAdapter<ErrorResponse> errorResponseAdapter, @NotNull PaymentRepository repository) {
        Intrinsics.echo(errorResponseAdapter, "errorResponseAdapter");
        Intrinsics.echo(repository, "repository");
        return new PayPaymentSessionUseCase(errorResponseAdapter, repository);
    }
}
