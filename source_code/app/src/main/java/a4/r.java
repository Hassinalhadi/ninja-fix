package a4;

import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.canhub.cropper.CropOverlayView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends Animation implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f2617a;
    public final ImageView alpha;
    public final CropOverlayView purple;
    public final float[] red;
    public final float[] silver;
    public final RectF teal;
    public final RectF white;
    public final float[] yellow;

    public r(ImageView imageView, CropOverlayView cropOverlayView) {
        Intrinsics.echo(imageView, "imageView");
        Intrinsics.echo(cropOverlayView, "cropOverlayView");
        this.alpha = imageView;
        this.purple = cropOverlayView;
        this.red = new float[8];
        this.silver = new float[8];
        this.teal = new RectF();
        this.white = new RectF();
        this.yellow = new float[9];
        this.f2617a = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f5, Transformation t5) {
        Intrinsics.echo(t5, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.teal;
        float f10 = rectF2.left;
        RectF rectF3 = this.white;
        rectF.left = Q0.c.lima(rectF3.left, f10, f5, f10);
        float f11 = rectF2.top;
        rectF.top = Q0.c.lima(rectF3.top, f11, f5, f11);
        float f12 = rectF2.right;
        rectF.right = Q0.c.lima(rectF3.right, f12, f5, f12);
        float f13 = rectF2.bottom;
        rectF.bottom = Q0.c.lima(rectF3.bottom, f13, f5, f13);
        float[] fArr = new float[8];
        for (int i4 = 0; i4 < 8; i4++) {
            float f14 = this.red[i4];
            fArr[i4] = Q0.c.lima(this.silver[i4], f14, f5, f14);
        }
        CropOverlayView cropOverlayView = this.purple;
        cropOverlayView.setCropWindowRect(rectF);
        ImageView imageView = this.alpha;
        cropOverlayView.hotel(imageView.getWidth(), imageView.getHeight(), fArr);
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i5 = 0; i5 < 9; i5++) {
            float f15 = this.yellow[i5];
            fArr2[i5] = Q0.c.lima(this.f2617a[i5], f15, f5, f15);
        }
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.echo(animation, "animation");
        this.alpha.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.echo(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.echo(animation, "animation");
    }
}
