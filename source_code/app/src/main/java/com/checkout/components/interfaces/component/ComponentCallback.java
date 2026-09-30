package com.checkout.components.interfaces.component;

import Xd.l;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0001CB\u009f\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012&\b\u0002\u0010\u0010\u001a \b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002\u0012*\b\u0002\u0010\u0015\u001a$\b\u0001\u0012\b\u0012\u00060\tj\u0002`\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u0012&\b\u0002\u0010\u0017\u001a \b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ$\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ.\u0010!\u001a \b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ2\u0010#\u001a$\b\u0001\u0012\b\u0012\u00060\tj\u0002`\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ.\u0010$\u001a \b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ¨\u0002\u0010%\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2&\b\u0002\u0010\u0010\u001a \b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00022*\b\u0002\u0010\u0015\u001a$\b\u0001\u0012\b\u0012\u00060\tj\u0002`\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2&\b\u0002\u0010\u0017\u001a \b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001bR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010\u001bR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u0010\u001bR+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001fR+\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010\u001fR5\u0010\u0010\u001a \b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u0010\u001fR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b>\u0010\u001bR9\u0010\u0015\u001a$\b\u0001\u0012\b\u0012\u00060\tj\u0002`\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u0010\u001fR5\u0010\u0017\u001a \b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010\u001f¨\u0006D"}, d2 = {"Lcom/checkout/components/interfaces/component/ComponentCallback;", "", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "", "onReady", "onChange", "onSubmit", "Lkotlin/Function2;", "", "onSuccess", "Lcom/checkout/components/interfaces/error/CheckoutError;", "onError", "Lcom/checkout/components/interfaces/model/TokenizationResult;", "LNd/c;", "Lcom/checkout/components/interfaces/model/CallbackResult;", "onTokenized", "Lcom/checkout/components/interfaces/model/CardMetadata;", "onCardBinChanged", "Lcom/checkout/components/interfaces/model/paymentsession/SessionData;", "Lcom/checkout/components/interfaces/model/ApiCallResult;", "handleSubmit", "", "handleTap", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LXd/l;LXd/l;LXd/l;Lkotlin/jvm/functions/Function1;LXd/l;LXd/l;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "component3", "component4", "()LXd/l;", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LXd/l;LXd/l;LXd/l;Lkotlin/jvm/functions/Function1;LXd/l;LXd/l;)Lcom/checkout/components/interfaces/component/ComponentCallback;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function1;", "getOnReady", "b", "getOnChange", "c", "getOnSubmit", Constants.INAPP_DATA_TAG, "LXd/l;", "getOnSuccess", "e", "getOnError", "f", "getOnTokenized", "g", "getOnCardBinChanged", "h", "getHandleSubmit", "i", "getHandleTap", "Companion", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class ComponentCallback {
    public static final int $stable = 8;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    private static final ComponentCallback f5282j = new ComponentCallback(null, null, null, null, null, null, null, null, null, 511, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1 onReady;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1 onChange;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1 onSubmit;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l onSuccess;

    /* renamed from: e, reason: from kotlin metadata */
    private final l onError;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l onTokenized;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function1 onCardBinChanged;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final l handleSubmit;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final l handleTap;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/checkout/components/interfaces/component/ComponentCallback$Companion;", "", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "NO_OPS", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "getNO_OPS", "()Lcom/checkout/components/interfaces/component/ComponentCallback;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final ComponentCallback getNO_OPS() {
            return ComponentCallback.f5282j;
        }
    }

    public ComponentCallback() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static ComponentCallback copy$default(ComponentCallback componentCallback, Function1 function1, Function1 function12, Function1 function13, l lVar, l lVar2, l lVar3, Function1 function14, l lVar4, l lVar5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            function1 = componentCallback.onReady;
        }
        if ((i4 & 2) != 0) {
            function12 = componentCallback.onChange;
        }
        if ((i4 & 4) != 0) {
            function13 = componentCallback.onSubmit;
        }
        if ((i4 & 8) != 0) {
            lVar = componentCallback.onSuccess;
        }
        if ((i4 & 16) != 0) {
            lVar2 = componentCallback.onError;
        }
        if ((i4 & 32) != 0) {
            lVar3 = componentCallback.onTokenized;
        }
        if ((i4 & 64) != 0) {
            function14 = componentCallback.onCardBinChanged;
        }
        if ((i4 & 128) != 0) {
            lVar4 = componentCallback.handleSubmit;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            lVar5 = componentCallback.handleTap;
        }
        l lVar6 = lVar5;
        componentCallback.getClass();
        l lVar7 = lVar4;
        l lVar8 = lVar3;
        Function1 function15 = function14;
        l lVar9 = lVar2;
        Function1 function16 = function13;
        return new ComponentCallback(function1, function12, function16, lVar, lVar9, lVar8, function15, lVar7, lVar6);
    }

    @Nullable
    public final Function1<PaymentMethodComponent, Unit> component1() {
        return this.onReady;
    }

    @Nullable
    public final Function1<PaymentMethodComponent, Unit> component2() {
        return this.onChange;
    }

    @Nullable
    public final Function1<PaymentMethodComponent, Unit> component3() {
        return this.onSubmit;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final l getOnSuccess() {
        return this.onSuccess;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final l getOnError() {
        return this.onError;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final l getOnTokenized() {
        return this.onTokenized;
    }

    @Nullable
    public final Function1<CardMetadata, CallbackResult> component7() {
        return this.onCardBinChanged;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final l getHandleSubmit() {
        return this.handleSubmit;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final l getHandleTap() {
        return this.handleTap;
    }

    @NotNull
    public final ComponentCallback copy(@Nullable Function1<? super PaymentMethodComponent, Unit> onReady, @Nullable Function1<? super PaymentMethodComponent, Unit> onChange, @Nullable Function1<? super PaymentMethodComponent, Unit> onSubmit, @Nullable l onSuccess, @Nullable l onError, @Nullable l onTokenized, @Nullable Function1<? super CardMetadata, ? extends CallbackResult> onCardBinChanged, @Nullable l handleSubmit, @Nullable l handleTap) {
        return new ComponentCallback(onReady, onChange, onSubmit, onSuccess, onError, onTokenized, onCardBinChanged, handleSubmit, handleTap);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComponentCallback)) {
            return false;
        }
        ComponentCallback componentCallback = (ComponentCallback) other;
        return Intrinsics.areEqual(this.onReady, componentCallback.onReady) && Intrinsics.areEqual(this.onChange, componentCallback.onChange) && Intrinsics.areEqual(this.onSubmit, componentCallback.onSubmit) && Intrinsics.areEqual(this.onSuccess, componentCallback.onSuccess) && Intrinsics.areEqual(this.onError, componentCallback.onError) && Intrinsics.areEqual(this.onTokenized, componentCallback.onTokenized) && Intrinsics.areEqual(this.onCardBinChanged, componentCallback.onCardBinChanged) && Intrinsics.areEqual(this.handleSubmit, componentCallback.handleSubmit) && Intrinsics.areEqual(this.handleTap, componentCallback.handleTap);
    }

    @Nullable
    public final l getHandleSubmit() {
        return this.handleSubmit;
    }

    @Nullable
    public final l getHandleTap() {
        return this.handleTap;
    }

    @Nullable
    public final Function1<CardMetadata, CallbackResult> getOnCardBinChanged() {
        return this.onCardBinChanged;
    }

    @Nullable
    public final Function1<PaymentMethodComponent, Unit> getOnChange() {
        return this.onChange;
    }

    @Nullable
    public final l getOnError() {
        return this.onError;
    }

    @Nullable
    public final Function1<PaymentMethodComponent, Unit> getOnReady() {
        return this.onReady;
    }

    @Nullable
    public final Function1<PaymentMethodComponent, Unit> getOnSubmit() {
        return this.onSubmit;
    }

    @Nullable
    public final l getOnSuccess() {
        return this.onSuccess;
    }

    @Nullable
    public final l getOnTokenized() {
        return this.onTokenized;
    }

    public final int hashCode() {
        Function1 function1 = this.onReady;
        int hashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1 function12 = this.onChange;
        int hashCode2 = (hashCode + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1 function13 = this.onSubmit;
        int hashCode3 = (hashCode2 + (function13 == null ? 0 : function13.hashCode())) * 31;
        l lVar = this.onSuccess;
        int hashCode4 = (hashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        l lVar2 = this.onError;
        int hashCode5 = (hashCode4 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        l lVar3 = this.onTokenized;
        int hashCode6 = (hashCode5 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
        Function1 function14 = this.onCardBinChanged;
        int hashCode7 = (hashCode6 + (function14 == null ? 0 : function14.hashCode())) * 31;
        l lVar4 = this.handleSubmit;
        int hashCode8 = (hashCode7 + (lVar4 == null ? 0 : lVar4.hashCode())) * 31;
        l lVar5 = this.handleTap;
        return hashCode8 + (lVar5 != null ? lVar5.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ComponentCallback(onReady=" + this.onReady + ", onChange=" + this.onChange + ", onSubmit=" + this.onSubmit + ", onSuccess=" + this.onSuccess + ", onError=" + this.onError + ", onTokenized=" + this.onTokenized + ", onCardBinChanged=" + this.onCardBinChanged + ", handleSubmit=" + this.handleSubmit + ", handleTap=" + this.handleTap + ")";
    }

    public ComponentCallback(@Nullable Function1<? super PaymentMethodComponent, Unit> function1, @Nullable Function1<? super PaymentMethodComponent, Unit> function12, @Nullable Function1<? super PaymentMethodComponent, Unit> function13, @Nullable l lVar, @Nullable l lVar2, @Nullable l lVar3, @Nullable Function1<? super CardMetadata, ? extends CallbackResult> function14, @Nullable l lVar4, @Nullable l lVar5) {
        this.onReady = function1;
        this.onChange = function12;
        this.onSubmit = function13;
        this.onSuccess = lVar;
        this.onError = lVar2;
        this.onTokenized = lVar3;
        this.onCardBinChanged = function14;
        this.handleSubmit = lVar4;
        this.handleTap = lVar5;
    }

    public /* synthetic */ ComponentCallback(Function1 function1, Function1 function12, Function1 function13, l lVar, l lVar2, l lVar3, Function1 function14, l lVar4, l lVar5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : function1, (i4 & 2) != 0 ? null : function12, (i4 & 4) != 0 ? null : function13, (i4 & 8) != 0 ? null : lVar, (i4 & 16) != 0 ? null : lVar2, (i4 & 32) != 0 ? null : lVar3, (i4 & 64) != 0 ? null : function14, (i4 & 128) != 0 ? null : lVar4, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : lVar5);
    }
}
