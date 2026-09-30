package zendesk.support.request;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface RequestView {
    boolean hasUnsavedInput();

    boolean inflateMenu(MenuInflater menuInflater, Menu menu);

    boolean onOptionsItemClicked(MenuItem menuItem);
}
