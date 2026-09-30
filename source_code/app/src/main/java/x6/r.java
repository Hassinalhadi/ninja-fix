package x6;

import V5.x;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import h6.BinderC1814d;
import h6.InterfaceC1812b;
import h6.InterfaceC1813c;
import q6.w;

/* loaded from: classes2.dex */
public final class r implements InterfaceC1813c {
    public final MapView alpha;
    public final y6.i bravo;
    public View charlie;

    public r(MapView mapView, y6.i iVar) {
        this.bravo = iVar;
        x.hotel(mapView);
        this.alpha = mapView;
    }

    @Override // h6.InterfaceC1813c
    public final void alpha() {
        try {
            y6.i iVar = this.bravo;
            iVar.lavender(iVar.ivory(), 13);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void bravo() {
        try {
            y6.i iVar = this.bravo;
            iVar.lavender(iVar.ivory(), 5);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void charlie() {
        try {
            y6.i iVar = this.bravo;
            iVar.lavender(iVar.ivory(), 12);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void delta(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    @Override // h6.InterfaceC1813c
    public final void echo() {
        try {
            y6.i iVar = this.bravo;
            iVar.lavender(iVar.ivory(), 3);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final View foxtrot(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    @Override // h6.InterfaceC1813c
    public final void golf(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            y6.e.hotel(bundle, bundle2);
            y6.i iVar = this.bravo;
            Parcel ivory = iVar.ivory();
            w.charlie(ivory, bundle2);
            Parcel delta = iVar.delta(ivory, 7);
            if (delta.readInt() != 0) {
                bundle2.readFromParcel(delta);
            }
            delta.recycle();
            y6.e.hotel(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void hotel() {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    @Override // h6.InterfaceC1813c
    public final void india(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            y6.e.hotel(bundle, bundle2);
            y6.i iVar = this.bravo;
            Parcel ivory = iVar.ivory();
            w.charlie(ivory, bundle2);
            iVar.lavender(ivory, 2);
            y6.e.hotel(bundle2, bundle);
            Parcel delta = iVar.delta(iVar.ivory(), 8);
            InterfaceC1812b lime = BinderC1814d.lime(delta.readStrongBinder());
            delta.recycle();
            this.charlie = (View) BinderC1814d.magenta(lime);
            MapView mapView = this.alpha;
            mapView.removeAllViews();
            mapView.addView(this.charlie);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void juliet(m mVar) {
        try {
            y6.i iVar = this.bravo;
            q qVar = new q(mVar, 0);
            Parcel ivory = iVar.ivory();
            w.delta(ivory, qVar);
            iVar.lavender(ivory, 9);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void onLowMemory() {
        try {
            y6.i iVar = this.bravo;
            iVar.lavender(iVar.ivory(), 6);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void onPause() {
        try {
            y6.i iVar = this.bravo;
            iVar.lavender(iVar.ivory(), 4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
