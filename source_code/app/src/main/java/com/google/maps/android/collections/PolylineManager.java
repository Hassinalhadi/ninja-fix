package com.google.maps.android.collections;

import V5.x;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;
import q6.i;
import q6.w;
import x6.j;
import x6.k;
import x6.v;
import y6.g;
import z6.h;

/* loaded from: classes2.dex */
public class PolylineManager extends MapObjectManager<h, Collection> implements j {
    public PolylineManager(k kVar) {
        super(kVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.maps.android.collections.PolylineManager$Collection, com.google.maps.android.collections.MapObjectManager$Collection] */
    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // x6.j
    public void onPolylineClick(h hVar) {
        Collection collection = (Collection) this.mAllObjects.get(hVar);
        if (collection != null && collection.mPolylineClickListener != null) {
            collection.mPolylineClickListener.onPolylineClick(hVar);
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(h hVar) {
        return super.remove(hVar);
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
                gVar.lavender(ivory, 87);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class Collection extends MapObjectManager.Collection {
        private j mPolylineClickListener;

        public Collection() {
            super();
        }

        public void addAll(java.util.Collection<PolylineOptions> collection) {
            Iterator<PolylineOptions> it = collection.iterator();
            while (it.hasNext()) {
                addPolyline(it.next());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v8, types: [q6.i] */
        /* JADX WARN: Type inference failed for: r0v9 */
        public h addPolyline(PolylineOptions polylineOptions) {
            ?? abstractC1394y;
            k kVar = PolylineManager.this.mMap;
            kVar.getClass();
            try {
                x.india(polylineOptions, "PolylineOptions must not be null");
                g gVar = kVar.alpha;
                Parcel ivory = gVar.ivory();
                w.charlie(ivory, polylineOptions);
                Parcel delta = gVar.delta(ivory, 9);
                IBinder readStrongBinder = delta.readStrongBinder();
                int i4 = q6.h.hotel;
                if (readStrongBinder == null) {
                    abstractC1394y = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                    if (queryLocalInterface instanceof i) {
                        abstractC1394y = (i) queryLocalInterface;
                    } else {
                        abstractC1394y = new AbstractC1394y(readStrongBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate", 4);
                    }
                }
                delta.recycle();
                h hVar = new h(abstractC1394y);
                super.add(hVar);
                return hVar;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public java.util.Collection<h> getPolylines() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<h> it = getPolylines().iterator();
            while (it.hasNext()) {
                it.next().alpha(false);
            }
        }

        public boolean remove(h hVar) {
            return super.remove((Collection) hVar);
        }

        public void setOnPolylineClickListener(j jVar) {
            this.mPolylineClickListener = jVar;
        }

        public void showAll() {
            Iterator<h> it = getPolylines().iterator();
            while (it.hasNext()) {
                it.next().alpha(true);
            }
        }

        public void addAll(java.util.Collection<PolylineOptions> collection, boolean z2) {
            Iterator<PolylineOptions> it = collection.iterator();
            while (it.hasNext()) {
                addPolyline(it.next()).alpha(z2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.maps.android.collections.PolylineManager$Collection, com.google.maps.android.collections.MapObjectManager$Collection] */
    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(h hVar) {
        hVar.getClass();
        try {
            q6.g gVar = (q6.g) hVar.alpha;
            gVar.lavender(gVar.ivory(), 1);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public Collection newCollection() {
        return new Collection();
    }
}
