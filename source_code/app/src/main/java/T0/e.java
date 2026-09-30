package T0;

import U0.z;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import k4.C2007a;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n.at;
import n.i0;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2402u;
import q0.ao;
import q0.ap;
import q0.aq;
import q0.ar;
import s0.al;

/* loaded from: classes3.dex */
public final class e implements ap {
    public final /* synthetic */ int alpha;
    public final Object bravo;
    public final Object charlie;

    public /* synthetic */ e(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.bravo = obj;
        this.charlie = obj2;
    }

    @Override // q0.ap
    public final int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
        switch (this.alpha) {
            case 0:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                t tVar = (t) this.bravo;
                ViewGroup.LayoutParams layoutParams = tVar.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                tVar.measure(makeMeasureSpec, j.delta(tVar, 0, i4, layoutParams.height));
                return tVar.getMeasuredWidth();
            case 1:
                return AbstractC2327c.mike(this, interfaceC2402u, list, i4);
            default:
                return AbstractC2327c.mike(this, interfaceC2402u, list, i4);
        }
    }

    @Override // q0.ap
    public final int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
        switch (this.alpha) {
            case 0:
                t tVar = (t) this.bravo;
                ViewGroup.LayoutParams layoutParams = tVar.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                tVar.measure(j.delta(tVar, 0, i4, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return tVar.getMeasuredHeight();
            case 1:
                return AbstractC2327c.juliet(this, interfaceC2402u, list, i4);
            default:
                return AbstractC2327c.juliet(this, interfaceC2402u, list, i4);
        }
    }

    @Override // q0.ap
    public final aq delta(ar arVar, List list, long j5) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List list2;
        int i4;
        int i5;
        Pair pair;
        switch (this.alpha) {
            case 0:
                t tVar = (t) this.bravo;
                int childCount = tVar.getChildCount();
                kotlin.collections.t tVar2 = kotlin.collections.t.alpha;
                if (childCount == 0) {
                    return arVar.papa(Q0.a.juliet(j5), Q0.a.india(j5), tVar2, b.red);
                }
                if (Q0.a.juliet(j5) != 0) {
                    tVar.getChildAt(0).setMinimumWidth(Q0.a.juliet(j5));
                }
                if (Q0.a.india(j5) != 0) {
                    tVar.getChildAt(0).setMinimumHeight(Q0.a.india(j5));
                }
                int juliet = Q0.a.juliet(j5);
                int hotel = Q0.a.hotel(j5);
                ViewGroup.LayoutParams layoutParams = tVar.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                int delta = j.delta(tVar, juliet, hotel, layoutParams.width);
                int india = Q0.a.india(j5);
                int golf = Q0.a.golf(j5);
                ViewGroup.LayoutParams layoutParams2 = tVar.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2);
                tVar.measure(delta, j.delta(tVar, india, golf, layoutParams2.height));
                return arVar.papa(tVar.getMeasuredWidth(), tVar.getMeasuredHeight(), tVar2, new c(tVar, (al) this.charlie, 1));
            case 1:
                ((z) this.bravo).setParentLayoutDirection((Q0.n) this.charlie);
                return arVar.papa(0, 0, kotlin.collections.t.alpha, U0.c.silver);
            default:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = list.get(i10);
                    if (!(((ao) obj).yankee() instanceof i0)) {
                        arrayList3.add(obj);
                    }
                }
                List list3 = (List) ((Function0) this.charlie).invoke();
                if (list3 != null) {
                    ArrayList arrayList4 = new ArrayList(list3.size());
                    int size2 = list3.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Z.c cVar = (Z.c) list3.get(i11);
                        if (cVar != null) {
                            ao aoVar = (ao) arrayList3.get(i11);
                            float f5 = cVar.charlie;
                            float f10 = cVar.alpha;
                            int floor = (int) Math.floor(f5 - f10);
                            float f11 = cVar.delta;
                            float f12 = cVar.bravo;
                            arrayList2 = arrayList3;
                            list2 = list3;
                            AbstractC2367C victor = aoVar.victor(Q0.b.bravo(floor, (int) Math.floor(f11 - f12), 5));
                            int round = Math.round(f10);
                            int round2 = Math.round(f12);
                            i4 = size2;
                            i5 = i11;
                            pair = new Pair(victor, new Q0.k((round2 & 4294967295L) | (round << 32)));
                        } else {
                            arrayList2 = arrayList3;
                            list2 = list3;
                            i4 = size2;
                            i5 = i11;
                            pair = null;
                        }
                        if (pair != null) {
                            arrayList4.add(pair);
                        }
                        i11 = i5 + 1;
                        size2 = i4;
                        arrayList3 = arrayList2;
                        list3 = list2;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList5 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Object obj2 = list.get(i12);
                    if (((ao) obj2).yankee() instanceof i0) {
                        arrayList5.add(obj2);
                    }
                }
                return arVar.papa(Q0.a.hotel(j5), Q0.a.golf(j5), kotlin.collections.t.alpha, new C2007a(4, arrayList, at.november(arrayList5, (Function0) this.bravo)));
        }
    }

    @Override // q0.ap
    public final int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
        switch (this.alpha) {
            case 0:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                t tVar = (t) this.bravo;
                ViewGroup.LayoutParams layoutParams = tVar.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                tVar.measure(makeMeasureSpec, j.delta(tVar, 0, i4, layoutParams.height));
                return tVar.getMeasuredWidth();
            case 1:
                return AbstractC2327c.golf(this, interfaceC2402u, list, i4);
            default:
                return AbstractC2327c.golf(this, interfaceC2402u, list, i4);
        }
    }

    @Override // q0.ap
    public final int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
        switch (this.alpha) {
            case 0:
                t tVar = (t) this.bravo;
                ViewGroup.LayoutParams layoutParams = tVar.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                tVar.measure(j.delta(tVar, 0, i4, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return tVar.getMeasuredHeight();
            case 1:
                return AbstractC2327c.delta(this, interfaceC2402u, list, i4);
            default:
                return AbstractC2327c.delta(this, interfaceC2402u, list, i4);
        }
    }
}
