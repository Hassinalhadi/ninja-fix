package s;

import F.C0130l1;
import U0.x;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2523b implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C2528g purple;

    public /* synthetic */ C2523b(C2528g c2528g, int i4) {
        this.alpha = i4;
        this.purple = c2528g;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Looper looper;
        switch (this.alpha) {
            case 0:
                Function0 function0 = (Function0) obj;
                C2528g c2528g = this.purple;
                Handler handler = c2528g.alpha.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = c2528g.alpha.getHandler();
                    if (handler2 != null) {
                        handler2.post(new x(function0, 4));
                    }
                }
                return Unit.INSTANCE;
            case 1:
                ActionMode actionMode = this.purple.hotel;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return Unit.INSTANCE;
            case 2:
                ActionMode actionMode2 = this.purple.hotel;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return Unit.INSTANCE;
            default:
                C2528g c2528g2 = this.purple;
                c2528g2.echo.echo();
                return new C0130l1(10, c2528g2);
        }
    }
}
