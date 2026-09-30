package K2;

import A2.ak;
import A2.z;
import B2.ao;
import B2.w;
import android.database.Cursor;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.P0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f {
    public static final int[] alpha = {13, 15, 14};

    public static final void alpha(w wVar, String str) {
        ao bravo;
        WorkDatabase workDatabase = wVar.delta;
        Intrinsics.delta(workDatabase, "workManagerImpl.workDatabase");
        J2.r uniform = workDatabase.uniform();
        J2.c foxtrot = workDatabase.foxtrot();
        ArrayList white = CollectionsKt.white(str);
        while (!white.isEmpty()) {
            String str2 = (String) CollectionsKt.f(white);
            int golf = uniform.golf(str2);
            if (golf != 3 && golf != 4) {
                WorkDatabase_Impl workDatabase_Impl = uniform.alpha;
                workDatabase_Impl.bravo();
                J2.h hVar = uniform.foxtrot;
                androidx.sqlite.db.framework.i alpha2 = hVar.alpha();
                alpha2.oscar(1, str2);
                try {
                    workDatabase_Impl.charlie();
                    try {
                        alpha2.charlie();
                        workDatabase_Impl.papa();
                    } finally {
                    }
                } finally {
                    hVar.lima(alpha2);
                }
            }
            white.addAll(foxtrot.sierra(str2));
        }
        B2.f fVar = wVar.golf;
        Intrinsics.delta(fVar, "workManagerImpl.processor");
        synchronized (fVar.kilo) {
            z.echo().alpha(B2.f.lima, "Processor cancelling " + str);
            fVar.india.add(str);
            bravo = fVar.bravo(str);
        }
        B2.f.echo(str, bravo, 1);
        Iterator it = wVar.foxtrot.iterator();
        while (it.hasNext()) {
            ((B2.h) it.next()).delta(str);
        }
    }

    public static final void bravo(WorkDatabase workDatabase, A2.a configuration, B2.r continuation) {
        int i4;
        int i5 = 0;
        Intrinsics.echo(workDatabase, "workDatabase");
        Intrinsics.echo(configuration, "configuration");
        Intrinsics.echo(continuation, "continuation");
        if (Build.VERSION.SDK_INT >= 24) {
            ArrayList white = CollectionsKt.white(continuation);
            int i10 = 0;
            while (!white.isEmpty()) {
                List list = ((B2.r) CollectionsKt.f(white)).delta;
                Intrinsics.delta(list, "current.work");
                if (list.isEmpty()) {
                    i4 = 0;
                } else {
                    Iterator it = list.iterator();
                    i4 = 0;
                    while (it.hasNext()) {
                        if (((ak) it.next()).bravo.juliet.alpha() && (i4 = i4 + 1) < 0) {
                            CollectionsKt.t();
                            throw null;
                        }
                    }
                }
                i10 += i4;
            }
            if (i10 != 0) {
                J2.r uniform = workDatabase.uniform();
                uniform.getClass();
                l2.p foxtrot = l2.p.foxtrot(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                WorkDatabase_Impl workDatabase_Impl = uniform.alpha;
                workDatabase_Impl.bravo();
                Cursor mike = workDatabase_Impl.mike(foxtrot);
                try {
                    if (mike.moveToFirst()) {
                        i5 = mike.getInt(0);
                    }
                    mike.close();
                    foxtrot.golf();
                    int i11 = i5 + i10;
                    int i12 = configuration.juliet;
                    if (i11 <= i12) {
                    } else {
                        throw new IllegalArgumentException(P0.cyan(av.q.hotel(i12, i5, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: "), i10, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
                    }
                } catch (Throwable th) {
                    mike.close();
                    foxtrot.golf();
                    throw th;
                }
            }
        }
    }

    public static e charlie(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i4 : iArr) {
            try {
                builder.addCapability(i4);
            } catch (IllegalArgumentException e) {
                z echo = z.echo();
                String str = e.bravo;
                String str2 = e.bravo;
                String str3 = "Ignoring adding capability '" + i4 + '\'';
                if (echo.alpha <= 5) {
                    Log.w(str2, str3, e);
                }
            }
        }
        int[] iArr3 = alpha;
        for (int i5 = 0; i5 < 3; i5++) {
            int i10 = iArr3[i5];
            if (!ArraysKt.uniform(i10, iArr)) {
                try {
                    builder.removeCapability(i10);
                } catch (IllegalArgumentException e4) {
                    z echo2 = z.echo();
                    String str4 = e.bravo;
                    String str5 = e.bravo;
                    String str6 = "Ignoring removing default capability '" + i10 + '\'';
                    if (echo2.alpha <= 5) {
                        Log.w(str5, str6, e4);
                    }
                }
            }
        }
        for (int i11 : iArr2) {
            builder.addTransportType(i11);
        }
        NetworkRequest build = builder.build();
        Intrinsics.delta(build, "networkRequest.build()");
        return new e(build);
    }

    public static final J2.p delta(List schedulers, J2.p workSpec) {
        J2.p pVar;
        Intrinsics.echo(schedulers, "schedulers");
        Intrinsics.echo(workSpec, "workSpec");
        A2.j jVar = workSpec.echo;
        boolean bravo = jVar.bravo("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean bravo2 = jVar.bravo("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean bravo3 = jVar.bravo("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!bravo && bravo2 && bravo3) {
            A2.h hVar = new A2.h(0);
            hVar.bravo(jVar.alpha);
            String str = workSpec.charlie;
            LinkedHashMap linkedHashMap = hVar.alpha;
            linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
            A2.j jVar2 = new A2.j(linkedHashMap);
            V8.a.charlie(jVar2);
            pVar = J2.p.bravo(workSpec, null, 0, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", jVar2, 0, 0L, 0, 0, 0L, 0, 16777195);
        } else {
            pVar = workSpec;
        }
        if (Build.VERSION.SDK_INT < 26) {
            A2.d dVar = pVar.juliet;
            String name = ConstraintTrackingWorker.class.getName();
            String str2 = pVar.charlie;
            if (!Intrinsics.areEqual(str2, name)) {
                if (dVar.echo || dVar.foxtrot) {
                    A2.h hVar2 = new A2.h(0);
                    A2.j data = pVar.echo;
                    Intrinsics.echo(data, "data");
                    hVar2.bravo(data.alpha);
                    LinkedHashMap linkedHashMap2 = hVar2.alpha;
                    linkedHashMap2.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str2);
                    A2.j jVar3 = new A2.j(linkedHashMap2);
                    V8.a.charlie(jVar3);
                    return J2.p.bravo(pVar, null, 0, ConstraintTrackingWorker.class.getName(), jVar3, 0, 0L, 0, 0, 0L, 0, 16777195);
                }
                return pVar;
            }
            return pVar;
        }
        return pVar;
    }
}
