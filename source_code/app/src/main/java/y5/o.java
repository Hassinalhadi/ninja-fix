package y5;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class o implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final j f14139a;

    /* renamed from: b, reason: collision with root package name */
    public final GestureDetector f14140b;

    /* renamed from: c, reason: collision with root package name */
    public final C3399b f14141c;

    /* renamed from: i, reason: collision with root package name */
    public View.OnClickListener f14146i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnLongClickListener f14147j;

    /* renamed from: k, reason: collision with root package name */
    public h f14148k;

    /* renamed from: l, reason: collision with root package name */
    public n f14149l;

    /* renamed from: p, reason: collision with root package name */
    public final tg.b f14153p;
    public final AccelerateDecelerateInterpolator alpha = new AccelerateDecelerateInterpolator();
    public int purple = 200;
    public float red = 1.0f;
    public float silver = 1.75f;
    public float teal = 3.0f;
    public boolean white = true;
    public boolean yellow = false;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f14142d = new Matrix();
    public final Matrix e = new Matrix();

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f14143f = new Matrix();

    /* renamed from: g, reason: collision with root package name */
    public final RectF f14144g = new RectF();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f14145h = new float[9];

    /* renamed from: m, reason: collision with root package name */
    public int f14150m = 2;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14151n = true;

    /* renamed from: o, reason: collision with root package name */
    public ImageView.ScaleType f14152o = ImageView.ScaleType.FIT_CENTER;

    public o(j jVar) {
        tg.b bVar = new tg.b(7, this);
        this.f14153p = bVar;
        this.f14139a = jVar;
        jVar.setOnTouchListener(this);
        jVar.addOnLayoutChangeListener(this);
        if (jVar.isInEditMode()) {
            return;
        }
        this.f14141c = new C3399b(jVar.getContext(), bVar);
        GestureDetector gestureDetector = new GestureDetector(jVar.getContext(), new bq.a(1, this));
        this.f14140b = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new k(this));
    }

    public final void alpha() {
        if (bravo()) {
            this.f14139a.setImageMatrix(charlie());
        }
    }

    public final boolean bravo() {
        RectF rectF;
        float f5;
        float f10;
        float f11;
        float f12;
        float f13;
        Matrix charlie = charlie();
        float f14 = 0.0f;
        if (this.f14139a.getDrawable() != null) {
            rectF = this.f14144g;
            rectF.set(0.0f, 0.0f, r1.getIntrinsicWidth(), r1.getIntrinsicHeight());
            charlie.mapRect(rectF);
        } else {
            rectF = null;
        }
        if (rectF == null) {
            return false;
        }
        float height = rectF.height();
        float width = rectF.width();
        j jVar = this.f14139a;
        float height2 = (jVar.getHeight() - jVar.getPaddingTop()) - jVar.getPaddingBottom();
        if (height <= height2) {
            int i4 = l.alpha[this.f14152o.ordinal()];
            if (i4 != 2) {
                if (i4 != 3) {
                    height2 = (height2 - height) / 2.0f;
                    f10 = rectF.top;
                } else {
                    height2 -= height;
                    f10 = rectF.top;
                }
                f11 = height2 - f10;
            } else {
                f5 = rectF.top;
                f11 = -f5;
            }
        } else {
            f5 = rectF.top;
            if (f5 <= 0.0f) {
                f10 = rectF.bottom;
                if (f10 >= height2) {
                    f11 = 0.0f;
                }
                f11 = height2 - f10;
            }
            f11 = -f5;
        }
        float width2 = (jVar.getWidth() - jVar.getPaddingLeft()) - jVar.getPaddingRight();
        if (width <= width2) {
            int i5 = l.alpha[this.f14152o.ordinal()];
            if (i5 != 2) {
                if (i5 != 3) {
                    f12 = (width2 - width) / 2.0f;
                    f13 = rectF.left;
                } else {
                    f12 = width2 - width;
                    f13 = rectF.left;
                }
                f14 = f12 - f13;
            } else {
                f14 = -rectF.left;
            }
            this.f14150m = 2;
        } else {
            float f15 = rectF.left;
            if (f15 > 0.0f) {
                this.f14150m = 0;
                f14 = -f15;
            } else {
                float f16 = rectF.right;
                if (f16 < width2) {
                    f14 = width2 - f16;
                    this.f14150m = 1;
                } else {
                    this.f14150m = -1;
                }
            }
        }
        this.f14143f.postTranslate(f14, f11);
        return true;
    }

    public final Matrix charlie() {
        Matrix matrix = this.e;
        matrix.set(this.f14142d);
        matrix.postConcat(this.f14143f);
        return matrix;
    }

    public final float delta() {
        Matrix matrix = this.f14143f;
        float[] fArr = this.f14145h;
        matrix.getValues(fArr);
        float pow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(pow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final void echo(float f5, float f10, float f11, boolean z2) {
        if (f5 >= this.red && f5 <= this.teal) {
            if (z2) {
                this.f14139a.post(new m(this, delta(), f5, f10, f11));
                return;
            } else {
                this.f14143f.setScale(f5, f5, f10, f11);
                alpha();
                return;
            }
        }
        throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
    }

    public final void foxtrot() {
        if (this.f14151n) {
            golf(this.f14139a.getDrawable());
            return;
        }
        Matrix matrix = this.f14143f;
        matrix.reset();
        matrix.postRotate(0.0f);
        alpha();
        this.f14139a.setImageMatrix(charlie());
        bravo();
    }

    public final void golf(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        j jVar = this.f14139a;
        float width = (jVar.getWidth() - jVar.getPaddingLeft()) - jVar.getPaddingRight();
        float height = (jVar.getHeight() - jVar.getPaddingTop()) - jVar.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f14142d;
        matrix.reset();
        float f5 = intrinsicWidth;
        float f10 = width / f5;
        float f11 = intrinsicHeight;
        float f12 = height / f11;
        ImageView.ScaleType scaleType = this.f14152o;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((width - f5) / 2.0f, (height - f11) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f10, f12);
            matrix.postScale(max, max);
            matrix.postTranslate((width - (f5 * max)) / 2.0f, (height - (f11 * max)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f10, f12));
            matrix.postScale(min, min);
            matrix.postTranslate((width - (f5 * min)) / 2.0f, (height - (f11 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f5, f11);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f11, f5);
            }
            int i4 = l.alpha[this.f14152o.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                        }
                    } else {
                        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                    }
                } else {
                    matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                }
            } else {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            }
        }
        Matrix matrix2 = this.f14143f;
        matrix2.reset();
        matrix2.postRotate(0.0f);
        alpha();
        this.f14139a.setImageMatrix(charlie());
        bravo();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i4, int i5, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i4 == i12 && i5 == i13 && i10 == i14 && i11 == i15) {
            return;
        }
        golf(this.f14139a.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        C3399b c3399b;
        GestureDetector gestureDetector;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!this.f14151n || ((ImageView) view).getDrawable() == null) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = null;
        if (action != 0) {
            if (action == 1 || action == 3) {
                float delta = delta();
                float f5 = this.red;
                RectF rectF2 = this.f14144g;
                if (delta < f5) {
                    bravo();
                    Matrix charlie = charlie();
                    if (this.f14139a.getDrawable() != null) {
                        rectF2.set(0.0f, 0.0f, r5.getIntrinsicWidth(), r5.getIntrinsicHeight());
                        charlie.mapRect(rectF2);
                        rectF = rectF2;
                    }
                    if (rectF != null) {
                        RectF rectF3 = rectF;
                        view.post(new m(this, delta(), this.red, rectF3.centerX(), rectF3.centerY()));
                        z2 = true;
                    }
                } else if (delta() > this.teal) {
                    bravo();
                    Matrix charlie2 = charlie();
                    if (this.f14139a.getDrawable() != null) {
                        rectF2.set(0.0f, 0.0f, r5.getIntrinsicWidth(), r5.getIntrinsicHeight());
                        charlie2.mapRect(rectF2);
                        rectF = rectF2;
                    }
                    if (rectF != null) {
                        RectF rectF4 = rectF;
                        view.post(new m(this, delta(), this.teal, rectF4.centerX(), rectF4.centerY()));
                        z2 = true;
                    }
                }
                c3399b = this.f14141c;
                if (c3399b != null) {
                    ScaleGestureDetector scaleGestureDetector = c3399b.charlie;
                    boolean isInProgress = scaleGestureDetector.isInProgress();
                    boolean z13 = c3399b.echo;
                    try {
                        scaleGestureDetector.onTouchEvent(motionEvent);
                        c3399b.alpha(motionEvent);
                    } catch (IllegalArgumentException unused) {
                    }
                    if (!isInProgress && !scaleGestureDetector.isInProgress()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z13 && !c3399b.echo) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 && z11) {
                        z12 = true;
                    }
                    this.yellow = z12;
                    z2 = true;
                }
                gestureDetector = this.f14140b;
                if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                    return true;
                }
                return z2;
            }
        } else {
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            n nVar = this.f14149l;
            if (nVar != null) {
                nVar.alpha.forceFinished(true);
                this.f14149l = null;
            }
        }
        z2 = false;
        c3399b = this.f14141c;
        if (c3399b != null) {
        }
        gestureDetector = this.f14140b;
        if (gestureDetector == null) {
        }
        return z2;
    }
}
