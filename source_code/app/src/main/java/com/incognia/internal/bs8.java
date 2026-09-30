package com.incognia.internal;

import android.util.Log;
import g9.a;
import h9.C1824b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bs8 implements Gg {

    /* renamed from: R, reason: collision with root package name */
    public static final String f10206R;

    /* renamed from: V, reason: collision with root package name */
    public static final String f10207V = (String) wGk.f11622I.getValue();
    public static final ArrayList olU;

    /* renamed from: J, reason: collision with root package name */
    public TCP f10208J;
    public final y6C PqK;

    /* renamed from: W, reason: collision with root package name */
    public final XuT f10209W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f10210b;

    /* renamed from: f9, reason: collision with root package name */
    public final Hs8 f10211f9;
    public D5f sVU = aNe.f10097b;
    public List gmP = CollectionsKt.emptyList();

    static {
        ArrayList arrayList = new ArrayList(10);
        for (int i4 = 0; i4 < 10; i4++) {
            arrayList.add(Long.valueOf(TimeUnit.SECONDS.toMillis(30L)));
        }
        olU = arrayList;
        f10206R = (String) wGk.Dy.getValue();
    }

    public bs8(pl2 pl2Var, XuT xuT, Hs8 hs8, zLI zli) {
        this.f10210b = pl2Var;
        this.f10209W = xuT;
        this.f10211f9 = hs8;
        this.PqK = new y6C(f10207V, pl2Var, new TrU(this));
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.sVU = tOI.f11377b;
        this.f10209W.b(Ri.class, this.PqK);
    }

    public final void PqK() {
        int i4;
        nD nDVar;
        try {
            Hs8 hs8 = this.f10211f9;
            int i5 = nD.f10934W;
            Integer f92 = QHn.f9492b.f9(f10206R);
            if (f92 != null) {
                i4 = f92.intValue();
            } else {
                IG ig2 = IG.f8892f9;
                i4 = 0;
            }
            if (i4 != 0) {
                if (i4 != 1) {
                    nDVar = HCj.f8829f9;
                } else {
                    nDVar = Cc5.f8464f9;
                }
            } else {
                nDVar = IG.f8892f9;
            }
            List b2 = hs8.b(nDVar);
            if (!Intrinsics.areEqual(this.gmP, b2)) {
                this.gmP = b2;
                gmP();
            }
            if (W()) {
                TCP tcp = this.f10208J;
                if (tcp != null) {
                    tcp.f9644J.compareAndSet(false, true);
                }
                if (eSs.f10363b.get()) {
                    Log.i("Incognia", "All Incognia requirements satisfied. Stopping diagnostics.");
                }
            }
        } catch (Throwable unused) {
            if (eSs.f10363b.get()) {
                Log.w("Incognia", "Failed to verify requirements");
            }
        }
    }

    public final boolean W() {
        List list = this.gmP;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(((GNY) obj).f8767b, pYG.f11081b)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            if (!((GNY) obj2).f8766W) {
                return false;
            }
        }
        return true;
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f10210b;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.sVU = b66.f10146b;
        njO.b(this, new a(13, this));
    }

    public final void gmP() {
        String str;
        String str2;
        String str3;
        List list = this.gmP;
        String str4 = (String) wGk.Nu.getValue();
        int size = list.size() + 1;
        String[][] strArr = new String[size];
        for (int i4 = 0; i4 < size; i4++) {
            String[] strArr2 = new String[3];
            for (int i5 = 0; i5 < 3; i5++) {
                strArr2[i5] = "";
            }
            strArr[i4] = strArr2;
        }
        strArr[0][0] = (String) wGk.OXQ.getValue();
        strArr[0][1] = (String) wGk.BH.getValue();
        strArr[0][2] = (String) wGk.CTD.getValue();
        int size2 = list.size();
        if (1 <= size2) {
            int i10 = 1;
            while (true) {
                GNY gny = (GNY) list.get(i10 - 1);
                String[] strArr3 = strArr[i10];
                zKA zka = gny.f8767b;
                Qnk qnk = Qnk.f9518b;
                if (Intrinsics.areEqual(zka, qnk)) {
                    str = (String) wGk.Cch.getValue();
                } else if (Intrinsics.areEqual(zka, aYF.f10104b)) {
                    str = (String) wGk.Hw.getValue();
                } else if (Intrinsics.areEqual(zka, Tk.f9682b)) {
                    str = (String) wGk.EmC.getValue();
                } else if (Intrinsics.areEqual(zka, rG.f11212b)) {
                    str = (String) wGk.ck.getValue();
                } else if (Intrinsics.areEqual(zka, pYG.f11081b)) {
                    str = (String) wGk.vG.getValue();
                } else if (Intrinsics.areEqual(zka, w7.f11599b)) {
                    str = (String) wGk.f11662V9.getValue();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                strArr3[0] = str;
                String[] strArr4 = strArr[i10];
                if (gny.f8766W) {
                    str2 = (String) wGk.YCd.getValue();
                } else {
                    str2 = (String) wGk.UX.getValue();
                }
                strArr4[1] = str2;
                String[] strArr5 = strArr[i10];
                if (gny.f8766W) {
                    str3 = "";
                } else {
                    zKA zka2 = gny.f8767b;
                    if (Intrinsics.areEqual(zka2, qnk)) {
                        str3 = (String) wGk.f11669X4.getValue();
                    } else if (Intrinsics.areEqual(zka2, aYF.f10104b)) {
                        str3 = (String) wGk.Qj.getValue();
                    } else if (Intrinsics.areEqual(zka2, Tk.f9682b)) {
                        str3 = (String) wGk.U0W.getValue();
                    } else if (Intrinsics.areEqual(zka2, rG.f11212b)) {
                        str3 = (String) wGk.JKS.getValue();
                    } else if (Intrinsics.areEqual(zka2, pYG.f11081b)) {
                        str3 = (String) wGk.Ree.getValue();
                    } else if (Intrinsics.areEqual(zka2, w7.f11599b)) {
                        str3 = (String) wGk.rC.getValue();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                strArr5[2] = str3;
                if (i10 == size2) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        String b2 = XC.b(str4, strArr);
        if (b2 != null && eSs.f10363b.get()) {
            Log.i("Incognia", b2);
        }
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.sVU;
    }

    public static final void b(bs8 bs8Var) {
        d7p d7pVar;
        TCP tcp = bs8Var.f10208J;
        if (tcp != null) {
            tcp.f9644J.compareAndSet(false, true);
        }
        pl2 pl2Var = bs8Var.f10210b;
        ArrayList arrayList = olU;
        TCP tcp2 = new TCP(pl2Var, arrayList, new nuz(bs8Var));
        bs8Var.f10208J = tcp2;
        if (!tcp2.f9644J.get() && !tcp2.PqK.get() && (d7pVar = tcp2.gmP) != null) {
            pl2Var.b(((Number) CollectionsKt.gold(arrayList)).longValue(), d7pVar);
        }
        bs8Var.PqK();
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new C1824b(24, this, cj0));
    }

    public static final void b(bs8 bs8Var, Function0 function0) {
        bs8Var.f10209W.W(Ri.class, bs8Var.PqK);
        TCP tcp = bs8Var.f10208J;
        if (tcp != null) {
            tcp.f9644J.compareAndSet(false, true);
        }
        bs8Var.sVU = L4.f9041b;
        function0.invoke();
    }
}
