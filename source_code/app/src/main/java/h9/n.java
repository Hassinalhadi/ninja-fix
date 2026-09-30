package h9;

import com.incognia.internal.APn;
import com.incognia.internal.MDG;
import com.incognia.internal.cQM;
import com.incognia.internal.e7L;
import com.incognia.internal.rCM;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements APn, e7L {
    public final /* synthetic */ MDG alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ ArrayList red;
    public final /* synthetic */ rCM silver;

    public /* synthetic */ n(MDG mdg, String str, ArrayList arrayList, rCM rcm) {
        this.alpha = mdg;
        this.purple = str;
        this.red = arrayList;
        this.silver = rcm;
    }

    @Override // com.incognia.internal.e7L
    public void b(cQM cqm) {
        MDG.b(this.alpha, this.purple, (List) this.red, this.silver, cqm);
    }

    @Override // com.incognia.internal.APn
    public void onSuccess(Object obj) {
        MDG.b(this.alpha, this.purple, this.red, this.silver, obj);
    }
}
