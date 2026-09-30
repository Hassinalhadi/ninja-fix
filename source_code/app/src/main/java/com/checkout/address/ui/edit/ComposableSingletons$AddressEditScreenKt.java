package com.checkout.address.ui.edit;

import P.b;
import P.d;
import Xd.l;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import com.checkout.address.model.AddressEditScreenStyle;
import com.checkout.address.model.AddressFieldItem;
import com.checkout.address.model.ButtonViewItem;
import com.checkout.address.model.Fixtures;
import com.checkout.components.address.AbstractC0870k;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.clevertap.android.sdk.inapp.images.preload.a;
import d5.C1589a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$AddressEditScreenKt {

    @NotNull
    public static final ComposableSingletons$AddressEditScreenKt INSTANCE = new ComposableSingletons$AddressEditScreenKt();

    /* renamed from: a */
    private static final b f3816a = new d(new com.checkout.components.kmp.rememberme.di.b(28), 1866801976, false);

    public static final Unit a(InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            Fixtures fixtures = Fixtures.INSTANCE;
            TextLabelViewItem text_label_item = fixtures.getTEXT_LABEL_ITEM();
            ButtonViewItem buttonViewItem = new ButtonViewItem(fixtures.getBUTTON_STYLE(), fixtures.getBUTTON_STATE());
            List<AddressFieldItem> address_field_item_list = fixtures.getADDRESS_FIELD_ITEM_LIST();
            AddressEditScreenStyle addressEditScreenStyle = new AddressEditScreenStyle(null, 0L, null, null, 15, null);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new C1589a(14);
                c0585q.f(jade);
            }
            Function0 function0 = (Function0) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new a(15);
                c0585q.f(jade2);
            }
            Function1 function1 = (Function1) jade2;
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                jade3 = new C1589a(15);
                c0585q.f(jade3);
            }
            Function0 function02 = (Function0) jade3;
            Object jade4 = c0585q.jade();
            if (jade4 == asVar) {
                jade4 = new com.checkout.components.kmp.rememberme.di.b(27);
                c0585q.f(jade4);
            }
            l lVar = (l) jade4;
            Object jade5 = c0585q.jade();
            if (jade5 == asVar) {
                jade5 = new C1589a(16);
                c0585q.f(jade5);
            }
            AbstractC0870k.a(text_label_item, buttonViewItem, function0, function1, function02, false, false, address_field_item_list, lVar, (Function0) jade5, addressEditScreenStyle, c0585q, TextLabelViewItem.$stable | 907767168 | ((InternalButtonViewStyle.$stable | InternalButtonState.$stable) << 3), TopAppBarViewStyle.$stable | ButtonStyle.$stable);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit b() {
        return Unit.INSTANCE;
    }

    public static final Unit c() {
        return Unit.INSTANCE;
    }

    @NotNull
    public final l getLambda$1866801976$address_standardRelease() {
        return f3816a;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Unit a(CountryPickerType it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    public static final Unit a(int i4, String str) {
        Intrinsics.echo(str, "<unused var>");
        return Unit.INSTANCE;
    }
}
