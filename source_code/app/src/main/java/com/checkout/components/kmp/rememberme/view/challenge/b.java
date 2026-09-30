package com.checkout.components.kmp.rememberme.view.challenge;

import T.j;
import T.s;
import Xd.l;
import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.foundation.layout.M;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.shared.model.Hint;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import d.C1543m;
import i.C1874w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2616b5;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5625a;
    public final /* synthetic */ int alpha = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5627c;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Function1 red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ b(s sVar, C1874w c1874w, M m4, InterfaceC0539e interfaceC0539e, j jVar, C1543m c1543m, boolean z2, Function1 function1, int i4, int i5) {
        this.teal = sVar;
        this.white = c1874w;
        this.yellow = m4;
        this.f5625a = interfaceC0539e;
        this.f5626b = jVar;
        this.f5627c = c1543m;
        this.purple = z2;
        this.red = function1;
        this.silver = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        Integer num = (Integer) obj2;
        switch (this.alpha) {
            case 0:
                int intValue = num.intValue();
                return ChallengeViewKt.bravo((ResourceProvider) this.teal, (DesignTokens) this.white, this.purple, (Function0) this.yellow, (Hint) this.f5625a, (Hint) this.f5626b, (Hint) this.f5627c, this.red, this.silver, interfaceC0581m, intValue);
            default:
                num.getClass();
                int cyan = C0564b.cyan(24577);
                AbstractC2616b5.delta((s) this.teal, (C1874w) this.white, (M) this.yellow, (InterfaceC0539e) this.f5625a, (j) this.f5626b, (C1543m) this.f5627c, this.purple, this.red, interfaceC0581m, cyan, this.silver);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(ResourceProvider resourceProvider, DesignTokens designTokens, boolean z2, Function0 function0, Hint hint, Hint hint2, Hint hint3, Function1 function1, int i4) {
        this.teal = resourceProvider;
        this.white = designTokens;
        this.purple = z2;
        this.yellow = function0;
        this.f5625a = hint;
        this.f5626b = hint2;
        this.f5627c = hint3;
        this.red = function1;
        this.silver = i4;
    }
}
