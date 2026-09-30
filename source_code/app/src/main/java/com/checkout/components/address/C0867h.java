package com.checkout.components.address;

import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import com.checkout.address.model.AddressEditScreenStyle;
import com.checkout.address.model.AddressFieldItem;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.model.InputComponentViewItem;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.view.field.CountryFieldViewKt;
import com.checkout.components.ui.view.field.PhoneFieldViewKt;
import i.InterfaceC1854c;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: com.checkout.components.address.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0867h implements Xd.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f3886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Xd.l f3887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f3888c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3889d;
    public final /* synthetic */ Function0 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AddressEditScreenStyle f3890f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f3891g;

    public C0867h(List list, Xd.l lVar, Function1 function1, boolean z2, Function0 function0, AddressEditScreenStyle addressEditScreenStyle, boolean z10) {
        this.f3886a = list;
        this.f3887b = lVar;
        this.f3888c = function1;
        this.f3889d = z2;
        this.e = function0;
        this.f3890f = addressEditScreenStyle;
        this.f3891g = z10;
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i4;
        boolean z2;
        int i5;
        int i10;
        InterfaceC1854c interfaceC1854c = (InterfaceC1854c) obj;
        int intValue = ((Number) obj2).intValue();
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((C0585q) interfaceC0581m).golf(interfaceC1854c)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i4 = i10 | intValue2;
        } else {
            i4 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((C0585q) interfaceC0581m).echo(intValue)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i4 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            int i11 = i4 & 126;
            AddressFieldItem addressFieldItem = (AddressFieldItem) this.f3886a.get(intValue);
            c0585q.purple(-1017926153);
            boolean z10 = addressFieldItem instanceof AddressFieldItem.Phone;
            as asVar = C0580l.alpha;
            if (z10) {
                c0585q.purple(-1017956627);
                AddressFieldItem.Phone phone = (AddressFieldItem.Phone) addressFieldItem;
                InputComponentViewItem inputComponentViewItem = new InputComponentViewItem(phone.getState(), phone.getStyle());
                InputComponentViewItem inputComponentViewItem2 = new InputComponentViewItem(phone.getCountryState(), phone.getCountryStyle());
                String identifier = phone.getField().getIdentifier();
                Xd.l lVar = this.f3887b;
                boolean golf = c0585q.golf(this.f3888c);
                Object jade = c0585q.jade();
                if (golf || jade == asVar) {
                    jade = new C0863d(this.f3888c);
                    c0585q.f(jade);
                }
                int i12 = InputComponentViewItem.$stable;
                PhoneFieldViewKt.PhoneFieldView(intValue, inputComponentViewItem, inputComponentViewItem2, identifier, lVar, (Function0) jade, c0585q, ((i11 >> 3) & 14) | (i12 << 3) | (i12 << 6), 0);
                c0585q = c0585q;
                c0585q.quebec(false);
            } else if (addressFieldItem.getField() instanceof AddressField.Country) {
                c0585q.purple(-448453403);
                InputComponentState state = addressFieldItem.getState();
                InputComponentViewStyle style = addressFieldItem.getStyle();
                boolean golf2 = c0585q.golf(this.f3888c);
                Object jade2 = c0585q.jade();
                if (golf2 || jade2 == asVar) {
                    jade2 = new C0864e(this.f3888c);
                    c0585q.f(jade2);
                }
                CountryFieldViewKt.CountryFieldView(state, style, (Function0) jade2, addressFieldItem.getField().getIdentifier(), CountryPickerType.Address, c0585q, InputComponentState.$stable | 24576 | (InputComponentViewStyle.$stable << 3));
                c0585q.quebec(false);
            } else if (addressFieldItem.getField() instanceof AddressField.State) {
                c0585q.purple(-448436928);
                if (this.f3889d) {
                    c0585q.purple(-1016657231);
                    InputComponentState state2 = addressFieldItem.getState();
                    InputComponentViewStyle style2 = addressFieldItem.getStyle();
                    boolean golf3 = c0585q.golf(this.e);
                    Object jade3 = c0585q.jade();
                    if (golf3 || jade3 == asVar) {
                        jade3 = new C0865f(this.e);
                        c0585q.f(jade3);
                    }
                    W.a(state2, style2, (Function0) jade3, this.f3890f.getStatePickerFieldDefaultText(), c0585q, InputComponentState.$stable | (InputComponentViewStyle.$stable << 3));
                    c0585q.quebec(false);
                } else {
                    c0585q.purple(-1016235414);
                    AbstractC0881v.a(intValue, InputComponentState.copy$default(addressFieldItem.getState(), InputFieldState.copy$default(addressFieldItem.getState().getInputFieldState(), null, null, null, null, null, 23, null), null, 2, null), InputComponentViewStyle.copy$default(addressFieldItem.getStyle(), InputFieldViewStyle.copy$default(addressFieldItem.getStyle().getInputFieldStyle(), androidx.compose.ui.platform.a.alpha(addressFieldItem.getStyle().getInputFieldStyle().getModifier(), addressFieldItem.getField().getIdentifier()), false, false, null, null, null, null, null, null, false, 0, 0, null, null, null, 32734, null), null, null, 6, null), this.f3887b, c0585q, ((i11 >> 3) & 14) | (InputComponentState.$stable << 3) | (InputComponentViewStyle.$stable << 6));
                    c0585q.quebec(false);
                }
                c0585q.quebec(false);
            } else if ((addressFieldItem.getField() instanceof AddressField.Zip) && this.f3891g) {
                c0585q.purple(-448382317);
                M.a(intValue, addressFieldItem.getState(), addressFieldItem.getStyle(), this.f3887b, c0585q, ((i11 >> 3) & 14) | (InputComponentState.$stable << 3) | (InputComponentViewStyle.$stable << 6));
                c0585q.quebec(false);
            } else {
                c0585q.purple(-448372446);
                AbstractC0881v.a(intValue, addressFieldItem.getState(), InputComponentViewStyle.copy$default(addressFieldItem.getStyle(), InputFieldViewStyle.copy$default(addressFieldItem.getStyle().getInputFieldStyle(), androidx.compose.ui.platform.a.alpha(addressFieldItem.getStyle().getInputFieldStyle().getModifier(), addressFieldItem.getField().getIdentifier()), false, false, null, null, null, null, null, null, false, 0, 0, null, null, null, 32766, null), null, null, 6, null), this.f3887b, c0585q, ((i11 >> 3) & 14) | (InputComponentState.$stable << 3) | (InputComponentViewStyle.$stable << 6));
                c0585q.quebec(false);
            }
            c0585q.quebec(false);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
