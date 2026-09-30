package x2;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* loaded from: classes3.dex */
public abstract class u {
    public static long alpha(Animator animator) {
        long totalDuration;
        totalDuration = animator.getTotalDuration();
        return totalDuration;
    }

    public static void bravo(Animator animator, long j5) {
        ((AnimatorSet) animator).setCurrentPlayTime(j5);
    }
}
