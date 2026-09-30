package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class F0 implements View.OnKeyListener {
    public final /* synthetic */ SearchView alpha;

    public F0(SearchView searchView) {
        this.alpha = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        SearchView searchView = this.alpha;
        if (searchView.mSearchable == null) {
            return false;
        }
        if (searchView.mSearchSrcTextView.isPopupShowing() && searchView.mSearchSrcTextView.getListSelection() != -1) {
            return searchView.onSuggestionsKey(view, i4, keyEvent);
        }
        if (TextUtils.getTrimmedLength(searchView.mSearchSrcTextView.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i4 != 66) {
            return false;
        }
        view.cancelLongPress();
        searchView.launchQuerySearch(0, null, searchView.mSearchSrcTextView.getText().toString());
        return true;
    }
}
