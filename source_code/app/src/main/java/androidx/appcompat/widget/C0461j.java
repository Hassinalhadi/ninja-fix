package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0461j extends AbstractViewOnTouchListenerC0448c0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2878c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f2879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0461j(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2879d = actionMenuItemView;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0448c0
    public final ao.ab bravo() {
        C0455g c0455g;
        switch (this.f2878c) {
            case 0:
                C0455g c0455g2 = ((C0463k) this.f2879d).alpha.f2912m;
                if (c0455g2 == null) {
                    return null;
                }
                return c0455g2.alpha();
            default:
                ao.b bVar = ((ActionMenuItemView) this.f2879d).white;
                if (bVar != null && (c0455g = ((C0457h) bVar).alpha.f2913n) != null) {
                    return c0455g.alpha();
                }
                return null;
        }
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0448c0
    public final boolean charlie() {
        ao.ab bravo;
        switch (this.f2878c) {
            case 0:
                ((C0463k) this.f2879d).alpha.november();
                return true;
            default:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2879d;
                ao.k kVar = actionMenuItemView.silver;
                if (kVar != null && kVar.bravo(actionMenuItemView.alpha) && (bravo = bravo()) != null && bravo.alpha()) {
                    return true;
                }
                return false;
        }
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0448c0
    public boolean delta() {
        switch (this.f2878c) {
            case 0:
                C0469n c0469n = ((C0463k) this.f2879d).alpha;
                if (c0469n.f2914o != null) {
                    return false;
                }
                c0469n.golf();
                return true;
            default:
                return super.delta();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0461j(C0463k c0463k, C0463k c0463k2) {
        super(c0463k2);
        this.f2879d = c0463k;
    }
}
