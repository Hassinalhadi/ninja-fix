package com.checkout.components.rememberme.model;

import Nd.c;
import Xd.l;
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

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012&\b\u0002\u0010\n\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006\u0012 \b\u0002\u0010\r\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J.\u0010\u0015\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0017\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0092\u0001\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022&\b\u0002\u0010\n\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062 \b\u0002\u0010\r\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0013R5\u0010\n\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0016R/\u0010\r\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0018R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\u0018¨\u00062"}, d2 = {"Lcom/checkout/components/rememberme/model/RememberMeCallback;", "", "Lkotlin/Function0;", "", "onChange", "onSubmit", "Lkotlin/Function2;", "Lcom/checkout/components/interfaces/model/TokenizationResult;", "LNd/c;", "Lcom/checkout/components/interfaces/model/CallbackResult;", "onTokenized", "Lkotlin/Function1;", "", "handlePayButtonTap", "Lcom/checkout/components/interfaces/model/CardMetadata;", "onCardBinChanged", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LXd/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "component2", "component3", "()LXd/l;", "component4", "()Lkotlin/jvm/functions/Function1;", "component5", Constants.COPY_TYPE, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LXd/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/checkout/components/rememberme/model/RememberMeCallback;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function0;", "getOnChange", "b", "getOnSubmit", "c", "LXd/l;", "getOnTokenized", Constants.INAPP_DATA_TAG, "Lkotlin/jvm/functions/Function1;", "getHandlePayButtonTap", "e", "getOnCardBinChanged", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RememberMeCallback {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0 onChange;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0 onSubmit;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l onTokenized;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1 handlePayButtonTap;

    /* renamed from: e, reason: from kotlin metadata */
    private final Function1 onCardBinChanged;

    public RememberMeCallback(@NotNull Function0<Unit> onChange, @NotNull Function0<Unit> onSubmit, @Nullable l lVar, @Nullable Function1<? super c<? super Boolean>, ? extends Object> function1, @Nullable Function1<? super CardMetadata, ? extends CallbackResult> function12) {
        Intrinsics.echo(onChange, "onChange");
        Intrinsics.echo(onSubmit, "onSubmit");
        this.onChange = onChange;
        this.onSubmit = onSubmit;
        this.onTokenized = lVar;
        this.handlePayButtonTap = function1;
        this.onCardBinChanged = function12;
    }

    public static /* synthetic */ RememberMeCallback copy$default(RememberMeCallback rememberMeCallback, Function0 function0, Function0 function02, l lVar, Function1 function1, Function1 function12, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            function0 = rememberMeCallback.onChange;
        }
        if ((i4 & 2) != 0) {
            function02 = rememberMeCallback.onSubmit;
        }
        if ((i4 & 4) != 0) {
            lVar = rememberMeCallback.onTokenized;
        }
        if ((i4 & 8) != 0) {
            function1 = rememberMeCallback.handlePayButtonTap;
        }
        if ((i4 & 16) != 0) {
            function12 = rememberMeCallback.onCardBinChanged;
        }
        Function1 function13 = function12;
        l lVar2 = lVar;
        return rememberMeCallback.copy(function0, function02, lVar2, function1, function13);
    }

    @NotNull
    public final Function0<Unit> component1() {
        return this.onChange;
    }

    @NotNull
    public final Function0<Unit> component2() {
        return this.onSubmit;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final l getOnTokenized() {
        return this.onTokenized;
    }

    @Nullable
    public final Function1<c<? super Boolean>, Object> component4() {
        return this.handlePayButtonTap;
    }

    @Nullable
    public final Function1<CardMetadata, CallbackResult> component5() {
        return this.onCardBinChanged;
    }

    @NotNull
    public final RememberMeCallback copy(@NotNull Function0<Unit> onChange, @NotNull Function0<Unit> onSubmit, @Nullable l onTokenized, @Nullable Function1<? super c<? super Boolean>, ? extends Object> handlePayButtonTap, @Nullable Function1<? super CardMetadata, ? extends CallbackResult> onCardBinChanged) {
        Intrinsics.echo(onChange, "onChange");
        Intrinsics.echo(onSubmit, "onSubmit");
        return new RememberMeCallback(onChange, onSubmit, onTokenized, handlePayButtonTap, onCardBinChanged);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RememberMeCallback)) {
            return false;
        }
        RememberMeCallback rememberMeCallback = (RememberMeCallback) other;
        return Intrinsics.areEqual(this.onChange, rememberMeCallback.onChange) && Intrinsics.areEqual(this.onSubmit, rememberMeCallback.onSubmit) && Intrinsics.areEqual(this.onTokenized, rememberMeCallback.onTokenized) && Intrinsics.areEqual(this.handlePayButtonTap, rememberMeCallback.handlePayButtonTap) && Intrinsics.areEqual(this.onCardBinChanged, rememberMeCallback.onCardBinChanged);
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

    @NotNull
    public final Function0<Unit> getOnSubmit() {
        return this.onSubmit;
    }

    @Nullable
    public final l getOnTokenized() {
        return this.onTokenized;
    }

    public final int hashCode() {
        int hashCode = (this.onSubmit.hashCode() + (this.onChange.hashCode() * 31)) * 31;
        l lVar = this.onTokenized;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Function1 function1 = this.handlePayButtonTap;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.onCardBinChanged;
        return hashCode3 + (function12 != null ? function12.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "RememberMeCallback(onChange=" + this.onChange + ", onSubmit=" + this.onSubmit + ", onTokenized=" + this.onTokenized + ", handlePayButtonTap=" + this.handlePayButtonTap + ", onCardBinChanged=" + this.onCardBinChanged + ")";
    }

    public /* synthetic */ RememberMeCallback(Function0 function0, Function0 function02, l lVar, Function1 function1, Function1 function12, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, (i4 & 4) != 0 ? null : lVar, (i4 & 8) != 0 ? null : function1, (i4 & 16) != 0 ? null : function12);
    }
}
