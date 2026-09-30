package I9;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c {
    public static final ThreadLocal alpha = new ThreadLocal();
    public static final ThreadLocal bravo = new ThreadLocal();
    public static final ThreadLocal charlie = new ThreadLocal();
    public static final ThreadLocal delta = new ThreadLocal();
    public static final ThreadLocal echo = new ThreadLocal();
    public static final ThreadLocal foxtrot = new ThreadLocal();

    public static void alpha() {
        alpha.remove();
        bravo.remove();
        charlie.remove();
        delta.remove();
        echo.remove();
        foxtrot.remove();
    }

    public static Long bravo(String fileLabel) {
        Intrinsics.echo(fileLabel, "fileLabel");
        Map map = (Map) bravo.get();
        if (map != null) {
            return (Long) map.get(fileLabel);
        }
        return null;
    }

    public static void charlie(long j5, String fileLabel) {
        Intrinsics.echo(fileLabel, "fileLabel");
        ThreadLocal threadLocal = charlie;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new LinkedHashMap();
            threadLocal.set(map);
        }
        map.put(fileLabel, Long.valueOf(j5));
    }

    public static void delta(long j5) {
        ThreadLocal threadLocal = echo;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new LinkedHashMap();
            threadLocal.set(map);
        }
        map.put("network_send", Long.valueOf(j5));
    }
}
