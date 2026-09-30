package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class SupportModule_ProvidesArticleVoteStorageFactory implements b {
    private final SupportModule module;

    public SupportModule_ProvidesArticleVoteStorageFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesArticleVoteStorageFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesArticleVoteStorageFactory(supportModule);
    }

    public static ArticleVoteStorage providesArticleVoteStorage(SupportModule supportModule) {
        ArticleVoteStorage providesArticleVoteStorage = supportModule.providesArticleVoteStorage();
        AbstractC2763s0.delta(providesArticleVoteStorage);
        return providesArticleVoteStorage;
    }

    @Override // Kd.a
    public ArticleVoteStorage get() {
        return providesArticleVoteStorage(this.module);
    }
}
