package T5;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.C0606a;
import androidx.fragment.app.L;
import androidx.fragment.app.an;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class aj implements DialogInterface.OnCancelListener {
    public final Object alpha;
    public volatile boolean purple;
    public final AtomicReference red = new AtomicReference(null);
    public final com.google.android.gms.internal.measurement.ai silver = new com.google.android.gms.internal.measurement.ai(Looper.getMainLooper(), 1);
    public final GoogleApiAvailability teal;

    public aj(h hVar, GoogleApiAvailability googleApiAvailability) {
        this.alpha = hVar;
        this.teal = googleApiAvailability;
    }

    public static h bravo(Activity activity) {
        ak akVar;
        al alVar;
        V5.x.india(activity, "Activity must not be null");
        if (activity instanceof an) {
            an anVar = (an) activity;
            WeakHashMap weakHashMap = al.purple;
            WeakReference weakReference = (WeakReference) weakHashMap.get(anVar);
            if (weakReference != null && (alVar = (al) weakReference.get()) != null) {
                return alVar;
            }
            try {
                al alVar2 = (al) anVar.getSupportFragmentManager().blue("SLifecycleFragmentImpl");
                if (alVar2 == null || alVar2.isRemoving()) {
                    alVar2 = new al();
                    L supportFragmentManager = anVar.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    C0606a c0606a = new C0606a(supportFragmentManager);
                    c0606a.delta(0, alVar2, "SLifecycleFragmentImpl", 1);
                    c0606a.juliet(true, true);
                }
                weakHashMap.put(anVar, new WeakReference(alVar2));
                return alVar2;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            }
        }
        WeakHashMap weakHashMap2 = ak.purple;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(activity);
        if (weakReference2 != null && (akVar = (ak) weakReference2.get()) != null) {
            return akVar;
        }
        try {
            ak akVar2 = (ak) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (akVar2 == null || akVar2.isRemoving()) {
                akVar2 = new ak();
                activity.getFragmentManager().beginTransaction().add(akVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap2.put(activity, new WeakReference(akVar2));
            return akVar2;
        } catch (ClassCastException e4) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, T5.h] */
    public final Activity alpha() {
        Activity bravo = this.alpha.bravo();
        V5.x.hotel(bravo);
        return bravo;
    }

    public final void charlie(Bundle bundle) {
        ah ahVar;
        if (bundle != null) {
            AtomicReference atomicReference = this.red;
            if (bundle.getBoolean("resolving_error", false)) {
                ahVar = new ah(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                ahVar = null;
            }
            atomicReference.set(ahVar);
        }
    }

    public void delta() {
    }

    public void echo() {
    }

    public void foxtrot() {
        this.purple = true;
    }

    public void golf() {
        this.purple = false;
    }

    public abstract void hotel(ConnectionResult connectionResult, int i4);

    public abstract void india();

    public final void juliet(ConnectionResult connectionResult, int i4) {
        AtomicReference atomicReference;
        ah ahVar = new ah(connectionResult, i4);
        do {
            atomicReference = this.red;
            while (!atomicReference.compareAndSet(null, ahVar)) {
                if (atomicReference.get() != null) {
                }
            }
            this.silver.post(new com.google.common.util.concurrent.d(7, this, ahVar, false));
            return;
        } while (atomicReference.get() == null);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i4;
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        AtomicReference atomicReference = this.red;
        ah ahVar = (ah) atomicReference.get();
        if (ahVar == null) {
            i4 = -1;
        } else {
            i4 = ahVar.alpha;
        }
        atomicReference.set(null);
        hotel(connectionResult, i4);
    }
}
