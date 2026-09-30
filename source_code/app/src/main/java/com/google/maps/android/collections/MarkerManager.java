package com.google.maps.android.collections;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;
import q6.C2411a;
import q6.w;
import x6.InterfaceC3296a;
import x6.InterfaceC3300e;
import x6.InterfaceC3301f;
import x6.InterfaceC3302g;
import x6.InterfaceC3303h;
import x6.k;
import x6.p;
import y6.g;
import z6.f;

/* loaded from: classes2.dex */
public class MarkerManager extends MapObjectManager<f, Collection> implements InterfaceC3300e, InterfaceC3302g, InterfaceC3303h, InterfaceC3296a, InterfaceC3301f {
    public MarkerManager(k kVar) {
        super(kVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.maps.android.collections.MapObjectManager$Collection, com.google.maps.android.collections.MarkerManager$Collection] */
    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // x6.InterfaceC3296a
    public View getInfoContents(f fVar) {
        Collection collection = (Collection) this.mAllObjects.get(fVar);
        if (collection != null && collection.mInfoWindowAdapter != null) {
            return collection.mInfoWindowAdapter.getInfoContents(fVar);
        }
        return null;
    }

    @Override // x6.InterfaceC3296a
    public View getInfoWindow(f fVar) {
        Collection collection = (Collection) this.mAllObjects.get(fVar);
        if (collection != null && collection.mInfoWindowAdapter != null) {
            return collection.mInfoWindowAdapter.getInfoWindow(fVar);
        }
        return null;
    }

    @Override // x6.InterfaceC3300e
    public void onInfoWindowClick(f fVar) {
        Collection collection = (Collection) this.mAllObjects.get(fVar);
        if (collection != null && collection.mInfoWindowClickListener != null) {
            collection.mInfoWindowClickListener.onInfoWindowClick(fVar);
        }
    }

    @Override // x6.InterfaceC3301f
    public void onInfoWindowLongClick(f fVar) {
        Collection collection = (Collection) this.mAllObjects.get(fVar);
        if (collection != null && collection.mInfoWindowLongClickListener != null) {
            collection.mInfoWindowLongClickListener.onInfoWindowLongClick(fVar);
        }
    }

    @Override // x6.InterfaceC3302g
    public boolean onMarkerClick(f fVar) {
        Collection collection = (Collection) this.mAllObjects.get(fVar);
        if (collection != null && collection.mMarkerClickListener != null) {
            return collection.mMarkerClickListener.onMarkerClick(fVar);
        }
        return false;
    }

    @Override // x6.InterfaceC3303h
    public void onMarkerDrag(f fVar) {
        Collection collection = (Collection) this.mAllObjects.get(fVar);
        if (collection != null && collection.mMarkerDragListener != null) {
            collection.mMarkerDragListener.onMarkerDrag(fVar);
        }
    }

    @Override // x6.InterfaceC3303h
    public void onMarkerDragEnd(f fVar) {
        Collection collection = (Collection) this.mAllObjects.get(fVar);
        if (collection != null && collection.mMarkerDragListener != null) {
            collection.mMarkerDragListener.onMarkerDragEnd(fVar);
        }
    }

    @Override // x6.InterfaceC3303h
    public void onMarkerDragStart(f fVar) {
        Collection collection = (Collection) this.mAllObjects.get(fVar);
        if (collection != null && collection.mMarkerDragListener != null) {
            collection.mMarkerDragListener.onMarkerDragStart(fVar);
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(f fVar) {
        return super.remove(fVar);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public void setListenersOnUiThread() {
        k kVar = this.mMap;
        if (kVar != null) {
            g gVar = kVar.alpha;
            try {
                p pVar = new p(this, 2);
                Parcel ivory = gVar.ivory();
                w.delta(ivory, pVar);
                gVar.lavender(ivory, 32);
                g gVar2 = this.mMap.alpha;
                try {
                    p pVar2 = new p(this, 3);
                    Parcel ivory2 = gVar2.ivory();
                    w.delta(ivory2, pVar2);
                    gVar2.lavender(ivory2, 84);
                    g gVar3 = this.mMap.alpha;
                    try {
                        p pVar3 = new p(this, 0);
                        Parcel ivory3 = gVar3.ivory();
                        w.delta(ivory3, pVar3);
                        gVar3.lavender(ivory3, 30);
                        g gVar4 = this.mMap.alpha;
                        try {
                            p pVar4 = new p(this, 1);
                            Parcel ivory4 = gVar4.ivory();
                            w.delta(ivory4, pVar4);
                            gVar4.lavender(ivory4, 31);
                            g gVar5 = this.mMap.alpha;
                            try {
                                p pVar5 = new p(this, 4);
                                Parcel ivory5 = gVar5.ivory();
                                w.delta(ivory5, pVar5);
                                gVar5.lavender(ivory5, 33);
                            } catch (RemoteException e) {
                                throw new RuntimeRemoteException(e);
                            }
                        } catch (RemoteException e4) {
                            throw new RuntimeRemoteException(e4);
                        }
                    } catch (RemoteException e5) {
                        throw new RuntimeRemoteException(e5);
                    }
                } catch (RemoteException e10) {
                    throw new RuntimeRemoteException(e10);
                }
            } catch (RemoteException e11) {
                throw new RuntimeRemoteException(e11);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class Collection extends MapObjectManager.Collection {
        private InterfaceC3296a mInfoWindowAdapter;
        private InterfaceC3300e mInfoWindowClickListener;
        private InterfaceC3301f mInfoWindowLongClickListener;
        private InterfaceC3302g mMarkerClickListener;
        private InterfaceC3303h mMarkerDragListener;

        public Collection() {
            super();
        }

        public void addAll(java.util.Collection<MarkerOptions> collection) {
            Iterator<MarkerOptions> it = collection.iterator();
            while (it.hasNext()) {
                addMarker(it.next());
            }
        }

        public f addMarker(MarkerOptions markerOptions) {
            f alpha = MarkerManager.this.mMap.alpha(markerOptions);
            super.add(alpha);
            return alpha;
        }

        public java.util.Collection<f> getMarkers() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<f> it = getMarkers().iterator();
            while (it.hasNext()) {
                it.next().juliet(false);
            }
        }

        public boolean remove(f fVar) {
            return super.remove((Collection) fVar);
        }

        public void setInfoWindowAdapter(InterfaceC3296a interfaceC3296a) {
            this.mInfoWindowAdapter = interfaceC3296a;
        }

        public void setOnInfoWindowClickListener(InterfaceC3300e interfaceC3300e) {
            this.mInfoWindowClickListener = interfaceC3300e;
        }

        public void setOnInfoWindowLongClickListener(InterfaceC3301f interfaceC3301f) {
            this.mInfoWindowLongClickListener = interfaceC3301f;
        }

        public void setOnMarkerClickListener(InterfaceC3302g interfaceC3302g) {
            this.mMarkerClickListener = interfaceC3302g;
        }

        public void setOnMarkerDragListener(InterfaceC3303h interfaceC3303h) {
            this.mMarkerDragListener = interfaceC3303h;
        }

        public void showAll() {
            Iterator<f> it = getMarkers().iterator();
            while (it.hasNext()) {
                it.next().juliet(true);
            }
        }

        public void addAll(java.util.Collection<MarkerOptions> collection, boolean z2) {
            Iterator<MarkerOptions> it = collection.iterator();
            while (it.hasNext()) {
                addMarker(it.next()).juliet(z2);
            }
        }

        public f addMarker(AdvancedMarkerOptions advancedMarkerOptions) {
            f alpha = MarkerManager.this.mMap.alpha(advancedMarkerOptions);
            super.add(alpha);
            return alpha;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.maps.android.collections.MapObjectManager$Collection, com.google.maps.android.collections.MarkerManager$Collection] */
    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(f fVar) {
        fVar.getClass();
        try {
            C2411a c2411a = (C2411a) fVar.alpha;
            c2411a.lavender(c2411a.ivory(), 1);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public Collection newCollection() {
        return new Collection();
    }
}
