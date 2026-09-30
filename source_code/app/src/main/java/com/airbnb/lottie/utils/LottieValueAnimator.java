package com.airbnb.lottie.utils;

import android.view.Choreographer;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;

/* loaded from: classes3.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {
    private LottieComposition composition;
    private float speed = 1.0f;
    private boolean speedReversedForRepeatMode = false;
    private long lastFrameTimeNs = 0;
    private float frameRaw = 0.0f;
    private float frame = 0.0f;
    private int repeatCount = 0;
    private float minFrame = -2.14748365E9f;
    private float maxFrame = 2.14748365E9f;
    protected boolean running = false;
    private boolean useCompositionFrameRate = false;

    private void checkNotifyUpdate(float f5) {
        if (this.useCompositionFrameRate && this.frameRaw == f5) {
            return;
        }
        notifyUpdate();
    }

    private float getFrameDurationNs() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / lottieComposition.getFrameRate()) / Math.abs(this.speed);
    }

    private boolean isReversed() {
        if (getSpeed() < 0.0f) {
            return true;
        }
        return false;
    }

    private void verifyFrame() {
        if (this.composition != null) {
            float f5 = this.frame;
            if (f5 >= this.minFrame && f5 <= this.maxFrame) {
            } else {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.minFrame), Float.valueOf(this.maxFrame), Float.valueOf(this.frame)));
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        notifyCancel();
        removeFrameCallback();
    }

    public void clearComposition() {
        this.composition = null;
        this.minFrame = -2.14748365E9f;
        this.maxFrame = 2.14748365E9f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j5) {
        float minFrame;
        float maxFrame;
        postFrameCallback();
        if (this.composition != null && isRunning()) {
            if (L.isTraceEnabled()) {
                L.beginSection("LottieValueAnimator#doFrame");
            }
            long j6 = this.lastFrameTimeNs;
            long j7 = 0;
            if (j6 != 0) {
                j7 = j5 - j6;
            }
            float frameDurationNs = ((float) j7) / getFrameDurationNs();
            float f5 = this.frameRaw;
            if (isReversed()) {
                frameDurationNs = -frameDurationNs;
            }
            float f10 = f5 + frameDurationNs;
            boolean contains = MiscUtils.contains(f10, getMinFrame(), getMaxFrame());
            float f11 = this.frameRaw;
            float clamp = MiscUtils.clamp(f10, getMinFrame(), getMaxFrame());
            this.frameRaw = clamp;
            if (this.useCompositionFrameRate) {
                clamp = (float) Math.floor(clamp);
            }
            this.frame = clamp;
            this.lastFrameTimeNs = j5;
            if (!contains) {
                if (getRepeatCount() != -1 && this.repeatCount >= getRepeatCount()) {
                    if (this.speed < 0.0f) {
                        maxFrame = getMinFrame();
                    } else {
                        maxFrame = getMaxFrame();
                    }
                    this.frameRaw = maxFrame;
                    this.frame = maxFrame;
                    removeFrameCallback();
                    checkNotifyUpdate(f11);
                    notifyEnd(isReversed());
                } else {
                    if (getRepeatMode() == 2) {
                        this.speedReversedForRepeatMode = !this.speedReversedForRepeatMode;
                        reverseAnimationSpeed();
                    } else {
                        if (isReversed()) {
                            minFrame = getMaxFrame();
                        } else {
                            minFrame = getMinFrame();
                        }
                        this.frameRaw = minFrame;
                        this.frame = minFrame;
                    }
                    this.lastFrameTimeNs = j5;
                    checkNotifyUpdate(f11);
                    notifyRepeat();
                    this.repeatCount++;
                }
            } else {
                checkNotifyUpdate(f11);
            }
            verifyFrame();
            if (L.isTraceEnabled()) {
                L.endSection("LottieValueAnimator#doFrame");
            }
        }
    }

    public void endAnimation() {
        removeFrameCallback();
        notifyEnd(isReversed());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float minFrame;
        float maxFrame;
        float minFrame2;
        if (this.composition == null) {
            return 0.0f;
        }
        if (isReversed()) {
            minFrame = getMaxFrame() - this.frame;
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        } else {
            minFrame = this.frame - getMinFrame();
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        }
        return minFrame / (maxFrame - minFrame2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    public float getAnimatedValueAbsolute() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return 0.0f;
        }
        return (this.frame - lottieComposition.getStartFrame()) / (this.composition.getEndFrame() - this.composition.getStartFrame());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        if (this.composition == null) {
            return 0L;
        }
        return r0.getDuration();
    }

    public float getFrame() {
        return this.frame;
    }

    public float getMaxFrame() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f5 = this.maxFrame;
        if (f5 == 2.14748365E9f) {
            return lottieComposition.getEndFrame();
        }
        return f5;
    }

    public float getMinFrame() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f5 = this.minFrame;
        if (f5 == -2.14748365E9f) {
            return lottieComposition.getStartFrame();
        }
        return f5;
    }

    public float getSpeed() {
        return this.speed;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.running;
    }

    @Override // com.airbnb.lottie.utils.BaseLottieAnimator
    public void notifyCancel() {
        super.notifyCancel();
        notifyEnd(isReversed());
    }

    public void pauseAnimation() {
        removeFrameCallback();
        notifyPause();
    }

    public void playAnimation() {
        float minFrame;
        this.running = true;
        notifyStart(isReversed());
        if (isReversed()) {
            minFrame = getMaxFrame();
        } else {
            minFrame = getMinFrame();
        }
        setFrame((int) minFrame);
        this.lastFrameTimeNs = 0L;
        this.repeatCount = 0;
        postFrameCallback();
    }

    public void postFrameCallback() {
        if (isRunning()) {
            removeFrameCallback(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void removeFrameCallback() {
        removeFrameCallback(true);
    }

    public void resumeAnimation() {
        this.running = true;
        postFrameCallback();
        this.lastFrameTimeNs = 0L;
        if (isReversed() && getFrame() == getMinFrame()) {
            setFrame(getMaxFrame());
        } else if (!isReversed() && getFrame() == getMaxFrame()) {
            setFrame(getMinFrame());
        }
        notifyResume();
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setComposition(LottieComposition lottieComposition) {
        boolean z2;
        if (this.composition == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.composition = lottieComposition;
        if (z2) {
            setMinAndMaxFrames(Math.max(this.minFrame, lottieComposition.getStartFrame()), Math.min(this.maxFrame, lottieComposition.getEndFrame()));
        } else {
            setMinAndMaxFrames((int) lottieComposition.getStartFrame(), (int) lottieComposition.getEndFrame());
        }
        float f5 = this.frame;
        this.frame = 0.0f;
        this.frameRaw = 0.0f;
        setFrame((int) f5);
        notifyUpdate();
    }

    public void setFrame(float f5) {
        if (this.frameRaw == f5) {
            return;
        }
        float clamp = MiscUtils.clamp(f5, getMinFrame(), getMaxFrame());
        this.frameRaw = clamp;
        if (this.useCompositionFrameRate) {
            clamp = (float) Math.floor(clamp);
        }
        this.frame = clamp;
        this.lastFrameTimeNs = 0L;
        notifyUpdate();
    }

    public void setMaxFrame(float f5) {
        setMinAndMaxFrames(this.minFrame, f5);
    }

    public void setMinAndMaxFrames(float f5, float f10) {
        float startFrame;
        float endFrame;
        if (f5 <= f10) {
            LottieComposition lottieComposition = this.composition;
            if (lottieComposition == null) {
                startFrame = -3.4028235E38f;
            } else {
                startFrame = lottieComposition.getStartFrame();
            }
            LottieComposition lottieComposition2 = this.composition;
            if (lottieComposition2 == null) {
                endFrame = Float.MAX_VALUE;
            } else {
                endFrame = lottieComposition2.getEndFrame();
            }
            float clamp = MiscUtils.clamp(f5, startFrame, endFrame);
            float clamp2 = MiscUtils.clamp(f10, startFrame, endFrame);
            if (clamp == this.minFrame && clamp2 == this.maxFrame) {
                return;
            }
            this.minFrame = clamp;
            this.maxFrame = clamp2;
            setFrame((int) MiscUtils.clamp(this.frame, clamp, clamp2));
            return;
        }
        throw new IllegalArgumentException("minFrame (" + f5 + ") must be <= maxFrame (" + f10 + ")");
    }

    public void setMinFrame(int i4) {
        setMinAndMaxFrames(i4, (int) this.maxFrame);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i4) {
        super.setRepeatMode(i4);
        if (i4 != 2 && this.speedReversedForRepeatMode) {
            this.speedReversedForRepeatMode = false;
            reverseAnimationSpeed();
        }
    }

    public void setSpeed(float f5) {
        this.speed = f5;
    }

    public void setUseCompositionFrameRate(boolean z2) {
        this.useCompositionFrameRate = z2;
    }

    public void removeFrameCallback(boolean z2) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z2) {
            this.running = false;
        }
    }
}
