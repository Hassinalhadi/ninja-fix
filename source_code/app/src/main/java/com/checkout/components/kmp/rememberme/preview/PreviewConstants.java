package com.checkout.components.kmp.rememberme.preview;

import Lb.am;
import com.checkout.components.kmp.rememberme.shared.model.ClickTarget;
import com.checkout.components.kmp.rememberme.shared.model.Hint;
import com.checkout.components.kmp.rememberme.shared.model.HintType;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeConfig;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeEnvironment;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/kmp/rememberme/preview/PreviewConstants;", "", "<init>", "()V", "PHONE_HINT", "Lcom/checkout/components/kmp/rememberme/shared/model/Hint;", "EMAIL_HINT", "WHATSAPP_HINT", "EMAIL", "", "HINTS", "", "getHINTS", "()Ljava/util/List;", "CONFIG", "Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeConfig;", "getCONFIG", "()Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeConfig;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreviewConstants {
    public static final int $stable;

    @NotNull
    private static final RememberMeConfig CONFIG;

    @NotNull
    public static final String EMAIL = "john@checkout.com";

    @NotNull
    private static final Hint EMAIL_HINT;

    @NotNull
    private static final List<Hint> HINTS;

    @NotNull
    public static final PreviewConstants INSTANCE = new PreviewConstants();

    @NotNull
    private static final Hint PHONE_HINT;

    @NotNull
    private static final Hint WHATSAPP_HINT;

    static {
        Hint hint = new Hint(0, HintType.PHONE, "+4477****3322");
        PHONE_HINT = hint;
        Hint hint2 = new Hint(1, HintType.EMAIL, "p****1@c******m");
        EMAIL_HINT = hint2;
        Hint hint3 = new Hint(2, HintType.WHATSAPP, "+4477****3322");
        WHATSAPP_HINT = hint3;
        HINTS = CollectionsKt.listOf(hint, hint2, hint3);
        CONFIG = new RememberMeConfig(RememberMeEnvironment.SANDBOX, new am(19), "", "serviceName", "serviceVersion", new am(20), null, null, null, null, 960, null);
        $stable = 8;
    }

    private PreviewConstants() {
    }

    public static final Unit CONFIG$lambda$0(ClickTarget it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    public static final Unit CONFIG$lambda$1(String it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    @NotNull
    public final RememberMeConfig getCONFIG() {
        return CONFIG;
    }

    @NotNull
    public final List<Hint> getHINTS() {
        return HINTS;
    }
}
