package x2;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ac implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public z alpha;
    public ViewGroup purple;

    /* JADX WARN: Removed duplicated region for block: B:114:0x01f6 A[EDGE_INSN: B:114:0x01f6->B:115:0x01f6 BREAK  A[LOOP:1: B:15:0x0088->B:27:0x01ec], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        z zVar;
        int i4;
        J2.i iVar;
        bv.e eVar;
        bv.e eVar2;
        int i5;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        t tVar;
        View view;
        J2.i iVar2;
        boolean z2;
        ai aiVar;
        View view2;
        View view3;
        J2.i iVar3;
        boolean z10;
        ViewGroup viewGroup = this.purple;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = ad.charlie;
        ViewGroup viewGroup2 = this.purple;
        boolean z11 = true;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        bv.e bravo = ad.bravo();
        ArrayList arrayList3 = (ArrayList) bravo.get(viewGroup2);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            bravo.put(viewGroup2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            zVar = this.alpha;
            arrayList3.add(zVar);
            zVar.alpha(new ab(this, bravo));
            i4 = 0;
            zVar.hotel(viewGroup2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((z) it.next()).black(viewGroup2);
                }
            }
            zVar.f14079d = new ArrayList();
            zVar.e = new ArrayList();
            iVar = zVar.yellow;
            J2.i iVar4 = zVar.f14076a;
            eVar = new bv.e((bv.e) iVar.alpha);
            eVar2 = new bv.e((bv.e) iVar4.alpha);
            i5 = 0;
            while (true) {
                iArr = zVar.f14078c;
                if (i5 < iArr.length) {
                    break;
                }
                int i13 = iArr[i5];
                if (i13 != z11) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                iVar2 = iVar;
                                z2 = z11;
                            } else {
                                bv.u uVar = (bv.u) iVar.red;
                                int juliet = uVar.juliet();
                                int i14 = i4;
                                while (i14 < juliet) {
                                    View view4 = (View) uVar.kilo(i14);
                                    if (view4 != null && zVar.whiskey(view4)) {
                                        iVar3 = iVar;
                                        View view5 = (View) ((bv.u) iVar4.red).delta(uVar.golf(i14));
                                        if (view5 != null && zVar.whiskey(view5)) {
                                            ai aiVar2 = (ai) eVar.get(view4);
                                            ai aiVar3 = (ai) eVar2.get(view5);
                                            if (aiVar2 != null && aiVar3 != null) {
                                                z10 = z11;
                                                zVar.f14079d.add(aiVar2);
                                                zVar.e.add(aiVar3);
                                                eVar.remove(view4);
                                                eVar2.remove(view5);
                                                i14++;
                                                iVar = iVar3;
                                                z11 = z10;
                                            }
                                        }
                                    } else {
                                        iVar3 = iVar;
                                    }
                                    z10 = z11;
                                    i14++;
                                    iVar = iVar3;
                                    z11 = z10;
                                }
                                z2 = z11;
                                iVar2 = iVar;
                            }
                        } else {
                            iVar2 = iVar;
                            z2 = z11;
                            SparseArray sparseArray = (SparseArray) iVar2.purple;
                            SparseArray sparseArray2 = (SparseArray) iVar4.purple;
                            int size = sparseArray.size();
                            for (int i15 = 0; i15 < size; i15++) {
                                View view6 = (View) sparseArray.valueAt(i15);
                                if (view6 != null && zVar.whiskey(view6) && (view3 = (View) sparseArray2.get(sparseArray.keyAt(i15))) != null && zVar.whiskey(view3)) {
                                    ai aiVar4 = (ai) eVar.get(view6);
                                    ai aiVar5 = (ai) eVar2.get(view3);
                                    if (aiVar4 != null && aiVar5 != null) {
                                        zVar.f14079d.add(aiVar4);
                                        zVar.e.add(aiVar5);
                                        eVar.remove(view6);
                                        eVar2.remove(view3);
                                    }
                                }
                            }
                        }
                    } else {
                        iVar2 = iVar;
                        z2 = z11;
                        bv.e eVar3 = (bv.e) iVar2.silver;
                        bv.e eVar4 = (bv.e) iVar4.silver;
                        int i16 = eVar3.red;
                        for (int i17 = 0; i17 < i16; i17++) {
                            View view7 = (View) eVar3.juliet(i17);
                            if (view7 != null && zVar.whiskey(view7) && (view2 = (View) eVar4.get(eVar3.foxtrot(i17))) != null && zVar.whiskey(view2)) {
                                ai aiVar6 = (ai) eVar.get(view7);
                                ai aiVar7 = (ai) eVar2.get(view2);
                                if (aiVar6 != null && aiVar7 != null) {
                                    zVar.f14079d.add(aiVar6);
                                    zVar.e.add(aiVar7);
                                    eVar.remove(view7);
                                    eVar2.remove(view2);
                                }
                            }
                        }
                    }
                } else {
                    iVar2 = iVar;
                    z2 = z11;
                    for (int i18 = eVar.red - 1; i18 >= 0; i18--) {
                        View view8 = (View) eVar.foxtrot(i18);
                        if (view8 != null && zVar.whiskey(view8) && (aiVar = (ai) eVar2.remove(view8)) != null && zVar.whiskey(aiVar.bravo)) {
                            zVar.f14079d.add((ai) eVar.hotel(i18));
                            zVar.e.add(aiVar);
                        }
                    }
                }
                i5++;
                iVar = iVar2;
                z11 = z2;
                i4 = 0;
            }
            boolean z12 = z11;
            for (i10 = 0; i10 < eVar.red; i10++) {
                ai aiVar8 = (ai) eVar.juliet(i10);
                if (zVar.whiskey(aiVar8.bravo)) {
                    zVar.f14079d.add(aiVar8);
                    zVar.e.add(null);
                }
            }
            for (i11 = 0; i11 < eVar2.red; i11++) {
                ai aiVar9 = (ai) eVar2.juliet(i11);
                if (zVar.whiskey(aiVar9.bravo)) {
                    zVar.e.add(aiVar9);
                    zVar.f14079d.add(null);
                }
            }
            bv.e quebec = z.quebec();
            int i19 = quebec.red;
            WindowId windowId = viewGroup2.getWindowId();
            i12 = i19 - 1;
            while (i12 >= 0) {
                Animator animator = (Animator) quebec.foxtrot(i12);
                if (animator != null && (tVar = (t) quebec.get(animator)) != null && (view = tVar.alpha) != null && windowId.equals(tVar.delta)) {
                    boolean z13 = z12;
                    ai sierra = zVar.sierra(view, z13);
                    ai oscar = zVar.oscar(view, z13);
                    if (sierra == null && oscar == null) {
                        oscar = (ai) ((bv.e) zVar.f14076a.alpha).get(view);
                    }
                    if (sierra != null || oscar != null) {
                        ai aiVar10 = tVar.charlie;
                        z zVar2 = tVar.echo;
                        if (zVar2.victor(aiVar10, oscar)) {
                            if (zVar2.papa().f14093s != null) {
                                animator.cancel();
                                ArrayList arrayList4 = zVar2.f14081g;
                                arrayList4.remove(animator);
                                quebec.remove(animator);
                                if (arrayList4.size() == 0) {
                                    zVar2.yankee(zVar2, y.olive, false);
                                    if (!zVar2.f14085k) {
                                        zVar2.f14085k = true;
                                        zVar2.yankee(zVar2, y.ochre, false);
                                    }
                                }
                            } else if (!animator.isRunning() && !animator.isStarted()) {
                                quebec.remove(animator);
                            } else {
                                animator.cancel();
                            }
                            i12--;
                            z12 = true;
                        }
                    }
                }
                i12--;
                z12 = true;
            }
            zVar.lima(viewGroup2, zVar.yellow, zVar.f14076a, zVar.f14079d, zVar.e);
            if (zVar.f14093s != null) {
                zVar.blue();
                return true;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                zVar.amber();
                w wVar = zVar.f14093s;
                af afVar = wVar.golf;
                long j5 = 0;
                if (afVar.f14092r == 0) {
                    j5 = 1;
                }
                afVar.bronze(j5, wVar.alpha);
                wVar.alpha = j5;
                zVar.f14093s.bravo = true;
                return true;
            }
            return true;
        }
        arrayList = null;
        zVar = this.alpha;
        arrayList3.add(zVar);
        zVar.alpha(new ab(this, bravo));
        i4 = 0;
        zVar.hotel(viewGroup2, false);
        if (arrayList != null) {
        }
        zVar.f14079d = new ArrayList();
        zVar.e = new ArrayList();
        iVar = zVar.yellow;
        J2.i iVar42 = zVar.f14076a;
        eVar = new bv.e((bv.e) iVar.alpha);
        eVar2 = new bv.e((bv.e) iVar42.alpha);
        i5 = 0;
        while (true) {
            iArr = zVar.f14078c;
            if (i5 < iArr.length) {
            }
            i5++;
            iVar = iVar2;
            z11 = z2;
            i4 = 0;
        }
        boolean z122 = z11;
        while (i10 < eVar.red) {
        }
        while (i11 < eVar2.red) {
        }
        bv.e quebec2 = z.quebec();
        int i192 = quebec2.red;
        WindowId windowId2 = viewGroup2.getWindowId();
        i12 = i192 - 1;
        while (i12 >= 0) {
        }
        zVar.lima(viewGroup2, zVar.yellow, zVar.f14076a, zVar.f14079d, zVar.e);
        if (zVar.f14093s != null) {
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.purple;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = ad.charlie;
        ViewGroup viewGroup2 = this.purple;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) ad.bravo().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((z) it.next()).black(viewGroup2);
            }
        }
        this.alpha.india(true);
    }
}
