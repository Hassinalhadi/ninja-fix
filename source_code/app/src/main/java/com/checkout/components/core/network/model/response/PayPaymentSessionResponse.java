package com.checkout.components.core.network.model.response;

import com.checkout.components.interfaces.model.PaymentMethodName;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse;", "", "", "getId", "()Ljava/lang/String;", Constants.KEY_ID, "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "getType", "()Lcom/checkout/components/interfaces/model/PaymentMethodName;", Constants.KEY_TYPE, "Lcom/checkout/components/core/network/model/response/PaymentStatus;", "getStatus", "()Lcom/checkout/components/core/network/model/response/PaymentStatus;", "status", "ActionRequired", "Approved", "Declined", "Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$ActionRequired;", "Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$Approved;", "Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$Declined;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PayPaymentSessionResponse {
    public static final int $stable = 0;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013¨\u0006+"}, d2 = {"Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$ActionRequired;", "Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse;", "", Constants.KEY_ID, "Lcom/checkout/components/interfaces/model/PaymentMethodName;", Constants.KEY_TYPE, "Lcom/checkout/components/core/network/model/response/PaymentAction;", Constants.KEY_ACTION, "Lcom/checkout/components/core/network/model/response/PaymentStatus;", "status", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/PaymentMethodName;Lcom/checkout/components/core/network/model/response/PaymentAction;Lcom/checkout/components/core/network/model/response/PaymentStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/interfaces/model/PaymentMethodName;", "component3", "()Lcom/checkout/components/core/network/model/response/PaymentAction;", "component4", "()Lcom/checkout/components/core/network/model/response/PaymentStatus;", Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/PaymentMethodName;Lcom/checkout/components/core/network/model/response/PaymentAction;Lcom/checkout/components/core/network/model/response/PaymentStatus;)Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$ActionRequired;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "getType", "c", "Lcom/checkout/components/core/network/model/response/PaymentAction;", "getAction", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/core/network/model/response/PaymentStatus;", "getStatus", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ActionRequired extends PayPaymentSessionResponse {
        public static final int $stable = PaymentMethodName.$stable;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final PaymentMethodName type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final PaymentAction action;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final PaymentStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionRequired(@NotNull String id2, @NotNull PaymentMethodName type, @NotNull PaymentAction action, @NotNull PaymentStatus status) {
            super(null);
            Intrinsics.echo(id2, "id");
            Intrinsics.echo(type, "type");
            Intrinsics.echo(action, "action");
            Intrinsics.echo(status, "status");
            this.id = id2;
            this.type = type;
            this.action = action;
            this.status = status;
        }

        public static /* synthetic */ ActionRequired copy$default(ActionRequired actionRequired, String str, PaymentMethodName paymentMethodName, PaymentAction paymentAction, PaymentStatus paymentStatus, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = actionRequired.id;
            }
            if ((i4 & 2) != 0) {
                paymentMethodName = actionRequired.type;
            }
            if ((i4 & 4) != 0) {
                paymentAction = actionRequired.action;
            }
            if ((i4 & 8) != 0) {
                paymentStatus = actionRequired.status;
            }
            return actionRequired.copy(str, paymentMethodName, paymentAction, paymentStatus);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PaymentMethodName getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final PaymentAction getAction() {
            return this.action;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final PaymentStatus getStatus() {
            return this.status;
        }

        @NotNull
        public final ActionRequired copy(@NotNull String id2, @NotNull PaymentMethodName type, @NotNull PaymentAction action, @NotNull PaymentStatus status) {
            Intrinsics.echo(id2, "id");
            Intrinsics.echo(type, "type");
            Intrinsics.echo(action, "action");
            Intrinsics.echo(status, "status");
            return new ActionRequired(id2, type, action, status);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionRequired)) {
                return false;
            }
            ActionRequired actionRequired = (ActionRequired) other;
            return Intrinsics.areEqual(this.id, actionRequired.id) && Intrinsics.areEqual(this.type, actionRequired.type) && Intrinsics.areEqual(this.action, actionRequired.action) && this.status == actionRequired.status;
        }

        @NotNull
        public final PaymentAction getAction() {
            return this.action;
        }

        @Override // com.checkout.components.core.network.model.response.PayPaymentSessionResponse
        @NotNull
        public final String getId() {
            return this.id;
        }

        @Override // com.checkout.components.core.network.model.response.PayPaymentSessionResponse
        @NotNull
        public final PaymentStatus getStatus() {
            return this.status;
        }

        @Override // com.checkout.components.core.network.model.response.PayPaymentSessionResponse
        @NotNull
        public final PaymentMethodName getType() {
            return this.type;
        }

        public final int hashCode() {
            return this.status.hashCode() + ((this.action.hashCode() + ((this.type.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "ActionRequired(id=" + this.id + ", type=" + this.type + ", action=" + this.action + ", status=" + this.status + ")";
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000f¨\u0006$"}, d2 = {"Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$Approved;", "Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse;", "", Constants.KEY_ID, "Lcom/checkout/components/interfaces/model/PaymentMethodName;", Constants.KEY_TYPE, "Lcom/checkout/components/core/network/model/response/PaymentStatus;", "status", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/PaymentMethodName;Lcom/checkout/components/core/network/model/response/PaymentStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/interfaces/model/PaymentMethodName;", "component3", "()Lcom/checkout/components/core/network/model/response/PaymentStatus;", Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/PaymentMethodName;Lcom/checkout/components/core/network/model/response/PaymentStatus;)Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$Approved;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "getType", "c", "Lcom/checkout/components/core/network/model/response/PaymentStatus;", "getStatus", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Approved extends PayPaymentSessionResponse {
        public static final int $stable = PaymentMethodName.$stable;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final PaymentMethodName type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final PaymentStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Approved(@NotNull String id2, @NotNull PaymentMethodName type, @NotNull PaymentStatus status) {
            super(null);
            Intrinsics.echo(id2, "id");
            Intrinsics.echo(type, "type");
            Intrinsics.echo(status, "status");
            this.id = id2;
            this.type = type;
            this.status = status;
        }

        public static /* synthetic */ Approved copy$default(Approved approved, String str, PaymentMethodName paymentMethodName, PaymentStatus paymentStatus, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = approved.id;
            }
            if ((i4 & 2) != 0) {
                paymentMethodName = approved.type;
            }
            if ((i4 & 4) != 0) {
                paymentStatus = approved.status;
            }
            return approved.copy(str, paymentMethodName, paymentStatus);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PaymentMethodName getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final PaymentStatus getStatus() {
            return this.status;
        }

        @NotNull
        public final Approved copy(@NotNull String id2, @NotNull PaymentMethodName type, @NotNull PaymentStatus status) {
            Intrinsics.echo(id2, "id");
            Intrinsics.echo(type, "type");
            Intrinsics.echo(status, "status");
            return new Approved(id2, type, status);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Approved)) {
                return false;
            }
            Approved approved = (Approved) other;
            return Intrinsics.areEqual(this.id, approved.id) && Intrinsics.areEqual(this.type, approved.type) && this.status == approved.status;
        }

        @Override // com.checkout.components.core.network.model.response.PayPaymentSessionResponse
        @NotNull
        public final String getId() {
            return this.id;
        }

        @Override // com.checkout.components.core.network.model.response.PayPaymentSessionResponse
        @NotNull
        public final PaymentStatus getStatus() {
            return this.status;
        }

        @Override // com.checkout.components.core.network.model.response.PayPaymentSessionResponse
        @NotNull
        public final PaymentMethodName getType() {
            return this.type;
        }

        public final int hashCode() {
            return this.status.hashCode() + ((this.type.hashCode() + (this.id.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "Approved(id=" + this.id + ", type=" + this.type + ", status=" + this.status + ")";
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0013¨\u0006-"}, d2 = {"Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$Declined;", "Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse;", "", Constants.KEY_ID, "Lcom/checkout/components/interfaces/model/PaymentMethodName;", Constants.KEY_TYPE, "Lcom/checkout/components/core/network/model/response/DeclineReason;", "declineReason", "Lcom/checkout/components/core/network/model/response/PaymentStatus;", "status", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/PaymentMethodName;Lcom/checkout/components/core/network/model/response/DeclineReason;Lcom/checkout/components/core/network/model/response/PaymentStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/interfaces/model/PaymentMethodName;", "component3", "()Lcom/checkout/components/core/network/model/response/DeclineReason;", "component4", "()Lcom/checkout/components/core/network/model/response/PaymentStatus;", Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/PaymentMethodName;Lcom/checkout/components/core/network/model/response/DeclineReason;Lcom/checkout/components/core/network/model/response/PaymentStatus;)Lcom/checkout/components/core/network/model/response/PayPaymentSessionResponse$Declined;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/checkout/components/interfaces/model/PaymentMethodName;", "getType", "c", "Lcom/checkout/components/core/network/model/response/DeclineReason;", "getDeclineReason", "getDeclineReason$annotations", "()V", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/core/network/model/response/PaymentStatus;", "getStatus", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Declined extends PayPaymentSessionResponse {
        public static final int $stable = PaymentMethodName.$stable;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final PaymentMethodName type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final DeclineReason declineReason;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final PaymentStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Declined(@NotNull String id2, @NotNull PaymentMethodName type, @Json(name = "decline_reason") @NotNull DeclineReason declineReason, @NotNull PaymentStatus status) {
            super(null);
            Intrinsics.echo(id2, "id");
            Intrinsics.echo(type, "type");
            Intrinsics.echo(declineReason, "declineReason");
            Intrinsics.echo(status, "status");
            this.id = id2;
            this.type = type;
            this.declineReason = declineReason;
            this.status = status;
        }

        public static /* synthetic */ Declined copy$default(Declined declined, String str, PaymentMethodName paymentMethodName, DeclineReason declineReason, PaymentStatus paymentStatus, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = declined.id;
            }
            if ((i4 & 2) != 0) {
                paymentMethodName = declined.type;
            }
            if ((i4 & 4) != 0) {
                declineReason = declined.declineReason;
            }
            if ((i4 & 8) != 0) {
                paymentStatus = declined.status;
            }
            return declined.copy(str, paymentMethodName, declineReason, paymentStatus);
        }

        @Json(name = "decline_reason")
        public static /* synthetic */ void getDeclineReason$annotations() {
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PaymentMethodName getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final DeclineReason getDeclineReason() {
            return this.declineReason;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final PaymentStatus getStatus() {
            return this.status;
        }

        @NotNull
        public final Declined copy(@NotNull String id2, @NotNull PaymentMethodName type, @Json(name = "decline_reason") @NotNull DeclineReason declineReason, @NotNull PaymentStatus status) {
            Intrinsics.echo(id2, "id");
            Intrinsics.echo(type, "type");
            Intrinsics.echo(declineReason, "declineReason");
            Intrinsics.echo(status, "status");
            return new Declined(id2, type, declineReason, status);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Declined)) {
                return false;
            }
            Declined declined = (Declined) other;
            return Intrinsics.areEqual(this.id, declined.id) && Intrinsics.areEqual(this.type, declined.type) && this.declineReason == declined.declineReason && this.status == declined.status;
        }

        @NotNull
        public final DeclineReason getDeclineReason() {
            return this.declineReason;
        }

        @Override // com.checkout.components.core.network.model.response.PayPaymentSessionResponse
        @NotNull
        public final String getId() {
            return this.id;
        }

        @Override // com.checkout.components.core.network.model.response.PayPaymentSessionResponse
        @NotNull
        public final PaymentStatus getStatus() {
            return this.status;
        }

        @Override // com.checkout.components.core.network.model.response.PayPaymentSessionResponse
        @NotNull
        public final PaymentMethodName getType() {
            return this.type;
        }

        public final int hashCode() {
            return this.status.hashCode() + ((this.declineReason.hashCode() + ((this.type.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "Declined(id=" + this.id + ", type=" + this.type + ", declineReason=" + this.declineReason + ", status=" + this.status + ")";
        }
    }

    public PayPaymentSessionResponse(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public abstract String getId();

    @NotNull
    public abstract PaymentStatus getStatus();

    @NotNull
    public abstract PaymentMethodName getType();
}
