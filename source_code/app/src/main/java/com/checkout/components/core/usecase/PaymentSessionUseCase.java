package com.checkout.components.core.usecase;

import C1.t;
import Nd.c;
import com.checkout.components.core.E;
import com.checkout.components.core.F;
import com.checkout.components.core.network.model.response.ErrorResponse;
import com.checkout.components.core.utils.constants.CoreConstants;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.squareup.moshi.JsonAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import vg.aq;
import yf.InterfaceC3439i;
import yf.s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/checkout/components/core/usecase/PaymentSessionUseCase;", "T", "", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/checkout/components/core/network/model/response/ErrorResponse;", "errorResponseAdapter", "<init>", "(Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "errorCode", "Lkotlin/Function1;", "LNd/c;", "Lvg/aq;", "request", "Lyf/i;", "Lcom/checkout/components/core/network/model/response/ResultWrapper;", "invoke$core_standardRelease", "(Lcom/checkout/components/interfaces/error/CheckoutErrorCode;Lkotlin/jvm/functions/Function1;)Lyf/i;", "invoke", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PaymentSessionUseCase<T> {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final JsonAdapter f5061a;

    public PaymentSessionUseCase(@NotNull JsonAdapter<ErrorResponse> errorResponseAdapter) {
        Intrinsics.echo(errorResponseAdapter, "errorResponseAdapter");
        this.f5061a = errorResponseAdapter;
    }

    public static final List access$buildStackTrace(PaymentSessionUseCase paymentSessionUseCase, String str, String str2) {
        paymentSessionUseCase.getClass();
        return ab.juliet(new StackTraceElement(CoreConstants.PAYMENT_SESSION_USE_CASE, str, StringsKt.b(CoreConstants.INSTANCE.getWHITESPACE_REGEX().foxtrot(str2, " ")).toString(), -1));
    }

    public static final ErrorResponse access$parseErrorBodySafely(PaymentSessionUseCase paymentSessionUseCase, String str) {
        Object m206constructorimpl;
        paymentSessionUseCase.getClass();
        Object obj = null;
        if (str == null || StringsKt.gray(str)) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl((ErrorResponse) paymentSessionUseCase.f5061a.fromJson(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m206constructorimpl instanceof k)) {
            obj = m206constructorimpl;
        }
        return (ErrorResponse) obj;
    }

    public static final String access$readErrorBodySafely(PaymentSessionUseCase paymentSessionUseCase, aq aqVar) {
        Object m206constructorimpl;
        String str;
        paymentSessionUseCase.getClass();
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            ResponseBody responseBody = aqVar.charlie;
            if (responseBody != null) {
                str = responseBody.string();
            } else {
                str = null;
            }
            m206constructorimpl = Result.m206constructorimpl(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m206constructorimpl instanceof k)) {
            obj = m206constructorimpl;
        }
        return (String) obj;
    }

    @NotNull
    public final InterfaceC3439i invoke$core_standardRelease(@NotNull CheckoutErrorCode errorCode, @NotNull Function1<? super c<? super aq<T>>, ? extends Object> request) {
        Intrinsics.echo(errorCode, "errorCode");
        Intrinsics.echo(request, "request");
        return new s(new t(new E(request, this, errorCode, null)), new F(errorCode, null));
    }
}
