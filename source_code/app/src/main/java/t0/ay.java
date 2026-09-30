package t0;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import vf.AbstractC3220y;

/* loaded from: classes3.dex */
public final class ay extends AbstractC3220y {
    public static final Lazy e = LazyKt.lazy(ao.yellow);

    /* renamed from: f, reason: collision with root package name */
    public static final A7.a f13828f = new A7.a(8);

    /* renamed from: a, reason: collision with root package name */
    public boolean f13829a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13830b;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.compose.runtime.D f13832d;
    public final Choreographer purple;
    public final Handler red;
    public final Object silver = new Object();
    public final kotlin.collections.l teal = new kotlin.collections.l();
    public ArrayList white = new ArrayList();
    public ArrayList yellow = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ax f13831c = new ax(this);

    public ay(Choreographer choreographer, Handler handler) {
        this.purple = choreographer;
        this.red = handler;
        this.f13832d = new androidx.compose.runtime.D(choreographer, this);
    }

    public static final void magenta(ay ayVar) {
        boolean z2;
        do {
            Runnable navy = ayVar.navy();
            while (navy != null) {
                navy.run();
                navy = ayVar.navy();
            }
            synchronized (ayVar.silver) {
                if (ayVar.teal.isEmpty()) {
                    z2 = false;
                    ayVar.f13829a = false;
                } else {
                    z2 = true;
                }
            }
        } while (z2);
    }

    @Override // vf.AbstractC3220y
    public final void beige(Nd.h hVar, Runnable runnable) {
        synchronized (this.silver) {
            this.teal.addLast(runnable);
            if (!this.f13829a) {
                this.f13829a = true;
                this.red.post(this.f13831c);
                if (!this.f13830b) {
                    this.f13830b = true;
                    this.purple.postFrameCallback(this.f13831c);
                }
            }
        }
    }

    public final Runnable navy() {
        Object removeFirst;
        Runnable runnable;
        synchronized (this.silver) {
            kotlin.collections.l lVar = this.teal;
            if (lVar.isEmpty()) {
                removeFirst = null;
            } else {
                removeFirst = lVar.removeFirst();
            }
            runnable = (Runnable) removeFirst;
        }
        return runnable;
    }
}
