package qa;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.f0;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends f0 {
    public final View alpha;
    public final TextView bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view) {
        super(view);
        Intrinsics.echo(view, "view");
        this.alpha = view;
        View findViewById = view.findViewById(R.id.tv_instruction);
        Intrinsics.delta(findViewById, "findViewById(...)");
        this.bravo = (TextView) findViewById;
    }
}
