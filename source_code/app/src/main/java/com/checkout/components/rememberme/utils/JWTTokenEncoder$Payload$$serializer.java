package com.checkout.components.rememberme.utils;

import Mf.a;
import Nf.B;
import Nf.P;
import Nf.ac;
import Nf.ao;
import Nf.az;
import com.checkout.components.rememberme.D;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2796v6;

@c
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/checkout/components/rememberme/utils/JWTTokenEncoder.Payload.$serializer", "LNf/ac;", "Lcom/checkout/components/rememberme/D;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/checkout/components/rememberme/D;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/checkout/components/rememberme/D;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class JWTTokenEncoder$Payload$$serializer implements ac {
    public static final int $stable = 8;

    @NotNull
    public static final JWTTokenEncoder$Payload$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        JWTTokenEncoder$Payload$$serializer jWTTokenEncoder$Payload$$serializer = new JWTTokenEncoder$Payload$$serializer();
        INSTANCE = jWTTokenEncoder$Payload$$serializer;
        B b2 = new B("com.checkout.components.rememberme.utils.JWTTokenEncoder.Payload", jWTTokenEncoder$Payload$$serializer, 4);
        b2.bravo("email", false);
        b2.bravo("phone", false);
        b2.bravo("country_code", false);
        b2.bravo("iat", false);
        descriptor = b2;
    }

    private JWTTokenEncoder$Payload$$serializer() {
    }

    @Override // Nf.ac
    @NotNull
    public final KSerializer[] childSerializers() {
        P p4 = P.alpha;
        return new KSerializer[]{p4, p4, p4, ao.alpha};
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public final D deserialize(@NotNull Decoder decoder) {
        Intrinsics.echo(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a charlie = decoder.charlie(serialDescriptor);
        int i4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j5 = 0;
        boolean z2 = true;
        while (z2) {
            int sierra = charlie.sierra(serialDescriptor);
            if (sierra == -1) {
                z2 = false;
            } else if (sierra == 0) {
                str = charlie.papa(serialDescriptor, 0);
                i4 |= 1;
            } else if (sierra == 1) {
                str2 = charlie.papa(serialDescriptor, 1);
                i4 |= 2;
            } else if (sierra == 2) {
                str3 = charlie.papa(serialDescriptor, 2);
                i4 |= 4;
            } else {
                if (sierra != 3) {
                    throw new UnknownFieldException(sierra);
                }
                j5 = charlie.golf(serialDescriptor, 3);
                i4 |= 8;
            }
        }
        charlie.alpha(serialDescriptor);
        return new D(i4, str, str2, str3, j5);
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull D value) {
        Intrinsics.echo(encoder, "encoder");
        Intrinsics.echo(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) encoder.charlie(serialDescriptor);
        abstractC2796v6.xray(serialDescriptor, 0, value.f5738a);
        abstractC2796v6.xray(serialDescriptor, 1, value.f5739b);
        abstractC2796v6.xray(serialDescriptor, 2, value.f5740c);
        long j5 = value.f5741d;
        abstractC2796v6.tango(serialDescriptor, 3);
        abstractC2796v6.papa(j5);
        abstractC2796v6.alpha(serialDescriptor);
    }

    @Override // Nf.ac
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return az.bravo;
    }
}
