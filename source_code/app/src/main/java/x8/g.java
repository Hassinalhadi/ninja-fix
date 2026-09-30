package x8;

import C8.p;
import C8.r;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import u8.C3146a;

/* loaded from: classes2.dex */
public abstract class g {
    public static final Pattern alpha = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long alpha(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C3146a.delta().alpha("The content-length value is not a valid number");
            return null;
        }
    }

    public static String bravo(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader != null && (value = firstHeader.getValue()) != null) {
            return value;
        }
        return null;
    }

    public static void charlie(v8.d dVar) {
        if (!((r) dVar.silver.purple).lime()) {
            p pVar = dVar.silver;
            pVar.india();
            r.tango((r) pVar.purple);
        }
        dVar.delta();
    }
}
