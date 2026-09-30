package A2;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Size;
import android.view.ActionMode;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.core.M;
import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.core.impl.at;
import androidx.fragment.app.C0609d;
import androidx.fragment.app.C0620o;
import androidx.fragment.app.W;
import androidx.fragment.app.b0;
import androidx.fragment.app.i0;
import androidx.lifecycle.az;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.splash.AuthViewModel;
import i8.InterfaceC1904b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import s.ActionModeCallbackC2535n;
import s.C2525d;
import s.C2526e;
import s.C2528g;
import s6.AbstractC2643e5;
import s6.P5;
import s6.V5;
import s6.W5;
import t6.AbstractC3066u3;
import vg.aq;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ s(bj.c cVar, androidx.camera.core.t tVar, V0.h hVar) {
        this.alpha = 19;
        Map map = Collections.EMPTY_MAP;
        this.purple = cVar;
        this.silver = tVar;
        this.red = hVar;
    }

    private final void alpha() {
        JSONObject optJSONObject;
        E8.f fVar = (E8.f) this.purple;
        String str = (String) this.red;
        F8.g gVar = (F8.g) this.silver;
        w.o oVar = fVar.alpha;
        F7.b bVar = (F7.b) ((InterfaceC1904b) oVar.purple).get();
        if (bVar != null) {
            JSONObject jSONObject = gVar.echo;
            if (jSONObject.length() >= 1) {
                JSONObject jSONObject2 = gVar.bravo;
                if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (optString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) oVar.red)) {
                        try {
                            if (optString.equals(((Map) oVar.red).get(str))) {
                                return;
                            }
                            ((Map) oVar.red).put(str, optString);
                            Bundle bundle = new Bundle();
                            bundle.putString("arm_key", str);
                            bundle.putString("arm_value", jSONObject2.optString(str));
                            bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                            bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                            bundle.putString(CTVariableUtils.DICTIONARY, optJSONObject.optString(CTVariableUtils.DICTIONARY));
                            F7.c cVar = (F7.c) bVar;
                            cVar.alpha("fp", "personalization_assignment", bundle);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("_fpid", optString);
                            cVar.alpha("fp", "_fpc", bundle2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    private final void bravo() {
        E5.j jVar = (E5.j) this.purple;
        W5 w52 = (W5) this.red;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.silver;
        jVar.getClass();
        try {
            K1.u alpha = V5.alpha(jVar.purple);
            if (alpha != null) {
                K1.t tVar = (K1.t) ((K1.j) alpha.bravo);
                synchronized (tVar.silver) {
                    tVar.white = threadPoolExecutor;
                }
                ((K1.j) alpha.bravo).charlie(new K1.m(w52, threadPoolExecutor));
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th) {
            w52.alpha(th);
            threadPoolExecutor.shutdown();
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        int i5 = 0;
        boolean z2 = true;
        K9.a aVar = null;
        switch (this.alpha) {
            case 0:
                V0.h hVar = (V0.h) this.red;
                Function0 function0 = (Function0) this.silver;
                if (!((AtomicBoolean) this.purple).get()) {
                    try {
                        hVar.bravo(function0.invoke());
                        return;
                    } catch (Throwable th) {
                        hVar.delta(th);
                        return;
                    }
                }
                return;
            case 1:
                V0.h hVar2 = (V0.h) this.red;
                ?? r12 = (Lambda) this.silver;
                if (!((AtomicBoolean) this.purple).get()) {
                    try {
                        hVar2.bravo(r12.invoke());
                        return;
                    } catch (Throwable th2) {
                        hVar2.delta(th2);
                        return;
                    }
                }
                return;
            case 2:
                A8.h hVar3 = (A8.h) this.purple;
                hVar3.getClass();
                C8.s yankee = C8.t.yankee();
                yankee.india();
                C8.t.tango((C8.t) yankee.purple, (C8.o) this.red);
                hVar3.delta(yankee, (C8.i) this.silver);
                return;
            case 3:
                A8.h hVar4 = (A8.h) this.purple;
                hVar4.getClass();
                C8.s yankee2 = C8.t.yankee();
                yankee2.india();
                C8.t.uniform((C8.t) yankee2.purple, (C8.aa) this.red);
                hVar4.delta(yankee2, (C8.i) this.silver);
                return;
            case 4:
                A8.h hVar5 = (A8.h) this.purple;
                hVar5.getClass();
                C8.s yankee3 = C8.t.yankee();
                yankee3.india();
                C8.t.victor((C8.t) yankee3.purple, (C8.r) this.red);
                hVar5.delta(yankee3, (C8.i) this.silver);
                return;
            case 5:
                B2.f fVar = (B2.f) this.purple;
                V0.k kVar = (V0.k) this.red;
                B2.ao aoVar = (B2.ao) this.silver;
                fVar.getClass();
                try {
                    z2 = ((Boolean) kVar.purple.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (fVar.kilo) {
                    try {
                        J2.j bravo = P5.bravo(aoVar.alpha);
                        String str = bravo.alpha;
                        if (fVar.delta(str) == aoVar) {
                            fVar.bravo(str);
                        }
                        z.echo().alpha(B2.f.lima, B2.f.class.getSimpleName() + " " + str + " executed; reschedule = " + z2);
                        Iterator it = fVar.juliet.iterator();
                        while (it.hasNext()) {
                            ((B2.c) it.next()).charlie(bravo, z2);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 6:
                ((B2.f) ((J2.e) this.purple).purple).india((B2.l) this.red, (J2.t) this.silver);
                return;
            case 7:
                Da.q qVar = (Da.q) this.red;
                Integer valueOf = Integer.valueOf(qVar.f960z);
                HashMap hashMap = (HashMap) this.purple;
                String str2 = (String) this.silver;
                hashMap.put(valueOf, str2);
                B9.ae aeVar = qVar.B;
                if (aeVar != null) {
                    AppCompatImageView ivDoc = aeVar.f331h;
                    Intrinsics.delta(ivDoc, "ivDoc");
                    Intrinsics.checkNotNull(str2);
                    AbstractC2643e5.bravo(ivDoc, StringsKt.b(str2).toString(), R.dimen.spacing_12);
                    B9.ae aeVar2 = qVar.B;
                    if (aeVar2 != null) {
                        AppCompatImageView ivPlaceHolder = aeVar2.f332i;
                        Intrinsics.delta(ivPlaceHolder, "ivPlaceHolder");
                        AbstractC2643e5.bravo(ivPlaceHolder, StringsKt.b(str2).toString(), R.dimen.spacing_12);
                        int i10 = qVar.f955u;
                        K9.a[] values = K9.a.values();
                        int length = values.length;
                        while (true) {
                            if (i5 < length) {
                                K9.a aVar2 = values[i5];
                                if (aVar2.alpha == i10) {
                                    aVar = aVar2;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        if (aVar == null) {
                            i4 = -1;
                        } else {
                            i4 = Da.o.$EnumSwitchMapping$0[aVar.ordinal()];
                        }
                        if (i4 != -1) {
                            if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ((AuthViewModel) qVar.f951D.getValue()).setUploadDocument(new Pair(Integer.valueOf(qVar.f955u), str2));
                        }
                        qVar.A.setValue(hashMap);
                        qVar.juliet();
                        return;
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
                Intrinsics.lima("binding");
                throw null;
            case 8:
                alpha();
                return;
            case 9:
                bravo();
                return;
            case 10:
                J2.r uniform = ((WorkDatabase) this.purple).uniform();
                uniform.getClass();
                l2.p foxtrot = l2.p.foxtrot(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                foxtrot.oscar(1, (String) this.red);
                WorkDatabase_Impl workDatabase_Impl = uniform.alpha;
                workDatabase_Impl.bravo();
                Cursor mike = workDatabase_Impl.mike(foxtrot);
                try {
                    ArrayList arrayList = new ArrayList(mike.getCount());
                    while (mike.moveToNext()) {
                        arrayList.add(mike.getString(0));
                    }
                    mike.close();
                    foxtrot.golf();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        K2.f.alpha((B2.w) this.silver, (String) it2.next());
                    }
                    return;
                } catch (Throwable th4) {
                    mike.close();
                    foxtrot.golf();
                    throw th4;
                }
            case 11:
                String str3 = (String) this.red;
                String str4 = (String) this.silver;
                O7.n nVar = ((O7.r) this.purple).golf;
                nVar.getClass();
                try {
                    ((C3.d) nVar.delta.silver).mike(str3, str4);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context = nVar.alpha;
                    if (context != null && (2 & context.getApplicationInfo().flags) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 12:
                ((androidx.camera.camera2.internal.compat.g) this.purple).alpha.onSurfacePrepared((CameraCaptureSession) this.red, (Surface) this.silver);
                return;
            case 13:
                az azVar = (az) ((w.o) this.purple).purple;
                at atVar = (at) this.red;
                if (atVar != null) {
                    azVar.removeObserver(atVar);
                }
                azVar.observeForever((at) this.silver);
                return;
            case 14:
                ViewGroup container = (ViewGroup) this.purple;
                Intrinsics.echo(container, "$container");
                C0609d this$0 = (C0609d) this.silver;
                Intrinsics.echo(this$0, "this$0");
                container.endViewTransition((View) this.red);
                this$0.charlie.alpha.charlie(this$0);
                return;
            case 15:
                C0620o this$02 = (C0620o) this.silver;
                Intrinsics.echo(this$02, "this$0");
                androidx.fragment.app.ai inFragment = ((i0) this.purple).charlie;
                androidx.fragment.app.ai outFragment = ((i0) this.red).charlie;
                b0 b0Var = W.alpha;
                Intrinsics.echo(inFragment, "inFragment");
                Intrinsics.echo(outFragment, "outFragment");
                if (this$02.oscar) {
                    outFragment.getEnterTransitionCallback();
                    return;
                } else {
                    inFragment.getEnterTransitionCallback();
                    return;
                }
            case 16:
                av.f fVar2 = ((av.h) this.purple).f3259p;
                HashSet hashSet = (HashSet) fVar2.bravo;
                AbstractC0512j abstractC0512j = (AbstractC0512j) this.silver;
                hashSet.add(abstractC0512j);
                ((ArrayMap) fVar2.charlie).put(abstractC0512j, (Executor) this.red);
                return;
            case 17:
                Ce.y yVar = (Ce.y) this.purple;
                yVar.getClass();
                Log.d("RequestMonitor", "RequestListener " + ((androidx.camera.camera2.internal.compat.e) this.red) + " done " + yVar);
                yVar.bravo.remove((V0.k) this.silver);
                return;
            case 18:
                if (((bj.c) this.purple).juliet) {
                    ((Runnable) this.red).run();
                    return;
                } else {
                    ((Runnable) this.silver).run();
                    return;
                }
            case 19:
                androidx.camera.core.t tVar = (androidx.camera.core.t) this.silver;
                Map map = Collections.EMPTY_MAP;
                V0.h hVar6 = (V0.h) this.red;
                bj.c cVar = (bj.c) this.purple;
                cVar.getClass();
                try {
                    cVar.alpha.juliet(tVar);
                    hVar6.bravo(null);
                    return;
                } catch (RuntimeException e4) {
                    hVar6.delta(e4);
                    return;
                }
            case 20:
                ((J2.t) this.purple).india((bj.k) this.red, (Map.Entry) this.silver);
                return;
            case 21:
                androidx.camera.core.t tVar2 = (androidx.camera.core.t) this.silver;
                Map map2 = Collections.EMPTY_MAP;
                V0.h hVar7 = (V0.h) this.red;
                bk.e eVar = (bk.e) this.purple;
                eVar.getClass();
                try {
                    eVar.alpha.juliet(tVar2);
                    hVar7.bravo(null);
                    return;
                } catch (RuntimeException e5) {
                    hVar7.delta(e5);
                    return;
                }
            case 22:
                if (((bk.e) this.purple).foxtrot) {
                    ((Runnable) this.red).run();
                    return;
                } else {
                    ((Runnable) this.silver).run();
                    return;
                }
            case 23:
                bp.o oVar = ((bp.p) this.purple).foxtrot;
                oVar.alpha();
                boolean z10 = oVar.yellow;
                M m4 = (M) this.red;
                if (z10) {
                    oVar.yellow = false;
                    m4.charlie();
                    m4.india.bravo(null);
                    return;
                }
                oVar.purple = m4;
                oVar.silver = (p) this.silver;
                Size size = m4.bravo;
                oVar.alpha = size;
                oVar.white = false;
                if (!oVar.bravo()) {
                    AbstractC3066u3.bravo("SurfaceViewImpl", "Wait for new Surface creation.");
                    oVar.f3402a.echo.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                    return;
                }
                return;
            case 24:
                CTFirebaseMessagingReceiver.alpha((CTFirebaseMessagingReceiver) this.purple, (Context) this.red, (Bundle) this.silver);
                return;
            case 25:
                Intent intent = (Intent) this.red;
                G6.h hVar8 = (G6.h) this.silver;
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.purple;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    hVar8.bravo(null);
                }
            case 26:
                ((Function1) this.purple).invoke((k3.f) this.red);
                ((p3.ab) this.silver).delta();
                return;
            case 27:
                C2528g c2528g = (C2528g) this.purple;
                ActionMode startActionMode = c2528g.alpha.startActionMode(new ActionModeCallbackC2535n((C2525d) this.red), 1);
                Intrinsics.areEqual(c2528g.hotel, startActionMode);
                if (startActionMode == null) {
                    ((C2526e) this.silver).close();
                    return;
                }
                return;
            case 28:
                vg.n nVar2 = (vg.n) ((com.google.android.play.core.integrity.c) this.purple).red;
                boolean isCanceled = nVar2.purple.isCanceled();
                vg.g gVar2 = (vg.g) this.red;
                if (isCanceled) {
                    gVar2.onFailure(nVar2, new IOException("Canceled"));
                    return;
                } else {
                    gVar2.onResponse(nVar2, (aq) this.silver);
                    return;
                }
            default:
                ((vg.g) this.red).onFailure((vg.n) ((com.google.android.play.core.integrity.c) this.purple).red, (Throwable) this.silver);
                return;
        }
    }

    public /* synthetic */ s(bk.e eVar, androidx.camera.core.t tVar, V0.h hVar) {
        this.alpha = 21;
        Map map = Collections.EMPTY_MAP;
        this.purple = eVar;
        this.silver = tVar;
        this.red = hVar;
    }

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s(AtomicBoolean atomicBoolean, V0.h hVar, Function0 function0) {
        this.alpha = 1;
        this.purple = atomicBoolean;
        this.red = hVar;
        this.silver = (Lambda) function0;
    }
}
