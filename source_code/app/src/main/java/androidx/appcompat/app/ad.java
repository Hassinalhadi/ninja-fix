package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import delivery.samurai.android.R;
import s1.InterfaceC2577j;
import t6.AbstractC3077x;

/* loaded from: classes3.dex */
public class ad extends ae.p implements j {
    private o mDelegate;
    private final InterfaceC2577j mKeyDispatcher;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ad(Context context, int i4) {
        super(context, r2);
        int i5;
        if (i4 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i5 = typedValue.resourceId;
        } else {
            i5 = i4;
        }
        this.mKeyDispatcher = new InterfaceC2577j() { // from class: androidx.appcompat.app.ac
            @Override // s1.InterfaceC2577j
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return ad.this.superDispatchKeyEvent(keyEvent);
            }
        };
        o delegate = getDelegate();
        if (i4 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i4 = typedValue2.resourceId;
        }
        ((ab) delegate).f2714M = i4;
        delegate.delta();
    }

    @Override // ae.p, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ab abVar = (ab) getDelegate();
        abVar.whiskey();
        ((ViewGroup) abVar.f2743t.findViewById(android.R.id.content)).addView(view, layoutParams);
        abVar.f2729f.alpha(abVar.e.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().echo();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC3077x.charlie(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i4) {
        ab abVar = (ab) getDelegate();
        abVar.whiskey();
        return (T) abVar.e.findViewById(i4);
    }

    public o getDelegate() {
        if (this.mDelegate == null) {
            K2.i iVar = o.alpha;
            this.mDelegate = new ab(getContext(), getWindow(), this, this);
        }
        return this.mDelegate;
    }

    public a getSupportActionBar() {
        ab abVar = (ab) getDelegate();
        abVar.beige();
        return abVar.f2731h;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().bravo();
    }

    @Override // ae.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().alpha();
        super.onCreate(bundle);
        getDelegate().delta();
    }

    @Override // ae.p, android.app.Dialog
    public void onStop() {
        super.onStop();
        ab abVar = (ab) getDelegate();
        abVar.beige();
        a aVar = abVar.f2731h;
        if (aVar != null) {
            aVar.sierra(false);
        }
    }

    @Override // androidx.appcompat.app.j
    public void onSupportActionModeFinished(an.b bVar) {
    }

    @Override // androidx.appcompat.app.j
    public void onSupportActionModeStarted(an.b bVar) {
    }

    @Override // androidx.appcompat.app.j
    public an.b onWindowStartingSupportActionMode(an.a aVar) {
        return null;
    }

    @Override // ae.p, android.app.Dialog
    public void setContentView(int i4) {
        initializeViewTreeOwners();
        getDelegate().hotel(i4);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().kilo(charSequence);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i4) {
        return getDelegate().golf(i4);
    }

    @Override // ae.p, android.app.Dialog
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().india(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i4) {
        super.setTitle(i4);
        getDelegate().kilo(getContext().getString(i4));
    }

    @Override // ae.p, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().juliet(view, layoutParams);
    }
}
