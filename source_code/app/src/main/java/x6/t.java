package x6;

import V5.x;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import h6.BinderC1814d;
import h6.InterfaceC1812b;
import h6.InterfaceC1813c;
import q6.w;

/* loaded from: classes2.dex */
public final class t implements InterfaceC1813c {
    public final SupportMapFragment alpha;
    public final y6.h bravo;

    public t(SupportMapFragment supportMapFragment, y6.h hVar) {
        this.bravo = hVar;
        x.hotel(supportMapFragment);
        this.alpha = supportMapFragment;
    }

    @Override // h6.InterfaceC1813c
    public final void alpha() {
        try {
            y6.h hVar = this.bravo;
            hVar.lavender(hVar.ivory(), 16);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void bravo() {
        try {
            y6.h hVar = this.bravo;
            hVar.lavender(hVar.ivory(), 8);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void charlie() {
        try {
            y6.h hVar = this.bravo;
            hVar.lavender(hVar.ivory(), 15);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void delta(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            y6.e.hotel(bundle2, bundle3);
            y6.h hVar = this.bravo;
            BinderC1814d binderC1814d = new BinderC1814d(activity);
            Parcel ivory = hVar.ivory();
            w.delta(ivory, binderC1814d);
            w.charlie(ivory, googleMapOptions);
            w.charlie(ivory, bundle3);
            hVar.lavender(ivory, 2);
            y6.e.hotel(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void echo() {
        try {
            y6.h hVar = this.bravo;
            hVar.lavender(hVar.ivory(), 5);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final View foxtrot(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            y6.e.hotel(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                y6.h hVar = this.bravo;
                BinderC1814d binderC1814d = new BinderC1814d(layoutInflater);
                BinderC1814d binderC1814d2 = new BinderC1814d(viewGroup);
                Parcel ivory = hVar.ivory();
                w.delta(ivory, binderC1814d);
                w.delta(ivory, binderC1814d2);
                w.charlie(ivory, bundle2);
                Parcel delta = hVar.delta(ivory, 4);
                InterfaceC1812b lime = BinderC1814d.lime(delta.readStrongBinder());
                delta.recycle();
                StrictMode.setThreadPolicy(threadPolicy);
                y6.e.hotel(bundle2, bundle);
                return (View) BinderC1814d.magenta(lime);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void golf(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            y6.e.hotel(bundle, bundle2);
            y6.h hVar = this.bravo;
            Parcel ivory = hVar.ivory();
            w.charlie(ivory, bundle2);
            Parcel delta = hVar.delta(ivory, 10);
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
        try {
            y6.h hVar = this.bravo;
            hVar.lavender(hVar.ivory(), 7);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void india(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            y6.e.hotel(bundle, bundle2);
            Bundle arguments = this.alpha.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                y6.e.india(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            y6.h hVar = this.bravo;
            Parcel ivory = hVar.ivory();
            w.charlie(ivory, bundle2);
            hVar.lavender(ivory, 3);
            y6.e.hotel(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void juliet(m mVar) {
        try {
            y6.h hVar = this.bravo;
            q qVar = new q(mVar, 1);
            Parcel ivory = hVar.ivory();
            w.delta(ivory, qVar);
            hVar.lavender(ivory, 12);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void onLowMemory() {
        try {
            y6.h hVar = this.bravo;
            hVar.lavender(hVar.ivory(), 9);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // h6.InterfaceC1813c
    public final void onPause() {
        try {
            y6.h hVar = this.bravo;
            hVar.lavender(hVar.ivory(), 6);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
