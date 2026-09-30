package com.checkout.components.card.ui.component.errorlabel;

import Kd.a;
import com.checkout.components.card.ui.component.errorlabel.ErrorLabelViewModel;
import dagger.internal.d;
import v9.InterfaceC3179a;

/* loaded from: classes3.dex */
public final class ErrorLabelViewModel_ErrorLabelViewModelFactory_MembersInjector implements InterfaceC3179a {

    /* renamed from: a, reason: collision with root package name */
    private final d f4499a;

    public ErrorLabelViewModel_ErrorLabelViewModelFactory_MembersInjector(d dVar) {
        this.f4499a = dVar;
    }

    public static InterfaceC3179a create(d dVar) {
        return new ErrorLabelViewModel_ErrorLabelViewModelFactory_MembersInjector(dVar);
    }

    public static void injectSubComponentProvider(ErrorLabelViewModel.ErrorLabelViewModelFactory errorLabelViewModelFactory, a aVar) {
        errorLabelViewModelFactory.subComponentProvider = aVar;
    }

    public final void injectMembers(Object obj) {
        ((ErrorLabelViewModel.ErrorLabelViewModelFactory) obj).subComponentProvider = this.f4499a;
    }

    public final void injectMembers(ErrorLabelViewModel.ErrorLabelViewModelFactory errorLabelViewModelFactory) {
        errorLabelViewModelFactory.subComponentProvider = this.f4499a;
    }
}
