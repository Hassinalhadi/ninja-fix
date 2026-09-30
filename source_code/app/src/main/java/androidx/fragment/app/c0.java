package androidx.fragment.app;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0659d;
import androidx.recyclerview.widget.C0660e;
import androidx.recyclerview.widget.C0663h;
import androidx.recyclerview.widget.RunnableC0667l;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class c0 implements Runnable {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ int purple;
    public final /* synthetic */ List red;
    public final /* synthetic */ List silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public c0(int i4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.purple = i4;
        this.red = arrayList;
        this.silver = arrayList2;
        this.teal = arrayList3;
        this.white = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.white;
        switch (this.alpha) {
            case 0:
                for (int i4 = 0; i4 < this.purple; i4++) {
                    View view = (View) ((ArrayList) this.red).get(i4);
                    String str = (String) ((ArrayList) this.silver).get(i4);
                    WeakHashMap weakHashMap = s1.au.alpha;
                    s1.al.mike(view, str);
                    s1.al.mike((View) ((ArrayList) this.teal).get(i4), (String) ((ArrayList) obj).get(i4));
                }
                return;
            default:
                ((C0663h) obj).charlie.execute(new RunnableC0667l(3, this, AbstractC0659d.alpha(new C0660e(this))));
                return;
        }
    }

    public c0(C0663h c0663h, List list, List list2, int i4, Runnable runnable) {
        this.white = c0663h;
        this.red = list;
        this.silver = list2;
        this.purple = i4;
        this.teal = runnable;
    }
}
