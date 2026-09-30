package F6;

import A2.ao;
import A2.p;
import Af.t;
import F8.m;
import F8.n;
import G6.d;
import G6.q;
import Gc.v;
import I1.e;
import I1.f;
import Ld.j;
import T5.ad;
import T5.r;
import V5.x;
import Y9.g;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.app.ak;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.sqlite.db.framework.i;
import androidx.viewpager.widget.ViewPager;
import bd.RunnableScheduledFutureC0749b;
import bd.h;
import bz.C0796v;
import bz.m0;
import com.app.feature.location.LocationBroadcastConfig;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.internal.A;
import com.google.android.gms.measurement.internal.C1440e;
import com.google.android.gms.measurement.internal.C1443f0;
import com.google.android.gms.measurement.internal.C1450j;
import com.google.android.gms.measurement.internal.C1459n0;
import com.google.android.gms.measurement.internal.E0;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.G0;
import com.google.android.gms.measurement.internal.H0;
import com.google.android.gms.measurement.internal.J0;
import com.google.android.gms.measurement.internal.M0;
import com.google.android.gms.measurement.internal.N0;
import com.google.android.gms.measurement.internal.O0;
import com.google.android.gms.measurement.internal.RunnableC1439d0;
import com.google.android.gms.measurement.internal.RunnableC1482z0;
import com.google.android.gms.measurement.internal.S0;
import com.google.android.gms.measurement.internal.U0;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.ar;
import com.google.android.gms.measurement.internal.av;
import com.google.android.gms.measurement.internal.aw;
import com.google.android.gms.measurement.internal.ax;
import com.google.android.gms.measurement.internal.ay;
import com.google.android.gms.measurement.internal.d1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import g3.C1743d;
import ga.as;
import j8.C1946c;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l2.k;
import l2.l;
import p3.C2272d;
import p3.ah;
import p3.w;
import s1.au;
import s6.A5;
import s6.AbstractC2716m6;
import s6.E;
import s6.V4;
import s6.a8;
import t6.AbstractC3016k2;
import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    private final void bravo() {
        a aVar = (a) this.purple;
        synchronized (aVar.alpha) {
            try {
                if (!aVar.bravo()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(aVar.juliet).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.delta();
                if (!aVar.bravo()) {
                    return;
                }
                aVar.charlie = 1;
                aVar.echo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void charlie() {
        boolean alpha;
        m mVar = (m) this.purple;
        synchronized (mVar) {
            alpha = mVar.alpha();
            if (alpha) {
                mVar.juliet(true);
            }
        }
        if (!alpha) {
            return;
        }
        n charlie = mVar.quebec.charlie();
        mVar.papa.getClass();
        if (new Date(System.currentTimeMillis()).before(charlie.bravo)) {
            mVar.india();
            return;
        }
        C1946c c1946c = (C1946c) mVar.kilo;
        q echo = c1946c.echo();
        q delta = c1946c.delta();
        q foxtrot = V4.golf(echo, delta).foxtrot(mVar.hotel, new p(mVar, echo, delta, 3));
        V4.golf(foxtrot).mike(mVar.hotel, new ao(5, mVar, foxtrot));
    }

    private final void delta() {
        synchronized (((G6.n) this.purple).red) {
            try {
                d dVar = (d) ((G6.n) this.purple).silver;
                if (dVar != null) {
                    dVar.alpha();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void echo() {
        try {
            golf();
        } catch (Error e) {
            synchronized (((h) this.purple).alpha) {
                ((h) this.purple).silver = 1;
                throw e;
            }
        }
    }

    private final void foxtrot() {
        Set set;
        ReentrantReadWriteLock.ReadLock readLock = ((l) this.purple).alpha.hotel.readLock();
        Intrinsics.delta(readLock, "readWriteLock.readLock()");
        readLock.lock();
        try {
            try {
            } finally {
                readLock.unlock();
                ((l) this.purple).getClass();
            }
        } catch (SQLiteException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            set = u.alpha;
        } catch (IllegalStateException e4) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
            set = u.alpha;
        }
        if (!((l) this.purple).alpha()) {
            return;
        }
        if (!((l) this.purple).foxtrot.compareAndSet(true, false)) {
            return;
        }
        if (((l) this.purple).alpha.hotel().lime().quebec()) {
            return;
        }
        androidx.sqlite.db.framework.b lime = ((l) this.purple).alpha.hotel().lime();
        lime.echo();
        try {
            set = alpha();
            lime.blue();
            if (!set.isEmpty()) {
                l lVar = (l) this.purple;
                synchronized (lVar.juliet) {
                    Iterator it = lVar.juliet.iterator();
                    while (true) {
                        aq.b bVar = (aq.b) it;
                        if (bVar.hasNext()) {
                            ((k) ((Map.Entry) bVar.next()).getValue()).alpha(set);
                        }
                    }
                }
            }
        } finally {
            lime.golf();
        }
    }

    public j alpha() {
        l lVar = (l) this.purple;
        j jVar = new j();
        Cursor mike = lVar.alpha.mike(new t("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (mike.moveToNext()) {
            try {
                jVar.add(Integer.valueOf(mike.getInt(0)));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2716m6.alpha(mike, th);
                    throw th2;
                }
            }
        }
        mike.close();
        j bravo = ab.bravo(jVar);
        if (!bravo.alpha.isEmpty()) {
            if (((l) this.purple).hotel != null) {
                i iVar = ((l) this.purple).hotel;
                if (iVar != null) {
                    iVar.charlie();
                    return bravo;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        return bravo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        t6.AbstractC3066u3.delta("SequentialExecutor", "Exception while executing runnable " + r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void golf() {
        boolean z2 = false;
        boolean z10 = false;
        while (true) {
            try {
                synchronized (((h) this.purple).alpha) {
                    if (!z2) {
                        h hVar = (h) this.purple;
                        if (hVar.silver != 4) {
                            hVar.teal++;
                            hVar.silver = 4;
                            z2 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((h) this.purple).alpha.poll();
                    if (runnable == null) {
                        ((h) this.purple).silver = 1;
                    }
                }
                if (!z10) {
                    return;
                }
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02ec, code lost:
    
        if (r8.e1() >= 242600) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v51, types: [com.google.android.gms.measurement.internal.U0, com.google.android.gms.measurement.internal.c] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z2;
        View delta;
        int width;
        int i4;
        g gVar;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        ao.l lVar;
        long e02;
        w wVar;
        ScheduledFuture scheduledFuture;
        int i5 = 3;
        int i10 = 2;
        int i11 = 0;
        int i12 = 1;
        switch (this.alpha) {
            case 0:
                bravo();
                return;
            case 1:
                charlie();
                return;
            case 2:
                delta();
                return;
            case 3:
                f fVar = (f) this.purple;
                int i13 = fVar.bravo.oscar;
                int i14 = fVar.alpha;
                if (i14 == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                DrawerLayout drawerLayout = fVar.delta;
                if (z2) {
                    delta = drawerLayout.delta(3);
                    if (delta != null) {
                        i4 = -delta.getWidth();
                    } else {
                        i4 = 0;
                    }
                    width = i4 + i13;
                } else {
                    delta = drawerLayout.delta(5);
                    width = drawerLayout.getWidth() - i13;
                }
                if (delta != null) {
                    if (((z2 && delta.getLeft() < width) || (!z2 && delta.getLeft() > width)) && drawerLayout.golf(delta) == 0) {
                        e eVar = (e) delta.getLayoutParams();
                        fVar.bravo.sierra(delta, width, delta.getTop());
                        eVar.charlie = true;
                        drawerLayout.invalidate();
                        if (i14 == 3) {
                            i5 = 5;
                        }
                        View delta2 = drawerLayout.delta(i5);
                        if (delta2 != null) {
                            drawerLayout.bravo(delta2, true);
                        }
                        if (!drawerLayout.f3094k) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            int childCount = drawerLayout.getChildCount();
                            while (i11 < childCount) {
                                drawerLayout.getChildAt(i11).dispatchTouchEvent(obtain);
                                i11++;
                            }
                            obtain.recycle();
                            drawerLayout.f3094k = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (((G6.h) this.purple).charlie(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 5:
                ((r) this.purple).hotel();
                return;
            case 6:
                com.google.android.gms.common.api.c cVar = ((r) ((O7.l) this.purple).purple).hotel;
                cVar.bravo(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 7:
                ((ad) this.purple).november.delta(new ConnectionResult(4));
                return;
            case 8:
                CaptainLocationMonitoringService captainLocationMonitoringService = (CaptainLocationMonitoringService) this.purple;
                if (CaptainLocationMonitoringService.f12069G.get() && captainLocationMonitoringService.e && AbstractC3016k2.bravo(captainLocationMonitoringService)) {
                    if (CaptainLocationMonitoringService.f12067E.getValue() == ah.purple) {
                        captainLocationMonitoringService.f12100t = 0L;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j5 = captainLocationMonitoringService.f12100t;
                        if (j5 == 0) {
                            captainLocationMonitoringService.f12100t = currentTimeMillis;
                        } else {
                            long j6 = currentTimeMillis - j5;
                            if (j6 >= 90000) {
                                C3462a.alpha("LocationFlow", 12, com.google.android.material.datepicker.j.kilo("🩺 [SELF_HEAL] STOMP down ", j6 / 1000, "s — recovering"), null);
                                if (CaptainLocationMonitoringService.f12066D) {
                                    ((ca.n) captainLocationMonitoringService.echo()).echo();
                                } else {
                                    ((ca.n) captainLocationMonitoringService.echo()).charlie();
                                }
                                captainLocationMonitoringService.f12100t = currentTimeMillis;
                            }
                        }
                    }
                }
                C1743d charlie = L9.d.charlie((CaptainLocationMonitoringService) this.purple);
                F8.q qVar = ((CaptainLocationMonitoringService) this.purple).f12103w;
                boolean z10 = charlie.alpha;
                List issues = charlie.bravo;
                qVar.getClass();
                Intrinsics.echo(issues, "issues");
                if (z10) {
                    qVar.alpha = 0;
                    gVar = g.alpha;
                } else {
                    if (!issues.isEmpty()) {
                        if (!issues.isEmpty()) {
                            Iterator it = issues.iterator();
                            while (it.hasNext()) {
                                if (((g3.u) it.next()) == g3.u.silver) {
                                }
                            }
                        }
                        int i15 = qVar.alpha + 1;
                        qVar.alpha = i15;
                        if (i15 < 2) {
                            gVar = g.purple;
                        }
                    }
                    gVar = g.red;
                }
                int ordinal = gVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            CaptainLocationMonitoringService.golf(charlie, "Periodic compliance check FAILED");
                            ((CaptainLocationMonitoringService) this.purple).delta().stopMonitoring();
                            ((CaptainLocationMonitoringService) this.purple).kilo("periodic_compliance_failed");
                            CaptainLocationMonitoringService captainLocationMonitoringService2 = (CaptainLocationMonitoringService) this.purple;
                            Intent intent = new Intent(captainLocationMonitoringService2.charlie().action("COMPLIANCE_VIOLATION"));
                            List list = charlie.bravo;
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((g3.u) it2.next()).name());
                            }
                            intent.putExtra("compliance_issues", (String[]) arrayList.toArray(new String[0]));
                            intent.putExtra("compliance_message", charlie.charlie);
                            W1.b.alpha(captainLocationMonitoringService2).charlie(intent);
                            List list2 = charlie.bravo;
                            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(((g3.u) it3.next()).name());
                            }
                            C3462a.alpha("LocationFlow", 12, "Compliance violation broadcast sent: " + arrayList2, null);
                            return;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    C3462a.alpha("LocationFlow", 12, "[COMPLIANCE] transient BACKGROUND_LOCATION_DOWNGRADED — deferring stop one interval", null);
                    Handler handler = ((CaptainLocationMonitoringService) this.purple).f12098r;
                    if (handler != null) {
                        handler.postDelayed(this, 10000L);
                        return;
                    }
                    return;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                CaptainLocationMonitoringService captainLocationMonitoringService3 = (CaptainLocationMonitoringService) this.purple;
                long j7 = currentTimeMillis2 - captainLocationMonitoringService3.f12102v;
                String str = "DEGRADED";
                if (j7 < 15000) {
                    if (captainLocationMonitoringService3.f12101u == null) {
                        captainLocationMonitoringService3.f12101u = Boolean.valueOf(L9.d.victor(captainLocationMonitoringService3));
                        if (Intrinsics.areEqual(((CaptainLocationMonitoringService) this.purple).f12101u, Boolean.TRUE)) {
                            str = "HIGH";
                        }
                        C3462a.alpha("LocationFlow", 12, "[ACCURACY_CHECK] Grace period active (" + j7 + "ms) - initializing accuracy state: " + str, null);
                    } else {
                        C3462a.alpha("LocationFlow", 12, com.google.android.material.datepicker.j.kilo("[ACCURACY_CHECK] Grace period active (", j7, "ms) - skipping accuracy check"), null);
                    }
                    Handler handler2 = ((CaptainLocationMonitoringService) this.purple).f12098r;
                    if (handler2 != null) {
                        handler2.postDelayed(this, 10000L);
                        return;
                    }
                    return;
                }
                boolean victor = L9.d.victor(captainLocationMonitoringService3);
                Boolean bool = ((CaptainLocationMonitoringService) this.purple).f12101u;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.areEqual(bool, bool2) && !victor) {
                    C3462a.alpha("LocationFlow", 12, "[ACCURACY_DEGRADED] Location accuracy mode degraded (HIGH -> DEGRADED) - sending warning broadcast", null);
                    CaptainLocationMonitoringService captainLocationMonitoringService4 = (CaptainLocationMonitoringService) this.purple;
                    Intent intent2 = new Intent(captainLocationMonitoringService4.charlie().action("ACCURACY_DEGRADED"));
                    intent2.putExtra("accuracy_mode", "degraded");
                    W1.b.alpha(captainLocationMonitoringService4).charlie(intent2);
                    C3462a.alpha("LocationFlow", 12, "Accuracy degraded broadcast sent", null);
                    ((CaptainLocationMonitoringService) this.purple).f12101u = Boolean.FALSE;
                } else if (Intrinsics.areEqual(bool, Boolean.FALSE) && victor) {
                    C3462a.alpha("LocationFlow", 12, "[ACCURACY_RESTORED] Location accuracy mode restored (DEGRADED -> HIGH) - sending restored broadcast", null);
                    CaptainLocationMonitoringService captainLocationMonitoringService5 = (CaptainLocationMonitoringService) this.purple;
                    Intent intent3 = new Intent(captainLocationMonitoringService5.charlie().action("ACCURACY_RESTORED"));
                    intent3.putExtra("accuracy_mode", Constants.PRIORITY_HIGH);
                    W1.b.alpha(captainLocationMonitoringService5).charlie(intent3);
                    C3462a.alpha("LocationFlow", 12, "Accuracy restored broadcast sent", null);
                    ((CaptainLocationMonitoringService) this.purple).f12101u = bool2;
                } else {
                    if (((CaptainLocationMonitoringService) this.purple).f12101u == null) {
                        if (victor) {
                            str = "HIGH";
                        }
                        C3462a.alpha("LocationFlow", 12, "[ACCURACY_CHECK] First accuracy check after grace period: ".concat(str), null);
                    }
                    ((CaptainLocationMonitoringService) this.purple).f12101u = Boolean.valueOf(victor);
                }
                Handler handler3 = ((CaptainLocationMonitoringService) this.purple).f12098r;
                if (handler3 != null) {
                    handler3.postDelayed(this, 10000L);
                    return;
                }
                return;
            case 9:
                al.e eVar2 = (al.e) this.purple;
                eVar2.alpha(true);
                eVar2.invalidateSelf();
                return;
            case 10:
                ak akVar = (ak) this.purple;
                androidx.appcompat.app.w wVar2 = akVar.bravo;
                Menu xray = akVar.xray();
                if (xray instanceof ao.l) {
                    lVar = (ao.l) xray;
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    lVar.whiskey();
                }
                try {
                    xray.clear();
                    if (wVar2.onCreatePanelMenu(0, xray)) {
                        if (!wVar2.onPreparePanel(0, null, xray)) {
                        }
                        if (lVar == null) {
                            lVar.victor();
                            return;
                        }
                        return;
                    }
                    xray.clear();
                    if (lVar == null) {
                    }
                } catch (Throwable th) {
                    if (lVar != null) {
                        lVar.victor();
                    }
                    throw th;
                }
            case 11:
                androidx.core.widget.d dVar = (androidx.core.widget.d) this.purple;
                if (dVar.f3067h) {
                    boolean z11 = dVar.f3065f;
                    androidx.core.widget.a aVar = dVar.alpha;
                    if (z11) {
                        dVar.f3065f = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.echo = currentAnimationTimeMillis;
                        aVar.golf = -1L;
                        aVar.foxtrot = currentAnimationTimeMillis;
                        aVar.hotel = 0.5f;
                    }
                    if ((aVar.golf > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.golf + aVar.india) || !dVar.echo()) {
                        dVar.f3067h = false;
                        return;
                    }
                    boolean z12 = dVar.f3066g;
                    ListView listView = dVar.red;
                    if (z12) {
                        dVar.f3066g = false;
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        MotionEvent obtain2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain2);
                        obtain2.recycle();
                    }
                    if (aVar.foxtrot != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float alpha = aVar.alpha(currentAnimationTimeMillis2);
                        long j10 = currentAnimationTimeMillis2 - aVar.foxtrot;
                        aVar.foxtrot = currentAnimationTimeMillis2;
                        dVar.f3069j.scrollListBy((int) (((float) j10) * ((alpha * 4.0f) + ((-4.0f) * alpha * alpha)) * aVar.delta));
                        WeakHashMap weakHashMap = au.alpha;
                        listView.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 12:
                ViewPager viewPager = (ViewPager) this.purple;
                viewPager.setScrollState(0);
                viewPager.populate();
                return;
            case 13:
                J2.t tVar = (J2.t) this.purple;
                if (((RunnableScheduledFutureC0749b) tVar.red).alpha.getAndSet(null) != null) {
                    ((Handler) tVar.alpha).removeCallbacks((RunnableScheduledFutureC0749b) tVar.red);
                    return;
                }
                return;
            case 14:
                echo();
                return;
            case 15:
                ((com.google.common.util.concurrent.e) this.purple).cancel(true);
                return;
            case 16:
                be.k kVar = (be.k) this.purple;
                kVar.purple = null;
                kVar.alpha = null;
                return;
            case 17:
                com.bumptech.glide.m mVar = (com.bumptech.glide.m) this.purple;
                mVar.red.alpha(mVar);
                return;
            case 18:
                J2.n nVar = (J2.n) this.purple;
                nVar.getClass();
                while (true) {
                    try {
                        nVar.india((com.bumptech.glide.load.engine.a) ((ReferenceQueue) nVar.red).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 19:
                ((av) this.purple).alpha.azure();
                return;
            case 20:
                H0 h02 = ((G0) this.purple).charlie;
                H0.p0(h02, new ComponentName(((G) h02.alpha).alpha, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 21:
                H0 h03 = ((G0) ((E) this.purple).red).charlie;
                com.google.android.gms.measurement.internal.E e = ((G) h03.alpha).f7508c;
                G.foxtrot(e);
                e.g0(new RunnableC1482z0(h03, i10));
                return;
            case 22:
                M0 m02 = (M0) this.purple;
                O0 o02 = (O0) m02.red.purple;
                o02.W();
                G g2 = (G) o02.alpha;
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7635f.alpha("Application going to the background");
                ax axVar = g2.f7506a;
                G.delta(axVar);
                axVar.f7649m.bravo(true);
                o02.W();
                o02.silver = true;
                C1440e c1440e = g2.yellow;
                if (!c1440e.k0()) {
                    long j11 = m02.purple;
                    m0 m0Var = o02.white;
                    m0Var.echo(j11, false, false);
                    ((N0) m0Var.red).alpha();
                }
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.e.bravo(Long.valueOf(m02.alpha), "Application backgrounded at: timestamp_millis");
                C1459n0 c1459n0 = g2.f7513i;
                G.echo(c1459n0);
                c1459n0.W();
                c1459n0.X();
                G g5 = (G) c1459n0.alpha;
                H0 mike = g5.mike();
                mike.W();
                mike.X();
                if (mike.j0()) {
                    d1 d1Var = ((G) mike.alpha).e;
                    G.delta(d1Var);
                    break;
                }
                H0 mike2 = g5.mike();
                mike2.W();
                mike2.X();
                mike2.n0(new E0(mike2, mike2.k0(true), i11));
                if (c1440e.j0(null, ac.f7571L)) {
                    d1 d1Var2 = g2.e;
                    G.delta(d1Var2);
                    Context context = g2.alpha;
                    if (d1Var2.M0(context.getPackageName(), c1440e.red)) {
                        e02 = 1000;
                    } else {
                        e02 = c1440e.e0(context.getPackageName(), ac.blue);
                    }
                    G.foxtrot(arVar2);
                    arVar2.f7636g.bravo(Long.valueOf(e02), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    G.charlie(g2.f7521q);
                    g2.f7521q.b0(e02);
                    return;
                }
                return;
            case 23:
                Z0 z02 = (Z0) this.purple;
                z02.u().W();
                z02.f7541d = new ay(z02);
                C1450j c1450j = new C1450j(z02);
                c1450j.Y();
                z02.red = c1450j;
                C1440e white = z02.white();
                A a6 = z02.alpha;
                x.hotel(a6);
                white.silver = a6;
                J0 j02 = new J0(z02);
                j02.Y();
                z02.f7539b = j02;
                ?? u02 = new U0(z02);
                u02.Y();
                z02.white = u02;
                com.google.android.gms.measurement.internal.au auVar = new com.google.android.gms.measurement.internal.au(z02, i12);
                auVar.Y();
                z02.f7538a = auVar;
                S0 s02 = new S0(z02);
                s02.Y();
                z02.teal = s02;
                z02.silver = new av(z02);
                if (z02.f7547k != z02.f7548l) {
                    z02.crimson().white.charlie(Integer.valueOf(z02.f7547k), Integer.valueOf(z02.f7548l), "Not all upload components initialized");
                }
                z02.f7542f.set(true);
                z02.crimson().f7636g.alpha("UploadController is now fully initialized");
                z02.u().W();
                C1450j c1450j2 = z02.red;
                Z0.cyan(c1450j2);
                c1450j2.o0();
                C1450j c1450j3 = z02.red;
                Z0.cyan(c1450j3);
                c1450j3.W();
                c1450j3.X();
                if (c1450j3.H0()) {
                    com.google.android.gms.measurement.internal.ab abVar = ac.f7608n;
                    if (((Long) abVar.alpha(null)).longValue() != 0) {
                        SQLiteDatabase S02 = c1450j3.S0();
                        G g10 = (G) c1450j3.alpha;
                        g10.f7511g.getClass();
                        int delete = S02.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(abVar.alpha(null))});
                        if (delete > 0) {
                            ar arVar3 = g10.f7507b;
                            G.foxtrot(arVar3);
                            arVar3.f7636g.bravo(Integer.valueOf(delete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (z02.f7539b.f7534a.alpha() == 0) {
                    aw awVar = z02.f7539b.f7534a;
                    z02.pink().getClass();
                    awVar.bravo(System.currentTimeMillis());
                }
                z02.azure();
                return;
            case 24:
                G g11 = (G) this.purple;
                d1 d1Var3 = g11.e;
                G.delta(d1Var3);
                d1Var3.W();
                if (d1Var3.f1() == 1) {
                    C1459n0 c1459n02 = g11.f7513i;
                    G.echo(c1459n02);
                    c1459n02.W();
                    C1443f0 c1443f0 = c1459n02.e;
                    if (c1443f0 != null) {
                        c1443f0.alpha();
                    }
                    G.echo(c1459n02);
                    new Thread(new RunnableC1439d0(c1459n02, i5)).start();
                    return;
                }
                ar arVar4 = g11.f7507b;
                G.foxtrot(arVar4);
                arVar4.f7632b.alpha("registerTrigger called but app not eligible");
                return;
            case 25:
                G g12 = (G) ((v) this.purple).bravo;
                G.charlie(g12.f7521q);
                g12.f7521q.b0(((Long) ac.black.alpha(null)).longValue());
                return;
            case 26:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.purple).red.yellow;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 27:
                foxtrot();
                return;
            case 28:
                C0796v c0796v = (C0796v) this.purple;
                boolean hotel = c0796v.hotel();
                Boolean bool3 = (Boolean) c0796v.hotel;
                c0796v.hotel = Boolean.valueOf(hotel);
                if (Intrinsics.areEqual(bool3, Boolean.FALSE) && hotel) {
                    w wVar3 = (w) c0796v.echo;
                    if (wVar3 != null) {
                        p3.ab abVar2 = wVar3.alpha;
                        if (!abVar2.hotel && abVar2.azure != null && abVar2.amber != null) {
                            if (abVar2.beige == null) {
                                abVar2.charlie();
                            }
                            as asVar = abVar2.kilo;
                            Handler handler4 = abVar2.delta;
                            if (asVar != null) {
                                handler4.removeCallbacks(asVar);
                            }
                            as asVar2 = new as(7, abVar2);
                            abVar2.kilo = asVar2;
                            handler4.postDelayed(asVar2, 400L);
                        }
                    }
                } else if (!hotel && (wVar = (w) c0796v.echo) != null) {
                    p3.ab abVar3 = wVar.alpha;
                    Function0 function0 = abVar3.india;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    abVar3.india = null;
                    abVar3.hotel = false;
                    C2272d c2272d = abVar3.alpha;
                    LocationBroadcastConfig.send$default(c2272d.bravo, c2272d.alpha, "SYSTEM_LOCATION_DISABLED", null, 4, null);
                    c2272d.charlie.alpha("LocationFlow", "System location disabled broadcast sent");
                }
                b bVar = (b) c0796v.golf;
                if (bVar != null) {
                    ((Handler) c0796v.delta).postDelayed(bVar, c0796v.alpha);
                    return;
                }
                return;
            default:
                a8 a8Var = (a8) this.purple;
                synchronized (a8Var.charlie) {
                    try {
                        if (a8Var.quebec == 2 && !a8Var.bravo.get() && (scheduledFuture = a8Var.november) != null && !scheduledFuture.isCancelled()) {
                            if (a8Var.juliet > 1.0f && a8Var.alpha() >= a8Var.alpha.hotel) {
                                a8.sierra.alpha("Reset zoom = 1");
                                a8Var.charlie(1.0f, A5.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public b(av avVar, boolean z2) {
        this.alpha = 19;
        this.purple = avVar;
    }

    public b(Z0 z02, H0.a aVar) {
        this.alpha = 23;
        this.purple = z02;
    }
}
