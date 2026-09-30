package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.appcompat.widget.P0;
import java.util.Arrays;
import java.util.WeakHashMap;
import s1.C2576i;
import t1.C2952d;

/* loaded from: classes3.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean blue;
    public int bronze;
    public int[] coral;
    public View[] crimson;
    public final SparseIntArray cyan;
    public final SparseIntArray emerald;
    public K3.b fuchsia;
    public final Rect gold;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.blue = false;
        this.bronze = -1;
        this.cyan = new SparseIntArray();
        this.emerald = new SparseIntArray();
        this.fuchsia = new K3.b((byte) 0, 2);
        this.gold = new Rect();
        m0(L.green(context, attributeSet, i4, i5).bravo);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B(b0 b0Var, am amVar, ae aeVar) {
        int i4;
        int i5 = this.bronze;
        for (int i10 = 0; i10 < this.bronze && (i4 = amVar.delta) >= 0 && i4 < b0Var.bravo() && i5 > 0; i10++) {
            int i11 = amVar.delta;
            aeVar.alpha(i11, Math.max(0, amVar.golf));
            i5 -= this.fuchsia.mike(i11);
            amVar.delta += amVar.echo;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View O(U u4, b0 b0Var, boolean z2, boolean z10) {
        int i4;
        int i5;
        int whiskey = whiskey();
        int i10 = 1;
        if (z10) {
            i5 = whiskey() - 1;
            i4 = -1;
            i10 = -1;
        } else {
            i4 = whiskey;
            i5 = 0;
        }
        int bravo = b0Var.bravo();
        G();
        int kilo = this.romeo.kilo();
        int golf = this.romeo.golf();
        View view = null;
        View view2 = null;
        while (i5 != i4) {
            View victor = victor(i5);
            int gray = L.gray(victor);
            if (gray >= 0 && gray < bravo && j0(gray, u4, b0Var) == 0) {
                if (((M) victor.getLayoutParams()).alpha.isRemoved()) {
                    if (view2 == null) {
                        view2 = victor;
                    }
                } else {
                    if (this.romeo.echo(victor) < golf && this.romeo.bravo(victor) >= kilo) {
                        return victor;
                    }
                    if (view == null) {
                        view = victor;
                    }
                }
            }
            i5 += i10;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r22.bravo = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(U u4, b0 b0Var, am amVar, al alVar) {
        boolean z2;
        int i4;
        boolean z10;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int xray;
        int i16;
        boolean z11;
        int i17;
        View bravo;
        int juliet = this.romeo.juliet();
        if (juliet != 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (whiskey() > 0) {
            i4 = this.coral[this.bronze];
        } else {
            i4 = 0;
        }
        if (z2) {
            n0();
        }
        if (amVar.echo == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i18 = this.bronze;
        if (!z10) {
            i18 = j0(amVar.delta, u4, b0Var) + k0(amVar.delta, u4, b0Var);
        }
        int i19 = 0;
        while (i19 < this.bronze && (i17 = amVar.delta) >= 0 && i17 < b0Var.bravo() && i18 > 0) {
            int i20 = amVar.delta;
            int k02 = k0(i20, u4, b0Var);
            if (k02 <= this.bronze) {
                i18 -= k02;
                if (i18 < 0 || (bravo = amVar.bravo(u4)) == null) {
                    break;
                }
                this.crimson[i19] = bravo;
                i19++;
            } else {
                throw new IllegalArgumentException(P0.cyan(av.q.hotel(i20, k02, "Item at position ", " requires ", " spans but GridLayoutManager has only "), this.bronze, " spans."));
            }
        }
        if (z10) {
            i11 = 1;
            i10 = i19;
            i5 = 0;
        } else {
            i5 = i19 - 1;
            i10 = -1;
            i11 = -1;
        }
        int i21 = 0;
        while (i5 != i10) {
            View view = this.crimson[i5];
            ai aiVar = (ai) view.getLayoutParams();
            int k03 = k0(L.gray(view), u4, b0Var);
            aiVar.white = k03;
            aiVar.teal = i21;
            i21 += k03;
            i5 += i11;
        }
        float f5 = 0.0f;
        int i22 = 0;
        for (int i23 = 0; i23 < i19; i23++) {
            View view2 = this.crimson[i23];
            if (amVar.kilo == null) {
                if (z10) {
                    z11 = false;
                    bravo(view2, -1, false);
                } else {
                    z11 = false;
                    bravo(view2, 0, false);
                }
            } else {
                z11 = false;
                if (z10) {
                    bravo(view2, -1, true);
                } else {
                    bravo(view2, 0, true);
                }
            }
            delta(view2, this.gold);
            l0(view2, juliet, z11);
            int charlie = this.romeo.charlie(view2);
            if (charlie > i22) {
                i22 = charlie;
            }
            float delta = (this.romeo.delta(view2) * 1.0f) / ((ai) view2.getLayoutParams()).white;
            if (delta > f5) {
                f5 = delta;
            }
        }
        if (z2) {
            f0(Math.max(Math.round(f5 * this.bronze), i4));
            i22 = 0;
            for (int i24 = 0; i24 < i19; i24++) {
                View view3 = this.crimson[i24];
                l0(view3, 1073741824, true);
                int charlie2 = this.romeo.charlie(view3);
                if (charlie2 > i22) {
                    i22 = charlie2;
                }
            }
        }
        for (int i25 = 0; i25 < i19; i25++) {
            View view4 = this.crimson[i25];
            if (this.romeo.charlie(view4) != i22) {
                ai aiVar2 = (ai) view4.getLayoutParams();
                Rect rect = aiVar2.purple;
                int i26 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) aiVar2).topMargin + ((ViewGroup.MarginLayoutParams) aiVar2).bottomMargin;
                int i27 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) aiVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aiVar2).rightMargin;
                int h02 = h0(aiVar2.teal, aiVar2.white);
                if (this.papa == 1) {
                    i16 = L.xray(false, h02, 1073741824, i27, ((ViewGroup.MarginLayoutParams) aiVar2).width);
                    xray = View.MeasureSpec.makeMeasureSpec(i22 - i26, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i22 - i27, 1073741824);
                    xray = L.xray(false, h02, 1073741824, i26, ((ViewGroup.MarginLayoutParams) aiVar2).height);
                    i16 = makeMeasureSpec;
                }
                if (w(view4, i16, xray, (M) view4.getLayoutParams())) {
                    view4.measure(i16, xray);
                }
            }
        }
        alVar.alpha = i22;
        if (this.papa == 1) {
            if (amVar.foxtrot == -1) {
                i15 = amVar.bravo;
                i14 = i15 - i22;
                i13 = 0;
                i12 = 0;
            } else {
                int i28 = amVar.bravo;
                i14 = i28;
                i12 = 0;
                i15 = i28 + i22;
                i13 = 0;
            }
        } else {
            if (amVar.foxtrot == -1) {
                int i29 = amVar.bravo;
                i13 = i29 - i22;
                i12 = i29;
            } else {
                int i30 = amVar.bravo;
                i12 = i30 + i22;
                i13 = i30;
            }
            i14 = 0;
            i15 = 0;
        }
        for (int i31 = 0; i31 < i19; i31++) {
            View view5 = this.crimson[i31];
            ai aiVar3 = (ai) view5.getLayoutParams();
            if (this.papa == 1) {
                if (T()) {
                    int emerald = emerald() + this.coral[this.bronze - aiVar3.teal];
                    i12 = emerald;
                    i13 = emerald - this.romeo.delta(view5);
                } else {
                    i13 = emerald() + this.coral[aiVar3.teal];
                    i12 = this.romeo.delta(view5) + i13;
                }
            } else {
                i14 = gold() + this.coral[aiVar3.teal];
                i15 = this.romeo.delta(view5) + i14;
            }
            L.lime(view5, i13, i14, i12, i15);
            if (aiVar3.alpha.isRemoved() || aiVar3.alpha.isUpdated()) {
                alVar.charlie = true;
            }
            alVar.delta = view5.hasFocusable() | alVar.delta;
        }
        Arrays.fill(this.crimson, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V(U u4, b0 b0Var, ak akVar, int i4) {
        boolean z2;
        n0();
        if (b0Var.bravo() > 0 && !b0Var.golf) {
            if (i4 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int j02 = j0(akVar.bravo, u4, b0Var);
            if (z2) {
                while (j02 > 0) {
                    int i5 = akVar.bravo;
                    if (i5 <= 0) {
                        break;
                    }
                    int i10 = i5 - 1;
                    akVar.bravo = i10;
                    j02 = j0(i10, u4, b0Var);
                }
            } else {
                int bravo = b0Var.bravo() - 1;
                int i11 = akVar.bravo;
                while (i11 < bravo) {
                    int i12 = i11 + 1;
                    int j03 = j0(i12, u4, b0Var);
                    if (j03 <= j02) {
                        break;
                    }
                    i11 = i12;
                    j02 = j03;
                }
                akVar.bravo = i11;
            }
        }
        g0();
    }

    @Override // androidx.recyclerview.widget.L
    public final void a(RecyclerView recyclerView, int i4, int i5) {
        this.fuchsia.oscar();
        ((SparseIntArray) this.fuchsia.red).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.L
    public final void b(U u4, b0 b0Var) {
        boolean z2 = b0Var.golf;
        SparseIntArray sparseIntArray = this.emerald;
        SparseIntArray sparseIntArray2 = this.cyan;
        if (z2) {
            int whiskey = whiskey();
            for (int i4 = 0; i4 < whiskey; i4++) {
                ai aiVar = (ai) victor(i4).getLayoutParams();
                int layoutPosition = aiVar.alpha.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, aiVar.white);
                sparseIntArray.put(layoutPosition, aiVar.teal);
            }
        }
        super.b(u4, b0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b0(boolean z2) {
        if (!z2) {
            super.b0(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.L
    public final void c(b0 b0Var) {
        super.c(b0Var);
        this.blue = false;
    }

    public final void f0(int i4) {
        int i5;
        int[] iArr = this.coral;
        int i10 = this.bronze;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i4) {
            iArr = new int[i10 + 1];
        }
        int i11 = 0;
        iArr[0] = 0;
        int i12 = i4 / i10;
        int i13 = i4 % i10;
        int i14 = 0;
        for (int i15 = 1; i15 <= i10; i15++) {
            i11 += i13;
            if (i11 > 0 && i10 - i11 < i13) {
                i5 = i12 + 1;
                i11 -= i10;
            } else {
                i5 = i12;
            }
            i14 += i5;
            iArr[i15] = i14;
        }
        this.coral = iArr;
    }

    public final void g0() {
        View[] viewArr = this.crimson;
        if (viewArr != null && viewArr.length == this.bronze) {
            return;
        }
        this.crimson = new View[this.bronze];
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean golf(M m4) {
        return m4 instanceof ai;
    }

    public final int h0(int i4, int i5) {
        if (this.papa == 1 && T()) {
            int[] iArr = this.coral;
            int i10 = this.bronze;
            return iArr[i10 - i4] - iArr[(i10 - i4) - i5];
        }
        int[] iArr2 = this.coral;
        return iArr2[i5 + i4] - iArr2[i4];
    }

    public final int i0(int i4, U u4, b0 b0Var) {
        if (!b0Var.golf) {
            return this.fuchsia.kilo(i4, this.bronze);
        }
        int bravo = u4.bravo(i4);
        if (bravo == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
            return 0;
        }
        return this.fuchsia.kilo(bravo, this.bronze);
    }

    @Override // androidx.recyclerview.widget.L
    public final int indigo(U u4, b0 b0Var) {
        if (this.papa == 0) {
            return this.bronze;
        }
        if (b0Var.bravo() < 1) {
            return 0;
        }
        return i0(b0Var.bravo() - 1, u4, b0Var) + 1;
    }

    public final int j0(int i4, U u4, b0 b0Var) {
        if (!b0Var.golf) {
            return this.fuchsia.lima(i4, this.bronze);
        }
        int i5 = this.emerald.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int bravo = u4.bravo(i4);
        if (bravo == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
            return 0;
        }
        return this.fuchsia.lima(bravo, this.bronze);
    }

    public final int k0(int i4, U u4, b0 b0Var) {
        if (!b0Var.golf) {
            return this.fuchsia.mike(i4);
        }
        int i5 = this.cyan.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int bravo = u4.bravo(i4);
        if (bravo == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
            return 1;
        }
        return this.fuchsia.mike(bravo);
    }

    public final void l0(View view, int i4, boolean z2) {
        int i5;
        int i10;
        boolean u4;
        ai aiVar = (ai) view.getLayoutParams();
        Rect rect = aiVar.purple;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) aiVar).topMargin + ((ViewGroup.MarginLayoutParams) aiVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) aiVar).leftMargin + ((ViewGroup.MarginLayoutParams) aiVar).rightMargin;
        int h02 = h0(aiVar.teal, aiVar.white);
        if (this.papa == 1) {
            i10 = L.xray(false, h02, i4, i12, ((ViewGroup.MarginLayoutParams) aiVar).width);
            i5 = L.xray(true, this.romeo.lima(), this.mike, i11, ((ViewGroup.MarginLayoutParams) aiVar).height);
        } else {
            int xray = L.xray(false, h02, i4, i11, ((ViewGroup.MarginLayoutParams) aiVar).height);
            int xray2 = L.xray(true, this.romeo.lima(), this.lima, i12, ((ViewGroup.MarginLayoutParams) aiVar).width);
            i5 = xray;
            i10 = xray2;
        }
        M m4 = (M) view.getLayoutParams();
        if (z2) {
            u4 = w(view, i10, i5, m4);
        } else {
            u4 = u(view, i10, i5, m4);
        }
        if (u4) {
            view.measure(i10, i5);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.L
    public final int lima(b0 b0Var) {
        return D(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.L
    public final int m(int i4, U u4, b0 b0Var) {
        n0();
        g0();
        return super.m(i4, u4, b0Var);
    }

    public final void m0(int i4) {
        if (i4 == this.bronze) {
            return;
        }
        this.blue = true;
        if (i4 >= 1) {
            this.bronze = i4;
            this.fuchsia.oscar();
            l();
            return;
        }
        throw new IllegalArgumentException(ao.ad.zulu(i4, "Span count should be at least 1. Provided "));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.L
    public final int mike(b0 b0Var) {
        return E(b0Var);
    }

    public final void n0() {
        int cyan;
        int gold;
        if (this.papa == 1) {
            cyan = this.november - fuchsia();
            gold = emerald();
        } else {
            cyan = this.oscar - cyan();
            gold = gold();
        }
        f0(cyan - gold);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.L
    public final int o(int i4, U u4, b0 b0Var) {
        n0();
        g0();
        return super.o(i4, u4, b0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e0, code lost:
    
        if (r13 == r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0105, code lost:
    
        if (r13 == r9) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x001f, code lost:
    
        if (r22.alpha.charlie.contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View orange(View view, int i4, U u4, b0 b0Var) {
        View findContainingItemView;
        boolean z2;
        int whiskey;
        int i5;
        int i10;
        boolean z10;
        View view2;
        View view3;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        U u10 = u4;
        b0 b0Var2 = b0Var;
        RecyclerView recyclerView = this.bravo;
        if (recyclerView != null) {
            findContainingItemView = recyclerView.findContainingItemView(view);
            if (findContainingItemView != null) {
            }
        }
        findContainingItemView = null;
        if (findContainingItemView != null) {
            ai aiVar = (ai) findContainingItemView.getLayoutParams();
            int i13 = aiVar.teal;
            int i14 = aiVar.white + i13;
            if (super.orange(view, i4, u4, b0Var) != null) {
                if (F(i4) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 != this.uniform) {
                    i10 = whiskey() - 1;
                    whiskey = -1;
                    i5 = -1;
                } else {
                    whiskey = whiskey();
                    i5 = 1;
                    i10 = 0;
                }
                if (this.papa == 1 && T()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i02 = i0(i10, u10, b0Var2);
                View view4 = null;
                int i15 = -1;
                int i16 = -1;
                int i17 = 0;
                int i18 = i10;
                int i19 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i18 == whiskey) {
                        break;
                    }
                    int i03 = i0(i18, u10, b0Var2);
                    View victor = victor(i18);
                    if (victor == findContainingItemView) {
                        break;
                    }
                    if (victor.hasFocusable() && i03 != i02) {
                        if (view4 != null) {
                            break;
                        }
                        view3 = findContainingItemView;
                        i12 = i17;
                        i11 = whiskey;
                    } else {
                        ai aiVar2 = (ai) victor.getLayoutParams();
                        int i20 = aiVar2.teal;
                        view3 = findContainingItemView;
                        int i21 = aiVar2.white + i20;
                        if (victor.hasFocusable() && i20 == i13 && i21 == i14) {
                            return victor;
                        }
                        if ((victor.hasFocusable() && view4 == null) || (!victor.hasFocusable() && view2 == null)) {
                            i12 = i17;
                            i11 = whiskey;
                        } else {
                            i11 = whiskey;
                            int min = Math.min(i21, i14) - Math.max(i20, i13);
                            if (victor.hasFocusable()) {
                                if (min <= i17) {
                                    if (min == i17) {
                                        if (i20 > i16) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                    }
                                    i12 = i17;
                                }
                                i12 = i17;
                            } else {
                                if (view4 == null) {
                                    i12 = i17;
                                    if (!this.charlie.delta(victor) || !this.delta.delta(victor)) {
                                        if (min <= i19) {
                                            if (min == i19) {
                                                if (i20 > i15) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                                i12 = i17;
                            }
                        }
                        if (victor.hasFocusable()) {
                            int i22 = aiVar2.teal;
                            i17 = Math.min(i21, i14) - Math.max(i20, i13);
                            view4 = victor;
                            i16 = i22;
                            view5 = view2;
                        } else {
                            int i23 = aiVar2.teal;
                            view5 = victor;
                            i15 = i23;
                            i17 = i12;
                            i19 = Math.min(i21, i14) - Math.max(i20, i13);
                        }
                        i18 += i5;
                        u10 = u4;
                        b0Var2 = b0Var;
                        findContainingItemView = view3;
                        whiskey = i11;
                    }
                    view5 = view2;
                    i17 = i12;
                    i18 += i5;
                    u10 = u4;
                    b0Var2 = b0Var;
                    findContainingItemView = view3;
                    whiskey = i11;
                }
                if (view4 != null) {
                    return view4;
                }
                return view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.L
    public final int oscar(b0 b0Var) {
        return D(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.L
    public final int papa(b0 b0Var) {
        return E(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final void pink(U u4, b0 b0Var, C2952d c2952d) {
        super.pink(u4, b0Var, c2952d);
        c2952d.juliet(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.L
    public final void purple(U u4, b0 b0Var, View view, C2952d c2952d) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ai)) {
            plum(view, c2952d);
            return;
        }
        ai aiVar = (ai) layoutParams;
        int i02 = i0(aiVar.alpha.getLayoutPosition(), u4, b0Var);
        if (this.papa == 0) {
            c2952d.lima(C2576i.hotel(aiVar.teal, aiVar.white, i02, 1, false, false));
        } else {
            c2952d.lima(C2576i.hotel(i02, 1, aiVar.teal, aiVar.white, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void r(Rect rect, int i4, int i5) {
        int hotel;
        int hotel2;
        if (this.coral == null) {
            super.r(rect, i4, i5);
        }
        int fuchsia = fuchsia() + emerald();
        int cyan = cyan() + gold();
        if (this.papa == 1) {
            int height = rect.height() + cyan;
            RecyclerView recyclerView = this.bravo;
            WeakHashMap weakHashMap = s1.au.alpha;
            hotel2 = L.hotel(i5, height, recyclerView.getMinimumHeight());
            int[] iArr = this.coral;
            hotel = L.hotel(i4, iArr[iArr.length - 1] + fuchsia, this.bravo.getMinimumWidth());
        } else {
            int width = rect.width() + fuchsia;
            RecyclerView recyclerView2 = this.bravo;
            WeakHashMap weakHashMap2 = s1.au.alpha;
            hotel = L.hotel(i4, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.coral;
            hotel2 = L.hotel(i5, iArr2[iArr2.length - 1] + cyan, this.bravo.getMinimumHeight());
        }
        this.bravo.setMeasuredDimension(hotel, hotel2);
    }

    @Override // androidx.recyclerview.widget.L
    public final void red(int i4, int i5) {
        this.fuchsia.oscar();
        ((SparseIntArray) this.fuchsia.red).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.L
    public final M sierra() {
        if (this.papa == 0) {
            return new ai(-2, -1);
        }
        return new ai(-1, -2);
    }

    @Override // androidx.recyclerview.widget.L
    public final void silver() {
        this.fuchsia.oscar();
        ((SparseIntArray) this.fuchsia.red).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.ai, androidx.recyclerview.widget.M] */
    @Override // androidx.recyclerview.widget.L
    public final M tango(Context context, AttributeSet attributeSet) {
        ?? m4 = new M(context, attributeSet);
        m4.teal = -1;
        m4.white = 0;
        return m4;
    }

    @Override // androidx.recyclerview.widget.L
    public final void teal(int i4, int i5) {
        this.fuchsia.oscar();
        ((SparseIntArray) this.fuchsia.red).clear();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.ai, androidx.recyclerview.widget.M] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.ai, androidx.recyclerview.widget.M] */
    @Override // androidx.recyclerview.widget.L
    public final M uniform(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? m4 = new M((ViewGroup.MarginLayoutParams) layoutParams);
            m4.teal = -1;
            m4.white = 0;
            return m4;
        }
        ?? m5 = new M(layoutParams);
        m5.teal = -1;
        m5.white = 0;
        return m5;
    }

    @Override // androidx.recyclerview.widget.L
    public final void white(int i4, int i5) {
        this.fuchsia.oscar();
        ((SparseIntArray) this.fuchsia.red).clear();
    }

    @Override // androidx.recyclerview.widget.L
    public final int yankee(U u4, b0 b0Var) {
        if (this.papa == 1) {
            return this.bronze;
        }
        if (b0Var.bravo() < 1) {
            return 0;
        }
        return i0(b0Var.bravo() - 1, u4, b0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.L
    public final boolean z() {
        if (this.zulu == null && !this.blue) {
            return true;
        }
        return false;
    }

    public GridLayoutManager(int i4) {
        super(1, false);
        this.blue = false;
        this.bronze = -1;
        this.cyan = new SparseIntArray();
        this.emerald = new SparseIntArray();
        this.fuchsia = new K3.b((byte) 0, 2);
        this.gold = new Rect();
        m0(i4);
    }
}
