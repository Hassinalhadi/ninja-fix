package com.checkout.components.interfaces.insight;

import av.q;
import com.checkout.components.interfaces.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JX\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013¨\u0006+"}, d2 = {"Lcom/checkout/components/interfaces/insight/PaymentSessionDetails;", "", "", "paymentSessionId", "entityId", "processingChannelId", "", "featureFlags", "", "experiments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Ljava/util/Map;", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lcom/checkout/components/interfaces/insight/PaymentSessionDetails;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPaymentSessionId", "b", "getEntityId", "c", "getProcessingChannelId", com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "Ljava/util/List;", "getFeatureFlags", "e", "Ljava/util/Map;", "getExperiments", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentSessionDetails {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String paymentSessionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String entityId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String processingChannelId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List featureFlags;

    /* renamed from: e, reason: from kotlin metadata */
    private final Map experiments;

    public PaymentSessionDetails(@NotNull String paymentSessionId, @NotNull String entityId, @NotNull String processingChannelId, @Nullable List<String> list, @Nullable Map<String, String> map) {
        Intrinsics.echo(paymentSessionId, "paymentSessionId");
        Intrinsics.echo(entityId, "entityId");
        Intrinsics.echo(processingChannelId, "processingChannelId");
        this.paymentSessionId = paymentSessionId;
        this.entityId = entityId;
        this.processingChannelId = processingChannelId;
        this.featureFlags = list;
        this.experiments = map;
    }

    public static /* synthetic */ PaymentSessionDetails copy$default(PaymentSessionDetails paymentSessionDetails, String str, String str2, String str3, List list, Map map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = paymentSessionDetails.paymentSessionId;
        }
        if ((i4 & 2) != 0) {
            str2 = paymentSessionDetails.entityId;
        }
        if ((i4 & 4) != 0) {
            str3 = paymentSessionDetails.processingChannelId;
        }
        if ((i4 & 8) != 0) {
            list = paymentSessionDetails.featureFlags;
        }
        if ((i4 & 16) != 0) {
            map = paymentSessionDetails.experiments;
        }
        Map map2 = map;
        String str4 = str3;
        return paymentSessionDetails.copy(str, str2, str4, list, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPaymentSessionId() {
        return this.paymentSessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEntityId() {
        return this.entityId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getProcessingChannelId() {
        return this.processingChannelId;
    }

    @Nullable
    public final List<String> component4() {
        return this.featureFlags;
    }

    @Nullable
    public final Map<String, String> component5() {
        return this.experiments;
    }

    @NotNull
    public final PaymentSessionDetails copy(@NotNull String paymentSessionId, @NotNull String entityId, @NotNull String processingChannelId, @Nullable List<String> featureFlags, @Nullable Map<String, String> experiments) {
        Intrinsics.echo(paymentSessionId, "paymentSessionId");
        Intrinsics.echo(entityId, "entityId");
        Intrinsics.echo(processingChannelId, "processingChannelId");
        return new PaymentSessionDetails(paymentSessionId, entityId, processingChannelId, featureFlags, experiments);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSessionDetails)) {
            return false;
        }
        PaymentSessionDetails paymentSessionDetails = (PaymentSessionDetails) other;
        return Intrinsics.areEqual(this.paymentSessionId, paymentSessionDetails.paymentSessionId) && Intrinsics.areEqual(this.entityId, paymentSessionDetails.entityId) && Intrinsics.areEqual(this.processingChannelId, paymentSessionDetails.processingChannelId) && Intrinsics.areEqual(this.featureFlags, paymentSessionDetails.featureFlags) && Intrinsics.areEqual(this.experiments, paymentSessionDetails.experiments);
    }

    @NotNull
    public final String getEntityId() {
        return this.entityId;
    }

    @Nullable
    public final Map<String, String> getExperiments() {
        return this.experiments;
    }

    @Nullable
    public final List<String> getFeatureFlags() {
        return this.featureFlags;
    }

    @NotNull
    public final String getPaymentSessionId() {
        return this.paymentSessionId;
    }

    @NotNull
    public final String getProcessingChannelId() {
        return this.processingChannelId;
    }

    public final int hashCode() {
        int hashCode;
        int a6 = b.a(this.processingChannelId, b.a(this.entityId, this.paymentSessionId.hashCode() * 31, 31), 31);
        List list = this.featureFlags;
        int i4 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i5 = (a6 + hashCode) * 31;
        Map map = this.experiments;
        if (map != null) {
            i4 = map.hashCode();
        }
        return i5 + i4;
    }

    @NotNull
    public final String toString() {
        String str = this.paymentSessionId;
        String str2 = this.entityId;
        String str3 = this.processingChannelId;
        List list = this.featureFlags;
        Map map = this.experiments;
        StringBuilder india = q.india("PaymentSessionDetails(paymentSessionId=", str, ", entityId=", str2, ", processingChannelId=");
        india.append(str3);
        india.append(", featureFlags=");
        india.append(list);
        india.append(", experiments=");
        india.append(map);
        india.append(")");
        return india.toString();
    }

    public /* synthetic */ PaymentSessionDetails(String str, String str2, String str3, List list, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, (i4 & 16) != 0 ? null : map);
    }
}
