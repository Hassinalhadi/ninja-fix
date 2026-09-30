package Y8;

import G6.i;
import G6.q;
import V5.k;
import V5.x;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import android.util.Log;
import androidx.lifecycle.B;
import androidx.lifecycle.aa;
import androidx.lifecycle.ak;
import com.airbnb.lottie.compose.LottieConstants;
import com.bumptech.glide.load.engine.h;
import com.google.android.gms.tasks.Task;
import com.google.android.material.internal.ab;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.p;
import com.google.mlkit.vision.barcode.internal.zzl;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import n7.AbstractC2162a;
import s6.V4;
import t6.D2;
import t6.E2;
import t6.EnumC3085y2;
import t6.J2;
import t6.c4;
import t6.d4;
import t6.h4;
import t6.j4;
import t6.k4;
import t6.l4;

/* loaded from: classes2.dex */
public abstract class c implements Closeable, ak, AutoCloseable {
    public static final /* synthetic */ int zza = 0;
    private static final V5.g zzb = new V5.g("MobileVisionBase", "");
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private final com.google.mlkit.common.sdkinternal.f zzd;
    private final G6.b zze;
    private final Executor zzf;
    private final Task zzg;

    public c(zzl zzlVar, Executor executor) {
        this.zzd = zzlVar;
        G6.b bVar = new G6.b();
        this.zze = bVar;
        this.zzf = executor;
        zzlVar.pin();
        Task callAfterLoad = zzlVar.callAfterLoad(executor, f.alpha, bVar.alpha);
        e eVar = e.alpha;
        q qVar = (q) callAfterLoad;
        qVar.getClass();
        qVar.delta(i.alpha, eVar);
        this.zzg = qVar;
    }

