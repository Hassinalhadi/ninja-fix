package an;

import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import s1.az;
import t6.AbstractC3082y;

/* loaded from: classes3.dex */
public final class k {
    public BaseInterpolator charlie;
    public AbstractC3082y delta;
    public boolean echo;
    public long bravo = -1;
    public final j foxtrot = new j(this);
    public final ArrayList alpha = new ArrayList();

    public final void alpha() {
        if (!this.echo) {
            return;
        }
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            ((az) it.next()).bravo();
        }
        this.echo = false;
    }

    public final void bravo() {
        View view;
        if (this.echo) {
            return;
        }
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            az azVar = (az) it.next();
            long j5 = this.bravo;
            if (j5 >= 0) {
                azVar.charlie(j5);
            }
            BaseInterpolator baseInterpolator = this.charlie;
            if (baseInterpolator != null && (view = (View) azVar.alpha.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.delta != null) {
                azVar.delta(this.foxtrot);
            }
            View view2 = (View) azVar.alpha.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.echo = true;
    }
}
