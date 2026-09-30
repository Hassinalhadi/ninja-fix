package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class TicketField {
    private String description;

    /* renamed from: id, reason: collision with root package name */
    private long f14256id;
    private String regexpForValidation;
    private List<TicketFieldOption> ticketFieldOptions;
    private List<TicketFieldSystemOption> ticketFieldSystemOptions;
    private String title;
    private String titleInPortal;
    private TicketFieldType type;

    public TicketField(long j5, TicketFieldType ticketFieldType, String str, String str2, String str3, String str4, List<TicketFieldOption> list, List<TicketFieldSystemOption> list2) {
        this.f14256id = j5;
        this.type = ticketFieldType;
        this.title = str;
        this.titleInPortal = str2;
        this.description = str3;
        this.regexpForValidation = str4;
        this.ticketFieldOptions = list;
        this.ticketFieldSystemOptions = list2;
    }

    public static TicketField create(RawTicketField rawTicketField) {
        TicketFieldType ticketFieldType;
        ArrayList arrayList = new ArrayList();
        Iterator<RawTicketFieldOption> it = rawTicketField.getCustomFieldOptions().iterator();
        while (it.hasNext()) {
            arrayList.add(TicketFieldOption.create(it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<RawTicketFieldSystemOption> it2 = rawTicketField.getSystemFieldOptions().iterator();
        while (it2.hasNext()) {
            arrayList2.add(TicketFieldSystemOption.create(it2.next()));
        }
        if (rawTicketField.getType() != null) {
            ticketFieldType = rawTicketField.getType();
        } else {
            ticketFieldType = TicketFieldType.Unknown;
        }
        return new TicketField(rawTicketField.getId(), ticketFieldType, rawTicketField.getTitle(), rawTicketField.getTitleInPortal(), rawTicketField.getDescription(), rawTicketField.getRegexpForValidation(), arrayList, arrayList2);
    }

    public String getDescription() {
        return this.description;
    }

    public long getId() {
        return this.f14256id;
    }

    public String getRegexpForValidation() {
        return this.regexpForValidation;
    }

    public List<TicketFieldOption> getTicketFieldOptions() {
        return CollectionUtils.copyOf(this.ticketFieldOptions);
    }

    public List<TicketFieldSystemOption> getTicketFieldSystemOptions() {
        return CollectionUtils.copyOf(this.ticketFieldSystemOptions);
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitleInPortal() {
        return this.titleInPortal;
    }

    public TicketFieldType getType() {
        return this.type;
    }
}
