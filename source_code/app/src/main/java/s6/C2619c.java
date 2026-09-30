package s6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import h6.BinderC1814d;

/* renamed from: s6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2619c extends AbstractC1394y implements InterfaceC2637e {
    /* JADX WARN: Multi-variable type inference failed */
    public final C2610b magenta(BinderC1814d binderC1814d, zzah zzahVar) {
        C2610b abstractC1394y;
        Parcel ivory = ivory();
        AbstractC2798w.alpha(ivory, binderC1814d);
        ivory.writeInt(1);
        zzahVar.writeToParcel(ivory, 0);
        Parcel jade = jade(ivory, 1);
        IBinder readStrongBinder = jade.readStrongBinder();
        if (readStrongBinder == null) {
            abstractC1394y = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (queryLocalInterface instanceof C2610b) {
                abstractC1394y = (C2610b) queryLocalInterface;
            } else {
                abstractC1394y = new AbstractC1394y(readStrongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 5);
            }
        }
        jade.recycle();
        return abstractC1394y;
    }
}
