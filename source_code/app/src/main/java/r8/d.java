package r8;

import C8.i;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class d implements InterfaceC2507b {
    private final C2508c appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private i currentAppState = i.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<InterfaceC2507b> appStateCallback = new WeakReference<>(this);

    public d(C2508c c2508c) {
        this.appStateMonitor = c2508c;
    }

    public i getAppState() {
        return this.currentAppState;
    }

    public WeakReference<InterfaceC2507b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i4) {
        this.appStateMonitor.f13202a.addAndGet(i4);
    }

    @Override // r8.InterfaceC2507b
    public void onUpdateAppState(i iVar) {
        i iVar2 = this.currentAppState;
        i iVar3 = i.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (iVar2 == iVar3) {
            this.currentAppState = iVar;
        } else if (iVar2 != iVar && iVar != iVar3) {
            this.currentAppState = i.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        C2508c c2508c = this.appStateMonitor;
        this.currentAppState = c2508c.f13208h;
        c2508c.delta(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (!this.isRegisteredForAppState) {
            return;
        }
        C2508c c2508c = this.appStateMonitor;
        WeakReference<InterfaceC2507b> weakReference = this.appStateCallback;
        synchronized (c2508c.white) {
            c2508c.white.remove(weakReference);
        }
        this.isRegisteredForAppState = false;
    }
}
