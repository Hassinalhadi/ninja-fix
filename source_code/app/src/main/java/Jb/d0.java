package Jb;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* loaded from: classes2.dex */
public final /* synthetic */ class d0 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ int alpha;

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        switch (this.alpha) {
            case 0:
                if (i4 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                return true;
            case 1:
                int i5 = Wb.m.red;
                return true;
            case 2:
                if (i4 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                return true;
            default:
                if (i4 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                return true;
        }
    }
}
