package be;

import G6.m;
import G6.n;
import Gc.v;
import J2.p;
import O7.u;
import V5.x;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import ao.ad;
import bd.ExecutorC0748a;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.internal.measurement.C1317f3;
import com.google.android.gms.internal.measurement.ao;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.measurement.internal.AbstractC1481z;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.C1440e;
import com.google.android.gms.measurement.internal.C1443f0;
import com.google.android.gms.measurement.internal.C1454l;
import com.google.android.gms.measurement.internal.C1459n0;
import com.google.android.gms.measurement.internal.E;
import com.google.android.gms.measurement.internal.E0;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.G0;
import com.google.android.gms.measurement.internal.H0;
import com.google.android.gms.measurement.internal.O;
import com.google.android.gms.measurement.internal.O0;
import com.google.android.gms.measurement.internal.P;
import com.google.android.gms.measurement.internal.RunnableC1482z0;
import com.google.android.gms.measurement.internal.S;
import com.google.android.gms.measurement.internal.U;
import com.google.android.gms.measurement.internal.V;
import com.google.android.gms.measurement.internal.W;
import com.google.android.gms.measurement.internal.Y;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.ab;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.aj;
import com.google.android.gms.measurement.internal.al;
import com.google.android.gms.measurement.internal.ar;
import com.google.android.gms.measurement.internal.aw;
import com.google.android.gms.measurement.internal.ax;
import com.google.android.gms.measurement.internal.d1;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzov;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.o;
import com.google.mlkit.vision.barcode.internal.zzk;
import f1.AbstractC1685e;
import g1.AbstractC1733b;
import g6.AbstractC1753a;
import g6.C1754b;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s6.A5;
import s6.C2652f5;
import s6.C2718n;
import s6.C2745q;
import s6.C2780u;
import s6.P5;
import s6.P7;

/* loaded from: classes3.dex */
public final class g implements Runnable {
    public final /* synthetic */ int alpha;
    public Object purple;
    public final Object red;

