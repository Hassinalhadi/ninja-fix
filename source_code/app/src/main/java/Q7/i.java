package Q7;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class i {
    public static final i charlie = new i(0, 0);
    public final int alpha;
    public final int bravo;

    public i(int i4, int i5) {
        this.alpha = i4;
        this.bravo = i5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.alpha);
        sb2.append(", length = ");
        return P0.cyan(sb2, this.bravo, Constants.AES_SUFFIX);
    }
}
