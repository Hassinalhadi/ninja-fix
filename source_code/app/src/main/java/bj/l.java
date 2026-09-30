package bj;

import a4.u;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0499f;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.lifecycle.RunnableC0643m;
import bd.ScheduledExecutorServiceC0750c;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import r1.InterfaceC2482a;
import s6.T7;
import t6.AbstractC3003i;
import t6.AbstractC3066u3;
import t6.b4;

/* loaded from: classes3.dex */
public final class l implements AutoCloseable, Closeable {

    /* renamed from: c, reason: collision with root package name */
    public final V0.k f3392c;

    /* renamed from: d, reason: collision with root package name */
    public V0.h f3393d;
    public final Surface purple;
    public final int red;
    public final Size silver;
    public final float[] teal;
    public InterfaceC2482a white;
    public ScheduledExecutorServiceC0750c yellow;
    public final Object alpha = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3390a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3391b = false;

    public l(Surface surface, int i4, Size size, C0499f c0499f, C0499f c0499f2) {
        float[] fArr = new float[16];
        this.teal = fArr;
        this.purple = surface;
        this.red = i4;
        this.silver = size;
        charlie(fArr, new float[16], c0499f);
        charlie(new float[16], new float[16], c0499f2);
        this.f3392c = AbstractC3003i.alpha(new u(10, this));
    }

    public static void charlie(float[] fArr, float[] fArr2, C0499f c0499f) {
        Matrix.setIdentityM(fArr, 0);
        if (c0499f == null) {
            return;
        }
        b4.bravo(fArr);
        int i4 = c0499f.delta;
        b4.alpha(fArr, i4);
        boolean z2 = c0499f.echo;
        if (z2) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size echo = bc.f.echo(c0499f.alpha, i4);
        float f5 = 0;
        android.graphics.Matrix alpha = bc.f.alpha(new RectF(f5, f5, r6.getWidth(), r6.getHeight()), new RectF(f5, f5, echo.getWidth(), echo.getHeight()), i4, z2);
        RectF rectF = new RectF(c0499f.bravo);
        alpha.mapRect(rectF);
        float width = rectF.left / echo.getWidth();
        float height = ((echo.getHeight() - rectF.height()) - rectF.top) / echo.getHeight();
        float width2 = rectF.width() / echo.getWidth();
        float height2 = rectF.height() / echo.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, width2, height2, 1.0f);
        Matrix.setIdentityM(fArr2, 0);
        b4.bravo(fArr2);
        InterfaceC0525x interfaceC0525x = c0499f.charlie;
        if (interfaceC0525x != null) {
            T7.golf("Camera has no transform.", interfaceC0525x.mike());
            b4.alpha(fArr2, interfaceC0525x.alpha().alpha());
            if (interfaceC0525x.bravo()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        synchronized (this.alpha) {
            try {
                if (!this.f3391b) {
                    this.f3391b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3393d.bravo(null);
    }

    public final Surface echo(ScheduledExecutorServiceC0750c scheduledExecutorServiceC0750c, InterfaceC2482a interfaceC2482a) {
        boolean z2;
        synchronized (this.alpha) {
            this.yellow = scheduledExecutorServiceC0750c;
            this.white = interfaceC2482a;
            z2 = this.f3390a;
        }
        if (z2) {
            foxtrot();
        }
        return this.purple;
    }

    public final void foxtrot() {
        ScheduledExecutorServiceC0750c scheduledExecutorServiceC0750c;
        InterfaceC2482a interfaceC2482a;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.alpha) {
            try {
                if (this.yellow != null && (interfaceC2482a = this.white) != null) {
                    if (!this.f3391b) {
                        atomicReference.set(interfaceC2482a);
                        scheduledExecutorServiceC0750c = this.yellow;
                        this.f3390a = false;
                    }
                    scheduledExecutorServiceC0750c = null;
                }
                this.f3390a = true;
                scheduledExecutorServiceC0750c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (scheduledExecutorServiceC0750c != null) {
            try {
                scheduledExecutorServiceC0750c.execute(new RunnableC0643m(10, this, atomicReference));
            } catch (RejectedExecutionException e) {
                String hotel = AbstractC3066u3.hotel("SurfaceOutputImpl");
                if (AbstractC3066u3.foxtrot(3, hotel)) {
                    Log.d(hotel, "Processor executor closed. Close request not posted.", e);
                }
            }
        }
    }
}
