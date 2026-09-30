package com.google.mlkit.vision.barcode.internal;

import com.google.mlkit.common.sdkinternal.d;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import java.util.concurrent.Executor;
import s6.K7;
import s6.P7;
import s6.T7;

/* loaded from: classes2.dex */
public final class zzg {
    private final zzi zza;
    private final d zzb;
    private final i zzc;

    public zzg(zzi zziVar, d dVar, i iVar) {
        this.zza = zziVar;
        this.zzb = dVar;
        this.zzc = iVar;
    }

    public final zzh zza() {
        BarcodeScannerOptions barcodeScannerOptions;
        barcodeScannerOptions = zzh.zzd;
        return zzb(barcodeScannerOptions);
    }

    public final zzh zzb(BarcodeScannerOptions barcodeScannerOptions) {
        P7 hotel;
        zzl zzlVar = (zzl) this.zza.get(barcodeScannerOptions);
        d dVar = this.zzb;
        Executor zzc = barcodeScannerOptions.zzc();
        if (zzc != null) {
            dVar.getClass();
        } else {
            zzc = (Executor) dVar.alpha.get();
        }
        Executor executor = zzc;
        String zzd = zzb.zzd();
        synchronized (T7.class) {
            byte b2 = (byte) (((byte) 1) | 2);
            if (b2 == 3 && zzd != null) {
                hotel = T7.hotel(new K7(zzd, 1));
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (zzd == null) {
                    sb2.append(" libraryName");
                }
                if ((b2 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b2 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        return new zzh(barcodeScannerOptions, zzlVar, executor, hotel, this.zzc);
    }
}
