package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes3.dex */
public final class ap implements au, DialogInterface.OnClickListener {
    public androidx.appcompat.app.g alpha;
    public aq purple;
    public CharSequence red;
    public final /* synthetic */ av silver;

    public ap(av avVar) {
        this.silver = avVar;
    }

    @Override // androidx.appcompat.widget.au
    public final boolean alpha() {
        androidx.appcompat.app.g gVar = this.alpha;
        if (gVar != null) {
            return gVar.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.au
    public final int bravo() {
        return 0;
    }

    @Override // androidx.appcompat.widget.au
    public final void charlie(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.au
    public final CharSequence delta() {
        return this.red;
    }

    @Override // androidx.appcompat.widget.au
    public final void dismiss() {
        androidx.appcompat.app.g gVar = this.alpha;
        if (gVar != null) {
            gVar.dismiss();
            this.alpha = null;
        }
    }

    @Override // androidx.appcompat.widget.au
    public final Drawable echo() {
        return null;
    }

    @Override // androidx.appcompat.widget.au
    public final void foxtrot(CharSequence charSequence) {
        this.red = charSequence;
    }

    @Override // androidx.appcompat.widget.au
    public final void india(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.au
    public final void kilo(int i4) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.au
    public final void lima(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.au
    public final void mike(int i4, int i5) {
        if (this.purple == null) {
            return;
        }
        av avVar = this.silver;
        Fe.c cVar = new Fe.c(avVar.getPopupContext());
        CharSequence charSequence = this.red;
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) cVar.red;
        if (charSequence != null) {
            dVar.delta = charSequence;
        }
        aq aqVar = this.purple;
        int selectedItemPosition = avVar.getSelectedItemPosition();
        dVar.quebec = aqVar;
        dVar.romeo = this;
        dVar.uniform = selectedItemPosition;
        dVar.tango = true;
        androidx.appcompat.app.g foxtrot = cVar.foxtrot();
        this.alpha = foxtrot;
        AlertController$RecycleListView alertController$RecycleListView = foxtrot.alpha.foxtrot;
        alertController$RecycleListView.setTextDirection(i4);
        alertController$RecycleListView.setTextAlignment(i5);
        this.alpha.show();
    }

    @Override // androidx.appcompat.widget.au
    public final int november() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        av avVar = this.silver;
        avVar.setSelection(i4);
        if (avVar.getOnItemClickListener() != null) {
            avVar.performItemClick(null, i4, this.purple.getItemId(i4));
        }
        dismiss();
    }

    @Override // androidx.appcompat.widget.au
    public final void oscar(ListAdapter listAdapter) {
        this.purple = (aq) listAdapter;
    }
}
