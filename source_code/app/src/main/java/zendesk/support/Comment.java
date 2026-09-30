package zendesk.support;

import P8.c;
import com.zendesk.util.CollectionUtils;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public class Comment {

    @c("uploads")
    private List<String> attachments;
    private Long authorId;
    private String body;
    private Date createdAt;
    private String htmlBody;

    /* renamed from: id, reason: collision with root package name */
    private Long f14239id;

    @c("public")
    private boolean isPublic = true;
    private String requestId;
    private String url;

    public List<String> getAttachments() {
        return CollectionUtils.copyOf(this.attachments);
    }

    public Long getAuthorId() {
        return this.authorId;
    }

    public String getBody() {
        return this.body;
    }

    public Date getCreatedAt() {
        if (this.createdAt == null) {
            return null;
        }
        return new Date(this.createdAt.getTime());
    }

    public String getHtmlBody() {
        return this.htmlBody;
    }

    public Long getId() {
        return this.f14239id;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public void setAttachments(List<String> list) {
        this.attachments = list;
    }

    public void setAuthorId(Long l10) {
        this.authorId = l10;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }
}
