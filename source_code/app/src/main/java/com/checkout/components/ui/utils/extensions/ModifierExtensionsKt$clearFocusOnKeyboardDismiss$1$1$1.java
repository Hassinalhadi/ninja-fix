package com.checkout.components.ui.utils.extensions;

import Pd.e;
import Pd.i;
import Xd.l;
import Y.n;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.ax;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

@e(c = "com.checkout.components.ui.utils.extensions.ModifierExtensionsKt$clearFocusOnKeyboardDismiss$1$1$1", f = "ModifierExtensions.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes3.dex */
public final class ModifierExtensionsKt$clearFocusOnKeyboardDismiss$1$1$1 extends i implements l {
    final /* synthetic */ Y.i $focusManager;
    final /* synthetic */ D0 $isKeyboardOpen$delegate;
    final /* synthetic */ ax $keyboardAppearedSinceLastFocused$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierExtensionsKt$clearFocusOnKeyboardDismiss$1$1$1(Y.i iVar, D0 d02, ax axVar, Nd.c<? super ModifierExtensionsKt$clearFocusOnKeyboardDismiss$1$1$1> cVar) {
        super(2, cVar);
        this.$focusManager = iVar;
        this.$isKeyboardOpen$delegate = d02;
        this.$keyboardAppearedSinceLastFocused$delegate = axVar;
    }

    @Override // Pd.a
    public final Nd.c<Unit> create(Object obj, Nd.c<?> cVar) {
        return new ModifierExtensionsKt$clearFocusOnKeyboardDismiss$1$1$1(this.$focusManager, this.$isKeyboardOpen$delegate, this.$keyboardAppearedSinceLastFocused$delegate, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        boolean clearFocusOnKeyboardDismiss$lambda$10$lambda$6;
        boolean clearFocusOnKeyboardDismiss$lambda$10$lambda$4;
        Od.a aVar = Od.a.alpha;
        if (this.label == 0) {
            ResultKt.alpha(obj);
            clearFocusOnKeyboardDismiss$lambda$10$lambda$6 = ModifierExtensionsKt.clearFocusOnKeyboardDismiss$lambda$10$lambda$6(this.$isKeyboardOpen$delegate);
            if (clearFocusOnKeyboardDismiss$lambda$10$lambda$6) {
                ModifierExtensionsKt.clearFocusOnKeyboardDismiss$lambda$10$lambda$5(this.$keyboardAppearedSinceLastFocused$delegate, true);
            } else {
                clearFocusOnKeyboardDismiss$lambda$10$lambda$4 = ModifierExtensionsKt.clearFocusOnKeyboardDismiss$lambda$10$lambda$4(this.$keyboardAppearedSinceLastFocused$delegate);
                if (clearFocusOnKeyboardDismiss$lambda$10$lambda$4) {
                    ((n) this.$focusManager).bravo(8, false, true);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, Nd.c<? super Unit> cVar) {
        return ((ModifierExtensionsKt$clearFocusOnKeyboardDismiss$1$1$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
