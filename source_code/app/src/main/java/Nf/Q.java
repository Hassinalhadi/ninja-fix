package Nf;

import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import s6.AbstractC2707l6;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public final class Q implements KSerializer {
    public final KSerializer alpha;
    public final KSerializer bravo;
    public final KSerializer charlie;
    public final Lf.g delta = AbstractC2707l6.bravo("kotlin.Triple", new SerialDescriptor[0], new Aa.l(16, this));

    public Q(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        this.alpha = kSerializer;
        this.bravo = kSerializer2;
        this.charlie = kSerializer3;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Lf.g gVar = this.delta;
        Mf.a charlie = decoder.charlie(gVar);
        KSerializer kSerializer = this.charlie;
        KSerializer kSerializer2 = this.bravo;
        KSerializer kSerializer3 = this.alpha;
        Object obj = az.charlie;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int sierra = charlie.sierra(gVar);
            if (sierra != -1) {
                if (sierra != 0) {
                    if (sierra != 1) {
                        if (sierra == 2) {
                            obj4 = charlie.whiskey(gVar, 2, kSerializer, null);
                        } else {
                            throw new SerializationException(ao.ad.zulu(sierra, "Unexpected index "));
                        }
                    } else {
                        obj3 = charlie.whiskey(gVar, 1, kSerializer2, null);
                    }
                } else {
                    obj2 = charlie.whiskey(gVar, 0, kSerializer3, null);
                }
            } else {
                charlie.alpha(gVar);
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        if (obj4 != obj) {
                            return new Triple(obj2, obj3, obj4);
                        }
                        throw new SerializationException("Element 'third' is missing");
                    }
                    throw new SerializationException("Element 'second' is missing");
                }
                throw new SerializationException("Element 'first' is missing");
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.delta;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Triple value = (Triple) obj;
        Intrinsics.echo(value, "value");
        Lf.g gVar = this.delta;
        AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) encoder.charlie(gVar);
        abstractC2796v6.whiskey(gVar, 0, this.alpha, value.getFirst());
        abstractC2796v6.whiskey(gVar, 1, this.bravo, value.getSecond());
        abstractC2796v6.whiskey(gVar, 2, this.charlie, value.getThird());
        abstractC2796v6.alpha(gVar);
    }
}
