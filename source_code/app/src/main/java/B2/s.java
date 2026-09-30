package B2;

import B9.E;
import R7.az;
import Yb.C0320n0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.i1;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.network.api.CtApi;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.encoders.EncodingException;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.ui.envelop.EnvelopsListingActivity;
import delivery.samurai.android.ui.envelopV2.EnvelopsListingActivityV2;
import delivery.samurai.android.ui.orders.OrderHistoryFragment;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import delivery.samurai.android.ui.support.SupportFragment;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsFragment;
import delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsFragment;
import delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsViewModel;
import delivery.samurai.android.ui.transfer.TransferCardListActivity;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryFragment;
import i8.InterfaceC1903a;
import i8.InterfaceC1904b;
import id.C1915c;
import j8.InterfaceC1947d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.Thread;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal._UtilJvmKt;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import okhttp3.sse.EventSources;
import s1.InterfaceC2587u;
import s1.a0;
import s2.InterfaceC2593a;
import s2.InterfaceC2594b;
import s6.D5;
import s6.V4;
import yf.N;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements InterfaceC2593a, G6.g, v2.j, InterfaceC2587u, I7.e, B5.e, com.google.android.material.navigation.f, M5.a, InterfaceC1903a, G6.c, G6.e, EventListener.Factory, EventSource.Factory {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ s(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // s2.InterfaceC2593a
    public InterfaceC2594b alpha(Fe.u uVar) {
        Context context = (Context) this.purple;
        B0.a callback = (B0.a) uVar.echo;
        Intrinsics.echo(callback, "callback");
        String str = (String) uVar.delta;
        if (str != null && str.length() != 0) {
            return new androidx.sqlite.db.framework.g(context, str, callback, true, true);
        }
        throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
    }

    @Override // B5.e, L5.f, be.InterfaceC0755a
    public Object apply(Object obj) {
        J8.an anVar = (J8.an) obj;
        ((J8.l) this.purple).getClass();
        String amber = J8.ao.bravo.amber(anVar);
        Intrinsics.delta(amber, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        anVar.getClass();
        Log.d("EventGDTLogger", "Session Event Type: SESSION_START");
        byte[] bytes = amber.getBytes(kotlin.text.a.alpha);
        Intrinsics.delta(bytes, "getBytes(...)");
        return bytes;
    }

    public C5.b bravo(C1915c c1915c) {
        InputStream inputStream;
        C5.c cVar = (C5.c) this.purple;
        String india = D5.india("CctTransportBackend");
        boolean isLoggable = Log.isLoggable(india, 4);
        URL url = (URL) c1915c.purple;
        if (isLoggable) {
            Log.i(india, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.golf);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(CtApi.HEADER_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) c1915c.silver;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    com.google.android.material.internal.s sVar = cVar.alpha;
                    D5.m mVar = (D5.m) c1915c.red;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    d8.d dVar = (d8.d) sVar.purple;
                    d8.e eVar = new d8.e(bufferedWriter, dVar.alpha, dVar.purple, dVar.red, dVar.silver);
                    eVar.hotel(mVar);
                    eVar.juliet();
                    eVar.bravo.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String india2 = D5.india("CctTransportBackend");
                    if (Log.isLoggable(india2, 4)) {
                        Log.i(india2, String.format("Status Code: %d", valueOf));
                    }
                    D5.foxtrot("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(CtApi.HEADER_CONTENT_TYPE));
                    D5.foxtrot("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new C5.b(responseCode, null, 0L);
                        }
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        try {
                            if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                inputStream = new GZIPInputStream(inputStream2);
                            } else {
                                inputStream = inputStream2;
                            }
                            try {
                                C5.b bVar = new C5.b(responseCode, null, D5.v.alpha(new BufferedReader(new InputStreamReader(inputStream))).alpha);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                return bVar;
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        return new C5.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                } finally {
                }
            } finally {
            }
        } catch (EncodingException e) {
            e = e;
            D5.golf("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C5.b(HttpConstants.HTTP_BAD_REQUEST, null, 0L);
        } catch (ConnectException e4) {
            e = e4;
            D5.golf("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C5.b(HttpConstants.HTTP_INTERNAL_ERROR, null, 0L);
        } catch (UnknownHostException e5) {
            e = e5;
            D5.golf("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C5.b(HttpConstants.HTTP_INTERNAL_ERROR, null, 0L);
        } catch (IOException e10) {
            e = e10;
            D5.golf("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C5.b(HttpConstants.HTTP_BAD_REQUEST, null, 0L);
        }
    }

    public void charlie() {
        Xd.l lVar = (Xd.l) this.purple;
        synchronized (S.n.charlie) {
            S.n.hotel = CollectionsKt.teal(S.n.hotel, lVar);
        }
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return _UtilJvmKt.bravo((EventListener) this.purple, call);
    }

    @Override // i8.InterfaceC1903a
    public void delta(InterfaceC1904b interfaceC1904b) {
        switch (this.alpha) {
            case 15:
                L7.a aVar = (L7.a) this.purple;
                aVar.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                aVar.bravo.set((L7.a) interfaceC1904b.get());
                return;
            default:
                com.google.firebase.messaging.o oVar = ((E8.j) ((H8.a) interfaceC1904b.get())).bravo("firebase").kilo;
                Set set = (Set) oVar.delta;
                L7.b bVar = (L7.b) this.purple;
                set.add(bVar);
                Task bravo = ((F8.e) oVar.alpha).bravo();
                bravo.echo((Executor) oVar.charlie, new A2.p(oVar, bravo, bVar, 4));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [J2.i, java.lang.Object] */
    @Override // M5.a
    public Object execute() {
        SQLiteDatabase charlie;
        Object obj = this.purple;
        switch (this.alpha) {
            case 10:
                L5.h hVar = (L5.h) ((L5.c) obj);
                hVar.getClass();
                int i4 = H5.a.echo;
                ?? obj2 = new Object();
                obj2.alpha = null;
                obj2.purple = new ArrayList();
                obj2.red = null;
                obj2.silver = "";
                HashMap hashMap = new HashMap();
                charlie = hVar.charlie();
                charlie.beginTransaction();
                try {
                    H5.a aVar = (H5.a) L5.h.uniform(charlie.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new A2.p(hVar, hashMap, obj2, 8));
                    charlie.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 11:
                L5.h hVar2 = (L5.h) ((L5.d) obj);
                long time = hVar2.purple.getTime() - hVar2.silver.delta;
                charlie = hVar2.charlie();
                charlie.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(time)};
                    Cursor rawQuery = charlie.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar2.juliet(rawQuery.getInt(0), H5.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = charlie.delete("events", "timestamp_ms < ?", strArr);
                    charlie.setTransactionSuccessful();
                    charlie.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 12:
                L5.h hVar3 = (L5.h) ((K5.i) obj).india;
                charlie = hVar3.charlie();
                charlie.beginTransaction();
                try {
                    charlie.compileStatement("DELETE FROM log_event_dropped").execute();
                    charlie.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.purple.getTime()).execute();
                    charlie.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                K5.k kVar = (K5.k) obj;
                Iterator it = ((Iterable) ((L5.h) kVar.bravo).foxtrot(new A8.a(24))).iterator();
                while (it.hasNext()) {
                    kVar.charlie.alpha((E5.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // s1.InterfaceC2587u
    public a0 gold(View view, a0 a0Var) {
        int i4 = 6;
        Object obj = this.purple;
        switch (this.alpha) {
            case 6:
                int i5 = ZenDeskChatActivity.f12498T;
                Intrinsics.echo(view, "<unused var>");
                if (a0Var.alpha.quebec(8)) {
                    ZenDeskChatActivity zenDeskChatActivity = (ZenDeskChatActivity) obj;
                    ad gray = zenDeskChatActivity.gray();
                    ((RecyclerView) gray.echo).post(new A2.q(i4, zenDeskChatActivity));
                }
                return a0Var;
            default:
                Intrinsics.echo(view, "<unused var>");
                if (a0Var.alpha.quebec(8)) {
                    TicketDetailsFragment ticketDetailsFragment = (TicketDetailsFragment) obj;
                    E quebec = ticketDetailsFragment.quebec();
                    quebec.f112m.post(new Nc.b(ticketDetailsFragment, i4));
                }
                return a0Var;
        }
    }

    @Override // G6.c
    public Object ivory(Task task) {
        boolean z2;
        switch (this.alpha) {
            case 18:
                ((i1) this.purple).getClass();
                if (task.juliet()) {
                    O7.a aVar = (O7.a) task.hotel();
                    L7.c cVar = L7.c.alpha;
                    cVar.charlie("Crashlytics report successfully enqueued to DataTransport: " + aVar.bravo);
                    File file = aVar.charlie;
                    if (file.delete()) {
                        cVar.charlie("Deleted report file: " + file.getPath());
                    } else {
                        cVar.golf("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                    z2 = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.golf());
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 19:
                return (Task) ((O7.k) this.purple).call();
            default:
                ((Runnable) this.purple).run();
                return V4.echo(null);
        }
    }

    @Override // okhttp3.sse.EventSource.Factory
    public EventSource newEventSource(Request request, EventSourceListener eventSourceListener) {
        return EventSources.alpha((OkHttpClient) this.purple, request, eventSourceListener);
    }

    @Override // G6.e
    public void onComplete(Task task) {
        Location location;
        Object obj = this.purple;
        switch (this.alpha) {
            case 21:
                Intrinsics.echo(task, "task");
                if (task.juliet()) {
                    String str = (String) task.hotel();
                    Log.d("FCM", "Token available on app launch");
                    CleverTapAPI defaultInstance = CleverTapAPI.getDefaultInstance(((AndroidApp) obj).getApplicationContext());
                    if (defaultInstance != null) {
                        defaultInstance.pushFcmRegistrationId(str, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                int i4 = ProcessOrderActivityV2.f12378N0;
                Intrinsics.echo(task, "fixTask");
                if (task.juliet()) {
                    location = (Location) task.hotel();
                } else {
                    location = null;
                }
                ((C0320n0) obj).invoke(location);
                return;
        }
    }

    @Override // v2.j
    public void onRefresh() {
        Object obj = this.purple;
        switch (this.alpha) {
            case 3:
                int i4 = EnvelopsListingActivity.f12251M;
                ((EnvelopsListingActivity) obj).gold();
                return;
            case 4:
                EnvelopsListingActivityV2 envelopsListingActivityV2 = (EnvelopsListingActivityV2) obj;
                envelopsListingActivityV2.f12266N = true;
                envelopsListingActivityV2.f12265M = false;
                envelopsListingActivityV2.gold(envelopsListingActivityV2.f12267O);
                return;
            case 5:
                ((SupportFragment) obj).quebec();
                return;
            case 22:
                OrderHistoryFragment orderHistoryFragment = (OrderHistoryFragment) obj;
                orderHistoryFragment.f12342j = 0;
                orderHistoryFragment.quebec();
                return;
            case 23:
                TicketsFragment ticketsFragment = (TicketsFragment) obj;
                int i5 = ticketsFragment.f12520i;
                if (i5 != 0) {
                    if (i5 != 1) {
                        ticketsFragment.quebec();
                        return;
                    }
                    TicketsViewModel romeo = ticketsFragment.romeo();
                    Qc.k kVar = new Qc.k();
                    N n5 = romeo.delta;
                    n5.getClass();
                    n5.juliet(null, kVar);
                    romeo.bravo();
                    return;
                }
                TicketsViewModel romeo2 = ticketsFragment.romeo();
                Qc.k kVar2 = new Qc.k();
                N n10 = romeo2.bravo;
                n10.getClass();
                n10.juliet(null, kVar2);
                romeo2.alpha();
                return;
            case 26:
                TransferCardListActivity transferCardListActivity = (TransferCardListActivity) obj;
                transferCardListActivity.f12531J = 0;
                transferCardListActivity.gold();
                return;
            default:
                WithDrawHistoryFragment withDrawHistoryFragment = (WithDrawHistoryFragment) obj;
                withDrawHistoryFragment.f12543h = 0;
                withDrawHistoryFragment.quebec();
                return;
        }
    }

    @Override // G6.g
    public Task then(Object obj) {
        return V4.echo((F8.i) this.purple);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:73|74|(2:77|75)|78|79|(1:81)(1:159)|(1:83)|84|(5:146|(1:148)|149|48d|154)(1:88)|89|(18:93|(1:95)(2:142|(1:144))|(3:97|(1:99)|100)(2:138|(2:140|141))|101|102|103|104|105|106|107|(8:129|130|(1:132)|133|120|121|(2:123|(1:125))|126)|116|(1:118)|119|120|121|(0)|126)|145|(0)(0)|101|102|103|104|105|106|107|(2:109|111)|129|130|(0)|133|120|121|(0)|126) */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x063d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0657, code lost:
    
        android.util.Log.e(r3, "Crashlytics was not started due to an exception during initialization", r0);
        r12.golf = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04de  */
    /* JADX WARN: Type inference failed for: r2v23, types: [D5.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [U7.c, java.lang.Object] */
    @Override // I7.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object create(I7.c cVar) {
        P7.f fVar;
        long j5;
        String str;
        P7.f fVar2;
        O7.x xVar;
        int i4;
        Throwable th;
        String str2;
        K7.b bVar;
        long currentTimeMillis;
        String num;
        String str3;
        String str4;
        ad adVar;
        String str5;
        String delta;
        U8.a aVar;
        O7.l lVar;
        O7.l lVar2;
        Af.t tVar;
        String amber;
        String replaceAll;
        String replaceAll2;
        String[] strArr;
        ArrayList arrayList;
        int i5;
        G6.q qVar;
        G6.q november;
        boolean z2;
        ad adVar2;
        boolean exists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        W7.b charlie;
        long longVersionCode;
        String replaceAll3;
        switch (this.alpha) {
            case 7:
                return this.purple;
            default:
                int i10 = CrashlyticsRegistrar.delta;
                CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.purple;
                crashlyticsRegistrar.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                B9.ab abVar = (B9.ab) cVar;
                B7.g gVar = (B7.g) abVar.charlie(B7.g.class);
                InterfaceC1947d interfaceC1947d = (InterfaceC1947d) abVar.charlie(InterfaceC1947d.class);
                I7.n black = abVar.black(L7.a.class);
                I7.n black2 = abVar.black(F7.b.class);
                I7.n black3 = abVar.black(H8.a.class);
                ExecutorService executorService = (ExecutorService) abVar.oscar(crashlyticsRegistrar.alpha);
                ExecutorService executorService2 = (ExecutorService) abVar.oscar(crashlyticsRegistrar.bravo);
                ExecutorService executorService3 = (ExecutorService) abVar.oscar(crashlyticsRegistrar.charlie);
                gVar.alpha();
                Context context = gVar.alpha;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 19.4.4 for " + packageName, null);
                P7.f fVar3 = new P7.f(executorService, executorService2);
                ?? obj = new Object();
                String str6 = ((az) L7.c.bravo.echo(context)).alpha;
                obj.alpha = str6;
                File filesDir = context.getFilesDir();
                obj.purple = filesDir;
                if (!str6.isEmpty()) {
                    fVar = fVar3;
                    j5 = currentTimeMillis2;
                    StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
                    sb2.append(File.separator);
                    if (str6.length() > 40) {
                        replaceAll3 = O7.f.hotel(str6);
                    } else {
                        replaceAll3 = str6.replaceAll("[^a-zA-Z0-9.]", "_");
                    }
                    sb2.append(replaceAll3);
                    str = sb2.toString();
                } else {
                    fVar = fVar3;
                    j5 = currentTimeMillis2;
                    str = ".com.google.firebase.crashlytics.files.v1";
                }
                File file = new File(filesDir, str);
                U7.c.foxtrot(file);
                obj.red = file;
                File file2 = new File(file, "open-sessions");
                U7.c.foxtrot(file2);
                obj.silver = file2;
                File file3 = new File(file, "reports");
                U7.c.foxtrot(file3);
                obj.teal = file3;
                File file4 = new File(file, "priority-reports");
                U7.c.foxtrot(file4);
                obj.white = file4;
                File file5 = new File(file, "native-reports");
                U7.c.foxtrot(file5);
                obj.yellow = file5;
                O7.u uVar = new O7.u(gVar);
                O7.x xVar2 = new O7.x(context, packageName, interfaceC1947d, uVar);
                L7.a aVar2 = new L7.a(black);
                K1.f fVar4 = new K1.f(black2);
                O7.i iVar = new O7.i(uVar, obj);
                K8.c cVar2 = K8.c.alpha;
                K8.d dVar = K8.d.alpha;
                K8.c cVar3 = K8.c.alpha;
                K8.a alpha = K8.c.alpha(dVar);
                if (alpha.bravo != null) {
                    Log.d("SessionsDependencies", "Subscriber " + dVar + " already registered.");
                } else {
                    alpha.bravo = iVar;
                    Log.d("SessionsDependencies", "Subscriber " + dVar + " registered.");
                    alpha.alpha.foxtrot(null);
                }
                O7.r rVar = new O7.r(gVar, xVar2, aVar2, uVar, new K7.a(fVar4), new K7.a(fVar4), obj, iVar, new Aa.m(26, black3), fVar);
                P7.f fVar5 = fVar;
                P7.f fVar6 = rVar.oscar;
                gVar.alpha();
                String str7 = gVar.charlie.bravo;
                int delta2 = O7.f.delta(context, "com.google.firebase.crashlytics.mapping_file_id", CTVariableUtils.STRING);
                if (delta2 == 0) {
                    delta2 = O7.f.delta(context, "com.crashlytics.android.build_id", CTVariableUtils.STRING);
                }
                String string = delta2 != 0 ? context.getResources().getString(delta2) : null;
                ArrayList arrayList2 = new ArrayList();
                int delta3 = O7.f.delta(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int delta4 = O7.f.delta(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int delta5 = O7.f.delta(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (delta3 != 0 && delta4 != 0 && delta5 != 0) {
                    String[] stringArray = context.getResources().getStringArray(delta3);
                    String[] stringArray2 = context.getResources().getStringArray(delta4);
                    String[] stringArray3 = context.getResources().getStringArray(delta5);
                    xVar = xVar2;
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i11 = 0;
                        while (i11 < stringArray3.length) {
                            int i12 = i11;
                            arrayList2.add(new O7.c(stringArray[i12], stringArray2[i12], stringArray3[i12]));
                            i11 = i12 + 1;
                            fVar6 = fVar6;
                        }
                        fVar2 = fVar6;
                    } else {
                        fVar2 = fVar6;
                        String format = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format, null);
                        }
                    }
                    th = null;
                    i4 = 3;
                } else {
                    fVar2 = fVar6;
                    xVar = xVar2;
                    i4 = 3;
                    String format2 = String.format("Could not find resources: %d %d %d", Integer.valueOf(delta3), Integer.valueOf(delta4), Integer.valueOf(delta5));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        th = null;
                        Log.d("FirebaseCrashlytics", format2, null);
                    } else {
                        th = null;
                    }
                }
                String echo = av.q.echo("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i4)) {
                    Log.d("FirebaseCrashlytics", echo, th);
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    O7.c cVar4 = (O7.c) it.next();
                    StringBuilder victor = Q0.c.victor("Build id for ", cVar4.alpha, " on ");
                    victor.append(cVar4.bravo);
                    victor.append(": ");
                    victor.append(cVar4.charlie);
                    String sb3 = victor.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb3, null);
                    }
                }
                J2.l lVar3 = new J2.l(context);
                try {
                    String packageName2 = context.getPackageName();
                    String delta6 = xVar.delta();
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
                    if (Build.VERSION.SDK_INT >= 28) {
                        longVersionCode = packageInfo.getLongVersionCode();
                        num = Long.toString(longVersionCode);
                    } else {
                        num = Integer.toString(packageInfo.versionCode);
                    }
                    str3 = num;
                    String str8 = packageInfo.versionName;
                    if (str8 == null) {
                        str8 = "0.0";
                    }
                    str4 = str8;
                    adVar = new ad(str7, string, arrayList2, delta6, packageName2, str3, str4, lVar3);
                    str5 = str7;
                    String echo2 = av.q.echo("Installer package name is: ", delta6);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", echo2, null);
                    }
                    U8.a aVar3 = new U8.a(9);
                    delta = xVar.delta();
                    aVar = new U8.a(7);
                    lVar = new O7.l(12, aVar);
                    lVar2 = new O7.l((U7.c) obj);
                    Locale locale = Locale.US;
                    tVar = new Af.t(ao.ad.gray("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str5, "/settings"), aVar3);
                    String str9 = Build.MANUFACTURER;
                    String str10 = O7.x.hotel;
                    amber = ao.ad.amber(str9.replaceAll(str10, ""), "/", Build.MODEL.replaceAll(str10, ""));
                    replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str10, "");
                    replaceAll2 = Build.VERSION.RELEASE.replaceAll(str10, "");
                    int delta7 = O7.f.delta(context, "com.google.firebase.crashlytics.mapping_file_id", CTVariableUtils.STRING);
                    if (delta7 == 0) {
                        delta7 = O7.f.delta(context, "com.crashlytics.android.build_id", CTVariableUtils.STRING);
                    }
                    strArr = new String[]{delta7 != 0 ? context.getResources().getString(delta7) : null, str5, str4, str3};
                    arrayList = new ArrayList();
                    i5 = 0;
                } catch (PackageManager.NameNotFoundException e) {
                    str2 = "FirebaseCrashlytics";
                    Log.e(str2, "Error retrieving app package info.", e);
                    bVar = null;
                }
                while (true) {
                    String str11 = str5;
                    if (i5 >= 4) {
                        Collections.sort(arrayList);
                        StringBuilder sb4 = new StringBuilder();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            sb4.append((String) it2.next());
                        }
                        String sb5 = sb4.toString();
                        W7.d dVar2 = new W7.d(str11, amber, replaceAll, replaceAll2, xVar, sb5.length() > 0 ? O7.f.hotel(sb5) : null, str4, str3, A0.z.charlie(delta == null ? 1 : 4));
                        ?? obj2 = new Object();
                        AtomicReference atomicReference = new AtomicReference();
                        obj2.hotel = atomicReference;
                        obj2.india = new AtomicReference(new G6.h());
                        obj2.alpha = context;
                        obj2.bravo = dVar2;
                        obj2.delta = aVar;
                        obj2.charlie = lVar;
                        obj2.echo = lVar2;
                        obj2.foxtrot = tVar;
                        obj2.golf = uVar;
                        atomicReference.set(g8.d.november(aVar));
                        boolean equals = ((Context) obj2.alpha).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((W7.d) obj2.bravo).foxtrot);
                        AtomicReference atomicReference2 = (AtomicReference) obj2.india;
                        AtomicReference atomicReference3 = (AtomicReference) obj2.hotel;
                        if (equals && (charlie = obj2.charlie(1)) != null) {
                            atomicReference3.set(charlie);
                            ((G6.h) atomicReference2.get()).delta(charlie);
                            november = V4.echo(null);
                        } else {
                            W7.b charlie2 = obj2.charlie(3);
                            if (charlie2 != null) {
                                atomicReference3.set(charlie2);
                                ((G6.h) atomicReference2.get()).delta(charlie2);
                            }
                            O7.u uVar2 = (O7.u) obj2.golf;
                            G6.q qVar2 = ((G6.h) uVar2.echo).alpha;
                            synchronized (uVar2.charlie) {
                                qVar = ((G6.h) uVar2.delta).alpha;
                            }
                            november = P7.a.alpha(qVar2, qVar).november(fVar5.alpha, new J2.l((Object) obj2, (Object) fVar5, false));
                        }
                        november.delta(executorService3, new A8.a(23));
                        U7.c cVar5 = rVar.india;
                        Context context2 = rVar.alpha;
                        if (context2 != null && (resources = context2.getResources()) != null) {
                            int delta8 = O7.f.delta(context2, "com.crashlytics.RequireBuildId", "bool");
                            if (delta8 > 0) {
                                z2 = resources.getBoolean(delta8);
                            } else {
                                int delta9 = O7.f.delta(context2, "com.crashlytics.RequireBuildId", CTVariableUtils.STRING);
                                if (delta9 > 0) {
                                    z2 = Boolean.parseBoolean(context2.getString(delta9));
                                }
                            }
                            if (z2) {
                                str2 = "FirebaseCrashlytics";
                                if (Log.isLoggable(str2, 2)) {
                                    Log.v(str2, "Configured not to require a build ID.", null);
                                }
                                adVar2 = adVar;
                            } else {
                                str2 = "FirebaseCrashlytics";
                                adVar2 = adVar;
                                if (TextUtils.isEmpty((String) adVar2.bravo)) {
                                    Log.e(str2, ".");
                                    Log.e(str2, ".     |  | ");
                                    Log.e(str2, ".     |  |");
                                    Log.e(str2, ".     |  |");
                                    Log.e(str2, ".   \\ |  | /");
                                    Log.e(str2, ".    \\    /");
                                    Log.e(str2, ".     \\  /");
                                    Log.e(str2, ".      \\/");
                                    Log.e(str2, ".");
                                    Log.e(str2, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                    Log.e(str2, ".");
                                    Log.e(str2, ".      /\\");
                                    Log.e(str2, ".     /  \\");
                                    Log.e(str2, ".    /    \\");
                                    Log.e(str2, ".   / |  | \\");
                                    Log.e(str2, ".     |  |");
                                    Log.e(str2, ".     |  |");
                                    Log.e(str2, ".     |  |");
                                    Log.e(str2, ".");
                                    throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                }
                            }
                            String str12 = new O7.d().alpha;
                            int i13 = 13;
                            rVar.foxtrot = new J2.e(i13, "crash_marker", cVar5);
                            rVar.echo = new J2.e(i13, "initialization_marker", cVar5);
                            P7.f fVar7 = fVar2;
                            U7.c cVar6 = new U7.c(str12, cVar5, fVar7);
                            Q7.f fVar8 = new Q7.f(cVar5);
                            J2.e eVar = new J2.e(new X7.a[]{new g8.d(12)});
                            Aa.m mVar = rVar.november;
                            mVar.getClass();
                            ((I7.n) mVar.purple).alpha(new s(16, new L7.b(cVar6)));
                            ad adVar3 = adVar2;
                            rVar.golf = new O7.n(rVar.alpha, rVar.hotel, rVar.bravo, rVar.india, rVar.foxtrot, adVar3, cVar6, fVar8, i1.delta(rVar.alpha, rVar.hotel, rVar.india, adVar3, fVar8, cVar6, eVar, obj2, rVar.charlie, rVar.lima, rVar.oscar), rVar.mike, rVar.kilo, rVar.lima, rVar.oscar);
                            J2.e eVar2 = rVar.echo;
                            String str13 = (String) eVar2.purple;
                            U7.c cVar7 = (U7.c) eVar2.red;
                            cVar7.getClass();
                            exists = new File((File) cVar7.red, str13).exists();
                            Boolean.TRUE.equals((Boolean) fVar7.alpha.alpha.submit(new E8.g(3, rVar)).get(3L, TimeUnit.SECONDS));
                            O7.n nVar = rVar.golf;
                            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                            nVar.echo.alpha.alpha(new A8.g(13, nVar, str12));
                            O7.t tVar2 = new O7.t(new D8.c(29, nVar), obj2, defaultUncaughtExceptionHandler, nVar.juliet);
                            nVar.november = tVar2;
                            Thread.setDefaultUncaughtExceptionHandler(tVar2);
                            if (exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                                if (Log.isLoggable(str2, 3)) {
                                    Log.d(str2, "Successfully configured exception handler.", null);
                                }
                                fVar7.alpha.alpha(new O7.o(rVar, obj2, 0));
                                bVar = new K7.b(rVar);
                                currentTimeMillis = System.currentTimeMillis() - j5;
                                if (currentTimeMillis > 16) {
                                    String kilo = com.google.android.material.datepicker.j.kilo("Initializing Crashlytics blocked main for ", currentTimeMillis, " ms");
                                    if (Log.isLoggable(str2, 3)) {
                                        Log.d(str2, kilo, null);
                                    }
                                }
                                return bVar;
                            }
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            rVar.bravo(obj2);
                            bVar = new K7.b(rVar);
                            currentTimeMillis = System.currentTimeMillis() - j5;
                            if (currentTimeMillis > 16) {
                            }
                            return bVar;
                        }
                        z2 = true;
                        if (z2) {
                        }
                        String str122 = new O7.d().alpha;
                        int i132 = 13;
                        rVar.foxtrot = new J2.e(i132, "crash_marker", cVar5);
                        rVar.echo = new J2.e(i132, "initialization_marker", cVar5);
                        P7.f fVar72 = fVar2;
                        U7.c cVar62 = new U7.c(str122, cVar5, fVar72);
                        Q7.f fVar82 = new Q7.f(cVar5);
                        J2.e eVar3 = new J2.e(new X7.a[]{new g8.d(12)});
                        Aa.m mVar2 = rVar.november;
                        mVar2.getClass();
                        ((I7.n) mVar2.purple).alpha(new s(16, new L7.b(cVar62)));
                        ad adVar32 = adVar2;
                        rVar.golf = new O7.n(rVar.alpha, rVar.hotel, rVar.bravo, rVar.india, rVar.foxtrot, adVar32, cVar62, fVar82, i1.delta(rVar.alpha, rVar.hotel, rVar.india, adVar32, fVar82, cVar62, eVar3, obj2, rVar.charlie, rVar.lima, rVar.oscar), rVar.mike, rVar.kilo, rVar.lima, rVar.oscar);
                        J2.e eVar22 = rVar.echo;
                        String str132 = (String) eVar22.purple;
                        U7.c cVar72 = (U7.c) eVar22.red;
                        cVar72.getClass();
                        exists = new File((File) cVar72.red, str132).exists();
                        Boolean.TRUE.equals((Boolean) fVar72.alpha.alpha.submit(new E8.g(3, rVar)).get(3L, TimeUnit.SECONDS));
                        O7.n nVar2 = rVar.golf;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                        nVar2.echo.alpha.alpha(new A8.g(13, nVar2, str122));
                        O7.t tVar22 = new O7.t(new D8.c(29, nVar2), obj2, defaultUncaughtExceptionHandler2, nVar2.juliet);
                        nVar2.november = tVar22;
                        Thread.setDefaultUncaughtExceptionHandler(tVar22);
                        if (exists) {
                        }
                        if (Log.isLoggable(str2, 3)) {
                        }
                        fVar72.alpha.alpha(new O7.o(rVar, obj2, 0));
                        bVar = new K7.b(rVar);
                        currentTimeMillis = System.currentTimeMillis() - j5;
                        if (currentTimeMillis > 16) {
                        }
                        return bVar;
                    }
                    String str14 = strArr[i5];
                    String[] strArr2 = strArr;
                    if (str14 != null) {
                        arrayList.add(str14.replace("-", "").toLowerCase(Locale.US));
                    }
                    i5++;
                    strArr = strArr2;
                    str5 = str11;
                }
                break;
        }
    }
}
