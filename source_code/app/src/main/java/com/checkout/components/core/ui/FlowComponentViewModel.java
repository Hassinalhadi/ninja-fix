package com.checkout.components.core.ui;

import androidx.lifecycle.Y;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.AbstractC3428A;
import yf.L;
import yf.N;
import yf.at;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/core/ui/FlowComponentViewModel;", "Landroidx/lifecycle/Y;", "Lcom/checkout/components/interfaces/model/ComponentName;", "defaultPaymentMethod", "Lkotlin/Function0;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "currentCardMetadata", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/model/CallbackResult;", "onCardBinChanged", "<init>", "(Lcom/checkout/components/interfaces/model/ComponentName;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "methodName", "", "selectMethod", "(Lcom/checkout/components/interfaces/model/ComponentName;)V", "checkOnCardBinChanged", "Lyf/L;", Constants.INAPP_DATA_TAG, "Lyf/L;", "getSelectedMethod", "()Lyf/L;", "selectedMethod", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowComponentViewModel extends Y {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f5028a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f5029b;

    /* renamed from: c, reason: collision with root package name */
    private final at f5030c;

    /* renamed from: d, reason: collision with root package name */
    private final at f5031d;

    public /* synthetic */ FlowComponentViewModel(ComponentName componentName, Function0 function0, Function1 function1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(componentName, (i4 & 2) != 0 ? null : function0, (i4 & 4) != 0 ? null : function1);
    }

    public final void checkOnCardBinChanged(@NotNull ComponentName methodName) {
        Function0 function0;
        CardMetadata cardMetadata;
        Function1 function1;
        Intrinsics.echo(methodName, "methodName");
        PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
        if (Intrinsics.areEqual(methodName, companion.getCard()) && !Intrinsics.areEqual(((N) this.f5031d).getValue(), companion.getCard()) && (function0 = this.f5028a) != null && (cardMetadata = (CardMetadata) function0.invoke()) != null && (function1 = this.f5029b) != null) {
        }
    }

    @NotNull
    public final L getSelectedMethod() {
        return this.f5031d;
    }

    public final void selectMethod(@NotNull ComponentName methodName) {
        Intrinsics.echo(methodName, "methodName");
        N n5 = (N) this.f5030c;
        n5.getClass();
        n5.juliet(null, methodName);
    }

    public FlowComponentViewModel(@NotNull ComponentName defaultPaymentMethod, @Nullable Function0<CardMetadata> function0, @Nullable Function1<? super CardMetadata, ? extends CallbackResult> function1) {
        Intrinsics.echo(defaultPaymentMethod, "defaultPaymentMethod");
        this.f5028a = function0;
        this.f5029b = function1;
        N charlie = AbstractC3428A.charlie(defaultPaymentMethod);
        this.f5030c = charlie;
        this.f5031d = charlie;
    }
}
