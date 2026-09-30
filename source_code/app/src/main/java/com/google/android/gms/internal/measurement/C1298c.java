package com.google.android.gms.internal.measurement;

import B9.C0058p;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.InterfaceC0566c;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.RunnableC0643m;
import androidx.recyclerview.widget.C0665j;
import b8.InterfaceC0733c;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.messaging.FirebaseMessagingService;
import d8.C1592a;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import e8.C1638f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import q9.InterfaceC2431a;
import s6.AbstractC2763s0;
import s6.V4;
import t0.C2946x;
import t6.C2983e;
import t6.C2988f;

/* renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1298c implements com.google.android.gms.measurement.internal.as, InterfaceC0566c, u1.g, ActivityComponentBuilder {
    public static C1298c teal;
    public final /* synthetic */ int alpha;
    public Object purple;
    public Object red;
    public Object silver;

    public C1298c(com.google.android.gms.measurement.internal.Z0 z02, String str, ArrayList arrayList) {
        this.alpha = 2;
        this.purple = str;
        this.silver = arrayList;
        this.red = z02;
    }

    @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
    public ActivityComponentBuilder activity(Activity activity) {
        activity.getClass();
        this.silver = activity;
        return this;
    }

    @Override // u1.g
    public ClipDescription alpha() {
        return (ClipDescription) this.red;
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void bravo(int i4, Object obj) {
        ((s0.al) this.red).azure(i4, (s0.al) obj);
    }

    @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
    public ActivityComponent build() {
        AbstractC2763s0.bravo(Activity.class, (Activity) this.silver);
        return new w9.j((w9.p) this.purple, (w9.l) this.red);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void charlie(Object obj) {
        ((ArrayList) this.silver).add(this.red);
        this.red = obj;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.alpha) {
            case 0:
                C1298c c1298c = new C1298c(((C1293b) this.purple).clone());
                Iterator it = ((ArrayList) this.silver).iterator();
                while (it.hasNext()) {
                    ((ArrayList) c1298c.silver).add(((C1293b) it.next()).clone());
                }
                return c1298c;
            default:
                return super.clone();
        }
    }

    @Override // u1.g
    public Uri delta() {
        return (Uri) this.purple;
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void echo() {
        U.c cVar;
        s0.al alVar = (s0.al) this.red;
        if (!alVar.cyan()) {
            AbstractC2264a.alpha("onReuse is only expected on attached node");
        }
        T0.t tVar = alVar.f13288g;
        if (tVar != null) {
            View view = tVar.purple;
            if (view.getParent() != tVar) {
                tVar.addView(view);
            } else {
                tVar.white.invoke();
            }
        }
        q0.al alVar2 = alVar.f13307z;
        if (alVar2 != null) {
            alVar2.foxtrot(false);
        }
        alVar.f13293l = false;
        boolean z2 = alVar.f13282I;
        C0058p c0058p = alVar.f13305x;
        if (z2) {
            alVar.f13282I = false;
        } else {
            for (T.r rVar = (s0.g0) c0058p.golf; rVar != null; rVar = rVar.getParent$ui_release()) {
                if (rVar.isAttached()) {
                    rVar.reset$ui_release();
                }
            }
            T.r rVar2 = (s0.g0) c0058p.golf;
            for (T.r rVar3 = rVar2; rVar3 != null; rVar3 = rVar3.getParent$ui_release()) {
                if (rVar3.isAttached()) {
                    rVar3.runDetachLifecycle$ui_release();
                }
            }
            while (rVar2 != null) {
                if (rVar2.isAttached()) {
                    rVar2.markAsDetached$ui_release();
                }
                rVar2 = rVar2.getParent$ui_release();
            }
        }
        int i4 = alVar.purple;
        alVar.purple = A0.o.alpha.addAndGet(1);
        C2946x c2946x = alVar.f13287f;
        if (c2946x != null) {
            c2946x.m368getLayoutNodes().golf(i4);
            c2946x.m368getLayoutNodes().hotel(alVar.purple, alVar);
        }
        for (T.r rVar4 = (T.r) c0058p.delta; rVar4 != null; rVar4 = rVar4.getChild$ui_release()) {
            rVar4.markAsAttached$ui_release();
        }
        c0058p.golf();
        if (c0058p.foxtrot(8)) {
            alVar.coral();
        }
        s0.al.orange(alVar);
        C2946x c2946x2 = alVar.f13287f;
        if (c2946x2 != null) {
            if (C2946x.echo() && (cVar = c2946x2.f13921y) != null) {
                bv.ab abVar = cVar.hotel;
                boolean echo = abVar.echo(i4);
                C2946x c2946x3 = cVar.charlie;
                O7.j jVar = cVar.alpha;
                if (echo) {
                    jVar.hotel(c2946x3, i4, false);
                }
                A0.k xray = alVar.xray();
                if (xray != null) {
                    if (xray.alpha.bravo(A0.x.quebec)) {
                        abVar.alpha(alVar.purple);
                        jVar.hotel(c2946x3, alVar.purple, true);
                    }
                }
            }
            c2946x2.getRectManager().foxtrot(alVar, true);
        }
    }

    @Override // u1.g
    public void foxtrot() {
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void golf(int i4, int i5, int i10) {
        ((s0.al) this.red).gray(i4, i5, i10);
    }

    @Override // com.google.android.gms.measurement.internal.as
    public void hotel(String str, int i4, IOException iOException, byte[] bArr, Map map) {
        ((com.google.android.gms.measurement.internal.Z0) this.red).papa(true, i4, iOException, bArr, (String) this.purple, (ArrayList) this.silver);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void india(int i4, int i5) {
        ((s0.al) this.red).lime(i4, i5);
    }

    @Override // u1.g
    public Uri juliet() {
        return (Uri) this.silver;
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void kilo() {
        this.red = ((ArrayList) this.silver).remove(r0.size() - 1);
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public /* bridge */ /* synthetic */ void lima(int i4, Object obj) {
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void mike() {
        C2946x c2946x = ((s0.al) this.purple).f13287f;
        if (c2946x != null) {
            c2946x.uniform();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0566c
    public void november(Object obj, Xd.l lVar) {
        lVar.invoke(romeo(), obj);
    }

    @Override // u1.g
    public Object oscar() {
        return null;
    }

    public void papa() {
        ((ArrayList) this.silver).clear();
        this.red = (s0.al) this.purple;
        ((s0.al) this.purple).lavender();
    }

    public void quebec(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.red;
        HashMap hashMap2 = (HashMap) this.purple;
        C1638f c1638f = new C1638f(byteArrayOutputStream, hashMap2, hashMap, (C1592a) this.silver);
        if (obj == null) {
            return;
        }
        InterfaceC0733c interfaceC0733c = (InterfaceC0733c) hashMap2.get(obj.getClass());
        if (interfaceC0733c != null) {
            interfaceC0733c.alpha(obj, c1638f);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }

    public Object romeo() {
        return this.red;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(79:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(76:242|243|(1:24)|25|26|27|(1:29)|239|31|32|(3:214|215|(71:217|(63:219|(1:221)|35|(1:37)|38|(1:40)|41|(2:43|(1:198)(53:47|48|(1:50)|51|(1:53)(2:188|(1:193)(1:192))|(1:55)|56|(1:58)(5:176|(1:178)|179|(1:181)(1:187)|(1:183)(2:184|(1:186)))|59|(1:61)(6:158|(4:161|(2:169|170)(1:167)|168|159)|171|172|(1:174)|175)|62|(1:64)(1:157)|(1:66)|67|(37:153|154|(1:73)|74|(1:76)|77|(31:144|(1:148)|(1:81)|82|(27:139|(1:143)|(1:86)|87|(23:136|(1:138)|(1:91)|92|(1:94)|95|(1:97)|98|(3:100|(1:105)(1:103)|104)|106|(1:108)|109|(1:111)|112|(1:114)|115|(1:135)|117|(4:124|125|(1:127)(1:130)|128)|119|(1:121)|122|123)|89|(0)|92|(0)|95|(0)|98|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|(0)|122|123)|84|(0)|87|(0)|89|(0)|92|(0)|95|(0)|98|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|(0)|122|123)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|95|(0)|98|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|(0)|122|123)|69|(37:149|150|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|95|(0)|98|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|(0)|122|123)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|95|(0)|98|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|(0)|122|123))(1:213)|199|(2:208|209)|(1:207)(1:206)|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|95|(0)|98|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|(0)|122|123)|222|(66:224|(1:226)|35|(0)|38|(0)|41|(0)(0)|199|(1:201)|208|209|(1:204)|207|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|95|(0)|98|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|(0)|122|123)(1:235)|227|(3:229|(1:231)(1:233)|232)|234|35|(0)|38|(0)|41|(0)(0)|199|(0)|208|209|(0)|207|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|95|(0)|98|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|(0)|122|123))|34|35|(0)|38|(0)|41|(0)(0)|199|(0)|208|209|(0)|207|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|95|(0)|98|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|(0)|122|123)|22|(0)|25|26|27|(0)|239|31|32|(0)|34|35|(0)|38|(0)|41|(0)(0)|199|(0)|208|209|(0)|207|48|(0)|51|(0)(0)|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)|77|(0)|79|(0)|82|(0)|84|(0)|87|(0)|89|(0)|92|(0)|95|(0)|98|(0)|106|(0)|109|(0)|112|(0)|115|(0)|117|(0)|119|(0)|122|123) */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x020d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x020e, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x00c5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x00c6, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x050f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[Catch: NameNotFoundException -> 0x00c5, TRY_LEAVE, TryCatch #1 {NameNotFoundException -> 0x00c5, blocks: (B:27:0x00b9, B:29:0x00bf), top: B:26:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0496  */
    /* JADX WARN: Type inference failed for: r0v106, types: [int] */
    /* JADX WARN: Type inference failed for: r0v132 */
    /* JADX WARN: Type inference failed for: r0v178 */
    /* JADX WARN: Type inference failed for: r0v179 */
    /* JADX WARN: Type inference failed for: r15v1, types: [f1.s] */
    /* JADX WARN: Type inference failed for: r3v34, types: [f1.p, f1.t] */
    /* JADX WARN: Type inference failed for: r6v28, types: [f1.q, f1.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean sierra() {
        com.google.firebase.messaging.m mVar;
        com.google.android.material.internal.s sVar;
        Bundle bundle;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        String packageName;
        PackageManager packageManager;
        String green;
        String green2;
        String indigo;
        int i4;
        int i5;
        int i10;
        String indigo2;
        Uri defaultUri;
        String indigo3;
        Uri uri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String indigo4;
        Integer valueOf;
        String indigo5;
        Integer bronze;
        Integer bronze2;
        Integer bronze3;
        Long fuchsia;
        long[] ivory;
        int[] crimson;
        ?? r02;
        String indigo6;
        IconCompat iconCompat;
        boolean z2;
        int i11;
        int i12;
        ApplicationInfo applicationInfo;
        if (((com.google.android.material.internal.s) this.silver).blue("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.red;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String indigo7 = ((com.google.android.material.internal.s) this.silver).indigo("gcm.n.image");
        if (!TextUtils.isEmpty(indigo7)) {
            try {
                mVar = new com.google.firebase.messaging.m(new URL(indigo7));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + indigo7);
            }
            if (mVar != null) {
                ExecutorService executorService = (ExecutorService) this.purple;
                G6.h hVar = new G6.h();
                mVar.purple = executorService.submit(new RunnableC0643m(18, mVar, hVar));
                mVar.red = hVar.alpha;
            }
            FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.red;
            sVar = (com.google.android.material.internal.s) this.silver;
            AtomicInteger atomicInteger = com.google.firebase.messaging.e.alpha;
            applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String indigo8 = sVar.indigo("gcm.n.android_channel_id");
            if (Build.VERSION.SDK_INT >= 26) {
                if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(indigo8)) {
                        notificationChannel3 = notificationManager.getNotificationChannel(indigo8);
                        if (notificationChannel3 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel requested (" + indigo8 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        }
                        packageName = firebaseMessagingService2.getPackageName();
                        Resources resources = firebaseMessagingService2.getResources();
                        packageManager = firebaseMessagingService2.getPackageManager();
                        ?? sVar2 = new f1.s(firebaseMessagingService2, indigo8);
                        green = sVar.green(resources, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(green)) {
                            sVar2.echo = f1.s.bravo(green);
                        }
                        green2 = sVar.green(resources, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(green2)) {
                            sVar2.foxtrot = f1.s.bravo(green2);
                            ?? tVar = new f1.t();
                            tVar.delta = f1.s.bravo(green2);
                            sVar2.foxtrot(tVar);
                        }
                        indigo = sVar.indigo("gcm.n.icon");
                        if (!TextUtils.isEmpty(indigo)) {
                            i10 = resources.getIdentifier(indigo, "drawable", packageName);
                            if ((i10 != 0 && com.google.firebase.messaging.e.alpha(resources, i10)) || ((i10 = resources.getIdentifier(indigo, "mipmap", packageName)) != 0 && com.google.firebase.messaging.e.alpha(resources, i10))) {
                                i4 = 1;
                                sVar2.xray.icon = i10;
                                indigo2 = sVar.indigo("gcm.n.sound2");
                                if (TextUtils.isEmpty(indigo2)) {
                                    indigo2 = sVar.indigo("gcm.n.sound");
                                }
                                if (!TextUtils.isEmpty(indigo2)) {
                                    defaultUri = null;
                                } else if (!"default".equals(indigo2) && resources.getIdentifier(indigo2, "raw", packageName) != 0) {
                                    defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + indigo2);
                                } else {
                                    defaultUri = RingtoneManager.getDefaultUri(2);
                                }
                                if (defaultUri != null) {
                                    sVar2.echo(defaultUri);
                                }
                                indigo3 = sVar.indigo("gcm.n.click_action");
                                if (TextUtils.isEmpty(indigo3)) {
                                    launchIntentForPackage = new Intent(indigo3);
                                    launchIntentForPackage.setPackage(packageName);
                                    launchIntentForPackage.setFlags(268435456);
                                } else {
                                    String indigo9 = sVar.indigo("gcm.n.link_android");
                                    if (TextUtils.isEmpty(indigo9)) {
                                        indigo9 = sVar.indigo("gcm.n.link");
                                    }
                                    if (!TextUtils.isEmpty(indigo9)) {
                                        uri = Uri.parse(indigo9);
                                    } else {
                                        uri = null;
                                    }
                                    if (uri != null) {
                                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                        launchIntentForPackage.setPackage(packageName);
                                        launchIntentForPackage.setData(uri);
                                    } else {
                                        launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                        if (launchIntentForPackage == null) {
                                            Log.w("FirebaseMessaging", "No activity found to launch app");
                                        }
                                    }
                                }
                                AtomicInteger atomicInteger2 = com.google.firebase.messaging.e.alpha;
                                if (launchIntentForPackage != null) {
                                    activity = null;
                                } else {
                                    launchIntentForPackage.addFlags(67108864);
                                    Bundle bundle3 = (Bundle) sVar.purple;
                                    Bundle bundle4 = new Bundle(bundle3);
                                    for (String str : bundle3.keySet()) {
                                        if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                            bundle4.remove(str);
                                        }
                                    }
                                    launchIntentForPackage.putExtras(bundle4);
                                    if (sVar.blue("google.c.a.e")) {
                                        launchIntentForPackage.putExtra("gcm.n.analytics_data", sVar.lavender());
                                    }
                                    activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                                }
                                sVar2.golf = activity;
                                if (sVar.blue("google.c.a.e")) {
                                    broadcast = null;
                                } else {
                                    broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(sVar.lavender())), 1140850688);
                                }
                                if (broadcast != null) {
                                    sVar2.xray.deleteIntent = broadcast;
                                }
                                indigo4 = sVar.indigo("gcm.n.color");
                                if (!TextUtils.isEmpty(indigo4)) {
                                    try {
                                        valueOf = Integer.valueOf(Color.parseColor(indigo4));
                                    } catch (IllegalArgumentException unused2) {
                                        Log.w("FirebaseMessaging", "Color is invalid: " + indigo4 + ". Notification will use default color.");
                                    }
                                    if (valueOf != null) {
                                        sVar2.sierra = valueOf.intValue();
                                    }
                                    sVar2.charlie(16, !sVar.blue("gcm.n.sticky"));
                                    sVar2.november = sVar.blue("gcm.n.local_only");
                                    indigo5 = sVar.indigo("gcm.n.ticker");
                                    if (indigo5 != null) {
                                        sVar2.xray.tickerText = f1.s.bravo(indigo5);
                                    }
                                    bronze = sVar.bronze("gcm.n.notification_priority");
                                    if (bronze != null) {
                                        if (bronze.intValue() < -2 || bronze.intValue() > 2) {
                                            Log.w("FirebaseMessaging", "notificationPriority is invalid " + bronze + ". Skipping setting notificationPriority.");
                                        }
                                        if (bronze != null) {
                                            sVar2.juliet = bronze.intValue();
                                        }
                                        bronze2 = sVar.bronze("gcm.n.visibility");
                                        if (bronze2 != null) {
                                            if (bronze2.intValue() < -1 || bronze2.intValue() > i4) {
                                                Log.w("NotificationParams", "visibility is invalid: " + bronze2 + ". Skipping setting visibility.");
                                            }
                                            if (bronze2 != null) {
                                                sVar2.tango = bronze2.intValue();
                                            }
                                            bronze3 = sVar.bronze("gcm.n.notification_count");
                                            if (bronze3 != null) {
                                                if (bronze3.intValue() < 0) {
                                                    Log.w("FirebaseMessaging", "notificationCount is invalid: " + bronze3 + ". Skipping setting notificationCount.");
                                                }
                                                if (bronze3 != null) {
                                                    sVar2.india = bronze3.intValue();
                                                }
                                                fuchsia = sVar.fuchsia();
                                                if (fuchsia != null) {
                                                    sVar2.kilo = true;
                                                    sVar2.xray.when = fuchsia.longValue();
                                                }
                                                ivory = sVar.ivory();
                                                if (ivory != null) {
                                                    sVar2.xray.vibrate = ivory;
                                                }
                                                crimson = sVar.crimson();
                                                if (crimson != null) {
                                                    int i13 = crimson[0];
                                                    int i14 = crimson[1];
                                                    int i15 = crimson[2];
                                                    Notification notification = sVar2.xray;
                                                    notification.ledARGB = i13;
                                                    notification.ledOnMS = i14;
                                                    notification.ledOffMS = i15;
                                                    if (i14 != 0 && i15 != 0) {
                                                        i11 = 1;
                                                    } else {
                                                        i11 = 0;
                                                    }
                                                    notification.flags = i11 | ((-2) & notification.flags);
                                                }
                                                boolean blue = sVar.blue("gcm.n.default_sound");
                                                boolean z10 = blue;
                                                if (sVar.blue("gcm.n.default_vibrate_timings")) {
                                                    z10 = (blue ? 1 : 0) | 2;
                                                }
                                                r02 = z10;
                                                if (sVar.blue("gcm.n.default_light_settings")) {
                                                    r02 = (z10 ? 1 : 0) | 4;
                                                }
                                                Notification notification2 = sVar2.xray;
                                                notification2.defaults = r02;
                                                if ((r02 & 4) != 0) {
                                                    notification2.flags |= 1;
                                                }
                                                indigo6 = sVar.indigo("gcm.n.tag");
                                                if (TextUtils.isEmpty(indigo6)) {
                                                    indigo6 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                }
                                                String str2 = indigo6;
                                                if (mVar != null) {
                                                    try {
                                                        G6.q qVar = mVar.red;
                                                        V5.x.hotel(qVar);
                                                        Bitmap bitmap = (Bitmap) V4.alpha(qVar, 5L, TimeUnit.SECONDS);
                                                        sVar2.delta(bitmap);
                                                        ?? tVar2 = new f1.t();
                                                        if (bitmap == null) {
                                                            iconCompat = null;
                                                            z2 = true;
                                                        } else {
                                                            z2 = true;
                                                            iconCompat = new IconCompat(1);
                                                            iconCompat.bravo = bitmap;
                                                        }
                                                        tVar2.delta = iconCompat;
                                                        tVar2.echo = null;
                                                        tVar2.foxtrot = z2;
                                                        sVar2.foxtrot(tVar2);
                                                    } catch (InterruptedException unused3) {
                                                        Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                                        mVar.close();
                                                        Thread.currentThread().interrupt();
                                                    } catch (ExecutionException e) {
                                                        Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
                                                    } catch (TimeoutException unused4) {
                                                        Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                                        mVar.close();
                                                    }
                                                }
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                    Log.d("FirebaseMessaging", "Showing notification");
                                                }
                                                ((NotificationManager) ((FirebaseMessagingService) this.red).getSystemService("notification")).notify(str2, 0, sVar2.alpha());
                                                return true;
                                            }
                                            bronze3 = null;
                                            if (bronze3 != null) {
                                            }
                                            fuchsia = sVar.fuchsia();
                                            if (fuchsia != null) {
                                            }
                                            ivory = sVar.ivory();
                                            if (ivory != null) {
                                            }
                                            crimson = sVar.crimson();
                                            if (crimson != null) {
                                            }
                                            boolean blue2 = sVar.blue("gcm.n.default_sound");
                                            boolean z102 = blue2;
                                            if (sVar.blue("gcm.n.default_vibrate_timings")) {
                                            }
                                            r02 = z102;
                                            if (sVar.blue("gcm.n.default_light_settings")) {
                                            }
                                            Notification notification22 = sVar2.xray;
                                            notification22.defaults = r02;
                                            if ((r02 & 4) != 0) {
                                            }
                                            indigo6 = sVar.indigo("gcm.n.tag");
                                            if (TextUtils.isEmpty(indigo6)) {
                                            }
                                            String str22 = indigo6;
                                            if (mVar != null) {
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.red).getSystemService("notification")).notify(str22, 0, sVar2.alpha());
                                            return true;
                                        }
                                        bronze2 = null;
                                        if (bronze2 != null) {
                                        }
                                        bronze3 = sVar.bronze("gcm.n.notification_count");
                                        if (bronze3 != null) {
                                        }
                                        bronze3 = null;
                                        if (bronze3 != null) {
                                        }
                                        fuchsia = sVar.fuchsia();
                                        if (fuchsia != null) {
                                        }
                                        ivory = sVar.ivory();
                                        if (ivory != null) {
                                        }
                                        crimson = sVar.crimson();
                                        if (crimson != null) {
                                        }
                                        boolean blue22 = sVar.blue("gcm.n.default_sound");
                                        boolean z1022 = blue22;
                                        if (sVar.blue("gcm.n.default_vibrate_timings")) {
                                        }
                                        r02 = z1022;
                                        if (sVar.blue("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification222 = sVar2.xray;
                                        notification222.defaults = r02;
                                        if ((r02 & 4) != 0) {
                                        }
                                        indigo6 = sVar.indigo("gcm.n.tag");
                                        if (TextUtils.isEmpty(indigo6)) {
                                        }
                                        String str222 = indigo6;
                                        if (mVar != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.red).getSystemService("notification")).notify(str222, 0, sVar2.alpha());
                                        return true;
                                    }
                                    bronze = null;
                                    if (bronze != null) {
                                    }
                                    bronze2 = sVar.bronze("gcm.n.visibility");
                                    if (bronze2 != null) {
                                    }
                                    bronze2 = null;
                                    if (bronze2 != null) {
                                    }
                                    bronze3 = sVar.bronze("gcm.n.notification_count");
                                    if (bronze3 != null) {
                                    }
                                    bronze3 = null;
                                    if (bronze3 != null) {
                                    }
                                    fuchsia = sVar.fuchsia();
                                    if (fuchsia != null) {
                                    }
                                    ivory = sVar.ivory();
                                    if (ivory != null) {
                                    }
                                    crimson = sVar.crimson();
                                    if (crimson != null) {
                                    }
                                    boolean blue222 = sVar.blue("gcm.n.default_sound");
                                    boolean z10222 = blue222;
                                    if (sVar.blue("gcm.n.default_vibrate_timings")) {
                                    }
                                    r02 = z10222;
                                    if (sVar.blue("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification2222 = sVar2.xray;
                                    notification2222.defaults = r02;
                                    if ((r02 & 4) != 0) {
                                    }
                                    indigo6 = sVar.indigo("gcm.n.tag");
                                    if (TextUtils.isEmpty(indigo6)) {
                                    }
                                    String str2222 = indigo6;
                                    if (mVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.red).getSystemService("notification")).notify(str2222, 0, sVar2.alpha());
                                    return true;
                                }
                                i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                                if (i12 != 0) {
                                    try {
                                        valueOf = Integer.valueOf(firebaseMessagingService2.getColor(i12));
                                    } catch (Resources.NotFoundException unused5) {
                                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                    }
                                    if (valueOf != null) {
                                    }
                                    sVar2.charlie(16, !sVar.blue("gcm.n.sticky"));
                                    sVar2.november = sVar.blue("gcm.n.local_only");
                                    indigo5 = sVar.indigo("gcm.n.ticker");
                                    if (indigo5 != null) {
                                    }
                                    bronze = sVar.bronze("gcm.n.notification_priority");
                                    if (bronze != null) {
                                    }
                                    bronze = null;
                                    if (bronze != null) {
                                    }
                                    bronze2 = sVar.bronze("gcm.n.visibility");
                                    if (bronze2 != null) {
                                    }
                                    bronze2 = null;
                                    if (bronze2 != null) {
                                    }
                                    bronze3 = sVar.bronze("gcm.n.notification_count");
                                    if (bronze3 != null) {
                                    }
                                    bronze3 = null;
                                    if (bronze3 != null) {
                                    }
                                    fuchsia = sVar.fuchsia();
                                    if (fuchsia != null) {
                                    }
                                    ivory = sVar.ivory();
                                    if (ivory != null) {
                                    }
                                    crimson = sVar.crimson();
                                    if (crimson != null) {
                                    }
                                    boolean blue2222 = sVar.blue("gcm.n.default_sound");
                                    boolean z102222 = blue2222;
                                    if (sVar.blue("gcm.n.default_vibrate_timings")) {
                                    }
                                    r02 = z102222;
                                    if (sVar.blue("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification22222 = sVar2.xray;
                                    notification22222.defaults = r02;
                                    if ((r02 & 4) != 0) {
                                    }
                                    indigo6 = sVar.indigo("gcm.n.tag");
                                    if (TextUtils.isEmpty(indigo6)) {
                                    }
                                    String str22222 = indigo6;
                                    if (mVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.red).getSystemService("notification")).notify(str22222, 0, sVar2.alpha());
                                    return true;
                                }
                                valueOf = null;
                                if (valueOf != null) {
                                }
                                sVar2.charlie(16, !sVar.blue("gcm.n.sticky"));
                                sVar2.november = sVar.blue("gcm.n.local_only");
                                indigo5 = sVar.indigo("gcm.n.ticker");
                                if (indigo5 != null) {
                                }
                                bronze = sVar.bronze("gcm.n.notification_priority");
                                if (bronze != null) {
                                }
                                bronze = null;
                                if (bronze != null) {
                                }
                                bronze2 = sVar.bronze("gcm.n.visibility");
                                if (bronze2 != null) {
                                }
                                bronze2 = null;
                                if (bronze2 != null) {
                                }
                                bronze3 = sVar.bronze("gcm.n.notification_count");
                                if (bronze3 != null) {
                                }
                                bronze3 = null;
                                if (bronze3 != null) {
                                }
                                fuchsia = sVar.fuchsia();
                                if (fuchsia != null) {
                                }
                                ivory = sVar.ivory();
                                if (ivory != null) {
                                }
                                crimson = sVar.crimson();
                                if (crimson != null) {
                                }
                                boolean blue22222 = sVar.blue("gcm.n.default_sound");
                                boolean z1022222 = blue22222;
                                if (sVar.blue("gcm.n.default_vibrate_timings")) {
                                }
                                r02 = z1022222;
                                if (sVar.blue("gcm.n.default_light_settings")) {
                                }
                                Notification notification222222 = sVar2.xray;
                                notification222222.defaults = r02;
                                if ((r02 & 4) != 0) {
                                }
                                indigo6 = sVar.indigo("gcm.n.tag");
                                if (TextUtils.isEmpty(indigo6)) {
                                }
                                String str222222 = indigo6;
                                if (mVar != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.red).getSystemService("notification")).notify(str222222, 0, sVar2.alpha());
                                return true;
                            }
                            i4 = 1;
                            Log.w("FirebaseMessaging", "Icon resource " + indigo + " not found. Notification will use default icon.");
                        } else {
                            i4 = 1;
                        }
                        i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i5 != 0 || !com.google.firebase.messaging.e.alpha(resources, i5)) {
                            i5 = packageManager.getApplicationInfo(packageName, 0).icon;
                        }
                        if (i5 == 0 && com.google.firebase.messaging.e.alpha(resources, i5)) {
                            i10 = i5;
                        } else {
                            i10 = 17301651;
                        }
                        sVar2.xray.icon = i10;
                        indigo2 = sVar.indigo("gcm.n.sound2");
                        if (TextUtils.isEmpty(indigo2)) {
                        }
                        if (!TextUtils.isEmpty(indigo2)) {
                        }
                        if (defaultUri != null) {
                        }
                        indigo3 = sVar.indigo("gcm.n.click_action");
                        if (TextUtils.isEmpty(indigo3)) {
                        }
                        AtomicInteger atomicInteger22 = com.google.firebase.messaging.e.alpha;
                        if (launchIntentForPackage != null) {
                        }
                        sVar2.golf = activity;
                        if (sVar.blue("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        indigo4 = sVar.indigo("gcm.n.color");
                        if (!TextUtils.isEmpty(indigo4)) {
                        }
                        i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i12 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        sVar2.charlie(16, !sVar.blue("gcm.n.sticky"));
                        sVar2.november = sVar.blue("gcm.n.local_only");
                        indigo5 = sVar.indigo("gcm.n.ticker");
                        if (indigo5 != null) {
                        }
                        bronze = sVar.bronze("gcm.n.notification_priority");
                        if (bronze != null) {
                        }
                        bronze = null;
                        if (bronze != null) {
                        }
                        bronze2 = sVar.bronze("gcm.n.visibility");
                        if (bronze2 != null) {
                        }
                        bronze2 = null;
                        if (bronze2 != null) {
                        }
                        bronze3 = sVar.bronze("gcm.n.notification_count");
                        if (bronze3 != null) {
                        }
                        bronze3 = null;
                        if (bronze3 != null) {
                        }
                        fuchsia = sVar.fuchsia();
                        if (fuchsia != null) {
                        }
                        ivory = sVar.ivory();
                        if (ivory != null) {
                        }
                        crimson = sVar.crimson();
                        if (crimson != null) {
                        }
                        boolean blue222222 = sVar.blue("gcm.n.default_sound");
                        boolean z10222222 = blue222222;
                        if (sVar.blue("gcm.n.default_vibrate_timings")) {
                        }
                        r02 = z10222222;
                        if (sVar.blue("gcm.n.default_light_settings")) {
                        }
                        Notification notification2222222 = sVar2.xray;
                        notification2222222.defaults = r02;
                        if ((r02 & 4) != 0) {
                        }
                        indigo6 = sVar.indigo("gcm.n.tag");
                        if (TextUtils.isEmpty(indigo6)) {
                        }
                        String str2222222 = indigo6;
                        if (mVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.red).getSystemService("notification")).notify(str2222222, 0, sVar2.alpha());
                        return true;
                    }
                    indigo8 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(indigo8)) {
                        notificationChannel2 = notificationManager.getNotificationChannel(indigo8);
                        if (notificationChannel2 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        packageName = firebaseMessagingService2.getPackageName();
                        Resources resources2 = firebaseMessagingService2.getResources();
                        packageManager = firebaseMessagingService2.getPackageManager();
                        ?? sVar22 = new f1.s(firebaseMessagingService2, indigo8);
                        green = sVar.green(resources2, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(green)) {
                        }
                        green2 = sVar.green(resources2, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(green2)) {
                        }
                        indigo = sVar.indigo("gcm.n.icon");
                        if (!TextUtils.isEmpty(indigo)) {
                        }
                        i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i5 != 0) {
                        }
                        i5 = packageManager.getApplicationInfo(packageName, 0).icon;
                        if (i5 == 0) {
                        }
                        i10 = 17301651;
                        sVar22.xray.icon = i10;
                        indigo2 = sVar.indigo("gcm.n.sound2");
                        if (TextUtils.isEmpty(indigo2)) {
                        }
                        if (!TextUtils.isEmpty(indigo2)) {
                        }
                        if (defaultUri != null) {
                        }
                        indigo3 = sVar.indigo("gcm.n.click_action");
                        if (TextUtils.isEmpty(indigo3)) {
                        }
                        AtomicInteger atomicInteger222 = com.google.firebase.messaging.e.alpha;
                        if (launchIntentForPackage != null) {
                        }
                        sVar22.golf = activity;
                        if (sVar.blue("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        indigo4 = sVar.indigo("gcm.n.color");
                        if (!TextUtils.isEmpty(indigo4)) {
                        }
                        i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i12 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        sVar22.charlie(16, !sVar.blue("gcm.n.sticky"));
                        sVar22.november = sVar.blue("gcm.n.local_only");
                        indigo5 = sVar.indigo("gcm.n.ticker");
                        if (indigo5 != null) {
                        }
                        bronze = sVar.bronze("gcm.n.notification_priority");
                        if (bronze != null) {
                        }
                        bronze = null;
                        if (bronze != null) {
                        }
                        bronze2 = sVar.bronze("gcm.n.visibility");
                        if (bronze2 != null) {
                        }
                        bronze2 = null;
                        if (bronze2 != null) {
                        }
                        bronze3 = sVar.bronze("gcm.n.notification_count");
                        if (bronze3 != null) {
                        }
                        bronze3 = null;
                        if (bronze3 != null) {
                        }
                        fuchsia = sVar.fuchsia();
                        if (fuchsia != null) {
                        }
                        ivory = sVar.ivory();
                        if (ivory != null) {
                        }
                        crimson = sVar.crimson();
                        if (crimson != null) {
                        }
                        boolean blue2222222 = sVar.blue("gcm.n.default_sound");
                        boolean z102222222 = blue2222222;
                        if (sVar.blue("gcm.n.default_vibrate_timings")) {
                        }
                        r02 = z102222222;
                        if (sVar.blue("gcm.n.default_light_settings")) {
                        }
                        Notification notification22222222 = sVar22.xray;
                        notification22222222.defaults = r02;
                        if ((r02 & 4) != 0) {
                        }
                        indigo6 = sVar.indigo("gcm.n.tag");
                        if (TextUtils.isEmpty(indigo6)) {
                        }
                        String str22222222 = indigo6;
                        if (mVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.red).getSystemService("notification")).notify(str22222222, 0, sVar22.alpha());
                        return true;
                    }
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    notificationChannel = notificationManager.getNotificationChannel(Constants.FCM_FALLBACK_NOTIFICATION_CHANNEL_ID);
                    if (notificationChannel == null) {
                        int identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", CTVariableUtils.STRING, firebaseMessagingService2.getPackageName());
                        if (identifier == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = Constants.FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME;
                        } else {
                            string = firebaseMessagingService2.getString(identifier);
                        }
                        notificationManager.createNotificationChannel(androidx.camera.camera2.internal.compat.a.foxtrot(string));
                    }
                    indigo8 = Constants.FCM_FALLBACK_NOTIFICATION_CHANNEL_ID;
                    packageName = firebaseMessagingService2.getPackageName();
                    Resources resources22 = firebaseMessagingService2.getResources();
                    packageManager = firebaseMessagingService2.getPackageManager();
                    ?? sVar222 = new f1.s(firebaseMessagingService2, indigo8);
                    green = sVar.green(resources22, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(green)) {
                    }
                    green2 = sVar.green(resources22, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(green2)) {
                    }
                    indigo = sVar.indigo("gcm.n.icon");
                    if (!TextUtils.isEmpty(indigo)) {
                    }
                    i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i5 != 0) {
                    }
                    i5 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i5 == 0) {
                    }
                    i10 = 17301651;
                    sVar222.xray.icon = i10;
                    indigo2 = sVar.indigo("gcm.n.sound2");
                    if (TextUtils.isEmpty(indigo2)) {
                    }
                    if (!TextUtils.isEmpty(indigo2)) {
                    }
                    if (defaultUri != null) {
                    }
                    indigo3 = sVar.indigo("gcm.n.click_action");
                    if (TextUtils.isEmpty(indigo3)) {
                    }
                    AtomicInteger atomicInteger2222 = com.google.firebase.messaging.e.alpha;
                    if (launchIntentForPackage != null) {
                    }
                    sVar222.golf = activity;
                    if (sVar.blue("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    indigo4 = sVar.indigo("gcm.n.color");
                    if (!TextUtils.isEmpty(indigo4)) {
                    }
                    i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i12 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    sVar222.charlie(16, !sVar.blue("gcm.n.sticky"));
                    sVar222.november = sVar.blue("gcm.n.local_only");
                    indigo5 = sVar.indigo("gcm.n.ticker");
                    if (indigo5 != null) {
                    }
                    bronze = sVar.bronze("gcm.n.notification_priority");
                    if (bronze != null) {
                    }
                    bronze = null;
                    if (bronze != null) {
                    }
                    bronze2 = sVar.bronze("gcm.n.visibility");
                    if (bronze2 != null) {
                    }
                    bronze2 = null;
                    if (bronze2 != null) {
                    }
                    bronze3 = sVar.bronze("gcm.n.notification_count");
                    if (bronze3 != null) {
                    }
                    bronze3 = null;
                    if (bronze3 != null) {
                    }
                    fuchsia = sVar.fuchsia();
                    if (fuchsia != null) {
                    }
                    ivory = sVar.ivory();
                    if (ivory != null) {
                    }
                    crimson = sVar.crimson();
                    if (crimson != null) {
                    }
                    boolean blue22222222 = sVar.blue("gcm.n.default_sound");
                    boolean z1022222222 = blue22222222;
                    if (sVar.blue("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z1022222222;
                    if (sVar.blue("gcm.n.default_light_settings")) {
                    }
                    Notification notification222222222 = sVar222.xray;
                    notification222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    indigo6 = sVar.indigo("gcm.n.tag");
                    if (TextUtils.isEmpty(indigo6)) {
                    }
                    String str222222222 = indigo6;
                    if (mVar != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.red).getSystemService("notification")).notify(str222222222, 0, sVar222.alpha());
                    return true;
                }
            }
            indigo8 = null;
            packageName = firebaseMessagingService2.getPackageName();
            Resources resources222 = firebaseMessagingService2.getResources();
            packageManager = firebaseMessagingService2.getPackageManager();
            ?? sVar2222 = new f1.s(firebaseMessagingService2, indigo8);
            green = sVar.green(resources222, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(green)) {
            }
            green2 = sVar.green(resources222, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(green2)) {
            }
            indigo = sVar.indigo("gcm.n.icon");
            if (!TextUtils.isEmpty(indigo)) {
            }
            i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i5 != 0) {
            }
            i5 = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i5 == 0) {
            }
            i10 = 17301651;
            sVar2222.xray.icon = i10;
            indigo2 = sVar.indigo("gcm.n.sound2");
            if (TextUtils.isEmpty(indigo2)) {
            }
            if (!TextUtils.isEmpty(indigo2)) {
            }
            if (defaultUri != null) {
            }
            indigo3 = sVar.indigo("gcm.n.click_action");
            if (TextUtils.isEmpty(indigo3)) {
            }
            AtomicInteger atomicInteger22222 = com.google.firebase.messaging.e.alpha;
            if (launchIntentForPackage != null) {
            }
            sVar2222.golf = activity;
            if (sVar.blue("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            indigo4 = sVar.indigo("gcm.n.color");
            if (!TextUtils.isEmpty(indigo4)) {
            }
            i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i12 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            sVar2222.charlie(16, !sVar.blue("gcm.n.sticky"));
            sVar2222.november = sVar.blue("gcm.n.local_only");
            indigo5 = sVar.indigo("gcm.n.ticker");
            if (indigo5 != null) {
            }
            bronze = sVar.bronze("gcm.n.notification_priority");
            if (bronze != null) {
            }
            bronze = null;
            if (bronze != null) {
            }
            bronze2 = sVar.bronze("gcm.n.visibility");
            if (bronze2 != null) {
            }
            bronze2 = null;
            if (bronze2 != null) {
            }
            bronze3 = sVar.bronze("gcm.n.notification_count");
            if (bronze3 != null) {
            }
            bronze3 = null;
            if (bronze3 != null) {
            }
            fuchsia = sVar.fuchsia();
            if (fuchsia != null) {
            }
            ivory = sVar.ivory();
            if (ivory != null) {
            }
            crimson = sVar.crimson();
            if (crimson != null) {
            }
            boolean blue222222222 = sVar.blue("gcm.n.default_sound");
            boolean z10222222222 = blue222222222;
            if (sVar.blue("gcm.n.default_vibrate_timings")) {
            }
            r02 = z10222222222;
            if (sVar.blue("gcm.n.default_light_settings")) {
            }
            Notification notification2222222222 = sVar2222.xray;
            notification2222222222.defaults = r02;
            if ((r02 & 4) != 0) {
            }
            indigo6 = sVar.indigo("gcm.n.tag");
            if (TextUtils.isEmpty(indigo6)) {
            }
            String str2222222222 = indigo6;
            if (mVar != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.red).getSystemService("notification")).notify(str2222222222, 0, sVar2222.alpha());
            return true;
        }
        mVar = null;
        if (mVar != null) {
        }
        FirebaseMessagingService firebaseMessagingService22 = (FirebaseMessagingService) this.red;
        sVar = (com.google.android.material.internal.s) this.silver;
        AtomicInteger atomicInteger3 = com.google.firebase.messaging.e.alpha;
        applicationInfo = firebaseMessagingService22.getPackageManager().getApplicationInfo(firebaseMessagingService22.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String indigo82 = sVar.indigo("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
        }
        indigo82 = null;
        packageName = firebaseMessagingService22.getPackageName();
        Resources resources2222 = firebaseMessagingService22.getResources();
        packageManager = firebaseMessagingService22.getPackageManager();
        ?? sVar22222 = new f1.s(firebaseMessagingService22, indigo82);
        green = sVar.green(resources2222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(green)) {
        }
        green2 = sVar.green(resources2222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(green2)) {
        }
        indigo = sVar.indigo("gcm.n.icon");
        if (!TextUtils.isEmpty(indigo)) {
        }
        i5 = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i5 != 0) {
        }
        i5 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i5 == 0) {
        }
        i10 = 17301651;
        sVar22222.xray.icon = i10;
        indigo2 = sVar.indigo("gcm.n.sound2");
        if (TextUtils.isEmpty(indigo2)) {
        }
        if (!TextUtils.isEmpty(indigo2)) {
        }
        if (defaultUri != null) {
        }
        indigo3 = sVar.indigo("gcm.n.click_action");
        if (TextUtils.isEmpty(indigo3)) {
        }
        AtomicInteger atomicInteger222222 = com.google.firebase.messaging.e.alpha;
        if (launchIntentForPackage != null) {
        }
        sVar22222.golf = activity;
        if (sVar.blue("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        indigo4 = sVar.indigo("gcm.n.color");
        if (!TextUtils.isEmpty(indigo4)) {
        }
        i12 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i12 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        sVar22222.charlie(16, !sVar.blue("gcm.n.sticky"));
        sVar22222.november = sVar.blue("gcm.n.local_only");
        indigo5 = sVar.indigo("gcm.n.ticker");
        if (indigo5 != null) {
        }
        bronze = sVar.bronze("gcm.n.notification_priority");
        if (bronze != null) {
        }
        bronze = null;
        if (bronze != null) {
        }
        bronze2 = sVar.bronze("gcm.n.visibility");
        if (bronze2 != null) {
        }
        bronze2 = null;
        if (bronze2 != null) {
        }
        bronze3 = sVar.bronze("gcm.n.notification_count");
        if (bronze3 != null) {
        }
        bronze3 = null;
        if (bronze3 != null) {
        }
        fuchsia = sVar.fuchsia();
        if (fuchsia != null) {
        }
        ivory = sVar.ivory();
        if (ivory != null) {
        }
        crimson = sVar.crimson();
        if (crimson != null) {
        }
        boolean blue2222222222 = sVar.blue("gcm.n.default_sound");
        boolean z102222222222 = blue2222222222;
        if (sVar.blue("gcm.n.default_vibrate_timings")) {
        }
        r02 = z102222222222;
        if (sVar.blue("gcm.n.default_light_settings")) {
        }
        Notification notification22222222222 = sVar22222.xray;
        notification22222222222.defaults = r02;
        if ((r02 & 4) != 0) {
        }
        indigo6 = sVar.indigo("gcm.n.tag");
        if (TextUtils.isEmpty(indigo6)) {
        }
        String str22222222222 = indigo6;
        if (mVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.red).getSystemService("notification")).notify(str22222222222, 0, sVar22222.alpha());
        return true;
    }

    public byte[] tango(t6.K2 k22) {
        C2988f c2988f;
        InterfaceC0733c interfaceC0733c;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap hashMap = (HashMap) this.purple;
            c2988f = new C2988f(byteArrayOutputStream, hashMap, (HashMap) this.red, (C2983e) this.silver);
            interfaceC0733c = (InterfaceC0733c) hashMap.get(t6.K2.class);
        } catch (IOException unused) {
        }
        if (interfaceC0733c != null) {
            interfaceC0733c.alpha(k22, c2988f);
            return byteArrayOutputStream.toByteArray();
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(t6.K2.class)));
    }

    public String toString() {
        switch (this.alpha) {
            case 6:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.purple);
                sb2.append('{');
                com.google.android.play.core.integrity.k kVar = (com.google.android.play.core.integrity.k) ((com.google.android.play.core.integrity.k) this.red).red;
                String str = "";
                while (kVar != null) {
                    Object obj = kVar.purple;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    kVar = (com.google.android.play.core.integrity.k) kVar.red;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public synchronized void uniform(int i4, int i5, long j5, long j6) {
        ((com.google.android.gms.measurement.internal.G) this.purple).f7511g.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.silver;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((X5.b) this.red).echo(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i4, 0, j5, j6, null, null, 0, i5)))).lima(new C0665j(elapsedRealtime, 1, this));
    }

    public /* synthetic */ C1298c(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }

    public C1298c(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 12:
                return;
            default:
                this.purple = new C1293b("", 0L, null);
                this.red = new C1293b("", 0L, null);
                this.silver = new ArrayList();
                return;
        }
    }

    public C1298c(Context context, com.google.android.gms.measurement.internal.G g2) {
        this.alpha = 1;
        this.silver = new AtomicLong(-1L);
        this.red = new com.google.android.gms.common.api.g(context, null, X5.b.india, new V5.m("measurement:api"), com.google.android.gms.common.api.f.bravo);
        this.purple = g2;
    }

    public C1298c(C1293b c1293b) {
        this.alpha = 0;
        this.purple = c1293b;
        this.red = c1293b.clone();
        this.silver = new ArrayList();
    }

    public C1298c(List list, InterfaceC2431a interfaceC2431a) {
        this.alpha = 8;
        this.red = list;
        this.silver = interfaceC2431a;
        this.purple = new int[4];
    }

    public C1298c(eg.a _koin) {
        this.alpha = 5;
        Intrinsics.echo(_koin, "_koin");
        this.purple = _koin;
        this.red = new ConcurrentHashMap();
        this.silver = new ConcurrentHashMap();
    }

    public C1298c(FirebaseMessagingService firebaseMessagingService, com.google.android.material.internal.s sVar, ExecutorService executorService) {
        this.alpha = 3;
        this.purple = executorService;
        this.red = firebaseMessagingService;
        this.silver = sVar;
    }

    public C1298c(String str) {
        this.alpha = 6;
        com.google.android.play.core.integrity.k kVar = new com.google.android.play.core.integrity.k(8, false);
        this.red = kVar;
        this.silver = kVar;
        this.purple = str;
    }

    public C1298c(s0.al alVar) {
        this.alpha = 7;
        this.purple = alVar;
        this.silver = new ArrayList();
        this.red = alVar;
    }

    public C1298c(w9.p pVar, w9.l lVar) {
        this.alpha = 11;
        this.purple = pVar;
        this.red = lVar;
    }
}
