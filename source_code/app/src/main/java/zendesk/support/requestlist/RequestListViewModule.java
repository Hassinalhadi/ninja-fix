package zendesk.support.requestlist;

import com.squareup.picasso.Picasso;
import zendesk.support.ActivityScope;

/* loaded from: classes.dex */
public class RequestListViewModule {
    private final RequestListActivity activity;
    private final RequestListConfiguration config;

    public RequestListViewModule(RequestListActivity requestListActivity, RequestListConfiguration requestListConfiguration) {
        this.activity = requestListActivity;
        this.config = requestListConfiguration;
    }

    @ActivityScope
    public RequestListView view(Picasso picasso) {
        return new RequestListView(this.activity, this.config, picasso);
    }
}
