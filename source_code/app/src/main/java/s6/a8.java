package s6;

import android.content.Context;
import com.google.mlkit.vision.barcode.internal.zze;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class a8 {
    public static final V5.g sierra = new V5.g("AutoZoom", null);
    public final W7 alpha;
    public final AtomicBoolean bravo;
    public final Object charlie;
    public final C2780u delta;
    public final ScheduledExecutorService echo;
    public final C2646f foxtrot;
    public final P7 golf;
    public final String hotel;
    public D india;
    public float juliet;
    public float kilo;
    public long lima;
    public long mike;
    public ScheduledFuture november;
    public String oscar;
    public boolean papa;
    public int quebec;
    public zze romeo;

    public a8(Context context, W7 w72, String str) {
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        C2646f c2646f = AbstractC2655g.alpha;
        com.google.mlkit.common.sdkinternal.m mVar = new com.google.mlkit.common.sdkinternal.m(context);
        byte b2 = (byte) (((byte) (0 | 1)) | 2);
        if (b2 == 3) {
            P7 p72 = new P7(context, mVar, new N7(context, new K7("scanner-auto-zoom", 1)), "scanner-auto-zoom");
            this.charlie = new Object();
            this.alpha = w72;
            this.bravo = new AtomicBoolean(false);
            this.delta = new C2780u();
            this.echo = unconfigurableScheduledExecutorService;
            this.foxtrot = c2646f;
            this.golf = p72;
            this.hotel = str;
            this.quebec = 1;
            this.juliet = 1.0f;
            this.kilo = -1.0f;
            this.lima = c2646f.alpha();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b2 & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((b2 & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final long alpha() {
        long convert;
        synchronized (this.charlie) {
            convert = TimeUnit.MILLISECONDS.convert(this.foxtrot.alpha() - this.lima, TimeUnit.NANOSECONDS);
        }
        return convert;
    }

    public final void bravo() {
        synchronized (this.charlie) {
            try {
                if (this.quebec == 4) {
                    return;
                }
                echo(false);
                this.echo.shutdown();
                this.quebec = 4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [s6.A, s6.L, java.lang.Object] */
    public final void charlie(float f5, A5 a52, X7 x72) {
        as asVar;
        as asVar2;
        synchronized (this.charlie) {
            try {
                if (this.india != null && this.romeo != null && this.quebec == 2) {
                    if (!this.bravo.compareAndSet(false, true)) {
                        return;
                    }
                    float f10 = this.juliet;
                    Y7 y72 = new Y7(this, f5);
                    ?? obj = new Object();
                    obj.f13694a = new K(obj, y72);
                    obj.run();
                    E e = new E(0, (Object) obj, new Z7(this, a52, f10, x72, f5));
                    D d4 = D.alpha;
                    if (!obj.isDone() && (asVar = obj.purple) != (asVar2 = as.delta)) {
                        as asVar3 = new as(e);
                        do {
                            asVar3.charlie = asVar;
                            if (!A.white.foxtrot(obj, asVar, asVar3)) {
                                asVar = obj.purple;
                            }
                        } while (asVar != asVar2);
                    }
                    A.golf(e, d4);
                }
            } finally {
            }
        }
    }

    public final void delta() {
        synchronized (this.charlie) {
            try {
                int i4 = this.quebec;
                if (i4 != 2 && i4 != 4) {
                    golf(true);
                    this.november = this.echo.scheduleWithFixedDelay(new F6.b(29, this), 500L, 500L, TimeUnit.MILLISECONDS);
                    if (this.quebec == 1) {
                        this.oscar = UUID.randomUUID().toString();
                        this.mike = this.foxtrot.alpha();
                        this.papa = false;
                        A5 a52 = A5.SCANNER_AUTO_ZOOM_START;
                        float f5 = this.juliet;
                        foxtrot(a52, f5, f5, null);
                    } else {
                        A5 a53 = A5.SCANNER_AUTO_ZOOM_RESUME;
                        float f10 = this.juliet;
                        foxtrot(a53, f10, f10, null);
                    }
                    this.quebec = 2;
                }
            } finally {
            }
        }
    }

    public final void echo(boolean z2) {
        synchronized (this.charlie) {
            try {
                int i4 = this.quebec;
                if (i4 != 1 && i4 != 4) {
                    golf(true);
                    if (z2) {
                        if (!this.papa) {
                            A5 a52 = A5.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f5 = this.juliet;
                            foxtrot(a52, f5, f5, null);
                        }
                        A5 a53 = A5.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f10 = this.juliet;
                        foxtrot(a53, f10, f10, null);
                    } else {
                        A5 a54 = A5.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f11 = this.juliet;
                        foxtrot(a54, f11, f11, null);
                    }
                    this.papa = false;
                    this.quebec = 1;
                    this.oscar = null;
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, androidx.appcompat.widget.i1] */
    /* JADX WARN: Type inference failed for: r11v7, types: [s6.L5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, av.ao] */
    public final void foxtrot(A5 a52, float f5, float f10, X7 x72) {
        long convert;
        String str = this.oscar;
        if (str != null) {
            ?? obj = new Object();
            obj.alpha = this.hotel;
            obj.purple = str;
            obj.red = Float.valueOf(f5);
            obj.silver = Float.valueOf(f10);
            synchronized (this.charlie) {
                convert = TimeUnit.MILLISECONDS.convert(this.foxtrot.alpha() - this.mike, TimeUnit.NANOSECONDS);
            }
            obj.teal = Long.valueOf(convert);
            if (x72 != null) {
                ?? obj2 = new Object();
                obj2.alpha = Float.valueOf(x72.alpha);
                obj2.bravo = Float.valueOf(x72.bravo);
                obj2.charlie = Float.valueOf(x72.charlie);
                obj2.delta = Float.valueOf(x72.delta);
                obj2.echo = Float.valueOf(0.0f);
                obj.white = new C2654f7(obj2);
            }
            P7 p72 = this.golf;
            ?? obj3 = new Object();
            obj3.golf = new C2663g7(obj);
            com.google.mlkit.common.sdkinternal.p.alpha.execute(new ao.d(p72, new B0.a((androidx.appcompat.widget.i1) obj3, 0), a52, p72.charlie(), 11, false));
        }
    }

    public final void golf(boolean z2) {
        ScheduledFuture scheduledFuture;
        synchronized (this.charlie) {
            try {
                this.delta.charlie();
                this.lima = this.foxtrot.alpha();
                if (z2 && (scheduledFuture = this.november) != null) {
                    scheduledFuture.cancel(false);
                    this.november = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
