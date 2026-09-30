package com.checkout.components.interfaces.insight;

import Q0.c;
import androidx.appcompat.widget.P0;
import av.q;
import com.checkout.components.core.common.Fixtures;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\r¨\u0006-"}, d2 = {"Lcom/checkout/components/interfaces/insight/ProductEventProperties;", "", "", "componentName", "paymentMethodName", "actionType", "renderer", Fixtures.PAYMENT_ID, "result", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/insight/ProductEventProperties;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getComponentName", "b", "getPaymentMethodName", "c", "getActionType", com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "getRenderer", "e", "getPaymentId", "f", "getResult", "g", "getName", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductEventProperties {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String componentName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String paymentMethodName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String actionType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String renderer;

    /* renamed from: e, reason: from kotlin metadata */
    private final String paymentId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String result;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String name;

    public ProductEventProperties() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static ProductEventProperties copy$default(ProductEventProperties productEventProperties, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = productEventProperties.componentName;
        }
        if ((i4 & 2) != 0) {
            str2 = productEventProperties.paymentMethodName;
        }
        if ((i4 & 4) != 0) {
            str3 = productEventProperties.actionType;
        }
        if ((i4 & 8) != 0) {
            str4 = productEventProperties.renderer;
        }
        if ((i4 & 16) != 0) {
            str5 = productEventProperties.paymentId;
        }
        if ((i4 & 32) != 0) {
            str6 = productEventProperties.result;
        }
        if ((i4 & 64) != 0) {
            str7 = productEventProperties.name;
        }
        String str8 = str7;
        productEventProperties.getClass();
        String str9 = str6;
        String str10 = str5;
        String str11 = str3;
        return new ProductEventProperties(str, str2, str11, str4, str10, str9, str8);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getComponentName() {
        return this.componentName;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getRenderer() {
        return this.renderer;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ProductEventProperties copy(@Nullable String componentName, @Nullable String paymentMethodName, @Nullable String actionType, @Nullable String renderer, @Nullable String paymentId, @Nullable String result, @Nullable String name) {
        return new ProductEventProperties(componentName, paymentMethodName, actionType, renderer, paymentId, result, name);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductEventProperties)) {
            return false;
        }
        ProductEventProperties productEventProperties = (ProductEventProperties) other;
        return Intrinsics.areEqual(this.componentName, productEventProperties.componentName) && Intrinsics.areEqual(this.paymentMethodName, productEventProperties.paymentMethodName) && Intrinsics.areEqual(this.actionType, productEventProperties.actionType) && Intrinsics.areEqual(this.renderer, productEventProperties.renderer) && Intrinsics.areEqual(this.paymentId, productEventProperties.paymentId) && Intrinsics.areEqual(this.result, productEventProperties.result) && Intrinsics.areEqual(this.name, productEventProperties.name);
    }

    @Nullable
    public final String getActionType() {
        return this.actionType;
    }

    @Nullable
    public final String getComponentName() {
        return this.componentName;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPaymentId() {
        return this.paymentId;
    }

    @Nullable
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    @Nullable
    public final String getRenderer() {
        return this.renderer;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    public final int hashCode() {
        String str = this.componentName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentMethodName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.renderer;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.result;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.name;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        String str = this.componentName;
        String str2 = this.paymentMethodName;
        String str3 = this.actionType;
        String str4 = this.renderer;
        String str5 = this.paymentId;
        String str6 = this.result;
        String str7 = this.name;
        StringBuilder india = q.india("ProductEventProperties(componentName=", str, ", paymentMethodName=", str2, ", actionType=");
        c.azure(india, str3, ", renderer=", str4, ", paymentId=");
        c.azure(india, str5, ", result=", str6, ", name=");
        return P0.gold(india, str7, ")");
    }

    public ProductEventProperties(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.componentName = str;
        this.paymentMethodName = str2;
        this.actionType = str3;
        this.renderer = str4;
        this.paymentId = str5;
        this.result = str6;
        this.name = str7;
    }

    public /* synthetic */ ProductEventProperties(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5, (i4 & 32) != 0 ? null : str6, (i4 & 64) != 0 ? null : str7);
    }
}
