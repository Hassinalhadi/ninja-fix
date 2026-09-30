package x3;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3294a extends I {
    public final /* synthetic */ int alpha;
    public final int bravo;
    public final int charlie;

    public /* synthetic */ C3294a(int i4, int i5, int i10) {
        this.alpha = i10;
        this.bravo = i4;
        this.charlie = i5;
    }

    @Override // androidx.recyclerview.widget.I
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, b0 state) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(outRect, "outRect");
                Intrinsics.echo(view, "view");
                Intrinsics.echo(parent, "parent");
                Intrinsics.echo(state, "state");
                outRect.left = this.bravo;
                outRect.right = this.charlie;
                return;
            default:
                Intrinsics.echo(outRect, "outRect");
                Intrinsics.echo(view, "view");
                Intrinsics.echo(parent, "parent");
                Intrinsics.echo(state, "state");
                outRect.top = this.bravo;
                outRect.bottom = this.charlie;
                return;
        }
    }
}
