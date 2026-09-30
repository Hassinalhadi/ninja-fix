package com.google.firebase.perf.session;

import C8.i;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import r8.C2508c;
import r8.d;
import wa.n;
import y8.InterfaceC3402a;

@Keep
/* loaded from: classes2.dex */
public class SessionManager extends d {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final C2508c appStateMonitor;
    private final Set<WeakReference<InterfaceC3402a>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, C2508c c2508c) {
        super(C2508c.alpha());
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = c2508c;
        registerForAppState();
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.red) {
            this.gaugeManager.logGaugeMetadata(perfSession.alpha, i.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(i iVar) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.red) {
            this.gaugeManager.logGaugeMetadata(perfSession.alpha, iVar);
        }
    }

    private void startOrStopCollectingGauges(i iVar) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.red) {
            this.gaugeManager.startCollectingGauges(perfSession, iVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        i iVar = i.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(iVar);
        startOrStopCollectingGauges(iVar);
    }

    @Override // r8.d, r8.InterfaceC2507b
    public void onUpdateAppState(i iVar) {
        super.onUpdateAppState(iVar);
        if (this.appStateMonitor.f13210j) {
            return;
        }
        if (iVar == i.FOREGROUND) {
            updatePerfSession(PerfSession.echo(UUID.randomUUID().toString()));
        } else if (this.perfSession.foxtrot()) {
            updatePerfSession(PerfSession.echo(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(iVar);
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<InterfaceC3402a> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new n(this, context, this.perfSession, 2));
    }

    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.foxtrot()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<InterfaceC3402a> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(PerfSession perfSession) {
        if (perfSession.alpha == this.perfSession.alpha) {
            return;
        }
        this.perfSession = perfSession;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<InterfaceC3402a>> it = this.clients.iterator();
                while (it.hasNext()) {
                    InterfaceC3402a interfaceC3402a = it.next().get();
                    if (interfaceC3402a != null) {
                        interfaceC3402a.charlie(perfSession);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.f13208h);
        startOrStopCollectingGauges(this.appStateMonitor.f13208h);
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.echo(UUID.randomUUID().toString()), C2508c.alpha());
    }
}
