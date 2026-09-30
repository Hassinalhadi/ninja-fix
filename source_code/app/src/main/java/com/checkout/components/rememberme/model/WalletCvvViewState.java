package com.checkout.components.rememberme.model;

import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013JP\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0013R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0013¨\u0006*"}, d2 = {"Lcom/checkout/components/rememberme/model/WalletCvvViewState;", "", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "style", "Lcom/checkout/components/ui/model/state/InputComponentState;", "state", "Lkotlin/Function1;", "", "", "onValueChange", "", "onFocusChanged", "<init>", "(Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;Lcom/checkout/components/ui/model/state/InputComponentState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "component1", "()Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "component2", "()Lcom/checkout/components/ui/model/state/InputComponentState;", "component3", "()Lkotlin/jvm/functions/Function1;", "component4", Constants.COPY_TYPE, "(Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;Lcom/checkout/components/ui/model/state/InputComponentState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/checkout/components/rememberme/model/WalletCvvViewState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "getStyle", "b", "Lcom/checkout/components/ui/model/state/InputComponentState;", "getState", "c", "Lkotlin/jvm/functions/Function1;", "getOnValueChange", Constants.INAPP_DATA_TAG, "getOnFocusChanged", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WalletCvvViewState {
    public static final int $stable = InputComponentState.$stable | InputComponentViewStyle.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InputComponentViewStyle style;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InputComponentState state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1 onValueChange;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1 onFocusChanged;

    public WalletCvvViewState(@NotNull InputComponentViewStyle style, @NotNull InputComponentState state, @NotNull Function1<? super String, Unit> onValueChange, @NotNull Function1<? super Boolean, Unit> onFocusChanged) {
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        Intrinsics.echo(onValueChange, "onValueChange");
        Intrinsics.echo(onFocusChanged, "onFocusChanged");
        this.style = style;
        this.state = state;
        this.onValueChange = onValueChange;
        this.onFocusChanged = onFocusChanged;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletCvvViewState copy$default(WalletCvvViewState walletCvvViewState, InputComponentViewStyle inputComponentViewStyle, InputComponentState inputComponentState, Function1 function1, Function1 function12, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            inputComponentViewStyle = walletCvvViewState.style;
        }
        if ((i4 & 2) != 0) {
            inputComponentState = walletCvvViewState.state;
        }
        if ((i4 & 4) != 0) {
            function1 = walletCvvViewState.onValueChange;
        }
        if ((i4 & 8) != 0) {
            function12 = walletCvvViewState.onFocusChanged;
        }
        return walletCvvViewState.copy(inputComponentViewStyle, inputComponentState, function1, function12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InputComponentViewStyle getStyle() {
        return this.style;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InputComponentState getState() {
        return this.state;
    }

    @NotNull
    public final Function1<String, Unit> component3() {
        return this.onValueChange;
    }

    @NotNull
    public final Function1<Boolean, Unit> component4() {
        return this.onFocusChanged;
    }

    @NotNull
    public final WalletCvvViewState copy(@NotNull InputComponentViewStyle style, @NotNull InputComponentState state, @NotNull Function1<? super String, Unit> onValueChange, @NotNull Function1<? super Boolean, Unit> onFocusChanged) {
        Intrinsics.echo(style, "style");
        Intrinsics.echo(state, "state");
        Intrinsics.echo(onValueChange, "onValueChange");
        Intrinsics.echo(onFocusChanged, "onFocusChanged");
        return new WalletCvvViewState(style, state, onValueChange, onFocusChanged);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletCvvViewState)) {
            return false;
        }
        WalletCvvViewState walletCvvViewState = (WalletCvvViewState) other;
        return Intrinsics.areEqual(this.style, walletCvvViewState.style) && Intrinsics.areEqual(this.state, walletCvvViewState.state) && Intrinsics.areEqual(this.onValueChange, walletCvvViewState.onValueChange) && Intrinsics.areEqual(this.onFocusChanged, walletCvvViewState.onFocusChanged);
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @NotNull
    public final Function1<String, Unit> getOnValueChange() {
        return this.onValueChange;
    }

    @NotNull
    public final InputComponentState getState() {
        return this.state;
    }

    @NotNull
    public final InputComponentViewStyle getStyle() {
        return this.style;
    }

    public final int hashCode() {
        return this.onFocusChanged.hashCode() + ((this.onValueChange.hashCode() + ((this.state.hashCode() + (this.style.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "WalletCvvViewState(style=" + this.style + ", state=" + this.state + ", onValueChange=" + this.onValueChange + ", onFocusChanged=" + this.onFocusChanged + ")";
    }
}
