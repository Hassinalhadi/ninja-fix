package bv;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class as {
    public static final Object[] alpha = new Object[0];
    public static final ah bravo = new ah(0);

    public static final void alpha(int i4, List list) {
        int size = list.size();
        if (i4 >= 0 && i4 < size) {
            return;
        }
        bw.a.delta("Index " + i4 + " is out of bounds. The list has " + size + " elements.");
        throw null;
    }

    public static final void bravo(int i4, int i5, List list) {
        int size = list.size();
        if (i4 <= i5) {
            if (i4 >= 0) {
                if (i5 <= size) {
                    return;
                }
                bw.a.delta("toIndex (" + i5 + ") is more than than the list size (" + size + ')');
                throw null;
            }
            bw.a.delta("fromIndex (" + i4 + ") is less than 0.");
            throw null;
        }
        bw.a.charlie("Indices are out of order. fromIndex (" + i4 + ") is greater than toIndex (" + i5 + ").");
        throw null;
    }
}
