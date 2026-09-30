package Nf;

import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import s6.AbstractC2707l6;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public final class ar implements KSerializer {
    public final KSerializer alpha;
    public final KSerializer bravo;
    public final /* synthetic */ int charlie;
    public final Lf.g delta;

    public ar(KSerializer kSerializer, KSerializer kSerializer2, byte b2) {
        this.alpha = kSerializer;
        this.bravo = kSerializer2;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object aqVar;
        SerialDescriptor descriptor = getDescriptor();
        Mf.a charlie = decoder.charlie(descriptor);
        KSerializer kSerializer = this.bravo;
        KSerializer kSerializer2 = this.alpha;
        Object obj = az.charlie;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int sierra = charlie.sierra(getDescriptor());
            if (sierra != -1) {
                if (sierra != 0) {
                    if (sierra == 1) {
                        obj3 = charlie.whiskey(getDescriptor(), 1, kSerializer, null);
                    } else {
                        throw new SerializationException(ao.ad.zulu(sierra, "Invalid index: "));
                    }
                } else {
                    obj2 = charlie.whiskey(getDescriptor(), 0, kSerializer2, null);
                }
            } else {
                if (obj2 != obj) {
                    if (obj3 != obj) {
                        switch (this.charlie) {
                            case 0:
                                aqVar = new aq(obj2, obj3);
                                break;
                            default:
                                aqVar = new Pair(obj2, obj3);
                                break;
                        }
                        charlie.alpha(descriptor);
                        return aqVar;
                    }
                    throw new SerializationException("Element 'value' is missing");
                }
                throw new SerializationException("Element 'key' is missing");
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.charlie) {
            case 0:
                return this.delta;
            default:
                return this.delta;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Object key;
        Object value;
        Mf.b charlie = encoder.charlie(getDescriptor());
        SerialDescriptor descriptor = getDescriptor();
        KSerializer kSerializer = this.alpha;
        switch (this.charlie) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.echo(entry, "<this>");
                key = entry.getKey();
                break;
            default:
                Pair pair = (Pair) obj;
                Intrinsics.echo(pair, "<this>");
                key = pair.getFirst();
                break;
        }
        AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) charlie;
        abstractC2796v6.whiskey(descriptor, 0, kSerializer, key);
        SerialDescriptor descriptor2 = getDescriptor();
        KSerializer kSerializer2 = this.bravo;
        switch (this.charlie) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                Intrinsics.echo(entry2, "<this>");
                value = entry2.getValue();
                break;
            default:
                Pair pair2 = (Pair) obj;
                Intrinsics.echo(pair2, "<this>");
                value = pair2.getSecond();
                break;
        }
        abstractC2796v6.whiskey(descriptor2, 1, kSerializer2, value);
        abstractC2796v6.alpha(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ar(final KSerializer kSerializer, final KSerializer kSerializer2, int i4) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.charlie = i4;
        switch (i4) {
            case 1:
                this(kSerializer, kSerializer2, (byte) 0);
                final int i5 = 1;
                this.delta = AbstractC2707l6.bravo("kotlin.Pair", new SerialDescriptor[0], new Function1() { // from class: Nf.ap
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Lf.a buildSerialDescriptor = (Lf.a) obj;
                        switch (i5) {
                            case 0:
                                Intrinsics.echo(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                Lf.a.alpha(buildSerialDescriptor, Constants.KEY_KEY, kSerializer.getDescriptor());
                                Lf.a.alpha(buildSerialDescriptor, "value", kSerializer2.getDescriptor());
                                return Unit.INSTANCE;
                            default:
                                Intrinsics.echo(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                Lf.a.alpha(buildSerialDescriptor, "first", kSerializer.getDescriptor());
                                Lf.a.alpha(buildSerialDescriptor, "second", kSerializer2.getDescriptor());
                                return Unit.INSTANCE;
                        }
                    }
                });
                return;
            default:
                final int i10 = 0;
                this.delta = AbstractC2707l6.charlie("kotlin.collections.Map.Entry", Lf.l.delta, new SerialDescriptor[0], new Function1() { // from class: Nf.ap
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Lf.a buildSerialDescriptor = (Lf.a) obj;
                        switch (i10) {
                            case 0:
                                Intrinsics.echo(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                Lf.a.alpha(buildSerialDescriptor, Constants.KEY_KEY, kSerializer.getDescriptor());
                                Lf.a.alpha(buildSerialDescriptor, "value", kSerializer2.getDescriptor());
                                return Unit.INSTANCE;
                            default:
                                Intrinsics.echo(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                Lf.a.alpha(buildSerialDescriptor, "first", kSerializer.getDescriptor());
                                Lf.a.alpha(buildSerialDescriptor, "second", kSerializer2.getDescriptor());
                                return Unit.INSTANCE;
                        }
                    }
                });
                return;
        }
    }
}
