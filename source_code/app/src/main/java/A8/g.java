package A8;

import A2.q;
import B2.l;
import B2.w;
import E5.s;
import I7.m;
import I7.n;
import J2.j;
import K2.i;
import O7.r;
import O7.t;
import ae.ai;
import ae.o;
import android.animation.ObjectAnimator;
import android.app.job.JobParameters;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.i1;
import androidx.camera.core.M;
import androidx.camera.core.av;
import androidx.camera.core.ay;
import androidx.camera.core.impl.ah;
import androidx.camera.core.impl.aq;
import androidx.camera.core.impl.at;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.az;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.mlkit.vision.barcode.common.Barcode;
import d3.C1586b;
import d3.k;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.withdraw.WithdrawDetailActivity;
import i8.InterfaceC1903a;
import i8.InterfaceC1904b;
import j1.C1929c;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s1.InterfaceC2587u;
import s1.a0;
import s1.al;
import s1.au;
import t6.AbstractC2993g;
import t6.AbstractC3066u3;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ g(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    private final void alpha() {
        InterfaceC1903a interfaceC1903a;
        n nVar = (n) this.purple;
        InterfaceC1904b interfaceC1904b = (InterfaceC1904b) this.red;
        if (nVar.bravo == n.delta) {
            synchronized (nVar) {
                interfaceC1903a = nVar.alpha;
                nVar.alpha = null;
                nVar.bravo = interfaceC1904b;
            }
            interfaceC1903a.delta(interfaceC1904b);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void bravo() {
        m mVar = (m) this.purple;
        InterfaceC1904b interfaceC1904b = (InterfaceC1904b) this.red;
        synchronized (mVar) {
            try {
                if (mVar.bravo == null) {
                    mVar.alpha.add(interfaceC1904b);
                } else {
                    mVar.bravo.add(interfaceC1904b.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void charlie() {
        boolean equals;
        r rVar = (r) this.purple;
        String str = (String) this.red;
        U7.c cVar = rVar.golf.delta;
        cVar.getClass();
        String bravo = Q7.e.bravo(Barcode.FORMAT_UPC_E, str);
        synchronized (((AtomicMarkableReference) cVar.yellow)) {
            try {
                String str2 = (String) ((AtomicMarkableReference) cVar.yellow).getReference();
                if (bravo == null) {
                    if (str2 == null) {
                        equals = true;
                    } else {
                        equals = false;
                    }
                } else {
                    equals = bravo.equals(str2);
                }
                if (equals) {
                    return;
                }
                ((AtomicMarkableReference) cVar.yellow).set(bravo, true);
                ((P7.f) cVar.red).bravo.alpha(new q(15, cVar));
            } finally {
            }
        }
    }

    private final void delta() {
        ah ahVar = (ah) this.purple;
        String str = (String) this.red;
        ahVar.getClass();
        try {
            ahVar.echo.get();
            ahVar.echo(ah.november.decrementAndGet(), ah.mike.get(), "Surface terminated");
        } catch (Exception e) {
            AbstractC3066u3.charlie("DeferrableSurface", "Unexpected surface termination for " + ahVar + "\nStack Trace:\n" + str);
            synchronized (ahVar.alpha) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", ahVar, Boolean.valueOf(ahVar.charlie), Integer.valueOf(ahVar.bravo)), e);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i4 = 0;
        switch (this.alpha) {
            case 0:
                h hVar = (h) this.purple;
                hVar.getClass();
                c cVar = (c) this.red;
                hVar.delta(cVar.alpha, cVar.bravo);
                return;
            case 1:
                B2.f fVar = (B2.f) this.purple;
                j jVar = (j) this.red;
                synchronized (fVar.kilo) {
                    try {
                        Iterator it = fVar.juliet.iterator();
                        while (it.hasNext()) {
                            ((B2.c) it.next()).charlie(jVar, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                ((J2.e) ((C2.d) this.purple).red).L((l) this.red, 3);
                return;
            case 3:
                Function1 function1 = ((Gc.g) this.purple).f1375r;
                if (function1 != null) {
                    String absolutePath = ((File) this.red).getAbsolutePath();
                    Intrinsics.delta(absolutePath, "getAbsolutePath(...)");
                    function1.invoke(absolutePath);
                    return;
                }
                return;
            case 4:
                Iterator it2 = ((List) this.purple).iterator();
                while (it2.hasNext()) {
                    ((G2.a) it2.next()).alpha(((H2.f) this.red).echo);
                }
                return;
            case 5:
                alpha();
                return;
            case 6:
                bravo();
                return;
            case 7:
                J7.a aVar = (J7.a) this.purple;
                Process.setThreadPriority(aVar.red);
                StrictMode.ThreadPolicy threadPolicy = aVar.silver;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.red).run();
                return;
            case 8:
                Callable callable = (Callable) this.purple;
                J7.h hVar2 = (J7.h) ((D8.c) this.red).purple;
                try {
                    hVar2.juliet(callable.call());
                    return;
                } catch (Exception e) {
                    hVar2.kilo(e);
                    return;
                }
            case 9:
                String uuid = ((UUID) this.red).toString();
                Intrinsics.delta(uuid, "id.toString()");
                K2.f.alpha((w) this.purple, uuid);
                return;
            case 10:
                int i5 = JobInfoSchedulerService.alpha;
                ((JobInfoSchedulerService) this.purple).jobFinished((JobParameters) this.red, false);
                return;
            case 11:
                Kb.h hVar3 = (Kb.h) this.purple;
                hVar3.beige();
                hVar3.amber();
                View view = (View) this.red;
                View findViewById = view.findViewById(R.id.ll_action_buttons);
                NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.scroll_content);
                if (findViewById != null) {
                    findViewById.post(new g(12, nestedScrollView, findViewById));
                    return;
                }
                return;
            case 12:
                NestedScrollView nestedScrollView2 = (NestedScrollView) this.purple;
                if (nestedScrollView2 != null) {
                    nestedScrollView2.setClipToPadding(false);
                }
                if (nestedScrollView2 != null) {
                    i4 = nestedScrollView2.getPaddingBottom();
                }
                final int height = ((View) this.red).getHeight();
                Intrinsics.checkNotNull(nestedScrollView2);
                InterfaceC2587u interfaceC2587u = new InterfaceC2587u() { // from class: Kb.e
                    @Override // s1.InterfaceC2587u
                    public final a0 gold(View v4, a0 a0Var) {
                        Intrinsics.echo(v4, "v");
                        C1929c golf = a0Var.alpha.golf(527);
                        Intrinsics.delta(golf, "getInsets(...)");
                        v4.setPadding(v4.getPaddingLeft(), v4.getPaddingTop(), v4.getPaddingRight(), i4 + height + golf.delta);
                        return a0Var;
                    }
                };
                WeakHashMap weakHashMap = au.alpha;
                al.lima(nestedScrollView2, interfaceC2587u);
                nestedScrollView2.requestApplyInsets();
                return;
            case 13:
                ((O7.n) this.purple).charlie((String) this.red, Boolean.FALSE);
                return;
            case 14:
                charlie();
                return;
            case 15:
                O7.n nVar = ((r) this.purple).golf;
                Thread currentThread = Thread.currentThread();
                nVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                t tVar = nVar.november;
                if (tVar == null || !tVar.echo.get()) {
                    long j5 = currentTimeMillis / 1000;
                    String echo = nVar.echo();
                    if (echo == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    Q7.c cVar2 = new Q7.c(echo, j5, Collections.EMPTY_MAP);
                    i1 i1Var = nVar.mike;
                    i1Var.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(echo);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    i1Var.foxtrot((Throwable) this.red, currentThread, RedirectCustomTabEventLogger.RESULT_ERROR, cVar2, false);
                    return;
                }
                return;
            case 16:
                U7.c cVar3 = (U7.c) this.purple;
                ((Q7.h) cVar3.purple).india((String) cVar3.alpha, (List) this.red);
                return;
            case 17:
                AbstractC2993g.alpha((V.d) this.purple, (LongSparseArray) this.red);
                return;
            case 18:
                V7.c cVar4 = (V7.c) this.purple;
                cVar4.getClass();
                try {
                    s.alpha().delta.alpha(cVar4.hotel.alpha.bravo(B5.d.red), 1);
                } catch (Exception unused) {
                }
                ((CountDownLatch) this.red).countDown();
                return;
            case 19:
                int i10 = WithdrawDetailActivity.f12546N;
                ObjectAnimator.ofFloat((ViewGroup) this.purple, "translationY", Arrays.copyOf(new float[]{(~r5.getHeight()) * 0.7f, 0.0f}, 2)).setDuration(1000L).start();
                RecyclerView recyclerView = ((WithdrawDetailActivity) this.red).gray().f707f;
                Intrinsics.delta(recyclerView, "recyclerView");
                ObjectAnimator.ofFloat(recyclerView, "alpha", Arrays.copyOf(new float[]{0.0f, 1.0f}, 2)).setDuration(1000L).start();
                return;
            case 20:
                k kVar = (k) this.purple;
                if (!kVar.isFinishing() && !kVar.isDestroyed()) {
                    ((C1586b) this.red).invoke();
                    return;
                }
                return;
            case 21:
                o.access$addObserverForBackInvoker((o) this.purple, (ai) this.red);
                return;
            case 22:
                Runnable runnable = (Runnable) this.red;
                i iVar = (i) this.purple;
                iVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    iVar.delta();
                }
            case 23:
                R3.s sVar = (R3.s) this.purple;
                sVar.getClass();
                ((aq) this.red).bravo(sVar);
                return;
            case 24:
                ((S2.l) this.purple).kilo();
                S2.l lVar = (S2.l) this.red;
                if (lVar != null) {
                    lVar.kilo();
                    return;
                }
                return;
            case 25:
                av avVar = (av) this.purple;
                avVar.getClass();
                ((aq) this.red).bravo(avVar);
                return;
            case 26:
                ((ay) this.purple).november((M) this.red);
                return;
            case 27:
                delta();
                return;
            case 28:
                ((az) ((w.o) this.purple).purple).removeObserver((at) this.red);
                return;
            default:
                at atVar = (at) this.purple;
                if (atVar.alpha.get()) {
                    androidx.camera.core.impl.au auVar = (androidx.camera.core.impl.au) this.red;
                    auVar.getClass();
                    atVar.purple.foxtrot(auVar.alpha);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g(r rVar, Throwable th) {
        this.alpha = 15;
        Map map = Collections.EMPTY_MAP;
        this.purple = rVar;
        this.red = th;
    }
}
