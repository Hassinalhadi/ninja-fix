package zc;

import android.app.AlertDialog;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.Shift;
import kotlin.jvm.internal.Intrinsics;
import t0.A0;
import x9.AbstractC3311e;

/* loaded from: classes2.dex */
public final class i extends AbstractC3311e {
    public AlertDialog charlie;

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        h holder = (h) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        Shift shift = (Shift) obj;
        ComposeView composeView = holder.alpha;
        composeView.setContent(new P.d(new Gb.j(shift, composeView.getContext(), this, i4, holder, 12), -1304079225, true));
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        Intrinsics.echo(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.delta(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setViewCompositionStrategy(A0.alpha);
        return new h(composeView);
    }
}
