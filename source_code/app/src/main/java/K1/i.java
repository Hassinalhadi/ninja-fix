package K1;

import i1.AbstractC1881b;
import java.util.ArrayList;
import java.util.List;
import s6.T7;

/* loaded from: classes3.dex */
public final class i implements Runnable {
    public final /* synthetic */ int alpha;
    public final int purple;
    public final Object red;

    public /* synthetic */ i(Object obj, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.purple = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                ArrayList arrayList = (ArrayList) this.red;
                int size = arrayList.size();
                int i4 = 0;
                if (this.purple != 1) {
                    while (i4 < size) {
                        ((h) arrayList.get(i4)).alpha();
                        i4++;
                    }
                    return;
                } else {
                    while (i4 < size) {
                        ((h) arrayList.get(i4)).bravo();
                        i4++;
                    }
                    return;
                }
            case 1:
                ((T5.r) this.red).india(this.purple);
                return;
            default:
                AbstractC1881b abstractC1881b = (AbstractC1881b) ((com.google.android.material.internal.s) this.red).purple;
                if (abstractC1881b != null) {
                    abstractC1881b.india(this.purple);
                    return;
                }
                return;
        }
    }

    public i(List list, int i4, Throwable th) {
        this.alpha = 0;
        T7.foxtrot(list, "initCallbacks cannot be null");
        this.red = new ArrayList(list);
        this.purple = i4;
    }
}
