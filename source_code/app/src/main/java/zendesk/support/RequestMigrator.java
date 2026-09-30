package zendesk.support;

import java.util.List;

/* loaded from: classes.dex */
interface RequestMigrator {
    void clearLegacyRequestStorage();

    List<RequestData> getLegacyRequests();
}
