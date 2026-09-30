package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.gson.q;
import com.zendesk.logger.Logger;
import java.util.List;
import java.util.Map;
import zendesk.configurations.Configuration;
import zendesk.configurations.ConfigurationUtil;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.Zendesk;
import zendesk.support.request.RequestActivity;

/* loaded from: classes.dex */
public final class CreateRequestActionHandler implements ActionHandler {
    private static final String LOG_TAG = "CreateRequestActionHandler";
    private final Context context;

    public CreateRequestActionHandler(Context context) {
        this.context = context;
    }

    private static boolean isInitialized() {
        if (Support.INSTANCE.isInitialized() && Zendesk.INSTANCE.isInitialized()) {
            return true;
        }
        Logger.w(LOG_TAG, "Support SDK contact handler returning false because Support.init(..) or Zendesk.init(..) has not been called!", new Object[0]);
        return false;
    }

    @Override // zendesk.core.ActionHandler
    public boolean canHandle(String str) {
        if (isInitialized() && "action_contact_option".equals(str)) {
            return true;
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    public List<Configuration> extractConfigs(Map<String, Object> map) {
        Configuration fromMap = ConfigurationUtil.fromMap(map, Configuration.class);
        if (fromMap != null) {
            return fromMap.getConfigurations();
        }
        return null;
    }

    @Override // zendesk.core.ActionHandler
    public ActionDescription getActionDescription() {
        String string = this.context.getString(R.string.zs_request_contact_option_leave_a_message);
        return new ActionDescription(string, string, R.drawable.zs_contact_leave_message);
    }

    @Override // zendesk.core.ActionHandler
    public int getPriority() {
        return 0;
    }

    @Override // zendesk.core.ActionHandler
    @SuppressLint({"RestrictedApi"})
    public void handle(Map<String, Object> map, Context context) {
        if (isInitialized()) {
            List<Configuration> extractConfigs = extractConfigs(map);
            if (extractConfigs != null) {
                RequestActivity.builder().show(context, extractConfigs);
            } else {
                RequestActivity.builder().show(context, new Configuration[0]);
            }
        }
    }

    @Override // zendesk.core.ActionHandler
    public void updateSettings(Map<String, q> map) {
    }
}
