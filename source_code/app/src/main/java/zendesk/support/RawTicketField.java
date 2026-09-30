package zendesk.support;

import P8.c;
import com.zendesk.util.CollectionUtils;
import java.util.Date;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RawTicketField {
    private long accountId;

    @c("isActive")
    private boolean active;

    @c("isCollapsedForAgents")
    private boolean collapsedForAgents;
    private Date createdAt;
    private List<RawTicketFieldOption> customFieldOptions;
    private String defaultContentKey;
    private String description;

    @c("isEditableInPortal")
    private boolean editableInPortal;

    @c("isExportable")
    private boolean exportable;

    /* renamed from: id, reason: collision with root package name */
    private long f14246id;
    private int position;
    private String regexpForValidation;

    @c("isRequired")
    private boolean required;

    @c("isRequiredInPortal")
    private boolean requiredInPortal;
    private long subTypeId;
    private List<RawTicketFieldSystemOption> systemFieldOptions;
    private String tag;
    private String title;
    private String titleInPortal;
    private TicketFieldType type;
    private Date updatedAt;

    @c("isVisibleInPortal")
    private boolean visibleInPortal;

    public List<RawTicketFieldOption> getCustomFieldOptions() {
        return CollectionUtils.copyOf(this.customFieldOptions);
    }

    public String getDescription() {
        return this.description;
    }

    public long getId() {
        return this.f14246id;
    }

    public String getRegexpForValidation() {
        return this.regexpForValidation;
    }

    public List<RawTicketFieldSystemOption> getSystemFieldOptions() {
        return CollectionUtils.copyOf(this.systemFieldOptions);
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
