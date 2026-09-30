package s6;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import t6.AbstractC3003i;

/* loaded from: classes2.dex */
public abstract class L4 {
    public static V0.k alpha(vf.ah ahVar) {
        return AbstractC3003i.alpha(new a4.u(24, ahVar));
    }

    public static boolean bravo(Uri uri) {
        if (uri != null && Constants.KEY_CONTENT.equals(uri.getScheme()) && Constants.KEY_MEDIA.equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }
}
