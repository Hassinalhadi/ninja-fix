package com.google.android.flexbox;

import F2.n;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.L;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import ao.ad;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import s1.au;

/* loaded from: classes3.dex */
public final class b {
    public final FlexboxLayoutManager alpha;
    public boolean[] bravo;
    public int[] charlie;
    public long[] delta;
    public long[] echo;

    public b(FlexboxLayoutManager flexboxLayoutManager) {
        this.alpha = flexboxLayoutManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0272, code lost:
    
        if (r6 < (r5 + r10)) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0377  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(n nVar, int i4, int i5, int i10, int i11, int i12, List list) {
        List list2;
        boolean z2;
        int gold;
        int cyan;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        int i15;
        int i16;
        int alpha;
        FlexItem flexItem;
        int i17;
        int i18;
        int i19;
        int measuredHeight;
        int navy;
        int indigo;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z12;
        boolean z13;
        int[] iArr;
        int measuredHeight2;
        int navy2;
        int indigo2;
        int measuredWidth;
        int jade;
        int n5;
        char c3;
        int i25;
        int minimumWidth;
        int minimumHeight;
        FlexboxLayoutManager flexboxLayoutManager = this.alpha;
        boolean S6 = flexboxLayoutManager.S();
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (list == null) {
            list2 = new ArrayList();
        } else {
            list2 = list;
        }
        nVar.alpha = list2;
        if (i12 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (S6) {
            RecyclerView recyclerView = flexboxLayoutManager.bravo;
            if (recyclerView != null) {
                WeakHashMap weakHashMap = au.alpha;
                gold = recyclerView.getPaddingStart();
            } else {
                gold = 0;
            }
        } else {
            gold = flexboxLayoutManager.gold();
        }
        if (S6) {
            RecyclerView recyclerView2 = flexboxLayoutManager.bravo;
            if (recyclerView2 != null) {
                WeakHashMap weakHashMap2 = au.alpha;
                cyan = recyclerView2.getPaddingEnd();
            } else {
                cyan = 0;
            }
        } else {
            cyan = flexboxLayoutManager.cyan();
        }
        if (S6) {
            i13 = flexboxLayoutManager.gold();
        } else {
            RecyclerView recyclerView3 = flexboxLayoutManager.bravo;
            if (recyclerView3 != null) {
                WeakHashMap weakHashMap3 = au.alpha;
                i13 = recyclerView3.getPaddingStart();
            } else {
                i13 = 0;
            }
        }
        if (S6) {
            i14 = flexboxLayoutManager.cyan();
        } else {
            RecyclerView recyclerView4 = flexboxLayoutManager.bravo;
            if (recyclerView4 != null) {
                WeakHashMap weakHashMap4 = au.alpha;
                i14 = recyclerView4.getPaddingEnd();
            } else {
                i14 = 0;
            }
        }
        a aVar = new a();
        int i26 = i11;
        aVar.kilo = i26;
        int i27 = gold + cyan;
        aVar.alpha = i27;
        int bravo = flexboxLayoutManager.yankee.bravo();
        int i28 = Integer.MIN_VALUE;
        int i29 = 1;
        int i30 = 0;
        int i31 = 0;
        while (i26 < bravo) {
            View O3 = flexboxLayoutManager.O(i26);
            if (O3 == null) {
                if (i26 == bravo - 1) {
                    z10 = S6;
                    if (aVar.delta - aVar.echo != 0) {
                        aVar.india = i30;
                        aVar.lima = i26;
                        list2.add(aVar);
                    }
                } else {
                    z10 = S6;
                }
                z11 = z2;
            } else {
                z10 = S6;
                z11 = z2;
                if (O3.getVisibility() == 8) {
                    int i32 = aVar.echo + 1;
                    aVar.echo = i32;
                    int i33 = aVar.delta + 1;
                    aVar.delta = i33;
                    if (i26 == bravo - 1 && i33 - i32 != 0) {
                        aVar.india = i30;
                        aVar.lima = i26;
                        list2.add(aVar);
                    }
                } else {
                    if (O3 instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) O3;
                        FlexItem flexItem2 = (FlexItem) compoundButton.getLayoutParams();
                        int crimson = flexItem2.crimson();
                        i15 = bravo;
                        int q4 = flexItem2.q();
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        if (buttonDrawable == null) {
                            minimumWidth = 0;
                        } else {
                            minimumWidth = buttonDrawable.getMinimumWidth();
                        }
                        if (buttonDrawable == null) {
                            minimumHeight = 0;
                        } else {
                            minimumHeight = buttonDrawable.getMinimumHeight();
                        }
                        i16 = i13;
                        if (crimson == -1) {
                            crimson = minimumWidth;
                        }
                        flexItem2.green(crimson);
                        if (q4 == -1) {
                            q4 = minimumHeight;
                        }
                        flexItem2.olive(q4);
                    } else {
                        i15 = bravo;
                        i16 = i13;
                    }
                    FlexItem flexItem3 = (FlexItem) O3.getLayoutParams();
                    if (flexItem3.azure() == 4) {
                        aVar.juliet.add(Integer.valueOf(i26));
                    }
                    if (z10) {
                        alpha = flexItem3.bravo();
                    } else {
                        alpha = flexItem3.alpha();
                    }
                    if (flexItem3.yellow() != -1.0f && mode == 1073741824) {
                        alpha = Math.round(size * flexItem3.yellow());
                    }
                    if (z10) {
                        flexItem = flexItem3;
                        i17 = mode;
                        i19 = L.xray(flexboxLayoutManager.echo(), flexboxLayoutManager.november, flexboxLayoutManager.lima, flexItem3.jade() + i27 + flexItem3.n(), alpha);
                        i18 = i14;
                        int xray = L.xray(flexboxLayoutManager.foxtrot(), flexboxLayoutManager.oscar, flexboxLayoutManager.mike, i16 + i14 + flexItem.navy() + flexItem.indigo() + i30, flexItem.alpha());
                        O3.measure(i19, xray);
                        quebec(O3, i26, i19, xray);
                    } else {
                        flexItem = flexItem3;
                        i17 = mode;
                        i18 = i14;
                        int xray2 = L.xray(flexboxLayoutManager.echo(), flexboxLayoutManager.november, flexboxLayoutManager.lima, i16 + i18 + flexItem.jade() + flexItem.n() + i30, flexItem.bravo());
                        int xray3 = L.xray(flexboxLayoutManager.foxtrot(), flexboxLayoutManager.oscar, flexboxLayoutManager.mike, flexItem.navy() + i27 + flexItem.indigo(), alpha);
                        O3.measure(xray2, xray3);
                        quebec(O3, i26, xray2, xray3);
                        i19 = xray3;
                    }
                    flexboxLayoutManager.a0(i26, O3);
                    bravo(i26, O3);
                    i31 = View.combineMeasuredStates(i31, O3.getMeasuredState());
                    int i34 = aVar.alpha;
                    if (z10) {
                        measuredHeight = O3.getMeasuredWidth();
                    } else {
                        measuredHeight = O3.getMeasuredHeight();
                    }
                    if (z10) {
                        navy = flexItem.jade();
                    } else {
                        navy = flexItem.navy();
                    }
                    int i35 = measuredHeight + navy;
                    if (z10) {
                        indigo = flexItem.n();
                    } else {
                        indigo = flexItem.indigo();
                    }
                    int i36 = i35 + indigo;
                    int size2 = list2.size();
                    if (flexboxLayoutManager.quebec != 0) {
                        if (!flexItem.r()) {
                            if (i17 != 0 && ((i22 = flexboxLayoutManager.sierra) == -1 || i22 > size2 + 1)) {
                                if (flexboxLayoutManager.S()) {
                                    i23 = ((M) O3.getLayoutParams()).purple.left;
                                    i24 = ((M) O3.getLayoutParams()).purple.right;
                                } else {
                                    i23 = ((M) O3.getLayoutParams()).purple.top;
                                    i24 = ((M) O3.getLayoutParams()).purple.bottom;
                                }
                                int i37 = i23 + i24;
                                if (i37 > 0) {
                                    i36 += i37;
                                }
                            }
                        }
                        if (aVar.delta - aVar.echo > 0) {
                            if (i26 > 0) {
                                i21 = i26 - 1;
                            } else {
                                i21 = 0;
                            }
                            aVar.india = i30;
                            aVar.lima = i21;
                            list2.add(aVar);
                            i30 += aVar.charlie;
                        }
                        if (z10) {
                            if (flexItem.alpha() == -1) {
                                O3.measure(i19, L.xray(flexboxLayoutManager.foxtrot(), flexboxLayoutManager.oscar, flexboxLayoutManager.mike, flexboxLayoutManager.cyan() + flexboxLayoutManager.gold() + flexItem.navy() + flexItem.indigo() + i30, flexItem.alpha()));
                                bravo(i26, O3);
                            }
                        } else if (flexItem.bravo() == -1) {
                            O3.measure(L.xray(flexboxLayoutManager.echo(), flexboxLayoutManager.november, flexboxLayoutManager.lima, flexboxLayoutManager.fuchsia() + flexboxLayoutManager.emerald() + flexItem.jade() + flexItem.n() + i30, flexItem.bravo()), i19);
                            bravo(i26, O3);
                        }
                        aVar = new a();
                        aVar.delta = i29;
                        aVar.alpha = i27;
                        aVar.kilo = i26;
                        i20 = Integer.MIN_VALUE;
                        boolean z14 = aVar.mike;
                        if (flexItem.purple() == 0.0f) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        aVar.mike = z14 | z12;
                        boolean z15 = aVar.november;
                        if (flexItem.blue() == 0.0f) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        aVar.november = z15 | z13;
                        iArr = this.charlie;
                        if (iArr != null) {
                            iArr[i26] = list2.size();
                        }
                        int i38 = aVar.alpha;
                        if (!z10) {
                            measuredHeight2 = O3.getMeasuredWidth();
                        } else {
                            measuredHeight2 = O3.getMeasuredHeight();
                        }
                        if (!z10) {
                            navy2 = flexItem.jade();
                        } else {
                            navy2 = flexItem.navy();
                        }
                        int i39 = measuredHeight2 + navy2;
                        if (!z10) {
                            indigo2 = flexItem.n();
                        } else {
                            indigo2 = flexItem.indigo();
                        }
                        aVar.alpha = i39 + indigo2 + i38;
                        aVar.foxtrot += flexItem.purple();
                        aVar.golf += flexItem.blue();
                        flexboxLayoutManager.delta(O3, FlexboxLayoutManager.green);
                        if (!flexboxLayoutManager.S()) {
                            int i40 = ((M) O3.getLayoutParams()).purple.left + ((M) O3.getLayoutParams()).purple.right;
                            aVar.alpha += i40;
                            aVar.bravo += i40;
                        } else {
                            int i41 = ((M) O3.getLayoutParams()).purple.top + ((M) O3.getLayoutParams()).purple.bottom;
                            aVar.alpha += i41;
                            aVar.bravo += i41;
                        }
                        if (!z10) {
                            measuredWidth = O3.getMeasuredHeight();
                        } else {
                            measuredWidth = O3.getMeasuredWidth();
                        }
                        if (!z10) {
                            jade = flexItem.navy();
                        } else {
                            jade = flexItem.jade();
                        }
                        int i42 = measuredWidth + jade;
                        if (!z10) {
                            n5 = flexItem.indigo();
                        } else {
                            n5 = flexItem.n();
                        }
                        int max = Math.max(i20, flexboxLayoutManager.N(O3) + i42 + n5);
                        aVar.charlie = Math.max(aVar.charlie, max);
                        if (z10) {
                            if (flexboxLayoutManager.quebec != 2) {
                                aVar.hotel = Math.max(aVar.hotel, O3.getBaseline() + flexItem.navy());
                            } else {
                                aVar.hotel = Math.max(aVar.hotel, (O3.getMeasuredHeight() - O3.getBaseline()) + flexItem.indigo());
                            }
                        }
                        if (i26 == i15 - 1 && aVar.delta - aVar.echo != 0) {
                            aVar.india = i30;
                            aVar.lima = i26;
                            list2.add(aVar);
                            i30 += aVar.charlie;
                        }
                        c3 = 65535;
                        if (i12 == -1 && list2.size() > 0 && ((a) list2.get(list2.size() - 1)).lima >= i12 && i26 >= i12 && !z11) {
                            i30 = -aVar.charlie;
                            z2 = true;
                        } else {
                            z2 = z11;
                        }
                        if (i30 > i10 || !z2) {
                            i28 = max;
                            i25 = 1;
                            i26 += i25;
                            i29 = i25;
                            S6 = z10;
                            bravo = i15;
                            mode = i17;
                            i14 = i18;
                            i13 = i16;
                        } else {
                            return;
                        }
                    }
                    aVar.delta += i29;
                    i20 = i28;
                    boolean z142 = aVar.mike;
                    if (flexItem.purple() == 0.0f) {
                    }
                    aVar.mike = z142 | z12;
                    boolean z152 = aVar.november;
                    if (flexItem.blue() == 0.0f) {
                    }
                    aVar.november = z152 | z13;
                    iArr = this.charlie;
                    if (iArr != null) {
                    }
                    int i382 = aVar.alpha;
                    if (!z10) {
                    }
                    if (!z10) {
                    }
                    int i392 = measuredHeight2 + navy2;
                    if (!z10) {
                    }
                    aVar.alpha = i392 + indigo2 + i382;
                    aVar.foxtrot += flexItem.purple();
                    aVar.golf += flexItem.blue();
                    flexboxLayoutManager.delta(O3, FlexboxLayoutManager.green);
                    if (!flexboxLayoutManager.S()) {
                    }
                    if (!z10) {
                    }
                    if (!z10) {
                    }
                    int i422 = measuredWidth + jade;
                    if (!z10) {
                    }
                    int max2 = Math.max(i20, flexboxLayoutManager.N(O3) + i422 + n5);
                    aVar.charlie = Math.max(aVar.charlie, max2);
                    if (z10) {
                    }
                    if (i26 == i15 - 1) {
                        aVar.india = i30;
                        aVar.lima = i26;
                        list2.add(aVar);
                        i30 += aVar.charlie;
                    }
                    c3 = 65535;
                    if (i12 == -1) {
                    }
                    z2 = z11;
                    if (i30 > i10) {
                    }
                    i28 = max2;
                    i25 = 1;
                    i26 += i25;
                    i29 = i25;
                    S6 = z10;
                    bravo = i15;
                    mode = i17;
                    i14 = i18;
                    i13 = i16;
                }
            }
            i25 = i29;
            z2 = z11;
            i17 = mode;
            i15 = bravo;
            i16 = i13;
            i18 = i14;
            c3 = 65535;
            i26 += i25;
            i29 = i25;
            S6 = z10;
            bravo = i15;
            mode = i17;
            i14 = i18;
            i13 = i16;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bravo(int i4, View view) {
        boolean z2;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z10 = true;
        if (measuredWidth < flexItem.crimson()) {
            measuredWidth = flexItem.crimson();
        } else if (measuredWidth > flexItem.B()) {
            measuredWidth = flexItem.B();
        } else {
            z2 = false;
            if (measuredHeight >= flexItem.q()) {
                measuredHeight = flexItem.q();
            } else if (measuredHeight > flexItem.t()) {
                measuredHeight = flexItem.t();
            } else {
                z10 = z2;
            }
            if (!z10) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                quebec(view, i4, makeMeasureSpec, makeMeasureSpec2);
                this.alpha.a0(i4, view);
                return;
            }
            return;
        }
        z2 = true;
        if (measuredHeight >= flexItem.q()) {
        }
        if (!z10) {
        }
    }

    public final void charlie(int i4, List list) {
        int i5 = this.charlie[i4];
        if (i5 == -1) {
            i5 = 0;
        }
        if (list.size() > i5) {
            list.subList(i5, list.size()).clear();
        }
        int[] iArr = this.charlie;
        int length = iArr.length - 1;
        if (i4 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i4, length, -1);
        }
        long[] jArr = this.delta;
        int length2 = jArr.length - 1;
        if (i4 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i4, length2, 0L);
        }
    }

