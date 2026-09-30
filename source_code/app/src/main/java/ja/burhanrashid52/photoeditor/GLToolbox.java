package ja.burhanrashid52.photoeditor;

import android.opengl.GLES20;
import av.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¨\u0006\u000f"}, d2 = {"Lja/burhanrashid52/photoeditor/GLToolbox;", "", "()V", "checkGlError", "", "op", "", "createProgram", "", "vertexSource", "fragmentSource", "initTexParams", "loadShader", "shaderType", "source", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GLToolbox {

    @NotNull
    public static final GLToolbox INSTANCE = new GLToolbox();

    private GLToolbox() {
    }

    public static final void checkGlError(@NotNull String op) {
        Intrinsics.echo(op, "op");
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new RuntimeException(op + ": glError " + glGetError);
    }

    public static final int createProgram(@NotNull String vertexSource, @NotNull String fragmentSource) {
        int loadShader;
        Intrinsics.echo(vertexSource, "vertexSource");
        Intrinsics.echo(fragmentSource, "fragmentSource");
        GLToolbox gLToolbox = INSTANCE;
        int loadShader2 = gLToolbox.loadShader(35633, vertexSource);
        if (loadShader2 == 0 || (loadShader = gLToolbox.loadShader(35632, fragmentSource)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, loadShader2);
            checkGlError("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, loadShader);
            checkGlError("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
                GLES20.glDeleteProgram(glCreateProgram);
                throw new RuntimeException(q.echo("Could not link program: ", glGetProgramInfoLog));
            }
        }
        return glCreateProgram;
    }

    public static final void initTexParams() {
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    private final int loadShader(int shaderType, String source) {
        int glCreateShader = GLES20.glCreateShader(shaderType);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, source);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
                throw new RuntimeException("Could not compile shader " + shaderType + ':' + glGetShaderInfoLog);
            }
        }
        return glCreateShader;
    }
}
