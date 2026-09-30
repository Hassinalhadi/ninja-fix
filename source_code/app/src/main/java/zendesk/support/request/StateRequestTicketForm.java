package zendesk.support.request;

import android.annotation.SuppressLint;
import com.zendesk.util.StringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.support.CustomField;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StateRequestTicketForm implements Serializable {
    static final long NO_ID = -1;

    /* renamed from: id, reason: collision with root package name */
    private final long f14288id;
    private final Map<Long, String> ticketFields;

    public StateRequestTicketForm(long j5, List<CustomField> list) {
        this.f14288id = j5;
        this.ticketFields = fieldsToMap(list);
    }

    @SuppressLint({"UseSparseArrays"})
    private static Map<Long, String> fieldsToMap(List<CustomField> list) {
        HashMap hashMap = new HashMap(list.size());
        for (CustomField customField : list) {
            if (customField != null && StringUtils.hasLength(customField.getValueString())) {
                hashMap.put(customField.getId(), customField.getValueString());
            }
        }
        return hashMap;
    }

    private static List<CustomField> mapToFields(Map<Long, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Long, String> entry : map.entrySet()) {
            arrayList.add(new CustomField(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public long getId() {
        return this.f14288id;
    }

    public Map<Long, String> getTicketFields() {
        return this.ticketFields;
    }

    public List<CustomField> getTicketFieldsForApi() {
        return mapToFields(this.ticketFields);
    }

    public StateRequestTicketForm(List<CustomField> list) {
        this(-1L, list);
    }
}
