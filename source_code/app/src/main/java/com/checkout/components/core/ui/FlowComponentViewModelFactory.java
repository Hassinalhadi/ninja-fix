package com.checkout.components.core.ui;

import T1.c;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.ComponentName;
import ge.InterfaceC1772d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/core/ui/FlowComponentViewModelFactory;", "Landroidx/lifecycle/a0;", "Lcom/checkout/components/interfaces/model/ComponentName;", "defaultPaymentMethod", "Lkotlin/Function0;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "currentCardMetadata", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/model/CallbackResult;", "onCardBinChanged", "<init>", "(Lcom/checkout/components/interfaces/model/ComponentName;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowComponentViewModelFactory implements a0 {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final ComponentName f5032a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f5033b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f5034c;

    public FlowComponentViewModelFactory(@NotNull ComponentName defaultPaymentMethod, @Nullable Function0<CardMetadata> function0, @Nullable Function1<? super CardMetadata, ? extends CallbackResult> function1) {
        Intrinsics.echo(defaultPaymentMethod, "defaultPaymentMethod");
        this.f5032a = defaultPaymentMethod;
        this.f5033b = function0;
        this.f5034c = function1;
    }

    @Override // androidx.lifecycle.a0
    @NotNull
    public /* bridge */ /* synthetic */ Y create(@NotNull InterfaceC1772d interfaceC1772d, @NotNull c cVar) {
        return P0.bravo(this, interfaceC1772d, cVar);
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
        if (modelClass.isAssignableFrom(FlowComponentViewModel.class)) {
            return new FlowComponentViewModel(this.f5032a, this.f5033b, this.f5034c);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
