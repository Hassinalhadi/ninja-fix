package Nf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class aw implements KSerializer {
    public final KSerializer alpha;
    public final J bravo;

    public aw(KSerializer kSerializer) {
        this.alpha = kSerializer;
        this.bravo = new J(kSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        if (decoder.quebec()) {
            return decoder.tango(this.alpha);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aw.class == obj.getClass() && Intrinsics.areEqual(this.alpha, ((aw) obj).alpha)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.bravo;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        if (obj != null) {
            encoder.oscar(this.alpha, obj);
        } else {
            encoder.delta();
        }
    }
}
