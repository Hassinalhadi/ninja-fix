package com.checkout.components.ui.country;

import Ac.d;
import F4.f;
import P.e;
import Yb.F;
import androidx.appcompat.widget.P0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import bz.h0;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.model.CountryPickerViewState;
import com.checkout.components.ui.picker.PickerContentViewKt;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001am\u0010\u000f\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/interfaces/model/contact/Country;", "selectedCountry", "", "filteredCountries", "Lkotlin/Function1;", "", "", "onQueryChanged", "onCountrySelected", "Lkotlin/Function0;", "onDismiss", "Lcom/checkout/components/ui/model/CountryPickerType;", Constants.KEY_TYPE, "Lcom/checkout/components/ui/model/CountryPickerViewState;", "state", "CountryPickerContentView", "(Lcom/checkout/components/interfaces/model/contact/Country;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/checkout/components/ui/model/CountryPickerType;Lcom/checkout/components/ui/model/CountryPickerViewState;Landroidx/compose/runtime/m;I)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CountryPickerContentViewKt {
    public static final void CountryPickerContentView(@Nullable Country country, @NotNull List<? extends Country> filteredCountries, @NotNull Function1<? super String, Unit> onQueryChanged, @NotNull Function1<? super Country, Unit> onCountrySelected, @NotNull Function0<Unit> onDismiss, @NotNull CountryPickerType type, @NotNull CountryPickerViewState state, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        boolean india;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int ordinal;
        int i16;
        Intrinsics.echo(filteredCountries, "filteredCountries");
        Intrinsics.echo(onQueryChanged, "onQueryChanged");
        Intrinsics.echo(onCountrySelected, "onCountrySelected");
        Intrinsics.echo(onDismiss, "onDismiss");
        Intrinsics.echo(type, "type");
        Intrinsics.echo(state, "state");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-724284201);
        if ((i4 & 6) == 0) {
            if (country == null) {
                ordinal = -1;
            } else {
                ordinal = country.ordinal();
            }
            if (c0585q2.echo(ordinal)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i5 = i16 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(filteredCountries)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i5 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.india(onQueryChanged)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i5 |= i14;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.india(onCountrySelected)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i13;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q2.india(onDismiss)) {
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i12 = 8192;
            }
            i5 |= i12;
        }
        if ((196608 & i4) == 0) {
            if (c0585q2.echo(type.ordinal())) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        if ((1572864 & i4) == 0) {
            if ((2097152 & i4) == 0) {
                india = c0585q2.golf(state);
            } else {
                india = c0585q2.india(state);
            }
            if (india) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i5 |= i10;
        }
        int i17 = i5;
        if ((599187 & i17) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i17 & 1, z2)) {
            Object jade = c0585q2.jade();
            if (jade == C0580l.alpha) {
                jade = new h0(18);
                c0585q2.f(jade);
            }
            int i18 = i17 >> 3;
            c0585q = c0585q2;
            PickerContentViewKt.PickerContentView(country, filteredCountries, onQueryChanged, onDismiss, (Function1) jade, state, e.echo(795618518, new d(country, type, onCountrySelected, state, 5), c0585q2), c0585q, (i17 & 14) | 1597440 | (i17 & 112) | (i17 & 896) | (i18 & 7168) | (FontFamily.$stable << 15) | (i18 & 458752));
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new f(country, filteredCountries, onQueryChanged, onCountrySelected, onDismiss, type, state, i4, 4);
        }
    }

    public static final String CountryPickerContentView$lambda$1$lambda$0(Country it) {
        Intrinsics.echo(it, "it");
        return P0.crimson(it.getDialingCode(), it.displayName());
    }

    public static final Unit CountryPickerContentView$lambda$4(Country country, CountryPickerType countryPickerType, Function1 function1, CountryPickerViewState countryPickerViewState, Country country2, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        Intrinsics.echo(country2, "country");
        if ((i4 & 6) == 0) {
            if (((C0585q) interfaceC0581m).echo(country2.ordinal())) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i4 | i11;
        } else {
            i5 = i4;
        }
        boolean z12 = true;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i5 & 1, z2)) {
            if (country == country2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (countryPickerType == CountryPickerType.Phone) {
                i10 = i5;
                z11 = true;
            } else {
                i10 = i5;
                z11 = false;
            }
            boolean golf = c0585q.golf(function1);
            int i12 = i10 & 14;
            if (i12 != 4) {
                z12 = false;
            }
            boolean z13 = golf | z12;
            Object jade = c0585q.jade();
            if (z13 || jade == C0580l.alpha) {
                jade = new F(12, function1, country2);
                c0585q.f(jade);
            }
            CountryListItemViewKt.m132CountryListItemView0S3VyRs(country2, z10, z11, (Function0) jade, countryPickerViewState.getEmoji(), countryPickerViewState.getItemName(), countryPickerViewState.getDialingCode(), countryPickerViewState.isRTL(), countryPickerViewState.mo64getSelectedRadioButtonColor0d7_KjU(), countryPickerViewState.mo65getUnSelectedRadioButtonColor0d7_KjU(), c0585q, i12, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit CountryPickerContentView$lambda$4$lambda$3$lambda$2(Function1 function1, Country country) {
        function1.invoke(country);
        return Unit.INSTANCE;
    }

    public static final Unit CountryPickerContentView$lambda$5(Country country, List list, Function1 function1, Function1 function12, Function0 function0, CountryPickerType countryPickerType, CountryPickerViewState countryPickerViewState, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        CountryPickerContentView(country, list, function1, function12, function0, countryPickerType, countryPickerViewState, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
