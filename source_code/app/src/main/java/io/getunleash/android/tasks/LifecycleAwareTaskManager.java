package io.getunleash.android.tasks;

import Cf.d;
import Cf.e;
import Nd.c;
import Nd.h;
import androidx.lifecycle.aa;
import androidx.lifecycle.aj;
import androidx.lifecycle.al;
import com.clevertap.android.sdk.Constants;
import io.getunleash.android.DefaultUnleashKt;
import io.getunleash.android.data.DataStrategy;
import io.getunleash.android.http.NetworkListener;
import io.getunleash.android.util.UnleashLogger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vf.I;
import vf.ab;
import vf.ad;
import vf.ao;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B3\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u0018\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001c\u0010\u0010J\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0010J\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u0010J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\u0010R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00190+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010(¨\u00063"}, d2 = {"Lio/getunleash/android/tasks/LifecycleAwareTaskManager;", "Landroidx/lifecycle/aj;", "Lio/getunleash/android/http/NetworkListener;", "", "Lio/getunleash/android/tasks/DataJob;", "dataJobs", "", "networkAvailable", "Lvf/ab;", "scope", "LNd/h;", "ioContext", "<init>", "(Ljava/util/List;ZLvf/ab;LNd/h;)V", "", "stopForegroundJobs", "()V", "", Constants.KEY_ID, "Lio/getunleash/android/data/DataStrategy;", "strategy", "Lkotlin/Function1;", "LNd/c;", "", Constants.KEY_ACTION, "Lvf/I;", "startWithStrategy", "(Ljava/lang/String;Lio/getunleash/android/data/DataStrategy;Lkotlin/jvm/functions/Function1;)Lvf/I;", "startForegroundJobs$unleashandroidsdk_release", "startForegroundJobs", "stop", "Landroidx/lifecycle/al;", "source", "Landroidx/lifecycle/aa;", com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, "onStateChanged", "(Landroidx/lifecycle/al;Landroidx/lifecycle/aa;)V", "onAvailable", "onLost", "Ljava/util/List;", "Z", "Lvf/ab;", "LNd/h;", "", "foregroundWorkers", "Ljava/util/Map;", "getForegroundWorkers$unleashandroidsdk_release", "()Ljava/util/Map;", "isForeground", "isDestroying", "Companion", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LifecycleAwareTaskManager implements aj, NetworkListener {

    @NotNull
    private static final String TAG = "TaskManager";

    @NotNull
    private final List<DataJob> dataJobs;

    @NotNull
    private final Map<String, I> foregroundWorkers;

    @NotNull
    private final h ioContext;
    private boolean isDestroying;
    private boolean isForeground;
    private boolean networkAvailable;

    @NotNull
    private final ab scope;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[aa.values().length];
            try {
                iArr[aa.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[aa.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[aa.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[aa.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[aa.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LifecycleAwareTaskManager(@NotNull List<DataJob> dataJobs, boolean z2, @NotNull ab scope, @NotNull h ioContext) {
        Intrinsics.echo(dataJobs, "dataJobs");
        Intrinsics.echo(scope, "scope");
        Intrinsics.echo(ioContext, "ioContext");
        this.dataJobs = dataJobs;
        this.networkAvailable = z2;
        this.scope = scope;
        this.ioContext = ioContext;
        this.foregroundWorkers = new LinkedHashMap();
    }

    private final I startWithStrategy(String id2, DataStrategy strategy, Function1<? super c<? super Unit>, ? extends Object> action) {
        return ad.zulu(this.scope, null, null, new LifecycleAwareTaskManager$startWithStrategy$1(this, strategy, id2, action, null), 3);
    }

    private final void stopForegroundJobs() {
        if (this.isForeground || this.isDestroying || !this.networkAvailable) {
            this.isForeground = false;
            for (DataJob dataJob : this.dataJobs) {
                if (!dataJob.getStrategy().getPauseOnBackground() && !this.isDestroying && this.networkAvailable) {
                    UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Keeping job running: " + dataJob.getId(), null, 4, null);
                } else {
                    UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Pausing foreground job: " + dataJob.getId(), null, 4, null);
                    I i4 = this.foregroundWorkers.get(dataJob.getId());
                    if (i4 != null) {
                        i4.foxtrot(null);
                    }
                }
            }
        }
    }

    @NotNull
    public final Map<String, I> getForegroundWorkers$unleashandroidsdk_release() {
        return this.foregroundWorkers;
    }

    @Override // io.getunleash.android.http.NetworkListener
    public void onAvailable() {
        UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Network available", null, 4, null);
        this.networkAvailable = true;
        startForegroundJobs$unleashandroidsdk_release();
    }

    @Override // io.getunleash.android.http.NetworkListener
    public void onLost() {
        UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Network connection lost", null, 4, null);
        this.networkAvailable = false;
        stopForegroundJobs();
    }

    @Override // androidx.lifecycle.aj
    public void onStateChanged(@NotNull al source, @NotNull aa event) {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(event, "event");
        UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Lifecycle state changed: " + event, null, 4, null);
        int i4 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3 && i4 != 4) {
                if (i4 != 5) {
                    return;
                }
                this.isDestroying = true;
                stopForegroundJobs();
                return;
            }
            stopForegroundJobs();
            return;
        }
        startForegroundJobs$unleashandroidsdk_release();
    }

    public final void startForegroundJobs$unleashandroidsdk_release() {
        if (!this.networkAvailable) {
            UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Network not available, not starting foreground jobs", null, 4, null);
            return;
        }
        if (!this.isForeground) {
            this.isForeground = true;
            for (DataJob dataJob : this.dataJobs) {
                I i4 = this.foregroundWorkers.get(dataJob.getId());
                if (i4 == null || !i4.echo()) {
                    UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Starting foreground job: " + dataJob.getId(), null, 4, null);
                    this.foregroundWorkers.put(dataJob.getId(), startWithStrategy(dataJob.getId(), dataJob.getStrategy(), dataJob.getAction()));
                }
            }
        }
    }

    public final void stop() {
        this.isDestroying = true;
        stopForegroundJobs();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LifecycleAwareTaskManager(List list, boolean z2, ab abVar, h hVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z2, abVar, hVar);
        z2 = (i4 & 2) != 0 ? true : z2;
        abVar = (i4 & 4) != 0 ? DefaultUnleashKt.getUnleashScope() : abVar;
        if ((i4 & 8) != 0) {
            e eVar = ao.alpha;
            hVar = d.purple;
        }
    }
}
