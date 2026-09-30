package W2;

import com.clevertap.android.sdk.network.api.CtApi;
import kotlin.text.r;
import okhttp3.Headers;

/* loaded from: classes3.dex */
public abstract class c {
    public static Headers alpha(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i4 = 0; i4 < size; i4++) {
            String name = headers.name(i4);
            String value = headers.value(i4);
            if ((!"Warning".equalsIgnoreCase(name) || !r.quebec(value, "1", false)) && ("Content-Length".equalsIgnoreCase(name) || "Content-Encoding".equalsIgnoreCase(name) || CtApi.HEADER_CONTENT_TYPE.equalsIgnoreCase(name) || !bravo(name) || headers2.get(name) == null)) {
                builder.addUnsafeNonAscii(name, value);
            }
        }
        int size2 = headers2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            String name2 = headers2.name(i5);
            if (!"Content-Length".equalsIgnoreCase(name2) && !"Content-Encoding".equalsIgnoreCase(name2) && !CtApi.HEADER_CONTENT_TYPE.equalsIgnoreCase(name2) && bravo(name2)) {
                builder.addUnsafeNonAscii(name2, headers2.value(i5));
            }
        }
        return builder.build();
    }

    public static boolean bravo(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }
}
