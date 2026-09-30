package T0;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class q extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ r purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i4;
        View findNextFocusFromRect;
        switch (this.alpha) {
            case 0:
                Y.a aVar = (Y.a) obj;
                r rVar = this.purple;
                View charlie = l.charlie(rVar);
                if (!charlie.isFocused() && !charlie.hasFocus()) {
                    if (!Y.g.kilo(charlie, Y.g.november(aVar.alpha), l.bravo(((C2946x) AbstractC2555o.hotel(rVar)).getFocusOwner(), AbstractC2557q.oscar(rVar), charlie))) {
                        aVar.bravo = true;
                    }
                }
                return Unit.INSTANCE;
            default:
                Y.a aVar2 = (Y.a) obj;
                r rVar2 = this.purple;
                View charlie2 = l.charlie(rVar2);
                if (charlie2.hasFocus()) {
                    Y.k focusOwner = ((C2946x) AbstractC2555o.hotel(rVar2)).getFocusOwner();
                    View oscar = AbstractC2557q.oscar(rVar2);
                    if (!(charlie2 instanceof ViewGroup)) {
                        if (!oscar.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    } else {
                        Rect bravo = l.bravo(focusOwner, oscar, charlie2);
                        Integer november = Y.g.november(aVar2.alpha);
                        if (november != null) {
                            i4 = november.intValue();
                        } else {
                            i4 = 130;
                        }
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = rVar2.alpha;
                        if (view != null) {
                            findNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) oscar, view, i4);
                        } else {
                            findNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) oscar, bravo, i4);
                        }
                        if (findNextFocusFromRect != null && l.alpha(charlie2, findNextFocusFromRect)) {
                            findNextFocusFromRect.requestFocus(i4, bravo);
                            aVar2.bravo = true;
                        } else if (!oscar.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
