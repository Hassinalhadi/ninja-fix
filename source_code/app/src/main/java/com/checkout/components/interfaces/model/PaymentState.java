package com.checkout.components.interfaces.model;

import ao.ad;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentState;", "", "Default", "Completed", "Declined", "InProgress", "Lcom/checkout/components/interfaces/model/PaymentState$Completed;", "Lcom/checkout/components/interfaces/model/PaymentState$Declined;", "Lcom/checkout/components/interfaces/model/PaymentState$Default;", "Lcom/checkout/components/interfaces/model/PaymentState$InProgress;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PaymentState {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentState$Completed;", "Lcom/checkout/components/interfaces/model/PaymentState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Completed extends PaymentState {
        public static final int $stable = 0;

        @NotNull
        public static final Completed INSTANCE = new Completed();

        private Completed() {
            super(null);
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Completed);
        }

        public final int hashCode() {
            return -2041112156;
        }

        @NotNull
        public final String toString() {
            return "Completed";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentState$Declined;", "Lcom/checkout/components/interfaces/model/PaymentState;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Ljava/lang/String;)Lcom/checkout/components/interfaces/model/PaymentState$Declined;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getReason", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Declined extends PaymentState {
        public static final int $stable = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Declined(@NotNull String reason) {
            super(null);
            Intrinsics.echo(reason, "reason");
            this.reason = reason;
        }

        public static Declined copy$default(Declined declined, String reason, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                reason = declined.reason;
            }
            declined.getClass();
            Intrinsics.echo(reason, "reason");
            return new Declined(reason);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @NotNull
        public final Declined copy(@NotNull String reason) {
            Intrinsics.echo(reason, "reason");
            return new Declined(reason);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Declined) && Intrinsics.areEqual(this.reason, ((Declined) other).reason);
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public final String toString() {
            return ad.gray("Declined(reason=", this.reason, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentState$Default;", "Lcom/checkout/components/interfaces/model/PaymentState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Default extends PaymentState {
        public static final int $stable = 0;

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
            super(null);
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Default);
        }

        public final int hashCode() {
            return 2075982810;
        }

        @NotNull
        public final String toString() {
            return "Default";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentState$InProgress;", "Lcom/checkout/components/interfaces/model/PaymentState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class InProgress extends PaymentState {
        public static final int $stable = 0;

        @NotNull
        public static final InProgress INSTANCE = new InProgress();

        private InProgress() {
            super(null);
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof InProgress);
        }

        public final int hashCode() {
            return 344229433;
        }

        @NotNull
        public final String toString() {
            return "InProgress";
        }
    }

    public PaymentState(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
