package z0;

import A0.s;
import A0.z;
import Q0.l;
import a0.ao;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import bx.C0769g;
import java.util.function.Consumer;
import kotlin.ResultKt;
import kotlin.Unit;
import s1.C2576i;
import s6.J4;
import t0.C2946x;
import t0.aj;
import td.C3117a;
import vf.U;
import vf.Y;
import vf.ad;
import w.m;

/* renamed from: z0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ScrollCaptureCallbackC3457f implements ScrollCaptureCallback {
    public final s alpha;
    public final l bravo;
    public final C2576i charlie;
    public final C2946x delta;
    public final C3117a echo;
    public final E0.h foxtrot;

    public ScrollCaptureCallbackC3457f(s sVar, l lVar, C3117a c3117a, C2576i c2576i, C2946x c2946x) {
        this.alpha = sVar;
        this.bravo = lVar;
        this.charlie = c2576i;
        this.delta = c2946x;
        this.echo = new C3117a(c3117a.purple.plus(C3458g.alpha));
        this.foxtrot = new E0.h(lVar.bravo(), new C3456e(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0097, code lost:
    
        if (r2 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(ScrollCaptureCallbackC3457f scrollCaptureCallbackC3457f, ScrollCaptureSession scrollCaptureSession, l lVar, Pd.c cVar) {
        C3454c c3454c;
        Od.a aVar;
        int i4;
        int i5;
        int i10;
        int i11;
        Object bravo;
        ScrollCaptureSession scrollCaptureSession2;
        l lVar2;
        int i12;
        int i13;
        int delta;
        int delta2;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (cVar instanceof C3454c) {
            c3454c = (C3454c) cVar;
            int i14 = c3454c.yellow;
            if ((i14 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3454c.yellow = i14 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c3454c.teal;
                aVar = Od.a.alpha;
                i4 = c3454c.yellow;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            i13 = c3454c.silver;
                            i12 = c3454c.red;
                            lVar2 = c3454c.purple;
                            scrollCaptureSession2 = aj.charlie(c3454c.alpha);
                            ResultKt.alpha(obj);
                            E0.h hVar = scrollCaptureCallbackC3457f.foxtrot;
                            delta = J4.delta(i12 - Zd.a.delta(hVar.bravo), 0, hVar.alpha);
                            E0.h hVar2 = scrollCaptureCallbackC3457f.foxtrot;
                            delta2 = J4.delta(i13 - Zd.a.delta(hVar2.bravo), 0, hVar2.alpha);
                            int i15 = lVar2.alpha;
                            if (delta == delta2) {
                                surface = scrollCaptureSession2.getSurface();
                                Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                                try {
                                    lockHardwareCanvas.save();
                                    lockHardwareCanvas.translate(-i15, -delta);
                                    l lVar3 = scrollCaptureCallbackC3457f.bravo;
                                    lockHardwareCanvas.translate(-lVar3.alpha, -lVar3.bravo);
                                    scrollCaptureCallbackC3457f.delta.getRootView().draw(lockHardwareCanvas);
                                    surface3 = scrollCaptureSession2.getSurface();
                                    surface3.unlockCanvasAndPost(lockHardwareCanvas);
                                    int delta3 = Zd.a.delta(scrollCaptureCallbackC3457f.foxtrot.bravo);
                                    return new l(i15, delta + delta3, lVar2.charlie, delta2 + delta3);
                                } catch (Throwable th) {
                                    surface2 = scrollCaptureSession2.getSurface();
                                    surface2.unlockCanvasAndPost(lockHardwareCanvas);
                                    throw th;
                                }
                            }
                            return l.echo;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i16 = c3454c.silver;
                    int i17 = c3454c.red;
                    l lVar4 = c3454c.purple;
                    ScrollCaptureSession charlie = aj.charlie(c3454c.alpha);
                    ResultKt.alpha(obj);
                    i10 = i16;
                    i5 = i17;
                    lVar = lVar4;
                    scrollCaptureSession = charlie;
                } else {
                    ResultKt.alpha(obj);
                    i5 = lVar.bravo;
                    E0.h hVar3 = scrollCaptureCallbackC3457f.foxtrot;
                    c3454c.alpha = scrollCaptureSession;
                    c3454c.purple = lVar;
                    c3454c.red = i5;
                    i10 = lVar.delta;
                    c3454c.silver = i10;
                    c3454c.yellow = 1;
                    if (i5 <= i10) {
                        int i18 = i10 - i5;
                        int i19 = hVar3.alpha;
                        if (i18 <= i19) {
                            float f5 = i5;
                            float f10 = hVar3.bravo;
                            if (f5 >= f10 && i10 <= i19 + f10) {
                                bravo = Unit.INSTANCE;
                            } else {
                                if (f5 < f10) {
                                    i11 = i5;
                                } else {
                                    i11 = i10 - i19;
                                }
                                bravo = hVar3.bravo(i11 - f10, c3454c);
                                if (bravo != aVar) {
                                    bravo = Unit.INSTANCE;
                                }
                                if (bravo != aVar) {
                                    bravo = Unit.INSTANCE;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException(z.juliet("Expected range (", i18, i19, ") to be ≤ viewportSize=").toString());
                        }
                    } else {
                        hVar3.getClass();
                        throw new IllegalArgumentException(("Expected min=" + i5 + " ≤ max=" + i10).toString());
                    }
                }
                c3454c.alpha = scrollCaptureSession;
                c3454c.purple = lVar;
                c3454c.red = i5;
                c3454c.silver = i10;
                c3454c.yellow = 2;
                if (C0564b.sierra(c3454c.getContext()).blue(C3455d.purple, c3454c) != aVar) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    lVar2 = lVar;
                    i12 = i5;
                    i13 = i10;
                    E0.h hVar4 = scrollCaptureCallbackC3457f.foxtrot;
                    delta = J4.delta(i12 - Zd.a.delta(hVar4.bravo), 0, hVar4.alpha);
                    E0.h hVar22 = scrollCaptureCallbackC3457f.foxtrot;
                    delta2 = J4.delta(i13 - Zd.a.delta(hVar22.bravo), 0, hVar22.alpha);
                    int i152 = lVar2.alpha;
                    if (delta == delta2) {
                    }
                }
                return aVar;
            }
        }
        c3454c = new C3454c(scrollCaptureCallbackC3457f, cVar);
        Object obj2 = c3454c.teal;
        aVar = Od.a.alpha;
        i4 = c3454c.yellow;
        if (i4 == 0) {
        }
        c3454c.alpha = scrollCaptureSession;
        c3454c.purple = lVar;
        c3454c.red = i5;
        c3454c.silver = i10;
        c3454c.yellow = 2;
        if (C0564b.sierra(c3454c.getContext()).blue(C3455d.purple, c3454c) != aVar) {
        }
        return aVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        ad.zulu(this.echo, U.alpha, null, new C3452a(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        Y zulu = ad.zulu(this.echo, null, null, new C3453b(this, scrollCaptureSession, rect, consumer, null), 3);
        zulu.crimson(new C0769g(28, cancellationSignal));
        cancellationSignal.setOnCancelListener(new m(1, zulu));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(ao.yankee(this.bravo));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.foxtrot.bravo = 0.0f;
        ((t0) ((ax) this.charlie.alpha)).setValue(Boolean.TRUE);
        runnable.run();
    }
}
