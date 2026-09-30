package Wc;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ l purple;

    public /* synthetic */ e(l lVar, int i4) {
        this.alpha = i4;
        this.purple = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.alpha) {
            case 0:
                this.purple.juliet();
                return;
            default:
                this.purple.juliet();
                return;
        }
    }
}
