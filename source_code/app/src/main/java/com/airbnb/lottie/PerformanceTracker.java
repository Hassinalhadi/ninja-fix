package com.airbnb.lottie;

import android.util.Log;
import com.airbnb.lottie.utils.MeanCalculator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r1.C2483b;

/* loaded from: classes3.dex */
public class PerformanceTracker {
    private boolean enabled = false;
    private final Set<FrameListener> frameListeners = new bv.f(0);
    private final Map<String, MeanCalculator> layerRenderTimes = new HashMap();
    private final Comparator<C2483b> floatComparator = new Comparator<C2483b>() { // from class: com.airbnb.lottie.PerformanceTracker.1
        @Override // java.util.Comparator
        public int compare(C2483b c2483b, C2483b c2483b2) {
            float floatValue = ((Float) c2483b.bravo).floatValue();
            float floatValue2 = ((Float) c2483b2.bravo).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };

    /* loaded from: classes3.dex */
    public interface FrameListener {
        void onFrameRendered(float f5);
    }

    public void addFrameListener(FrameListener frameListener) {
        this.frameListeners.add(frameListener);
    }

    public void clearRenderTimes() {
        this.layerRenderTimes.clear();
    }

    public List<C2483b> getSortedRenderTimes() {
        if (!this.enabled) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.layerRenderTimes.size());
        for (Map.Entry<String, MeanCalculator> entry : this.layerRenderTimes.entrySet()) {
            arrayList.add(new C2483b(entry.getKey(), Float.valueOf(entry.getValue().getMean())));
        }
        Collections.sort(arrayList, this.floatComparator);
        return arrayList;
    }

    public void logRenderTimes() {
        if (this.enabled) {
            List<C2483b> sortedRenderTimes = getSortedRenderTimes();
            Log.d(L.TAG, "Render times:");
            for (int i4 = 0; i4 < sortedRenderTimes.size(); i4++) {
                C2483b c2483b = sortedRenderTimes.get(i4);
                Log.d(L.TAG, String.format("\t\t%30s:%.2f", c2483b.alpha, c2483b.bravo));
            }
        }
    }

    public void recordRenderTime(String str, float f5) {
        if (this.enabled) {
            MeanCalculator meanCalculator = this.layerRenderTimes.get(str);
            if (meanCalculator == null) {
                meanCalculator = new MeanCalculator();
                this.layerRenderTimes.put(str, meanCalculator);
            }
            meanCalculator.add(f5);
            if (str.equals("__container")) {
                Iterator<FrameListener> it = this.frameListeners.iterator();
                while (it.hasNext()) {
                    it.next().onFrameRendered(f5);
                }
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        this.frameListeners.remove(frameListener);
    }

    public void setEnabled(boolean z2) {
        this.enabled = z2;
    }
}
