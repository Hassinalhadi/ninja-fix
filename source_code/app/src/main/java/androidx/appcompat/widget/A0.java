package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes3.dex */
public final class A0 implements TextWatcher {
    public final /* synthetic */ SearchView alpha;

    public A0(SearchView searchView) {
        this.alpha = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        this.alpha.onTextChanged(charSequence);
    }
}