    public /* synthetic */ g(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    private final void alpha() {
        synchronized (((n) this.red).red) {
            try {
                OnSuccessListener onSuccessListener = (OnSuccessListener) ((n) this.red).silver;
                if (onSuccessListener != null) {
                    onSuccessListener.onSuccess(((Task) this.purple).hotel());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void bravo() {
        p charlie = ((I2.a) this.red).alpha.golf.charlie((String) this.purple);
        if (charlie != null && charlie.charlie()) {
            synchronized (((I2.a) this.red).red) {
                ((I2.a) this.red).white.put(P5.bravo(charlie), charlie);
                I2.a aVar = (I2.a) this.red;
                ((I2.a) this.red).yellow.put(P5.bravo(charlie), F2.p.alpha(aVar.f1416a, charlie, ((L2.c) aVar.purple).bravo, aVar));
            }
        }
    }

    private final void charlie() {
        try {
            ((Runnable) this.red).run();
            synchronized (((K2.i) this.purple).purple) {
                ((K2.i) this.purple).delta();
            }
        } catch (Throwable th) {
            synchronized (((K2.i) this.purple).purple) {
                ((K2.i) this.purple).delta();
                throw th;
            }
        }
    }

    private final void delta() {
        S5.i iVar = (S5.i) this.purple;
        int i4 = ((S5.j) this.red).alpha;
        synchronized (iVar) {
            S5.j jVar = (S5.j) iVar.echo.get(i4);
            if (jVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i4);
                iVar.echo.remove(i4);
                jVar.bravo(new zzt(3, "Timed out waiting for response", null));
                iVar.charlie();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:204|(2:206|(10:265|230|(1:232)|233|234|235|236|237|238|(5:244|(1:246)(1:254)|(1:250)|(1:252)|253)))(1:266)|210|(4:212|(2:215|(2:217|218))|263|218)(1:264)|(5:220|(1:222)(1:261)|223|(1:225)|226)(1:262)|227|(1:229)(1:260)|230|(0)|233|234|235|236|237|238|(2:240|242)|244|(0)(0)|(2:248|250)|(0)|253) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:21|(1:23)(9:367|368|369|370|(1:372)(2:393|(4:395|374|375|(32:377|(1:379)(1:391)|380|381|383|384|385|25|26|(4:30|(1:32)(1:365)|33|(22:35|36|(2:38|(2:40|(2:42|(2:44|(2:46|(2:48|(1:50)(1:358))(1:359))(1:360))(1:361))(1:362))(1:363))(1:364)|51|(1:53)|54|55|(1:57)(1:354)|58|(6:62|(1:64)(1:72)|65|(3:67|68|69)|71|69)|(3:74|(1:76)(1:79)|77)|80|81|(1:83)(2:351|(8:353|(3:344|345|(6:347|(5:88|(1:90)(3:335|(3:338|(1:340)(1:341)|336)|342)|(1:92)(1:334)|93|(10:95|(2:97|(1:99)(1:100))|101|(1:103)|104|(2:106|(4:108|109|(1:111)|(39:329|113|(1:115)|116|(1:118)(2:324|(1:326)(1:327))|119|(1:121)|122|(2:321|(22:323|(1:141)|142|(1:144)|145|(2:271|(4:277|(2:284|(2:285|(1:292)(2:287|(2:289|290)(1:291))))(0)|293|(13:302|151|(3:267|(1:269)|270)|155|(1:157)|158|(1:162)|163|(3:165|(7:167|(1:169)(1:202)|170|(1:172)|173|(4:177|(1:179)|180|(1:182))|183)(1:203)|184)(21:204|(2:206|(10:265|230|(1:232)|233|234|235|236|237|238|(5:244|(1:246)(1:254)|(1:250)|(1:252)|253)))(1:266)|210|(4:212|(2:215|(2:217|218))|263|218)(1:264)|(5:220|(1:222)(1:261)|223|(1:225)|226)(1:262)|227|(1:229)(1:260)|230|(0)|233|234|235|236|237|238|(2:240|242)|244|(0)(0)|(2:248|250)|(0)|253)|185|(3:187|(1:189)(1:198)|(5:191|(1:193)|194|(1:196)|197))|199|200))(1:276))(1:149)|150|151|(1:153)|267|(0)|270|155|(0)|158|(2:160|162)|163|(0)(0)|185|(0)|199|200))(1:125)|126|(3:303|304|(3:313|(3:316|(1:318)(1:319)|314)|320))(1:138)|139|(0)|142|(0)|145|(1:147)|271|(1:274)|277|(4:280|282|284|(3:285|(0)(0)|291))(0)|293|(19:296|298|300|302|151|(0)|267|(0)|270|155|(0)|158|(0)|163|(0)(0)|185|(0)|199|200)|150|151|(0)|267|(0)|270|155|(0)|158|(0)|163|(0)(0)|185|(0)|199|200)(38:330|122|(0)|321|(0)|126|(4:128|130|132|136)|303|304|(6:306|309|311|313|(1:314)|320)|139|(0)|142|(0)|145|(0)|271|(0)|277|(0)(0)|293|(0)|150|151|(0)|267|(0)|270|155|(0)|158|(0)|163|(0)(0)|185|(0)|199|200)))|331|109|(0)|(0)(0))(2:332|333))|343|(0)(0)|93|(0)(0)))|86|(0)|343|(0)(0)|93|(0)(0)))|84|(0)|86|(0)|343|(0)(0)|93|(0)(0)))|366|36|(0)(0)|51|(0)|54|55|(0)(0)|58|(7:60|62|(0)(0)|65|(0)|71|69)|(0)|80|81|(0)(0)|84|(0)|86|(0)|343|(0)(0)|93|(0)(0))))|373|374|375|(0))|24|25|26|(5:28|30|(0)(0)|33|(0))|366|36|(0)(0)|51|(0)|54|55|(0)(0)|58|(0)|(0)|80|81|(0)(0)|84|(0)|86|(0)|343|(0)(0)|93|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:367|(2:368|369)|370|(1:372)(2:393|(4:395|374|375|(32:377|(1:379)(1:391)|380|381|383|384|385|25|26|(4:30|(1:32)(1:365)|33|(22:35|36|(2:38|(2:40|(2:42|(2:44|(2:46|(2:48|(1:50)(1:358))(1:359))(1:360))(1:361))(1:362))(1:363))(1:364)|51|(1:53)|54|55|(1:57)(1:354)|58|(6:62|(1:64)(1:72)|65|(3:67|68|69)|71|69)|(3:74|(1:76)(1:79)|77)|80|81|(1:83)(2:351|(8:353|(3:344|345|(6:347|(5:88|(1:90)(3:335|(3:338|(1:340)(1:341)|336)|342)|(1:92)(1:334)|93|(10:95|(2:97|(1:99)(1:100))|101|(1:103)|104|(2:106|(4:108|109|(1:111)|(39:329|113|(1:115)|116|(1:118)(2:324|(1:326)(1:327))|119|(1:121)|122|(2:321|(22:323|(1:141)|142|(1:144)|145|(2:271|(4:277|(2:284|(2:285|(1:292)(2:287|(2:289|290)(1:291))))(0)|293|(13:302|151|(3:267|(1:269)|270)|155|(1:157)|158|(1:162)|163|(3:165|(7:167|(1:169)(1:202)|170|(1:172)|173|(4:177|(1:179)|180|(1:182))|183)(1:203)|184)(21:204|(2:206|(10:265|230|(1:232)|233|234|235|236|237|238|(5:244|(1:246)(1:254)|(1:250)|(1:252)|253)))(1:266)|210|(4:212|(2:215|(2:217|218))|263|218)(1:264)|(5:220|(1:222)(1:261)|223|(1:225)|226)(1:262)|227|(1:229)(1:260)|230|(0)|233|234|235|236|237|238|(2:240|242)|244|(0)(0)|(2:248|250)|(0)|253)|185|(3:187|(1:189)(1:198)|(5:191|(1:193)|194|(1:196)|197))|199|200))(1:276))(1:149)|150|151|(1:153)|267|(0)|270|155|(0)|158|(2:160|162)|163|(0)(0)|185|(0)|199|200))(1:125)|126|(3:303|304|(3:313|(3:316|(1:318)(1:319)|314)|320))(1:138)|139|(0)|142|(0)|145|(1:147)|271|(1:274)|277|(4:280|282|284|(3:285|(0)(0)|291))(0)|293|(19:296|298|300|302|151|(0)|267|(0)|270|155|(0)|158|(0)|163|(0)(0)|185|(0)|199|200)|150|151|(0)|267|(0)|270|155|(0)|158|(0)|163|(0)(0)|185|(0)|199|200)(38:330|122|(0)|321|(0)|126|(4:128|130|132|136)|303|304|(6:306|309|311|313|(1:314)|320)|139|(0)|142|(0)|145|(0)|271|(0)|277|(0)(0)|293|(0)|150|151|(0)|267|(0)|270|155|(0)|158|(0)|163|(0)(0)|185|(0)|199|200)))|331|109|(0)|(0)(0))(2:332|333))|343|(0)(0)|93|(0)(0)))|86|(0)|343|(0)(0)|93|(0)(0)))|84|(0)|86|(0)|343|(0)(0)|93|(0)(0)))|366|36|(0)(0)|51|(0)|54|55|(0)(0)|58|(7:60|62|(0)(0)|65|(0)|71|69)|(0)|80|81|(0)(0)|84|(0)|86|(0)|343|(0)(0)|93|(0)(0))))|373|374|375|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0493, code lost:
    
        if (r4.f1() == 1) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x096c, code lost:
    
        r2 = r22;
        r0 = r2.f7652p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0978, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.november()) == false) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x097a, code lost:
    
        com.google.android.gms.measurement.internal.G.foxtrot(r21);
        r6 = r21;
        r6.f7632b.alpha("Remote config removed with active feature rollouts");
        r11 = null;
        r0.oscar(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x098b, code lost:
    
        r6 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x02e3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0302, code lost:
    
        com.google.android.gms.measurement.internal.G.foxtrot(r15);
        r15.white.charlie(com.google.android.gms.measurement.internal.ar.e0(r8), r0, "Fetching Google App Id failed with exception. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x01b7, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0644 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0668 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0699 A[EDGE_INSN: B:292:0x0699->B:293:0x0699 BREAK  A[LOOP:0: B:285:0x0684->B:291:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0344 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x019a A[Catch: NameNotFoundException -> 0x01b7, TryCatch #1 {NameNotFoundException -> 0x01b7, blocks: (B:375:0x018f, B:377:0x019a, B:379:0x01a6), top: B:374:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ba A[Catch: IllegalStateException -> 0x02e3, TryCatch #3 {IllegalStateException -> 0x02e3, blocks: (B:55:0x02a5, B:58:0x02b1, B:60:0x02ba, B:62:0x02c0, B:65:0x02cf, B:68:0x02da, B:69:0x02e0, B:72:0x02cb, B:74:0x02e7, B:76:0x02f8, B:77:0x02fd, B:79:0x02fb), top: B:54:0x02a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cb A[Catch: IllegalStateException -> 0x02e3, TryCatch #3 {IllegalStateException -> 0x02e3, blocks: (B:55:0x02a5, B:58:0x02b1, B:60:0x02ba, B:62:0x02c0, B:65:0x02cf, B:68:0x02da, B:69:0x02e0, B:72:0x02cb, B:74:0x02e7, B:76:0x02f8, B:77:0x02fd, B:79:0x02fb), top: B:54:0x02a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e7 A[Catch: IllegalStateException -> 0x02e3, TryCatch #3 {IllegalStateException -> 0x02e3, blocks: (B:55:0x02a5, B:58:0x02b1, B:60:0x02ba, B:62:0x02c0, B:65:0x02cf, B:68:0x02da, B:69:0x02e0, B:72:0x02cb, B:74:0x02e7, B:76:0x02f8, B:77:0x02fd, B:79:0x02fb), top: B:54:0x02a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03c3  */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, C2.d] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.measurement.internal.m, com.google.android.gms.measurement.internal.P] */
    /* JADX WARN: Type inference failed for: r0v44, types: [com.google.android.gms.measurement.internal.z, com.google.android.gms.measurement.internal.s0, G3.a] */
    /* JADX WARN: Type inference failed for: r2v29, types: [com.google.android.gms.measurement.internal.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void echo() {
        long j5;
        boolean z2;
        aj ajVar;
        C1440e c1440e;
        String str;
        PackageManager packageManager;
        int i4;
        String str2;
        PackageInfo packageInfo;
        ab abVar;
        C1440e c1440e2;
        boolean z10;
        int golf;
        String str3;
        boolean z11;
        int i5;
        Bundle f02;
        Integer valueOf;
        String[] stringArray;
        List<String> asList;
        ?? abstractC1481z;
        boolean z12;
        long j6;
        S g02;
        S s3;
        d1 d1Var;
        V v4;
        boolean z13;
        S g03;
        S g04;
        G g2;
        Bundle bundle;
        Boolean delta;
        boolean z14;
        final C1459n0 c1459n0;
        Bundle bundle2;
        Iterator it;
        Boolean h02;
        long alpha;
        F f5;
        d1 d1Var2;
        String str4;
        C1459n0 c1459n02;
        ax axVar;
        ar arVar;
        a4.j jVar;
        G g5;
        ax axVar2;
        ar arVar2;
        boolean alpha2;
        SharedPreferences sharedPreferences;
        boolean contains;
        boolean V02;
        String str5;
        Boolean bool;
        boolean z15;
        a4.j jVar2;
        Bundle bundle3;
        Iterator it2;
        int i10;
        String golf2;
        String str6;
        int identifier;
        String str7;
        String str8;
        G g10 = (G) this.red;
        E e = g10.f7508c;
        G.foxtrot(e);
        e.W();
        C1440e c1440e3 = g10.yellow;
        ((G) c1440e3.alpha).getClass();
        ?? p4 = new P(g10);
        p4.Z();
        g10.f7519o = p4;
        Y y10 = (Y) this.purple;
        zzdh zzdhVar = y10.golf;
        if (zzdhVar == null) {
            j5 = 0;
        } else {
            j5 = zzdhVar.alpha;
        }
        aj ajVar2 = new aj(g10, y10.foxtrot, j5);
        ajVar2.Y();
        g10.f7520p = ajVar2;
        al alVar = new al(g10);
        alVar.Y();
        g10.f7517m = alVar;
        H0 h03 = new H0(g10);
        h03.Y();
        g10.f7518n = h03;
        d1 d1Var3 = g10.e;
        if (!d1Var3.purple) {
            d1Var3.W();
            SecureRandom secureRandom = new SecureRandom();
            long nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                nextLong = secureRandom.nextLong();
                if (nextLong == 0) {
                    ar arVar3 = ((G) d1Var3.alpha).f7507b;
                    G.foxtrot(arVar3);
                    arVar3.f7632b.alpha("Utils falling back to Random for random id");
                }
            }
            d1Var3.silver.set(nextLong);
            G g11 = (G) d1Var3.alpha;
            g11.f7529y.incrementAndGet();
            d1Var3.purple = true;
            ax axVar3 = g10.f7506a;
            if (!axVar3.purple) {
                SharedPreferences sharedPreferences2 = ((G) axVar3.alpha).alpha.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                axVar3.red = sharedPreferences2;
                boolean z16 = sharedPreferences2.getBoolean("has_been_opened", false);
                axVar3.f7648l = z16;
                if (!z16) {
                    SharedPreferences.Editor edit = axVar3.red.edit();
                    edit.putBoolean("has_been_opened", true);
                    edit.apply();
                }
                long max = Math.max(0L, ((Long) ac.delta.alpha(null)).longValue());
                ?? obj = new Object();
                obj.teal = axVar3;
                x.echo("health_monitor");
                if (max > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                x.bravo(z2);
                obj.purple = "health_monitor:start";
                obj.red = "health_monitor:count";
                obj.silver = "health_monitor:value";
                obj.alpha = max;
                axVar3.white = obj;
                ((G) axVar3.alpha).f7529y.incrementAndGet();
                axVar3.purple = true;
                aj ajVar3 = g10.f7520p;
                if (!ajVar3.purple) {
                    G g12 = (G) ajVar3.alpha;
                    ar arVar4 = g12.f7507b;
                    G.foxtrot(arVar4);
                    arVar4.f7636g.charlie(Long.valueOf(ajVar3.f7623c), Long.valueOf(ajVar3.f7622b), "sdkVersion bundled with app, dynamiteVersion");
                    Context context = g12.alpha;
                    String packageName = context.getPackageName();
                    PackageManager packageManager2 = context.getPackageManager();
                    ar arVar5 = g12.f7507b;
                    String str9 = "Unknown";
                    String str10 = "";
                    String str11 = "unknown";
                    if (packageManager2 == null) {
                        G.foxtrot(arVar5);
                        ajVar = ajVar2;
                        c1440e = c1440e3;
                        arVar5.white.bravo(ar.e0(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                    } else {
                        ajVar = ajVar2;
                        c1440e = c1440e3;
                        try {
                            str11 = packageManager2.getInstallerPackageName(packageName);
                        } catch (IllegalArgumentException unused) {
                            G.foxtrot(arVar5);
                            arVar5.white.bravo(ar.e0(packageName), "Error retrieving app installer package name. appId");
                        }
                        String str12 = str11;
                        if (str12 == null) {
                            str12 = "manual_install";
                        } else if ("com.android.vending".equals(str12)) {
                            str11 = "";
                            packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
                            if (packageInfo != null) {
                                CharSequence applicationLabel = packageManager2.getApplicationLabel(packageInfo.applicationInfo);
                                if (!TextUtils.isEmpty(applicationLabel)) {
                                    str = applicationLabel.toString();
                                } else {
                                    str = str9;
                                }
                                try {
                                    str2 = packageInfo.versionName;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                }
                                try {
                                    i4 = packageInfo.versionCode;
                                    packageManager = packageManager2;
                                } catch (PackageManager.NameNotFoundException unused3) {
                                    str9 = str2;
                                    G.foxtrot(arVar5);
                                    packageManager = packageManager2;
                                    arVar5.white.charlie(ar.e0(packageName), str, "Error retrieving package info. appId, appName");
                                    i4 = Integer.MIN_VALUE;
                                    str2 = str9;
                                    String str13 = str11;
                                    ajVar3.red = packageName;
                                    ajVar3.white = str13;
                                    ajVar3.silver = str2;
                                    ajVar3.teal = i4;
                                    ajVar3.yellow = str;
                                    ajVar3.f7621a = 0L;
                                    abVar = ac.f7601i0;
                                    c1440e2 = g12.yellow;
                                    if (!c1440e2.j0(null, abVar)) {
                                    }
                                    z10 = false;
                                    golf = g12.golf();
                                    str3 = g12.f7516l;
                                    if (golf == 0) {
                                    }
                                    ajVar3.f7626g = "";
                                    ajVar3.f7627h = "";
                                    if (z11) {
                                    }
                                    golf2 = W.golf(context, str3);
                                    if (TextUtils.isEmpty(golf2)) {
                                    }
                                    ajVar3.f7626g = str10;
                                    if (!c1440e2.j0(null, abVar)) {
                                    }
                                    if (i5 == 0) {
                                    }
                                    ajVar3.f7624d = null;
                                    c1440e2.getClass();
                                    x.echo("analytics.safelisted_events");
                                    f02 = c1440e2.f0();
                                    G g13 = (G) c1440e2.alpha;
                                    if (f02 != null) {
                                    }
                                    valueOf = null;
                                    if (valueOf != null) {
                                    }
                                    asList = null;
                                    if (asList != null) {
                                    }
                                    ajVar3.f7624d = asList;
                                    if (packageManager != null) {
                                    }
                                    ((G) ajVar3.alpha).f7529y.incrementAndGet();
                                    ajVar3.purple = true;
                                    abstractC1481z = new AbstractC1481z(g10);
                                    abstractC1481z.Y();
                                    g10.f7521q = abstractC1481z;
                                    if (!abstractC1481z.purple) {
                                    }
                                }
                                String str132 = str11;
                                ajVar3.red = packageName;
                                ajVar3.white = str132;
                                ajVar3.silver = str2;
                                ajVar3.teal = i4;
                                ajVar3.yellow = str;
                                ajVar3.f7621a = 0L;
                                abVar = ac.f7601i0;
                                c1440e2 = g12.yellow;
                                if (!c1440e2.j0(null, abVar) && !TextUtils.isEmpty(g12.november())) {
                                    if (!c1440e2.j0(null, abVar)) {
                                        str8 = null;
                                    } else {
                                        str8 = g12.red;
                                    }
                                    if ("am".equals(str8)) {
                                        z10 = true;
                                        golf = g12.golf();
                                        str3 = g12.f7516l;
                                        if (golf == 0) {
                                            z11 = z10;
                                            if (golf != 1) {
                                                if (golf != 3) {
                                                    if (golf != 4) {
                                                        if (golf != 6) {
                                                            if (golf != 7) {
                                                                if (golf != 8) {
                                                                    G.foxtrot(arVar5);
                                                                    i5 = golf;
                                                                    arVar5.e.alpha("App measurement disabled");
                                                                    G.foxtrot(arVar5);
                                                                    arVar5.yellow.alpha("Invalid scion state in identity");
                                                                } else {
                                                                    i5 = golf;
                                                                    G.foxtrot(arVar5);
                                                                    arVar5.e.alpha("App measurement disabled due to denied storage consent");
                                                                }
                                                            } else {
                                                                i5 = golf;
                                                                G.foxtrot(arVar5);
                                                                arVar5.e.alpha("App measurement disabled via the global data collection setting");
                                                            }
                                                        } else {
                                                            i5 = golf;
                                                            G.foxtrot(arVar5);
                                                            arVar5.f7634d.alpha("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                                        }
                                                    } else {
                                                        i5 = golf;
                                                        G.foxtrot(arVar5);
                                                        arVar5.e.alpha("App measurement disabled via the manifest");
                                                    }
                                                } else {
                                                    i5 = golf;
                                                    G.foxtrot(arVar5);
                                                    arVar5.e.alpha("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                                }
                                            } else {
                                                i5 = golf;
                                                G.foxtrot(arVar5);
                                                arVar5.e.alpha("App measurement deactivated via the manifest");
                                            }
                                        } else {
                                            z11 = z10;
                                            i5 = golf;
                                            G.foxtrot(arVar5);
                                            arVar5.f7636g.alpha("App measurement collection enabled");
                                        }
                                        ajVar3.f7626g = "";
                                        ajVar3.f7627h = "";
                                        if (z11) {
                                            ajVar3.f7627h = g12.november();
                                        }
                                        golf2 = W.golf(context, str3);
                                        if (TextUtils.isEmpty(golf2)) {
                                            str10 = golf2;
                                        }
                                        ajVar3.f7626g = str10;
                                        if (!c1440e2.j0(null, abVar) && !TextUtils.isEmpty(golf2)) {
                                            Resources resources = context.getResources();
                                            if (!TextUtils.isEmpty(str3)) {
                                                str3 = W.bravo(context);
                                            }
                                            identifier = resources.getIdentifier("admob_app_id", CTVariableUtils.STRING, str3);
                                            if (identifier != 0) {
                                                try {
                                                    str7 = resources.getString(identifier);
                                                } catch (Resources.NotFoundException unused4) {
                                                    str7 = null;
                                                }
                                                ajVar3.f7627h = str7;
                                            }
                                            str7 = null;
                                            ajVar3.f7627h = str7;
                                        }
                                        if (i5 == 0) {
                                            G.foxtrot(arVar5);
                                            a4.j jVar3 = arVar5.f7636g;
                                            String str14 = ajVar3.red;
                                            if (TextUtils.isEmpty(ajVar3.f7626g)) {
                                                str6 = ajVar3.f7627h;
                                            } else {
                                                str6 = ajVar3.f7626g;
                                            }
                                            jVar3.charlie(str14, str6, "App measurement enabled for app package, google app id");
                                        }
                                        ajVar3.f7624d = null;
                                        c1440e2.getClass();
                                        x.echo("analytics.safelisted_events");
                                        f02 = c1440e2.f0();
                                        G g132 = (G) c1440e2.alpha;
                                        if (f02 != null) {
                                            ar arVar6 = g132.f7507b;
                                            G.foxtrot(arVar6);
                                            arVar6.white.alpha("Failed to load metadata: Metadata bundle is null");
                                        } else if (f02.containsKey("analytics.safelisted_events")) {
                                            valueOf = Integer.valueOf(f02.getInt("analytics.safelisted_events"));
                                            if (valueOf != null) {
                                                try {
                                                    stringArray = g132.alpha.getResources().getStringArray(valueOf.intValue());
                                                } catch (Resources.NotFoundException e4) {
                                                    ar arVar7 = g132.f7507b;
                                                    G.foxtrot(arVar7);
                                                    arVar7.white.bravo(e4, "Failed to load string array from metadata: resource not found");
                                                }
                                                if (stringArray != null) {
                                                    asList = Arrays.asList(stringArray);
                                                    if (asList != null) {
                                                        if (asList.isEmpty()) {
                                                            G.foxtrot(arVar5);
                                                            arVar5.f7634d.alpha("Safelisted event list is empty. Ignoring");
                                                        } else {
                                                            for (String str15 : asList) {
                                                                d1 d1Var4 = g12.e;
                                                                G.delta(d1Var4);
                                                                if (!d1Var4.J0("safelisted event", str15)) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        if (packageManager != null) {
                                                            ajVar3.f7625f = AbstractC1753a.alpha(context) ? 1 : 0;
                                                        } else {
                                                            ajVar3.f7625f = 0;
                                                        }
                                                        ((G) ajVar3.alpha).f7529y.incrementAndGet();
                                                        ajVar3.purple = true;
                                                        abstractC1481z = new AbstractC1481z(g10);
                                                        abstractC1481z.Y();
                                                        g10.f7521q = abstractC1481z;
                                                        if (!abstractC1481z.purple) {
                                                            abstractC1481z.red = (JobScheduler) ((G) abstractC1481z.alpha).alpha.getSystemService("jobscheduler");
                                                            ((G) abstractC1481z.alpha).f7529y.incrementAndGet();
                                                            abstractC1481z.purple = true;
                                                            ar arVar8 = g10.f7507b;
                                                            G.foxtrot(arVar8);
                                                            c1440e.d0();
                                                            a4.j jVar4 = arVar8.e;
                                                            jVar4.bravo(119002L, "App measurement initialized, version");
                                                            G.foxtrot(arVar8);
                                                            jVar4.alpha("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                                            String c02 = ajVar.c0();
                                                            C1440e c1440e4 = c1440e;
                                                            if (TextUtils.isEmpty(g10.purple)) {
                                                                if (d1Var3.M0(c02, c1440e4.red)) {
                                                                    G.foxtrot(arVar8);
                                                                    jVar4.alpha("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                                                } else {
                                                                    G.foxtrot(arVar8);
                                                                    jVar4.alpha("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(c02)));
                                                                }
                                                            }
                                                            G.foxtrot(arVar8);
                                                            a4.j jVar5 = arVar8.f7635f;
                                                            jVar5.alpha("Debug-level message logging enabled");
                                                            int i11 = g10.f7527w;
                                                            AtomicInteger atomicInteger = g10.f7529y;
                                                            int i12 = atomicInteger.get();
                                                            a4.j jVar6 = arVar8.white;
                                                            if (i11 != i12) {
                                                                G.foxtrot(arVar8);
                                                                jVar6.charlie(Integer.valueOf(g10.f7527w), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                                                            }
                                                            g10.f7522r = true;
                                                            E e5 = g10.f7508c;
                                                            G.foxtrot(e5);
                                                            e5.W();
                                                            ab abVar2 = ac.f7570K;
                                                            if (c1440e4.j0(null, abVar2)) {
                                                                G.charlie(g10.f7521q);
                                                                if (g10.f7521q.a0() == 2) {
                                                                    z12 = true;
                                                                    C1317f3.bravo();
                                                                    if (c1440e4.j0(null, ac.f7575P)) {
                                                                        d1Var3.W();
                                                                    }
                                                                    if (!z12) {
                                                                        z12 = true;
                                                                        d1Var3.W();
                                                                        IntentFilter intentFilter = new IntentFilter();
                                                                        j6 = 1;
                                                                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                                                        if (g11.yellow.j0(null, abVar2)) {
                                                                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                        }
                                                                        v vVar = new v(g11);
                                                                        int i13 = Build.VERSION.SDK_INT;
                                                                        Context context2 = g11.alpha;
                                                                        if (i13 >= 33) {
                                                                            AbstractC1733b.bravo(context2, vVar, intentFilter);
                                                                        } else if (i13 >= 26) {
                                                                            AbstractC1733b.alpha(context2, vVar, intentFilter);
                                                                        } else {
                                                                            context2.registerReceiver(vVar, intentFilter, null, null);
                                                                        }
                                                                        ar arVar9 = g11.f7507b;
                                                                        G.foxtrot(arVar9);
                                                                        arVar9.f7635f.alpha("Registered app receiver");
                                                                        if (z12) {
                                                                            G.charlie(g10.f7521q);
                                                                            g10.f7521q.b0(((Long) ac.beige.alpha(null)).longValue());
                                                                        }
                                                                        V d02 = axVar3.d0();
                                                                        g02 = c1440e4.g0("google_analytics_default_allow_ad_storage", false);
                                                                        S g05 = c1440e4.g0("google_analytics_default_allow_analytics_storage", false);
                                                                        s3 = S.UNINITIALIZED;
                                                                        U u4 = U.ANALYTICS_STORAGE;
                                                                        zzdh zzdhVar2 = y10.golf;
                                                                        C1459n0 c1459n03 = g10.f7513i;
                                                                        if (g02 != s3 && g05 == s3) {
                                                                            d1Var = d1Var3;
                                                                        } else {
                                                                            d1Var = d1Var3;
                                                                            if (V.lima(-10, axVar3.b0().getInt("consent_source", 100))) {
                                                                                EnumMap enumMap = new EnumMap(U.class);
                                                                                enumMap.put((EnumMap) U.AD_STORAGE, (U) g02);
                                                                                enumMap.put((EnumMap) u4, (U) g05);
                                                                                v4 = new V(enumMap, -10);
                                                                                z13 = false;
                                                                                if (v4 != null) {
                                                                                    G.echo(c1459n03);
                                                                                    c1459n03.p0(v4, true);
                                                                                    d02 = v4;
                                                                                }
                                                                                G.echo(c1459n03);
                                                                                c1459n03.o0(d02);
                                                                                axVar3.W();
                                                                                int i14 = C1454l.bravo(axVar3.b0().getString("dma_consent_settings", null)).alpha;
                                                                                g03 = c1440e4.g0("google_analytics_default_allow_ad_personalization_signals", true);
                                                                                a4.j jVar7 = arVar8.f7636g;
                                                                                if (g03 != s3) {
                                                                                    G.foxtrot(arVar8);
                                                                                    jVar7.bravo(g03, "Default ad personalization consent from Manifest");
                                                                                }
                                                                                g04 = c1440e4.g0("google_analytics_default_allow_ad_user_data", true);
                                                                                g2 = (G) c1459n03.alpha;
                                                                                if (g04 == s3 && V.lima(-10, i14)) {
                                                                                    G.echo(c1459n03);
                                                                                    EnumMap enumMap2 = new EnumMap(U.class);
                                                                                    enumMap2.put((EnumMap) U.AD_USER_DATA, (U) g04);
                                                                                    c1459n03.n0(new C1454l(enumMap2, -10, (Boolean) null, (String) null), true);
                                                                                } else if (TextUtils.isEmpty(g10.india().d0()) && (i14 == 0 || i14 == 30)) {
                                                                                    G.echo(c1459n03);
                                                                                    c1459n03.n0(new C1454l((Boolean) null, -10, (Boolean) null, (String) null), true);
                                                                                } else {
                                                                                    if (TextUtils.isEmpty(g10.india().d0()) && zzdhVar2 != null && (bundle2 = zzdhVar2.yellow) != null && V.lima(30, i14)) {
                                                                                        C1454l alpha3 = C1454l.alpha(30, bundle2);
                                                                                        it = alpha3.echo.values().iterator();
                                                                                        while (true) {
                                                                                            if (!it.hasNext()) {
                                                                                                break;
                                                                                            }
                                                                                            if (((S) it.next()) != s3) {
                                                                                                G.echo(c1459n03);
                                                                                                c1459n03.n0(alpha3, true);
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (TextUtils.isEmpty(g10.india().d0()) && zzdhVar2 != null && (bundle = zzdhVar2.yellow) != null && axVar3.f7643g.november() == null && (delta = C1454l.delta(bundle)) != null) {
                                                                                        G.echo(c1459n03);
                                                                                        String bool2 = delta.toString();
                                                                                        g2.f7511g.getClass();
                                                                                        z14 = z13;
                                                                                        c1459n03.q0(zzdhVar2.teal, "allow_personalized_ads", bool2, z14, System.currentTimeMillis());
                                                                                        c1459n0 = c1459n03;
                                                                                        h02 = c1440e4.h0("google_analytics_tcf_data_enabled");
                                                                                        if (h02 != null || h02.booleanValue()) {
                                                                                            G.foxtrot(arVar8);
                                                                                            jVar5.alpha("TCF client enabled.");
                                                                                            G.echo(c1459n0);
                                                                                            c1459n0.W();
                                                                                            ar arVar10 = g2.f7507b;
                                                                                            G.foxtrot(arVar10);
                                                                                            arVar10.f7635f.alpha("Register tcfPrefChangeListener.");
                                                                                            if (c1459n0.f7685n == null) {
                                                                                                c1459n0.f7686o = new C1443f0(c1459n0, g2, 2);
                                                                                                c1459n0.f7685n = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.e0
                                                                                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                                                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str16) {
                                                                                                        C1459n0 c1459n04 = C1459n0.this;
                                                                                                        G g14 = (G) c1459n04.alpha;
                                                                                                        boolean j02 = g14.yellow.j0(null, ac.f7590c0);
                                                                                                        ar arVar11 = g14.f7507b;
                                                                                                        if (!j02) {
                                                                                                            if (Objects.equals(str16, "IABTCF_TCString")) {
                                                                                                                G.foxtrot(arVar11);
                                                                                                                arVar11.f7636g.alpha("IABTCF_TCString change picked up in listener.");
                                                                                                                C1443f0 c1443f0 = c1459n04.f7686o;
                                                                                                                V5.x.hotel(c1443f0);
                                                                                                                c1443f0.charlie(500L);
                                                                                                                return;
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                        if (!Objects.equals(str16, "IABTCF_TCString") && !Objects.equals(str16, "IABTCF_gdprApplies") && !Objects.equals(str16, "IABTCF_EnableAdvertiserConsentMode")) {
                                                                                                            return;
                                                                                                        }
                                                                                                        G.foxtrot(arVar11);
                                                                                                        arVar11.f7636g.alpha("IABTCF_TCString change picked up in listener.");
                                                                                                        C1443f0 c1443f02 = c1459n04.f7686o;
                                                                                                        V5.x.hotel(c1443f02);
                                                                                                        c1443f02.charlie(500L);
                                                                                                    }
                                                                                                };
                                                                                            }
                                                                                            ax axVar4 = g2.f7506a;
                                                                                            G.delta(axVar4);
                                                                                            axVar4.a0().registerOnSharedPreferenceChangeListener(c1459n0.f7685n);
                                                                                            G.echo(c1459n0);
                                                                                            c1459n0.f0();
                                                                                        }
                                                                                        aw awVar = axVar3.yellow;
                                                                                        alpha = awVar.alpha();
                                                                                        long j7 = g10.f7530z;
                                                                                        if (alpha == 0) {
                                                                                            G.foxtrot(arVar8);
                                                                                            jVar7.bravo(Long.valueOf(j7), "Persisting first open");
                                                                                            awVar.bravo(j7);
                                                                                        }
                                                                                        G.echo(c1459n0);
                                                                                        f5 = c1459n0.f7682k;
                                                                                        if (f5.charlie() && f5.delta()) {
                                                                                            ax axVar5 = f5.alpha.f7506a;
                                                                                            G.delta(axVar5);
                                                                                            axVar5.f7653q.oscar(null);
                                                                                        }
                                                                                        if (!g10.bravo()) {
                                                                                            if (g10.alpha()) {
                                                                                                d1Var2 = d1Var;
                                                                                                if (!d1Var2.L0("android.permission.INTERNET")) {
                                                                                                    G.foxtrot(arVar8);
                                                                                                    jVar2 = jVar6;
                                                                                                    jVar2.alpha("App is missing INTERNET permission");
                                                                                                } else {
                                                                                                    jVar2 = jVar6;
                                                                                                }
                                                                                                if (!d1Var2.L0("android.permission.ACCESS_NETWORK_STATE")) {
                                                                                                    G.foxtrot(arVar8);
                                                                                                    jVar2.alpha("App is missing ACCESS_NETWORK_STATE permission");
                                                                                                }
                                                                                                Context context3 = g10.alpha;
                                                                                                if (!C1754b.alpha(context3).foxtrot() && !c1440e4.Z()) {
                                                                                                    if (!d1.S0(context3)) {
                                                                                                        G.foxtrot(arVar8);
                                                                                                        jVar2.alpha("AppMeasurementReceiver not registered/enabled");
                                                                                                    }
                                                                                                    if (!d1.U0(context3)) {
                                                                                                        G.foxtrot(arVar8);
                                                                                                        jVar2.alpha("AppMeasurementService not registered/enabled");
                                                                                                    }
                                                                                                }
                                                                                                G.foxtrot(arVar8);
                                                                                                jVar2.alpha("Uploading is not possible. App measurement disabled");
                                                                                            } else {
                                                                                                d1Var2 = d1Var;
                                                                                            }
                                                                                            arVar2 = arVar8;
                                                                                            g5 = g2;
                                                                                            jVar = jVar7;
                                                                                            axVar2 = axVar3;
                                                                                        } else {
                                                                                            d1Var2 = d1Var;
                                                                                            boolean isEmpty = TextUtils.isEmpty(g10.india().d0());
                                                                                            C3.d dVar = axVar3.f7638a;
                                                                                            if (isEmpty) {
                                                                                                str4 = null;
                                                                                                if (c1440e4.j0(null, ac.f7601i0) || TextUtils.isEmpty(g10.india().b0())) {
                                                                                                    arVar = arVar8;
                                                                                                    c1459n02 = c1459n0;
                                                                                                    g5 = g2;
                                                                                                    jVar = jVar7;
                                                                                                    axVar = axVar3;
                                                                                                    if (!axVar.d0().kilo(u4)) {
                                                                                                        dVar.oscar(null);
                                                                                                    }
                                                                                                    G.echo(c1459n02);
                                                                                                    c1459n0 = c1459n02;
                                                                                                    c1459n0.yellow.set(dVar.november());
                                                                                                    g11.alpha.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                                                                                    arVar2 = arVar;
                                                                                                    axVar2 = axVar;
                                                                                                    String str16 = null;
                                                                                                    if (TextUtils.isEmpty(g10.india().d0()) || (!c1440e4.j0(str16, ac.f7601i0) && !TextUtils.isEmpty(g10.india().b0()))) {
                                                                                                        alpha2 = g10.alpha();
                                                                                                        sharedPreferences = axVar2.red;
                                                                                                        if (sharedPreferences != null) {
                                                                                                            contains = z14;
                                                                                                        } else {
                                                                                                            contains = sharedPreferences.contains("deferred_analytics_collection");
                                                                                                        }
                                                                                                        if (!contains && !c1440e4.X()) {
                                                                                                            axVar2.e0(!alpha2);
                                                                                                        }
                                                                                                        if (alpha2) {
                                                                                                            G.echo(c1459n0);
                                                                                                            c1459n0.b0();
                                                                                                        }
                                                                                                        O0 o02 = g10.f7509d;
                                                                                                        G.echo(o02);
                                                                                                        o02.teal.blue();
                                                                                                        g10.mike().c0(new AtomicReference());
                                                                                                        g10.mike().f0(axVar2.f7655s.tango());
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                str4 = null;
                                                                                            }
                                                                                            ab abVar3 = ac.f7601i0;
                                                                                            if (c1440e4.j0(str4, abVar3)) {
                                                                                                g5 = g2;
                                                                                                String d03 = g10.india().d0();
                                                                                                axVar3.W();
                                                                                                jVar = jVar7;
                                                                                                arVar = arVar8;
                                                                                                String string = axVar3.b0().getString("gmp_app_id", null);
                                                                                                boolean isEmpty2 = TextUtils.isEmpty(d03);
                                                                                                boolean isEmpty3 = TextUtils.isEmpty(string);
                                                                                                if (!isEmpty2 && !isEmpty3) {
                                                                                                    x.hotel(d03);
                                                                                                    if (!d03.equals(string)) {
                                                                                                        V02 = true;
                                                                                                        c1459n02 = c1459n0;
                                                                                                        axVar = axVar3;
                                                                                                    }
                                                                                                }
                                                                                                V02 = false;
                                                                                                c1459n02 = c1459n0;
                                                                                                axVar = axVar3;
                                                                                            } else {
                                                                                                arVar = arVar8;
                                                                                                g5 = g2;
                                                                                                jVar = jVar7;
                                                                                                String d04 = g10.india().d0();
                                                                                                axVar3.W();
                                                                                                String string2 = axVar3.b0().getString("gmp_app_id", null);
                                                                                                String b02 = g10.india().b0();
                                                                                                axVar3.W();
                                                                                                axVar = axVar3;
                                                                                                c1459n02 = c1459n0;
                                                                                                V02 = d1Var2.V0(d04, string2, b02, axVar.b0().getString("admob_app_id", null));
                                                                                            }
                                                                                            if (V02) {
                                                                                                G.foxtrot(arVar);
                                                                                                jVar4.alpha("Rechecking which service to use due to a GMP App Id change");
                                                                                                axVar.W();
                                                                                                axVar.W();
                                                                                                if (axVar.b0().contains("measurement_enabled")) {
                                                                                                    bool = Boolean.valueOf(axVar.b0().getBoolean("measurement_enabled", true));
                                                                                                } else {
                                                                                                    bool = null;
                                                                                                }
                                                                                                SharedPreferences.Editor edit2 = axVar.b0().edit();
                                                                                                edit2.clear();
                                                                                                edit2.apply();
                                                                                                if (bool != null) {
                                                                                                    axVar.W();
                                                                                                    SharedPreferences.Editor edit3 = axVar.b0().edit();
                                                                                                    edit3.putBoolean("measurement_enabled", bool.booleanValue());
                                                                                                    edit3.apply();
                                                                                                }
                                                                                                g10.juliet().b0();
                                                                                                g10.f7518n.b0();
                                                                                                g10.f7518n.a0();
                                                                                                awVar.bravo(j7);
                                                                                                str5 = null;
                                                                                                dVar.oscar(null);
                                                                                            } else {
                                                                                                str5 = null;
                                                                                            }
                                                                                            String d05 = g10.india().d0();
                                                                                            axVar.W();
                                                                                            SharedPreferences.Editor edit4 = axVar.b0().edit();
                                                                                            edit4.putString("gmp_app_id", d05);
                                                                                            edit4.apply();
                                                                                            if (c1440e4.j0(str5, abVar3)) {
                                                                                                axVar.W();
                                                                                                SharedPreferences.Editor edit5 = axVar.b0().edit();
                                                                                                edit5.putString("admob_app_id", str5);
                                                                                                edit5.apply();
                                                                                            } else {
                                                                                                String b03 = g10.india().b0();
                                                                                                axVar.W();
                                                                                                SharedPreferences.Editor edit6 = axVar.b0().edit();
                                                                                                edit6.putString("admob_app_id", b03);
                                                                                                edit6.apply();
                                                                                            }
                                                                                            if (!axVar.d0().kilo(u4)) {
                                                                                            }
                                                                                            G.echo(c1459n02);
                                                                                            c1459n0 = c1459n02;
                                                                                            c1459n0.yellow.set(dVar.november());
                                                                                            g11.alpha.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                                                                            arVar2 = arVar;
                                                                                            axVar2 = axVar;
                                                                                            String str162 = null;
                                                                                            if (TextUtils.isEmpty(g10.india().d0())) {
                                                                                            }
                                                                                            alpha2 = g10.alpha();
                                                                                            sharedPreferences = axVar2.red;
                                                                                            if (sharedPreferences != null) {
                                                                                            }
                                                                                            if (!contains) {
                                                                                                axVar2.e0(!alpha2);
                                                                                            }
                                                                                            if (alpha2) {
                                                                                            }
                                                                                            O0 o022 = g10.f7509d;
                                                                                            G.echo(o022);
                                                                                            o022.teal.blue();
                                                                                            g10.mike().c0(new AtomicReference());
                                                                                            g10.mike().f0(axVar2.f7655s.tango());
                                                                                        }
                                                                                        C1317f3.bravo();
                                                                                        if (c1440e4.j0(null, ac.f7575P)) {
                                                                                            d1Var2.W();
                                                                                            if (d1Var2.f1() == j6) {
                                                                                                z15 = true;
                                                                                            } else {
                                                                                                z15 = false;
                                                                                            }
                                                                                            if (z15) {
                                                                                                g10.f7511g.getClass();
                                                                                                long max2 = Math.max(500L, ((((Integer) ac.f7610p.alpha(null)).intValue() * 1000) + ad.tango(5000)) - SystemClock.elapsedRealtime());
                                                                                                if (max2 > 500) {
                                                                                                    G.foxtrot(arVar2);
                                                                                                    jVar.bravo(Long.valueOf(max2), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                                                                }
                                                                                                G.echo(c1459n0);
                                                                                                c1459n0.W();
                                                                                                if (c1459n0.e == null) {
                                                                                                    c1459n0.e = new C1443f0(c1459n0, g5, 0);
                                                                                                }
                                                                                                c1459n0.e.charlie(max2);
                                                                                            }
                                                                                        }
                                                                                        axVar2.f7645i.bravo(true);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                c1459n0 = c1459n03;
                                                                                z14 = z13;
                                                                                h02 = c1440e4.h0("google_analytics_tcf_data_enabled");
                                                                                if (h02 != null) {
                                                                                }
                                                                                G.foxtrot(arVar8);
                                                                                jVar5.alpha("TCF client enabled.");
                                                                                G.echo(c1459n0);
                                                                                c1459n0.W();
                                                                                ar arVar102 = g2.f7507b;
                                                                                G.foxtrot(arVar102);
                                                                                arVar102.f7635f.alpha("Register tcfPrefChangeListener.");
                                                                                if (c1459n0.f7685n == null) {
                                                                                }
                                                                                ax axVar42 = g2.f7506a;
                                                                                G.delta(axVar42);
                                                                                axVar42.a0().registerOnSharedPreferenceChangeListener(c1459n0.f7685n);
                                                                                G.echo(c1459n0);
                                                                                c1459n0.f0();
                                                                                aw awVar2 = axVar3.yellow;
                                                                                alpha = awVar2.alpha();
                                                                                long j72 = g10.f7530z;
                                                                                if (alpha == 0) {
                                                                                }
                                                                                G.echo(c1459n0);
                                                                                f5 = c1459n0.f7682k;
                                                                                if (f5.charlie()) {
                                                                                    ax axVar52 = f5.alpha.f7506a;
                                                                                    G.delta(axVar52);
                                                                                    axVar52.f7653q.oscar(null);
                                                                                }
                                                                                if (!g10.bravo()) {
                                                                                }
                                                                                C1317f3.bravo();
                                                                                if (c1440e4.j0(null, ac.f7575P)) {
                                                                                }
                                                                                axVar2.f7645i.bravo(true);
                                                                                return;
                                                                            }
                                                                        }
                                                                        if (!TextUtils.isEmpty(g10.india().d0()) || ((i10 = d02.bravo) != 0 && i10 != 30 && i10 != 10 && i10 != 30 && i10 != 30 && i10 != 40)) {
                                                                            z13 = false;
                                                                            if (!c1440e4.j0(null, ac.f7601i0) && TextUtils.isEmpty(g10.india().d0()) && zzdhVar2 != null && (bundle3 = zzdhVar2.yellow) != null && V.lima(30, axVar3.b0().getInt("consent_source", 100))) {
                                                                                v4 = V.delta(30, bundle3);
                                                                                it2 = v4.alpha.values().iterator();
                                                                                while (it2.hasNext()) {
                                                                                    if (((S) it2.next()) != s3) {
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            G.echo(c1459n03);
                                                                            z13 = false;
                                                                            c1459n03.p0(new V(-10), false);
                                                                        }
                                                                        v4 = null;
                                                                        if (v4 != null) {
                                                                        }
                                                                        G.echo(c1459n03);
                                                                        c1459n03.o0(d02);
                                                                        axVar3.W();
                                                                        int i142 = C1454l.bravo(axVar3.b0().getString("dma_consent_settings", null)).alpha;
                                                                        g03 = c1440e4.g0("google_analytics_default_allow_ad_personalization_signals", true);
                                                                        a4.j jVar72 = arVar8.f7636g;
                                                                        if (g03 != s3) {
                                                                        }
                                                                        g04 = c1440e4.g0("google_analytics_default_allow_ad_user_data", true);
                                                                        g2 = (G) c1459n03.alpha;
                                                                        if (g04 == s3) {
                                                                        }
                                                                        if (TextUtils.isEmpty(g10.india().d0())) {
                                                                        }
                                                                        if (TextUtils.isEmpty(g10.india().d0())) {
                                                                            C1454l alpha32 = C1454l.alpha(30, bundle2);
                                                                            it = alpha32.echo.values().iterator();
                                                                            while (true) {
                                                                                if (!it.hasNext()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        if (TextUtils.isEmpty(g10.india().d0())) {
                                                                            G.echo(c1459n03);
                                                                            String bool22 = delta.toString();
                                                                            g2.f7511g.getClass();
                                                                            z14 = z13;
                                                                            c1459n03.q0(zzdhVar2.teal, "allow_personalized_ads", bool22, z14, System.currentTimeMillis());
                                                                            c1459n0 = c1459n03;
                                                                            h02 = c1440e4.h0("google_analytics_tcf_data_enabled");
                                                                            if (h02 != null) {
                                                                            }
                                                                            G.foxtrot(arVar8);
                                                                            jVar5.alpha("TCF client enabled.");
                                                                            G.echo(c1459n0);
                                                                            c1459n0.W();
                                                                            ar arVar1022 = g2.f7507b;
                                                                            G.foxtrot(arVar1022);
                                                                            arVar1022.f7635f.alpha("Register tcfPrefChangeListener.");
                                                                            if (c1459n0.f7685n == null) {
                                                                            }
                                                                            ax axVar422 = g2.f7506a;
                                                                            G.delta(axVar422);
                                                                            axVar422.a0().registerOnSharedPreferenceChangeListener(c1459n0.f7685n);
                                                                            G.echo(c1459n0);
                                                                            c1459n0.f0();
                                                                            aw awVar22 = axVar3.yellow;
                                                                            alpha = awVar22.alpha();
                                                                            long j722 = g10.f7530z;
                                                                            if (alpha == 0) {
                                                                            }
                                                                            G.echo(c1459n0);
                                                                            f5 = c1459n0.f7682k;
                                                                            if (f5.charlie()) {
                                                                            }
                                                                            if (!g10.bravo()) {
                                                                            }
                                                                            C1317f3.bravo();
                                                                            if (c1440e4.j0(null, ac.f7575P)) {
                                                                            }
                                                                            axVar2.f7645i.bravo(true);
                                                                            return;
                                                                        }
                                                                        c1459n0 = c1459n03;
                                                                        z14 = z13;
                                                                        h02 = c1440e4.h0("google_analytics_tcf_data_enabled");
                                                                        if (h02 != null) {
                                                                        }
                                                                        G.foxtrot(arVar8);
                                                                        jVar5.alpha("TCF client enabled.");
                                                                        G.echo(c1459n0);
                                                                        c1459n0.W();
                                                                        ar arVar10222 = g2.f7507b;
                                                                        G.foxtrot(arVar10222);
                                                                        arVar10222.f7635f.alpha("Register tcfPrefChangeListener.");
                                                                        if (c1459n0.f7685n == null) {
                                                                        }
                                                                        ax axVar4222 = g2.f7506a;
                                                                        G.delta(axVar4222);
                                                                        axVar4222.a0().registerOnSharedPreferenceChangeListener(c1459n0.f7685n);
                                                                        G.echo(c1459n0);
                                                                        c1459n0.f0();
                                                                        aw awVar222 = axVar3.yellow;
                                                                        alpha = awVar222.alpha();
                                                                        long j7222 = g10.f7530z;
                                                                        if (alpha == 0) {
                                                                        }
                                                                        G.echo(c1459n0);
                                                                        f5 = c1459n0.f7682k;
                                                                        if (f5.charlie()) {
                                                                        }
                                                                        if (!g10.bravo()) {
                                                                        }
                                                                        C1317f3.bravo();
                                                                        if (c1440e4.j0(null, ac.f7575P)) {
                                                                        }
                                                                        axVar2.f7645i.bravo(true);
                                                                        return;
                                                                    }
                                                                    j6 = 1;
                                                                    V d022 = axVar3.d0();
                                                                    g02 = c1440e4.g0("google_analytics_default_allow_ad_storage", false);
                                                                    S g052 = c1440e4.g0("google_analytics_default_allow_analytics_storage", false);
                                                                    s3 = S.UNINITIALIZED;
                                                                    U u42 = U.ANALYTICS_STORAGE;
                                                                    zzdh zzdhVar22 = y10.golf;
                                                                    C1459n0 c1459n032 = g10.f7513i;
                                                                    if (g02 != s3) {
                                                                    }
                                                                    d1Var = d1Var3;
                                                                    if (V.lima(-10, axVar3.b0().getInt("consent_source", 100))) {
                                                                    }
                                                                    if (!TextUtils.isEmpty(g10.india().d0())) {
                                                                    }
                                                                    z13 = false;
                                                                    if (!c1440e4.j0(null, ac.f7601i0)) {
                                                                        v4 = V.delta(30, bundle3);
                                                                        it2 = v4.alpha.values().iterator();
                                                                        while (it2.hasNext()) {
                                                                        }
                                                                    }
                                                                    v4 = null;
                                                                    if (v4 != null) {
                                                                    }
                                                                    G.echo(c1459n032);
                                                                    c1459n032.o0(d022);
                                                                    axVar3.W();
                                                                    int i1422 = C1454l.bravo(axVar3.b0().getString("dma_consent_settings", null)).alpha;
                                                                    g03 = c1440e4.g0("google_analytics_default_allow_ad_personalization_signals", true);
                                                                    a4.j jVar722 = arVar8.f7636g;
                                                                    if (g03 != s3) {
                                                                    }
                                                                    g04 = c1440e4.g0("google_analytics_default_allow_ad_user_data", true);
                                                                    g2 = (G) c1459n032.alpha;
                                                                    if (g04 == s3) {
                                                                    }
                                                                    if (TextUtils.isEmpty(g10.india().d0())) {
                                                                    }
                                                                    if (TextUtils.isEmpty(g10.india().d0())) {
                                                                    }
                                                                    if (TextUtils.isEmpty(g10.india().d0())) {
                                                                    }
                                                                    c1459n0 = c1459n032;
                                                                    z14 = z13;
                                                                    h02 = c1440e4.h0("google_analytics_tcf_data_enabled");
                                                                    if (h02 != null) {
                                                                    }
                                                                    G.foxtrot(arVar8);
                                                                    jVar5.alpha("TCF client enabled.");
                                                                    G.echo(c1459n0);
                                                                    c1459n0.W();
                                                                    ar arVar102222 = g2.f7507b;
                                                                    G.foxtrot(arVar102222);
                                                                    arVar102222.f7635f.alpha("Register tcfPrefChangeListener.");
                                                                    if (c1459n0.f7685n == null) {
                                                                    }
                                                                    ax axVar42222 = g2.f7506a;
                                                                    G.delta(axVar42222);
                                                                    axVar42222.a0().registerOnSharedPreferenceChangeListener(c1459n0.f7685n);
                                                                    G.echo(c1459n0);
                                                                    c1459n0.f0();
                                                                    aw awVar2222 = axVar3.yellow;
                                                                    alpha = awVar2222.alpha();
                                                                    long j72222 = g10.f7530z;
                                                                    if (alpha == 0) {
                                                                    }
                                                                    G.echo(c1459n0);
                                                                    f5 = c1459n0.f7682k;
                                                                    if (f5.charlie()) {
                                                                    }
                                                                    if (!g10.bravo()) {
                                                                    }
                                                                    C1317f3.bravo();
                                                                    if (c1440e4.j0(null, ac.f7575P)) {
                                                                    }
                                                                    axVar2.f7645i.bravo(true);
                                                                    return;
                                                                }
                                                            }
                                                            z12 = false;
                                                            C1317f3.bravo();
                                                            if (c1440e4.j0(null, ac.f7575P)) {
                                                            }
                                                            if (!z12) {
                                                            }
                                                        } else {
                                                            throw new IllegalStateException("Can't initialize twice");
                                                        }
                                                    }
                                                    ajVar3.f7624d = asList;
                                                    if (packageManager != null) {
                                                    }
                                                    ((G) ajVar3.alpha).f7529y.incrementAndGet();
                                                    ajVar3.purple = true;
                                                    abstractC1481z = new AbstractC1481z(g10);
                                                    abstractC1481z.Y();
                                                    g10.f7521q = abstractC1481z;
                                                    if (!abstractC1481z.purple) {
                                                    }
                                                }
                                            }
                                            asList = null;
                                            if (asList != null) {
                                            }
                                            ajVar3.f7624d = asList;
                                            if (packageManager != null) {
                                            }
                                            ((G) ajVar3.alpha).f7529y.incrementAndGet();
                                            ajVar3.purple = true;
                                            abstractC1481z = new AbstractC1481z(g10);
                                            abstractC1481z.Y();
                                            g10.f7521q = abstractC1481z;
                                            if (!abstractC1481z.purple) {
                                            }
                                        }
                                        valueOf = null;
                                        if (valueOf != null) {
                                        }
                                        asList = null;
                                        if (asList != null) {
                                        }
                                        ajVar3.f7624d = asList;
                                        if (packageManager != null) {
                                        }
                                        ((G) ajVar3.alpha).f7529y.incrementAndGet();
                                        ajVar3.purple = true;
                                        abstractC1481z = new AbstractC1481z(g10);
                                        abstractC1481z.Y();
                                        g10.f7521q = abstractC1481z;
                                        if (!abstractC1481z.purple) {
                                        }
                                    }
                                }
                                z10 = false;
                                golf = g12.golf();
                                str3 = g12.f7516l;
                                if (golf == 0) {
                                }
                                ajVar3.f7626g = "";
                                ajVar3.f7627h = "";
                                if (z11) {
                                }
                                golf2 = W.golf(context, str3);
                                if (TextUtils.isEmpty(golf2)) {
                                }
                                ajVar3.f7626g = str10;
                                if (!c1440e2.j0(null, abVar)) {
                                    Resources resources2 = context.getResources();
                                    if (!TextUtils.isEmpty(str3)) {
                                    }
                                    identifier = resources2.getIdentifier("admob_app_id", CTVariableUtils.STRING, str3);
                                    if (identifier != 0) {
                                    }
                                    str7 = null;
                                    ajVar3.f7627h = str7;
                                }
                                if (i5 == 0) {
                                }
                                ajVar3.f7624d = null;
                                c1440e2.getClass();
                                x.echo("analytics.safelisted_events");
                                f02 = c1440e2.f0();
                                G g1322 = (G) c1440e2.alpha;
                                if (f02 != null) {
                                }
                                valueOf = null;
                                if (valueOf != null) {
                                }
                                asList = null;
                                if (asList != null) {
                                }
                                ajVar3.f7624d = asList;
                                if (packageManager != null) {
                                }
                                ((G) ajVar3.alpha).f7529y.incrementAndGet();
                                ajVar3.purple = true;
                                abstractC1481z = new AbstractC1481z(g10);
                                abstractC1481z.Y();
                                g10.f7521q = abstractC1481z;
                                if (!abstractC1481z.purple) {
                                }
                            }
                        }
                        str11 = str12;
                        packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
                        if (packageInfo != null) {
                        }
                    }
                    packageManager = packageManager2;
                    i4 = Integer.MIN_VALUE;
                    str = str9;
                    str2 = str;
                    String str1322 = str11;
                    ajVar3.red = packageName;
                    ajVar3.white = str1322;
                    ajVar3.silver = str2;
                    ajVar3.teal = i4;
                    ajVar3.yellow = str;
                    ajVar3.f7621a = 0L;
                    abVar = ac.f7601i0;
                    c1440e2 = g12.yellow;
                    if (!c1440e2.j0(null, abVar)) {
                        if (!c1440e2.j0(null, abVar)) {
                        }
                        if ("am".equals(str8)) {
                        }
                    }
                    z10 = false;
                    golf = g12.golf();
                    str3 = g12.f7516l;
                    if (golf == 0) {
                    }
                    ajVar3.f7626g = "";
                    ajVar3.f7627h = "";
                    if (z11) {
                    }
                    golf2 = W.golf(context, str3);
                    if (TextUtils.isEmpty(golf2)) {
                    }
                    ajVar3.f7626g = str10;
                    if (!c1440e2.j0(null, abVar)) {
                    }
                    if (i5 == 0) {
                    }
                    ajVar3.f7624d = null;
                    c1440e2.getClass();
                    x.echo("analytics.safelisted_events");
                    f02 = c1440e2.f0();
                    G g13222 = (G) c1440e2.alpha;
                    if (f02 != null) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    asList = null;
                    if (asList != null) {
                    }
                    ajVar3.f7624d = asList;
                    if (packageManager != null) {
                    }
                    ((G) ajVar3.alpha).f7529y.incrementAndGet();
                    ajVar3.purple = true;
                    abstractC1481z = new AbstractC1481z(g10);
                    abstractC1481z.Y();
                    g10.f7521q = abstractC1481z;
                    if (!abstractC1481z.purple) {
                    }
                } else {
                    throw new IllegalStateException("Can't initialize twice");
                }
            } else {
                throw new IllegalStateException("Can't initialize twice");
            }
        } else {
            throw new IllegalStateException("Can't initialize twice");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, av.ao] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.google.android.gms.internal.measurement.y] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Set set;
        boolean contains;
        Long valueOf;
        C2745q c2745q;
        com.google.common.util.concurrent.e eVar = null;
        boolean z2 = false;
        V5.h hVar = null;
        boolean z10 = true;
        boolean z11 = true;
        int i4 = 0;
        try {
            switch (this.alpha) {
                case 0:
                    InterfaceC0757c interfaceC0757c = (InterfaceC0757c) this.red;
                    try {
                        interfaceC0757c.onSuccess(h.alpha((com.google.common.util.concurrent.e) this.purple));
                        return;
                    } catch (Error e) {
                        e = e;
                        interfaceC0757c.b(e);
                        return;
                    } catch (RuntimeException e4) {
                        e = e4;
                        interfaceC0757c.b(e);
                        return;
                    } catch (ExecutionException e5) {
                        Throwable cause = e5.getCause();
                        if (cause == null) {
                            interfaceC0757c.b(e5);
                            return;
                        } else {
                            interfaceC0757c.b(cause);
                            return;
                        }
                    }
                case 1:
                    while (true) {
                        try {
                            ((Runnable) this.purple).run();
                        } catch (Throwable th) {
                            try {
                                vf.ad.uniform(Nd.i.alpha, th);
                            } catch (Throwable th2) {
                                Af.g gVar = (Af.g) this.red;
                                synchronized (gVar.white) {
                                    Af.g.yellow.decrementAndGet(gVar);
                                    throw th2;
                                }
                            }
                        }
                        Runnable magenta = ((Af.g) this.red).magenta();
                        if (magenta != null) {
                            this.purple = magenta;
                            i4++;
                            if (i4 >= 16) {
                                Af.g gVar2 = (Af.g) this.red;
                                if (Af.f.india(gVar2.red, gVar2)) {
                                    Af.g gVar3 = (Af.g) this.red;
                                    Af.f.hotel(gVar3.red, gVar3, this);
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                case 2:
                    m mVar = (m) this.red;
                    try {
                        Task task = (Task) mVar.red.ivory((Task) this.purple);
                        if (task == null) {
                            mVar.onFailure(new NullPointerException("Continuation returned null"));
                            return;
                        }
                        ExecutorC0748a executorC0748a = G6.i.bravo;
                        task.echo(executorC0748a, mVar);
                        task.delta(executorC0748a, mVar);
                        task.alpha(executorC0748a, mVar);
                        return;
                    } catch (RuntimeExecutionException e10) {
                        if (e10.getCause() instanceof Exception) {
                            mVar.silver.oscar((Exception) e10.getCause());
                            return;
                        } else {
                            mVar.silver.oscar(e10);
                            return;
                        }
                    } catch (Exception e11) {
                        mVar.silver.oscar(e11);
                        return;
                    }
                case 3:
                    alpha();
                    return;
                case 4:
                    bravo();
                    return;
                case 5:
                    charlie();
                    return;
                case 6:
                    delta();
                    return;
                case 7:
                    zak zakVar = (zak) this.purple;
                    ConnectionResult connectionResult = zakVar.purple;
                    boolean o5 = connectionResult.o();
                    T5.ad adVar = (T5.ad) this.red;
                    if (o5) {
                        zav zavVar = zakVar.red;
                        x.hotel(zavVar);
                        ConnectionResult connectionResult2 = zavVar.red;
                        if (!connectionResult2.o()) {
                            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                            adVar.november.delta(connectionResult2);
                            adVar.mike.echo();
                            return;
                        }
                        u uVar = adVar.november;
                        IBinder iBinder = zavVar.purple;
                        if (iBinder != null) {
                            int i5 = V5.a.hotel;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof V5.h) {
                                hVar = (V5.h) queryLocalInterface;
                            } else {
                                hVar = new AbstractC1394y(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                            }
                        }
                        uVar.getClass();
                        if (hVar != null && (set = adVar.kilo) != null) {
                            uVar.delta = hVar;
                            uVar.echo = set;
                            if (uVar.alpha) {
                                ((com.google.android.gms.common.api.c) uVar.bravo).kilo(hVar, set);
                            }
                        } else {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            uVar.delta(new ConnectionResult(4));
                        }
                    } else {
                        adVar.november.delta(connectionResult);
                    }
                    adVar.mike.echo();
                    return;
                case 8:
                    try {
                        RunnableC0756b runnableC0756b = (RunnableC0756b) this.red;
                        Object bravo = h.bravo((com.google.common.util.concurrent.e) this.purple);
                        V0.h hVar2 = runnableC0756b.purple;
                        if (hVar2 != null) {
                            hVar2.bravo(bravo);
                        }
                    } catch (CancellationException unused) {
                        ((RunnableC0756b) this.red).cancel(false);
                    } catch (ExecutionException e12) {
                        RunnableC0756b runnableC0756b2 = (RunnableC0756b) this.red;
                        Throwable cause2 = e12.getCause();
                        V0.h hVar3 = runnableC0756b2.purple;
                        if (hVar3 != null) {
                            hVar3.delta(cause2);
                        }
                    }
                    return;
                case 9:
                    echo();
                    return;
                case 10:
                    O o10 = (O) this.red;
                    o10.golf.echo();
                    zzai zzaiVar = (zzai) this.purple;
                    Object o11 = zzaiVar.red.o();
                    Z0 z02 = o10.golf;
                    if (o11 == null) {
                        z02.getClass();
                        String str = zzaiVar.alpha;
                        x.hotel(str);
                        zzr uniform = z02.uniform(str);
                        if (uniform != null) {
                            z02.gray(zzaiVar, uniform);
                            return;
                        }
                        return;
                    }
                    z02.getClass();
                    String str2 = zzaiVar.alpha;
                    x.hotel(str2);
                    zzr uniform2 = z02.uniform(str2);
                    if (uniform2 != null) {
                        z02.lime(zzaiVar, uniform2);
                        return;
                    }
                    return;
                case 11:
                    C1459n0 c1459n0 = (C1459n0) this.purple;
                    c1459n0.W();
                    if (Build.VERSION.SDK_INT >= 30) {
                        ax axVar = ((G) c1459n0.alpha).f7506a;
                        G.delta(axVar);
                        SparseArray c02 = axVar.c0();
                        for (zzov zzovVar : (List) this.red) {
                            int i10 = zzovVar.red;
                            contains = c02.contains(i10);
                            if (!contains || ((Long) c02.get(i10)).longValue() < zzovVar.purple) {
                                c1459n0.u0().add(zzovVar);
                            }
                        }
                        c1459n0.k0();
                        return;
                    }
                    return;
                case 12:
                    C1459n0 c1459n02 = (C1459n0) this.red;
                    O0 o02 = ((G) c1459n02.alpha).f7509d;
                    G.echo(o02);
                    G g2 = (G) o02.alpha;
                    ax axVar2 = g2.f7506a;
                    G.delta(axVar2);
                    if (!axVar2.d0().kilo(U.ANALYTICS_STORAGE)) {
                        ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        arVar.f7634d.alpha("Analytics storage consent denied; will not get session id");
                    } else {
                        ax axVar3 = g2.f7506a;
                        G.delta(axVar3);
                        g2.f7511g.getClass();
                        if (!axVar3.f0(System.currentTimeMillis())) {
                            aw awVar = axVar3.f7647k;
                            if (awVar.alpha() != 0) {
                                valueOf = Long.valueOf(awVar.alpha());
                                G g5 = (G) c1459n02.alpha;
                                ao aoVar = (ao) this.purple;
                                if (valueOf == null) {
                                    d1 d1Var = g5.e;
                                    G.delta(d1Var);
                                    d1Var.x0(aoVar, valueOf.longValue());
                                    return;
                                } else {
                                    try {
                                        aoVar.november(null);
                                        return;
                                    } catch (RemoteException e13) {
                                        ar arVar2 = g5.f7507b;
                                        G.foxtrot(arVar2);
                                        arVar2.white.bravo(e13, "getSessionId failed with exception");
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    valueOf = null;
                    G g52 = (G) c1459n02.alpha;
                    ao aoVar2 = (ao) this.purple;
                    if (valueOf == null) {
                    }
                case 13:
                    C1459n0 c1459n03 = (C1459n0) this.red;
                    G g10 = (G) c1459n03.alpha;
                    ax axVar4 = g10.f7506a;
                    G.delta(axVar4);
                    axVar4.W();
                    axVar4.W();
                    C1454l bravo2 = C1454l.bravo(axVar4.b0().getString("dma_consent_settings", null));
                    C1454l c1454l = (C1454l) this.purple;
                    int i11 = bravo2.alpha;
                    int i12 = c1454l.alpha;
                    boolean lima = V.lima(i12, i11);
                    ar arVar3 = g10.f7507b;
                    if (lima) {
                        SharedPreferences.Editor edit = axVar4.b0().edit();
                        edit.putString("dma_consent_settings", c1454l.bravo);
                        edit.apply();
                        G.foxtrot(arVar3);
                        arVar3.f7636g.bravo(c1454l, "Setting DMA consent(FE)");
                        G g11 = (G) c1459n03.alpha;
                        if (g11.mike().i0()) {
                            H0 mike = g11.mike();
                            mike.W();
                            mike.X();
                            mike.n0(new RunnableC1482z0(mike, z10 ? 1 : 0));
                            return;
                        }
                        H0 mike2 = g11.mike();
                        mike2.W();
                        mike2.X();
                        if (mike2.h0()) {
                            mike2.n0(new E0(mike2, mike2.k0(false), z10 ? 1 : 0));
                            return;
                        }
                        return;
                    }
                    G.foxtrot(arVar3);
                    arVar3.e.bravo(Integer.valueOf(i12), "Lower precedence consent source ignored, proposed source");
                    return;
                case 14:
                    H0.p0(((G0) this.red).charlie, (ComponentName) this.purple);
                    return;
                case 15:
                    AppMeasurementDynamiteService appMeasurementDynamiteService = (AppMeasurementDynamiteService) this.red;
                    d1 d1Var2 = appMeasurementDynamiteService.golf.e;
                    G.delta(d1Var2);
                    G g12 = appMeasurementDynamiteService.golf;
                    if (g12.f7525u == null || !g12.f7525u.booleanValue()) {
                        z10 = false;
                    }
                    d1Var2.s0((ao) this.purple, z10);
                    return;
                case 16:
                    ReferenceQueue referenceQueue = (ReferenceQueue) this.purple;
                    while (!((Set) this.red).isEmpty()) {
                        try {
                            o oVar = (o) referenceQueue.remove();
                            if (oVar.alpha.remove(oVar)) {
                                oVar.clear();
                                oVar.bravo.getClass();
                            }
                        } catch (InterruptedException unused2) {
                        }
                    }
                    return;
                case 17:
                    com.google.mlkit.common.sdkinternal.n nVar = (com.google.mlkit.common.sdkinternal.n) this.purple;
                    if (((Thread) nVar.delta.getAndSet(Thread.currentThread())) != null) {
                        z11 = false;
                    }
                    x.kilo(z11);
                    try {
                        ((Runnable) this.red).run();
                        nVar.delta.set(null);
                        nVar.bravo();
                        return;
                    } finally {
                    }
                case 18:
                    try {
                        Method method = AbstractC1685e.delta;
                        Object obj = this.red;
                        Object obj2 = this.purple;
                        if (method != null) {
                            method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                        } else {
                            AbstractC1685e.echo.invoke(obj2, obj, Boolean.FALSE);
                        }
                        return;
                    } catch (RuntimeException e14) {
                        if (e14.getClass() == RuntimeException.class && e14.getMessage() != null && e14.getMessage().startsWith("Unable to stop")) {
                            throw e14;
                        }
                        return;
                    } catch (Throwable th3) {
                        Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                        return;
                    }
                default:
                    P7 p72 = (P7) this.purple;
                    HashMap hashMap = p72.juliet;
                    A5 a52 = A5.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                    C2780u c2780u = (C2780u) hashMap.get(a52);
                    if (c2780u != null) {
                        Iterator it = ((C2718n) c2780u.bravo()).iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Collection collection = (Collection) c2780u.silver.get(next);
                            Collection collection2 = collection;
                            if (collection == null) {
                                collection2 = new ArrayList(3);
                            }
                            List list = (List) collection2;
                            if (list instanceof RandomAccess) {
                                c2745q = new C2745q(c2780u, next, list, null);
                            } else {
                                c2745q = new C2745q(c2780u, next, list, null);
                            }
                            ArrayList arrayList = new ArrayList(c2745q);
                            Collections.sort(arrayList);
                            ?? obj3 = new Object();
                            Iterator it2 = arrayList.iterator();
                            long j5 = 0;
                            while (it2.hasNext()) {
                                j5 = ((Long) it2.next()).longValue() + j5;
                            }
                            obj3.red = Long.valueOf((j5 / arrayList.size()) & Long.MAX_VALUE);
                            obj3.alpha = Long.valueOf(P7.alpha(arrayList, 100.0d) & Long.MAX_VALUE);
                            obj3.white = Long.valueOf(P7.alpha(arrayList, 75.0d) & Long.MAX_VALUE);
                            obj3.teal = Long.valueOf(P7.alpha(arrayList, 50.0d) & Long.MAX_VALUE);
                            obj3.silver = Long.valueOf(P7.alpha(arrayList, 25.0d) & Long.MAX_VALUE);
                            obj3.purple = Long.valueOf(P7.alpha(arrayList, 0.0d) & Long.MAX_VALUE);
                            com.google.mlkit.common.sdkinternal.p.alpha.execute(new ao.d(p72, ((zzk) this.red).zza(next, arrayList.size(), new C2652f5(obj3)), a52, p72.charlie(), 11, false));
                        }
                        hashMap.remove(a52);
                        return;
                    }
                    return;
            }
        } finally {
            ((RunnableC0756b) this.red).yellow = null;
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 0:
                return g.class.getSimpleName() + Constants.SEPARATOR_COMMA + ((InterfaceC0757c) this.red);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g(int i4, Object obj, Object obj2, boolean z2) {
        this.alpha = i4;
        this.red = obj;
        this.purple = obj2;
    }

    public /* synthetic */ g(P7 p72, zzk zzkVar) {
        this.alpha = 19;
        A5 a52 = A5.UNKNOWN_EVENT;
        this.purple = p72;
        this.red = zzkVar;
    }
}
