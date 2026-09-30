package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* loaded from: classes3.dex */
public class LinearLayoutManager extends L implements Z {
    public final ak amber;
    public final al azure;
    public final int beige;
    public final int[] black;
    public int papa;
    public am quebec;
    public K1.g romeo;
    public boolean sierra;
    public final boolean tango;
    public boolean uniform;
    public boolean victor;
    public final boolean whiskey;
    public int xray;
    public int yankee;
    public SavedState zulu;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes3.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public int alpha;
        public int purple;
        public boolean red;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.purple);
            parcel.writeInt(this.red ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    public void A(b0 b0Var, int[] iArr) {
        int i4;
        int i5;
        if (b0Var.alpha != -1) {
            i4 = this.romeo.lima();
        } else {
            i4 = 0;
        }
        if (this.quebec.foxtrot == -1) {
            i5 = 0;
        } else {
            i5 = i4;
            i4 = 0;
        }
        iArr[0] = i4;
        iArr[1] = i5;
    }

    public void B(b0 b0Var, am amVar, ae aeVar) {
        int i4 = amVar.delta;
        if (i4 >= 0 && i4 < b0Var.bravo()) {
            aeVar.alpha(i4, Math.max(0, amVar.golf));
        }
    }

    public final int C(b0 b0Var) {
        if (whiskey() == 0) {
            return 0;
        }
        G();
        K1.g gVar = this.romeo;
        boolean z2 = !this.whiskey;
        return AbstractC0659d.bravo(b0Var, gVar, J(z2), I(z2), this, this.whiskey);
    }

    public final int D(b0 b0Var) {
        if (whiskey() == 0) {
            return 0;
        }
        G();
        K1.g gVar = this.romeo;
        boolean z2 = !this.whiskey;
        return AbstractC0659d.charlie(b0Var, gVar, J(z2), I(z2), this, this.whiskey, this.uniform);
    }

    public final int E(b0 b0Var) {
        if (whiskey() == 0) {
            return 0;
        }
        G();
        K1.g gVar = this.romeo;
        boolean z2 = !this.whiskey;
        return AbstractC0659d.delta(b0Var, gVar, J(z2), I(z2), this, this.whiskey);
    }

    public final int F(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 17) {
                    if (i4 != 33) {
                        if (i4 != 66) {
                            if (i4 == 130 && this.papa == 1) {
                                return 1;
                            }
                            return RecyclerView.UNDEFINED_DURATION;
                        }
                        if (this.papa == 0) {
                            return 1;
                        }
                        return RecyclerView.UNDEFINED_DURATION;
                    }
                    if (this.papa == 1) {
                        return -1;
                    }
                    return RecyclerView.UNDEFINED_DURATION;
                }
                if (this.papa == 0) {
                    return -1;
                }
                return RecyclerView.UNDEFINED_DURATION;
            }
            if (this.papa != 1 && T()) {
                return -1;
            }
            return 1;
        }
        if (this.papa == 1 || !T()) {
            return -1;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.am, java.lang.Object] */
    public final void G() {
        if (this.quebec == null) {
            ?? obj = new Object();
            obj.alpha = true;
            obj.hotel = 0;
            obj.india = 0;
            obj.kilo = null;
            this.quebec = obj;
        }
    }

    public final int H(U u4, am amVar, b0 b0Var, boolean z2) {
        int i4;
        int i5 = amVar.charlie;
        int i10 = amVar.golf;
        if (i10 != Integer.MIN_VALUE) {
            if (i5 < 0) {
                amVar.golf = i10 + i5;
            }
            W(u4, amVar);
        }
        int i11 = amVar.charlie + amVar.hotel;
        while (true) {
            if ((!amVar.lima && i11 <= 0) || (i4 = amVar.delta) < 0 || i4 >= b0Var.bravo()) {
                break;
            }
            al alVar = this.azure;
            alVar.alpha = 0;
            alVar.bravo = false;
            alVar.charlie = false;
            alVar.delta = false;
            U(u4, b0Var, amVar, alVar);
            if (!alVar.bravo) {
                int i12 = amVar.bravo;
                int i13 = alVar.alpha;
                amVar.bravo = (amVar.foxtrot * i13) + i12;
                if (!alVar.charlie || amVar.kilo != null || !b0Var.golf) {
                    amVar.charlie -= i13;
                    i11 -= i13;
                }
                int i14 = amVar.golf;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + i13;
                    amVar.golf = i15;
                    int i16 = amVar.charlie;
                    if (i16 < 0) {
                        amVar.golf = i15 + i16;
                    }
                    W(u4, amVar);
                }
                if (z2 && alVar.delta) {
                    break;
                }
            } else {
                break;
            }
        }
        return i5 - amVar.charlie;
    }

    public final View I(boolean z2) {
        if (this.uniform) {
            return N(0, whiskey(), z2, true);
        }
        return N(whiskey() - 1, -1, z2, true);
    }

    public final View J(boolean z2) {
        if (this.uniform) {
            return N(whiskey() - 1, -1, z2, true);
        }
        return N(0, whiskey(), z2, true);
    }

    public final int K() {
        View N10 = N(0, whiskey(), false, true);
        if (N10 == null) {
            return -1;
        }
        return L.gray(N10);
    }

    public final int L() {
        View N10 = N(whiskey() - 1, -1, false, true);
        if (N10 == null) {
            return -1;
        }
        return L.gray(N10);
    }

    public final View M(int i4, int i5) {
        int i10;
        int i11;
        G();
        if (i5 > i4 || i5 < i4) {
            if (this.romeo.echo(victor(i4)) < this.romeo.kilo()) {
                i10 = 16644;
                i11 = 16388;
            } else {
                i10 = 4161;
                i11 = 4097;
            }
            if (this.papa == 0) {
                return this.charlie.charlie(i4, i5, i10, i11);
            }
            return this.delta.charlie(i4, i5, i10, i11);
        }
        return victor(i4);
    }

    public final View N(int i4, int i5, boolean z2, boolean z10) {
        int i10;
        G();
        int i11 = 320;
        if (z2) {
            i10 = 24579;
        } else {
            i10 = 320;
        }
        if (!z10) {
            i11 = 0;
        }
        if (this.papa == 0) {
            return this.charlie.charlie(i4, i5, i10, i11);
        }
        return this.delta.charlie(i4, i5, i10, i11);
    }

    public View O(U u4, b0 b0Var, boolean z2, boolean z10) {
        int i4;
        int i5;
        int i10;
        boolean z11;
        boolean z12;
        G();
        int whiskey = whiskey();
        if (z10) {
            i5 = whiskey() - 1;
            i4 = -1;
            i10 = -1;
        } else {
            i4 = whiskey;
            i5 = 0;
            i10 = 1;
        }
        int bravo = b0Var.bravo();
        int kilo = this.romeo.kilo();
        int golf = this.romeo.golf();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i5 != i4) {
            View victor = victor(i5);
            int gray = L.gray(victor);
            int echo = this.romeo.echo(victor);
            int bravo2 = this.romeo.bravo(victor);
            if (gray >= 0 && gray < bravo) {
                if (((M) victor.getLayoutParams()).alpha.isRemoved()) {
                    if (view3 == null) {
                        view3 = victor;
                    }
                } else {
                    if (bravo2 <= kilo && echo < kilo) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (echo >= golf && bravo2 > golf) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z11 && !z12) {
                        return victor;
                    }
                    if (z2) {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = victor;
                        }
                        view2 = victor;
                    } else {
                        if (!z11) {
                            if (view != null) {
                            }
                            view = victor;
                        }
                        view2 = victor;
                    }
                }
            }
            i5 += i10;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    public final int P(int i4, U u4, b0 b0Var, boolean z2) {
        int golf;
        int golf2 = this.romeo.golf() - i4;
        if (golf2 > 0) {
            int i5 = -Z(-golf2, u4, b0Var);
            int i10 = i4 + i5;
            if (z2 && (golf = this.romeo.golf() - i10) > 0) {
                this.romeo.papa(golf);
                return golf + i5;
            }
            return i5;
        }
        return 0;
    }

    public final int Q(int i4, U u4, b0 b0Var, boolean z2) {
        int kilo;
        int kilo2 = i4 - this.romeo.kilo();
        if (kilo2 > 0) {
            int i5 = -Z(kilo2, u4, b0Var);
            int i10 = i4 + i5;
            if (z2 && (kilo = i10 - this.romeo.kilo()) > 0) {
                this.romeo.papa(-kilo);
                return i5 - kilo;
            }
            return i5;
        }
        return 0;
    }

    public final View R() {
        int whiskey;
        if (this.uniform) {
            whiskey = 0;
        } else {
            whiskey = whiskey() - 1;
        }
        return victor(whiskey);
    }

    public final View S() {
        int i4;
        if (this.uniform) {
            i4 = whiskey() - 1;
        } else {
            i4 = 0;
        }
        return victor(i4);
    }

    public final boolean T() {
        if (crimson() == 1) {
            return true;
        }
        return false;
    }

    public void U(U u4, b0 b0Var, am amVar, al alVar) {
        boolean z2;
        int i4;
        int i5;
        int i10;
        int i11;
        boolean z10;
        View bravo = amVar.bravo(u4);
        if (bravo == null) {
            alVar.bravo = true;
            return;
        }
        M m4 = (M) bravo.getLayoutParams();
        if (amVar.kilo == null) {
            boolean z11 = this.uniform;
            if (amVar.foxtrot == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                bravo(bravo, -1, false);
            } else {
                bravo(bravo, 0, false);
            }
        } else {
            boolean z12 = this.uniform;
            if (amVar.foxtrot == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z12 == z2) {
                bravo(bravo, -1, true);
            } else {
                bravo(bravo, 0, true);
            }
        }
        M m5 = (M) bravo.getLayoutParams();
        Rect itemDecorInsetsForChild = this.bravo.getItemDecorInsetsForChild(bravo);
        int i12 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
        int i13 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
        int xray = L.xray(echo(), this.november, this.lima, fuchsia() + emerald() + ((ViewGroup.MarginLayoutParams) m5).leftMargin + ((ViewGroup.MarginLayoutParams) m5).rightMargin + i12, ((ViewGroup.MarginLayoutParams) m5).width);
        int xray2 = L.xray(foxtrot(), this.oscar, this.mike, cyan() + gold() + ((ViewGroup.MarginLayoutParams) m5).topMargin + ((ViewGroup.MarginLayoutParams) m5).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) m5).height);
        if (u(bravo, xray, xray2, m5)) {
            bravo.measure(xray, xray2);
        }
        alVar.alpha = this.romeo.charlie(bravo);
        if (this.papa == 1) {
            if (T()) {
                i11 = this.november - fuchsia();
                i4 = i11 - this.romeo.delta(bravo);
            } else {
                i4 = emerald();
                i11 = this.romeo.delta(bravo) + i4;
            }
            if (amVar.foxtrot == -1) {
                i5 = amVar.bravo;
                i10 = i5 - alVar.alpha;
            } else {
                i10 = amVar.bravo;
                i5 = alVar.alpha + i10;
            }
        } else {
            int gold = gold();
            int delta = this.romeo.delta(bravo) + gold;
            if (amVar.foxtrot == -1) {
                int i14 = amVar.bravo;
                int i15 = i14 - alVar.alpha;
                i11 = i14;
                i5 = delta;
                i4 = i15;
                i10 = gold;
            } else {
                int i16 = amVar.bravo;
                int i17 = alVar.alpha + i16;
                i4 = i16;
                i5 = delta;
                i10 = gold;
                i11 = i17;
            }
        }
        L.lime(bravo, i4, i10, i11, i5);
        if (m4.alpha.isRemoved() || m4.alpha.isUpdated()) {
            alVar.charlie = true;
        }
        alVar.delta = bravo.hasFocusable();
    }

    public void V(U u4, b0 b0Var, ak akVar, int i4) {
    }

    public final void W(U u4, am amVar) {
        if (amVar.alpha && !amVar.lima) {
            int i4 = amVar.golf;
            int i5 = amVar.india;
            if (amVar.foxtrot == -1) {
                int whiskey = whiskey();
                if (i4 >= 0) {
                    int foxtrot = (this.romeo.foxtrot() - i4) + i5;
                    if (this.uniform) {
                        for (int i10 = 0; i10 < whiskey; i10++) {
                            View victor = victor(i10);
                            if (this.romeo.echo(victor) < foxtrot || this.romeo.oscar(victor) < foxtrot) {
                                X(u4, 0, i10);
                                return;
                            }
                        }
                        return;
                    }
                    int i11 = whiskey - 1;
                    for (int i12 = i11; i12 >= 0; i12--) {
                        View victor2 = victor(i12);
                        if (this.romeo.echo(victor2) < foxtrot || this.romeo.oscar(victor2) < foxtrot) {
                            X(u4, i11, i12);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i4 >= 0) {
                int i13 = i4 - i5;
                int whiskey2 = whiskey();
                if (this.uniform) {
                    int i14 = whiskey2 - 1;
                    for (int i15 = i14; i15 >= 0; i15--) {
                        View victor3 = victor(i15);
                        if (this.romeo.bravo(victor3) > i13 || this.romeo.november(victor3) > i13) {
                            X(u4, i14, i15);
                            return;
                        }
                    }
                    return;
                }
                for (int i16 = 0; i16 < whiskey2; i16++) {
                    View victor4 = victor(i16);
                    if (this.romeo.bravo(victor4) > i13 || this.romeo.november(victor4) > i13) {
                        X(u4, 0, i16);
                        return;
                    }
                }
            }
        }
    }

    public final void X(U u4, int i4, int i5) {
        if (i4 != i5) {
            if (i5 > i4) {
                for (int i10 = i5 - 1; i10 >= i4; i10--) {
                    View victor = victor(i10);
                    if (victor(i10) != null) {
                        this.alpha.juliet(i10);
                    }
                    u4.juliet(victor);
                }
                return;
            }
            while (i4 > i5) {
                View victor2 = victor(i4);
                if (victor(i4) != null) {
                    this.alpha.juliet(i4);
                }
                u4.juliet(victor2);
                i4--;
            }
        }
    }

    public final void Y() {
        if (this.papa != 1 && T()) {
            this.uniform = !this.tango;
        } else {
            this.uniform = this.tango;
        }
    }

    public final int Z(int i4, U u4, b0 b0Var) {
        int i5;
        if (whiskey() != 0 && i4 != 0) {
            G();
            this.quebec.alpha = true;
            if (i4 > 0) {
                i5 = 1;
            } else {
                i5 = -1;
            }
            int abs = Math.abs(i4);
            c0(i5, abs, true, b0Var);
            am amVar = this.quebec;
            int H10 = H(u4, amVar, b0Var, false) + amVar.golf;
            if (H10 >= 0) {
                if (abs > H10) {
                    i4 = i5 * H10;
                }
                this.romeo.papa(-i4);
                this.quebec.juliet = i4;
                return i4;
            }
        }
        return 0;
    }

    public final void a0(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(ao.ad.zulu(i4, "invalid orientation:"));
        }
        charlie(null);
        if (i4 == this.papa && this.romeo != null) {
            return;
        }
        K1.g alpha = K1.g.alpha(this, i4);
        this.romeo = alpha;
        this.amber.alpha = alpha;
        this.papa = i4;
        l();
    }

    @Override // androidx.recyclerview.widget.Z
    public final PointF alpha(int i4) {
        if (whiskey() == 0) {
            return null;
        }
        boolean z2 = false;
        int i5 = 1;
        if (i4 < L.gray(victor(0))) {
            z2 = true;
        }
        if (z2 != this.uniform) {
            i5 = -1;
        }
        if (this.papa == 0) {
            return new PointF(i5, 0.0f);
        }
        return new PointF(0.0f, i5);
    }

    @Override // androidx.recyclerview.widget.L
    public void b(U u4, b0 b0Var) {
        View view;
        int i4;
        View view2;
        View O3;
        boolean z2;
        boolean z10;
        int i5;
        boolean z11;
        boolean z12;
        int echo;
        int i10;
        boolean z13;
        int i11;
        int i12;
        List list;
        boolean z14;
        int i13;
        int i14;
        int P4;
        int i15;
        View romeo;
        int echo2;
        int i16;
        int i17;
        int i18 = -1;
        if ((this.zulu != null || this.xray != -1) && b0Var.bravo() == 0) {
            h(u4);
            return;
        }
        SavedState savedState = this.zulu;
        if (savedState != null && (i17 = savedState.alpha) >= 0) {
            this.xray = i17;
        }
        G();
        this.quebec.alpha = false;
        Y();
        RecyclerView recyclerView = this.bravo;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || this.alpha.charlie.contains(view)) {
            view = null;
        }
        ak akVar = this.amber;
        if (akVar.echo && this.xray == -1 && this.zulu == null) {
            if (view != null && (this.romeo.echo(view) >= this.romeo.golf() || this.romeo.bravo(view) <= this.romeo.kilo())) {
                akVar.charlie(L.gray(view), view);
            }
        } else {
            akVar.delta();
            akVar.delta = this.uniform ^ this.victor;
            if (!b0Var.golf && (i5 = this.xray) != -1) {
                if (i5 >= 0 && i5 < b0Var.bravo()) {
                    int i19 = this.xray;
                    akVar.bravo = i19;
                    SavedState savedState2 = this.zulu;
                    if (savedState2 != null && savedState2.alpha >= 0) {
                        boolean z15 = savedState2.red;
                        akVar.delta = z15;
                        if (z15) {
                            akVar.charlie = this.romeo.golf() - this.zulu.purple;
                        } else {
                            akVar.charlie = this.romeo.kilo() + this.zulu.purple;
                        }
                    } else if (this.yankee == Integer.MIN_VALUE) {
                        View romeo2 = romeo(i19);
                        if (romeo2 != null) {
                            if (this.romeo.charlie(romeo2) > this.romeo.lima()) {
                                akVar.alpha();
                            } else if (this.romeo.echo(romeo2) - this.romeo.kilo() < 0) {
                                akVar.charlie = this.romeo.kilo();
                                akVar.delta = false;
                            } else if (this.romeo.golf() - this.romeo.bravo(romeo2) < 0) {
                                akVar.charlie = this.romeo.golf();
                                akVar.delta = true;
                            } else {
                                if (akVar.delta) {
                                    echo = this.romeo.mike() + this.romeo.bravo(romeo2);
                                } else {
                                    echo = this.romeo.echo(romeo2);
                                }
                                akVar.charlie = echo;
                            }
                        } else {
                            if (whiskey() > 0) {
                                if (this.xray < L.gray(victor(0))) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11 == this.uniform) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                akVar.delta = z12;
                            }
                            akVar.alpha();
                        }
                    } else {
                        boolean z16 = this.uniform;
                        akVar.delta = z16;
                        if (z16) {
                            akVar.charlie = this.romeo.golf() - this.yankee;
                        } else {
                            akVar.charlie = this.romeo.kilo() + this.yankee;
                        }
                    }
                    akVar.echo = true;
                } else {
                    this.xray = -1;
                    this.yankee = RecyclerView.UNDEFINED_DURATION;
                }
            }
            if (whiskey() != 0) {
                RecyclerView recyclerView2 = this.bravo;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || this.alpha.charlie.contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    M m4 = (M) view2.getLayoutParams();
                    if (!m4.alpha.isRemoved() && m4.alpha.getLayoutPosition() >= 0 && m4.alpha.getLayoutPosition() < b0Var.bravo()) {
                        akVar.charlie(L.gray(view2), view2);
                        akVar.echo = true;
                    }
                }
                boolean z17 = this.sierra;
                boolean z18 = this.victor;
                if (z17 == z18 && (O3 = O(u4, b0Var, akVar.delta, z18)) != null) {
                    akVar.bravo(L.gray(O3), O3);
                    if (!b0Var.golf && z()) {
                        int echo3 = this.romeo.echo(O3);
                        int bravo = this.romeo.bravo(O3);
                        int kilo = this.romeo.kilo();
                        int golf = this.romeo.golf();
                        if (bravo <= kilo && echo3 < kilo) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (echo3 >= golf && bravo > golf) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z2 || z10) {
                            if (akVar.delta) {
                                kilo = golf;
                            }
                            akVar.charlie = kilo;
                        }
                    }
                    akVar.echo = true;
                }
            }
            akVar.alpha();
            if (this.victor) {
                i4 = b0Var.bravo() - 1;
            } else {
                i4 = 0;
            }
            akVar.bravo = i4;
            akVar.echo = true;
        }
        am amVar = this.quebec;
        if (amVar.juliet >= 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        amVar.foxtrot = i10;
        int[] iArr = this.black;
        iArr[0] = 0;
        iArr[1] = 0;
        A(b0Var, iArr);
        int kilo2 = this.romeo.kilo() + Math.max(0, iArr[0]);
        int hotel = this.romeo.hotel() + Math.max(0, iArr[1]);
        if (b0Var.golf && (i15 = this.xray) != -1 && this.yankee != Integer.MIN_VALUE && (romeo = romeo(i15)) != null) {
            if (this.uniform) {
                i16 = this.romeo.golf() - this.romeo.bravo(romeo);
                echo2 = this.yankee;
            } else {
                echo2 = this.romeo.echo(romeo) - this.romeo.kilo();
                i16 = this.yankee;
            }
            int i20 = i16 - echo2;
            if (i20 > 0) {
                kilo2 += i20;
            } else {
                hotel -= i20;
            }
        }
        if (!akVar.delta ? !this.uniform : this.uniform) {
            i18 = 1;
        }
        V(u4, b0Var, akVar, i18);
        quebec(u4);
        am amVar2 = this.quebec;
        if (this.romeo.india() == 0 && this.romeo.foxtrot() == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        amVar2.lima = z13;
        this.quebec.getClass();
        this.quebec.india = 0;
        if (akVar.delta) {
            e0(akVar.bravo, akVar.charlie);
            am amVar3 = this.quebec;
            amVar3.hotel = kilo2;
            H(u4, amVar3, b0Var, false);
            am amVar4 = this.quebec;
            i12 = amVar4.bravo;
            int i21 = amVar4.delta;
            int i22 = amVar4.charlie;
            if (i22 > 0) {
                hotel += i22;
            }
            d0(akVar.bravo, akVar.charlie);
            am amVar5 = this.quebec;
            amVar5.hotel = hotel;
            amVar5.delta += amVar5.echo;
            H(u4, amVar5, b0Var, false);
            am amVar6 = this.quebec;
            i11 = amVar6.bravo;
            int i23 = amVar6.charlie;
            if (i23 > 0) {
                e0(i21, i12);
                am amVar7 = this.quebec;
                amVar7.hotel = i23;
                H(u4, amVar7, b0Var, false);
                i12 = this.quebec.bravo;
            }
        } else {
            d0(akVar.bravo, akVar.charlie);
            am amVar8 = this.quebec;
            amVar8.hotel = hotel;
            H(u4, amVar8, b0Var, false);
            am amVar9 = this.quebec;
            i11 = amVar9.bravo;
            int i24 = amVar9.delta;
            int i25 = amVar9.charlie;
            if (i25 > 0) {
                kilo2 += i25;
            }
            e0(akVar.bravo, akVar.charlie);
            am amVar10 = this.quebec;
            amVar10.hotel = kilo2;
            amVar10.delta += amVar10.echo;
            H(u4, amVar10, b0Var, false);
            am amVar11 = this.quebec;
            int i26 = amVar11.bravo;
            int i27 = amVar11.charlie;
            if (i27 > 0) {
                d0(i24, i11);
                am amVar12 = this.quebec;
                amVar12.hotel = i27;
                H(u4, amVar12, b0Var, false);
                i11 = this.quebec.bravo;
            }
            i12 = i26;
        }
        if (whiskey() > 0) {
            if (this.uniform ^ this.victor) {
                int P9 = P(i11, u4, b0Var, true);
                i13 = i12 + P9;
                i14 = i11 + P9;
                P4 = Q(i13, u4, b0Var, false);
            } else {
                int Q = Q(i12, u4, b0Var, true);
                i13 = i12 + Q;
                i14 = i11 + Q;
                P4 = P(i14, u4, b0Var, false);
            }
            i12 = i13 + P4;
            i11 = i14 + P4;
        }
        if (b0Var.kilo && whiskey() != 0 && !b0Var.golf && z()) {
            List list2 = u4.delta;
            int size = list2.size();
            int gray = L.gray(victor(0));
            int i28 = 0;
            int i29 = 0;
            for (int i30 = 0; i30 < size; i30++) {
                f0 f0Var = (f0) list2.get(i30);
                if (!f0Var.isRemoved()) {
                    if (f0Var.getLayoutPosition() < gray) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14 != this.uniform) {
                        i28 += this.romeo.charlie(f0Var.itemView);
                    } else {
                        i29 += this.romeo.charlie(f0Var.itemView);
                    }
                }
            }
            this.quebec.kilo = list2;
            if (i28 > 0) {
                e0(L.gray(S()), i12);
                am amVar13 = this.quebec;
                amVar13.hotel = i28;
                amVar13.charlie = 0;
                amVar13.alpha(null);
                H(u4, this.quebec, b0Var, false);
            }
            if (i29 > 0) {
                d0(L.gray(R()), i11);
                am amVar14 = this.quebec;
                amVar14.hotel = i29;
                amVar14.charlie = 0;
                list = null;
                amVar14.alpha(null);
                H(u4, this.quebec, b0Var, false);
            } else {
                list = null;
            }
            this.quebec.kilo = list;
        }
        if (!b0Var.golf) {
            K1.g gVar = this.romeo;
            gVar.alpha = gVar.lima();
        } else {
            akVar.delta();
        }
        this.sierra = this.victor;
    }

    public void b0(boolean z2) {
        charlie(null);
        if (this.victor == z2) {
            return;
        }
        this.victor = z2;
        l();
    }

    @Override // androidx.recyclerview.widget.L
    public void c(b0 b0Var) {
        this.zulu = null;
        this.xray = -1;
        this.yankee = RecyclerView.UNDEFINED_DURATION;
        this.amber.delta();
    }

    public final void c0(int i4, int i5, boolean z2, b0 b0Var) {
        boolean z10;
        int i10;
        int kilo;
        am amVar = this.quebec;
        boolean z11 = false;
        int i11 = 1;
        if (this.romeo.india() == 0 && this.romeo.foxtrot() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        amVar.lima = z10;
        this.quebec.foxtrot = i4;
        int[] iArr = this.black;
        iArr[0] = 0;
        iArr[1] = 0;
        A(b0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i4 == 1) {
            z11 = true;
        }
        am amVar2 = this.quebec;
        if (z11) {
            i10 = max2;
        } else {
            i10 = max;
        }
        amVar2.hotel = i10;
        if (!z11) {
            max = max2;
        }
        amVar2.india = max;
        if (z11) {
            amVar2.hotel = this.romeo.hotel() + i10;
            View R10 = R();
            am amVar3 = this.quebec;
            if (this.uniform) {
                i11 = -1;
            }
            amVar3.echo = i11;
            int gray = L.gray(R10);
            am amVar4 = this.quebec;
            amVar3.delta = gray + amVar4.echo;
            amVar4.bravo = this.romeo.bravo(R10);
            kilo = this.romeo.bravo(R10) - this.romeo.golf();
        } else {
            View S6 = S();
            am amVar5 = this.quebec;
            amVar5.hotel = this.romeo.kilo() + amVar5.hotel;
            am amVar6 = this.quebec;
            if (!this.uniform) {
                i11 = -1;
            }
            amVar6.echo = i11;
            int gray2 = L.gray(S6);
            am amVar7 = this.quebec;
            amVar6.delta = gray2 + amVar7.echo;
            amVar7.bravo = this.romeo.echo(S6);
            kilo = (-this.romeo.echo(S6)) + this.romeo.kilo();
        }
        am amVar8 = this.quebec;
        amVar8.charlie = i5;
        if (z2) {
            amVar8.charlie = i5 - kilo;
        }
        amVar8.golf = kilo;
    }

    @Override // androidx.recyclerview.widget.L
    public final void charlie(String str) {
        if (this.zulu == null) {
            super.charlie(str);
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void d(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.zulu = savedState;
            if (this.xray != -1) {
                savedState.alpha = -1;
            }
            l();
        }
    }

    public final void d0(int i4, int i5) {
        int i10;
        this.quebec.charlie = this.romeo.golf() - i5;
        am amVar = this.quebec;
        if (this.uniform) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        amVar.echo = i10;
        amVar.delta = i4;
        amVar.foxtrot = 1;
        amVar.bravo = i5;
        amVar.golf = RecyclerView.UNDEFINED_DURATION;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable, androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    @Override // androidx.recyclerview.widget.L
    public final Parcelable e() {
        SavedState savedState = this.zulu;
        if (savedState != null) {
            ?? obj = new Object();
            obj.alpha = savedState.alpha;
            obj.purple = savedState.purple;
            obj.red = savedState.red;
            return obj;
        }
        ?? obj2 = new Object();
        if (whiskey() > 0) {
            G();
            boolean z2 = this.sierra ^ this.uniform;
            obj2.red = z2;
            if (z2) {
                View R10 = R();
                obj2.purple = this.romeo.golf() - this.romeo.bravo(R10);
                obj2.alpha = L.gray(R10);
                return obj2;
            }
            View S6 = S();
            obj2.alpha = L.gray(S6);
            obj2.purple = this.romeo.echo(S6) - this.romeo.kilo();
            return obj2;
        }
        obj2.alpha = -1;
        return obj2;
    }

    public final void e0(int i4, int i5) {
        int i10;
        this.quebec.charlie = i5 - this.romeo.kilo();
        am amVar = this.quebec;
        amVar.delta = i4;
        if (this.uniform) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        amVar.echo = i10;
        amVar.foxtrot = -1;
        amVar.bravo = i5;
        amVar.golf = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // androidx.recyclerview.widget.L
    public boolean echo() {
        if (this.papa == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean foxtrot() {
        if (this.papa == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.L
    public final void india(int i4, int i5, b0 b0Var, ae aeVar) {
        int i10;
        if (this.papa != 0) {
            i4 = i5;
        }
        if (whiskey() != 0 && i4 != 0) {
            G();
            if (i4 > 0) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            c0(i10, Math.abs(i4), true, b0Var);
            B(b0Var, this.quebec, aeVar);
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean jade() {
        return true;
    }

    @Override // androidx.recyclerview.widget.L
    public final void juliet(int i4, ae aeVar) {
        boolean z2;
        int i5;
        SavedState savedState = this.zulu;
        int i10 = -1;
        if (savedState != null && (i5 = savedState.alpha) >= 0) {
            z2 = savedState.red;
        } else {
            Y();
            z2 = this.uniform;
            i5 = this.xray;
            if (i5 == -1) {
                i5 = z2 ? i4 - 1 : 0;
            }
        }
        if (!z2) {
            i10 = 1;
        }
        for (int i11 = 0; i11 < this.beige && i5 >= 0 && i5 < i4; i11++) {
            aeVar.alpha(i5, 0);
            i5 += i10;
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final int kilo(b0 b0Var) {
        return C(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public int lima(b0 b0Var) {
        return D(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public int m(int i4, U u4, b0 b0Var) {
        if (this.papa == 1) {
            return 0;
        }
        return Z(i4, u4, b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public int mike(b0 b0Var) {
        return E(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final void n(int i4) {
        this.xray = i4;
        this.yankee = RecyclerView.UNDEFINED_DURATION;
        SavedState savedState = this.zulu;
        if (savedState != null) {
            savedState.alpha = -1;
        }
        l();
    }

    @Override // androidx.recyclerview.widget.L
    public final int november(b0 b0Var) {
        return C(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public int o(int i4, U u4, b0 b0Var) {
        if (this.papa == 0) {
            return 0;
        }
        return Z(i4, u4, b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final void olive(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.L
    public View orange(View view, int i4, U u4, b0 b0Var) {
        int F10;
        View M10;
        View R10;
        Y();
        if (whiskey() != 0 && (F10 = F(i4)) != Integer.MIN_VALUE) {
            G();
            c0(F10, (int) (this.romeo.lima() * 0.33333334f), false, b0Var);
            am amVar = this.quebec;
            amVar.golf = RecyclerView.UNDEFINED_DURATION;
            amVar.alpha = false;
            H(u4, amVar, b0Var, true);
            if (F10 == -1) {
                if (this.uniform) {
                    M10 = M(whiskey() - 1, -1);
                } else {
                    M10 = M(0, whiskey());
                }
            } else if (this.uniform) {
                M10 = M(0, whiskey());
            } else {
                M10 = M(whiskey() - 1, -1);
            }
            if (F10 == -1) {
                R10 = S();
            } else {
                R10 = R();
            }
            if (R10.hasFocusable()) {
                if (M10 != null) {
                    return R10;
                }
            } else {
                return M10;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.L
    public int oscar(b0 b0Var) {
        return D(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public int papa(b0 b0Var) {
        return E(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final void peach(AccessibilityEvent accessibilityEvent) {
        super.peach(accessibilityEvent);
        if (whiskey() > 0) {
            accessibilityEvent.setFromIndex(K());
            accessibilityEvent.setToIndex(L());
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final View romeo(int i4) {
        int whiskey = whiskey();
        if (whiskey == 0) {
            return null;
        }
        int gray = i4 - L.gray(victor(0));
        if (gray >= 0 && gray < whiskey) {
            View victor = victor(gray);
            if (L.gray(victor) == i4) {
                return victor;
            }
        }
        return super.romeo(i4);
    }

    @Override // androidx.recyclerview.widget.L
    public M sierra() {
        return new M(-2, -2);
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean v() {
        if (this.mike != 1073741824 && this.lima != 1073741824) {
            int whiskey = whiskey();
            for (int i4 = 0; i4 < whiskey; i4++) {
                ViewGroup.LayoutParams layoutParams = victor(i4).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.L
    public void x(RecyclerView recyclerView, int i4) {
        ao aoVar = new ao(recyclerView.getContext());
        aoVar.setTargetPosition(i4);
        y(aoVar);
    }

    @Override // androidx.recyclerview.widget.L
    public boolean z() {
        if (this.zulu == null && this.sierra == this.victor) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.recyclerview.widget.al, java.lang.Object] */
    public LinearLayoutManager(int i4, boolean z2) {
        this.papa = 1;
        this.tango = false;
        this.uniform = false;
        this.victor = false;
        this.whiskey = true;
        this.xray = -1;
        this.yankee = RecyclerView.UNDEFINED_DURATION;
        this.zulu = null;
        this.amber = new ak();
        this.azure = new Object();
        this.beige = 2;
        this.black = new int[2];
        a0(i4);
        charlie(null);
        if (z2 == this.tango) {
            return;
        }
        this.tango = z2;
        l();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.recyclerview.widget.al, java.lang.Object] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.papa = 1;
        this.tango = false;
        this.uniform = false;
        this.victor = false;
        this.whiskey = true;
        this.xray = -1;
        this.yankee = RecyclerView.UNDEFINED_DURATION;
        this.zulu = null;
        this.amber = new ak();
        this.azure = new Object();
        this.beige = 2;
        this.black = new int[2];
        K green = L.green(context, attributeSet, i4, i5);
        a0(green.alpha);
        boolean z2 = green.charlie;
        charlie(null);
        if (z2 != this.tango) {
            this.tango = z2;
            l();
        }
        b0(green.delta);
    }
}
