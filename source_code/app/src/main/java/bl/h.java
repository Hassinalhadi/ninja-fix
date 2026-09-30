package bl;

import android.opengl.GLES20;
import androidx.camera.core.t;
import java.nio.Buffer;
import java.util.Locale;
import s6.T7;

/* loaded from: classes3.dex */
public final class h extends g {
    public final int echo;
    public final int foxtrot;
    public final int golf;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(t tVar, d dVar) {
        super(r3, r4);
        String str;
        String str2 = tVar.alpha() ? i.delta : i.charlie;
        try {
            switch (dVar.alpha) {
                case 0:
                    Locale locale = Locale.US;
                    str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
                    break;
                case 1:
                    Locale locale2 = Locale.US;
                    str = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
                    break;
                default:
                    Locale locale3 = Locale.US;
                    str = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
                    break;
            }
            if (str.contains("vTextureCoord") && str.contains("sTexture")) {
                this.echo = -1;
                this.foxtrot = -1;
                this.golf = -1;
                alpha();
                int i4 = this.alpha;
                int glGetUniformLocation = GLES20.glGetUniformLocation(i4, "sTexture");
                this.echo = glGetUniformLocation;
                i.echo(glGetUniformLocation, "sTexture");
                int glGetAttribLocation = GLES20.glGetAttribLocation(i4, "aTextureCoord");
                this.golf = glGetAttribLocation;
                i.echo(glGetAttribLocation, "aTextureCoord");
                int glGetUniformLocation2 = GLES20.glGetUniformLocation(i4, "uTexMatrix");
                this.foxtrot = glGetUniformLocation2;
                i.echo(glGetUniformLocation2, "uTexMatrix");
                return;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
        }
    }

    @Override // bl.g
    public final void bravo() {
        super.bravo();
        GLES20.glUniform1i(this.echo, 0);
        GLES20.glEnableVertexAttribArray(this.golf);
        i.bravo("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.golf, 2, 5126, false, 0, (Buffer) i.india);
        i.bravo("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(t tVar, f fVar) {
        this(tVar, r5);
        d dVar;
        if (tVar.alpha()) {
            T7.bravo("No default sampler shader available for" + fVar, fVar != f.alpha);
            if (fVar == f.red) {
                dVar = i.golf;
            } else {
                dVar = i.foxtrot;
            }
        } else {
            dVar = i.echo;
        }
    }
}
