package s6;

import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
import com.google.mlkit.vision.barcode.internal.zze;
import com.google.mlkit.vision.barcode.internal.zzh;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class K extends AtomicReference implements Runnable {
    public static final H red = new Object();
    public static final H silver = new Object();
    public final /* synthetic */ L alpha;
    public final Y7 purple;

    public K(L l10, Y7 y72) {
        this.alpha = l10;
        this.purple = y72;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void alpha(F f5) {
        Object arVar;
        Object aqVar;
        L l10 = this.alpha;
        f5.getClass();
        Object obj = l10.alpha;
        if (obj == null) {
            if (f5 instanceof aw) {
                arVar = ((A) f5).alpha;
                if (arVar instanceof aq) {
                    aq aqVar2 = (aq) arVar;
                    if (aqVar2.alpha) {
                        RuntimeException runtimeException = aqVar2.bravo;
                        arVar = runtimeException != null ? new aq(false, runtimeException) : aq.delta;
                    }
                }
                Objects.requireNonNull(arVar);
            } else {
                boolean isCancelled = f5.isCancelled();
                if ((!A.silver) & isCancelled) {
                    arVar = aq.delta;
                    Objects.requireNonNull(arVar);
                } else {
                    try {
                        Object charlie = A.charlie(f5);
                        if (isCancelled) {
                            charlie = new aq(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(f5))));
                        } else if (charlie == null) {
                            arVar = A.yellow;
                        }
                        arVar = charlie;
                    } catch (Error e) {
                        e = e;
                        arVar = new ar(e);
                    } catch (CancellationException e4) {
                        if (!isCancelled) {
                            aqVar = new ar(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(f5)), e4));
                            arVar = aqVar;
                        } else {
                            arVar = new aq(false, e4);
                        }
                    } catch (ExecutionException e5) {
                        if (isCancelled) {
                            aqVar = new aq(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(f5)), e5));
                            arVar = aqVar;
                        } else {
                            arVar = new ar(e5.getCause());
                        }
                    } catch (Exception e10) {
                        e = e10;
                        arVar = new ar(e);
                    }
                }
            }
            if (A.white.golf(l10, null, arVar)) {
                A.echo(l10);
                return;
            }
            return;
        }
        if (obj instanceof aq) {
        }
    }

    public final void bravo(Thread thread) {
        Runnable runnable = (Runnable) get();
        G g2 = null;
        boolean z2 = false;
        int i4 = 0;
        while (true) {
            boolean z10 = runnable instanceof G;
            H h4 = silver;
            if (!z10) {
                if (runnable != h4) {
                    break;
                }
            } else {
                g2 = (G) runnable;
            }
            i4++;
            if (i4 > 1000) {
                if (runnable == h4 || compareAndSet(runnable, h4)) {
                    if (Thread.interrupted() || z2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    LockSupport.park(g2);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z2) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        F f5 = null;
        if (compareAndSet(null, currentThread)) {
            L l10 = this.alpha;
            boolean isDone = l10.isDone();
            H h4 = red;
            if (!isDone) {
                try {
                    Y7 y72 = this.purple;
                    a8 a8Var = y72.alpha;
                    zze zzeVar = a8Var.romeo;
                    float f10 = y72.bravo;
                    float f11 = a8Var.kilo;
                    if (f10 < 1.0f) {
                        f10 = 1.0f;
                    }
                    float f12 = 0.0f;
                    if (f11 <= 0.0f || f10 <= f11) {
                        f11 = f10;
                    }
                    ZoomSuggestionOptions zoomSuggestionOptions = zzeVar.zza;
                    int i4 = zzh.zzc;
                    if (true == zoomSuggestionOptions.zzb().setZoom(f11)) {
                        f12 = f11;
                    }
                    f5 = new F(Float.valueOf(f12));
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, h4)) {
                            bravo(currentThread);
                        }
                        if (A.white.golf(l10, null, new ar(th))) {
                            A.echo(l10);
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        if (!compareAndSet(currentThread, h4)) {
                            bravo(currentThread);
                        }
                        alpha(null);
                        throw null;
                    }
                }
            }
            if (!compareAndSet(currentThread, h4)) {
                bravo(currentThread);
            }
            if (!isDone) {
                alpha(f5);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == red) {
            str = "running=[DONE]";
        } else if (runnable instanceof G) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = ao.ad.gray("running=[RUNNING ON ", ((Thread) runnable).getName(), Constants.AES_SUFFIX);
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return ao.ad.amber(str, ", ", this.purple.toString());
    }
}
