package qa;

import B9.AbstractC0031b0;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.f0;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2432a extends f0 {
    public final View alpha;
    public final ImageView bravo;
    public final AbstractC0031b0 charlie;

    public C2432a(View view) {
        super(view);
        this.alpha = view;
        View findViewById = view.findViewById(R.id.ibAssetImage);
        Intrinsics.delta(findViewById, "findViewById(...)");
        this.bravo = (ImageView) findViewById;
        this.charlie = (AbstractC0031b0) z1.d.alpha(view);
    }
}
