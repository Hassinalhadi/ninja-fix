package B2;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.appcompat.widget.P0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.OverwritingInputMerger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t6.P2;
import vf.AbstractC3220y;
import vf.H;
import vf.I;
import vf.J;
import w2.AbstractC3235a;

/* loaded from: classes3.dex */
public final class ao {
    public final J2.p alpha;
    public final Context bravo;
    public final String charlie;
    public final J2.t delta;
    public final L2.c echo;
    public final A2.a foxtrot;
    public final A2.aa golf;
    public final f hotel;
    public final WorkDatabase india;
    public final J2.r juliet;
    public final J2.c kilo;
    public final ArrayList lima;
    public final String mike;
    public final J november;

    public ao(ad adVar) {
        J2.p pVar = (J2.p) adVar.echo;
        this.alpha = pVar;
        this.bravo = (Context) adVar.golf;
        String str = pVar.alpha;
        this.charlie = str;
        this.delta = (J2.t) adVar.hotel;
        this.echo = (L2.c) adVar.bravo;
        A2.a aVar = (A2.a) adVar.alpha;
        this.foxtrot = aVar;
        this.golf = aVar.delta;
        this.hotel = (f) adVar.charlie;
        WorkDatabase workDatabase = (WorkDatabase) adVar.delta;
        this.india = workDatabase;
        this.juliet = workDatabase.uniform();
        this.kilo = workDatabase.foxtrot();
        ArrayList arrayList = (ArrayList) adVar.foxtrot;
        this.lima = arrayList;
        this.mike = P0.gold(Q0.c.victor("Work [ id=", str, ", tags={ "), CollectionsKt.maroon(arrayList, Constants.SEPARATOR_COMMA, null, null, null, 62), " } ]");
        this.november = vf.ad.delta();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.work.WorkerParameters, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(ao aoVar, Pd.c cVar) {
        al alVar;
        int i4;
        int i5;
        Boolean shouldExit;
        OverwritingInputMerger overwritingInputMerger;
        char c3;
        final ao aoVar2 = aoVar;
        final int i10 = 0;
        try {
            if (cVar instanceof al) {
                alVar = (al) cVar;
                int i11 = alVar.silver;
                if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    alVar.silver = i11 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = alVar.purple;
                    Od.a aVar = Od.a.alpha;
                    i4 = alVar.silver;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            aoVar2 = alVar.alpha;
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        A2.a aVar2 = aoVar2.foxtrot;
                        aVar2.mike.getClass();
                        boolean delta = P2.delta();
                        J2.p pVar = aoVar2.alpha;
                        String str = pVar.xray;
                        String str2 = pVar.charlie;
                        if (delta && str != null) {
                            int hashCode = pVar.hashCode();
                            if (Build.VERSION.SDK_INT >= 29) {
                                AbstractC3235a.alpha(hashCode, P2.foxtrot(str));
                            } else {
                                String foxtrot = P2.foxtrot(str);
                                try {
                                    if (P2.charlie == null) {
                                        c3 = 2;
                                        i5 = 1;
                                        try {
                                            P2.charlie = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                        } catch (Exception e) {
                                            e = e;
                                            P2.charlie("asyncTraceBegin", e);
                                            Callable callable = new Callable(aoVar2) { // from class: B2.ac
                                                public final /* synthetic */ ao purple;

                                                {
                                                    this.purple = aoVar2;
                                                }

                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    switch (i10) {
                                                        case 0:
                                                            ao aoVar3 = this.purple;
                                                            J2.p pVar2 = aoVar3.alpha;
                                                            int i12 = pVar2.bravo;
                                                            String str3 = pVar2.charlie;
                                                            if (i12 != 1) {
                                                                String str4 = aq.alpha;
                                                                A2.z.echo().alpha(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
                                                                return Boolean.TRUE;
                                                            }
                                                            if (pVar2.delta() || (pVar2.bravo == 1 && pVar2.kilo > 0)) {
                                                                aoVar3.golf.getClass();
                                                                if (System.currentTimeMillis() < pVar2.alpha()) {
                                                                    A2.z.echo().alpha(aq.alpha, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                                                                    return Boolean.TRUE;
                                                                }
                                                            }
                                                            return Boolean.FALSE;
                                                        default:
                                                            ao aoVar4 = this.purple;
                                                            J2.r rVar = aoVar4.juliet;
                                                            String str5 = aoVar4.charlie;
                                                            boolean z2 = true;
                                                            if (rVar.golf(str5) == 1) {
                                                                rVar.november(2, str5);
                                                                WorkDatabase_Impl workDatabase_Impl = rVar.alpha;
                                                                workDatabase_Impl.bravo();
                                                                J2.h hVar = rVar.juliet;
                                                                androidx.sqlite.db.framework.i alpha = hVar.alpha();
                                                                alpha.oscar(1, str5);
                                                                try {
                                                                    workDatabase_Impl.charlie();
                                                                    try {
                                                                        alpha.charlie();
                                                                        workDatabase_Impl.papa();
                                                                        hVar.lima(alpha);
                                                                        rVar.oscar(-256, str5);
                                                                    } finally {
                                                                        workDatabase_Impl.kilo();
                                                                    }
                                                                } catch (Throwable th) {
                                                                    hVar.lima(alpha);
                                                                    throw th;
                                                                }
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            return Boolean.valueOf(z2);
                                                    }
                                                }
                                            };
                                            WorkDatabase workDatabase = aoVar2.india;
                                            shouldExit = (Boolean) workDatabase.november(callable);
                                            Intrinsics.delta(shouldExit, "shouldExit");
                                            if (shouldExit.booleanValue()) {
                                            }
                                        }
                                    } else {
                                        i5 = 1;
                                        c3 = 2;
                                    }
                                    Method method = P2.charlie;
                                    Long valueOf = Long.valueOf(P2.alpha);
                                    Integer valueOf2 = Integer.valueOf(hashCode);
                                    Object[] objArr = new Object[3];
                                    objArr[0] = valueOf;
                                    objArr[i5] = foxtrot;
                                    objArr[c3] = valueOf2;
                                    method.invoke(null, objArr);
                                } catch (Exception e4) {
                                    e = e4;
                                    i5 = 1;
                                }
                                Callable callable2 = new Callable(aoVar2) { // from class: B2.ac
                                    public final /* synthetic */ ao purple;

                                    {
                                        this.purple = aoVar2;
                                    }

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        switch (i10) {
                                            case 0:
                                                ao aoVar3 = this.purple;
                                                J2.p pVar2 = aoVar3.alpha;
                                                int i12 = pVar2.bravo;
                                                String str3 = pVar2.charlie;
                                                if (i12 != 1) {
                                                    String str4 = aq.alpha;
                                                    A2.z.echo().alpha(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
                                                    return Boolean.TRUE;
                                                }
                                                if (pVar2.delta() || (pVar2.bravo == 1 && pVar2.kilo > 0)) {
                                                    aoVar3.golf.getClass();
                                                    if (System.currentTimeMillis() < pVar2.alpha()) {
                                                        A2.z.echo().alpha(aq.alpha, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                                                        return Boolean.TRUE;
                                                    }
                                                }
                                                return Boolean.FALSE;
                                            default:
                                                ao aoVar4 = this.purple;
                                                J2.r rVar = aoVar4.juliet;
                                                String str5 = aoVar4.charlie;
                                                boolean z2 = true;
                                                if (rVar.golf(str5) == 1) {
                                                    rVar.november(2, str5);
                                                    WorkDatabase_Impl workDatabase_Impl = rVar.alpha;
                                                    workDatabase_Impl.bravo();
                                                    J2.h hVar = rVar.juliet;
                                                    androidx.sqlite.db.framework.i alpha = hVar.alpha();
                                                    alpha.oscar(1, str5);
                                                    try {
                                                        workDatabase_Impl.charlie();
                                                        try {
                                                            alpha.charlie();
                                                            workDatabase_Impl.papa();
                                                            hVar.lima(alpha);
                                                            rVar.oscar(-256, str5);
                                                        } finally {
                                                            workDatabase_Impl.kilo();
                                                        }
                                                    } catch (Throwable th) {
                                                        hVar.lima(alpha);
                                                        throw th;
                                                    }
                                                } else {
                                                    z2 = false;
                                                }
                                                return Boolean.valueOf(z2);
                                        }
                                    }
                                };
                                WorkDatabase workDatabase2 = aoVar2.india;
                                shouldExit = (Boolean) workDatabase2.november(callable2);
                                Intrinsics.delta(shouldExit, "shouldExit");
                                if (shouldExit.booleanValue()) {
                                    return new ag();
                                }
                                boolean delta2 = pVar.delta();
                                A2.j jVar = pVar.echo;
                                String str3 = aoVar2.charlie;
                                if (!delta2) {
                                    aVar2.foxtrot.getClass();
                                    String className = pVar.delta;
                                    Intrinsics.echo(className, "className");
                                    String str4 = A2.o.alpha;
                                    try {
                                        Object newInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
                                        Intrinsics.charlie(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                                        overwritingInputMerger = (OverwritingInputMerger) newInstance;
                                    } catch (Exception e5) {
                                        A2.z.echo().delta(A2.o.alpha, "Trouble instantiating ".concat(className), e5);
                                        overwritingInputMerger = null;
                                    }
                                    if (overwritingInputMerger == null) {
                                        A2.z.echo().charlie(aq.alpha, "Could not create Input Merger ".concat(className));
                                        return new ae();
                                    }
                                    List juliet = kotlin.collections.ab.juliet(jVar);
                                    J2.r rVar = aoVar2.juliet;
                                    rVar.getClass();
                                    int i12 = i5;
                                    l2.p foxtrot2 = l2.p.foxtrot(i12, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                                    foxtrot2.oscar(i12, str3);
                                    WorkDatabase_Impl workDatabase_Impl = rVar.alpha;
                                    workDatabase_Impl.bravo();
                                    Cursor mike = workDatabase_Impl.mike(foxtrot2);
                                    try {
                                        ArrayList arrayList = new ArrayList(mike.getCount());
                                        while (mike.moveToNext()) {
                                            arrayList.add(A2.j.alpha(mike.getBlob(0)));
                                        }
                                        mike.close();
                                        foxtrot2.golf();
                                        ArrayList a6 = CollectionsKt.a(juliet, arrayList);
                                        A2.h hVar = new A2.h(0);
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        Iterator it = a6.iterator();
                                        while (it.hasNext()) {
                                            Map unmodifiableMap = Collections.unmodifiableMap(((A2.j) it.next()).alpha);
                                            Intrinsics.delta(unmodifiableMap, "unmodifiableMap(values)");
                                            linkedHashMap.putAll(unmodifiableMap);
                                        }
                                        hVar.bravo(linkedHashMap);
                                        A2.j jVar2 = new A2.j(hVar.alpha);
                                        V8.a.charlie(jVar2);
                                        jVar = jVar2;
                                    } catch (Throwable th) {
                                        mike.close();
                                        foxtrot2.golf();
                                        throw th;
                                    }
                                }
                                UUID fromString = UUID.fromString(str3);
                                L2.c cVar2 = aoVar2.echo;
                                K2.p pVar2 = new K2.p(workDatabase2, cVar2);
                                K2.o oVar = new K2.o(workDatabase2, aoVar2.hotel, cVar2);
                                ?? obj2 = new Object();
                                obj2.alpha = fromString;
                                obj2.bravo = jVar;
                                obj2.charlie = new HashSet(aoVar2.lima);
                                obj2.delta = aoVar2.delta;
                                obj2.echo = pVar.kilo;
                                obj2.foxtrot = aVar2.alpha;
                                obj2.golf = aVar2.bravo;
                                obj2.hotel = cVar2;
                                A2.l lVar = aVar2.echo;
                                obj2.india = lVar;
                                obj2.juliet = pVar2;
                                obj2.kilo = oVar;
                                try {
                                    A2.y alpha = lVar.alpha(aoVar2.bravo, str2, obj2);
                                    alpha.setUsed();
                                    Nd.f fVar = alVar.getContext().get(H.alpha);
                                    Intrinsics.checkNotNull(fVar);
                                    I i13 = (I) fVar;
                                    i13.crimson(new am(alpha, delta, str, aoVar2));
                                    final int i14 = 1;
                                    Object november = workDatabase2.november(new Callable(aoVar2) { // from class: B2.ac
                                        public final /* synthetic */ ao purple;

                                        {
                                            this.purple = aoVar2;
                                        }

                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            switch (i14) {
                                                case 0:
                                                    ao aoVar3 = this.purple;
                                                    J2.p pVar22 = aoVar3.alpha;
                                                    int i122 = pVar22.bravo;
                                                    String str32 = pVar22.charlie;
                                                    if (i122 != 1) {
                                                        String str42 = aq.alpha;
                                                        A2.z.echo().alpha(str42, str32 + " is not in ENQUEUED state. Nothing more to do");
                                                        return Boolean.TRUE;
                                                    }
                                                    if (pVar22.delta() || (pVar22.bravo == 1 && pVar22.kilo > 0)) {
                                                        aoVar3.golf.getClass();
                                                        if (System.currentTimeMillis() < pVar22.alpha()) {
                                                            A2.z.echo().alpha(aq.alpha, "Delaying execution for " + str32 + " because it is being executed before schedule.");
                                                            return Boolean.TRUE;
                                                        }
                                                    }
                                                    return Boolean.FALSE;
                                                default:
                                                    ao aoVar4 = this.purple;
                                                    J2.r rVar2 = aoVar4.juliet;
                                                    String str5 = aoVar4.charlie;
                                                    boolean z2 = true;
                                                    if (rVar2.golf(str5) == 1) {
                                                        rVar2.november(2, str5);
                                                        WorkDatabase_Impl workDatabase_Impl2 = rVar2.alpha;
                                                        workDatabase_Impl2.bravo();
                                                        J2.h hVar2 = rVar2.juliet;
                                                        androidx.sqlite.db.framework.i alpha2 = hVar2.alpha();
                                                        alpha2.oscar(1, str5);
                                                        try {
                                                            workDatabase_Impl2.charlie();
                                                            try {
                                                                alpha2.charlie();
                                                                workDatabase_Impl2.papa();
                                                                hVar2.lima(alpha2);
                                                                rVar2.oscar(-256, str5);
                                                            } finally {
                                                                workDatabase_Impl2.kilo();
                                                            }
                                                        } catch (Throwable th2) {
                                                            hVar2.lima(alpha2);
                                                            throw th2;
                                                        }
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    return Boolean.valueOf(z2);
                                            }
                                        }
                                    });
                                    Intrinsics.delta(november, "workDatabase.runInTransa…e\n            }\n        )");
                                    if (!((Boolean) november).booleanValue()) {
                                        return new ag();
                                    }
                                    if (i13.isCancelled()) {
                                        return new ag();
                                    }
                                    L2.b bVar = cVar2.delta;
                                    Intrinsics.delta(bVar, "workTaskExecutor.getMainThreadExecutor()");
                                    AbstractC3220y papa = vf.ad.papa(bVar);
                                    an anVar = new an(aoVar2, alpha, oVar, null);
                                    alVar.alpha = aoVar2;
                                    alVar.silver = 1;
                                    obj = vf.ad.blue(papa, anVar, alVar);
                                    if (obj == aVar) {
                                        return aVar;
                                    }
                                } catch (Throwable unused) {
                                    String str5 = aq.alpha;
                                    A2.z.echo().charlie(str5, "Could not create Worker " + str2);
                                    return new ae();
                                }
                            }
                        }
                        i5 = 1;
                        Callable callable22 = new Callable(aoVar2) { // from class: B2.ac
                            public final /* synthetic */ ao purple;

                            {
                                this.purple = aoVar2;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i10) {
                                    case 0:
                                        ao aoVar3 = this.purple;
                                        J2.p pVar22 = aoVar3.alpha;
                                        int i122 = pVar22.bravo;
                                        String str32 = pVar22.charlie;
                                        if (i122 != 1) {
                                            String str42 = aq.alpha;
                                            A2.z.echo().alpha(str42, str32 + " is not in ENQUEUED state. Nothing more to do");
                                            return Boolean.TRUE;
                                        }
                                        if (pVar22.delta() || (pVar22.bravo == 1 && pVar22.kilo > 0)) {
                                            aoVar3.golf.getClass();
                                            if (System.currentTimeMillis() < pVar22.alpha()) {
                                                A2.z.echo().alpha(aq.alpha, "Delaying execution for " + str32 + " because it is being executed before schedule.");
                                                return Boolean.TRUE;
                                            }
                                        }
                                        return Boolean.FALSE;
                                    default:
                                        ao aoVar4 = this.purple;
                                        J2.r rVar2 = aoVar4.juliet;
                                        String str52 = aoVar4.charlie;
                                        boolean z2 = true;
                                        if (rVar2.golf(str52) == 1) {
                                            rVar2.november(2, str52);
                                            WorkDatabase_Impl workDatabase_Impl2 = rVar2.alpha;
                                            workDatabase_Impl2.bravo();
                                            J2.h hVar2 = rVar2.juliet;
                                            androidx.sqlite.db.framework.i alpha2 = hVar2.alpha();
                                            alpha2.oscar(1, str52);
                                            try {
                                                workDatabase_Impl2.charlie();
                                                try {
                                                    alpha2.charlie();
                                                    workDatabase_Impl2.papa();
                                                    hVar2.lima(alpha2);
                                                    rVar2.oscar(-256, str52);
                                                } finally {
                                                    workDatabase_Impl2.kilo();
                                                }
                                            } catch (Throwable th2) {
                                                hVar2.lima(alpha2);
                                                throw th2;
                                            }
                                        } else {
                                            z2 = false;
                                        }
                                        return Boolean.valueOf(z2);
                                }
                            }
                        };
                        WorkDatabase workDatabase22 = aoVar2.india;
                        shouldExit = (Boolean) workDatabase22.november(callable22);
                        Intrinsics.delta(shouldExit, "shouldExit");
                        if (shouldExit.booleanValue()) {
                        }
                    }
                    A2.x result = (A2.x) obj;
                    Intrinsics.delta(result, "result");
                    return new af(result);
                }
            }
            if (i4 == 0) {
            }
            A2.x result2 = (A2.x) obj;
            Intrinsics.delta(result2, "result");
            return new af(result2);
        } catch (CancellationException e10) {
            String str6 = aq.alpha;
            A2.z echo = A2.z.echo();
            String gold = P0.gold(new StringBuilder(), aoVar2.mike, " was cancelled");
            if (echo.alpha <= 4) {
                Log.i(str6, gold, e10);
            }
            throw e10;
        } catch (Throwable th2) {
            A2.z.echo().delta(aq.alpha, P0.gold(new StringBuilder(), aoVar2.mike, " failed because it threw an exception/error"), th2);
            return new ae();
        }
        alVar = new al(aoVar2, cVar);
        Object obj3 = alVar.purple;
        Od.a aVar3 = Od.a.alpha;
        i4 = alVar.silver;
    }

    public final void bravo(int i4) {
        J2.r rVar = this.juliet;
        String str = this.charlie;
        rVar.november(1, str);
        this.golf.getClass();
        rVar.lima(System.currentTimeMillis(), str);
        rVar.kilo(this.alpha.victor, str);
        rVar.juliet(-1L, str);
        rVar.oscar(i4, str);
    }

    public final void charlie() {
        this.golf.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        J2.r rVar = this.juliet;
        String str = this.charlie;
        rVar.lima(currentTimeMillis, str);
        rVar.november(1, str);
        WorkDatabase_Impl workDatabase_Impl = rVar.alpha;
        workDatabase_Impl.bravo();
        J2.h hVar = rVar.kilo;
        androidx.sqlite.db.framework.i alpha = hVar.alpha();
        alpha.oscar(1, str);
        try {
            workDatabase_Impl.charlie();
            try {
                alpha.charlie();
                workDatabase_Impl.papa();
                hVar.lima(alpha);
                rVar.kilo(this.alpha.victor, str);
                workDatabase_Impl.bravo();
                J2.h hVar2 = rVar.golf;
                androidx.sqlite.db.framework.i alpha2 = hVar2.alpha();
                alpha2.oscar(1, str);
                try {
                    workDatabase_Impl.charlie();
                    try {
                        alpha2.charlie();
                        workDatabase_Impl.papa();
                        hVar2.lima(alpha2);
                        rVar.juliet(-1L, str);
                    } finally {
                    }
                } catch (Throwable th) {
                    hVar2.lima(alpha2);
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            hVar.lima(alpha);
            throw th2;
        }
    }

    public final void delta(A2.x result) {
        Intrinsics.echo(result, "result");
        String str = this.charlie;
        ArrayList white = CollectionsKt.white(str);
        while (true) {
            boolean isEmpty = white.isEmpty();
            J2.r rVar = this.juliet;
            if (!isEmpty) {
                String str2 = (String) CollectionsKt.f(white);
                if (rVar.golf(str2) != 6) {
                    rVar.november(4, str2);
                }
                white.addAll(this.kilo.sierra(str2));
            } else {
                A2.j jVar = ((A2.u) result).alpha;
                Intrinsics.delta(jVar, "failure.outputData");
                rVar.kilo(this.alpha.victor, str);
                rVar.mike(str, jVar);
                return;
            }
        }
    }
}
