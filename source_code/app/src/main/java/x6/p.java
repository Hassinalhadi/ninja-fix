package x6;

import android.os.Parcel;
import com.google.maps.android.collections.MarkerManager;
import h6.BinderC1814d;
import m6.AbstractBinderC2100a;
import q6.AbstractBinderC2412b;
import q6.InterfaceC2413c;
import q6.w;

/* loaded from: classes2.dex */
public final class p extends AbstractBinderC2100a {
    public final /* synthetic */ int hotel;
    public final /* synthetic */ MarkerManager india;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(MarkerManager markerManager, int i4) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 4);
        this.hotel = i4;
        switch (i4) {
            case 1:
                this.india = markerManager;
                super("com.google.android.gms.maps.internal.IOnMarkerDragListener", 4);
                return;
            case 2:
                this.india = markerManager;
                super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener", 4);
                return;
            case 3:
                this.india = markerManager;
                super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener", 4);
                return;
            case 4:
                this.india = markerManager;
                super("com.google.android.gms.maps.internal.IInfoWindowAdapter", 4);
                return;
            default:
                this.india = markerManager;
                return;
        }
    }

    @Override // m6.AbstractBinderC2100a
    public final boolean jade(int i4, Parcel parcel, Parcel parcel2) {
        switch (this.hotel) {
            case 0:
                if (i4 == 1) {
                    InterfaceC2413c lime = AbstractBinderC2412b.lime(parcel.readStrongBinder());
                    w.bravo(parcel);
                    boolean onMarkerClick = this.india.onMarkerClick(new z6.f(lime));
                    parcel2.writeNoException();
                    parcel2.writeInt(onMarkerClick ? 1 : 0);
                    return true;
                }
                return false;
            case 1:
                MarkerManager markerManager = this.india;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            return false;
                        }
                        InterfaceC2413c lime2 = AbstractBinderC2412b.lime(parcel.readStrongBinder());
                        w.bravo(parcel);
                        markerManager.onMarkerDragEnd(new z6.f(lime2));
                    } else {
                        InterfaceC2413c lime3 = AbstractBinderC2412b.lime(parcel.readStrongBinder());
                        w.bravo(parcel);
                        markerManager.onMarkerDrag(new z6.f(lime3));
                    }
                } else {
                    InterfaceC2413c lime4 = AbstractBinderC2412b.lime(parcel.readStrongBinder());
                    w.bravo(parcel);
                    markerManager.onMarkerDragStart(new z6.f(lime4));
                }
                parcel2.writeNoException();
                return true;
            case 2:
                if (i4 == 1) {
                    InterfaceC2413c lime5 = AbstractBinderC2412b.lime(parcel.readStrongBinder());
                    w.bravo(parcel);
                    this.india.onInfoWindowClick(new z6.f(lime5));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i4 == 1) {
                    InterfaceC2413c lime6 = AbstractBinderC2412b.lime(parcel.readStrongBinder());
                    w.bravo(parcel);
                    this.india.onInfoWindowLongClick(new z6.f(lime6));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                MarkerManager markerManager2 = this.india;
                if (i4 != 1) {
                    if (i4 != 2) {
                        return false;
                    }
                    InterfaceC2413c lime7 = AbstractBinderC2412b.lime(parcel.readStrongBinder());
                    w.bravo(parcel);
                    BinderC1814d binderC1814d = new BinderC1814d(markerManager2.getInfoContents(new z6.f(lime7)));
                    parcel2.writeNoException();
                    w.delta(parcel2, binderC1814d);
                    return true;
                }
                InterfaceC2413c lime8 = AbstractBinderC2412b.lime(parcel.readStrongBinder());
                w.bravo(parcel);
                BinderC1814d binderC1814d2 = new BinderC1814d(markerManager2.getInfoWindow(new z6.f(lime8)));
                parcel2.writeNoException();
                w.delta(parcel2, binderC1814d2);
                return true;
        }
    }
}
