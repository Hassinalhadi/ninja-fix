package com.checkout.components.interfaces.error;

import androidx.annotation.Keep;
import av.q;
import com.checkout.components.core.common.Fixtures;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.b;
import com.checkout.components.interfaces.model.ComponentName;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutErrorDetails;", "", "<init>", "()V", "mobileSessionId", "", "getMobileSessionId", "()Ljava/lang/String;", "paymentSessionId", "getPaymentSessionId", Constants.KEY_TYPE, "Lcom/checkout/components/interfaces/model/ComponentName;", "getType", "()Lcom/checkout/components/interfaces/model/ComponentName;", "Integration", "Request", "PaymentMethod", "Submit", "Internal", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Integration;", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Internal;", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$PaymentMethod;", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Request;", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Submit;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public abstract class CheckoutErrorDetails {
    public static final int $stable = 0;

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Integration;", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails;", "mobileSessionId", "", "paymentSessionId", Constants.KEY_TYPE, "Lcom/checkout/components/interfaces/model/ComponentName;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/ComponentName;)V", "getMobileSessionId", "()Ljava/lang/String;", "getPaymentSessionId", "getType", "()Lcom/checkout/components/interfaces/model/ComponentName;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Integration extends CheckoutErrorDetails {
        public static final int $stable = 8;

        @NotNull
        private final String mobileSessionId;

        @NotNull
        private final String paymentSessionId;

        @Nullable
        private final ComponentName type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Integration(@NotNull String mobileSessionId, @NotNull String paymentSessionId, @Nullable ComponentName componentName) {
            super(null);
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            this.mobileSessionId = mobileSessionId;
            this.paymentSessionId = paymentSessionId;
            this.type = componentName;
        }

        public static /* synthetic */ Integration copy$default(Integration integration, String str, String str2, ComponentName componentName, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = integration.mobileSessionId;
            }
            if ((i4 & 2) != 0) {
                str2 = integration.paymentSessionId;
            }
            if ((i4 & 4) != 0) {
                componentName = integration.type;
            }
            return integration.copy(str, str2, componentName);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final ComponentName getType() {
            return this.type;
        }

        @NotNull
        public final Integration copy(@NotNull String mobileSessionId, @NotNull String paymentSessionId, @Nullable ComponentName type) {
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            return new Integration(mobileSessionId, paymentSessionId, type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Integration)) {
                return false;
            }
            Integration integration = (Integration) other;
            return Intrinsics.areEqual(this.mobileSessionId, integration.mobileSessionId) && Intrinsics.areEqual(this.paymentSessionId, integration.paymentSessionId) && Intrinsics.areEqual(this.type, integration.type);
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @NotNull
        public String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @NotNull
        public String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @Nullable
        public ComponentName getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            int a6 = b.a(this.paymentSessionId, this.mobileSessionId.hashCode() * 31, 31);
            ComponentName componentName = this.type;
            if (componentName == null) {
                hashCode = 0;
            } else {
                hashCode = componentName.hashCode();
            }
            return a6 + hashCode;
        }

        @NotNull
        public String toString() {
            String str = this.mobileSessionId;
            String str2 = this.paymentSessionId;
            ComponentName componentName = this.type;
            StringBuilder india = q.india("Integration(mobileSessionId=", str, ", paymentSessionId=", str2, ", type=");
            india.append(componentName);
            india.append(")");
            return india.toString();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Internal;", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails;", "mobileSessionId", "", "paymentSessionId", Constants.KEY_TYPE, "Lcom/checkout/components/interfaces/model/ComponentName;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/ComponentName;)V", "getMobileSessionId", "()Ljava/lang/String;", "getPaymentSessionId", "getType", "()Lcom/checkout/components/interfaces/model/ComponentName;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Internal extends CheckoutErrorDetails {
        public static final int $stable = 8;

        @NotNull
        private final String mobileSessionId;

        @NotNull
        private final String paymentSessionId;

        @NotNull
        private final ComponentName type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Internal(@NotNull String mobileSessionId, @NotNull String paymentSessionId, @NotNull ComponentName type) {
            super(null);
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            Intrinsics.echo(type, "type");
            this.mobileSessionId = mobileSessionId;
            this.paymentSessionId = paymentSessionId;
            this.type = type;
        }

        public static /* synthetic */ Internal copy$default(Internal internal, String str, String str2, ComponentName componentName, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = internal.mobileSessionId;
            }
            if ((i4 & 2) != 0) {
                str2 = internal.paymentSessionId;
            }
            if ((i4 & 4) != 0) {
                componentName = internal.type;
            }
            return internal.copy(str, str2, componentName);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ComponentName getType() {
            return this.type;
        }

        @NotNull
        public final Internal copy(@NotNull String mobileSessionId, @NotNull String paymentSessionId, @NotNull ComponentName type) {
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            Intrinsics.echo(type, "type");
            return new Internal(mobileSessionId, paymentSessionId, type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return Intrinsics.areEqual(this.mobileSessionId, internal.mobileSessionId) && Intrinsics.areEqual(this.paymentSessionId, internal.paymentSessionId) && Intrinsics.areEqual(this.type, internal.type);
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @NotNull
        public String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @NotNull
        public String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @NotNull
        public ComponentName getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + b.a(this.paymentSessionId, this.mobileSessionId.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.mobileSessionId;
            String str2 = this.paymentSessionId;
            ComponentName componentName = this.type;
            StringBuilder india = q.india("Internal(mobileSessionId=", str, ", paymentSessionId=", str2, ", type=");
            india.append(componentName);
            india.append(")");
            return india.toString();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$PaymentMethod;", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails;", "mobileSessionId", "", "paymentSessionId", Constants.KEY_TYPE, "Lcom/checkout/components/interfaces/model/ComponentName;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/ComponentName;)V", "getMobileSessionId", "()Ljava/lang/String;", "getPaymentSessionId", "getType", "()Lcom/checkout/components/interfaces/model/ComponentName;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class PaymentMethod extends CheckoutErrorDetails {
        public static final int $stable = 8;

        @NotNull
        private final String mobileSessionId;

        @NotNull
        private final String paymentSessionId;

        @NotNull
        private final ComponentName type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentMethod(@NotNull String mobileSessionId, @NotNull String paymentSessionId, @NotNull ComponentName type) {
            super(null);
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            Intrinsics.echo(type, "type");
            this.mobileSessionId = mobileSessionId;
            this.paymentSessionId = paymentSessionId;
            this.type = type;
        }

        public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, ComponentName componentName, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = paymentMethod.mobileSessionId;
            }
            if ((i4 & 2) != 0) {
                str2 = paymentMethod.paymentSessionId;
            }
            if ((i4 & 4) != 0) {
                componentName = paymentMethod.type;
            }
            return paymentMethod.copy(str, str2, componentName);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ComponentName getType() {
            return this.type;
        }

        @NotNull
        public final PaymentMethod copy(@NotNull String mobileSessionId, @NotNull String paymentSessionId, @NotNull ComponentName type) {
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            Intrinsics.echo(type, "type");
            return new PaymentMethod(mobileSessionId, paymentSessionId, type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethod)) {
                return false;
            }
            PaymentMethod paymentMethod = (PaymentMethod) other;
            return Intrinsics.areEqual(this.mobileSessionId, paymentMethod.mobileSessionId) && Intrinsics.areEqual(this.paymentSessionId, paymentMethod.paymentSessionId) && Intrinsics.areEqual(this.type, paymentMethod.type);
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @NotNull
        public String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @NotNull
        public String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @NotNull
        public ComponentName getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + b.a(this.paymentSessionId, this.mobileSessionId.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.mobileSessionId;
            String str2 = this.paymentSessionId;
            ComponentName componentName = this.type;
            StringBuilder india = q.india("PaymentMethod(mobileSessionId=", str, ", paymentSessionId=", str2, ", type=");
            india.append(componentName);
            india.append(")");
            return india.toString();
        }
    }

    @Keep
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019Jd\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Request;", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails;", "mobileSessionId", "", "paymentSessionId", Constants.KEY_TYPE, "Lcom/checkout/components/interfaces/model/ComponentName;", Fixtures.PAYMENT_ID, "requestErrorCodes", "", "requestId", "status", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/ComponentName;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "getMobileSessionId", "()Ljava/lang/String;", "getPaymentSessionId", "getType", "()Lcom/checkout/components/interfaces/model/ComponentName;", "getPaymentId", "getRequestErrorCodes", "()Ljava/util/List;", "getRequestId", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/ComponentName;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Request;", "equals", "", "other", "", "hashCode", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Request extends CheckoutErrorDetails {
        public static final int $stable = 8;

        @NotNull
        private final String mobileSessionId;

        @Nullable
        private final String paymentId;

        @NotNull
        private final String paymentSessionId;

        @Nullable
        private final List<String> requestErrorCodes;

        @Nullable
        private final String requestId;

        @Nullable
        private final Integer status;

        @Nullable
        private final ComponentName type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Request(@NotNull String mobileSessionId, @NotNull String paymentSessionId, @Nullable ComponentName componentName, @Nullable String str, @Nullable List<String> list, @Nullable String str2, @Nullable Integer num) {
            super(null);
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            this.mobileSessionId = mobileSessionId;
            this.paymentSessionId = paymentSessionId;
            this.type = componentName;
            this.paymentId = str;
            this.requestErrorCodes = list;
            this.requestId = str2;
            this.status = num;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, ComponentName componentName, String str3, List list, String str4, Integer num, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = request.mobileSessionId;
            }
            if ((i4 & 2) != 0) {
                str2 = request.paymentSessionId;
            }
            if ((i4 & 4) != 0) {
                componentName = request.type;
            }
            if ((i4 & 8) != 0) {
                str3 = request.paymentId;
            }
            if ((i4 & 16) != 0) {
                list = request.requestErrorCodes;
            }
            if ((i4 & 32) != 0) {
                str4 = request.requestId;
            }
            if ((i4 & 64) != 0) {
                num = request.status;
            }
            String str5 = str4;
            Integer num2 = num;
            List list2 = list;
            ComponentName componentName2 = componentName;
            return request.copy(str, str2, componentName2, str3, list2, str5, num2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final ComponentName getType() {
            return this.type;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        @Nullable
        public final List<String> component5() {
            return this.requestErrorCodes;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Integer getStatus() {
            return this.status;
        }

        @NotNull
        public final Request copy(@NotNull String mobileSessionId, @NotNull String paymentSessionId, @Nullable ComponentName type, @Nullable String paymentId, @Nullable List<String> requestErrorCodes, @Nullable String requestId, @Nullable Integer status) {
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            return new Request(mobileSessionId, paymentSessionId, type, paymentId, requestErrorCodes, requestId, status);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.mobileSessionId, request.mobileSessionId) && Intrinsics.areEqual(this.paymentSessionId, request.paymentSessionId) && Intrinsics.areEqual(this.type, request.type) && Intrinsics.areEqual(this.paymentId, request.paymentId) && Intrinsics.areEqual(this.requestErrorCodes, request.requestErrorCodes) && Intrinsics.areEqual(this.requestId, request.requestId) && Intrinsics.areEqual(this.status, request.status);
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @NotNull
        public String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @Nullable
        public final String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @NotNull
        public String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        @Nullable
        public final List<String> getRequestErrorCodes() {
            return this.requestErrorCodes;
        }

        @Nullable
        public final String getRequestId() {
            return this.requestId;
        }

        @Nullable
        public final Integer getStatus() {
            return this.status;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @Nullable
        public ComponentName getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int a6 = b.a(this.paymentSessionId, this.mobileSessionId.hashCode() * 31, 31);
            ComponentName componentName = this.type;
            int i4 = 0;
            if (componentName == null) {
                hashCode = 0;
            } else {
                hashCode = componentName.hashCode();
            }
            int i5 = (a6 + hashCode) * 31;
            String str = this.paymentId;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i10 = (i5 + hashCode2) * 31;
            List<String> list = this.requestErrorCodes;
            if (list == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = list.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str2 = this.requestId;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            Integer num = this.status;
            if (num != null) {
                i4 = num.hashCode();
            }
            return i12 + i4;
        }

        @NotNull
        public String toString() {
            String str = this.mobileSessionId;
            String str2 = this.paymentSessionId;
            ComponentName componentName = this.type;
            String str3 = this.paymentId;
            List<String> list = this.requestErrorCodes;
            String str4 = this.requestId;
            Integer num = this.status;
            StringBuilder india = q.india("Request(mobileSessionId=", str, ", paymentSessionId=", str2, ", type=");
            india.append(componentName);
            india.append(", paymentId=");
            india.append(str3);
            india.append(", requestErrorCodes=");
            india.append(list);
            india.append(", requestId=");
            india.append(str4);
            india.append(", status=");
            india.append(num);
            india.append(")");
            return india.toString();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/interfaces/error/CheckoutErrorDetails$Submit;", "Lcom/checkout/components/interfaces/error/CheckoutErrorDetails;", "mobileSessionId", "", "paymentSessionId", Constants.KEY_TYPE, "Lcom/checkout/components/interfaces/model/ComponentName;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/ComponentName;)V", "getMobileSessionId", "()Ljava/lang/String;", "getPaymentSessionId", "getType", "()Lcom/checkout/components/interfaces/model/ComponentName;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Submit extends CheckoutErrorDetails {
        public static final int $stable = 8;

        @NotNull
        private final String mobileSessionId;

        @NotNull
        private final String paymentSessionId;

        @NotNull
        private final ComponentName type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Submit(@NotNull String mobileSessionId, @NotNull String paymentSessionId, @NotNull ComponentName type) {
            super(null);
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            Intrinsics.echo(type, "type");
            this.mobileSessionId = mobileSessionId;
            this.paymentSessionId = paymentSessionId;
            this.type = type;
        }

        public static /* synthetic */ Submit copy$default(Submit submit, String str, String str2, ComponentName componentName, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = submit.mobileSessionId;
            }
            if ((i4 & 2) != 0) {
                str2 = submit.paymentSessionId;
            }
            if ((i4 & 4) != 0) {
                componentName = submit.type;
            }
            return submit.copy(str, str2, componentName);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ComponentName getType() {
            return this.type;
        }

        @NotNull
        public final Submit copy(@NotNull String mobileSessionId, @NotNull String paymentSessionId, @NotNull ComponentName type) {
            Intrinsics.echo(mobileSessionId, "mobileSessionId");
            Intrinsics.echo(paymentSessionId, "paymentSessionId");
            Intrinsics.echo(type, "type");
            return new Submit(mobileSessionId, paymentSessionId, type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) other;
            return Intrinsics.areEqual(this.mobileSessionId, submit.mobileSessionId) && Intrinsics.areEqual(this.paymentSessionId, submit.paymentSessionId) && Intrinsics.areEqual(this.type, submit.type);
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @NotNull
        public String getMobileSessionId() {
            return this.mobileSessionId;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @NotNull
        public String getPaymentSessionId() {
            return this.paymentSessionId;
        }

        @Override // com.checkout.components.interfaces.error.CheckoutErrorDetails
        @NotNull
        public ComponentName getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + b.a(this.paymentSessionId, this.mobileSessionId.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.mobileSessionId;
            String str2 = this.paymentSessionId;
            ComponentName componentName = this.type;
            StringBuilder india = q.india("Submit(mobileSessionId=", str, ", paymentSessionId=", str2, ", type=");
            india.append(componentName);
            india.append(")");
            return india.toString();
        }
    }

    public /* synthetic */ CheckoutErrorDetails(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getMobileSessionId();

    @NotNull
    public abstract String getPaymentSessionId();

    @Nullable
    public abstract ComponentName getType();

    private CheckoutErrorDetails() {
    }
}
