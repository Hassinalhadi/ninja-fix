package com.checkout.components.address;

import A0.ad;
import A2.ai;
import B9.ab;
import Ec.aa;
import F.C0113h0;
import F.P2;
import F.Q1;
import F.Q2;
import Jb.C0201i;
import Y1.ag;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.b0;
import androidx.compose.foundation.layout.d0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.checkout.address.model.AddressEditScreenStyle;
import com.checkout.address.model.AddressFieldItem;
import com.checkout.address.model.ButtonViewItem;
import com.checkout.address.ui.edit.AddressEditViewModel;
import com.checkout.address.ui.navigation.Screen;
import com.checkout.address.utils.ContactDataUtilsKt;
import com.checkout.components.address.AbstractC0870k;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.extensions.Utils;
import com.checkout.components.ui.view.InternalButtonViewKt;
import com.checkout.components.ui.view.ScreenHeaderViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import ge.InterfaceC1775g;
import i.C1860i;
import i.InterfaceC1869r;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s6.AbstractC2616b5;
import t0.AbstractC2911e0;

/* renamed from: com.checkout.components.address.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0870k {
    public static final Unit a(TextLabelViewItem textLabelViewItem, ButtonViewItem buttonViewItem, Function0 function0, Function1 function1, Function0 function02, boolean z2, boolean z10, List list, Xd.l lVar, Function0 function03, AddressEditScreenStyle addressEditScreenStyle, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        a(textLabelViewItem, buttonViewItem, function0, function1, function02, z2, z10, list, lVar, function03, addressEditScreenStyle, interfaceC0581m, C0564b.cyan(i4 | 1), C0564b.cyan(i5));
        return Unit.INSTANCE;
    }

    public static final Unit a(Context context) {
        Intrinsics.echo(context, "context");
        ae.o oVar = context instanceof ae.o ? (ae.o) context : null;
        if (oVar != null) {
            oVar.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(ag agVar, AddressEditViewModel addressEditViewModel, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(agVar, addressEditViewModel, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final void a(ag navController, AddressEditViewModel viewModel, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(navController, "navController");
        Intrinsics.echo(viewModel, "viewModel");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-453518152);
        if ((i4 & 6) == 0) {
            i5 = (c0585q.india(navController) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q.india(viewModel) ? 32 : 16;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 19) != 18)) {
            Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
            ax mike = C0564b.mike(viewModel.getIsPayoutRequiredCountry(), c0585q, 0);
            ax mike2 = C0564b.mike(viewModel.getAddressCountry(), c0585q, 0);
            TextLabelViewItem titleViewItem = viewModel.getTitleViewItem();
            ButtonViewItem buttonViewItem = viewModel.getButtonViewItem();
            List<AddressFieldItem> addressFields$address_standardRelease = viewModel.getAddressFields$address_standardRelease();
            boolean z2 = mike2.getValue() == ContactDataUtilsKt.getNUMBER_ONL_ZIP_COUNTRY();
            boolean booleanValue = ((Boolean) mike.getValue()).booleanValue();
            AddressEditScreenStyle addressEditScreenStyle = viewModel.getAddressEditScreenStyle();
            boolean india = c0585q.india(viewModel);
            Object jade = c0585q.jade();
            Object obj = C0580l.alpha;
            if (india || jade == obj) {
                jade = new C0868i(viewModel);
                c0585q.f(jade);
            }
            InterfaceC1775g interfaceC1775g = (InterfaceC1775g) jade;
            boolean india2 = c0585q.india(viewModel);
            Object jade2 = c0585q.jade();
            if (india2 || jade2 == obj) {
                jade2 = new C0869j(viewModel);
                c0585q.f(jade2);
            }
            InterfaceC1775g interfaceC1775g2 = (InterfaceC1775g) jade2;
            boolean india3 = c0585q.india(context);
            Object jade3 = c0585q.jade();
            if (india3 || jade3 == obj) {
                jade3 = new C0201i(context, 5);
                c0585q.f(jade3);
            }
            Function0 function0 = (Function0) jade3;
            boolean india4 = c0585q.india(navController);
            Object jade4 = c0585q.jade();
            if (india4 || jade4 == obj) {
                jade4 = new a5.n(navController, 1);
                c0585q.f(jade4);
            }
            Function1 function1 = (Function1) jade4;
            boolean india5 = c0585q.india(navController);
            Object jade5 = c0585q.jade();
            if (india5 || jade5 == obj) {
                jade5 = new a5.m(navController, 5);
                c0585q.f(jade5);
            }
            a(titleViewItem, buttonViewItem, function0, function1, (Function0) jade5, booleanValue, z2, addressFields$address_standardRelease, (Xd.l) interfaceC1775g, (Function0) interfaceC1775g2, addressEditScreenStyle, c0585q, TextLabelViewItem.$stable | ((InternalButtonViewStyle.$stable | InternalButtonState.$stable) << 3), TopAppBarViewStyle.$stable | ButtonStyle.$stable);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(i4, 21, navController, viewModel);
        }
    }

    public static final Unit a(final List list, final Xd.l lVar, final Function1 function1, final boolean z2, final Function0 function0, final AddressEditScreenStyle addressEditScreenStyle, final boolean z10, androidx.compose.foundation.layout.L innerPadding, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        Intrinsics.echo(innerPadding, "innerPadding");
        if ((i4 & 6) == 0) {
            i5 = i4 | (((C0585q) interfaceC0581m).golf(innerPadding) ? 4 : 2);
        } else {
            i5 = i4;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i5 & 1, (i5 & 19) != 18)) {
            T.s romeo = AbstractC0538d.romeo(androidx.compose.foundation.layout.V.charlie, innerPadding);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new hd.l(19);
                c0585q.f(jade);
            }
            T.s alpha = androidx.compose.ui.platform.a.alpha(A0.o.bravo(romeo, false, (Function1) jade), "edit_address_screen");
            boolean india = c0585q.india(list) | c0585q.golf(lVar) | c0585q.golf(function1) | c0585q.hotel(z2) | c0585q.golf(function0) | c0585q.india(addressEditScreenStyle) | c0585q.hotel(z10);
            Object jade2 = c0585q.jade();
            if (india || jade2 == asVar) {
                Function1 function12 = new Function1() { // from class: j4.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC0870k.a(list, lVar, function1, z2, function0, addressEditScreenStyle, z10, (InterfaceC1869r) obj);
                    }
                };
                c0585q.f(function12);
                jade2 = function12;
            }
            AbstractC2616b5.alpha(alpha, null, null, null, null, null, true, null, (Function1) jade2, c0585q, 12582912, 382);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(ag agVar, CountryPickerType type) {
        Intrinsics.echo(type, "type");
        Y1.r.delta(agVar, new Screen.CountryPicker(type));
        return Unit.INSTANCE;
    }

    public static final Unit a(ag agVar) {
        Y1.r.delta(agVar, Screen.StatePicker.INSTANCE);
        return Unit.INSTANCE;
    }

    public static final void a(final TextLabelViewItem textLabelViewItem, final ButtonViewItem buttonViewItem, final Function0 function0, final Function1 function1, final Function0 function02, final boolean z2, final boolean z10, final List list, final Xd.l lVar, final Function0 function03, final AddressEditScreenStyle addressEditScreenStyle, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        Function0 function04;
        boolean z11;
        List list2;
        int i11;
        int i12;
        C0585q c0585q;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-950591049);
        if ((i4 & 6) == 0) {
            i10 = ((i4 & 8) == 0 ? c0585q2.golf(textLabelViewItem) : c0585q2.india(textLabelViewItem) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= (i4 & 64) == 0 ? c0585q2.golf(buttonViewItem) : c0585q2.india(buttonViewItem) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            function04 = function0;
            i10 |= c0585q2.india(function04) ? Barcode.FORMAT_QR_CODE : 128;
        } else {
            function04 = function0;
        }
        if ((i4 & 3072) == 0) {
            i10 |= c0585q2.india(function1) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i10 |= c0585q2.india(function02) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i10 |= c0585q2.hotel(z2) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            z11 = z10;
            i10 |= c0585q2.hotel(z11) ? 1048576 : 524288;
        } else {
            z11 = z10;
        }
        if ((12582912 & i4) == 0) {
            list2 = list;
            i10 |= c0585q2.india(list2) ? 8388608 : 4194304;
        } else {
            list2 = list;
        }
        if ((i4 & 100663296) == 0) {
            i11 = 3;
            i10 |= c0585q2.india(lVar) ? 67108864 : 33554432;
        } else {
            i11 = 3;
        }
        if ((i4 & 805306368) == 0) {
            i10 |= c0585q2.india(function03) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i12 = i5 | ((i5 & 8) == 0 ? c0585q2.golf(addressEditScreenStyle) : c0585q2.india(addressEditScreenStyle) ? 4 : 2);
        } else {
            i12 = i5;
        }
        if (c0585q2.magenta(i10 & 1, ((i10 & 306783379) == 306783378 && (i12 & 3) == 2) ? false : true)) {
            float f5 = P2.alpha;
            ab bravo = P2.bravo(F.ag.hotel(c0585q2), c0585q2);
            WeakHashMap weakHashMap = b0.whiskey;
            b0 foxtrot = C0537c.foxtrot(c0585q2);
            final boolean z12 = z11;
            final List list3 = list2;
            c0585q = c0585q2;
            Q1.alpha(androidx.compose.ui.input.nestedscroll.a.alpha(androidx.compose.ui.platform.a.alpha(T.a.alpha(androidx.compose.foundation.layout.V.charlie, AbstractC2911e0.alpha, new d0(i11)), (String) textLabelViewItem.getState().getText().getValue()), (C0113h0) bravo.teal, null), P.e.echo(594618747, new Ac.h(textLabelViewItem, function04, bravo, addressEditScreenStyle, 9), c0585q2), P.e.echo(36634684, new Ac.f(foxtrot.charlie.echo().delta > 0, buttonViewItem, function03), c0585q2), null, null, 0, Utils.INSTANCE.m191toComposeColorvNxB06k(addressEditScreenStyle.getContainerColor()), 0L, null, P.e.echo(-439551866, new Xd.m() { // from class: j4.f
                @Override // Xd.m
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int intValue = ((Integer) obj3).intValue();
                    return AbstractC0870k.a(list3, lVar, function1, z2, function02, addressEditScreenStyle, z12, (L) obj, (InterfaceC0581m) obj2, intValue);
                }
            }, c0585q2), c0585q, 805306800, 440);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: j4.g
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    int intValue = ((Integer) obj2).intValue();
                    return AbstractC0870k.a(TextLabelViewItem.this, buttonViewItem, function0, function1, function02, z2, z10, list, lVar, function03, addressEditScreenStyle, i4, i5, (InterfaceC0581m) obj, intValue);
                }
            };
        }
    }

    public static final Unit a(TextLabelViewItem textLabelViewItem, Function0 function0, Q2 q22, AddressEditScreenStyle addressEditScreenStyle, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            ScreenHeaderViewKt.ScreenHeaderView(textLabelViewItem.getState(), textLabelViewItem.getStyle(), ai.charlie(), null, function0, null, null, null, q22, false, addressEditScreenStyle.getTopAppBarViewStyle(), c0585q, TextLabelState.$stable | (TextLabelViewStyle.$stable << 3), TopAppBarViewStyle.$stable, 744);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(boolean z2, ButtonViewItem buttonViewItem, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            if (!z2) {
                c0585q.purple(462224052);
                InternalButtonViewStyle style = buttonViewItem.getStyle();
                InternalButtonState state = buttonViewItem.getState();
                boolean golf = c0585q.golf(function0);
                Object jade = c0585q.jade();
                if (golf || jade == C0580l.alpha) {
                    jade = new com.checkout.components.ui.country.c(function0, 8);
                    c0585q.f(jade);
                }
                InternalButtonViewKt.InternalButtonView(style, state, null, (Function0) jade, "address_confirm", c0585q, InternalButtonViewStyle.$stable | 24576 | (InternalButtonState.$stable << 3), 4);
            } else {
                c0585q.purple(456658374);
            }
            c0585q.quebec(false);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit a(ad semantics) {
        Intrinsics.echo(semantics, "$this$semantics");
        A0.ab.alpha(semantics);
        return Unit.INSTANCE;
    }

    public static final Unit a(List list, Xd.l lVar, Function1 function1, boolean z2, Function0 function0, AddressEditScreenStyle addressEditScreenStyle, boolean z10, InterfaceC1869r LazyColumn) {
        Intrinsics.echo(LazyColumn, "$this$LazyColumn");
        ((C1860i) LazyColumn).quebec(list.size(), null, new C0866g(list), new P.d(new C0867h(list, lVar, function1, z2, function0, addressEditScreenStyle, z10), 2039820996, true));
        return Unit.INSTANCE;
    }
}
