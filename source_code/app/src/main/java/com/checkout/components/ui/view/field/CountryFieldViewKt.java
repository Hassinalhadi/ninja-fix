package com.checkout.components.ui.view.field;

import D0.an;
import Ec.b;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/checkout/components/ui/model/state/InputComponentState;", "state", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "style", "Lkotlin/Function0;", "", "goToCountryPickerScreen", "", "testTag", "Lcom/checkout/components/ui/model/CountryPickerType;", Constants.KEY_TYPE, "CountryFieldView", "(Lcom/checkout/components/ui/model/state/InputComponentState;Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/checkout/components/ui/model/CountryPickerType;Landroidx/compose/runtime/m;I)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CountryFieldViewKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CountryPickerType.values().length];
            try {
                iArr[CountryPickerType.Phone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryPickerType.Address.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void CountryFieldView(@NotNull InputComponentState state, @NotNull InputComponentViewStyle style, @NotNull Function0<Unit> goToCountryPickerScreen, @NotNull String testTag, @NotNull CountryPickerType type, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        an anVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Intrinsics.echo(state, "state");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(goToCountryPickerScreen, "goToCountryPickerScreen");
        Intrinsics.echo(testTag, "testTag");
        Intrinsics.echo(type, "type");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1141578090);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(state)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i15 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(style)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i5 |= i14;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.india(goToCountryPickerScreen)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i5 |= i13;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.golf(testTag)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i12;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q2.echo(type.ordinal())) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i5 |= i11;
        }
        int i16 = i5;
        if ((i16 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i16 & 1, z2)) {
            InputFieldViewStyle inputFieldStyle = style.getInputFieldStyle();
            an textStyle = style.getInputFieldStyle().getTextStyle();
            if (textStyle == null) {
                anVar = new an(0L, 0L, null, null, null, 0L, 0, 0L, 0, 16777215);
            } else {
                anVar = textStyle;
            }
            int i17 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i17 != 1) {
                if (i17 == 2) {
                    i10 = 5;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i10 = 3;
            }
            c0585q = c0585q2;
            PickerFieldViewKt.PickerFieldView(state, InputComponentViewStyle.copy$default(style, InputFieldViewStyle.copy$default(inputFieldStyle, null, false, false, an.alpha(anVar, 0L, 0L, null, null, 0L, i10, 0L, null, null, 16744447), null, null, null, null, null, false, 0, 0, null, null, null, 32759, null), null, null, 6, null), goToCountryPickerScreen, testTag, c0585q, i16 & 8078);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new b(state, style, goToCountryPickerScreen, testTag, type, i4, 7);
        }
    }

    public static final Unit CountryFieldView$lambda$0(InputComponentState inputComponentState, InputComponentViewStyle inputComponentViewStyle, Function0 function0, String str, CountryPickerType countryPickerType, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        CountryFieldView(inputComponentState, inputComponentViewStyle, function0, str, countryPickerType, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
