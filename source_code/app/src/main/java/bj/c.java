package bj;

import A2.ao;
import A2.s;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.G;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.M;
import androidx.camera.core.impl.ai;
import androidx.camera.core.t;
import androidx.lifecycle.RunnableC0643m;
import bd.ScheduledExecutorServiceC0750c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;
import s6.T7;
import t6.AbstractC3003i;
import t6.AbstractC3066u3;
import t6.b4;

/* loaded from: classes3.dex */
public final class c implements m, SurfaceTexture.OnFrameAvailableListener {
    public final e alpha;
    public final HandlerThread bravo;
    public final ScheduledExecutorServiceC0750c charlie;
    public final Handler delta;
    public final AtomicBoolean echo;
    public final float[] foxtrot;
    public final float[] golf;
    public final LinkedHashMap hotel;
    public int india;
    public boolean juliet;
    public final ArrayList kilo;

    public c(t tVar) {
        Map map = Collections.EMPTY_MAP;
        this.echo = new AtomicBoolean(false);
        this.foxtrot = new float[16];
        this.golf = new float[16];
        this.hotel = new LinkedHashMap();
        this.india = 0;
        this.juliet = false;
        this.kilo = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.bravo = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.delta = handler;
        this.charlie = new ScheduledExecutorServiceC0750c(handler);
        this.alpha = new e();
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
        if (this.echo.getAndSet(true)) {
            return;
        }
        echo(new ai(13, this), new K5.a(3));
    }

    @Override // bj.m
    public final void bravo(l lVar) {
        if (this.echo.get()) {
            lVar.close();
            return;
        }
        RunnableC0643m runnableC0643m = new RunnableC0643m(8, this, lVar);
        Objects.requireNonNull(lVar);
        echo(runnableC0643m, new ai(12, lVar));
    }

    @Override // bj.m
    public final void charlie(M m4) {
        if (this.echo.get()) {
            m4.charlie();
        } else {
            echo(new RunnableC0643m(9, this, m4), new G(m4, 1));
        }
    }

    public final void delta() {
        if (this.juliet && this.india == 0) {
            LinkedHashMap linkedHashMap = this.hotel;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((l) it.next()).close();
            }
            Iterator it2 = this.kilo.iterator();
            if (!it2.hasNext()) {
                linkedHashMap.clear();
                e eVar = this.alpha;
                if (((AtomicBoolean) eVar.red).getAndSet(false)) {
                    bl.i.charlie((Thread) eVar.teal);
                    eVar.november();
                }
                this.bravo.quit();
                return;
            }
            ((a) it2.next()).getClass();
            new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
            throw null;
        }
    }

    public final void echo(Runnable runnable, Runnable runnable2) {
        try {
            this.charlie.execute(new s(this, runnable2, runnable, 18));
        } catch (RejectedExecutionException e) {
            AbstractC3066u3.juliet("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void foxtrot(Exception exc) {
        ArrayList arrayList = this.kilo;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else {
            ((a) it.next()).getClass();
            throw null;
        }
    }

    public final Bitmap golf(Size size, float[] fArr, int i4) {
        boolean z2;
        float[] fArr2 = (float[]) fArr.clone();
        b4.alpha(fArr2, i4);
        b4.bravo(fArr2);
        Size echo = bc.f.echo(size, i4);
        e eVar = this.alpha;
        eVar.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(echo.getHeight() * echo.getWidth() * 4);
        if (allocateDirect.capacity() == echo.getHeight() * echo.getWidth() * 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.bravo("ByteBuffer capacity is not equal to width * height * 4.", z2);
        T7.bravo("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] iArr = bl.i.alpha;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        bl.i.bravo("glGenTextures");
        int i5 = iArr2[0];
        GLES20.glActiveTexture(33985);
        bl.i.bravo("glActiveTexture");
        GLES20.glBindTexture(3553, i5);
        bl.i.bravo("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, echo.getWidth(), echo.getHeight(), 0, 6407, 5121, null);
        bl.i.bravo("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        bl.i.bravo("glGenFramebuffers");
        int i10 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i10);
        bl.i.bravo("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i5, 0);
        bl.i.bravo("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        bl.i.bravo("glActiveTexture");
        GLES20.glBindTexture(36197, eVar.alpha);
        bl.i.bravo("glBindTexture");
        eVar.f3387c = null;
        GLES20.glViewport(0, 0, echo.getWidth(), echo.getHeight());
        GLES20.glScissor(0, 0, echo.getWidth(), echo.getHeight());
        bl.g gVar = (bl.g) eVar.e;
        gVar.getClass();
        if (gVar instanceof bl.h) {
            GLES20.glUniformMatrix4fv(((bl.h) gVar).foxtrot, 1, false, fArr2, 0);
            bl.i.bravo("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        bl.i.bravo("glDrawArrays");
        GLES20.glReadPixels(0, 0, echo.getWidth(), echo.getHeight(), 6408, 5121, allocateDirect);
        bl.i.bravo("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i5}, 0);
        bl.i.bravo("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        bl.i.bravo("glDeleteFramebuffers");
        int i11 = eVar.alpha;
        GLES20.glActiveTexture(33984);
        bl.i.bravo("glActiveTexture");
        GLES20.glBindTexture(36197, i11);
        bl.i.bravo("glBindTexture");
        Bitmap createBitmap = Bitmap.createBitmap(echo.getWidth(), echo.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.charlie(createBitmap, allocateDirect, echo.getWidth() * 4);
        return createBitmap;
    }

    public final void hotel(Triple triple) {
        ArrayList arrayList = this.kilo;
        if (!arrayList.isEmpty()) {
            if (triple == null) {
                foxtrot(new Exception("Failed to snapshot: no JPEG Surface."));
                return;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    Iterator it = arrayList.iterator();
                    if (!it.hasNext()) {
                        byteArrayOutputStream.close();
                        return;
                    }
                    ((a) it.next()).getClass();
                    Bitmap golf = golf((Size) triple.getSecond(), (float[]) triple.getThird(), 0);
                    byteArrayOutputStream.reset();
                    golf.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Surface surface = (Surface) triple.getFirst();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.foxtrot(byteArray, surface);
                    throw null;
                } finally {
                }
            } catch (IOException e) {
                foxtrot(e);
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        boolean z2;
        if (!this.echo.get()) {
            surfaceTexture.updateTexImage();
            float[] fArr = this.foxtrot;
            surfaceTexture.getTransformMatrix(fArr);
            Triple triple = null;
            for (Map.Entry entry : this.hotel.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                l lVar = (l) entry.getKey();
                float[] fArr2 = lVar.teal;
                float[] fArr3 = this.golf;
                Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
                int i4 = lVar.red;
                if (i4 == 34) {
                    try {
                        this.alpha.papa(surfaceTexture.getTimestamp(), fArr3, surface);
                    } catch (RuntimeException e) {
                        AbstractC3066u3.delta("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                    }
                } else {
                    boolean z10 = true;
                    if (i4 == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    T7.golf("Unsupported format: " + i4, z2);
                    if (triple != null) {
                        z10 = false;
                    }
                    T7.golf("Only one JPEG output is supported.", z10);
                    triple = new Triple(surface, lVar.silver, (float[]) fArr3.clone());
                }
            }
            try {
                hotel(triple);
            } catch (RuntimeException e4) {
                foxtrot(e4);
            }
        }
    }
}
