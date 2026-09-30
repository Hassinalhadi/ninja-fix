package com.checkout.components.card.operations.network.extension;

import Tf.m;
import com.checkout.components.card.operations.network.model.ErrorResponse;
import com.checkout.components.card.operations.network.model.NetworkApiResponse;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "S", "Lokhttp3/OkHttpClient;", "Lokhttp3/Request;", "request", "Lcom/squareup/moshi/JsonAdapter;", "successAdapter", "Lcom/checkout/components/card/operations/network/model/ErrorResponse;", "errorAdapter", "Lcom/checkout/components/card/operations/network/model/NetworkApiResponse;", "executeHttpRequest", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)Lcom/checkout/components/card/operations/network/model/NetworkApiResponse;", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OkHttpClientExtensionKt {
    public static final NetworkApiResponse.Error.ServerError access$provideErrorResult(Response response, JsonAdapter jsonAdapter) {
        Object m206constructorimpl;
        ErrorResponse errorResponse;
        m source;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            ResponseBody body = response.body();
            if (body != null && (source = body.getSource()) != null) {
                errorResponse = (ErrorResponse) jsonAdapter.fromJson(source);
            } else {
                errorResponse = null;
            }
            m206constructorimpl = Result.m206constructorimpl(errorResponse);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m206constructorimpl instanceof k)) {
            obj = m206constructorimpl;
        }
        return new NetworkApiResponse.Error.ServerError((ErrorResponse) obj, response.code());
    }

    public static final <S> NetworkApiResponse<S> executeHttpRequest(OkHttpClient okHttpClient, Request request, JsonAdapter<S> successAdapter, JsonAdapter<ErrorResponse> errorAdapter) {
        NetworkApiResponse<S> internalError;
        Intrinsics.echo(okHttpClient, "<this>");
        Intrinsics.echo(request, "request");
        Intrinsics.echo(successAdapter, "successAdapter");
        Intrinsics.echo(errorAdapter, "errorAdapter");
        try {
            Response execute = FirebasePerfOkHttpClient.execute(okHttpClient.newCall(request));
            try {
                if (execute.getIsSuccessful()) {
                    try {
                        ResponseBody body = execute.body();
                        if (body != null) {
                            S fromJson = successAdapter.fromJson(body.getSource());
                            if (fromJson != null) {
                                Intrinsics.checkNotNull(fromJson);
                                internalError = new NetworkApiResponse.Success<>(fromJson, execute.headers());
                            } else {
                                Intrinsics.juliet();
                                throw null;
                            }
                        } else {
                            throw new IllegalStateException(("Response body is null with httpStatus=" + execute.code()).toString());
                        }
                    } catch (Exception e) {
                        internalError = new NetworkApiResponse.Error.InternalError(e);
                    }
                } else {
                    internalError = access$provideErrorResult(execute, errorAdapter);
                }
                execute.close();
                return internalError;
            } finally {
            }
        } catch (Throwable th) {
            return new NetworkApiResponse.Error.NetworkError(th);
        }
    }
}
