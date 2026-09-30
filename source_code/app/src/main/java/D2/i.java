package D2;

import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import be.k;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import s6.T7;

/* loaded from: classes3.dex */
public final class i implements Runnable {
    public final /* synthetic */ int alpha;
    public final int purple;
    public final Object red;
    public final Object silver;

    public /* synthetic */ i(int i4, int i5, Object obj, Object obj2) {
        this.alpha = i5;
        this.red = obj;
        this.silver = obj2;
        this.purple = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V0.h hVar;
        ArrayList arrayList;
        int decrementAndGet;
        switch (this.alpha) {
            case 0:
                ((j) this.red).alpha((Intent) this.silver, this.purple);
                return;
            case 1:
                ((TextView) this.red).setTypeface((Typeface) this.silver, this.purple);
                return;
            case 2:
                int i4 = this.purple;
                com.google.common.util.concurrent.e eVar = (com.google.common.util.concurrent.e) this.red;
                k kVar = (k) this.silver;
                AtomicInteger atomicInteger = kVar.silver;
                ArrayList arrayList2 = kVar.purple;
                boolean isDone = kVar.isDone();
                boolean z2 = kVar.red;
                if (!isDone && arrayList2 != null) {
                    boolean z10 = true;
                    try {
                        try {
                            try {
                                try {
                                    T7.golf("Tried to set value from future which is not done", eVar.isDone());
                                    arrayList2.set(i4, be.h.bravo(eVar));
                                    decrementAndGet = atomicInteger.decrementAndGet();
                                    if (decrementAndGet < 0) {
                                        z10 = false;
                                    }
                                    T7.golf("Less than 0 remaining futures", z10);
                                } catch (CancellationException unused) {
                                    if (z2) {
                                        kVar.cancel(false);
                                    }
                                    int decrementAndGet2 = atomicInteger.decrementAndGet();
                                    if (decrementAndGet2 < 0) {
                                        z10 = false;
                                    }
                                    T7.golf("Less than 0 remaining futures", z10);
                                    if (decrementAndGet2 == 0) {
                                        ArrayList arrayList3 = kVar.purple;
                                        if (arrayList3 != null) {
                                            hVar = kVar.white;
                                            arrayList = new ArrayList(arrayList3);
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            } catch (ExecutionException e) {
                                if (z2) {
                                    kVar.white.delta(e.getCause());
                                }
                                int decrementAndGet3 = atomicInteger.decrementAndGet();
                                if (decrementAndGet3 < 0) {
                                    z10 = false;
                                }
                                T7.golf("Less than 0 remaining futures", z10);
                                if (decrementAndGet3 == 0) {
                                    ArrayList arrayList4 = kVar.purple;
                                    if (arrayList4 != null) {
                                        hVar = kVar.white;
                                        arrayList = new ArrayList(arrayList4);
                                    }
                                } else {
                                    return;
                                }
                            }
                        } catch (Error e4) {
                            kVar.white.delta(e4);
                            int decrementAndGet4 = atomicInteger.decrementAndGet();
                            if (decrementAndGet4 < 0) {
                                z10 = false;
                            }
                            T7.golf("Less than 0 remaining futures", z10);
                            if (decrementAndGet4 == 0) {
                                ArrayList arrayList5 = kVar.purple;
                                if (arrayList5 != null) {
                                    hVar = kVar.white;
                                    arrayList = new ArrayList(arrayList5);
                                }
                            } else {
                                return;
                            }
                        } catch (RuntimeException e5) {
                            if (z2) {
                                kVar.white.delta(e5);
                            }
                            int decrementAndGet5 = atomicInteger.decrementAndGet();
                            if (decrementAndGet5 < 0) {
                                z10 = false;
                            }
                            T7.golf("Less than 0 remaining futures", z10);
                            if (decrementAndGet5 == 0) {
                                ArrayList arrayList6 = kVar.purple;
                                if (arrayList6 != null) {
                                    hVar = kVar.white;
                                    arrayList = new ArrayList(arrayList6);
                                }
                            } else {
                                return;
                            }
                        }
                        if (decrementAndGet == 0) {
                            ArrayList arrayList7 = kVar.purple;
                            if (arrayList7 != null) {
                                hVar = kVar.white;
                                arrayList = new ArrayList(arrayList7);
                                hVar.bravo(arrayList);
                                return;
                            }
                            T7.golf(null, kVar.isDone());
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        int decrementAndGet6 = atomicInteger.decrementAndGet();
                        if (decrementAndGet6 < 0) {
                            z10 = false;
                        }
                        T7.golf("Less than 0 remaining futures", z10);
                        if (decrementAndGet6 == 0) {
                            ArrayList arrayList8 = kVar.purple;
                            if (arrayList8 != null) {
                                kVar.white.bravo(new ArrayList(arrayList8));
                            } else {
                                T7.golf(null, kVar.isDone());
                            }
                        }
                        throw th;
                    }
                }
                T7.golf("Future was done before all dependencies completed", z2);
                return;
            default:
                ((BottomSheetBehavior) this.silver).victor((View) this.red, this.purple, false);
                return;
        }
    }

    public i(k kVar, int i4, com.google.common.util.concurrent.e eVar) {
        this.alpha = 2;
        this.silver = kVar;
        this.purple = i4;
        this.red = eVar;
    }

    public i(BottomSheetBehavior bottomSheetBehavior, View view, int i4) {
        this.alpha = 3;
        this.silver = bottomSheetBehavior;
        this.red = view;
        this.purple = i4;
    }
}
