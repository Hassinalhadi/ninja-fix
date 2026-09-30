package i6;

import a0.C0366t;
import a0.au;
import android.os.Looper;
import android.util.Log;
import g0.C1725e;
import g0.C1726f;
import g0.C1730j;
import g0.ah;
import g0.m;
import g0.n;
import g0.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class d {
    public static ClassLoader alpha;
    public static Thread bravo;
    public static C1726f charlie;

    public static final C1726f alpha() {
        C1726f c1726f = charlie;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = ah.alpha;
        au auVar = new au(C0366t.bravo);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(9.0f, 16.17f));
        arrayList.add(new m(4.83f, 12.0f));
        arrayList.add(new u(-1.42f, 1.41f));
        arrayList.add(new m(9.0f, 19.0f));
        arrayList.add(new m(21.0f, 7.0f));
        arrayList.add(new u(-1.41f, -1.41f));
        arrayList.add(C1730j.charlie);
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", arrayList);
        C1726f echo = c1725e.echo();
        charlie = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        if (r1 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader bravo() {
        ClassLoader classLoader;
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        I3.a aVar;
        synchronized (d.class) {
            if (alpha == null) {
                Thread thread2 = bravo;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i4 = 0;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < activeGroupCount) {
                                            threadGroup = threadGroupArr[i5];
                                            if ("dynamiteLoader".equals(threadGroup.getName())) {
                                                break;
                                            }
                                            i5++;
                                        } else {
                                            threadGroup = null;
                                            break;
                                        }
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i4 < activeCount) {
                                            thread = threadArr[i4];
                                            if ("GmsDynamite".equals(thread.getName())) {
                                                break;
                                            }
                                            i4++;
                                        } else {
                                            thread = null;
                                            break;
                                        }
                                    }
                                    if (thread == null) {
                                        try {
                                            aVar = new I3.a(threadGroup, "GmsDynamite");
                                        } catch (SecurityException e4) {
                                            e = e4;
                                        }
                                        try {
                                            aVar.setContextClassLoader(null);
                                            aVar.start();
                                            thread = aVar;
                                        } catch (SecurityException e5) {
                                            e = e5;
                                            thread = aVar;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                                            thread2 = thread;
                                            bravo = thread2;
                                        }
                                    }
                                } catch (SecurityException e10) {
                                    e = e10;
                                    thread = null;
                                }
                            } finally {
                            }
                        }
                        thread2 = thread;
                    }
                    bravo = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = bravo.getContextClassLoader();
                    } catch (SecurityException e11) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e11.getMessage());
                    }
                }
                alpha = classLoader2;
            }
            classLoader = alpha;
        }
        return classLoader;
    }

    public static boolean charlie(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }
}
