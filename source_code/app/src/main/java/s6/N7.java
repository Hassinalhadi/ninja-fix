package s6;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class N7 implements M7 {
    public final ArrayList alpha;

    public N7(Context context, K7 k72) {
        ArrayList arrayList = new ArrayList();
        this.alpha = arrayList;
        k72.getClass();
        arrayList.add(new S7(context, k72));
    }

    @Override // s6.M7
    public final void alpha(L7 l72) {
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            ((M7) it.next()).alpha(l72);
        }
    }
}
