package androidx.recyclerview.widget;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: androidx.recyclerview.widget.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0663h {
    public static final ExecutorC0662g hotel = new ExecutorC0662g();
    public final C0658c alpha;
    public final n0 bravo;
    public List echo;
    public int golf;
    public final CopyOnWriteArrayList delta = new CopyOnWriteArrayList();
    public List foxtrot = Collections.EMPTY_LIST;
    public final ExecutorC0662g charlie = hotel;

    public C0663h(C0658c c0658c, n0 n0Var) {
        this.alpha = c0658c;
        this.bravo = n0Var;
    }

    public final void alpha(List list, Runnable runnable) {
        Iterator it = this.delta.iterator();
        while (it.hasNext()) {
            InterfaceC0661f interfaceC0661f = (InterfaceC0661f) it.next();
            ((ap) interfaceC0661f).alpha.onCurrentListChanged(list, this.foxtrot);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void bravo(List list, Runnable runnable) {
        int i4 = this.golf + 1;
        this.golf = i4;
        List list2 = this.echo;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.foxtrot;
        C0658c c0658c = this.alpha;
        if (list == null) {
            int size = list2.size();
            this.echo = null;
            this.foxtrot = Collections.EMPTY_LIST;
            c0658c.onRemoved(0, size);
            alpha(list3, runnable);
            return;
        }
        if (list2 == null) {
            this.echo = list;
            this.foxtrot = Collections.unmodifiableList(list);
            c0658c.onInserted(0, list.size());
            alpha(list3, runnable);
            return;
        }
        ((ExecutorService) this.bravo.alpha).execute(new androidx.fragment.app.c0(this, list2, list, i4, runnable));
    }
}
