package com.checkout.address.ui.navigation;

import Cb.ac;
import Gb.j;
import P.d;
import T1.c;
import U0.t;
import Vc.o;
import Xd.m;
import Y1.ad;
import Y1.ag;
import Y1.at;
import Y1.au;
import Y1.h;
import Y1.k;
import Y1.l;
import Y1.w;
import a2.C0383h;
import a2.C0384i;
import a2.C0389n;
import a2.C0390o;
import android.os.Bundle;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.ax;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.d0;
import bx.InterfaceC0775m;
import com.checkout.address.di.AddressDIComponent;
import com.checkout.address.model.AddressEditState;
import com.checkout.address.model.State;
import com.checkout.address.ui.country.CountryViewModelFactory;
import com.checkout.address.ui.edit.AddressEditViewModel;
import com.checkout.address.ui.edit.AddressEditViewModelFactory;
import com.checkout.address.ui.navigation.Screen;
import com.checkout.address.ui.state.StatePickerViewModel;
import com.checkout.address.ui.state.StateViewModelFactory;
import com.checkout.components.address.AbstractC0870k;
import com.checkout.components.address.AbstractC0882w;
import com.checkout.components.address.U;
import com.checkout.components.interfaces.model.contact.Address;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.ui.country.CountryPickerBottomSheetScreenKt;
import com.checkout.components.ui.country.CountryPickerViewModel;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.utils.extensions.Utils;
import com.google.mlkit.vision.barcode.common.Barcode;
import d.C1534h0;
import d2.AbstractC1579d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import s6.F7;
import t6.AbstractC2996g2;
import t6.W2;
import t6.Y2;

