package androidx.appcompat.app;

import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import bv.aw;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class w implements Window.Callback {
    public final Window.Callback alpha;
    public aj purple;
    public boolean red;
    public boolean silver;
    public boolean teal;
    public final /* synthetic */ ab white;

    public w(ab abVar, Window.Callback callback) {
        this.white = abVar;
        if (callback != null) {
            this.alpha = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void alpha(Window.Callback callback) {
        try {
            this.red = true;
            callback.onContentChanged();
        } finally {
            this.red = false;
        }
    }

    public final boolean bravo(int i4, Menu menu) {
        return this.alpha.onMenuOpened(i4, menu);
    }

    public final void charlie(int i4, Menu menu) {
        this.alpha.onPanelClosed(i4, menu);
    }

    public final void delta(List list, Menu menu, int i4) {
        an.m.alpha(this.alpha, list, menu, i4);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.alpha.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.silver;
        Window.Callback callback = this.alpha;
        if (z2) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.white.uniform(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.alpha.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            ab abVar = this.white;
            abVar.beige();
            a aVar = abVar.f2731h;
            if (aVar == null || !aVar.juliet(keyCode, keyEvent)) {
                aa aaVar = abVar.f2707F;
                if (aaVar != null && abVar.cyan(aaVar, keyEvent.getKeyCode(), keyEvent)) {
                    aa aaVar2 = abVar.f2707F;
                    if (aaVar2 != null) {
                        aaVar2.lima = true;
                        return true;
                    }
                } else {
                    if (abVar.f2707F == null) {
                        aa azure = abVar.azure(0);
                        abVar.emerald(azure, keyEvent);
                        boolean cyan = abVar.cyan(azure, keyEvent.getKeyCode(), keyEvent);
                        azure.kilo = false;
                        if (cyan) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.alpha.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.alpha.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.alpha.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.alpha.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.alpha.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.alpha.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.red) {
            this.alpha.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 == 0 && !(menu instanceof ao.l)) {
            return false;
        }
        return this.alpha.onCreatePanelMenu(i4, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i4) {
        View view;
        aj ajVar = this.purple;
        if (ajVar != null) {
            if (i4 == 0) {
                view = new View(ajVar.alpha.alpha.alpha.getContext());
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return this.alpha.onCreatePanelView(i4);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.alpha.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        return this.alpha.onMenuItemSelected(i4, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i4, Menu menu) {
        bravo(i4, menu);
        ab abVar = this.white;
        if (i4 == 108) {
            abVar.beige();
            a aVar = abVar.f2731h;
            if (aVar != null) {
                aVar.charlie(true);
            }
        } else {
            abVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i4, Menu menu) {
        if (this.teal) {
            this.alpha.onPanelClosed(i4, menu);
            return;
        }
        charlie(i4, menu);
        ab abVar = this.white;
        if (i4 == 108) {
            abVar.beige();
            a aVar = abVar.f2731h;
            if (aVar != null) {
                aVar.charlie(false);
                return;
            }
            return;
        }
        if (i4 == 0) {
            aa azure = abVar.azure(i4);
            if (azure.mike) {
                abVar.romeo(azure, false);
                return;
            }
            return;
        }
        abVar.getClass();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        an.n.alpha(this.alpha, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i4, View view, Menu menu) {
        ao.l lVar;
        if (menu instanceof ao.l) {
            lVar = (ao.l) menu;
        } else {
            lVar = null;
        }
        if (i4 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f3218q = true;
        }
        aj ajVar = this.purple;
        if (ajVar != null && i4 == 0) {
            ak akVar = ajVar.alpha;
            if (!akVar.delta) {
                akVar.alpha.lima = true;
                akVar.delta = true;
            }
        }
        boolean onPreparePanel = this.alpha.onPreparePanel(i4, view, menu);
        if (lVar != null) {
            lVar.f3218q = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i4) {
        ao.l lVar = this.white.azure(0).hotel;
        if (lVar != null) {
            delta(list, lVar, i4);
        } else {
            delta(list, menu, i4);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return an.l.alpha(this.alpha, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.alpha.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.alpha.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.alpha.onSearchRequested();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, J2.n, an.a] */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
        ab abVar = this.white;
        abVar.getClass();
        if (i4 != 0) {
            return an.l.bravo(this.alpha, callback, i4);
        }
        Context context = abVar.f2728d;
        ?? obj = new Object();
        obj.purple = context;
        obj.alpha = callback;
        obj.red = new ArrayList();
        obj.silver = new aw(0);
        an.b lima = abVar.lima(obj);
        if (lima != null) {
            return obj.november(lima);
        }
        return null;
    }
}
