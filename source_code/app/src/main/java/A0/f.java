package A0;

import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class f implements Comparator {
    public static final f purple = new f(0);
    public static final f red = new f(1);
    public static final f silver = new f(2);
    public final /* synthetic */ int alpha;

    public /* synthetic */ f(int i4) {
        this.alpha = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                Z.c hotel = ((s) obj).hotel();
                Z.c hotel2 = ((s) obj2).hotel();
                int compare = Float.compare(hotel.alpha, hotel2.alpha);
                if (compare == 0) {
                    int compare2 = Float.compare(hotel.bravo, hotel2.bravo);
                    if (compare2 == 0) {
                        int compare3 = Float.compare(hotel.delta, hotel2.delta);
                        if (compare3 == 0) {
                            return Float.compare(hotel.charlie, hotel2.charlie);
                        }
                        return compare3;
                    }
                    return compare2;
                }
                return compare;
            case 1:
                Z.c hotel3 = ((s) obj).hotel();
                Z.c hotel4 = ((s) obj2).hotel();
                int compare4 = Float.compare(hotel4.charlie, hotel3.charlie);
                if (compare4 == 0) {
                    int compare5 = Float.compare(hotel3.bravo, hotel4.bravo);
                    if (compare5 == 0) {
                        int compare6 = Float.compare(hotel3.delta, hotel4.delta);
                        if (compare6 == 0) {
                            return Float.compare(hotel4.alpha, hotel3.alpha);
                        }
                        return compare6;
                    }
                    return compare5;
                }
                return compare4;
            default:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int compare7 = Float.compare(((Z.c) pair.getFirst()).bravo, ((Z.c) pair2.getFirst()).bravo);
                if (compare7 == 0) {
                    return Float.compare(((Z.c) pair.getFirst()).delta, ((Z.c) pair2.getFirst()).delta);
                }
                return compare7;
        }
    }
}
