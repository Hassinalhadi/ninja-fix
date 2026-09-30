package Oe;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class k extends j implements w {
    public i purple = i.charlie;
    public boolean red;

    public final void juliet(l lVar) {
        ab abVar;
        if (!this.red) {
            this.purple = this.purple.clone();
            this.red = true;
        }
        i iVar = this.purple;
        i iVar2 = lVar.alpha;
        iVar.getClass();
        int i4 = 0;
        while (true) {
            int size = iVar2.alpha.purple.size();
            abVar = iVar2.alpha;
            if (i4 >= size) {
                break;
            }
            iVar.golf((Map.Entry) abVar.purple.get(i4));
            i4++;
        }
        Iterator it = abVar.charlie().iterator();
        while (it.hasNext()) {
            iVar.golf((Map.Entry) it.next());
        }
    }
}
