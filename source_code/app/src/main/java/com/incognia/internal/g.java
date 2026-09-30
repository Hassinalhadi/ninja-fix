package com.incognia.internal;

import E0.e;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.text.a;
import org.json.JSONArray;
import org.json.JSONObject;
import s6.AbstractC2716m6;
import s6.AbstractC2734o6;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: W, reason: collision with root package name */
    public final S0A f10452W;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10453b;

    /* renamed from: f9, reason: collision with root package name */
    public final ActivityManager f10454f9;
    public final Kn5 sVU = new Kn5();
    public static final String gmP = (String) wGk.TqF.getValue();

    /* renamed from: J, reason: collision with root package name */
    public static final String f10451J = (String) wGk.fsI.getValue();

    public g(Context context, S0A s0a) {
        this.f10453b = context;
        this.f10452W = s0a;
        this.f10454f9 = (ActivityManager) context.getSystemService("activity");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:139:0x022f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:180:0x02e9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r10v3, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r11v14, types: [org.json.JSONObject, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [org.json.JSONObject, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r32v1, types: [com.incognia.internal.ipD] */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r39v1, types: [com.incognia.internal.zMr] */
    /* JADX WARN: Type inference failed for: r3v10, types: [org.json.JSONObject, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v31, types: [com.incognia.internal.zMr] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r50v10 */
    /* JADX WARN: Type inference failed for: r50v8 */
    /* JADX WARN: Type inference failed for: r50v9, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r52v5 */
    /* JADX WARN: Type inference failed for: r52v6, types: [com.incognia.internal.MOB] */
    /* JADX WARN: Type inference failed for: r52v7 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v24 */
    public final ArrayList b() {
        List historicalProcessExitReasons;
        int collectionSizeOrDefault;
        int reason;
        int i4;
        InputStream traceInputStream;
        List list;
        Integer num;
        Pair pair;
        ArrayList arrayList;
        int i5;
        int i10;
        Integer num2;
        bP bPVar;
        Throwable th;
        Long l10;
        ipD ipd;
        boolean z2;
        boolean z10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Throwable th2;
        ?? r82;
        String str;
        ?? r32;
        String str2;
        String str3;
        String str4;
        ?? r52;
        ?? r50;
        s9t s9tVar;
        long pss;
        long rss;
        int reason2;
        int status;
        long timestamp;
        String description;
        String processName;
        InputStream traceInputStream2;
        Pair pair2;
        BufferedReader bufferedReader;
        Throwable th3;
        int i11;
        int i12;
        Object obj;
        s9t s9tVar2;
        Object obj2;
        List list2;
        ?? r33;
        int i13 = 1;
        Integer num3 = 0;
        Throwable th4 = null;
        if (!CnH.b(CnH.f8484b, 30, 0, 2)) {
            return null;
        }
        lrk lrkVar = new lrk(((JSONObject) this.f10452W.f9574b.get()).optInt(f10451J, 10), ((JSONObject) this.f10452W.f9574b.get()).optBoolean(gmP, false));
        historicalProcessExitReasons = this.f10454f9.getHistoricalProcessExitReasons(this.f10453b.getPackageName(), 0, 0);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(historicalProcessExitReasons, 10);
        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault);
        Iterator it = historicalProcessExitReasons.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo delta = e.delta(it.next());
            reason = delta.getReason();
            if (reason != 5) {
                traceInputStream2 = delta.getTraceInputStream();
                if (traceInputStream2 == null) {
                    pair2 = new Pair(th4, th4);
                    i4 = i13;
                } else {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(traceInputStream2, a.alpha), 8192);
                        try {
                            W2t w2t = new W2t();
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            objectRef.alpha = new zu0();
                            ArrayList arrayList5 = new ArrayList();
                            StringBuilder sb2 = new StringBuilder();
                            ?? obj3 = new Object();
                            StringBuilder sb3 = new StringBuilder();
                            try {
                                bufferedReader = bufferedReader2;
                                try {
                                    try {
                                        AbstractC2734o6.charlie(bufferedReader, new bUd(lrkVar, sb3, w2t, obj3, objectRef, sb2, arrayList5));
                                        if (arrayList5.isEmpty()) {
                                            i11 = 0;
                                        } else {
                                            int size = arrayList5.size();
                                            int i14 = 0;
                                            i11 = 0;
                                            while (i14 < size) {
                                                Object obj4 = arrayList5.get(i14);
                                                i14 += i13;
                                                if (Intrinsics.areEqual(((ECc) obj4).olU, Kj1.f9019f9) && (i11 = i11 + i13) < 0) {
                                                    CollectionsKt.t();
                                                    throw th4;
                                                }
                                            }
                                        }
                                        if (arrayList5.isEmpty()) {
                                            i12 = 0;
                                        } else {
                                            int size2 = arrayList5.size();
                                            int i15 = 0;
                                            i12 = 0;
                                            while (i15 < size2) {
                                                Object obj5 = arrayList5.get(i15);
                                                i15 += i13;
                                                ECc eCc = (ECc) obj5;
                                                i4 = i13;
                                                if (Intrinsics.areEqual(eCc.olU, Kj1.f9019f9)) {
                                                    RuF ruF = eCc.PqK;
                                                    if (ruF == null) {
                                                        continue;
                                                    } else {
                                                        if (!Intrinsics.areEqual(ruF, ue5.f11489f9) && !Intrinsics.areEqual(ruF, wN.f11746f9)) {
                                                        }
                                                        i12++;
                                                        if (i12 < 0) {
                                                            CollectionsKt.t();
                                                            throw th4;
                                                        }
                                                    }
                                                }
                                                i13 = i4;
                                            }
                                        }
                                        i4 = i13;
                                        try {
                                            List b2 = lrkVar.b(arrayList5);
                                            if (lrkVar.f10861W) {
                                                obj = StringsKt.d(sb3.toString()).toString();
                                            } else {
                                                obj = th4;
                                            }
                                            w2t.Qs = Long.valueOf(i11);
                                            w2t.f9821E = Long.valueOf(i12);
                                            w2t.DOu = b2;
                                            Pair pair3 = new Pair(w2t.b(), obj);
                                            try {
                                                bufferedReader.close();
                                                pair2 = pair3;
                                            } catch (Throwable unused) {
                                                pair2 = new Pair(th4, th4);
                                                s9tVar2 = (s9t) pair2.first;
                                                str4 = (String) pair2.second;
                                                if (s9tVar2 == null) {
                                                }
                                                obj2 = th4;
                                                s9tVar = s9tVar2;
                                                r50 = obj2;
                                                num = num3;
                                                r52 = th4;
                                                String str5 = str4;
                                                pss = delta.getPss();
                                                rss = delta.getRss();
                                                reason2 = delta.getReason();
                                                status = delta.getStatus();
                                                timestamp = delta.getTimestamp();
                                                description = delta.getDescription();
                                                processName = delta.getProcessName();
                                                arrayList4.add(new huR(pss, rss, reason2, status, timestamp, description, processName, r50, str5, r52, s9tVar));
                                                i13 = i4;
                                                num3 = num;
                                                th4 = null;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th3 = th;
                                            try {
                                                throw th3;
                                            } catch (Throwable th6) {
                                                AbstractC2716m6.alpha(bufferedReader, th3);
                                                throw th6;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        i4 = i13;
                                        th3 = th;
                                        throw th3;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                i4 = i13;
                                bufferedReader = bufferedReader2;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            i4 = i13;
                            bufferedReader = bufferedReader2;
                        }
                    } catch (Throwable unused2) {
                        i4 = i13;
                    }
                }
                s9tVar2 = (s9t) pair2.first;
                str4 = (String) pair2.second;
                if (s9tVar2 == null && (list2 = s9tVar2.DOu) != null) {
                    if (!list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.areEqual(((ECc) it2.next()).olU, Kj1.f9019f9)) {
                                r33 = i4;
                                obj2 = Boolean.valueOf((boolean) r33);
                            }
                        }
                    }
                    r33 = 0;
                    obj2 = Boolean.valueOf((boolean) r33);
                } else {
                    obj2 = th4;
                }
                s9tVar = s9tVar2;
                r50 = obj2;
                num = num3;
                r52 = th4;
            } else {
                i4 = i13;
                traceInputStream = delta.getTraceInputStream();
                if (traceInputStream == null) {
                    pair = new Pair(th4, th4);
                    num = num3;
                } else {
                    bP bPVar2 = new bP(traceInputStream);
                    Long l11 = 0L;
                    Boolean bool = Boolean.FALSE;
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Long l12 = 0L;
                    Throwable th11 = th4;
                    ?? r23 = th11;
                    String str6 = r23;
                    String str7 = str6;
                    String str8 = str7;
                    String str9 = str8;
                    String str10 = str9;
                    Long l13 = 0L;
                    Long l14 = 0L;
                    Long l15 = 0L;
                    Long l16 = 0L;
                    Boolean bool2 = bool;
                    String str11 = str10;
                    Throwable th12 = th11;
                    ?? r322 = str9;
                    while (true) {
                        if (bPVar2.b()) {
                            gN W5 = bPVar2.W();
                            switch (W5.f10473b) {
                                case 1:
                                    bPVar = bPVar2;
                                    th = th12;
                                    l11 = Long.valueOf(W5.b());
                                    str = str11;
                                    ipd = r322;
                                    break;
                                case 2:
                                    bPVar = bPVar2;
                                    th = th12;
                                    r23 = W5.W();
                                    str = str11;
                                    ipd = r322;
                                    break;
                                case 3:
                                    bPVar = bPVar2;
                                    th = th12;
                                    str6 = W5.W();
                                    str = str11;
                                    ipd = r322;
                                    break;
                                case 4:
                                    bPVar = bPVar2;
                                    th = th12;
                                    str7 = W5.W();
                                    str = str11;
                                    ipd = r322;
                                    break;
                                case 5:
                                    l10 = l11;
                                    bPVar = bPVar2;
                                    th = th12;
                                    l12 = Long.valueOf(W5.b());
                                    str3 = str11;
                                    l11 = l10;
                                    str = str3;
                                    ipd = r322;
                                    break;
                                case 6:
                                    l10 = l11;
                                    bPVar = bPVar2;
                                    th = th12;
                                    ?? valueOf = Long.valueOf(W5.b());
                                    l13 = valueOf;
                                    str3 = valueOf;
                                    l11 = l10;
                                    str = str3;
                                    ipd = r322;
                                    break;
                                case 7:
                                    l10 = l11;
                                    bPVar = bPVar2;
                                    th = th12;
                                    l14 = Long.valueOf(W5.b());
                                    str3 = str11;
                                    l11 = l10;
                                    str = str3;
                                    ipd = r322;
                                    break;
                                case 8:
                                    bPVar = bPVar2;
                                    th = th12;
                                    str8 = W5.W();
                                    str = str11;
                                    ipd = r322;
                                    break;
                                case 9:
                                    l10 = l11;
                                    bPVar = bPVar2;
                                    th = th12;
                                    arrayList6.add(W5.W());
                                    str3 = str11;
                                    l11 = l10;
                                    str = str3;
                                    ipd = r322;
                                    break;
                                case 10:
                                    Long l17 = l11;
                                    bPVar = bPVar2;
                                    th = th12;
                                    bP bPVar3 = new bP(new ByteArrayInputStream(W5.f10472W));
                                    Boolean bool3 = Boolean.FALSE;
                                    Boolean bool4 = bool3;
                                    Long l18 = 0L;
                                    Integer num4 = num3;
                                    Integer num5 = num4;
                                    Integer num6 = num5;
                                    Integer num7 = num6;
                                    String str12 = null;
                                    String str13 = null;
                                    while (bPVar3.b()) {
                                        gN W10 = bPVar3.W();
                                        switch (W10.f10473b) {
                                            case 1:
                                                num4 = Integer.valueOf(xFC.W(W10.f10472W).intValue());
                                                break;
                                            case 2:
                                                str12 = W10.W();
                                                break;
                                            case 3:
                                                num5 = Integer.valueOf(xFC.W(W10.f10472W).intValue());
                                                break;
                                            case 4:
                                                str13 = W10.W();
                                                break;
                                            case 5:
                                                if (xFC.W(W10.f10472W).intValue() != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                bool3 = Boolean.valueOf(z2);
                                                break;
                                            case 6:
                                                num6 = Integer.valueOf(xFC.W(W10.f10472W).intValue());
                                                break;
                                            case 7:
                                                num7 = Integer.valueOf(xFC.W(W10.f10472W).intValue());
                                                break;
                                            case 8:
                                                if (xFC.W(W10.f10472W).intValue() != 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                bool4 = Boolean.valueOf(z10);
                                                break;
                                            case 9:
                                                l18 = Long.valueOf(W10.b());
                                                break;
                                        }
                                    }
                                    l11 = l17;
                                    ipd = new ipD(num4, str12, num5, str13, bool3, num6, num7, bool4, l18);
                                    str = str11;
                                    break;
                                case 11:
                                case 12:
                                case 13:
                                case 17:
                                case 18:
                                case 19:
                                case 21:
                                default:
                                    l10 = l11;
                                    bPVar = bPVar2;
                                    th = th12;
                                    str3 = str11;
                                    l11 = l10;
                                    str = str3;
                                    ipd = r322;
                                    break;
                                case 14:
                                    bPVar = bPVar2;
                                    th = th12;
                                    str10 = W5.W();
                                    str = str11;
                                    ipd = r322;
                                    break;
                                case 15:
                                    l10 = l11;
                                    bPVar = bPVar2;
                                    th = th12;
                                    bP bPVar4 = new bP(new ByteArrayInputStream(W5.f10472W));
                                    String str14 = null;
                                    uR2 ur2 = null;
                                    while (bPVar4.b()) {
                                        gN W11 = bPVar4.W();
                                        int i16 = W11.f10473b;
                                        if (i16 != 1) {
                                            if (i16 == 2) {
                                                bP bPVar5 = new bP(new ByteArrayInputStream(W11.f10472W));
                                                long j5 = 0;
                                                long j6 = 0;
                                                qWe qwe = null;
                                                while (bPVar5.b()) {
                                                    gN W12 = bPVar5.W();
                                                    int i17 = W12.f10473b;
                                                    if (i17 != 1) {
                                                        if (i17 != 2) {
                                                            if (i17 == 3) {
                                                                bP bPVar6 = new bP(new ByteArrayInputStream(W12.f10472W));
                                                                ArrayList arrayList8 = new ArrayList();
                                                                bP bPVar7 = bPVar4;
                                                                ArrayList arrayList9 = new ArrayList();
                                                                Long l19 = 0L;
                                                                Long l20 = 0L;
                                                                Long l21 = 0L;
                                                                Long l22 = 0L;
                                                                while (bPVar6.b()) {
                                                                    gN W13 = bPVar6.W();
                                                                    switch (W13.f10473b) {
                                                                        case 1:
                                                                            l19 = Long.valueOf(W13.b());
                                                                            break;
                                                                        case 2:
                                                                            l20 = Long.valueOf(W13.b());
                                                                            break;
                                                                        case 3:
                                                                            l21 = Long.valueOf(W13.b());
                                                                            break;
                                                                        case 4:
                                                                            arrayList8.add(BcE.b(W13.f10472W));
                                                                            break;
                                                                        case 5:
                                                                            l22 = Long.valueOf(W13.b());
                                                                            break;
                                                                        case 6:
                                                                            arrayList9.add(BcE.b(W13.f10472W));
                                                                            break;
                                                                    }
                                                                }
                                                                qWe qwe2 = new qWe(l19, l20, l21, arrayList8, l22, arrayList9);
                                                                bPVar4 = bPVar7;
                                                                qwe = qwe2;
                                                            }
                                                        } else {
                                                            j6 = W12.b();
                                                        }
                                                    } else {
                                                        j5 = W12.b();
                                                    }
                                                }
                                                ur2 = new uR2(j5, j6, qwe);
                                            }
                                        } else {
                                            str14 = W11.W();
                                        }
                                    }
                                    arrayList7.add(new jo(str14, ur2));
                                    str3 = str11;
                                    l11 = l10;
                                    str = str3;
                                    ipd = r322;
                                    break;
                                case 16:
                                    if (th12 == null) {
                                        bP bPVar8 = new bP(new ByteArrayInputStream(W5.f10472W));
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        Throwable th13 = th4;
                                        Object obj6 = th13;
                                        Throwable th14 = th12;
                                        while (bPVar8.b()) {
                                            gN W14 = bPVar8.W();
                                            Long l23 = l11;
                                            int i18 = W14.f10473b;
                                            if (i18 != i4) {
                                                if (i18 == 2) {
                                                    bP bPVar9 = new bP(new ByteArrayInputStream(W14.f10472W));
                                                    ArrayList arrayList10 = new ArrayList();
                                                    ArrayList arrayList11 = new ArrayList();
                                                    bP bPVar10 = bPVar2;
                                                    ArrayList arrayList12 = new ArrayList();
                                                    Long l24 = 0L;
                                                    Long l25 = 0L;
                                                    Long l26 = 0L;
                                                    String str15 = null;
                                                    while (bPVar9.b()) {
                                                        gN W15 = bPVar9.W();
                                                        switch (W15.f10473b) {
                                                            case 1:
                                                                arrayList2 = arrayList11;
                                                                arrayList3 = arrayList12;
                                                                l26 = Long.valueOf(W15.b());
                                                                th14 = th14;
                                                                arrayList11 = arrayList2;
                                                                arrayList12 = arrayList3;
                                                                break;
                                                            case 2:
                                                                str15 = W15.W();
                                                                break;
                                                            case 3:
                                                                arrayList2 = arrayList11;
                                                                bP bPVar11 = new bP(new ByteArrayInputStream(W15.f10472W));
                                                                long j7 = 0L;
                                                                String str16 = null;
                                                                Throwable th15 = th14;
                                                                while (bPVar11.b()) {
                                                                    ArrayList arrayList13 = arrayList12;
                                                                    gN W16 = bPVar11.W();
                                                                    Throwable th16 = th15;
                                                                    int i19 = W16.f10473b;
                                                                    if (i19 != 1) {
                                                                        if (i19 == 2) {
                                                                            j7 = Long.valueOf(W16.b());
                                                                        }
                                                                    } else {
                                                                        str16 = W16.W();
                                                                    }
                                                                    th15 = th16;
                                                                    arrayList12 = arrayList13;
                                                                }
                                                                arrayList3 = arrayList12;
                                                                th2 = th15;
                                                                arrayList10.add(new gW3(str16, j7));
                                                                th14 = th2;
                                                                arrayList11 = arrayList2;
                                                                arrayList12 = arrayList3;
                                                                break;
                                                            case 4:
                                                                arrayList12.add(BcE.b(W15.f10472W));
                                                                arrayList2 = arrayList11;
                                                                arrayList3 = arrayList12;
                                                                th2 = th14;
                                                                th14 = th2;
                                                                arrayList11 = arrayList2;
                                                                arrayList12 = arrayList3;
                                                                break;
                                                            case 5:
                                                            default:
                                                                arrayList2 = arrayList11;
                                                                arrayList3 = arrayList12;
                                                                th2 = th14;
                                                                th14 = th2;
                                                                arrayList11 = arrayList2;
                                                                arrayList12 = arrayList3;
                                                                break;
                                                            case 6:
                                                                l24 = Long.valueOf(W15.b());
                                                                break;
                                                            case 7:
                                                                arrayList11.add(W15.W());
                                                                arrayList2 = arrayList11;
                                                                arrayList3 = arrayList12;
                                                                th2 = th14;
                                                                th14 = th2;
                                                                arrayList11 = arrayList2;
                                                                arrayList12 = arrayList3;
                                                                break;
                                                            case 8:
                                                                l25 = Long.valueOf(W15.b());
                                                                break;
                                                        }
                                                    }
                                                    ?? zmr = new zMr(l26, str15, arrayList10, arrayList11, arrayList12, l24, l25);
                                                    l11 = l23;
                                                    th13 = zmr;
                                                    bPVar2 = bPVar10;
                                                    i4 = 1;
                                                    th14 = th14;
                                                }
                                            } else {
                                                obj6 = Long.valueOf(W14.b());
                                            }
                                            l11 = l23;
                                            i4 = 1;
                                            th14 = th14;
                                        }
                                        l10 = l11;
                                        bPVar = bPVar2;
                                        th = th14;
                                        if (th13 != null && obj6 != null) {
                                            linkedHashMap2.put(obj6, th13);
                                        }
                                        linkedHashMap.putAll(linkedHashMap2);
                                        str3 = str11;
                                        l11 = l10;
                                        str = str3;
                                        ipd = r322;
                                        break;
                                    }
                                    l10 = l11;
                                    bPVar = bPVar2;
                                    th = th12;
                                    str3 = str11;
                                    l11 = l10;
                                    str = str3;
                                    ipd = r322;
                                case 20:
                                    bPVar = bPVar2;
                                    th = th12;
                                    l15 = Long.valueOf(W5.b());
                                    str = str11;
                                    ipd = r322;
                                    break;
                                case 22:
                                    bPVar = bPVar2;
                                    th = th12;
                                    l16 = Long.valueOf(W5.b());
                                    str = str11;
                                    ipd = r322;
                                    break;
                                case 23:
                                    if (xFC.W(W5.f10472W).intValue() != 0) {
                                        r82 = i4;
                                    } else {
                                        r82 = 0;
                                    }
                                    bPVar = bPVar2;
                                    th = th12;
                                    bool2 = Boolean.valueOf((boolean) r82);
                                    str = str11;
                                    ipd = r322;
                                    break;
                            }
                            if (str != null && th == null) {
                                r32 = (zMr) linkedHashMap.get(str);
                                if (r32 != 0 && (str2 = r32.f11906W) != null) {
                                    if (!kotlin.text.r.quebec(str2, "ibgnd-", false)) {
                                        pair = new Pair(null, null);
                                        num = num3;
                                        i4 = 1;
                                    }
                                }
                            } else {
                                r32 = th;
                            }
                            bPVar2 = bPVar;
                            th4 = null;
                            i4 = 1;
                            th12 = r32;
                            str11 = str;
                            r322 = ipd;
                        } else {
                            Long l27 = l11;
                            Throwable th17 = th12;
                            if (th17 != null) {
                                list = ab.juliet(th17);
                            } else {
                                list = null;
                            }
                            MOB mob = new MOB(l27, r23, str6, str7, l12, l13, l14, str8, arrayList6, l15, r322, str10, arrayList7, list, l16, bool2);
                            Object obj7 = r23;
                            String str17 = str6;
                            String str18 = str7;
                            String str19 = str8;
                            String str20 = oUH.f11018b;
                            ?? jSONObject = new JSONObject();
                            jSONObject.put(oUH.f11018b, l27.longValue());
                            if (obj7 != null) {
                                jSONObject.put(oUH.f11016W, obj7);
                            }
                            if (str17 != null) {
                                jSONObject.put(oUH.f11019f9, str17);
                            }
                            if (str18 != null) {
                                jSONObject.put(oUH.sVU, str18);
                            }
                            jSONObject.put(oUH.gmP, l12.longValue());
                            jSONObject.put(oUH.f11013J, l13.longValue());
                            jSONObject.put(oUH.PqK, l14.longValue());
                            if (str19 != null) {
                                jSONObject.put(oUH.f11015V, str19);
                            }
                            JSONArray jSONArray = new JSONArray();
                            int size3 = arrayList6.size();
                            int i20 = 0;
                            while (i20 < size3) {
                                Object obj8 = arrayList6.get(i20);
                                i20++;
                                jSONArray.put((String) obj8);
                            }
                            jSONObject.put(oUH.olU, jSONArray);
                            jSONObject.put(oUH.f11014R, mob.f9120R.longValue());
                            ipD ipd2 = mob.DOu;
                            if (ipd2 != null) {
                                jSONObject.put(oUH.DOu, mAt.b(ipd2));
                            }
                            String str21 = mob.IB;
                            if (str21 != null) {
                                jSONObject.put(oUH.IB, str21);
                            }
                            ?? jSONArray2 = new JSONArray();
                            ArrayList arrayList14 = mob.Qs;
                            int size4 = arrayList14.size();
                            int i21 = 0;
                            while (i21 < size4) {
                                Object obj9 = arrayList14.get(i21);
                                int i22 = i21 + 1;
                                jo joVar = (jo) obj9;
                                String str22 = xuF.f11824b;
                                ?? jSONObject2 = new JSONObject();
                                String str23 = joVar.f10713b;
                                if (str23 != null) {
                                    jSONObject2.put(xuF.f11824b, str23);
                                }
                                uR2 ur22 = joVar.f10712W;
                                if (ur22 != null) {
                                    String str24 = xuF.f11823W;
                                    String str25 = At8.f8385b;
                                    ?? jSONObject3 = new JSONObject();
                                    ArrayList arrayList15 = arrayList14;
                                    i5 = size4;
                                    jSONObject3.put(At8.f8385b, ur22.f11468b);
                                    jSONObject3.put(At8.f8384W, ur22.f11467W);
                                    qWe qwe3 = ur22.f11469f9;
                                    if (qwe3 != null) {
                                        String str26 = At8.f8386f9;
                                        String str27 = PDd.f9396b;
                                        JSONObject jSONObject4 = new JSONObject();
                                        i10 = i22;
                                        arrayList = arrayList15;
                                        jSONObject4.put(PDd.f9396b, qwe3.f11153b.longValue());
                                        jSONObject4.put(PDd.f9395W, qwe3.f11152W.longValue());
                                        jSONObject4.put(PDd.f9397f9, qwe3.f11154f9.longValue());
                                        JSONArray jSONArray3 = new JSONArray();
                                        ArrayList arrayList16 = qwe3.sVU;
                                        int size5 = arrayList16.size();
                                        int i23 = 0;
                                        while (i23 < size5) {
                                            Object obj10 = arrayList16.get(i23);
                                            i23++;
                                            jSONArray3.put(gwv.b((TL1) obj10));
                                            num3 = num3;
                                        }
                                        num2 = num3;
                                        jSONObject4.put(PDd.sVU, jSONArray3);
                                        jSONObject4.put(PDd.gmP, qwe3.gmP.longValue());
                                        JSONArray jSONArray4 = new JSONArray();
                                        ArrayList arrayList17 = qwe3.f11151J;
                                        int size6 = arrayList17.size();
                                        int i24 = 0;
                                        while (i24 < size6) {
                                            Object obj11 = arrayList17.get(i24);
                                            i24++;
                                            jSONArray4.put(gwv.b((TL1) obj11));
                                        }
                                        jSONObject4.put(PDd.f9394J, jSONArray4);
                                        jSONObject3.put(str26, jSONObject4);
                                    } else {
                                        num2 = num3;
                                        i10 = i22;
                                        arrayList = arrayList15;
                                    }
                                    jSONObject2.put(str24, jSONObject3);
                                } else {
                                    arrayList = arrayList14;
                                    i5 = size4;
                                    i10 = i22;
                                    num2 = num3;
                                }
                                jSONArray2.put(jSONObject2);
                                size4 = i5;
                                arrayList14 = arrayList;
                                i21 = i10;
                                num3 = num2;
                            }
                            num = num3;
                            jSONObject.put(oUH.Qs, jSONArray2);
                            if (mob.f9118E != null) {
                                ?? jSONArray5 = new JSONArray();
                                for (zMr zmr2 : mob.f9118E) {
                                    String str28 = o9.f10999b;
                                    ?? jSONObject5 = new JSONObject();
                                    jSONObject5.put(o9.f10999b, zmr2.f11907b.longValue());
                                    String str29 = zmr2.f11906W;
                                    if (str29 != null) {
                                        jSONObject5.put(o9.f10998W, str29);
                                    }
                                    JSONArray jSONArray6 = new JSONArray();
                                    ArrayList arrayList18 = zmr2.f11908f9;
                                    int i25 = 0;
                                    for (int size7 = arrayList18.size(); i25 < size7; size7 = size7) {
                                        Object obj12 = arrayList18.get(i25);
                                        i25++;
                                        gW3 gw3 = (gW3) obj12;
                                        String str30 = Oj3.f9325b;
                                        JSONObject jSONObject6 = new JSONObject();
                                        String str31 = gw3.f10484b;
                                        if (str31 != null) {
                                            jSONObject6.put(Oj3.f9325b, str31);
                                        }
                                        jSONObject6.put(Oj3.f9324W, gw3.f10483W.longValue());
                                        jSONArray6.put(jSONObject6);
                                        arrayList18 = arrayList18;
                                    }
                                    jSONObject5.put(o9.f11000f9, jSONArray6);
                                    JSONArray jSONArray7 = new JSONArray();
                                    ArrayList arrayList19 = zmr2.sVU;
                                    int size8 = arrayList19.size();
                                    int i26 = 0;
                                    while (i26 < size8) {
                                        Object obj13 = arrayList19.get(i26);
                                        i26++;
                                        jSONArray7.put((String) obj13);
                                    }
                                    jSONObject5.put(o9.sVU, jSONArray7);
                                    JSONArray jSONArray8 = new JSONArray();
                                    ArrayList arrayList20 = zmr2.gmP;
                                    int size9 = arrayList20.size();
                                    int i27 = 0;
                                    while (i27 < size9) {
                                        Object obj14 = arrayList20.get(i27);
                                        i27++;
                                        jSONArray8.put(gwv.b((TL1) obj14));
                                    }
                                    jSONObject5.put(o9.gmP, jSONArray8);
                                    jSONObject5.put(o9.f10997J, zmr2.f11905J.longValue());
                                    jSONObject5.put(o9.PqK, zmr2.PqK.longValue());
                                    jSONArray5.put(jSONObject5);
                                }
                                i4 = 1;
                                jSONObject.put(oUH.f11012E, jSONArray5);
                            } else {
                                i4 = 1;
                            }
                            jSONObject.put(oUH.f11020n9, mob.f9126n9.longValue());
                            jSONObject.put(oUH.f11017Y, mob.f9123Y.booleanValue());
                            pair = new Pair(mob, jSONObject.toString());
                        }
                    }
                }
                MOB mob2 = (MOB) pair.first;
                str4 = (String) pair.second;
                r52 = mob2;
                r50 = null;
                s9tVar = null;
            }
            String str52 = str4;
            pss = delta.getPss();
            rss = delta.getRss();
            reason2 = delta.getReason();
            status = delta.getStatus();
            timestamp = delta.getTimestamp();
            description = delta.getDescription();
            processName = delta.getProcessName();
            arrayList4.add(new huR(pss, rss, reason2, status, timestamp, description, processName, r50, str52, r52, s9tVar));
            i13 = i4;
            num3 = num;
            th4 = null;
        }
        return arrayList4;
    }
}
