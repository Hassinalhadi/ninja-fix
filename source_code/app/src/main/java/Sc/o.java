package Sc;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.f0;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;
import t0.A0;

/* loaded from: classes2.dex */
public final class o extends f0 {
    public final ComposeView alpha;

    public o(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.composeCard);
        Intrinsics.delta(findViewById, "findViewById(...)");
        ComposeView composeView = (ComposeView) findViewById;
        this.alpha = composeView;
        composeView.setViewCompositionStrategy(A0.alpha);
    }
}
