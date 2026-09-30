package com.checkout.components.card.operations.network;

import Nd.c;
import com.checkout.components.card.operations.network.extension.OkHttpClientExtensionKt;
import com.checkout.components.card.operations.network.model.CardMetaDataRequest;
import com.checkout.components.card.operations.network.model.CardMetaDataResponse;
import com.checkout.components.card.operations.network.model.ErrorResponse;
import com.checkout.components.card.operations.network.model.NetworkApiResponse;
import com.checkout.components.card.operations.network.utils.NetworkConstants;
import com.checkout.components.card.operations.tokenisation.network.model.TokenRequest;
import com.checkout.components.interfaces.model.TokenDetailsResponse;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\f\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/card/operations/network/NetworkApiClientImpl;", "Lcom/checkout/components/card/operations/network/NetworkApiClient;", "", "tokenizationWebServiceUrl", "cardMetaDataWebServiceUrl", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lcom/squareup/moshi/Moshi;", "moshiClient", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/OkHttpClient;Lcom/squareup/moshi/Moshi;)V", "Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;", "request", "Lokhttp3/Headers;", "headers", "Lcom/checkout/components/card/operations/network/model/NetworkApiResponse;", "Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "sendCardTokenRequest", "(Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;Lokhttp3/Headers;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/components/card/operations/network/model/CardMetaDataRequest;", "Lcom/checkout/components/card/operations/network/model/CardMetaDataResponse;", "sendCardMetaDataRequest", "(Lcom/checkout/components/card/operations/network/model/CardMetaDataRequest;LNd/c;)Ljava/lang/Object;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkApiClientImpl implements NetworkApiClient {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final String f4277a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4278b;

    /* renamed from: c, reason: collision with root package name */
    private final OkHttpClient f4279c;

    /* renamed from: d, reason: collision with root package name */
    private final Moshi f4280d;

    public NetworkApiClientImpl(@NotNull String tokenizationWebServiceUrl, @NotNull String cardMetaDataWebServiceUrl, @NotNull OkHttpClient okHttpClient, @NotNull Moshi moshiClient) {
        Intrinsics.echo(tokenizationWebServiceUrl, "tokenizationWebServiceUrl");
        Intrinsics.echo(cardMetaDataWebServiceUrl, "cardMetaDataWebServiceUrl");
        Intrinsics.echo(okHttpClient, "okHttpClient");
        Intrinsics.echo(moshiClient, "moshiClient");
        this.f4277a = tokenizationWebServiceUrl;
        this.f4278b = cardMetaDataWebServiceUrl;
        this.f4279c = okHttpClient;
        this.f4280d = moshiClient;
    }

    @Override // com.checkout.components.card.operations.network.NetworkApiClient
    @Nullable
    public final Object sendCardMetaDataRequest(@NotNull CardMetaDataRequest cardMetaDataRequest, @NotNull c<? super NetworkApiResponse<CardMetaDataResponse>> cVar) {
        Object internalError;
        MediaType contentTypeValue = NetworkConstants.INSTANCE.getContentTypeValue();
        String str = this.f4278b;
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String json = this.f4280d.adapter(CardMetaDataRequest.class).toJson(cardMetaDataRequest);
        Intrinsics.delta(json, "toJson(...)");
        Request build = new Request.Builder().url(str).post(companion.create(json, contentTypeValue)).build();
        OkHttpClient okHttpClient = this.f4279c;
        JsonAdapter adapter = this.f4280d.adapter(CardMetaDataResponse.class);
        Intrinsics.delta(adapter, "adapter(...)");
        JsonAdapter adapter2 = this.f4280d.adapter(ErrorResponse.class);
        Intrinsics.delta(adapter2, "adapter(...)");
        try {
            Response execute = FirebasePerfOkHttpClient.execute(okHttpClient.newCall(build));
            try {
                if (execute.getIsSuccessful()) {
                    try {
                        ResponseBody body = execute.body();
                        if (body != null) {
                            Object fromJson = adapter.fromJson(body.getBodySource());
                            if (fromJson != null) {
                                Intrinsics.checkNotNull(fromJson);
                                internalError = new NetworkApiResponse.Success(fromJson, execute.headers());
                            } else {
                                throw new IllegalStateException(("JSON deserialization returned null for CardMetaDataResponse with httpStatus=" + execute.code()).toString());
                            }
                        } else {
                            throw new IllegalStateException(("Response body is null with httpStatus=" + execute.code()).toString());
                        }
                    } catch (Exception e) {
                        internalError = new NetworkApiResponse.Error.InternalError(e);
                    }
                } else {
                    internalError = OkHttpClientExtensionKt.access$provideErrorResult(execute, adapter2);
                }
                execute.close();
                return internalError;
            } finally {
            }
        } catch (Throwable th) {
            return new NetworkApiResponse.Error.NetworkError(th);
        }
    }

    @Override // com.checkout.components.card.operations.network.NetworkApiClient
    @Nullable
    public final Object sendCardTokenRequest(@NotNull TokenRequest tokenRequest, @Nullable Headers headers, @NotNull c<? super NetworkApiResponse<TokenDetailsResponse>> cVar) {
        Object internalError;
        MediaType jsonMediaType = NetworkConstants.INSTANCE.getJsonMediaType();
        String str = this.f4277a;
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String json = this.f4280d.adapter(TokenRequest.class).toJson(tokenRequest);
        Intrinsics.delta(json, "toJson(...)");
        Request.Builder post = new Request.Builder().url(str).post(companion.create(json, jsonMediaType));
        if (headers != null) {
            post.headers(headers);
        }
        Request build = post.build();
        OkHttpClient okHttpClient = this.f4279c;
        JsonAdapter adapter = this.f4280d.adapter(TokenDetailsResponse.class);
        Intrinsics.delta(adapter, "adapter(...)");
        JsonAdapter adapter2 = this.f4280d.adapter(ErrorResponse.class);
        Intrinsics.delta(adapter2, "adapter(...)");
        try {
            Response execute = FirebasePerfOkHttpClient.execute(okHttpClient.newCall(build));
            try {
                if (execute.getIsSuccessful()) {
                    try {
                        ResponseBody body = execute.body();
                        if (body != null) {
                            Object fromJson = adapter.fromJson(body.getBodySource());
                            if (fromJson != null) {
                                Intrinsics.checkNotNull(fromJson);
                                internalError = new NetworkApiResponse.Success(fromJson, execute.headers());
                            } else {
                                throw new IllegalStateException(("JSON deserialization returned null for TokenDetailsResponse with httpStatus=" + execute.code()).toString());
                            }
                        } else {
                            throw new IllegalStateException(("Response body is null with httpStatus=" + execute.code()).toString());
                        }
                    } catch (Exception e) {
                        internalError = new NetworkApiResponse.Error.InternalError(e);
                    }
                } else {
                    internalError = OkHttpClientExtensionKt.access$provideErrorResult(execute, adapter2);
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
