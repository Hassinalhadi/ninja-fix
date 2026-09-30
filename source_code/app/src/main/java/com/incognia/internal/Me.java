package com.incognia.internal;

import android.os.SystemClock;
import g9.a;
import h9.C1824b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Me implements Gg {

    /* renamed from: S, reason: collision with root package name */
    public static final long f9141S;
    public static final List eHc;

    /* renamed from: i, reason: collision with root package name */
    public static final List f9142i;
    public final LTK DOu;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9144E;
    public int FL;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f9145H;
    public final y6C H02;
    public boolean IB;

    /* renamed from: J, reason: collision with root package name */
    public final W6 f9146J;

    /* renamed from: L, reason: collision with root package name */
    public int f9147L;

    /* renamed from: P, reason: collision with root package name */
    public int f9148P;
    public final CN1 PqK;
    public boolean Qs;

    /* renamed from: R, reason: collision with root package name */
    public final u0 f9149R;

    /* renamed from: V, reason: collision with root package name */
    public final S0A f9150V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f9151W;

    /* renamed from: Y, reason: collision with root package name */
    public String f9152Y;
    public final ArrayList a2F;

    /* renamed from: ar, reason: collision with root package name */
    public Long f9153ar;

    /* renamed from: b, reason: collision with root package name */
    public final XuT f9154b;

    /* renamed from: f9, reason: collision with root package name */
    public final pl2 f9155f9;
    public final gzW gmP;
    public D5f jgi;

    /* renamed from: n9, reason: collision with root package name */
    public boolean f9156n9;
    public final K olU;
    public final W2 sVU;

    /* renamed from: K, reason: collision with root package name */
    public static final String f9140K = (String) wGk.PD.getValue();
    public static final String qnE = (String) wGk.iA.getValue();

    /* renamed from: s0, reason: collision with root package name */
    public static final String f9143s0 = (String) wGk.XU.getValue();
    public static final String eeB = (String) wGk.gi.getValue();
    public static final String Gw = (String) wGk.sFZ.getValue();

    /* renamed from: G, reason: collision with root package name */
    public static final String f9139G = (String) wGk.YhP.getValue();
    public static final String Pk = (String) wGk.Mm.getValue();
    public static final String fI = (String) wGk.wJ.getValue();
    public static final String WdK = (String) wGk.It.getValue();
    public static final String Sn = (String) wGk.Lzw.getValue();
    public static final String jG = (String) wGk.gcq.getValue();
    public static final long oI = TimeUnit.SECONDS.toMillis(40);
    public static final String iMc = (String) wGk.Xrq.getValue();
    public static final String vZZ = (String) wGk.e0D.getValue();

    static {
        eCe ece = eCe.f10352W;
        f9142i = ab.juliet(ece.W());
        eHc = ab.juliet(ece.W());
        f9141S = TimeUnit.HOURS.toMillis(8L);
    }

    public Me(XuT xuT, ArrayList arrayList, pl2 pl2Var, gzW gzw, W6 w62, CN1 cn1, S0A s0a, K k6, Qy8 qy8) {
        W2 w22 = new W2();
        u0 u0Var = new u0(s0a);
        this.f9154b = xuT;
        this.f9151W = arrayList;
        this.f9155f9 = pl2Var;
        this.sVU = w22;
        this.gmP = gzw;
        this.f9146J = w62;
        this.PqK = cn1;
        this.f9150V = s0a;
        this.olU = k6;
        this.f9149R = u0Var;
        this.DOu = new LTK(qy8.f9528b, pl2Var, new z5(this));
        this.f9148P = -1;
        this.f9147L = -1;
        this.FL = -1;
        this.a2F = new ArrayList();
        this.f9145H = new ArrayList();
        this.H02 = new y6C(f9140K, pl2Var, new Kh(this));
        this.jgi = aNe.f10097b;
    }

    public static final void b(Me me2, Object obj) {
        me2.getClass();
        if (Result.m207exceptionOrNullimpl(obj) == null) {
            AxM axM = (AxM) obj;
            if (me2.IB) {
                me2.sVU.f9820b.put(axM.f8393b, axM);
            }
        }
        ArrayList arrayList = me2.f9151W;
        int i4 = 0;
        if (!(arrayList != null) || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj2 = arrayList.get(i5);
                i5++;
                if (((xIr) ((Rfd) obj2)).sVU) {
                    break;
                }
            }
        }
        if (me2.IB) {
            me2.b(rt.f11248b, new YO(me2));
            return;
        }
        if (me2.f9156n9) {
            ArrayList arrayList2 = me2.f9151W;
            if (arrayList2 == null || !arrayList2.isEmpty()) {
                int size2 = arrayList2.size();
                while (i4 < size2) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    xIr xir = (xIr) ((Rfd) obj3);
                    if (xir.sVU && !xir.gmP) {
                        return;
                    }
                }
            }
            if (me2.f9144E) {
                return;
            }
            me2.f9144E = true;
            me2.b(D6m.f8516b, NG5.f9198b);
        }
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.jgi = tOI.f11377b;
        this.f9154b.b(Nh.class, this.H02);
    }

    public final Long W() {
        long j5;
        Long sVU = QHn.f9493f9.sVU(Gw);
        if (sVU != null) {
            j5 = sVU.longValue();
        } else {
            j5 = 0;
        }
        this.f9146J.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - j5;
        if (elapsedRealtime > 0 && j5 != 0) {
            return Long.valueOf(elapsedRealtime);
        }
        return null;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.jgi = b66.f10146b;
        njO.b(this, new a(6, this));
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.jgi;
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f9155f9;
    }

    public static final void b(Me me2) {
        me2.b(eCe.f10352W);
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        this.f9154b.W(Nh.class, this.H02);
        njO.b(this, new C1824b(10, this, cj0));
    }

    public static final void b(Me me2, Function0 function0) {
        TCP tcp = me2.DOu.sVU;
        if (tcp != null) {
            tcp.f9644J.compareAndSet(false, true);
        }
        me2.sVU.f9820b.clear();
        me2.IB = false;
        me2.f9152Y = null;
        me2.Qs = false;
        me2.f9144E = false;
        me2.f9156n9 = false;
        me2.f9145H.clear();
        me2.a2F.clear();
        me2.jgi = L4.f9041b;
        function0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ee A[LOOP:7: B:101:0x01ec->B:102:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2 A[LOOP:2: B:50:0x00f0->B:51:0x00f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173 A[LOOP:5: B:77:0x0171->B:78:0x0173, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(U91 u91) {
        ArrayList arrayList;
        int i4;
        boolean z2;
        int collectionSizeOrDefault;
        int size;
        int i5;
        int size2;
        int i10;
        int size3;
        int i11;
        int size4;
        int i12;
        TCP tcp;
        TCP tcp2;
        pl2 pl2Var;
        ArrayList arrayList2;
        int size5;
        int i13;
        int size6;
        d7p d7pVar;
        int size7;
        int i14;
        Long W5;
        if (this.PqK.b()) {
            if (u91 != null && !Intrinsics.areEqual(this.olU.b(), i.f10596b)) {
                List b2 = this.f9150V.b(Pk, eHc);
                long optLong = ((JSONObject) this.f9150V.f9574b.get()).optLong(fI, f9141S);
                if (!b2.isEmpty()) {
                    if (optLong > 0 && b2.contains(u91.W()) && (W5 = W()) != null && W5.longValue() < optLong) {
                        kT kTVar = QHn.f9492b;
                        String str = f9139G;
                        Long sVU = kTVar.sVU(str);
                        kTVar.b(str, Long.valueOf((sVU != null ? sVU.longValue() : 0L) + 1));
                        return;
                    }
                }
            }
            if (!this.IB) {
                this.IB = true;
                if (u91 != null) {
                    this.f9145H.add(u91);
                }
                this.f9152Y = UUID.randomUUID().toString();
                List b4 = this.f9150V.b(vZZ, f9142i);
                Lazy lazy = U91.f9697b;
                if (b4 != null) {
                    arrayList = new ArrayList();
                    Iterator it = b4.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(kBc.b((String) it.next()));
                        } catch (Throwable unused) {
                        }
                    }
                    i4 = 0;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        size7 = arrayList.size();
                        i14 = 0;
                        while (i14 < size7) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            if (this.f9145H.contains((U91) obj)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    this.f9156n9 = z2;
                    ArrayList arrayList3 = this.f9145H;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
                    ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault);
                    size = arrayList3.size();
                    i5 = 0;
                    while (i5 < size) {
                        Object obj2 = arrayList3.get(i5);
                        i5++;
                        arrayList4.add(((U91) obj2).W());
                    }
                    this.f9146J.getClass();
                    this.f9153ar = Long.valueOf(SystemClock.elapsedRealtime());
                    pl2 pl2Var2 = mXi.f10907b;
                    this.f9148P = mXi.b(WdK);
                    this.FL = mXi.b(jG);
                    if (this.f9156n9) {
                        this.f9147L = mXi.b(Sn);
                    }
                    ArrayList arrayList5 = this.f9151W;
                    ArrayList arrayList6 = new ArrayList();
                    size2 = arrayList5.size();
                    i10 = 0;
                    while (i10 < size2) {
                        Object obj3 = arrayList5.get(i10);
                        i10++;
                        if (!((xIr) ((Rfd) obj3)).sVU) {
                            arrayList6.add(obj3);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList();
                    size3 = arrayList6.size();
                    i11 = 0;
                    while (i11 < size3) {
                        Object obj4 = arrayList6.get(i11);
                        i11++;
                        if (((xIr) ((Rfd) obj4)).f11785W) {
                            arrayList7.add(obj4);
                        }
                    }
                    size4 = arrayList7.size();
                    i12 = 0;
                    while (i12 < size4) {
                        Object obj5 = arrayList7.get(i12);
                        i12++;
                        ((xIr) ((Rfd) obj5)).b(this.f9155f9, new mhm(this), new nfn(this), this.f9145H);
                    }
                    LTK ltk = this.DOu;
                    tcp = ltk.sVU;
                    if (tcp != null) {
                        tcp.f9644J.compareAndSet(false, true);
                    }
                    pl2Var = ltk.f9058b;
                    arrayList2 = ltk.f9059f9;
                    tcp2 = new TCP(pl2Var, arrayList2, new tr(ltk));
                    ltk.sVU = tcp2;
                    if (!tcp2.f9644J.get() && !tcp2.PqK.get() && (d7pVar = tcp2.gmP) != null) {
                        pl2Var.b(((Number) CollectionsKt.gold(arrayList2)).longValue(), d7pVar);
                    }
                    ArrayList arrayList8 = new ArrayList();
                    size5 = arrayList6.size();
                    i13 = 0;
                    while (i13 < size5) {
                        Object obj6 = arrayList6.get(i13);
                        i13++;
                        if (!((xIr) ((Rfd) obj6)).f11785W) {
                            arrayList8.add(obj6);
                        }
                    }
                    size6 = arrayList8.size();
                    while (i4 < size6) {
                        Object obj7 = arrayList8.get(i4);
                        i4++;
                        ((xIr) ((Rfd) obj7)).b(this.f9155f9, new Oa(this), new qf(this), this.f9145H);
                    }
                    return;
                }
                arrayList = null;
                i4 = 0;
                if (arrayList != null) {
                    size7 = arrayList.size();
                    i14 = 0;
                    while (i14 < size7) {
                    }
                }
                z2 = false;
                this.f9156n9 = z2;
                ArrayList arrayList32 = this.f9145H;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList32, 10);
                ArrayList arrayList42 = new ArrayList(collectionSizeOrDefault);
                size = arrayList32.size();
                i5 = 0;
                while (i5 < size) {
                }
                this.f9146J.getClass();
                this.f9153ar = Long.valueOf(SystemClock.elapsedRealtime());
                pl2 pl2Var22 = mXi.f10907b;
                this.f9148P = mXi.b(WdK);
                this.FL = mXi.b(jG);
                if (this.f9156n9) {
                }
                ArrayList arrayList52 = this.f9151W;
                ArrayList arrayList62 = new ArrayList();
                size2 = arrayList52.size();
                i10 = 0;
                while (i10 < size2) {
                }
                ArrayList arrayList72 = new ArrayList();
                size3 = arrayList62.size();
                i11 = 0;
                while (i11 < size3) {
                }
                size4 = arrayList72.size();
                i12 = 0;
                while (i12 < size4) {
                }
                LTK ltk2 = this.DOu;
                tcp = ltk2.sVU;
                if (tcp != null) {
                }
                pl2Var = ltk2.f9058b;
                arrayList2 = ltk2.f9059f9;
                tcp2 = new TCP(pl2Var, arrayList2, new tr(ltk2));
                ltk2.sVU = tcp2;
                if (!tcp2.f9644J.get()) {
                    pl2Var.b(((Number) CollectionsKt.gold(arrayList2)).longValue(), d7pVar);
                }
                ArrayList arrayList82 = new ArrayList();
                size5 = arrayList62.size();
                i13 = 0;
                while (i13 < size5) {
                }
                size6 = arrayList82.size();
                while (i4 < size6) {
                }
                return;
            }
            this.Qs = true;
            if (u91 != null) {
                this.a2F.add(u91);
            }
        }
    }

    public final void b(MP mp, Function0 function0) {
        if (Intrinsics.areEqual(mp, rt.f11248b) ? true : Intrinsics.areEqual(mp, IW7.f8906b)) {
            pl2 pl2Var = mXi.f10907b;
            mXi.f9(this.f9148P);
            mXi.b(this.f9147L);
            mXi.b(this.FL);
        } else if (Intrinsics.areEqual(mp, D6m.f8516b)) {
            pl2 pl2Var2 = mXi.f10907b;
            mXi.f9(this.f9147L);
        } else if (Intrinsics.areEqual(mp, rc.f11241b)) {
            pl2 pl2Var3 = mXi.f10907b;
            mXi.f9(this.FL);
        }
        pl2 pl2Var4 = mXi.f10907b;
        mXi.b(new qK(this, mp, function0));
    }

    public final void b(MP mp, List list) {
        jNy jny;
        long j5;
        Long l10 = this.f9153ar;
        if (l10 != null) {
            long longValue = l10.longValue();
            this.f9146J.getClass();
            if (SystemClock.elapsedRealtime() - longValue > oI) {
                return;
            }
        }
        if (this.PqK.b() && !this.sVU.f9820b.isEmpty()) {
            W2 w22 = this.sVU;
            FM4 fm4 = new FM4();
            for (AxM axM : w22.f9820b.values()) {
                FYk fYk = axM.f8392W;
                if (fYk.f8711W || fYk.f8712b || fYk.f8713f9) {
                    O0s o0s = axM.sVU;
                    o0s.getClass();
                    o0s.f9282b.b(fm4);
                    axM.f8394f9.invoke();
                }
            }
            Om om = new Om(fm4.f8685b, fm4.f8681W, fm4.f8688f9, fm4.sVU, fm4.gmP, fm4.f8671J, fm4.PqK, fm4.f8680V, fm4.olU, fm4.f8678R, fm4.DOu, fm4.IB, fm4.Qs, fm4.f8667E, fm4.f8691n9, fm4.f8682Y, fm4.f8676P, fm4.f8673L, fm4.FL, fm4.f8684ar, fm4.a2F, fm4.f8669H, fm4.H02, fm4.jgi, fm4.f8672K, fm4.qnE, fm4.f8694s0, fm4.eeB, fm4.Gw, fm4.f8668G, fm4.Pk, fm4.fI, fm4.WdK, fm4.Sn, fm4.jG, fm4.oI, fm4.iMc, fm4.vZZ, fm4.f8689i, fm4.eHc, fm4.f8679S, fm4.mn, fm4.Uj, fm4.VL, fm4.wcf, fm4.f8674M, fm4.f8692r, fm4.s1O, fm4.Lu, fm4.f8670H8, fm4.n4S, fm4.CM5, fm4.Q, fm4.Mo1, fm4.nK, fm4.AL, fm4.OyQ, fm4.f8700z, fm4.C, fm4.OJ, fm4.TF1, fm4.mi, fm4.f8686b8, fm4.nT, fm4.hod, fm4.Ni, fm4.f8683Y3, fm4.iM, fm4.f8698xg, fm4.Wdw, fm4.jQN, fm4.UhN, fm4.zX, fm4.f8675O, fm4.f8699y, fm4.pTL, fm4.PRS, fm4.GT, fm4.k8u, fm4.oRC, fm4.f8693s, fm4.YaL, fm4.Btp, fm4.el, fm4.j43, fm4.JE, fm4.f8687d, fm4.f8696w, fm4.nMp, fm4.i2a, fm4.kTC, fm4.grA, fm4.rkR, fm4.f8697x, fm4.f8677P7, fm4.As, fm4.gG, fm4.sA, fm4.Hz, fm4.f8695u, fm4.lCi, fm4.f8690k, fm4.bCl);
            if (this.f9152Y == null) {
                this.f9152Y = UUID.randomUUID().toString();
            }
            List z2 = CollectionsKt.z(this.f9145H);
            kT kTVar = QHn.f9493f9;
            Long sVU = kTVar.sVU(f9143s0);
            long longValue2 = sVU != null ? sVU.longValue() : 0L;
            Long sVU2 = kTVar.sVU(eeB);
            long longValue3 = sVU2 != null ? sVU2.longValue() : 0L;
            String b2 = mp.b();
            Long W5 = W();
            Long sVU3 = QHn.f9492b.sVU(f9139G);
            jNy jny2 = new jNy(longValue2, longValue3, b2, W5, Long.valueOf(sVU3 != null ? sVU3.longValue() : 0L), list);
            String str = this.f9152Y;
            String str2 = qnE;
            Long sVU4 = kTVar.sVU(str2);
            if (sVU4 != null) {
                jny = jny2;
                j5 = sVU4.longValue();
            } else {
                jny = jny2;
                j5 = 0;
            }
            AZ az = new AZ(str, om, z2, j5, jny);
            jNy jny3 = jny;
            JSONObject b4 = az.b();
            if (b4 == null) {
                return;
            }
            Long sVU5 = kTVar.sVU(str2);
            kTVar.b(str2, Long.valueOf((sVU5 != null ? sVU5.longValue() : 0L) + 1));
            gzW gzw = this.gmP;
            String str3 = iMc;
            this.f9146J.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            this.f9146J.getClass();
            XD xd2 = new XD(str3, b4, currentTimeMillis, TimeZone.getDefault().getID());
            vC vCVar = new vC(this, z2, az, jny3);
            gzw.getClass();
            gzw.b(ab.juliet(xd2), IH0.f8893b, vCVar, true);
            this.f9154b.b(az);
        }
    }
}
