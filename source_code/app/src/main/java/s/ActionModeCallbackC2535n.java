package s;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* renamed from: s.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ActionModeCallbackC2535n extends ActionMode.Callback2 implements ActionMode.Callback {
    public final C2525d alpha;

    public ActionModeCallbackC2535n(C2525d c2525d) {
        this.alpha = c2525d;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.alpha.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.alpha.alpha(menu);
        if (menu.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.alpha.alpha.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        Z.c cVar = (Z.c) this.alpha.charlie.invoke();
        rect.set(Math.round(cVar.alpha), Math.round(cVar.bravo), Math.round(cVar.charlie), Math.round(cVar.delta));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.alpha.alpha(menu);
    }
}
