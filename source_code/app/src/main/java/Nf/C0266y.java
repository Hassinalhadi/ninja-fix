package Nf;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Nf.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0266y implements KSerializer {
    public final /* synthetic */ int alpha = 1;
    public final Object bravo;
    public Object charlie;
    public final Object delta;

    public C0266y(String str, Object objectInstance) {
        Intrinsics.echo(objectInstance, "objectInstance");
        this.bravo = objectInstance;
        this.charlie = CollectionsKt.emptyList();
        this.delta = LazyKt.alpha(kotlin.i.alpha, new Ac.g(17, str, this));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        switch (this.alpha) {
            case 0:
                int foxtrot = decoder.foxtrot(getDescriptor());
                Enum[] enumArr = (Enum[]) this.bravo;
                if (foxtrot >= 0 && foxtrot < enumArr.length) {
                    return enumArr[foxtrot];
                }
                throw new SerializationException(foxtrot + " is not among valid " + getDescriptor().oscar() + " enum values, values size is " + enumArr.length);
            default:
                SerialDescriptor descriptor = getDescriptor();
                Mf.a charlie = decoder.charlie(descriptor);
                int sierra = charlie.sierra(getDescriptor());
                if (sierra == -1) {
                    charlie.alpha(descriptor);
                    return this.bravo;
                }
                throw new SerializationException(ao.ad.zulu(sierra, "Unexpected index "));
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.alpha) {
            case 0:
                return (SerialDescriptor) ((Lazy) this.delta).getValue();
            default:
                return (SerialDescriptor) this.delta.getValue();
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object value) {
        switch (this.alpha) {
            case 0:
                Enum value2 = (Enum) value;
                Intrinsics.echo(value2, "value");
                Enum[] enumArr = (Enum[]) this.bravo;
                int jade = ArraysKt.jade(enumArr, value2);
                if (jade != -1) {
                    encoder.lima(getDescriptor(), jade);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(value2);
                sb2.append(" is not a valid enum ");
                sb2.append(getDescriptor().oscar());
                sb2.append(", must be one of ");
                String arrays = Arrays.toString(enumArr);
                Intrinsics.delta(arrays, "toString(...)");
                sb2.append(arrays);
                throw new SerializationException(sb2.toString());
            default:
                Intrinsics.echo(value, "value");
                encoder.charlie(getDescriptor()).alpha(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().oscar() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0266y(String str, Object objectInstance, Annotation[] annotationArr) {
        this(str, objectInstance);
        Intrinsics.echo(objectInstance, "objectInstance");
        this.charlie = ArraysKt.sierra(annotationArr);
    }

    public C0266y(String str, Enum[] values) {
        Intrinsics.echo(values, "values");
        this.bravo = values;
        this.delta = LazyKt.lazy(new Ac.g(16, this, str));
    }
}
