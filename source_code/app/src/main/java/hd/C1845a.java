package hd;

import id.InterfaceC1913a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od.C2229f;
import pd.C2303a;
import zd.C3509a;

/* renamed from: hd.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1845a implements InterfaceC1913a, w {
    public static final C1845a purple = new C1845a(0);
    public static final C1845a red = new C1845a(1);
    public static final C1845a silver = new C1845a(2);
    public static final C1845a teal = new C1845a(3);
    public static final C1845a white = new C1845a(4);
    public static final C1845a yellow = new C1845a(5);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C1845a(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [s6.F4, java.lang.Object] */
    @Override // id.InterfaceC1913a
    public void alpha(cd.c client, kotlin.e eVar) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(client, "client");
                client.yellow.golf(C2303a.india, new cd.a((Xd.l) eVar, null, 1));
                return;
            case 1:
                Intrinsics.echo(client, "client");
                Af.t tVar = new Af.t("ObservableContent", 1);
                C2229f c2229f = client.silver;
                c2229f.foxtrot(C2229f.juliet, tVar);
                c2229f.golf(tVar, new C1846b((Xd.m) eVar, null, 0));
                return;
            case 2:
                Xd.m mVar = (Xd.m) eVar;
                Intrinsics.echo(client, "client");
                Af.t tVar2 = new Af.t("BeforeReceive", 1);
                C2303a c2303a = client.teal;
                c2303a.getClass();
                Af.t reference = C2303a.juliet;
                Intrinsics.echo(reference, "reference");
                if (!c2303a.echo(tVar2)) {
                    int charlie = c2303a.charlie(reference);
                    if (charlie != -1) {
                        c2303a.alpha.add(charlie, new Dd.d(tVar2, new Object()));
                    } else {
                        throw new Dd.c("Phase " + reference + " was not registered for this pipeline");
                    }
                }
                c2303a.golf(tVar2, new as(mVar, null, 0));
                return;
            case 3:
                Intrinsics.echo(client, "client");
                client.silver.golf(C2229f.juliet, new C1846b((Xd.m) eVar, null, 1));
                return;
            case 4:
                Intrinsics.echo(client, "client");
                client.silver.golf(C2229f.golf, new as((Xd.m) eVar, null, 1));
                return;
            default:
                Intrinsics.echo(client, "client");
                client.silver.golf(C2229f.golf, new as((Xd.m) eVar, null, 2));
                return;
        }
    }

    @Override // hd.w
    public void bravo(Object obj, cd.c scope) {
        am plugin = (am) obj;
        Intrinsics.echo(plugin, "plugin");
        Intrinsics.echo(scope, "scope");
        scope.silver.golf(C2229f.kilo, new fd.c(plugin, scope, null, 1));
    }

    @Override // hd.w
    public Object foxtrot(Function1 block) {
        Intrinsics.echo(block, "block");
        block.invoke(new C1845a(6));
        return new am();
    }

    @Override // hd.w
    public C3509a getKey() {
        return am.charlie;
    }
}
