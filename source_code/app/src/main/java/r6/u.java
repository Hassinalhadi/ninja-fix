package r6;

import S.aj;
import S.ak;
import Tf.ah;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Looper;
import bd.ScheduledExecutorServiceC0750c;
import bv.am;
import com.google.android.gms.internal.measurement.C1317f3;
import com.google.android.gms.internal.measurement.C1327h3;
import com.google.android.gms.internal.measurement.C1346l2;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import com.google.android.gms.internal.measurement.F3;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.measurement.x3;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.measurement.internal.aa;
import com.google.android.gms.measurement.internal.ac;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import t6.Q3;

/* loaded from: classes2.dex */
public final class u implements Z3.a, N5.a, I7.e, W7.c, T1.b, ar.a, aa {
    public static u purple;
    public final /* synthetic */ int alpha;

    public /* synthetic */ u(int i4) {
        this.alpha = i4;
    }

    public static final float alpha(float f5, float[] fArr, float[] fArr2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float abs = Math.abs(f5);
        float signum = Math.signum(f5);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i4 = -(binarySearch + 1);
        int i5 = i4 - 1;
        if (i5 >= fArr.length - 1) {
            float f15 = fArr[fArr.length - 1];
            float f16 = fArr2[fArr.length - 1];
            if (f15 == 0.0f) {
                return 0.0f;
            }
            return (f16 / f15) * f5;
        }
        if (i5 == -1) {
            float f17 = fArr[0];
            f12 = fArr2[0];
            f13 = f17;
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            float f18 = fArr[i5];
            float f19 = fArr[i4];
            f10 = fArr2[i5];
            f11 = f18;
            f12 = fArr2[i4];
            f13 = f19;
        }
        if (f11 == f13) {
            f14 = 0.0f;
        } else {
            f14 = (abs - f11) / (f13 - f11);
        }
        return (((f12 - f10) * Math.max(0.0f, Math.min(1.0f, f14))) + f10) * signum;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Tf.k, java.lang.Object] */
    public static ah bravo(String str, boolean z2) {
        Intrinsics.echo(str, "<this>");
        Tf.n nVar = Uf.f.alpha;
        ?? obj = new Object();
        obj.n(str);
        return Uf.f.delta(obj, z2);
    }

    public static ah charlie(File file) {
        String str = ah.purple;
        String file2 = file.toString();
        Intrinsics.delta(file2, "toString(...)");
        return bravo(file2, false);
    }

    public static ah delta(Path path) {
        String str = ah.purple;
        Intrinsics.echo(path, "<this>");
        return bravo(path.toString(), false);
    }

    public static S.g echo() {
        return (S.g) S.n.bravo.mike();
    }

    public static S.g foxtrot(S.g gVar) {
        if (gVar instanceof aj) {
            aj ajVar = (aj) gVar;
            if (ajVar.tango == P.e.charlie()) {
                ajVar.romeo = null;
                return gVar;
            }
        }
        if (gVar instanceof ak) {
            ak akVar = (ak) gVar;
            if (akVar.india == P.e.charlie()) {
                akVar.hotel = null;
                return gVar;
            }
        }
        S.g hotel = S.n.hotel(gVar, null, false);
        hotel.juliet();
        return hotel;
    }

    public static Object hotel(Function0 function0, Function1 function1) {
        S.c cVar;
        S.g ajVar;
        if (function1 == null) {
            return function0.invoke();
        }
        S.g gVar = (S.g) S.n.bravo.mike();
        if (gVar instanceof aj) {
            aj ajVar2 = (aj) gVar;
            if (ajVar2.tango == P.e.charlie()) {
                Function1 function12 = ajVar2.romeo;
                Function1 function13 = ajVar2.sierra;
                try {
                    ((aj) gVar).romeo = S.n.lima(function1, function12, true);
                    ((aj) gVar).sierra = function13;
                    return function0.invoke();
                } finally {
                    ajVar2.romeo = function12;
                    ajVar2.sierra = function13;
                }
            }
        }
        if (gVar != null && !(gVar instanceof S.c)) {
            if (function1 == null) {
                return function0.invoke();
            }
            ajVar = gVar.uniform(function1);
        } else {
            if (gVar instanceof S.c) {
                cVar = (S.c) gVar;
            } else {
                cVar = null;
            }
            ajVar = new aj(cVar, function1, null, true, false);
        }
        try {
            S.g juliet = ajVar.juliet();
            try {
                Object invoke = function0.invoke();
                S.g.quebec(juliet);
                return invoke;
            } catch (Throwable th) {
                S.g.quebec(juliet);
                throw th;
            }
        } finally {
            ajVar.charlie();
        }
    }

