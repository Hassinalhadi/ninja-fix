package androidx.compose.foundation.lazy.layout;

import java.util.Comparator;
import s6.AbstractC2769s6;

/* loaded from: classes3.dex */
public final class r implements Comparator {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ as purple;

    public /* synthetic */ r(as asVar, int i4) {
        this.alpha = i4;
        this.purple = asVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                Object key = ((aa) obj).getKey();
                as asVar = this.purple;
                return AbstractC2769s6.bravo(Integer.valueOf(asVar.charlie(key)), Integer.valueOf(asVar.charlie(((aa) obj2).getKey())));
            case 1:
                Object key2 = ((aa) obj).getKey();
                as asVar2 = this.purple;
                return AbstractC2769s6.bravo(Integer.valueOf(asVar2.charlie(key2)), Integer.valueOf(asVar2.charlie(((aa) obj2).getKey())));
            case 2:
                Object key3 = ((aa) obj2).getKey();
                as asVar3 = this.purple;
                return AbstractC2769s6.bravo(Integer.valueOf(asVar3.charlie(key3)), Integer.valueOf(asVar3.charlie(((aa) obj).getKey())));
            default:
                Object key4 = ((aa) obj2).getKey();
                as asVar4 = this.purple;
                return AbstractC2769s6.bravo(Integer.valueOf(asVar4.charlie(key4)), Integer.valueOf(asVar4.charlie(((aa) obj).getKey())));
        }
    }
}
