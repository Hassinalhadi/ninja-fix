package com.checkout.components.kmp.rememberme.data.model;

import Mf.a;
import Mf.b;
import Nf.B;
import Nf.P;
import Nf.ac;
import Nf.aj;
import Nf.az;
import com.clevertap.android.sdk.Constants;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse.$serializer", "LNf/ac;", "Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/checkout/components/kmp/rememberme/data/model/CreateChallengeResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class CreateChallengeResponse$$serializer implements ac {
    public static final int $stable;

    @NotNull
    public static final CreateChallengeResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CreateChallengeResponse$$serializer createChallengeResponse$$serializer = new CreateChallengeResponse$$serializer();
        INSTANCE = createChallengeResponse$$serializer;
        $stable = 8;
        B b2 = new B("com.checkout.components.kmp.rememberme.data.model.CreateChallengeResponse", createChallengeResponse$$serializer, 4);
        b2.bravo(Constants.KEY_ID, false);
        b2.bravo("expires_at", false);
        b2.bravo("attempt_count", false);
        b2.bravo("max_attempt_count", false);
        descriptor = b2;
    }

    private CreateChallengeResponse$$serializer() {
    }

    @Override // Nf.ac
    @NotNull
    public final KSerializer[] childSerializers() {
        P p4 = P.alpha;
        aj ajVar = aj.alpha;
        return new KSerializer[]{p4, p4, ajVar, ajVar};
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public final CreateChallengeResponse deserialize(@NotNull Decoder decoder) {
        Intrinsics.echo(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a charlie = decoder.charlie(serialDescriptor);
        int i4 = 0;
        int i5 = 0;
        int i10 = 0;
        String str = null;
        String str2 = null;
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
                i5 = charlie.kilo(serialDescriptor, 2);
                i4 |= 4;
            } else {
                if (sierra != 3) {
                    throw new UnknownFieldException(sierra);
                }
                i10 = charlie.kilo(serialDescriptor, 3);
                i4 |= 8;
            }
        }
        charlie.alpha(serialDescriptor);
        return new CreateChallengeResponse(i4, str, str2, i5, i10, null);
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull CreateChallengeResponse value) {
        Intrinsics.echo(encoder, "encoder");
        Intrinsics.echo(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        b charlie = encoder.charlie(serialDescriptor);
        CreateChallengeResponse.write$Self$rememberme_release(value, charlie, serialDescriptor);
        charlie.alpha(serialDescriptor);
    }

    @Override // Nf.ac
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return az.bravo;
    }
}
