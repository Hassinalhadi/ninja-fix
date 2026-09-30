package g7;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.navigation.NavigationView;

/* loaded from: classes2.dex */
public abstract class y {
    public m charlie;
    public boolean alpha = false;
    public boolean bravo = false;
    public RectF delta = new RectF();
    public final Path echo = new Path();

    public abstract void alpha(NavigationView navigationView);

    public abstract boolean bravo();

    public final void charlie() {
        m mVar;
        RectF rectF = this.delta;
        if (rectF.left <= rectF.right && rectF.top <= rectF.bottom && (mVar = this.charlie) != null) {
            n.alpha.alpha(mVar, null, 1.0f, rectF, null, this.echo);
        }
    }
}
