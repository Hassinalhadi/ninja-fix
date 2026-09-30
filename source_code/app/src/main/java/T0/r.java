package T0;

import Y.aa;
import Y.ab;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.AbstractC2557q;
import s0.W;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class r extends T.r implements Y.r, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View alpha;
    public ViewTreeObserver purple;
    public final q red = new q(this, 0);
    public final q silver = new q(this, 1);

    public final aa b() {
        if (!getNode().isAttached()) {
            AbstractC2264a.bravo("visitLocalDescendants called on an unattached node");
        }
        T.r node = getNode();
        if ((node.getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
            boolean z2 = false;
            for (T.r child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                    T.r rVar = child$ui_release;
                    J.e eVar = null;
                    while (rVar != null) {
                        if (rVar instanceof aa) {
                            aa aaVar = (aa) rVar;
                            if (z2) {
                                return aaVar;
                            }
                            z2 = true;
                        } else if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar instanceof AbstractC2556p)) {
                            int i4 = 0;
                            for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        rVar = rVar2;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new J.e(new T.r[16]);
                                        }
                                        if (rVar != null) {
                                            eVar.bravo(rVar);
                                            rVar = null;
                                        }
                                        eVar.bravo(rVar2);
                                    }
                                }
                            }
                            if (i4 == 1) {
                            }
                        }
                        rVar = AbstractC2555o.bravo(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // T.r
    public final void onAttach() {
        super.onAttach();
        ViewTreeObserver viewTreeObserver = AbstractC2557q.oscar(this).getViewTreeObserver();
        this.purple = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // T.r
    public final void onDetach() {
        ViewTreeObserver viewTreeObserver = this.purple;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.purple = null;
        AbstractC2557q.oscar(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.alpha = null;
        super.onDetach();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z2;
        if (AbstractC2555o.golf(this).f13287f != null) {
            View charlie = l.charlie(this);
            Y.k focusOwner = ((C2946x) AbstractC2555o.hotel(this)).getFocusOwner();
            W hotel = AbstractC2555o.hotel(this);
            boolean z10 = true;
            if (view != null && !Intrinsics.areEqual(view, hotel) && l.alpha(charlie, view)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (view2 == null || Intrinsics.areEqual(view2, hotel) || !l.alpha(charlie, view2)) {
                z10 = false;
            }
            if (z2 && z10) {
                this.alpha = view2;
                return;
            }
            if (z10) {
                this.alpha = view2;
                aa b2 = b();
                if (!b2.d().alpha()) {
                    ab.echo(b2);
                    return;
                }
                return;
            }
            if (z2) {
                this.alpha = null;
                if (b().d().bravo()) {
                    ((Y.n) focusOwner).bravo(8, false, false);
                    return;
                }
                return;
            }
            this.alpha = null;
        }
    }

    @Override // Y.r
    public final void romeo(Y.o oVar) {
        oVar.delta(false);
        oVar.bravo(this.red);
        oVar.charlie(this.silver);
    }
}
