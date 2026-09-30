package com.checkout.components.ui.view.field;

import T.a;
import T.d;
import T.k;
import T.p;
import T.s;
import Xd.l;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.model.InputComponentViewItem;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.view.InputContainerViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l5.C2057a;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "position", "Lcom/checkout/components/ui/model/InputComponentViewItem;", "numberViewItem", "countryViewItem", "", "testTag", "Lkotlin/Function2;", "", "onValueChange", "Lkotlin/Function0;", "onCountryPickerClick", "PaymentMethodPhoneFieldView", "(ILcom/checkout/components/ui/model/InputComponentViewItem;Lcom/checkout/components/ui/model/InputComponentViewItem;Ljava/lang/String;LXd/l;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/m;II)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentMethodPhoneFieldViewKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentMethodPhoneFieldView(int i4, @NotNull InputComponentViewItem numberViewItem, @NotNull InputComponentViewItem countryViewItem, @Nullable String str, @NotNull l onValueChange, @NotNull Function0<Unit> onCountryPickerClick, @Nullable InterfaceC0581m interfaceC0581m, int i5, int i10) {
        int i11;
        String str2;
        int i12;
        boolean z2;
        String str3;
        Q uniform;
        String str4;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Intrinsics.echo(numberViewItem, "numberViewItem");
        Intrinsics.echo(countryViewItem, "countryViewItem");
        Intrinsics.echo(onValueChange, "onValueChange");
        Intrinsics.echo(onCountryPickerClick, "onCountryPickerClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1595000122);
        if ((i5 & 6) == 0) {
            if (c0585q.echo(i4)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i5;
        } else {
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q.golf(numberViewItem)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i5 & 384) == 0) {
            if (c0585q.golf(countryViewItem)) {
                i15 = Barcode.FORMAT_QR_CODE;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        int i18 = i10 & 8;
        if (i18 != 0) {
            i11 |= 3072;
        } else if ((i5 & 3072) == 0) {
            str2 = str;
            if (c0585q.golf(str2)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i11 |= i12;
            if ((i5 & 24576) == 0) {
                if (c0585q.india(onValueChange)) {
                    i14 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i14 = 8192;
                }
                i11 |= i14;
            }
            if ((196608 & i5) == 0) {
                if (c0585q.india(onCountryPickerClick)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i11 |= i13;
            }
            if ((74899 & i11) == 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i11 & 1, z2)) {
                if (i18 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                s charlie = V.charlie(p.alpha, 1.0f);
                S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, d.f2060c, c0585q, 48);
                long j5 = c0585q.magenta;
                int i19 = (int) (j5 ^ (j5 >>> 32));
                I mike = c0585q.mike();
                s charlie2 = a.charlie(charlie, c0585q);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C2549i c2549i = C2551k.foxtrot;
                C0564b.blue(c2549i, c0585q, alpha);
                C2549i c2549i2 = C2551k.echo;
                C0564b.blue(c2549i2, c0585q, mike);
                C2549i c2549i3 = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i19))) {
                    ad.blue(i19, c0585q, i19, c2549i3);
                }
                C2549i c2549i4 = C2551k.delta;
                C0564b.blue(c2549i4, c0585q, charlie2);
                s maroon = P0.maroon(2.0f);
                k kVar = d.alpha;
                ap delta = AbstractC0547m.delta(kVar, false);
                long j6 = c0585q.magenta;
                int i20 = (int) (j6 ^ (j6 >>> 32));
                I mike2 = c0585q.mike();
                s charlie3 = a.charlie(maroon, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i, c0585q, delta);
                C0564b.blue(c2549i2, c0585q, mike2);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i20))) {
                    ad.blue(i20, c0585q, i20, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q, charlie3);
                CountryFieldViewKt.CountryFieldView(countryViewItem.getState(), InputComponentViewStyle.copy$default(countryViewItem.getStyle(), InputFieldViewStyle.copy$default(countryViewItem.getStyle().getInputFieldStyle(), null, false, false, null, null, null, null, null, null, false, 2, 1, null, null, null, 29183, null), null, null, 6, null), onCountryPickerClick, "phone_country_selector", CountryPickerType.Phone, c0585q, ((i11 >> 9) & 896) | 27648);
                c0585q.quebec(true);
                s maroon2 = P0.maroon(3.0f);
                boolean z11 = false;
                ap delta2 = AbstractC0547m.delta(kVar, false);
                long j7 = c0585q.magenta;
                int i21 = (int) (j7 ^ (j7 >>> 32));
                I mike3 = c0585q.mike();
                s charlie4 = a.charlie(maroon2, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i, c0585q, delta2);
                C0564b.blue(c2549i2, c0585q, mike3);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i21))) {
                    ad.blue(i21, c0585q, i21, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q, charlie4);
                InputComponentState state = numberViewItem.getState();
                InputComponentViewStyle style = numberViewItem.getStyle();
                if ((i11 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i11 & 14) == 4) {
                    z11 = true;
                }
                boolean z12 = z10 | z11;
                Object jade = c0585q.jade();
                if (z12 || jade == C0580l.alpha) {
                    jade = new j4.a(onValueChange, i4, 2);
                    c0585q.f(jade);
                }
                String str5 = str4;
                InputContainerViewKt.InputComponentContainerView(style, state, (Function1) jade, null, str5, c0585q, (i11 << 3) & 57344, 8);
                c0585q.quebec(true);
                c0585q.quebec(true);
                str3 = str5;
            } else {
                c0585q.ochre();
                str3 = str2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C2057a(i4, numberViewItem, countryViewItem, str3, onValueChange, onCountryPickerClick, i5, i10, 0);
                return;
            }
            return;
        }
        str2 = str;
        if ((i5 & 24576) == 0) {
        }
        if ((196608 & i5) == 0) {
        }
        if ((74899 & i11) == 74898) {
        }
        if (!c0585q.magenta(i11 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final Unit PaymentMethodPhoneFieldView$lambda$4$lambda$3$lambda$2$lambda$1(l lVar, int i4, String it) {
        Intrinsics.echo(it, "it");
        lVar.invoke(Integer.valueOf(i4), it);
        return Unit.INSTANCE;
    }

    public static final Unit PaymentMethodPhoneFieldView$lambda$5(int i4, InputComponentViewItem inputComponentViewItem, InputComponentViewItem inputComponentViewItem2, String str, l lVar, Function0 function0, int i5, int i10, InterfaceC0581m interfaceC0581m, int i11) {
        PaymentMethodPhoneFieldView(i4, inputComponentViewItem, inputComponentViewItem2, str, lVar, function0, interfaceC0581m, C0564b.cyan(i5 | 1), i10);
        return Unit.INSTANCE;
    }
}
