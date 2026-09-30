package an;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0469n;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class e extends b implements ao.j {

    /* renamed from: a, reason: collision with root package name */
    public ao.l f2695a;
    public Context red;
    public ActionBarContextView silver;
    public J2.e teal;
    public WeakReference white;
    public boolean yellow;

    @Override // an.b
    public final void alpha() {
        if (this.yellow) {
            return;
        }
        this.yellow = true;
        this.teal.i(this);
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
        return this.f2695a;
    }

    @Override // ao.j
    public final void coral(ao.l lVar) {
        golf();
        C0469n c0469n = this.silver.silver;
        if (c0469n != null) {
            c0469n.november();
        }
    }

    @Override // an.b
    public final MenuInflater delta() {
        return new i(this.silver.getContext());
    }

    @Override // an.b
    public final CharSequence echo() {
        return this.silver.getSubtitle();
    }

    @Override // an.b
    public final CharSequence foxtrot() {
        return this.silver.getTitle();
    }

    @Override // an.b
    public final void golf() {
        this.teal.indigo(this, this.f2695a);
    }

    @Override // an.b
    public final boolean hotel() {
        return this.silver.f2778l;
    }

    @Override // an.b
    public final void india(View view) {
        WeakReference weakReference;
        this.silver.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.white = weakReference;
    }

    @Override // an.b
    public final void juliet(int i4) {
        kilo(this.red.getString(i4));
    }

    @Override // an.b
    public final void kilo(CharSequence charSequence) {
        this.silver.setSubtitle(charSequence);
    }

    @Override // an.b
    public final void lima(int i4) {
        mike(this.red.getString(i4));
    }

    @Override // an.b
    public final void mike(CharSequence charSequence) {
        this.silver.setTitle(charSequence);
    }

    @Override // an.b
    public final void november(boolean z2) {
        this.purple = z2;
        this.silver.setTitleOptional(z2);
    }

    @Override // ao.j
    public final boolean sierra(ao.l lVar, MenuItem menuItem) {
        return ((a) this.teal.purple).gold(this, menuItem);
    }
}
