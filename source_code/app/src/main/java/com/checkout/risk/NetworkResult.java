package com.checkout.risk;

import com.clevertap.android.sdk.db.Column;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/checkout/risk/NetworkResult;", "T", "", "()V", "Error", "Exception", "Success", "Lcom/checkout/risk/NetworkResult$Error;", "Lcom/checkout/risk/NetworkResult$Exception;", "Lcom/checkout/risk/NetworkResult$Success;", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class NetworkResult<T> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/checkout/risk/NetworkResult$Error;", "Lcom/checkout/risk/NetworkResult;", "", "code", "", com.clevertap.android.sdk.Constants.KEY_MESSAGE, "", "innerException", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getCode", "()I", "getInnerException", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Error extends NetworkResult {
        private final int code;

        @Nullable
        private final Throwable innerException;

        @NotNull
        private final String message;

        public /* synthetic */ Error(int i4, String str, Throwable th, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(i4, str, (i5 & 4) != 0 ? null : th);
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final Throwable getInnerException() {
            return this.innerException;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(int i4, @NotNull String message, @Nullable Throwable th) {
            super(null);
            Intrinsics.echo(message, "message");
            this.code = i4;
            this.message = message;
            this.innerException = th;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/checkout/risk/NetworkResult$Exception;", "Lcom/checkout/risk/NetworkResult;", "", "e", "", "(Ljava/lang/Throwable;)V", "getE", "()Ljava/lang/Throwable;", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Exception extends NetworkResult {

        @NotNull
        private final Throwable e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Exception(@NotNull Throwable e) {
            super(null);
            Intrinsics.echo(e, "e");
            this.e = e;
        }

        @NotNull
        public final Throwable getE() {
            return this.e;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/checkout/risk/NetworkResult$Success;", "T", "Lcom/checkout/risk/NetworkResult;", Column.DATA, "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "toString", "", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Success<T> extends NetworkResult<T> {
        private final T data;

        public Success(T t5) {
            super(null);
            this.data = t5;
        }

        public final T getData() {
            return this.data;
        }

        @NotNull
        public String toString() {
            return "Success(data=" + this.data + ')';
        }
    }

    public /* synthetic */ NetworkResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NetworkResult() {
    }
}
