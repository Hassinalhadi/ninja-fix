package bo;

import android.os.Build;
import androidx.camera.core.InterfaceC0528j;
import androidx.camera.core.O;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.lifecycle.B;
import androidx.lifecycle.aa;
import androidx.lifecycle.ab;
import androidx.lifecycle.ak;
import androidx.lifecycle.al;
import bf.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class b implements ak, InterfaceC0528j {
    public final al purple;
    public final f red;
    public final Object alpha = new Object();
    public boolean silver = false;

    public b(al alVar, f fVar) {
        this.purple = alVar;
        this.red = fVar;
        if (alVar.getLifecycle().bravo().compareTo(ab.silver) >= 0) {
            fVar.delta();
        } else {
            fVar.victor();
        }
        alVar.getLifecycle().alpha(this);
    }

    @Override // androidx.camera.core.InterfaceC0528j
    public final InterfaceC0523v alpha() {
        return this.red.f3381j;
    }

    public final void charlie(List list) {
        synchronized (this.alpha) {
            this.red.charlie(list);
        }
    }

    public final al delta() {
        al alVar;
        synchronized (this.alpha) {
            alVar = this.purple;
        }
        return alVar;
    }

    public final List echo() {
        List unmodifiableList;
        synchronized (this.alpha) {
            unmodifiableList = Collections.unmodifiableList(this.red.amber());
        }
        return unmodifiableList;
    }

    @B(aa.ON_DESTROY)
    public void onDestroy(al alVar) {
        synchronized (this.alpha) {
            f fVar = this.red;
            fVar.blue((ArrayList) fVar.amber());
        }
    }

    @B(aa.ON_PAUSE)
    public void onPause(al alVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.red.alpha.india(false);
        }
    }

    @B(aa.ON_RESUME)
    public void onResume(al alVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.red.alpha.india(true);
        }
    }

    @B(aa.ON_START)
    public void onStart(al alVar) {
        synchronized (this.alpha) {
            try {
                if (!this.silver) {
                    this.red.delta();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @B(aa.ON_STOP)
    public void onStop(al alVar) {
        synchronized (this.alpha) {
            try {
                if (!this.silver) {
                    this.red.victor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean papa(O o5) {
        boolean contains;
        synchronized (this.alpha) {
            contains = ((ArrayList) this.red.amber()).contains(o5);
        }
        return contains;
    }

    public final void quebec() {
        synchronized (this.alpha) {
            try {
                if (this.silver) {
                    return;
                }
                onStop(this.purple);
                this.silver = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void romeo() {
        synchronized (this.alpha) {
            f fVar = this.red;
            fVar.blue((ArrayList) fVar.amber());
        }
    }

    public final void sierra() {
        synchronized (this.alpha) {
            try {
                if (!this.silver) {
                    return;
                }
                boolean z2 = false;
                this.silver = false;
                if (this.purple.getLifecycle().bravo().compareTo(ab.silver) >= 0) {
                    z2 = true;
                }
                if (z2) {
                    onStart(this.purple);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
