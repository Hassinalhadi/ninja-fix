package com.google.firebase.ktx;

import H7.d;
import I7.a;
import I7.b;
import I7.j;
import I7.p;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.c;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import vf.AbstractC3220y;

@c
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LI7/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<b> getComponents() {
        a alpha = b.alpha(new p(H7.a.class, AbstractC3220y.class));
        alpha.alpha(new j(new p(H7.a.class, Executor.class), 1, 0));
        alpha.foxtrot = o8.a.purple;
        b bravo = alpha.bravo();
        a alpha2 = b.alpha(new p(H7.c.class, AbstractC3220y.class));
        alpha2.alpha(new j(new p(H7.c.class, Executor.class), 1, 0));
        alpha2.foxtrot = o8.a.red;
        b bravo2 = alpha2.bravo();
        a alpha3 = b.alpha(new p(H7.b.class, AbstractC3220y.class));
        alpha3.alpha(new j(new p(H7.b.class, Executor.class), 1, 0));
        alpha3.foxtrot = o8.a.silver;
        b bravo3 = alpha3.bravo();
        a alpha4 = b.alpha(new p(d.class, AbstractC3220y.class));
        alpha4.alpha(new j(new p(d.class, Executor.class), 1, 0));
        alpha4.foxtrot = o8.a.teal;
        return CollectionsKt.listOf(bravo, bravo2, bravo3, alpha4.bravo());
    }
}
