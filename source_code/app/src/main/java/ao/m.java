package ao;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes3.dex */
public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {
    public ae alpha;
    public androidx.appcompat.app.g purple;
    public h red;

    @Override // ao.w
    public final void bravo(l lVar, boolean z2) {
        androidx.appcompat.app.g gVar;
        if ((z2 || lVar == this.alpha) && (gVar = this.purple) != null) {
            gVar.dismiss();
        }
    }

    @Override // ao.w
    public final boolean echo(l lVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        h hVar = this.red;
        if (hVar.white == null) {
            hVar.white = new g(hVar);
        }
        this.alpha.quebec(hVar.white.getItem(i4), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.red.bravo(this.alpha, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        ae aeVar = this.alpha;
        if (i4 == 82 || i4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.purple.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.purple.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                aeVar.charlie(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return aeVar.performShortcut(i4, keyEvent, 0);
    }
}
