package G7;

import Aa.m;
import J2.l;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.W;
import com.google.android.gms.measurement.internal.X;
import com.google.common.collect.f;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class b implements X {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // com.google.android.gms.measurement.internal.X
    public final void alpha(long j5, Bundle bundle, String str, String str2) {
        Object obj = this.bravo;
        switch (this.alpha) {
            case 0:
                l lVar = (l) obj;
                if (((HashSet) lVar.alpha).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    f fVar = a.alpha;
                    String delta = W.delta(str2, W.charlie, W.alpha);
                    if (delta != null) {
                        str2 = delta;
                    }
                    bundle2.putString("events", str2);
                    ((l) lVar.purple).lima(2, bundle2);
                    return;
                }
                return;
            default:
                if (str != null && !a.alpha.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j5);
                    bundle3.putBundle("params", bundle);
                    ((l) ((m) obj).purple).lima(3, bundle3);
                    return;
                }
                return;
        }
    }
}
