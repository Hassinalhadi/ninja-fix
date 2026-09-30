package ao;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import delivery.samurai.android.R;

/* loaded from: classes3.dex */
public class v {
    public final Context alpha;
    public final l bravo;
    public final boolean charlie;
    public final int delta;
    public View echo;
    public boolean golf;
    public w hotel;
    public t india;
    public PopupWindow.OnDismissListener juliet;
    public int foxtrot = 8388611;
    public final u kilo = new u(this);

    public v(int i4, Context context, View view, l lVar, boolean z2) {
        this.alpha = context;
        this.bravo = lVar;
        this.echo = view;
        this.charlie = z2;
        this.delta = i4;
    }

    public final t alpha() {
        t acVar;
        if (this.india == null) {
            Context context = this.alpha;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                acVar = new f(context, this.echo, this.delta, this.charlie);
            } else {
                View view = this.echo;
                Context context2 = this.alpha;
                boolean z2 = this.charlie;
                acVar = new ac(this.delta, context2, view, this.bravo, z2);
            }
            acVar.november(this.bravo);
            acVar.tango(this.kilo);
            acVar.papa(this.echo);
            acVar.echo(this.hotel);
            acVar.quebec(this.golf);
            acVar.romeo(this.foxtrot);
            this.india = acVar;
        }
        return this.india;
    }

    public final boolean bravo() {
        t tVar = this.india;
        if (tVar != null && tVar.alpha()) {
            return true;
        }
        return false;
    }

    public void charlie() {
        this.india = null;
        PopupWindow.OnDismissListener onDismissListener = this.juliet;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void delta(int i4, int i5, boolean z2, boolean z10) {
        t alpha = alpha();
        alpha.uniform(z10);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.foxtrot, this.echo.getLayoutDirection()) & 7) == 5) {
                i4 -= this.echo.getWidth();
            }
            alpha.sierra(i4);
            alpha.victor(i5);
            int i10 = (int) ((this.alpha.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            alpha.alpha = new Rect(i4 - i10, i5 - i10, i4 + i10, i5 + i10);
        }
        alpha.golf();
    }
}
