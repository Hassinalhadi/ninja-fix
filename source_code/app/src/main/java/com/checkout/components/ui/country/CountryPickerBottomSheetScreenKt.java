package com.checkout.components.ui.country;

import Cb.g;
import P.e;
import Y1.r;
import a2.C0393r;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.model.CountryPickerViewState;
import com.checkout.components.ui.picker.PickerBottomSheetScreenKt;
import com.checkout.components.ui.utils.constants.Fixtures;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import ge.InterfaceC1775g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u001aE\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/checkout/components/ui/country/CountryPickerViewModel;", "viewModel", "LY1/r;", "navController", "Lcom/checkout/components/ui/model/CountryPickerType;", Constants.KEY_TYPE, "Lcom/checkout/components/interfaces/model/contact/Country;", "selectedCountry", "Lkotlin/Function1;", "", "onCountrySelected", "CountryPickerBottomSheetScreen", "(Lcom/checkout/components/ui/country/CountryPickerViewModel;LY1/r;Lcom/checkout/components/ui/model/CountryPickerType;Lcom/checkout/components/interfaces/model/contact/Country;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/m;I)V", "", "filteredCountries", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CountryPickerBottomSheetScreenKt {
    public static final void CountryPickerBottomSheetScreen(@NotNull CountryPickerViewModel viewModel, @NotNull r navController, @NotNull CountryPickerType type, @Nullable Country country, @NotNull Function1<? super Country, Unit> onCountrySelected, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        int i10;
        int ordinal;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(viewModel, "viewModel");
        Intrinsics.echo(navController, "navController");
        Intrinsics.echo(type, "type");
        Intrinsics.echo(onCountrySelected, "onCountrySelected");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-853741181);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(viewModel)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(navController)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 |= i13;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.echo(type.ordinal())) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i5 |= i12;
        }
        if ((i4 & 3072) == 0) {
            if (country == null) {
                ordinal = -1;
            } else {
                ordinal = country.ordinal();
            }
            if (c0585q2.echo(ordinal)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i11;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q2.india(onCountrySelected)) {
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i10 = 8192;
            }
            i5 |= i10;
        }
        int i15 = i5;
        if ((i15 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i15 & 1, z2)) {
            ax mike = C0564b.mike(viewModel.getFilteredCountries(), c0585q2, 0);
            String createCountryPickerScreenTestTag = Fixtures.INSTANCE.createCountryPickerScreenTestTag(type);
            boolean india = c0585q2.india(viewModel);
            Object jade = c0585q2.jade();
            if (india || jade == C0580l.alpha) {
                jade = new CountryPickerBottomSheetScreenKt$CountryPickerBottomSheetScreen$1$1(viewModel);
                c0585q2.f(jade);
            }
            c0585q = c0585q2;
            PickerBottomSheetScreenKt.m184PickerBottomSheetScreencf5BqRc((Function0) ((InterfaceC1775g) jade), navController, viewModel.getContainerColor(), createCountryPickerScreenTestTag, e.echo(988499614, new g(viewModel, country, type, onCountrySelected, mike), c0585q2), c0585q, (i15 & 112) | 24576);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.b(viewModel, navController, type, country, onCountrySelected, i4, 6);
        }
    }

    private static final List<Country> CountryPickerBottomSheetScreen$lambda$0(D0 d02) {
        return (List) d02.getValue();
    }

    public static final Unit CountryPickerBottomSheetScreen$lambda$8(CountryPickerViewModel countryPickerViewModel, Country country, CountryPickerType countryPickerType, Function1 function1, D0 d02, Function0 dismissBottomSheet, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        CountryPickerType countryPickerType2;
        boolean z10;
        int i10;
        Intrinsics.echo(dismissBottomSheet, "dismissBottomSheet");
        if ((i4 & 6) == 0) {
            if (((C0585q) interfaceC0581m).india(dismissBottomSheet)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i4 | i10;
        } else {
            i5 = i4;
        }
        boolean z11 = true;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i5 & 1, z2)) {
            List<Country> CountryPickerBottomSheetScreen$lambda$0 = CountryPickerBottomSheetScreen$lambda$0(d02);
            CountryPickerViewState state = countryPickerViewModel.getState();
            boolean india = c0585q.india(countryPickerViewModel) | c0585q.echo(countryPickerType.ordinal());
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (!india && jade != asVar) {
                countryPickerType2 = countryPickerType;
            } else {
                countryPickerType2 = countryPickerType;
                jade = new C0393r(20, countryPickerViewModel, countryPickerType2);
                c0585q.f(jade);
            }
            Function1 function12 = (Function1) jade;
            boolean golf = c0585q.golf(function1);
            int i11 = i5 & 14;
            if (i11 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = golf | z10;
            Object jade2 = c0585q.jade();
            if (z12 || jade2 == asVar) {
                jade2 = new b(0, dismissBottomSheet, function1);
                c0585q.f(jade2);
            }
            Function1 function13 = (Function1) jade2;
            if (i11 != 4) {
                z11 = false;
            }
            Object jade3 = c0585q.jade();
            if (z11 || jade3 == asVar) {
                jade3 = new c(dismissBottomSheet, 0);
                c0585q.f(jade3);
            }
            CountryPickerContentViewKt.CountryPickerContentView(country, CountryPickerBottomSheetScreen$lambda$0, function12, function13, (Function0) jade3, countryPickerType2, state, c0585q, FontFamily.$stable << 18);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit CountryPickerBottomSheetScreen$lambda$8$lambda$3$lambda$2(CountryPickerViewModel countryPickerViewModel, CountryPickerType countryPickerType, String it) {
        Intrinsics.echo(it, "it");
        countryPickerViewModel.onQueryChanged$ui_standardRelease(it, countryPickerType);
        return Unit.INSTANCE;
    }

    public static final Unit CountryPickerBottomSheetScreen$lambda$8$lambda$5$lambda$4(Function1 function1, Function0 function0, Country it) {
        Intrinsics.echo(it, "it");
        function1.invoke(it);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit CountryPickerBottomSheetScreen$lambda$8$lambda$7$lambda$6(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit CountryPickerBottomSheetScreen$lambda$9(CountryPickerViewModel countryPickerViewModel, r rVar, CountryPickerType countryPickerType, Country country, Function1 function1, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        CountryPickerBottomSheetScreen(countryPickerViewModel, rVar, countryPickerType, country, function1, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
