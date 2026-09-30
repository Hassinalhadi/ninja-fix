package bk;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.at;
import androidx.camera.core.t;
import bj.l;
import bl.g;
import bl.h;
import bl.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2;
import s6.T7;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class c extends bj.e {

    /* renamed from: g, reason: collision with root package name */
    public int f3394g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f3395h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final at f3396i;

    /* renamed from: j, reason: collision with root package name */
    public final at f3397j;

    public c(at atVar, at atVar2) {
        this.f3396i = atVar;
        this.f3397j = atVar2;
    }

    @Override // bj.e
    public final bl.a juliet(t tVar) {
        Map map = Collections.EMPTY_MAP;
        bl.a juliet = super.juliet(tVar);
        this.f3394g = i.hotel();
        this.f3395h = i.hotel();
        return juliet;
    }

    public final void romeo(long j5, Surface surface, l lVar, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        i.delta((AtomicBoolean) this.red, true);
        i.charlie((Thread) this.teal);
        HashMap hashMap = (HashMap) this.silver;
        T7.golf("The surface is not registered.", hashMap.containsKey(surface));
        bl.c cVar = (bl.c) hashMap.get(surface);
        Objects.requireNonNull(cVar);
        if (cVar == i.juliet) {
            cVar = charlie(surface);
            if (cVar != null) {
                hashMap.put(surface, cVar);
            } else {
                return;
            }
        }
        bl.c cVar2 = cVar;
        Surface surface2 = (Surface) this.f3387c;
        EGLSurface eGLSurface = cVar2.alpha;
        if (surface != surface2) {
            lima(eGLSurface);
            this.f3387c = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        sierra(cVar2, lVar, surfaceTexture, this.f3396i, this.f3394g);
        sierra(cVar2, lVar, surfaceTexture2, this.f3397j, this.f3395h);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.white, eGLSurface, j5);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.white, eGLSurface)) {
            AbstractC3066u3.india("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            oscar(surface, false);
        }
    }

    public final void sierra(bl.c cVar, l lVar, SurfaceTexture surfaceTexture, at atVar, int i4) {
        quebec(i4);
        int i5 = cVar.bravo;
        int i10 = cVar.charlie;
        GLES20.glViewport(0, 0, i5, i10);
        GLES20.glScissor(0, 0, i5, i10);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, lVar.teal, 0);
        g gVar = (g) this.e;
        gVar.getClass();
        if (gVar instanceof h) {
            GLES20.glUniformMatrix4fv(((h) gVar).foxtrot, 1, false, fArr2, 0);
            i.bravo("glUniformMatrix4fv");
        }
        atVar.getClass();
        Size size = new Size((int) (i5 * 1.0f), (int) (i10 * 1.0f));
        Size size2 = new Size(i5, i10);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArr4, 0, 0.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(gVar.bravo, 1, false, fArr5, 0);
        i.bravo("glUniformMatrix4fv");
        GLES20.glUniform1f(gVar.charlie, 1.0f);
        i.bravo("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        i.bravo("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
