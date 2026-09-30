package com.google.mlkit.vision.barcode.internal;

import G6.i;
import G6.q;
import V5.x;
import X8.a;
import Z5.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.d;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import com.google.android.gms.measurement.internal.C1473v;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.l;
import com.google.mlkit.common.sdkinternal.s;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import h6.BinderC1814d;
import i6.C1894c;
import i6.InterfaceC1893b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import s6.AbstractC2798w;
import s6.EnumC2831z5;
import s6.P7;
import s6.V4;
import s6.ad;
import s6.af;
import s6.aj;
import s6.b8;
import s6.c8;
import s6.d8;
import s6.e8;
import t6.AbstractC3006i2;
import t6.ai;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzo implements zzm {
    private static final af zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private final Context zze;
    private final BarcodeScannerOptions zzf;
    private final P7 zzg;
    private b8 zzh;

    static {
        ad adVar = af.purple;
        Object[] objArr = {"com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite"};
        ai.alpha(2, objArr);
        zza = new aj(2, objArr);
    }

    public zzo(Context context, BarcodeScannerOptions barcodeScannerOptions, P7 p72) {
        this.zze = context;
        this.zzf = barcodeScannerOptions;
        this.zzg = p72;
    }

    public static boolean zzd(Context context) {
        if (C1894c.alpha(context, ModuleDescriptor.MODULE_ID) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final List zza(a aVar) throws MlKitException {
        BinderC1814d binderC1814d;
        Image image;
        if (this.zzh == null) {
            zzc();
        }
        b8 b8Var = this.zzh;
        x.hotel(b8Var);
        if (!this.zzb) {
            try {
                b8Var.lavender(b8Var.ivory(), 1);
                this.zzb = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e);
            }
        }
        int i4 = aVar.delta;
        if (aVar.golf == 35) {
            Image.Plane[] alpha = aVar.alpha();
            x.hotel(alpha);
            i4 = alpha[0].getRowStride();
        }
        zzyu zzyuVar = new zzyu(aVar.golf, i4, aVar.echo, AbstractC3006i2.charlie(aVar.foxtrot), SystemClock.elapsedRealtime());
        int i5 = aVar.golf;
        if (i5 != -1) {
            if (i5 != 17) {
                if (i5 != 35) {
                    if (i5 != 842094169) {
                        throw new MlKitException(ao.ad.zulu(aVar.golf, "Unsupported image format: "), 3);
                    }
                } else {
                    if (aVar.charlie == null) {
                        image = null;
                    } else {
                        image = (Image) aVar.charlie.purple;
                    }
                    binderC1814d = new BinderC1814d(image);
                }
            }
            ByteBuffer byteBuffer = aVar.bravo;
            x.hotel(byteBuffer);
            binderC1814d = new BinderC1814d(byteBuffer);
        } else {
            Bitmap bitmap = aVar.alpha;
            x.hotel(bitmap);
            binderC1814d = new BinderC1814d(bitmap);
        }
        try {
            Parcel ivory = b8Var.ivory();
            AbstractC2798w.alpha(ivory, binderC1814d);
            ivory.writeInt(1);
            zzyuVar.writeToParcel(ivory, 0);
            Parcel jade = b8Var.jade(ivory, 3);
            ArrayList createTypedArrayList = jade.createTypedArrayList(zzyb.CREATOR);
            jade.recycle();
            ArrayList arrayList = new ArrayList();
            Iterator it = createTypedArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(new Barcode(new zzn((zzyb) it.next()), aVar.hotel));
            }
            return arrayList;
        } catch (RemoteException e4) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e4);
        }
    }

    @Override // com.google.mlkit.vision.barcode.internal.zzm
    public final void zzb() {
        b8 b8Var = this.zzh;
        if (b8Var != null) {
            try {
                b8Var.lavender(b8Var.ivory(), 2);
            } catch (RemoteException e) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.zzh = null;
            this.zzb = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.google.android.gms.common.api.g, Z5.f] */
    @Override // com.google.mlkit.vision.barcode.internal.zzm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc() throws MlKitException {
        boolean z2;
        if (this.zzh != null) {
            return this.zzc;
        }
        if (zzd(this.zze)) {
            this.zzc = true;
            try {
                this.zzh = zze(C1894c.charlie, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e);
            } catch (DynamiteModule$LoadingException e4) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e4);
            }
        } else {
            this.zzc = false;
            Context context = this.zze;
            af afVar = zza;
            Feature[] featureArr = l.alpha;
            if (d.getInstance().getApkVersion(context) >= 221500000) {
                try {
                    q echo = new g(context, null, f.india, b.fuchsia, com.google.android.gms.common.api.f.bravo).echo(new s(l.bravo(l.delta, afVar), 1));
                    C1473v c1473v = new C1473v(8);
                    echo.getClass();
                    echo.delta(i.alpha, c1473v);
                    z2 = ((ModuleAvailabilityResponse) V4.bravo(echo)).alpha;
                } catch (InterruptedException | ExecutionException e5) {
                    Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e5);
                    z2 = false;
                    if (!z2) {
                    }
                }
            } else {
                try {
                    ad listIterator = afVar.listIterator(0);
                    while (listIterator.hasNext()) {
                        C1894c.charlie(context, C1894c.bravo, (String) listIterator.next());
                    }
                    z2 = true;
                } catch (DynamiteModule$LoadingException unused) {
                    z2 = false;
                    if (!z2) {
                    }
                }
            }
            if (!z2) {
                if (!this.zzd) {
                    Context context2 = this.zze;
                    Object[] objArr = {"barcode", "tflite_dynamite"};
                    ai.alpha(2, objArr);
                    l.alpha(context2, new aj(2, objArr));
                    this.zzd = true;
                }
                zzb.zze(this.zzg, EnumC2831z5.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.zzh = zze(C1894c.bravo, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule$LoadingException e10) {
                zzb.zze(this.zzg, EnumC2831z5.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e10);
            }
        }
        zzb.zze(this.zzg, EnumC2831z5.NO_ERROR);
        return this.zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.measurement.y] */
    public final b8 zze(InterfaceC1893b interfaceC1893b, String str, String str2) throws DynamiteModule$LoadingException, RemoteException {
        IInterface abstractC1394y;
        boolean z2;
        IBinder bravo = C1894c.charlie(this.zze, interfaceC1893b, str).bravo(str2);
        int i4 = d8.hotel;
        b8 b8Var = null;
        if (bravo == null) {
            abstractC1394y = null;
        } else {
            IInterface queryLocalInterface = bravo.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
            if (queryLocalInterface instanceof e8) {
                abstractC1394y = (e8) queryLocalInterface;
            } else {
                abstractC1394y = new AbstractC1394y(bravo, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator", 5);
            }
        }
        BarcodeScannerOptions barcodeScannerOptions = this.zzf;
        BinderC1814d binderC1814d = new BinderC1814d(this.zze);
        int zza2 = barcodeScannerOptions.zza();
        if (barcodeScannerOptions.zzd() || this.zzf.zzb() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzyd zzydVar = new zzyd(zza2, z2);
        c8 c8Var = (c8) abstractC1394y;
        Parcel ivory = c8Var.ivory();
        AbstractC2798w.alpha(ivory, binderC1814d);
        ivory.writeInt(1);
        zzydVar.writeToParcel(ivory, 0);
        Parcel jade = c8Var.jade(ivory, 1);
        IBinder readStrongBinder = jade.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            if (queryLocalInterface2 instanceof b8) {
                b8Var = (b8) queryLocalInterface2;
            } else {
                b8Var = new AbstractC1394y(readStrongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner", 5);
            }
        }
        jade.recycle();
        return b8Var;
    }
}
