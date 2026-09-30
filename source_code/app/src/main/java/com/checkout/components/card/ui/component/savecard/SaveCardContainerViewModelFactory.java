package com.checkout.components.card.ui.component.savecard;

import Kd.a;
import T1.c;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import com.checkout.components.card.di.base.InjectionClient;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.di.component.SaveCardContainerViewModelSubComponent;
import com.checkout.components.card.di.component.t;
import ge.InterfaceC1772d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/card/ui/component/savecard/SaveCardContainerViewModelFactory;", "Landroidx/lifecycle/a0;", "Lcom/checkout/components/card/di/base/InjectionClient;", "Lcom/checkout/components/card/di/base/Injector;", "injector", "<init>", "(Lcom/checkout/components/card/di/base/Injector;)V", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "LKd/a;", "Lcom/checkout/components/card/di/component/SaveCardContainerViewModelSubComponent$Builder;", "subComponentProvider", "LKd/a;", "getSubComponentProvider", "()LKd/a;", "setSubComponentProvider", "(LKd/a;)V", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveCardContainerViewModelFactory implements a0, InjectionClient {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Injector f4554a;
    public a subComponentProvider;

    public SaveCardContainerViewModelFactory(@NotNull Injector injector) {
        Intrinsics.echo(injector, "injector");
        this.f4554a = injector;
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
        this.f4554a.inject(this);
        SaveCardContainerViewModel saveCardContainerViewModel = ((t) ((SaveCardContainerViewModelSubComponent.Builder) getSubComponentProvider().get()).build()).getSaveCardContainerViewModel();
        Intrinsics.charlie(saveCardContainerViewModel, "null cannot be cast to non-null type T of com.checkout.components.card.ui.component.savecard.SaveCardContainerViewModelFactory.create");
        return saveCardContainerViewModel;
    }
}
