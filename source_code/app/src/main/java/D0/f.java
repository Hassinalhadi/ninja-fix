package D0;

import java.util.Comparator;
import s6.AbstractC2769s6;

/* loaded from: classes3.dex */
public final class f implements Comparator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ f(int i4) {
        this.alpha = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                return AbstractC2769s6.bravo(Integer.valueOf(((e) obj).bravo), Integer.valueOf(((e) obj2).bravo));
            default:
                return AbstractC2769s6.bravo(Integer.valueOf(((e) obj).bravo), Integer.valueOf(((e) obj2).bravo));
        }
    }
}
