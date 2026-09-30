package cd;

import S.m;
import hd.w;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zd.o;

/* loaded from: classes2.dex */
public final class d {
    public final LinkedHashMap alpha = new LinkedHashMap();
    public final LinkedHashMap bravo = new LinkedHashMap();
    public final LinkedHashMap charlie = new LinkedHashMap();
    public boolean delta = true;
    public boolean echo = true;
    public boolean foxtrot;

    public d() {
        int i4 = o.alpha;
    }

    public final void alpha(w plugin, Function1 function1) {
        Intrinsics.echo(plugin, "plugin");
        LinkedHashMap linkedHashMap = this.bravo;
        linkedHashMap.put(plugin.getKey(), new m((Function1) linkedHashMap.get(plugin.getKey()), function1, 2));
        LinkedHashMap linkedHashMap2 = this.alpha;
        if (linkedHashMap2.containsKey(plugin.getKey())) {
            return;
        }
        linkedHashMap2.put(plugin.getKey(), new Ya.c(21, plugin));
    }
}
