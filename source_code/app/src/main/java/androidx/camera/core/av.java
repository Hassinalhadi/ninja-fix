package androidx.camera.core;

import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import s6.T7;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class av implements androidx.camera.core.impl.ar, v {

    /* renamed from: a, reason: collision with root package name */
    public Executor f2939a;
    public final Object alpha;

    /* renamed from: b, reason: collision with root package name */
    public final LongSparseArray f2940b;

    /* renamed from: c, reason: collision with root package name */
    public final LongSparseArray f2941c;

    /* renamed from: d, reason: collision with root package name */
    public int f2942d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2943f;
    public final au purple;
    public int red;
    public final a4.u silver;
    public boolean teal;
    public final R3.s white;
    public androidx.camera.core.impl.aq yellow;

    public av(int i4, int i5, int i10, int i11) {
        R3.s sVar = new R3.s(ImageReader.newInstance(i4, i5, i10, i11));
        this.alpha = new Object();
        this.purple = new au(0, this);
        this.red = 0;
        this.silver = new a4.u(3, this);
        this.teal = false;
        this.f2940b = new LongSparseArray();
        this.f2941c = new LongSparseArray();
        this.f2943f = new ArrayList();
        this.white = sVar;
        this.f2942d = 0;
        this.e = new ArrayList(uniform());
    }

    @Override // androidx.camera.core.impl.ar
    public final int alpha() {
        int alpha;
        synchronized (this.alpha) {
            alpha = this.white.alpha();
        }
        return alpha;
    }

    @Override // androidx.camera.core.impl.ar
    public final int bravo() {
        int bravo;
        synchronized (this.alpha) {
            bravo = this.white.bravo();
        }
        return bravo;
    }

    @Override // androidx.camera.core.v
    public final void charlie(w wVar) {
        synchronized (this.alpha) {
            delta(wVar);
        }
    }

    @Override // androidx.camera.core.impl.ar
    public final void close() {
        synchronized (this.alpha) {
            try {
                if (this.teal) {
                    return;
                }
                Iterator it = new ArrayList(this.e).iterator();
                while (it.hasNext()) {
                    ((ar) it.next()).close();
                }
                this.e.clear();
                this.white.close();
                this.teal = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void delta(w wVar) {
        synchronized (this.alpha) {
            try {
                int indexOf = this.e.indexOf(wVar);
                if (indexOf >= 0) {
                    this.e.remove(indexOf);
                    int i4 = this.f2942d;
                    if (indexOf <= i4) {
                        this.f2942d = i4 - 1;
                    }
                }
                this.f2943f.remove(wVar);
                if (this.red > 0) {
                    hotel(this.white);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void echo(D d4) {
        androidx.camera.core.impl.aq aqVar;
        Executor executor;
        synchronized (this.alpha) {
            try {
                if (this.e.size() < uniform()) {
                    d4.charlie(this);
                    this.e.add(d4);
                    aqVar = this.yellow;
                    executor = this.f2939a;
                } else {
                    AbstractC3066u3.bravo("TAG", "Maximum image number reached.");
                    d4.close();
                    aqVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aqVar != null) {
            if (executor != null) {
                executor.execute(new A8.g(25, this, aqVar));
            } else {
                aqVar.bravo(this);
            }
        }
    }

    @Override // androidx.camera.core.impl.ar
    public final ar foxtrot() {
        synchronized (this.alpha) {
            try {
                if (this.e.isEmpty()) {
                    return null;
                }
                if (this.f2942d < this.e.size()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < this.e.size() - 1; i4++) {
                        if (!this.f2943f.contains(this.e.get(i4))) {
                            arrayList.add((ar) this.e.get(i4));
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ar) it.next()).close();
                    }
                    int size = this.e.size();
                    ArrayList arrayList2 = this.e;
                    this.f2942d = size;
                    ar arVar = (ar) arrayList2.get(size - 1);
                    this.f2943f.add(arVar);
                    return arVar;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ar
    public final int golf() {
        int golf;
        synchronized (this.alpha) {
            golf = this.white.golf();
        }
        return golf;
    }

    public final void hotel(androidx.camera.core.impl.ar arVar) {
        ar arVar2;
        synchronized (this.alpha) {
            try {
                if (this.teal) {
                    return;
                }
                int size = this.f2941c.size() + this.e.size();
                if (size >= arVar.uniform()) {
                    AbstractC3066u3.bravo("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        arVar2 = arVar.victor();
                        if (arVar2 != null) {
                            this.red--;
                            size++;
                            this.f2941c.put(arVar2.red().getTimestamp(), arVar2);
                            india();
                        }
                    } catch (IllegalStateException e) {
                        String hotel = AbstractC3066u3.hotel("MetadataImageReader");
                        if (AbstractC3066u3.foxtrot(3, hotel)) {
                            Log.d(hotel, "Failed to acquire next image.", e);
                        }
                        arVar2 = null;
                    }
                    if (arVar2 == null || this.red <= 0) {
                        break;
                    }
                } while (size < arVar.uniform());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void india() {
        synchronized (this.alpha) {
            try {
                for (int size = this.f2940b.size() - 1; size >= 0; size--) {
                    ap apVar = (ap) this.f2940b.valueAt(size);
                    long timestamp = apVar.getTimestamp();
                    ar arVar = (ar) this.f2941c.get(timestamp);
                    if (arVar != null) {
                        this.f2941c.remove(timestamp);
                        this.f2940b.removeAt(size);
                        echo(new D(arVar, null, apVar));
                    }
                }
                juliet();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void juliet() {
        synchronized (this.alpha) {
            try {
                if (this.f2941c.size() != 0 && this.f2940b.size() != 0) {
                    long keyAt = this.f2941c.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f2940b.keyAt(0);
                    T7.charlie(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f2941c.size() - 1; size >= 0; size--) {
                            if (this.f2941c.keyAt(size) < keyAt2) {
                                ((ar) this.f2941c.valueAt(size)).close();
                                this.f2941c.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f2940b.size() - 1; size2 >= 0; size2--) {
                            if (this.f2940b.keyAt(size2) < keyAt) {
                                this.f2940b.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.impl.ar
    public final void lima() {
        synchronized (this.alpha) {
            this.white.lima();
            this.yellow = null;
            this.f2939a = null;
            this.red = 0;
        }
    }

    @Override // androidx.camera.core.impl.ar
    public final Surface romeo() {
        Surface romeo;
        synchronized (this.alpha) {
            romeo = this.white.romeo();
        }
        return romeo;
    }

    @Override // androidx.camera.core.impl.ar
    public final int uniform() {
        int uniform;
        synchronized (this.alpha) {
            uniform = this.white.uniform();
        }
        return uniform;
    }

    @Override // androidx.camera.core.impl.ar
    public final ar victor() {
        synchronized (this.alpha) {
            try {
                if (this.e.isEmpty()) {
                    return null;
                }
                if (this.f2942d < this.e.size()) {
                    ArrayList arrayList = this.e;
                    int i4 = this.f2942d;
                    this.f2942d = i4 + 1;
                    ar arVar = (ar) arrayList.get(i4);
                    this.f2943f.add(arVar);
                    return arVar;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.ar
    public final void yankee(androidx.camera.core.impl.aq aqVar, Executor executor) {
        synchronized (this.alpha) {
            aqVar.getClass();
            this.yellow = aqVar;
            executor.getClass();
            this.f2939a = executor;
            this.white.yankee(this.silver, executor);
        }
    }
}
