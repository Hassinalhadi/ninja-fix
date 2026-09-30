package M6;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class f {
    public long alpha;
    public TimeInterpolator charlie = null;
    public int delta = 0;
    public int echo = 1;
    public long bravo = 150;

    public f(long j5) {
        this.alpha = j5;
    }

    public final void alpha(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.alpha);
        objectAnimator.setDuration(this.bravo);
        objectAnimator.setInterpolator(bravo());
        objectAnimator.setRepeatCount(this.delta);
        objectAnimator.setRepeatMode(this.echo);
    }

    public final TimeInterpolator bravo() {
        TimeInterpolator timeInterpolator = this.charlie;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return a.bravo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.alpha != fVar.alpha || this.bravo != fVar.bravo || this.delta != fVar.delta || this.echo != fVar.echo) {
            return false;
        }
        return bravo().getClass().equals(fVar.bravo().getClass());
    }

    public final int hashCode() {
        long j5 = this.alpha;
        long j6 = this.bravo;
        return ((((bravo().getClass().hashCode() + (((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31)) * 31) + this.delta) * 31) + this.echo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(f.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.alpha);
        sb2.append(" duration: ");
        sb2.append(this.bravo);
        sb2.append(" interpolator: ");
        sb2.append(bravo().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.delta);
        sb2.append(" repeatMode: ");
        return P0.cyan(sb2, this.echo, "}\n");
    }
}
