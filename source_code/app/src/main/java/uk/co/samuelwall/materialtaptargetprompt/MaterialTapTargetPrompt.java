package uk.co.samuelwall.materialtaptargetprompt;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;
import androidx.fragment.app.ai;
import ga.as;
import t0.ViewTreeObserverOnGlobalLayoutListenerC2920j;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptBackground;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptOptions;
import uk.co.samuelwall.materialtaptargetprompt.extras.PromptText;

/* loaded from: classes.dex */
public class MaterialTapTargetPrompt {
    public static final int STATE_BACK_BUTTON_PRESSED = 10;
    public static final int STATE_DISMISSED = 6;
    public static final int STATE_DISMISSING = 5;
    public static final int STATE_FINISHED = 4;
    public static final int STATE_FINISHING = 7;
    public static final int STATE_FOCAL_PRESSED = 3;
    public static final int STATE_NON_FOCAL_PRESSED = 8;
    public static final int STATE_NOT_SHOWN = 0;
    public static final int STATE_REVEALED = 2;
    public static final int STATE_REVEALING = 1;
    public static final int STATE_SHOW_FOR_TIMEOUT = 9;
    ValueAnimator mAnimationCurrent;
    ValueAnimator mAnimationFocalBreathing;
    ValueAnimator mAnimationFocalRipple;
    float mFocalRippleProgress;
    final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    int mState;
    final float mStatusBarHeight;
    final Runnable mTimeoutRunnable = new as(13, this);
    PromptView mView;

    /* renamed from: uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements PromptView.PromptTouchedListener {
        public AnonymousClass1() {
        }

        @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.PromptView.PromptTouchedListener
        public void onBackButtonPressed() {
            if (!MaterialTapTargetPrompt.this.isDismissing()) {
                MaterialTapTargetPrompt.this.onPromptStateChanged(10);
                MaterialTapTargetPrompt.this.onPromptStateChanged(8);
                if (MaterialTapTargetPrompt.this.mView.mPromptOptions.getAutoDismiss()) {
                    MaterialTapTargetPrompt.this.dismiss();
                }
            }
        }

        @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.PromptView.PromptTouchedListener
        public void onFocalPressed() {
            if (!MaterialTapTargetPrompt.this.isDismissing()) {
                MaterialTapTargetPrompt.this.onPromptStateChanged(3);
                if (MaterialTapTargetPrompt.this.mView.mPromptOptions.getAutoFinish()) {
                    MaterialTapTargetPrompt.this.finish();
                }
            }
        }

        @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.PromptView.PromptTouchedListener
        public void onNonFocalPressed() {
            if (!MaterialTapTargetPrompt.this.isDismissing()) {
                MaterialTapTargetPrompt.this.onPromptStateChanged(8);
                if (MaterialTapTargetPrompt.this.mView.mPromptOptions.getAutoDismiss()) {
                    MaterialTapTargetPrompt.this.dismiss();
                }
            }
        }
    }

    /* renamed from: uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends AnimatorListener {
        public AnonymousClass2() {
        }

        @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.AnimatorListener, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MaterialTapTargetPrompt.this.cleanUpPrompt(4);
            MaterialTapTargetPrompt.this.mView.sendAccessibilityEvent(32);
        }
    }

    /* renamed from: uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 extends AnimatorListener {
        public AnonymousClass3() {
        }

        @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.AnimatorListener, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MaterialTapTargetPrompt.this.cleanUpPrompt(6);
            MaterialTapTargetPrompt.this.mView.sendAccessibilityEvent(32);
        }
    }

    /* renamed from: uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt$4 */
    /* loaded from: classes.dex */
    public class AnonymousClass4 extends AnimatorListener {
        public AnonymousClass4() {
        }

