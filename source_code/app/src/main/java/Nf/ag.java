package Nf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class ag implements ac {
    public final /* synthetic */ KSerializer alpha;

    public ag(KSerializer kSerializer) {
        this.alpha = kSerializer;
    }

    @Override // Nf.ac
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{this.alpha};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        throw new IllegalStateException("unsupported");
    }

    @Override // Nf.ac
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return az.bravo;
    }
}
