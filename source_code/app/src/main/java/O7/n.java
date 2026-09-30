package O7;

import B2.ad;
import R7.J;
import R7.K;
import R7.L;
import R7.M;
import R7.N;
import R7.ab;
import R7.ae;
import R7.ai;
import R7.aj;
import R7.ak;
import R7.ap;
import R7.aq;
import R7.ar;
import R7.au;
import R7.az;
import R7.o0;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import androidx.appcompat.widget.i1;
import com.clevertap.android.sdk.leanplum.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.jvm.internal.Intrinsics;
import s6.V4;

/* loaded from: classes2.dex */
public final class n {
    public static final g romeo = new g(1);
    public static final Charset sierra = Charset.forName("UTF-8");
    public final Context alpha;
    public final u bravo;
    public final J2.e charlie;
    public final U7.c delta;
    public final P7.f echo;
    public final x foxtrot;
    public final U7.c golf;
    public final ad hotel;
    public final Q7.f india;
    public final L7.a juliet;
    public final K7.a kilo;
    public final i lima;
    public final i1 mike;
    public t november;
    public final G6.h oscar = new G6.h();
    public final G6.h papa = new G6.h();
    public final G6.h quebec = new G6.h();

    public n(Context context, x xVar, u uVar, U7.c cVar, J2.e eVar, ad adVar, U7.c cVar2, Q7.f fVar, i1 i1Var, L7.a aVar, K7.a aVar2, i iVar, P7.f fVar2) {
        new AtomicBoolean(false);
        this.alpha = context;
        this.foxtrot = xVar;
        this.bravo = uVar;
        this.golf = cVar;
        this.charlie = eVar;
        this.hotel = adVar;
        this.delta = cVar2;
        this.india = fVar;
        this.juliet = aVar;
        this.kilo = aVar2;
        this.lima = iVar;
        this.mike = i1Var;
        this.echo = fVar2;
    }

