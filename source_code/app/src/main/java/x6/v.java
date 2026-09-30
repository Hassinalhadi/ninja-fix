package x6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.collections.CircleManager;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import kotlin.jvm.internal.Intrinsics;
import m6.AbstractBinderC2100a;
import q6.ac;
import q6.af;
import q6.w;

/* loaded from: classes2.dex */
public final class v extends AbstractBinderC2100a {
    public final /* synthetic */ int hotel = 4;
    public final /* synthetic */ Object india;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Ub.c cVar) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener", 4);
        this.india = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13, types: [q6.ac] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21, types: [q6.f] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v29, types: [q6.i] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v5, types: [q6.af] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // m6.AbstractBinderC2100a
    public final boolean jade(int i4, Parcel parcel, Parcel parcel2) {
        ?? abstractC1394y;
        ?? abstractC1394y2;
        ?? abstractC1394y3;
        ?? abstractC1394y4;
        switch (this.hotel) {
            case 0:
                if (i4 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        abstractC1394y = 0;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                        if (queryLocalInterface instanceof af) {
                            abstractC1394y = (af) queryLocalInterface;
                        } else {
                            abstractC1394y = new AbstractC1394y(readStrongBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate", 4);
                        }
                    }
                    w.bravo(parcel);
                    ((GroundOverlayManager) this.india).onGroundOverlayClick(new z6.d(abstractC1394y));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 1:
                if (i4 == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        abstractC1394y2 = 0;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                        if (queryLocalInterface2 instanceof ac) {
                            abstractC1394y2 = (ac) queryLocalInterface2;
                        } else {
                            abstractC1394y2 = new AbstractC1394y(readStrongBinder2, "com.google.android.gms.maps.model.internal.ICircleDelegate", 4);
                        }
                    }
                    w.bravo(parcel);
                    ((CircleManager) this.india).onCircleClick(new z6.c(abstractC1394y2));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 2:
                if (i4 == 1) {
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 == null) {
                        abstractC1394y3 = 0;
                    } else {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                        if (queryLocalInterface3 instanceof q6.f) {
                            abstractC1394y3 = (q6.f) queryLocalInterface3;
                        } else {
                            abstractC1394y3 = new AbstractC1394y(readStrongBinder3, "com.google.android.gms.maps.model.internal.IPolygonDelegate", 4);
                        }
                    }
                    w.bravo(parcel);
                    ((PolygonManager) this.india).onPolygonClick(new z6.g(abstractC1394y3));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i4 == 1) {
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 == null) {
                        abstractC1394y4 = 0;
                    } else {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                        if (queryLocalInterface4 instanceof q6.i) {
                            abstractC1394y4 = (q6.i) queryLocalInterface4;
                        } else {
                            abstractC1394y4 = new AbstractC1394y(readStrongBinder4, "com.google.android.gms.maps.model.internal.IPolylineDelegate", 4);
                        }
                    }
                    w.bravo(parcel);
                    ((PolylineManager) this.india).onPolylineClick(new z6.h(abstractC1394y4));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                if (i4 == 1) {
                    LatLng it = (LatLng) w.alpha(parcel, LatLng.CREATOR);
                    w.bravo(parcel);
                    Ub.c cVar = (Ub.c) this.india;
                    cVar.getClass();
                    Intrinsics.echo(it, "it");
                    Ac.k kVar = (Ac.k) cVar.alpha.echo;
                    if (kVar != null) {
                        kVar.invoke(Double.valueOf(cVar.bravo), Double.valueOf(cVar.charlie));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(CircleManager circleManager) {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener", 4);
        this.india = circleManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(GroundOverlayManager groundOverlayManager) {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener", 4);
        this.india = groundOverlayManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(PolygonManager polygonManager) {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener", 4);
        this.india = polygonManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(PolylineManager polylineManager) {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener", 4);
        this.india = polylineManager;
    }
}
