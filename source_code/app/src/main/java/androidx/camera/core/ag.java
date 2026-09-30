package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.impl.V;
import androidx.core.os.OperationCanceledException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import t6.AbstractC3003i;
import t6.AbstractC3061t3;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public abstract class ag implements androidx.camera.core.impl.aq {

    /* renamed from: a, reason: collision with root package name */
    public S2.l f2924a;
    public a4.u alpha;

    /* renamed from: b, reason: collision with root package name */
    public ImageWriter f2925b;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f2929g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f2930h;

    /* renamed from: i, reason: collision with root package name */
    public ByteBuffer f2931i;

    /* renamed from: j, reason: collision with root package name */
    public ByteBuffer f2932j;
    public volatile int purple;
    public volatile int red;
    public volatile boolean teal;
    public volatile boolean white;
    public Executor yellow;
    public volatile int silver = 1;

    /* renamed from: c, reason: collision with root package name */
    public Rect f2926c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public Rect f2927d = new Rect();
    public Matrix e = new Matrix();

    /* renamed from: f, reason: collision with root package name */
    public Matrix f2928f = new Matrix();

    /* renamed from: k, reason: collision with root package name */
    public final Object f2933k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public boolean f2934l = true;

    public abstract ar alpha(androidx.camera.core.impl.ar arVar);

    @Override // androidx.camera.core.impl.aq
    public final void bravo(androidx.camera.core.impl.ar arVar) {
        try {
            ar alpha = alpha(arVar);
            if (alpha != null) {
                foxtrot(alpha);
            }
        } catch (IllegalStateException e) {
            AbstractC3066u3.delta("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.common.util.concurrent.e charlie(final ar arVar) {
        int i4;
        Object obj;
        final Executor executor;
        final a4.u uVar;
        boolean z2;
        S2.l lVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        aj ajVar;
        final ar arVar2;
        aj echo;
        boolean z10 = false;
        if (this.teal) {
            i4 = this.purple;
        } else {
            i4 = 0;
        }
        Object obj2 = this.f2933k;
        synchronized (obj2) {
            try {
                try {
                    executor = this.yellow;
                    uVar = this.alpha;
                    if (this.teal && i4 != this.red) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        hotel(arVar, i4);
                    }
                    if (this.teal) {
                        echo(arVar);
                    }
                    try {
                        lVar = this.f2924a;
                        try {
                            imageWriter = this.f2925b;
                            byteBuffer = this.f2929g;
                            try {
                                byteBuffer2 = this.f2930h;
                                byteBuffer3 = this.f2931i;
                                byteBuffer4 = this.f2932j;
                            } catch (Throwable th) {
                                th = th;
                                obj = obj2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (uVar != null && executor != null && this.f2934l) {
            if (lVar != null) {
                if (this.silver == 2) {
                    echo = ImageProcessingUtil.bravo(arVar, lVar, byteBuffer, i4, this.white);
                } else if (this.silver == 1) {
                    if (this.white) {
                        ImageProcessingUtil.alpha(arVar);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        echo = ImageProcessingUtil.echo(arVar, lVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i4);
                    }
                }
                ajVar = echo;
                if (ajVar == null) {
                    z10 = true;
                }
                if (!z10) {
                    arVar2 = arVar;
                } else {
                    arVar2 = ajVar;
                }
                final Rect rect = new Rect();
                final Matrix matrix = new Matrix();
                synchronized (this.f2933k) {
                    if (z2 && !z10) {
                        try {
                            golf(arVar.bravo(), arVar.alpha(), arVar2.bravo(), arVar2.alpha());
                        } finally {
                        }
                    }
                    this.red = i4;
                    rect.set(this.f2927d);
                    matrix.set(this.f2928f);
                }
                return AbstractC3003i.alpha(new V0.i() { // from class: androidx.camera.core.ae
                    @Override // V0.i
                    public final Object black(final V0.h hVar) {
                        final ag agVar = ag.this;
                        final ar arVar3 = arVar;
                        final Matrix matrix2 = matrix;
                        final Rect rect2 = rect;
                        final a4.u uVar2 = uVar;
                        final ar arVar4 = arVar2;
                        executor.execute(new Runnable() { // from class: androidx.camera.core.af
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5;
                                ag agVar2 = ag.this;
                                ar arVar5 = arVar3;
                                Matrix matrix3 = matrix2;
                                ar arVar6 = arVar4;
                                Rect rect3 = rect2;
                                a4.u uVar3 = uVar2;
                                V0.h hVar2 = hVar;
                                if (agVar2.f2934l) {
                                    V alpha = arVar5.red().alpha();
                                    long timestamp = arVar5.red().getTimestamp();
                                    if (agVar2.teal) {
                                        i5 = 0;
                                    } else {
                                        i5 = agVar2.purple;
                                    }
                                    D d4 = new D(arVar6, null, new C0498e(alpha, timestamp, i5, matrix3));
                                    if (!rect3.isEmpty()) {
                                        Rect rect4 = new Rect(rect3);
                                        if (!rect4.intersect(0, 0, d4.white, d4.yellow)) {
                                            rect4.setEmpty();
                                        }
                                        synchronized (d4.silver) {
                                        }
                                    }
                                    uVar3.alpha(d4);
                                    hVar2.bravo(null);
                                    return;
                                }
                                hVar2.delta(new OperationCanceledException("ImageAnalysis is detached"));
                            }
                        });
                        return "analyzeImage";
                    }
                });
            }
            ajVar = null;
            if (ajVar == null) {
            }
            if (!z10) {
            }
            final Rect rect2 = new Rect();
            final Matrix matrix2 = new Matrix();
            synchronized (this.f2933k) {
            }
        } else {
            return new be.j(1, new OperationCanceledException("No analyzer or executor currently set."));
        }
    }

    public abstract void delta();

    public final void echo(ar arVar) {
        if (this.silver == 1) {
            if (this.f2930h == null) {
                this.f2930h = ByteBuffer.allocateDirect(arVar.alpha() * arVar.bravo());
            }
            this.f2930h.position(0);
            if (this.f2931i == null) {
                this.f2931i = ByteBuffer.allocateDirect((arVar.alpha() * arVar.bravo()) / 4);
            }
            this.f2931i.position(0);
            if (this.f2932j == null) {
                this.f2932j = ByteBuffer.allocateDirect((arVar.alpha() * arVar.bravo()) / 4);
            }
            this.f2932j.position(0);
            return;
        }
        if (this.silver == 2 && this.f2929g == null) {
            this.f2929g = ByteBuffer.allocateDirect(arVar.alpha() * arVar.bravo() * 4);
        }
    }

    public abstract void foxtrot(ar arVar);

    public final void golf(int i4, int i5, int i10, int i11) {
        int i12 = this.purple;
        Matrix matrix = new Matrix();
        if (i12 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i4, i5);
            RectF rectF2 = bc.f.alpha;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i12);
            RectF rectF3 = new RectF(0.0f, 0.0f, i10, i11);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f2926c);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f2927d = rect;
        this.f2928f.setConcat(this.e, matrix);
    }

    public final void hotel(ar arVar, int i4) {
        boolean z2;
        int i5;
        S2.l lVar = this.f2924a;
        if (lVar != null) {
            lVar.kilo();
            int bravo = arVar.bravo();
            int alpha = arVar.alpha();
            int golf = this.f2924a.golf();
            int uniform = this.f2924a.uniform();
            if (i4 != 90 && i4 != 270) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i5 = alpha;
            } else {
                i5 = bravo;
            }
            if (!z2) {
                bravo = alpha;
            }
            this.f2924a = new S2.l(AbstractC3061t3.bravo(i5, bravo, golf, uniform));
            if (this.silver == 1) {
                ImageWriter imageWriter = this.f2925b;
                if (imageWriter != null) {
                    imageWriter.close();
                }
                this.f2925b = ImageWriter.newInstance(this.f2924a.romeo(), this.f2924a.uniform());
            }
        }
    }

    public final void india(Executor executor, a4.u uVar) {
        synchronized (this.f2933k) {
            this.alpha = uVar;
            this.yellow = executor;
        }
    }
}
