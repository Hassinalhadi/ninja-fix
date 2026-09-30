package j8;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: j8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1951h {
    public static final byte alpha = Byte.parseByte("01110000", 2);
    public static final byte bravo = Byte.parseByte("00001111", 2);

    public static String alpha() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b2 = array[0];
        array[16] = b2;
        array[0] = (byte) ((b2 & bravo) | alpha);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
