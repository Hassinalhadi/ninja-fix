package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class u {
    public static final Charset alpha;
    public static final byte[] bravo;

    static {
        Charset.forName("US-ASCII");
        alpha = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        bravo = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static void alpha(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static int bravo(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }
}
