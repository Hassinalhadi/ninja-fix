package com.checkout.components.ui.utils.extensions;

import Pd.e;
import Pd.i;
import Xd.l;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.K;
import androidx.compose.runtime.M;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import pe.AbstractC2327c;

@e(c = "com.checkout.components.ui.utils.extensions.ModifierExtensionsKt$rememberKeyboardOpenState$1$1$1", f = "ModifierExtensions.kt", l = {75}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/K;", "", "", "<anonymous>", "(Landroidx/compose/runtime/K;)V"}, k = 3, mv = {2, 2, 0})
/* loaded from: classes3.dex */
public final class ModifierExtensionsKt$rememberKeyboardOpenState$1$1$1 extends i implements l {
    final /* synthetic */ View $this_with;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierExtensionsKt$rememberKeyboardOpenState$1$1$1(View view, Nd.c<? super ModifierExtensionsKt$rememberKeyboardOpenState$1$1$1> cVar) {
        super(2, cVar);
        this.$this_with = view;
    }

    public static /* synthetic */ Unit india(View view, b bVar) {
        return invokeSuspend$lambda$1(view, bVar);
    }

    public static final void invokeSuspend$lambda$0(K k6, View view) {
        ((M) k6).setValue(Boolean.valueOf(ViewExtensionsKt.isKeyboardOpen(view)));
    }

    public static final Unit invokeSuspend$lambda$1(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        return Unit.INSTANCE;
    }

    @Override // Pd.a
    public final Nd.c<Unit> create(Object obj, Nd.c<?> cVar) {
        ModifierExtensionsKt$rememberKeyboardOpenState$1$1$1 modifierExtensionsKt$rememberKeyboardOpenState$1$1$1 = new ModifierExtensionsKt$rememberKeyboardOpenState$1$1$1(this.$this_with, cVar);
        modifierExtensionsKt$rememberKeyboardOpenState$1$1$1.L$0 = obj;
        return modifierExtensionsKt$rememberKeyboardOpenState$1$1$1;
    }

    @Override // Xd.l
    public final Object invoke(K k6, Nd.c<? super Unit> cVar) {
        return ((ModifierExtensionsKt$rememberKeyboardOpenState$1$1$1) create(k6, cVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.checkout.components.ui.utils.extensions.b, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.checkout.components.ui.utils.extensions.c] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        final K k6 = (K) this.L$0;
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2327c.amber(obj);
        }
        ResultKt.alpha(obj);
        final View view = this.$this_with;
        final ?? r22 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.checkout.components.ui.utils.extensions.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ModifierExtensionsKt$rememberKeyboardOpenState$1$1$1.invokeSuspend$lambda$0(K.this, view);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(r22);
        final View view2 = this.$this_with;
        ?? r4 = new Function0() { // from class: com.checkout.components.ui.utils.extensions.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifierExtensionsKt$rememberKeyboardOpenState$1$1$1.india(view2, r22);
            }
        };
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        ((M) k6).alpha(r4, this);
        return aVar;
    }
}
