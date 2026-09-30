package com.google.maps.android.collections;

import V5.x;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;
import q6.aa;
import q6.ab;
import q6.ac;
import q6.w;
import x6.InterfaceC3298c;
import x6.k;
import x6.v;
import y6.g;
import z6.c;

/* loaded from: classes2.dex */
public class CircleManager extends MapObjectManager<c, Collection> implements InterfaceC3298c {
    public CircleManager(k kVar) {
        super(kVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.maps.android.collections.CircleManager$Collection, com.google.maps.android.collections.MapObjectManager$Collection] */
    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // x6.InterfaceC3298c
    public void onCircleClick(c cVar) {
        Collection collection = (Collection) this.mAllObjects.get(cVar);
        if (collection != null && collection.mCircleClickListener != null) {
            collection.mCircleClickListener.onCircleClick(cVar);
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(c cVar) {
        return super.remove(cVar);
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
                gVar.lavender(ivory, 89);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class Collection extends MapObjectManager.Collection {
        private InterfaceC3298c mCircleClickListener;

        public Collection() {
            super();
        }

        public void addAll(java.util.Collection<CircleOptions> collection) {
            Iterator<CircleOptions> it = collection.iterator();
            while (it.hasNext()) {
                addCircle(it.next());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v8, types: [q6.ac] */
        /* JADX WARN: Type inference failed for: r0v9 */
        public c addCircle(CircleOptions circleOptions) {
            ?? abstractC1394y;
            k kVar = CircleManager.this.mMap;
            kVar.getClass();
            try {
                x.india(circleOptions, "CircleOptions must not be null.");
                g gVar = kVar.alpha;
                Parcel ivory = gVar.ivory();
                w.charlie(ivory, circleOptions);
                Parcel delta = gVar.delta(ivory, 35);
                IBinder readStrongBinder = delta.readStrongBinder();
                int i4 = ab.hotel;
                if (readStrongBinder == null) {
                    abstractC1394y = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    if (queryLocalInterface instanceof ac) {
                        abstractC1394y = (ac) queryLocalInterface;
                    } else {
                        abstractC1394y = new AbstractC1394y(readStrongBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate", 4);
                    }
                }
                delta.recycle();
                c cVar = new c(abstractC1394y);
                super.add(cVar);
                return cVar;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public java.util.Collection<c> getCircles() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<c> it = getCircles().iterator();
            while (it.hasNext()) {
                it.next().alpha(false);
            }
        }

        public boolean remove(c cVar) {
            return super.remove((Collection) cVar);
        }

        public void setOnCircleClickListener(InterfaceC3298c interfaceC3298c) {
            this.mCircleClickListener = interfaceC3298c;
        }

        public void showAll() {
            Iterator<c> it = getCircles().iterator();
            while (it.hasNext()) {
                it.next().alpha(true);
            }
        }

        public void addAll(java.util.Collection<CircleOptions> collection, boolean z2) {
            Iterator<CircleOptions> it = collection.iterator();
            while (it.hasNext()) {
                addCircle(it.next()).alpha(z2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.maps.android.collections.CircleManager$Collection, com.google.maps.android.collections.MapObjectManager$Collection] */
    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(c cVar) {
        cVar.getClass();
        try {
            aa aaVar = (aa) cVar.alpha;
            aaVar.lavender(aaVar.ivory(), 1);
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
