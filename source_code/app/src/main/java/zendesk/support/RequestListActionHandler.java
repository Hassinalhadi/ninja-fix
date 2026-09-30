package zendesk.support;

import android.content.Context;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.e;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.zendesk.logger.Logger;
import java.util.Map;
import zendesk.configurations.ConfigurationUtil;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.support.requestlist.RequestListActivity;
import zendesk.support.requestlist.RequestListConfiguration;

/* loaded from: classes.dex */
class RequestListActionHandler implements ActionHandler {
    private static final String LOG_TAG = "RequestListActionHandler";
    private boolean conversationsEnabled;

    @Override // zendesk.core.ActionHandler
    public boolean canHandle(String str) {
        if (str.equals("action_conversation_list") && this.conversationsEnabled) {
            return true;
        }
        return false;
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
        RequestListActivity.builder().show(context, (RequestListConfiguration) ConfigurationUtil.fromMap(map, RequestListConfiguration.class));
    }

    @Override // zendesk.core.ActionHandler
    public void updateSettings(Map<String, q> map) {
        q qVar;
        Object obj = null;
        if (map == null) {
            qVar = null;
        } else {
            try {
                qVar = map.get("support");
            } catch (JsonSyntaxException e) {
                Logger.w(LOG_TAG, "Unable to read settings.", e, new Object[0]);
                return;
            }
        }
        l alpha = new m().alpha();
        TypeToken typeToken = TypeToken.get(SupportSettings.class);
        if (qVar != null) {
            obj = alpha.bravo(new e(qVar), typeToken);
        }
        SupportSettings supportSettings = (SupportSettings) obj;
        if (supportSettings != null) {
            this.conversationsEnabled = supportSettings.getConversations().isEnabled();
        }
    }
}
