package t6;

import android.os.SystemClock;
import com.zendesk.service.HttpConstants;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public class d4 implements Closeable, AutoCloseable {
    public static final HashMap white = new HashMap();
    public int alpha;
    public long purple;
    public long red;
    public long silver = 2147483647L;
    public long teal = -2147483648L;

    public d4(String str) {
    }

    public void charlie() {
        this.purple = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j5 = this.purple;
        if (j5 != 0) {
            foxtrot(j5);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }

    public void echo(long j5) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j6 = this.red;
        if (j6 != 0 && elapsedRealtimeNanos - j6 >= 1000000) {
            this.alpha = 0;
            this.purple = 0L;
            this.silver = 2147483647L;
            this.teal = -2147483648L;
        }
        this.red = elapsedRealtimeNanos;
        this.alpha++;
        this.silver = Math.min(this.silver, j5);
        this.teal = Math.max(this.teal, j5);
        if (this.alpha % 50 == 0) {
            Locale locale = Locale.US;
            l4.bravo();
        }
        if (this.alpha % HttpConstants.HTTP_INTERNAL_ERROR == 0) {
            this.alpha = 0;
            this.purple = 0L;
            this.silver = 2147483647L;
            this.teal = -2147483648L;
        }
    }

    public void foxtrot(long j5) {
        echo((SystemClock.elapsedRealtimeNanos() / 1000) - j5);
    }
}
