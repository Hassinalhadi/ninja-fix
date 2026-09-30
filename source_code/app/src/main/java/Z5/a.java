package Z5;

import com.google.android.gms.common.Feature;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Comparator {
    public static final /* synthetic */ a alpha = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        if (!feature.alpha.equals(feature2.alpha)) {
            return feature.alpha.compareTo(feature2.alpha);
        }
        return (feature.o() > feature2.o() ? 1 : (feature.o() == feature2.o() ? 0 : -1));
    }
}
