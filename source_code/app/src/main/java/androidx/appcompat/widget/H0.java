package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes3.dex */
public abstract class H0 {
    public static void alpha(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static void bravo(SearchView.SearchAutoComplete searchAutoComplete, int i4) {
        searchAutoComplete.setInputMethodMode(i4);
    }
}
