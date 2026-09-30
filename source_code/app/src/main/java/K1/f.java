package K1;

import android.os.Looper;
import bd.ExecutorC0753f;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import s6.E;

/* loaded from: classes3.dex */
public final class f {
    public volatile Object alpha;
    public volatile Object bravo;
    public final Object charlie;

    public f(Looper looper, Object obj, String str) {
        this.charlie = new ExecutorC0753f(looper);
        V5.x.india(obj, "Listener must not be null");
        this.alpha = obj;
        V5.x.echo(str);
        this.bravo = new T5.i(obj, str);
    }

    public void alpha() {
        this.alpha = null;
        this.bravo = null;
    }

    public void bravo(T5.j jVar) {
        ((Executor) this.charlie).execute(new E(6, this, jVar));
    }

    public f(Object obj, String str, Executor executor) {
        V5.x.india(executor, "Executor must not be null");
        this.charlie = executor;
        V5.x.india(obj, "Listener must not be null");
        this.alpha = obj;
        V5.x.echo(str);
        this.bravo = new T5.i(obj, str);
    }

    public f(I7.n nVar) {
        Object obj = new Object();
        g7.f fVar = new g7.f(6);
        this.bravo = obj;
        this.charlie = new ArrayList();
        this.alpha = fVar;
        nVar.alpha(new K7.a(this));
    }

    public f(k kVar) {
        this.charlie = kVar;
    }
}
