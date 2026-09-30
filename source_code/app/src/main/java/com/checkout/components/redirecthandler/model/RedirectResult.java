package com.checkout.components.redirecthandler.model;

import ao.ad;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/redirecthandler/model/RedirectResult;", "", "Success", "Failure", "Lcom/checkout/components/redirecthandler/model/RedirectResult$Failure;", "Lcom/checkout/components/redirecthandler/model/RedirectResult$Success;", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RedirectResult {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/redirecthandler/model/RedirectResult$Failure;", "Lcom/checkout/components/redirecthandler/model/RedirectResult;", "", "declineReason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Ljava/lang/String;)Lcom/checkout/components/redirecthandler/model/RedirectResult$Failure;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDeclineReason", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Failure extends RedirectResult {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String declineReason;

        public Failure(@Nullable String str) {
            super(null);
            this.declineReason = str;
        }

        public static Failure copy$default(Failure failure, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = failure.declineReason;
            }
            failure.getClass();
            return new Failure(str);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getDeclineReason() {
            return this.declineReason;
        }

        @NotNull
        public final Failure copy(@Nullable String declineReason) {
            return new Failure(declineReason);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.declineReason, ((Failure) other).declineReason);
        }

        @Nullable
        public final String getDeclineReason() {
            return this.declineReason;
        }

        public final int hashCode() {
            String str = this.declineReason;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return ad.gray("Failure(declineReason=", this.declineReason, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/redirecthandler/model/RedirectResult$Success;", "Lcom/checkout/components/redirecthandler/model/RedirectResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Success extends RedirectResult {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Success);
        }

        public final int hashCode() {
            return -791303536;
        }

        @NotNull
        public final String toString() {
            return "Success";
        }
    }

    public RedirectResult(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
