package z6;

import V5.x;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import h6.InterfaceC1812b;
import q6.C2411a;
import q6.InterfaceC2413c;
import q6.w;

/* loaded from: classes2.dex */
public class f {
    public final InterfaceC2413c alpha;

    public f(InterfaceC2413c interfaceC2413c) {
        x.hotel(interfaceC2413c);
        this.alpha = interfaceC2413c;
    }

    public final String alpha() {
        try {
            C2411a c2411a = (C2411a) this.alpha;
            Parcel delta = c2411a.delta(c2411a.ivory(), 2);
            String readString = delta.readString();
            delta.recycle();
            return readString;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final LatLng bravo() {
        try {
            C2411a c2411a = (C2411a) this.alpha;
            Parcel delta = c2411a.delta(c2411a.ivory(), 4);
            LatLng latLng = (LatLng) w.alpha(delta, LatLng.CREATOR);
            delta.recycle();
            return latLng;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final String charlie() {
        try {
            C2411a c2411a = (C2411a) this.alpha;
            Parcel delta = c2411a.delta(c2411a.ivory(), 8);
            String readString = delta.readString();
            delta.recycle();
            return readString;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final String delta() {
        try {
            C2411a c2411a = (C2411a) this.alpha;
            Parcel delta = c2411a.delta(c2411a.ivory(), 6);
            String readString = delta.readString();
            delta.recycle();
            return readString;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean echo() {
        boolean z2;
        try {
            C2411a c2411a = (C2411a) this.alpha;
            Parcel delta = c2411a.delta(c2411a.ivory(), 13);
            int i4 = w.alpha;
            if (delta.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            delta.recycle();
            return z2;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        boolean z2 = false;
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            InterfaceC2413c interfaceC2413c = this.alpha;
            InterfaceC2413c interfaceC2413c2 = ((f) obj).alpha;
            C2411a c2411a = (C2411a) interfaceC2413c;
            Parcel ivory = c2411a.ivory();
            w.delta(ivory, interfaceC2413c2);
            Parcel delta = c2411a.delta(ivory, 16);
            if (delta.readInt() != 0) {
                z2 = true;
            }
            delta.recycle();
            return z2;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void foxtrot(b bVar) {
        InterfaceC2413c interfaceC2413c = this.alpha;
        try {
            if (bVar == null) {
                C2411a c2411a = (C2411a) interfaceC2413c;
                Parcel ivory = c2411a.ivory();
                w.delta(ivory, null);
                c2411a.lavender(ivory, 18);
                return;
            }
            InterfaceC1812b interfaceC1812b = bVar.alpha;
            C2411a c2411a2 = (C2411a) interfaceC2413c;
            Parcel ivory2 = c2411a2.ivory();
            w.delta(ivory2, interfaceC1812b);
            c2411a2.lavender(ivory2, 18);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void golf(LatLng latLng) {
        if (latLng != null) {
            try {
                C2411a c2411a = (C2411a) this.alpha;
                Parcel ivory = c2411a.ivory();
                w.charlie(ivory, latLng);
                c2411a.lavender(ivory, 3);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public final int hashCode() {
        try {
            C2411a c2411a = (C2411a) this.alpha;
            Parcel delta = c2411a.delta(c2411a.ivory(), 17);
            int readInt = delta.readInt();
            delta.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void hotel(String str) {
        try {
            C2411a c2411a = (C2411a) this.alpha;
            Parcel ivory = c2411a.ivory();
            ivory.writeString(str);
            c2411a.lavender(ivory, 7);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void india(String str) {
        try {
            C2411a c2411a = (C2411a) this.alpha;
            Parcel ivory = c2411a.ivory();
            ivory.writeString(str);
            c2411a.lavender(ivory, 5);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void juliet(boolean z2) {
        try {
            C2411a c2411a = (C2411a) this.alpha;
            Parcel ivory = c2411a.ivory();
            int i4 = w.alpha;
            ivory.writeInt(z2 ? 1 : 0);
            c2411a.lavender(ivory, 14);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void kilo(float f5) {
        try {
            C2411a c2411a = (C2411a) this.alpha;
            Parcel ivory = c2411a.ivory();
            ivory.writeFloat(f5);
            c2411a.lavender(ivory, 27);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void lima() {
        try {
            C2411a c2411a = (C2411a) this.alpha;
            c2411a.lavender(c2411a.ivory(), 11);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
