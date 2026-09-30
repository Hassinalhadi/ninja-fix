package T0;

import android.view.MotionEvent;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.x;
import s0.W;
import s0.al;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class d extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ t purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(t tVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2946x c2946x;
        boolean dispatchTouchEvent;
        switch (this.alpha) {
            case 0:
                W w4 = (W) obj;
                if (w4 instanceof C2946x) {
                    c2946x = (C2946x) w4;
                } else {
                    c2946x = null;
                }
                t tVar = this.purple;
                if (c2946x != null) {
                    c2946x.getAndroidViewsHandler$ui_release().removeViewInLayout(tVar);
                    HashMap<al, j> layoutNodeToHolder = c2946x.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                    x.charlie(layoutNodeToHolder).remove(c2946x.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(tVar));
                    tVar.setImportantForAccessibility(0);
                }
                tVar.removeAllViewsInLayout();
                return Unit.INSTANCE;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                t tVar2 = this.purple;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = tVar2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = tVar2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
