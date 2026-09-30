package af;

import ae.o;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.T;
import s6.AbstractC2609a7;

/* renamed from: af.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0434e {
    public static final ViewGroup.LayoutParams alpha = new ViewGroup.LayoutParams(-2, -2);

    public static void alpha(o oVar, P.d dVar) {
        ComposeView composeView;
        View childAt = ((ViewGroup) oVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        if (childAt instanceof ComposeView) {
            composeView = (ComposeView) childAt;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(dVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(oVar, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(dVar);
        View decorView = oVar.getWindow().getDecorView();
        if (T.delta(decorView) == null) {
            T.juliet(decorView, oVar);
        }
        if (T.echo(decorView) == null) {
            T.kilo(decorView, oVar);
        }
        if (AbstractC2609a7.alpha(decorView) == null) {
            AbstractC2609a7.delta(decorView, oVar);
        }
        oVar.setContentView(composeView2, alpha);
    }
}
