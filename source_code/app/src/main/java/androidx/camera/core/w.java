package androidx.camera.core;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class w implements ar, AutoCloseable {
    public final ar purple;
    public final Object alpha = new Object();
    public final HashSet red = new HashSet();

    public w(ar arVar) {
        this.purple = arVar;
    }

    @Override // androidx.camera.core.ar
    public int alpha() {
        return this.purple.alpha();
    }

    @Override // androidx.camera.core.ar
    public int bravo() {
        return this.purple.bravo();
    }

    public final void charlie(v vVar) {
        synchronized (this.alpha) {
            this.red.add(vVar);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.purple.close();
        synchronized (this.alpha) {
            hashSet = new HashSet(this.red);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((v) it.next()).charlie(this);
        }
    }

    @Override // androidx.camera.core.ar
    public final int getFormat() {
        return this.purple.getFormat();
    }

    @Override // androidx.camera.core.ar
    public final Image k() {
        return this.purple.k();
    }

    @Override // androidx.camera.core.ar
    public final O7.l[] lima() {
        return this.purple.lima();
    }

    @Override // androidx.camera.core.ar
    public ap red() {
        return this.purple.red();
    }
}
