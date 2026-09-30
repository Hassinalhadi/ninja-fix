package Tf;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public interface l extends ao, WritableByteChannel {
    l black(int i4);

    l coral(n nVar);

    l cyan();

    k delta();

    long f(ap apVar);

    @Override // Tf.ao, java.io.Flushable
    void flush();

    l lavender(String str);

    l m(byte[] bArr);

    l ochre(byte[] bArr, int i4, int i5);

    l orange(long j5);

    l romeo();

    l sierra(int i4);

    l tango(int i4);

    l teal(int i4, int i5, String str);

    l xray(int i4);

    l y(long j5);

    OutputStream z();
}
