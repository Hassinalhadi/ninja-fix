package u9;

import android.widget.FrameLayout;
import com.stfalcon.imageviewer.common.pager.MultiTouchViewPager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ c purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                Function0<Unit> onDismiss$imageviewer_release = this.purple.getOnDismiss$imageviewer_release();
                if (onDismiss$imageviewer_release != null) {
                    onDismiss$imageviewer_release.invoke();
                }
                return Unit.INSTANCE;
            case 1:
                c cVar = this.purple;
                cVar.f13970a.setAlpha(1.0f);
                FrameLayout makeGone = cVar.f13972c;
                Intrinsics.foxtrot(makeGone, "$this$makeGone");
                makeGone.setVisibility(8);
                MultiTouchViewPager makeVisible = cVar.e;
                Intrinsics.foxtrot(makeVisible, "$this$makeVisible");
                makeVisible.setVisibility(0);
                return Unit.INSTANCE;
            case 2:
                return Boolean.valueOf(c.alpha(this.purple));
            default:
                this.purple.charlie();
                return Unit.INSTANCE;
        }
    }
}
