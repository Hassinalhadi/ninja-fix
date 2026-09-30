package com.google.maps.android.collections;

import V5.x;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;
import q6.ad;
import q6.ae;
import q6.af;
import q6.w;
import x6.InterfaceC3299d;
import x6.k;
import x6.v;
import y6.g;
import z6.d;

/* loaded from: classes2.dex */
public class GroundOverlayManager extends MapObjectManager<d, Collection> implements InterfaceC3299d {
    public GroundOverlayManager(k kVar) {
        super(kVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.maps.android.collections.GroundOverlayManager$Collection, com.google.maps.android.collections.MapObjectManager$Collection] */
    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // x6.InterfaceC3299d
    public void onGroundOverlayClick(d dVar) {
        Collection collection = (Collection) this.mAllObjects.get(dVar);
        if (collection != null && collection.mGroundOverlayClickListener != null) {
            collection.mGroundOverlayClickListener.onGroundOverlayClick(dVar);
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(d dVar) {
        return super.remove(dVar);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public void setListenersOnUiThread() {
        k kVar = this.mMap;
        if (kVar != null) {
            g gVar = kVar.alpha;
            try {
                v vVar = new v(this);
                Parcel ivory = gVar.ivory();
                w.delta(ivory, vVar);
                gVar.lavender(ivory, 83);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class Collection extends MapObjectManager.Collection {
        private InterfaceC3299d mGroundOverlayClickListener;

        public Collection() {
            super();
        }

        public void addAll(java.util.Collection<GroundOverlayOptions> collection) {
            Iterator<GroundOverlayOptions> it = collection.iterator();
            while (it.hasNext()) {
                addGroundOverlay(it.next());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v3, types: [q6.af] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        public d addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
            ?? r32;
            k kVar = GroundOverlayManager.this.mMap;
            kVar.getClass();
            try {
                x.india(groundOverlayOptions, "GroundOverlayOptions must not be null.");
                g gVar = kVar.alpha;
                Parcel ivory = gVar.ivory();
                w.charlie(ivory, groundOverlayOptions);
                Parcel delta = gVar.delta(ivory, 12);
                IBinder readStrongBinder = delta.readStrongBinder();
                int i4 = ae.hotel;
                d dVar = null;
                if (readStrongBinder == null) {
                    r32 = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    if (queryLocalInterface instanceof af) {
                        r32 = (af) queryLocalInterface;
                    } else {
                        r32 = new AbstractC1394y(readStrongBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate", 4);
                    }
                }
                delta.recycle();
                if (r32 != 0) {
                    dVar = new d(r32);
                }
                super.add(dVar);
                return dVar;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public java.util.Collection<d> getGroundOverlays() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<d> it = getGroundOverlays().iterator();
            while (it.hasNext()) {
                it.next().alpha(false);
            }
        }

        public boolean remove(d dVar) {
            return super.remove((Collection) dVar);
        }

        public void setOnGroundOverlayClickListener(InterfaceC3299d interfaceC3299d) {
            this.mGroundOverlayClickListener = interfaceC3299d;
        }

        public void showAll() {
            Iterator<d> it = getGroundOverlays().iterator();
            while (it.hasNext()) {
                it.next().alpha(true);
            }
        }

        public void addAll(java.util.Collection<GroundOverlayOptions> collection, boolean z2) {
            Iterator<GroundOverlayOptions> it = collection.iterator();
            while (it.hasNext()) {
                addGroundOverlay(it.next()).alpha(z2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.maps.android.collections.GroundOverlayManager$Collection, com.google.maps.android.collections.MapObjectManager$Collection] */
    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(d dVar) {
        dVar.getClass();
        try {
            ad adVar = (ad) dVar.alpha;
            adVar.lavender(adVar.ivory(), 1);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.maps.android.collections.MapObjectManager
    public Collection newCollection() {
        return new Collection();
    }
}
