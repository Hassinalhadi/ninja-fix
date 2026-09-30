package B2;

import aa.AbstractC0417a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t6.P2;
import td.C3117a;
import vf.AbstractC3220y;
import yf.AbstractC3428A;
import yf.C3443m;

/* loaded from: classes3.dex */
public final class w extends A2.ai {
    public static w lima;
    public static w mike;
    public static final Object november;
    public final Context bravo;
    public final A2.a charlie;
    public final WorkDatabase delta;
    public final L2.a echo;
    public final List foxtrot;
    public final f golf;
    public final D8.c hotel;
    public boolean india = false;
    public BroadcastReceiver.PendingResult juliet;
    public final H2.l kilo;

    static {
        A2.z.golf("WorkManagerImpl");
        lima = null;
        mike = null;
        november = new Object();
    }

    public w(Context context, final A2.a aVar, L2.a aVar2, final WorkDatabase workDatabase, final List list, f fVar, H2.l lVar) {
        boolean isDeviceProtectedStorage;
        int i4 = 24;
        int i5 = 0;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 24) {
            isDeviceProtectedStorage = applicationContext.isDeviceProtectedStorage();
            if (isDeviceProtectedStorage) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
        }
        A2.z zVar = new A2.z(aVar.hotel);
        synchronized (A2.z.bravo) {
            try {
                if (A2.z.charlie == null) {
                    A2.z.charlie = zVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.bravo = applicationContext;
        this.echo = aVar2;
        this.delta = workDatabase;
        this.golf = fVar;
        this.kilo = lVar;
        this.charlie = aVar;
        this.foxtrot = list;
        L2.c cVar = (L2.c) aVar2;
        AbstractC3220y abstractC3220y = cVar.bravo;
        Intrinsics.delta(abstractC3220y, "taskExecutor.taskCoroutineDispatcher");
        C3117a charlie = vf.ad.charlie(abstractC3220y);
        this.hotel = new D8.c(i4, workDatabase);
        final K2.i iVar = cVar.alpha;
        String str = k.alpha;
        fVar.alpha(new c() { // from class: B2.i
            @Override // B2.c
            public final void charlie(J2.j jVar, boolean z2) {
                K2.i.this.execute(new j(list, jVar, aVar, workDatabase, 0));
            }
        });
        cVar.alpha(new K2.c(applicationContext, this));
        String str2 = p.alpha;
        if (K2.h.alpha(applicationContext, aVar)) {
            J2.r uniform = workDatabase.uniform();
            uniform.getClass();
            J2.q qVar = new J2.q(i5, uniform, l2.p.foxtrot(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"));
            int i10 = 2;
            vf.ad.zulu(charlie, null, null, new C3443m(new yf.s(AbstractC3428A.lima(AbstractC3428A.hotel(new J8.ah(i10, new C1.t(new l2.d(uniform.alpha, new String[]{"workspec"}, qVar, null)), new Pd.i(4, null)), -1)), new o(applicationContext, null), 3), null), 3);
        }
    }

    public static w foxtrot() {
        synchronized (november) {
            try {
                w wVar = lima;
                if (wVar != null) {
                    return wVar;
                }
                return mike;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static w golf(Context context) {
        w foxtrot;
        synchronized (november) {
            try {
                foxtrot = foxtrot();
                if (foxtrot == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return foxtrot;
    }

    public final A2.aa delta(String str) {
        A2.aa aaVar = this.charlie.mike;
        String concat = "CancelWorkByName_".concat(str);
        K2.i iVar = ((L2.c) this.echo).alpha;
        Intrinsics.delta(iVar, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return AbstractC0417a.bravo(aaVar, concat, iVar, new Aa.i(18, str, this));
    }

    public final A2.aa echo(String name, int i4, A2.ah workRequest) {
        if (i4 == 3) {
            Intrinsics.echo(name, "name");
            Intrinsics.echo(workRequest, "workRequest");
            A2.aa aaVar = this.charlie.mike;
            String concat = "enqueueUniquePeriodic_".concat(name);
            K2.i iVar = ((L2.c) this.echo).alpha;
            Intrinsics.delta(iVar, "workTaskExecutor.serialTaskExecutor");
            return AbstractC0417a.bravo(aaVar, concat, iVar, new aa(this, name, workRequest));
        }
        int i5 = 2;
        if (i4 != 2) {
            i5 = 1;
        }
        return new r(this, name, i5, Collections.singletonList(workRequest)).bravo();
    }

    public final void hotel() {
        synchronized (november) {
            try {
                this.india = true;
                BroadcastReceiver.PendingResult pendingResult = this.juliet;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.juliet = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void india() {
        A2.aa aaVar = this.charlie.mike;
        q qVar = new q(1, this);
        Intrinsics.echo(aaVar, "<this>");
        boolean delta = P2.delta();
        if (delta) {
            try {
                Trace.beginSection(P2.foxtrot("ReschedulingWork"));
            } finally {
                if (delta) {
                    Trace.endSection();
                }
            }
        }
        qVar.invoke();
    }
}
