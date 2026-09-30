package com.google.android.material.imageview;

import L6.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import g1.AbstractC1735d;
import g7.i;
import g7.m;
import g7.n;
import g7.o;
import g7.x;
import l7.AbstractC2059a;
import s6.AbstractC2719n0;

/* loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements x {

    /* renamed from: a, reason: collision with root package name */
    public i f8031a;
    public final o alpha;

    /* renamed from: b, reason: collision with root package name */
    public m f8032b;

    /* renamed from: c, reason: collision with root package name */
    public float f8033c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f8034d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8035f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8036g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8037h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8038i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8039j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8040k;
    public final RectF purple;
    public final RectF red;
    public final Paint silver;
    public final Paint teal;
    public final Path white;
    public ColorStateList yellow;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, 0, 2132083956), attributeSet, 0);
        this.alpha = n.alpha;
        this.white = new Path();
        this.f8040k = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.teal = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.purple = new RectF();
        this.red = new RectF();
        this.f8034d = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a.gray, 0, 2132083956);
        setLayerType(2, null);
        this.yellow = AbstractC2719n0.alpha(context2, obtainStyledAttributes, 9);
        this.f8033c = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.e = dimensionPixelSize;
        this.f8035f = dimensionPixelSize;
        this.f8036g = dimensionPixelSize;
        this.f8037h = dimensionPixelSize;
        this.e = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f8035f = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f8036g = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f8037h = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f8038i = obtainStyledAttributes.getDimensionPixelSize(5, RecyclerView.UNDEFINED_DURATION);
        this.f8039j = obtainStyledAttributes.getDimensionPixelSize(2, RecyclerView.UNDEFINED_DURATION);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.silver = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f8032b = m.charlie(context2, attributeSet, 0, 2132083956).alpha();
        setOutlineProvider(new Y6.a(this));
    }

    public final boolean charlie() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void delta(int i4, int i5) {
        RectF rectF = this.purple;
        rectF.set(getPaddingLeft(), getPaddingTop(), i4 - getPaddingRight(), i5 - getPaddingBottom());
        m mVar = this.f8032b;
        Path path = this.white;
        this.alpha.alpha(mVar, null, 1.0f, rectF, null, path);
        Path path2 = this.f8034d;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.red;
        rectF2.set(0.0f, 0.0f, i4, i5);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f8037h;
    }

    public final int getContentPaddingEnd() {
        int i4 = this.f8039j;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (charlie()) {
            return this.e;
        }
        return this.f8036g;
    }

    public int getContentPaddingLeft() {
        int i4;
        int i5;
        if (this.f8038i != Integer.MIN_VALUE || this.f8039j != Integer.MIN_VALUE) {
            if (charlie() && (i5 = this.f8039j) != Integer.MIN_VALUE) {
                return i5;
            }
            if (!charlie() && (i4 = this.f8038i) != Integer.MIN_VALUE) {
                return i4;
            }
        }
        return this.e;
    }

    public int getContentPaddingRight() {
        int i4;
        int i5;
        if (this.f8038i != Integer.MIN_VALUE || this.f8039j != Integer.MIN_VALUE) {
            if (charlie() && (i5 = this.f8038i) != Integer.MIN_VALUE) {
                return i5;
            }
            if (!charlie() && (i4 = this.f8039j) != Integer.MIN_VALUE) {
                return i4;
            }
        }
        return this.f8036g;
    }

    public final int getContentPaddingStart() {
        int i4 = this.f8038i;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (charlie()) {
            return this.f8036g;
        }
        return this.e;
    }

    public int getContentPaddingTop() {
        return this.f8035f;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public m getShapeAppearanceModel() {
        return this.f8032b;
    }

    public ColorStateList getStrokeColor() {
        return this.yellow;
    }

    public float getStrokeWidth() {
        return this.f8033c;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f8034d, this.teal);
        if (this.yellow != null) {
            Paint paint = this.silver;
            paint.setStrokeWidth(this.f8033c);
            int colorForState = this.yellow.getColorForState(getDrawableState(), this.yellow.getDefaultColor());
            if (this.f8033c > 0.0f && colorForState != 0) {
                paint.setColor(colorForState);
                canvas.drawPath(this.white, paint);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f8040k || !isLayoutDirectionResolved()) {
            return;
        }
        this.f8040k = true;
        if (!isPaddingRelative() && this.f8038i == Integer.MIN_VALUE && this.f8039j == Integer.MIN_VALUE) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i10, int i11) {
        super.onSizeChanged(i4, i5, i10, i11);
        delta(i4, i5);
    }

    @Override // android.view.View
    public final void setPadding(int i4, int i5, int i10, int i11) {
        super.setPadding(getContentPaddingLeft() + i4, getContentPaddingTop() + i5, getContentPaddingRight() + i10, getContentPaddingBottom() + i11);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i4, int i5, int i10, int i11) {
        super.setPaddingRelative(getContentPaddingStart() + i4, getContentPaddingTop() + i5, getContentPaddingEnd() + i10, getContentPaddingBottom() + i11);
    }

    @Override // g7.x
    public void setShapeAppearanceModel(m mVar) {
        this.f8032b = mVar;
        i iVar = this.f8031a;
        if (iVar != null) {
            iVar.setShapeAppearanceModel(mVar);
        }
        delta(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.yellow = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i4) {
        setStrokeColor(AbstractC1735d.charlie(i4, getContext()));
    }

    public void setStrokeWidth(float f5) {
        if (this.f8033c != f5) {
            this.f8033c = f5;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i4) {
        setStrokeWidth(getResources().getDimensionPixelSize(i4));
    }
}
