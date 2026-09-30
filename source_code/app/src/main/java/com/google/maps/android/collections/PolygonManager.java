package com.google.maps.android.collections;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;
import q6.C2414d;
import q6.w;
import x6.InterfaceC3304i;
import x6.k;
import x6.v;
import z6.g;

/* loaded from: classes2.dex */
public class PolygonManager extends MapObjectManager<g, Collection> implements InterfaceC3304i {
    public PolygonManager(k kVar) {
        super(kVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.maps.android.collections.MapObjectManager$Collection, com.google.maps.android.collections.PolygonManager$Collection] */
    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // x6.InterfaceC3304i
    public void onPolygonClick(g gVar) {
        Collection collection = (Collection) this.mAllObjects.get(gVar);
        if (collection != null && collection.mPolygonClickListener != null) {
            collection.mPolygonClickListener.onPolygonClick(gVar);
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(g gVar) {
        return super.remove(gVar);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public void setListenersOnUiThread() {
        k kVar = this.mMap;
        if (kVar != null) {
            y6.g gVar = kVar.alpha;
            try {
                v vVar = new v(this);
                Parcel ivory = gVar.ivory();
                w.delta(ivory, vVar);
                gVar.lavender(ivory, 85);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class Collection extends MapObjectManager.Collection {
        private InterfaceC3304i mPolygonClickListener;

        public Collection() {
            super();
        }

        public void addAll(java.util.Collection<PolygonOptions> collection) {
            Iterator<PolygonOptions> it = collection.iterator();
            while (it.hasNext()) {
                addPolygon(it.next());
            }
        }

        public g addPolygon(PolygonOptions polygonOptions) {
            g bravo = PolygonManager.this.mMap.bravo(polygonOptions);
            super.add(bravo);
            return bravo;
        }

        public java.util.Collection<g> getPolygons() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<g> it = getPolygons().iterator();
            while (it.hasNext()) {
                it.next().alpha(false);
            }
        }

        public boolean remove(g gVar) {
            return super.remove((Collection) gVar);
        }

        public void setOnPolygonClickListener(InterfaceC3304i interfaceC3304i) {
            this.mPolygonClickListener = interfaceC3304i;
        }

        public void showAll() {
            Iterator<g> it = getPolygons().iterator();
            while (it.hasNext()) {
                it.next().alpha(true);
            }
        }

        public void addAll(java.util.Collection<PolygonOptions> collection, boolean z2) {
            Iterator<PolygonOptions> it = collection.iterator();
            while (it.hasNext()) {
                addPolygon(it.next()).alpha(z2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.maps.android.collections.MapObjectManager$Collection, com.google.maps.android.collections.PolygonManager$Collection] */
    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(g gVar) {
        gVar.getClass();
        try {
            C2414d c2414d = (C2414d) gVar.alpha;
            c2414d.lavender(c2414d.ivory(), 1);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public Collection newCollection() {
        return new Collection();
    }
}
