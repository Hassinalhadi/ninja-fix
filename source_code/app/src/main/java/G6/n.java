package G6;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import s6.E;

/* loaded from: classes2.dex */
public final class n implements o, OnSuccessListener, OnFailureListener, d {
    public final /* synthetic */ int alpha;
    public final Executor purple;
    public final Object red;
    public final Object silver;

    public n(Executor executor, d dVar) {
        this.alpha = 0;
        this.red = new Object();
        this.purple = executor;
        this.silver = dVar;
    }

    private final void charlie(Task task) {
        synchronized (this.red) {
        }
        this.purple.execute(new com.google.common.util.concurrent.d(2, this, task, false));
    }

    private final void delta(Task task) {
        if (!task.juliet() && !((q) task).delta) {
            synchronized (this.red) {
                try {
                    if (((OnFailureListener) this.silver) == null) {
                        return;
                    }
                    this.purple.execute(new E(2, this, task, false));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final void echo(Task task) {
        if (task.juliet()) {
            synchronized (this.red) {
                try {
                    if (((OnSuccessListener) this.silver) == null) {
                        return;
                    }
                    this.purple.execute(new be.g(3, this, task, false));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // G6.d
    public void alpha() {
        ((q) this.silver).quebec();
    }

    @Override // G6.o
    public final void bravo(Task task) {
        switch (this.alpha) {
            case 0:
                if (((q) task).delta) {
                    synchronized (this.red) {
                        try {
                            if (((d) this.silver) != null) {
                                this.purple.execute(new F6.b(2, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                charlie(task);
                return;
            case 2:
                delta(task);
                return;
            case 3:
                echo(task);
                return;
            default:
                this.purple.execute(new com.google.common.util.concurrent.d(3, this, task, false));
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((q) this.silver).oscar(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, com.clevertap.android.sdk.task.OnSuccessListener
    public void onSuccess(Object obj) {
        ((q) this.silver).papa(obj);
    }

    public n(Executor executor, e eVar) {
        this.alpha = 1;
        this.red = new Object();
        this.purple = executor;
        this.silver = eVar;
    }

    public n(Executor executor, g gVar, q qVar) {
        this.alpha = 4;
        this.purple = executor;
        this.red = gVar;
        this.silver = qVar;
    }

    public n(Executor executor, OnFailureListener onFailureListener) {
        this.alpha = 2;
        this.red = new Object();
        this.purple = executor;
        this.silver = onFailureListener;
    }

    public n(Executor executor, OnSuccessListener onSuccessListener) {
        this.alpha = 3;
        this.red = new Object();
        this.purple = executor;
        this.silver = onSuccessListener;
    }
}
