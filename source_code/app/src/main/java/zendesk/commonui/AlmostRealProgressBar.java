package zendesk.commonui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class AlmostRealProgressBar extends ProgressBar {
    public static final long ALPHA_FADE_DURATION = 100;
    public static final List<Step> DONT_STOP_MOVING = Arrays.asList(new Step(60, 4000), new Step(90, 15000));
    public static final long START_DEBOUNCE_TIME = 100;
    public static final long STOP_ANIMATION_DURATION = 300;
    public static final long STOP_DEBOUNCE_TIME = 200;
    private StateAwareAnimator finishAnimator;
    private Handler handler;
    private StateAwareAnimator progressAnimator;
    private Runnable startDebounceRunnable;
    private List<Step> steps;
    private Runnable stopDebounceRunnable;

    /* loaded from: classes.dex */
    public static class State extends View.BaseSavedState {
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: zendesk.commonui.AlmostRealProgressBar.State.1
            @Override // android.os.Parcelable.Creator
            public State createFromParcel(Parcel parcel) {
                return new State(parcel, 0);
            }

            @Override // android.os.Parcelable.Creator
            public State[] newArray(int i4) {
                return new State[i4];
            }
        };
        private final int progress;
        private final List<Step> steps;

        public /* synthetic */ State(Parcel parcel, int i4) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.progress);
            parcel.writeTypedList(this.steps);
        }

        public State(Parcelable parcelable, int i4, List<Step> list) {
            super(parcelable);
            this.progress = i4;
            this.steps = list;
        }

        private State(Parcel parcel) {
            super(parcel);
            this.progress = parcel.readInt();
            ArrayList arrayList = new ArrayList();
            this.steps = arrayList;
            parcel.readTypedList(arrayList, Step.CREATOR);
        }
    }

    /* loaded from: classes.dex */
    public static class StateAwareAnimator extends AnimatorListenerAdapter {
        private final Animator animatorSet;
        private boolean started = false;
        private boolean ended = false;

        public StateAwareAnimator(Animator animator) {
            this.animatorSet = animator;
            animator.addListener(this);
        }

        public Animator get() {
            return this.animatorSet;
        }

        public boolean isEnded() {
            return this.ended;
        }

        public boolean isStarted() {
            return this.started;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.started = false;
            this.ended = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.started = false;
            this.ended = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.started = true;
            this.ended = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.started = true;
            this.ended = false;
        }
    }

    /* loaded from: classes.dex */
    public static class Step implements Parcelable, Comparable<Step> {
        public static final Parcelable.Creator<Step> CREATOR = new Parcelable.Creator<Step>() { // from class: zendesk.commonui.AlmostRealProgressBar.Step.1
            @Override // android.os.Parcelable.Creator
            public Step createFromParcel(Parcel parcel) {
                return new Step(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Step[] newArray(int i4) {
                return new Step[i4];
            }
        };
        private final int target;
        private final long time;

        public Step(int i4, long j5) {
            this.target = i4;
            this.time = j5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.target);
            parcel.writeLong(this.time);
        }

        @Override // java.lang.Comparable
        public int compareTo(Step step) {
            return this.target - step.target;
        }

        public Step(Parcel parcel) {
            this.target = parcel.readInt();
            this.time = parcel.readLong();
        }
    }

    public AlmostRealProgressBar(Context context) {
        super(context);
        this.handler = new Handler(Looper.getMainLooper());
    }

    private Step adjustTime(int i4, int i5, Step step) {
        float f5 = step.target - i5;
        float f10 = i4 - i5;
        float f11 = (float) step.time;
        return new Step(step.target, (1.0f - (f10 / f5)) * f11);
    }

    private StateAwareAnimator endAnimation(long j5) {
        Animator progressAnimator = progressAnimator(getProgress(), 100, j5);
        Animator progressBarAlphaAnimator = progressBarAlphaAnimator(1.0f, 0.0f, 100L);
        Animator progressAnimator2 = progressAnimator(100, 0, 0L);
        Animator progressBarAlphaAnimator2 = progressBarAlphaAnimator(0.0f, 1.0f, 0L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(progressAnimator).before(progressBarAlphaAnimator);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(progressAnimator2).before(progressBarAlphaAnimator2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setDuration(j5);
        animatorSet3.play(animatorSet).before(animatorSet2);
        return new StateAwareAnimator(animatorSet3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishAnimation(long j5) {
        StateAwareAnimator stateAwareAnimator = this.progressAnimator;
        if (stateAwareAnimator != null) {
            stateAwareAnimator.get().cancel();
            this.progressAnimator = null;
            StateAwareAnimator endAnimation = endAnimation(j5);
            this.finishAnimator = endAnimation;
            endAnimation.get().start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kickOffAnimation(List<Step> list, int i4) {
        long j5;
        if (this.progressAnimator == null) {
            StateAwareAnimator stateAwareAnimator = this.finishAnimator;
            if (stateAwareAnimator != null && stateAwareAnimator.isStarted() && !this.finishAnimator.isEnded()) {
                j5 = this.finishAnimator.get().getDuration();
            } else {
                j5 = 0;
            }
            this.finishAnimator = null;
            StateAwareAnimator startAnimation = startAnimation(list, i4, j5);
            this.progressAnimator = startAnimation;
            startAnimation.get().start();
        }
    }

    private Animator progressAnimator(int i4, int i5, long j5) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "progress", i4, i5);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(j5);
        return ofInt;
    }

    private Animator progressBarAlphaAnimator(float f5, float f10, long j5) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", f5, f10);
        ofFloat.setDuration(j5);
        return ofFloat;
    }

    private void restoreProgress(State state) {
        if (state.progress > 0) {
            ArrayList arrayList = new ArrayList(state.steps);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            for (Step step : state.steps) {
                if (state.progress >= step.target) {
                    i4 = step.target;
                } else {
                    arrayList2.add(step);
                }
            }
            if (CollectionUtils.isNotEmpty(arrayList2)) {
                arrayList2.add(0, adjustTime(state.progress, i4, (Step) arrayList2.remove(0)));
            }
            kickOffAnimation(arrayList2, state.progress);
            this.steps = arrayList;
            return;
        }
        setProgress(0);
    }

    private StateAwareAnimator startAnimation(List<Step> list, int i4, long j5) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Step step : list) {
            Animator progressAnimator = progressAnimator(i4, step.target, step.time);
            int i5 = step.target;
            arrayList.add(progressAnimator);
            i4 = i5;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        animatorSet.setStartDelay(j5);
        return new StateAwareAnimator(animatorSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            restoreProgress(state);
            parcelable = state.getSuperState();
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public Parcelable onSaveInstanceState() {
        if (this.progressAnimator != null && this.stopDebounceRunnable == null) {
            return new State(super.onSaveInstanceState(), getProgress(), this.steps);
        }
        setProgress(0);
        return super.onSaveInstanceState();
    }

    public void start(final List<Step> list) {
        Runnable runnable = this.stopDebounceRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.stopDebounceRunnable = null;
        } else if (this.startDebounceRunnable == null) {
            Runnable runnable2 = new Runnable() { // from class: zendesk.commonui.AlmostRealProgressBar.1
                @Override // java.lang.Runnable
                public void run() {
                    AlmostRealProgressBar.this.startDebounceRunnable = null;
                    List copyOf = CollectionUtils.copyOf(list);
                    Collections.sort(copyOf);
                    AlmostRealProgressBar.this.steps = copyOf;
                    AlmostRealProgressBar almostRealProgressBar = AlmostRealProgressBar.this;
                    almostRealProgressBar.kickOffAnimation(almostRealProgressBar.steps, 0);
                }
            };
            this.startDebounceRunnable = runnable2;
            this.handler.postDelayed(runnable2, 100L);
        }
    }

    public void stop(final long j5) {
        Runnable runnable = this.startDebounceRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.startDebounceRunnable = null;
        } else if (this.stopDebounceRunnable == null) {
            Runnable runnable2 = new Runnable() { // from class: zendesk.commonui.AlmostRealProgressBar.2
                @Override // java.lang.Runnable
                public void run() {
                    AlmostRealProgressBar.this.stopDebounceRunnable = null;
                    AlmostRealProgressBar.this.finishAnimation(j5);
                }
            };
            this.stopDebounceRunnable = runnable2;
            this.handler.postDelayed(runnable2, 200L);
        }
    }

    public AlmostRealProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.handler = new Handler(Looper.getMainLooper());
    }

    public AlmostRealProgressBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.handler = new Handler(Looper.getMainLooper());
    }
}
