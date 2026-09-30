package b9;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* renamed from: b9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0739c {
    public static final Charset alpha = Charset.defaultCharset();
    public static final Charset bravo;

    static {
        Charset charset;
        Charset charset2 = null;
        try {
            charset = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        bravo = charset;
        try {
            Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
        }
        try {
            charset2 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset3 = bravo;
        if ((charset3 == null || !charset3.equals(alpha)) && charset2 != null) {
            charset2.equals(alpha);
        }
    }
}
