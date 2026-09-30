package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class au {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private aq.f mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public au(Object obj) {
        this.mDataLock = new Object();
        this.mObservers = new aq.f();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new aq(this);
        this.mData = obj;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (ap.b.charlie().delta()) {
        } else {
            throw new IllegalStateException(ao.ad.gray("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void alpha(at atVar) {
        if (atVar.purple) {
            if (!atVar.delta()) {
                atVar.alpha(false);
                return;
            }
            int i4 = atVar.red;
            int i5 = this.mVersion;
            if (i4 >= i5) {
                return;
            }
            atVar.red = i5;
            atVar.alpha.onChanged(this.mData);
        }
    }

    public void changeActiveCounter(int i4) {
        boolean z2;
        boolean z10;
        int i5 = this.mActiveCount;
        this.mActiveCount = i4 + i5;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i10 = this.mActiveCount;
                if (i5 != i10) {
                    if (i5 == 0 && i10 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i5 > 0 && i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z2) {
                        onActive();
                    } else if (z10) {
                        onInactive();
                    }
                    i5 = i10;
                } else {
                    this.mChangingActiveState = false;
                    return;
                }
            } catch (Throwable th) {
                this.mChangingActiveState = false;
                throw th;
            }
        }
    }

    public void dispatchingValue(at atVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (atVar != null) {
                alpha(atVar);
                atVar = null;
            } else {
                aq.f fVar = this.mObservers;
                fVar.getClass();
                aq.d dVar = new aq.d(fVar);
                fVar.red.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    alpha((at) ((Map.Entry) dVar.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public Object getValue() {
        Object obj = this.mData;
        if (obj != NOT_SET) {
            return obj;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        if (this.mActiveCount > 0) {
            return true;
        }
        return false;
    }

    public boolean hasObservers() {
        if (this.mObservers.silver > 0) {
            return true;
        }
        return false;
    }

    public boolean isInitialized() {
        if (this.mData != NOT_SET) {
            return true;
        }
        return false;
    }

    public void observe(al alVar, A a6) {
        assertMainThread("observe");
        if (alVar.getLifecycle().bravo() != ab.alpha) {
            as asVar = new as(this, alVar, a6);
            at atVar = (at) this.mObservers.bravo(a6, asVar);
            if (atVar != null && !atVar.charlie(alVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
            if (atVar != null) {
                return;
            }
            alVar.getLifecycle().alpha(asVar);
        }
    }

    public void observeForever(A a6) {
        assertMainThread("observeForever");
        at atVar = new at(this, a6);
        at atVar2 = (at) this.mObservers.bravo(a6, atVar);
        if (!(atVar2 instanceof as)) {
            if (atVar2 != null) {
                return;
            }
            atVar.alpha(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(Object obj) {
        boolean z2;
        synchronized (this.mDataLock) {
            if (this.mPendingData == NOT_SET) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.mPendingData = obj;
        }
        if (!z2) {
            return;
        }
        ap.b.charlie().echo(this.mPostValueRunnable);
    }

    public void removeObserver(A a6) {
        assertMainThread("removeObserver");
        at atVar = (at) this.mObservers.delta(a6);
        if (atVar == null) {
            return;
        }
        atVar.bravo();
        atVar.alpha(false);
    }

    public void removeObservers(al alVar) {
        assertMainThread("removeObservers");
        Iterator it = this.mObservers.iterator();
        while (true) {
            aq.b bVar = (aq.b) it;
            if (bVar.hasNext()) {
                Map.Entry entry = (Map.Entry) bVar.next();
                if (((at) entry.getValue()).charlie(alVar)) {
                    removeObserver((A) entry.getKey());
                }
            } else {
                return;
            }
        }
    }

    public void setValue(Object obj) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = obj;
        dispatchingValue(null);
    }

    public au() {
        this.mDataLock = new Object();
        this.mObservers = new aq.f();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new aq(this);
        this.mData = obj;
        this.mVersion = -1;
    }
}
