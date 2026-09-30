package f1;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;

/* loaded from: classes3.dex */
public final class j implements Window$OnFrameMetricsAvailableListener {
    public final /* synthetic */ k alpha;

    public j(k kVar) {
        this.alpha = kVar;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i4) {
        k kVar = this.alpha;
        if ((kVar.red & 1) != 0) {
            SparseIntArray sparseIntArray = kVar.silver[0];
            long metric = frameMetrics.getMetric(8);
            if (sparseIntArray != null) {
                int i5 = (int) ((500000 + metric) / 1000000);
                if (metric >= 0) {
                    sparseIntArray.put(i5, sparseIntArray.get(i5) + 1);
                }
            }
        }
        int i10 = this.alpha.red;
    }
}
