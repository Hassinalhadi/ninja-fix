package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractBinderC1417k;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1415i;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import h6.BinderC1814d;
import h6.InterfaceC1812b;

@DynamiteApi
/* loaded from: classes2.dex */
public class ThickBarcodeScannerCreator extends AbstractBinderC1417k {
    public ThickBarcodeScannerCreator() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1418l
    public InterfaceC1415i newBarcodeScanner(InterfaceC1812b interfaceC1812b, zzba zzbaVar) {
        return new zza((Context) BinderC1814d.magenta(interfaceC1812b), zzbaVar);
    }
}
