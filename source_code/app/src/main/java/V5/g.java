package V5;

import android.util.Log;

/* loaded from: classes2.dex */
public final class g {
    public final String alpha;
    public final String bravo;

    public g(String str, String str2) {
        x.charlie(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.alpha = str;
        this.bravo = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public final void alpha(String str) {
        if (Log.isLoggable(this.alpha, 4)) {
            Log.i("AutoZoom", bravo(str));
        }
    }

    public final String bravo(String str) {
        String str2 = this.bravo;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }
}
