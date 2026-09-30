package com.checkout.components.interfaces.model.paymentsession;

import Q0.c;
import av.q;
import com.checkout.components.interfaces.b;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u001e\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b%\u0010&J\u009e\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0017J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010\u001bJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u00100\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00100\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b=\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u00100\u001a\u0004\b?\u0010\u0017R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bC\u00105\u001a\u0004\bB\u0010\u001fR(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010A\u0012\u0004\bF\u00105\u001a\u0004\bE\u0010\u001fR%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010&¨\u0006P"}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "", "", Constants.KEY_ID, "entityId", "processingChannelId", "", "amount", "locale", "currency", "", "Lcom/checkout/components/interfaces/model/paymentsession/PaymentMethod;", "paymentMethods", "featureFlags", "", "experiments", "Lcom/checkout/components/interfaces/model/paymentsession/Risk;", "risk", "Lcom/checkout/components/interfaces/model/paymentsession/Links;", Constants.KEY_LINKS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/checkout/components/interfaces/model/paymentsession/Risk;Lcom/checkout/components/interfaces/model/paymentsession/Links;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "()Ljava/util/Map;", "component10", "()Lcom/checkout/components/interfaces/model/paymentsession/Risk;", "component11", "()Lcom/checkout/components/interfaces/model/paymentsession/Links;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/checkout/components/interfaces/model/paymentsession/Risk;Lcom/checkout/components/interfaces/model/paymentsession/Links;)Lcom/checkout/components/interfaces/model/paymentsession/PaymentSession;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getEntityId", "getEntityId$annotations", "()V", "c", "getProcessingChannelId", "getProcessingChannelId$annotations", Constants.INAPP_DATA_TAG, "I", "getAmount", "e", "getLocale", "f", "getCurrency", "g", "Ljava/util/List;", "getPaymentMethods", "getPaymentMethods$annotations", "h", "getFeatureFlags", "getFeatureFlags$annotations", "i", "Ljava/util/Map;", "getExperiments", "j", "Lcom/checkout/components/interfaces/model/paymentsession/Risk;", "getRisk", "k", "Lcom/checkout/components/interfaces/model/paymentsession/Links;", "getLinks", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentSession {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String entityId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String processingChannelId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int amount;

    /* renamed from: e, reason: from kotlin metadata */
    private final String locale;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String currency;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List paymentMethods;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List featureFlags;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map experiments;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Risk risk;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Links links;

    public PaymentSession(@NotNull String id2, @Json(name = "entity_id") @NotNull String entityId, @Json(name = "processing_channel_id") @NotNull String processingChannelId, int i4, @NotNull String locale, @NotNull String currency, @Json(name = "payment_methods") @NotNull List<PaymentMethod> paymentMethods, @Json(name = "feature_flags") @Nullable List<String> list, @Nullable Map<String, String> map, @Nullable Risk risk, @Nullable Links links) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(entityId, "entityId");
        Intrinsics.echo(processingChannelId, "processingChannelId");
        Intrinsics.echo(locale, "locale");
        Intrinsics.echo(currency, "currency");
        Intrinsics.echo(paymentMethods, "paymentMethods");
        this.id = id2;
        this.entityId = entityId;
        this.processingChannelId = processingChannelId;
        this.amount = i4;
        this.locale = locale;
        this.currency = currency;
        this.paymentMethods = paymentMethods;
        this.featureFlags = list;
        this.experiments = map;
        this.risk = risk;
        this.links = links;
    }

    public static /* synthetic */ PaymentSession copy$default(PaymentSession paymentSession, String str, String str2, String str3, int i4, String str4, String str5, List list, List list2, Map map, Risk risk, Links links, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = paymentSession.id;
        }
        if ((i5 & 2) != 0) {
            str2 = paymentSession.entityId;
        }
        if ((i5 & 4) != 0) {
            str3 = paymentSession.processingChannelId;
        }
        if ((i5 & 8) != 0) {
            i4 = paymentSession.amount;
        }
        if ((i5 & 16) != 0) {
            str4 = paymentSession.locale;
        }
        if ((i5 & 32) != 0) {
            str5 = paymentSession.currency;
        }
        if ((i5 & 64) != 0) {
            list = paymentSession.paymentMethods;
        }
        if ((i5 & 128) != 0) {
            list2 = paymentSession.featureFlags;
        }
        if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
            map = paymentSession.experiments;
        }
        if ((i5 & 512) != 0) {
            risk = paymentSession.risk;
        }
        if ((i5 & Barcode.FORMAT_UPC_E) != 0) {
            links = paymentSession.links;
        }
        Risk risk2 = risk;
        Links links2 = links;
        List list3 = list2;
        Map map2 = map;
        String str6 = str5;
        List list4 = list;
        String str7 = str4;
        String str8 = str3;
        return paymentSession.copy(str, str2, str8, i4, str7, str6, list4, list3, map2, risk2, links2);
    }

    @Json(name = "entity_id")
    public static /* synthetic */ void getEntityId$annotations() {
    }

    @Json(name = "feature_flags")
    public static /* synthetic */ void getFeatureFlags$annotations() {
    }

    @Json(name = "payment_methods")
    public static /* synthetic */ void getPaymentMethods$annotations() {
    }

    @Json(name = "processing_channel_id")
    public static /* synthetic */ void getProcessingChannelId$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Risk getRisk() {
        return this.risk;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Links getLinks() {
        return this.links;
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

    /* renamed from: component4, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final List<PaymentMethod> component7() {
        return this.paymentMethods;
    }

    @Nullable
    public final List<String> component8() {
        return this.featureFlags;
    }

    @Nullable
    public final Map<String, String> component9() {
        return this.experiments;
    }

    @NotNull
    public final PaymentSession copy(@NotNull String id2, @Json(name = "entity_id") @NotNull String entityId, @Json(name = "processing_channel_id") @NotNull String processingChannelId, int amount, @NotNull String locale, @NotNull String currency, @Json(name = "payment_methods") @NotNull List<PaymentMethod> paymentMethods, @Json(name = "feature_flags") @Nullable List<String> featureFlags, @Nullable Map<String, String> experiments, @Nullable Risk risk, @Nullable Links links) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(entityId, "entityId");
        Intrinsics.echo(processingChannelId, "processingChannelId");
        Intrinsics.echo(locale, "locale");
        Intrinsics.echo(currency, "currency");
        Intrinsics.echo(paymentMethods, "paymentMethods");
        return new PaymentSession(id2, entityId, processingChannelId, amount, locale, currency, paymentMethods, featureFlags, experiments, risk, links);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSession)) {
            return false;
        }
        PaymentSession paymentSession = (PaymentSession) other;
        return Intrinsics.areEqual(this.id, paymentSession.id) && Intrinsics.areEqual(this.entityId, paymentSession.entityId) && Intrinsics.areEqual(this.processingChannelId, paymentSession.processingChannelId) && this.amount == paymentSession.amount && Intrinsics.areEqual(this.locale, paymentSession.locale) && Intrinsics.areEqual(this.currency, paymentSession.currency) && Intrinsics.areEqual(this.paymentMethods, paymentSession.paymentMethods) && Intrinsics.areEqual(this.featureFlags, paymentSession.featureFlags) && Intrinsics.areEqual(this.experiments, paymentSession.experiments) && Intrinsics.areEqual(this.risk, paymentSession.risk) && Intrinsics.areEqual(this.links, paymentSession.links);
    }

    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
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
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Links getLinks() {
        return this.links;
    }

    @NotNull
    public final String getLocale() {
        return this.locale;
    }

    @NotNull
    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    @NotNull
    public final String getProcessingChannelId() {
        return this.processingChannelId;
    }

    @Nullable
    public final Risk getRisk() {
        return this.risk;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int golf = j.golf(b.a(this.currency, b.a(this.locale, (this.amount + b.a(this.processingChannelId, b.a(this.entityId, this.id.hashCode() * 31, 31), 31)) * 31, 31), 31), 31, this.paymentMethods);
        List list = this.featureFlags;
        int i4 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i5 = (golf + hashCode) * 31;
        Map map = this.experiments;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Risk risk = this.risk;
        if (risk == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = risk.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Links links = this.links;
        if (links != null) {
            i4 = links.hashCode();
        }
        return i11 + i4;
    }

    @NotNull
    public final String toString() {
        String str = this.id;
        String str2 = this.entityId;
        String str3 = this.processingChannelId;
        int i4 = this.amount;
        String str4 = this.locale;
        String str5 = this.currency;
        List list = this.paymentMethods;
        List list2 = this.featureFlags;
        Map map = this.experiments;
        Risk risk = this.risk;
        Links links = this.links;
        StringBuilder india = q.india("PaymentSession(id=", str, ", entityId=", str2, ", processingChannelId=");
        india.append(str3);
        india.append(", amount=");
        india.append(i4);
        india.append(", locale=");
        c.azure(india, str4, ", currency=", str5, ", paymentMethods=");
        india.append(list);
        india.append(", featureFlags=");
        india.append(list2);
        india.append(", experiments=");
        india.append(map);
        india.append(", risk=");
        india.append(risk);
        india.append(", links=");
        india.append(links);
        india.append(")");
        return india.toString();
    }
}
