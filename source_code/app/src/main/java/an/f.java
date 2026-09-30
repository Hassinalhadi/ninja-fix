package an;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import ao.aa;

/* loaded from: classes3.dex */
public final class f extends ActionMode {
    public final Context alpha;
    public final b bravo;

    public f(Context context, b bVar) {
        this.alpha = context;
        this.bravo = bVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.bravo.alpha();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.bravo.bravo();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new aa(this.alpha, this.bravo.charlie());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.bravo.delta();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.bravo.echo();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.bravo.alpha;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.bravo.foxtrot();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.bravo.purple;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.bravo.golf();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.bravo.hotel();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.bravo.india(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.bravo.kilo(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.bravo.alpha = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.bravo.mike(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.bravo.november(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i4) {
        this.bravo.juliet(i4);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i4) {
        this.bravo.lima(i4);
    }
}
