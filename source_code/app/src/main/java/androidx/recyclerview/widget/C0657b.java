package androidx.recyclerview.widget;

import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0657b {
    public final ax delta;
    public final W0.d alpha = new W0.d(30);
    public final ArrayList bravo = new ArrayList();
    public final ArrayList charlie = new ArrayList();
    public int foxtrot = 0;
    public final C0658c echo = new C0658c(this);

    public C0657b(ax axVar) {
        this.delta = axVar;
    }

    public final boolean alpha(int i4) {
        ArrayList arrayList = this.charlie;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0656a c0656a = (C0656a) arrayList.get(i5);
            int i10 = c0656a.alpha;
            if (i10 == 8) {
                if (foxtrot(c0656a.delta, i5 + 1) == i4) {
                    return true;
                }
            } else {
                if (i10 == 1) {
                    int i11 = c0656a.bravo;
                    int i12 = c0656a.delta + i11;
                    while (i11 < i12) {
                        if (foxtrot(i11, i5 + 1) == i4) {
                            return true;
                        }
                        i11++;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final void bravo() {
        ArrayList arrayList = this.charlie;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.delta.alpha((C0656a) arrayList.get(i4));
        }
        kilo(arrayList);
        this.foxtrot = 0;
    }

    public final void charlie() {
        bravo();
        ArrayList arrayList = this.bravo;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0656a c0656a = (C0656a) arrayList.get(i4);
            int i5 = c0656a.alpha;
            ax axVar = this.delta;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 4) {
                        if (i5 == 8) {
                            axVar.alpha(c0656a);
                            int i10 = c0656a.bravo;
                            int i11 = c0656a.delta;
                            RecyclerView recyclerView = axVar.alpha;
                            recyclerView.offsetPositionRecordsForMove(i10, i11);
                            recyclerView.mItemsAddedOrRemoved = true;
                        }
                    } else {
                        axVar.alpha(c0656a);
                        int i12 = c0656a.bravo;
                        int i13 = c0656a.delta;
                        Object obj = c0656a.charlie;
                        RecyclerView recyclerView2 = axVar.alpha;
                        recyclerView2.viewRangeUpdate(i12, i13, obj);
                        recyclerView2.mItemsChanged = true;
                    }
                } else {
                    axVar.alpha(c0656a);
                    int i14 = c0656a.bravo;
                    int i15 = c0656a.delta;
                    RecyclerView recyclerView3 = axVar.alpha;
                    recyclerView3.offsetPositionRecordsForRemove(i14, i15, true);
                    recyclerView3.mItemsAddedOrRemoved = true;
                    recyclerView3.mState.charlie += i15;
                }
            } else {
                axVar.alpha(c0656a);
                int i16 = c0656a.bravo;
                int i17 = c0656a.delta;
                RecyclerView recyclerView4 = axVar.alpha;
                recyclerView4.offsetPositionRecordsForInsert(i16, i17);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        kilo(arrayList);
        this.foxtrot = 0;
    }

    public final void delta(C0656a c0656a) {
        int i4;
        int i5 = c0656a.alpha;
        if (i5 != 1 && i5 != 8) {
            int lima = lima(c0656a.bravo, i5);
            int i10 = c0656a.bravo;
            int i11 = c0656a.alpha;
            if (i11 != 2) {
                if (i11 == 4) {
                    i4 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + c0656a);
                }
            } else {
                i4 = 0;
            }
            int i12 = 1;
            for (int i13 = 1; i13 < c0656a.delta; i13++) {
                int lima2 = lima((i4 * i13) + c0656a.bravo, c0656a.alpha);
                int i14 = c0656a.alpha;
                if (i14 == 2 ? lima2 == lima : !(i14 != 4 || lima2 != lima + 1)) {
                    i12++;
                } else {
                    C0656a hotel = hotel(c0656a.charlie, i14, lima, i12);
                    echo(hotel, i10);
                    hotel.charlie = null;
                    this.alpha.alpha(hotel);
                    if (c0656a.alpha == 4) {
                        i10 += i12;
                    }
                    i12 = 1;
                    lima = lima2;
                }
            }
            Object obj = c0656a.charlie;
            c0656a.charlie = null;
            this.alpha.alpha(c0656a);
            if (i12 > 0) {
                C0656a hotel2 = hotel(obj, c0656a.alpha, lima, i12);
                echo(hotel2, i10);
                hotel2.charlie = null;
                this.alpha.alpha(hotel2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void echo(C0656a c0656a, int i4) {
        ax axVar = this.delta;
        axVar.alpha(c0656a);
        int i5 = c0656a.alpha;
        RecyclerView recyclerView = axVar.alpha;
        if (i5 != 2) {
            if (i5 == 4) {
                recyclerView.viewRangeUpdate(i4, c0656a.delta, c0656a.charlie);
                recyclerView.mItemsChanged = true;
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i10 = c0656a.delta;
        recyclerView.offsetPositionRecordsForRemove(i4, i10, true);
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.charlie += i10;
    }

    public final int foxtrot(int i4, int i5) {
        ArrayList arrayList = this.charlie;
        int size = arrayList.size();
        while (i5 < size) {
            C0656a c0656a = (C0656a) arrayList.get(i5);
            int i10 = c0656a.alpha;
            if (i10 == 8) {
                int i11 = c0656a.bravo;
                if (i11 == i4) {
                    i4 = c0656a.delta;
                } else {
                    if (i11 < i4) {
                        i4--;
                    }
                    if (c0656a.delta <= i4) {
                        i4++;
                    }
                }
            } else {
                int i12 = c0656a.bravo;
                if (i12 > i4) {
                    continue;
                } else if (i10 == 2) {
                    int i13 = c0656a.delta;
                    if (i4 < i12 + i13) {
                        return -1;
                    }
                    i4 -= i13;
                } else if (i10 == 1) {
                    i4 += c0656a.delta;
                }
            }
            i5++;
        }
        return i4;
    }

    public final boolean golf() {
        if (this.bravo.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.recyclerview.widget.a] */
    public final C0656a hotel(Object obj, int i4, int i5, int i10) {
        C0656a c0656a = (C0656a) this.alpha.charlie();
        if (c0656a == null) {
            ?? obj2 = new Object();
            obj2.alpha = i4;
            obj2.bravo = i5;
            obj2.delta = i10;
            obj2.charlie = obj;
            return obj2;
        }
        c0656a.alpha = i4;
        c0656a.bravo = i5;
        c0656a.delta = i10;
        c0656a.charlie = obj;
        return c0656a;
    }

    public final void india(C0656a c0656a) {
        this.charlie.add(c0656a);
        int i4 = c0656a.alpha;
        ax axVar = this.delta;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 == 8) {
                        int i5 = c0656a.bravo;
                        int i10 = c0656a.delta;
                        RecyclerView recyclerView = axVar.alpha;
                        recyclerView.offsetPositionRecordsForMove(i5, i10);
                        recyclerView.mItemsAddedOrRemoved = true;
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + c0656a);
                }
                int i11 = c0656a.bravo;
                int i12 = c0656a.delta;
                Object obj = c0656a.charlie;
                RecyclerView recyclerView2 = axVar.alpha;
                recyclerView2.viewRangeUpdate(i11, i12, obj);
                recyclerView2.mItemsChanged = true;
                return;
            }
            int i13 = c0656a.bravo;
            int i14 = c0656a.delta;
            RecyclerView recyclerView3 = axVar.alpha;
            recyclerView3.offsetPositionRecordsForRemove(i13, i14, false);
            recyclerView3.mItemsAddedOrRemoved = true;
            return;
        }
        int i15 = c0656a.bravo;
        int i16 = c0656a.delta;
        RecyclerView recyclerView4 = axVar.alpha;
        recyclerView4.offsetPositionRecordsForInsert(i15, i16);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0119 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void juliet() {
        char c3;
        boolean z2;
        char c4;
        C0656a hotel;
        int i4;
        int i5;
        C0656a hotel2;
        boolean z10;
        boolean z11;
        C0656a hotel3;
        int i10;
        ArrayList arrayList = this.bravo;
        C0658c c0658c = this.echo;
        c0658c.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z12 = false;
            while (true) {
                c3 = 65535;
                if (size >= 0) {
                    if (((C0656a) arrayList.get(size)).alpha == 8) {
                        if (z12) {
                            break;
                        }
                    } else {
                        z12 = true;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (size == -1) {
                break;
            }
            int i11 = size + 1;
            C0656a c0656a = (C0656a) arrayList.get(size);
            C0656a c0656a2 = (C0656a) arrayList.get(i11);
            int i12 = c0656a2.alpha;
            if (i12 != 1) {
                C0657b c0657b = (C0657b) c0658c.alpha;
                if (i12 != 2) {
                    if (i12 == 4) {
                        int i13 = c0656a.delta;
                        int i14 = c0656a2.bravo;
                        if (i13 < i14) {
                            c0656a2.bravo = i14 - 1;
                        } else {
                            int i15 = c0656a2.delta;
                            if (i13 < i14 + i15) {
                                c0656a2.delta = i15 - 1;
                                hotel = c0657b.hotel(c0656a2.charlie, 4, c0656a.bravo, 1);
                                i4 = c0656a.bravo;
                                i5 = c0656a2.bravo;
                                if (i4 > i5) {
                                    c0656a2.bravo = i5 + 1;
                                } else {
                                    int i16 = i5 + c0656a2.delta;
                                    if (i4 < i16) {
                                        int i17 = i16 - i4;
                                        hotel2 = c0657b.hotel(c0656a2.charlie, 4, i4 + 1, i17);
                                        c0656a2.delta -= i17;
                                        arrayList.set(i11, c0656a);
                                        if (c0656a2.delta > 0) {
                                            arrayList.set(size, c0656a2);
                                        } else {
                                            arrayList.remove(size);
                                            c0657b.getClass();
                                            c0656a2.charlie = null;
                                            c0657b.alpha.alpha(c0656a2);
                                        }
                                        if (hotel != null) {
                                            arrayList.add(size, hotel);
                                        }
                                        if (hotel2 != null) {
                                            arrayList.add(size, hotel2);
                                        }
                                    }
                                }
                                hotel2 = null;
                                arrayList.set(i11, c0656a);
                                if (c0656a2.delta > 0) {
                                }
                                if (hotel != null) {
                                }
                                if (hotel2 != null) {
                                }
                            }
                        }
                        hotel = null;
                        i4 = c0656a.bravo;
                        i5 = c0656a2.bravo;
                        if (i4 > i5) {
                        }
                        hotel2 = null;
                        arrayList.set(i11, c0656a);
                        if (c0656a2.delta > 0) {
                        }
                        if (hotel != null) {
                        }
                        if (hotel2 != null) {
                        }
                    }
                } else {
                    int i18 = c0656a.bravo;
                    int i19 = c0656a.delta;
                    if (i18 < i19) {
                        if (c0656a2.bravo == i18 && c0656a2.delta == i19 - i18) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z10 = false;
                    } else if (c0656a2.bravo == i19 + 1 && c0656a2.delta == i18 - i19) {
                        z11 = true;
                        z10 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    int i20 = c0656a2.bravo;
                    if (i19 < i20) {
                        c0656a2.bravo = i20 - 1;
                    } else {
                        int i21 = c0656a2.delta;
                        if (i19 < i20 + i21) {
                            c0656a2.delta = i21 - 1;
                            c0656a.alpha = 2;
                            c0656a.delta = 1;
                            if (c0656a2.delta == 0) {
                                arrayList.remove(i11);
                                c0657b.getClass();
                                c0656a2.charlie = null;
                                c0657b.alpha.alpha(c0656a2);
                            }
                        }
                    }
                    int i22 = c0656a.bravo;
                    int i23 = c0656a2.bravo;
                    if (i22 <= i23) {
                        c0656a2.bravo = i23 + 1;
                    } else {
                        int i24 = i23 + c0656a2.delta;
                        if (i22 < i24) {
                            hotel3 = c0657b.hotel(null, 2, i22 + 1, i24 - i22);
                            c0656a2.delta = c0656a.bravo - c0656a2.bravo;
                            if (!z11) {
                                arrayList.set(size, c0656a2);
                                arrayList.remove(i11);
                                c0657b.getClass();
                                c0656a.charlie = null;
                                c0657b.alpha.alpha(c0656a);
                            } else {
                                if (z10) {
                                    if (hotel3 != null) {
                                        int i25 = c0656a.bravo;
                                        if (i25 > hotel3.bravo) {
                                            c0656a.bravo = i25 - hotel3.delta;
                                        }
                                        int i26 = c0656a.delta;
                                        if (i26 > hotel3.bravo) {
                                            c0656a.delta = i26 - hotel3.delta;
                                        }
                                    }
                                    int i27 = c0656a.bravo;
                                    if (i27 > c0656a2.bravo) {
                                        c0656a.bravo = i27 - c0656a2.delta;
                                    }
                                    int i28 = c0656a.delta;
                                    if (i28 > c0656a2.bravo) {
                                        c0656a.delta = i28 - c0656a2.delta;
                                    }
                                } else {
                                    if (hotel3 != null) {
                                        int i29 = c0656a.bravo;
                                        if (i29 >= hotel3.bravo) {
                                            c0656a.bravo = i29 - hotel3.delta;
                                        }
                                        int i30 = c0656a.delta;
                                        if (i30 >= hotel3.bravo) {
                                            c0656a.delta = i30 - hotel3.delta;
                                        }
                                    }
                                    int i31 = c0656a.bravo;
                                    if (i31 >= c0656a2.bravo) {
                                        c0656a.bravo = i31 - c0656a2.delta;
                                    }
                                    int i32 = c0656a.delta;
                                    if (i32 >= c0656a2.bravo) {
                                        c0656a.delta = i32 - c0656a2.delta;
                                    }
                                }
                                arrayList.set(size, c0656a2);
                                if (c0656a.bravo != c0656a.delta) {
                                    arrayList.set(i11, c0656a);
                                } else {
                                    arrayList.remove(i11);
                                }
                                if (hotel3 != null) {
                                    arrayList.add(size, hotel3);
                                }
                            }
                        }
                    }
                    hotel3 = null;
                    if (!z11) {
                    }
                }
            } else {
                int i33 = c0656a.delta;
                int i34 = c0656a2.bravo;
                if (i33 < i34) {
                    i10 = -1;
                } else {
                    i10 = 0;
                }
                int i35 = c0656a.bravo;
                if (i35 < i34) {
                    i10++;
                }
                if (i34 <= i35) {
                    c0656a.bravo = i35 + c0656a2.delta;
                }
                int i36 = c0656a2.bravo;
                if (i36 <= i33) {
                    c0656a.delta = i33 + c0656a2.delta;
                }
                c0656a2.bravo = i36 + i10;
                arrayList.set(size, c0656a2);
                arrayList.set(i11, c0656a);
            }
        }
        int size2 = arrayList.size();
        int i37 = 0;
        while (i37 < size2) {
            C0656a c0656a3 = (C0656a) arrayList.get(i37);
            int i38 = c0656a3.alpha;
            if (i38 != 1) {
                ax axVar = this.delta;
                if (i38 != 2) {
                    if (i38 != 4) {
                        if (i38 == 8) {
                            india(c0656a3);
                        }
                    } else {
                        int i39 = c0656a3.bravo;
                        int i40 = c0656a3.delta + i39;
                        int i41 = i39;
                        int i42 = 0;
                        while (i39 < i40) {
                            if (axVar.bravo(i39) == null && !alpha(i39)) {
                                if (c3 == 1) {
                                    india(hotel(c0656a3.charlie, 4, i41, i42));
                                    i41 = i39;
                                    i42 = 0;
                                }
                                c3 = 0;
                            } else {
                                if (c3 == 0) {
                                    delta(hotel(c0656a3.charlie, 4, i41, i42));
                                    i41 = i39;
                                    i42 = 0;
                                }
                                c3 = 1;
                            }
                            i42++;
                            i39++;
                        }
                        if (i42 != c0656a3.delta) {
                            Object obj = c0656a3.charlie;
                            c0656a3.charlie = null;
                            this.alpha.alpha(c0656a3);
                            c0656a3 = hotel(obj, 4, i41, i42);
                        }
                        if (c3 == 0) {
                            delta(c0656a3);
                        } else {
                            india(c0656a3);
                        }
                    }
                } else {
                    int i43 = c0656a3.bravo;
                    int i44 = c0656a3.delta + i43;
                    int i45 = i43;
                    int i46 = 0;
                    char c10 = 65535;
                    while (i45 < i44) {
                        if (axVar.bravo(i45) == null && !alpha(i45)) {
                            if (c10 == 1) {
                                india(hotel(null, 2, i43, i46));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c4 = 0;
                        } else {
                            if (c10 == 0) {
                                delta(hotel(null, 2, i43, i46));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c4 = 1;
                        }
                        if (z2) {
                            i45 -= i46;
                            i44 -= i46;
                            i46 = 1;
                        } else {
                            i46++;
                        }
                        i45++;
                        c10 = c4;
                    }
                    if (i46 != c0656a3.delta) {
                        c0656a3.charlie = null;
                        this.alpha.alpha(c0656a3);
                        c0656a3 = hotel(null, 2, i43, i46);
                    }
                    if (c10 == 0) {
                        delta(c0656a3);
                    } else {
                        india(c0656a3);
                    }
                }
            } else {
                india(c0656a3);
            }
            i37++;
            c3 = 65535;
        }
        arrayList.clear();
    }

    public final void kilo(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0656a c0656a = (C0656a) arrayList.get(i4);
            c0656a.charlie = null;
            this.alpha.alpha(c0656a);
        }
        arrayList.clear();
    }

    public final int lima(int i4, int i5) {
        int i10;
        int i11;
        ArrayList arrayList = this.charlie;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0656a c0656a = (C0656a) arrayList.get(size);
            int i12 = c0656a.alpha;
            if (i12 == 8) {
                int i13 = c0656a.bravo;
                int i14 = c0656a.delta;
                if (i13 < i14) {
                    i11 = i13;
                    i10 = i14;
                } else {
                    i10 = i13;
                    i11 = i14;
                }
                if (i4 >= i11 && i4 <= i10) {
                    if (i11 == i13) {
                        if (i5 == 1) {
                            c0656a.delta = i14 + 1;
                        } else if (i5 == 2) {
                            c0656a.delta = i14 - 1;
                        }
                        i4++;
                    } else {
                        if (i5 == 1) {
                            c0656a.bravo = i13 + 1;
                        } else if (i5 == 2) {
                            c0656a.bravo = i13 - 1;
                        }
                        i4--;
                    }
                } else if (i4 < i13) {
                    if (i5 == 1) {
                        c0656a.bravo = i13 + 1;
                        c0656a.delta = i14 + 1;
                    } else if (i5 == 2) {
                        c0656a.bravo = i13 - 1;
                        c0656a.delta = i14 - 1;
                    }
                }
            } else {
                int i15 = c0656a.bravo;
                if (i15 <= i4) {
                    if (i12 == 1) {
                        i4 -= c0656a.delta;
                    } else if (i12 == 2) {
                        i4 += c0656a.delta;
                    }
                } else if (i5 == 1) {
                    c0656a.bravo = i15 + 1;
                } else if (i5 == 2) {
                    c0656a.bravo = i15 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0656a c0656a2 = (C0656a) arrayList.get(size2);
            if (c0656a2.alpha == 8) {
                int i16 = c0656a2.delta;
                if (i16 == c0656a2.bravo || i16 < 0) {
                    arrayList.remove(size2);
                    c0656a2.charlie = null;
                    this.alpha.alpha(c0656a2);
                }
            } else if (c0656a2.delta <= 0) {
                arrayList.remove(size2);
                c0656a2.charlie = null;
                this.alpha.alpha(c0656a2);
            }
        }
        return i4;
    }
}