    public static void zzc(Exception exc) {
        V5.g gVar = zzb;
        if (Log.isLoggable(gVar.alpha, 6)) {
            Log.e("MobileVisionBase", gVar.bravo("Error preloading model resource"), exc);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @B(aa.ON_DESTROY)
    public synchronized void close() {
        if (!this.zzc.getAndSet(true)) {
            this.zze.alpha();
            this.zzd.unpin(this.zzf);
        }
    }

    public synchronized Task closeWithTask() {
        if (!this.zzc.getAndSet(true)) {
            this.zze.alpha();
            return this.zzd.unpinWithTask(this.zzf);
        }
        return V4.echo(null);
    }

    public synchronized Task getInitTaskBase() {
        return this.zzg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if ((r1 - ((java.lang.Long) r9.get(r12)).longValue()) <= java.util.concurrent.TimeUnit.SECONDS.toMillis(30)) goto L13;
     */
    /* JADX WARN: Type inference failed for: r0v9, types: [U7.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [t6.e4, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Task process(Bitmap bitmap, int i4) {
        String alpha;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        X8.a aVar = new X8.a(bitmap, i4);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (j4.class) {
            byte b2 = (byte) (((byte) 1) | 2);
            try {
                if (b2 == 3) {
                    try {
                        h4 echo = j4.echo(new Object());
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        J2 j22 = J2.INPUT_IMAGE_CONSTRUCTION;
                        echo.getClass();
                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                        HashMap hashMap = echo.india;
                        long j5 = hashMap.get(j22) == null ? elapsedRealtime3 : elapsedRealtime3;
                        hashMap.put(j22, Long.valueOf(j5));
                        ?? obj = new Object();
                        obj.red = EnumC3085y2.BITMAP;
                        obj.purple = D2.BITMAP;
                        obj.silver = Integer.valueOf(allocationByteCount & LottieConstants.IterateForever);
                        obj.white = Integer.valueOf(height & LottieConstants.IterateForever);
                        obj.teal = Integer.valueOf(width & LottieConstants.IterateForever);
                        obj.alpha = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
                        obj.yellow = Integer.valueOf(i4 & LottieConstants.IterateForever);
                        E2 e22 = new E2(obj);
                        h hVar = new h(12, false);
                        hVar.silver = e22;
                        ab abVar = new ab(hVar);
                        q qVar = echo.echo;
                        if (qVar.juliet()) {
                            alpha = (String) qVar.hotel();
                        } else {
                            alpha = k.charlie.alpha(echo.golf);
                        }
                        p.alpha.execute(new ao.d(echo, abVar, j22, alpha, 12, false));
                        return processBase(aVar);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                if ((b2 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b2 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public synchronized Task processBase(AbstractC2162a abstractC2162a) {
        x.india(abstractC2162a, "MlImage can not be null");
        throw null;
    }

    public final Object zza(X8.a aVar) throws Exception {
        d4 d4Var;
        HashMap hashMap = d4.white;
        l4.bravo();
        int i4 = k4.alpha;
        l4.bravo();
        if (!Boolean.parseBoolean("")) {
            d4Var = c4.yellow;
        } else {
            HashMap hashMap2 = d4.white;
            if (hashMap2.get("detectorTaskWithResource#run") == null) {
                hashMap2.put("detectorTaskWithResource#run", new d4("detectorTaskWithResource#run"));
            }
            d4Var = (d4) hashMap2.get("detectorTaskWithResource#run");
        }
        d4Var.charlie();
        try {
            Object run = this.zzd.run(aVar);
            d4Var.close();
            return run;
        } catch (Throwable th) {
            try {
                d4Var.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public final Object zzb(AbstractC2162a abstractC2162a) throws Exception {
        throw null;
    }

    public synchronized Task processBase(X8.a aVar) {
        x.india(aVar, "InputImage can not be null");
        if (this.zzc.get()) {
            return V4.delta(new MlKitException("This detector is already closed!", 14));
        }
        if (aVar.delta >= 32 && aVar.echo >= 32) {
            return this.zzd.callAfterLoad(this.zzf, new J2.q(this, aVar), this.zze.alpha);
        }
        return V4.delta(new MlKitException("InputImage width and height should be at least 32!", 3));
    }

    public Task process(Image image, int i4) {
        return processBase(X8.a.charlie(image, i4, null));
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [t6.e4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [U7.c, java.lang.Object] */
    public Task process(ByteBuffer byteBuffer, int i4, int i5, int i10, int i11) {
        EnumC3085y2 enumC3085y2;
        String alpha;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        X8.a aVar = new X8.a(byteBuffer, i4, i5, i10, i11);
        int limit = byteBuffer.limit();
        synchronized (j4.class) {
            byte b2 = (byte) (((byte) 1) | 2);
            try {
                if (b2 == 3) {
                    try {
                        h4 echo = j4.echo(new Object());
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        J2 j22 = J2.INPUT_IMAGE_CONSTRUCTION;
                        echo.getClass();
                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                        HashMap hashMap = echo.india;
                        if (hashMap.get(j22) == null || elapsedRealtime3 - ((Long) hashMap.get(j22)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
                            hashMap.put(j22, Long.valueOf(elapsedRealtime3));
                            ?? obj = new Object();
                            if (i11 == -1) {
                                enumC3085y2 = EnumC3085y2.BITMAP;
                            } else if (i11 == 35) {
                                enumC3085y2 = EnumC3085y2.YUV_420_888;
                            } else if (i11 == 842094169) {
                                enumC3085y2 = EnumC3085y2.YV12;
                            } else if (i11 == 16) {
                                enumC3085y2 = EnumC3085y2.NV16;
                            } else if (i11 != 17) {
                                enumC3085y2 = EnumC3085y2.UNKNOWN_FORMAT;
                            } else {
                                enumC3085y2 = EnumC3085y2.NV21;
                            }
                            obj.red = enumC3085y2;
                            obj.purple = D2.BYTEBUFFER;
                            obj.silver = Integer.valueOf(limit & LottieConstants.IterateForever);
                            obj.white = Integer.valueOf(i5 & LottieConstants.IterateForever);
                            obj.teal = Integer.valueOf(i4 & LottieConstants.IterateForever);
                            obj.alpha = Long.valueOf(elapsedRealtime2 & Long.MAX_VALUE);
                            obj.yellow = Integer.valueOf(i10 & LottieConstants.IterateForever);
                            E2 e22 = new E2(obj);
                            h hVar = new h(12, false);
                            hVar.silver = e22;
                            ab abVar = new ab(hVar);
                            q qVar = echo.echo;
                            if (qVar.juliet()) {
                                alpha = (String) qVar.hotel();
                            } else {
                                alpha = k.charlie.alpha(echo.golf);
                            }
                            p.alpha.execute(new ao.d(echo, abVar, j22, alpha, 12, false));
                        }
                        return processBase(aVar);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                if ((b2 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b2 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public Task process(Image image, int i4, Matrix matrix) {
        x.alpha("Only YUV_420_888 is supported now", image.getFormat() == 35);
        return processBase(X8.a.charlie(image, i4, matrix));
    }
}
