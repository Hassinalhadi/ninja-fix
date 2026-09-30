package androidx.camera.core;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.camera.core.impl.C0504b;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import t6.AbstractC3066u3;
import t6.P2;
import t6.a4;

/* renamed from: androidx.camera.core.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0534p implements Runnable {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ q purple;
    public final /* synthetic */ Executor red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ Context white;
    public final /* synthetic */ V0.h yellow;

    public /* synthetic */ RunnableC0534p(q qVar, Context context, Executor executor, int i4, V0.h hVar, long j5) {
        this.purple = qVar;
        this.white = context;
        this.red = executor;
        this.teal = i4;
        this.yellow = hVar;
        this.silver = j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0106 A[Catch: all -> 0x009f, TryCatch #4 {all -> 0x009f, blocks: (B:8:0x0042, B:10:0x004a, B:12:0x0072, B:14:0x008b, B:16:0x0096, B:17:0x00a8, B:19:0x00b7, B:21:0x00bd, B:22:0x00c3, B:25:0x00ce, B:26:0x00da, B:27:0x00db, B:28:0x00e7, B:29:0x00e8, B:30:0x00f4, B:37:0x00f5, B:39:0x0106, B:40:0x010d, B:44:0x0116, B:46:0x0145, B:47:0x0149, B:48:0x0154, B:49:0x0156, B:54:0x015b, B:56:0x015f, B:57:0x0167, B:59:0x016b, B:60:0x0192, B:62:0x0196, B:63:0x019b, B:67:0x01a8, B:52:0x0158, B:53:0x015a), top: B:7:0x0042, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        B bravo;
        switch (this.alpha) {
            case 0:
                q qVar = this.purple;
                Context context = this.white;
                Executor executor = this.red;
                int i4 = this.teal;
                V0.h hVar = this.yellow;
                long j5 = this.silver;
                qVar.getClass();
                Trace.beginSection(P2.foxtrot("CX:initAndRetryRecursively"));
                Context bravo2 = a4.bravo(context);
                try {
                    try {
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (InitializationException e) {
                    e = e;
                    C5.b bVar = new C5.b(j5, e);
                    bravo = qVar.india.bravo(bVar);
                    if (P2.delta()) {
                        P2.echo(bVar.alpha, "CX:CameraProvider-RetryStatus");
                    }
                    if (!bravo.bravo && i4 < Integer.MAX_VALUE) {
                        AbstractC3066u3.juliet("CameraX", "Retry init. Start time " + j5 + " current time " + SystemClock.elapsedRealtime(), e);
                        Handler handler = qVar.echo;
                        RunnableC0534p runnableC0534p = new RunnableC0534p(qVar, executor, j5, i4, bravo2, hVar);
                        long j6 = bravo.alpha;
                        if (Build.VERSION.SDK_INT >= 28) {
                            E2.e.quebec(handler, runnableC0534p, j6);
                        } else {
                            Message obtain = Message.obtain(handler, runnableC0534p);
                            obtain.obj = "retry_token";
                            handler.sendMessageDelayed(obtain, j6);
                        }
                    } else {
                        synchronized (qVar.bravo) {
                            qVar.kilo = 3;
                        }
                        if (bravo.charlie) {
                            qVar.charlie();
                            hVar.bravo(null);
                        } else if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                            String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).getAvailableCameraCount();
                            AbstractC3066u3.delta("CameraX", str, e);
                            hVar.delta(new InitializationException(new CameraUnavailableException(3, str)));
                        } else if (e instanceof InitializationException) {
                            hVar.delta(e);
                        } else {
                            hVar.delta(new InitializationException(e));
                        }
                    }
                    Trace.endSection();
                    return;
                } catch (CameraValidator$CameraIdListIncorrectException e4) {
                    e = e4;
                    C5.b bVar2 = new C5.b(j5, e);
                    bravo = qVar.india.bravo(bVar2);
                    if (P2.delta()) {
                    }
                    if (!bravo.bravo) {
                    }
                    synchronized (qVar.bravo) {
                    }
                } catch (RuntimeException e5) {
                    e = e5;
                    C5.b bVar22 = new C5.b(j5, e);
                    bravo = qVar.india.bravo(bVar22);
                    if (P2.delta()) {
                    }
                    if (!bravo.bravo) {
                    }
                    synchronized (qVar.bravo) {
                    }
                }
                if (qVar.charlie.bravo() != null) {
                    C0504b c0504b = new C0504b(qVar.delta, qVar.echo);
                    C0533o alpha = qVar.charlie.alpha();
                    qVar.foxtrot = new av.i(bravo2, c0504b, alpha, qVar.charlie.delta());
                    if (qVar.charlie.foxtrot() != null) {
                        av.i iVar = qVar.foxtrot;
                        qVar.golf = at.b.alpha(bravo2, iVar.echo, new LinkedHashSet(iVar.foxtrot));
                        if (qVar.charlie.hotel() != null) {
                            qVar.hotel = new av.z(bravo2);
                            if (executor instanceof ExecutorC0531m) {
                                ((ExecutorC0531m) executor).alpha(qVar.foxtrot);
                            }
                            qVar.alpha.kilo(qVar.foxtrot);
                            androidx.camera.core.impl.ac.alpha(bravo2, qVar.alpha, alpha);
                            if (i4 > 1 && P2.delta()) {
                                P2.echo(-1, "CX:CameraProvider-RetryStatus");
                            }
                            qVar.charlie();
                            hVar.bravo(null);
                            Trace.endSection();
                            return;
                        }
                        throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                    }
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                }
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
            default:
                int i5 = this.teal + 1;
                V0.h hVar2 = this.yellow;
                q qVar2 = this.purple;
                qVar2.getClass();
                Context context2 = this.white;
                Executor executor2 = this.red;
                executor2.execute(new RunnableC0534p(qVar2, context2, executor2, i5, hVar2, this.silver));
                return;
        }
    }

    public /* synthetic */ RunnableC0534p(q qVar, Executor executor, long j5, int i4, Context context, V0.h hVar) {
        this.purple = qVar;
        this.red = executor;
        this.silver = j5;
        this.teal = i4;
        this.white = context;
        this.yellow = hVar;
    }
}
