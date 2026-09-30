package hd;

import java.nio.charset.Charset;
import java.util.Comparator;
import kotlin.Pair;
import s6.AbstractC2769s6;
import s6.Q4;

/* loaded from: classes2.dex */
public final class ac implements Comparator {
    public final /* synthetic */ int alpha;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                return AbstractC2769s6.bravo(Q4.charlie((Charset) obj), Q4.charlie((Charset) obj2));
            default:
                return AbstractC2769s6.bravo((Float) ((Pair) obj2).getSecond(), (Float) ((Pair) obj).getSecond());
        }
    }
}
