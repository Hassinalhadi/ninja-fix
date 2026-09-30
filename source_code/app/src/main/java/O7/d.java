package O7;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class d {
    public static final String bravo = f.hotel(UUID.randomUUID().toString() + System.currentTimeMillis());
    public static final AtomicLong charlie = new AtomicLong(0);
    public final String alpha;

    public d() {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte b2 = array[0];
        byte b4 = array[1];
        byte b6 = array[2];
        byte b10 = array[3];
        byte[] alpha = alpha(time % 1000);
        byte b11 = alpha[0];
        byte b12 = alpha[1];
        byte[] alpha2 = alpha(charlie.incrementAndGet());
        byte b13 = alpha2[0];
        byte b14 = alpha2[1];
        byte[] alpha3 = alpha(Integer.valueOf(Process.myPid()).shortValue());
        String echo = f.echo(new byte[]{b2, b4, b6, b10, b11, b12, b13, b14, alpha3[0], alpha3[1]});
        Locale locale = Locale.US;
        this.alpha = String.format(locale, "%s%s%s%s", echo.substring(0, 12), echo.substring(12, 16), echo.subSequence(16, 20), bravo.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] alpha(long j5) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j5);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return this.alpha;
    }
}
