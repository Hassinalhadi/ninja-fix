package com.canhub.cropper;

import a4.af;
import a4.ag;
import a4.ah;
import a4.ai;
import a4.ak;
import a4.l;
import a4.v;
import a4.x;
import a4.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import av.q;
import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x2.p;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0003U\bVB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0015¢\u0006\u0004\b*\u0010\u0018J\u0015\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u001d¢\u0006\u0004\b,\u0010 J\u0015\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u001d¢\u0006\u0004\b.\u0010 J\u0015\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102R(\u0010&\u001a\u0004\u0018\u00010%2\b\u00103\u001a\u0004\u0018\u00010%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u00103\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R(\u0010@\u001a\u0004\u0018\u00010\u00112\b\u00103\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u0010G\u001a\u00020A2\u0006\u0010B\u001a\u00020A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u00020!2\u0006\u0010H\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010$R$\u0010L\u001a\u00020!2\u0006\u0010L\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010J\"\u0004\bN\u0010$R(\u0010T\u001a\u0004\u0018\u00010O2\b\u0010B\u001a\u0004\u0018\u00010O8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006W"}, d2 = {"Lcom/canhub/cropper/CropOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "La4/af;", "listener", "", "setCropWindowChangeListener", "(La4/af;)V", "La4/x;", "cropShape", "setCropShape", "(La4/x;)V", "La4/v;", "cropCornerShape", "setCropCornerShape", "(La4/v;)V", "", "isEnabled", "setCropperTextLabelVisibility", "(Z)V", "", "textLabel", "setCropLabelText", "(Ljava/lang/String;)V", "", "textSize", "setCropLabelTextSize", "(F)V", "", "textColor", "setCropLabelTextColor", "(I)V", "La4/y;", "guidelines", "setGuidelines", "(La4/y;)V", "fixAspectRatio", "setFixedAspectRatio", "snapRadius", "setSnapRadius", "cornerRadius", "setCropCornerRadius", "Lcom/canhub/cropper/CropImageOptions;", "options", "setInitialAttributeValues", "(Lcom/canhub/cropper/CropImageOptions;)V", "<set-?>", Constants.INAPP_WINDOW, "La4/y;", "getGuidelines", "()La4/y;", "x", "La4/x;", "getCropShape", "()La4/x;", "y", "La4/v;", "getCornerShape", "()La4/v;", "cornerShape", "Landroid/graphics/RectF;", "rect", "getCropWindowRect", "()Landroid/graphics/RectF;", "setCropWindowRect", "(Landroid/graphics/RectF;)V", "cropWindowRect", "aspectRatioX", "getAspectRatioX", "()I", "setAspectRatioX", "aspectRatioY", "getAspectRatioY", "setAspectRatioY", "Landroid/graphics/Rect;", "getInitialCropWindowRect", "()Landroid/graphics/Rect;", "setInitialCropWindowRect", "(Landroid/graphics/Rect;)V", "initialCropWindowRect", "x2/p", "a4/ag", "cropper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class CropOverlayView extends View {
    public String A;
    public float B;
    public int C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f3697D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3698E;

    /* renamed from: F, reason: collision with root package name */
    public final float f3699F;

    /* renamed from: a, reason: collision with root package name */
    public af f3700a;
    public float alpha;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f3701b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f3702c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f3703d;
    public Paint e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f3704f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f3705g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f3706h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f3707i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f3708j;

    /* renamed from: k, reason: collision with root package name */
    public int f3709k;

    /* renamed from: l, reason: collision with root package name */
    public int f3710l;

    /* renamed from: m, reason: collision with root package name */
    public float f3711m;

    /* renamed from: n, reason: collision with root package name */
    public float f3712n;

    /* renamed from: o, reason: collision with root package name */
    public float f3713o;

    /* renamed from: p, reason: collision with root package name */
    public float f3714p;
    public Integer purple;

    /* renamed from: q, reason: collision with root package name */
    public float f3715q;

    /* renamed from: r, reason: collision with root package name */
    public ak f3716r;
    public CropImageOptions red;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3717s;
    public ScaleGestureDetector silver;

    /* renamed from: t, reason: collision with root package name */
    public int f3718t;
    public boolean teal;

    /* renamed from: u, reason: collision with root package name */
    public int f3719u;

    /* renamed from: v, reason: collision with root package name */
    public float f3720v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public y guidelines;
    public boolean white;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public x cropShape;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public v cornerShape;
    public final ai yellow;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3724z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.echo(context, "context");
        this.white = true;
        this.yellow = new ai();
        this.f3701b = new RectF();
        this.f3706h = new Path();
        this.f3707i = new float[8];
        this.f3708j = new RectF();
        this.f3720v = this.f3718t / this.f3719u;
        this.A = "";
        this.B = 20.0f;
        this.C = -1;
        this.f3697D = new Rect();
        this.f3699F = TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics());
    }

    public final boolean alpha(RectF rectF) {
        boolean z2;
        float f5;
        float f10;
        float f11;
        float f12;
        Rect rect = l.alpha;
        float[] fArr = this.f3707i;
        float quebec = l.quebec(fArr);
        float sierra = l.sierra(fArr);
        float romeo = l.romeo(fArr);
        float lima = l.lima(fArr);
        if (fArr[0] == fArr[6] || fArr[1] == fArr[7]) {
            z2 = false;
        } else {
            z2 = true;
        }
        RectF rectF2 = this.f3708j;
        if (!z2) {
            rectF2.set(quebec, sierra, romeo, lima);
            return false;
        }
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = fArr[6];
        float f18 = fArr[7];
        if (f18 < f14) {
            f10 = fArr[3];
            if (f14 < f10) {
                float f19 = fArr[2];
                f5 = f17;
                f14 = f16;
                f17 = f19;
                f16 = f18;
                f13 = f15;
            } else {
                f10 = f14;
                f14 = f10;
                f17 = f13;
                f13 = fArr[2];
                f5 = f15;
            }
        } else {
            float f20 = fArr[3];
            if (f14 > f20) {
                f5 = fArr[2];
                f16 = f20;
                f10 = f18;
            } else {
                f5 = f13;
                f13 = f17;
                f17 = f15;
                f10 = f16;
                f16 = f14;
                f14 = f18;
            }
        }
        float f21 = (f14 - f16) / (f13 - f5);
        float f22 = (-1.0f) / f21;
        float f23 = f16 - (f21 * f5);
        float f24 = f16 - (f5 * f22);
        float f25 = f10 - (f21 * f17);
        float f26 = f10 - (f17 * f22);
        float centerY = rectF.centerY() - rectF.top;
        float centerX = rectF.centerX();
        float f27 = rectF.left;
        float f28 = centerY / (centerX - f27);
        float f29 = -f28;
        float f30 = rectF.top;
        float f31 = f30 - (f27 * f28);
        float f32 = rectF.right;
        float f33 = f30 - (f29 * f32);
        float f34 = f21 - f28;
        float f35 = (f31 - f23) / f34;
        if (f35 < f32) {
            f11 = f35;
        } else {
            f11 = quebec;
        }
        float max = Math.max(quebec, f11);
        float f36 = (f31 - f24) / (f22 - f28);
        if (f36 >= rectF.right) {
            f36 = max;
        }
        float max2 = Math.max(max, f36);
        float f37 = f22 - f29;
        float f38 = (f33 - f26) / f37;
        if (f38 >= rectF.right) {
            f38 = max2;
        }
        float max3 = Math.max(max2, f38);
        float f39 = (f33 - f24) / f37;
        if (f39 <= rectF.left) {
            f39 = romeo;
        }
        float min = Math.min(romeo, f39);
        float f40 = (f33 - f25) / (f21 - f29);
        if (f40 > rectF.left) {
            f12 = f40;
        } else {
            f12 = min;
        }
        float min2 = Math.min(min, f12);
        float f41 = (f31 - f25) / f34;
        if (f41 <= rectF.left) {
            f41 = min2;
        }
        float min3 = Math.min(min2, f41);
        float max4 = Math.max(sierra, Math.max((f21 * max3) + f23, (f22 * min3) + f24));
        float min4 = Math.min(lima, Math.min((f22 * max3) + f26, (f21 * min3) + f25));
        rectF2.left = max3;
        rectF2.top = max4;
        rectF2.right = min3;
        rectF2.bottom = min4;
        return true;
    }

    public final void bravo(Canvas canvas, RectF rectF, float f5, float f10) {
        int i4;
        x xVar = this.cropShape;
        int i5 = -1;
        if (xVar == null) {
            i4 = -1;
        } else {
            i4 = ah.$EnumSwitchMapping$0[xVar.ordinal()];
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        delta(canvas, rectF, f5, f10);
                        return;
                    }
                    throw new IllegalStateException("Unrecognized crop shape");
                }
                float f11 = rectF.left - f5;
                float centerY = rectF.centerY() - this.f3712n;
                float f12 = rectF.left - f5;
                float centerY2 = this.f3712n + rectF.centerY();
                Paint paint = this.f3703d;
                Intrinsics.checkNotNull(paint);
                canvas.drawLine(f11, centerY, f12, centerY2, paint);
                float f13 = rectF.right + f5;
                float centerY3 = rectF.centerY() - this.f3712n;
                float f14 = rectF.right + f5;
                float centerY4 = this.f3712n + rectF.centerY();
                Paint paint2 = this.f3703d;
                Intrinsics.checkNotNull(paint2);
                canvas.drawLine(f13, centerY3, f14, centerY4, paint2);
                return;
            }
            float centerX = rectF.centerX() - this.f3712n;
            float f15 = rectF.top - f5;
            float centerX2 = this.f3712n + rectF.centerX();
            float f16 = rectF.top - f5;
            Paint paint3 = this.f3703d;
            Intrinsics.checkNotNull(paint3);
            canvas.drawLine(centerX, f15, centerX2, f16, paint3);
            float centerX3 = rectF.centerX() - this.f3712n;
            float f17 = rectF.bottom + f5;
            float centerX4 = this.f3712n + rectF.centerX();
            float f18 = rectF.bottom + f5;
            Paint paint4 = this.f3703d;
            Intrinsics.checkNotNull(paint4);
            canvas.drawLine(centerX3, f17, centerX4, f18, paint4);
            return;
        }
        float f19 = this.alpha;
        v vVar = this.cornerShape;
        if (vVar != null) {
            i5 = ah.$EnumSwitchMapping$1[vVar.ordinal()];
        }
        if (i5 != 1) {
            if (i5 != 2) {
                return;
            }
            delta(canvas, rectF, f5, f10);
            return;
        }
        float f20 = rectF.left - f5;
        float f21 = rectF.top - f5;
        Paint paint5 = this.f3703d;
        Intrinsics.checkNotNull(paint5);
        canvas.drawCircle(f20, f21, f19, paint5);
        float f22 = rectF.right + f5;
        float f23 = rectF.top - f5;
        Paint paint6 = this.f3703d;
        Intrinsics.checkNotNull(paint6);
        canvas.drawCircle(f22, f23, f19, paint6);
        float f24 = rectF.left - f5;
        float f25 = rectF.bottom + f5;
        Paint paint7 = this.f3703d;
        Intrinsics.checkNotNull(paint7);
        canvas.drawCircle(f24, f25, f19, paint7);
        float f26 = rectF.right + f5;
        float f27 = rectF.bottom + f5;
        Paint paint8 = this.f3703d;
        Intrinsics.checkNotNull(paint8);
        canvas.drawCircle(f26, f27, f19, paint8);
    }

    public final void charlie(Canvas canvas) {
        float f5;
        int i4;
        if (this.e != null) {
            Paint paint = this.f3702c;
            if (paint != null) {
                Intrinsics.checkNotNull(paint);
                f5 = paint.getStrokeWidth();
            } else {
                f5 = 0.0f;
            }
            RectF foxtrot = this.yellow.foxtrot();
            foxtrot.inset(f5, f5);
            float f10 = 3;
            float width = foxtrot.width() / f10;
            float height = foxtrot.height() / f10;
            x xVar = this.cropShape;
            if (xVar == null) {
                i4 = -1;
            } else {
                i4 = ah.$EnumSwitchMapping$0[xVar.ordinal()];
            }
            if (i4 != 1 && i4 != 2 && i4 != 3) {
                if (i4 == 4) {
                    float f11 = 2;
                    float width2 = (foxtrot.width() / f11) - f5;
                    float height2 = (foxtrot.height() / f11) - f5;
                    float f12 = foxtrot.left + width;
                    float f13 = foxtrot.right - width;
                    float sin = (float) (Math.sin(Math.acos((width2 - width) / width2)) * height2);
                    float f14 = (foxtrot.top + height2) - sin;
                    float f15 = (foxtrot.bottom - height2) + sin;
                    Paint paint2 = this.e;
                    Intrinsics.checkNotNull(paint2);
                    canvas.drawLine(f12, f14, f12, f15, paint2);
                    float f16 = (foxtrot.top + height2) - sin;
                    float f17 = (foxtrot.bottom - height2) + sin;
                    Paint paint3 = this.e;
                    Intrinsics.checkNotNull(paint3);
                    canvas.drawLine(f13, f16, f13, f17, paint3);
                    float f18 = foxtrot.top + height;
                    float f19 = foxtrot.bottom - height;
                    float cos = (float) (Math.cos(Math.asin((height2 - height) / height2)) * width2);
                    float f20 = (foxtrot.left + width2) - cos;
                    float f21 = (foxtrot.right - width2) + cos;
                    Paint paint4 = this.e;
                    Intrinsics.checkNotNull(paint4);
                    canvas.drawLine(f20, f18, f21, f18, paint4);
                    float f22 = (foxtrot.left + width2) - cos;
                    float f23 = (foxtrot.right - width2) + cos;
                    Paint paint5 = this.e;
                    Intrinsics.checkNotNull(paint5);
                    canvas.drawLine(f22, f19, f23, f19, paint5);
                    return;
                }
                throw new IllegalStateException("Unrecognized crop shape");
            }
            float f24 = foxtrot.left + width;
            float f25 = foxtrot.right - width;
            float f26 = foxtrot.top;
            float f27 = foxtrot.bottom;
            Paint paint6 = this.e;
            Intrinsics.checkNotNull(paint6);
            canvas.drawLine(f24, f26, f24, f27, paint6);
            float f28 = foxtrot.top;
            float f29 = foxtrot.bottom;
            Paint paint7 = this.e;
            Intrinsics.checkNotNull(paint7);
            canvas.drawLine(f25, f28, f25, f29, paint7);
            float f30 = foxtrot.top + height;
            float f31 = foxtrot.bottom - height;
            float f32 = foxtrot.left;
            float f33 = foxtrot.right;
            Paint paint8 = this.e;
            Intrinsics.checkNotNull(paint8);
            canvas.drawLine(f32, f30, f33, f30, paint8);
            float f34 = foxtrot.left;
            float f35 = foxtrot.right;
            Paint paint9 = this.e;
            Intrinsics.checkNotNull(paint9);
            canvas.drawLine(f34, f31, f35, f31, paint9);
        }
    }

    public final void delta(Canvas canvas, RectF rectF, float f5, float f10) {
        float f11 = rectF.left - f5;
        float f12 = rectF.top;
        float f13 = f12 + this.f3712n;
        Paint paint = this.f3703d;
        Intrinsics.checkNotNull(paint);
        canvas.drawLine(f11, f12 - f10, f11, f13, paint);
        float f14 = rectF.left;
        float f15 = rectF.top - f5;
        float f16 = f14 + this.f3712n;
        Paint paint2 = this.f3703d;
        Intrinsics.checkNotNull(paint2);
        canvas.drawLine(f14 - f10, f15, f16, f15, paint2);
        float f17 = rectF.right + f5;
        float f18 = rectF.top;
        float f19 = f18 + this.f3712n;
        Paint paint3 = this.f3703d;
        Intrinsics.checkNotNull(paint3);
        canvas.drawLine(f17, f18 - f10, f17, f19, paint3);
        float f20 = rectF.right;
        float f21 = rectF.top - f5;
        float f22 = f20 - this.f3712n;
        Paint paint4 = this.f3703d;
        Intrinsics.checkNotNull(paint4);
        canvas.drawLine(f20 + f10, f21, f22, f21, paint4);
        float f23 = rectF.left - f5;
        float f24 = rectF.bottom;
        float f25 = f24 - this.f3712n;
        Paint paint5 = this.f3703d;
        Intrinsics.checkNotNull(paint5);
        canvas.drawLine(f23, f24 + f10, f23, f25, paint5);
        float f26 = rectF.left;
        float f27 = rectF.bottom + f5;
        float f28 = f26 + this.f3712n;
        Paint paint6 = this.f3703d;
        Intrinsics.checkNotNull(paint6);
        canvas.drawLine(f26 - f10, f27, f28, f27, paint6);
        float f29 = rectF.right + f5;
        float f30 = rectF.bottom;
        float f31 = f30 - this.f3712n;
        Paint paint7 = this.f3703d;
        Intrinsics.checkNotNull(paint7);
        canvas.drawLine(f29, f30 + f10, f29, f31, paint7);
        float f32 = rectF.right;
        float f33 = rectF.bottom + f5;
        float f34 = f32 - this.f3712n;
        Paint paint8 = this.f3703d;
        Intrinsics.checkNotNull(paint8);
        canvas.drawLine(f32 + f10, f33, f34, f33, paint8);
    }

    public final void echo(RectF rectF) {
        float width = rectF.width();
        ai aiVar = this.yellow;
        if (width < aiVar.echo()) {
            float echo = (aiVar.echo() - rectF.width()) / 2;
            rectF.left -= echo;
            rectF.right += echo;
        }
        if (rectF.height() < aiVar.delta()) {
            float delta = (aiVar.delta() - rectF.height()) / 2;
            rectF.top -= delta;
            rectF.bottom += delta;
        }
        if (rectF.width() > aiVar.charlie()) {
            float width2 = (rectF.width() - aiVar.charlie()) / 2;
            rectF.left += width2;
            rectF.right -= width2;
        }
        if (rectF.height() > aiVar.bravo()) {
            float height = (rectF.height() - aiVar.bravo()) / 2;
            rectF.top += height;
            rectF.bottom -= height;
        }
        alpha(rectF);
        RectF rectF2 = this.f3708j;
        if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
            float max = Math.max(rectF2.left, 0.0f);
            float max2 = Math.max(rectF2.top, 0.0f);
            float min = Math.min(rectF2.right, getWidth());
            float min2 = Math.min(rectF2.bottom, getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (this.f3717s && Math.abs(rectF.width() - (rectF.height() * this.f3720v)) > 0.1d) {
            if (rectF.width() > rectF.height() * this.f3720v) {
                float abs = Math.abs((rectF.height() * this.f3720v) - rectF.width()) / 2;
                rectF.left += abs;
                rectF.right -= abs;
            } else {
                float abs2 = Math.abs((rectF.width() / this.f3720v) - rectF.height()) / 2;
                rectF.top += abs2;
                rectF.bottom -= abs2;
            }
        }
    }

    public final void foxtrot() {
        Rect rect = l.alpha;
        float[] fArr = this.f3707i;
        float max = Math.max(l.quebec(fArr), 0.0f);
        float max2 = Math.max(l.sierra(fArr), 0.0f);
        float min = Math.min(l.romeo(fArr), getWidth());
        float min2 = Math.min(l.lima(fArr), getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.f3698E = true;
            float f5 = this.f3713o;
            float f10 = min - max;
            float f11 = f5 * f10;
            float f12 = min2 - max2;
            float f13 = f5 * f12;
            Rect rect2 = this.f3697D;
            int width = rect2.width();
            ai aiVar = this.yellow;
            if (width > 0 && rect2.height() > 0) {
                float f14 = (rect2.left / aiVar.kilo) + max;
                rectF.left = f14;
                rectF.top = (rect2.top / aiVar.lima) + max2;
                rectF.right = (rect2.width() / aiVar.kilo) + f14;
                rectF.bottom = (rect2.height() / aiVar.lima) + rectF.top;
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                rectF.bottom = Math.min(min2, rectF.bottom);
            } else if (this.f3717s && min > max && min2 > max2) {
                if (f10 / f12 > this.f3720v) {
                    rectF.top = max2 + f13;
                    rectF.bottom = min2 - f13;
                    float width2 = getWidth() / 2.0f;
                    this.f3720v = this.f3718t / this.f3719u;
                    float max3 = Math.max(aiVar.echo(), rectF.height() * this.f3720v) / 2.0f;
                    rectF.left = width2 - max3;
                    rectF.right = width2 + max3;
                } else {
                    rectF.left = max + f11;
                    rectF.right = min - f11;
                    float height = getHeight() / 2.0f;
                    float max4 = Math.max(aiVar.delta(), rectF.width() / this.f3720v) / 2.0f;
                    rectF.top = height - max4;
                    rectF.bottom = height + max4;
                }
            } else {
                rectF.left = max + f11;
                rectF.top = max2 + f13;
                rectF.right = min - f11;
                rectF.bottom = min2 - f13;
            }
            echo(rectF);
            aiVar.alpha.set(rectF);
        }
    }

    /* renamed from: getAspectRatioX, reason: from getter */
    public final int getF3718t() {
        return this.f3718t;
    }

    /* renamed from: getAspectRatioY, reason: from getter */
    public final int getF3719u() {
        return this.f3719u;
    }

    @Nullable
    public final v getCornerShape() {
        return this.cornerShape;
    }

    @Nullable
    public final x getCropShape() {
        return this.cropShape;
    }

    @NotNull
    public final RectF getCropWindowRect() {
        return this.yellow.foxtrot();
    }

    @Nullable
    public final y getGuidelines() {
        return this.guidelines;
    }

    @Nullable
    /* renamed from: getInitialCropWindowRect, reason: from getter */
    public final Rect getF3697D() {
        return this.f3697D;
    }

    public final void golf() {
        if (this.f3698E) {
            setCropWindowRect(l.bravo);
            foxtrot();
            invalidate();
        }
    }

    public final void hotel(int i4, int i5, float[] fArr) {
        float[] fArr2 = this.f3707i;
        if (fArr != null && Arrays.equals(fArr2, fArr)) {
            return;
        }
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        }
        this.f3709k = i4;
        this.f3710l = i5;
        RectF foxtrot = this.yellow.foxtrot();
        if (foxtrot.width() == 0.0f || foxtrot.height() == 0.0f) {
            foxtrot();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i4;
        int i5;
        int i10;
        Canvas canvas2;
        float f5;
        int i11;
        List systemGestureExclusionRects;
        Object rect;
        List systemGestureExclusionRects2;
        Object rect2;
        List systemGestureExclusionRects3;
        Object rect3;
        float f10;
        int i12;
        Paint paint;
        int i13;
        Intrinsics.echo(canvas, "canvas");
        super.onDraw(canvas);
        ai aiVar = this.yellow;
        RectF foxtrot = aiVar.foxtrot();
        Rect rect4 = l.alpha;
        float[] fArr = this.f3707i;
        float max = Math.max(l.quebec(fArr), 0.0f);
        float max2 = Math.max(l.sierra(fArr), 0.0f);
        float min = Math.min(l.romeo(fArr), getWidth());
        float min2 = Math.min(l.lima(fArr), getHeight());
        x xVar = this.cropShape;
        if (xVar == null) {
            i4 = -1;
        } else {
            i4 = ah.$EnumSwitchMapping$0[xVar.ordinal()];
        }
        Path path = this.f3706h;
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            i5 = 3;
            if (i4 == 4) {
                path.reset();
                RectF rectF = this.f3701b;
                i10 = 1;
                rectF.set(foxtrot.left, foxtrot.top, foxtrot.right, foxtrot.bottom);
                path.addOval(rectF, Path.Direction.CW);
                canvas.save();
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas.clipOutPath(path);
                } else {
                    canvas.clipPath(path, Region.Op.XOR);
                }
                Paint paint2 = this.f3704f;
                Intrinsics.checkNotNull(paint2);
                canvas.drawRect(max, max2, min, min2, paint2);
                canvas.restore();
                canvas2 = canvas;
            } else {
                throw new IllegalStateException("Unrecognized crop shape");
            }
        } else {
            i5 = 3;
            i10 = 1;
            if (fArr[0] == fArr[6] || fArr[1] == fArr[7]) {
                float f11 = foxtrot.top;
                Paint paint3 = this.f3704f;
                Intrinsics.checkNotNull(paint3);
                canvas2 = canvas;
                canvas2.drawRect(max, max2, min, f11, paint3);
                float f12 = foxtrot.bottom;
                Paint paint4 = this.f3704f;
                Intrinsics.checkNotNull(paint4);
                canvas2.drawRect(max, f12, min, min2, paint4);
                float f13 = foxtrot.top;
                float f14 = foxtrot.left;
                float f15 = foxtrot.bottom;
                Paint paint5 = this.f3704f;
                Intrinsics.checkNotNull(paint5);
                canvas2.drawRect(max, f13, f14, f15, paint5);
                float f16 = foxtrot.right;
                float f17 = foxtrot.top;
                float f18 = foxtrot.bottom;
                Paint paint6 = this.f3704f;
                Intrinsics.checkNotNull(paint6);
                canvas2.drawRect(f16, f17, min, f18, paint6);
            } else {
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.close();
                canvas.save();
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas.clipOutPath(path);
                } else {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                Paint paint7 = this.f3704f;
                Intrinsics.checkNotNull(paint7);
                canvas2 = canvas;
                canvas2.drawRect(max, max2, min, min2, paint7);
                canvas2.restore();
            }
        }
        RectF rectF2 = aiVar.alpha;
        if (rectF2.width() >= 100.0f && rectF2.height() >= 100.0f) {
            y yVar = this.guidelines;
            if (yVar == y.purple) {
                charlie(canvas);
            } else if (yVar == y.alpha && this.f3716r != null) {
                charlie(canvas);
            }
        }
        CropImageOptions cropImageOptions = this.red;
        if (cropImageOptions != null) {
            f5 = cropImageOptions.f3659q;
        } else {
            f5 = 0.0f;
        }
        if (cropImageOptions != null) {
            i11 = cropImageOptions.f3662t;
        } else {
            i11 = -1;
        }
        this.f3703d = p.charlie(f5, i11);
        if (this.f3724z) {
            RectF foxtrot2 = aiVar.foxtrot();
            float f19 = (foxtrot2.left + foxtrot2.right) / 2;
            float f20 = foxtrot2.top - 50;
            Paint paint8 = this.f3705g;
            if (paint8 != null) {
                paint8.setTextSize(this.B);
                paint8.setColor(this.C);
            }
            String str = this.A;
            Paint paint9 = this.f3705g;
            Intrinsics.checkNotNull(paint9);
            canvas2.drawText(str, f19, f20, paint9);
            canvas2.save();
        }
        Paint paint10 = this.f3702c;
        if (paint10 != null) {
            Intrinsics.checkNotNull(paint10);
            float strokeWidth = paint10.getStrokeWidth();
            RectF foxtrot3 = aiVar.foxtrot();
            float f21 = strokeWidth / 2;
            foxtrot3.inset(f21, f21);
            x xVar2 = this.cropShape;
            if (xVar2 == null) {
                i13 = -1;
            } else {
                i13 = ah.$EnumSwitchMapping$0[xVar2.ordinal()];
            }
            if (i13 != i10 && i13 != 2 && i13 != i5) {
                if (i13 == 4) {
                    Paint paint11 = this.f3702c;
                    Intrinsics.checkNotNull(paint11);
                    canvas2.drawOval(foxtrot3, paint11);
                } else {
                    throw new IllegalStateException("Unrecognized crop shape");
                }
            } else {
                Paint paint12 = this.f3702c;
                Intrinsics.checkNotNull(paint12);
                canvas2.drawRect(foxtrot3, paint12);
            }
        }
        if (this.f3703d != null) {
            Paint paint13 = this.f3702c;
            if (paint13 != null) {
                Intrinsics.checkNotNull(paint13);
                f10 = paint13.getStrokeWidth();
            } else {
                f10 = 0.0f;
            }
            Paint paint14 = this.f3703d;
            Intrinsics.checkNotNull(paint14);
            float strokeWidth2 = paint14.getStrokeWidth();
            float f22 = 2;
            float f23 = (strokeWidth2 - f10) / f22;
            float f24 = strokeWidth2 / f22;
            float f25 = f24 + f23;
            x xVar3 = this.cropShape;
            if (xVar3 == null) {
                i12 = -1;
            } else {
                i12 = ah.$EnumSwitchMapping$0[xVar3.ordinal()];
            }
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                if (i12 != 4) {
                    throw new IllegalStateException("Unrecognized crop shape");
                }
            } else {
                f24 += this.f3711m;
            }
            RectF foxtrot4 = aiVar.foxtrot();
            foxtrot4.inset(f24, f24);
            bravo(canvas2, foxtrot4, f23, f25);
            if (this.cornerShape == v.purple) {
                Integer num = this.purple;
                if (num != null) {
                    int intValue = num.intValue();
                    paint = new Paint();
                    paint.setColor(intValue);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAntiAlias(true);
                } else {
                    paint = null;
                }
                this.f3703d = paint;
                bravo(canvas2, foxtrot4, f23, f25);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            RectF foxtrot5 = aiVar.foxtrot();
            systemGestureExclusionRects = getSystemGestureExclusionRects();
            Intrinsics.delta(systemGestureExclusionRects, "systemGestureExclusionRects");
            if (CollectionsKt.ivory(systemGestureExclusionRects) >= 0) {
                rect = systemGestureExclusionRects.get(0);
            } else {
                rect = new Rect();
            }
            Rect rect5 = (Rect) rect;
            systemGestureExclusionRects2 = getSystemGestureExclusionRects();
            Intrinsics.delta(systemGestureExclusionRects2, "systemGestureExclusionRects");
            if (1 <= CollectionsKt.ivory(systemGestureExclusionRects2)) {
                rect2 = systemGestureExclusionRects2.get(1);
            } else {
                rect2 = new Rect();
            }
            Rect rect6 = (Rect) rect2;
            systemGestureExclusionRects3 = getSystemGestureExclusionRects();
            Intrinsics.delta(systemGestureExclusionRects3, "systemGestureExclusionRects");
            if (2 <= CollectionsKt.ivory(systemGestureExclusionRects3)) {
                rect3 = systemGestureExclusionRects3.get(2);
            } else {
                rect3 = new Rect();
            }
            Rect rect7 = (Rect) rect3;
            float f26 = foxtrot5.left;
            float f27 = this.f3714p;
            int i14 = (int) (f26 - f27);
            rect5.left = i14;
            int i15 = (int) (foxtrot5.right + f27);
            rect5.right = i15;
            float f28 = foxtrot5.top;
            int i16 = (int) (f28 - f27);
            rect5.top = i16;
            float f29 = this.f3699F;
            float f30 = 0.3f * f29;
            rect5.bottom = (int) (i16 + f30);
            rect6.left = i14;
            rect6.right = i15;
            float f31 = foxtrot5.bottom;
            int i17 = (int) (((f28 + f31) / 2.0f) - (0.2f * f29));
            rect6.top = i17;
            rect6.bottom = (int) ((f29 * 0.4f) + i17);
            rect7.left = rect5.left;
            rect7.right = rect5.right;
            int i18 = (int) (f31 + f27);
            rect7.bottom = i18;
            rect7.top = (int) (i18 - f30);
            setSystemGestureExclusionRects(CollectionsKt.listOf(rect5, rect6, rect7));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0390, code lost:
    
        if (a4.ai.golf(r10, r11, r12.left, r12.top, r12.right, r12.bottom) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0392, code lost:
    
        r3 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r2 != 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03d1, code lost:
    
        if (a4.ai.golf(r10, r11, r12.left, r12.top, r12.right, r12.bottom) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03f9, code lost:
    
        if (r11 < r4) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x040d, code lost:
    
        if (r6 != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0419, code lost:
    
        if (r11 < r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0483, code lost:
    
        if (r12 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0516, code lost:
    
        if (r2 != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r7 <= r13.right) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        if (r7 <= r13.bottom) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0525  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent event) {
        int i4;
        RectF rectF;
        int i5;
        boolean z2;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        float f5;
        float f10;
        ScaleGestureDetector scaleGestureDetector;
        Intrinsics.echo(event, "event");
        if (isEnabled()) {
            if (this.teal && (scaleGestureDetector = this.silver) != null) {
                scaleGestureDetector.onTouchEvent(event);
            }
            int action = event.getAction();
            int i11 = 3;
            ak akVar = null;
            ai aiVar = this.yellow;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        float x4 = event.getX();
                        float y10 = event.getY();
                        if (this.f3716r != null) {
                            float f11 = this.f3715q;
                            RectF rect = aiVar.foxtrot();
                            if (alpha(rect)) {
                                f5 = 0.0f;
                            } else {
                                f5 = f11;
                            }
                            ak akVar2 = this.f3716r;
                            Intrinsics.checkNotNull(akVar2);
                            RectF bounds = this.f3708j;
                            float f12 = f5;
                            int i12 = this.f3709k;
                            int i13 = this.f3710l;
                            boolean z13 = this.f3717s;
                            float f13 = this.f3720v;
                            akVar2.getClass();
                            Intrinsics.echo(rect, "rect");
                            Intrinsics.echo(bounds, "bounds");
                            PointF pointF = akVar2.foxtrot;
                            float f14 = x4 + pointF.x;
                            float f15 = y10 + pointF.y;
                            int i14 = akVar2.alpha;
                            if (i14 == 9) {
                                float centerX = f14 - rect.centerX();
                                float centerY = f15 - rect.centerY();
                                float f16 = rect.left + centerX;
                                if (f16 >= 0.0f) {
                                    float f17 = rect.right + centerX;
                                    if (f17 <= i12) {
                                        if (f16 >= bounds.left) {
                                        }
                                    }
                                }
                                centerX /= 1.05f;
                                pointF.x -= centerX / 2;
                                float f18 = rect.top + centerY;
                                if (f18 >= 0.0f) {
                                    float f19 = rect.bottom + centerY;
                                    if (f19 <= i13) {
                                        if (f18 >= bounds.top) {
                                        }
                                    }
                                }
                                centerY /= 1.05f;
                                pointF.y -= centerY / 2;
                                rect.offset(centerX, centerY);
                                float f20 = rect.left;
                                float f21 = bounds.left;
                                if (f20 < f21 + f12) {
                                    float f22 = f21 - f20;
                                    f10 = 0.0f;
                                    rect.offset(f22, 0.0f);
                                } else {
                                    f10 = 0.0f;
                                }
                                float f23 = rect.top;
                                float f24 = bounds.top;
                                if (f23 < f24 + f12) {
                                    rect.offset(f10, f24 - f23);
                                }
                                float f25 = rect.right;
                                float f26 = bounds.right;
                                if (f25 > f26 - f12) {
                                    rect.offset(f26 - f25, f10);
                                }
                                float f27 = rect.bottom;
                                float f28 = bounds.bottom;
                                if (f27 > f28 - f12) {
                                    rect.offset(f10, f28 - f27);
                                }
                            } else if (z13) {
                                switch (q.mike(i14)) {
                                    case 0:
                                        if ((rect.right - f14) / (rect.bottom - f15) < f13) {
                                            akVar2.echo(rect, f15, bounds, f12, f13, true, false);
                                            rect.left = rect.right - (rect.height() * f13);
                                            break;
                                        } else {
                                            akVar2.bravo(rect, f14, bounds, f12, f13, true, false);
                                            rect.top = rect.bottom - (rect.width() / f13);
                                            break;
                                        }
                                    case 1:
                                        if ((f14 - rect.left) / (rect.bottom - f15) < f13) {
                                            akVar2.echo(rect, f15, bounds, f12, f13, false, true);
                                            rect.right = (rect.height() * f13) + rect.left;
                                            break;
                                        } else {
                                            akVar2.delta(rect, f14, bounds, i12, f12, f13, true, false);
                                            rect.top = rect.bottom - (rect.width() / f13);
                                            break;
                                        }
                                    case 2:
                                        if ((rect.right - f14) / (f15 - rect.top) < f13) {
                                            akVar2.alpha(rect, f15, bounds, i13, f12, f13, true, false);
                                            rect.left = rect.right - (rect.height() * f13);
                                            break;
                                        } else {
                                            akVar2.bravo(rect, f14, bounds, f12, f13, false, true);
                                            rect.bottom = (rect.width() / f13) + rect.top;
                                            break;
                                        }
                                    case 3:
                                        if ((f14 - rect.left) / (f15 - rect.top) < f13) {
                                            akVar2.alpha(rect, f15, bounds, i13, f12, f13, false, true);
                                            rect.right = (rect.height() * f13) + rect.left;
                                            break;
                                        } else {
                                            akVar2.delta(rect, f14, bounds, i12, f12, f13, false, true);
                                            rect.bottom = (rect.width() / f13) + rect.top;
                                            break;
                                        }
                                    case 4:
                                        akVar2.bravo(rect, f14, bounds, f12, f13, true, true);
                                        ak.foxtrot(rect, bounds, f13);
                                        break;
                                    case 5:
                                        akVar2.echo(rect, f15, bounds, f12, f13, true, true);
                                        ak.charlie(rect, bounds, f13);
                                        break;
                                    case 6:
                                        akVar2.delta(rect, f14, bounds, i12, f12, f13, true, true);
                                        ak.foxtrot(rect, bounds, f13);
                                        break;
                                    case 7:
                                        akVar2.alpha(rect, f15, bounds, i13, f12, f13, true, true);
                                        ak.charlie(rect, bounds, f13);
                                        break;
                                }
                            } else {
                                switch (q.mike(i14)) {
                                    case 0:
                                        akVar2.echo(rect, f15, bounds, f12, 0.0f, false, false);
                                        akVar2.bravo(rect, f14, bounds, f12, 0.0f, false, false);
                                        break;
                                    case 1:
                                        akVar2.echo(rect, f15, bounds, f12, 0.0f, false, false);
                                        akVar2.delta(rect, f14, bounds, i12, f12, 0.0f, false, false);
                                        break;
                                    case 2:
                                        akVar2.alpha(rect, f15, bounds, i13, f12, 0.0f, false, false);
                                        akVar2.bravo(rect, f14, bounds, f12, 0.0f, false, false);
                                        break;
                                    case 3:
                                        akVar2.alpha(rect, f15, bounds, i13, f12, 0.0f, false, false);
                                        akVar2.delta(rect, f14, bounds, i12, f12, 0.0f, false, false);
                                        break;
                                    case 4:
                                        akVar2.bravo(rect, f14, bounds, f12, 0.0f, false, false);
                                        break;
                                    case 5:
                                        akVar2.echo(rect, f15, bounds, f12, 0.0f, false, false);
                                        break;
                                    case 6:
                                        akVar2.delta(rect, f14, bounds, i12, f12, 0.0f, false, false);
                                        break;
                                    case 7:
                                        akVar2.alpha(rect, f15, bounds, i13, f12, 0.0f, false, false);
                                        break;
                                }
                            }
                            aiVar.alpha.set(rect);
                            af afVar = this.f3700a;
                            if (afVar != null) {
                                z12 = true;
                                ((CropImageView) afVar).charlie(true, true);
                            } else {
                                z12 = true;
                            }
                            invalidate();
                        } else {
                            z12 = true;
                        }
                        getParent().requestDisallowInterceptTouchEvent(z12);
                        return z12;
                    }
                }
                getParent().requestDisallowInterceptTouchEvent(false);
                if (this.f3716r != null) {
                    this.f3716r = null;
                    af afVar2 = this.f3700a;
                    if (afVar2 != null) {
                        z11 = true;
                        ((CropImageView) afVar2).charlie(false, true);
                    } else {
                        z11 = true;
                    }
                    invalidate();
                    return z11;
                }
            } else {
                float x5 = event.getX();
                float y11 = event.getY();
                float f29 = this.f3714p;
                x cropShape = this.cropShape;
                Intrinsics.checkNotNull(cropShape);
                boolean z14 = this.white;
                aiVar.getClass();
                Intrinsics.echo(cropShape, "cropShape");
                int ordinal = cropShape.ordinal();
                RectF rectF2 = aiVar.alpha;
                if (ordinal != 0) {
                    i4 = 0;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                if (ai.alpha(x5, y11, rectF2.left, rectF2.centerY()) > f29) {
                                    if (ai.alpha(x5, y11, rectF2.right, rectF2.centerY()) > f29) {
                                        if (z14) {
                                        }
                                        i10 = i4;
                                    }
                                    i10 = 7;
                                }
                                i10 = 5;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            if (ai.alpha(x5, y11, rectF2.centerX(), rectF2.top) > f29) {
                                if (ai.alpha(x5, y11, rectF2.centerX(), rectF2.bottom) > f29) {
                                    if (z14) {
                                    }
                                    i10 = i4;
                                }
                                i10 = 8;
                            }
                            i10 = 6;
                        }
                    } else {
                        float f30 = 6;
                        float width = rectF2.width() / f30;
                        float f31 = rectF2.left;
                        float f32 = f31 + width;
                        float f33 = 5;
                        float f34 = (width * f33) + f31;
                        float height = rectF2.height() / f30;
                        float f35 = rectF2.top;
                        float f36 = f35 + height;
                        float f37 = (f33 * height) + f35;
                        if (x5 < f32) {
                            if (y11 >= f36) {
                            }
                            i10 = 1;
                        } else if (x5 < f34) {
                            if (y11 >= f36) {
                                if (y11 < f37) {
                                }
                                i10 = 8;
                            }
                            i10 = 6;
                        } else {
                            if (y11 >= f36) {
                            }
                            i10 = 2;
                        }
                    }
                    if (i10 != 0) {
                        akVar = new ak(i10, aiVar, x5, y11);
                    }
                    this.f3716r = akVar;
                    if (akVar != null) {
                        invalidate();
                        return true;
                    }
                } else {
                    i4 = 0;
                    if (ai.alpha(x5, y11, rectF2.left, rectF2.top) > f29) {
                        if (ai.alpha(x5, y11, rectF2.right, rectF2.top) > f29) {
                            if (ai.alpha(x5, y11, rectF2.left, rectF2.bottom) > f29) {
                                if (ai.alpha(x5, y11, rectF2.right, rectF2.bottom) > f29) {
                                    if (z14) {
                                        i5 = 5;
                                        i11 = 6;
                                        rectF = rectF2;
                                        if (ai.golf(x5, y11, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom)) {
                                            if (rectF.width() >= 100.0f && rectF.height() >= 100.0f) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                    } else {
                                        rectF = rectF2;
                                        i5 = 5;
                                        i11 = 6;
                                    }
                                    float f38 = rectF.left;
                                    float f39 = rectF.right;
                                    float f40 = rectF.top;
                                    if (x5 <= f38 || x5 >= f39 || Math.abs(y11 - f40) > f29) {
                                        float f41 = rectF.left;
                                        float f42 = rectF.right;
                                        float f43 = rectF.bottom;
                                        if (x5 <= f41 || x5 >= f42 || Math.abs(y11 - f43) > f29) {
                                            float f44 = rectF.left;
                                            float f45 = rectF.top;
                                            float f46 = rectF.bottom;
                                            if (Math.abs(x5 - f44) <= f29 && y11 > f45 && y11 < f46) {
                                                i10 = i5;
                                                if (i10 != 0) {
                                                }
                                                this.f3716r = akVar;
                                                if (akVar != null) {
                                                }
                                            } else {
                                                float f47 = rectF.right;
                                                float f48 = rectF.top;
                                                float f49 = rectF.bottom;
                                                if (Math.abs(x5 - f47) > f29 || y11 <= f48 || y11 >= f49) {
                                                    if (z14 && ai.golf(x5, y11, rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                                                        if (rectF.width() >= 100.0f && rectF.height() >= 100.0f) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                    }
                                                    i10 = i4;
                                                    if (i10 != 0) {
                                                    }
                                                    this.f3716r = akVar;
                                                    if (akVar != null) {
                                                    }
                                                }
                                                i10 = 7;
                                                if (i10 != 0) {
                                                }
                                                this.f3716r = akVar;
                                                if (akVar != null) {
                                                }
                                            }
                                        }
                                        i10 = 8;
                                        if (i10 != 0) {
                                        }
                                        this.f3716r = akVar;
                                        if (akVar != null) {
                                        }
                                    }
                                }
                                i10 = 4;
                                if (i10 != 0) {
                                }
                                this.f3716r = akVar;
                                if (akVar != null) {
                                }
                            }
                            i10 = i11;
                            if (i10 != 0) {
                            }
                            this.f3716r = akVar;
                            if (akVar != null) {
                            }
                        }
                        i10 = 2;
                        if (i10 != 0) {
                        }
                        this.f3716r = akVar;
                        if (akVar != null) {
                        }
                    }
                    i10 = 1;
                    if (i10 != 0) {
                    }
                    this.f3716r = akVar;
                    if (akVar != null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void setAspectRatioX(int i4) {
        if (i4 > 0) {
            if (this.f3718t != i4) {
                this.f3718t = i4;
                this.f3720v = i4 / this.f3719u;
                if (this.f3698E) {
                    foxtrot();
                    invalidate();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
    }

    public final void setAspectRatioY(int i4) {
        if (i4 > 0) {
            if (this.f3719u != i4) {
                this.f3719u = i4;
                this.f3720v = this.f3718t / i4;
                if (this.f3698E) {
                    foxtrot();
                    invalidate();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
    }

    public final void setCropCornerRadius(float cornerRadius) {
        this.alpha = cornerRadius;
    }

    public final void setCropCornerShape(@NotNull v cropCornerShape) {
        Intrinsics.echo(cropCornerShape, "cropCornerShape");
        if (this.cornerShape != cropCornerShape) {
            this.cornerShape = cropCornerShape;
            invalidate();
        }
    }

    public final void setCropLabelText(@Nullable String textLabel) {
        if (textLabel != null) {
            this.A = textLabel;
        }
    }

    public final void setCropLabelTextColor(int textColor) {
        this.C = textColor;
        invalidate();
    }

    public final void setCropLabelTextSize(float textSize) {
        this.B = textSize;
        invalidate();
    }

    public final void setCropShape(@NotNull x cropShape) {
        Intrinsics.echo(cropShape, "cropShape");
        if (this.cropShape != cropShape) {
            this.cropShape = cropShape;
            invalidate();
        }
    }

    public final void setCropWindowChangeListener(@Nullable af listener) {
        this.f3700a = listener;
    }

    public final void setCropWindowRect(@NotNull RectF rect) {
        Intrinsics.echo(rect, "rect");
        this.yellow.alpha.set(rect);
    }

    public final void setCropperTextLabelVisibility(boolean isEnabled) {
        this.f3724z = isEnabled;
        invalidate();
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        if (this.f3717s != fixAspectRatio) {
            this.f3717s = fixAspectRatio;
            if (this.f3698E) {
                foxtrot();
                invalidate();
            }
        }
    }

    public final void setGuidelines(@NotNull y guidelines) {
        Intrinsics.echo(guidelines, "guidelines");
        if (this.guidelines != guidelines) {
            this.guidelines = guidelines;
            if (this.f3698E) {
                invalidate();
            }
        }
    }

    public final void setInitialAttributeValues(@NotNull CropImageOptions options) {
        boolean z2;
        af afVar;
        Intrinsics.echo(options, "options");
        boolean areEqual = Intrinsics.areEqual(this.red, options);
        CropImageOptions cropImageOptions = this.red;
        int i4 = options.f3656n;
        int i5 = options.f3655m;
        boolean z10 = options.f3654l;
        if (cropImageOptions != null && z10 == cropImageOptions.f3654l && i5 == cropImageOptions.f3655m && i4 == cropImageOptions.f3656n) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.red = options;
        float f5 = options.A;
        ai aiVar = this.yellow;
        aiVar.golf = f5;
        float f10 = options.B;
        aiVar.hotel = f10;
        float f11 = options.C;
        aiVar.india = f11;
        float f12 = options.f3612D;
        aiVar.juliet = f12;
        if (!areEqual) {
            aiVar.charlie = options.f3667y;
            aiVar.delta = options.f3668z;
            aiVar.golf = f5;
            aiVar.hotel = f10;
            aiVar.india = f11;
            aiVar.juliet = f12;
            int i10 = options.f3639c0;
            this.C = i10;
            float f13 = options.f3637b0;
            this.B = f13;
            String str = options.f3641d0;
            if (str == null) {
                str = "";
            }
            this.A = str;
            this.f3724z = options.f3640d;
            this.alpha = options.teal;
            this.cornerShape = options.silver;
            this.cropShape = options.red;
            this.f3715q = options.white;
            this.guidelines = options.f3634a;
            this.f3717s = z10;
            setAspectRatioX(i5);
            setAspectRatioY(i4);
            boolean z11 = options.f3647h;
            this.teal = z11;
            if (z11 && this.silver == null) {
                this.silver = new ScaleGestureDetector(getContext(), new ag(this));
            }
            this.white = options.f3649i;
            this.f3714p = options.yellow;
            this.f3713o = options.f3653k;
            this.f3702c = p.charlie(options.f3657o, options.f3658p);
            this.f3711m = options.f3660r;
            this.f3712n = options.f3661s;
            this.purple = Integer.valueOf(options.f3663u);
            this.f3703d = p.charlie(options.f3659q, options.f3662t);
            this.e = p.charlie(options.f3664v, options.f3665w);
            Paint paint = new Paint();
            paint.setColor(options.f3666x);
            this.f3704f = paint;
            Paint paint2 = new Paint();
            paint2.setStrokeWidth(1.0f);
            paint2.setTextSize(f13);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setColor(i10);
            this.f3705g = paint2;
            if (z2) {
                foxtrot();
            }
            invalidate();
            if (z2 && (afVar = this.f3700a) != null) {
                ((CropImageView) afVar).charlie(false, true);
            }
        }
    }

    public final void setInitialCropWindowRect(@Nullable Rect rect) {
        if (rect == null) {
            rect = l.alpha;
        }
        this.f3697D.set(rect);
        if (this.f3698E) {
            foxtrot();
            invalidate();
            af afVar = this.f3700a;
            if (afVar != null) {
                ((CropImageView) afVar).charlie(false, true);
            }
        }
    }

    public final void setSnapRadius(float snapRadius) {
        this.f3715q = snapRadius;
    }
}
