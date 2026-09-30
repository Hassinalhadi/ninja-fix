package com.incognia.internal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.k;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class sr {

    /* renamed from: W, reason: collision with root package name */
    public final wyZ f11322W;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f11323b;

    /* renamed from: f9, reason: collision with root package name */
    public final Ssq f11324f9;
    public final Uhg sVU;
    public static final String gmP = (String) wGk.vM.getValue();

    /* renamed from: J, reason: collision with root package name */
    public static final String f11320J = (String) wGk.mf.getValue();
    public static final String PqK = (String) wGk.n4H.getValue();

    /* renamed from: V, reason: collision with root package name */
    public static final String f11321V = (String) wGk.Cy.getValue();

    public sr(S0A s0a, wyZ wyz, Ssq ssq, W6 w62, Uhg uhg, R8K r8k) {
        this.f11323b = s0a;
        this.f11322W = wyz;
        this.f11324f9 = ssq;
        this.sVU = uhg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c4, code lost:
    
        if (r0 != null) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01c1  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList b() {
        long j5;
        ArrayList arrayList;
        int collectionSizeOrDefault;
        boolean z2;
        boolean z10;
        String str;
        String str2;
        boolean z11;
        String str3;
        Long l10;
        String str4;
        String str5;
        String str6;
        String str7;
        s9t s9tVar;
        String str8;
        String str9;
        Iterator it;
        Object m206constructorimpl;
        Uxa uxa;
        String str10;
        Long l11;
        Date parse;
        Object m206constructorimpl2;
        String str11;
        Integer tango;
        String str12;
        ArrayList arrayList2;
        int collectionSizeOrDefault2;
        P3H b2 = this.f11322W.b();
        r3 b4 = this.f11324f9.b();
        Uhg uhg = this.sVU;
        ArrayList arrayList3 = new ArrayList();
        int i4 = 1;
        if (((JSONObject) this.f11323b.f9574b.get()).optBoolean(gmP, true)) {
            qbB qbb = qbB.f11156f9;
            arrayList3.add(6);
        }
        if (((JSONObject) this.f11323b.f9574b.get()).optBoolean(f11320J, true)) {
            AW aw2 = AW.f8361f9;
            arrayList3.add(5);
        }
        if (((JSONObject) this.f11323b.f9574b.get()).optBoolean(PqK, true)) {
            Qh qh = Qh.f9514f9;
            arrayList3.add(4);
        }
        if (((JSONObject) this.f11323b.f9574b.get()).optBoolean(f11321V, true)) {
            nyO nyo = nyO.f10981f9;
            arrayList3.add(7);
        }
        ArrayList b6 = uhg.f9724b.b();
        kT kTVar = QHn.f9492b;
        Long sVU = kTVar.sVU(uhg.f9723W);
        long j6 = 0;
        if (sVU != null) {
            j5 = sVU.longValue();
        } else {
            j5 = 0;
        }
        Long sVU2 = kTVar.sVU(uhg.f9723W);
        if (sVU2 != null) {
            j6 = sVU2.longValue();
        }
        if (b6 != null) {
            arrayList = new ArrayList();
            int size = b6.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = b6.get(i5);
                i5 += i4;
                huR hur = (huR) obj;
                long j7 = hur.gmP;
                if (j7 > j6) {
                    j6 = j7;
                }
                if (j7 > j5) {
                    Lazy lazy = OT.f9308W;
                    int i10 = hur.f10578f9;
                    List list = (List) OT.f9308W.getValue();
                    arrayList2 = b6;
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(Integer.valueOf(((OT) it2.next()).f9309b));
                    }
                    if (arrayList4.contains(Integer.valueOf(i10)) && arrayList3.contains(Integer.valueOf(hur.f10578f9))) {
                        arrayList.add(obj);
                    }
                } else {
                    arrayList2 = b6;
                }
                b6 = arrayList2;
                i4 = 1;
            }
        } else {
            arrayList = null;
        }
        QHn.f9492b.b(uhg.f9723W, Long.valueOf(j6));
        Collection collection = arrayList;
        if (arrayList == null) {
            collection = CollectionsKt.emptyList();
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault);
        for (Iterator it3 = collection.iterator(); it3.hasNext(); it3 = it) {
            huR hur2 = (huR) it3.next();
            long j10 = hur2.gmP;
            MOB mob = hur2.f10574R;
            if (mob != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    String str13 = mob.sVU;
                    if (str13 != null) {
                        str11 = StringsKt.a(5, str13);
                    } else {
                        str11 = null;
                    }
                    if (str11 == null) {
                        str11 = "";
                    }
                } catch (Throwable th) {
                    th = th;
                    z2 = false;
                    z10 = true;
                }
                if (str11.length() < 3) {
                    z2 = false;
                    z10 = true;
                } else {
                    z10 = true;
                    try {
                        tango = kotlin.text.r.tango(str11.substring(1, 3));
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = false;
                    }
                    if (tango == null || tango.intValue() > 14) {
                        z2 = false;
                    } else {
                        StringBuilder sb2 = new StringBuilder("Etc/GMT");
                        z2 = false;
                        try {
                            if (str11.charAt(0) == '-') {
                                str12 = "+";
                            } else {
                                str12 = "-";
                            }
                            sb2.append(str12);
                            sb2.append(tango);
                            m206constructorimpl2 = Result.m206constructorimpl(sb2.toString());
                        } catch (Throwable th3) {
                            th = th3;
                            Result.Companion companion2 = Result.INSTANCE;
                            m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th));
                            if (m206constructorimpl2 instanceof k) {
                            }
                            str = (String) m206constructorimpl2;
                        }
                        if (m206constructorimpl2 instanceof k) {
                            m206constructorimpl2 = null;
                        }
                        str = (String) m206constructorimpl2;
                    }
                }
                str = null;
            } else {
                z2 = false;
                z10 = true;
            }
            s9t s9tVar2 = hur2.DOu;
            if (s9tVar2 != null) {
                str = s9tVar2.f11275f9;
            } else {
                str = null;
            }
            if (str == null) {
                str = TimeZone.getDefault().getID();
            }
            String str14 = str;
            MOB mob2 = hur2.f10574R;
            if ((mob2 == null || (str2 = mob2.IB) == null) && (str2 = hur2.f10573J) == null) {
                str2 = (String) wGk.f11656T.getValue();
            }
            String str15 = str2;
            String str16 = hur2.olU;
            if (str16 == null) {
                str16 = (String) wGk.r90.getValue();
            }
            String str17 = str16;
            int i11 = hur2.f10578f9;
            nyO nyo2 = nyO.f10981f9;
            if (i11 != 7) {
                z11 = z10;
            } else {
                z11 = z2;
            }
            String str18 = b2.f9382f9;
            String str19 = b2.f9381b;
            String str20 = b2.sVU;
            String str21 = b2.gmP;
            String str22 = b2.f9377J;
            String str23 = b2.PqK;
            String valueOf = String.valueOf(b2.f9379V);
            if (b4 != null) {
                str3 = b4.f11196R;
            } else {
                str3 = null;
            }
            if (b4 != null) {
                l10 = Long.valueOf(b4.f11200b);
            } else {
                l10 = null;
            }
            if (b4 != null) {
                str4 = b4.DOu;
            } else {
                str4 = null;
            }
            int i12 = hur2.f10578f9;
            Qh qh2 = Qh.f9514f9;
            if (i12 == 4) {
                m7 m7Var = m7.f10881b;
                str6 = (String) wGk.bK.getValue();
            } else {
                AW aw3 = AW.f8361f9;
                if (i12 == 5) {
                    hWD hwd = hWD.f10547b;
                    str7 = (String) wGk.cJ.getValue();
                } else {
                    qbB qbb2 = qbB.f11156f9;
                    if (i12 == 6) {
                        Btb btb = Btb.f8428b;
                        str7 = (String) wGk.eSp.getValue();
                    } else {
                        if (i12 == 7) {
                            o3r o3rVar = o3r.f10994b;
                            str5 = (String) wGk.AnZ.getValue();
                        } else {
                            urU uru = urU.f11507b;
                            str5 = (String) wGk.NZU.getValue();
                        }
                        str6 = str5;
                    }
                }
                str6 = str7;
            }
            long j11 = hur2.f10577b;
            P3H p3h = b2;
            r3 r3Var = b4;
            long j12 = hur2.f10576W;
            int i13 = hur2.f10578f9;
            int i14 = hur2.sVU;
            long j13 = hur2.gmP;
            String str24 = hur2.f10573J;
            String str25 = hur2.PqK;
            Boolean bool = hur2.f10575V;
            s9t s9tVar3 = hur2.DOu;
            MOB mob3 = hur2.f10574R;
            if (mob3 == null) {
                s9tVar = s9tVar3;
                str9 = str25;
                it = it3;
                uxa = null;
            } else {
                s9tVar = s9tVar3;
                Long l12 = mob3.f9124b;
                String str26 = mob3.f9122W;
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    str10 = mob3.sVU;
                } catch (Throwable th4) {
                    th = th4;
                    str8 = str26;
                }
                if (str10 != null) {
                    str8 = str26;
                    try {
                        str9 = str25;
                        it = it3;
                        try {
                            parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSSZ", Locale.US).parse(str10);
                        } catch (Throwable th5) {
                            th = th5;
                            Result.Companion companion4 = Result.INSTANCE;
                            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                            if (m206constructorimpl instanceof k) {
                            }
                            uxa = new Uxa(l12, str8, (Long) m206constructorimpl, mob3.olU, mob3.f9120R, mob3.DOu);
                            arrayList5.add(new PIe(j10, str14, 70901, str15, str17, true, z11, str18, str19, str20, str21, str22, str23, valueOf, str3, l10, str4, 1776277729192L, str6, new dz(j11, j12, i13, i14, j13, str24, str9, bool, s9tVar, uxa)));
                            b2 = p3h;
                            b4 = r3Var;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        str9 = str25;
                        it = it3;
                        Result.Companion companion42 = Result.INSTANCE;
                        m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                        if (m206constructorimpl instanceof k) {
                        }
                        uxa = new Uxa(l12, str8, (Long) m206constructorimpl, mob3.olU, mob3.f9120R, mob3.DOu);
                        arrayList5.add(new PIe(j10, str14, 70901, str15, str17, true, z11, str18, str19, str20, str21, str22, str23, valueOf, str3, l10, str4, 1776277729192L, str6, new dz(j11, j12, i13, i14, j13, str24, str9, bool, s9tVar, uxa)));
                        b2 = p3h;
                        b4 = r3Var;
                    }
                    if (parse != null) {
                        l11 = Long.valueOf(parse.getTime());
                        m206constructorimpl = Result.m206constructorimpl(l11);
                        if (m206constructorimpl instanceof k) {
                            m206constructorimpl = null;
                        }
                        uxa = new Uxa(l12, str8, (Long) m206constructorimpl, mob3.olU, mob3.f9120R, mob3.DOu);
                    }
                } else {
                    str8 = str26;
                    str9 = str25;
                    it = it3;
                }
                l11 = null;
                m206constructorimpl = Result.m206constructorimpl(l11);
                if (m206constructorimpl instanceof k) {
                }
                uxa = new Uxa(l12, str8, (Long) m206constructorimpl, mob3.olU, mob3.f9120R, mob3.DOu);
            }
            arrayList5.add(new PIe(j10, str14, 70901, str15, str17, true, z11, str18, str19, str20, str21, str22, str23, valueOf, str3, l10, str4, 1776277729192L, str6, new dz(j11, j12, i13, i14, j13, str24, str9, bool, s9tVar, uxa)));
            b2 = p3h;
            b4 = r3Var;
        }
        return arrayList5;
    }
}
