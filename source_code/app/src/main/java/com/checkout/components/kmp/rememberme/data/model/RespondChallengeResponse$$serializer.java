package com.checkout.components.kmp.rememberme.data.model;

import Mf.a;
import Mf.b;
import Nf.B;
import Nf.C0249g;
import Nf.P;
import Nf.ac;
import Nf.az;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2644e6;

@c
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/checkout/components/kmp/rememberme/data/model/RespondChallengeResponse.$serializer", "LNf/ac;", "Lcom/checkout/components/kmp/rememberme/data/model/RespondChallengeResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/checkout/components/kmp/rememberme/data/model/RespondChallengeResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/checkout/components/kmp/rememberme/data/model/RespondChallengeResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* synthetic */ class RespondChallengeResponse$$serializer implements ac {
    public static final int $stable;

    @NotNull
    public static final RespondChallengeResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RespondChallengeResponse$$serializer respondChallengeResponse$$serializer = new RespondChallengeResponse$$serializer();
        INSTANCE = respondChallengeResponse$$serializer;
        $stable = 8;
        B b2 = new B("com.checkout.components.kmp.rememberme.data.model.RespondChallengeResponse", respondChallengeResponse$$serializer, 3);
        b2.bravo("challenge", false);
        b2.bravo(RedirectionConstants.REDIRECT_SUCCESS_VALUE, false);
        b2.bravo("client_token", false);
        descriptor = b2;
    }

    private RespondChallengeResponse$$serializer() {
    }

    @Override // Nf.ac
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{CreateChallengeResponse$$serializer.INSTANCE, C0249g.alpha, AbstractC2644e6.bravo(P.alpha)};
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public final RespondChallengeResponse deserialize(@NotNull Decoder decoder) {
        Intrinsics.echo(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a charlie = decoder.charlie(serialDescriptor);
        int i4 = 0;
        boolean z2 = false;
        CreateChallengeResponse createChallengeResponse = null;
        String str = null;
        boolean z10 = true;
        while (z10) {
            int sierra = charlie.sierra(serialDescriptor);
            if (sierra == -1) {
                z10 = false;
            } else if (sierra == 0) {
                createChallengeResponse = (CreateChallengeResponse) charlie.whiskey(serialDescriptor, 0, CreateChallengeResponse$$serializer.INSTANCE, createChallengeResponse);
                i4 |= 1;
            } else if (sierra == 1) {
                z2 = charlie.oscar(serialDescriptor, 1);
                i4 |= 2;
            } else {
                if (sierra != 2) {
                    throw new UnknownFieldException(sierra);
                }
                P p4 = P.alpha;
                str = (String) charlie.uniform(serialDescriptor, str);
                i4 |= 4;
            }
        }
        charlie.alpha(serialDescriptor);
        return new RespondChallengeResponse(i4, createChallengeResponse, z2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull RespondChallengeResponse value) {
        Intrinsics.echo(encoder, "encoder");
        Intrinsics.echo(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        b charlie = encoder.charlie(serialDescriptor);
        RespondChallengeResponse.write$Self$rememberme_release(value, charlie, serialDescriptor);
        charlie.alpha(serialDescriptor);
    }

    @Override // Nf.ac
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return az.bravo;
    }
}
