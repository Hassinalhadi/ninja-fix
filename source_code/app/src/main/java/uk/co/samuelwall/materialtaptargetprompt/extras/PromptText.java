package uk.co.samuelwall.materialtaptargetprompt.extras;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public class PromptText implements PromptUIElement {
    Rect mClipBounds;
    boolean mClipToBounds;
    TextPaint mPaintPrimaryText;
    TextPaint mPaintSecondaryText;
    Layout.Alignment mPrimaryTextAlignment;
    Layout mPrimaryTextLayout;
    float mPrimaryTextLeft;
    float mPrimaryTextLeftChange;
    float mPrimaryTextTop;
    Layout.Alignment mSecondaryTextAlignment;
    Layout mSecondaryTextLayout;
    float mSecondaryTextLeft;
    float mSecondaryTextLeftChange;
    float mSecondaryTextOffsetTop;
    RectF mTextBounds = new RectF();

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public boolean contains(float f5, float f10) {
        return this.mTextBounds.contains(f5, f10);
    }

    public void createTextLayout(PromptOptions promptOptions, float f5, float f10) {
        if (promptOptions.getPrimaryText() != null) {
            this.mPrimaryTextLayout = PromptUtils.createStaticTextLayout(promptOptions.getPrimaryText(), this.mPaintPrimaryText, (int) f5, this.mPrimaryTextAlignment, f10);
        } else {
            this.mPrimaryTextLayout = null;
        }
        if (promptOptions.getSecondaryText() != null) {
            this.mSecondaryTextLayout = PromptUtils.createStaticTextLayout(promptOptions.getSecondaryText(), this.mPaintSecondaryText, (int) f5, this.mSecondaryTextAlignment, f10);
        } else {
            this.mSecondaryTextLayout = null;
        }
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public void draw(Canvas canvas) {
        canvas.translate(this.mPrimaryTextLeft - this.mPrimaryTextLeftChange, this.mPrimaryTextTop);
        Layout layout = this.mPrimaryTextLayout;
        if (layout != null) {
            layout.draw(canvas);
        }
        if (this.mSecondaryTextLayout != null) {
            canvas.translate(((-(this.mPrimaryTextLeft - this.mPrimaryTextLeftChange)) + this.mSecondaryTextLeft) - this.mSecondaryTextLeftChange, this.mSecondaryTextOffsetTop);
            this.mSecondaryTextLayout.draw(canvas);
        }
    }

    public RectF getBounds() {
        return this.mTextBounds;
    }

    public void prepare(PromptOptions promptOptions, boolean z2, Rect rect) {
        boolean z10;
        Rect rect2;
        int left;
        int right;
        float f5;
        this.mClipToBounds = z2;
        this.mClipBounds = rect;
        CharSequence primaryText = promptOptions.getPrimaryText();
        boolean z11 = true;
        if (primaryText != null) {
            this.mPaintPrimaryText = new TextPaint();
            int primaryTextColour = promptOptions.getPrimaryTextColour();
            this.mPaintPrimaryText.setColor(primaryTextColour);
            this.mPaintPrimaryText.setAlpha(Color.alpha(primaryTextColour));
            this.mPaintPrimaryText.setAntiAlias(true);
            this.mPaintPrimaryText.setTextSize(promptOptions.getPrimaryTextSize());
            PromptUtils.setTypeface(this.mPaintPrimaryText, promptOptions.getPrimaryTextTypeface(), promptOptions.getPrimaryTextTypefaceStyle());
            this.mPrimaryTextAlignment = PromptUtils.getTextAlignment(promptOptions.getResourceFinder().getResources(), promptOptions.getPrimaryTextGravity(), primaryText);
        }
        CharSequence secondaryText = promptOptions.getSecondaryText();
        if (secondaryText != null) {
            this.mPaintSecondaryText = new TextPaint();
            int secondaryTextColour = promptOptions.getSecondaryTextColour();
            this.mPaintSecondaryText.setColor(secondaryTextColour);
            this.mPaintSecondaryText.setAlpha(Color.alpha(secondaryTextColour));
            this.mPaintSecondaryText.setAntiAlias(true);
            this.mPaintSecondaryText.setTextSize(promptOptions.getSecondaryTextSize());
            PromptUtils.setTypeface(this.mPaintSecondaryText, promptOptions.getSecondaryTextTypeface(), promptOptions.getSecondaryTextTypefaceStyle());
            this.mSecondaryTextAlignment = PromptUtils.getTextAlignment(promptOptions.getResourceFinder().getResources(), promptOptions.getSecondaryTextGravity(), secondaryText);
        }
        RectF bounds = promptOptions.getPromptFocal().getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        if (centerY > rect.centerY()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (centerX <= rect.centerX()) {
            z11 = false;
        }
        float maxTextWidth = promptOptions.getMaxTextWidth();
        if (z2) {
            rect2 = rect;
        } else {
            rect2 = null;
        }
        float calculateMaxWidth = PromptUtils.calculateMaxWidth(maxTextWidth, rect2, promptOptions.getResourceFinder().getPromptParentView().getWidth(), promptOptions.getTextPadding());
        createTextLayout(promptOptions, calculateMaxWidth, 1.0f);
        float max = Math.max(PromptUtils.calculateMaxTextWidth(this.mPrimaryTextLayout), PromptUtils.calculateMaxTextWidth(this.mSecondaryTextLayout));
        float focalPadding = promptOptions.getFocalPadding();
        float textPadding = promptOptions.getTextPadding();
        if (PromptUtils.containsInset(rect, (int) (promptOptions.getResourceFinder().getResources().getDisplayMetrics().density * 88.0f), (int) centerX, (int) centerY)) {
            this.mPrimaryTextLeft = rect.left;
            float min = Math.min(max, calculateMaxWidth);
            if (z11) {
                this.mPrimaryTextLeft = (centerX - min) + focalPadding;
            } else {
                this.mPrimaryTextLeft = (centerX - min) - focalPadding;
            }
            float f10 = this.mPrimaryTextLeft;
            int i4 = rect.left;
            if (f10 < i4 + textPadding) {
                this.mPrimaryTextLeft = i4 + textPadding;
            }
            float f11 = this.mPrimaryTextLeft + min;
            int i5 = rect.right;
            if (f11 > i5 - textPadding) {
                this.mPrimaryTextLeft = (i5 - textPadding) - min;
            }
        } else if (z11) {
            if (z2) {
                right = rect.right;
            } else {
                right = promptOptions.getResourceFinder().getPromptParentView().getRight();
            }
            this.mPrimaryTextLeft = (right - textPadding) - max;
        } else {
            if (z2) {
                left = rect.left;
            } else {
                left = promptOptions.getResourceFinder().getPromptParentView().getLeft();
            }
            this.mPrimaryTextLeft = left + textPadding;
        }
        if (z10) {
            float f12 = bounds.top - focalPadding;
            this.mPrimaryTextTop = f12;
            if (this.mPrimaryTextLayout != null) {
                this.mPrimaryTextTop = f12 - r14.getHeight();
            }
        } else {
            this.mPrimaryTextTop = bounds.bottom + focalPadding;
        }
        Layout layout = this.mPrimaryTextLayout;
        if (layout != null) {
            f5 = layout.getHeight();
        } else {
            f5 = 0.0f;
        }
        Layout layout2 = this.mSecondaryTextLayout;
        if (layout2 != null) {
            float height = layout2.getHeight();
            if (z10) {
                float f13 = this.mPrimaryTextTop - height;
                this.mPrimaryTextTop = f13;
                if (this.mPrimaryTextLayout != null) {
                    this.mPrimaryTextTop = f13 - promptOptions.getTextSeparation();
                }
            }
            if (this.mPrimaryTextLayout != null) {
                this.mSecondaryTextOffsetTop = promptOptions.getTextSeparation() + f5;
            }
            f5 = this.mSecondaryTextOffsetTop + height;
        }
        this.mSecondaryTextLeft = this.mPrimaryTextLeft;
        this.mPrimaryTextLeftChange = 0.0f;
        this.mSecondaryTextLeftChange = 0.0f;
        float f14 = calculateMaxWidth - max;
        if (PromptUtils.isRtlText(this.mPrimaryTextLayout, promptOptions.getResourceFinder().getResources())) {
            this.mPrimaryTextLeftChange = f14;
        }
        if (PromptUtils.isRtlText(this.mSecondaryTextLayout, promptOptions.getResourceFinder().getResources())) {
            this.mSecondaryTextLeftChange = f14;
        }
        RectF rectF = this.mTextBounds;
        float f15 = this.mPrimaryTextLeft;
        rectF.left = f15;
        float f16 = this.mPrimaryTextTop;
        rectF.top = f16;
        rectF.right = f15 + max;
        rectF.bottom = f16 + f5;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.extras.PromptUIElement
    public void update(PromptOptions promptOptions, float f5, float f10) {
        Rect rect;
        float maxTextWidth = promptOptions.getMaxTextWidth();
        if (this.mClipToBounds) {
            rect = this.mClipBounds;
        } else {
            rect = null;
        }
        createTextLayout(promptOptions, PromptUtils.calculateMaxWidth(maxTextWidth, rect, promptOptions.getResourceFinder().getPromptParentView().getWidth(), promptOptions.getTextPadding()), f10);
    }
}
