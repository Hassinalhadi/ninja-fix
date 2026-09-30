package com.google.android.material.bottomsheet;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import ao.ad;
import com.google.android.material.sidesheet.SideSheetBehavior;
import h7.C1816a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import t6.A3;

/* loaded from: classes2.dex */
public final class b extends A3 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ androidx.coordinatorlayout.widget.c bravo;

    public /* synthetic */ b(androidx.coordinatorlayout.widget.c cVar, int i4) {
        this.alpha = i4;
        this.bravo = cVar;
    }

    @Override // t6.A3
    public final int alpha(int i4, View view) {
        int i5;
        int i10;
        switch (this.alpha) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.bravo;
                C1816a c1816a = sideSheetBehavior.alpha;
                switch (c1816a.alpha) {
                    case 0:
                        i5 = -c1816a.bravo.e;
                        break;
                    default:
                        i5 = c1816a.alpha();
                        break;
                }
                C1816a c1816a2 = sideSheetBehavior.alpha;
                switch (c1816a2.alpha) {
                    case 0:
                        i10 = c1816a2.bravo.f8110h;
                        break;
                    default:
                        i10 = c1816a2.bravo.f8108f;
                        break;
                }
                return O6.c.bravo(i4, i5, i10);
        }
    }

    @Override // t6.A3
    public final int bravo(int i4, View view) {
        switch (this.alpha) {
            case 0:
                return O6.c.bravo(i4, ((BottomSheetBehavior) this.bravo).lima(), echo());
            default:
                return view.getTop();
        }
    }

    @Override // t6.A3
    public int delta(View view) {
        switch (this.alpha) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.bravo;
                return sideSheetBehavior.e + sideSheetBehavior.f8110h;
            default:
                return super.delta(view);
        }
    }

    @Override // t6.A3
    public int echo() {
        switch (this.alpha) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.bravo;
                if (bottomSheetBehavior.B) {
                    return bottomSheetBehavior.f7865O;
                }
                return bottomSheetBehavior.f7900z;
            default:
                return super.echo();
        }
    }

    @Override // t6.A3
    public final void india(int i4) {
        switch (this.alpha) {
            case 0:
                if (i4 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.bravo;
                    if (bottomSheetBehavior.f7854D) {
                        bottomSheetBehavior.tango(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i4 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.bravo;
                    if (sideSheetBehavior.yellow) {
                        sideSheetBehavior.foxtrot(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // t6.A3
    public final void juliet(View view, int i4, int i5) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.alpha) {
            case 0:
                ((BottomSheetBehavior) this.bravo).hotel(i5);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.bravo;
                WeakReference weakReference = sideSheetBehavior.f8112j;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    C1816a c1816a = sideSheetBehavior.alpha;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (c1816a.alpha) {
                        case 0:
                            if (left <= c1816a.bravo.f8108f) {
                                marginLayoutParams.leftMargin = right;
                                break;
                            }
                            break;
                        default:
                            int i10 = c1816a.bravo.f8108f;
                            if (left <= i10) {
                                marginLayoutParams.rightMargin = i10 - left;
                                break;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f8117o;
                if (!linkedHashSet.isEmpty()) {
                    C1816a c1816a2 = sideSheetBehavior.alpha;
                    switch (c1816a2.alpha) {
                        case 0:
                            c1816a2.bravo();
                            c1816a2.alpha();
                            break;
                        default:
                            int i11 = c1816a2.bravo.f8108f;
                            c1816a2.alpha();
                            break;
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw ad.yankee(it);
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r2 > 0.5f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (r7 > com.zendesk.service.HttpConstants.HTTP_INTERNAL_ERROR) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
    
        if (r6.getLeft() > ((r7.alpha() + r7.bravo.f8108f) / 2)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r7 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
    
        if (r6.getRight() < ((r7.alpha() - r7.bravo()) / 2)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        if (r7 > com.zendesk.service.HttpConstants.HTTP_INTERNAL_ERROR) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
    
        if (java.lang.Math.abs(r7 - r0.alpha.alpha()) < java.lang.Math.abs(r7 - r0.alpha.bravo())) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0044, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005c, code lost:
    
        if (r2 > 0.5f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0017, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x001c, code lost:
    
        if (r7 > 0.0f) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012d, code lost:
    
        if (r7 > r4.f7898x) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r7 < 0.0f) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017d, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.lima()) < java.lang.Math.abs(r6.getTop() - r4.f7898x)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c8, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f7897w) < java.lang.Math.abs(r7 - r4.f7900z)) goto L65;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0027. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0065. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x00ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    @Override // t6.A3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void kilo(View view, float f5, float f10) {
        boolean z2;
        int i4;
        boolean z10;
        boolean z11;
        switch (this.alpha) {
            case 0:
                int i5 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.bravo;
                if (f10 < 0.0f) {
                    if (!bottomSheetBehavior.purple) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i5 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.victor(view, i5, true);
                    return;
                }
                if (bottomSheetBehavior.B && bottomSheetBehavior.uniform(view, f10)) {
                    if (Math.abs(f5) >= Math.abs(f10) || f10 <= bottomSheetBehavior.silver) {
                        if (view.getTop() <= (bottomSheetBehavior.lima() + bottomSheetBehavior.f7865O) / 2) {
                            if (!bottomSheetBehavior.purple) {
                                break;
                            }
                            i5 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.victor(view, i5, true);
                            return;
                        }
                    }
                    i5 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.victor(view, i5, true);
                    return;
                }
                if (f10 != 0.0f && Math.abs(f5) <= Math.abs(f10)) {
                    if (!bottomSheetBehavior.purple) {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - bottomSheetBehavior.f7898x) < Math.abs(top2 - bottomSheetBehavior.f7900z)) {
                            bottomSheetBehavior.getClass();
                        }
                    }
                    i5 = 4;
                } else {
                    int top3 = view.getTop();
                    if (bottomSheetBehavior.purple) {
                        break;
                    } else {
                        int i10 = bottomSheetBehavior.f7898x;
                        if (top3 < i10) {
                            if (top3 >= Math.abs(top3 - bottomSheetBehavior.f7900z)) {
                                bottomSheetBehavior.getClass();
                            }
                            i5 = 3;
                        } else {
                            if (Math.abs(top3 - i10) < Math.abs(top3 - bottomSheetBehavior.f7900z)) {
                                bottomSheetBehavior.getClass();
                            }
                            i5 = 4;
                        }
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.victor(view, i5, true);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.bravo;
                switch (sideSheetBehavior.alpha.alpha) {
                }
                if (!z2) {
                    C1816a c1816a = sideSheetBehavior.alpha;
                    switch (c1816a.alpha) {
                        case 0:
                            float left = view.getLeft();
                            SideSheetBehavior sideSheetBehavior2 = c1816a.bravo;
                            float abs = Math.abs((sideSheetBehavior2.f8107d * f5) + left);
                            sideSheetBehavior2.getClass();
                            break;
                        default:
                            float right = view.getRight();
                            SideSheetBehavior sideSheetBehavior3 = c1816a.bravo;
                            float abs2 = Math.abs((sideSheetBehavior3.f8107d * f5) + right);
                            sideSheetBehavior3.getClass();
                            break;
                    }
                    if (z10) {
                        C1816a c1816a2 = sideSheetBehavior.alpha;
                        switch (c1816a2.alpha) {
                            case 0:
                                if (Math.abs(f5) > Math.abs(f10)) {
                                    float abs3 = Math.abs(f5);
                                    c1816a2.bravo.getClass();
                                    break;
                                }
                                z11 = false;
                                break;
                            default:
                                if (Math.abs(f5) > Math.abs(f10)) {
                                    float abs4 = Math.abs(f5);
                                    c1816a2.bravo.getClass();
                                    break;
                                }
                                z11 = false;
                                break;
                        }
                        if (!z11) {
                            C1816a c1816a3 = sideSheetBehavior.alpha;
                            switch (c1816a3.alpha) {
                                case 0:
                                    break;
                                default:
                                    break;
                            }
                        }
                        i4 = 5;
                    } else {
                        if (f5 == 0.0f || Math.abs(f5) <= Math.abs(f10)) {
                            int left2 = view.getLeft();
                            break;
                        }
                        i4 = 5;
                    }
                    sideSheetBehavior.hotel(view, i4, true);
                    return;
                }
                i4 = 3;
                sideSheetBehavior.hotel(view, i4, true);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r5.canScrollVertically(-1) != false) goto L36;
     */
    @Override // t6.A3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean oscar(int i4, View view) {
        View view2;
        WeakReference weakReference;
        switch (this.alpha) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.bravo;
                int i5 = bottomSheetBehavior.f7857G;
                if (i5 != 1 && !bottomSheetBehavior.f7872W) {
                    if (i5 == 3 && bottomSheetBehavior.f7870U == i4) {
                        WeakReference weakReference2 = bottomSheetBehavior.Q;
                        if (weakReference2 != null) {
                            view2 = (View) weakReference2.get();
                        } else {
                            view2 = null;
                        }
                        if (view2 != null) {
                            break;
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f7866P;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        return true;
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.bravo;
                if (sideSheetBehavior.f8104a == 1 || (weakReference = sideSheetBehavior.f8111i) == null || weakReference.get() != view) {
                    return false;
                }
                return true;
        }
    }
}
