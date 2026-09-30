package com.chaos.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.C0492z;
import i1.k;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.util.WeakHashMap;
import s1.au;

/* loaded from: classes3.dex */
public class PinView extends C0492z {
    private static final int BLINK = 500;
    private static final boolean DBG = false;
    private static final int DEFAULT_COUNT = 4;
    private static final String TAG = "PinView";
    private static final int VIEW_TYPE_LINE = 1;
    private static final int VIEW_TYPE_NONE = 2;
    private static final int VIEW_TYPE_RECTANGLE = 0;
    private boolean drawCursor;
    private boolean isAnimationEnable;
    private boolean isCursorVisible;
    private boolean isPasswordHidden;
    private final TextPaint mAnimatorTextPaint;
    private Blink mBlink;
    private int mCurLineColor;
    private int mCursorColor;
    private float mCursorHeight;
    private int mCursorWidth;
    private ValueAnimator mDefaultAddAnimator;
    private boolean mHideLineWhenFilled;
    private Drawable mItemBackground;
    private int mItemBackgroundResource;
    private final RectF mItemBorderRect;
    private final PointF mItemCenterPoint;
    private final RectF mItemLineRect;
    private ColorStateList mLineColor;
    private int mLineWidth;
    private final Paint mPaint;
    private final Path mPath;
    private int mPinItemCount;
    private int mPinItemHeight;
    private int mPinItemRadius;
    private int mPinItemSpacing;
    private int mPinItemWidth;
    private final Rect mTextRect;
    private String mTransformed;
    private int mViewType;
    private static final InputFilter[] NO_FILTERS = new InputFilter[0];
    private static final int[] HIGHLIGHT_STATES = {android.R.attr.state_selected};

    /* loaded from: classes3.dex */
    public class Blink implements Runnable {
        private boolean mCancelled;

        private Blink() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cancel() {
            if (!this.mCancelled) {
                PinView.this.removeCallbacks(this);
                this.mCancelled = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.mCancelled) {
                PinView.this.removeCallbacks(this);
                if (PinView.this.shouldBlink()) {
                    PinView.this.invalidateCursor(!r0.drawCursor);
                    PinView.this.postDelayed(this, 500L);
                }
            }
        }

        public void uncancel() {
            this.mCancelled = false;
        }
    }

    /* loaded from: classes3.dex */
    public static class DefaultActionModeCallback implements ActionMode.Callback {
        private DefaultActionModeCallback() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    public PinView(Context context) {
        this(context, null);
    }

    private void checkItemRadius() {
        int i4 = this.mViewType;
        if (i4 == 1) {
            if (this.mPinItemRadius > this.mLineWidth / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than lineWidth when viewType is line");
            }
        } else if (i4 == 0) {
            if (this.mPinItemRadius > this.mPinItemWidth / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than itemWidth");
            }
        }
    }

    private void disableSelectionMenu() {
        setCustomSelectionActionModeCallback(new DefaultActionModeCallback());
        if (Build.VERSION.SDK_INT >= 26) {
            setCustomInsertionActionModeCallback(new DefaultActionModeCallback() { // from class: com.chaos.view.PinView.2
                @Override // com.chaos.view.PinView.DefaultActionModeCallback, android.view.ActionMode.Callback
                public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                    menu.removeItem(android.R.id.autofill);
                    return true;
                }
            });
        }
    }

