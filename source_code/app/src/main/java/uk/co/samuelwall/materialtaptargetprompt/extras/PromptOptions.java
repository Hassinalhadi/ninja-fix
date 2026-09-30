package uk.co.samuelwall.materialtaptargetprompt.extras;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;
import uk.co.samuelwall.materialtaptargetprompt.R;
import uk.co.samuelwall.materialtaptargetprompt.ResourceFinder;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptOptions;
import uk.co.samuelwall.materialtaptargetprompt.extras.backgrounds.CirclePromptBackground;
import uk.co.samuelwall.materialtaptargetprompt.extras.focals.CirclePromptFocal;

/* loaded from: classes.dex */
public class PromptOptions<T extends PromptOptions> {
    private Interpolator mAnimationInterpolator;
    private boolean mCaptureTouchEventOnFocal;
    private boolean mCaptureTouchEventOutsidePrompt;
    private View mClipToView;
    private String mContentDescription;
    private float mFocalPadding;
    private float mFocalRadius;
    private boolean mHasIconDrawableTint;
    private Drawable mIconDrawable;
    private int mIconDrawableColourFilter;
    private float mMaxTextWidth;
    private CharSequence mPrimaryText;
    private float mPrimaryTextSize;
    private Typeface mPrimaryTextTypeface;
    private int mPrimaryTextTypefaceStyle;
    private MaterialTapTargetPrompt.PromptStateChangeListener mPromptStateChangeListener;
    private ResourceFinder mResourceFinder;
    private CharSequence mSecondaryText;
    private float mSecondaryTextSize;
    private Typeface mSecondaryTextTypeface;
    private int mSecondaryTextTypefaceStyle;
    private MaterialTapTargetPrompt.PromptStateChangeListener mSequencePromptStateChangeListener;
    private PointF mTargetPosition;
    private View mTargetRenderView;
    private boolean mTargetSet;
    private View mTargetView;
    private float mTextPadding;
    private float mTextSeparation;
    private int mPrimaryTextColour = -1;
    private int mSecondaryTextColour = Color.argb(179, 255, 255, 255);
    private int mBackgroundColour = Color.argb(244, 63, 81, 181);
    private int mFocalColour = -1;
    private boolean mBackButtonDismissEnabled = true;
    private boolean mIgnoreStatusBar = false;
    private boolean mAutoDismiss = true;
    private boolean mAutoFinish = true;
    private ColorStateList mIconDrawableTintList = null;
    private PorterDuff.Mode mIconDrawableTintMode = PorterDuff.Mode.MULTIPLY;
    private boolean mIdleAnimationEnabled = true;
    private int mPrimaryTextGravity = 8388611;
    private int mSecondaryTextGravity = 8388611;
    private PromptBackground mPromptBackground = new CirclePromptBackground();
    private PromptFocal mPromptFocal = new CirclePromptFocal();
    private PromptText mPromptText = new PromptText();

    public PromptOptions(ResourceFinder resourceFinder) {
        this.mResourceFinder = resourceFinder;
        float f5 = resourceFinder.getResources().getDisplayMetrics().density;
        this.mFocalRadius = 44.0f * f5;
        this.mPrimaryTextSize = 22.0f * f5;
        this.mSecondaryTextSize = 18.0f * f5;
        this.mMaxTextWidth = 400.0f * f5;
        this.mTextPadding = 40.0f * f5;
        this.mFocalPadding = 20.0f * f5;
        this.mTextSeparation = f5 * 16.0f;
    }

