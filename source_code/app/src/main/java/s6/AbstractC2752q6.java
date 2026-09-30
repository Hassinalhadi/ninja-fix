package s6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.q6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2752q6 {
    public static final boolean alpha(String str) {
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (Intrinsics.golf(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    public static void bravo(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j5 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = (Animator) arrayList.get(i4);
            j5 = Math.max(j5, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j5);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }
}
