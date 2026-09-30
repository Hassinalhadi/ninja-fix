package td;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class c {
    public ArrayList alpha;

    public final int alpha(int i4) {
        return ((int[]) this.alpha.get(i4 / 768))[i4 % 768];
    }

    public final void bravo(int i4, int i5) {
        ((int[]) this.alpha.get(i4 / 768))[i4 % 768] = i5;
    }
}
