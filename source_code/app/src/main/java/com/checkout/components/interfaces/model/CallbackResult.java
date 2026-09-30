package com.checkout.components.interfaces.model;

import androidx.annotation.Keep;
import ao.ad;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/checkout/components/interfaces/model/CallbackResult;", "", "<init>", "()V", "Accepted", "Rejected", "Lcom/checkout/components/interfaces/model/CallbackResult$Accepted;", "Lcom/checkout/components/interfaces/model/CallbackResult$Rejected;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public abstract class CallbackResult {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CallbackResult$Accepted;", "Lcom/checkout/components/interfaces/model/CallbackResult;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Accepted extends CallbackResult {
        public static final int $stable = 0;

        @NotNull
        public static final Accepted INSTANCE = new Accepted();

        private Accepted() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/interfaces/model/CallbackResult$Rejected;", "Lcom/checkout/components/interfaces/model/CallbackResult;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Ljava/lang/String;)Lcom/checkout/components/interfaces/model/CallbackResult$Rejected;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getErrorMessage", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Rejected extends CallbackResult {
        public static final int $stable = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String errorMessage;

        public Rejected(@Nullable String str) {
            super(null);
            this.errorMessage = str;
        }

        public static Rejected copy$default(Rejected rejected, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = rejected.errorMessage;
            }
            rejected.getClass();
            return new Rejected(str);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @NotNull
        public final Rejected copy(@Nullable String errorMessage) {
            return new Rejected(errorMessage);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Rejected) && Intrinsics.areEqual(this.errorMessage, ((Rejected) other).errorMessage);
        }

        @Nullable
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final int hashCode() {
            String str = this.errorMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return ad.gray("Rejected(errorMessage=", this.errorMessage, ")");
        }
    }

    public /* synthetic */ CallbackResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CallbackResult() {
    }
}
