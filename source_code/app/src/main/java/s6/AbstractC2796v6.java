package s6;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: s6.v6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2796v6 implements Encoder, Mf.b {
    public static final /* synthetic */ int alpha = 0;

    public void alpha(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Mf.b charlie(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void echo(double d4) {
        yankee(Double.valueOf(d4));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void foxtrot(short s3) {
        yankee(Short.valueOf(s3));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void golf(byte b2) {
        yankee(Byte.valueOf(b2));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void hotel(boolean z2) {
        yankee(Boolean.valueOf(z2));
    }

    public void india(Object obj, SerialDescriptor serialDescriptor) {
        Nf.P p4 = Nf.P.alpha;
        tango(serialDescriptor, 2);
        Nf.P.bravo.getClass();
        if (obj == null) {
            delta();
        } else {
            oscar(p4, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void juliet(float f5) {
        yankee(Float.valueOf(f5));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void kilo(char c3) {
        yankee(Character.valueOf(c3));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void lima(SerialDescriptor enumDescriptor, int i4) {
        Intrinsics.echo(enumDescriptor, "enumDescriptor");
        yankee(Integer.valueOf(i4));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void mike(int i4) {
        yankee(Integer.valueOf(i4));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract Encoder november(SerialDescriptor serialDescriptor);

    @Override // kotlinx.serialization.encoding.Encoder
    public abstract void oscar(KSerializer kSerializer, Object obj);

    @Override // kotlinx.serialization.encoding.Encoder
    public void papa(long j5) {
        yankee(Long.valueOf(j5));
    }

    public boolean quebec(SerialDescriptor serialDescriptor) {
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void romeo(String value) {
        Intrinsics.echo(value, "value");
        yankee(value);
    }

    public Mf.b sierra(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        return charlie(descriptor);
    }

    public abstract void tango(SerialDescriptor serialDescriptor, int i4);

    public Encoder uniform(Nf.E descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        tango(descriptor, i4);
        return november(descriptor.uniform(i4));
    }

    public void victor(int i4, int i5, SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        tango(descriptor, i4);
        mike(i5);
    }

    public void whiskey(SerialDescriptor descriptor, int i4, KSerializer serializer, Object obj) {
        Intrinsics.echo(descriptor, "descriptor");
        Intrinsics.echo(serializer, "serializer");
        tango(descriptor, i4);
        oscar(serializer, obj);
    }

    public void xray(SerialDescriptor descriptor, int i4, String value) {
        Intrinsics.echo(descriptor, "descriptor");
        Intrinsics.echo(value, "value");
        tango(descriptor, i4);
        romeo(value);
    }

    public void yankee(Object value) {
        Intrinsics.echo(value, "value");
        StringBuilder sb2 = new StringBuilder("Non-serializable ");
        Class<?> cls = value.getClass();
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        sb2.append(vVar.bravo(cls));
        sb2.append(" is not supported by ");
        sb2.append(vVar.bravo(getClass()));
        sb2.append(" encoder");
        throw new SerializationException(sb2.toString());
    }
}
