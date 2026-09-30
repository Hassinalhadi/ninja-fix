package androidx.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Size;
import android.view.Surface;
import android.widget.Toast;
import androidx.appcompat.widget.i1;
import androidx.camera.core.C0500g;
import androidx.camera.core.C0533o;
import androidx.camera.core.M;
import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.view.PreviewView;
import androidx.recyclerview.widget.RecyclerView;
import bd.ScheduledExecutorServiceC0750c;
import be.RunnableC0756b;
import com.google.android.gms.measurement.internal.C1457m0;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.incognia.internal.Dl;
import com.incognia.internal.fVX;
import com.incognia.internal.hm;
import com.incognia.internal.zZG;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.points.presentation.PointsFragment;
import delivery.samurai.android.ui.points.presentation.PointsViewModel;
import delivery.samurai.android.ui.scanner.ScannerActivity;
import i1.AbstractC1881b;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r1.InterfaceC2482a;
import t6.AbstractC3003i;
import tc.C3105j;
import vc.C3186a;

/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0643m implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ RunnableC0643m(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        int i5 = 2;
        int i10 = 1;
        switch (this.alpha) {
            case 0:
                C0644n c0644n = (C0644n) this.purple;
                if (c0644n.delta.offer((Runnable) this.red)) {
                    c0644n.alpha();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables");
            case 1:
                av.f fVar = ((av.h) this.purple).f3259p;
                HashSet hashSet = (HashSet) fVar.bravo;
                AbstractC0512j abstractC0512j = (AbstractC0512j) this.red;
                hashSet.remove(abstractC0512j);
                ((ArrayMap) fVar.charlie).remove(abstractC0512j);
                return;
            case 2:
                av.h hVar = (av.h) this.purple;
                be.h.echo(true, AbstractC3003i.alpha(new L5.e(hVar, hVar.juliet())), (V0.h) this.red, tg.k.bravo());
                return;
            case 3:
                androidx.camera.camera2.internal.compat.e eVar = (androidx.camera.camera2.internal.compat.e) this.purple;
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = (HashSet) eVar.charlie;
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    av.g gVar = (av.g) it.next();
                    if (gVar.charlie((TotalCaptureResult) this.red)) {
                        hashSet2.add(gVar);
                    }
                }
                if (!hashSet2.isEmpty()) {
                    hashSet3.removeAll(hashSet2);
                    return;
                }
                return;
            case 4:
                ((androidx.camera.core.impl.N) this.purple).alpha((androidx.camera.core.impl.P) this.red);
                return;
            case 5:
                ((Surface) this.purple).release();
                ((SurfaceTexture) this.red).release();
                return;
            case 6:
                av.s sVar = (av.s) this.purple;
                av.ao aoVar = sVar.f3274p;
                V0.h hVar2 = (V0.h) this.red;
                if (aoVar == null) {
                    hVar2.bravo(Boolean.FALSE);
                    return;
                } else {
                    hVar2.bravo(Boolean.valueOf(sVar.alpha.whiskey(av.s.xray(aoVar))));
                    return;
                }
            case 7:
                av.s sVar2 = (av.s) this.purple;
                sVar2.getClass();
                StringBuilder sb2 = new StringBuilder("Use case ");
                String str = (String) this.red;
                sb2.append(str);
                sb2.append(" INACTIVE");
                sVar2.uniform(sb2.toString(), null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) sVar2.alpha.red;
                if (linkedHashMap.containsKey(str)) {
                    androidx.camera.core.impl.X x4 = (androidx.camera.core.impl.X) linkedHashMap.get(str);
                    x4.foxtrot = false;
                    if (!x4.echo) {
                        linkedHashMap.remove(str);
                    }
                }
                sVar2.gold();
                return;
            case 8:
                bj.c cVar = (bj.c) this.purple;
                ScheduledExecutorServiceC0750c scheduledExecutorServiceC0750c = cVar.charlie;
                bj.l lVar = (bj.l) this.red;
                Surface echo = lVar.echo(scheduledExecutorServiceC0750c, new bf.d(i10, cVar, lVar));
                cVar.alpha.mike(echo);
                cVar.hotel.put(lVar, echo);
                return;
            case 9:
                final bj.c cVar2 = (bj.c) this.purple;
                cVar2.india++;
                bj.e eVar2 = cVar2.alpha;
                bl.i.delta((AtomicBoolean) eVar2.red, true);
                bl.i.charlie((Thread) eVar2.teal);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(eVar2.alpha);
                final androidx.camera.core.M m4 = (androidx.camera.core.M) this.red;
                Size size = m4.bravo;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                A2.ao aoVar2 = new A2.ao(20, cVar2, m4);
                ScheduledExecutorServiceC0750c scheduledExecutorServiceC0750c2 = cVar2.charlie;
                m4.bravo(scheduledExecutorServiceC0750c2, aoVar2);
                m4.alpha(surface, scheduledExecutorServiceC0750c2, new InterfaceC2482a() { // from class: bj.b
                    @Override // r1.InterfaceC2482a
                    public final void accept(Object obj) {
                        c cVar3 = c.this;
                        M m5 = m4;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        cVar3.getClass();
                        synchronized (m5.alpha) {
                            m5.mike = null;
                            m5.november = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        cVar3.india--;
                        cVar3.delta();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(cVar2, cVar2.delta);
                return;
            case 10:
                bj.l lVar2 = (bj.l) this.purple;
                lVar2.getClass();
                ((InterfaceC2482a) ((AtomicReference) this.red).get()).accept(new C0500g(lVar2));
                return;
            case 11:
                final bk.e eVar3 = (bk.e) this.purple;
                eVar3.echo++;
                androidx.camera.core.M m5 = (androidx.camera.core.M) this.red;
                bk.c cVar3 = eVar3.alpha;
                bl.i.delta((AtomicBoolean) cVar3.red, true);
                bl.i.charlie((Thread) cVar3.teal);
                boolean z2 = m5.echo;
                if (z2) {
                    i4 = cVar3.f3394g;
                } else {
                    i4 = cVar3.f3395h;
                }
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(i4);
                Size size2 = m5.bravo;
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                m5.alpha(surface2, eVar3.charlie, new InterfaceC2482a() { // from class: bk.d
                    @Override // r1.InterfaceC2482a
                    public final void accept(Object obj) {
                        e eVar4 = e.this;
                        eVar4.getClass();
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        eVar4.echo--;
                        eVar4.delta();
                    }
                });
                if (z2) {
                    eVar3.india = surfaceTexture2;
                    return;
                } else {
                    eVar3.juliet = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(eVar3, eVar3.delta);
                    return;
                }
            case 12:
                bk.e eVar4 = (bk.e) this.purple;
                ScheduledExecutorServiceC0750c scheduledExecutorServiceC0750c3 = eVar4.charlie;
                bj.l lVar3 = (bj.l) this.red;
                Surface echo2 = lVar3.echo(scheduledExecutorServiceC0750c3, new bf.d(i5, eVar4, lVar3));
                eVar4.alpha.mike(echo2);
                eVar4.hotel.put(lVar3, echo2);
                return;
            case 13:
                ((PreviewView) ((androidx.core.widget.f) this.purple).purple).e.november((androidx.camera.core.M) this.red);
                return;
            case 14:
                bp.r rVar = (bp.r) this.purple;
                androidx.camera.core.M m8 = rVar.hotel;
                if (m8 != null && m8 == ((androidx.camera.core.M) this.red)) {
                    rVar.hotel = null;
                    rVar.golf = null;
                }
                A2.p pVar = rVar.lima;
                if (pVar != null) {
                    pVar.bravo();
                    rVar.lima = null;
                    return;
                }
                return;
            case 15:
                com.google.android.material.datepicker.i iVar = (com.google.android.material.datepicker.i) this.purple;
                TextInputLayout textInputLayout = iVar.alpha;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), ((String) this.red).replace(' ', (char) 160)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), iVar.red.format(new Date(com.google.android.material.datepicker.ai.hotel().getTimeInMillis())).replace(' ', (char) 160)));
                iVar.alpha();
                return;
            case 16:
                ((C1457m0) this.purple).alpha((Intent) this.red);
                return;
            case 17:
                G6.h hVar3 = (G6.h) this.red;
                av.ah ahVar = FirebaseMessaging.kilo;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.purple;
                firebaseMessaging.getClass();
                try {
                    hVar3.bravo(firebaseMessaging.alpha());
                    return;
                } catch (Exception e) {
                    hVar3.alpha(e);
                    return;
                }
            case 18:
                G6.h hVar4 = (G6.h) this.red;
                try {
                    hVar4.bravo(((com.google.firebase.messaging.m) this.purple).charlie());
                    return;
                } catch (Exception e4) {
                    hVar4.alpha(e4);
                    return;
                }
            case 19:
                Dl.b((Function1) this.purple, (Dl) this.red);
                return;
            case 20:
                fVX.b((Function1) this.purple, (fVX) this.red);
                return;
            case 21:
                hm.b((Function1) this.purple, (hm) this.red);
                return;
            case 22:
                zZG.b((zZG) this.purple, (Function1) this.red);
                return;
            case 23:
                ((AbstractC1881b) this.purple).juliet((Typeface) this.red);
                return;
            case 24:
                Runnable command = (Runnable) this.red;
                Intrinsics.echo(command, "$command");
                K2.i this$0 = (K2.i) this.purple;
                Intrinsics.echo(this$0, "this$0");
                try {
                    command.run();
                    return;
                } finally {
                    this$0.delta();
                }
            case 25:
                PointsFragment pointsFragment = (PointsFragment) this.purple;
                if (pointsFragment.isAdded()) {
                    i1 i1Var = pointsFragment.f12435f;
                    if (i1Var != null) {
                        RecyclerView recyclerView = (RecyclerView) i1Var.echo;
                        if (recyclerView.getAdapter() != null) {
                            if (recyclerView.getLayoutManager() != null) {
                                new S5.k(recyclerView, pointsFragment.f12441l, 2, false, new F8.q(recyclerView.getLayoutManager()));
                                pointsFragment.f12437h = 0;
                                pointsFragment.f12438i = false;
                                pointsFragment.f12436g.bravo(CollectionsKt.emptyList());
                                PointsViewModel quebec = pointsFragment.quebec();
                                int i11 = pointsFragment.f12437h;
                                V1.a hotel = T.hotel(quebec);
                                Cf.e eVar5 = vf.ao.alpha;
                                vf.ad.zulu(hotel, Cf.d.purple, null, new lc.k(quebec, i11, null), 2);
                                return;
                            }
                            throw new IllegalStateException("LayoutManager needs to be set on the RecyclerView");
                        }
                        throw new IllegalStateException("Adapter needs to be set!");
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
                return;
            case 26:
                s8.v vVar = (s8.v) this.purple;
                Context context2 = (Context) this.red;
                if (vVar.alpha == null && context2 != null) {
                    vVar.alpha = context2.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                    return;
                }
                return;
            case 27:
                ((C3105j) this.purple).zulu((String) this.red);
                return;
            case 28:
                Timer timer = AppStartTrace.f8282o;
                AppStartTrace appStartTrace = (AppStartTrace) this.purple;
                appStartTrace.getClass();
                appStartTrace.purple.charlie((C8.aa) ((C8.x) this.red).golf(), C8.i.FOREGROUND_BACKGROUND);
                return;
            default:
                RunnableC0756b runnableC0756b = (RunnableC0756b) this.purple;
                ScannerActivity scannerActivity = (ScannerActivity) this.red;
                int i12 = ScannerActivity.Q;
                try {
                    bo.e eVar6 = (bo.e) runnableC0756b.get();
                    PreviewView previewView = (PreviewView) scannerActivity.findViewById(R.id.preview_view);
                    androidx.camera.core.az charlie = new androidx.camera.core.aa(1).charlie();
                    charlie.beige(previewView.getSurfaceProvider());
                    androidx.camera.core.impl.aw awVar = new androidx.camera.core.aa(0).bravo;
                    awVar.hotel(androidx.camera.core.impl.al.purple, 0);
                    androidx.camera.core.impl.al alVar = new androidx.camera.core.impl.al(androidx.camera.core.impl.B.alpha(awVar));
                    androidx.camera.core.impl.ao.echo(alVar);
                    androidx.camera.core.ad adVar = new androidx.camera.core.ad(alVar);
                    adVar.black(scannerActivity.f12457N, new C3186a(scannerActivity));
                    eVar6.foxtrot();
                    C0533o DEFAULT_BACK_CAMERA = C0533o.charlie;
                    Intrinsics.delta(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
                    scannerActivity.f12456M = eVar6.charlie(scannerActivity, DEFAULT_BACK_CAMERA, charlie, adVar);
                    return;
                } catch (Exception e5) {
                    Toast.makeText(scannerActivity, scannerActivity.getString(R.string.camera_initialization_error, e5.getMessage()), 1).show();
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC0643m(Runnable runnable, K2.i iVar) {
        this.alpha = 24;
        this.red = runnable;
        this.purple = iVar;
    }
}