        @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.AnimatorListener, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            animator.removeAllListeners();
            MaterialTapTargetPrompt.this.updateAnimation(1.0f, 1.0f);
            MaterialTapTargetPrompt.this.cleanUpAnimation();
            if (MaterialTapTargetPrompt.this.mView.mPromptOptions.getIdleAnimationEnabled()) {
                MaterialTapTargetPrompt.this.startIdleAnimations();
            }
            MaterialTapTargetPrompt.this.onPromptStateChanged(2);
            MaterialTapTargetPrompt.this.mView.requestFocus();
            MaterialTapTargetPrompt.this.mView.sendAccessibilityEvent(8);
        }
    }

    /* renamed from: uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt$5 */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements ValueAnimator.AnimatorUpdateListener {
        boolean direction = true;

        public AnonymousClass5() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z2;
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            boolean z10 = this.direction;
            MaterialTapTargetPrompt materialTapTargetPrompt = MaterialTapTargetPrompt.this;
            float f5 = materialTapTargetPrompt.mFocalRippleProgress;
            if (floatValue < f5 && z10) {
                z2 = false;
            } else if (floatValue > f5 && !z10) {
                z2 = true;
            } else {
                z2 = z10;
            }
            if (z2 != z10 && !z2) {
                materialTapTargetPrompt.mAnimationFocalRipple.start();
            }
            this.direction = z2;
            MaterialTapTargetPrompt materialTapTargetPrompt2 = MaterialTapTargetPrompt.this;
            materialTapTargetPrompt2.mFocalRippleProgress = floatValue;
            materialTapTargetPrompt2.mView.mPromptOptions.getPromptFocal().update(MaterialTapTargetPrompt.this.mView.mPromptOptions, floatValue, 1.0f);
            MaterialTapTargetPrompt.this.mView.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public static class AnimatorListener implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class Builder extends PromptOptions<Builder> {
        public Builder(ai aiVar) {
            this(aiVar, 0);
        }

        public Builder(ai aiVar, int i4) {
            this(new SupportFragmentResourceFinder(aiVar), i4);
        }

        public Builder(DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w) {
            this(dialogInterfaceOnCancelListenerC0627w, 0);
        }

        public Builder(DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w, int i4) {
            this(new SupportFragmentResourceFinder(dialogInterfaceOnCancelListenerC0627w), i4);
        }

        public Builder(Dialog dialog) {
            this(dialog, 0);
        }

        public Builder(Dialog dialog, int i4) {
            this(new DialogResourceFinder(dialog), i4);
        }

        public Builder(Activity activity) {
            this(activity, 0);
        }

        public Builder(Activity activity, int i4) {
            this(new ActivityResourceFinder(activity), i4);
        }

        public Builder(ResourceFinder resourceFinder, int i4) {
            super(resourceFinder);
            load(i4);
        }
    }

    /* loaded from: classes.dex */
    public interface PromptStateChangeListener {
        void onPromptStateChanged(MaterialTapTargetPrompt materialTapTargetPrompt, int i4);
    }

    /* loaded from: classes.dex */
    public static class PromptView extends View {
        AccessibilityManager mAccessibilityManager;
        Rect mClipBounds;
        boolean mClipToBounds;
        Drawable mIconDrawable;
        float mIconDrawableLeft;
        float mIconDrawableTop;
        MaterialTapTargetPrompt mPrompt;
        PromptOptions mPromptOptions;
        PromptTouchedListener mPromptTouchedListener;
        View mTargetRenderView;

        /* loaded from: classes.dex */
        public class AccessibilityDelegate extends View.AccessibilityDelegate {
            public AccessibilityDelegate() {
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                Package r02 = PromptView.this.getClass().getPackage();
                if (r02 != null) {
                    accessibilityNodeInfo.setPackageName(r02.getName());
                }
                accessibilityNodeInfo.setSource(view);
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.setEnabled(true);
                accessibilityNodeInfo.setChecked(false);
                accessibilityNodeInfo.setFocusable(true);
                accessibilityNodeInfo.setFocused(true);
                accessibilityNodeInfo.setLabelFor(PromptView.this.mPromptOptions.getTargetView());
                accessibilityNodeInfo.setDismissable(true);
                accessibilityNodeInfo.setContentDescription(PromptView.this.mPromptOptions.getContentDescription());
                accessibilityNodeInfo.setText(PromptView.this.mPromptOptions.getContentDescription());
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                String contentDescription = PromptView.this.mPromptOptions.getContentDescription();
                if (!TextUtils.isEmpty(contentDescription)) {
                    accessibilityEvent.getText().add(contentDescription);
                }
            }
        }

        /* loaded from: classes.dex */
        public interface PromptTouchedListener {
            void onBackButtonPressed();

            void onFocalPressed();

            void onNonFocalPressed();
        }

        public PromptView(Context context) {
            super(context);
            this.mClipBounds = new Rect();
            setId(R.id.material_target_prompt_view);
            setFocusableInTouchMode(true);
            requestFocus();
            setAccessibilityDelegate(new AccessibilityDelegate());
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            this.mAccessibilityManager = accessibilityManager;
            if (accessibilityManager.isEnabled()) {
                setupAccessibilityClickListener();
            }
        }

        public /* synthetic */ void lambda$setupAccessibilityClickListener$0(View view) {
            View targetView = this.mPromptOptions.getTargetView();
            if (targetView != null) {
                targetView.callOnClick();
            }
            this.mPrompt.finish();
        }

        private void setupAccessibilityClickListener() {
            setClickable(true);
            setOnClickListener(new com.clevertap.android.sdk.inapp.fragment.a(17, this));
        }

        @Override // android.view.View
        public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
            KeyEvent.DispatcherState keyDispatcherState;
            if (this.mPromptOptions.getBackButtonDismissEnabled() && keyEvent.getKeyCode() == 4 && (keyDispatcherState = getKeyDispatcherState()) != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                }
                if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && keyDispatcherState.isTracking(keyEvent)) {
                    PromptTouchedListener promptTouchedListener = this.mPromptTouchedListener;
                    if (promptTouchedListener != null) {
                        promptTouchedListener.onBackButtonPressed();
                    }
                    if (this.mPromptOptions.getAutoDismiss() || super.dispatchKeyEventPreIme(keyEvent)) {
                        return true;
                    }
                    return false;
                }
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }

        @Override // android.view.View
        public CharSequence getAccessibilityClassName() {
            return PromptView.class.getName();
        }

        public PromptOptions getPromptOptions() {
            return this.mPromptOptions;
        }

        @Override // android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.mPrompt.cleanUpAnimation();
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            if (this.mClipToBounds) {
                canvas.clipRect(this.mClipBounds);
            }
            Path path = this.mPromptOptions.getPromptFocal().getPath();
            if (path != null) {
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            this.mPromptOptions.getPromptBackground().draw(canvas);
            if (path != null) {
                canvas.restore();
            }
            this.mPromptOptions.getPromptFocal().draw(canvas);
            if (this.mIconDrawable != null) {
                canvas.translate(this.mIconDrawableLeft, this.mIconDrawableTop);
                this.mIconDrawable.draw(canvas);
                canvas.translate(-this.mIconDrawableLeft, -this.mIconDrawableTop);
            } else if (this.mTargetRenderView != null) {
                canvas.translate(this.mIconDrawableLeft, this.mIconDrawableTop);
                this.mTargetRenderView.draw(canvas);
                canvas.translate(-this.mIconDrawableLeft, -this.mIconDrawableTop);
            }
            Path path2 = this.mPromptOptions.getPromptBackground().getPath();
            if (path2 != null) {
                canvas.save();
                canvas.clipPath(path2, Region.Op.INTERSECT);
            }
            this.mPromptOptions.getPromptText().draw(canvas);
            if (path2 != null) {
                canvas.restore();
            }
        }

        @Override // android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            if (this.mAccessibilityManager.isTouchExplorationEnabled() && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action != 9) {
                        if (action == 10) {
                            motionEvent.setAction(1);
                        }
                    } else {
                        motionEvent.setAction(0);
                    }
                } else {
                    motionEvent.setAction(2);
                }
                return onTouchEvent(motionEvent);
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.view.View
        public void onMeasure(int i4, int i5) {
            View view = (View) getParent();
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z2;
            float x4 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if ((!this.mClipToBounds || this.mClipBounds.contains((int) x4, (int) y10)) && this.mPromptOptions.getPromptBackground().contains(x4, y10)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && this.mPromptOptions.getPromptFocal().contains(x4, y10)) {
                boolean captureTouchEventOnFocal = this.mPromptOptions.getCaptureTouchEventOnFocal();
                PromptTouchedListener promptTouchedListener = this.mPromptTouchedListener;
                if (promptTouchedListener != null) {
                    promptTouchedListener.onFocalPressed();
                }
                return captureTouchEventOnFocal;
            }
            if (!z2) {
                z2 = this.mPromptOptions.getCaptureTouchEventOutsidePrompt();
            }
            PromptTouchedListener promptTouchedListener2 = this.mPromptTouchedListener;
            if (promptTouchedListener2 != null) {
                promptTouchedListener2.onNonFocalPressed();
            }
            return z2;
        }
    }

    public MaterialTapTargetPrompt(PromptOptions promptOptions) {
        float f5;
        ResourceFinder resourceFinder = promptOptions.getResourceFinder();
        PromptView promptView = new PromptView(resourceFinder.getContext());
        this.mView = promptView;
        promptView.mPrompt = this;
        promptView.mPromptOptions = promptOptions;
        promptView.setContentDescription(promptOptions.getContentDescription());
        this.mView.mPromptTouchedListener = new PromptView.PromptTouchedListener() { // from class: uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.1
            public AnonymousClass1() {
            }

            @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.PromptView.PromptTouchedListener
            public void onBackButtonPressed() {
                if (!MaterialTapTargetPrompt.this.isDismissing()) {
                    MaterialTapTargetPrompt.this.onPromptStateChanged(10);
                    MaterialTapTargetPrompt.this.onPromptStateChanged(8);
                    if (MaterialTapTargetPrompt.this.mView.mPromptOptions.getAutoDismiss()) {
                        MaterialTapTargetPrompt.this.dismiss();
                    }
                }
            }

            @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.PromptView.PromptTouchedListener
            public void onFocalPressed() {
                if (!MaterialTapTargetPrompt.this.isDismissing()) {
                    MaterialTapTargetPrompt.this.onPromptStateChanged(3);
                    if (MaterialTapTargetPrompt.this.mView.mPromptOptions.getAutoFinish()) {
                        MaterialTapTargetPrompt.this.finish();
                    }
                }
            }

            @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.PromptView.PromptTouchedListener
            public void onNonFocalPressed() {
                if (!MaterialTapTargetPrompt.this.isDismissing()) {
                    MaterialTapTargetPrompt.this.onPromptStateChanged(8);
                    if (MaterialTapTargetPrompt.this.mView.mPromptOptions.getAutoDismiss()) {
                        MaterialTapTargetPrompt.this.dismiss();
                    }
                }
            }
        };
        Rect rect = new Rect();
        resourceFinder.getPromptParentView().getWindowVisibleDisplayFrame(rect);
        if (this.mView.mPromptOptions.getIgnoreStatusBar()) {
            f5 = 0.0f;
        } else {
            f5 = rect.top;
        }
        this.mStatusBarHeight = f5;
        this.mGlobalLayoutListener = new ViewTreeObserverOnGlobalLayoutListenerC2920j(1, this);
    }

    public static MaterialTapTargetPrompt createDefault(PromptOptions promptOptions) {
        return new MaterialTapTargetPrompt(promptOptions);
    }

    public /* synthetic */ void lambda$dismiss$3(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateAnimation(floatValue, floatValue);
    }

    public /* synthetic */ void lambda$finish$2(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateAnimation(((1.0f - floatValue) / 4.0f) + 1.0f, floatValue);
    }

    public /* synthetic */ void lambda$new$0() {
        onPromptStateChanged(9);
        dismiss();
    }

    public /* synthetic */ void lambda$new$1() {
        View targetView = this.mView.mPromptOptions.getTargetView();
        if (targetView == null || targetView.isAttachedToWindow()) {
            prepare();
            if (this.mAnimationCurrent == null) {
                updateAnimation(1.0f, 1.0f);
            }
        }
    }

    public /* synthetic */ void lambda$startIdleAnimations$5(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.mView.mPromptOptions.getPromptFocal().updateRipple(floatValue, (1.6f - floatValue) * 2.0f);
    }

    public /* synthetic */ void lambda$startRevealAnimation$4(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateAnimation(floatValue, floatValue);
    }

    public void addGlobalLayoutListener() {
        ViewTreeObserver viewTreeObserver = ((ViewGroup) this.mView.getParent()).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this.mGlobalLayoutListener);
        }
    }

    public void cancelShowForTimer() {
        this.mView.removeCallbacks(this.mTimeoutRunnable);
    }

    public void cleanUpAnimation() {
        ValueAnimator valueAnimator = this.mAnimationCurrent;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.mAnimationCurrent.removeAllListeners();
            this.mAnimationCurrent.cancel();
            this.mAnimationCurrent = null;
        }
        ValueAnimator valueAnimator2 = this.mAnimationFocalRipple;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            this.mAnimationFocalRipple.cancel();
            this.mAnimationFocalRipple = null;
        }
        ValueAnimator valueAnimator3 = this.mAnimationFocalBreathing;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
            this.mAnimationFocalBreathing.cancel();
            this.mAnimationFocalBreathing = null;
        }
    }

    public void cleanUpPrompt(int i4) {
        cleanUpAnimation();
        removeGlobalLayoutListener();
        ViewGroup viewGroup = (ViewGroup) this.mView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.mView);
        }
        if (isDismissing()) {
            onPromptStateChanged(i4);
        }
    }

    public void dismiss() {
        if (isComplete()) {
            return;
        }
        cancelShowForTimer();
        cleanUpAnimation();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.mAnimationCurrent = ofFloat;
        ofFloat.setDuration(225L);
        this.mAnimationCurrent.setInterpolator(this.mView.mPromptOptions.getAnimationInterpolator());
        this.mAnimationCurrent.addUpdateListener(new a(this, 2));
        this.mAnimationCurrent.addListener(new AnimatorListener() { // from class: uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.3
            public AnonymousClass3() {
            }

            @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialTapTargetPrompt.this.cleanUpPrompt(6);
                MaterialTapTargetPrompt.this.mView.sendAccessibilityEvent(32);
            }
        });
        onPromptStateChanged(5);
        this.mAnimationCurrent.start();
    }

    public void finish() {
        if (isComplete()) {
            return;
        }
        cancelShowForTimer();
        cleanUpAnimation();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.mAnimationCurrent = ofFloat;
        ofFloat.setDuration(225L);
        this.mAnimationCurrent.setInterpolator(this.mView.mPromptOptions.getAnimationInterpolator());
        this.mAnimationCurrent.addUpdateListener(new a(this, 1));
        this.mAnimationCurrent.addListener(new AnimatorListener() { // from class: uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.2
            public AnonymousClass2() {
            }

            @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialTapTargetPrompt.this.cleanUpPrompt(4);
                MaterialTapTargetPrompt.this.mView.sendAccessibilityEvent(32);
            }
        });
        onPromptStateChanged(7);
        this.mAnimationCurrent.start();
    }

    public int getState() {
        return this.mState;
    }

    public boolean isComplete() {
        if (this.mState != 0 && !isDismissing() && !isDismissed()) {
            return false;
        }
        return true;
    }

    public boolean isDismissed() {
        int i4 = this.mState;
        if (i4 != 6 && i4 != 4) {
            return false;
        }
        return true;
    }

    public boolean isDismissing() {
        int i4 = this.mState;
        if (i4 != 5 && i4 != 7) {
            return false;
        }
        return true;
    }

    public boolean isStarting() {
        int i4 = this.mState;
        if (i4 == 1 || i4 == 2) {
            return true;
        }
        return false;
    }

    public void onPromptStateChanged(int i4) {
        this.mState = i4;
        this.mView.mPromptOptions.onPromptStateChanged(this, i4);
        this.mView.mPromptOptions.onExtraPromptStateChanged(this, i4);
    }

    public void prepare() {
        View targetRenderView = this.mView.mPromptOptions.getTargetRenderView();
        if (targetRenderView == null) {
            PromptView promptView = this.mView;
            promptView.mTargetRenderView = promptView.mPromptOptions.getTargetView();
        } else {
            this.mView.mTargetRenderView = targetRenderView;
        }
        updateClipBounds();
        View targetView = this.mView.mPromptOptions.getTargetView();
        if (targetView != null) {
            int[] iArr = new int[2];
            this.mView.getLocationInWindow(iArr);
            this.mView.mPromptOptions.getPromptFocal().prepare(this.mView.mPromptOptions, targetView, iArr);
        } else {
            PointF targetPosition = this.mView.mPromptOptions.getTargetPosition();
            this.mView.mPromptOptions.getPromptFocal().prepare(this.mView.mPromptOptions, targetPosition.x, targetPosition.y);
        }
        PromptText promptText = this.mView.mPromptOptions.getPromptText();
        PromptView promptView2 = this.mView;
        promptText.prepare(promptView2.mPromptOptions, promptView2.mClipToBounds, promptView2.mClipBounds);
        PromptBackground promptBackground = this.mView.mPromptOptions.getPromptBackground();
        PromptView promptView3 = this.mView;
        promptBackground.prepare(promptView3.mPromptOptions, promptView3.mClipToBounds, promptView3.mClipBounds);
        updateIconPosition();
    }

    public void removeGlobalLayoutListener() {
        if (((ViewGroup) this.mView.getParent()) != null) {
            ViewTreeObserver viewTreeObserver = ((ViewGroup) this.mView.getParent()).getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.mGlobalLayoutListener);
            }
        }
    }

    public void show() {
        if (isStarting()) {
            return;
        }
        ViewGroup promptParentView = this.mView.mPromptOptions.getResourceFinder().getPromptParentView();
        if (isDismissing() || promptParentView.findViewById(R.id.material_target_prompt_view) != null) {
            cleanUpPrompt(this.mState);
        }
        promptParentView.addView(this.mView);
        addGlobalLayoutListener();
        onPromptStateChanged(1);
        prepare();
        startRevealAnimation();
    }

    public void showFor(long j5) {
        this.mView.postDelayed(this.mTimeoutRunnable, j5);
        show();
    }

    public void startIdleAnimations() {
        cleanUpAnimation();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.1f, 1.0f);
        this.mAnimationFocalBreathing = ofFloat;
        ofFloat.setInterpolator(this.mView.mPromptOptions.getAnimationInterpolator());
        this.mAnimationFocalBreathing.setDuration(1000L);
        this.mAnimationFocalBreathing.setStartDelay(225L);
        this.mAnimationFocalBreathing.setRepeatCount(-1);
        this.mAnimationFocalBreathing.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.5
            boolean direction = true;

            public AnonymousClass5() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                boolean z2;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boolean z10 = this.direction;
                MaterialTapTargetPrompt materialTapTargetPrompt = MaterialTapTargetPrompt.this;
                float f5 = materialTapTargetPrompt.mFocalRippleProgress;
                if (floatValue < f5 && z10) {
                    z2 = false;
                } else if (floatValue > f5 && !z10) {
                    z2 = true;
                } else {
                    z2 = z10;
                }
                if (z2 != z10 && !z2) {
                    materialTapTargetPrompt.mAnimationFocalRipple.start();
                }
                this.direction = z2;
                MaterialTapTargetPrompt materialTapTargetPrompt2 = MaterialTapTargetPrompt.this;
                materialTapTargetPrompt2.mFocalRippleProgress = floatValue;
                materialTapTargetPrompt2.mView.mPromptOptions.getPromptFocal().update(MaterialTapTargetPrompt.this.mView.mPromptOptions, floatValue, 1.0f);
                MaterialTapTargetPrompt.this.mView.invalidate();
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.1f, 1.6f);
        this.mAnimationFocalRipple = ofFloat2;
        ofFloat2.setInterpolator(this.mView.mPromptOptions.getAnimationInterpolator());
        this.mAnimationFocalRipple.setDuration(500L);
        this.mAnimationFocalRipple.addUpdateListener(new a(this, 0));
        this.mAnimationFocalBreathing.start();
    }

    public void startRevealAnimation() {
        updateAnimation(0.0f, 0.0f);
        cleanUpAnimation();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mAnimationCurrent = ofFloat;
        ofFloat.setInterpolator(this.mView.mPromptOptions.getAnimationInterpolator());
        this.mAnimationCurrent.setDuration(225L);
        this.mAnimationCurrent.addUpdateListener(new a(this, 3));
        this.mAnimationCurrent.addListener(new AnimatorListener() { // from class: uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.4
            public AnonymousClass4() {
            }

            @Override // uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.AnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                animator.removeAllListeners();
                MaterialTapTargetPrompt.this.updateAnimation(1.0f, 1.0f);
                MaterialTapTargetPrompt.this.cleanUpAnimation();
                if (MaterialTapTargetPrompt.this.mView.mPromptOptions.getIdleAnimationEnabled()) {
                    MaterialTapTargetPrompt.this.startIdleAnimations();
                }
                MaterialTapTargetPrompt.this.onPromptStateChanged(2);
                MaterialTapTargetPrompt.this.mView.requestFocus();
                MaterialTapTargetPrompt.this.mView.sendAccessibilityEvent(8);
            }
        });
        this.mAnimationCurrent.start();
    }

    public void updateAnimation(float f5, float f10) {
        if (this.mView.getParent() == null) {
            return;
        }
        this.mView.mPromptOptions.getPromptText().update(this.mView.mPromptOptions, f5, f10);
        Drawable drawable = this.mView.mIconDrawable;
        if (drawable != null) {
            drawable.setAlpha((int) (255.0f * f10));
        }
        this.mView.mPromptOptions.getPromptFocal().update(this.mView.mPromptOptions, f5, f10);
        this.mView.mPromptOptions.getPromptBackground().update(this.mView.mPromptOptions, f5, f10);
        this.mView.invalidate();
    }

    public void updateClipBounds() {
        View clipToView = this.mView.mPromptOptions.getClipToView();
        if (clipToView != null) {
            PromptView promptView = this.mView;
            promptView.mClipToBounds = true;
            promptView.mClipBounds.set(0, 0, 0, 0);
            Point point = new Point();
            clipToView.getGlobalVisibleRect(this.mView.mClipBounds, point);
            if (point.y == 0) {
                this.mView.mClipBounds.top = (int) (r0.top + this.mStatusBarHeight);
                return;
            }
            return;
        }
        this.mView.mPromptOptions.getResourceFinder().getPromptParentView().getGlobalVisibleRect(this.mView.mClipBounds, new Point());
        this.mView.mClipToBounds = false;
    }

    public void updateIconPosition() {
        PromptView promptView = this.mView;
        promptView.mIconDrawable = promptView.mPromptOptions.getIconDrawable();
        PromptView promptView2 = this.mView;
        if (promptView2.mIconDrawable != null) {
            RectF bounds = promptView2.mPromptOptions.getPromptFocal().getBounds();
            this.mView.mIconDrawableLeft = bounds.centerX() - (this.mView.mIconDrawable.getIntrinsicWidth() / 2);
            this.mView.mIconDrawableTop = bounds.centerY() - (this.mView.mIconDrawable.getIntrinsicHeight() / 2);
            return;
        }
        if (promptView2.mTargetRenderView != null) {
            promptView2.getLocationInWindow(new int[2]);
            this.mView.mTargetRenderView.getLocationInWindow(new int[2]);
            this.mView.mIconDrawableLeft = (r0[0] - r1[0]) - r2.mTargetRenderView.getScrollX();
            this.mView.mIconDrawableTop = (r0[1] - r1[1]) - r2.mTargetRenderView.getScrollY();
        }
    }
}
