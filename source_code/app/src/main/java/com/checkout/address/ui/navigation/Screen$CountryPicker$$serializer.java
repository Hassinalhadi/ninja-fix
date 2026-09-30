package com.checkout.address.ui.navigation;

import Nf.B;
import Nf.K;
import Nf.P;
import Nf.ac;
import Nf.az;
import com.checkout.address.ui.navigation.Screen;
import com.checkout.components.ui.model.CountryPickerType;
import com.clevertap.android.sdk.Constants;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@c
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/checkout/address/ui/navigation/Screen.CountryPicker.$serializer", "LNf/ac;", "Lcom/checkout/address/ui/navigation/Screen$CountryPicker;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/checkout/address/ui/navigation/Screen$CountryPicker;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/checkout/address/ui/navigation/Screen$CountryPicker;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class Screen$CountryPicker$$serializer implements ac {
    public static final int $stable = 8;

    @NotNull
    public static final Screen$CountryPicker$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Screen$CountryPicker$$serializer screen$CountryPicker$$serializer = new Screen$CountryPicker$$serializer();
        INSTANCE = screen$CountryPicker$$serializer;
        B b2 = new B("com.checkout.address.ui.navigation.Screen.CountryPicker", screen$CountryPicker$$serializer, 2);
        b2.bravo("route", false);
        b2.bravo(Constants.KEY_TYPE, false);
        descriptor = b2;
    }

    private Screen$CountryPicker$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Nf.ac
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr;
        lazyArr = Screen.CountryPicker.f3820d;
        return new KSerializer[]{P.alpha, lazyArr[1].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public final Screen.CountryPicker deserialize(@NotNull Decoder decoder) {
        Lazy[] lazyArr;
        Intrinsics.echo(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        Mf.a charlie = decoder.charlie(serialDescriptor);
        lazyArr = Screen.CountryPicker.f3820d;
        K k6 = null;
        boolean z2 = true;
        int i4 = 0;
        String str = null;
        CountryPickerType countryPickerType = null;
        while (z2) {
            int sierra = charlie.sierra(serialDescriptor);
            if (sierra == -1) {
                z2 = false;
            } else if (sierra == 0) {
                str = charlie.papa(serialDescriptor, 0);
                i4 |= 1;
            } else {
                if (sierra != 1) {
                    throw new UnknownFieldException(sierra);
                }
                countryPickerType = (CountryPickerType) charlie.whiskey(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), countryPickerType);
                i4 |= 2;
            }
        }
        charlie.alpha(serialDescriptor);
        return new Screen.CountryPicker(i4, str, countryPickerType, k6);
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Screen.CountryPicker value) {
        Intrinsics.echo(encoder, "encoder");
        Intrinsics.echo(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        Mf.b charlie = encoder.charlie(serialDescriptor);
        Screen.CountryPicker.write$Self$address_standardRelease(value, charlie, serialDescriptor);
        charlie.alpha(serialDescriptor);
    }

    @Override // Nf.ac
    @NotNull
    public final KSerializer[] typeParametersSerializers() {
        return az.bravo;
    }
}
