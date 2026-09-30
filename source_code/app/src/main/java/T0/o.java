package T0;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.C0584p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s0.W;

/* loaded from: classes3.dex */
public final class o extends Lambda implements Function0 {
    public final /* synthetic */ Context alpha;
    public final /* synthetic */ Function1 purple;
    public final /* synthetic */ C0584p red;
    public final /* synthetic */ R.g silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ View white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, Function1 function1, C0584p c0584p, R.g gVar, int i4, View view) {
        super(0);
        this.alpha = context;
        this.purple = function1;
        this.red = c0584p;
        this.silver = gVar;
        this.teal = i4;
        this.white = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KeyEvent.Callback callback = this.white;
        Intrinsics.charlie(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        W w4 = (W) callback;
        return new t(this.alpha, this.purple, this.red, this.silver, this.teal, w4).getLayoutNode();
    }
}
