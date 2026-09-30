package dagger.hilt.android.internal.managers;

import androidx.lifecycle.P;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.lifecycle.ActivityRetainedSavedState;
import dagger.hilt.android.scopes.ActivityRetainedScoped;

@InstallIn({ActivityRetainedComponent.class})
/* loaded from: classes2.dex */
abstract class ActivitySavedStateHandleModule {
    @ActivityRetainedScoped
    @ActivityRetainedSavedState
    public static P provideSavedStateHandle(SavedStateHandleHolder savedStateHandleHolder) {
        return savedStateHandleHolder.getSavedStateHandle();
    }
}
