package sd;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public abstract class d {
    public static final e alpha;
    public static final e bravo;

    static {
        String str = Constants.KEY_TEXT;
        new e(str, "*");
        alpha = new e(str, "plain");
        new e(str, "css");
        new e(str, "csv");
        new e(str, Constants.INAPP_HTML_TAG);
        new e(str, "javascript");
        new e(str, "vcard");
        new e(str, "xml");
        bravo = new e(str, "event-stream");
    }
}
