package com.checkout.components.rememberme.utils;

import Y1.ai;
import Y1.ak;
import Y1.av;
import Y1.r;
import androidx.navigation.internal.g;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.clevertap.android.sdk.inapp.images.preload.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/checkout/components/rememberme/utils/NavControllerWrapper;", "", "T", "defaultScreen", "LY1/r;", "navController", "Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;", "screenRepository", "<init>", "(Ljava/lang/Object;LY1/r;Lcom/checkout/components/interfaces/data/PrimitiveStateRepository;)V", "route", "", "navigate", "(Ljava/lang/Object;)V", "navigateToDialog", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavControllerWrapper<T> {
    public static final int $stable = 8;

    /* renamed from: a */
    private final r f6343a;

    /* renamed from: b */
    private final PrimitiveStateRepository f6344b;

    public NavControllerWrapper(@NotNull T defaultScreen, @NotNull r navController, @NotNull PrimitiveStateRepository<T> screenRepository) {
        Intrinsics.echo(defaultScreen, "defaultScreen");
        Intrinsics.echo(navController, "navController");
        Intrinsics.echo(screenRepository, "screenRepository");
        this.f6343a = navController;
        this.f6344b = screenRepository;
        screenRepository.update((PrimitiveStateRepository<T>) defaultScreen);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [Y1.av, java.lang.Object] */
    private static final Unit a(NavControllerWrapper navControllerWrapper, ak navigate) {
        Intrinsics.echo(navigate, "$this$navigate");
        int i4 = navControllerWrapper.f6343a.bravo.golf().purple.charlie;
        a aVar = new a(18);
        navigate.delta = i4;
        navigate.echo = false;
        ?? obj = new Object();
        aVar.invoke(obj);
        navigate.echo = obj.alpha;
        navigate.foxtrot = obj.bravo;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit alpha(av avVar) {
        return a(avVar);
    }

    public final void navigate(@NotNull T route) {
        Intrinsics.echo(route, "route");
        r rVar = this.f6343a;
        rVar.getClass();
        g gVar = rVar.bravo;
        gVar.getClass();
        ak akVar = new ak();
        a(this, akVar);
        boolean z2 = akVar.bravo;
        ai aiVar = akVar.alpha;
        aiVar.alpha = z2;
        aiVar.bravo = akVar.charlie;
        int i4 = akVar.delta;
        boolean z10 = akVar.echo;
        boolean z11 = akVar.foxtrot;
        aiVar.charlie = i4;
        aiVar.delta = z10;
        aiVar.echo = z11;
        gVar.lima(route, aiVar.alpha());
        this.f6344b.update((PrimitiveStateRepository) route);
    }

    public final void navigateToDialog(@NotNull T route) {
        Intrinsics.echo(route, "route");
        r.delta(this.f6343a, route);
    }

    public static final Unit a(av popUpTo) {
        Intrinsics.echo(popUpTo, "$this$popUpTo");
        popUpTo.alpha = true;
        return Unit.INSTANCE;
    }
}
