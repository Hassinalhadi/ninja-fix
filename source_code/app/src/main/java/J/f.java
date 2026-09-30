package J;

import androidx.appcompat.widget.P0;
import av.q;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class f {
    public static final void alpha(int i4, List list) {
        int size = list.size();
        if (i4 >= 0 && i4 < size) {
            return;
        }
        charlie(i4, size);
    }

    public static final void bravo(int i4, int i5, List list) {
        if (i4 > i5) {
            foxtrot(i4, i5);
        }
        if (i4 < 0) {
            delta(i4);
        }
        if (i5 > list.size()) {
            echo(i5, list.size());
        }
    }

    private static final void charlie(int i4, int i5) {
        throw new IndexOutOfBoundsException(P0.azure(i4, i5, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void delta(int i4) {
        throw new IndexOutOfBoundsException(q.delta(i4, "fromIndex (", ") is less than 0."));
    }

    private static final void echo(int i4, int i5) {
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is more than than the list size (" + i5 + ')');
    }

    private static final void foxtrot(int i4, int i5) {
        throw new IllegalArgumentException(P0.azure(i4, i5, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
