package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import d6.C1590a;

/* loaded from: classes2.dex */
public final class G0 implements ServiceConnection, V5.b, V5.c {
    public volatile boolean alpha;
    public volatile an bravo;
    public final /* synthetic */ H0 charlie;

    public G0(H0 h02) {
        this.charlie = h02;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [V5.e, com.google.android.gms.measurement.internal.an] */
    public final void alpha() {
        H0 h02 = this.charlie;
        h02.W();
        Context context = ((G) h02.alpha).alpha;
        synchronized (this) {
            try {
                try {
                    if (this.alpha) {
                        ar arVar = ((G) this.charlie.alpha).f7507b;
                        G.foxtrot(arVar);
                        arVar.f7636g.alpha("Connection attempt already in progress");
                    } else {
                        if (this.bravo != null && (this.bravo.charlie() || this.bravo.golf())) {
                            ar arVar2 = ((G) this.charlie.alpha).f7507b;
                            G.foxtrot(arVar2);
                            arVar2.f7636g.alpha("Already awaiting connection attempt");
                            return;
                        }
                        this.bravo = new V5.e(context, Looper.getMainLooper(), V5.ag.alpha(context), com.google.android.gms.common.d.getInstance(), 93, this, this, null);
                        ar arVar3 = ((G) this.charlie.alpha).f7507b;
                        G.foxtrot(arVar3);
                        arVar3.f7636g.alpha("Connecting to remote service");
                        this.alpha = true;
                        V5.x.hotel(this.bravo);
                        this.bravo.november();
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // V5.b
    public final void bravo(int i4) {
        G g2 = (G) this.charlie.alpha;
        E e = g2.f7508c;
        G.foxtrot(e);
        e.e0();
        ar arVar = g2.f7507b;
        G.foxtrot(arVar);
        arVar.f7635f.alpha("Service connection suspended");
        E e4 = g2.f7508c;
        G.foxtrot(e4);
        e4.g0(new F6.b(20, this));
    }

    @Override // V5.b
    public final void charlie() {
        E e = ((G) this.charlie.alpha).f7508c;
        G.foxtrot(e);
        e.e0();
        synchronized (this) {
            try {
                V5.x.hotel(this.bravo);
                ae aeVar = (ae) this.bravo.tango();
                E e4 = ((G) this.charlie.alpha).f7508c;
                G.foxtrot(e4);
                e4.g0(new com.google.common.util.concurrent.d(11, this, aeVar, false));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.bravo = null;
                this.alpha = false;
            }
        }
    }

    @Override // V5.c
    public final void delta(ConnectionResult connectionResult) {
        H0 h02 = this.charlie;
        E e = ((G) h02.alpha).f7508c;
        G.foxtrot(e);
        e.e0();
        ar arVar = ((G) h02.alpha).f7507b;
        if (arVar == null || !arVar.purple) {
            arVar = null;
        }
        if (arVar != null) {
            arVar.f7632b.bravo(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.alpha = false;
            this.bravo = null;
        }
        E e4 = ((G) this.charlie.alpha).f7508c;
        G.foxtrot(e4);
        e4.g0(new s6.E(15, this, connectionResult, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object adVar;
        E e = ((G) this.charlie.alpha).f7508c;
        G.foxtrot(e);
        e.e0();
        synchronized (this) {
            if (iBinder == null) {
                this.alpha = false;
                ar arVar = ((G) this.charlie.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.white.alpha("Service connected with null binder");
                return;
            }
            Object obj = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof ae) {
                        adVar = (ae) queryLocalInterface;
                    } else {
                        adVar = new ad(iBinder);
                    }
                    obj = adVar;
                    ar arVar2 = ((G) this.charlie.alpha).f7507b;
                    G.foxtrot(arVar2);
                    arVar2.f7636g.alpha("Bound to IMeasurementService interface");
                } else {
                    ar arVar3 = ((G) this.charlie.alpha).f7507b;
                    G.foxtrot(arVar3);
                    arVar3.white.bravo(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                ar arVar4 = ((G) this.charlie.alpha).f7507b;
                G.foxtrot(arVar4);
                arVar4.white.alpha("Service connect failed to get IMeasurementService");
            }
            if (obj == null) {
                this.alpha = false;
                try {
                    C1590a bravo = C1590a.bravo();
                    H0 h02 = this.charlie;
                    bravo.charlie(((G) h02.alpha).alpha, h02.red);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                E e4 = ((G) this.charlie.alpha).f7508c;
                G.foxtrot(e4);
                e4.g0(new s6.E(14, this, obj, false));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        G g2 = (G) this.charlie.alpha;
        E e = g2.f7508c;
        G.foxtrot(e);
        e.e0();
        ar arVar = g2.f7507b;
        G.foxtrot(arVar);
        arVar.f7635f.alpha("Service disconnected");
        E e4 = g2.f7508c;
        G.foxtrot(e4);
        e4.g0(new be.g(14, this, componentName, false));
    }
}
