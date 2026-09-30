package ja.burhanrashid52.photoeditor;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0010J\u0016\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lja/burhanrashid52/photoeditor/TextureRenderer;", "", "()V", "mPosCoordHandle", "", "mPosVertices", "Ljava/nio/FloatBuffer;", "mProgram", "mTexCoordHandle", "mTexHeight", "mTexSamplerHandle", "mTexVertices", "mTexWidth", "mViewHeight", "mViewWidth", "computeOutputVertices", "", "init", "renderTexture", "texId", "tearDown", "updateTextureSize", "texWidth", "texHeight", "updateViewSize", "viewWidth", "viewHeight", "Companion", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextureRenderer {
    private static final int FLOAT_SIZE_BYTES = 4;

    @NotNull
    private static final String FRAGMENT_SHADER = "precision mediump float;\nuniform sampler2D tex_sampler;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler, v_texcoord);\n}\n";

    @NotNull
    private static final String VERTEX_SHADER = "attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n";
    private int mPosCoordHandle;

    @Nullable
    private FloatBuffer mPosVertices;
    private int mProgram;
    private int mTexCoordHandle;
    private int mTexHeight;
    private int mTexSamplerHandle;

    @Nullable
    private FloatBuffer mTexVertices;
    private int mTexWidth;
    private int mViewHeight;
    private int mViewWidth;

    @NotNull
    private static final float[] TEX_VERTICES = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    @NotNull
    private static final float[] POS_VERTICES = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    private final void computeOutputVertices() {
        float f5;
        FloatBuffer put;
        float f10 = (this.mViewWidth / this.mViewHeight) / (this.mTexWidth / this.mTexHeight);
        float f11 = 1.0f;
        float f12 = -1.0f;
        if (f10 > 1.0f) {
            float f13 = (-1.0f) / f10;
            float f14 = 1.0f / f10;
            f10 = 1.0f;
            f11 = f14;
            f12 = f13;
            f5 = -1.0f;
        } else {
            f5 = -f10;
        }
        float[] fArr = {f12, f5, f11, f5, f12, f10, f11, f10};
        FloatBuffer floatBuffer = this.mPosVertices;
        if (floatBuffer != null && (put = floatBuffer.put(fArr)) != null) {
            put.position(0);
        }
    }

    public final void init() {
        FloatBuffer put;
        FloatBuffer put2;
        int createProgram = GLToolbox.createProgram(VERTEX_SHADER, FRAGMENT_SHADER);
        this.mProgram = createProgram;
        this.mTexSamplerHandle = GLES20.glGetUniformLocation(createProgram, "tex_sampler");
        this.mTexCoordHandle = GLES20.glGetAttribLocation(this.mProgram, "a_texcoord");
        this.mPosCoordHandle = GLES20.glGetAttribLocation(this.mProgram, "a_position");
        float[] fArr = TEX_VERTICES;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mTexVertices = asFloatBuffer;
        if (asFloatBuffer != null && (put2 = asFloatBuffer.put(fArr)) != null) {
            put2.position(0);
        }
        float[] fArr2 = POS_VERTICES;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mPosVertices = asFloatBuffer2;
        if (asFloatBuffer2 != null && (put = asFloatBuffer2.put(fArr2)) != null) {
            put.position(0);
        }
    }

    public final void renderTexture(int texId) {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glUseProgram(this.mProgram);
        GLToolbox.checkGlError("glUseProgram");
        GLES20.glViewport(0, 0, this.mViewWidth, this.mViewHeight);
        GLToolbox.checkGlError("glViewport");
        GLES20.glDisable(3042);
        GLES20.glVertexAttribPointer(this.mTexCoordHandle, 2, 5126, false, 0, (Buffer) this.mTexVertices);
        GLES20.glEnableVertexAttribArray(this.mTexCoordHandle);
        GLES20.glVertexAttribPointer(this.mPosCoordHandle, 2, 5126, false, 0, (Buffer) this.mPosVertices);
        GLES20.glEnableVertexAttribArray(this.mPosCoordHandle);
        GLToolbox.checkGlError("vertex attribute setup");
        GLES20.glActiveTexture(33984);
        GLToolbox.checkGlError("glActiveTexture");
        GLES20.glBindTexture(3553, texId);
        GLToolbox.checkGlError("glBindTexture");
        GLES20.glUniform1i(this.mTexSamplerHandle, 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void tearDown() {
        GLES20.glDeleteProgram(this.mProgram);
    }

    public final void updateTextureSize(int texWidth, int texHeight) {
        this.mTexWidth = texWidth;
        this.mTexHeight = texHeight;
        computeOutputVertices();
    }

    public final void updateViewSize(int viewWidth, int viewHeight) {
        this.mViewWidth = viewWidth;
        this.mViewHeight = viewHeight;
        computeOutputVertices();
    }
}
