package androidx.recyclerview.widget;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public abstract class aq extends az {
    final C0663h mDiffer;
    private final InterfaceC0661f mListener;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, androidx.recyclerview.widget.n0] */
    public aq(AbstractC0677w abstractC0677w) {
        ap apVar = new ap(this);
        this.mListener = apVar;
        C0658c c0658c = new C0658c(this);
        synchronized (AbstractC0659d.alpha) {
            try {
                if (AbstractC0659d.bravo == null) {
                    AbstractC0659d.bravo = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ExecutorService executorService = AbstractC0659d.bravo;
        ?? obj = new Object();
        obj.alpha = executorService;
        obj.bravo = abstractC0677w;
        C0663h c0663h = new C0663h(c0658c, obj);
        this.mDiffer = c0663h;
        c0663h.delta.add(apVar);
    }

    public List<Object> getCurrentList() {
        return this.mDiffer.foxtrot;
    }

    public Object getItem(int i4) {
        return this.mDiffer.foxtrot.get(i4);
    }

    @Override // androidx.recyclerview.widget.az
    public int getItemCount() {
        return this.mDiffer.foxtrot.size();
    }

    public void onCurrentListChanged(List<Object> list, List<Object> list2) {
    }

    public void submitList(List<Object> list) {
        this.mDiffer.bravo(list, null);
    }

    public void submitList(List<Object> list, Runnable runnable) {
        this.mDiffer.bravo(list, runnable);
    }
}
