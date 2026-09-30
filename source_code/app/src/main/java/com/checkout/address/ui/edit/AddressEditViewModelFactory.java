package com.checkout.address.ui.edit;

import T1.c;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import com.checkout.address.di.AddressDIComponent;
import com.checkout.address.model.AddressEditScreenStyle;
import com.checkout.address.model.AddressEditState;
import com.checkout.address.model.ButtonViewItem;
import com.checkout.address.model.validation.contract.AddressValidator;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.ui.model.TextLabelViewItem;
import ge.InterfaceC1772d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/checkout/address/ui/edit/AddressEditViewModelFactory;", "Landroidx/lifecycle/a0;", "Lcom/checkout/address/model/AddressEditState;", "initialState", "Lcom/checkout/address/di/AddressDIComponent;", "diComponent", "Lcom/checkout/address/model/AddressEditScreenStyle;", "addressEditScreenStyle", "Lcom/checkout/address/model/validation/contract/AddressValidator;", "addressValidator", "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/model/contact/ContactData;", "", "onComplete", "<init>", "(Lcom/checkout/address/model/AddressEditState;Lcom/checkout/address/di/AddressDIComponent;Lcom/checkout/address/model/AddressEditScreenStyle;Lcom/checkout/address/model/validation/contract/AddressValidator;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressEditViewModelFactory implements a0 {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final AddressEditState f3812a;

    /* renamed from: b, reason: collision with root package name */
    private final AddressDIComponent f3813b;

    /* renamed from: c, reason: collision with root package name */
    private final AddressEditScreenStyle f3814c;

    /* renamed from: d, reason: collision with root package name */
    private final AddressValidator f3815d;
    private final Function1 e;

    public AddressEditViewModelFactory(@NotNull AddressEditState initialState, @NotNull AddressDIComponent diComponent, @NotNull AddressEditScreenStyle addressEditScreenStyle, @NotNull AddressValidator addressValidator, @Nullable Function1<? super ContactData, Unit> function1) {
        Intrinsics.echo(initialState, "initialState");
        Intrinsics.echo(diComponent, "diComponent");
        Intrinsics.echo(addressEditScreenStyle, "addressEditScreenStyle");
        Intrinsics.echo(addressValidator, "addressValidator");
        this.f3812a = initialState;
        this.f3813b = diComponent;
        this.f3814c = addressEditScreenStyle;
        this.f3815d = addressValidator;
        this.e = function1;
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
        if (modelClass.isAssignableFrom(AddressEditViewModel.class)) {
            AddressEditState addressEditState = this.f3812a;
            TextLabelViewItem textLabelViewItem = new TextLabelViewItem(this.f3813b.textLabelViewStyleMapper().map(this.f3814c.getTopAppBarViewStyle().getTitleStyle()), this.f3813b.textLabelStateMapper().map(this.f3814c.getTopAppBarViewStyle().getTitleStyle()));
            return new AddressEditViewModel(addressEditState, this.f3813b.addressFieldMapper(), new ButtonViewItem(this.f3813b.buttonStyleMapper().map(this.f3814c.getButtonStyle()), this.f3813b.buttonStateMapper().map(this.f3814c.getButtonStyle())), textLabelViewItem, this.f3815d, this.e, this.f3813b.isRTL(), this.f3814c);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }

    public /* synthetic */ AddressEditViewModelFactory(AddressEditState addressEditState, AddressDIComponent addressDIComponent, AddressEditScreenStyle addressEditScreenStyle, AddressValidator addressValidator, Function1 function1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(addressEditState, addressDIComponent, addressEditScreenStyle, addressValidator, (i4 & 16) != 0 ? null : function1);
    }
}
