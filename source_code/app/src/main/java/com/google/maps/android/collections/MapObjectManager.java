package com.google.maps.android.collections;

import android.os.Handler;
import android.os.Looper;
import av.q;
import com.google.maps.android.collections.MapObjectManager.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import x6.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class MapObjectManager<O, C extends Collection> {
    protected final k mMap;
    private final Map<String, C> mNamedCollections = new HashMap();
    protected final Map<O, C> mAllObjects = new HashMap();

    /* loaded from: classes2.dex */
    public class Collection {
        private final Set<O> mObjects = new LinkedHashSet();

        public Collection() {
        }

        public void add(O o5) {
            this.mObjects.add(o5);
            MapObjectManager.this.mAllObjects.put(o5, this);
        }

        public void clear() {
            for (O o5 : this.mObjects) {
                MapObjectManager.this.removeObjectFromMap(o5);
                MapObjectManager.this.mAllObjects.remove(o5);
            }
            this.mObjects.clear();
        }

        public java.util.Collection<O> getObjects() {
            return Collections.unmodifiableCollection(this.mObjects);
        }

        public boolean remove(O o5) {
            if (this.mObjects.remove(o5)) {
                MapObjectManager.this.mAllObjects.remove(o5);
                MapObjectManager.this.removeObjectFromMap(o5);
                return true;
            }
            return false;
        }
    }

    public MapObjectManager(k kVar) {
        this.mMap = kVar;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.maps.android.collections.MapObjectManager.1
            @Override // java.lang.Runnable
            public void run() {
                MapObjectManager.this.setListenersOnUiThread();
            }
        });
    }

    public C getCollection(String str) {
        return this.mNamedCollections.get(str);
    }

    public abstract C newCollection();

    public C newCollection(String str) {
        if (this.mNamedCollections.get(str) == null) {
            C newCollection = newCollection();
            this.mNamedCollections.put(str, newCollection);
            return newCollection;
        }
        throw new IllegalArgumentException(q.echo("collection id is not unique: ", str));
    }

    public boolean remove(O o5) {
        C c3 = this.mAllObjects.get(o5);
        if (c3 != null && c3.remove(o5)) {
            return true;
        }
        return false;
    }

    public abstract void removeObjectFromMap(O o5);

    public abstract void setListenersOnUiThread();
}
