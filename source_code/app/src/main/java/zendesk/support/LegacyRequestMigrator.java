package zendesk.support;

import android.content.SharedPreferences;
import av.q;
import com.zendesk.logger.Logger;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
class LegacyRequestMigrator implements RequestMigrator {
    private static final String LOG_TAG = "LegacyRequestMigrator";
    private static final String PREFS_COMMENT_COUNT_KEY_PREFIX = "request-id-cc";
    private static final String REQUEST_KEY = "stored_requests";
    private SharedPreferences legacyRequestStorage;

    public LegacyRequestMigrator(SharedPreferences sharedPreferences) {
        this.legacyRequestStorage = sharedPreferences;
    }

    private String getCommentCountKey(String str) {
        Locale locale = Locale.US;
        return q.echo("request-id-cc-", str);
    }

    @Override // zendesk.support.RequestMigrator
    public void clearLegacyRequestStorage() {
        this.legacyRequestStorage.edit().clear().apply();
    }

    @Override // zendesk.support.RequestMigrator
    public List<RequestData> getLegacyRequests() {
        String string = this.legacyRequestStorage.getString(REQUEST_KEY, null);
        if (StringUtils.isEmpty(string)) {
            return Collections.EMPTY_LIST;
        }
        Logger.d(LOG_TAG, "Migrating legacy request IDs.", new Object[0]);
        List<String> fromCsv = StringUtils.fromCsv(string);
        ArrayList arrayList = new ArrayList(fromCsv.size());
        for (String str : fromCsv) {
            int i4 = this.legacyRequestStorage.getInt(getCommentCountKey(str), -1);
            if (i4 > -1) {
                arrayList.add(RequestData.create(str, i4, 0));
            } else {
                arrayList.add(RequestData.create(str, 0, 0));
            }
        }
        return arrayList;
    }
}
