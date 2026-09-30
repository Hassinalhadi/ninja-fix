package com.checkout.components.core.network.model.response;

import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import ge.InterfaceC1772d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/core/network/model/response/ResultWrapper;", "T", "", "Success", "Error", "Lcom/checkout/components/core/network/model/response/ResultWrapper$Error;", "Lcom/checkout/components/core/network/model/response/ResultWrapper$Success;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ResultWrapper<T> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ`\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0016R\u001f\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u001aR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001cR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001e¨\u0006;"}, d2 = {"Lcom/checkout/components/core/network/model/response/ResultWrapper$Error;", "Lcom/checkout/components/core/network/model/response/ResultWrapper;", "", "Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "code", "", Constants.KEY_MESSAGE, "Lge/d;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "checkoutErrorClass", "", "httpStatusCode", "", "Ljava/lang/StackTraceElement;", "stacktrace", "Lcom/checkout/components/core/network/model/response/ErrorResponse;", "errorResponse", "<init>", "(Lcom/checkout/components/interfaces/error/CheckoutErrorCode;Ljava/lang/String;Lge/d;Ljava/lang/Integer;Ljava/util/List;Lcom/checkout/components/core/network/model/response/ErrorResponse;)V", "component1", "()Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "component2", "()Ljava/lang/String;", "component3", "()Lge/d;", "component4", "()Ljava/lang/Integer;", "component5", "()Ljava/util/List;", "component6", "()Lcom/checkout/components/core/network/model/response/ErrorResponse;", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/error/CheckoutErrorCode;Ljava/lang/String;Lge/d;Ljava/lang/Integer;Ljava/util/List;Lcom/checkout/components/core/network/model/response/ErrorResponse;)Lcom/checkout/components/core/network/model/response/ResultWrapper$Error;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "getCode", "b", "Ljava/lang/String;", "getMessage", "c", "Lge/d;", "getCheckoutErrorClass", Constants.INAPP_DATA_TAG, "Ljava/lang/Integer;", "getHttpStatusCode", "e", "Ljava/util/List;", "getStacktrace", "f", "Lcom/checkout/components/core/network/model/response/ErrorResponse;", "getErrorResponse", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Error extends ResultWrapper {
        public static final int $stable = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final CheckoutErrorCode code;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1772d checkoutErrorClass;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Integer httpStatusCode;

        /* renamed from: e, reason: from kotlin metadata */
        private final List stacktrace;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final ErrorResponse errorResponse;

        public /* synthetic */ Error(CheckoutErrorCode checkoutErrorCode, String str, InterfaceC1772d interfaceC1772d, Integer num, List list, ErrorResponse errorResponse, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(checkoutErrorCode, str, interfaceC1772d, num, (i4 & 16) != 0 ? null : list, (i4 & 32) != 0 ? null : errorResponse);
        }

        public static /* synthetic */ Error copy$default(Error error, CheckoutErrorCode checkoutErrorCode, String str, InterfaceC1772d interfaceC1772d, Integer num, List list, ErrorResponse errorResponse, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                checkoutErrorCode = error.code;
            }
            if ((i4 & 2) != 0) {
                str = error.message;
            }
            if ((i4 & 4) != 0) {
                interfaceC1772d = error.checkoutErrorClass;
            }
            if ((i4 & 8) != 0) {
                num = error.httpStatusCode;
            }
            if ((i4 & 16) != 0) {
                list = error.stacktrace;
            }
            if ((i4 & 32) != 0) {
                errorResponse = error.errorResponse;
            }
            List list2 = list;
            ErrorResponse errorResponse2 = errorResponse;
            return error.copy(checkoutErrorCode, str, interfaceC1772d, num, list2, errorResponse2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CheckoutErrorCode getCode() {
            return this.code;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final InterfaceC1772d getCheckoutErrorClass() {
            return this.checkoutErrorClass;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

        @Nullable
        public final List<StackTraceElement> component5() {
            return this.stacktrace;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final ErrorResponse getErrorResponse() {
            return this.errorResponse;
        }

        @NotNull
        public final Error copy(@NotNull CheckoutErrorCode code, @NotNull String message, @NotNull InterfaceC1772d checkoutErrorClass, @Nullable Integer httpStatusCode, @Nullable List<StackTraceElement> stacktrace, @Nullable ErrorResponse errorResponse) {
            Intrinsics.echo(code, "code");
            Intrinsics.echo(message, "message");
            Intrinsics.echo(checkoutErrorClass, "checkoutErrorClass");
            return new Error(code, message, checkoutErrorClass, httpStatusCode, stacktrace, errorResponse);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.code == error.code && Intrinsics.areEqual(this.message, error.message) && Intrinsics.areEqual(this.checkoutErrorClass, error.checkoutErrorClass) && Intrinsics.areEqual(this.httpStatusCode, error.httpStatusCode) && Intrinsics.areEqual(this.stacktrace, error.stacktrace) && Intrinsics.areEqual(this.errorResponse, error.errorResponse);
        }

        @NotNull
        public final InterfaceC1772d getCheckoutErrorClass() {
            return this.checkoutErrorClass;
        }

        @NotNull
        public final CheckoutErrorCode getCode() {
            return this.code;
        }

        @Nullable
        public final ErrorResponse getErrorResponse() {
            return this.errorResponse;
        }

        @Nullable
        public final Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final List<StackTraceElement> getStacktrace() {
            return this.stacktrace;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = (this.checkoutErrorClass.hashCode() + AbstractC2327c.sierra(this.code.hashCode() * 31, 31, this.message)) * 31;
            Integer num = this.httpStatusCode;
            int i4 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i5 = (hashCode3 + hashCode) * 31;
            List list = this.stacktrace;
            if (list == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = list.hashCode();
            }
            int i10 = (i5 + hashCode2) * 31;
            ErrorResponse errorResponse = this.errorResponse;
            if (errorResponse != null) {
                i4 = errorResponse.hashCode();
            }
            return i10 + i4;
        }

        @NotNull
        public final String toString() {
            return "Error(code=" + this.code + ", message=" + this.message + ", checkoutErrorClass=" + this.checkoutErrorClass + ", httpStatusCode=" + this.httpStatusCode + ", stacktrace=" + this.stacktrace + ", errorResponse=" + this.errorResponse + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull CheckoutErrorCode code, @NotNull String message, @NotNull InterfaceC1772d checkoutErrorClass, @Nullable Integer num, @Nullable List<StackTraceElement> list, @Nullable ErrorResponse errorResponse) {
            super(null);
            Intrinsics.echo(code, "code");
            Intrinsics.echo(message, "message");
            Intrinsics.echo(checkoutErrorClass, "checkoutErrorClass");
            this.code = code;
            this.message = message;
            this.checkoutErrorClass = checkoutErrorClass;
            this.httpStatusCode = num;
            this.stacktrace = list;
            this.errorResponse = errorResponse;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/core/network/model/response/ResultWrapper$Success;", "T", "Lcom/checkout/components/core/network/model/response/ResultWrapper;", Column.DATA, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", Constants.COPY_TYPE, "(Ljava/lang/Object;)Lcom/checkout/components/core/network/model/response/ResultWrapper$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getData", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Success<T> extends ResultWrapper<T> {
        public static final int $stable = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object data;

        public Success(T t5) {
            super(null);
            this.data = t5;
        }

        public static Success copy$default(Success success, Object obj, int i4, Object obj2) {
            if ((i4 & 1) != 0) {
                obj = success.data;
            }
            success.getClass();
            return new Success(obj);
        }

        public final T component1() {
            return (T) this.data;
        }

        @NotNull
        public final Success<T> copy(T data) {
            return new Success<>(data);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.data, ((Success) other).data);
        }

        public final T getData() {
            return (T) this.data;
        }

        public final int hashCode() {
            Object obj = this.data;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(data=" + this.data + ")";
        }
    }

    public ResultWrapper(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
