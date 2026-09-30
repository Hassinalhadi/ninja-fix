package com.checkout.components.kmp.rememberme.model;

import b.c0;
import com.checkout.components.kmp.rememberme.utils.ErrorCode;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e¨\u0006 "}, d2 = {"Lcom/checkout/components/kmp/rememberme/model/OTPViewState;", "", "otpCodes", "", "", "isLoading", "", "errorCode", "Lcom/checkout/components/kmp/rememberme/utils/ErrorCode;", "timeLeftInSeconds", "<init>", "(Ljava/util/List;ZLcom/checkout/components/kmp/rememberme/utils/ErrorCode;I)V", "getOtpCodes", "()Ljava/util/List;", "()Z", "getErrorCode", "()Lcom/checkout/components/kmp/rememberme/utils/ErrorCode;", "getTimeLeftInSeconds", "()I", "fieldsEnabled", "getFieldsEnabled", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "", "Companion", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OTPViewState {

    @Nullable
    private final ErrorCode errorCode;
    private final boolean isLoading;

    @NotNull
    private final List<Integer> otpCodes;
    private final int timeLeftInSeconds;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Lazy<List<ErrorCode>> FIELD_DISABLED_ERROR_CODES$delegate = LazyKt.lazy(new c0(8));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/kmp/rememberme/model/OTPViewState$Companion;", "", "<init>", "()V", "FIELD_DISABLED_ERROR_CODES", "", "Lcom/checkout/components/kmp/rememberme/utils/ErrorCode;", "getFIELD_DISABLED_ERROR_CODES", "()Ljava/util/List;", "FIELD_DISABLED_ERROR_CODES$delegate", "Lkotlin/Lazy;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<ErrorCode> getFIELD_DISABLED_ERROR_CODES() {
            return (List) OTPViewState.FIELD_DISABLED_ERROR_CODES$delegate.getValue();
        }

        private Companion() {
        }
    }

    public OTPViewState() {
        this(null, false, null, 0, 15, null);
    }

    public static final List FIELD_DISABLED_ERROR_CODES_delegate$lambda$0() {
        return CollectionsKt.listOf(ErrorCode.OTP_MAX_RETRIES_REACHED, ErrorCode.OTP_EXPIRED);
    }

    public static /* synthetic */ List alpha() {
        return FIELD_DISABLED_ERROR_CODES_delegate$lambda$0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OTPViewState copy$default(OTPViewState oTPViewState, List list, boolean z2, ErrorCode errorCode, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = oTPViewState.otpCodes;
        }
        if ((i5 & 2) != 0) {
            z2 = oTPViewState.isLoading;
        }
        if ((i5 & 4) != 0) {
            errorCode = oTPViewState.errorCode;
        }
        if ((i5 & 8) != 0) {
            i4 = oTPViewState.timeLeftInSeconds;
        }
        return oTPViewState.copy(list, z2, errorCode, i4);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.otpCodes;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ErrorCode getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTimeLeftInSeconds() {
        return this.timeLeftInSeconds;
    }

    @NotNull
    public final OTPViewState copy(@NotNull List<Integer> otpCodes, boolean z2, @Nullable ErrorCode errorCode, int i4) {
        Intrinsics.echo(otpCodes, "otpCodes");
        return new OTPViewState(otpCodes, z2, errorCode, i4);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OTPViewState)) {
            return false;
        }
        OTPViewState oTPViewState = (OTPViewState) other;
        return Intrinsics.areEqual(this.otpCodes, oTPViewState.otpCodes) && this.isLoading == oTPViewState.isLoading && this.errorCode == oTPViewState.errorCode && this.timeLeftInSeconds == oTPViewState.timeLeftInSeconds;
    }

    @Nullable
    public final ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final boolean getFieldsEnabled() {
        if (!this.isLoading && !CollectionsKt.bronze(Companion.getFIELD_DISABLED_ERROR_CODES(), this.errorCode)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<Integer> getOtpCodes() {
        return this.otpCodes;
    }

    public final int getTimeLeftInSeconds() {
        return this.timeLeftInSeconds;
    }

    public int hashCode() {
        int i4;
        int hashCode;
        int hashCode2 = this.otpCodes.hashCode() * 31;
        if (this.isLoading) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i5 = (hashCode2 + i4) * 31;
        ErrorCode errorCode = this.errorCode;
        if (errorCode == null) {
            hashCode = 0;
        } else {
            hashCode = errorCode.hashCode();
        }
        return ((i5 + hashCode) * 31) + this.timeLeftInSeconds;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        return "OTPViewState(otpCodes=" + this.otpCodes + ", isLoading=" + this.isLoading + ", errorCode=" + this.errorCode + ", timeLeftInSeconds=" + this.timeLeftInSeconds + ")";
    }

    public OTPViewState(@NotNull List<Integer> otpCodes, boolean z2, @Nullable ErrorCode errorCode, int i4) {
        Intrinsics.echo(otpCodes, "otpCodes");
        this.otpCodes = otpCodes;
        this.isLoading = z2;
        this.errorCode = errorCode;
        this.timeLeftInSeconds = i4;
    }

    public /* synthetic */ OTPViewState(List list, boolean z2, ErrorCode errorCode, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? com.checkout.components.kmp.rememberme.utils.Constants.INSTANCE.getDEFAULT_OTP_CODES() : list, (i5 & 2) != 0 ? false : z2, (i5 & 4) != 0 ? null : errorCode, (i5 & 8) != 0 ? 60 : i4);
    }
}
