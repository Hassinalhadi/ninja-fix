package ja.burhanrashid52.photoeditor;

import Ef.d;
import Nd.c;
import Nd.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.effect.Effect;
import android.media.effect.EffectContext;
import android.media.effect.EffectFactory;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import java.util.Map;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.J6;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b#\u0010(J\u0013\u0010+\u001a\u00020\u000fH\u0080@ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, d2 = {"Lja/burhanrashid52/photoeditor/ImageFilterView;", "Landroid/opengl/GLSurfaceView;", "Landroid/opengl/GLSurfaceView$Renderer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "loadTextures", "()V", "initEffect", "applyEffect", "renderResult", "Landroid/graphics/Bitmap;", "sourceBitmap", "setSourceBitmap$photoeditor_release", "(Landroid/graphics/Bitmap;)V", "setSourceBitmap", "Ljavax/microedition/khronos/opengles/GL10;", "gl", "Ljavax/microedition/khronos/egl/EGLConfig;", Constants.KEY_CONFIG, "onSurfaceCreated", "(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V", "", "width", "height", "onSurfaceChanged", "(Ljavax/microedition/khronos/opengles/GL10;II)V", "onDrawFrame", "(Ljavax/microedition/khronos/opengles/GL10;)V", "Lja/burhanrashid52/photoeditor/PhotoFilter;", "effect", "setFilterEffect$photoeditor_release", "(Lja/burhanrashid52/photoeditor/PhotoFilter;)V", "setFilterEffect", "Lja/burhanrashid52/photoeditor/CustomEffect;", "customEffect", "(Lja/burhanrashid52/photoeditor/CustomEffect;)V", "saveBitmap$photoeditor_release", "(LNd/c;)Ljava/lang/Object;", "saveBitmap", "", "mTextures", "[I", "Landroid/media/effect/EffectContext;", "mEffectContext", "Landroid/media/effect/EffectContext;", "Landroid/media/effect/Effect;", "mEffect", "Landroid/media/effect/Effect;", "Lja/burhanrashid52/photoeditor/TextureRenderer;", "mTexRenderer", "Lja/burhanrashid52/photoeditor/TextureRenderer;", "mImageWidth", "I", "mImageHeight", "", "mInitialized", "Z", "mCurrentEffect", "Lja/burhanrashid52/photoeditor/PhotoFilter;", "mSourceBitmap", "Landroid/graphics/Bitmap;", "mCustomEffect", "Lja/burhanrashid52/photoeditor/CustomEffect;", "LNd/c;", "bitmapReadyContinuation", "LNd/c;", "LEf/a;", "mutex", "LEf/a;", "Companion", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageFilterView extends GLSurfaceView implements GLSurfaceView.Renderer {

    @NotNull
    private static final String TAG = "ImageFilterView";

    @Nullable
    private c<? super Bitmap> bitmapReadyContinuation;

    @NotNull
    private PhotoFilter mCurrentEffect;

    @Nullable
    private CustomEffect mCustomEffect;

    @Nullable
    private Effect mEffect;

    @Nullable
    private EffectContext mEffectContext;
    private int mImageHeight;
    private int mImageWidth;
    private boolean mInitialized;

    @Nullable
    private Bitmap mSourceBitmap;

    @NotNull
    private final TextureRenderer mTexRenderer;

    @NotNull
    private final int[] mTextures;

    @NotNull
    private final Ef.a mutex;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhotoFilter.values().length];
            try {
                iArr[PhotoFilter.AUTO_FIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhotoFilter.BLACK_WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhotoFilter.BRIGHTNESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PhotoFilter.CONTRAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PhotoFilter.CROSS_PROCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PhotoFilter.DOCUMENTARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PhotoFilter.DUE_TONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PhotoFilter.FILL_LIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PhotoFilter.FISH_EYE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PhotoFilter.FLIP_HORIZONTAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PhotoFilter.FLIP_VERTICAL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PhotoFilter.GRAIN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PhotoFilter.GRAY_SCALE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PhotoFilter.LOMISH.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PhotoFilter.NEGATIVE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PhotoFilter.NONE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[PhotoFilter.POSTERIZE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[PhotoFilter.ROTATE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[PhotoFilter.SATURATE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[PhotoFilter.SEPIA.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[PhotoFilter.SHARPEN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[PhotoFilter.TEMPERATURE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[PhotoFilter.TINT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[PhotoFilter.VIGNETTE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageFilterView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.echo(context, "context");
    }

    private final void applyEffect() {
        Effect effect = this.mEffect;
        if (effect != null) {
            int[] iArr = this.mTextures;
            effect.apply(iArr[0], this.mImageWidth, this.mImageHeight, iArr[1]);
        }
    }

    private final void initEffect() {
        EffectFactory factory;
        EffectContext effectContext = this.mEffectContext;
        if (effectContext != null && (factory = effectContext.getFactory()) != null) {
            Effect effect = this.mEffect;
            if (effect != null) {
                effect.release();
            }
            CustomEffect customEffect = this.mCustomEffect;
            if (customEffect != null) {
                Intrinsics.checkNotNull(customEffect);
                this.mEffect = factory.createEffect(customEffect.getEffectName());
                CustomEffect customEffect2 = this.mCustomEffect;
                Intrinsics.checkNotNull(customEffect2);
                for (Map.Entry<String, Object> entry : customEffect2.getParameters().entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    Effect effect2 = this.mEffect;
                    if (effect2 != null) {
                        effect2.setParameter(key, value);
                    }
                }
                return;
            }
            switch (WhenMappings.$EnumSwitchMapping$0[this.mCurrentEffect.ordinal()]) {
                case 1:
                    Effect createEffect = factory.createEffect("android.media.effect.effects.AutoFixEffect");
                    this.mEffect = createEffect;
                    if (createEffect != null) {
                        createEffect.setParameter("scale", Float.valueOf(0.5f));
                        return;
                    }
                    return;
                case 2:
                    Effect createEffect2 = factory.createEffect("android.media.effect.effects.BlackWhiteEffect");
                    this.mEffect = createEffect2;
                    if (createEffect2 != null) {
                        createEffect2.setParameter("black", Float.valueOf(0.1f));
                    }
                    Effect effect3 = this.mEffect;
                    if (effect3 != null) {
                        effect3.setParameter("white", Float.valueOf(0.7f));
                        return;
                    }
                    return;
                case 3:
                    Effect createEffect3 = factory.createEffect("android.media.effect.effects.BrightnessEffect");
                    this.mEffect = createEffect3;
                    if (createEffect3 != null) {
                        createEffect3.setParameter("brightness", Float.valueOf(2.0f));
                        return;
                    }
                    return;
                case 4:
                    Effect createEffect4 = factory.createEffect("android.media.effect.effects.ContrastEffect");
                    this.mEffect = createEffect4;
                    if (createEffect4 != null) {
                        createEffect4.setParameter("contrast", Float.valueOf(1.4f));
                        return;
                    }
                    return;
                case 5:
                    this.mEffect = factory.createEffect("android.media.effect.effects.CrossProcessEffect");
                    return;
                case 6:
                    this.mEffect = factory.createEffect("android.media.effect.effects.DocumentaryEffect");
                    return;
                case 7:
                    Effect createEffect5 = factory.createEffect("android.media.effect.effects.DuotoneEffect");
                    this.mEffect = createEffect5;
                    if (createEffect5 != null) {
                        createEffect5.setParameter("first_color", -256);
                    }
                    Effect effect4 = this.mEffect;
                    if (effect4 != null) {
                        effect4.setParameter("second_color", -12303292);
                        return;
                    }
                    return;
                case 8:
                    Effect createEffect6 = factory.createEffect("android.media.effect.effects.FillLightEffect");
                    this.mEffect = createEffect6;
                    if (createEffect6 != null) {
                        createEffect6.setParameter("strength", Float.valueOf(0.8f));
                        return;
                    }
                    return;
                case 9:
                    Effect createEffect7 = factory.createEffect("android.media.effect.effects.FisheyeEffect");
                    this.mEffect = createEffect7;
                    if (createEffect7 != null) {
                        createEffect7.setParameter("scale", Float.valueOf(0.5f));
                        return;
                    }
                    return;
                case 10:
                    Effect createEffect8 = factory.createEffect("android.media.effect.effects.FlipEffect");
                    this.mEffect = createEffect8;
                    if (createEffect8 != null) {
                        createEffect8.setParameter("horizontal", Boolean.TRUE);
                        return;
                    }
                    return;
                case 11:
                    Effect createEffect9 = factory.createEffect("android.media.effect.effects.FlipEffect");
                    this.mEffect = createEffect9;
                    if (createEffect9 != null) {
                        createEffect9.setParameter("vertical", Boolean.TRUE);
                        return;
                    }
                    return;
                case 12:
                    Effect createEffect10 = factory.createEffect("android.media.effect.effects.GrainEffect");
                    this.mEffect = createEffect10;
                    if (createEffect10 != null) {
                        createEffect10.setParameter("strength", Float.valueOf(1.0f));
                        return;
                    }
                    return;
                case 13:
                    this.mEffect = factory.createEffect("android.media.effect.effects.GrayscaleEffect");
                    return;
                case 14:
                    this.mEffect = factory.createEffect("android.media.effect.effects.LomoishEffect");
                    return;
                case 15:
                    this.mEffect = factory.createEffect("android.media.effect.effects.NegativeEffect");
                    return;
                case 16:
                default:
                    return;
                case 17:
                    this.mEffect = factory.createEffect("android.media.effect.effects.PosterizeEffect");
                    return;
                case 18:
                    Effect createEffect11 = factory.createEffect("android.media.effect.effects.RotateEffect");
                    this.mEffect = createEffect11;
                    if (createEffect11 != null) {
                        createEffect11.setParameter("angle", 180);
                        return;
                    }
                    return;
                case 19:
                    Effect createEffect12 = factory.createEffect("android.media.effect.effects.SaturateEffect");
                    this.mEffect = createEffect12;
                    if (createEffect12 != null) {
                        createEffect12.setParameter("scale", Float.valueOf(0.5f));
                        return;
                    }
                    return;
                case 20:
                    this.mEffect = factory.createEffect("android.media.effect.effects.SepiaEffect");
                    return;
                case 21:
                    this.mEffect = factory.createEffect("android.media.effect.effects.SharpenEffect");
                    return;
                case 22:
                    Effect createEffect13 = factory.createEffect("android.media.effect.effects.ColorTemperatureEffect");
                    this.mEffect = createEffect13;
                    if (createEffect13 != null) {
                        createEffect13.setParameter("scale", Float.valueOf(0.9f));
                        return;
                    }
                    return;
                case 23:
                    Effect createEffect14 = factory.createEffect("android.media.effect.effects.TintEffect");
                    this.mEffect = createEffect14;
                    if (createEffect14 != null) {
                        createEffect14.setParameter("tint", -65281);
                        return;
                    }
                    return;
                case 24:
                    Effect createEffect15 = factory.createEffect("android.media.effect.effects.VignetteEffect");
                    this.mEffect = createEffect15;
                    if (createEffect15 != null) {
                        createEffect15.setParameter("scale", Float.valueOf(0.5f));
                        return;
                    }
                    return;
            }
        }
    }

    private final void loadTextures() {
        GLES20.glGenTextures(2, this.mTextures, 0);
        Bitmap bitmap = this.mSourceBitmap;
        if (bitmap != null) {
            this.mImageWidth = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.mImageHeight = height;
            this.mTexRenderer.updateTextureSize(this.mImageWidth, height);
            GLES20.glBindTexture(3553, this.mTextures[0]);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            GLToolbox.initTexParams();
        }
    }

    private final void renderResult() {
        if (this.mCurrentEffect == PhotoFilter.NONE && this.mCustomEffect == null) {
            this.mTexRenderer.renderTexture(this.mTextures[0]);
        } else {
            this.mTexRenderer.renderTexture(this.mTextures[1]);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(@NotNull GL10 gl) {
        Intrinsics.echo(gl, "gl");
        Bitmap bitmap = null;
        try {
            if (!this.mInitialized) {
                this.mEffectContext = EffectContext.createWithCurrentGlContext();
                this.mTexRenderer.init();
                loadTextures();
                this.mInitialized = true;
            }
            if (this.mCurrentEffect != PhotoFilter.NONE || this.mCustomEffect != null) {
                initEffect();
                applyEffect();
            }
            renderResult();
        } catch (Throwable th) {
            c<? super Bitmap> cVar = this.bitmapReadyContinuation;
            if (cVar != null) {
                this.bitmapReadyContinuation = null;
                Result.Companion companion = Result.INSTANCE;
                cVar.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(th)));
            } else {
                throw th;
            }
        }
        c<? super Bitmap> cVar2 = this.bitmapReadyContinuation;
        if (cVar2 != null) {
            this.bitmapReadyContinuation = null;
            try {
                bitmap = BitmapUtil.INSTANCE.createBitmapFromGLSurface(this, gl);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                cVar2.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(th2)));
            }
            if (bitmap != null) {
                cVar2.resumeWith(Result.m206constructorimpl(bitmap));
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(@NotNull GL10 gl, int width, int height) {
        Intrinsics.echo(gl, "gl");
        this.mTexRenderer.updateViewSize(width, height);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(@NotNull GL10 gl, @NotNull EGLConfig config) {
        Intrinsics.echo(gl, "gl");
        Intrinsics.echo(config, "config");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v4, types: [Ef.a] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveBitmap$photoeditor_release(@NotNull c<? super Bitmap> cVar) {
        ImageFilterView$saveBitmap$1 imageFilterView$saveBitmap$1;
        Od.a aVar;
        int i4;
        Ef.c cVar2;
        ImageFilterView imageFilterView;
        Ef.a aVar2;
        Throwable th;
        Object alpha;
        try {
            if (cVar instanceof ImageFilterView$saveBitmap$1) {
                imageFilterView$saveBitmap$1 = (ImageFilterView$saveBitmap$1) cVar;
                int i5 = imageFilterView$saveBitmap$1.label;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    imageFilterView$saveBitmap$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = imageFilterView$saveBitmap$1.result;
                    aVar = Od.a.alpha;
                    i4 = imageFilterView$saveBitmap$1.label;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                aVar2 = (Ef.a) imageFilterView$saveBitmap$1.L$1;
                                try {
                                    ResultKt.alpha(obj);
                                    Bitmap bitmap = (Bitmap) obj;
                                    ((Ef.c) aVar2).foxtrot(null);
                                    return bitmap;
                                } catch (Throwable th2) {
                                    th = th2;
                                    ((Ef.c) aVar2).foxtrot(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r22 = (Ef.a) imageFilterView$saveBitmap$1.L$1;
                        imageFilterView = (ImageFilterView) imageFilterView$saveBitmap$1.L$0;
                        ResultKt.alpha(obj);
                        cVar2 = r22;
                    } else {
                        ResultKt.alpha(obj);
                        Ef.a aVar3 = this.mutex;
                        imageFilterView$saveBitmap$1.L$0 = this;
                        imageFilterView$saveBitmap$1.L$1 = aVar3;
                        imageFilterView$saveBitmap$1.label = 1;
                        cVar2 = (Ef.c) aVar3;
                        if (cVar2.delta(imageFilterView$saveBitmap$1) != aVar) {
                            imageFilterView = this;
                        }
                        return aVar;
                    }
                    imageFilterView$saveBitmap$1.L$0 = imageFilterView;
                    imageFilterView$saveBitmap$1.L$1 = cVar2;
                    imageFilterView$saveBitmap$1.L$2 = imageFilterView$saveBitmap$1;
                    imageFilterView$saveBitmap$1.label = 2;
                    j jVar = new j(J6.delta(imageFilterView$saveBitmap$1));
                    imageFilterView.bitmapReadyContinuation = jVar;
                    imageFilterView.requestRender();
                    alpha = jVar.alpha();
                    if (alpha != aVar) {
                        aVar2 = cVar2;
                        obj = alpha;
                        Bitmap bitmap2 = (Bitmap) obj;
                        ((Ef.c) aVar2).foxtrot(null);
                        return bitmap2;
                    }
                    return aVar;
                }
            }
            imageFilterView$saveBitmap$1.L$0 = imageFilterView;
            imageFilterView$saveBitmap$1.L$1 = cVar2;
            imageFilterView$saveBitmap$1.L$2 = imageFilterView$saveBitmap$1;
            imageFilterView$saveBitmap$1.label = 2;
            j jVar2 = new j(J6.delta(imageFilterView$saveBitmap$1));
            imageFilterView.bitmapReadyContinuation = jVar2;
            imageFilterView.requestRender();
            alpha = jVar2.alpha();
            if (alpha != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            aVar2 = cVar2;
            th = th3;
            ((Ef.c) aVar2).foxtrot(null);
            throw th;
        }
        imageFilterView$saveBitmap$1 = new ImageFilterView$saveBitmap$1(this, cVar);
        Object obj2 = imageFilterView$saveBitmap$1.result;
        aVar = Od.a.alpha;
        i4 = imageFilterView$saveBitmap$1.label;
        if (i4 == 0) {
        }
    }

    public final void setFilterEffect$photoeditor_release(@NotNull PhotoFilter effect) {
        Intrinsics.echo(effect, "effect");
        this.mCurrentEffect = effect;
        this.mCustomEffect = null;
        requestRender();
    }

    public final void setSourceBitmap$photoeditor_release(@Nullable Bitmap sourceBitmap) {
        this.mSourceBitmap = sourceBitmap;
        this.mInitialized = false;
    }

    public /* synthetic */ ImageFilterView(Context context, AttributeSet attributeSet, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFilterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.echo(context, "context");
        this.mTextures = new int[2];
        this.mTexRenderer = new TextureRenderer();
        PhotoFilter photoFilter = PhotoFilter.NONE;
        this.mCurrentEffect = photoFilter;
        this.mutex = d.alpha();
        setEGLContextClientVersion(2);
        setRenderer(this);
        setRenderMode(0);
        setFilterEffect$photoeditor_release(photoFilter);
    }

    public final void setFilterEffect$photoeditor_release(@Nullable CustomEffect customEffect) {
        this.mCustomEffect = customEffect;
        requestRender();
    }
}
