package com.checkout.components.address;

import androidx.compose.runtime.ax;
import com.checkout.address.utils.ContactDataUtilsKt;
import com.checkout.address.utils.StyleUtils;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.AddressComponentConfig;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.ui.model.InputFieldViewItem;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: com.checkout.components.address.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0860a extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ax f3876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressComponentConfig f3877b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StyleUtils f3878c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q0.n f3879d;
    public final /* synthetic */ Mapper e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Mapper f3880f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ax f3881g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0860a(ax axVar, AddressComponentConfig addressComponentConfig, StyleUtils styleUtils, Q0.n nVar, Mapper mapper, Mapper mapper2, ax axVar2, Nd.c cVar) {
        super(2, cVar);
        this.f3876a = axVar;
        this.f3877b = addressComponentConfig;
        this.f3878c = styleUtils;
        this.f3879d = nVar;
        this.e = mapper;
        this.f3880f = mapper2;
        this.f3881g = axVar2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0860a(this.f3876a, this.f3877b, this.f3878c, this.f3879d, this.e, this.f3880f, this.f3881g, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0860a) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z2;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        ContactData contactData = (ContactData) this.f3876a.getValue();
        if (contactData == null || (str = ContactDataUtilsKt.summary(contactData)) == null) {
            str = "";
        }
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        InputFieldStyle addressButtonStyle = this.f3878c.addressButtonStyle(this.f3877b.isStandalone(), z2, this.f3879d);
        InputFieldViewItem inputFieldViewItem = new InputFieldViewItem((InputFieldState) this.f3880f.map(addressButtonStyle), (InputFieldViewStyle) this.e.map(addressButtonStyle));
        inputFieldViewItem.getState().getText().setValue(str);
        this.f3881g.setValue(inputFieldViewItem);
        return Unit.INSTANCE;
    }
}
