package dagger.hilt.android.internal.lifecycle;

import ae.o;
import androidx.fragment.app.ai;
import androidx.lifecycle.a0;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.internal.Preconditions;
import java.util.Map;

/* loaded from: classes2.dex */
public final class DefaultViewModelFactories {

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes2.dex */
    public interface ActivityEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    @InstallIn({ActivityComponent.class})
    /* loaded from: classes2.dex */
    public interface ActivityModule {
        @HiltViewModelMap.KeySet
        Map<Class<?>, Boolean> viewModelKeys();
    }

    @EntryPoint
    @InstallIn({FragmentComponent.class})
    /* loaded from: classes2.dex */
    public interface FragmentEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    /* loaded from: classes2.dex */
    public static final class InternalFactoryFactory {
        private final Map<Class<?>, Boolean> keySet;
        private final ViewModelComponentBuilder viewModelComponentBuilder;

        public InternalFactoryFactory(@HiltViewModelMap.KeySet Map<Class<?>, Boolean> map, ViewModelComponentBuilder viewModelComponentBuilder) {
            this.keySet = map;
            this.viewModelComponentBuilder = viewModelComponentBuilder;
        }

        private a0 getHiltViewModelFactory(a0 a0Var) {
            return new HiltViewModelFactory(this.keySet, (a0) Preconditions.checkNotNull(a0Var), this.viewModelComponentBuilder);
        }

        public a0 fromActivity(o oVar, a0 a0Var) {
            return getHiltViewModelFactory(a0Var);
        }

        public a0 fromFragment(ai aiVar, a0 a0Var) {
            return getHiltViewModelFactory(a0Var);
        }
    }

    private DefaultViewModelFactories() {
    }

    public static a0 getActivityFactory(o oVar, a0 a0Var) {
        return ((ActivityEntryPoint) EntryPoints.get(oVar, ActivityEntryPoint.class)).getHiltInternalFactoryFactory().fromActivity(oVar, a0Var);
    }

    public static a0 getFragmentFactory(ai aiVar, a0 a0Var) {
        return ((FragmentEntryPoint) EntryPoints.get(aiVar, FragmentEntryPoint.class)).getHiltInternalFactoryFactory().fromFragment(aiVar, a0Var);
    }
}
