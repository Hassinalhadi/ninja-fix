package x6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import m6.AbstractBinderC2100a;
import q6.w;
import y6.InterfaceC3400a;

/* loaded from: classes2.dex */
public final class q extends AbstractBinderC2100a implements InterfaceC3400a {
    public final /* synthetic */ int hotel;
    public final /* synthetic */ m india;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, int i4) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 4);
        this.hotel = i4;
        this.india = mVar;
    }

    @Override // y6.InterfaceC3400a
    public final void emerald(y6.g gVar) {
        switch (this.hotel) {
            case 0:
                this.india.charlie(new k(gVar));
                return;
            default:
                this.india.charlie(new k(gVar));
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.measurement.y] */
    @Override // m6.AbstractBinderC2100a
    public final boolean jade(int i4, Parcel parcel, Parcel parcel2) {
        y6.g abstractC1394y;
        if (i4 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                abstractC1394y = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (queryLocalInterface instanceof y6.g) {
                    abstractC1394y = (y6.g) queryLocalInterface;
                } else {
                    abstractC1394y = new AbstractC1394y(readStrongBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 4);
                }
            }
            w.bravo(parcel);
            emerald(abstractC1394y);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
