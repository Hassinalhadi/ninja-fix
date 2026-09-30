package T5;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s {
    public final b alpha;
    public final Feature bravo;

    public /* synthetic */ s(b bVar, Feature feature) {
        this.alpha = bVar;
        this.bravo = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof s)) {
            s sVar = (s) obj;
            if (V5.x.lima(this.alpha, sVar.alpha) && V5.x.lima(this.bravo, sVar.bravo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha, this.bravo});
    }

    public final String toString() {
        J2.e eVar = new J2.e(this);
        eVar.y(this.alpha, Constants.KEY_KEY);
        eVar.y(this.bravo, "feature");
        return eVar.toString();
    }
}
