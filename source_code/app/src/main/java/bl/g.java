package bl;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* loaded from: classes3.dex */
public abstract class g {
    public final int alpha;
    public int bravo = -1;
    public int charlie = -1;
    public int delta = -1;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, String str2) {
        int i4;
        int i5;
        int i10;
        try {
            i4 = i.kilo(35633, str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            e = e;
            i4 = -1;
            i5 = -1;
        }
        try {
            i5 = i.kilo(35632, str2);
            try {
                i10 = GLES20.glCreateProgram();
            } catch (IllegalArgumentException | IllegalStateException e4) {
                e = e4;
                i10 = -1;
            }
            try {
                i.bravo("glCreateProgram");
                GLES20.glAttachShader(i10, i4);
                i.bravo("glAttachShader");
                GLES20.glAttachShader(i10, i5);
                i.bravo("glAttachShader");
                GLES20.glLinkProgram(i10);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(i10, 35714, iArr, 0);
                if (iArr[0] == 1) {
                    this.alpha = i10;
                    alpha();
                } else {
                    throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(i10));
                }
            } catch (IllegalArgumentException e5) {
                e = e5;
                if (i4 != -1) {
                    GLES20.glDeleteShader(i4);
                }
                if (i5 != -1) {
                    GLES20.glDeleteShader(i5);
                }
                if (i10 != -1) {
                    GLES20.glDeleteProgram(i10);
                }
                throw e;
            } catch (IllegalStateException e10) {
                e = e10;
                if (i4 != -1) {
                }
                if (i5 != -1) {
                }
                if (i10 != -1) {
                }
                throw e;
            }
        } catch (IllegalArgumentException | IllegalStateException e11) {
            e = e11;
            i5 = -1;
            i10 = i5;
            if (i4 != -1) {
            }
            if (i5 != -1) {
            }
            if (i10 != -1) {
            }
            throw e;
        }
    }

    public final void alpha() {
        int i4 = this.alpha;
        int glGetAttribLocation = GLES20.glGetAttribLocation(i4, "aPosition");
        this.delta = glGetAttribLocation;
        i.echo(glGetAttribLocation, "aPosition");
        int glGetUniformLocation = GLES20.glGetUniformLocation(i4, "uTransMatrix");
        this.bravo = glGetUniformLocation;
        i.echo(glGetUniformLocation, "uTransMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i4, "uAlphaScale");
        this.charlie = glGetUniformLocation2;
        i.echo(glGetUniformLocation2, "uAlphaScale");
    }

    public void bravo() {
        GLES20.glUseProgram(this.alpha);
        i.bravo("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.delta);
        i.bravo("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.delta, 2, 5126, false, 0, (Buffer) i.hotel);
        i.bravo("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.bravo, 1, false, fArr, 0);
        i.bravo("glUniformMatrix4fv");
        GLES20.glUniform1f(this.charlie, 1.0f);
        i.bravo("glUniform1f");
    }
}
