package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0667l implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ RunnableC0667l(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.red = obj;
        this.purple = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                ArrayList arrayList = (ArrayList) this.purple;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0672q c0672q = (C0672q) it.next();
                    ((r) this.red).animateMoveImpl(c0672q.alpha, c0672q.bravo, c0672q.charlie, c0672q.delta, c0672q.echo);
                }
                arrayList.clear();
                ((r) this.red).mMovesList.remove(arrayList);
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.purple;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    r rVar = (r) this.red;
                    if (hasNext) {
                        rVar.animateChangeImpl((C0671p) it2.next());
                    } else {
                        arrayList2.clear();
                        rVar.mChangesList.remove(arrayList2);
                        return;
                    }
                }
            case 2:
                ArrayList arrayList3 = (ArrayList) this.purple;
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    r rVar2 = (r) this.red;
                    if (hasNext2) {
                        rVar2.animateAddImpl((f0) it3.next());
                    } else {
                        arrayList3.clear();
                        rVar2.mAdditionsList.remove(arrayList3);
                        return;
                    }
                }
            default:
                androidx.fragment.app.c0 c0Var = (androidx.fragment.app.c0) this.red;
                C0663h c0663h = (C0663h) c0Var.white;
                if (c0663h.golf == c0Var.purple) {
                    List list = c0663h.foxtrot;
                    List list2 = c0Var.silver;
                    c0663h.echo = list2;
                    c0663h.foxtrot = Collections.unmodifiableList(list2);
                    ((C0676v) this.purple).alpha(c0663h.alpha);
                    c0663h.alpha(list, (Runnable) c0Var.teal);
                    return;
                }
                return;
        }
    }
}
