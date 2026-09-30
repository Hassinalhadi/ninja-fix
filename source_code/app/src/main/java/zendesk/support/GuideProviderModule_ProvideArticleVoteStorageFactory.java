package zendesk.support;

import Kd.a;
import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.SessionStorage;

/* loaded from: classes.dex */
public final class GuideProviderModule_ProvideArticleVoteStorageFactory implements b {
    private final a baseStorageProvider;

    public GuideProviderModule_ProvideArticleVoteStorageFactory(a aVar) {
        this.baseStorageProvider = aVar;
    }

    public static GuideProviderModule_ProvideArticleVoteStorageFactory create(a aVar) {
        return new GuideProviderModule_ProvideArticleVoteStorageFactory(aVar);
    }

    public static ArticleVoteStorage provideArticleVoteStorage(SessionStorage sessionStorage) {
        ArticleVoteStorage provideArticleVoteStorage = GuideProviderModule.provideArticleVoteStorage(sessionStorage);
        AbstractC2763s0.delta(provideArticleVoteStorage);
        return provideArticleVoteStorage;
    }

    @Override // Kd.a
    public ArticleVoteStorage get() {
        return provideArticleVoteStorage((SessionStorage) this.baseStorageProvider.get());
    }
}
