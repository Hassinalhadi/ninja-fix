package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes3.dex */
public final class E0 implements View.OnClickListener {
    public final /* synthetic */ SearchView alpha;

    public E0(SearchView searchView) {
        this.alpha = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.alpha;
        if (view == searchView.mSearchButton) {
            searchView.onSearchClicked();
            return;
        }
        if (view == searchView.mCloseButton) {
            searchView.onCloseClicked();
            return;
        }
        if (view == searchView.mGoButton) {
            searchView.onSubmitQuery();
        } else if (view == searchView.mVoiceButton) {
            searchView.onVoiceClicked();
        } else if (view == searchView.mSearchSrcTextView) {
            searchView.forceSuggestionQuery();
        }
    }
}
