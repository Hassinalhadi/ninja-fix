package J3;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class af implements r {
    public static final Set bravo = Collections.unmodifiableSet(new HashSet(Arrays.asList(CTVariableUtils.FILE, Constants.KEY_CONTENT, "android.resource")));
    public final Object alpha;

    public af(ae aeVar) {
        this.alpha = aeVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [J3.ae, java.lang.Object] */
    @Override // J3.r
    public final q alpha(Object obj, int i4, int i5, E3.i iVar) {
        Uri uri = (Uri) obj;
        return new q(new X3.d(uri), this.alpha.alpha(uri));
    }

    @Override // J3.r
    public final boolean bravo(Object obj) {
        return bravo.contains(((Uri) obj).getScheme());
    }
}
