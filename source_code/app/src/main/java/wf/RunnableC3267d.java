package wf;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import vf.C3207k;
import zendesk.core.Callback;

/* renamed from: wf.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3267d implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ RunnableC3267d(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                ((C3207k) this.purple).beige((C3268e) this.red, Unit.INSTANCE);
                return;
            case 1:
                FrameLayout frameLayout = (FrameLayout) this.purple;
                View childAt = frameLayout.getChildAt(0);
                if (childAt == null) {
                    childAt = frameLayout;
                }
                ((BottomSheetBehavior) this.red).romeo(Math.min(childAt.getMeasuredHeight(), frameLayout.getRootView().getHeight()));
                return;
            default:
                ((Callback) this.purple).lambda$internalSuccess$0(this.red);
                return;
        }
    }
}