/* loaded from: classes3.dex */
public abstract class a {
    public static final Unit a(AddressEditState addressEditState, AddressDIComponent addressDIComponent, Function1 function1, String str, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(addressEditState, addressDIComponent, function1, str, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(AddressEditState addressState, AddressDIComponent diComponent, Function1 onContactDataReady, String title, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        c cVar;
        c cVar2;
        c cVar3;
        ag agVar;
        Address address;
        Intrinsics.echo(addressState, "addressState");
        Intrinsics.echo(diComponent, "diComponent");
        Intrinsics.echo(onContactDataReady, "onContactDataReady");
        Intrinsics.echo(title, "title");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(833678988);
        if ((i4 & 6) == 0) {
            i5 = (c0585q.india(addressState) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= (i4 & 64) == 0 ? c0585q.golf(diComponent) : c0585q.india(diComponent) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q.india(onContactDataReady) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0585q.golf(title) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 1171) != 1170)) {
            ag bravo = W2.bravo(new at[0], c0585q);
            AddressEditViewModelFactory addressEditViewModelFactory = new AddressEditViewModelFactory(addressState, diComponent, diComponent.styleUtils().addressEditScreenStyle(title), diComponent.addressValidator(), onContactDataReady);
            d0 alpha = U1.a.alpha(c0585q);
            if (alpha != null) {
                if (alpha instanceof InterfaceC0651v) {
                    cVar = ((InterfaceC0651v) alpha).getDefaultViewModelCreationExtras();
                } else {
                    cVar = T1.a.bravo;
                }
                c cVar4 = cVar;
                v vVar = u.alpha;
                AddressEditViewModel addressEditViewModel = (AddressEditViewModel) F7.bravo(vVar.bravo(AddressEditViewModel.class), alpha, null, addressEditViewModelFactory, cVar4, c0585q);
                CountryViewModelFactory countryViewModelFactory = new CountryViewModelFactory(diComponent, diComponent.countryPickerStyleUtils().style());
                d0 alpha2 = U1.a.alpha(c0585q);
                if (alpha2 != null) {
                    if (alpha2 instanceof InterfaceC0651v) {
                        cVar2 = ((InterfaceC0651v) alpha2).getDefaultViewModelCreationExtras();
                    } else {
                        cVar2 = T1.a.bravo;
                    }
                    CountryPickerViewModel countryPickerViewModel = (CountryPickerViewModel) F7.bravo(vVar.bravo(CountryPickerViewModel.class), alpha2, null, countryViewModelFactory, cVar2, c0585q);
                    Utils utils = Utils.INSTANCE;
                    ContactData prefilledData = addressState.getPrefilledData();
                    StateViewModelFactory stateViewModelFactory = new StateViewModelFactory(diComponent, utils.getDeviceCountry((prefilledData == null || (address = prefilledData.getAddress()) == null) ? null : address.getCountry()));
                    d0 alpha3 = U1.a.alpha(c0585q);
                    if (alpha3 != null) {
                        if (alpha3 instanceof InterfaceC0651v) {
                            cVar3 = ((InterfaceC0651v) alpha3).getDefaultViewModelCreationExtras();
                        } else {
                            cVar3 = T1.a.bravo;
                        }
                        StatePickerViewModel statePickerViewModel = (StatePickerViewModel) F7.bravo(vVar.bravo(StatePickerViewModel.class), alpha3, null, stateViewModelFactory, cVar3, c0585q);
                        ax mike = C0564b.mike(addressEditViewModel.getAddressCountry(), c0585q, 0);
                        ax mike2 = C0564b.mike(addressEditViewModel.getPhoneCountry(), c0585q, 0);
                        String route = Screen.AddressEdit.INSTANCE.getRoute();
                        boolean india = c0585q.india(bravo) | c0585q.india(addressEditViewModel) | c0585q.golf(mike2) | c0585q.golf(mike) | c0585q.india(countryPickerViewModel) | c0585q.india(statePickerViewModel);
                        Object jade = c0585q.jade();
                        if (india || jade == C0580l.alpha) {
                            agVar = bravo;
                            Y4.a aVar = new Y4.a(agVar, addressEditViewModel, mike2, mike, countryPickerViewModel, statePickerViewModel, 2);
                            c0585q.f(aVar);
                            jade = aVar;
                        } else {
                            agVar = bravo;
                        }
                        Y2.charlie(agVar, route, null, null, null, null, null, null, (Function1) jade, c0585q, 0);
                        c0585q = c0585q;
                    } else {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                } else {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new j(addressState, diComponent, onContactDataReady, title, i4, 8);
        }
    }

    public static final Unit a(D0 d02, D0 d03, CountryPickerViewModel countryPickerViewModel, ag agVar, StatePickerViewModel statePickerViewModel, AddressEditViewModel addressEditViewModel, l backStackEntry, InterfaceC0581m interfaceC0581m, int i4) {
        Country country;
        Intrinsics.echo(backStackEntry, "backStackEntry");
        Bundle alpha = backStackEntry.f2268a.alpha();
        if (alpha == null) {
            alpha = new Bundle();
        }
        Map india = backStackEntry.purple.india();
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.quebec(india.size()));
        for (Map.Entry entry : india.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((k) entry.getValue()).alpha);
        }
        CountryPickerType type = ((Screen.CountryPicker) AbstractC1579d.bravo(Screen.CountryPicker.Companion.serializer(), alpha, linkedHashMap)).getType();
        int i5 = AbstractC0882w.f3913a[type.ordinal()];
        if (i5 == 1) {
            country = (Country) d02.getValue();
        } else if (i5 == 2) {
            country = (Country) d03.getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Country country2 = country;
        C0585q c0585q = (C0585q) interfaceC0581m;
        boolean india2 = c0585q.india(statePickerViewModel) | c0585q.echo(type.ordinal()) | c0585q.india(addressEditViewModel);
        Object jade = c0585q.jade();
        if (india2 || jade == C0580l.alpha) {
            jade = new ac(statePickerViewModel, type, addressEditViewModel, 17);
            c0585q.f(jade);
        }
        CountryPickerBottomSheetScreenKt.CountryPickerBottomSheetScreen(countryPickerViewModel, agVar, type, country2, (Function1) jade, c0585q, CountryPickerViewModel.$stable);
        return Unit.INSTANCE;
    }

    public static final Unit a(final ag agVar, final AddressEditViewModel addressEditViewModel, final D0 d02, final D0 d03, final CountryPickerViewModel countryPickerViewModel, final StatePickerViewModel statePickerViewModel, ad NavHost) {
        Intrinsics.echo(NavHost, "$this$NavHost");
        String route = Screen.AddressEdit.INSTANCE.getRoute();
        d dVar = new d(new a5.j(agVar, addressEditViewModel), -1858685879, true);
        List<h> emptyList = CollectionsKt.emptyList();
        List emptyList2 = CollectionsKt.emptyList();
        au auVar = NavHost.golf;
        auVar.getClass();
        C0384i c0384i = new C0384i((C0383h) auVar.bravo(AbstractC2996g2.bravo(C0383h.class)), route, dVar);
        for (h hVar : emptyList) {
            ((LinkedHashMap) c0384i.delta).put(hVar.alpha, hVar.bravo);
        }
        Iterator it = emptyList2.iterator();
        while (it.hasNext()) {
            c0384i.bravo((w) it.next());
        }
        ArrayList arrayList = NavHost.juliet;
        arrayList.add(c0384i.alpha());
        d dVar2 = new d(new m() { // from class: f4.a
            @Override // Xd.m
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int intValue = ((Integer) obj3).intValue();
                return com.checkout.address.ui.navigation.a.a(D0.this, d03, countryPickerViewModel, agVar, statePickerViewModel, addressEditViewModel, (l) obj, (InterfaceC0581m) obj2, intValue);
            }
        }, 490067367, true);
        List emptyList3 = CollectionsKt.emptyList();
        C0390o c0390o = new C0390o((C0389n) auVar.bravo(AbstractC2996g2.bravo(C0389n.class)), u.alpha.bravo(Screen.CountryPicker.class), new t(7, false), dVar2);
        Iterator it2 = emptyList3.iterator();
        while (it2.hasNext()) {
            c0390o.bravo((w) it2.next());
        }
        arrayList.add(c0390o.alpha());
        d dVar3 = new d(new o(addressEditViewModel, statePickerViewModel, agVar, 3), 182154768, true);
        List emptyList4 = CollectionsKt.emptyList();
        C0390o c0390o2 = new C0390o((C0389n) auVar.bravo(AbstractC2996g2.bravo(C0389n.class)), u.alpha.bravo(Screen.StatePicker.class), new t(7, false), dVar3);
        Iterator it3 = emptyList4.iterator();
        while (it3.hasNext()) {
            c0390o2.bravo((w) it3.next());
        }
        arrayList.add(c0390o2.alpha());
        return Unit.INSTANCE;
    }

    public static final Unit a(ag agVar, AddressEditViewModel addressEditViewModel, InterfaceC0775m composable, l it, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(composable, "$this$composable");
        Intrinsics.echo(it, "it");
        AbstractC0870k.a(agVar, addressEditViewModel, interfaceC0581m, 0);
        return Unit.INSTANCE;
    }

    public static final Unit a(StatePickerViewModel statePickerViewModel, CountryPickerType countryPickerType, AddressEditViewModel addressEditViewModel, Country it) {
        Intrinsics.echo(it, "it");
        statePickerViewModel.updateCountry(it);
        int i4 = AbstractC0882w.f3913a[countryPickerType.ordinal()];
        if (i4 == 1) {
            addressEditViewModel.onPhoneDialingCodeUpdate(it);
        } else if (i4 == 2) {
            addressEditViewModel.onAddressCountryUpdate(it);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(AddressEditViewModel addressEditViewModel, StatePickerViewModel statePickerViewModel, ag agVar, l it, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(it, "it");
        State state = (State) addressEditViewModel.getSelectedState().getValue();
        C0585q c0585q = (C0585q) interfaceC0581m;
        boolean india = c0585q.india(addressEditViewModel);
        Object jade = c0585q.jade();
        if (india || jade == C0580l.alpha) {
            jade = new C1534h0(1, addressEditViewModel);
            c0585q.f(jade);
        }
        U.a(statePickerViewModel, agVar, state, (Function1) jade, c0585q, 0);
        return Unit.INSTANCE;
    }

    public static final Unit a(AddressEditViewModel addressEditViewModel, State state) {
        Intrinsics.echo(state, "state");
        addressEditViewModel.onAddressStateSelected(state);
        return Unit.INSTANCE;
    }
}
