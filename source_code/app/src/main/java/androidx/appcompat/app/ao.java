package androidx.appcompat.app;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0469n;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class ao extends an.b implements ao.j {
    public final Context red;
    public final ao.l silver;
    public J2.e teal;
    public WeakReference white;
    public final /* synthetic */ ap yellow;

    public ao(ap apVar, Context context, J2.e eVar) {
        this.yellow = apVar;
        this.red = context;
        this.teal = eVar;
        ao.l lVar = new ao.l(context);
        lVar.e = 1;
        this.silver = lVar;
        lVar.teal = this;
    }

    @Override // an.b
    public final void alpha() {
        ap apVar = this.yellow;
        if (apVar.india != this) {
            return;
        }
        boolean z2 = apVar.papa;
        boolean z10 = apVar.quebec;
        if (!z2 && !z10) {
            this.teal.i(this);
        } else {
            apVar.juliet = this;
            apVar.kilo = this.teal;
        }
        this.teal = null;
        apVar.xray(false);
        ActionBarContextView actionBarContextView = apVar.foxtrot;
        if (actionBarContextView.f2771d == null) {
            actionBarContextView.echo();
        }
        apVar.charlie.setHideOnContentScrollEnabled(apVar.victor);
        apVar.india = null;
    }

    @Override // an.b
    public final View bravo() {
        WeakReference weakReference = this.white;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // an.b
    public final ao.l charlie() {
        return this.silver;
    }

    @Override // ao.j
    public final void coral(ao.l lVar) {
        if (this.teal != null) {
            golf();
            C0469n c0469n = this.yellow.foxtrot.silver;
            if (c0469n != null) {
                c0469n.november();
            }
        }
    }

    @Override // an.b
    public final MenuInflater delta() {
        return new an.i(this.red);
    }

    @Override // an.b
    public final CharSequence echo() {
        return this.yellow.foxtrot.getSubtitle();
    }

    @Override // an.b
    public final CharSequence foxtrot() {
        return this.yellow.foxtrot.getTitle();
    }

    @Override // an.b
    public final void golf() {
        if (this.yellow.india != this) {
            return;
        }
        ao.l lVar = this.silver;
        lVar.whiskey();
        try {
            this.teal.indigo(this, lVar);
        } finally {
            lVar.victor();
        }
    }

    @Override // an.b
    public final boolean hotel() {
        return this.yellow.foxtrot.f2778l;
    }

    @Override // an.b
    public final void india(View view) {
        this.yellow.foxtrot.setCustomView(view);
        this.white = new WeakReference(view);
    }

    @Override // an.b
    public final void juliet(int i4) {
        kilo(this.yellow.alpha.getResources().getString(i4));
    }

    @Override // an.b
    public final void kilo(CharSequence charSequence) {
        this.yellow.foxtrot.setSubtitle(charSequence);
    }

    @Override // an.b
    public final void lima(int i4) {
        mike(this.yellow.alpha.getResources().getString(i4));
    }

    @Override // an.b
    public final void mike(CharSequence charSequence) {
        this.yellow.foxtrot.setTitle(charSequence);
    }

    @Override // an.b
    public final void november(boolean z2) {
        this.purple = z2;
        this.yellow.foxtrot.setTitleOptional(z2);
    }

    @Override // ao.j
    public final boolean sierra(ao.l lVar, MenuItem menuItem) {
        J2.e eVar = this.teal;
        if (eVar != null) {
            return ((an.a) eVar.purple).gold(this, menuItem);
        }
        return false;
    }
}
