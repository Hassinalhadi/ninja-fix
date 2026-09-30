package gd;

import bz.af;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import sd.m;
import t6.j4;

/* loaded from: classes2.dex */
public final class k implements m {
    public final /* synthetic */ Headers charlie;

    public k(Headers headers) {
        this.charlie = headers;
    }

    public final List alpha(String name) {
        Intrinsics.echo(name, "name");
        List<String> values = this.charlie.values(name);
        if (!values.isEmpty()) {
            return values;
        }
        return null;
    }

    @Override // zd.p
    public final Set foxtrot() {
        return this.charlie.toMultimap().entrySet();
    }

    @Override // zd.p
    public final String get(String str) {
        List alpha = alpha(str);
        if (alpha != null) {
            return (String) CollectionsKt.green(alpha);
        }
        return null;
    }

    @Override // zd.p
    public final boolean golf() {
        return true;
    }

    @Override // zd.p
    public final void hotel(Xd.l lVar) {
        j4.bravo(this, (af) lVar);
    }

    @Override // zd.p
    public final boolean india() {
        if (alpha("Content-Encoding") != null) {
            return true;
        }
        return false;
    }
}
