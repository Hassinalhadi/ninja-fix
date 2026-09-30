package zendesk.support.request;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RequestViewLoading extends View implements RequestView {
    public RequestViewLoading(Context context) {
        super(context);
    }

    @Override // zendesk.support.request.RequestView
    public boolean hasUnsavedInput() {
        return false;
    }

    @Override // zendesk.support.request.RequestView
    public boolean inflateMenu(MenuInflater menuInflater, Menu menu) {
        return false;
    }

    @Override // zendesk.support.request.RequestView
    public boolean onOptionsItemClicked(MenuItem menuItem) {
        return false;
    }

    public RequestViewLoading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RequestViewLoading(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
