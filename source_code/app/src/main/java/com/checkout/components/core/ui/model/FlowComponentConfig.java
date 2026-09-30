package com.checkout.components.core.ui.model;

import Q0.n;
import android.content.Context;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001Bo\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÀ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010!\u001a\u00020\bHÀ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010$\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\"\u0010#J\u001e\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0010\u0010)\u001a\u00020\u000fHÀ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010,\u001a\u00020\u0011HÀ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010/\u001a\u0004\u0018\u00010\u0013HÀ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u00102\u001a\u0004\u0018\u00010\u0015HÀ\u0003¢\u0006\u0004\b0\u00101J\u0088\u0001\u00103\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010 R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010#R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010?\u001a\u0004\bK\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010(R\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010+R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u00101¨\u0006X"}, d2 = {"Lcom/checkout/components/core/ui/model/FlowComponentConfig;", "", "", "Lcom/checkout/components/interfaces/model/ComponentName;", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "components", "Lcom/checkout/components/core/ui/model/ComposeStyle;", "style", "Landroid/content/Context;", "context", "LQ0/n;", "layoutDirection", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "translation", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "componentCallback", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lcom/checkout/components/rememberme/CheckoutRememberMe;", "rememberMe", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "<init>", "(Ljava/util/Map;Lcom/checkout/components/core/ui/model/ComposeStyle;Landroid/content/Context;LQ0/n;Ljava/util/Map;Lcom/checkout/components/interfaces/component/ComponentCallback;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/rememberme/CheckoutRememberMe;Lcom/checkout/components/interfaces/insight/Logger;)V", "component1$core_standardRelease", "()Ljava/util/Map;", "component1", "component2$core_standardRelease", "()Lcom/checkout/components/core/ui/model/ComposeStyle;", "component2", "component3$core_standardRelease", "()Landroid/content/Context;", "component3", "component4$core_standardRelease", "()LQ0/n;", "component4", "component5$core_standardRelease", "component5", "component6$core_standardRelease", "()Lcom/checkout/components/interfaces/component/ComponentCallback;", "component6", "component7$core_standardRelease", "()Lcom/checkout/components/interfaces/insight/LogDetails;", "component7", "component8$core_standardRelease", "()Lcom/checkout/components/rememberme/CheckoutRememberMe;", "component8", "component9$core_standardRelease", "()Lcom/checkout/components/interfaces/insight/Logger;", "component9", Constants.COPY_TYPE, "(Ljava/util/Map;Lcom/checkout/components/core/ui/model/ComposeStyle;Landroid/content/Context;LQ0/n;Ljava/util/Map;Lcom/checkout/components/interfaces/component/ComponentCallback;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/rememberme/CheckoutRememberMe;Lcom/checkout/components/interfaces/insight/Logger;)Lcom/checkout/components/core/ui/model/FlowComponentConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "getComponents$core_standardRelease", "b", "Lcom/checkout/components/core/ui/model/ComposeStyle;", "getStyle$core_standardRelease", "c", "Landroid/content/Context;", "getContext$core_standardRelease", Constants.INAPP_DATA_TAG, "LQ0/n;", "getLayoutDirection$core_standardRelease", "e", "getTranslation$core_standardRelease", "f", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "getComponentCallback$core_standardRelease", "g", "Lcom/checkout/components/interfaces/insight/LogDetails;", "getLogDetails$core_standardRelease", "h", "Lcom/checkout/components/rememberme/CheckoutRememberMe;", "getRememberMe$core_standardRelease", "i", "Lcom/checkout/components/interfaces/insight/Logger;", "getLogger$core_standardRelease", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FlowComponentConfig {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map components;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ComposeStyle style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n layoutDirection;

    /* renamed from: e, reason: from kotlin metadata */
    private final Map translation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ComponentCallback componentCallback;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final LogDetails logDetails;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CheckoutRememberMe rememberMe;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Logger logger;

    public FlowComponentConfig(@NotNull Map<ComponentName, ? extends PaymentMethodComponent> components, @NotNull ComposeStyle style, @NotNull Context context, @NotNull n layoutDirection, @Nullable Map<ComponentTranslationKey, String> map, @NotNull ComponentCallback componentCallback, @NotNull LogDetails logDetails, @Nullable CheckoutRememberMe checkoutRememberMe, @Nullable Logger logger) {
        Intrinsics.echo(components, "components");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(layoutDirection, "layoutDirection");
        Intrinsics.echo(componentCallback, "componentCallback");
        Intrinsics.echo(logDetails, "logDetails");
        this.components = components;
        this.style = style;
        this.context = context;
        this.layoutDirection = layoutDirection;
        this.translation = map;
        this.componentCallback = componentCallback;
        this.logDetails = logDetails;
        this.rememberMe = checkoutRememberMe;
        this.logger = logger;
    }

    public static /* synthetic */ FlowComponentConfig copy$default(FlowComponentConfig flowComponentConfig, Map map, ComposeStyle composeStyle, Context context, n nVar, Map map2, ComponentCallback componentCallback, LogDetails logDetails, CheckoutRememberMe checkoutRememberMe, Logger logger, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            map = flowComponentConfig.components;
        }
        if ((i4 & 2) != 0) {
            composeStyle = flowComponentConfig.style;
        }
        if ((i4 & 4) != 0) {
            context = flowComponentConfig.context;
        }
        if ((i4 & 8) != 0) {
            nVar = flowComponentConfig.layoutDirection;
        }
        if ((i4 & 16) != 0) {
            map2 = flowComponentConfig.translation;
        }
        if ((i4 & 32) != 0) {
            componentCallback = flowComponentConfig.componentCallback;
        }
        if ((i4 & 64) != 0) {
            logDetails = flowComponentConfig.logDetails;
        }
        if ((i4 & 128) != 0) {
            checkoutRememberMe = flowComponentConfig.rememberMe;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            logger = flowComponentConfig.logger;
        }
        CheckoutRememberMe checkoutRememberMe2 = checkoutRememberMe;
        Logger logger2 = logger;
        ComponentCallback componentCallback2 = componentCallback;
        LogDetails logDetails2 = logDetails;
        Map map3 = map2;
        Context context2 = context;
        return flowComponentConfig.copy(map, composeStyle, context2, nVar, map3, componentCallback2, logDetails2, checkoutRememberMe2, logger2);
    }

    @NotNull
    public final Map<ComponentName, PaymentMethodComponent> component1$core_standardRelease() {
        return this.components;
    }

    @NotNull
    /* renamed from: component2$core_standardRelease, reason: from getter */
    public final ComposeStyle getStyle() {
        return this.style;
    }

    @NotNull
    /* renamed from: component3$core_standardRelease, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* renamed from: component4$core_standardRelease, reason: from getter */
    public final n getLayoutDirection() {
        return this.layoutDirection;
    }

    @Nullable
    public final Map<ComponentTranslationKey, String> component5$core_standardRelease() {
        return this.translation;
    }

    @NotNull
    /* renamed from: component6$core_standardRelease, reason: from getter */
    public final ComponentCallback getComponentCallback() {
        return this.componentCallback;
    }

    @NotNull
    /* renamed from: component7$core_standardRelease, reason: from getter */
    public final LogDetails getLogDetails() {
        return this.logDetails;
    }

    @Nullable
    /* renamed from: component8$core_standardRelease, reason: from getter */
    public final CheckoutRememberMe getRememberMe() {
        return this.rememberMe;
    }

    @Nullable
    /* renamed from: component9$core_standardRelease, reason: from getter */
    public final Logger getLogger() {
        return this.logger;
    }

    @NotNull
    public final FlowComponentConfig copy(@NotNull Map<ComponentName, ? extends PaymentMethodComponent> components, @NotNull ComposeStyle style, @NotNull Context context, @NotNull n layoutDirection, @Nullable Map<ComponentTranslationKey, String> translation, @NotNull ComponentCallback componentCallback, @NotNull LogDetails logDetails, @Nullable CheckoutRememberMe rememberMe, @Nullable Logger logger) {
        Intrinsics.echo(components, "components");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(layoutDirection, "layoutDirection");
        Intrinsics.echo(componentCallback, "componentCallback");
        Intrinsics.echo(logDetails, "logDetails");
        return new FlowComponentConfig(components, style, context, layoutDirection, translation, componentCallback, logDetails, rememberMe, logger);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowComponentConfig)) {
            return false;
        }
        FlowComponentConfig flowComponentConfig = (FlowComponentConfig) other;
        return Intrinsics.areEqual(this.components, flowComponentConfig.components) && Intrinsics.areEqual(this.style, flowComponentConfig.style) && Intrinsics.areEqual(this.context, flowComponentConfig.context) && this.layoutDirection == flowComponentConfig.layoutDirection && Intrinsics.areEqual(this.translation, flowComponentConfig.translation) && Intrinsics.areEqual(this.componentCallback, flowComponentConfig.componentCallback) && Intrinsics.areEqual(this.logDetails, flowComponentConfig.logDetails) && Intrinsics.areEqual(this.rememberMe, flowComponentConfig.rememberMe) && Intrinsics.areEqual(this.logger, flowComponentConfig.logger);
    }

    @NotNull
    public final ComponentCallback getComponentCallback$core_standardRelease() {
        return this.componentCallback;
    }

    @NotNull
    public final Map<ComponentName, PaymentMethodComponent> getComponents$core_standardRelease() {
        return this.components;
    }

    @NotNull
    public final Context getContext$core_standardRelease() {
        return this.context;
    }

    @NotNull
    public final n getLayoutDirection$core_standardRelease() {
        return this.layoutDirection;
    }

    @NotNull
    public final LogDetails getLogDetails$core_standardRelease() {
        return this.logDetails;
    }

    @Nullable
    public final Logger getLogger$core_standardRelease() {
        return this.logger;
    }

    @Nullable
    public final CheckoutRememberMe getRememberMe$core_standardRelease() {
        return this.rememberMe;
    }

    @NotNull
    public final ComposeStyle getStyle$core_standardRelease() {
        return this.style;
    }

    @Nullable
    public final Map<ComponentTranslationKey, String> getTranslation$core_standardRelease() {
        return this.translation;
    }

    public final int hashCode() {
        int hashCode = (this.layoutDirection.hashCode() + ((this.context.hashCode() + ((this.style.hashCode() + (this.components.hashCode() * 31)) * 31)) * 31)) * 31;
        Map map = this.translation;
        int hashCode2 = (this.logDetails.hashCode() + ((this.componentCallback.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31)) * 31;
        CheckoutRememberMe checkoutRememberMe = this.rememberMe;
        int hashCode3 = (hashCode2 + (checkoutRememberMe == null ? 0 : checkoutRememberMe.hashCode())) * 31;
        Logger logger = this.logger;
        return hashCode3 + (logger != null ? logger.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "FlowComponentConfig(components=" + this.components + ", style=" + this.style + ", context=" + this.context + ", layoutDirection=" + this.layoutDirection + ", translation=" + this.translation + ", componentCallback=" + this.componentCallback + ", logDetails=" + this.logDetails + ", rememberMe=" + this.rememberMe + ", logger=" + this.logger + ")";
    }

    public /* synthetic */ FlowComponentConfig(Map map, ComposeStyle composeStyle, Context context, n nVar, Map map2, ComponentCallback componentCallback, LogDetails logDetails, CheckoutRememberMe checkoutRememberMe, Logger logger, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, composeStyle, context, nVar, map2, componentCallback, logDetails, checkoutRememberMe, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : logger);
    }
}
