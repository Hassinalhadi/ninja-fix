package A2;

import B9.C0058p;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.activity.result.IntentSenderRequest;
import androidx.camera.core.C0502i;
import androidx.camera.core.L;
import androidx.camera.core.M;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.C0507e;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.aw;
import androidx.camera.core.impl.ay;
import androidx.camera.view.PreviewView;
import be.C0758d;
import be.InterfaceC0755a;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.Var;
import com.clevertap.android.sdk.variables.VarCache;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import g3.C1749j;
import g3.C1751l;
import j8.C1944a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s6.D5;
import s6.V4;
import t6.AbstractC3066u3;
import t6.J3;
import vf.H;
import vf.I;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements V0.i, G6.c, OnSuccessListener, M5.a, L5.f, InterfaceC0755a, L, com.clevertap.android.sdk.task.OnSuccessListener, G6.g, OnFailureListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p(Nd.h hVar, vf.ac acVar, Xd.l lVar) {
        this.alpha = 0;
        this.purple = hVar;
        this.red = acVar;
        this.silver = (Pd.i) lVar;
    }

    @Override // androidx.camera.core.L
    public void alpha(C0502i c0502i) {
        boolean z2;
        bp.i iVar;
        androidx.core.widget.f fVar = (androidx.core.widget.f) this.purple;
        fVar.getClass();
        AbstractC3066u3.bravo("PreviewView", "Preview transformation info updated. " + c0502i);
        if (((InterfaceC0525x) this.red).oscar().echo() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        PreviewView previewView = (PreviewView) fVar.purple;
        Size size = ((M) this.silver).bravo;
        bp.d dVar = previewView.silver;
        dVar.getClass();
        AbstractC3066u3.bravo("PreviewTransform", "Transformation info set: " + c0502i + " " + size + " " + z2);
        dVar.bravo = c0502i.alpha;
        dVar.charlie = c0502i.bravo;
        int i4 = c0502i.charlie;
        dVar.echo = i4;
        dVar.alpha = size;
        dVar.foxtrot = z2;
        dVar.golf = c0502i.delta;
        dVar.delta = c0502i.echo;
        if (i4 != -1 && ((iVar = previewView.purple) == null || !(iVar instanceof bp.p))) {
            previewView.teal = false;
        } else {
            previewView.teal = true;
        }
        previewView.alpha();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0142 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:4:0x001c, B:10:0x002b, B:11:0x003f, B:14:0x0044, B:15:0x004a, B:17:0x0050, B:19:0x0065, B:20:0x00c5, B:22:0x00cb, B:24:0x00e0, B:26:0x00f0, B:28:0x00f4, B:29:0x0100, B:30:0x0118, B:32:0x011e, B:34:0x012c, B:36:0x0134, B:38:0x0142, B:40:0x0154, B:42:0x016a, B:49:0x0175, B:51:0x0195, B:53:0x0199, B:55:0x01a2, B:56:0x01c3, B:58:0x01c9, B:60:0x01d9, B:62:0x01f1, B:64:0x01f6, B:65:0x01fe, B:68:0x0201, B:69:0x0207, B:71:0x0209, B:72:0x021e), top: B:3:0x001c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168  */
    @Override // L5.f, be.InterfaceC0755a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.common.util.concurrent.e apply(Object obj) {
        InputConfiguration inputConfiguration;
        boolean z2;
        aw.i iVar;
        String str;
        av.aj ajVar = (av.aj) this.purple;
        P p4 = (P) this.red;
        CameraDevice cameraDevice = (CameraDevice) this.silver;
        List list = (List) obj;
        synchronized (ajVar.alpha) {
            try {
                int mike = av.q.mike(ajVar.india);
                if (mike != 0 && mike != 1) {
                    if (mike == 2) {
                        ajVar.golf.clear();
                        for (int i4 = 0; i4 < list.size(); i4++) {
                            ajVar.golf.put((androidx.camera.core.impl.ah) ajVar.hotel.get(i4), (Surface) list.get(i4));
                        }
                        ajVar.india = 4;
                        AbstractC3066u3.bravo("CaptureSession", "Opening capture session.");
                        av.ai aiVar = new av.ai(2, Arrays.asList(ajVar.charlie, new av.ai(1, p4.delta)));
                        androidx.camera.core.impl.ad adVar = p4.golf;
                        av.ah ahVar = new av.ah(6, adVar.bravo);
                        HashSet hashSet = new HashSet();
                        aw.bravo();
                        ArrayList arrayList = new ArrayList();
                        ay.alpha();
                        hashSet.addAll(adVar.alpha);
                        aw delta = aw.delta(adVar.bravo);
                        int i5 = adVar.charlie;
                        arrayList.addAll(adVar.delta);
                        boolean z10 = adVar.echo;
                        ArrayMap arrayMap = new ArrayMap();
                        V v4 = adVar.foxtrot;
                        for (String str2 : v4.alpha.keySet()) {
                            arrayMap.put(str2, v4.alpha.get(str2));
                        }
                        V v6 = new V(arrayMap);
                        HashMap hashMap = new HashMap();
                        if (ajVar.romeo && Build.VERSION.SDK_INT >= 35) {
                            hashMap = av.aj.charlie(av.aj.hotel(p4.alpha), ajVar.golf);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        String str3 = (String) ((androidx.camera.core.impl.af) ahVar.purple).plum(au.a.f3244f, null);
                        Iterator it = p4.alpha.iterator();
                        while (it.hasNext()) {
                            C0507e c0507e = (C0507e) it.next();
                            aw awVar = delta;
                            if (ajVar.romeo) {
                                z2 = z10;
                                if (Build.VERSION.SDK_INT >= 35) {
                                    iVar = (aw.i) hashMap.get(c0507e);
                                    if (iVar != null) {
                                        iVar = ajVar.foxtrot(c0507e, ajVar.golf, str3);
                                        str = str3;
                                        if (ajVar.lima.containsKey(c0507e.alpha)) {
                                            iVar.alpha.juliet(((Long) ajVar.lima.get(c0507e.alpha)).longValue());
                                        }
                                    } else {
                                        str = str3;
                                    }
                                    arrayList2.add(iVar);
                                    delta = awVar;
                                    z10 = z2;
                                    str3 = str;
                                }
                            } else {
                                z2 = z10;
                            }
                            iVar = null;
                            if (iVar != null) {
                            }
                            arrayList2.add(iVar);
                            delta = awVar;
                            z10 = z2;
                            str3 = str;
                        }
                        aw awVar2 = delta;
                        boolean z11 = z10;
                        ArrayList golf = av.aj.golf(arrayList2);
                        av.aw awVar3 = ajVar.delta;
                        awVar3.foxtrot = aiVar;
                        aw.v vVar = new aw.v(golf, awVar3.delta, new av.aa(1, awVar3));
                        if (p4.golf.charlie == 5 && (inputConfiguration = p4.hotel) != null) {
                            vVar.alpha.hotel(aw.h.alpha(inputConfiguration));
                        }
                        try {
                            ArrayList arrayList3 = new ArrayList(hashSet);
                            B alpha = B.alpha(awVar2);
                            ArrayList arrayList4 = new ArrayList(arrayList);
                            V v10 = V.bravo;
                            ArrayMap arrayMap2 = new ArrayMap();
                            for (String str4 : v6.alpha.keySet()) {
                                arrayMap2.put(str4, v6.alpha.get(str4));
                            }
                            CaptureRequest delta2 = J3.delta(new androidx.camera.core.impl.ad(arrayList3, alpha, i5, arrayList4, z11, new V(arrayMap2), null), cameraDevice, ajVar.quebec);
                            if (delta2 != null) {
                                vVar.alpha.golf(delta2);
                            }
                            return ajVar.delta.papa(cameraDevice, vVar, ajVar.hotel);
                        } catch (CameraAccessException e) {
                            return new be.j(1, e);
                        }
                    }
                    if (mike != 4) {
                        return new be.j(1, new CancellationException("openCaptureSession() not execute in state: ".concat(av.q.oscar(ajVar.india))));
                    }
                }
                return new be.j(1, new IllegalStateException("openCaptureSession() should not be possible in state: ".concat(av.q.oscar(ajVar.india))));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Xd.l, Pd.i] */
    @Override // V0.i
    public Object black(V0.h hVar) {
        switch (this.alpha) {
            case 0:
                H h4 = H.alpha;
                Nd.h hVar2 = (Nd.h) this.purple;
                hVar.alpha(new q(0, (I) hVar2.get(h4)), m.alpha);
                return vf.ad.zulu(vf.ad.charlie(hVar2), null, (vf.ac) this.red, new t((Pd.i) this.silver, hVar, null), 1);
            case 1:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                hVar.alpha(new r(atomicBoolean, 0), m.alpha);
                ((K2.i) this.purple).execute(new s(atomicBoolean, hVar, (Function0) this.silver, 0));
                return (String) this.red;
            case 10:
                V0.k kVar = (V0.k) this.purple;
                androidx.camera.core.impl.ai aiVar = new androidx.camera.core.impl.ai(0, kVar);
                bd.h hVar3 = (bd.h) this.red;
                hVar.alpha(aiVar, hVar3);
                kVar.foxtrot(new be.g(0, kVar, new O7.j(28, hVar)), hVar3);
                return "surfaceList[" + ((List) this.silver) + Constants.AES_SUFFIX;
            default:
                ((bp.c) this.purple).getClass();
                InterfaceC0523v interfaceC0523v = (InterfaceC0523v) this.red;
                av.f fVar = new av.f(hVar, interfaceC0523v);
                ((ArrayList) this.silver).add(fVar);
                interfaceC0523v.delta(tg.k.bravo(), fVar);
                return "waitForCaptureResult";
        }
    }

    public void bravo() {
        bp.c cVar;
        AtomicReference atomicReference = ((PreviewView) ((androidx.core.widget.f) this.purple).purple).yellow;
        while (true) {
            cVar = (bp.c) this.red;
            if (atomicReference.compareAndSet(cVar, null)) {
                cVar.alpha(bp.h.alpha);
                break;
            } else if (atomicReference.get() != cVar) {
                break;
            }
        }
        C0758d c0758d = (C0758d) cVar.white;
        if (c0758d != null) {
            c0758d.cancel(false);
            cVar.white = null;
        }
        ((InterfaceC0525x) this.silver).foxtrot().echo(cVar);
    }

    @Override // M5.a
    public Object execute() {
        J5.a aVar = (J5.a) this.purple;
        L5.h hVar = (L5.h) aVar.delta;
        hVar.getClass();
        E5.i iVar = (E5.i) this.red;
        E5.h hVar2 = (E5.h) this.silver;
        String india = D5.india("SQLiteEventStore");
        if (Log.isLoggable(india, 3)) {
            Log.d(india, "Storing event with priority=" + iVar.charlie + ", name=" + hVar2.alpha + " for destination " + iVar.alpha);
        }
        ((Long) hVar.foxtrot(new p(hVar, hVar2, iVar, 6))).getClass();
        aVar.alpha.alpha(iVar, 1, false);
        return null;
    }

    @Override // G6.c
    public Object ivory(Task task) {
        F8.g gVar;
        URL url;
        switch (this.alpha) {
            case 2:
                E8.b bVar = (E8.b) this.purple;
                bVar.getClass();
                Task task2 = (Task) this.red;
                if (task2.juliet() && task2.hotel() != null) {
                    F8.g gVar2 = (F8.g) task2.hotel();
                    Task task3 = (Task) this.silver;
                    if (task3.juliet() && (gVar = (F8.g) task3.hotel()) != null && gVar2.charlie.equals(gVar.charlie)) {
                        return V4.echo(Boolean.FALSE);
                    }
                    return bVar.echo.echo(gVar2).mike(bVar.charlie, new E8.a(bVar));
                }
                return V4.echo(Boolean.FALSE);
            case 3:
                F8.m mVar = (F8.m) this.purple;
                mVar.getClass();
                G6.q qVar = (G6.q) this.red;
                if (!qVar.juliet()) {
                    return V4.delta(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", qVar.golf()));
                }
                G6.q qVar2 = (G6.q) this.silver;
                try {
                    if (!qVar2.juliet()) {
                        return V4.delta(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", qVar2.golf()));
                    }
                    try {
                        url = new URL(mVar.charlie(mVar.november));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    mVar.lima(httpURLConnection, (String) qVar2.hotel(), ((C1944a) qVar.hotel()).alpha);
                    return V4.echo(httpURLConnection);
                } catch (IOException e) {
                    return V4.delta(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e));
                }
            default:
                boolean juliet = task.juliet();
                G6.h hVar = (G6.h) this.purple;
                if (juliet) {
                    hVar.delta(task.hotel());
                } else if (task.golf() != null) {
                    hVar.charlie(task.golf());
                } else if (((AtomicBoolean) this.red).getAndSet(true)) {
                    ((G6.b) this.silver).alpha();
                }
                return V4.echo(null);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        switch (this.alpha) {
            case 17:
                C1749j c1749j = (C1749j) this.purple;
                va.o oVar = (va.o) this.red;
                com.google.android.material.internal.s sVar = (com.google.android.material.internal.s) this.silver;
                Intrinsics.echo(e, "e");
                if (e instanceof ResolvableApiException) {
                    PendingIntent resolution = ((ResolvableApiException) e).getResolution();
                    Intrinsics.delta(resolution, "getResolution(...)");
                    IntentSender intentSender = resolution.getIntentSender();
                    Intrinsics.delta(intentSender, "pendingIntent.intentSender");
                    IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, null, 0, 0);
                    int i4 = g3.t.$EnumSwitchMapping$0[c1749j.echo.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2 && i4 != 3) {
                            if (i4 == 4) {
                                oVar.invoke(new g3.p(intentSenderRequest));
                                return;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        long j5 = c1749j.golf;
                        sVar.getClass();
                        if (System.currentTimeMillis() - com.google.android.material.internal.s.red < j5) {
                            oVar.invoke(new g3.q());
                            return;
                        } else {
                            com.google.android.material.internal.s.red = System.currentTimeMillis();
                            oVar.invoke(new g3.q(kotlin.collections.ab.juliet(new C1751l(intentSenderRequest))));
                            return;
                        }
                    }
                    oVar.invoke(new g3.q());
                    return;
                }
                oVar.invoke(new g3.q());
                return;
            default:
                Intrinsics.echo(e, "it");
                ((p3.aa) this.purple).invoke(e, (androidx.fragment.app.an) this.red, (LocationRequest) this.silver);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, com.clevertap.android.sdk.task.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.alpha) {
            case 4:
                Task task = (Task) this.red;
                L7.b bVar = (L7.b) this.silver;
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.purple;
                try {
                    F8.g gVar = (F8.g) task.hotel();
                    if (gVar != null) {
                        ((Executor) oVar.charlie).execute(new G8.a(bVar, ((w.o) oVar.bravo).tango(gVar), 1));
                        return;
                    }
                    return;
                } catch (FirebaseRemoteConfigException e) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
                    return;
                }
            default:
                ((VarCache) this.purple).lambda$fileVarUpdated$3((Var) this.red, (String) this.silver, (Boolean) obj);
                return;
        }
    }

    @Override // G6.g
    public Task then(Object obj) {
        String delta;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.purple;
        String str = (String) this.red;
        com.google.firebase.messaging.p pVar = (com.google.firebase.messaging.p) this.silver;
        String str2 = (String) obj;
        av.ah delta2 = FirebaseMessaging.delta(firebaseMessaging.bravo);
        B7.g gVar = firebaseMessaging.alpha;
        gVar.alpha();
        if ("[DEFAULT]".equals(gVar.bravo)) {
            delta = "";
        } else {
            delta = gVar.delta();
        }
        String bravo = firebaseMessaging.hotel.bravo();
        synchronized (delta2) {
            String alpha = com.google.firebase.messaging.p.alpha(str2, System.currentTimeMillis(), bravo);
            if (alpha != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) delta2.purple).edit();
                edit.putString(delta + "|T|" + str + "|*", alpha);
                edit.commit();
            }
        }
        if (pVar == null || !str2.equals(pVar.alpha)) {
            B7.g gVar2 = firebaseMessaging.alpha;
            gVar2.alpha();
            if ("[DEFAULT]".equals(gVar2.bravo)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.alpha();
                    sb2.append(gVar2.bravo);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.i(firebaseMessaging.bravo).bravo(intent);
            }
        }
        return V4.echo(str2);
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[SYNTHETIC] */
    @Override // L5.f, be.InterfaceC0755a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        B5.c cVar;
        Cursor cursor;
        int i4;
        B5.c cVar2;
        H5.c cVar3;
        H5.c cVar4;
        int i5 = 5;
        int i10 = 4;
        int i11 = 3;
        H5.c cVar5 = H5.c.CACHE_FULL;
        int i12 = 2;
        Object obj2 = this.silver;
        int i13 = 0;
        Object obj3 = this.red;
        Object obj4 = this.purple;
        int i14 = 1;
        switch (this.alpha) {
            case 6:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                L5.h hVar = (L5.h) obj4;
                long simpleQueryForLong = hVar.charlie().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.charlie().compileStatement("PRAGMA page_count").simpleQueryForLong();
                L5.a aVar = hVar.silver;
                long j5 = aVar.alpha;
                E5.h hVar2 = (E5.h) obj3;
                String str = hVar2.alpha;
                if (simpleQueryForLong >= j5) {
                    hVar.juliet(1L, cVar5, str);
                    return -1L;
                }
                E5.i iVar = (E5.i) obj2;
                Long echo = L5.h.echo(sQLiteDatabase, iVar);
                if (echo != null) {
                    insert = echo.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.alpha);
                    contentValues.put(Constants.INAPP_PRIORITY, Integer.valueOf(O5.a.alpha(iVar.charlie)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.bravo;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                E5.l lVar = hVar2.charlie;
                byte[] bArr2 = lVar.bravo;
                int length = bArr2.length;
                int i15 = aVar.echo;
                boolean z2 = length <= i15;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar2.delta));
                contentValues2.put("uptime_ms", Long.valueOf(hVar2.echo));
                contentValues2.put("payload_encoding", lVar.alpha.alpha);
                contentValues2.put("code", hVar2.bravo);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z2));
                contentValues2.put("payload", z2 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", hVar2.golf);
                contentValues2.put("pseudonymous_id", hVar2.hotel);
                contentValues2.put("experiment_ids_clear_blob", hVar2.india);
                contentValues2.put("experiment_ids_encrypted_blob", hVar2.juliet);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z2) {
                    int ceil = (int) Math.ceil(bArr2.length / i15);
                    for (int i16 = 1; i16 <= ceil; i16++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i16 - 1) * i15, Math.min(i16 * i15, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i16));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar2.foxtrot).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 7:
                Cursor cursor2 = (Cursor) obj;
                L5.h hVar3 = (L5.h) obj4;
                hVar3.getClass();
                while (cursor2.moveToNext()) {
                    long j6 = cursor2.getLong(0);
                    int i17 = cursor2.getInt(7) != 0 ? i14 : 0;
                    C0058p c0058p = new C0058p();
                    c0058p.delta = new HashMap();
                    String string = cursor2.getString(i14);
                    if (string != null) {
                        c0058p.bravo = string;
                        c0058p.foxtrot = Long.valueOf(cursor2.getLong(i12));
                        c0058p.golf = Long.valueOf(cursor2.getLong(3));
                        if (i17 != 0) {
                            String string2 = cursor2.getString(4);
                            if (string2 == null) {
                                cVar2 = L5.h.white;
                            } else {
                                cVar2 = new B5.c(string2);
                            }
                            c0058p.echo = new E5.l(cVar2, cursor2.getBlob(5));
                            i4 = i14;
                        } else {
                            String string3 = cursor2.getString(4);
                            if (string3 == null) {
                                cVar = L5.h.white;
                            } else {
                                cVar = new B5.c(string3);
                            }
                            Cursor query = hVar3.charlie().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j6)}, null, null, "sequence_num");
                            try {
                                ArrayList arrayList = new ArrayList();
                                int i18 = 0;
                                while (query.moveToNext()) {
                                    int i19 = i14;
                                    byte[] blob = query.getBlob(0);
                                    arrayList.add(blob);
                                    i18 += blob.length;
                                    i14 = i19;
                                }
                                i4 = i14;
                                byte[] bArr3 = new byte[i18];
                                int i20 = 0;
                                int i21 = 0;
                                while (i20 < arrayList.size()) {
                                    byte[] bArr4 = (byte[]) arrayList.get(i20);
                                    cursor = query;
                                    try {
                                        ArrayList arrayList2 = arrayList;
                                        System.arraycopy(bArr4, 0, bArr3, i21, bArr4.length);
                                        i21 += bArr4.length;
                                        i20++;
                                        query = cursor;
                                        arrayList = arrayList2;
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor.close();
                                        throw th;
                                    }
                                }
                                query.close();
                                c0058p.echo = new E5.l(cVar, bArr3);
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = query;
                            }
                        }
                        if (!cursor2.isNull(6)) {
                            c0058p.charlie = Integer.valueOf(cursor2.getInt(6));
                        }
                        if (!cursor2.isNull(8)) {
                            c0058p.hotel = Integer.valueOf(cursor2.getInt(8));
                        }
                        if (!cursor2.isNull(9)) {
                            c0058p.india = cursor2.getString(9);
                        }
                        if (!cursor2.isNull(10)) {
                            c0058p.juliet = cursor2.getBlob(10);
                        }
                        if (!cursor2.isNull(11)) {
                            c0058p.kilo = cursor2.getBlob(11);
                        }
                        ((ArrayList) obj3).add(new L5.b(j6, (E5.i) obj2, c0058p.charlie()));
                        i14 = i4;
                        i12 = 2;
                    } else {
                        throw new NullPointerException("Null transportName");
                    }
                }
                return null;
            default:
                Cursor cursor3 = (Cursor) obj;
                L5.h hVar4 = (L5.h) obj4;
                hVar4.getClass();
                while (true) {
                    HashMap hashMap = (HashMap) obj3;
                    if (cursor3.moveToNext()) {
                        String string4 = cursor3.getString(i13);
                        int i22 = cursor3.getInt(1);
                        H5.c cVar6 = H5.c.REASON_UNKNOWN;
                        if (i22 != 0) {
                            if (i22 == 1) {
                                cVar6 = H5.c.MESSAGE_TOO_OLD;
                            } else if (i22 == 2) {
                                cVar3 = cVar5;
                                cVar4 = cVar3;
                                long j7 = cursor3.getLong(2);
                                if (hashMap.containsKey(string4)) {
                                    hashMap.put(string4, new ArrayList());
                                }
                                ((List) hashMap.get(string4)).add(new H5.d(j7, cVar3));
                                cVar5 = cVar4;
                                i5 = 5;
                                i10 = 4;
                                i11 = 3;
                                i13 = 0;
                            } else if (i22 == i11) {
                                cVar6 = H5.c.PAYLOAD_TOO_BIG;
                            } else if (i22 == i10) {
                                cVar6 = H5.c.MAX_RETRIES_REACHED;
                            } else if (i22 == i5) {
                                cVar6 = H5.c.INVALID_PAYLOD;
                            } else if (i22 == 6) {
                                cVar6 = H5.c.SERVER_ERROR;
                            } else {
                                D5.foxtrot("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i22));
                            }
                        }
                        cVar4 = cVar5;
                        cVar3 = cVar6;
                        long j72 = cursor3.getLong(2);
                        if (hashMap.containsKey(string4)) {
                        }
                        ((List) hashMap.get(string4)).add(new H5.d(j72, cVar3));
                        cVar5 = cVar4;
                        i5 = 5;
                        i10 = 4;
                        i11 = 3;
                        i13 = 0;
                    } else {
                        Iterator it = hashMap.entrySet().iterator();
                        while (true) {
                            J2.i iVar2 = (J2.i) obj2;
                            if (it.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it.next();
                                int i23 = H5.e.charlie;
                                new ArrayList();
                                ((ArrayList) iVar2.purple).add(new H5.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                            } else {
                                long time = hVar4.purple.getTime();
                                SQLiteDatabase charlie = hVar4.charlie();
                                charlie.beginTransaction();
                                try {
                                    Cursor rawQuery = charlie.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                    try {
                                        rawQuery.moveToNext();
                                        H5.g gVar = new H5.g(rawQuery.getLong(0), time);
                                        rawQuery.close();
                                        charlie.setTransactionSuccessful();
                                        charlie.endTransaction();
                                        iVar2.alpha = gVar;
                                        iVar2.red = new H5.b(new H5.f(hVar4.charlie().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar4.charlie().compileStatement("PRAGMA page_count").simpleQueryForLong(), L5.a.foxtrot.alpha));
                                        iVar2.silver = (String) hVar4.teal.get();
                                        return new H5.a((H5.g) iVar2.alpha, Collections.unmodifiableList((ArrayList) iVar2.purple), (H5.b) iVar2.red, (String) iVar2.silver);
                                    } catch (Throwable th3) {
                                        rawQuery.close();
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    charlie.endTransaction();
                                    throw th4;
                                }
                            }
                        }
                    }
                }
        }
    }
}
