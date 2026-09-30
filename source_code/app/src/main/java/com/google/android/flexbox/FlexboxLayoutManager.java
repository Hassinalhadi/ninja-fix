package com.google.android.flexbox;

import F2.n;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.K;
import androidx.recyclerview.widget.L;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.U;
import androidx.recyclerview.widget.Z;
import androidx.recyclerview.widget.ao;
import androidx.recyclerview.widget.as;
import androidx.recyclerview.widget.b0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FlexboxLayoutManager extends L implements Z {
    public static final Rect green = new Rect();
    public K1.g azure;
    public K1.g beige;
    public SavedState black;
    public final Context emerald;
    public View fuchsia;
    public int papa;
    public int quebec;
    public final int romeo;
    public boolean tango;
    public boolean uniform;
    public U xray;
    public b0 yankee;
    public f zulu;
    public final int sierra = -1;
    public List victor = new ArrayList();
    public final b whiskey = new b(this);
    public final d amber = new d(this);
    public int blue = -1;
    public int bronze = RecyclerView.UNDEFINED_DURATION;
    public int coral = RecyclerView.UNDEFINED_DURATION;
    public int crimson = RecyclerView.UNDEFINED_DURATION;
    public final SparseArray cyan = new SparseArray();
    public int gold = -1;
    public final n gray = new Object();

    /* loaded from: classes3.dex */
    public static class LayoutParams extends M implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public float f6625a;

        /* renamed from: b, reason: collision with root package name */
        public int f6626b;

        /* renamed from: c, reason: collision with root package name */
        public int f6627c;

        /* renamed from: d, reason: collision with root package name */
        public int f6628d;
        public int e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f6629f;
        public float teal;
        public float white;
        public int yellow;

        @Override // com.google.android.flexbox.FlexItem
        public final int B() {
            return this.f6628d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int alpha() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int azure() {
            return this.yellow;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float blue() {
            return this.white;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int bravo() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int crimson() {
            return this.f6626b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void green(int i4) {
            this.f6626b = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int indigo() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int jade() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int n() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int navy() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void olive(int i4) {
            this.f6627c = i4;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float purple() {
            return this.teal;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int q() {
            return this.f6627c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean r() {
            return this.f6629f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int t() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            parcel.writeFloat(this.teal);
            parcel.writeFloat(this.white);
            parcel.writeInt(this.yellow);
            parcel.writeFloat(this.f6625a);
            parcel.writeInt(this.f6626b);
            parcel.writeInt(this.f6627c);
            parcel.writeInt(this.f6628d);
            parcel.writeInt(this.e);
            parcel.writeByte(this.f6629f ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float yellow() {
            return this.f6625a;
        }
    }

    /* loaded from: classes3.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();
        public int alpha;
        public int purple;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SavedState{mAnchorPosition=");
            sb2.append(this.alpha);
            sb2.append(", mAnchorOffset=");
            return Q0.c.quebec(sb2, this.purple, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.purple);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, F2.n] */
    public FlexboxLayoutManager(Context context) {
        U(1);
        V();
        if (this.romeo != 4) {
            g();
            this.victor.clear();
            d dVar = this.amber;
            d.bravo(dVar);
            dVar.delta = 0;
            this.romeo = 4;
            l();
        }
        this.emerald = context;
    }

    public static boolean lavender(int i4, int i5, int i10) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (i10 > 0 && i4 != i10) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i4) {
                return false;
            }
            return true;
        }
        if (size < i4) {
            return false;
        }
        return true;
    }

    public final int A(b0 b0Var) {
        if (whiskey() != 0) {
            int bravo = b0Var.bravo();
            D();
            View F10 = F(bravo);
            View H10 = H(bravo);
            if (b0Var.bravo() != 0 && F10 != null && H10 != null) {
                return Math.min(this.azure.lima(), this.azure.bravo(H10) - this.azure.echo(F10));
            }
            return 0;
        }
        return 0;
    }

    public final int B(b0 b0Var) {
        if (whiskey() != 0) {
            int bravo = b0Var.bravo();
            View F10 = F(bravo);
            View H10 = H(bravo);
            if (b0Var.bravo() != 0 && F10 != null && H10 != null) {
                int gray = L.gray(F10);
                int gray2 = L.gray(H10);
                int abs = Math.abs(this.azure.bravo(H10) - this.azure.echo(F10));
                int i4 = this.whiskey.charlie[gray];
                if (i4 != 0 && i4 != -1) {
                    return Math.round((i4 * (abs / ((r3[gray2] - i4) + 1))) + (this.azure.kilo() - this.azure.echo(F10)));
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    public final int C(b0 b0Var) {
        int gray;
        if (whiskey() != 0) {
            int bravo = b0Var.bravo();
            View F10 = F(bravo);
            View H10 = H(bravo);
            if (b0Var.bravo() != 0 && F10 != null && H10 != null) {
                View J4 = J(0, whiskey());
                int i4 = -1;
                if (J4 == null) {
                    gray = -1;
                } else {
                    gray = L.gray(J4);
                }
                View J10 = J(whiskey() - 1, -1);
                if (J10 != null) {
                    i4 = L.gray(J10);
                }
                return (int) ((Math.abs(this.azure.bravo(H10) - this.azure.echo(F10)) / ((i4 - gray) + 1)) * b0Var.bravo());
            }
        }
        return 0;
    }

    public final void D() {
        if (this.azure != null) {
            return;
        }
        if (S()) {
            if (this.quebec == 0) {
                this.azure = new as(this, 0);
                this.beige = new as(this, 1);
                return;
            } else {
                this.azure = new as(this, 1);
                this.beige = new as(this, 0);
                return;
            }
        }
        if (this.quebec == 0) {
            this.azure = new as(this, 1);
            this.beige = new as(this, 0);
        } else {
            this.azure = new as(this, 0);
            this.beige = new as(this, 1);
        }
    }

    public final int E(U u4, b0 b0Var, f fVar) {
        int i4;
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        b bVar;
        float f5;
        int i14;
        Rect rect;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int i18;
        int i19;
        int i20;
        b bVar2;
        Rect rect2;
        int i21;
        int i22 = fVar.foxtrot;
        if (i22 != Integer.MIN_VALUE) {
            int i23 = fVar.alpha;
            if (i23 < 0) {
                fVar.foxtrot = i22 + i23;
            }
            T(u4, fVar);
        }
        int i24 = fVar.alpha;
        boolean S6 = S();
        int i25 = i24;
        int i26 = 0;
        while (true) {
            if (i25 <= 0 && !this.zulu.bravo) {
                break;
            }
            List list = this.victor;
            int i27 = fVar.delta;
            if (i27 < 0 || i27 >= b0Var.bravo() || (i4 = fVar.charlie) < 0 || i4 >= list.size()) {
                break;
            }
            a aVar = (a) this.victor.get(fVar.charlie);
            fVar.delta = aVar.kilo;
            boolean S10 = S();
            d dVar = this.amber;
            b bVar3 = this.whiskey;
            Rect rect3 = green;
            if (S10) {
                int emerald = emerald();
                int fuchsia = fuchsia();
                int i28 = this.november;
                int i29 = fVar.echo;
                if (fVar.hotel == -1) {
                    i29 -= aVar.charlie;
                }
                int i30 = i29;
                int i31 = fVar.delta;
                float f10 = dVar.delta;
                float f11 = emerald - f10;
                float f12 = (i28 - fuchsia) - f10;
                float max = Math.max(0.0f, 0.0f);
                int i32 = aVar.delta;
                i5 = i24;
                int i33 = i31;
                int i34 = 0;
                while (i33 < i31 + i32) {
                    int i35 = i33;
                    View O3 = O(i35);
                    if (O3 == null) {
                        i18 = i34;
                        i21 = i35;
                        z10 = S6;
                        i19 = i32;
                        i20 = i31;
                        bVar2 = bVar3;
                        rect2 = rect3;
                    } else {
                        z10 = S6;
                        if (fVar.hotel == 1) {
                            delta(O3, rect3);
                            bravo(O3, -1, false);
                        } else {
                            delta(O3, rect3);
                            bravo(O3, i34, false);
                            i34++;
                        }
                        float f13 = f12;
                        long j5 = bVar3.delta[i35];
                        int i36 = (int) j5;
                        int i37 = (int) (j5 >> 32);
                        if (W(O3, i36, i37, (LayoutParams) O3.getLayoutParams())) {
                            O3.measure(i36, i37);
                        }
                        float f14 = f11 + ((ViewGroup.MarginLayoutParams) r6).leftMargin + ((M) O3.getLayoutParams()).purple.left;
                        float f15 = f13 - (((ViewGroup.MarginLayoutParams) r6).rightMargin + ((M) O3.getLayoutParams()).purple.right);
                        int i38 = i30 + ((M) O3.getLayoutParams()).purple.top;
                        i18 = i34;
                        if (this.tango) {
                            i19 = i32;
                            i20 = i31;
                            rect2 = rect3;
                            i21 = i35;
                            bVar2 = bVar3;
                            this.whiskey.kilo(O3, aVar, Math.round(f15) - O3.getMeasuredWidth(), i38, Math.round(f15), O3.getMeasuredHeight() + i38);
                        } else {
                            i19 = i32;
                            i20 = i31;
                            bVar2 = bVar3;
                            rect2 = rect3;
                            i21 = i35;
                            this.whiskey.kilo(O3, aVar, Math.round(f14), i38, O3.getMeasuredWidth() + Math.round(f14), O3.getMeasuredHeight() + i38);
                        }
                        float measuredWidth = O3.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).rightMargin + ((M) O3.getLayoutParams()).purple.right + max + f14;
                        f12 = f15 - (((O3.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).leftMargin) + ((M) O3.getLayoutParams()).purple.left) + max);
                        f11 = measuredWidth;
                    }
                    i33 = i21 + 1;
                    bVar3 = bVar2;
                    i31 = i20;
                    S6 = z10;
                    i34 = i18;
                    i32 = i19;
                    rect3 = rect2;
                }
                z2 = S6;
                fVar.charlie += this.zulu.hotel;
                i13 = aVar.charlie;
                i12 = i25;
            } else {
                i5 = i24;
                z2 = S6;
                b bVar4 = bVar3;
                Rect rect4 = rect3;
                int gold = gold();
                int cyan = cyan();
                int i39 = this.oscar;
                int i40 = fVar.echo;
                if (fVar.hotel == -1) {
                    int i41 = aVar.charlie;
                    i11 = i40 + i41;
                    i10 = i40 - i41;
                } else {
                    i10 = i40;
                    i11 = i10;
                }
                int i42 = fVar.delta;
                float f16 = i39 - cyan;
                float f17 = dVar.delta;
                float f18 = gold - f17;
                float f19 = f16 - f17;
                float max2 = Math.max(0.0f, 0.0f);
                int i43 = aVar.delta;
                float f20 = f19;
                int i44 = i42;
                int i45 = 0;
                while (i44 < i42 + i43) {
                    int i46 = i42;
                    View O4 = O(i44);
                    if (O4 == null) {
                        bVar = bVar4;
                        i14 = i25;
                        i15 = i43;
                        i16 = i44;
                        i17 = i46;
                        rect = rect4;
                    } else {
                        bVar = bVar4;
                        float f21 = f18;
                        long j6 = bVar4.delta[i44];
                        int i47 = (int) j6;
                        int i48 = (int) (j6 >> 32);
                        if (W(O4, i47, i48, (LayoutParams) O4.getLayoutParams())) {
                            O4.measure(i47, i48);
                        }
                        float f22 = f21 + ((ViewGroup.MarginLayoutParams) r4).topMargin + ((M) O4.getLayoutParams()).purple.top;
                        float f23 = f20 - (((ViewGroup.MarginLayoutParams) r4).rightMargin + ((M) O4.getLayoutParams()).purple.bottom);
                        if (fVar.hotel == 1) {
                            rect = rect4;
                            delta(O4, rect);
                            f5 = f23;
                            i14 = i25;
                            bravo(O4, -1, false);
                        } else {
                            f5 = f23;
                            i14 = i25;
                            rect = rect4;
                            delta(O4, rect);
                            bravo(O4, i45, false);
                            i45++;
                        }
                        int i49 = i10 + ((M) O4.getLayoutParams()).purple.left;
                        int i50 = i11 - ((M) O4.getLayoutParams()).purple.right;
                        boolean z11 = this.tango;
                        if (z11) {
                            if (this.uniform) {
                                i15 = i43;
                                i17 = i46;
                                i16 = i44;
                                this.whiskey.lima(O4, aVar, z11, i50 - O4.getMeasuredWidth(), Math.round(f5) - O4.getMeasuredHeight(), i50, Math.round(f5));
                            } else {
                                i15 = i43;
                                i16 = i44;
                                i17 = i46;
                                this.whiskey.lima(O4, aVar, z11, i50 - O4.getMeasuredWidth(), Math.round(f22), i50, O4.getMeasuredHeight() + Math.round(f22));
                            }
                        } else {
                            i15 = i43;
                            i16 = i44;
                            i17 = i46;
                            if (this.uniform) {
                                this.whiskey.lima(O4, aVar, z11, i49, Math.round(f5) - O4.getMeasuredHeight(), O4.getMeasuredWidth() + i49, Math.round(f5));
                            } else {
                                this.whiskey.lima(O4, aVar, z11, i49, Math.round(f22), O4.getMeasuredWidth() + i49, O4.getMeasuredHeight() + Math.round(f22));
                            }
                        }
                        f20 = f5 - (((O4.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).bottomMargin) + ((M) O4.getLayoutParams()).purple.top) + max2);
                        f18 = O4.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).topMargin + ((M) O4.getLayoutParams()).purple.bottom + max2 + f22;
                    }
                    i44 = i16 + 1;
                    rect4 = rect;
                    i42 = i17;
                    i25 = i14;
                    bVar4 = bVar;
                    i43 = i15;
                }
                i12 = i25;
                fVar.charlie += this.zulu.hotel;
                i13 = aVar.charlie;
            }
            i26 += i13;
            if (!z2 && this.tango) {
                fVar.echo -= aVar.charlie * fVar.hotel;
            } else {
                fVar.echo += aVar.charlie * fVar.hotel;
            }
            i25 = i12 - aVar.charlie;
            i24 = i5;
            S6 = z2;
        }
        int i51 = i24;
        int i52 = fVar.alpha - i26;
        fVar.alpha = i52;
        int i53 = fVar.foxtrot;
        if (i53 != Integer.MIN_VALUE) {
            int i54 = i53 + i26;
            fVar.foxtrot = i54;
            if (i52 < 0) {
                fVar.foxtrot = i54 + i52;
            }
            T(u4, fVar);
        }
        return i51 - fVar.alpha;
    }

    public final View F(int i4) {
        View K6 = K(0, whiskey(), i4);
        if (K6 != null) {
            int i5 = this.whiskey.charlie[L.gray(K6)];
            if (i5 == -1) {
                return null;
            }
            return G(K6, (a) this.victor.get(i5));
        }
        return null;
    }

    public final View G(View view, a aVar) {
        boolean S6 = S();
        int i4 = aVar.delta;
        for (int i5 = 1; i5 < i4; i5++) {
            View victor = victor(i5);
            if (victor != null && victor.getVisibility() != 8) {
                if (this.tango && !S6) {
                    if (this.azure.bravo(view) >= this.azure.bravo(victor)) {
                    }
                    view = victor;
                } else {
                    if (this.azure.echo(view) <= this.azure.echo(victor)) {
                    }
                    view = victor;
                }
            }
        }
        return view;
    }

    public final View H(int i4) {
        View K6 = K(whiskey() - 1, -1, i4);
        if (K6 == null) {
            return null;
        }
        return I(K6, (a) this.victor.get(this.whiskey.charlie[L.gray(K6)]));
    }

    public final View I(View view, a aVar) {
        boolean S6 = S();
        int whiskey = (whiskey() - aVar.delta) - 1;
        for (int whiskey2 = whiskey() - 2; whiskey2 > whiskey; whiskey2--) {
            View victor = victor(whiskey2);
            if (victor != null && victor.getVisibility() != 8) {
                if (this.tango && !S6) {
                    if (this.azure.echo(view) <= this.azure.echo(victor)) {
                    }
                    view = victor;
                } else {
                    if (this.azure.bravo(view) >= this.azure.bravo(victor)) {
                    }
                    view = victor;
                }
            }
        }
        return view;
    }

    public final View J(int i4, int i5) {
        int i10;
        boolean z2;
        if (i5 > i4) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        while (i4 != i5) {
            View victor = victor(i4);
            int emerald = emerald();
            int gold = gold();
            int fuchsia = this.november - fuchsia();
            int cyan = this.oscar - cyan();
            int azure = L.azure(victor) - ((ViewGroup.MarginLayoutParams) ((M) victor.getLayoutParams())).leftMargin;
            int bronze = L.bronze(victor) - ((ViewGroup.MarginLayoutParams) ((M) victor.getLayoutParams())).topMargin;
            int blue = L.blue(victor) + ((ViewGroup.MarginLayoutParams) ((M) victor.getLayoutParams())).rightMargin;
            int zulu = L.zulu(victor) + ((ViewGroup.MarginLayoutParams) ((M) victor.getLayoutParams())).bottomMargin;
            boolean z10 = false;
            if (azure < fuchsia && blue < emerald) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (bronze >= cyan || zulu >= gold) {
                z10 = true;
            }
            if (z2 && z10) {
                return victor;
            }
            i4 += i10;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.flexbox.f, java.lang.Object] */
    public final View K(int i4, int i5, int i10) {
        int gray;
        D();
        int i11 = 1;
        if (this.zulu == null) {
            ?? obj = new Object();
            obj.hotel = 1;
            this.zulu = obj;
        }
        int kilo = this.azure.kilo();
        int golf = this.azure.golf();
        if (i5 <= i4) {
            i11 = -1;
        }
        View view = null;
        View view2 = null;
        while (i4 != i5) {
            View victor = victor(i4);
            if (victor != null && (gray = L.gray(victor)) >= 0 && gray < i10) {
                if (((M) victor.getLayoutParams()).alpha.isRemoved()) {
                    if (view2 == null) {
                        view2 = victor;
                    }
                } else {
                    if (this.azure.echo(victor) >= kilo && this.azure.bravo(victor) <= golf) {
                        return victor;
                    }
                    if (view == null) {
                        view = victor;
                    }
                }
            }
            i4 += i11;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public final int L(int i4, U u4, b0 b0Var, boolean z2) {
        int i5;
        int golf;
        if (!S() && this.tango) {
            int kilo = i4 - this.azure.kilo();
            if (kilo > 0) {
                i5 = Q(kilo, u4, b0Var);
            } else {
                return 0;
            }
        } else {
            int golf2 = this.azure.golf() - i4;
            if (golf2 > 0) {
                i5 = -Q(-golf2, u4, b0Var);
            } else {
                return 0;
            }
        }
        int i10 = i4 + i5;
        if (z2 && (golf = this.azure.golf() - i10) > 0) {
            this.azure.papa(golf);
            return golf + i5;
        }
        return i5;
    }

    public final int M(int i4, U u4, b0 b0Var, boolean z2) {
        int i5;
        int kilo;
        if (!S() && this.tango) {
            int golf = this.azure.golf() - i4;
            if (golf > 0) {
                i5 = Q(-golf, u4, b0Var);
            } else {
                return 0;
            }
        } else {
            int kilo2 = i4 - this.azure.kilo();
            if (kilo2 > 0) {
                i5 = -Q(kilo2, u4, b0Var);
            } else {
                return 0;
            }
        }
        int i10 = i4 + i5;
        if (z2 && (kilo = i10 - this.azure.kilo()) > 0) {
            this.azure.papa(-kilo);
            return i5 - kilo;
        }
        return i5;
    }

    public final int N(View view) {
        if (S()) {
            return ((M) view.getLayoutParams()).purple.top + ((M) view.getLayoutParams()).purple.bottom;
        }
        return ((M) view.getLayoutParams()).purple.left + ((M) view.getLayoutParams()).purple.right;
    }

    public final View O(int i4) {
        View view = (View) this.cyan.get(i4);
        if (view != null) {
            return view;
        }
        return this.xray.delta(i4);
    }

    public final int P() {
        if (this.victor.size() == 0) {
            return 0;
        }
        int size = this.victor.size();
        int i4 = RecyclerView.UNDEFINED_DURATION;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = Math.max(i4, ((a) this.victor.get(i5)).alpha);
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int Q(int i4, U u4, b0 b0Var) {
        boolean z2;
        int i5;
        boolean z10;
        int i10;
        int E4;
        int i11;
        if (whiskey() != 0 && i4 != 0) {
            D();
            this.zulu.india = true;
            if (!S() && this.tango) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 ? i4 > 0 : i4 < 0) {
                i5 = 1;
            } else {
                i5 = -1;
            }
            int abs = Math.abs(i4);
            this.zulu.hotel = i5;
            boolean S6 = S();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.november, this.lima);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.oscar, this.mike);
            if (!S6 && this.tango) {
                z10 = true;
            } else {
                z10 = false;
            }
            b bVar = this.whiskey;
            if (i5 == 1) {
                View victor = victor(whiskey() - 1);
                if (victor != null) {
                    this.zulu.echo = this.azure.bravo(victor);
                    int gray = L.gray(victor);
                    View I4 = I(victor, (a) this.victor.get(bVar.charlie[gray]));
                    f fVar = this.zulu;
                    fVar.getClass();
                    int i12 = gray + 1;
                    fVar.delta = i12;
                    int[] iArr = bVar.charlie;
                    if (iArr.length <= i12) {
                        fVar.charlie = -1;
                    } else {
                        fVar.charlie = iArr[i12];
                    }
                    if (z10) {
                        fVar.echo = this.azure.echo(I4);
                        this.zulu.foxtrot = this.azure.kilo() + (-this.azure.echo(I4));
                        f fVar2 = this.zulu;
                        fVar2.foxtrot = Math.max(fVar2.foxtrot, 0);
                    } else {
                        fVar.echo = this.azure.bravo(I4);
                        this.zulu.foxtrot = this.azure.bravo(I4) - this.azure.golf();
                    }
                    int i13 = this.zulu.charlie;
                    if ((i13 == -1 || i13 > this.victor.size() - 1) && this.zulu.delta <= this.yankee.bravo()) {
                        f fVar3 = this.zulu;
                        int i14 = abs - fVar3.foxtrot;
                        n nVar = this.gray;
                        nVar.alpha = null;
                        if (i14 > 0) {
                            if (S6) {
                                this.whiskey.alpha(nVar, makeMeasureSpec, makeMeasureSpec2, i14, fVar3.delta, -1, this.victor);
                            } else {
                                this.whiskey.alpha(nVar, makeMeasureSpec2, makeMeasureSpec, i14, fVar3.delta, -1, this.victor);
                                makeMeasureSpec2 = makeMeasureSpec2;
                                makeMeasureSpec = makeMeasureSpec;
                            }
                            bVar.delta(makeMeasureSpec, makeMeasureSpec2, this.zulu.delta);
                            bVar.papa(this.zulu.delta);
                        }
                    }
                    f fVar4 = this.zulu;
                    fVar4.alpha = abs - fVar4.foxtrot;
                }
                f fVar5 = this.zulu;
                E4 = E(u4, b0Var, fVar5) + fVar5.foxtrot;
                if (E4 >= 0) {
                    if (z2) {
                        if (abs > E4) {
                            i11 = (-i5) * E4;
                        }
                        i11 = i4;
                    } else {
                        if (abs > E4) {
                            i11 = i5 * E4;
                        }
                        i11 = i4;
                    }
                    this.azure.papa(-i11);
                    this.zulu.golf = i11;
                    return i11;
                }
            } else {
                View victor2 = victor(0);
                if (victor2 != null) {
                    this.zulu.echo = this.azure.echo(victor2);
                    int gray2 = L.gray(victor2);
                    View G9 = G(victor2, (a) this.victor.get(bVar.charlie[gray2]));
                    f fVar6 = this.zulu;
                    fVar6.getClass();
                    int i15 = bVar.charlie[gray2];
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        this.zulu.delta = gray2 - ((a) this.victor.get(i15 - 1)).delta;
                    } else {
                        fVar6.delta = -1;
                    }
                    f fVar7 = this.zulu;
                    if (i15 > 0) {
                        i10 = i15 - 1;
                    } else {
                        i10 = 0;
                    }
                    fVar7.charlie = i10;
                    if (z10) {
                        fVar7.echo = this.azure.bravo(G9);
                        this.zulu.foxtrot = this.azure.bravo(G9) - this.azure.golf();
                        f fVar8 = this.zulu;
                        fVar8.foxtrot = Math.max(fVar8.foxtrot, 0);
                    } else {
                        fVar7.echo = this.azure.echo(G9);
                        this.zulu.foxtrot = this.azure.kilo() + (-this.azure.echo(G9));
                    }
                    f fVar42 = this.zulu;
                    fVar42.alpha = abs - fVar42.foxtrot;
                }
                f fVar52 = this.zulu;
                E4 = E(u4, b0Var, fVar52) + fVar52.foxtrot;
                if (E4 >= 0) {
                }
            }
        }
        return 0;
    }

    public final int R(int i4) {
        int height;
        int i5;
        if (whiskey() != 0 && i4 != 0) {
            D();
            boolean S6 = S();
            View view = this.fuchsia;
            if (S6) {
                height = view.getWidth();
            } else {
                height = view.getHeight();
            }
            if (S6) {
                i5 = this.november;
            } else {
                i5 = this.oscar;
            }
            int crimson = crimson();
            d dVar = this.amber;
            if (crimson == 1) {
                int abs = Math.abs(i4);
                if (i4 < 0) {
                    return -Math.min((i5 + dVar.delta) - height, abs);
                }
                int i10 = dVar.delta;
                if (i10 + i4 > 0) {
                    return -i10;
                }
            } else {
                if (i4 > 0) {
                    return Math.min((i5 - dVar.delta) - height, i4);
                }
                int i11 = dVar.delta;
                if (i11 + i4 < 0) {
                    return -i11;
                }
            }
            return i4;
        }
        return 0;
    }

    public final boolean S() {
        int i4 = this.papa;
        if (i4 == 0 || i4 == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(U u4, f fVar) {
        int whiskey;
        int i4;
        int whiskey2;
        int i5;
        View victor;
        int i10;
        if (fVar.india) {
            int i11 = fVar.hotel;
            int i12 = -1;
            b bVar = this.whiskey;
            if (i11 == -1) {
                if (fVar.foxtrot >= 0 && (whiskey2 = whiskey()) != 0 && (victor = victor(whiskey2 - 1)) != null && (i10 = bVar.charlie[L.gray(victor)]) != -1) {
                    a aVar = (a) this.victor.get(i10);
                    int i13 = i5;
                    while (true) {
                        if (i13 < 0) {
                            break;
                        }
                        View victor2 = victor(i13);
                        if (victor2 != null) {
                            int i14 = fVar.foxtrot;
                            if (!S() && this.tango) {
                                if (this.azure.bravo(victor2) > i14) {
                                    break;
                                }
                                if (aVar.kilo != L.gray(victor2)) {
                                }
                            } else {
                                if (this.azure.echo(victor2) < this.azure.foxtrot() - i14) {
                                    break;
                                }
                                if (aVar.kilo != L.gray(victor2)) {
                                    continue;
                                } else if (i10 <= 0) {
                                    whiskey2 = i13;
                                    break;
                                } else {
                                    i10 += fVar.hotel;
                                    aVar = (a) this.victor.get(i10);
                                    whiskey2 = i13;
                                }
                            }
                        }
                        i13--;
                    }
                    while (i5 >= whiskey2) {
                        View victor3 = victor(i5);
                        if (victor(i5) != null) {
                            this.alpha.juliet(i5);
                        }
                        u4.juliet(victor3);
                        i5--;
                    }
                    return;
                }
                return;
            }
            if (fVar.foxtrot >= 0 && (whiskey = whiskey()) != 0) {
                int i15 = 0;
                View victor4 = victor(0);
                if (victor4 != null && (i4 = bVar.charlie[L.gray(victor4)]) != -1) {
                    a aVar2 = (a) this.victor.get(i4);
                    while (true) {
                        if (i15 >= whiskey) {
                            break;
                        }
                        View victor5 = victor(i15);
                        if (victor5 != null) {
                            int i16 = fVar.foxtrot;
                            if (!S() && this.tango) {
                                if (this.azure.foxtrot() - this.azure.echo(victor5) > i16) {
                                    break;
                                }
                                if (aVar2.lima != L.gray(victor5)) {
                                }
                            } else {
                                if (this.azure.bravo(victor5) > i16) {
                                    break;
                                }
                                if (aVar2.lima != L.gray(victor5)) {
                                    continue;
                                } else if (i4 >= this.victor.size() - 1) {
                                    i12 = i15;
                                    break;
                                } else {
                                    i4 += fVar.hotel;
                                    aVar2 = (a) this.victor.get(i4);
                                    i12 = i15;
                                }
                            }
                        }
                        i15++;
                    }
                    while (i12 >= 0) {
                        View victor6 = victor(i12);
                        if (victor(i12) != null) {
                            this.alpha.juliet(i12);
                        }
                        u4.juliet(victor6);
                        i12--;
                    }
                }
            }
        }
    }

    public final void U(int i4) {
        if (this.papa != i4) {
            g();
            this.papa = i4;
            this.azure = null;
            this.beige = null;
            this.victor.clear();
            d dVar = this.amber;
            d.bravo(dVar);
            dVar.delta = 0;
            l();
        }
    }

    public final void V() {
        int i4 = this.quebec;
        if (i4 != 1) {
            if (i4 == 0) {
                g();
                this.victor.clear();
                d dVar = this.amber;
                d.bravo(dVar);
                dVar.delta = 0;
            }
            this.quebec = 1;
            this.azure = null;
            this.beige = null;
            l();
        }
    }

    public final boolean W(View view, int i4, int i5, LayoutParams layoutParams) {
        if (!view.isLayoutRequested() && this.hotel && lavender(view.getWidth(), i4, ((ViewGroup.MarginLayoutParams) layoutParams).width) && lavender(view.getHeight(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
            return false;
        }
        return true;
    }

    public final void X(int i4) {
        int i5 = -1;
        View J4 = J(whiskey() - 1, -1);
        if (J4 != null) {
            i5 = L.gray(J4);
        }
        if (i4 < i5) {
            int whiskey = whiskey();
            b bVar = this.whiskey;
            bVar.foxtrot(whiskey);
            bVar.golf(whiskey);
            bVar.echo(whiskey);
            if (i4 < bVar.charlie.length) {
                this.gold = i4;
                View victor = victor(0);
                if (victor == null) {
                    return;
                }
                this.blue = L.gray(victor);
                if (!S() && this.tango) {
                    this.bronze = this.azure.hotel() + this.azure.bravo(victor);
                } else {
                    this.bronze = this.azure.echo(victor) - this.azure.kilo();
                }
            }
        }
    }

    public final void Y(d dVar, boolean z2, boolean z10) {
        int i4;
        int i5;
        boolean z11 = false;
        if (z10) {
            if (S()) {
                i5 = this.mike;
            } else {
                i5 = this.lima;
            }
            f fVar = this.zulu;
            if (i5 == 0 || i5 == Integer.MIN_VALUE) {
                z11 = true;
            }
            fVar.bravo = z11;
        } else {
            this.zulu.bravo = false;
        }
        if (!S() && this.tango) {
            this.zulu.alpha = dVar.charlie - fuchsia();
        } else {
            this.zulu.alpha = this.azure.golf() - dVar.charlie;
        }
        f fVar2 = this.zulu;
        fVar2.delta = dVar.alpha;
        fVar2.hotel = 1;
        fVar2.echo = dVar.charlie;
        fVar2.foxtrot = RecyclerView.UNDEFINED_DURATION;
        fVar2.charlie = dVar.bravo;
        if (z2 && this.victor.size() > 1 && (i4 = dVar.bravo) >= 0 && i4 < this.victor.size() - 1) {
            a aVar = (a) this.victor.get(dVar.bravo);
            f fVar3 = this.zulu;
            fVar3.charlie++;
            fVar3.delta += aVar.delta;
        }
    }

    public final void Z(d dVar, boolean z2, boolean z10) {
        int i4;
        boolean z11 = false;
        if (z10) {
            if (S()) {
                i4 = this.mike;
            } else {
                i4 = this.lima;
            }
            f fVar = this.zulu;
            if (i4 == 0 || i4 == Integer.MIN_VALUE) {
                z11 = true;
            }
            fVar.bravo = z11;
        } else {
            this.zulu.bravo = false;
        }
        if (!S() && this.tango) {
            this.zulu.alpha = (this.fuchsia.getWidth() - dVar.charlie) - this.azure.kilo();
        } else {
            this.zulu.alpha = dVar.charlie - this.azure.kilo();
        }
        f fVar2 = this.zulu;
        fVar2.delta = dVar.alpha;
        fVar2.hotel = -1;
        fVar2.echo = dVar.charlie;
        fVar2.foxtrot = RecyclerView.UNDEFINED_DURATION;
        int i5 = dVar.bravo;
        fVar2.charlie = i5;
        if (z2 && i5 > 0) {
            int size = this.victor.size();
            int i10 = dVar.bravo;
            if (size > i10) {
                a aVar = (a) this.victor.get(i10);
                f fVar3 = this.zulu;
                fVar3.charlie--;
                fVar3.delta -= aVar.delta;
            }
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void a(RecyclerView recyclerView, int i4, int i5) {
        X(i4);
        X(i4);
    }

    public final void a0(int i4, View view) {
        this.cyan.put(i4, view);
    }

    @Override // androidx.recyclerview.widget.Z
    public final PointF alpha(int i4) {
        View victor;
        int i5;
        if (whiskey() == 0 || (victor = victor(0)) == null) {
            return null;
        }
        if (i4 < L.gray(victor)) {
            i5 = -1;
        } else {
            i5 = 1;
        }
        if (S()) {
            return new PointF(0.0f, i5);
        }
        return new PointF(i5, 0.0f);
    }

    /* JADX WARN: Type inference failed for: r4v20, types: [com.google.android.flexbox.f, java.lang.Object] */
    @Override // androidx.recyclerview.widget.L
    public final void b(U u4, b0 b0Var) {
        boolean z2;
        boolean z10;
        View F10;
        K1.g gVar;
        int i4;
        View victor;
        boolean z11;
        int echo;
        boolean z12;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        this.xray = u4;
        this.yankee = b0Var;
        int bravo = b0Var.bravo();
        if (bravo != 0 || !b0Var.golf) {
            int crimson = crimson();
            int i14 = this.papa;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            this.tango = false;
                            this.uniform = false;
                        } else {
                            if (crimson == 1) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            this.tango = z16;
                            if (this.quebec == 2) {
                                this.tango = !z16;
                            }
                            this.uniform = true;
                        }
                    } else {
                        if (crimson == 1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.tango = z15;
                        if (this.quebec == 2) {
                            this.tango = !z15;
                        }
                        this.uniform = false;
                    }
                } else {
                    if (crimson != 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.tango = z13;
                    if (this.quebec == 2) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.uniform = z14;
                }
            } else {
                if (crimson == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.tango = z2;
                if (this.quebec == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.uniform = z10;
            }
            D();
            if (this.zulu == null) {
                ?? obj = new Object();
                obj.hotel = 1;
                this.zulu = obj;
            }
            b bVar = this.whiskey;
            bVar.foxtrot(bravo);
            bVar.golf(bravo);
            bVar.echo(bravo);
            this.zulu.india = false;
            SavedState savedState = this.black;
            if (savedState != null && (i13 = savedState.alpha) >= 0 && i13 < bravo) {
                this.blue = i13;
            }
            d dVar = this.amber;
            if (!dVar.foxtrot || this.blue != -1 || savedState != null) {
                d.bravo(dVar);
                SavedState savedState2 = this.black;
                if (!b0Var.golf && (i4 = this.blue) != -1) {
                    if (i4 >= 0 && i4 < b0Var.bravo()) {
                        int i15 = this.blue;
                        dVar.alpha = i15;
                        dVar.bravo = bVar.charlie[i15];
                        SavedState savedState3 = this.black;
                        if (savedState3 != null) {
                            int bravo2 = b0Var.bravo();
                            int i16 = savedState3.alpha;
                            if (i16 >= 0 && i16 < bravo2) {
                                dVar.charlie = this.azure.kilo() + savedState2.purple;
                                dVar.golf = true;
                                dVar.bravo = -1;
                                dVar.foxtrot = true;
                            }
                        }
                        if (this.bronze == Integer.MIN_VALUE) {
                            View romeo = romeo(this.blue);
                            if (romeo != null) {
                                if (this.azure.charlie(romeo) > this.azure.lima()) {
                                    d.alpha(dVar);
                                } else if (this.azure.echo(romeo) - this.azure.kilo() < 0) {
                                    dVar.charlie = this.azure.kilo();
                                    dVar.echo = false;
                                } else if (this.azure.golf() - this.azure.bravo(romeo) < 0) {
                                    dVar.charlie = this.azure.golf();
                                    dVar.echo = true;
                                } else {
                                    if (dVar.echo) {
                                        echo = this.azure.mike() + this.azure.bravo(romeo);
                                    } else {
                                        echo = this.azure.echo(romeo);
                                    }
                                    dVar.charlie = echo;
                                }
                            } else {
                                if (whiskey() > 0 && (victor = victor(0)) != null) {
                                    if (this.blue < L.gray(victor)) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    dVar.echo = z11;
                                }
                                d.alpha(dVar);
                            }
                        } else if (!S() && this.tango) {
                            dVar.charlie = this.bronze - this.azure.hotel();
                        } else {
                            dVar.charlie = this.azure.kilo() + this.bronze;
                        }
                        dVar.foxtrot = true;
                    } else {
                        this.blue = -1;
                        this.bronze = RecyclerView.UNDEFINED_DURATION;
                    }
                }
                if (whiskey() != 0) {
                    if (dVar.echo) {
                        F10 = H(b0Var.bravo());
                    } else {
                        F10 = F(b0Var.bravo());
                    }
                    if (F10 != null) {
                        FlexboxLayoutManager flexboxLayoutManager = dVar.hotel;
                        if (flexboxLayoutManager.quebec == 0) {
                            gVar = flexboxLayoutManager.beige;
                        } else {
                            gVar = flexboxLayoutManager.azure;
                        }
                        if (!flexboxLayoutManager.S() && flexboxLayoutManager.tango) {
                            if (dVar.echo) {
                                dVar.charlie = gVar.mike() + gVar.echo(F10);
                            } else {
                                dVar.charlie = gVar.bravo(F10);
                            }
                        } else if (dVar.echo) {
                            dVar.charlie = gVar.mike() + gVar.bravo(F10);
                        } else {
                            dVar.charlie = gVar.echo(F10);
                        }
                        int gray = L.gray(F10);
                        dVar.alpha = gray;
                        dVar.golf = false;
                        int[] iArr = flexboxLayoutManager.whiskey.charlie;
                        if (gray == -1) {
                            gray = 0;
                        }
                        int i17 = iArr[gray];
                        if (i17 == -1) {
                            i17 = 0;
                        }
                        dVar.bravo = i17;
                        int size = flexboxLayoutManager.victor.size();
                        int i18 = dVar.bravo;
                        if (size > i18) {
                            dVar.alpha = ((a) flexboxLayoutManager.victor.get(i18)).kilo;
                        }
                        dVar.foxtrot = true;
                    }
                }
                d.alpha(dVar);
                dVar.alpha = 0;
                dVar.bravo = 0;
                dVar.foxtrot = true;
            }
            quebec(u4);
            if (dVar.echo) {
                Z(dVar, false, true);
            } else {
                Y(dVar, false, true);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.november, this.lima);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.oscar, this.mike);
            int i19 = this.november;
            int i20 = this.oscar;
            boolean S6 = S();
            Context context = this.emerald;
            if (S6) {
                int i21 = this.coral;
                if (i21 != Integer.MIN_VALUE && i21 != i19) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f fVar = this.zulu;
                if (fVar.bravo) {
                    i5 = context.getResources().getDisplayMetrics().heightPixels;
                } else {
                    i5 = fVar.alpha;
                }
            } else {
                int i22 = this.crimson;
                if (i22 != Integer.MIN_VALUE && i22 != i20) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f fVar2 = this.zulu;
                if (fVar2.bravo) {
                    i5 = context.getResources().getDisplayMetrics().widthPixels;
                } else {
                    i5 = fVar2.alpha;
                }
            }
            int i23 = i5;
            this.coral = i19;
            this.crimson = i20;
            int i24 = this.gold;
            n nVar = this.gray;
            if (i24 == -1 && (this.blue != -1 || z12)) {
                if (!dVar.echo) {
                    this.victor.clear();
                    nVar.alpha = null;
                    if (S()) {
                        this.whiskey.alpha(this.gray, makeMeasureSpec, makeMeasureSpec2, i23, 0, dVar.alpha, this.victor);
                    } else {
                        this.whiskey.alpha(this.gray, makeMeasureSpec2, makeMeasureSpec, i23, 0, dVar.alpha, this.victor);
                        makeMeasureSpec2 = makeMeasureSpec2;
                        makeMeasureSpec = makeMeasureSpec;
                    }
                    this.victor = nVar.alpha;
                    bVar.delta(makeMeasureSpec, makeMeasureSpec2, 0);
                    bVar.papa(0);
                    int i25 = bVar.charlie[dVar.alpha];
                    dVar.bravo = i25;
                    this.zulu.charlie = i25;
                }
            } else {
                if (i24 != -1) {
                    i10 = Math.min(i24, dVar.alpha);
                } else {
                    i10 = dVar.alpha;
                }
                nVar.alpha = null;
                if (S()) {
                    if (this.victor.size() > 0) {
                        bVar.charlie(i10, this.victor);
                        this.whiskey.alpha(this.gray, makeMeasureSpec, makeMeasureSpec2, i23, i10, dVar.alpha, this.victor);
                    } else {
                        bVar.echo(bravo);
                        this.whiskey.alpha(this.gray, makeMeasureSpec, makeMeasureSpec2, i23, 0, -1, this.victor);
                    }
                } else if (this.victor.size() > 0) {
                    bVar.charlie(i10, this.victor);
                    int i26 = i10;
                    this.whiskey.alpha(this.gray, makeMeasureSpec2, makeMeasureSpec, i23, i26, dVar.alpha, this.victor);
                    makeMeasureSpec2 = makeMeasureSpec2;
                    makeMeasureSpec = makeMeasureSpec;
                    i10 = i26;
                } else {
                    bVar.echo(bravo);
                    this.whiskey.alpha(this.gray, makeMeasureSpec2, makeMeasureSpec, i23, 0, -1, this.victor);
                    makeMeasureSpec2 = makeMeasureSpec2;
                    makeMeasureSpec = makeMeasureSpec;
                }
                this.victor = nVar.alpha;
                bVar.delta(makeMeasureSpec, makeMeasureSpec2, i10);
                bVar.papa(i10);
            }
            E(u4, b0Var, this.zulu);
            if (dVar.echo) {
                i12 = this.zulu.echo;
                Y(dVar, true, false);
                E(u4, b0Var, this.zulu);
                i11 = this.zulu.echo;
            } else {
                i11 = this.zulu.echo;
                Z(dVar, true, false);
                E(u4, b0Var, this.zulu);
                i12 = this.zulu.echo;
            }
            if (whiskey() > 0) {
                if (dVar.echo) {
                    M(L(i11, u4, b0Var, true) + i12, u4, b0Var, false);
                } else {
                    L(M(i12, u4, b0Var, true) + i11, u4, b0Var, false);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void c(b0 b0Var) {
        this.black = null;
        this.blue = -1;
        this.bronze = RecyclerView.UNDEFINED_DURATION;
        this.gold = -1;
        d.bravo(this.amber);
        this.cyan.clear();
    }

    @Override // androidx.recyclerview.widget.L
    public final void d(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.black = (SavedState) parcelable;
            l();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.flexbox.FlexboxLayoutManager$SavedState, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.flexbox.FlexboxLayoutManager$SavedState, android.os.Parcelable, java.lang.Object] */
    @Override // androidx.recyclerview.widget.L
    public final Parcelable e() {
        SavedState savedState = this.black;
        if (savedState != null) {
            ?? obj = new Object();
            obj.alpha = savedState.alpha;
            obj.purple = savedState.purple;
            return obj;
        }
        ?? obj2 = new Object();
        if (whiskey() > 0) {
            View victor = victor(0);
            obj2.alpha = L.gray(victor);
            obj2.purple = this.azure.echo(victor) - this.azure.kilo();
            return obj2;
        }
        obj2.alpha = -1;
        return obj2;
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean echo() {
        int i4;
        if (this.quebec == 0) {
            return S();
        }
        if (S()) {
            int i5 = this.november;
            View view = this.fuchsia;
            if (view != null) {
                i4 = view.getWidth();
            } else {
                i4 = 0;
            }
            if (i5 <= i4) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean foxtrot() {
        int i4;
        if (this.quebec == 0) {
            return !S();
        }
        if (!S()) {
            int i5 = this.oscar;
            View view = this.fuchsia;
            if (view != null) {
                i4 = view.getHeight();
            } else {
                i4 = 0;
            }
            if (i5 <= i4) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean golf(M m4) {
        return m4 instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean jade() {
        return true;
    }

    @Override // androidx.recyclerview.widget.L
    public final int kilo(b0 b0Var) {
        return A(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final int lima(b0 b0Var) {
        return B(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final int m(int i4, U u4, b0 b0Var) {
        if (S() && this.quebec != 0) {
            int R10 = R(i4);
            this.amber.delta += R10;
            this.beige.papa(-R10);
            return R10;
        }
        int Q = Q(i4, u4, b0Var);
        this.cyan.clear();
        return Q;
    }

    @Override // androidx.recyclerview.widget.L
    public final int mike(b0 b0Var) {
        return C(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final void n(int i4) {
        this.blue = i4;
        this.bronze = RecyclerView.UNDEFINED_DURATION;
        SavedState savedState = this.black;
        if (savedState != null) {
            savedState.alpha = -1;
        }
        l();
    }

    @Override // androidx.recyclerview.widget.L
    public final void navy() {
        g();
    }

    @Override // androidx.recyclerview.widget.L
    public final int november(b0 b0Var) {
        return A(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final int o(int i4, U u4, b0 b0Var) {
        if (!S() && (this.quebec != 0 || S())) {
            int R10 = R(i4);
            this.amber.delta += R10;
            this.beige.papa(-R10);
            return R10;
        }
        int Q = Q(i4, u4, b0Var);
        this.cyan.clear();
        return Q;
    }

    @Override // androidx.recyclerview.widget.L
    public final void ochre(RecyclerView recyclerView) {
        this.fuchsia = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.L
    public final void olive(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.L
    public final int oscar(b0 b0Var) {
        return B(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final int papa(b0 b0Var) {
        return C(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final void red(int i4, int i5) {
        X(i4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.flexbox.FlexboxLayoutManager$LayoutParams, androidx.recyclerview.widget.M] */
    @Override // androidx.recyclerview.widget.L
    public final M sierra() {
        ?? m4 = new M(-2, -2);
        m4.teal = 0.0f;
        m4.white = 1.0f;
        m4.yellow = -1;
        m4.f6625a = -1.0f;
        m4.f6628d = 16777215;
        m4.e = 16777215;
        return m4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.flexbox.FlexboxLayoutManager$LayoutParams, androidx.recyclerview.widget.M] */
    @Override // androidx.recyclerview.widget.L
    public final M tango(Context context, AttributeSet attributeSet) {
        ?? m4 = new M(context, attributeSet);
        m4.teal = 0.0f;
        m4.white = 1.0f;
        m4.yellow = -1;
        m4.f6625a = -1.0f;
        m4.f6628d = 16777215;
        m4.e = 16777215;
        return m4;
    }

    @Override // androidx.recyclerview.widget.L
    public final void teal(int i4, int i5) {
        X(Math.min(i4, i5));
    }

    @Override // androidx.recyclerview.widget.L
    public final void white(int i4, int i5) {
        X(i4);
    }

    @Override // androidx.recyclerview.widget.L
    public final void x(RecyclerView recyclerView, int i4) {
        ao aoVar = new ao(recyclerView.getContext());
        aoVar.setTargetPosition(i4);
        y(aoVar);
    }

    @Override // androidx.recyclerview.widget.L
    public final void yellow(int i4) {
        X(i4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, F2.n] */
    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        K green2 = L.green(context, attributeSet, i4, i5);
        int i10 = green2.alpha;
        if (i10 != 0) {
            if (i10 == 1) {
                if (green2.charlie) {
                    U(3);
                } else {
                    U(2);
                }
            }
        } else if (green2.charlie) {
            U(1);
        } else {
            U(0);
        }
        V();
        if (this.romeo != 4) {
            g();
            this.victor.clear();
            d dVar = this.amber;
            d.bravo(dVar);
            dVar.delta = 0;
            this.romeo = 4;
            l();
        }
        this.emerald = context;
    }
}
