package bl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.t;
import ao.ad;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s6.T7;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public abstract class i {
    public static final int[] alpha = {12344};
    public static final int[] bravo = {12445, 13632, 12344};
    public static final String charlie;
    public static final String delta;
    public static final d echo;
    public static final d foxtrot;
    public static final d golf;
    public static final FloatBuffer hotel;
    public static final FloatBuffer india;
    public static final c juliet;

    static {
        Locale locale = Locale.US;
        charlie = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        delta = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        echo = new d(0);
        foxtrot = new d(1);
        golf = new d(2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        hotel = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        india = asFloatBuffer2;
        juliet = new c(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void alpha(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        StringBuilder beige = ad.beige(str, ": EGL error: 0x");
        beige.append(Integer.toHexString(eglGetError));
        throw new IllegalStateException(beige.toString());
    }

    public static void bravo(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        StringBuilder beige = ad.beige(str, ": GL error 0x");
        beige.append(Integer.toHexString(glGetError));
        throw new IllegalStateException(beige.toString());
    }

    public static void charlie(Thread thread) {
        boolean z2;
        if (thread == Thread.currentThread()) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.golf("Method call must be called on the GL thread.", z2);
    }

    public static void delta(AtomicBoolean atomicBoolean, boolean z2) {
        boolean z10;
        String str;
        if (z2 == atomicBoolean.get()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z2) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        T7.golf(str, z10);
    }

    public static void echo(int i4, String str) {
        if (i4 >= 0) {
        } else {
            throw new IllegalStateException(ad.gray("Unable to locate '", str, "' in program"));
        }
    }

    public static int[] foxtrot(String str, t tVar) {
        int[] iArr = alpha;
        if (tVar.alpha == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return bravo;
            }
            AbstractC3066u3.india("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static HashMap golf(t tVar) {
        Object hVar;
        f fVar;
        boolean z2;
        Map map = Collections.EMPTY_MAP;
        HashMap hashMap = new HashMap();
        for (f fVar2 : f.values()) {
            d dVar = (d) map.get(fVar2);
            if (dVar != null) {
                hVar = new h(tVar, dVar);
            } else if (fVar2 != f.red && fVar2 != (fVar = f.purple)) {
                if (fVar2 == f.alpha) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                T7.golf("Unhandled input format: " + fVar2, z2);
                if (tVar.alpha()) {
                    hVar = new g("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    d dVar2 = (d) map.get(fVar);
                    if (dVar2 != null) {
                        hVar = new h(tVar, dVar2);
                    } else {
                        hVar = new h(tVar, fVar);
                    }
                }
            } else {
                hVar = new h(tVar, fVar2);
            }
            Log.d("GLUtils", "Shader program for input format " + fVar2 + " created: " + hVar);
            hashMap.put(fVar2, hVar);
        }
        return hashMap;
    }

    public static int hotel() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        bravo("glGenTextures");
        int i4 = iArr[0];
        GLES20.glBindTexture(36197, i4);
        bravo("glBindTexture " + i4);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        bravo("glTexParameter");
        return i4;
    }

    public static EGLSurface india(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        alpha("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static String juliet() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            return ad.amber(group, ".", group2);
        }
        return "0.0";
    }

    public static int kilo(int i4, String str) {
        int glCreateShader = GLES20.glCreateShader(i4);
        bravo("glCreateShader type=" + i4);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        AbstractC3066u3.india("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        StringBuilder sierra = Q0.c.sierra(i4, "Could not compile shader type ", ":");
        sierra.append(GLES20.glGetShaderInfoLog(glCreateShader));
        throw new IllegalStateException(sierra.toString());
    }
}
