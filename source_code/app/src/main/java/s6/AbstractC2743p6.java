package s6;

import O7.l;
import Tf.ah;
import Tf.u;
import a3.m;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.mlkit.vision.barcode.common.Barcode;
import fe.C1713e;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import vf.ao;

/* renamed from: s6.p6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2743p6 {
    public static void alpha(int i4) {
        if (2 <= i4 && i4 < 37) {
            return;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "radix ", " was not in valid range ");
        sierra.append(new C1713e(2, 36, 1));
        throw new IllegalArgumentException(sierra.toString());
    }

    public static final M2.k bravo(Context context) {
        final M2.e eVar = new M2.e(context);
        final int i4 = 0;
        Lazy lazy = LazyKt.lazy(new Function0() { // from class: M2.d
            /* JADX WARN: Type inference failed for: r2v7, types: [P2.a, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5;
                V2.f lVar;
                int i10;
                P2.i iVar;
                int i11 = 7;
                switch (i4) {
                    case 0:
                        Context context2 = eVar.alpha;
                        Bitmap.Config[] configArr = a3.h.alpha;
                        double d4 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            Intrinsics.checkNotNull(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d4 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        Fe.c cVar = new Fe.c(7);
                        if (d4 > 0.0d) {
                            Bitmap.Config[] configArr2 = a3.h.alpha;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                Intrinsics.checkNotNull(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                if ((context2.getApplicationInfo().flags & 1048576) != 0) {
                                    i10 = activityManager.getLargeMemoryClass();
                                } else {
                                    i10 = activityManager.getMemoryClass();
                                }
                            } catch (Exception unused2) {
                                i10 = Barcode.FORMAT_QR_CODE;
                            }
                            double d9 = d4 * i10;
                            double d10 = Barcode.FORMAT_UPC_E;
                            i5 = (int) (d9 * d10 * d10);
                        } else {
                            i5 = 0;
                        }
                        if (i5 > 0) {
                            lVar = new J2.c(i5, cVar);
                        } else {
                            lVar = new l(i11, cVar);
                        }
                        return new V2.b(lVar, cVar);
                    default:
                        e eVar2 = eVar;
                        m mVar = m.alpha;
                        Context context3 = eVar2.alpha;
                        synchronized (mVar) {
                            try {
                                iVar = m.bravo;
                                if (iVar == null) {
                                    ?? obj = new Object();
                                    obj.bravo = u.SYSTEM;
                                    obj.charlie = 0.02d;
                                    obj.delta = 10485760L;
                                    obj.echo = 262144000L;
                                    Cf.e eVar3 = ao.alpha;
                                    obj.foxtrot = Cf.d.purple;
                                    Bitmap.Config[] configArr3 = a3.h.alpha;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir != null) {
                                        cacheDir.mkdirs();
                                        File lima = FilesKt.lima(cacheDir, "image_cache");
                                        String str = ah.purple;
                                        obj.alpha = r6.u.charlie(lima);
                                        iVar = obj.alpha();
                                        m.bravo = iVar;
                                    } else {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                }
                            } finally {
                            }
                        }
                        return iVar;
                }
            }
        });
        final int i5 = 1;
        return new M2.k(eVar.alpha, eVar.bravo, lazy, LazyKt.lazy(new Function0() { // from class: M2.d
            /* JADX WARN: Type inference failed for: r2v7, types: [P2.a, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i52;
                V2.f lVar;
                int i10;
                P2.i iVar;
                int i11 = 7;
                switch (i5) {
                    case 0:
                        Context context2 = eVar.alpha;
                        Bitmap.Config[] configArr = a3.h.alpha;
                        double d4 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            Intrinsics.checkNotNull(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d4 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        Fe.c cVar = new Fe.c(7);
                        if (d4 > 0.0d) {
                            Bitmap.Config[] configArr2 = a3.h.alpha;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                Intrinsics.checkNotNull(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                if ((context2.getApplicationInfo().flags & 1048576) != 0) {
                                    i10 = activityManager.getLargeMemoryClass();
                                } else {
                                    i10 = activityManager.getMemoryClass();
                                }
                            } catch (Exception unused2) {
                                i10 = Barcode.FORMAT_QR_CODE;
                            }
                            double d9 = d4 * i10;
                            double d10 = Barcode.FORMAT_UPC_E;
                            i52 = (int) (d9 * d10 * d10);
                        } else {
                            i52 = 0;
                        }
                        if (i52 > 0) {
                            lVar = new J2.c(i52, cVar);
                        } else {
                            lVar = new l(i11, cVar);
                        }
                        return new V2.b(lVar, cVar);
                    default:
                        e eVar2 = eVar;
                        m mVar = m.alpha;
                        Context context3 = eVar2.alpha;
                        synchronized (mVar) {
                            try {
                                iVar = m.bravo;
                                if (iVar == null) {
                                    ?? obj = new Object();
                                    obj.bravo = u.SYSTEM;
                                    obj.charlie = 0.02d;
                                    obj.delta = 10485760L;
                                    obj.echo = 262144000L;
                                    Cf.e eVar3 = ao.alpha;
                                    obj.foxtrot = Cf.d.purple;
                                    Bitmap.Config[] configArr3 = a3.h.alpha;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir != null) {
                                        cacheDir.mkdirs();
                                        File lima = FilesKt.lima(cacheDir, "image_cache");
                                        String str = ah.purple;
                                        obj.alpha = r6.u.charlie(lima);
                                        iVar = obj.alpha();
                                        m.bravo = iVar;
                                    } else {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                }
                            } finally {
                            }
                        }
                        return iVar;
                }
            }
        }), LazyKt.lazy(new F4.h(24)), new M2.b(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList()), eVar.charlie);
    }

    public static final boolean charlie(char c3, char c4, boolean z2) {
        if (c3 == c4) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c3);
        char upperCase2 = Character.toUpperCase(c4);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static boolean delta(char c3) {
        if (!Character.isWhitespace(c3) && !Character.isSpaceChar(c3)) {
            return false;
        }
        return true;
    }
}
