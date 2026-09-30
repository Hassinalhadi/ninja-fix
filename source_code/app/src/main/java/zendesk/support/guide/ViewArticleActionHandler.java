package zendesk.support.guide;

import android.content.Context;
import com.google.gson.q;
import com.zendesk.logger.Logger;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import zendesk.configurations.Configuration;
import zendesk.configurations.ConfigurationUtil;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;

/* loaded from: classes.dex */
class ViewArticleActionHandler implements ActionHandler {
    private static final String HC_PATH_ELEMENT_ARTICLE = "articles";
    private static final String HC_PATH_ELEMENT_HC = "hc";
    private static final String HC_PATH_ELEMENT_NAME_SEPARATOR = "-";
    private static final String HELP_CENTER_ARTICLE_ID = "help_center_article_id";
    private static final String HELP_CENTER_ARTICLE_TITLE = "help_center_article_title";
    static final String HELP_CENTER_VIEW_ARTICLE = "help_center_view_article";
    private static final String LOG_TAG = "ViewArticleActionHandle";

    /* loaded from: classes.dex */
    public static class ActionPayload {
        private final String action;
        private final Map<String, Object> payload;

        private ActionPayload(String str, Map<String, Object> map) {
            this.action = str;
            this.payload = map;
        }

        public static ActionPayload invalid(String str) {
            return new ActionPayload(str, null);
        }

        public static ActionPayload valid(String str, Map<String, Object> map) {
            return new ActionPayload(str, map);
        }

        public String getAction() {
            return this.action;
        }

        public Map<String, Object> getPayload() {
            return this.payload;
        }

        public boolean isValid() {
            if (StringUtils.hasLength(this.action) && this.payload != null) {
                return true;
            }
            return false;
        }
    }

    public static Map<String, Object> data(long j5, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(HELP_CENTER_ARTICLE_ID, Long.valueOf(j5));
        hashMap.put(HELP_CENTER_ARTICLE_TITLE, str);
        return hashMap;
    }

    @Override // zendesk.core.ActionHandler
    public boolean canHandle(String str) {
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null) {
            return false;
        }
        return parse(parse).isValid();
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
        HttpUrl parse;
        List<Configuration> list;
        if (map == null) {
            Logger.w(LOG_TAG, "Property map is null, cannot open article.", new Object[0]);
            return;
        }
        String str = (String) map.get("help_center_view_article");
        if (!StringUtils.isEmpty(str) && (parse = HttpUrl.parse(str)) != null) {
            ActionPayload parse2 = parse(parse);
            if (parse2.isValid() && parse2.payload.containsKey(HELP_CENTER_ARTICLE_ID)) {
                long longValue = ((Long) parse2.payload.get(HELP_CENTER_ARTICLE_ID)).longValue();
                Configuration fromMap = ConfigurationUtil.fromMap(map, Configuration.class);
                if (fromMap != null) {
                    list = fromMap.getConfigurations();
                } else {
                    list = Collections.EMPTY_LIST;
                }
                ViewArticleActivity.builder(longValue).show(context, list);
            }
        }
    }

    public ActionPayload parse(HttpUrl httpUrl) {
        String str;
        List<String> pathSegments = httpUrl.pathSegments();
        if (pathSegments.size() >= 3 && pathSegments.size() <= 4) {
            int indexOf = pathSegments.indexOf(HC_PATH_ELEMENT_ARTICLE);
            if (HC_PATH_ELEMENT_HC.equals(pathSegments.get(0))) {
                if (indexOf == 1 || indexOf == 2) {
                    if (indexOf + 2 != pathSegments.size()) {
                        return ActionPayload.invalid("help_center_view_article");
                    }
                    String str2 = pathSegments.get(indexOf + 1);
                    String[] split = str2.split(HC_PATH_ELEMENT_NAME_SEPARATOR);
                    if (CollectionUtils.isEmpty(split)) {
                        return ActionPayload.invalid("help_center_view_article");
                    }
                    try {
                        long parseLong = Long.parseLong(split[0]);
                        StringBuilder sb2 = new StringBuilder(str2.length());
                        if (split.length > 1) {
                            int length = split.length;
                            for (int i4 = 1; i4 < length; i4++) {
                                sb2.append(split[i4]);
                                sb2.append(' ');
                            }
                            str = sb2.toString().trim();
                        } else {
                            str = "";
                        }
                        return ActionPayload.valid("help_center_view_article", data(parseLong, str));
                    } catch (NumberFormatException unused) {
                        return ActionPayload.invalid("help_center_view_article");
                    }
                }
            }
            return ActionPayload.invalid("help_center_view_article");
        }
        return ActionPayload.invalid("help_center_view_article");
    }

    @Override // zendesk.core.ActionHandler
    public void updateSettings(Map<String, q> map) {
    }
}
