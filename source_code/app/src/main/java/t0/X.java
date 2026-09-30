package t0;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class X implements Comparator {
    public final h9.aq alpha;
    public final bv.al purple;
    public final bv.am red;
    public final bv.al silver;
    public final bv.ag teal;

    public X(h9.aq aqVar) {
        this.alpha = aqVar;
        long[] jArr = bv.au.alpha;
        this.purple = new bv.al();
        bv.am amVar = bv.av.alpha;
        this.red = new bv.am();
        this.silver = new bv.al();
        bv.ag agVar = bv.aq.alpha;
        this.teal = new bv.ag();
    }

    public final void alpha(ArrayList arrayList, ViewGroup viewGroup) {
        bv.ag agVar;
        View view;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            agVar = this.teal;
            if (i4 >= size) {
                break;
            }
            agVar.hotel(i4, (View) arrayList.get(i4));
            i4++;
        }
        int size2 = arrayList.size() - 1;
        bv.am amVar = this.red;
        bv.al alVar = this.purple;
        if (size2 >= 0) {
            while (true) {
                int i5 = size2 - 1;
                View view2 = (View) arrayList.get(size2);
                h9.aq aqVar = this.alpha;
                int nextFocusForwardId = view2.getNextFocusForwardId();
                ((Y) aqVar.purple).getClass();
                if (nextFocusForwardId != 0 && nextFocusForwardId != -1) {
                    view = W.alpha(2, view2, viewGroup);
                } else {
                    view = null;
                }
                if (view != null && agVar.delta(view) >= 0) {
                    alVar.mike(view2, view);
                    amVar.alpha(view);
                }
                if (i5 < 0) {
                    break;
                } else {
                    size2 = i5;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i10 = size3 - 1;
            View view3 = (View) arrayList.get(size3);
            if (((View) alVar.golf(view3)) != null && !amVar.charlie(view3)) {
                View view4 = view3;
                while (view3 != null) {
                    bv.al alVar2 = this.silver;
                    View view5 = (View) alVar2.golf(view3);
                    if (view5 != null) {
                        if (view5 == view4) {
                            break;
                        }
                        view3 = view4;
                        view4 = view5;
                    }
                    alVar2.mike(view3, view4);
                    view3 = (View) alVar.golf(view3);
                }
            }
            if (i10 >= 0) {
                size3 = i10;
            } else {
                return;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view != view2) {
            if (view != null) {
                if (view2 != null) {
                    bv.al alVar = this.silver;
                    View view3 = (View) alVar.golf(view);
                    View view4 = (View) alVar.golf(view2);
                    if (view3 == view4 && view3 != null) {
                        if (view != view3) {
                            if (view2 != view3 && this.purple.golf(view) != null) {
                                return -1;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    if (view3 != null) {
                        view = view3;
                    }
                    if (view4 != null) {
                        view2 = view4;
                    }
                    if (view3 == null && view4 == null) {
                        return 0;
                    }
                    bv.ag agVar = this.teal;
                    if (agVar.echo(view) < agVar.echo(view2)) {
                        return -1;
                    }
                    return 1;
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }
}