    public static B2.s india(Ac.k kVar) {
        S.n.foxtrot(S.n.alpha);
        synchronized (S.n.charlie) {
            S.n.hotel = CollectionsKt.plus(S.n.hotel, kVar);
        }
        return new B2.s(25, kVar);
    }

    public static void juliet(S.g gVar, S.g gVar2, Function1 function1) {
        if (gVar == gVar2) {
            if (gVar instanceof aj) {
                ((aj) gVar).romeo = function1;
                return;
            } else if (gVar instanceof ak) {
                ((ak) gVar).hotel = function1;
                return;
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + gVar).toString());
            }
        }
        gVar2.getClass();
        S.g.quebec(gVar);
        gVar2.charlie();
    }

    public static void lima() {
        boolean z2;
        synchronized (S.n.charlie) {
            am amVar = S.n.juliet.hotel;
            z2 = false;
            if (amVar != null) {
                if (amVar.hotel()) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            S.n.alpha();
        }
    }

    public static final boolean mike() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    @Override // ar.a
    /* renamed from: apply */
    public Object mo11apply(Object obj) {
        return obj;
    }

    @Override // I7.e
    public Object create(I7.c cVar) {
        com.google.mlkit.common.sdkinternal.a aVar = new com.google.mlkit.common.sdkinternal.a();
        K1.n nVar = new K1.n(2);
        ReferenceQueue referenceQueue = aVar.alpha;
        Set set = aVar.bravo;
        set.add(new com.google.mlkit.common.sdkinternal.o(aVar, referenceQueue, set, nVar));
        Thread thread = new Thread(new be.g(16, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override // N5.a
    public long getTime() {
        return System.currentTimeMillis();
    }

    @Override // W7.c
    public W7.b golf(U8.a aVar, JSONObject jSONObject) {
        F8.q qVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            qVar = new F8.q(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            qVar = new F8.q(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        F8.q qVar2 = qVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        W7.a aVar2 = new W7.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j5 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j5 * 1000) + System.currentTimeMillis();
        }
        return new W7.b(currentTimeMillis, qVar2, aVar2, optDouble, optDouble2, optInt2);
    }

    @Override // Z3.a
    public Object kilo() {
        try {
            return new H3.f(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 20:
                List list = ac.alpha;
                Boolean bool = (Boolean) F3.alpha.bravo();
                bool.getClass();
                return bool;
            case 21:
                List list2 = ac.alpha;
                x3.purple.get();
                Boolean bool2 = (Boolean) z3.golf.bravo();
                bool2.getClass();
                return bool2;
            case 22:
                List list3 = ac.alpha;
                x3.purple.get();
                Boolean bool3 = (Boolean) z3.bravo.bravo();
                bool3.getClass();
                return bool3;
            case 23:
                List list4 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.f6686b.bravo()).longValue());
            case 24:
                List list5 = ac.alpha;
                Boolean bool4 = (Boolean) n3.alpha.bravo();
                bool4.getClass();
                return bool4;
            case 25:
                Boolean bool5 = (Boolean) C1346l2.alpha.bravo();
                bool5.getClass();
                return bool5;
            case 26:
                List list6 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.f6689f.bravo()).longValue());
            case 27:
                List list7 = ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.jade.bravo();
                l10.getClass();
                return l10;
            case 28:
                List list8 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.gold.bravo()).longValue());
            default:
                List list9 = ac.alpha;
                C1317f3.purple.get();
                Boolean bool6 = (Boolean) C1327h3.echo.bravo();
                bool6.getClass();
                return bool6;
        }
    }

    public u(av.h hVar, androidx.camera.camera2.internal.compat.j jVar, Q3.c cVar, bd.h hVar2, ScheduledExecutorServiceC0750c scheduledExecutorServiceC0750c) {
        this.alpha = 15;
        Integer num = (Integer) jVar.alpha(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            num.intValue();
        }
        new com.google.mlkit.common.sdkinternal.b(cVar);
        Q3.alpha(new a4.u(5, jVar));
    }
}
