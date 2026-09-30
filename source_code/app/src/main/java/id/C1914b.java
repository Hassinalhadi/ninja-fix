package id;

import h5.C1809a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zd.C3509a;

/* renamed from: id.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1914b {
    public final cd.c alpha;
    public final Object bravo;
    public final ArrayList charlie;
    public final C1809a delta;

    public C1914b(C3509a key, cd.c client, Object pluginConfig) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(client, "client");
        Intrinsics.echo(pluginConfig, "pluginConfig");
        this.alpha = client;
        this.bravo = pluginConfig;
        this.charlie = new ArrayList();
        this.delta = new C1809a(5);
    }

    public final void alpha(InterfaceC1913a hook, kotlin.e eVar) {
        Intrinsics.echo(hook, "hook");
        this.charlie.add(new e(hook, eVar));
    }
}
