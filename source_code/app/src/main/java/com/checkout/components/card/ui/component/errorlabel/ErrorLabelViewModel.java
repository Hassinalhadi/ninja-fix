package com.checkout.components.card.ui.component.errorlabel;

import Kd.a;
import T1.c;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.T;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import com.checkout.components.card.H;
import com.checkout.components.card.di.ErrorLabelStyle;
import com.checkout.components.card.di.base.InjectionClient;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.di.component.ErrorLabelViewModelSubComponent;
import com.checkout.components.card.di.component.l;
import com.checkout.components.card.ui.manager.PaymentStateManager;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.clevertap.android.sdk.Constants;
import ge.InterfaceC1772d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ad;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001bBW\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/checkout/components/card/ui/component/errorlabel/ErrorLabelViewModel;", "Landroidx/lifecycle/Y;", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "style", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "labelStyleMapper", "Lcom/checkout/components/ui/model/state/TextLabelState;", "labelStateMapper", "Lcom/checkout/components/card/ui/manager/PaymentStateManager;", "paymentStateManager", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "Lcom/checkout/components/rememberme/CheckoutRememberMe;", "rememberMe", "<init>", "(Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/card/ui/manager/PaymentStateManager;Lcom/checkout/components/interfaces/ui/ResourceProvider;Lcom/checkout/components/rememberme/CheckoutRememberMe;)V", "c", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "getLabelStyle", "()Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "labelStyle", Constants.INAPP_DATA_TAG, "Lcom/checkout/components/ui/model/state/TextLabelState;", "getLabelState", "()Lcom/checkout/components/ui/model/state/TextLabelState;", "labelState", "ErrorLabelViewModelFactory", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorLabelViewModel extends Y {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final PaymentStateManager f4494a;

    /* renamed from: b, reason: collision with root package name */
    private final CheckoutRememberMe f4495b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewStyle labelStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final TextLabelState labelState;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/card/ui/component/errorlabel/ErrorLabelViewModel$ErrorLabelViewModelFactory;", "Landroidx/lifecycle/a0;", "Lcom/checkout/components/card/di/base/InjectionClient;", "Lcom/checkout/components/card/di/base/Injector;", "injector", "<init>", "(Lcom/checkout/components/card/di/base/Injector;)V", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "LKd/a;", "Lcom/checkout/components/card/di/component/ErrorLabelViewModelSubComponent$Builder;", "subComponentProvider", "LKd/a;", "getSubComponentProvider", "()LKd/a;", "setSubComponentProvider", "(LKd/a;)V", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ErrorLabelViewModelFactory implements a0, InjectionClient {
        public static final int $stable = 8;

        /* renamed from: a, reason: collision with root package name */
        private final Injector f4498a;
        public a subComponentProvider;

        public ErrorLabelViewModelFactory(@NotNull Injector injector) {
            Intrinsics.echo(injector, "injector");
            this.f4498a = injector;
        }

        @Override // androidx.lifecycle.a0
        @NotNull
        public /* bridge */ /* synthetic */ Y create(@NotNull InterfaceC1772d interfaceC1772d, @NotNull c cVar) {
            return P0.bravo(this, interfaceC1772d, cVar);
        }

        @NotNull
        public final a getSubComponentProvider() {
            a aVar = this.subComponentProvider;
            if (aVar != null) {
                return aVar;
            }
            Intrinsics.lima("subComponentProvider");
            throw null;
        }

        public final void setSubComponentProvider(@NotNull a aVar) {
            Intrinsics.echo(aVar, "<set-?>");
            this.subComponentProvider = aVar;
        }

        @Override // androidx.lifecycle.a0
        @NotNull
        public /* bridge */ /* synthetic */ Y create(@NotNull Class cls, @NotNull c cVar) {
            return P0.charlie(this, cls, cVar);
        }

        @Override // androidx.lifecycle.a0
        @NotNull
        public final <T extends Y> T create(@NotNull Class<T> modelClass) {
            Intrinsics.echo(modelClass, "modelClass");
            this.f4498a.inject(this);
            ErrorLabelViewModel errorLabelViewModel = ((l) ((ErrorLabelViewModelSubComponent.Builder) getSubComponentProvider().get()).build()).getErrorLabelViewModel();
            Intrinsics.charlie(errorLabelViewModel, "null cannot be cast to non-null type T of com.checkout.components.card.ui.component.errorlabel.ErrorLabelViewModel.ErrorLabelViewModelFactory.create");
            return errorLabelViewModel;
        }
    }

    public ErrorLabelViewModel(@ErrorLabelStyle @NotNull TextLabelStyle style, @NotNull Mapper<TextLabelStyle, TextLabelViewStyle> labelStyleMapper, @NotNull Mapper<TextLabelStyle, TextLabelState> labelStateMapper, @NotNull PaymentStateManager paymentStateManager, @NotNull ResourceProvider resourceProvider, @Nullable CheckoutRememberMe checkoutRememberMe) {
        Intrinsics.echo(style, "style");
        Intrinsics.echo(labelStyleMapper, "labelStyleMapper");
        Intrinsics.echo(labelStateMapper, "labelStateMapper");
        Intrinsics.echo(paymentStateManager, "paymentStateManager");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        this.f4494a = paymentStateManager;
        this.f4495b = checkoutRememberMe;
        this.labelStyle = labelStyleMapper.map(style);
        this.labelState = labelStateMapper.map(style);
        ad.zulu(T.hotel(this), null, null, new H(this, null), 3);
    }

    @NotNull
    public final TextLabelState getLabelState() {
        return this.labelState;
    }

    @NotNull
    public final TextLabelViewStyle getLabelStyle() {
        return this.labelStyle;
    }
}
