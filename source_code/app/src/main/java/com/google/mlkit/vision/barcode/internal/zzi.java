package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import com.google.android.gms.common.d;
import com.google.mlkit.common.sdkinternal.e;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import s6.K7;
import s6.P7;
import s6.T7;

/* loaded from: classes2.dex */
public final class zzi extends e {
    private final i zza;

    public zzi(i iVar) {
        this.zza = iVar;
    }

    @Override // com.google.mlkit.common.sdkinternal.e
    public final Object create(Object obj) {
        P7 hotel;
        zzm zzoVar;
        BarcodeScannerOptions barcodeScannerOptions = (BarcodeScannerOptions) obj;
        Context bravo = this.zza.bravo();
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
        if (!zzo.zzd(bravo) && d.getInstance().getApkVersion(bravo) < 204500000) {
            zzoVar = new zzq(bravo, barcodeScannerOptions, hotel);
        } else {
            zzoVar = new zzo(bravo, barcodeScannerOptions, hotel);
        }
        return new zzl(this.zza, barcodeScannerOptions, zzoVar, hotel);
    }
}
