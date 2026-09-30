package A2;

import B9.C0058p;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.activity.result.ActivityResult;
import androidx.camera.core.C0502i;
import androidx.camera.core.J;
import androidx.camera.core.L;
import androidx.camera.core.M;
import androidx.camera.core.RunnableC0534p;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.camera.core.impl.aq;
import androidx.camera.core.impl.ar;
import androidx.lifecycle.az;
import av.aw;
import bb.C0745c;
import bd.ExecutorC0748a;
import be.C0758d;
import be.InterfaceC0755a;
import be.RunnableC0756b;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabExecutor;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.InAppActionHandler;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.task.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.incognia.internal.L8H;
import com.incognia.internal.PIe;
import com.incognia.internal.y6;
import delivery.samurai.android.ui.splash.AuthViewModel;
import e6.C1629a;
import i8.InterfaceC1903a;
import i8.InterfaceC1904b;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import s6.V4;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final /* synthetic */ class ao implements V0.i, I7.e, G6.g, G6.c, G6.e, InterfaceC1903a, M5.a, L5.f, aq, InterfaceC0755a, L, ah.a, OnSuccessListener, InAppActionHandler.PushPermissionPromptPresenter, y6 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ ao(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    private final Object echo(Task task) {
        F8.j jVar = (F8.j) this.purple;
        Date date = (Date) this.red;
        jVar.getClass();
        if (task.juliet()) {
            F8.o oVar = jVar.golf;
            synchronized (oVar.bravo) {
                oVar.alpha.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return task;
        }
        Exception golf = task.golf();
        if (golf == null) {
            return task;
        }
        if (golf instanceof FirebaseRemoteConfigFetchThrottledException) {
            jVar.golf.hotel();
            return task;
        }
        jVar.golf.golf();
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:32:0x0039, B:36:0x003e, B:37:0x003f, B:41:0x005a, B:43:0x00ce, B:45:0x00d2, B:62:0x00d6), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:32:0x0039, B:36:0x003e, B:37:0x003f, B:41:0x005a, B:43:0x00ce, B:45:0x00d2, B:62:0x00d6), top: B:2:0x0015 }] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v1, types: [G6.q] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v1, types: [F8.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object foxtrot(Task task) {
        InputStream inputStream;
        Integer num;
        Throwable th;
        ?? r11;
        boolean z2;
        boolean z10;
        int responseCode;
        boolean z11;
        ?? r12 = (G6.q) this.red;
        E8.c cVar = E8.c.purple;
        ?? r4 = (F8.m) this.purple;
        C1629a c1629a = r4.papa;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e) {
            e = e;
            r12 = 0;
            inputStream = null;
        } catch (Throwable th3) {
            inputStream = null;
            num = null;
            th = th3;
            r12 = 0;
        }
        if (r12.juliet()) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) r12.hotel();
            r4.foxtrot = httpURLConnection;
            r12 = httpURLConnection.getInputStream();
            try {
                inputStream = r4.foxtrot.getErrorStream();
            } catch (IOException e4) {
                e = e4;
                inputStream = null;
                r12 = r12;
                r11 = inputStream;
                if (!r4.echo) {
                }
                r4.bravo(r12, inputStream);
                r4.juliet(false);
                if (r4.echo) {
                }
                z10 = false;
                if (z10) {
                }
                if (!z10) {
                    String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", new Object[]{r11});
                    if (r11.intValue() == 403) {
                    }
                    new FirebaseRemoteConfigServerException(r11.intValue(), format, cVar);
                    r4.golf();
                    r4.foxtrot = null;
                    r4.golf = null;
                    return V4.echo(null);
                }
                r4.india();
                r4.foxtrot = null;
                r4.golf = null;
                return V4.echo(null);
            } catch (Throwable th4) {
                num = null;
                th = th4;
                inputStream = null;
            }
            try {
                responseCode = r4.foxtrot.getResponseCode();
                r11 = Integer.valueOf(responseCode);
                if (responseCode == 200) {
                    try {
                        synchronized (r4) {
                            r4.charlie = 8;
                        }
                        r4.quebec.foxtrot(F8.o.foxtrot, 0);
                        F8.c mike = r4.mike(r4.foxtrot);
                        r4.golf = mike;
                        mike.charlie();
                    } catch (IOException e5) {
                        e = e5;
                        if (!r4.echo) {
                            r4.hotel();
                        } else {
                            Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                        }
                        r4.bravo(r12, inputStream);
                        r4.juliet(false);
                        if (r4.echo && (r11 == 0 || F8.m.delta(r11.intValue()))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            c1629a.getClass();
                            r4.november(new Date(System.currentTimeMillis()));
                        }
                        if (!z10 && r11.intValue() != 200) {
                            String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", new Object[]{r11});
                            if (r11.intValue() == 403) {
                                format2 = F8.m.foxtrot(r4.foxtrot.getErrorStream());
                            }
                            new FirebaseRemoteConfigServerException(r11.intValue(), format2, cVar);
                            r4.golf();
                            r4.foxtrot = null;
                            r4.golf = null;
                            return V4.echo(null);
                        }
                        r4.india();
                        r4.foxtrot = null;
                        r4.golf = null;
                        return V4.echo(null);
                    }
                }
                r4.bravo(r12, inputStream);
                r4.juliet(false);
                if (!r4.echo && F8.m.delta(responseCode)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    c1629a.getClass();
                    r4.november(new Date(System.currentTimeMillis()));
                }
            } catch (IOException e10) {
                e = e10;
                r11 = 0;
            } catch (Throwable th5) {
                num = null;
                th = th5;
                r4.bravo(r12, inputStream);
                r4.juliet(false);
                if (!r4.echo && (num == null || F8.m.delta(num.intValue()))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    c1629a.getClass();
                    r4.november(new Date(System.currentTimeMillis()));
                }
                if (!z2 && num.intValue() != 200) {
                    String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                    if (num.intValue() == 403) {
                        format3 = F8.m.foxtrot(r4.foxtrot.getErrorStream());
                    }
                    new FirebaseRemoteConfigServerException(num.intValue(), format3, cVar);
                    r4.golf();
                } else {
                    r4.india();
                }
                throw th;
            }
            if (!z11 && responseCode != 200) {
                String format4 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", new Object[]{r11});
                if (responseCode == 403) {
                    format4 = F8.m.foxtrot(r4.foxtrot.getErrorStream());
                }
                new FirebaseRemoteConfigServerException(responseCode, format4, cVar);
                r4.golf();
                r4.foxtrot = null;
                r4.golf = null;
                return V4.echo(null);
            }
            r4.india();
            r4.foxtrot = null;
            r4.golf = null;
            return V4.echo(null);
        }
        throw new IOException(r12.golf());
    }

    @Override // androidx.camera.core.L
    public void alpha(C0502i c0502i) {
        bj.c cVar = (bj.c) this.purple;
        cVar.getClass();
        bl.f fVar = bl.f.purple;
        if (((M) this.red).charlie.alpha() && c0502i.delta) {
            fVar = bl.f.red;
        }
        bj.e eVar = cVar.alpha;
        bl.i.delta((AtomicBoolean) eVar.red, true);
        bl.i.charlie((Thread) eVar.teal);
        if (((bl.f) eVar.f3389f) != fVar) {
            eVar.f3389f = fVar;
            eVar.quebec(eVar.alpha);
        }
    }

    @Override // L5.f, be.InterfaceC0755a
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        L5.h hVar = (L5.h) this.purple;
        L5.a aVar = hVar.silver;
        int i4 = aVar.bravo;
        E5.i iVar = (E5.i) this.red;
        ArrayList golf = hVar.golf(sQLiteDatabase, iVar, i4);
        for (B5.d dVar : B5.d.values()) {
            if (dVar != iVar.charlie) {
                int size = aVar.bravo - golf.size();
                if (size <= 0) {
                    break;
                }
                golf.addAll(hVar.golf(sQLiteDatabase, iVar.bravo(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i5 = 0; i5 < golf.size(); i5++) {
            sb2.append(((L5.b) golf.get(i5)).alpha);
            if (i5 < golf.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j5 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j5));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j5), set);
                }
                set.add(new L5.g(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = golf.listIterator();
        while (listIterator.hasNext()) {
            L5.b bVar = (L5.b) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(bVar.alpha))) {
                C0058p charlie = bVar.charlie.charlie();
                long j6 = bVar.alpha;
                for (L5.g gVar : (Set) hashMap.get(Long.valueOf(j6))) {
                    charlie.bravo(gVar.alpha, gVar.bravo);
                }
                listIterator.set(new L5.b(j6, bVar.bravo, charlie.charlie()));
            }
        }
        return golf;
    }

    @Override // com.incognia.internal.y6
    public void b(boolean z2) {
        L8H.b((L8H) this.purple, (PIe) this.red, z2);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // V0.i
    public Object black(V0.h hVar) {
        switch (this.alpha) {
            case 0:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                hVar.alpha(new r(atomicBoolean, 1), m.alpha);
                ((Executor) this.purple).execute(new s(atomicBoolean, hVar, (Function0) this.red));
                return Unit.INSTANCE;
            case 12:
                androidx.camera.core.q qVar = (androidx.camera.core.q) this.purple;
                qVar.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Context context = (Context) this.red;
                Executor executor = qVar.delta;
                executor.execute(new RunnableC0534p(qVar, context, executor, 1, hVar, elapsedRealtime));
                return "CameraX initInternal";
            case 14:
                M m4 = (M) this.purple;
                m4.getClass();
                ((AtomicReference) this.red).set(hVar);
                return "SurfaceRequest-surface-recreation(" + m4.hashCode() + ")";
            case 19:
                bj.c cVar = (bj.c) this.purple;
                cVar.getClass();
                Map map = Collections.EMPTY_MAP;
                cVar.echo(new s(cVar, (androidx.camera.core.t) this.red, hVar), new K5.a(3));
                return "Init GlRenderer";
            case 21:
                bk.e eVar = (bk.e) this.purple;
                eVar.getClass();
                Map map2 = Collections.EMPTY_MAP;
                eVar.echo(new s(eVar, (androidx.camera.core.t) this.red, hVar), new K5.a(3));
                return "Init GlRenderer";
            case 22:
                bo.e this$0 = (bo.e) this.purple;
                androidx.camera.core.q qVar2 = (androidx.camera.core.q) this.red;
                Intrinsics.echo(this$0, "this$0");
                synchronized (this$0.alpha) {
                    C0758d alpha = C0758d.alpha(be.j.red);
                    a4.u uVar = new a4.u(11, new A0.p(26, qVar2));
                    ExecutorC0748a bravo = tg.k.bravo();
                    alpha.getClass();
                    RunnableC0756b foxtrot = be.h.foxtrot(alpha, uVar, bravo);
                    foxtrot.foxtrot(new be.g(0, foxtrot, new w.o(26, hVar, qVar2)), tg.k.bravo());
                }
                return "ProcessCameraProvider-initializeCameraX";
            default:
                bp.r rVar = (bp.r) this.purple;
                rVar.getClass();
                AbstractC3066u3.bravo("TextureViewImpl", "Surface set on Preview.");
                M m5 = rVar.hotel;
                ExecutorC0748a bravo2 = tg.k.bravo();
                C0745c c0745c = new C0745c(3, hVar);
                Surface surface = (Surface) this.red;
                m5.alpha(surface, bravo2, c0745c);
                return "provideSurface[request=" + rVar.hotel + " surface=" + surface + Constants.AES_SUFFIX;
        }
    }

    @Override // androidx.camera.core.impl.aq
    public void bravo(ar arVar) {
        switch (this.alpha) {
            case 13:
                S2.l lVar = (S2.l) this.purple;
                lVar.getClass();
                ((aq) this.red).bravo(lVar);
                return;
            default:
                androidx.core.widget.f fVar = (androidx.core.widget.f) this.purple;
                fVar.getClass();
                ((aq) this.red).bravo(fVar);
                return;
        }
    }

    @Override // ah.a
    public void charlie(Object obj) {
        RedirectCustomTabExecutor.alpha((RedirectCustomTabExecutor) this.purple, (Xd.l) this.red, (ActivityResult) obj);
    }

    @Override // I7.e
    public Object create(I7.c cVar) {
        String str;
        int i4;
        switch (this.alpha) {
            case 1:
                Context context = (Context) ((B9.ab) cVar).charlie(Context.class);
                switch (((A8.a) this.red).alpha) {
                    case 1:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            str = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        } else {
                            str = "";
                            break;
                        }
                    case 2:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                            i4 = applicationInfo2.minSdkVersion;
                            str = String.valueOf(i4);
                            break;
                        } else {
                            str = "";
                            break;
                        }
                        break;
                    case 3:
                        int i5 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            str = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            str = "watch";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            str = "auto";
                            break;
                        } else if (i5 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            str = "embedded";
                            break;
                        } else {
                            str = "";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            str = FirebaseCommonRegistrar.alpha(installerPackageName);
                            break;
                        } else {
                            str = "";
                            break;
                        }
                }
                return new D8.a((String) this.purple, str);
            default:
                String str2 = (String) this.purple;
                I7.b bVar = (I7.b) this.red;
                try {
                    Trace.beginSection(str2);
                    return bVar.foxtrot.create(cVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // i8.InterfaceC1903a
    public void delta(InterfaceC1904b interfaceC1904b) {
        ((InterfaceC1903a) this.purple).delta(interfaceC1904b);
        ((InterfaceC1903a) this.red).delta(interfaceC1904b);
    }

    @Override // M5.a
    public Object execute() {
        switch (this.alpha) {
            case 8:
                L5.h hVar = (L5.h) ((K5.i) this.purple).charlie;
                hVar.getClass();
                Iterable iterable = (Iterable) this.red;
                if (iterable.iterator().hasNext()) {
                    hVar.charlie().compileStatement("DELETE FROM events WHERE _id in " + L5.h.quebec(iterable)).execute();
                    return null;
                }
                return null;
            default:
                K5.i iVar = (K5.i) this.purple;
                iVar.getClass();
                Iterator it = ((HashMap) this.red).entrySet().iterator();
                while (it.hasNext()) {
                    ((L5.h) iVar.india).juliet(((Integer) r2.getValue()).intValue(), H5.c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                return null;
        }
    }

    @Override // G6.c
    public Object ivory(Task task) {
        switch (this.alpha) {
            case 3:
                echo(task);
                return task;
            case 4:
                return ((F8.j) this.purple).charlie(task, 0L, (HashMap) this.red);
            case 5:
                return foxtrot(task);
            default:
                com.google.firebase.messaging.i iVar = (com.google.firebase.messaging.i) this.purple;
                String str = (String) this.red;
                synchronized (iVar) {
                    ((bv.e) iVar.bravo).remove(str);
                }
                return task;
        }
    }

    @Override // G6.e
    public void onComplete(Task task) {
        switch (this.alpha) {
            case 6:
                AuthViewModel.alpha((az) this.purple, (AuthViewModel) this.red, task);
                return;
            default:
                ((com.google.firebase.messaging.g) this.purple).alpha((Intent) this.red);
                return;
        }
    }

    @Override // com.clevertap.android.sdk.task.OnSuccessListener
    public void onSuccess(Object obj) {
        InAppController.bravo((InAppController) this.purple, (CTInAppNotification) this.red, (Boolean) obj);
    }

    @Override // com.clevertap.android.sdk.inapp.InAppActionHandler.PushPermissionPromptPresenter
    public void showPrompt(Activity activity) {
        InAppController.echo((InAppController) this.purple, (JSONObject) this.red, activity);
    }

    @Override // G6.g
    public Task then(Object obj) {
        F8.e eVar = (F8.e) this.purple;
        F8.g gVar = (F8.g) this.red;
        synchronized (eVar) {
            eVar.charlie = V4.echo(gVar);
        }
        return V4.echo(gVar);
    }

    public /* synthetic */ ao(bj.c cVar, androidx.camera.core.t tVar) {
        this.alpha = 19;
        Map map = Collections.EMPTY_MAP;
        this.purple = cVar;
        this.red = tVar;
    }

    public /* synthetic */ ao(bk.e eVar, androidx.camera.core.t tVar) {
        this.alpha = 21;
        Map map = Collections.EMPTY_MAP;
        this.purple = eVar;
        this.red = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ao(Executor executor, Function0 function0) {
        this.alpha = 0;
        this.purple = executor;
        this.red = (Lambda) function0;
    }

    @Override // L5.f, be.InterfaceC0755a
    public com.google.common.util.concurrent.e apply(Object obj) {
        switch (this.alpha) {
            case 15:
                av.aj ajVar = (av.aj) this.purple;
                ajVar.alpha();
                ((J) this.red).alpha();
                return ajVar.november();
            default:
                List list = (List) obj;
                aw awVar = (aw) this.purple;
                awVar.getClass();
                AbstractC3066u3.bravo("SyncCaptureSessionBase", Constants.AES_PREFIX + awVar + "] getSurface done with results: " + list);
                if (list.isEmpty()) {
                    return new be.j(1, new IllegalArgumentException("Unable to open capture session without surfaces"));
                }
                if (list.contains(null)) {
                    return new be.j(1, new DeferrableSurface$SurfaceClosedException("Surface closed", (androidx.camera.core.impl.ah) ((ArrayList) this.red).get(list.indexOf(null))));
                }
                return be.h.charlie(list);
        }
    }
}
