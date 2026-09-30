package dagger.hilt.android.internal.builders;

import androidx.lifecycle.P;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.components.ViewModelComponent;

@DefineComponent.Builder
/* loaded from: classes2.dex */
public interface ViewModelComponentBuilder {
    ViewModelComponent build();

    ViewModelComponentBuilder savedStateHandle(P p4);

    ViewModelComponentBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle);
}
