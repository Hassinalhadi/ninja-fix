package zendesk.support.requestlist;

import android.content.Context;
import com.google.gson.q;
import java.util.Map;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.support.Constants;

/* loaded from: classes.dex */
class RequestListSyncHandler implements ActionHandler {
    private final RequestListPresenter presenter;
    private boolean running = false;
    private boolean outdated = false;

    public RequestListSyncHandler(RequestListPresenter requestListPresenter) {
        this.presenter = requestListPresenter;
    }

    @Override // zendesk.core.ActionHandler
    public boolean canHandle(String str) {
        return Constants.ACTION_REFRESH_REQUEST_LIST.equals(str);
    }

    @Override // zendesk.core.ActionHandler
    public ActionDescription getActionDescription() {
        return null;
    }

    @Override // zendesk.core.ActionHandler
    public int getPriority() {
        return 0;
    }

    @Override // zendesk.core.ActionHandler
    public void handle(Map<String, Object> map, Context context) {
        if (this.running) {
            this.presenter.refresh();
            this.outdated = false;
        } else {
            this.outdated = true;
        }
    }

    public void setRunning(boolean z2) {
        this.running = z2;
        if (this.outdated) {
            this.presenter.refresh();
            this.outdated = false;
        }
    }

    @Override // zendesk.core.ActionHandler
    public void updateSettings(Map<String, q> map) {
    }
}
