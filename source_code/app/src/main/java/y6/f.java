package y6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.maps.GoogleMapOptions;
import h6.BinderC1814d;
import q6.w;
import q6.y;
import q6.z;

/* loaded from: classes2.dex */
public final class f extends AbstractC1394y {
    /* JADX WARN: Multi-variable type inference failed */
    public final b magenta() {
        b abstractC1394y;
        Parcel delta = delta(ivory(), 4);
        IBinder readStrongBinder = delta.readStrongBinder();
        if (readStrongBinder == null) {
            abstractC1394y = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof b) {
                abstractC1394y = (b) queryLocalInterface;
            } else {
                abstractC1394y = new AbstractC1394y(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 4);
            }
        }
        delta.recycle();
        return abstractC1394y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h maroon(BinderC1814d binderC1814d) {
        h abstractC1394y;
        Parcel ivory = ivory();
        w.delta(ivory, binderC1814d);
        Parcel delta = delta(ivory, 2);
        IBinder readStrongBinder = delta.readStrongBinder();
        if (readStrongBinder == null) {
            abstractC1394y = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (queryLocalInterface instanceof h) {
                abstractC1394y = (h) queryLocalInterface;
            } else {
                abstractC1394y = new AbstractC1394y(readStrongBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate", 4);
            }
        }
        delta.recycle();
        return abstractC1394y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i navy(BinderC1814d binderC1814d, GoogleMapOptions googleMapOptions) {
        i abstractC1394y;
        Parcel ivory = ivory();
        w.delta(ivory, binderC1814d);
        w.charlie(ivory, googleMapOptions);
        Parcel delta = delta(ivory, 3);
        IBinder readStrongBinder = delta.readStrongBinder();
        if (readStrongBinder == null) {
            abstractC1394y = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof i) {
                abstractC1394y = (i) queryLocalInterface;
            } else {
                abstractC1394y = new AbstractC1394y(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 4);
            }
        }
        delta.recycle();
        return abstractC1394y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [q6.z] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final z ochre() {
        ?? abstractC1394y;
        Parcel delta = delta(ivory(), 5);
        IBinder readStrongBinder = delta.readStrongBinder();
        int i4 = y.hotel;
        if (readStrongBinder == null) {
            abstractC1394y = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof z) {
                abstractC1394y = (z) queryLocalInterface;
            } else {
                abstractC1394y = new AbstractC1394y(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 4);
            }
        }
        delta.recycle();
        return abstractC1394y;
    }
}
