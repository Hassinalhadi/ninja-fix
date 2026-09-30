package dagger.hilt.android.internal.managers;

import androidx.lifecycle.P;
import dagger.internal.b;
import dagger.internal.d;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class ActivitySavedStateHandleModule_ProvideSavedStateHandleFactory implements b {
    private final d savedStateHandleHolderProvider;

    private ActivitySavedStateHandleModule_ProvideSavedStateHandleFactory(d dVar) {
        this.savedStateHandleHolderProvider = dVar;
    }

    public static ActivitySavedStateHandleModule_ProvideSavedStateHandleFactory create(d dVar) {
        return new ActivitySavedStateHandleModule_ProvideSavedStateHandleFactory(dVar);
    }

    public static P provideSavedStateHandle(SavedStateHandleHolder savedStateHandleHolder) {
        P provideSavedStateHandle = ActivitySavedStateHandleModule.provideSavedStateHandle(savedStateHandleHolder);
        AbstractC2763s0.delta(provideSavedStateHandle);
        return provideSavedStateHandle;
    }

    @Override // Kd.a
    public P get() {
        return provideSavedStateHandle((SavedStateHandleHolder) this.savedStateHandleHolderProvider.get());
    }
}
