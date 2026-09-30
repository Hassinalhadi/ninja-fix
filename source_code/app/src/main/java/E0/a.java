package E0;

import android.adservices.measurement.MeasurementManager;
import android.nfc.AvailableNfcAntenna;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ AvailableNfcAntenna kilo(Object obj) {
        return (AvailableNfcAntenna) obj;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder november(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder oscar(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ Class papa() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void tango() {
    }
}
