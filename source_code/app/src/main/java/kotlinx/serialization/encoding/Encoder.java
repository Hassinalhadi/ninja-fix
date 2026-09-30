package kotlinx.serialization.encoding;

import Mf.b;
import com.google.android.gms.measurement.internal.C1473v;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public interface Encoder {
    C1473v bravo();

    b charlie(SerialDescriptor serialDescriptor);

    void delta();

    void echo(double d4);

    void foxtrot(short s3);

    void golf(byte b2);

    void hotel(boolean z2);

    void juliet(float f5);

    void kilo(char c3);

    void lima(SerialDescriptor serialDescriptor, int i4);

    void mike(int i4);

    Encoder november(SerialDescriptor serialDescriptor);

    void oscar(KSerializer kSerializer, Object obj);

    void papa(long j5);

    void romeo(String str);
}
