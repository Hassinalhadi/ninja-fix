package zendesk.support;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface RequestStorage {
    List<RequestData> getRequestData();

    boolean isRequestDataExpired();

    void markRequestAsRead(String str, int i4);

    void markRequestAsUnread(String str);

    void storeRequestData(List<RequestData> list);

    void updateRequestData(List<Request> list);
}
