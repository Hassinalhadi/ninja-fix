package com.checkout.components.interfaces.model.paymentsession;

import androidx.appcompat.widget.P0;
import av.q;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.b;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\f¨\u0006("}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/PaymentSessionSubmissionResult;", "", "", Constants.KEY_ID, Constants.KEY_TYPE, "status", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentAction;", Constants.KEY_ACTION, "declineReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/paymentsession/PaymentAction;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/checkout/components/interfaces/model/paymentsession/PaymentAction;", "component5", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/paymentsession/PaymentAction;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/paymentsession/PaymentSessionSubmissionResult;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getType", "c", "getStatus", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/interfaces/model/paymentsession/PaymentAction;", "getAction", "e", "getDeclineReason", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class PaymentSessionSubmissionResult {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String status;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final PaymentAction action;

    /* renamed from: e, reason: from kotlin metadata */
    private final String declineReason;

    public PaymentSessionSubmissionResult(@NotNull String id2, @NotNull String type, @NotNull String status, @Nullable PaymentAction paymentAction, @Nullable String str) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(type, "type");
        Intrinsics.echo(status, "status");
        this.id = id2;
        this.type = type;
        this.status = status;
        this.action = paymentAction;
        this.declineReason = str;
    }

    public static /* synthetic */ PaymentSessionSubmissionResult copy$default(PaymentSessionSubmissionResult paymentSessionSubmissionResult, String str, String str2, String str3, PaymentAction paymentAction, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = paymentSessionSubmissionResult.id;
        }
        if ((i4 & 2) != 0) {
            str2 = paymentSessionSubmissionResult.type;
        }
        if ((i4 & 4) != 0) {
            str3 = paymentSessionSubmissionResult.status;
        }
        if ((i4 & 8) != 0) {
            paymentAction = paymentSessionSubmissionResult.action;
        }
        if ((i4 & 16) != 0) {
            str4 = paymentSessionSubmissionResult.declineReason;
        }
        String str5 = str4;
        String str6 = str3;
        return paymentSessionSubmissionResult.copy(str, str2, str6, paymentAction, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final PaymentAction getAction() {
        return this.action;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDeclineReason() {
        return this.declineReason;
    }

    @NotNull
    public final PaymentSessionSubmissionResult copy(@NotNull String id2, @NotNull String type, @NotNull String status, @Nullable PaymentAction action, @Nullable String declineReason) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(type, "type");
        Intrinsics.echo(status, "status");
        return new PaymentSessionSubmissionResult(id2, type, status, action, declineReason);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSessionSubmissionResult)) {
            return false;
        }
        PaymentSessionSubmissionResult paymentSessionSubmissionResult = (PaymentSessionSubmissionResult) other;
        return Intrinsics.areEqual(this.id, paymentSessionSubmissionResult.id) && Intrinsics.areEqual(this.type, paymentSessionSubmissionResult.type) && Intrinsics.areEqual(this.status, paymentSessionSubmissionResult.status) && Intrinsics.areEqual(this.action, paymentSessionSubmissionResult.action) && Intrinsics.areEqual(this.declineReason, paymentSessionSubmissionResult.declineReason);
    }

    @Nullable
    public final PaymentAction getAction() {
        return this.action;
    }

    @Nullable
    public final String getDeclineReason() {
        return this.declineReason;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode;
        int a6 = b.a(this.status, b.a(this.type, this.id.hashCode() * 31, 31), 31);
        PaymentAction paymentAction = this.action;
        int i4 = 0;
        if (paymentAction == null) {
            hashCode = 0;
        } else {
            hashCode = paymentAction.hashCode();
        }
        int i5 = (a6 + hashCode) * 31;
        String str = this.declineReason;
        if (str != null) {
            i4 = str.hashCode();
        }
        return i5 + i4;
    }

    @NotNull
    public final String toString() {
        String str = this.id;
        String str2 = this.type;
        String str3 = this.status;
        PaymentAction paymentAction = this.action;
        String str4 = this.declineReason;
        StringBuilder india = q.india("PaymentSessionSubmissionResult(id=", str, ", type=", str2, ", status=");
        india.append(str3);
        india.append(", action=");
        india.append(paymentAction);
        india.append(", declineReason=");
        return P0.gold(india, str4, ")");
    }

    public /* synthetic */ PaymentSessionSubmissionResult(String str, String str2, String str3, PaymentAction paymentAction, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i4 & 8) != 0 ? null : paymentAction, (i4 & 16) != 0 ? null : str4);
    }
}
