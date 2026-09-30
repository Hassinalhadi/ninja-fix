package androidx.camera.view;

import Q6.a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.core.M;
import androidx.camera.core.P;
import androidx.camera.core.am;
import androidx.camera.core.aw;
import androidx.camera.core.ay;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.au;
import androidx.lifecycle.az;
import bp.d;
import bp.e;
import bp.f;
import bp.g;
import bp.h;
import bp.i;
import bp.j;
import bp.k;
import bp.m;
import bp.r;
import java.util.concurrent.atomic.AtomicReference;
import t6.AbstractC3066u3;
import t6.j4;
import u8.b;

/* loaded from: classes3.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2959f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final j f2960a;
    public f alpha;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0523v f2961b;

    /* renamed from: c, reason: collision with root package name */
    public final e f2962c;

    /* renamed from: d, reason: collision with root package name */
    public final a f2963d;
    public final androidx.core.widget.f e;
    public i purple;
    public final m red;
    public final d silver;
    public boolean teal;
    public final az white;
    public final AtomicReference yellow;

    /* JADX WARN: Type inference failed for: r10v10, types: [bp.m, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, bp.d] */
    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.alpha = f.PERFORMANCE;
        ?? obj = new Object();
        obj.hotel = g.FILL_CENTER;
        this.silver = obj;
        this.teal = true;
        this.white = new au(h.alpha);
        this.yellow = new AtomicReference();
        this.f2960a = new j(obj);
        this.f2962c = new e(this);
        this.f2963d = new a(1, this);
        this.e = new androidx.core.widget.f(13, this);
        j4.alpha();
        Resources.Theme theme = context.getTheme();
        int[] iArr = k.alpha;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        s1.au.mike(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(1, obj.hotel.alpha);
            for (g gVar : g.values()) {
                if (gVar.alpha == integer) {
                    setScaleType(gVar);
                    int integer2 = obtainStyledAttributes.getInteger(0, 0);
                    for (f fVar : f.values()) {
                        if (fVar.alpha == integer2) {
                            setImplementationMode(fVar);
                            obtainStyledAttributes.recycle();
                            new b(context, new S7.a(this));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            ?? view = new View(context, null, 0, 0);
                            view.setBackgroundColor(-1);
                            view.setAlpha(0.0f);
                            view.setElevation(Float.MAX_VALUE);
                            this.red = view;
                            view.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean bravo(M m4, f fVar) {
        boolean z2;
        boolean equals = m4.delta.oscar().foxtrot().equals("androidx.camera.camera2.legacy");
        if (br.a.alpha.delta(SurfaceViewStretchedQuirk.class) == null && br.a.alpha.delta(SurfaceViewNotCroppedByParentQuirk.class) == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (Build.VERSION.SDK_INT > 24 && !equals && !z2) {
            int ordinal = fVar.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal != 1) {
                throw new IllegalArgumentException("Invalid implementation mode: " + fVar);
            }
        }
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private am getScreenFlashInternal() {
        return this.red.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal != 0) {
            int i4 = 1;
            if (ordinal != 1) {
                i4 = 2;
                if (ordinal != 2) {
                    i4 = 3;
                    if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                        throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                    }
                }
            }
            return i4;
        }
        return 0;
    }

    private void setScreenFlashUiInfo(am amVar) {
        AbstractC3066u3.bravo("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public final void alpha() {
        Rect rect;
        Display display;
        InterfaceC0523v interfaceC0523v;
        j4.alpha();
        if (this.purple != null) {
            if (this.teal && (display = getDisplay()) != null && (interfaceC0523v = this.f2961b) != null) {
                int golf = interfaceC0523v.golf(display.getRotation());
                int rotation = display.getRotation();
                d dVar = this.silver;
                if (dVar.golf) {
                    dVar.charlie = golf;
                    dVar.echo = rotation;
                }
            }
            this.purple.foxtrot();
        }
        j jVar = this.f2960a;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        jVar.getClass();
        j4.alpha();
        synchronized (jVar) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = jVar.bravo) != null) {
                    jVar.alpha.alpha(size, layoutDirection, rect);
                }
            } finally {
            }
        }
    }

    public Bitmap getBitmap() {
        Bitmap bravo;
        j4.alpha();
        i iVar = this.purple;
        if (iVar == null || (bravo = iVar.bravo()) == null) {
            return null;
        }
        FrameLayout frameLayout = iVar.bravo;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        d dVar = iVar.charlie;
        if (!dVar.foxtrot()) {
            return bravo;
        }
        Matrix delta = dVar.delta();
        RectF echo = dVar.echo(size, layoutDirection);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bravo.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(delta);
        matrix.postScale(echo.width() / dVar.alpha.getWidth(), echo.height() / dVar.alpha.getHeight());
        matrix.postTranslate(echo.left, echo.top);
        canvas.drawBitmap(bravo, matrix, new Paint(7));
        return createBitmap;
    }

    public bp.a getController() {
        j4.alpha();
        return null;
    }

    public f getImplementationMode() {
        j4.alpha();
        return this.alpha;
    }

    public aw getMeteringPointFactory() {
        j4.alpha();
        return this.f2960a;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, bs.a] */
    public bs.a getOutputTransform() {
        Matrix matrix;
        d dVar = this.silver;
        j4.alpha();
        try {
            matrix = dVar.charlie(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect rect = dVar.bravo;
        if (matrix != null && rect != null) {
            RectF rectF = bc.f.alpha;
            RectF rectF2 = new RectF(rect);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(bc.f.alpha, rectF2, Matrix.ScaleToFit.FILL);
            matrix.preConcat(matrix2);
            if (this.purple instanceof r) {
                matrix.postConcat(getMatrix());
            } else if (!getMatrix().isIdentity()) {
                AbstractC3066u3.india("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
            }
            new Size(rect.width(), rect.height());
            return new Object();
        }
        AbstractC3066u3.bravo("PreviewView", "Transform info is not ready");
        return null;
    }

    public au getPreviewStreamState() {
        return this.white;
    }

    public g getScaleType() {
        j4.alpha();
        return this.silver.hotel;
    }

    public am getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        j4.alpha();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        d dVar = this.silver;
        if (!dVar.foxtrot()) {
            return null;
        }
        Matrix matrix = new Matrix(dVar.delta);
        matrix.postConcat(dVar.charlie(size, layoutDirection));
        return matrix;
    }

    public ay getSurfaceProvider() {
        j4.alpha();
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, androidx.camera.core.P] */
    public P getViewPort() {
        j4.alpha();
        if (getDisplay() == null) {
            return null;
        }
        getDisplay().getRotation();
        j4.alpha();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        return new Object();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f2962c, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f2963d);
        i iVar = this.purple;
        if (iVar != null) {
            iVar.charlie();
        }
        j4.alpha();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f2963d);
        i iVar = this.purple;
        if (iVar != null) {
            iVar.delta();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f2962c);
    }

    public void setController(bp.a aVar) {
        j4.alpha();
        j4.alpha();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(f fVar) {
        j4.alpha();
        this.alpha = fVar;
    }

    public void setScaleType(g gVar) {
        j4.alpha();
        this.silver.hotel = gVar;
        alpha();
        j4.alpha();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i4) {
        this.red.setBackgroundColor(i4);
    }

    public void setScreenFlashWindow(Window window) {
        j4.alpha();
        this.red.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
