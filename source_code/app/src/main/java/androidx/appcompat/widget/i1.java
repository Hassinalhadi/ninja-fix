package androidx.appcompat.widget;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.i1;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import s6.V4;

/* loaded from: classes3.dex */
public final class i1 {
    public Object alpha;
    public Object bravo;
    public Object charlie;
    public Object delta;
    public Object echo;
    public Object foxtrot;
    public Object golf;

    public static R7.ap alpha(R7.ap apVar, Q7.f fVar, U7.c cVar, Map map) {
        Map unmodifiableMap;
        R7.ao alpha = apVar.alpha();
        String charlie = ((Q7.d) fVar.purple).charlie();
        if (charlie != null) {
            alpha.echo = new R7.C(charlie);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean isEmpty = map.isEmpty();
        C3.d dVar = (C3.d) cVar.silver;
        if (isEmpty) {
            unmodifiableMap = ((Q7.e) ((AtomicMarkableReference) dVar.red).getReference()).alpha();
        } else {
            HashMap hashMap = new HashMap(((Q7.e) ((AtomicMarkableReference) dVar.red).getReference()).alpha());
            int i4 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String bravo = Q7.e.bravo(Barcode.FORMAT_UPC_E, (String) entry.getKey());
                if (hashMap.size() >= 64 && !hashMap.containsKey(bravo)) {
                    i4++;
                } else {
                    hashMap.put(bravo, Q7.e.bravo(Barcode.FORMAT_UPC_E, (String) entry.getValue()));
                }
            }
            if (i4 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i4 + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap = Collections.unmodifiableMap(hashMap);
        }
        List echo = echo(unmodifiableMap);
        List echo2 = echo(((Q7.e) ((AtomicMarkableReference) ((C3.d) cVar.teal).red).getReference()).alpha());
        if (!echo.isEmpty() || !echo2.isEmpty()) {
            R7.aq aqVar = apVar.charlie;
            alpha.charlie = new R7.aq(aqVar.alpha, echo, echo2, aqVar.delta, aqVar.echo, aqVar.foxtrot, aqVar.golf);
        }
        return alpha.alpha();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, R7.D] */
    public static R7.k0 bravo(R7.ap apVar, U7.c cVar) {
        List hotel = ((Fe.c) cVar.white).hotel();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < hotel.size(); i4++) {
            Q7.n nVar = (Q7.n) hotel.get(i4);
            nVar.getClass();
            ?? obj = new Object();
            Q7.b bVar = (Q7.b) nVar;
            String str = bVar.echo;
            if (str != null) {
                String str2 = bVar.bravo;
                if (str2 != null) {
                    obj.alpha = new R7.F(str2, str);
                    String str3 = bVar.charlie;
                    if (str3 != null) {
                        obj.bravo = str3;
                        String str4 = bVar.delta;
                        if (str4 != null) {
                            obj.charlie = str4;
                            obj.delta = bVar.foxtrot;
                            obj.echo = (byte) (obj.echo | 1);
                            arrayList.add(obj.alpha());
                        } else {
                            throw new NullPointerException("Null parameterValue");
                        }
                    } else {
                        throw new NullPointerException("Null parameterKey");
                    }
                } else {
                    throw new NullPointerException("Null rolloutId");
                }
            } else {
                throw new NullPointerException("Null variantId");
            }
        }
        if (arrayList.isEmpty()) {
            return apVar;
        }
        R7.ao alpha = apVar.alpha();
        alpha.foxtrot = new R7.G(arrayList);
        return alpha.alpha();
    }