    private int dpToPx(float f5) {
        return (int) ((f5 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void drawAnchorLine(Canvas canvas) {
        PointF pointF = this.mItemCenterPoint;
        float f5 = pointF.x;
        float f10 = pointF.y;
        this.mPaint.setStrokeWidth(1.0f);
        float strokeWidth = f5 - (this.mPaint.getStrokeWidth() / 2.0f);
        float strokeWidth2 = f10 - (this.mPaint.getStrokeWidth() / 2.0f);
        this.mPath.reset();
        this.mPath.moveTo(strokeWidth, this.mItemBorderRect.top);
        Path path = this.mPath;
        RectF rectF = this.mItemBorderRect;
        path.lineTo(strokeWidth, Math.abs(rectF.height()) + rectF.top);
        canvas.drawPath(this.mPath, this.mPaint);
        this.mPath.reset();
        this.mPath.moveTo(this.mItemBorderRect.left, strokeWidth2);
        Path path2 = this.mPath;
        RectF rectF2 = this.mItemBorderRect;
        path2.lineTo(Math.abs(rectF2.width()) + rectF2.left, strokeWidth2);
        canvas.drawPath(this.mPath, this.mPaint);
        this.mPath.reset();
        this.mPaint.setStrokeWidth(this.mLineWidth);
    }

    private void drawCircle(Canvas canvas, int i4) {
        Paint paintByIndex = getPaintByIndex(i4);
        PointF pointF = this.mItemCenterPoint;
        canvas.drawCircle(pointF.x, pointF.y, paintByIndex.getTextSize() / 2.0f, paintByIndex);
    }

    private void drawCursor(Canvas canvas) {
        if (this.drawCursor) {
            PointF pointF = this.mItemCenterPoint;
            float f5 = pointF.x;
            float f10 = pointF.y - (this.mCursorHeight / 2.0f);
            int color = this.mPaint.getColor();
            float strokeWidth = this.mPaint.getStrokeWidth();
            this.mPaint.setColor(this.mCursorColor);
            this.mPaint.setStrokeWidth(this.mCursorWidth);
            canvas.drawLine(f5, f10, f5, f10 + this.mCursorHeight, this.mPaint);
            this.mPaint.setColor(color);
            this.mPaint.setStrokeWidth(strokeWidth);
        }
    }

    private void drawHint(Canvas canvas, int i4) {
        Paint paintByIndex = getPaintByIndex(i4);
        paintByIndex.setColor(getCurrentHintTextColor());
        drawTextAtBox(canvas, paintByIndex, getHint(), i4);
    }

    private void drawItemBackground(Canvas canvas, boolean z2) {
        int[] drawableState;
        if (this.mItemBackground == null) {
            return;
        }
        float f5 = this.mLineWidth / 2.0f;
        this.mItemBackground.setBounds(Math.round(this.mItemBorderRect.left - f5), Math.round(this.mItemBorderRect.top - f5), Math.round(this.mItemBorderRect.right + f5), Math.round(this.mItemBorderRect.bottom + f5));
        Drawable drawable = this.mItemBackground;
        if (z2) {
            drawableState = HIGHLIGHT_STATES;
        } else {
            drawableState = getDrawableState();
        }
        drawable.setState(drawableState);
        this.mItemBackground.draw(canvas);
    }

    private void drawPinBox(Canvas canvas, int i4) {
        if (this.mHideLineWhenFilled && i4 < getText().length()) {
            return;
        }
        canvas.drawPath(this.mPath, this.mPaint);
    }

    private void drawPinLine(Canvas canvas, int i4) {
        boolean z2;
        boolean z10;
        int i5;
        if (this.mHideLineWhenFilled && i4 < getText().length()) {
            return;
        }
        if (this.mPinItemSpacing == 0 && (i5 = this.mPinItemCount) > 1) {
            if (i4 == 0) {
                z2 = true;
                z10 = false;
            } else if (i4 == i5 - 1) {
                z10 = true;
                z2 = false;
            } else {
                z2 = false;
            }
            this.mPaint.setStyle(Paint.Style.FILL);
            this.mPaint.setStrokeWidth(this.mLineWidth / 10.0f);
            float f5 = this.mLineWidth / 2.0f;
            RectF rectF = this.mItemLineRect;
            RectF rectF2 = this.mItemBorderRect;
            float f10 = rectF2.left - f5;
            float f11 = rectF2.bottom;
            rectF.set(f10, f11 - f5, rectF2.right + f5, f11 + f5);
            RectF rectF3 = this.mItemLineRect;
            int i10 = this.mPinItemRadius;
            updateRoundRectPath(rectF3, i10, i10, z2, z10);
            canvas.drawPath(this.mPath, this.mPaint);
        }
        z2 = true;
        z10 = z2;
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setStrokeWidth(this.mLineWidth / 10.0f);
        float f52 = this.mLineWidth / 2.0f;
        RectF rectF4 = this.mItemLineRect;
        RectF rectF22 = this.mItemBorderRect;
        float f102 = rectF22.left - f52;
        float f112 = rectF22.bottom;
        rectF4.set(f102, f112 - f52, rectF22.right + f52, f112 + f52);
        RectF rectF32 = this.mItemLineRect;
        int i102 = this.mPinItemRadius;
        updateRoundRectPath(rectF32, i102, i102, z2, z10);
        canvas.drawPath(this.mPath, this.mPaint);
    }

    private void drawPinView(Canvas canvas) {
        boolean z2;
        int i4;
        int length = getText().length();
        for (int i5 = 0; i5 < this.mPinItemCount; i5++) {
            if (isFocused() && length == i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            Paint paint = this.mPaint;
            if (z2) {
                i4 = getLineColorForState(HIGHLIGHT_STATES);
            } else {
                i4 = this.mCurLineColor;
            }
            paint.setColor(i4);
            updateItemRectF(i5);
            updateCenterPoint();
            canvas.save();
            if (this.mViewType == 0) {
                updatePinBoxPath(i5);
                canvas.clipPath(this.mPath);
            }
            drawItemBackground(canvas, z2);
            canvas.restore();
            if (z2) {
                drawCursor(canvas);
            }
            int i10 = this.mViewType;
            if (i10 == 0) {
                drawPinBox(canvas, i5);
            } else if (i10 == 1) {
                drawPinLine(canvas, i5);
            }
            if (this.mTransformed.length() > i5) {
                if (getTransformationMethod() == null && this.isPasswordHidden) {
                    drawCircle(canvas, i5);
                } else {
                    drawText(canvas, i5);
                }
            } else if (!TextUtils.isEmpty(getHint()) && getHint().length() == this.mPinItemCount) {
                drawHint(canvas, i5);
            }
        }
        if (isFocused() && getText().length() != this.mPinItemCount && this.mViewType == 0) {
            int length2 = getText().length();
            updateItemRectF(length2);
            updateCenterPoint();
            updatePinBoxPath(length2);
            this.mPaint.setColor(getLineColorForState(HIGHLIGHT_STATES));
            drawPinBox(canvas, length2);
        }
    }

    private void drawText(Canvas canvas, int i4) {
        drawTextAtBox(canvas, getPaintByIndex(i4), this.mTransformed, i4);
    }

    private void drawTextAtBox(Canvas canvas, Paint paint, CharSequence charSequence, int i4) {
        int i5 = i4 + 1;
        paint.getTextBounds(charSequence.toString(), i4, i5, this.mTextRect);
        PointF pointF = this.mItemCenterPoint;
        float f5 = pointF.x;
        float f10 = pointF.y;
        float abs = f5 - (Math.abs(this.mTextRect.width()) / 2.0f);
        Rect rect = this.mTextRect;
        canvas.drawText(charSequence, i4, i5, abs - rect.left, ((Math.abs(rect.height()) / 2.0f) + f10) - this.mTextRect.bottom, paint);
    }

    private int getLineColorForState(int... iArr) {
        ColorStateList colorStateList = this.mLineColor;
        if (colorStateList != null) {
            return colorStateList.getColorForState(iArr, this.mCurLineColor);
        }
        return this.mCurLineColor;
    }

    private Paint getPaintByIndex(int i4) {
        if (this.isAnimationEnable && i4 == getText().length() - 1) {
            this.mAnimatorTextPaint.setColor(getPaint().getColor());
            return this.mAnimatorTextPaint;
        }
        return getPaint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateCursor(boolean z2) {
        if (this.drawCursor != z2) {
            this.drawCursor = z2;
            invalidate();
        }
    }

    private static boolean isPasswordInputType(int i4) {
        int i5 = i4 & 4095;
        return i5 == 129 || i5 == 225 || i5 == 18;
    }

    private void makeBlink() {
        if (shouldBlink()) {
            if (this.mBlink == null) {
                this.mBlink = new Blink();
            }
            removeCallbacks(this.mBlink);
            this.drawCursor = false;
            postDelayed(this.mBlink, 500L);
            return;
        }
        Blink blink = this.mBlink;
        if (blink != null) {
            removeCallbacks(blink);
        }
    }

    private void moveSelectionToEnd() {
        setSelection(getText().length());
    }

    private void resumeBlink() {
        Blink blink = this.mBlink;
        if (blink != null) {
            blink.uncancel();
            makeBlink();
        }
    }

    private void setMaxLength(int i4) {
        if (i4 >= 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i4)});
        } else {
            setFilters(NO_FILTERS);
        }
    }

    private void setupAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.mDefaultAddAnimator = ofFloat;
        ofFloat.setDuration(150L);
        this.mDefaultAddAnimator.setInterpolator(new DecelerateInterpolator());
        this.mDefaultAddAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.chaos.view.PinView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PinView.this.mAnimatorTextPaint.setTextSize(PinView.this.getTextSize() * floatValue);
                PinView.this.mAnimatorTextPaint.setAlpha((int) (255.0f * floatValue));
                PinView.this.postInvalidate();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldBlink() {
        if (isCursorVisible() && isFocused()) {
            return true;
        }
        return false;
    }

    private void suspendBlink() {
        Blink blink = this.mBlink;
        if (blink != null) {
            blink.cancel();
            invalidateCursor(false);
        }
    }

    private void updateCenterPoint() {
        RectF rectF = this.mItemBorderRect;
        float abs = (Math.abs(rectF.width()) / 2.0f) + rectF.left;
        RectF rectF2 = this.mItemBorderRect;
        this.mItemCenterPoint.set(abs, (Math.abs(rectF2.height()) / 2.0f) + rectF2.top);
    }

    private void updateColors() {
        int currentTextColor;
        ColorStateList colorStateList = this.mLineColor;
        if (colorStateList != null) {
            currentTextColor = colorStateList.getColorForState(getDrawableState(), 0);
        } else {
            currentTextColor = getCurrentTextColor();
        }
        if (currentTextColor != this.mCurLineColor) {
            this.mCurLineColor = currentTextColor;
            invalidate();
        }
    }

    private void updateCursorHeight() {
        float textSize;
        float dpToPx = dpToPx(2.0f) * 2;
        if (this.mPinItemHeight - getTextSize() > dpToPx) {
            textSize = getTextSize() + dpToPx;
        } else {
            textSize = getTextSize();
        }
        this.mCursorHeight = textSize;
    }

    private void updateItemRectF(int i4) {
        float f5 = this.mLineWidth / 2.0f;
        int scrollX = getScrollX();
        WeakHashMap weakHashMap = au.alpha;
        int paddingStart = getPaddingStart() + scrollX;
        int i5 = this.mPinItemSpacing;
        int i10 = this.mPinItemWidth;
        float f10 = ((i5 + i10) * i4) + paddingStart + f5;
        if (i5 == 0 && i4 > 0) {
            f10 -= this.mLineWidth * i4;
        }
        float paddingTop = getPaddingTop() + getScrollY() + f5;
        this.mItemBorderRect.set(f10, paddingTop, (i10 + f10) - this.mLineWidth, (this.mPinItemHeight + paddingTop) - this.mLineWidth);
    }

    private void updatePaints() {
        this.mPaint.setColor(this.mCurLineColor);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(this.mLineWidth);
        getPaint().setColor(getCurrentTextColor());
    }

    private void updatePinBoxPath(int i4) {
        boolean z2;
        boolean z10;
        boolean z11;
        if (this.mPinItemSpacing != 0) {
            z11 = true;
            z10 = true;
        } else {
            if (i4 == 0 && i4 != this.mPinItemCount - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i4 == this.mPinItemCount - 1 && i4 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z2;
        }
        RectF rectF = this.mItemBorderRect;
        int i5 = this.mPinItemRadius;
        updateRoundRectPath(rectF, i5, i5, z11, z10);
    }

    private void updateRoundRectPath(RectF rectF, float f5, float f10, boolean z2, boolean z10) {
        updateRoundRectPath(rectF, f5, f10, z2, z10, z10, z2);
    }

    @Override // androidx.appcompat.widget.C0492z, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.mLineColor;
        if (colorStateList != null && !colorStateList.isStateful()) {
            return;
        }
        updateColors();
    }

    public int getCurrentLineColor() {
        return this.mCurLineColor;
    }

    public int getCursorColor() {
        return this.mCursorColor;
    }

    public int getCursorWidth() {
        return this.mCursorWidth;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public MovementMethod getDefaultMovementMethod() {
        return DefaultMovementMethod.getInstance();
    }

    public int getItemCount() {
        return this.mPinItemCount;
    }

    public int getItemHeight() {
        return this.mPinItemHeight;
    }

    public int getItemRadius() {
        return this.mPinItemRadius;
    }

    public int getItemSpacing() {
        return this.mPinItemSpacing;
    }

    public int getItemWidth() {
        return this.mPinItemWidth;
    }

    public ColorStateList getLineColors() {
        return this.mLineColor;
    }

    public int getLineWidth() {
        return this.mLineWidth;
    }

    @Override // android.widget.TextView
    public boolean isCursorVisible() {
        return this.isCursorVisible;
    }

    public boolean isPasswordHidden() {
        return this.isPasswordHidden;
    }

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resumeBlink();
    }

    @Override // androidx.appcompat.widget.C0492z, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        suspendBlink();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        updatePaints();
        drawPinView(canvas);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z2, int i4, Rect rect) {
        super.onFocusChanged(z2, i4, rect);
        if (z2) {
            moveSelectionToEnd();
            makeBlink();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int i10 = this.mPinItemHeight;
        if (mode != 1073741824) {
            int i11 = this.mPinItemCount;
            int i12 = (i11 * this.mPinItemWidth) + ((i11 - 1) * this.mPinItemSpacing);
            WeakHashMap weakHashMap = au.alpha;
            size = getPaddingStart() + getPaddingEnd() + i12;
            if (this.mPinItemSpacing == 0) {
                size -= (this.mPinItemCount - 1) * this.mLineWidth;
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingTop() + i10 + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onScreenStateChanged(int i4) {
        super.onScreenStateChanged(i4);
        if (i4 != 0) {
            if (i4 != 1) {
                return;
            }
            resumeBlink();
            return;
        }
        suspendBlink();
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i4, int i5) {
        super.onSelectionChanged(i4, i5);
        if (i5 != getText().length()) {
            moveSelectionToEnd();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        ValueAnimator valueAnimator;
        if (i4 != charSequence.length()) {
            moveSelectionToEnd();
        }
        makeBlink();
        if (this.isAnimationEnable && i10 - i5 > 0 && (valueAnimator = this.mDefaultAddAnimator) != null) {
            valueAnimator.end();
            this.mDefaultAddAnimator.start();
        }
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod == null) {
            this.mTransformed = getText().toString();
        } else {
            this.mTransformed = transformationMethod.getTransformation(getText(), this).toString();
        }
    }

    public void setAnimationEnable(boolean z2) {
        this.isAnimationEnable = z2;
    }

    public void setCursorColor(int i4) {
        this.mCursorColor = i4;
        if (isCursorVisible()) {
            invalidateCursor(true);
        }
    }

    @Override // android.widget.TextView
    public void setCursorVisible(boolean z2) {
        if (this.isCursorVisible != z2) {
            this.isCursorVisible = z2;
            invalidateCursor(z2);
            makeBlink();
        }
    }

    public void setCursorWidth(int i4) {
        this.mCursorWidth = i4;
        if (isCursorVisible()) {
            invalidateCursor(true);
        }
    }

    public void setHideLineWhenFilled(boolean z2) {
        this.mHideLineWhenFilled = z2;
    }

    @Override // android.widget.TextView
    public void setInputType(int i4) {
        super.setInputType(i4);
        this.isPasswordHidden = isPasswordInputType(getInputType());
    }

    public void setItemBackground(Drawable drawable) {
        this.mItemBackgroundResource = 0;
        this.mItemBackground = drawable;
        invalidate();
    }

    public void setItemBackgroundColor(int i4) {
        Drawable drawable = this.mItemBackground;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable.mutate()).setColor(i4);
            this.mItemBackgroundResource = 0;
        } else {
            setItemBackground(new ColorDrawable(i4));
        }
    }

    public void setItemBackgroundResources(int i4) {
        if (i4 != 0 && this.mItemBackgroundResource != i4) {
            return;
        }
        Resources resources = getResources();
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = k.alpha;
        Drawable drawable = resources.getDrawable(i4, theme);
        this.mItemBackground = drawable;
        setItemBackground(drawable);
        this.mItemBackgroundResource = i4;
    }

    public void setItemCount(int i4) {
        this.mPinItemCount = i4;
        setMaxLength(i4);
        requestLayout();
    }

    public void setItemHeight(int i4) {
        this.mPinItemHeight = i4;
        updateCursorHeight();
        requestLayout();
    }

    public void setItemRadius(int i4) {
        this.mPinItemRadius = i4;
        checkItemRadius();
        requestLayout();
    }

    public void setItemSpacing(int i4) {
        this.mPinItemSpacing = i4;
        requestLayout();
    }

    public void setItemWidth(int i4) {
        this.mPinItemWidth = i4;
        checkItemRadius();
        requestLayout();
    }

    public void setLineColor(int i4) {
        this.mLineColor = ColorStateList.valueOf(i4);
        updateColors();
    }

    public void setLineWidth(int i4) {
        this.mLineWidth = i4;
        checkItemRadius();
        requestLayout();
    }

    public void setPasswordHidden(boolean z2) {
        this.isPasswordHidden = z2;
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f5) {
        super.setTextSize(f5);
        updateCursorHeight();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i4) {
        super.setTypeface(typeface, i4);
    }

    public PinView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pinViewStyle);
    }

    private void updateRoundRectPath(RectF rectF, float f5, float f10, boolean z2, boolean z10, boolean z11, boolean z12) {
        this.mPath.reset();
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = (rectF.right - f11) - (f5 * 2.0f);
        float f14 = (rectF.bottom - f12) - (2.0f * f10);
        this.mPath.moveTo(f11, f12 + f10);
        if (z2) {
            float f15 = -f10;
            this.mPath.rQuadTo(0.0f, f15, f5, f15);
        } else {
            this.mPath.rLineTo(0.0f, -f10);
            this.mPath.rLineTo(f5, 0.0f);
        }
        this.mPath.rLineTo(f13, 0.0f);
        if (z10) {
            this.mPath.rQuadTo(f5, 0.0f, f5, f10);
        } else {
            this.mPath.rLineTo(f5, 0.0f);
            this.mPath.rLineTo(0.0f, f10);
        }
        this.mPath.rLineTo(0.0f, f14);
        if (z11) {
            this.mPath.rQuadTo(0.0f, f10, -f5, f10);
        } else {
            this.mPath.rLineTo(0.0f, f10);
            this.mPath.rLineTo(-f5, 0.0f);
        }
        this.mPath.rLineTo(-f13, 0.0f);
        if (z12) {
            float f16 = -f5;
            this.mPath.rQuadTo(f16, 0.0f, f16, -f10);
        } else {
            this.mPath.rLineTo(-f5, 0.0f);
            this.mPath.rLineTo(0.0f, -f10);
        }
        this.mPath.rLineTo(0.0f, -f14);
        this.mPath.close();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        TextPaint textPaint = this.mAnimatorTextPaint;
        if (textPaint != null) {
            textPaint.set(getPaint());
        }
    }

    public PinView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TextPaint textPaint = new TextPaint();
        this.mAnimatorTextPaint = textPaint;
        this.mCurLineColor = ShapeBuilder.DEFAULT_SHAPE_COLOR;
        this.mTextRect = new Rect();
        this.mItemBorderRect = new RectF();
        this.mItemLineRect = new RectF();
        this.mPath = new Path();
        this.mItemCenterPoint = new PointF();
        this.isAnimationEnable = false;
        Resources resources = getResources();
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        textPaint.set(getPaint());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PinView, i4, 0);
        this.mViewType = obtainStyledAttributes.getInt(R.styleable.PinView_viewType, 0);
        this.mPinItemCount = obtainStyledAttributes.getInt(R.styleable.PinView_itemCount, 4);
        int i5 = R.styleable.PinView_itemHeight;
        int i10 = R.dimen.pv_pin_view_item_size;
        this.mPinItemHeight = (int) obtainStyledAttributes.getDimension(i5, resources.getDimensionPixelSize(i10));
        this.mPinItemWidth = (int) obtainStyledAttributes.getDimension(R.styleable.PinView_itemWidth, resources.getDimensionPixelSize(i10));
        this.mPinItemSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PinView_itemSpacing, resources.getDimensionPixelSize(R.dimen.pv_pin_view_item_spacing));
        this.mPinItemRadius = (int) obtainStyledAttributes.getDimension(R.styleable.PinView_itemRadius, 0.0f);
        this.mLineWidth = (int) obtainStyledAttributes.getDimension(R.styleable.PinView_lineWidth, resources.getDimensionPixelSize(R.dimen.pv_pin_view_item_line_width));
        this.mLineColor = obtainStyledAttributes.getColorStateList(R.styleable.PinView_lineColor);
        this.isCursorVisible = obtainStyledAttributes.getBoolean(R.styleable.PinView_android_cursorVisible, true);
        this.mCursorColor = obtainStyledAttributes.getColor(R.styleable.PinView_cursorColor, getCurrentTextColor());
        this.mCursorWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PinView_cursorWidth, resources.getDimensionPixelSize(R.dimen.pv_pin_view_cursor_width));
        this.mItemBackground = obtainStyledAttributes.getDrawable(R.styleable.PinView_android_itemBackground);
        this.mHideLineWhenFilled = obtainStyledAttributes.getBoolean(R.styleable.PinView_hideLineWhenFilled, false);
        obtainStyledAttributes.recycle();
        ColorStateList colorStateList = this.mLineColor;
        if (colorStateList != null) {
            this.mCurLineColor = colorStateList.getDefaultColor();
        }
        updateCursorHeight();
        checkItemRadius();
        setMaxLength(this.mPinItemCount);
        paint.setStrokeWidth(this.mLineWidth);
        setupAnimator();
        setTransformationMethod(null);
        disableSelectionMenu();
        this.isPasswordHidden = isPasswordInputType(getInputType());
    }

    public void setLineColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.mLineColor = colorStateList;
        updateColors();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f5) {
        super.setTextSize(i4, f5);
        updateCursorHeight();
    }
}
