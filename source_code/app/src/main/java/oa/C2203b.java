package oa;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.f0;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: oa.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2203b extends f0 {
    public final ComposeView alpha;

    public C2203b(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.composeView);
        Intrinsics.delta(findViewById, "findViewById(...)");
        this.alpha = (ComposeView) findViewById;
    }
}