    public final void delta(int i4, int i5, int i10) {
        int size;
        int emerald;
        int fuchsia;
        int i11;
        int i12;
        FlexboxLayoutManager flexboxLayoutManager = this.alpha;
        int bravo = flexboxLayoutManager.yankee.bravo();
        boolean[] zArr = this.bravo;
        int i13 = 0;
        if (zArr == null) {
            this.bravo = new boolean[Math.max(bravo, 10)];
        } else if (zArr.length < bravo) {
            this.bravo = new boolean[Math.max(zArr.length * 2, bravo)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i10 < flexboxLayoutManager.yankee.bravo()) {
            int i14 = flexboxLayoutManager.papa;
            if (i14 != 0 && i14 != 1) {
                if (i14 != 2 && i14 != 3) {
                    throw new IllegalArgumentException(ad.zulu(i14, "Invalid flex direction: "));
                }
                int mode = View.MeasureSpec.getMode(i5);
                size = View.MeasureSpec.getSize(i5);
                if (mode != 1073741824) {
                    size = flexboxLayoutManager.P();
                }
                emerald = flexboxLayoutManager.gold();
                fuchsia = flexboxLayoutManager.cyan();
            } else {
                int mode2 = View.MeasureSpec.getMode(i4);
                size = View.MeasureSpec.getSize(i4);
                int P4 = flexboxLayoutManager.P();
                if (mode2 != 1073741824) {
                    size = Math.min(P4, size);
                }
                emerald = flexboxLayoutManager.emerald();
                fuchsia = flexboxLayoutManager.fuchsia();
            }
            int i15 = fuchsia + emerald;
            int i16 = size;
            int[] iArr = this.charlie;
            if (iArr != null) {
                i13 = iArr[i10];
            }
            List list = flexboxLayoutManager.victor;
            int size2 = list.size();
            while (i13 < size2) {
                a aVar = (a) list.get(i13);
                int i17 = aVar.alpha;
                if (i17 < i16 && aVar.mike) {
                    i11 = i4;
                    i12 = i5;
                    hotel(i11, i12, aVar, i16, i15, false);
                } else {
                    i11 = i4;
                    i12 = i5;
                    if (i17 > i16 && aVar.november) {
                        mike(i11, i12, aVar, i16, i15, false);
                    }
                }
                i13++;
                i4 = i11;
                i5 = i12;
            }
        }
    }

    public final void echo(int i4) {
        int[] iArr = this.charlie;
        if (iArr == null) {
            this.charlie = new int[Math.max(i4, 10)];
        } else if (iArr.length < i4) {
            this.charlie = Arrays.copyOf(this.charlie, Math.max(iArr.length * 2, i4));
        }
    }

    public final void foxtrot(int i4) {
        long[] jArr = this.delta;
        if (jArr == null) {
            this.delta = new long[Math.max(i4, 10)];
        } else if (jArr.length < i4) {
            this.delta = Arrays.copyOf(this.delta, Math.max(jArr.length * 2, i4));
        }
    }

    public final void golf(int i4) {
        long[] jArr = this.echo;
        if (jArr == null) {
            this.echo = new long[Math.max(i4, 10)];
        } else if (jArr.length < i4) {
            this.echo = Arrays.copyOf(this.echo, Math.max(jArr.length * 2, i4));
        }
    }

    public final void hotel(int i4, int i5, a aVar, int i10, int i11, boolean z2) {
        int i12;
        float f5;
        float f10;
        int i13;
        double d4;
        double d9;
        float f11 = aVar.foxtrot;
        float f12 = 0.0f;
        if (f11 > 0.0f && i10 >= (i12 = aVar.alpha)) {
            float f13 = (i10 - i12) / f11;
            aVar.alpha = i11 + aVar.bravo;
            if (!z2) {
                aVar.charlie = RecyclerView.UNDEFINED_DURATION;
            }
            int i14 = 0;
            boolean z10 = false;
            int i15 = 0;
            float f14 = 0.0f;
            while (i14 < aVar.delta) {
                int i16 = aVar.kilo + i14;
                FlexboxLayoutManager flexboxLayoutManager = this.alpha;
                View O3 = flexboxLayoutManager.O(i16);
                if (O3 == null || O3.getVisibility() == 8) {
                    f5 = f12;
                    f10 = f13;
                    z10 = z10;
                } else {
                    FlexItem flexItem = (FlexItem) O3.getLayoutParams();
                    int i17 = flexboxLayoutManager.papa;
                    f5 = f12;
                    if (i17 == 0 || i17 == 1) {
                        f10 = f13;
                        boolean z11 = z10;
                        int measuredWidth = O3.getMeasuredWidth();
                        long[] jArr = this.echo;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i16];
                        }
                        int measuredHeight = O3.getMeasuredHeight();
                        long[] jArr2 = this.echo;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i16] >> 32);
                        }
                        if (!this.bravo[i16] && flexItem.purple() > f5) {
                            float purple = (flexItem.purple() * f10) + measuredWidth;
                            if (i14 == aVar.delta - 1) {
                                purple += f14;
                                f14 = f5;
                            }
                            int round = Math.round(purple);
                            if (round > flexItem.B()) {
                                round = flexItem.B();
                                this.bravo[i16] = true;
                                aVar.foxtrot -= flexItem.purple();
                                z10 = true;
                            } else {
                                float f15 = (purple - round) + f14;
                                double d10 = f15;
                                if (d10 > 1.0d) {
                                    round++;
                                    d4 = d10 - 1.0d;
                                } else {
                                    if (d10 < -1.0d) {
                                        round--;
                                        d4 = d10 + 1.0d;
                                    }
                                    f14 = f15;
                                    z10 = z11;
                                }
                                f15 = (float) d4;
                                f14 = f15;
                                z10 = z11;
                            }
                            int india = india(i5, flexItem, aVar.india);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            O3.measure(makeMeasureSpec, india);
                            int measuredWidth2 = O3.getMeasuredWidth();
                            int measuredHeight2 = O3.getMeasuredHeight();
                            quebec(O3, i16, makeMeasureSpec, india);
                            flexboxLayoutManager.a0(i16, O3);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        } else {
                            z10 = z11;
                        }
                        int max = Math.max(i15, flexboxLayoutManager.N(O3) + measuredHeight + flexItem.navy() + flexItem.indigo());
                        aVar.alpha = measuredWidth + flexItem.jade() + flexItem.n() + aVar.alpha;
                        i13 = max;
                    } else {
                        int measuredHeight3 = O3.getMeasuredHeight();
                        long[] jArr3 = this.echo;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i16] >> 32);
                        }
                        int measuredWidth3 = O3.getMeasuredWidth();
                        long[] jArr4 = this.echo;
                        f10 = f13;
                        boolean z12 = z10;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i16];
                        }
                        if (!this.bravo[i16] && flexItem.purple() > f5) {
                            float purple2 = (flexItem.purple() * f10) + measuredHeight3;
                            if (i14 == aVar.delta - 1) {
                                purple2 += f14;
                                f14 = f5;
                            }
                            int round2 = Math.round(purple2);
                            if (round2 > flexItem.t()) {
                                round2 = flexItem.t();
                                this.bravo[i16] = true;
                                aVar.foxtrot -= flexItem.purple();
                                z10 = true;
                            } else {
                                float f16 = (purple2 - round2) + f14;
                                double d11 = f16;
                                if (d11 > 1.0d) {
                                    round2++;
                                    d9 = d11 - 1.0d;
                                } else {
                                    if (d11 < -1.0d) {
                                        round2--;
                                        d9 = d11 + 1.0d;
                                    }
                                    f14 = f16;
                                    z10 = z12;
                                }
                                f16 = (float) d9;
                                f14 = f16;
                                z10 = z12;
                            }
                            int juliet = juliet(i4, flexItem, aVar.india);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            O3.measure(juliet, makeMeasureSpec2);
                            measuredWidth3 = O3.getMeasuredWidth();
                            int measuredHeight4 = O3.getMeasuredHeight();
                            quebec(O3, i16, juliet, makeMeasureSpec2);
                            flexboxLayoutManager.a0(i16, O3);
                            measuredHeight3 = measuredHeight4;
                        } else {
                            z10 = z12;
                        }
                        i13 = Math.max(i15, flexboxLayoutManager.N(O3) + measuredWidth3 + flexItem.jade() + flexItem.n());
                        aVar.alpha = measuredHeight3 + flexItem.navy() + flexItem.indigo() + aVar.alpha;
                    }
                    aVar.charlie = Math.max(aVar.charlie, i13);
                    i15 = i13;
                }
                i14++;
                f12 = f5;
                f13 = f10;
            }
            if (z10 && i12 != aVar.alpha) {
                hotel(i4, i5, aVar, i10, i11, true);
            }
        }
    }

    public final int india(int i4, FlexItem flexItem, int i5) {
        FlexboxLayoutManager flexboxLayoutManager = this.alpha;
        int cyan = flexboxLayoutManager.cyan() + flexboxLayoutManager.gold() + flexItem.navy() + flexItem.indigo() + i5;
        int alpha = flexItem.alpha();
        int xray = L.xray(flexboxLayoutManager.foxtrot(), flexboxLayoutManager.oscar, flexboxLayoutManager.mike, cyan, alpha);
        int size = View.MeasureSpec.getSize(xray);
        if (size > flexItem.t()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.t(), View.MeasureSpec.getMode(xray));
        }
        if (size < flexItem.q()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.q(), View.MeasureSpec.getMode(xray));
        }
        return xray;
    }

    public final int juliet(int i4, FlexItem flexItem, int i5) {
        FlexboxLayoutManager flexboxLayoutManager = this.alpha;
        int fuchsia = flexboxLayoutManager.fuchsia() + flexboxLayoutManager.emerald() + flexItem.jade() + flexItem.n() + i5;
        int bravo = flexItem.bravo();
        int xray = L.xray(flexboxLayoutManager.echo(), flexboxLayoutManager.november, flexboxLayoutManager.lima, fuchsia, bravo);
        int size = View.MeasureSpec.getSize(xray);
        if (size > flexItem.B()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.B(), View.MeasureSpec.getMode(xray));
        }
        if (size < flexItem.crimson()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.crimson(), View.MeasureSpec.getMode(xray));
        }
        return xray;
    }

    public final void kilo(View view, a aVar, int i4, int i5, int i10, int i11) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        FlexboxLayoutManager flexboxLayoutManager = this.alpha;
        int i12 = flexboxLayoutManager.romeo;
        if (flexItem.azure() != -1) {
            i12 = flexItem.azure();
        }
        int i13 = aVar.charlie;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            return;
                        }
                    } else if (flexboxLayoutManager.quebec != 2) {
                        int max = Math.max(aVar.hotel - view.getBaseline(), flexItem.navy());
                        view.layout(i4, i5 + max, i10, i11 + max);
                        return;
                    } else {
                        int max2 = Math.max(view.getBaseline() + (aVar.hotel - view.getMeasuredHeight()), flexItem.indigo());
                        view.layout(i4, i5 - max2, i10, i11 - max2);
                        return;
                    }
                } else {
                    int measuredHeight = (((i13 - view.getMeasuredHeight()) + flexItem.navy()) - flexItem.indigo()) / 2;
                    if (flexboxLayoutManager.quebec != 2) {
                        int i14 = i5 + measuredHeight;
                        view.layout(i4, i14, i10, view.getMeasuredHeight() + i14);
                        return;
                    } else {
                        int i15 = i5 - measuredHeight;
                        view.layout(i4, i15, i10, view.getMeasuredHeight() + i15);
                        return;
                    }
                }
            } else if (flexboxLayoutManager.quebec != 2) {
                int i16 = i5 + i13;
                view.layout(i4, (i16 - view.getMeasuredHeight()) - flexItem.indigo(), i10, i16 - flexItem.indigo());
                return;
            } else {
                view.layout(i4, view.getMeasuredHeight() + (i5 - i13) + flexItem.navy(), i10, view.getMeasuredHeight() + (i11 - i13) + flexItem.navy());
                return;
            }
        }
        if (flexboxLayoutManager.quebec != 2) {
            view.layout(i4, i5 + flexItem.navy(), i10, i11 + flexItem.navy());
        } else {
            view.layout(i4, i5 - flexItem.indigo(), i10, i11 - flexItem.indigo());
        }
    }

    public final void lima(View view, a aVar, boolean z2, int i4, int i5, int i10, int i11) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int i12 = this.alpha.romeo;
        if (flexItem.azure() != -1) {
            i12 = flexItem.azure();
        }
        int i13 = aVar.charlie;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3 && i12 != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int marginStart = ((marginLayoutParams.getMarginStart() + (i13 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                    if (!z2) {
                        view.layout(i4 + marginStart, i5, i10 + marginStart, i11);
                        return;
                    } else {
                        view.layout(i4 - marginStart, i5, i10 - marginStart, i11);
                        return;
                    }
                }
            } else {
                if (!z2) {
                    view.layout(((i4 + i13) - view.getMeasuredWidth()) - flexItem.n(), i5, ((i10 + i13) - view.getMeasuredWidth()) - flexItem.n(), i11);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i4 - i13) + flexItem.jade(), i5, view.getMeasuredWidth() + (i10 - i13) + flexItem.jade(), i11);
                return;
            }
        }
        if (!z2) {
            view.layout(i4 + flexItem.jade(), i5, i10 + flexItem.jade(), i11);
        } else {
            view.layout(i4 - flexItem.n(), i5, i10 - flexItem.n(), i11);
        }
    }

    public final void mike(int i4, int i5, a aVar, int i10, int i11, boolean z2) {
        float f5;
        int i12;
        int i13 = aVar.alpha;
        float f10 = aVar.golf;
        float f11 = 0.0f;
        if (f10 > 0.0f && i10 <= i13) {
            float f12 = (i13 - i10) / f10;
            aVar.alpha = i11 + aVar.bravo;
            if (!z2) {
                aVar.charlie = RecyclerView.UNDEFINED_DURATION;
            }
            int i14 = 0;
            boolean z10 = false;
            int i15 = 0;
            float f13 = 0.0f;
            while (i14 < aVar.delta) {
                int i16 = aVar.kilo + i14;
                FlexboxLayoutManager flexboxLayoutManager = this.alpha;
                View O3 = flexboxLayoutManager.O(i16);
                if (O3 == null || O3.getVisibility() == 8) {
                    f5 = f11;
                } else {
                    FlexItem flexItem = (FlexItem) O3.getLayoutParams();
                    int i17 = flexboxLayoutManager.papa;
                    f5 = f11;
                    if (i17 != 0 && i17 != 1) {
                        int measuredHeight = O3.getMeasuredHeight();
                        long[] jArr = this.echo;
                        if (jArr != null) {
                            measuredHeight = (int) (jArr[i16] >> 32);
                        }
                        int measuredWidth = O3.getMeasuredWidth();
                        long[] jArr2 = this.echo;
                        if (jArr2 != null) {
                            measuredWidth = (int) jArr2[i16];
                        }
                        if (!this.bravo[i16] && flexItem.blue() > f5) {
                            float blue = measuredHeight - (flexItem.blue() * f12);
                            if (i14 == aVar.delta - 1) {
                                blue += f13;
                                f13 = f5;
                            }
                            int round = Math.round(blue);
                            if (round < flexItem.q()) {
                                round = flexItem.q();
                                this.bravo[i16] = true;
                                aVar.golf -= flexItem.blue();
                                z10 = true;
                            } else {
                                float f14 = (blue - round) + f13;
                                double d4 = f14;
                                if (d4 > 1.0d) {
                                    round++;
                                    f14 -= 1.0f;
                                } else if (d4 < -1.0d) {
                                    round--;
                                    f14 += 1.0f;
                                }
                                f13 = f14;
                            }
                            int juliet = juliet(i4, flexItem, aVar.india);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            O3.measure(juliet, makeMeasureSpec);
                            measuredWidth = O3.getMeasuredWidth();
                            int measuredHeight2 = O3.getMeasuredHeight();
                            quebec(O3, i16, juliet, makeMeasureSpec);
                            flexboxLayoutManager.a0(i16, O3);
                            measuredHeight = measuredHeight2;
                        }
                        i12 = Math.max(i15, flexboxLayoutManager.N(O3) + measuredWidth + flexItem.jade() + flexItem.n());
                        aVar.alpha = measuredHeight + flexItem.navy() + flexItem.indigo() + aVar.alpha;
                    } else {
                        int measuredWidth2 = O3.getMeasuredWidth();
                        long[] jArr3 = this.echo;
                        if (jArr3 != null) {
                            measuredWidth2 = (int) jArr3[i16];
                        }
                        int measuredHeight3 = O3.getMeasuredHeight();
                        long[] jArr4 = this.echo;
                        if (jArr4 != null) {
                            measuredHeight3 = (int) (jArr4[i16] >> 32);
                        }
                        if (!this.bravo[i16] && flexItem.blue() > f5) {
                            float blue2 = measuredWidth2 - (flexItem.blue() * f12);
                            if (i14 == aVar.delta - 1) {
                                blue2 += f13;
                                f13 = f5;
                            }
                            int round2 = Math.round(blue2);
                            if (round2 < flexItem.crimson()) {
                                round2 = flexItem.crimson();
                                this.bravo[i16] = true;
                                aVar.golf -= flexItem.blue();
                                z10 = true;
                            } else {
                                float f15 = (blue2 - round2) + f13;
                                double d9 = f15;
                                if (d9 > 1.0d) {
                                    round2++;
                                    f15 -= 1.0f;
                                } else if (d9 < -1.0d) {
                                    round2--;
                                    f15 += 1.0f;
                                }
                                f13 = f15;
                            }
                            int india = india(i5, flexItem, aVar.india);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            O3.measure(makeMeasureSpec2, india);
                            int measuredWidth3 = O3.getMeasuredWidth();
                            int measuredHeight4 = O3.getMeasuredHeight();
                            quebec(O3, i16, makeMeasureSpec2, india);
                            flexboxLayoutManager.a0(i16, O3);
                            measuredWidth2 = measuredWidth3;
                            measuredHeight3 = measuredHeight4;
                        }
                        int max = Math.max(i15, flexboxLayoutManager.N(O3) + measuredHeight3 + flexItem.navy() + flexItem.indigo());
                        aVar.alpha = measuredWidth2 + flexItem.jade() + flexItem.n() + aVar.alpha;
                        i12 = max;
                    }
                    aVar.charlie = Math.max(aVar.charlie, i12);
                    i15 = i12;
                }
                i14++;
                f11 = f5;
            }
            if (z10 && i13 != aVar.alpha) {
                mike(i4, i5, aVar, i10, i11, true);
            }
        }
    }

    public final void november(View view, int i4, int i5) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int jade = (i4 - flexItem.jade()) - flexItem.n();
        FlexboxLayoutManager flexboxLayoutManager = this.alpha;
        int min = Math.min(Math.max(jade - flexboxLayoutManager.N(view), flexItem.crimson()), flexItem.B());
        long[] jArr = this.echo;
        if (jArr != null) {
            measuredHeight = (int) (jArr[i5] >> 32);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        quebec(view, i5, makeMeasureSpec2, makeMeasureSpec);
        flexboxLayoutManager.a0(i5, view);
    }

    public final void oscar(View view, int i4, int i5) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int navy = (i4 - flexItem.navy()) - flexItem.indigo();
        FlexboxLayoutManager flexboxLayoutManager = this.alpha;
        int min = Math.min(Math.max(navy - flexboxLayoutManager.N(view), flexItem.q()), flexItem.t());
        long[] jArr = this.echo;
        if (jArr != null) {
            measuredWidth = (int) jArr[i5];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        quebec(view, i5, makeMeasureSpec, makeMeasureSpec2);
        flexboxLayoutManager.a0(i5, view);
    }

    public final void papa(int i4) {
        int i5;
        View O3;
        FlexboxLayoutManager flexboxLayoutManager = this.alpha;
        if (i4 < flexboxLayoutManager.yankee.bravo()) {
            int i10 = flexboxLayoutManager.papa;
            if (flexboxLayoutManager.romeo == 4) {
                int[] iArr = this.charlie;
                if (iArr != null) {
                    i5 = iArr[i4];
                } else {
                    i5 = 0;
                }
                List list = flexboxLayoutManager.victor;
                int size = list.size();
                while (i5 < size) {
                    a aVar = (a) list.get(i5);
                    int i11 = aVar.delta;
                    for (int i12 = 0; i12 < i11; i12++) {
                        int i13 = aVar.kilo + i12;
                        if (i12 < flexboxLayoutManager.yankee.bravo() && (O3 = flexboxLayoutManager.O(i13)) != null && O3.getVisibility() != 8) {
                            FlexItem flexItem = (FlexItem) O3.getLayoutParams();
                            if (flexItem.azure() == -1 || flexItem.azure() == 4) {
                                if (i10 != 0 && i10 != 1) {
                                    if (i10 != 2 && i10 != 3) {
                                        throw new IllegalArgumentException(ad.zulu(i10, "Invalid flex direction: "));
                                    }
                                    november(O3, aVar.charlie, i13);
                                } else {
                                    oscar(O3, aVar.charlie, i13);
                                }
                            }
                        }
                    }
                    i5++;
                }
                return;
            }
            for (a aVar2 : flexboxLayoutManager.victor) {
                Iterator it = aVar2.juliet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    View O4 = flexboxLayoutManager.O(num.intValue());
                    if (i10 != 0 && i10 != 1) {
                        if (i10 != 2 && i10 != 3) {
                            throw new IllegalArgumentException(ad.zulu(i10, "Invalid flex direction: "));
                        }
                        november(O4, aVar2.charlie, num.intValue());
                    } else {
                        oscar(O4, aVar2.charlie, num.intValue());
                    }
                }
            }
        }
    }

    public final void quebec(View view, int i4, int i5, int i10) {
        long[] jArr = this.delta;
        if (jArr != null) {
            jArr[i4] = (i5 & 4294967295L) | (i10 << 32);
        }
        long[] jArr2 = this.echo;
        if (jArr2 != null) {
            jArr2[i4] = (4294967295L & view.getMeasuredWidth()) | (view.getMeasuredHeight() << 32);
        }
    }
}
