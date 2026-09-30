package com.checkout.address.ui.state;

import T1.c;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import com.checkout.address.di.AddressDIComponent;
import com.checkout.components.interfaces.model.contact.Country;
import ge.InterfaceC1772d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/address/ui/state/StateViewModelFactory;", "Landroidx/lifecycle/a0;", "Lcom/checkout/address/di/AddressDIComponent;", "diComponent", "Lcom/checkout/components/interfaces/model/contact/Country;", "country", "<init>", "(Lcom/checkout/address/di/AddressDIComponent;Lcom/checkout/components/interfaces/model/contact/Country;)V", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StateViewModelFactory implements a0 {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final AddressDIComponent f3832a;

    /* renamed from: b, reason: collision with root package name */
    private final Country f3833b;

    public StateViewModelFactory(@NotNull AddressDIComponent diComponent, @Nullable Country country) {
        Intrinsics.echo(diComponent, "diComponent");
        this.f3832a = diComponent;
        this.f3833b = country;
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
        if (modelClass.isAssignableFrom(StatePickerViewModel.class)) {
            return new StatePickerViewModel(this.f3832a.inputFieldStateMapper(), this.f3832a.inputFieldStyleMapper(), this.f3832a.textLabelViewStyleMapper(), this.f3832a.textLabelStateMapper(), this.f3832a.styleUtils().statePickerStyle(), this.f3833b);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
