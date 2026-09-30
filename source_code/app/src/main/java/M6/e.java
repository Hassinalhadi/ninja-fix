package M6;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import bv.aw;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e {
    public final aw alpha = new aw(0);
    public final aw bravo = new aw(0);

    public static e alpha(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0) {
            return bravo(resourceId, context);
        }
        return null;
    }

    public static e bravo(int i4, Context context) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i4);
            if (loadAnimator instanceof AnimatorSet) {
                return charlie(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return charlie(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i4), e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [M6.f, java.lang.Object] */
    public static e charlie(ArrayList arrayList) {
        e eVar = new e();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = (Animator) arrayList.get(i4);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                eVar.bravo.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                ?? obj = new Object();
                obj.delta = 0;
                obj.echo = 1;
                obj.alpha = startDelay;
                obj.bravo = duration;
                obj.charlie = interpolator;
                obj.delta = objectAnimator.getRepeatCount();
                obj.echo = objectAnimator.getRepeatMode();
                eVar.alpha.put(propertyName, obj);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return eVar;
    }

    public final f delta(String str) {
        aw awVar = this.alpha;
        if (awVar.get(str) != null) {
            return (f) awVar.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.alpha.equals(((e) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "\n" + e.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.alpha + "}\n";
    }
}
