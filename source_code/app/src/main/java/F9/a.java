package F9;

import java.util.Arrays;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes2.dex */
public final class a {
    public static final String alpha(long j5) {
        if (j5 >= 1048576) {
            return String.format("%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1048576.0d)}, 1));
        }
        if (j5 >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return String.format("%.2f KB", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1024.0d)}, 1));
        }
        return j5 + " bytes";
    }
}
