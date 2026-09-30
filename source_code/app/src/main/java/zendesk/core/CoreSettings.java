package zendesk.core;

import P8.c;
import java.util.Date;

/* loaded from: classes.dex */
public class CoreSettings implements Settings {
    private AuthenticationType authentication;

    @c("brand_id")
    private String brandId;
    private String identifier;

    @c("updated_at")
    private Date updatedAt;

    public CoreSettings(Date date, AuthenticationType authenticationType) {
        this.updatedAt = date;
        this.authentication = authenticationType;
    }

    public AuthenticationType getAuthentication() {
        return this.authentication;
    }

    public Date getUpdatedAt() {
        if (this.updatedAt != null) {
            return new Date(this.updatedAt.getTime());
        }
        return new Date(0L);
    }
}
