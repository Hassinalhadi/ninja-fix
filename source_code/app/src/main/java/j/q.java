package j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class q {
    public final int alpha;
    public final List bravo;

    public q(int i4, List list) {
        this.alpha = i4;
        this.bravo = list;
    }

    public q() {
        this.alpha = 1;
        this.bravo = Collections.singletonList(null);
    }

    public q(ArrayList arrayList) {
        this.alpha = 0;
        this.bravo = arrayList;
    }
}
