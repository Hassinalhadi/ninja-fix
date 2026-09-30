package com.incognia.internal;

import android.content.Context;
import android.util.Log;
import com.incognia.IncogniaOptions;
import g9.a;
import h9.C1823a;
import h9.C1830h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public abstract class RjL {

    /* renamed from: b, reason: collision with root package name */
    public static final pl2 f9562b = new pl2(Pgh.f9443b, true);

    /* renamed from: W, reason: collision with root package name */
    public static final fX f9561W = new Object();

    public static final void W() {
        f9();
    }

    public static final void b(Function1 function1) {
        try {
            function1.invoke((ow) DDS.f8521b.get());
        } catch (Throwable th) {
            L3 l32 = new L3(th);
            if (eSs.f10363b.get()) {
                Log.e("Incognia", "Error running the Incognia SDK! " + l32.getMessage());
            }
            ow owVar = (ow) DDS.f8521b.get();
            owVar.getClass();
            if (owVar instanceof zfv) {
                ((Q6I) X8.W()).f9470P.b(th, false);
            } else {
                Lsv.b(th, false);
            }
        }
    }

    public static void f9() {
        try {
            X8.W();
            List b2 = b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : b2) {
                if (Intrinsics.areEqual(((Gg) obj).sVU(), b66.f10146b)) {
                    arrayList.add(obj);
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                ((Gg) obj2).b(new Cj0(countDownLatch));
            }
            countDownLatch.await();
        } catch (NullPointerException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x01bf, code lost:
    
        if (r4 == null) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x043f A[Catch: all -> 0x0461, TryCatch #0 {all -> 0x0461, blocks: (B:68:0x0428, B:70:0x043f, B:71:0x045b), top: B:67:0x0428 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(vY vYVar) {
        Long l10;
        String W5;
        boolean z2;
        Long valueOf;
        Object obj;
        List list;
        List emptyList;
        File b2;
        String readText$default;
        Long valueOf2;
        String readText$default2;
        AtomicBoolean atomicBoolean;
        Context context = OQ.f9304b;
        if (context != null) {
            vY vYVar2 = (vY) new DKT(new GZq(), context, vYVar).f8529b.get();
            if (vYVar2 == null) {
                vYVar2 = new vY((String) null, false, false, false, 30);
            }
            AtomicBoolean atomicBoolean2 = eSs.f10363b;
            eSs.f10363b.set(vYVar2.f11552W);
            AtomicReference atomicReference = DDS.f8521b;
            DDS.f8520W.add(f9561W);
            VJU vju = At.f8382W;
            r3 b4 = new Ssq(context, vYVar2, new XMI(new W(new S0A(null)))).b();
            pl2 pl2Var = new pl2(ZH6.f10036b, true);
            o1Y o1y = new o1Y(context);
            Zno zno = new Zno(context, pl2Var);
            kT kTVar = QHn.f9492b;
            String str = Zno.f10065f9;
            M39 m39 = (M39) kTVar.b(bFB.f10165b, str);
            if (m39 == null) {
                m39 = zno.b();
                if (m39 != null) {
                    kTVar.b(str, m39, sb.f11307b);
                } else {
                    m39 = null;
                }
            }
            if (b4 == null) {
                sG0 sg0 = Lsv.f9086b;
                Lsv.b((Throwable) new qt(), false);
                z2 = true;
                obj = null;
            } else {
                long j5 = b4.f11201f9;
                Integer valueOf3 = m39 != null ? Integer.valueOf(m39.f9096W) : null;
                try {
                    b2 = o1y.b(odR.f11028W);
                } catch (Throwable unused) {
                }
                if (b2 != null) {
                    File file = new File(b2, o1Y.f10987W);
                    if (file.exists()) {
                        readText$default2 = FilesKt__FileReadWriteKt.readText$default(file, null, 1, null);
                        valueOf2 = Long.valueOf(Long.parseLong(readText$default2));
                        l10 = valueOf2;
                        Nk6 nk6 = QHn.sVU;
                        W5 = nk6.W(Zno.sVU);
                        if (W5 != null) {
                            z2 = true;
                        } else {
                            z2 = true;
                            vQ vQVar = new vQ(zno.f10067b, Zno.f10063R);
                            vQ vQVar2 = new vQ(zno.f10067b, Zno.DOu);
                            vQ vQVar3 = new vQ(zno.f10067b, Zno.IB);
                            bdh b6 = new d9U(vQVar2, vQVar3, vQVar).b();
                            if (!Intrinsics.areEqual(b6, GmL.f8809W)) {
                                if (Intrinsics.areEqual(b6, Q7W.f9485W)) {
                                    vQVar2 = vQVar3;
                                } else {
                                    if (!Intrinsics.areEqual(b6, odR.f11028W)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    W5 = null;
                                    if (W5 == null) {
                                        W5 = null;
                                    }
                                }
                            }
                            String W10 = vQVar2.W(Wjl.f9867b, Wjl.f9866W);
                            if (W10 != null) {
                                W5 = kotlin.text.r.oscar(W10, Zno.Qs, "").toLowerCase(Locale.getDefault());
                                if (W5 == null) {
                                }
                            }
                            W5 = null;
                            if (W5 == null) {
                            }
                        }
                        valueOf = m39 != null ? Long.valueOf(m39.f9097b) : null;
                        if (valueOf == null && valueOf.longValue() > 0 && valueOf.longValue() + At.f8383b < j5) {
                            int intValue = (valueOf3 != null ? valueOf3.intValue() : 0) + 1;
                            Integer valueOf4 = Integer.valueOf(intValue);
                            if (W5 != null && W5.length() != 0) {
                                if (m39 == null || (emptyList = m39.f9098f9) == null) {
                                    emptyList = CollectionsKt.emptyList();
                                }
                                ArrayList B = CollectionsKt.B(emptyList);
                                B.add(W5);
                                if (B.size() > 10) {
                                    B.remove(0);
                                    list = B;
                                } else {
                                    list = B;
                                }
                            } else {
                                if (m39 != null) {
                                    List list2 = m39.f9098f9;
                                    list = list2;
                                }
                                list = CollectionsKt.emptyList();
                            }
                            List list3 = list;
                            Long valueOf5 = m39 != null ? Long.valueOf(m39.f9097b) : null;
                            WEp wEp = WEp.f9842b;
                            At.f8382W = new VJU(Long.valueOf(j5), l10, valueOf5, W5, intValue, (String) wGk.Mri.getValue(), list3);
                            nk6.b(cxz.f10268b);
                            FVj fVj = FVj.f8708b;
                            vQ vQVar4 = new vQ(context, FVj.f8707W);
                            vQ vQVar5 = new vQ(context, FVj.f8709f9);
                            vQ vQVar6 = new vQ(context, FVj.sVU);
                            vQVar4.b();
                            vQVar5.b();
                            vQVar6.b();
                            for (String str2 : fVj.b()) {
                                if (context.getDatabasePath(str2).exists()) {
                                    context.deleteDatabase(str2);
                                }
                            }
                            aG.f10092b.getClass();
                            for (String str3 : (List) aG.f10091W.getValue()) {
                                if (context.getDatabasePath(str3).exists()) {
                                    context.deleteDatabase(str3);
                                }
                            }
                            QHn.f9492b.f9();
                            QHn.f9491W.f9();
                            QHn.f9493f9.f9();
                            nk6.b();
                            zno.b(System.currentTimeMillis(), valueOf4, list3);
                            obj = null;
                        } else if (l10 == null && j5 != l10.longValue()) {
                            Long valueOf6 = m39 != null ? Long.valueOf(m39.f9097b) : null;
                            int intValue2 = valueOf3 != null ? valueOf3.intValue() : 0;
                            bv bvVar = bv.f10215b;
                            At.f8382W = new VJU(Long.valueOf(j5), l10, valueOf6, intValue2, (String) wGk.V0w.getValue(), m39 != null ? m39.f9098f9 : null, 8);
                            obj = null;
                            zno.b(System.currentTimeMillis(), null, null);
                        } else {
                            int i4 = m39 != null ? m39.f9096W : 0;
                            Long valueOf7 = m39 != null ? Long.valueOf(m39.f9097b) : null;
                            hi hiVar = hi.f10563b;
                            At.f8382W = new VJU(Long.valueOf(j5), l10, valueOf7, i4, (String) wGk.Ev.getValue(), m39 != null ? m39.f9098f9 : null, 8);
                            obj = null;
                            zno.b(System.currentTimeMillis(), null, null);
                        }
                        o1y.b(j5);
                    }
                }
                File b10 = o1y.b(o1y.b());
                if (b10 != null) {
                    File file2 = new File(b10, o1Y.f10987W);
                    if (file2.exists()) {
                        readText$default = FilesKt__FileReadWriteKt.readText$default(file2, null, 1, null);
                        long parseLong = Long.parseLong(readText$default);
                        o1y.b(parseLong);
                        file2.delete();
                        valueOf2 = Long.valueOf(parseLong);
                        l10 = valueOf2;
                        Nk6 nk62 = QHn.sVU;
                        W5 = nk62.W(Zno.sVU);
                        if (W5 != null) {
                        }
                        if (m39 != null) {
                        }
                        if (valueOf == null) {
                        }
                        if (l10 == null) {
                        }
                        if (m39 != null) {
                        }
                        if (m39 != null) {
                        }
                        hi hiVar2 = hi.f10563b;
                        At.f8382W = new VJU(Long.valueOf(j5), l10, valueOf7, i4, (String) wGk.Ev.getValue(), m39 != null ? m39.f9098f9 : null, 8);
                        obj = null;
                        zno.b(System.currentTimeMillis(), null, null);
                        o1y.b(j5);
                    }
                }
                l10 = null;
                Nk6 nk622 = QHn.sVU;
                W5 = nk622.W(Zno.sVU);
                if (W5 != null) {
                }
                if (m39 != null) {
                }
                if (valueOf == null) {
                }
                if (l10 == null) {
                }
                if (m39 != null) {
                }
                if (m39 != null) {
                }
                hi hiVar22 = hi.f10563b;
                At.f8382W = new VJU(Long.valueOf(j5), l10, valueOf7, i4, (String) wGk.Ev.getValue(), m39 != null ? m39.f9098f9 : null, 8);
                obj = null;
                zno.b(System.currentTimeMillis(), null, null);
                o1y.b(j5);
            }
            EDm.b(context);
            AtomicReference atomicReference2 = X8.f9893b;
            atomicReference2.set(obj);
            Q6I q6i = new Q6I(context, vYVar2);
            while (!atomicReference2.compareAndSet(obj, q6i) && atomicReference2.get() == null) {
            }
            Iterator it = b().iterator();
            while (it.hasNext()) {
                ((Gg) it.next()).J();
            }
            List b11 = b();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : b11) {
                if (Intrinsics.areEqual(((Gg) obj2).sVU(), tOI.f11377b)) {
                    arrayList.add(obj2);
                }
            }
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj3 = arrayList.get(i5);
                i5++;
                ((Gg) obj3).f9();
            }
            BA2.b();
            AtomicReference atomicReference3 = DDS.f8521b;
            DDS.b(zfv.f11934b);
            String str4 = vYVar2.f11553b;
            try {
                KZN kzn = new KZN(((Q6I) X8.W()).eeB, ((Q6I) X8.W()).Pk);
                if (!kzn.b() && eSs.f10363b.get()) {
                    Log.e("Incognia", "Missing required manifest components for the Incognia SDK. Functionality will be limited.");
                }
                List list4 = KZN.sVU;
                if (list4 == null) {
                    z2 = false;
                }
                if (!z2 || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (!kzn.f9009W.b((String) it2.next())) {
                            if (eSs.f10363b.get()) {
                                Log.e("Incognia", "Missing required manifest permissions for the Incognia SDK. Functionality will be limited.");
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            try {
                if (str4 != null && str4.length() != 0) {
                    if (!new Regex((String) wGk.f11641Od.getValue()).echo(str4) && eSs.f10363b.get()) {
                        Log.e("Incognia", "Invalid application ID. You must call Incognia.init(...) with a valid application ID on the IncogniaOptions or the incognia.properties file.");
                    }
                    atomicBoolean = eSs.f10363b;
                    if (atomicBoolean.get()) {
                        Log.i("Incognia", "Incognia SDK 7.9.1 is running");
                    }
                    Result.Companion companion = Result.INSTANCE;
                    vh vhVar = new vh(cxz.b(), String.valueOf(vYVar2.f11553b));
                    if (atomicBoolean.get()) {
                        Log.i("Incognia", "Incognia debug token: " + ((String) vhVar.f11565f9.getValue()));
                    }
                    Result.m206constructorimpl(Unit.INSTANCE);
                    return;
                }
                Result.Companion companion2 = Result.INSTANCE;
                vh vhVar2 = new vh(cxz.b(), String.valueOf(vYVar2.f11553b));
                if (atomicBoolean.get()) {
                }
                Result.m206constructorimpl(Unit.INSTANCE);
                return;
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m206constructorimpl(ResultKt.createFailure(th));
                return;
            }
            if (eSs.f10363b.get()) {
                Log.e("Incognia", "Incognia.init() called without an application Id. You must call Incognia.init(...) with a valid application ID on the IncogniaOptions or the incognia.properties file.");
            }
            atomicBoolean = eSs.f10363b;
            if (atomicBoolean.get()) {
            }
        } else {
            throw new NullPointerException("Using SDK context before initialization");
        }
    }

    public static List b() {
        return CollectionsKt.listOf(((Q6I) X8.W()).f9470P, ((Q6I) X8.W()).sVU, ((Q6I) X8.W()).gmP, ((Q6I) X8.W()).f9472S, ((Q6I) X8.W()).f9464H, ((Q6I) X8.W()).H02, ((Q6I) X8.W()).f9476ar, ((Q6I) X8.W()).PqK, ((Q6I) X8.W()).f9466J, ((Q6I) X8.W()).mn, ((Q6I) X8.W()).oI, ((Q6I) X8.W()).IB, ((Q6I) X8.W()).olU, ((Q6I) X8.W()).f9468L, ((Q6I) X8.W()).f9475Y, ((Q6I) X8.W()).f9477b, ((Q6I) X8.W()).Gw, ((Q6I) X8.W()).f9463G, ((Q6I) X8.W()).qnE, ((Q6I) X8.W()).jG, ((Q6I) X8.W()).vZZ, ((Q6I) X8.W()).f9474W);
    }

    public static final void b(ow owVar) {
        if (Intrinsics.areEqual(owVar, RXl.f9550b)) {
            f9562b.b(new C1823a(4));
        }
    }

    public static void b(Context context, IncogniaOptions incogniaOptions) {
        adG.b();
        int b2 = mXi.b("internal_init");
        OQ.f9304b = context.getApplicationContext().getApplicationContext();
        AtomicReference atomicReference = DDS.f8521b;
        f0 f0Var = f0.f10395b;
        GLs gLs = GLs.f8764b;
        AtomicReference atomicReference2 = DDS.f8521b;
        while (true) {
            if (atomicReference2.compareAndSet(f0Var, gLs)) {
                Iterator it = DDS.f8520W.iterator();
                while (it.hasNext()) {
                    ((fX) it.next()).b(gLs);
                }
            } else if (atomicReference2.get() != f0Var) {
                break;
            }
        }
        AtomicReference atomicReference3 = IZZ.f8909W;
        Context context2 = OQ.f9304b;
        if (context2 != null) {
            IZZ.b(context2.getApplicationContext());
            f9562b.b(new C1830h(incogniaOptions, b2));
            return;
        }
        throw new NullPointerException("Using SDK context before initialization");
    }

    public static final void b(IncogniaOptions incogniaOptions, int i4) {
        vY vYVar;
        if (incogniaOptions != null) {
            try {
                vYVar = new vY(incogniaOptions.getAppId(), incogniaOptions.getLogEnabled(), incogniaOptions.getLocationEnabled(), incogniaOptions.getInstalledAppsCollectionEnabled(), 16);
            } catch (Throwable th) {
                try {
                    AtomicReference atomicReference = DDS.f8521b;
                    DDS.b(d3Z.f10279b);
                    f9562b.b(new a(9, th));
                    return;
                } finally {
                    mXi.f9(i4);
                }
            }
        } else {
            vYVar = null;
        }
        ow owVar = (ow) DDS.f8521b.get();
        if (Intrinsics.areEqual(owVar, GLs.f8764b)) {
            b(vYVar);
        } else if (Intrinsics.areEqual(owVar, zfv.f11934b)) {
            if (eSs.f10363b.get()) {
                Log.i("Incognia", "Incognia SDK is already initialized");
            }
        } else {
            if (Intrinsics.areEqual(owVar, RXl.f9550b) ? true : Intrinsics.areEqual(owVar, d3Z.f10279b)) {
                if (eSs.f10363b.get()) {
                    Log.e("Incognia", "Incognia SDK is in an error state and won't initialize");
                }
            } else {
                Intrinsics.areEqual(owVar, f0.f10395b);
            }
        }
    }

    public static final void b(Throwable th) {
        L3 l32 = new L3(th);
        if (eSs.f10363b.get()) {
            Log.e("Incognia", "Error initializing Incognia SDK! " + l32.getMessage());
        }
        Lsv.b(th, true);
        f9();
        AtomicReference atomicReference = DDS.f8521b;
        DDS.b(RXl.f9550b);
    }

    public static void b(Fk fk) {
        f9562b.b(new a(10, fk));
    }
}
