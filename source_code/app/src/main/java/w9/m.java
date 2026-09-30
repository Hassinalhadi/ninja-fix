package w9;

import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;

/* loaded from: classes2.dex */
public final class m extends AbstractC3243d {
    public final p alpha;
    public final j bravo;

    public m(p pVar, l lVar, j jVar) {
        this.alpha = pVar;
        this.bravo = jVar;
    }

    @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint
    public final DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return this.bravo.getHiltInternalFactoryFactory();
    }

    @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint
    public final ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
        return new tg.b(5);
    }
}
