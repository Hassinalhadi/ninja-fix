package com.google.firebase.perf.session.gauges;

import A0.z;
import A2.s;
import A8.h;
import B8.e;
import B8.j;
import C8.d;
import C8.i;
import C8.k;
import C8.m;
import C8.o;
import I7.l;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.ws.RealWebSocket;
import s8.C2837a;
import s8.n;
import s8.q;
import u8.C3146a;
import z8.C3481b;
import z8.C3483d;
import z8.RunnableC3480a;
import z8.RunnableC3482c;
import z8.f;

@Keep
/* loaded from: classes2.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private i applicationProcessState;
    private final C2837a configResolver;
    private final l cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final l gaugeManagerExecutor;
    private C3483d gaugeMetadataManager;
    private final l memoryGaugeCollector;
    private String sessionId;
    private final h transportManager;
    private static final C3146a logger = C3146a.delta();
    private static final GaugeManager instance = new GaugeManager();

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new l(new E8.h(8)), h.f18l, C2837a.echo(), null, new l(new E8.h(9)), new l(new E8.h(10)));
    }

    private static void collectGaugeMetricOnce(C3481b c3481b, f fVar, Timer timer) {
        synchronized (c3481b) {
            try {
                c3481b.bravo.schedule(new RunnableC3480a(c3481b, timer, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C3481b.golf.foxtrot("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
        fVar.alpha(timer);
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [s8.n, java.lang.Object] */
    private long getCpuGaugeCollectionFrequencyMs(i iVar) {
        n nVar;
        long j5;
        int ordinal = iVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                j5 = -1;
            } else {
                j5 = this.configResolver.oscar();
            }
        } else {
            C2837a c2837a = this.configResolver;
            c2837a.getClass();
            synchronized (n.class) {
                try {
                    if (n.alpha == null) {
                        n.alpha = new Object();
                    }
                    nVar = n.alpha;
                } catch (Throwable th) {
                    throw th;
                }
            }
            e kilo = c2837a.kilo(nVar);
            if (kilo.bravo() && C2837a.sierra(((Long) kilo.alpha()).longValue())) {
                j5 = ((Long) kilo.alpha()).longValue();
            } else {
                e eVar = c2837a.alpha.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (eVar.bravo() && C2837a.sierra(((Long) eVar.alpha()).longValue())) {
                    c2837a.charlie.delta(((Long) eVar.alpha()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    j5 = ((Long) eVar.alpha()).longValue();
                } else {
                    e charlie = c2837a.charlie(nVar);
                    if (charlie.bravo() && C2837a.sierra(((Long) charlie.alpha()).longValue())) {
                        j5 = ((Long) charlie.alpha()).longValue();
                    } else if (c2837a.alpha.isLastFetchFailed()) {
                        j5 = 300;
                    } else {
                        j5 = 100;
                    }
                }
            }
        }
        C3146a c3146a = C3481b.golf;
        if (j5 <= 0) {
            return -1L;
        }
        return j5;
    }

    private m getGaugeMetadata() {
        C8.l xray = m.xray();
        int bravo = j.bravo((z.echo(5) * this.gaugeMetadataManager.charlie.totalMem) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
        xray.india();
        m.uniform((m) xray.purple, bravo);
        int bravo2 = j.bravo((z.echo(5) * this.gaugeMetadataManager.alpha.maxMemory()) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
        xray.india();
        m.sierra((m) xray.purple, bravo2);
        int bravo3 = j.bravo((z.echo(3) * this.gaugeMetadataManager.bravo.getMemoryClass()) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
        xray.india();
        m.tango((m) xray.purple, bravo3);
        return (m) xray.golf();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, s8.q] */
    private long getMemoryGaugeCollectionFrequencyMs(i iVar) {
        q qVar;
        long j5;
        int ordinal = iVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                j5 = -1;
            } else {
                j5 = this.configResolver.papa();
            }
        } else {
            C2837a c2837a = this.configResolver;
            c2837a.getClass();
            synchronized (q.class) {
                try {
                    if (q.alpha == null) {
                        q.alpha = new Object();
                    }
                    qVar = q.alpha;
                } catch (Throwable th) {
                    throw th;
                }
            }
            e kilo = c2837a.kilo(qVar);
            if (kilo.bravo() && C2837a.sierra(((Long) kilo.alpha()).longValue())) {
                j5 = ((Long) kilo.alpha()).longValue();
            } else {
                e eVar = c2837a.alpha.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (eVar.bravo() && C2837a.sierra(((Long) eVar.alpha()).longValue())) {
                    c2837a.charlie.delta(((Long) eVar.alpha()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    j5 = ((Long) eVar.alpha()).longValue();
                } else {
                    e charlie = c2837a.charlie(qVar);
                    if (charlie.bravo() && C2837a.sierra(((Long) charlie.alpha()).longValue())) {
                        j5 = ((Long) charlie.alpha()).longValue();
                    } else if (c2837a.alpha.isLastFetchFailed()) {
                        j5 = 300;
                    } else {
                        j5 = 100;
                    }
                }
            }
        }
        C3146a c3146a = f.foxtrot;
        if (j5 <= 0) {
            return -1L;
        }
        return j5;
    }

    public static /* synthetic */ C3481b lambda$new$0() {
        return new C3481b();
    }

    public static /* synthetic */ f lambda$new$1() {
        return new f();
    }

    private boolean startCollectingCpuMetrics(long j5, Timer timer) {
        if (j5 == -1) {
            logger.alpha("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        C3481b c3481b = (C3481b) this.cpuGaugeCollector.get();
        long j6 = c3481b.delta;
        if (j6 != -1 && j6 != 0 && j5 > 0) {
            ScheduledFuture scheduledFuture = c3481b.echo;
            if (scheduledFuture != null) {
                if (c3481b.foxtrot != j5) {
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        c3481b.echo = null;
                        c3481b.foxtrot = -1L;
                    }
                    c3481b.alpha(j5, timer);
                    return true;
                }
                return true;
            }
            c3481b.alpha(j5, timer);
            return true;
        }
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j5, Timer timer) {
        if (j5 == -1) {
            logger.alpha("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        f fVar = (f) this.memoryGaugeCollector.get();
        C3146a c3146a = f.foxtrot;
        if (j5 <= 0) {
            fVar.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = fVar.delta;
        if (scheduledFuture != null) {
            if (fVar.echo != j5) {
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    fVar.delta = null;
                    fVar.echo = -1L;
                }
                fVar.bravo(j5, timer);
                return true;
            }
            return true;
        }
        fVar.bravo(j5, timer);
        return true;
    }

    /* renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, i iVar) {
        C8.n beige = o.beige();
        while (!((C3481b) this.cpuGaugeCollector.get()).alpha.isEmpty()) {
            k kVar = (k) ((C3481b) this.cpuGaugeCollector.get()).alpha.poll();
            beige.india();
            o.victor((o) beige.purple, kVar);
        }
        while (!((f) this.memoryGaugeCollector.get()).bravo.isEmpty()) {
            d dVar = (d) ((f) this.memoryGaugeCollector.get()).bravo.poll();
            beige.india();
            o.tango((o) beige.purple, dVar);
        }
        beige.india();
        o.sierra((o) beige.purple, str);
        h hVar = this.transportManager;
        hVar.f20b.execute(new s(hVar, (o) beige.golf(), iVar, 2));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new C3483d(context);
    }

    public boolean logGaugeMetadata(String str, i iVar) {
        if (this.gaugeMetadataManager != null) {
            C8.n beige = o.beige();
            beige.india();
            o.sierra((o) beige.purple, str);
            m gaugeMetadata = getGaugeMetadata();
            beige.india();
            o.uniform((o) beige.purple, gaugeMetadata);
            o oVar = (o) beige.golf();
            h hVar = this.transportManager;
            hVar.f20b.execute(new s(hVar, oVar, iVar, 2));
            return true;
        }
        return false;
    }

    public void startCollectingGauges(PerfSession perfSession, i iVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(iVar, perfSession.purple);
        if (startCollectingGauges == -1) {
            logger.foxtrot("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = perfSession.alpha;
        this.sessionId = str;
        this.applicationProcessState = iVar;
        try {
            long j5 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new RunnableC3482c(this, str, iVar, 1), j5, j5, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.foxtrot("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        i iVar = this.applicationProcessState;
        C3481b c3481b = (C3481b) this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = c3481b.echo;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            c3481b.echo = null;
            c3481b.foxtrot = -1L;
        }
        f fVar = (f) this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = fVar.delta;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            fVar.delta = null;
            fVar.echo = -1L;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new RunnableC3482c(this, str, iVar, 0), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = i.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(l lVar, h hVar, C2837a c2837a, C3483d c3483d, l lVar2, l lVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = i.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = lVar;
        this.transportManager = hVar;
        this.configResolver = c2837a;
        this.gaugeMetadataManager = c3483d;
        this.cpuGaugeCollector = lVar2;
        this.memoryGaugeCollector = lVar3;
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce((C3481b) this.cpuGaugeCollector.get(), (f) this.memoryGaugeCollector.get(), timer);
    }

    private long startCollectingGauges(i iVar, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(iVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(iVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