    public static String charlie(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream2;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, androidx.appcompat.widget.i1] */
    public static i1 delta(Context context, O7.x xVar, U7.c cVar, B2.ad adVar, Q7.f fVar, U7.c cVar2, J2.e eVar, D5.s sVar, J2.l lVar, O7.i iVar, P7.f fVar2) {
        O7.s sVar2 = new O7.s(context, xVar, adVar, eVar, sVar);
        U7.a aVar = new U7.a(cVar, sVar, iVar);
        S7.c cVar3 = V7.a.bravo;
        E5.s.bravo(context);
        V7.a aVar2 = new V7.a(new V7.c(E5.s.alpha().charlie(new C5.a(V7.a.charlie, V7.a.delta)).alpha("FIREBASE_CRASHLYTICS_REPORT", new B5.c("json"), V7.a.echo), sVar.delta(), lVar));
        ?? obj = new Object();
        obj.bravo = sVar2;
        obj.alpha = aVar;
        obj.charlie = aVar2;
        obj.delta = fVar;
        obj.echo = cVar2;
        obj.foxtrot = xVar;
        obj.golf = fVar2;
        return obj;
    }

    public static List echo(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new R7.af(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new E0.k(2));
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, R7.ao] */
    public void foxtrot(Throwable th, Thread thread, String str, final Q7.c cVar, boolean z2) {
        J2.e eVar;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        J2.e eVar2;
        boolean z10;
        final boolean equals = str.equals("crash");
        O7.s sVar = (O7.s) this.bravo;
        Context context = sVar.alpha;
        int i4 = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        Boolean bool = null;
        J2.i iVar = null;
        while (true) {
            boolean isEmpty = stack.isEmpty();
            eVar = sVar.delta;
            if (isEmpty) {
                break;
            }
            Throwable th3 = (Throwable) stack.pop();
            iVar = new J2.i(th3.getLocalizedMessage(), th3.getClass().getName(), eVar.emerald(th3.getStackTrace()), iVar);
        }
        ?? obj = new Object();
        obj.bravo = str;
        obj.alpha = cVar.bravo;
        obj.golf = (byte) (obj.golf | 1);
        R7.d0 echo = L7.c.bravo.echo(context);
        int i5 = ((R7.az) echo).charlie;
        if (i5 > 0) {
            if (i5 != 100) {
                z10 = true;
            } else {
                z10 = false;
            }
            bool = Boolean.valueOf(z10);
        }
        ArrayList delta = L7.c.delta(context);
        byte b2 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) iVar.red;
        String name = thread.getName();
        Boolean bool2 = bool;
        if (name != null) {
            byte b4 = (byte) 1;
            List delta2 = O7.s.delta(stackTraceElementArr, 4);
            if (delta2 != null) {
                if (b4 == 1) {
                    arrayList.add(new R7.av(delta2, 4, name));
                    if (z2) {
                        Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                            Thread key = next.getKey();
                            if (!key.equals(thread)) {
                                StackTraceElement[] emerald = eVar.emerald(next.getValue());
                                String name2 = key.getName();
                                if (name2 != null) {
                                    it = it2;
                                    List delta3 = O7.s.delta(emerald, 0);
                                    if (delta3 != null) {
                                        if (b4 == 1) {
                                            eVar2 = eVar;
                                            arrayList.add(new R7.av(delta3, 0, name2));
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            if (b4 == 0) {
                                                sb2.append(" importance");
                                            }
                                            throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
                                        }
                                    } else {
                                        throw new NullPointerException("Null frames");
                                    }
                                } else {
                                    throw new NullPointerException("Null name");
                                }
                            } else {
                                it = it2;
                                eVar2 = eVar;
                            }
                            it2 = it;
                            eVar = eVar2;
                        }
                    }
                    List unmodifiableList = Collections.unmodifiableList(arrayList);
                    R7.at charlie = O7.s.charlie(iVar, 0);
                    R7.au echo2 = O7.s.echo();
                    List alpha = sVar.alpha();
                    if (alpha != null) {
                        R7.ar arVar = new R7.ar(unmodifiableList, charlie, null, echo2, alpha);
                        if (b2 == 1) {
                            obj.charlie = new R7.aq(arVar, null, null, bool2, echo, delta, i4);
                            obj.delta = sVar.bravo(i4);
                            R7.ap alpha2 = obj.alpha();
                            Q7.f fVar = (Q7.f) this.delta;
                            U7.c cVar2 = (U7.c) this.echo;
                            final R7.k0 bravo = bravo(alpha(alpha2, fVar, cVar2, cVar.charlie), cVar2);
                            if (!z2) {
                                ((P7.f) this.golf).bravo.alpha(new Runnable() { // from class: O7.y
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        i1 i1Var = i1.this;
                                        i1Var.getClass();
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                                        }
                                        ((U7.a) i1Var.alpha).delta(bravo, cVar.alpha, equals);
                                    }
                                });
                                return;
                            } else {
                                ((U7.a) this.alpha).delta(bravo, cVar.alpha, equals);
                                return;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder();
                        if (b2 == 0) {
                            sb3.append(" uiOrientation");
                        }
                        throw new IllegalStateException(A0.z.kilo(sb3, "Missing required properties:"));
                    }
                    throw new NullPointerException("Null binaries");
                }
                StringBuilder sb4 = new StringBuilder();
                if (b4 == 0) {
                    sb4.append(" importance");
                }
                throw new IllegalStateException(A0.z.kilo(sb4, "Missing required properties:"));
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:? -> B:43:0x0137). Please report as a decompilation issue!!! */
    public G6.q golf(Executor executor, String str) {
        O7.a aVar;
        boolean z2;
        ArrayBlockingQueue arrayBlockingQueue;
        G6.h hVar;
        ArrayList bravo = ((U7.a) this.alpha).bravo();
        ArrayList arrayList = new ArrayList();
        Iterator it = bravo.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                S7.c cVar = U7.a.golf;
                String echo = U7.a.echo(file);
                cVar.getClass();
                arrayList.add(new O7.a(S7.c.india(echo), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            O7.a aVar2 = (O7.a) it2.next();
            if (str == null || str.equals(aVar2.bravo)) {
                V7.a aVar3 = (V7.a) this.charlie;
                R7.ab abVar = aVar2.alpha;
                boolean z10 = true;
                if (abVar.foxtrot != null && abVar.golf != null) {
                    aVar = aVar2;
                } else {
                    O7.w bravo2 = ((O7.x) this.foxtrot).bravo(true);
                    R7.aa alpha = aVar2.alpha.alpha();
                    alpha.echo = bravo2.alpha;
                    R7.aa alpha2 = alpha.alpha().alpha();
                    alpha2.foxtrot = bravo2.bravo;
                    aVar = new O7.a(alpha2.alpha(), aVar2.bravo, aVar2.charlie);
                }
                if (str != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                V7.c cVar2 = aVar3.alpha;
                ArrayBlockingQueue arrayBlockingQueue2 = cVar2.foxtrot;
                synchronized (arrayBlockingQueue2) {
                    try {
                        hVar = new G6.h();
                        if (z2) {
                            ((AtomicInteger) cVar2.india.alpha).getAndIncrement();
                            if (cVar2.foxtrot.size() >= cVar2.echo) {
                                z10 = false;
                            }
                            if (z10) {
                                L7.c cVar3 = L7.c.alpha;
                                cVar3.charlie("Enqueueing report: " + aVar.bravo);
                                cVar3.charlie("Queue size: " + cVar2.foxtrot.size());
                                arrayBlockingQueue = arrayBlockingQueue2;
                                try {
                                    cVar2.golf.execute(new D2.d(cVar2, aVar, hVar, 3, false));
                                    cVar3.charlie("Closing task for report: " + aVar.bravo);
                                    hVar.delta(aVar);
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            } else {
                                cVar2.alpha();
                                String str2 = "Dropping report due to queue being full: " + aVar.bravo;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str2, null);
                                }
                                ((AtomicInteger) cVar2.india.purple).getAndIncrement();
                                hVar.delta(aVar);
                            }
                        } else {
                            cVar2.bravo(aVar, hVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        arrayBlockingQueue = arrayBlockingQueue2;
                        throw th;
                    }
                }
                arrayList2.add(hVar.alpha.mike(executor, new B2.s(18, this)));
            }
        }
        return V4.foxtrot(arrayList2);
    }
}
