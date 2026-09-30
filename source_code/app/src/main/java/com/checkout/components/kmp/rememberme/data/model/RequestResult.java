package com.checkout.components.kmp.rememberme.data.model;

import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.v;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/RequestResult;", "T", "", "<init>", "()V", "Success", "Failed", "Lcom/checkout/components/kmp/rememberme/data/model/RequestResult$Failed;", "Lcom/checkout/components/kmp/rememberme/data/model/RequestResult$Success;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RequestResult<T> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/RequestResult$Failed;", "Lcom/checkout/components/kmp/rememberme/data/model/RequestResult;", "", "Lsd/v;", "code", "Ljava/lang/Exception;", "Lkotlin/Exception;", RedirectCustomTabEventLogger.RESULT_ERROR, "<init>", "(Lsd/v;Ljava/lang/Exception;)V", "component1", "()Lsd/v;", "component2", "()Ljava/lang/Exception;", Constants.COPY_TYPE, "(Lsd/v;Ljava/lang/Exception;)Lcom/checkout/components/kmp/rememberme/data/model/RequestResult$Failed;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsd/v;", "getCode", "Ljava/lang/Exception;", "getError", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Failed extends RequestResult {
        public static final int $stable = 8;

        @Nullable
        private final v code;

        @NotNull
        private final Exception error;

        public /* synthetic */ Failed(v vVar, Exception exc, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? null : vVar, exc);
        }

        public static /* synthetic */ Failed copy$default(Failed failed, v vVar, Exception exc, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                vVar = failed.code;
            }
            if ((i4 & 2) != 0) {
                exc = failed.error;
            }
            return failed.copy(vVar, exc);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final v getCode() {
            return this.code;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        @NotNull
        public final Failed copy(@Nullable v code, @NotNull Exception error) {
            Intrinsics.echo(error, "error");
            return new Failed(code, error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.code, failed.code) && Intrinsics.areEqual(this.error, failed.error);
        }

        @Nullable
        public final v getCode() {
            return this.code;
        }

        @NotNull
        public final Exception getError() {
            return this.error;
        }

        public int hashCode() {
            int i4;
            v vVar = this.code;
            if (vVar == null) {
                i4 = 0;
            } else {
                i4 = vVar.alpha;
            }
            return this.error.hashCode() + (i4 * 31);
        }

        @NotNull
        public String toString() {
            return "Failed(code=" + this.code + ", error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(@Nullable v vVar, @NotNull Exception error) {
            super(null);
            Intrinsics.echo(error, "error");
            this.code = vVar;
            this.error = error;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/model/RequestResult$Success;", "T", "Lcom/checkout/components/kmp/rememberme/data/model/RequestResult;", Column.DATA, "<init>", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", Constants.COPY_TYPE, "(Ljava/lang/Object;)Lcom/checkout/components/kmp/rememberme/data/model/RequestResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Success<T> extends RequestResult<T> {
        public static final int $stable = 0;
        private final T data;

        public Success(T t5) {
            super(null);
            this.data = t5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i4, Object obj2) {
            if ((i4 & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.data;
        }

        @NotNull
        public final Success<T> copy(T data) {
            return new Success<>(data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.data, ((Success) other).data);
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            T t5 = this.data;
            if (t5 == null) {
                return 0;
            }
            return t5.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(data=" + this.data + ")";
        }
    }

    public /* synthetic */ RequestResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RequestResult() {
    }
}
