package b;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes3.dex */
public final class ao {
    public final Context alpha;
    public final int bravo;
    public long charlie = 0;
    public EdgeEffect delta;
    public EdgeEffect echo;
    public EdgeEffect foxtrot;
    public EdgeEffect golf;
    public EdgeEffect hotel;
    public EdgeEffect india;
    public EdgeEffect juliet;
    public EdgeEffect kilo;

    public ao(Context context, int i4) {
        this.alpha = context;
        this.bravo = i4;
    }

    public static boolean foxtrot(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean golf(EdgeEffect edgeEffect) {
        float f5;
        boolean z2 = false;
        if (edgeEffect == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            f5 = E2.f.bravo(edgeEffect);
        } else {
            f5 = 0.0f;
        }
        if (f5 == 0.0f) {
            z2 = true;
        }
        return !z2;
    }

    public final EdgeEffect alpha(d.K k6) {
        EdgeEffect atVar;
        int i4 = Build.VERSION.SDK_INT;
        Context context = this.alpha;
        if (i4 >= 31) {
            atVar = E2.f.alpha(context);
        } else {
            atVar = new at(context);
        }
        atVar.setColor(this.bravo);
        if (!Q0.m.alpha(this.charlie, 0L)) {
            if (k6 == d.K.alpha) {
                long j5 = this.charlie;
                atVar.setSize((int) (j5 >> 32), (int) (4294967295L & j5));
                return atVar;
            }
            long j6 = this.charlie;
            atVar.setSize((int) (4294967295L & j6), (int) (j6 >> 32));
        }
        return atVar;
    }

    public final EdgeEffect bravo() {
        EdgeEffect edgeEffect = this.echo;
        if (edgeEffect == null) {
            EdgeEffect alpha = alpha(d.K.alpha);
            this.echo = alpha;
            return alpha;
        }
        return edgeEffect;
    }

    public final EdgeEffect charlie() {
        EdgeEffect edgeEffect = this.foxtrot;
        if (edgeEffect == null) {
            EdgeEffect alpha = alpha(d.K.purple);
            this.foxtrot = alpha;
            return alpha;
        }
        return edgeEffect;
    }

    public final EdgeEffect delta() {
        EdgeEffect edgeEffect = this.golf;
        if (edgeEffect == null) {
            EdgeEffect alpha = alpha(d.K.purple);
            this.golf = alpha;
            return alpha;
        }
        return edgeEffect;
    }

    public final EdgeEffect echo() {
        EdgeEffect edgeEffect = this.delta;
        if (edgeEffect == null) {
            EdgeEffect alpha = alpha(d.K.alpha);
            this.delta = alpha;
            return alpha;
        }
        return edgeEffect;
    }
}
