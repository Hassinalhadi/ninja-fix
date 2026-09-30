package com.bumptech.glide;

import android.content.Context;
import delivery.samurai.android.injections.modules.MyAppGlideModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;", "Lcom/bumptech/glide/GeneratedAppGlideModule;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    public final MyAppGlideModule alpha;

    public GeneratedAppGlideModuleImpl(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        this.alpha = new MyAppGlideModule();
    }

    @Override // S3.b
    public final void alpha(Context context, b glide, h registry) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(glide, "glide");
        Intrinsics.echo(registry, "registry");
        this.alpha.alpha(context, glide, registry);
    }

    @Override // S3.a
    public final void bravo(Context context, e builder) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(builder, "builder");
        this.alpha.bravo(context, builder);
    }

    @Override // S3.a
    public final boolean charlie() {
        return false;
    }
}
