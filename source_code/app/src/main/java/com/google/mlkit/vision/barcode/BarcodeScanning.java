package com.google.mlkit.vision.barcode;

import V5.x;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.vision.barcode.internal.zzg;

/* loaded from: classes2.dex */
public class BarcodeScanning {
    private BarcodeScanning() {
    }

    public static BarcodeScanner getClient() {
        return ((zzg) i.charlie().alpha(zzg.class)).zza();
    }

    public static BarcodeScanner getClient(BarcodeScannerOptions barcodeScannerOptions) {
        x.india(barcodeScannerOptions, "You must provide a valid BarcodeScannerOptions.");
        return ((zzg) i.charlie().alpha(zzg.class)).zzb(barcodeScannerOptions);
    }
}