    public static G6.q alpha(n nVar) {
        G6.q charlie;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : U7.c.india(((File) nVar.golf.red).listFiles(romeo))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    charlie = V4.echo(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    charlie = V4.charlie(new ScheduledThreadPoolExecutor(1), new m(nVar, parseLong));
                }
                arrayList.add(charlie);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return V4.foxtrot(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04d5 A[LOOP:2: B:74:0x04d5->B:80:0x04f2, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x050c  */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27, types: [int] */
    /* JADX WARN: Type inference failed for: r11v57, types: [java.lang.Object, R7.ao] */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r33v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6, types: [R7.ac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16, types: [R7.ac, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bravo(boolean z2, D5.s sVar, boolean z10) {
        ArrayList arrayList;
        i1 i1Var;
        boolean z11;
        int i4;
        String str;
        boolean z12;
        String str2;
        U7.c cVar;
        NavigableSet<String> charlie;
        int size;
        String substring;
        String str3;
        File file;
        boolean z13;
        String[] list;
        List historicalProcessExitReasons;
        int i5;
        boolean z14;
        List list2;
        Iterator it;
        ApplicationExitInfo applicationExitInfo;
        String applicationExitInfo2;
        String str4;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        int i10;
        List list3;
        String str5;
        boolean z15;
        InputStream traceInputStream;
        long timestamp2;
        int reason2;
        FileInputStream fileInputStream;
        P7.f.alpha();
        i1 i1Var2 = this.mike;
        ArrayList arrayList2 = new ArrayList(((U7.a) i1Var2.alpha).charlie());
        if (arrayList2.size() <= z2) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str6 = (String) arrayList2.get(z2 == true ? 1 : 0);
        if (z10 && sVar.delta().bravo.bravo) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                historicalProcessExitReasons = ((ActivityManager) this.alpha.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    U7.c cVar2 = this.golf;
                    Q7.f fVar = new Q7.f(cVar2);
                    i4 = 4;
                    fVar.purple = Q7.f.red;
                    if (str6 == null) {
                        i5 = 8;
                    } else {
                        i5 = 8;
                        fVar.purple = new Q7.m(cVar2.charlie(str6, "userlog"));
                    }
                    Q7.h hVar = new Q7.h(cVar2);
                    U7.c cVar3 = new U7.c(str6, cVar2, this.echo);
                    ((Q7.e) ((AtomicMarkableReference) ((C3.d) cVar3.silver).red).getReference()).delta(hVar.charlie(str6, false));
                    ((Q7.e) ((AtomicMarkableReference) ((C3.d) cVar3.teal).red).getReference()).delta(hVar.charlie(str6, true));
                    ((AtomicMarkableReference) cVar3.yellow).set(hVar.delta(str6), false);
                    File charlie2 = cVar2.charlie(str6, "rollouts-state");
                    if (!charlie2.exists() || charlie2.length() == 0) {
                        z14 = true;
                        Q7.h.golf(charlie2, "The file has a length of zero for session: " + str6);
                        list2 = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream = new FileInputStream(charlie2);
                            try {
                                try {
                                    list2 = Q7.h.bravo(f.india(fileInputStream));
                                    z14 = true;
                                } catch (Exception e) {
                                    e = e;
                                    z14 = true;
                                }
                                try {
                                    String str7 = "Loaded rollouts state:\n" + list2 + "\nfor session " + str6;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str7, null);
                                    }
                                    f.bravo(fileInputStream, "Failed to close rollouts state file.");
                                } catch (Exception e4) {
                                    e = e4;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    Q7.h.foxtrot(charlie2);
                                    f.bravo(fileInputStream, "Failed to close rollouts state file.");
                                    list2 = Collections.EMPTY_LIST;
                                    ((Fe.c) cVar3.white).papa(list2);
                                    U7.a aVar = (U7.a) i1Var2.alpha;
                                    long lastModified = aVar.bravo.charlie(str6, "start-time").lastModified();
                                    it = historicalProcessExitReasons.iterator();
                                    while (it.hasNext()) {
                                    }
                                    applicationExitInfo = null;
                                    if (applicationExitInfo == null) {
                                    }
                                    if (z10) {
                                    }
                                    str = null;
                                    if (z2 != 0) {
                                    }
                                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                                    U7.a aVar2 = (U7.a) i1Var.alpha;
                                    cVar = aVar2.bravo;
                                    cVar.alpha(".com.google.firebase.crashlytics");
                                    cVar.alpha(".com.google.firebase.crashlytics-ndk");
                                    if (!((String) cVar.alpha).isEmpty()) {
                                    }
                                    charlie = aVar2.charlie();
                                    if (str2 != null) {
                                    }
                                    if (charlie.size() > 8) {
                                    }
                                    loop3: while (r9.hasNext()) {
                                    }
                                    F8.q qVar = aVar2.charlie.delta().alpha;
                                    ArrayList bravo = aVar2.bravo();
                                    size = bravo.size();
                                    if (size > 4) {
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                f.bravo(fileInputStream, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            z14 = true;
                            fileInputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = null;
                            f.bravo(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    ((Fe.c) cVar3.white).papa(list2);
                    U7.a aVar3 = (U7.a) i1Var2.alpha;
                    long lastModified2 = aVar3.bravo.charlie(str6, "start-time").lastModified();
                    it = historicalProcessExitReasons.iterator();
                    while (it.hasNext()) {
                        applicationExitInfo = E0.e.delta(it.next());
                        timestamp2 = applicationExitInfo.getTimestamp();
                        if (timestamp2 < lastModified2) {
                            break;
                        }
                        reason2 = applicationExitInfo.getReason();
                        if (reason2 == 6) {
                            break;
                        }
                    }
                    applicationExitInfo = null;
                    if (applicationExitInfo == null) {
                        try {
                            traceInputStream = applicationExitInfo.getTraceInputStream();
                        } catch (IOException e10) {
                            StringBuilder sb2 = new StringBuilder("Could not get input trace in application exit info: ");
                            applicationExitInfo2 = applicationExitInfo.toString();
                            sb2.append(applicationExitInfo2);
                            sb2.append(" Error: ");
                            sb2.append(e10);
                            Log.w("FirebaseCrashlytics", sb2.toString(), null);
                        }
                        if (traceInputStream != null) {
                            str4 = i1.charlie(traceInputStream);
                            ?? obj = new Object();
                            importance = applicationExitInfo.getImportance();
                            obj.delta = importance;
                            obj.juliet = (byte) (obj.juliet | 4);
                            processName = applicationExitInfo.getProcessName();
                            if (processName == null) {
                                obj.bravo = processName;
                                reason = applicationExitInfo.getReason();
                                obj.charlie = reason;
                                obj.juliet = (byte) (obj.juliet | 2);
                                timestamp = applicationExitInfo.getTimestamp();
                                obj.golf = timestamp;
                                obj.juliet = (byte) (obj.juliet | 32);
                                pid = applicationExitInfo.getPid();
                                obj.alpha = pid;
                                obj.juliet = (byte) (obj.juliet | 1);
                                pss = applicationExitInfo.getPss();
                                obj.echo = pss;
                                obj.juliet = (byte) (obj.juliet | 8);
                                rss = applicationExitInfo.getRss();
                                obj.foxtrot = rss;
                                obj.juliet = (byte) (obj.juliet | 16);
                                obj.hotel = str4;
                                R7.ad alpha = obj.alpha();
                                s sVar2 = (s) i1Var2.bravo;
                                int i12 = sVar2.alpha.getResources().getConfiguration().orientation;
                                ?? obj2 = new Object();
                                obj2.bravo = "anr";
                                long j5 = alpha.golf;
                                obj2.alpha = j5;
                                obj2.golf = (byte) (obj2.golf | 1);
                                if (sVar2.echo.delta().bravo.charlie) {
                                    ad adVar = sVar2.charlie;
                                    if (((ArrayList) adVar.foxtrot).size() > 0) {
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it2 = ((ArrayList) adVar.foxtrot).iterator();
                                        while (it2.hasNext()) {
                                            int i13 = i12;
                                            c cVar4 = (c) it2.next();
                                            Iterator it3 = it2;
                                            String str8 = cVar4.alpha;
                                            if (str8 != null) {
                                                i1 i1Var3 = i1Var2;
                                                String str9 = cVar4.bravo;
                                                if (str9 != null) {
                                                    String str10 = cVar4.charlie;
                                                    if (str10 != null) {
                                                        arrayList3.add(new ae(str9, str8, str10));
                                                        it2 = it3;
                                                        i12 = i13;
                                                        i1Var2 = i1Var3;
                                                        arrayList2 = arrayList2;
                                                    } else {
                                                        throw new NullPointerException("Null buildId");
                                                    }
                                                } else {
                                                    throw new NullPointerException("Null arch");
                                                }
                                            } else {
                                                throw new NullPointerException("Null libraryName");
                                            }
                                        }
                                        arrayList = arrayList2;
                                        i1Var = i1Var2;
                                        i10 = i12;
                                        list3 = Collections.unmodifiableList(arrayList3);
                                        ?? obj3 = new Object();
                                        obj3.delta = alpha.delta;
                                        byte b2 = (byte) (obj3.juliet | 4);
                                        obj3.juliet = b2;
                                        str5 = alpha.bravo;
                                        if (str5 == null) {
                                            obj3.bravo = str5;
                                            obj3.charlie = alpha.charlie;
                                            obj3.golf = j5;
                                            obj3.alpha = alpha.alpha;
                                            obj3.echo = alpha.echo;
                                            obj3.foxtrot = alpha.foxtrot;
                                            obj3.juliet = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 32)) | 1)) | 8)) | 16);
                                            obj3.hotel = alpha.hotel;
                                            obj3.india = list3;
                                            R7.ad alpha2 = obj3.alpha();
                                            if (alpha2.delta != 100) {
                                                z15 = z14;
                                            } else {
                                                z15 = false;
                                            }
                                            Boolean valueOf = Boolean.valueOf(z15);
                                            L7.c cVar5 = L7.c.bravo;
                                            String processName2 = alpha2.bravo;
                                            Intrinsics.echo(processName2, "processName");
                                            az alpha3 = L7.c.alpha(cVar5, processName2, alpha2.alpha, alpha2.delta, i5);
                                            byte b4 = z14 ? (byte) 1 : (byte) 0;
                                            au echo = s.echo();
                                            List alpha4 = sVar2.alpha();
                                            if (alpha4 != null) {
                                                ar arVar = new ar(null, null, alpha2, echo, alpha4);
                                                if (b4 == 1) {
                                                    obj2.charlie = new aq(arVar, null, null, valueOf, alpha3, null, i10);
                                                    obj2.delta = sVar2.bravo(i10);
                                                    ap alpha5 = obj2.alpha();
                                                    String echo2 = av.q.echo("Persisting anr for session ", str6);
                                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                        Log.d("FirebaseCrashlytics", echo2, null);
                                                    }
                                                    z11 = true;
                                                    aVar3.delta(i1.bravo(i1.alpha(alpha5, fVar, cVar3, Collections.EMPTY_MAP), cVar3), str6, true);
                                                } else {
                                                    StringBuilder sb3 = new StringBuilder();
                                                    if (b4 == 0) {
                                                        sb3.append(" uiOrientation");
                                                    }
                                                    throw new IllegalStateException(A0.z.kilo(sb3, "Missing required properties:"));
                                                }
                                            } else {
                                                throw new NullPointerException("Null binaries");
                                            }
                                        } else {
                                            throw new NullPointerException("Null processName");
                                        }
                                    }
                                }
                                arrayList = arrayList2;
                                i1Var = i1Var2;
                                i10 = i12;
                                list3 = null;
                                ?? obj32 = new Object();
                                obj32.delta = alpha.delta;
                                byte b22 = (byte) (obj32.juliet | 4);
                                obj32.juliet = b22;
                                str5 = alpha.bravo;
                                if (str5 == null) {
                                }
                            } else {
                                throw new NullPointerException("Null processName");
                            }
                        }
                        str4 = null;
                        ?? obj4 = new Object();
                        importance = applicationExitInfo.getImportance();
                        obj4.delta = importance;
                        obj4.juliet = (byte) (obj4.juliet | 4);
                        processName = applicationExitInfo.getProcessName();
                        if (processName == null) {
                        }
                    } else {
                        String echo3 = av.q.echo("No relevant ApplicationExitInfo occurred during session: ", str6);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", echo3, null);
                        }
                        arrayList = arrayList2;
                        i1Var = i1Var2;
                        z11 = z14;
                    }
                } else {
                    arrayList = arrayList2;
                    i1Var = i1Var2;
                    z11 = true;
                    i4 = 4;
                    String echo4 = av.q.echo("No ApplicationExitInfo available. Session: ", str6);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", echo4, null);
                    }
                }
            } else {
                arrayList = arrayList2;
                i1Var = i1Var2;
                z11 = true;
                i4 = 4;
                String zulu = ao.ad.zulu(i11, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", zulu, null);
                }
            }
        } else {
            arrayList = arrayList2;
            i1Var = i1Var2;
            z11 = true;
            i4 = 4;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        if (z10) {
            L7.a aVar4 = this.juliet;
            if (aVar4.charlie(str6)) {
                String echo5 = av.q.echo("Finalizing native report for session ", str6);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", echo5, null);
                }
                aVar4.alpha(str6).getClass();
                str = null;
                Log.w("FirebaseCrashlytics", "No minidump data found for session " + str6, null);
                Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str6, null);
                Log.w("FirebaseCrashlytics", "No native core present", null);
                if (z2 != 0) {
                    z12 = false;
                    str2 = (String) arrayList.get(0);
                } else {
                    z12 = false;
                    this.lima.alpha(str);
                    str2 = null;
                }
                long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                U7.a aVar22 = (U7.a) i1Var.alpha;
                cVar = aVar22.bravo;
                cVar.alpha(".com.google.firebase.crashlytics");
                cVar.alpha(".com.google.firebase.crashlytics-ndk");
                if (!((String) cVar.alpha).isEmpty()) {
                    cVar.alpha(".com.google.firebase.crashlytics.files.v1");
                    String str11 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
                    File file2 = (File) cVar.purple;
                    if (file2.exists() && (list = file2.list(new U7.b(0, str11))) != null) {
                        int length = list.length;
                        for (?? r11 = z12; r11 < length; r11++) {
                            cVar.alpha(list[r11]);
                        }
                    }
                }
                charlie = aVar22.charlie();
                if (str2 != null) {
                    charlie.remove(str2);
                }
                if (charlie.size() > 8) {
                    while (charlie.size() > 8) {
                        String str12 = (String) charlie.last();
                        String echo6 = av.q.echo("Removing session over cap: ", str12);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", echo6, null);
                        }
                        U7.c.hotel(new File((File) cVar.silver, str12));
                        charlie.remove(str12);
                    }
                }
                loop3: for (String str13 : charlie) {
                    String echo7 = av.q.echo("Finalizing report for session ", str13);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", echo7, null);
                    }
                    g gVar = U7.a.india;
                    File file3 = new File((File) cVar.silver, str13);
                    file3.mkdirs();
                    List india = U7.c.india(file3.listFiles(gVar));
                    if (india.isEmpty()) {
                        String gray = ao.ad.gray("Session ", str13, " has no events.");
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", gray, null);
                        }
                    } else {
                        Collections.sort(india);
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it4 = india.iterator();
                        boolean z16 = z12;
                        while (true) {
                            boolean hasNext = it4.hasNext();
                            S7.c cVar6 = U7.a.golf;
                            if (hasNext) {
                                File file4 = (File) it4.next();
                                try {
                                    String echo8 = U7.a.echo(file4);
                                    cVar6.getClass();
                                    try {
                                        JsonReader jsonReader = new JsonReader(new StringReader(echo8));
                                        try {
                                            ap echo9 = S7.c.echo(jsonReader);
                                            jsonReader.close();
                                            arrayList4.add(echo9);
                                        } finally {
                                            break loop3;
                                        }
                                    } catch (IllegalStateException e11) {
                                        throw new IOException(e11);
                                        break loop3;
                                    }
                                } catch (IOException e12) {
                                    Log.w("FirebaseCrashlytics", "Could not add event to report for " + file4, e12);
                                }
                                if (!z16) {
                                    String name = file4.getName();
                                    if (!name.startsWith(Constants.CHARGED_EVENT_PARAM) || !name.endsWith("_")) {
                                        z13 = false;
                                        z16 = z13;
                                    }
                                }
                                z13 = z11;
                                z16 = z13;
                            } else if (arrayList4.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str13, null);
                            } else {
                                String delta = new Q7.h(cVar).delta(str13);
                                h hVar2 = aVar22.delta.bravo;
                                synchronized (hVar2) {
                                    if (Objects.equals(hVar2.bravo, str13)) {
                                        str3 = hVar2.charlie;
                                    } else {
                                        U7.c cVar7 = hVar2.alpha;
                                        g gVar2 = h.delta;
                                        File file5 = new File((File) cVar7.silver, str13);
                                        file5.mkdirs();
                                        List india2 = U7.c.india(file5.listFiles(gVar2));
                                        if (india2.isEmpty()) {
                                            Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                            substring = null;
                                        } else {
                                            substring = ((File) Collections.min(india2, h.echo)).getName().substring(i4);
                                        }
                                        str3 = substring;
                                    }
                                }
                                File charlie3 = cVar.charlie(str13, "report");
                                try {
                                    String echo10 = U7.a.echo(charlie3);
                                    cVar6.getClass();
                                    ab india3 = S7.c.india(echo10);
                                    R7.aa alpha6 = india3.alpha();
                                    aj ajVar = india3.kilo;
                                    if (ajVar != null) {
                                        try {
                                            ai alpha7 = ajVar.alpha();
                                            alpha7.echo = Long.valueOf(currentTimeMillis2);
                                            alpha7.foxtrot = z16;
                                            try {
                                                alpha7.mike = (byte) (alpha7.mike | 2);
                                                if (delta != null) {
                                                    alpha7.hotel = new J(delta);
                                                }
                                                alpha6.juliet = alpha7.alpha();
                                            } catch (IOException e13) {
                                                e = e13;
                                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + charlie3, e);
                                                U7.c.hotel(new File((File) cVar.silver, str13));
                                                z12 = false;
                                                z11 = true;
                                                i4 = 4;
                                            }
                                        } catch (IOException e14) {
                                            e = e14;
                                        }
                                    }
                                    ab alpha8 = alpha6.alpha();
                                    R7.aa alpha9 = alpha8.alpha();
                                    alpha9.golf = str3;
                                    aj ajVar2 = alpha8.kilo;
                                    if (ajVar2 != null) {
                                        ai alpha10 = ajVar2.alpha();
                                        alpha10.charlie = str3;
                                        alpha9.juliet = alpha10.alpha();
                                    }
                                    ab alpha11 = alpha9.alpha();
                                    aj ajVar3 = alpha11.kilo;
                                    if (ajVar3 != null) {
                                        R7.aa alpha12 = alpha11.alpha();
                                        ai alpha13 = ajVar3.alpha();
                                        alpha13.kilo = arrayList4;
                                        alpha12.juliet = alpha13.alpha();
                                        ab alpha14 = alpha12.alpha();
                                        aj ajVar4 = alpha14.kilo;
                                        if (ajVar4 != null) {
                                            String str14 = "appQualitySessionId: " + str3;
                                            try {
                                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                    try {
                                                        Log.d("FirebaseCrashlytics", str14, null);
                                                    } catch (IOException e15) {
                                                        e = e15;
                                                    }
                                                }
                                                if (z16) {
                                                    file = new File((File) cVar.white, ajVar4.bravo);
                                                } else {
                                                    file = new File((File) cVar.teal, ajVar4.bravo);
                                                }
                                                U7.a.foxtrot(file, S7.c.alpha.amber(alpha14));
                                            } catch (IOException e16) {
                                                e = e16;
                                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + charlie3, e);
                                                U7.c.hotel(new File((File) cVar.silver, str13));
                                                z12 = false;
                                                z11 = true;
                                                i4 = 4;
                                            }
                                        }
                                    } else {
                                        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                        break;
                                    }
                                    e = e15;
                                } catch (IOException e17) {
                                    e = e17;
                                }
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + charlie3, e);
                            }
                        }
                    }
                    U7.c.hotel(new File((File) cVar.silver, str13));
                    z12 = false;
                    z11 = true;
                    i4 = 4;
                }
                F8.q qVar2 = aVar22.charlie.delta().alpha;
                ArrayList bravo2 = aVar22.bravo();
                size = bravo2.size();
                if (size > 4) {
                    Iterator it5 = bravo2.subList(4, size).iterator();
                    while (it5.hasNext()) {
                        ((File) it5.next()).delete();
                    }
                    return;
                }
                return;
            }
        }
        str = null;
        if (z2 != 0) {
        }
        long currentTimeMillis22 = System.currentTimeMillis() / 1000;
        U7.a aVar222 = (U7.a) i1Var.alpha;
        cVar = aVar222.bravo;
        cVar.alpha(".com.google.firebase.crashlytics");
        cVar.alpha(".com.google.firebase.crashlytics-ndk");
        if (!((String) cVar.alpha).isEmpty()) {
        }
        charlie = aVar222.charlie();
        if (str2 != null) {
        }
        if (charlie.size() > 8) {
        }
        loop3: while (r9.hasNext()) {
        }
        F8.q qVar22 = aVar222.charlie.delta().alpha;
        ArrayList bravo22 = aVar222.bravo();
        size = bravo22.size();
        if (size > 4) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [R7.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [R7.aa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, R7.ai] */
    /* JADX WARN: Type inference failed for: r9v8, types: [R7.am, java.lang.Object] */
    public final void charlie(String str, Boolean bool) {
        boolean z2;
        int i4;
        Integer num;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String echo = av.q.echo("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", echo, null);
        }
        Locale locale = Locale.US;
        x xVar = this.foxtrot;
        ad adVar = this.hotel;
        String str2 = xVar.charlie;
        String str3 = (String) adVar.echo;
        String str4 = xVar.charlie().alpha;
        if (((String) adVar.charlie) != null) {
            i4 = 4;
            z2 = 4;
        } else {
            z2 = 4;
            i4 = 1;
        }
        L l10 = new L(str2, str3, (String) adVar.golf, str4, A0.z.charlie(i4), (J2.l) adVar.hotel);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        N n5 = new N(f.golf());
        Context context = this.alpha;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        e eVar = e.alpha;
        String str7 = Build.CPU_ABI;
        boolean isEmpty = TextUtils.isEmpty(str7);
        e eVar2 = e.alpha;
        if (isEmpty) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            e eVar3 = (e) e.purple.get(str7.toLowerCase(locale));
            if (eVar3 != null) {
                eVar2 = eVar3;
            }
        }
        int ordinal = eVar2.ordinal();
        String str8 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long alpha = f.alpha(context);
        boolean foxtrot = f.foxtrot();
        int charlie = f.charlie();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        this.juliet.delta(str, currentTimeMillis, new K(l10, n5, new M(ordinal, availableProcessors, alpha, blockCount, foxtrot, charlie)));
        if (bool.booleanValue() && str != null) {
            U7.c cVar = this.delta;
            synchronized (((String) cVar.alpha)) {
                cVar.alpha = str;
                ((P7.f) cVar.red).bravo.alpha(new B2.j(cVar, str, ((Q7.e) ((AtomicMarkableReference) ((C3.d) cVar.silver).red).getReference()).alpha(), ((Fe.c) cVar.white).hotel()));
            }
        }
        Q7.f fVar = this.india;
        ((Q7.d) fVar.purple).alpha();
        fVar.purple = Q7.f.red;
        if (str != null) {
            fVar.purple = new Q7.m(((U7.c) fVar.alpha).charlie(str, "userlog"));
        }
        this.lima.alpha(str);
        i1 i1Var = this.mike;
        s sVar = (s) i1Var.bravo;
        Charset charset = o0.alpha;
        ?? obj = new Object();
        obj.alpha = "19.4.4";
        ad adVar2 = sVar.charlie;
        String str11 = (String) adVar2.alpha;
        if (str11 != null) {
            obj.bravo = str11;
            x xVar2 = sVar.bravo;
            String str12 = xVar2.charlie().alpha;
            if (str12 != null) {
                obj.delta = str12;
                obj.echo = xVar2.charlie().bravo;
                obj.foxtrot = xVar2.charlie().charlie;
                String str13 = (String) adVar2.echo;
                if (str13 != null) {
                    obj.hotel = str13;
                    String str14 = (String) adVar2.golf;
                    if (str14 != null) {
                        obj.india = str14;
                        obj.charlie = 4;
                        obj.mike = (byte) (obj.mike | 1);
                        ?? obj2 = new Object();
                        obj2.foxtrot = false;
                        byte b2 = (byte) (obj2.mike | 2);
                        obj2.delta = currentTimeMillis;
                        obj2.mike = (byte) (b2 | 1);
                        if (str != null) {
                            obj2.bravo = str;
                            String str15 = s.golf;
                            if (str15 != null) {
                                obj2.alpha = str15;
                                String str16 = xVar2.charlie;
                                if (str16 != null) {
                                    String str17 = xVar2.charlie().alpha;
                                    J2.l lVar = (J2.l) adVar2.hotel;
                                    if (((J2.e) lVar.purple) == null) {
                                        lVar.purple = new J2.e(lVar);
                                    }
                                    J2.e eVar4 = (J2.e) lVar.purple;
                                    String str18 = (String) eVar4.purple;
                                    if (eVar4 == null) {
                                        lVar.purple = new J2.e(lVar);
                                    }
                                    obj2.golf = new ak(str16, str13, str14, str17, str18, (String) ((J2.e) lVar.purple).red);
                                    ?? obj3 = new Object();
                                    obj3.alpha = 3;
                                    obj3.echo = (byte) (obj3.echo | 1);
                                    if (str5 != null) {
                                        obj3.bravo = str5;
                                        if (str6 != null) {
                                            obj3.charlie = str6;
                                            obj3.delta = f.golf();
                                            obj3.echo = (byte) (obj3.echo | 2);
                                            obj2.india = obj3.alpha();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i5 = 7;
                                            if (!TextUtils.isEmpty(str7) && (num = (Integer) s.foxtrot.get(str7.toLowerCase(locale))) != null) {
                                                i5 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long alpha2 = f.alpha(sVar.alpha);
                                            long blockSize = statFs2.getBlockSize() * statFs2.getBlockCount();
                                            boolean foxtrot2 = f.foxtrot();
                                            int charlie2 = f.charlie();
                                            ?? obj4 = new Object();
                                            obj4.alpha = i5;
                                            byte b4 = (byte) (obj4.juliet | 1);
                                            obj4.juliet = b4;
                                            if (str8 != null) {
                                                obj4.bravo = str8;
                                                obj4.charlie = availableProcessors2;
                                                obj4.delta = alpha2;
                                                obj4.echo = blockSize;
                                                obj4.foxtrot = foxtrot2;
                                                obj4.golf = charlie2;
                                                obj4.juliet = (byte) (((byte) (((byte) (((byte) (((byte) (b4 | 2)) | 4)) | 8)) | 16)) | 32);
                                                if (str9 != null) {
                                                    obj4.hotel = str9;
                                                    if (str10 != null) {
                                                        obj4.india = str10;
                                                        obj2.juliet = obj4.alpha();
                                                        obj2.lima = 3;
                                                        obj2.mike = (byte) (obj2.mike | 4);
                                                        obj.juliet = obj2.alpha();
                                                        ab alpha3 = obj.alpha();
                                                        U7.c cVar2 = ((U7.a) i1Var.alpha).bravo;
                                                        aj ajVar = alpha3.kilo;
                                                        if (ajVar == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str19 = ajVar.bravo;
                                                        try {
                                                            U7.a.golf.getClass();
                                                            U7.a.foxtrot(cVar2.charlie(str19, "report"), S7.c.alpha.amber(alpha3));
                                                            File charlie3 = cVar2.charlie(str19, "start-time");
                                                            long j5 = ajVar.delta;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(charlie3), U7.a.echo);
                                                            try {
                                                                outputStreamWriter.write("");
                                                                charlie3.setLastModified(j5 * 1000);
                                                                outputStreamWriter.close();
                                                            } finally {
                                                            }
                                                        } catch (IOException e) {
                                                            String echo2 = av.q.echo("Could not persist report for session ", str19);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", echo2, e);
                                                            }
                                                        }
                                                    } else {
                                                        throw new NullPointerException("Null modelClass");
                                                    }
                                                } else {
                                                    throw new NullPointerException("Null manufacturer");
                                                }
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        } else {
                                            throw new NullPointerException("Null buildVersion");
                                        }
                                    } else {
                                        throw new NullPointerException("Null version");
                                    }
                                } else {
                                    throw new NullPointerException("Null identifier");
                                }
                            } else {
                                throw new NullPointerException("Null generator");
                            }
                        } else {
                            throw new NullPointerException("Null identifier");
                        }
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                } else {
                    throw new NullPointerException("Null buildVersion");
                }
            } else {
                throw new NullPointerException("Null installationUuid");
            }
        } else {
            throw new NullPointerException("Null gmpAppId");
        }
    }

    public final boolean delta(D5.s sVar) {
        boolean z2;
        P7.f.alpha();
        t tVar = this.november;
        if (tVar != null && tVar.echo.get()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            bravo(true, sVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String echo() {
        NavigableSet charlie = ((U7.a) this.mike.alpha).charlie();
        if (!charlie.isEmpty()) {
            return (String) charlie.first();
        }
        return null;
    }

    public final String foxtrot() {
        String string;
        InputStream resourceAsStream;
        Context context = this.alpha;
        int delta = f.delta(context, "com.google.firebase.crashlytics.version_control_info", CTVariableUtils.STRING);
        if (delta == 0) {
            string = null;
        } else {
            string = context.getResources().getString(delta);
        }
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(sierra), 0);
        }
        ClassLoader classLoader = n.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream != null) {
            try {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Read version control info from file", null);
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[Barcode.FORMAT_UPC_E];
                    while (true) {
                        int read = resourceAsStream.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            String encodeToString = Base64.encodeToString(byteArray, 0);
                            resourceAsStream.close();
                            return encodeToString;
                        }
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
    }

    public final void golf() {
        boolean z2;
        try {
            String foxtrot = foxtrot();
            if (foxtrot != null) {
                try {
                    ((C3.d) this.delta.teal).mike("com.crashlytics.version-control-info", foxtrot);
                } catch (IllegalArgumentException e) {
                    Context context = this.alpha;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e4) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e4);
        }
    }

    public final void hotel(G6.q qVar) {
        G6.q qVar2;
        G6.q alpha;
        U7.c cVar = ((U7.a) this.mike.alpha).bravo;
        boolean isEmpty = U7.c.india(((File) cVar.teal).listFiles()).isEmpty();
        G6.h hVar = this.oscar;
        if (isEmpty && U7.c.india(((File) cVar.white).listFiles()).isEmpty() && U7.c.india(((File) cVar.yellow).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            hVar.delta(Boolean.FALSE);
            return;
        }
        L7.c cVar2 = L7.c.alpha;
        cVar2.foxtrot("Crash reports are available to be sent.");
        u uVar = this.bravo;
        if (uVar.bravo()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            hVar.delta(Boolean.FALSE);
            alpha = V4.echo(Boolean.TRUE);
        } else {
            cVar2.charlie("Automatic data collection is disabled.");
            cVar2.foxtrot("Notifying that unsent reports are available.");
            hVar.delta(Boolean.TRUE);
            synchronized (uVar.charlie) {
                qVar2 = ((G6.h) uVar.delta).alpha;
            }
            G6.q kilo = qVar2.kilo(new u8.b(6));
            cVar2.charlie("Waiting for send/deleteUnsentReports to be called.");
            alpha = P7.a.alpha(kilo, this.papa.alpha);
        }
        alpha.november(this.echo.alpha, new J2.c(11, this, qVar, false));
    }
}
