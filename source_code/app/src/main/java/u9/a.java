package u9;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import n9.EnumC2164a;
import s6.AbstractC2769s6;

/* loaded from: classes2.dex */
public final class a extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ c purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Float f5;
        switch (this.alpha) {
            case 0:
                int intValue = ((Number) obj).intValue();
                c cVar = this.purple;
                cVar.getClass();
                Function1<Integer, Unit> onPageChange$imageviewer_release = cVar.getOnPageChange$imageviewer_release();
                if (onPageChange$imageviewer_release != null) {
                    onPageChange$imageviewer_release.invoke(Integer.valueOf(intValue));
                }
                return Unit.INSTANCE;
            case 1:
                long longValue = ((Number) obj).longValue();
                c cVar2 = this.purple;
                View view = cVar2.f13970a;
                AbstractC2769s6.alpha(view, Float.valueOf(view.getAlpha()), Float.valueOf(0.0f), longValue);
                View overlayView$imageviewer_release = cVar2.getOverlayView$imageviewer_release();
                if (overlayView$imageviewer_release != null) {
                    View overlayView$imageviewer_release2 = cVar2.getOverlayView$imageviewer_release();
                    if (overlayView$imageviewer_release2 != null) {
                        f5 = Float.valueOf(overlayView$imageviewer_release2.getAlpha());
                    } else {
                        f5 = null;
                    }
                    AbstractC2769s6.alpha(overlayView$imageviewer_release, f5, Float.valueOf(0.0f), longValue);
                }
                return Unit.INSTANCE;
            case 2:
                long longValue2 = ((Number) obj).longValue();
                c cVar3 = this.purple;
                AbstractC2769s6.alpha(cVar3.f13970a, Float.valueOf(0.0f), Float.valueOf(1.0f), longValue2);
                View overlayView$imageviewer_release3 = cVar3.getOverlayView$imageviewer_release();
                if (overlayView$imageviewer_release3 != null) {
                    AbstractC2769s6.alpha(overlayView$imageviewer_release3, Float.valueOf(0.0f), Float.valueOf(1.0f), longValue2);
                }
                return Unit.INSTANCE;
            case 3:
                MotionEvent it = (MotionEvent) obj;
                Intrinsics.foxtrot(it, "it");
                c cVar4 = this.purple;
                if (cVar4.e.alpha) {
                    c.bravo(cVar4, it, cVar4.f13981m);
                }
                return Boolean.FALSE;
            case 4:
                Intrinsics.foxtrot((MotionEvent) obj, "it");
                this.purple.f13980l = !r8.echo();
                return Boolean.FALSE;
            default:
                EnumC2164a it2 = (EnumC2164a) obj;
                Intrinsics.foxtrot(it2, "it");
                this.purple.f13982n = it2;
                return Unit.INSTANCE;
        }
    }
}
