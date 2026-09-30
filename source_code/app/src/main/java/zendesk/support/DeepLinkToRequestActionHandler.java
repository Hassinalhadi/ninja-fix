package zendesk.support;

import android.content.Context;
import android.content.Intent;
import com.google.gson.q;
import f1.ai;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zendesk.configurations.Configuration;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.support.requestlist.RequestListActivity;

/* loaded from: classes.dex */
class DeepLinkToRequestActionHandler implements ActionHandler {
    private static final String BACK_STACK_ACTIVITIES = "back_stack_activities";
    private static final String REQUEST_INTENT = "request_ui_config";
    static final String REQUEST_VIEW_CONVERSATION = "request_view_conversation";

    public static Map<String, Object> data(Intent intent, List<Intent> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(REQUEST_INTENT, intent);
        hashMap.put(BACK_STACK_ACTIVITIES, list);
        return hashMap;
    }

    @Override // zendesk.core.ActionHandler
    public boolean canHandle(String str) {
        return str.equals(REQUEST_VIEW_CONVERSATION);
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
        ai aiVar = new ai(context);
        if (map != null) {
            Iterator it = ((List) map.get(BACK_STACK_ACTIVITIES)).iterator();
            while (it.hasNext()) {
                aiVar.alpha((Intent) it.next());
            }
        }
        aiVar.alpha(RequestListActivity.builder().intent(context, new Configuration[0]));
        if (map != null) {
            aiVar.alpha((Intent) map.get(REQUEST_INTENT));
        }
        aiVar.delta();
    }

    @Override // zendesk.core.ActionHandler
    public void updateSettings(Map<String, q> map) {
    }
}