    public MaterialTapTargetPrompt create() {
        if (this.mTargetSet) {
            if (this.mPrimaryText != null || this.mSecondaryText != null) {
                MaterialTapTargetPrompt createDefault = MaterialTapTargetPrompt.createDefault(this);
                if (this.mAnimationInterpolator == null) {
                    this.mAnimationInterpolator = new AccelerateDecelerateInterpolator();
                }
                Drawable drawable = this.mIconDrawable;
                if (drawable != null) {
                    drawable.mutate();
                    Drawable drawable2 = this.mIconDrawable;
                    drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.mIconDrawable.getIntrinsicHeight());
                    if (this.mHasIconDrawableTint) {
                        ColorStateList colorStateList = this.mIconDrawableTintList;
                        if (colorStateList != null) {
                            this.mIconDrawable.setTintList(colorStateList);
                        } else {
                            this.mIconDrawable.setColorFilter(this.mIconDrawableColourFilter, this.mIconDrawableTintMode);
                            this.mIconDrawable.setAlpha(Color.alpha(this.mIconDrawableColourFilter));
                        }
                    }
                }
                this.mPromptBackground.setColour(getBackgroundColour());
                this.mPromptFocal.setColour(getFocalColour());
                this.mPromptFocal.setRippleAlpha(150);
                this.mPromptFocal.setDrawRipple(getIdleAnimationEnabled());
                PromptFocal promptFocal = this.mPromptFocal;
                if (promptFocal instanceof CirclePromptFocal) {
                    ((CirclePromptFocal) promptFocal).setRadius(getFocalRadius());
                }
                return createDefault;
            }
            return null;
        }
        return null;
    }

    public Interpolator getAnimationInterpolator() {
        return this.mAnimationInterpolator;
    }

    public boolean getAutoDismiss() {
        return this.mAutoDismiss;
    }

    public boolean getAutoFinish() {
        return this.mAutoFinish;
    }

    public boolean getBackButtonDismissEnabled() {
        return this.mBackButtonDismissEnabled;
    }

    public int getBackgroundColour() {
        return this.mBackgroundColour;
    }

    public boolean getCaptureTouchEventOnFocal() {
        return this.mCaptureTouchEventOnFocal;
    }

    public boolean getCaptureTouchEventOutsidePrompt() {
        return this.mCaptureTouchEventOutsidePrompt;
    }

    public View getClipToView() {
        return this.mClipToView;
    }

    public String getContentDescription() {
        String str = this.mContentDescription;
        if (str != null) {
            return str;
        }
        return String.format("%s. %s", this.mPrimaryText, this.mSecondaryText);
    }

    public int getFocalColour() {
        return this.mFocalColour;
    }

    public float getFocalPadding() {
        return this.mFocalPadding;
    }

    public float getFocalRadius() {
        return this.mFocalRadius;
    }

    public Drawable getIconDrawable() {
        return this.mIconDrawable;
    }

    public boolean getIdleAnimationEnabled() {
        return this.mIdleAnimationEnabled;
    }

    public boolean getIgnoreStatusBar() {
        return this.mIgnoreStatusBar;
    }

    public float getMaxTextWidth() {
        return this.mMaxTextWidth;
    }

    public CharSequence getPrimaryText() {
        return this.mPrimaryText;
    }

    public int getPrimaryTextColour() {
        return this.mPrimaryTextColour;
    }

    public int getPrimaryTextGravity() {
        return this.mPrimaryTextGravity;
    }

    public float getPrimaryTextSize() {
        return this.mPrimaryTextSize;
    }

    public Typeface getPrimaryTextTypeface() {
        return this.mPrimaryTextTypeface;
    }

    public int getPrimaryTextTypefaceStyle() {
        return this.mPrimaryTextTypefaceStyle;
    }

    public PromptBackground getPromptBackground() {
        return this.mPromptBackground;
    }

    public PromptFocal getPromptFocal() {
        return this.mPromptFocal;
    }

    public PromptText getPromptText() {
        return this.mPromptText;
    }

    public ResourceFinder getResourceFinder() {
        return this.mResourceFinder;
    }

    public CharSequence getSecondaryText() {
        return this.mSecondaryText;
    }

    public int getSecondaryTextColour() {
        return this.mSecondaryTextColour;
    }

    public int getSecondaryTextGravity() {
        return this.mSecondaryTextGravity;
    }

    public float getSecondaryTextSize() {
        return this.mSecondaryTextSize;
    }

    public Typeface getSecondaryTextTypeface() {
        return this.mSecondaryTextTypeface;
    }

    public int getSecondaryTextTypefaceStyle() {
        return this.mSecondaryTextTypefaceStyle;
    }

    public PointF getTargetPosition() {
        return this.mTargetPosition;
    }

    public View getTargetRenderView() {
        return this.mTargetRenderView;
    }

    public View getTargetView() {
        return this.mTargetView;
    }

    public float getTextPadding() {
        return this.mTextPadding;
    }

    public float getTextSeparation() {
        return this.mTextSeparation;
    }

    public boolean isTargetSet() {
        return this.mTargetSet;
    }

    public void load(int i4) {
        if (i4 == 0) {
            TypedValue typedValue = new TypedValue();
            this.mResourceFinder.getTheme().resolveAttribute(R.attr.MaterialTapTargetPromptTheme, typedValue, true);
            i4 = typedValue.resourceId;
        }
        TypedArray obtainStyledAttributes = this.mResourceFinder.obtainStyledAttributes(i4, R.styleable.PromptView);
        this.mPrimaryTextColour = obtainStyledAttributes.getColor(R.styleable.PromptView_mttp_primaryTextColour, this.mPrimaryTextColour);
        this.mSecondaryTextColour = obtainStyledAttributes.getColor(R.styleable.PromptView_mttp_secondaryTextColour, this.mSecondaryTextColour);
        this.mPrimaryText = obtainStyledAttributes.getString(R.styleable.PromptView_mttp_primaryText);
        this.mSecondaryText = obtainStyledAttributes.getString(R.styleable.PromptView_mttp_secondaryText);
        this.mBackgroundColour = obtainStyledAttributes.getColor(R.styleable.PromptView_mttp_backgroundColour, this.mBackgroundColour);
        this.mFocalColour = obtainStyledAttributes.getColor(R.styleable.PromptView_mttp_focalColour, this.mFocalColour);
        this.mFocalRadius = obtainStyledAttributes.getDimension(R.styleable.PromptView_mttp_focalRadius, this.mFocalRadius);
        this.mPrimaryTextSize = obtainStyledAttributes.getDimension(R.styleable.PromptView_mttp_primaryTextSize, this.mPrimaryTextSize);
        this.mSecondaryTextSize = obtainStyledAttributes.getDimension(R.styleable.PromptView_mttp_secondaryTextSize, this.mSecondaryTextSize);
        this.mMaxTextWidth = obtainStyledAttributes.getDimension(R.styleable.PromptView_mttp_maxTextWidth, this.mMaxTextWidth);
        this.mTextPadding = obtainStyledAttributes.getDimension(R.styleable.PromptView_mttp_textPadding, this.mTextPadding);
        this.mFocalPadding = obtainStyledAttributes.getDimension(R.styleable.PromptView_mttp_focalToTextPadding, this.mFocalPadding);
        this.mTextSeparation = obtainStyledAttributes.getDimension(R.styleable.PromptView_mttp_textSeparation, this.mTextSeparation);
        this.mAutoDismiss = obtainStyledAttributes.getBoolean(R.styleable.PromptView_mttp_autoDismiss, this.mAutoDismiss);
        this.mAutoFinish = obtainStyledAttributes.getBoolean(R.styleable.PromptView_mttp_autoFinish, this.mAutoFinish);
        this.mCaptureTouchEventOutsidePrompt = obtainStyledAttributes.getBoolean(R.styleable.PromptView_mttp_captureTouchEventOutsidePrompt, this.mCaptureTouchEventOutsidePrompt);
        this.mCaptureTouchEventOnFocal = obtainStyledAttributes.getBoolean(R.styleable.PromptView_mttp_captureTouchEventOnFocal, this.mCaptureTouchEventOnFocal);
        this.mPrimaryTextTypefaceStyle = obtainStyledAttributes.getInt(R.styleable.PromptView_mttp_primaryTextStyle, this.mPrimaryTextTypefaceStyle);
        this.mSecondaryTextTypefaceStyle = obtainStyledAttributes.getInt(R.styleable.PromptView_mttp_secondaryTextStyle, this.mSecondaryTextTypefaceStyle);
        this.mPrimaryTextTypeface = PromptUtils.setTypefaceFromAttrs(obtainStyledAttributes.getString(R.styleable.PromptView_mttp_primaryTextFontFamily), obtainStyledAttributes.getInt(R.styleable.PromptView_mttp_primaryTextTypeface, 0), this.mPrimaryTextTypefaceStyle);
        this.mSecondaryTextTypeface = PromptUtils.setTypefaceFromAttrs(obtainStyledAttributes.getString(R.styleable.PromptView_mttp_secondaryTextFontFamily), obtainStyledAttributes.getInt(R.styleable.PromptView_mttp_secondaryTextTypeface, 0), this.mSecondaryTextTypefaceStyle);
        this.mContentDescription = obtainStyledAttributes.getString(R.styleable.PromptView_mttp_contentDescription);
        this.mIconDrawableColourFilter = obtainStyledAttributes.getColor(R.styleable.PromptView_mttp_iconColourFilter, this.mBackgroundColour);
        this.mIconDrawableTintList = obtainStyledAttributes.getColorStateList(R.styleable.PromptView_mttp_iconTint);
        this.mIconDrawableTintMode = PromptUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.PromptView_mttp_iconTintMode, -1), this.mIconDrawableTintMode);
        this.mHasIconDrawableTint = true;
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.PromptView_mttp_target, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            View findViewById = this.mResourceFinder.findViewById(resourceId);
            this.mTargetView = findViewById;
            if (findViewById != null) {
                this.mTargetSet = true;
            }
        }
        View findViewById2 = this.mResourceFinder.findViewById(android.R.id.content);
        if (findViewById2 != null) {
            this.mClipToView = (View) findViewById2.getParent();
        }
    }

    public void onExtraPromptStateChanged(MaterialTapTargetPrompt materialTapTargetPrompt, int i4) {
        MaterialTapTargetPrompt.PromptStateChangeListener promptStateChangeListener = this.mSequencePromptStateChangeListener;
        if (promptStateChangeListener != null) {
            promptStateChangeListener.onPromptStateChanged(materialTapTargetPrompt, i4);
        }
    }

    public void onPromptStateChanged(MaterialTapTargetPrompt materialTapTargetPrompt, int i4) {
        MaterialTapTargetPrompt.PromptStateChangeListener promptStateChangeListener = this.mPromptStateChangeListener;
        if (promptStateChangeListener != null) {
            promptStateChangeListener.onPromptStateChanged(materialTapTargetPrompt, i4);
        }
    }

    public T setAnimationInterpolator(Interpolator interpolator) {
        this.mAnimationInterpolator = interpolator;
        return this;
    }

    public T setAutoDismiss(boolean z2) {
        this.mAutoDismiss = z2;
        return this;
    }

    public T setAutoFinish(boolean z2) {
        this.mAutoFinish = z2;
        return this;
    }

    public T setBackButtonDismissEnabled(boolean z2) {
        this.mBackButtonDismissEnabled = z2;
        return this;
    }

    public T setBackgroundColour(int i4) {
        this.mBackgroundColour = i4;
        return this;
    }

    public T setCaptureTouchEventOnFocal(boolean z2) {
        this.mCaptureTouchEventOnFocal = z2;
        return this;
    }

    public T setCaptureTouchEventOutsidePrompt(boolean z2) {
        this.mCaptureTouchEventOutsidePrompt = z2;
        return this;
    }

    public T setClipToView(View view) {
        this.mClipToView = view;
        return this;
    }

    public T setContentDescription(int i4) {
        this.mContentDescription = this.mResourceFinder.getString(i4);
        return this;
    }

    public T setFocalColour(int i4) {
        this.mFocalColour = i4;
        return this;
    }

    public T setFocalPadding(int i4) {
        this.mFocalPadding = this.mResourceFinder.getResources().getDimension(i4);
        return this;
    }

    public T setFocalRadius(int i4) {
        this.mFocalRadius = this.mResourceFinder.getResources().getDimension(i4);
        return this;
    }

    public T setIcon(int i4) {
        this.mIconDrawable = this.mResourceFinder.getDrawable(i4);
        return this;
    }

    public T setIconDrawable(Drawable drawable) {
        this.mIconDrawable = drawable;
        return this;
    }

    public T setIconDrawableColourFilter(int i4) {
        this.mIconDrawableColourFilter = i4;
        this.mIconDrawableTintList = null;
        this.mHasIconDrawableTint = true;
        return this;
    }

    public T setIconDrawableTintList(ColorStateList colorStateList) {
        boolean z2;
        this.mIconDrawableTintList = colorStateList;
        if (colorStateList != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mHasIconDrawableTint = z2;
        return this;
    }

    public T setIconDrawableTintMode(PorterDuff.Mode mode) {
        this.mIconDrawableTintMode = mode;
        if (mode == null) {
            this.mIconDrawableTintList = null;
            this.mHasIconDrawableTint = false;
        }
        return this;
    }

    public T setIdleAnimationEnabled(boolean z2) {
        this.mIdleAnimationEnabled = z2;
        return this;
    }

    public T setIgnoreStatusBar(boolean z2) {
        this.mIgnoreStatusBar = z2;
        return this;
    }

    public T setMaxTextWidth(int i4) {
        this.mMaxTextWidth = this.mResourceFinder.getResources().getDimension(i4);
        return this;
    }

    public T setPrimaryText(int i4) {
        this.mPrimaryText = this.mResourceFinder.getString(i4);
        return this;
    }

    public T setPrimaryTextColour(int i4) {
        this.mPrimaryTextColour = i4;
        return this;
    }

    public T setPrimaryTextGravity(int i4) {
        this.mPrimaryTextGravity = i4;
        return this;
    }

    public T setPrimaryTextSize(float f5) {
        this.mPrimaryTextSize = f5;
        return this;
    }

    public T setPrimaryTextTypeface(Typeface typeface) {
        return setPrimaryTextTypeface(typeface, 0);
    }

    public T setPromptBackground(PromptBackground promptBackground) {
        this.mPromptBackground = promptBackground;
        return this;
    }

    public T setPromptFocal(PromptFocal promptFocal) {
        this.mPromptFocal = promptFocal;
        return this;
    }

    public T setPromptStateChangeListener(MaterialTapTargetPrompt.PromptStateChangeListener promptStateChangeListener) {
        this.mPromptStateChangeListener = promptStateChangeListener;
        return this;
    }

    public T setPromptText(PromptText promptText) {
        this.mPromptText = promptText;
        return this;
    }

    public T setSecondaryText(int i4) {
        this.mSecondaryText = this.mResourceFinder.getString(i4);
        return this;
    }

    public T setSecondaryTextColour(int i4) {
        this.mSecondaryTextColour = i4;
        return this;
    }

    public T setSecondaryTextGravity(int i4) {
        this.mSecondaryTextGravity = i4;
        return this;
    }

    public T setSecondaryTextSize(int i4) {
        this.mSecondaryTextSize = this.mResourceFinder.getResources().getDimension(i4);
        return this;
    }

    public T setSecondaryTextTypeface(Typeface typeface) {
        return setSecondaryTextTypeface(typeface, 0);
    }

    public void setSequenceListener(MaterialTapTargetPrompt.PromptStateChangeListener promptStateChangeListener) {
        this.mSequencePromptStateChangeListener = promptStateChangeListener;
    }

    public T setTarget(View view) {
        this.mTargetView = view;
        this.mTargetPosition = null;
        this.mTargetSet = view != null;
        return this;
    }

    public T setTargetRenderView(View view) {
        this.mTargetRenderView = view;
        return this;
    }

    public T setTextGravity(int i4) {
        this.mPrimaryTextGravity = i4;
        this.mSecondaryTextGravity = i4;
        return this;
    }

    public T setTextPadding(int i4) {
        this.mTextPadding = this.mResourceFinder.getResources().getDimension(i4);
        return this;
    }

    public T setTextSeparation(int i4) {
        this.mTextSeparation = this.mResourceFinder.getResources().getDimension(i4);
        return this;
    }

    public MaterialTapTargetPrompt show() {
        MaterialTapTargetPrompt create = create();
        if (create != null) {
            create.show();
        }
        return create;
    }

    public MaterialTapTargetPrompt showFor(long j5) {
        MaterialTapTargetPrompt create = create();
        if (create != null) {
            create.showFor(j5);
        }
        return create;
    }

    public T setContentDescription(String str) {
        this.mContentDescription = str;
        return this;
    }

    public T setFocalPadding(float f5) {
        this.mFocalPadding = f5;
        return this;
    }

    public T setFocalRadius(float f5) {
        this.mFocalRadius = f5;
        return this;
    }

    public T setMaxTextWidth(float f5) {
        this.mMaxTextWidth = f5;
        return this;
    }

    public T setPrimaryText(String str) {
        this.mPrimaryText = str;
        return this;
    }

    public T setPrimaryTextSize(int i4) {
        this.mPrimaryTextSize = this.mResourceFinder.getResources().getDimension(i4);
        return this;
    }

    public T setPrimaryTextTypeface(Typeface typeface, int i4) {
        this.mPrimaryTextTypeface = typeface;
        this.mPrimaryTextTypefaceStyle = i4;
        return this;
    }

    public T setSecondaryText(String str) {
        this.mSecondaryText = str;
        return this;
    }

    public T setSecondaryTextSize(float f5) {
        this.mSecondaryTextSize = f5;
        return this;
    }

    public T setSecondaryTextTypeface(Typeface typeface, int i4) {
        this.mSecondaryTextTypeface = typeface;
        this.mSecondaryTextTypefaceStyle = i4;
        return this;
    }

    public T setTextPadding(float f5) {
        this.mTextPadding = f5;
        return this;
    }

    public T setTextSeparation(float f5) {
        this.mTextSeparation = f5;
        return this;
    }

    public T setPrimaryText(CharSequence charSequence) {
        this.mPrimaryText = charSequence;
        return this;
    }

    public T setSecondaryText(CharSequence charSequence) {
        this.mSecondaryText = charSequence;
        return this;
    }

    public T setTarget(int i4) {
        View findViewById = this.mResourceFinder.findViewById(i4);
        this.mTargetView = findViewById;
        this.mTargetPosition = null;
        this.mTargetSet = findViewById != null;
        return this;
    }

    public T setTarget(float f5, float f10) {
        this.mTargetView = null;
        this.mTargetPosition = new PointF(f5, f10);
        this.mTargetSet = true;
        return this;
    }
}
