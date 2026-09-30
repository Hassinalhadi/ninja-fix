package com.google.mlkit.vision.barcode.internal;

import B9.ab;
import V5.x;
import Y8.a;
import Y8.b;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import androidx.appcompat.widget.i1;
import androidx.recyclerview.widget.C0665j;
import ao.d;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.firebase.messaging.r;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.f;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.common.sdkinternal.p;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import s6.A5;
import s6.C2602a0;
import s6.C2611b0;
import s6.C2652f5;
import s6.C2664h;
import s6.C2697k5;
import s6.C2733o5;
import s6.EnumC2688j5;
import s6.EnumC2822y5;
import s6.EnumC2831z5;
import s6.L7;
import s6.M5;
import s6.O7;
import s6.P7;
import s6.Q7;
import s6.ac;

/* loaded from: classes2.dex */
public final class zzl extends f {
    static boolean zza = true;
    private static final b zzb = b.alpha;
    private final BarcodeScannerOptions zzc;
    private final zzm zzd;
    private final P7 zze;
    private final Q7 zzf;
    private final a zzg = new a();
    private boolean zzh;

    public zzl(i iVar, BarcodeScannerOptions barcodeScannerOptions, zzm zzmVar, P7 p72) {
        x.india(iVar, "MlKitContext can not be null");
        x.india(barcodeScannerOptions, "BarcodeScannerOptions can not be null");
        this.zzc = barcodeScannerOptions;
        this.zzd = zzmVar;
        this.zze = p72;
        this.zzf = new Q7(iVar.bravo());
    }

