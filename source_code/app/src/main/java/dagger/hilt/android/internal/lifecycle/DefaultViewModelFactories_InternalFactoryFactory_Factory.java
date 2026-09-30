package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.internal.b;
import dagger.internal.d;
import java.util.Map;

/* loaded from: classes2.dex */
public final class DefaultViewModelFactories_InternalFactoryFactory_Factory implements b {
    private final d keySetProvider;
    private final d viewModelComponentBuilderProvider;

    private DefaultViewModelFactories_InternalFactoryFactory_Factory(d dVar, d dVar2) {
        this.keySetProvider = dVar;
        this.viewModelComponentBuilderProvider = dVar2;
    }

    public static DefaultViewModelFactories_InternalFactoryFactory_Factory create(d dVar, d dVar2) {
        return new DefaultViewModelFactories_InternalFactoryFactory_Factory(dVar, dVar2);
    }

    public static DefaultViewModelFactories.InternalFactoryFactory newInstance(Map<Class<?>, Boolean> map, ViewModelComponentBuilder viewModelComponentBuilder) {
        return new DefaultViewModelFactories.InternalFactoryFactory(map, viewModelComponentBuilder);
    }

    @Override // Kd.a
    public DefaultViewModelFactories.InternalFactoryFactory get() {
        return newInstance((Map) this.keySetProvider.get(), (ViewModelComponentBuilder) this.viewModelComponentBuilderProvider.get());
    }
}
