package dagger.hilt.android.internal.managers;

import T1.c;
import T1.e;
import android.os.Bundle;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import dagger.hilt.android.internal.ThreadUtil;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes2.dex */
public final class SavedStateHandleHolder {
    private c extras;
    private P handle;
    private final boolean isComponentActivity;

    public SavedStateHandleHolder(c cVar) {
        boolean z2;
        if (cVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isComponentActivity = z2;
        this.extras = cVar;
    }

    public void clear() {
        this.extras = null;
    }

    public P getSavedStateHandle() {
        ThreadUtil.ensureMainThread();
        Preconditions.checkState(this.isComponentActivity, "Activity that does not extend ComponentActivity cannot use SavedStateHandle", new Object[0]);
        P p4 = this.handle;
        if (p4 != null) {
            return p4;
        }
        Preconditions.checkNotNull(this.extras, "The first access to SavedStateHandle should happen between super.onCreate() and super.onDestroy()");
        e eVar = new e(this.extras);
        eVar.alpha.put(T.charlie, Bundle.EMPTY);
        this.extras = eVar;
        P bravo = T.bravo(eVar);
        this.handle = bravo;
        this.extras = null;
        return bravo;
    }

    public boolean isInvalid() {
        if (this.handle == null && this.extras == null) {
            return true;
        }
        return false;
    }

    public void setExtras(c cVar) {
        Preconditions.checkState(this.isComponentActivity, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
        if (this.handle != null) {
            return;
        }
        this.extras = cVar;
    }
}
