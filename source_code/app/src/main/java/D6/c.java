package D6;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes2.dex */
public abstract class c {
    public static final b alpha = new b(0);

    static {
        new Scope(1, Constants.PROFILE);
        new Scope(1, "email");
    }
}
