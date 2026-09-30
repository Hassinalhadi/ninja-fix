package t6;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g4 implements f4 {
    public final ArrayList alpha;

    public g4(Context context, e4 e4Var) {
        ArrayList arrayList = new ArrayList();
        this.alpha = arrayList;
        e4Var.getClass();
        arrayList.add(new i4(context, e4Var));
    }

    @Override // t6.f4
    public final void alpha(com.google.android.material.internal.ab abVar) {
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            ((f4) it.next()).alpha(abVar);
        }
    }
}
