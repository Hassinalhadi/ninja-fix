package G6;

import R3.s;
import V5.x;
import bd.ExecutorC0753f;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class q extends Task {
    public final Object alpha = new Object();
    public final s bravo = new s(1);
    public boolean charlie;
    public volatile boolean delta;
    public Object echo;
    public Exception foxtrot;

    @Override // com.google.android.gms.tasks.Task
    public final q alpha(Executor executor, d dVar) {
        this.bravo.hotel(new n(executor, dVar));
        sierra();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final q bravo(e eVar) {
        this.bravo.hotel(new n(i.alpha, eVar));
        sierra();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final q charlie(Executor executor, e eVar) {
        this.bravo.hotel(new n(executor, eVar));
        sierra();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final q delta(Executor executor, OnFailureListener onFailureListener) {
        this.bravo.hotel(new n(executor, onFailureListener));
        sierra();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final q echo(Executor executor, OnSuccessListener onSuccessListener) {
        this.bravo.hotel(new n(executor, onSuccessListener));
        sierra();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final q foxtrot(Executor executor, c cVar) {
        q qVar = new q();
        this.bravo.hotel(new m(executor, cVar, qVar, 1));
        sierra();
        return qVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception golf() {
        Exception exc;
        synchronized (this.alpha) {
            exc = this.foxtrot;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object hotel() {
        Object obj;
        synchronized (this.alpha) {
            try {
                x.juliet("Task is not yet complete", this.charlie);
                if (!this.delta) {
                    Exception exc = this.foxtrot;
                    if (exc == null) {
                        obj = this.echo;
                    } else {
                        throw new RuntimeExecutionException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean india() {
        boolean z2;
        synchronized (this.alpha) {
            z2 = this.charlie;
        }
        return z2;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean juliet() {
        boolean z2;
        synchronized (this.alpha) {
            try {
                z2 = false;
                if (this.charlie && !this.delta && this.foxtrot == null) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    @Override // com.google.android.gms.tasks.Task
    public final q kilo(g gVar) {
        ExecutorC0753f executorC0753f = i.alpha;
        q qVar = new q();
        this.bravo.hotel(new n(executorC0753f, gVar, qVar));
        sierra();
        return qVar;
    }

    public final q lima(OnFailureListener onFailureListener) {
        delta(i.alpha, onFailureListener);
        return this;
    }

    public final q mike(Executor executor, c cVar) {
        q qVar = new q();
        this.bravo.hotel(new m(executor, cVar, qVar, 0));
        sierra();
        return qVar;
    }

    public final q november(Executor executor, g gVar) {
        q qVar = new q();
        this.bravo.hotel(new n(executor, gVar, qVar));
        sierra();
        return qVar;
    }

    public final void oscar(Exception exc) {
        x.india(exc, "Exception must not be null");
        synchronized (this.alpha) {
            if (!this.charlie) {
                this.charlie = true;
                this.foxtrot = exc;
            } else {
                throw DuplicateTaskCompletionException.of(this);
            }
        }
        this.bravo.india(this);
    }

    public final void papa(Object obj) {
        synchronized (this.alpha) {
            if (!this.charlie) {
                this.charlie = true;
                this.echo = obj;
            } else {
                throw DuplicateTaskCompletionException.of(this);
            }
        }
        this.bravo.india(this);
    }

    public final void quebec() {
        synchronized (this.alpha) {
            try {
                if (this.charlie) {
                    return;
                }
                this.charlie = true;
                this.delta = true;
                this.bravo.india(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean romeo(Object obj) {
        synchronized (this.alpha) {
            try {
                if (this.charlie) {
                    return false;
                }
                this.charlie = true;
                this.echo = obj;
                this.bravo.india(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void sierra() {
        synchronized (this.alpha) {
            try {
                if (!this.charlie) {
                    return;
                }
                this.bravo.india(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
