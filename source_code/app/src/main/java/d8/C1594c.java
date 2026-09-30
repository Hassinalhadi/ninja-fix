package d8;

import b8.InterfaceC0735e;
import b8.InterfaceC0736f;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: d8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1594c implements InterfaceC0735e {
    public static final SimpleDateFormat alpha;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        alpha = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        ((InterfaceC0736f) obj2).bravo(alpha.format((Date) obj));
    }
}
