package com.checkout.components.rememberme.country;

import T1.c;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.utils.Constants;
import com.checkout.components.ui.country.CountryPickerViewModel;
import ge.InterfaceC1772d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/checkout/components/rememberme/country/CountryViewModelFactory;", "Landroidx/lifecycle/a0;", "Lcom/checkout/components/rememberme/di/DiComponent;", "di", "<init>", "(Lcom/checkout/components/rememberme/di/DiComponent;)V", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CountryViewModelFactory implements a0 {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final DiComponent f5871a;

    public CountryViewModelFactory(@NotNull DiComponent di) {
        Intrinsics.echo(di, "di");
        this.f5871a = di;
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
        if (modelClass.isAssignableFrom(CountryPickerViewModel.class)) {
            return new CountryPickerViewModel(this.f5871a.inputFieldStateMapper(), this.f5871a.inputFieldStyleMapper(), this.f5871a.textLabelViewStyleMapper(), this.f5871a.textLabelStateMapper(), this.f5871a.countryPickerStyleUtils().style(), this.f5871a.isRTL(), Constants.INSTANCE.getSUPPORTED_COUNTRIES());
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
