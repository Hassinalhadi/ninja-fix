package zendesk.support;

import com.zendesk.util.CollectionUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class User implements Serializable {
    private boolean agent;

    /* renamed from: id, reason: collision with root package name */
    private Long f14259id;
    private String name;
    private Long organizationId;
    private Attachment photo;
    private List<String> tags;
    private Map<String, String> userFields;

    public User(Long l10, String str, Attachment attachment, boolean z2, Long l11, List<String> list, Map<String, String> map) {
        this.f14259id = l10;
        this.name = str;
        this.photo = attachment;
        this.agent = z2;
        this.organizationId = l11;
        this.tags = list;
        this.userFields = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            User user = (User) obj;
            if (this.agent != user.agent) {
                return false;
            }
            Long l10 = this.f14259id;
            if (l10 == null ? user.f14259id != null : !l10.equals(user.f14259id)) {
                return false;
            }
            Attachment attachment = this.photo;
            if (attachment == null ? user.photo != null : !attachment.equals(user.photo)) {
                return false;
            }
            Long l11 = this.organizationId;
            if (l11 == null ? user.organizationId != null : !l11.equals(user.organizationId)) {
                return false;
            }
            List<String> list = this.tags;
            if (list == null ? user.tags != null : !list.equals(user.tags)) {
                return false;
            }
            Map<String, String> map = this.userFields;
            Map<String, String> map2 = user.userFields;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 == null) {
                return true;
            }
        }
        return false;
    }

    public Long getId() {
        return this.f14259id;
    }

    public String getName() {
        return this.name;
    }

    public Long getOrganizationId() {
        return this.organizationId;
    }

    public Attachment getPhoto() {
        return this.photo;
    }

    public List<String> getTags() {
        return CollectionUtils.copyOf(this.tags);
    }

    public Map<String, String> getUserFields() {
        return CollectionUtils.copyOf(this.userFields);
    }

    public int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11;
        Long l10 = this.f14259id;
        int i12 = 0;
        if (l10 != null) {
            i4 = l10.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = i4 * 31;
        Attachment attachment = this.photo;
        if (attachment != null) {
            i5 = attachment.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (((i13 + i5) * 31) + (this.agent ? 1 : 0)) * 31;
        Long l11 = this.organizationId;
        if (l11 != null) {
            i10 = l11.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        List<String> list = this.tags;
        if (list != null) {
            i11 = list.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        Map<String, String> map = this.userFields;
        if (map != null) {
            i12 = map.hashCode();
        }
        return i16 + i12;
    }

    public boolean isAgent() {
        return this.agent;
    }

    public User() {
        this.f14259id = -1L;
        this.name = "";
        this.photo = null;
        this.agent = false;
        this.organizationId = -1L;
        this.tags = new ArrayList();
        this.userFields = new HashMap();
    }
}
