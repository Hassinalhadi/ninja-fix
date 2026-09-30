package Gb;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.EnvelopNotification;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t0.A0;
import x9.AbstractC3311e;

/* loaded from: classes2.dex */
public final class l extends AbstractC3311e {
    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        EnvelopNotification.Tag tag;
        k holder = (k) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        EnvelopNotification envelopNotification = (EnvelopNotification) obj;
        List<EnvelopNotification.Tag> tags = envelopNotification.getTags();
        if (tags != null) {
            tag = (EnvelopNotification.Tag) CollectionsKt.green(tags);
        } else {
            tag = null;
        }
        holder.alpha.setContent(new P.d(new j(envelopNotification, tag, this, i4, holder, 0), -1365233625, true));
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        Intrinsics.echo(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.delta(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setViewCompositionStrategy(A0.alpha);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new k(composeView);
    }
}
