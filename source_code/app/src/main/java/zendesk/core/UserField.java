package zendesk.core;

import P8.c;
import com.zendesk.util.CollectionUtils;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public class UserField {
    private Boolean active;
    private Date createdAt;
    private List<UserFieldOption> customFieldOptions;
    private String description;

    /* renamed from: id, reason: collision with root package name */
    private Long f14231id;
    private String key;
    private Long position;
    private String rawDescription;
    private String rawTitle;
    private String regexpForValidation;
    private Boolean system;
    private String title;
    private Date updatedAt;
    private String url;

    @c(com.clevertap.android.sdk.Constants.KEY_TYPE)
    private UserFieldType userFieldType;

    /* loaded from: classes.dex */
    public enum UserFieldType {
        Integer,
        Decimal,
        Checkbox,
        Date,
        Text,
        Textarea,
        Dropdown,
        Regexp
    }

    public Date getCreatedAt() {
        if (this.createdAt == null) {
            return null;
        }
        return new Date(this.createdAt.getTime());
    }

    public String getDescription() {
        return this.description;
    }

    public Long getId() {
        return this.f14231id;
    }

    public String getKey() {
        return this.key;
    }

    public Long getPosition() {
        return this.position;
    }

    public String getRawDescription() {
        return this.rawDescription;
    }

    public String getRawTitle() {
        return this.rawTitle;
    }

    public String getRegexpForValidation() {
        return this.regexpForValidation;
    }

    public String getTitle() {
        return this.title;
    }

    public Date getUpdatedAt() {
        if (this.updatedAt == null) {
            return null;
        }
        return new Date(this.updatedAt.getTime());
    }

    public String getUrl() {
        return this.url;
    }

    public List<UserFieldOption> getUserFieldOptions() {
        return CollectionUtils.copyOf(this.customFieldOptions);
    }

    public UserFieldType getUserFieldType() {
        return this.userFieldType;
    }

    public boolean isActive() {
        Boolean bool = this.active;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean isSystem() {
        Boolean bool = this.system;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }
}
