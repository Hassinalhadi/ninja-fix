package com.google.mlkit.vision.barcode;

import V5.x;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class BarcodeScannerOptions {
    private final int zza;
    private final boolean zzb;
    private final Executor zzc;
    private final ZoomSuggestionOptions zzd;

    /* loaded from: classes2.dex */
    public static class Builder {
        private int zza = 0;
        private boolean zzb;
        private Executor zzc;
        private ZoomSuggestionOptions zzd;

        public BarcodeScannerOptions build() {
            return new BarcodeScannerOptions(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        public Builder enableAllPotentialBarcodes() {
            this.zzb = true;
            return this;
        }

        public Builder setBarcodeFormats(@Barcode.BarcodeFormat int i4, @Barcode.BarcodeFormat int... iArr) {
            this.zza = i4;
            if (iArr != null) {
                for (int i5 : iArr) {
                    this.zza = i5 | this.zza;
                }
            }
            return this;
        }

        public Builder setExecutor(Executor executor) {
            this.zzc = executor;
            return this;
        }

        public Builder setZoomSuggestionOptions(ZoomSuggestionOptions zoomSuggestionOptions) {
            this.zzd = zoomSuggestionOptions;
            return this;
        }
    }

    public /* synthetic */ BarcodeScannerOptions(int i4, boolean z2, Executor executor, ZoomSuggestionOptions zoomSuggestionOptions, zza zzaVar) {
        this.zza = i4;
        this.zzb = z2;
        this.zzc = executor;
        this.zzd = zoomSuggestionOptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BarcodeScannerOptions)) {
            return false;
        }
        BarcodeScannerOptions barcodeScannerOptions = (BarcodeScannerOptions) obj;
        if (this.zza == barcodeScannerOptions.zza && this.zzb == barcodeScannerOptions.zzb && x.lima(this.zzc, barcodeScannerOptions.zzc) && x.lima(this.zzd, barcodeScannerOptions.zzd)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Boolean.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final int zza() {
        return this.zza;
    }

    public final ZoomSuggestionOptions zzb() {
        return this.zzd;
    }

    public final Executor zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzb;
    }
}
