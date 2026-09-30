package Yb;

import android.view.View;
import android.widget.ImageView;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Yb.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0311j extends androidx.recyclerview.widget.f0 {
    public final View alpha;
    public final B9.Z bravo;
    public final ImageView charlie;

    public C0311j(View view) {
        super(view);
        this.alpha = view;
        this.bravo = (B9.Z) z1.d.alpha(view);
        View findViewById = view.findViewById(R.id.ibAssetImage);
        Intrinsics.delta(findViewById, "findViewById(...)");
        this.charlie = (ImageView) findViewById;
    }
}