    private final void zzf(final EnumC2831z5 enumC2831z5, long j5, final X8.a aVar, List list) {
        int i4;
        final ac acVar = new ac();
        final ac acVar2 = new ac();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Barcode barcode = (Barcode) it.next();
                acVar.alpha(zzb.zza(barcode.getFormat()));
                acVar2.alpha(zzb.zzb(barcode.getValueType()));
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j5;
        this.zze.bravo(new O7() { // from class: com.google.mlkit.vision.barcode.internal.zzj
            @Override // s6.O7
            public final L7 zza() {
                return zzl.this.zzc(elapsedRealtime, enumC2831z5, acVar, acVar2, aVar);
            }
        }, A5.ON_DEVICE_BARCODE_DETECT);
        ab abVar = new ab(28);
        abVar.purple = enumC2831z5;
        abVar.white = Boolean.valueOf(zza);
        abVar.red = zzb.zzc(this.zzc);
        abVar.silver = acVar.charlie();
        abVar.teal = acVar2.charlie();
        p.alpha.execute(new r(this.zze, new C2602a0(abVar), elapsedRealtime, new zzk(this)));
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.zzh;
        long j6 = currentTimeMillis - elapsedRealtime;
        Q7 q72 = this.zzf;
        if (true != z2) {
            i4 = 24301;
        } else {
            i4 = 24302;
        }
        int i5 = i4;
        int i10 = enumC2831z5.alpha;
        synchronized (q72) {
            AtomicLong atomicLong = q72.bravo;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - q72.bravo.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            q72.alpha.echo(new TelemetryData(0, Arrays.asList(new MethodInvocation(i5, i10, 0, j6, currentTimeMillis, null, null, 0, -1)))).lima(new C0665j(elapsedRealtime2, 4, q72));
        }
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void load() throws MlKitException {
        this.zzh = this.zzd.zzc();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.appcompat.widget.i1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [s6.L5, java.lang.Object] */
    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void release() {
        EnumC2822y5 enumC2822y5;
        try {
            this.zzd.zzb();
            zza = true;
            ?? obj = new Object();
            if (this.zzh) {
                enumC2822y5 = EnumC2822y5.TYPE_THICK;
            } else {
                enumC2822y5 = EnumC2822y5.TYPE_THIN;
            }
            P7 p72 = this.zze;
            obj.charlie = enumC2822y5;
            ?? obj2 = new Object();
            obj2.bravo = zzb.zzc(this.zzc);
            obj.delta = new M5(obj2);
            p.alpha.execute(new d(p72, new B0.a((i1) obj, 0), A5.ON_DEVICE_BARCODE_CLOSE, p72.charlie(), 11, false));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [s6.L5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, androidx.appcompat.widget.i1] */
    public final L7 zzc(long j5, EnumC2831z5 enumC2831z5, ac acVar, ac acVar2, X8.a aVar) {
        int limit;
        EnumC2688j5 enumC2688j5;
        EnumC2822y5 enumC2822y5;
        ?? obj = new Object();
        ab abVar = new ab(29);
        abVar.purple = Long.valueOf(j5 & Long.MAX_VALUE);
        abVar.white = enumC2831z5;
        abVar.red = Boolean.valueOf(zza);
        Boolean bool = Boolean.TRUE;
        abVar.silver = bool;
        abVar.teal = bool;
        obj.alpha = new C2733o5(abVar);
        obj.bravo = zzb.zzc(this.zzc);
        obj.charlie = acVar.charlie();
        obj.delta = acVar2.charlie();
        int i4 = aVar.golf;
        zzb.getClass();
        int i5 = aVar.golf;
        if (i5 == -1) {
            Bitmap bitmap = aVar.alpha;
            x.hotel(bitmap);
            limit = bitmap.getAllocationByteCount();
        } else if (i5 != 17 && i5 != 842094169) {
            if (i5 != 35) {
                limit = 0;
            } else {
                Image.Plane[] alpha = aVar.alpha();
                x.hotel(alpha);
                limit = (alpha[0].getBuffer().limit() * 3) / 2;
            }
        } else {
            ByteBuffer byteBuffer = aVar.bravo;
            x.hotel(byteBuffer);
            limit = byteBuffer.limit();
        }
        com.google.android.material.internal.ab abVar2 = new com.google.android.material.internal.ab();
        if (i4 != -1) {
            if (i4 != 35) {
                if (i4 != 842094169) {
                    if (i4 != 16) {
                        if (i4 != 17) {
                            enumC2688j5 = EnumC2688j5.UNKNOWN_FORMAT;
                        } else {
                            enumC2688j5 = EnumC2688j5.NV21;
                        }
                    } else {
                        enumC2688j5 = EnumC2688j5.NV16;
                    }
                } else {
                    enumC2688j5 = EnumC2688j5.YV12;
                }
            } else {
                enumC2688j5 = EnumC2688j5.YUV_420_888;
            }
        } else {
            enumC2688j5 = EnumC2688j5.BITMAP;
        }
        abVar2.purple = enumC2688j5;
        abVar2.red = Integer.valueOf(Integer.MAX_VALUE & limit);
        obj.echo = new C2697k5(abVar2);
        ?? obj2 = new Object();
        if (this.zzh) {
            enumC2822y5 = EnumC2822y5.TYPE_THICK;
        } else {
            enumC2822y5 = EnumC2822y5.TYPE_THIN;
        }
        obj2.charlie = enumC2822y5;
        obj2.delta = new M5(obj);
        return new B0.a((i1) obj2, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.appcompat.widget.i1] */
    public final L7 zzd(C2602a0 c2602a0, int i4, C2652f5 c2652f5) {
        EnumC2822y5 enumC2822y5;
        ?? obj = new Object();
        if (this.zzh) {
            enumC2822y5 = EnumC2822y5.TYPE_THICK;
        } else {
            enumC2822y5 = EnumC2822y5.TYPE_THIN;
        }
        obj.charlie = enumC2822y5;
        C2664h c2664h = new C2664h();
        c2664h.charlie = Integer.valueOf(i4 & LottieConstants.IterateForever);
        c2664h.bravo = c2602a0;
        c2664h.delta = c2652f5;
        obj.foxtrot = new C2611b0(c2664h);
        return new B0.a((i1) obj, 0);
    }

    @Override // com.google.mlkit.common.sdkinternal.f
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final synchronized List run(X8.a aVar) throws MlKitException {
        zzl zzlVar;
        X8.a aVar2;
        EnumC2831z5 enumC2831z5;
        try {
            try {
                a aVar3 = this.zzg;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aVar3.alpha(aVar);
                try {
                    List zza2 = this.zzd.zza(aVar);
                    zzlVar = this;
                    aVar2 = aVar;
                    try {
                        zzlVar.zzf(EnumC2831z5.NO_ERROR, elapsedRealtime, aVar2, zza2);
                        zza = false;
                        return zza2;
                    } catch (MlKitException e) {
                        e = e;
                        MlKitException mlKitException = e;
                        if (mlKitException.getErrorCode() == 14) {
                            enumC2831z5 = EnumC2831z5.MODEL_NOT_DOWNLOADED;
                        } else {
                            enumC2831z5 = EnumC2831z5.UNKNOWN_ERROR;
                        }
                        zzlVar.zzf(enumC2831z5, elapsedRealtime, aVar2, null);
                        throw mlKitException;
                    }
                } catch (MlKitException e4) {
                    e = e4;
                    zzlVar = this;
                    aVar2 = aVar;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
