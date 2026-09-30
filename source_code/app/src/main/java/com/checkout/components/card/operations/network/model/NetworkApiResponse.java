package com.checkout.components.card.operations.network.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/card/operations/network/model/NetworkApiResponse;", "S", "", "Success", "Error", "Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error;", "Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Success;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class NetworkApiResponse<S> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error;", "Lcom/checkout/components/card/operations/network/model/NetworkApiResponse;", "", "ServerError", "NetworkError", "InternalError", "Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error$InternalError;", "Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error$NetworkError;", "Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error$ServerError;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class Error extends NetworkApiResponse {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error$InternalError;", "Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", Constants.COPY_TYPE, "(Ljava/lang/Throwable;)Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error$InternalError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getThrowable", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class InternalError extends Error {
            public static final int $stable = 8;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Throwable throwable;

            public InternalError(@Nullable Throwable th) {
                super(null);
                this.throwable = th;
            }

            public static InternalError copy$default(InternalError internalError, Throwable th, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    th = internalError.throwable;
                }
                internalError.getClass();
                return new InternalError(th);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @NotNull
            public final InternalError copy(@Nullable Throwable throwable) {
                return new InternalError(throwable);
            }

            public final boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InternalError) && Intrinsics.areEqual(this.throwable, ((InternalError) other).throwable);
            }

            @Nullable
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final int hashCode() {
                Throwable th = this.throwable;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            @NotNull
            public final String toString() {
                return "InternalError(throwable=" + this.throwable + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error$NetworkError;", "Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", Constants.COPY_TYPE, "(Ljava/lang/Throwable;)Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error$NetworkError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getThrowable", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class NetworkError extends Error {
            public static final int $stable = 8;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkError(@NotNull Throwable throwable) {
                super(null);
                Intrinsics.echo(throwable, "throwable");
                this.throwable = throwable;
            }

            public static NetworkError copy$default(NetworkError networkError, Throwable throwable, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    throwable = networkError.throwable;
                }
                networkError.getClass();
                Intrinsics.echo(throwable, "throwable");
                return new NetworkError(throwable);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @NotNull
            public final NetworkError copy(@NotNull Throwable throwable) {
                Intrinsics.echo(throwable, "throwable");
                return new NetworkError(throwable);
            }

            public final boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NetworkError) && Intrinsics.areEqual(this.throwable, ((NetworkError) other).throwable);
            }

            @NotNull
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final int hashCode() {
                return this.throwable.hashCode();
            }

            @NotNull
            public final String toString() {
                return "NetworkError(throwable=" + this.throwable + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error$ServerError;", "Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error;", "Lcom/checkout/components/card/operations/network/model/ErrorResponse;", "body", "", "code", "<init>", "(Lcom/checkout/components/card/operations/network/model/ErrorResponse;I)V", "component1", "()Lcom/checkout/components/card/operations/network/model/ErrorResponse;", "component2", "()I", Constants.COPY_TYPE, "(Lcom/checkout/components/card/operations/network/model/ErrorResponse;I)Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Error$ServerError;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/card/operations/network/model/ErrorResponse;", "getBody", "b", "I", "getCode", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class ServerError extends Error {
            public static final int $stable = 8;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final ErrorResponse body;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final int code;

            public ServerError(@Nullable ErrorResponse errorResponse, int i4) {
                super(null);
                this.body = errorResponse;
                this.code = i4;
            }

            public static ServerError copy$default(ServerError serverError, ErrorResponse errorResponse, int i4, int i5, Object obj) {
                if ((i5 & 1) != 0) {
                    errorResponse = serverError.body;
                }
                if ((i5 & 2) != 0) {
                    i4 = serverError.code;
                }
                serverError.getClass();
                return new ServerError(errorResponse, i4);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final ErrorResponse getBody() {
                return this.body;
            }

            /* renamed from: component2, reason: from getter */
            public final int getCode() {
                return this.code;
            }

            @NotNull
            public final ServerError copy(@Nullable ErrorResponse body, int code) {
                return new ServerError(body, code);
            }

            public final boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ServerError)) {
                    return false;
                }
                ServerError serverError = (ServerError) other;
                return Intrinsics.areEqual(this.body, serverError.body) && this.code == serverError.code;
            }

            @Nullable
            public final ErrorResponse getBody() {
                return this.body;
            }

            public final int getCode() {
                return this.code;
            }

            public final int hashCode() {
                ErrorResponse errorResponse = this.body;
                return this.code + ((errorResponse == null ? 0 : errorResponse.hashCode()) * 31);
            }

            @NotNull
            public final String toString() {
                return "ServerError(body=" + this.body + ", code=" + this.code + ")";
            }
        }

        public Error(DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Success;", "T", "Lcom/checkout/components/card/operations/network/model/NetworkApiResponse;", "body", "Lokhttp3/Headers;", "headers", "<init>", "(Ljava/lang/Object;Lokhttp3/Headers;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lokhttp3/Headers;", Constants.COPY_TYPE, "(Ljava/lang/Object;Lokhttp3/Headers;)Lcom/checkout/components/card/operations/network/model/NetworkApiResponse$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getBody", "b", "Lokhttp3/Headers;", "getHeaders", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Success<T> extends NetworkApiResponse<T> {
        public static final int $stable = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object body;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Headers headers;

        public Success(T t5, @Nullable Headers headers) {
            super(null);
            this.body = t5;
            this.headers = headers;
        }

        public static Success copy$default(Success success, Object obj, Headers headers, int i4, Object obj2) {
            if ((i4 & 1) != 0) {
                obj = success.body;
            }
            if ((i4 & 2) != 0) {
                headers = success.headers;
            }
            success.getClass();
            return new Success(obj, headers);
        }

        public final T component1() {
            return (T) this.body;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }

        @NotNull
        public final Success<T> copy(T body, @Nullable Headers headers) {
            return new Success<>(body, headers);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.body, success.body) && Intrinsics.areEqual(this.headers, success.headers);
        }

        public final T getBody() {
            return (T) this.body;
        }

        @Nullable
        public final Headers getHeaders() {
            return this.headers;
        }

        public final int hashCode() {
            Object obj = this.body;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Headers headers = this.headers;
            return hashCode + (headers != null ? headers.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "Success(body=" + this.body + ", headers=" + this.headers + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(Object obj, Headers headers, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            headers = (i4 & 2) != 0 ? null : headers;
            this.body = obj;
            this.headers = headers;
        }
    }

    public NetworkApiResponse(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
