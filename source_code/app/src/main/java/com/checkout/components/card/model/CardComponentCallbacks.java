package com.checkout.components.card.model;

import Nd.c;
import Xd.l;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012(\u0010\f\u001a$\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0006j\u0002`\u000b\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012&\b\u0002\u0010\u0012\u001a \b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r\u0012 \b\u0002\u0010\u0015\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J2\u0010\u001b\u001a$\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0006j\u0002`\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010\u001f\u001a \b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010\u001eJ(\u0010!\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\u001eJÖ\u0001\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022*\b\u0002\u0010\f\u001a$\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0006j\u0002`\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2&\b\u0002\u0010\u0012\u001a \b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r2 \b\u0002\u0010\u0015\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\u0019R9\u0010\f\u001a$\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0006j\u0002`\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u001cR%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001eR5\u0010\u0012\u001a \b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010\u001cR%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u0010\u001eR/\u0010\u0015\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u0010\u001e¨\u0006>"}, d2 = {"Lcom/checkout/components/card/model/CardComponentCallbacks;", "", "Lkotlin/Function0;", "", "onChange", "onSubmit", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/model/ComponentResult;", "Lcom/checkout/components/interfaces/model/CardTokenDetails;", "Lcom/checkout/components/interfaces/error/CheckoutError;", "", "Lcom/checkout/components/card/model/OnTokenResult;", "onTokenResult", "Lkotlin/Function1;", "onError", "Lcom/checkout/components/interfaces/model/TokenizationResult;", "LNd/c;", "Lcom/checkout/components/interfaces/model/CallbackResult;", "onTokenized", "Lcom/checkout/components/interfaces/model/CardMetadata;", "onCardBinChanged", "handlePayButtonTap", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LXd/l;Lkotlin/jvm/functions/Function1;LXd/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "component2", "component3", "()LXd/l;", "component4", "()Lkotlin/jvm/functions/Function1;", "component5", "component6", "component7", Constants.COPY_TYPE, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LXd/l;Lkotlin/jvm/functions/Function1;LXd/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/checkout/components/card/model/CardComponentCallbacks;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function0;", "getOnChange", "b", "getOnSubmit", "c", "LXd/l;", "getOnTokenResult", Constants.INAPP_DATA_TAG, "Lkotlin/jvm/functions/Function1;", "getOnError", "e", "getOnTokenized", "f", "getOnCardBinChanged", "g", "getHandlePayButtonTap", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardComponentCallbacks {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0 onChange;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0 onSubmit;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l onTokenResult;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1 onError;

    /* renamed from: e, reason: from kotlin metadata */
    private final l onTokenized;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1 onCardBinChanged;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function1 handlePayButtonTap;

    public CardComponentCallbacks(@NotNull Function0<Unit> onChange, @NotNull Function0<Unit> onSubmit, @NotNull l onTokenResult, @Nullable Function1<? super CheckoutError, Unit> function1, @Nullable l lVar, @Nullable Function1<? super CardMetadata, ? extends CallbackResult> function12, @Nullable Function1<? super c<? super Boolean>, ? extends Object> function13) {
        Intrinsics.echo(onChange, "onChange");
        Intrinsics.echo(onSubmit, "onSubmit");
        Intrinsics.echo(onTokenResult, "onTokenResult");
        this.onChange = onChange;
        this.onSubmit = onSubmit;
        this.onTokenResult = onTokenResult;
        this.onError = function1;
        this.onTokenized = lVar;
        this.onCardBinChanged = function12;
        this.handlePayButtonTap = function13;
    }

    public static /* synthetic */ CardComponentCallbacks copy$default(CardComponentCallbacks cardComponentCallbacks, Function0 function0, Function0 function02, l lVar, Function1 function1, l lVar2, Function1 function12, Function1 function13, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            function0 = cardComponentCallbacks.onChange;
        }
        if ((i4 & 2) != 0) {
            function02 = cardComponentCallbacks.onSubmit;
        }
        if ((i4 & 4) != 0) {
            lVar = cardComponentCallbacks.onTokenResult;
        }
        if ((i4 & 8) != 0) {
            function1 = cardComponentCallbacks.onError;
        }
        if ((i4 & 16) != 0) {
            lVar2 = cardComponentCallbacks.onTokenized;
        }
        if ((i4 & 32) != 0) {
            function12 = cardComponentCallbacks.onCardBinChanged;
        }
        if ((i4 & 64) != 0) {
            function13 = cardComponentCallbacks.handlePayButtonTap;
        }
        Function1 function14 = function12;
        Function1 function15 = function13;
        l lVar3 = lVar2;
        l lVar4 = lVar;
        return cardComponentCallbacks.copy(function0, function02, lVar4, function1, lVar3, function14, function15);
    }

    @NotNull
    public final Function0<Unit> component1() {
        return this.onChange;
    }

    @NotNull
    public final Function0<Unit> component2() {
        return this.onSubmit;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final l getOnTokenResult() {
        return this.onTokenResult;
    }

    @Nullable
    public final Function1<CheckoutError, Unit> component4() {
        return this.onError;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final l getOnTokenized() {
        return this.onTokenized;
    }

    @Nullable
    public final Function1<CardMetadata, CallbackResult> component6() {
        return this.onCardBinChanged;
    }

    @Nullable
    public final Function1<c<? super Boolean>, Object> component7() {
        return this.handlePayButtonTap;
    }

    @NotNull
    public final CardComponentCallbacks copy(@NotNull Function0<Unit> onChange, @NotNull Function0<Unit> onSubmit, @NotNull l onTokenResult, @Nullable Function1<? super CheckoutError, Unit> onError, @Nullable l onTokenized, @Nullable Function1<? super CardMetadata, ? extends CallbackResult> onCardBinChanged, @Nullable Function1<? super c<? super Boolean>, ? extends Object> handlePayButtonTap) {
        Intrinsics.echo(onChange, "onChange");
        Intrinsics.echo(onSubmit, "onSubmit");
        Intrinsics.echo(onTokenResult, "onTokenResult");
        return new CardComponentCallbacks(onChange, onSubmit, onTokenResult, onError, onTokenized, onCardBinChanged, handlePayButtonTap);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardComponentCallbacks)) {
            return false;
        }
        CardComponentCallbacks cardComponentCallbacks = (CardComponentCallbacks) other;
        return Intrinsics.areEqual(this.onChange, cardComponentCallbacks.onChange) && Intrinsics.areEqual(this.onSubmit, cardComponentCallbacks.onSubmit) && Intrinsics.areEqual(this.onTokenResult, cardComponentCallbacks.onTokenResult) && Intrinsics.areEqual(this.onError, cardComponentCallbacks.onError) && Intrinsics.areEqual(this.onTokenized, cardComponentCallbacks.onTokenized) && Intrinsics.areEqual(this.onCardBinChanged, cardComponentCallbacks.onCardBinChanged) && Intrinsics.areEqual(this.handlePayButtonTap, cardComponentCallbacks.handlePayButtonTap);
    }

    @Nullable
    public final Function1<c<? super Boolean>, Object> getHandlePayButtonTap() {
        return this.handlePayButtonTap;
    }

    @Nullable
    public final Function1<CardMetadata, CallbackResult> getOnCardBinChanged() {
        return this.onCardBinChanged;
    }

    @NotNull
    public final Function0<Unit> getOnChange() {
        return this.onChange;
    }

    @Nullable
    public final Function1<CheckoutError, Unit> getOnError() {
        return this.onError;
    }

    @NotNull
    public final Function0<Unit> getOnSubmit() {
        return this.onSubmit;
    }

    @NotNull
    public final l getOnTokenResult() {
        return this.onTokenResult;
    }

    @Nullable
    public final l getOnTokenized() {
        return this.onTokenized;
    }

    public final int hashCode() {
        int hashCode = (this.onTokenResult.hashCode() + ((this.onSubmit.hashCode() + (this.onChange.hashCode() * 31)) * 31)) * 31;
        Function1 function1 = this.onError;
        int hashCode2 = (hashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        l lVar = this.onTokenized;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Function1 function12 = this.onCardBinChanged;
        int hashCode4 = (hashCode3 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1 function13 = this.handlePayButtonTap;
        return hashCode4 + (function13 != null ? function13.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CardComponentCallbacks(onChange=" + this.onChange + ", onSubmit=" + this.onSubmit + ", onTokenResult=" + this.onTokenResult + ", onError=" + this.onError + ", onTokenized=" + this.onTokenized + ", onCardBinChanged=" + this.onCardBinChanged + ", handlePayButtonTap=" + this.handlePayButtonTap + ")";
    }

    public /* synthetic */ CardComponentCallbacks(Function0 function0, Function0 function02, l lVar, Function1 function1, l lVar2, Function1 function12, Function1 function13, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, lVar, (i4 & 8) != 0 ? null : function1, (i4 & 16) != 0 ? null : lVar2, (i4 & 32) != 0 ? null : function12, (i4 & 64) != 0 ? null : function13);
    }
}
