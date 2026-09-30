package V5;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import o6.AbstractC2197a;

/* loaded from: classes2.dex */
public final class u extends AbstractC1394y implements w {
    public final boolean magenta() {
        boolean z2;
        Parcel charlie = charlie(ivory(), 7);
        int i4 = AbstractC2197a.alpha;
        if (charlie.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        charlie.recycle();
        return z2;
    }
}
