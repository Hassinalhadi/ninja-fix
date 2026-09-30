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
import androidx.appcompat.widget.P0;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class StaggeredGridLayoutManager extends L implements Z {
    public final n0 azure;
    public final int beige;
    public boolean black;
    public boolean blue;
    public SavedState bronze;
    public final Rect coral;
    public final k0 crimson;
    public final boolean cyan;
    public int[] emerald;
    public final ab fuchsia;
    public final int papa;
    public final p0[] quebec;
    public final K1.g romeo;
    public final K1.g sierra;
    public final int tango;
    public int uniform;
    public final aj victor;
    public boolean whiskey;
    public final BitSet yankee;
    public boolean xray = false;
    public int zulu = -1;
    public int amber = RecyclerView.UNDEFINED_DURATION;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes3.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public boolean f3130a;
        public int alpha;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3131b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3132c;
        public int purple;
        public int red;
        public int[] silver;
        public int teal;
        public int[] white;
        public ArrayList yellow;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.purple);
            parcel.writeInt(this.red);
            if (this.red > 0) {
                parcel.writeIntArray(this.silver);
            }
            parcel.writeInt(this.teal);
            if (this.teal > 0) {
                parcel.writeIntArray(this.white);
            }
            parcel.writeInt(this.f3130a ? 1 : 0);
            parcel.writeInt(this.f3131b ? 1 : 0);
            parcel.writeInt(this.f3132c ? 1 : 0);
            parcel.writeList(this.yellow);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.recyclerview.widget.n0] */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.recyclerview.widget.aj, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.papa = -1;
        this.whiskey = false;
        ?? obj = new Object();
        this.azure = obj;
        this.beige = 2;
        this.coral = new Rect();
        this.crimson = new k0(this);
        this.cyan = true;
        this.fuchsia = new ab(1, this);
        K green = L.green(context, attributeSet, i4, i5);
        int i10 = green.alpha;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        charlie(null);
        if (i10 != this.tango) {
            this.tango = i10;
            K1.g gVar = this.romeo;
            this.romeo = this.sierra;
            this.sierra = gVar;
            l();
        }
        int i11 = green.bravo;
        charlie(null);
        if (i11 != this.papa) {
            obj.alpha();
            l();
            this.papa = i11;
            this.yankee = new BitSet(this.papa);
            this.quebec = new p0[this.papa];
            for (int i12 = 0; i12 < this.papa; i12++) {
                this.quebec[i12] = new p0(this, i12);
            }
            l();
        }
        boolean z2 = green.charlie;
        charlie(null);
        SavedState savedState = this.bronze;
        if (savedState != null && savedState.f3130a != z2) {
            savedState.f3130a = z2;
        }
        this.whiskey = z2;
        l();
        ?? obj2 = new Object();
        obj2.alpha = true;
        obj2.foxtrot = 0;
        obj2.golf = 0;
        this.victor = obj2;
        this.romeo = K1.g.alpha(this, this.tango);
        this.sierra = K1.g.alpha(this, 1 - this.tango);
    }

    public static int c0(int i4, int i5, int i10) {
        int mode;
        if ((i5 == 0 && i10 == 0) || ((mode = View.MeasureSpec.getMode(i4)) != Integer.MIN_VALUE && mode != 1073741824)) {
            return i4;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - i5) - i10), mode);
    }

    public final boolean A() {
        int J4;
        if (whiskey() != 0 && this.beige != 0 && this.golf) {
            if (this.xray) {
                J4 = K();
                J();
            } else {
                J4 = J();
                K();
            }
            n0 n0Var = this.azure;
            if (J4 == 0 && O() != null) {
                n0Var.alpha();
                this.foxtrot = true;
                l();
                return true;
            }
        }
        return false;
    }

    public final int B(b0 b0Var) {
        if (whiskey() == 0) {
            return 0;
        }
        K1.g gVar = this.romeo;
        boolean z2 = !this.cyan;
        return AbstractC0659d.bravo(b0Var, gVar, G(z2), F(z2), this, this.cyan);
    }

    public final int C(b0 b0Var) {
        if (whiskey() == 0) {
            return 0;
        }
        K1.g gVar = this.romeo;
        boolean z2 = !this.cyan;
        return AbstractC0659d.charlie(b0Var, gVar, G(z2), F(z2), this, this.cyan, this.xray);
    }

    public final int D(b0 b0Var) {
        if (whiskey() == 0) {
            return 0;
        }
        K1.g gVar = this.romeo;
        boolean z2 = !this.cyan;
        return AbstractC0659d.delta(b0Var, gVar, G(z2), F(z2), this, this.cyan);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int E(U u4, aj ajVar, b0 b0Var) {
        int i4;
        int kilo;
        int i5;
        int L4;
        int i10;
        p0 p0Var;
        ?? r62;
        int i11;
        int hotel;
        int charlie;
        int kilo2;
        int charlie2;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        int i16 = 1;
        this.yankee.set(0, this.papa, true);
        aj ajVar2 = this.victor;
        if (ajVar2.india) {
            if (ajVar.echo == 1) {
                i4 = LottieConstants.IterateForever;
            } else {
                i4 = RecyclerView.UNDEFINED_DURATION;
            }
        } else if (ajVar.echo == 1) {
            i4 = ajVar.golf + ajVar.bravo;
        } else {
            i4 = ajVar.foxtrot - ajVar.bravo;
        }
        int i17 = ajVar.echo;
        for (int i18 = 0; i18 < this.papa; i18++) {
            if (!this.quebec[i18].alpha.isEmpty()) {
                b0(this.quebec[i18], i17, i4);
            }
        }
        if (this.xray) {
            kilo = this.romeo.golf();
        } else {
            kilo = this.romeo.kilo();
        }
        boolean z2 = false;
        while (true) {
            int i19 = ajVar.charlie;
            if (i19 >= 0 && i19 < b0Var.bravo()) {
                i5 = i16;
            } else {
                i5 = i15;
            }
            if (i5 == 0 || (!ajVar2.india && this.yankee.isEmpty())) {
                break;
            }
            View delta = u4.delta(ajVar.charlie);
            ajVar.charlie += ajVar.delta;
            l0 l0Var = (l0) delta.getLayoutParams();
            int layoutPosition = l0Var.alpha.getLayoutPosition();
            n0 n0Var = this.azure;
            int[] iArr = (int[]) n0Var.alpha;
            if (iArr != null && layoutPosition < iArr.length) {
                i10 = iArr[layoutPosition];
            } else {
                i10 = -1;
            }
            if (i10 == -1) {
                if (S(ajVar.echo)) {
                    i14 = this.papa - i16;
                    i13 = -1;
                    i12 = -1;
                } else {
                    i12 = i16;
                    i13 = this.papa;
                    i14 = i15;
                }
                p0 p0Var2 = null;
                if (ajVar.echo == i16) {
                    int kilo3 = this.romeo.kilo();
                    int i20 = LottieConstants.IterateForever;
                    while (i14 != i13) {
                        p0 p0Var3 = this.quebec[i14];
                        int foxtrot = p0Var3.foxtrot(kilo3);
                        if (foxtrot < i20) {
                            i20 = foxtrot;
                            p0Var2 = p0Var3;
                        }
                        i14 += i12;
                    }
                } else {
                    int golf = this.romeo.golf();
                    int i21 = RecyclerView.UNDEFINED_DURATION;
                    while (i14 != i13) {
                        p0 p0Var4 = this.quebec[i14];
                        int hotel2 = p0Var4.hotel(golf);
                        if (hotel2 > i21) {
                            p0Var2 = p0Var4;
                            i21 = hotel2;
                        }
                        i14 += i12;
                    }
                }
                p0Var = p0Var2;
                n0Var.bravo(layoutPosition);
                ((int[]) n0Var.alpha)[layoutPosition] = p0Var.echo;
            } else {
                p0Var = this.quebec[i10];
            }
            l0Var.teal = p0Var;
            if (ajVar.echo == 1) {
                r62 = 0;
                bravo(delta, -1, false);
            } else {
                r62 = 0;
                bravo(delta, 0, false);
            }
            if (this.tango == 1) {
                i11 = 1;
                Q(delta, L.xray(r62, this.uniform, this.lima, r62, ((ViewGroup.MarginLayoutParams) l0Var).width), L.xray(true, this.oscar, this.mike, cyan() + gold(), ((ViewGroup.MarginLayoutParams) l0Var).height));
            } else {
                i11 = 1;
                Q(delta, L.xray(true, this.november, this.lima, fuchsia() + emerald(), ((ViewGroup.MarginLayoutParams) l0Var).width), L.xray(false, this.uniform, this.mike, 0, ((ViewGroup.MarginLayoutParams) l0Var).height));
            }
            if (ajVar.echo == i11) {
                charlie = p0Var.foxtrot(kilo);
                hotel = this.romeo.charlie(delta) + charlie;
            } else {
                hotel = p0Var.hotel(kilo);
                charlie = hotel - this.romeo.charlie(delta);
            }
            if (ajVar.echo == 1) {
                p0 p0Var5 = l0Var.teal;
                p0Var5.getClass();
                l0 l0Var2 = (l0) delta.getLayoutParams();
                l0Var2.teal = p0Var5;
                ArrayList arrayList = p0Var5.alpha;
                arrayList.add(delta);
                p0Var5.charlie = RecyclerView.UNDEFINED_DURATION;
                if (arrayList.size() == 1) {
                    p0Var5.bravo = RecyclerView.UNDEFINED_DURATION;
                }
                if (l0Var2.alpha.isRemoved() || l0Var2.alpha.isUpdated()) {
                    p0Var5.delta = p0Var5.foxtrot.romeo.charlie(delta) + p0Var5.delta;
                }
            } else {
                p0 p0Var6 = l0Var.teal;
                p0Var6.getClass();
                l0 l0Var3 = (l0) delta.getLayoutParams();
                l0Var3.teal = p0Var6;
                ArrayList arrayList2 = p0Var6.alpha;
                arrayList2.add(0, delta);
                p0Var6.bravo = RecyclerView.UNDEFINED_DURATION;
                if (arrayList2.size() == 1) {
                    p0Var6.charlie = RecyclerView.UNDEFINED_DURATION;
                }
                if (l0Var3.alpha.isRemoved() || l0Var3.alpha.isUpdated()) {
                    p0Var6.delta = p0Var6.foxtrot.romeo.charlie(delta) + p0Var6.delta;
                }
            }
            if (P() && this.tango == 1) {
                charlie2 = this.sierra.golf() - (((this.papa - 1) - p0Var.echo) * this.uniform);
                kilo2 = charlie2 - this.sierra.charlie(delta);
            } else {
                kilo2 = this.sierra.kilo() + (p0Var.echo * this.uniform);
                charlie2 = this.sierra.charlie(delta) + kilo2;
            }
            if (this.tango == 1) {
                L.lime(delta, kilo2, charlie, charlie2, hotel);
            } else {
                L.lime(delta, charlie, kilo2, hotel, charlie2);
            }
            b0(p0Var, ajVar2.echo, i4);
            U(u4, ajVar2);
            if (ajVar2.hotel && delta.hasFocusable()) {
                this.yankee.set(p0Var.echo, false);
            }
            i16 = 1;
            z2 = true;
            i15 = 0;
        }
        if (!z2) {
            U(u4, ajVar2);
        }
        if (ajVar2.echo == -1) {
            L4 = this.romeo.kilo() - M(this.romeo.kilo());
        } else {
            L4 = L(this.romeo.golf()) - this.romeo.golf();
        }
        if (L4 > 0) {
            return Math.min(ajVar.bravo, L4);
        }
        return 0;
    }

    public final View F(boolean z2) {
        int kilo = this.romeo.kilo();
        int golf = this.romeo.golf();
        View view = null;
        for (int whiskey = whiskey() - 1; whiskey >= 0; whiskey--) {
            View victor = victor(whiskey);
            int echo = this.romeo.echo(victor);
            int bravo = this.romeo.bravo(victor);
            if (bravo > kilo && echo < golf) {
                if (bravo > golf && z2) {
                    if (view == null) {
                        view = victor;
                    }
                } else {
                    return victor;
                }
            }
        }
        return view;
    }

    public final View G(boolean z2) {
        int kilo = this.romeo.kilo();
        int golf = this.romeo.golf();
        int whiskey = whiskey();
        View view = null;
        for (int i4 = 0; i4 < whiskey; i4++) {
            View victor = victor(i4);
            int echo = this.romeo.echo(victor);
            if (this.romeo.bravo(victor) > kilo && echo < golf) {
                if (echo < kilo && z2) {
                    if (view == null) {
                        view = victor;
                    }
                } else {
                    return victor;
                }
            }
        }
        return view;
    }

    public final void H(U u4, b0 b0Var, boolean z2) {
        int golf;
        int L4 = L(RecyclerView.UNDEFINED_DURATION);
        if (L4 != Integer.MIN_VALUE && (golf = this.romeo.golf() - L4) > 0) {
            int i4 = golf - (-Y(-golf, u4, b0Var));
            if (z2 && i4 > 0) {
                this.romeo.papa(i4);
            }
        }
    }

    public final void I(U u4, b0 b0Var, boolean z2) {
        int kilo;
        int M10 = M(LottieConstants.IterateForever);
        if (M10 != Integer.MAX_VALUE && (kilo = M10 - this.romeo.kilo()) > 0) {
            int Y10 = kilo - Y(kilo, u4, b0Var);
            if (z2 && Y10 > 0) {
                this.romeo.papa(-Y10);
            }
        }
    }

    public final int J() {
        if (whiskey() == 0) {
            return 0;
        }
        return L.gray(victor(0));
    }

    public final int K() {
        int whiskey = whiskey();
        if (whiskey == 0) {
            return 0;
        }
        return L.gray(victor(whiskey - 1));
    }

    public final int L(int i4) {
        int foxtrot = this.quebec[0].foxtrot(i4);
        for (int i5 = 1; i5 < this.papa; i5++) {
            int foxtrot2 = this.quebec[i5].foxtrot(i4);
            if (foxtrot2 > foxtrot) {
                foxtrot = foxtrot2;
            }
        }
        return foxtrot;
    }

    public final int M(int i4) {
        int hotel = this.quebec[0].hotel(i4);
        for (int i5 = 1; i5 < this.papa; i5++) {
            int hotel2 = this.quebec[i5].hotel(i4);
            if (hotel2 < hotel) {
                hotel = hotel2;
            }
        }
        return hotel;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(int i4, int i5, int i10) {
        int J4;
        int i11;
        int i12;
        n0 n0Var;
        int[] iArr;
        int K6;
        ArrayList arrayList;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        int i13;
        if (this.xray) {
            J4 = K();
        } else {
            J4 = J();
        }
        if (i10 == 8) {
            if (i4 < i5) {
                i11 = i5 + 1;
            } else {
                i11 = i4 + 1;
                i12 = i5;
                n0Var = this.azure;
                iArr = (int[]) n0Var.alpha;
                if (iArr != null && i12 < iArr.length) {
                    arrayList = (ArrayList) n0Var.bravo;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) n0Var.bravo).get(size);
                                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.alpha == i12) {
                                    break;
                                }
                            }
                        }
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                            ((ArrayList) n0Var.bravo).remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                        }
                        int size2 = ((ArrayList) n0Var.bravo).size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size2) {
                                if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) n0Var.bravo).get(i14)).alpha >= i12) {
                                    break;
                                } else {
                                    i14++;
                                }
                            } else {
                                i14 = -1;
                                break;
                            }
                        }
                        if (i14 != -1) {
                            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) n0Var.bravo).get(i14);
                            ((ArrayList) n0Var.bravo).remove(i14);
                            i13 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.alpha;
                            if (i13 == -1) {
                                int[] iArr2 = (int[]) n0Var.alpha;
                                Arrays.fill(iArr2, i12, iArr2.length, -1);
                                int length = ((int[]) n0Var.alpha).length;
                            } else {
                                Arrays.fill((int[]) n0Var.alpha, i12, Math.min(i13 + 1, ((int[]) n0Var.alpha).length), -1);
                            }
                        }
                    }
                    i13 = -1;
                    if (i13 == -1) {
                    }
                }
                if (i10 == 1) {
                    if (i10 != 2) {
                        if (i10 == 8) {
                            n0Var.foxtrot(i4, 1);
                            n0Var.echo(i5, 1);
                        }
                    } else {
                        n0Var.foxtrot(i4, i5);
                    }
                } else {
                    n0Var.echo(i4, i5);
                }
                if (i11 <= J4) {
                    if (this.xray) {
                        K6 = J();
                    } else {
                        K6 = K();
                    }
                    if (i12 <= K6) {
                        l();
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            i11 = i4 + i5;
        }
        i12 = i4;
        n0Var = this.azure;
        iArr = (int[]) n0Var.alpha;
        if (iArr != null) {
            arrayList = (ArrayList) n0Var.bravo;
            if (arrayList != null) {
            }
            i13 = -1;
            if (i13 == -1) {
            }
        }
        if (i10 == 1) {
        }
        if (i11 <= J4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View O() {
        char c3;
        boolean z2;
        boolean z10;
        int whiskey = whiskey();
        int i4 = whiskey - 1;
        BitSet bitSet = new BitSet(this.papa);
        bitSet.set(0, this.papa, true);
        int i5 = -1;
        if (this.tango == 1 && P()) {
            c3 = 1;
        } else {
            c3 = 65535;
        }
        if (this.xray) {
            whiskey = -1;
        } else {
            i4 = 0;
        }
        if (i4 < whiskey) {
            i5 = 1;
        }
        while (i4 != whiskey) {
            View victor = victor(i4);
            l0 l0Var = (l0) victor.getLayoutParams();
            if (bitSet.get(l0Var.teal.echo)) {
                p0 p0Var = l0Var.teal;
                if (this.xray) {
                    int i10 = p0Var.charlie;
                    if (i10 == Integer.MIN_VALUE) {
                        p0Var.alpha();
                        i10 = p0Var.charlie;
                    }
                    if (i10 < this.romeo.golf()) {
                        ((l0) ((View) P0.amber(1, p0Var.alpha)).getLayoutParams()).getClass();
                        return victor;
                    }
                } else {
                    int i11 = p0Var.bravo;
                    if (i11 == Integer.MIN_VALUE) {
                        View view = (View) p0Var.alpha.get(0);
                        l0 l0Var2 = (l0) view.getLayoutParams();
                        p0Var.bravo = p0Var.foxtrot.romeo.echo(view);
                        l0Var2.getClass();
                        i11 = p0Var.bravo;
                    }
                    if (i11 > this.romeo.kilo()) {
                        ((l0) ((View) p0Var.alpha.get(0)).getLayoutParams()).getClass();
                        return victor;
                    }
                }
                bitSet.clear(l0Var.teal.echo);
            }
            i4 += i5;
            if (i4 != whiskey) {
                View victor2 = victor(i4);
                if (this.xray) {
                    int bravo = this.romeo.bravo(victor);
                    int bravo2 = this.romeo.bravo(victor2);
                    if (bravo >= bravo2) {
                        if (bravo == bravo2) {
                            if (l0Var.teal.echo - ((l0) victor2.getLayoutParams()).teal.echo >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (c3 >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z2 == z10) {
                                return victor;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        return victor;
                    }
                } else {
                    int echo = this.romeo.echo(victor);
                    int echo2 = this.romeo.echo(victor2);
                    if (echo <= echo2) {
                        if (echo == echo2) {
                            if (l0Var.teal.echo - ((l0) victor2.getLayoutParams()).teal.echo >= 0) {
                            }
                            if (c3 >= 0) {
                            }
                            if (z2 == z10) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        return victor;
                    }
                }
            }
        }
        return null;
    }

    public final boolean P() {
        if (crimson() == 1) {
            return true;
        }
        return false;
    }

    public final void Q(View view, int i4, int i5) {
        Rect rect = this.coral;
        delta(view, rect);
        l0 l0Var = (l0) view.getLayoutParams();
        int c02 = c0(i4, ((ViewGroup.MarginLayoutParams) l0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) l0Var).rightMargin + rect.right);
        int c03 = c0(i5, ((ViewGroup.MarginLayoutParams) l0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) l0Var).bottomMargin + rect.bottom);
        if (u(view, c02, c03, l0Var)) {
            view.measure(c02, c03);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if (r11 != r16.xray) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0414, code lost:
    
        if (A() != false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.xray != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(U u4, b0 b0Var, boolean z2) {
        boolean z10;
        SavedState savedState;
        int hotel;
        int i4;
        int i5;
        boolean z11;
        boolean z12;
        int kilo;
        int J4;
        int kilo2;
        int kilo3;
        SavedState savedState2 = this.bronze;
        k0 k0Var = this.crimson;
        if ((savedState2 != null || this.zulu != -1) && b0Var.bravo() == 0) {
            h(u4);
            k0Var.alpha();
            return;
        }
        boolean z13 = true;
        if (k0Var.echo && this.zulu == -1 && this.bronze == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        n0 n0Var = this.azure;
        StaggeredGridLayoutManager staggeredGridLayoutManager = k0Var.golf;
        if (z10) {
            k0Var.alpha();
            SavedState savedState3 = this.bronze;
            if (savedState3 != null) {
                int i10 = savedState3.red;
                if (i10 > 0) {
                    if (i10 == this.papa) {
                        for (int i11 = 0; i11 < this.papa; i11++) {
                            this.quebec[i11].bravo();
                            SavedState savedState4 = this.bronze;
                            int i12 = savedState4.silver[i11];
                            if (i12 != Integer.MIN_VALUE) {
                                if (savedState4.f3131b) {
                                    kilo3 = this.romeo.golf();
                                } else {
                                    kilo3 = this.romeo.kilo();
                                }
                                i12 += kilo3;
                            }
                            p0 p0Var = this.quebec[i11];
                            p0Var.bravo = i12;
                            p0Var.charlie = i12;
                        }
                    } else {
                        savedState3.silver = null;
                        savedState3.red = 0;
                        savedState3.teal = 0;
                        savedState3.white = null;
                        savedState3.yellow = null;
                        savedState3.alpha = savedState3.purple;
                    }
                }
                SavedState savedState5 = this.bronze;
                this.blue = savedState5.f3132c;
                boolean z14 = savedState5.f3130a;
                charlie(null);
                SavedState savedState6 = this.bronze;
                if (savedState6 != null && savedState6.f3130a != z14) {
                    savedState6.f3130a = z14;
                }
                this.whiskey = z14;
                l();
                X();
                SavedState savedState7 = this.bronze;
                int i13 = savedState7.alpha;
                if (i13 != -1) {
                    this.zulu = i13;
                    k0Var.charlie = savedState7.f3131b;
                } else {
                    k0Var.charlie = this.xray;
                }
                if (savedState7.teal > 1) {
                    n0Var.alpha = savedState7.white;
                    n0Var.bravo = savedState7.yellow;
                }
            } else {
                X();
                k0Var.charlie = this.xray;
            }
            if (!b0Var.golf && (i5 = this.zulu) != -1) {
                if (i5 >= 0 && i5 < b0Var.bravo()) {
                    SavedState savedState8 = this.bronze;
                    if (savedState8 != null && savedState8.alpha != -1 && savedState8.red >= 1) {
                        k0Var.bravo = RecyclerView.UNDEFINED_DURATION;
                        k0Var.alpha = this.zulu;
                    } else {
                        View romeo = romeo(this.zulu);
                        if (romeo != null) {
                            if (this.xray) {
                                J4 = K();
                            } else {
                                J4 = J();
                            }
                            k0Var.alpha = J4;
                            if (this.amber != Integer.MIN_VALUE) {
                                if (k0Var.charlie) {
                                    k0Var.bravo = (this.romeo.golf() - this.amber) - this.romeo.bravo(romeo);
                                } else {
                                    k0Var.bravo = (this.romeo.kilo() + this.amber) - this.romeo.echo(romeo);
                                }
                            } else if (this.romeo.charlie(romeo) > this.romeo.lima()) {
                                if (k0Var.charlie) {
                                    kilo2 = this.romeo.golf();
                                } else {
                                    kilo2 = this.romeo.kilo();
                                }
                                k0Var.bravo = kilo2;
                            } else {
                                int echo = this.romeo.echo(romeo) - this.romeo.kilo();
                                if (echo < 0) {
                                    k0Var.bravo = -echo;
                                } else {
                                    int golf = this.romeo.golf() - this.romeo.bravo(romeo);
                                    if (golf < 0) {
                                        k0Var.bravo = golf;
                                    } else {
                                        k0Var.bravo = RecyclerView.UNDEFINED_DURATION;
                                    }
                                }
                            }
                        } else {
                            int i14 = this.zulu;
                            k0Var.alpha = i14;
                            int i15 = this.amber;
                            if (i15 == Integer.MIN_VALUE) {
                                if (whiskey() != 0) {
                                    if (i14 < J()) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                }
                                k0Var.charlie = z12;
                                if (z12) {
                                    kilo = staggeredGridLayoutManager.romeo.golf();
                                } else {
                                    kilo = staggeredGridLayoutManager.romeo.kilo();
                                }
                                k0Var.bravo = kilo;
                            } else if (k0Var.charlie) {
                                k0Var.bravo = staggeredGridLayoutManager.romeo.golf() - i15;
                            } else {
                                k0Var.bravo = staggeredGridLayoutManager.romeo.kilo() + i15;
                            }
                            k0Var.delta = true;
                        }
                    }
                    k0Var.echo = true;
                } else {
                    this.zulu = -1;
                    this.amber = RecyclerView.UNDEFINED_DURATION;
                }
            }
            if (this.black) {
                int bravo = b0Var.bravo();
                for (int whiskey = whiskey() - 1; whiskey >= 0; whiskey--) {
                    i4 = L.gray(victor(whiskey));
                    if (i4 >= 0 && i4 < bravo) {
                        break;
                    }
                }
                i4 = 0;
                k0Var.alpha = i4;
                k0Var.bravo = RecyclerView.UNDEFINED_DURATION;
                k0Var.echo = true;
            } else {
                int bravo2 = b0Var.bravo();
                int whiskey2 = whiskey();
                for (int i16 = 0; i16 < whiskey2; i16++) {
                    int gray = L.gray(victor(i16));
                    if (gray >= 0 && gray < bravo2) {
                        i4 = gray;
                        break;
                    }
                }
                i4 = 0;
                k0Var.alpha = i4;
                k0Var.bravo = RecyclerView.UNDEFINED_DURATION;
                k0Var.echo = true;
            }
        }
        if (this.bronze == null && this.zulu == -1 && (k0Var.charlie != this.black || P() != this.blue)) {
            n0Var.alpha();
            k0Var.delta = true;
        }
        if (whiskey() > 0 && ((savedState = this.bronze) == null || savedState.red < 1)) {
            if (k0Var.delta) {
                for (int i17 = 0; i17 < this.papa; i17++) {
                    this.quebec[i17].bravo();
                    int i18 = k0Var.bravo;
                    if (i18 != Integer.MIN_VALUE) {
                        p0 p0Var2 = this.quebec[i17];
                        p0Var2.bravo = i18;
                        p0Var2.charlie = i18;
                    }
                }
            } else if (!z10 && k0Var.foxtrot != null) {
                for (int i19 = 0; i19 < this.papa; i19++) {
                    p0 p0Var3 = this.quebec[i19];
                    p0Var3.bravo();
                    int i20 = k0Var.foxtrot[i19];
                    p0Var3.bravo = i20;
                    p0Var3.charlie = i20;
                }
            } else {
                for (int i21 = 0; i21 < this.papa; i21++) {
                    p0 p0Var4 = this.quebec[i21];
                    boolean z15 = this.xray;
                    int i22 = k0Var.bravo;
                    if (z15) {
                        hotel = p0Var4.foxtrot(RecyclerView.UNDEFINED_DURATION);
                    } else {
                        hotel = p0Var4.hotel(RecyclerView.UNDEFINED_DURATION);
                    }
                    p0Var4.bravo();
                    if (hotel != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = p0Var4.foxtrot;
                        if ((!z15 || hotel >= staggeredGridLayoutManager2.romeo.golf()) && (z15 || hotel <= staggeredGridLayoutManager2.romeo.kilo())) {
                            if (i22 != Integer.MIN_VALUE) {
                                hotel += i22;
                            }
                            p0Var4.charlie = hotel;
                            p0Var4.bravo = hotel;
                        }
                    }
                }
                p0[] p0VarArr = this.quebec;
                int length = p0VarArr.length;
                int[] iArr = k0Var.foxtrot;
                if (iArr == null || iArr.length < length) {
                    k0Var.foxtrot = new int[staggeredGridLayoutManager.quebec.length];
                }
                for (int i23 = 0; i23 < length; i23++) {
                    k0Var.foxtrot[i23] = p0VarArr[i23].hotel(RecyclerView.UNDEFINED_DURATION);
                }
            }
        }
        quebec(u4);
        aj ajVar = this.victor;
        ajVar.alpha = false;
        int lima = this.sierra.lima();
        this.uniform = lima / this.papa;
        View.MeasureSpec.makeMeasureSpec(lima, this.sierra.india());
        a0(k0Var.alpha, b0Var);
        if (k0Var.charlie) {
            Z(-1);
            E(u4, ajVar, b0Var);
            Z(1);
            ajVar.charlie = k0Var.alpha + ajVar.delta;
            E(u4, ajVar, b0Var);
        } else {
            Z(1);
            E(u4, ajVar, b0Var);
            Z(-1);
            ajVar.charlie = k0Var.alpha + ajVar.delta;
            E(u4, ajVar, b0Var);
        }
        if (this.sierra.india() != 1073741824) {
            int whiskey3 = whiskey();
            float f5 = 0.0f;
            for (int i24 = 0; i24 < whiskey3; i24++) {
                View victor = victor(i24);
                float charlie = this.sierra.charlie(victor);
                if (charlie >= f5) {
                    ((l0) victor.getLayoutParams()).getClass();
                    f5 = Math.max(f5, charlie);
                }
            }
            int i25 = this.uniform;
            int round = Math.round(f5 * this.papa);
            if (this.sierra.india() == Integer.MIN_VALUE) {
                round = Math.min(round, this.sierra.lima());
            }
            this.uniform = round / this.papa;
            View.MeasureSpec.makeMeasureSpec(round, this.sierra.india());
            if (this.uniform != i25) {
                for (int i26 = 0; i26 < whiskey3; i26++) {
                    View victor2 = victor(i26);
                    l0 l0Var = (l0) victor2.getLayoutParams();
                    l0Var.getClass();
                    if (P() && this.tango == 1) {
                        int i27 = -((this.papa - 1) - l0Var.teal.echo);
                        victor2.offsetLeftAndRight((this.uniform * i27) - (i27 * i25));
                    } else {
                        int i28 = l0Var.teal.echo;
                        int i29 = this.uniform * i28;
                        int i30 = i28 * i25;
                        if (this.tango == 1) {
                            victor2.offsetLeftAndRight(i29 - i30);
                        } else {
                            victor2.offsetTopAndBottom(i29 - i30);
                        }
                    }
                }
            }
        }
        if (whiskey() > 0) {
            if (this.xray) {
                H(u4, b0Var, true);
                I(u4, b0Var, false);
            } else {
                I(u4, b0Var, true);
                H(u4, b0Var, false);
            }
        }
        if (z2 && !b0Var.golf && this.beige != 0 && whiskey() > 0 && O() != null) {
            RecyclerView recyclerView = this.bravo;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.fuchsia);
            }
        }
        z13 = false;
        if (b0Var.golf) {
            k0Var.alpha();
        }
        this.black = k0Var.charlie;
        this.blue = P();
        if (z13) {
            k0Var.alpha();
            R(u4, b0Var, false);
        }
    }

    public final boolean S(int i4) {
        boolean z2;
        boolean z10;
        boolean z11;
        if (this.tango == 0) {
            if (i4 == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 == this.xray) {
                return false;
            }
            return true;
        }
        if (i4 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == this.xray) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != P()) {
            return false;
        }
        return true;
    }

    public final void T(int i4, b0 b0Var) {
        int J4;
        int i5;
        if (i4 > 0) {
            J4 = K();
            i5 = 1;
        } else {
            J4 = J();
            i5 = -1;
        }
        aj ajVar = this.victor;
        ajVar.alpha = true;
        a0(J4, b0Var);
        Z(i5);
        ajVar.charlie = J4 + ajVar.delta;
        ajVar.bravo = Math.abs(i4);
    }

    public final void U(U u4, aj ajVar) {
        int min;
        int min2;
        if (ajVar.alpha && !ajVar.india) {
            if (ajVar.bravo == 0) {
                if (ajVar.echo == -1) {
                    V(u4, ajVar.golf);
                    return;
                } else {
                    W(u4, ajVar.foxtrot);
                    return;
                }
            }
            int i4 = 1;
            if (ajVar.echo == -1) {
                int i5 = ajVar.foxtrot;
                int hotel = this.quebec[0].hotel(i5);
                while (i4 < this.papa) {
                    int hotel2 = this.quebec[i4].hotel(i5);
                    if (hotel2 > hotel) {
                        hotel = hotel2;
                    }
                    i4++;
                }
                int i10 = i5 - hotel;
                if (i10 < 0) {
                    min2 = ajVar.golf;
                } else {
                    min2 = ajVar.golf - Math.min(i10, ajVar.bravo);
                }
                V(u4, min2);
                return;
            }
            int i11 = ajVar.golf;
            int foxtrot = this.quebec[0].foxtrot(i11);
            while (i4 < this.papa) {
                int foxtrot2 = this.quebec[i4].foxtrot(i11);
                if (foxtrot2 < foxtrot) {
                    foxtrot = foxtrot2;
                }
                i4++;
            }
            int i12 = foxtrot - ajVar.golf;
            if (i12 < 0) {
                min = ajVar.foxtrot;
            } else {
                min = Math.min(i12, ajVar.bravo) + ajVar.foxtrot;
            }
            W(u4, min);
        }
    }

    public final void V(U u4, int i4) {
        for (int whiskey = whiskey() - 1; whiskey >= 0; whiskey--) {
            View victor = victor(whiskey);
            if (this.romeo.echo(victor) >= i4 && this.romeo.oscar(victor) >= i4) {
                l0 l0Var = (l0) victor.getLayoutParams();
                l0Var.getClass();
                if (l0Var.teal.alpha.size() != 1) {
                    p0 p0Var = l0Var.teal;
                    ArrayList arrayList = p0Var.alpha;
                    int size = arrayList.size();
                    View view = (View) arrayList.remove(size - 1);
                    l0 l0Var2 = (l0) view.getLayoutParams();
                    l0Var2.teal = null;
                    if (l0Var2.alpha.isRemoved() || l0Var2.alpha.isUpdated()) {
                        p0Var.delta -= p0Var.foxtrot.romeo.charlie(view);
                    }
                    if (size == 1) {
                        p0Var.bravo = RecyclerView.UNDEFINED_DURATION;
                    }
                    p0Var.charlie = RecyclerView.UNDEFINED_DURATION;
                    j(victor, u4);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void W(U u4, int i4) {
        while (whiskey() > 0) {
            View victor = victor(0);
            if (this.romeo.bravo(victor) <= i4 && this.romeo.november(victor) <= i4) {
                l0 l0Var = (l0) victor.getLayoutParams();
                l0Var.getClass();
                if (l0Var.teal.alpha.size() != 1) {
                    p0 p0Var = l0Var.teal;
                    ArrayList arrayList = p0Var.alpha;
                    View view = (View) arrayList.remove(0);
                    l0 l0Var2 = (l0) view.getLayoutParams();
                    l0Var2.teal = null;
                    if (arrayList.size() == 0) {
                        p0Var.charlie = RecyclerView.UNDEFINED_DURATION;
                    }
                    if (l0Var2.alpha.isRemoved() || l0Var2.alpha.isUpdated()) {
                        p0Var.delta -= p0Var.foxtrot.romeo.charlie(view);
                    }
                    p0Var.bravo = RecyclerView.UNDEFINED_DURATION;
                    j(victor, u4);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void X() {
        if (this.tango != 1 && P()) {
            this.xray = !this.whiskey;
        } else {
            this.xray = this.whiskey;
        }
    }

    public final int Y(int i4, U u4, b0 b0Var) {
        if (whiskey() == 0 || i4 == 0) {
            return 0;
        }
        T(i4, b0Var);
        aj ajVar = this.victor;
        int E4 = E(u4, ajVar, b0Var);
        if (ajVar.bravo >= E4) {
            if (i4 < 0) {
                i4 = -E4;
            } else {
                i4 = E4;
            }
        }
        this.romeo.papa(-i4);
        this.black = this.xray;
        ajVar.bravo = 0;
        U(u4, ajVar);
        return i4;
    }

    public final void Z(int i4) {
        boolean z2;
        aj ajVar = this.victor;
        ajVar.echo = i4;
        boolean z10 = this.xray;
        int i5 = 1;
        if (i4 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z10 != z2) {
            i5 = -1;
        }
        ajVar.delta = i5;
    }

    @Override // androidx.recyclerview.widget.L
    public final void a(RecyclerView recyclerView, int i4, int i5) {
        N(i4, i5, 4);
    }

    public final void a0(int i4, b0 b0Var) {
        boolean z2;
        int i5;
        int i10;
        int i11;
        boolean z10;
        aj ajVar = this.victor;
        boolean z11 = false;
        ajVar.bravo = 0;
        ajVar.charlie = i4;
        ao aoVar = this.echo;
        if (aoVar != null && aoVar.isRunning()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (i11 = b0Var.alpha) != -1) {
            boolean z12 = this.xray;
            if (i11 < i4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12 == z10) {
                i5 = this.romeo.lima();
                i10 = 0;
            } else {
                i10 = this.romeo.lima();
                i5 = 0;
            }
        } else {
            i5 = 0;
            i10 = 0;
        }
        RecyclerView recyclerView = this.bravo;
        if (recyclerView != null && recyclerView.mClipToPadding) {
            ajVar.foxtrot = this.romeo.kilo() - i10;
            ajVar.golf = this.romeo.golf() + i5;
        } else {
            ajVar.golf = this.romeo.foxtrot() + i5;
            ajVar.foxtrot = -i10;
        }
        ajVar.hotel = false;
        ajVar.alpha = true;
        if (this.romeo.india() == 0 && this.romeo.foxtrot() == 0) {
            z11 = true;
        }
        ajVar.india = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if (r4 != r3.xray) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.xray != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // androidx.recyclerview.widget.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF alpha(int i4) {
        boolean z2;
        int i5 = -1;
        if (whiskey() != 0) {
            if (i4 < J()) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        PointF pointF = new PointF();
        if (i5 == 0) {
            return null;
        }
        if (this.tango == 0) {
            pointF.x = i5;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i5;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.L
    public final void b(U u4, b0 b0Var) {
        R(u4, b0Var, true);
    }

    public final void b0(p0 p0Var, int i4, int i5) {
        int i10 = p0Var.delta;
        int i11 = p0Var.echo;
        if (i4 == -1) {
            int i12 = p0Var.bravo;
            if (i12 == Integer.MIN_VALUE) {
                View view = (View) p0Var.alpha.get(0);
                l0 l0Var = (l0) view.getLayoutParams();
                p0Var.bravo = p0Var.foxtrot.romeo.echo(view);
                l0Var.getClass();
                i12 = p0Var.bravo;
            }
            if (i12 + i10 <= i5) {
                this.yankee.set(i11, false);
                return;
            }
            return;
        }
        int i13 = p0Var.charlie;
        if (i13 == Integer.MIN_VALUE) {
            p0Var.alpha();
            i13 = p0Var.charlie;
        }
        if (i13 - i10 >= i5) {
            this.yankee.set(i11, false);
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void c(b0 b0Var) {
        this.zulu = -1;
        this.amber = RecyclerView.UNDEFINED_DURATION;
        this.bronze = null;
        this.crimson.alpha();
    }

    @Override // androidx.recyclerview.widget.L
    public final void charlie(String str) {
        if (this.bronze == null) {
            super.charlie(str);
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void d(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.bronze = savedState;
            if (this.zulu != -1) {
                savedState.silver = null;
                savedState.red = 0;
                savedState.alpha = -1;
                savedState.purple = -1;
                savedState.silver = null;
                savedState.red = 0;
                savedState.teal = 0;
                savedState.white = null;
                savedState.yellow = null;
            }
            l();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, android.os.Parcelable, java.lang.Object] */
    @Override // androidx.recyclerview.widget.L
    public final Parcelable e() {
        int J4;
        View G9;
        int hotel;
        int kilo;
        int[] iArr;
        SavedState savedState = this.bronze;
        if (savedState != null) {
            ?? obj = new Object();
            obj.red = savedState.red;
            obj.alpha = savedState.alpha;
            obj.purple = savedState.purple;
            obj.silver = savedState.silver;
            obj.teal = savedState.teal;
            obj.white = savedState.white;
            obj.f3130a = savedState.f3130a;
            obj.f3131b = savedState.f3131b;
            obj.f3132c = savedState.f3132c;
            obj.yellow = savedState.yellow;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f3130a = this.whiskey;
        obj2.f3131b = this.black;
        obj2.f3132c = this.blue;
        n0 n0Var = this.azure;
        if (n0Var != null && (iArr = (int[]) n0Var.alpha) != null) {
            obj2.white = iArr;
            obj2.teal = iArr.length;
            obj2.yellow = (ArrayList) n0Var.bravo;
        } else {
            obj2.teal = 0;
        }
        int i4 = -1;
        if (whiskey() > 0) {
            if (this.black) {
                J4 = K();
            } else {
                J4 = J();
            }
            obj2.alpha = J4;
            if (this.xray) {
                G9 = F(true);
            } else {
                G9 = G(true);
            }
            if (G9 != null) {
                i4 = L.gray(G9);
            }
            obj2.purple = i4;
            int i5 = this.papa;
            obj2.red = i5;
            obj2.silver = new int[i5];
            for (int i10 = 0; i10 < this.papa; i10++) {
                if (this.black) {
                    hotel = this.quebec[i10].foxtrot(RecyclerView.UNDEFINED_DURATION);
                    if (hotel != Integer.MIN_VALUE) {
                        kilo = this.romeo.golf();
                        hotel -= kilo;
                        obj2.silver[i10] = hotel;
                    } else {
                        obj2.silver[i10] = hotel;
                    }
                } else {
                    hotel = this.quebec[i10].hotel(RecyclerView.UNDEFINED_DURATION);
                    if (hotel != Integer.MIN_VALUE) {
                        kilo = this.romeo.kilo();
                        hotel -= kilo;
                        obj2.silver[i10] = hotel;
                    } else {
                        obj2.silver[i10] = hotel;
                    }
                }
            }
            return obj2;
        }
        obj2.alpha = -1;
        obj2.purple = -1;
        obj2.red = 0;
        return obj2;
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean echo() {
        if (this.tango == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.L
    public final void f(int i4) {
        if (i4 == 0) {
            A();
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean foxtrot() {
        if (this.tango == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean golf(M m4) {
        return m4 instanceof l0;
    }

    @Override // androidx.recyclerview.widget.L
    public final void india(int i4, int i5, b0 b0Var, ae aeVar) {
        aj ajVar;
        int foxtrot;
        int i10;
        if (this.tango != 0) {
            i4 = i5;
        }
        if (whiskey() != 0 && i4 != 0) {
            T(i4, b0Var);
            int[] iArr = this.emerald;
            if (iArr == null || iArr.length < this.papa) {
                this.emerald = new int[this.papa];
            }
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.papa;
                ajVar = this.victor;
                if (i11 >= i13) {
                    break;
                }
                if (ajVar.delta == -1) {
                    foxtrot = ajVar.foxtrot;
                    i10 = this.quebec[i11].hotel(foxtrot);
                } else {
                    foxtrot = this.quebec[i11].foxtrot(ajVar.golf);
                    i10 = ajVar.golf;
                }
                int i14 = foxtrot - i10;
                if (i14 >= 0) {
                    this.emerald[i12] = i14;
                    i12++;
                }
                i11++;
            }
            Arrays.sort(this.emerald, 0, i12);
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = ajVar.charlie;
                if (i16 >= 0 && i16 < b0Var.bravo()) {
                    aeVar.alpha(ajVar.charlie, this.emerald[i15]);
                    ajVar.charlie += ajVar.delta;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean jade() {
        if (this.beige != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.L
    public final int kilo(b0 b0Var) {
        return B(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final int lima(b0 b0Var) {
        return C(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final int m(int i4, U u4, b0 b0Var) {
        return Y(i4, u4, b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final void magenta(int i4) {
        super.magenta(i4);
        for (int i5 = 0; i5 < this.papa; i5++) {
            p0 p0Var = this.quebec[i5];
            int i10 = p0Var.bravo;
            if (i10 != Integer.MIN_VALUE) {
                p0Var.bravo = i10 + i4;
            }
            int i11 = p0Var.charlie;
            if (i11 != Integer.MIN_VALUE) {
                p0Var.charlie = i11 + i4;
            }
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void maroon(int i4) {
        super.maroon(i4);
        for (int i5 = 0; i5 < this.papa; i5++) {
            p0 p0Var = this.quebec[i5];
            int i10 = p0Var.bravo;
            if (i10 != Integer.MIN_VALUE) {
                p0Var.bravo = i10 + i4;
            }
            int i11 = p0Var.charlie;
            if (i11 != Integer.MIN_VALUE) {
                p0Var.charlie = i11 + i4;
            }
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final int mike(b0 b0Var) {
        return D(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final void n(int i4) {
        SavedState savedState = this.bronze;
        if (savedState != null && savedState.alpha != i4) {
            savedState.silver = null;
            savedState.red = 0;
            savedState.alpha = -1;
            savedState.purple = -1;
        }
        this.zulu = i4;
        this.amber = RecyclerView.UNDEFINED_DURATION;
        l();
    }

    @Override // androidx.recyclerview.widget.L
    public final void navy() {
        this.azure.alpha();
        for (int i4 = 0; i4 < this.papa; i4++) {
            this.quebec[i4].bravo();
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final int november(b0 b0Var) {
        return B(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final int o(int i4, U u4, b0 b0Var) {
        return Y(i4, u4, b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final void olive(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.bravo;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.fuchsia);
        }
        for (int i4 = 0; i4 < this.papa; i4++) {
            this.quebec[i4].bravo();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x004f, code lost:
    
        if (r8.tango == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0055, code lost:
    
        if (r8.tango == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0061, code lost:
    
        if (P() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006d, code lost:
    
        if (P() == false) goto L37;
     */
    @Override // androidx.recyclerview.widget.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View orange(View view, int i4, U u4, b0 b0Var) {
        View view2;
        int i5;
        int J4;
        boolean z2;
        boolean z10;
        int delta;
        int delta2;
        int delta3;
        if (whiskey() != 0) {
            RecyclerView recyclerView = this.bravo;
            if (recyclerView == null || (view2 = recyclerView.findContainingItemView(view)) == null || this.alpha.charlie.contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                X();
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 17) {
                            if (i4 != 33) {
                                if (i4 == 66) {
                                }
                            }
                            i5 = Integer.MIN_VALUE;
                        }
                    } else {
                        if (this.tango != 1) {
                        }
                        i5 = 1;
                    }
                } else {
                    if (this.tango != 1) {
                    }
                    i5 = -1;
                }
                if (i5 != Integer.MIN_VALUE) {
                    l0 l0Var = (l0) view2.getLayoutParams();
                    l0Var.getClass();
                    p0 p0Var = l0Var.teal;
                    if (i5 == 1) {
                        J4 = K();
                    } else {
                        J4 = J();
                    }
                    a0(J4, b0Var);
                    Z(i5);
                    aj ajVar = this.victor;
                    ajVar.charlie = ajVar.delta + J4;
                    ajVar.bravo = (int) (this.romeo.lima() * 0.33333334f);
                    ajVar.hotel = true;
                    ajVar.alpha = false;
                    E(u4, ajVar, b0Var);
                    this.black = this.xray;
                    View golf = p0Var.golf(J4, i5);
                    if (golf != null && golf != view2) {
                        return golf;
                    }
                    if (S(i5)) {
                        for (int i10 = this.papa - 1; i10 >= 0; i10--) {
                            View golf2 = this.quebec[i10].golf(J4, i5);
                            if (golf2 != null && golf2 != view2) {
                                return golf2;
                            }
                        }
                    } else {
                        for (int i11 = 0; i11 < this.papa; i11++) {
                            View golf3 = this.quebec[i11].golf(J4, i5);
                            if (golf3 != null && golf3 != view2) {
                                return golf3;
                            }
                        }
                    }
                    boolean z11 = !this.whiskey;
                    if (i5 == -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z11 == z2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        delta = p0Var.charlie();
                    } else {
                        delta = p0Var.delta();
                    }
                    View romeo = romeo(delta);
                    if (romeo != null && romeo != view2) {
                        return romeo;
                    }
                    if (S(i5)) {
                        for (int i12 = this.papa - 1; i12 >= 0; i12--) {
                            if (i12 != p0Var.echo) {
                                if (z10) {
                                    delta3 = this.quebec[i12].charlie();
                                } else {
                                    delta3 = this.quebec[i12].delta();
                                }
                                View romeo2 = romeo(delta3);
                                if (romeo2 != null && romeo2 != view2) {
                                    return romeo2;
                                }
                            }
                        }
                    } else {
                        for (int i13 = 0; i13 < this.papa; i13++) {
                            if (z10) {
                                delta2 = this.quebec[i13].charlie();
                            } else {
                                delta2 = this.quebec[i13].delta();
                            }
                            View romeo3 = romeo(delta2);
                            if (romeo3 != null && romeo3 != view2) {
                                return romeo3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.L
    public final int oscar(b0 b0Var) {
        return C(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final int papa(b0 b0Var) {
        return D(b0Var);
    }

    @Override // androidx.recyclerview.widget.L
    public final void peach(AccessibilityEvent accessibilityEvent) {
        super.peach(accessibilityEvent);
        if (whiskey() > 0) {
            View G9 = G(false);
            View F10 = F(false);
            if (G9 != null && F10 != null) {
                int gray = L.gray(G9);
                int gray2 = L.gray(F10);
                if (gray < gray2) {
                    accessibilityEvent.setFromIndex(gray);
                    accessibilityEvent.setToIndex(gray2);
                } else {
                    accessibilityEvent.setFromIndex(gray2);
                    accessibilityEvent.setToIndex(gray);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.L
    public final void r(Rect rect, int i4, int i5) {
        int hotel;
        int hotel2;
        int i10 = this.papa;
        int fuchsia = fuchsia() + emerald();
        int cyan = cyan() + gold();
        if (this.tango == 1) {
            int height = rect.height() + cyan;
            RecyclerView recyclerView = this.bravo;
            WeakHashMap weakHashMap = s1.au.alpha;
            hotel2 = L.hotel(i5, height, recyclerView.getMinimumHeight());
            hotel = L.hotel(i4, (this.uniform * i10) + fuchsia, this.bravo.getMinimumWidth());
        } else {
            int width = rect.width() + fuchsia;
            RecyclerView recyclerView2 = this.bravo;
            WeakHashMap weakHashMap2 = s1.au.alpha;
            hotel = L.hotel(i4, width, recyclerView2.getMinimumWidth());
            hotel2 = L.hotel(i5, (this.uniform * i10) + cyan, this.bravo.getMinimumHeight());
        }
        this.bravo.setMeasuredDimension(hotel, hotel2);
    }

    @Override // androidx.recyclerview.widget.L
    public final void red(int i4, int i5) {
        N(i4, i5, 1);
    }

    @Override // androidx.recyclerview.widget.L
    public final M sierra() {
        if (this.tango == 0) {
            return new M(-2, -1);
        }
        return new M(-1, -2);
    }

    @Override // androidx.recyclerview.widget.L
    public final void silver() {
        this.azure.alpha();
        l();
    }

    @Override // androidx.recyclerview.widget.L
    public final M tango(Context context, AttributeSet attributeSet) {
        return new M(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.L
    public final void teal(int i4, int i5) {
        N(i4, i5, 8);
    }

    @Override // androidx.recyclerview.widget.L
    public final M uniform(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new M((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new M(layoutParams);
    }

    @Override // androidx.recyclerview.widget.L
    public final void white(int i4, int i5) {
        N(i4, i5, 2);
    }

    @Override // androidx.recyclerview.widget.L
    public final void x(RecyclerView recyclerView, int i4) {
        ao aoVar = new ao(recyclerView.getContext());
        aoVar.setTargetPosition(i4);
        y(aoVar);
    }

    @Override // androidx.recyclerview.widget.L
    public final boolean z() {
        if (this.bronze == null) {
            return true;
        }
        return false;
    }
}
