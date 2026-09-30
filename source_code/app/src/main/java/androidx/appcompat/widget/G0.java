package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class G0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView alpha;

    public G0(SearchView searchView) {
        this.alpha = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
        this.alpha.onSubmitQuery();
        return true;
    }
}
