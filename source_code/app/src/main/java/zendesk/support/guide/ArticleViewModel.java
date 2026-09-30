package zendesk.support.guide;

import java.io.Serializable;
import java.util.Date;
import zendesk.support.Article;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ArticleViewModel implements Serializable {
    private final String authorName;
    private final String body;
    private final Date createdAt;

    /* renamed from: id, reason: collision with root package name */
    private final long f14260id;
    private final String title;

    public ArticleViewModel(Article article) {
        String name;
        this.f14260id = article.getId().longValue();
        this.title = article.getTitle();
        this.body = article.getBody();
        this.createdAt = article.getCreatedAt();
        if (article.getAuthor() == null) {
            name = null;
        } else {
            name = article.getAuthor().getName();
        }
        this.authorName = name;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getBody() {
        return this.body;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public long getId() {
        return this.f14260id;
    }

    public String getTitle() {
        return this.title;
    }
}
