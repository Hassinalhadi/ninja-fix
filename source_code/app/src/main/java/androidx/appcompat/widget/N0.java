package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes3.dex */
public final class N0 implements Runnable {
    public final /* synthetic */ SearchView.SearchAutoComplete alpha;

    public N0(SearchView.SearchAutoComplete searchAutoComplete) {
        this.alpha = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.alpha;
        if (searchAutoComplete.yellow) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.yellow = false;
        }
    }
}
