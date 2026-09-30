package androidx.work.impl.workers;

import A2.am;
import A2.u;
import A2.x;
import A2.y;
import A2.z;
import B2.w;
import F2.n;
import H2.l;
import J2.p;
import J2.r;
import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vf.AbstractC3220y;
import vf.ad;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ConstraintUnsatisfiedException", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters charlie;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$ConstraintUnsatisfiedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "stopReason", "", "(I)V", "getStopReason", "()I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ConstraintUnsatisfiedException extends CancellationException {
        private final int stopReason;

        public ConstraintUnsatisfiedException(int i4) {
            this.stopReason = i4;
        }

        public final int getStopReason() {
            return this.stopReason;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.echo(appContext, "appContext");
        Intrinsics.echo(workerParameters, "workerParameters");
        this.charlie = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(ConstraintTrackingWorker constraintTrackingWorker, y yVar, n nVar, p pVar, Pd.c cVar) {
        b bVar;
        int i4;
        constraintTrackingWorker.getClass();
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i5 = bVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                bVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = bVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = bVar.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    d dVar = new d(yVar, nVar, pVar, null);
                    bVar.red = 1;
                    obj = ad.mike(dVar, bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                Intrinsics.delta(obj, "delegate: ListenableWork….cancel()\n        }\n    }");
                return obj;
            }
        }
        bVar = new b(constraintTrackingWorker, cVar);
        Object obj2 = bVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = bVar.red;
        if (i4 == 0) {
        }
        Intrinsics.delta(obj2, "delegate: ListenableWork….cancel()\n        }\n    }");
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object charlie(ConstraintTrackingWorker constraintTrackingWorker, Pd.c cVar) {
        e eVar;
        int i4;
        String str;
        y yVar;
        ConstraintTrackingWorker constraintTrackingWorker2;
        int stopReason;
        WorkerParameters workerParameters = constraintTrackingWorker.charlie;
        try {
            if (cVar instanceof e) {
                eVar = (e) cVar;
                int i5 = eVar.teal;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    eVar.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                    e eVar2 = eVar;
                    Object obj = eVar2.red;
                    Od.a aVar = Od.a.alpha;
                    i4 = eVar2.teal;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            y yVar2 = eVar2.purple;
                            ConstraintTrackingWorker constraintTrackingWorker3 = eVar2.alpha;
                            try {
                                ResultKt.alpha(obj);
                                yVar = yVar2;
                                constraintTrackingWorker2 = constraintTrackingWorker3;
                            } catch (CancellationException e) {
                                e = e;
                                yVar = yVar2;
                                constraintTrackingWorker2 = constraintTrackingWorker3;
                                if (!constraintTrackingWorker2.isStopped()) {
                                }
                                if (Build.VERSION.SDK_INT < 31) {
                                }
                                yVar.stop(stopReason);
                                if (e instanceof ConstraintUnsatisfiedException) {
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        A2.j inputData = constraintTrackingWorker.getInputData();
                        inputData.getClass();
                        Object obj2 = inputData.alpha.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                        if (obj2 instanceof String) {
                            str = (String) obj2;
                        } else {
                            str = null;
                        }
                        if (str != null && str.length() != 0) {
                            w golf = w.golf(constraintTrackingWorker.getApplicationContext());
                            r uniform = golf.delta.uniform();
                            String uuid = constraintTrackingWorker.getId().toString();
                            Intrinsics.delta(uuid, "id.toString()");
                            p hotel = uniform.hotel(uuid);
                            if (hotel == null) {
                                return new u();
                            }
                            l lVar = golf.kilo;
                            Intrinsics.delta(lVar, "workManagerImpl.trackers");
                            n nVar = new n(lVar);
                            if (!nVar.alpha(hotel)) {
                                String str2 = j.alpha;
                                z.echo().alpha(str2, "Constraints not met for delegate " + str + ". Requesting retry.");
                                return new Object();
                            }
                            z.echo().alpha(j.alpha, "Constraints met for delegate ".concat(str));
                            try {
                                am workerFactory = constraintTrackingWorker.getWorkerFactory();
                                Context applicationContext = constraintTrackingWorker.getApplicationContext();
                                Intrinsics.delta(applicationContext, "applicationContext");
                                y alpha = workerFactory.alpha(applicationContext, str, workerParameters);
                                L2.b bVar = workerParameters.hotel.delta;
                                Intrinsics.delta(bVar, "workerParameters.taskExecutor.mainThreadExecutor");
                                try {
                                    AbstractC3220y papa = ad.papa(bVar);
                                    yVar = alpha;
                                    try {
                                        f fVar = new f(constraintTrackingWorker, yVar, nVar, hotel, null);
                                        eVar2.alpha = constraintTrackingWorker;
                                        eVar2.purple = yVar;
                                        eVar2.teal = 1;
                                        obj = ad.blue(papa, fVar, eVar2);
                                        if (obj == aVar) {
                                            return aVar;
                                        }
                                        constraintTrackingWorker2 = constraintTrackingWorker;
                                    } catch (CancellationException e4) {
                                        e = e4;
                                        constraintTrackingWorker2 = constraintTrackingWorker;
                                        if (!constraintTrackingWorker2.isStopped() || (e instanceof ConstraintUnsatisfiedException)) {
                                            if (Build.VERSION.SDK_INT < 31) {
                                                stopReason = -512;
                                            } else if (constraintTrackingWorker2.isStopped()) {
                                                stopReason = constraintTrackingWorker2.getStopReason();
                                            } else if (e instanceof ConstraintUnsatisfiedException) {
                                                stopReason = ((ConstraintUnsatisfiedException) e).getStopReason();
                                            } else {
                                                throw new IllegalStateException("Unreachable");
                                            }
                                            yVar.stop(stopReason);
                                        }
                                        if (e instanceof ConstraintUnsatisfiedException) {
                                            return new Object();
                                        }
                                        throw e;
                                    }
                                } catch (CancellationException e5) {
                                    e = e5;
                                    yVar = alpha;
                                }
                            } catch (Throwable unused) {
                                z.echo().alpha(j.alpha, "No worker to delegate to.");
                                golf.charlie.getClass();
                                return new u();
                            }
                        } else {
                            z.echo().charlie(j.alpha, "No worker to delegate to.");
                            return new u();
                        }
                    }
                    return (x) obj;
                }
            }
            return (x) obj;
        } catch (CancellationException e10) {
            e = e10;
            if (!constraintTrackingWorker2.isStopped()) {
            }
            if (Build.VERSION.SDK_INT < 31) {
            }
            yVar.stop(stopReason);
            if (e instanceof ConstraintUnsatisfiedException) {
            }
        }
        eVar = new e(constraintTrackingWorker, cVar);
        e eVar22 = eVar;
        Object obj3 = eVar22.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = eVar22.teal;
        if (i4 == 0) {
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final Object alpha(A2.g gVar) {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.delta(backgroundExecutor, "backgroundExecutor");
        return ad.blue(ad.papa(backgroundExecutor), new a(this, null), gVar);
    }
}
