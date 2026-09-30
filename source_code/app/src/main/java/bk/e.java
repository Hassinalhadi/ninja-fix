package bk;

import A2.ao;
import A2.s;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.core.G;
import androidx.camera.core.M;
import androidx.camera.core.at;
import androidx.camera.core.impl.ai;
import androidx.camera.core.t;
import androidx.lifecycle.RunnableC0643m;
import bd.ScheduledExecutorServiceC0750c;
import bj.l;
import bj.m;
import bl.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import t6.AbstractC3003i;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class e implements m, SurfaceTexture.OnFrameAvailableListener {
    public final c alpha;
    public final HandlerThread bravo;
    public final ScheduledExecutorServiceC0750c charlie;
    public final Handler delta;
    public int echo;
    public boolean foxtrot;
    public final AtomicBoolean golf;
    public final LinkedHashMap hotel;
    public SurfaceTexture india;
    public SurfaceTexture juliet;

    public e(t tVar, at atVar, at atVar2) {
        Map map = Collections.EMPTY_MAP;
        this.echo = 0;
        this.foxtrot = false;
        this.golf = new AtomicBoolean(false);
        this.hotel = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.bravo = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.delta = handler;
        this.charlie = new ScheduledExecutorServiceC0750c(handler);
        this.alpha = new c(atVar, atVar2);
        try {
            try {
                AbstractC3003i.alpha(new ao(this, tVar)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
        } catch (RuntimeException e4) {
            alpha();
            throw e4;
        }
    }

    @Override // bj.m
    public final void alpha() {
        if (this.golf.getAndSet(true)) {
            return;
        }
        echo(new ai(17, this), new K5.a(3));
    }

    @Override // bj.m
    public final void bravo(l lVar) {
        if (this.golf.get()) {
            lVar.close();
            return;
        }
        RunnableC0643m runnableC0643m = new RunnableC0643m(12, this, lVar);
        Objects.requireNonNull(lVar);
        echo(runnableC0643m, new ai(12, lVar));
    }

    @Override // bj.m
    public final void charlie(M m4) {
        if (this.golf.get()) {
            m4.charlie();
        } else {
            echo(new RunnableC0643m(11, this, m4), new G(m4, 1));
        }
    }

    public final void delta() {
        if (this.foxtrot && this.echo == 0) {
            LinkedHashMap linkedHashMap = this.hotel;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((l) it.next()).close();
            }
            linkedHashMap.clear();
            c cVar = this.alpha;
            if (((AtomicBoolean) cVar.red).getAndSet(false)) {
                i.charlie((Thread) cVar.teal);
                cVar.november();
            }
            cVar.f3394g = -1;
            cVar.f3395h = -1;
            this.bravo.quit();
        }
    }

    public final void echo(Runnable runnable, Runnable runnable2) {
        try {
            this.charlie.execute(new s(this, runnable2, runnable, 22));
        } catch (RejectedExecutionException e) {
            AbstractC3066u3.juliet("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (!this.golf.get() && (surfaceTexture2 = this.india) != null && this.juliet != null) {
            surfaceTexture2.updateTexImage();
            this.juliet.updateTexImage();
            for (Map.Entry entry : this.hotel.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                l lVar = (l) entry.getKey();
                if (lVar.red == 34) {
                    try {
                        this.alpha.romeo(surfaceTexture.getTimestamp(), surface, lVar, this.india, this.juliet);
                    } catch (RuntimeException e) {
                        AbstractC3066u3.delta("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                    }
                }
            }
        }
    }
}
