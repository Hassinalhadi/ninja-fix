package zendesk.support;

import java.io.Serializable;

/* loaded from: classes.dex */
public class SimpleArticle implements Serializable {

    /* renamed from: id, reason: collision with root package name */
    private Long f14253id;
    private String title;

    public SimpleArticle(Long l10, String str) {
        this.f14253id = l10;
        this.title = str;
    }

    public Long getId() {
        return this.f14253id;
    }

    public String getTitle() {
        return this.title;
    }
}
