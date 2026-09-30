package com.google.mlkit.vision.barcode.internal;

import V5.x;
import X8.a;
import android.content.Context;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.l;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import h6.BinderC1814d;
import i6.C1894c;
import java.util.ArrayList;
import java.util.List;
import r6.AbstractC2496d;
import r6.C2494b;
import r6.g;
import s6.AbstractBinderC2628d;
import s6.AbstractC2798w;
import s6.C2610b;
import s6.C2619c;
import s6.EnumC2831z5;
import s6.InterfaceC2637e;
import s6.P7;
import t6.AbstractC2993g;
import t6.AbstractC3006i2;
import t6.AbstractC3011j2;

/* loaded from: classes2.dex */
final class zzq implements zzm {
    private boolean zza;
    private final Context zzb;
    private final zzah zzc;
    private final P7 zzd;
    private C2610b zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode.zzah] */
    public zzq(Context context, BarcodeScannerOptions barcodeScannerOptions, P7 p72) {
        ?? obj = new Object();
        this.zzc = obj;
        this.zzb = context;
        obj.alpha = barcodeScannerOptions.zza();
        this.zzd = p72;
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final List zza(a aVar) throws MlKitException {
        zzu[] zzuVarArr;
        if (this.zze == null) {
            zzc();
        }
        C2610b c2610b = this.zze;
        if (c2610b != null) {
            zzan zzanVar = new zzan(aVar.delta, aVar.echo, 0, AbstractC3006i2.charlie(aVar.foxtrot), 0L);
            try {
                int i4 = aVar.golf;
                if (i4 != -1) {
                    if (i4 != 17) {
                        if (i4 != 35) {
                            if (i4 == 842094169) {
                                zzuVarArr = c2610b.magenta(new BinderC1814d(AbstractC3011j2.alpha(aVar)), zzanVar);
                            } else {
                                throw new MlKitException("Unsupported image format: " + aVar.golf, 3);
                            }
                        } else {
                            Image.Plane[] alpha = aVar.alpha();
                            x.hotel(alpha);
                            zzanVar.alpha = alpha[0].getRowStride();
                            zzuVarArr = c2610b.magenta(new BinderC1814d(alpha[0].getBuffer()), zzanVar);
                        }
                    } else {
                        zzuVarArr = c2610b.magenta(new BinderC1814d(aVar.bravo), zzanVar);
                    }
                } else {
                    BinderC1814d binderC1814d = new BinderC1814d(aVar.alpha);
                    Parcel ivory = c2610b.ivory();
                    AbstractC2798w.alpha(ivory, binderC1814d);
                    ivory.writeInt(1);
                    zzanVar.writeToParcel(ivory, 0);
                    Parcel jade = c2610b.jade(ivory, 2);
                    zzu[] zzuVarArr2 = (zzu[]) jade.createTypedArray(zzu.CREATOR);
                    jade.recycle();
                    zzuVarArr = zzuVarArr2;
                }
                ArrayList arrayList = new ArrayList();
                for (zzu zzuVar : zzuVarArr) {
                    arrayList.add(new Barcode(new zzp(zzuVar), aVar.hotel));
                }
                return arrayList;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to detect with legacy barcode detector", 13, e);
            }
        }
        throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final void zzb() {
        C2610b c2610b = this.zze;
        if (c2610b != null) {
            try {
                c2610b.lavender(c2610b.ivory(), 3);
            } catch (RemoteException e) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.zze = null;
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final boolean zzc() throws MlKitException {
        IInterface abstractC1394y;
        if (this.zze == null) {
            try {
                IBinder bravo = C1894c.charlie(this.zzb, C1894c.bravo, "com.google.android.gms.vision.dynamite").bravo("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                int i4 = AbstractBinderC2628d.hotel;
                if (bravo == null) {
                    abstractC1394y = null;
                } else {
                    IInterface queryLocalInterface = bravo.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    if (queryLocalInterface instanceof InterfaceC2637e) {
                        abstractC1394y = (InterfaceC2637e) queryLocalInterface;
                    } else {
                        abstractC1394y = new AbstractC1394y(bravo, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 5);
                    }
                }
                C2610b magenta = ((C2619c) abstractC1394y).magenta(new BinderC1814d(this.zzb), this.zzc);
                this.zze = magenta;
                if (magenta == null && !this.zza) {
                    Log.d("LegacyBarcodeScanner", "Request optional module download.");
                    Context context = this.zzb;
                    Feature[] featureArr = l.alpha;
                    C2494b c2494b = AbstractC2496d.purple;
                    Object[] objArr = {"barcode"};
                    AbstractC2993g.bravo(1, objArr);
                    l.alpha(context, new g(1, objArr));
                    this.zza = true;
                    zzb.zze(this.zzd, EnumC2831z5.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
                }
                zzb.zze(this.zzd, EnumC2831z5.NO_ERROR);
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create legacy barcode detector.", 13, e);
            } catch (DynamiteModule$LoadingException e4) {
                throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e4);
            }
        }
        return false;
    }
}
