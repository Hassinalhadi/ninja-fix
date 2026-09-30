package vg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class as {
    public Call.Factory alpha;
    public HttpUrl bravo;
    public final ArrayList charlie = new ArrayList();
    public final ArrayList delta = new ArrayList();
    public final Executor echo;

    public as() {
    }

    public final void alpha(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        HttpUrl httpUrl = HttpUrl.get(str);
        Objects.requireNonNull(httpUrl, "baseUrl == null");
        if ("".equals(httpUrl.pathSegments().get(r0.size() - 1))) {
            this.bravo = httpUrl;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }
    }

    public final at bravo() {
        if (this.bravo != null) {
            Call.Factory factory = this.alpha;
            if (factory == null) {
                factory = new OkHttpClient();
            }
            Call.Factory factory2 = factory;
            Executor executor = this.echo;
            if (executor == null) {
                executor = aj.alpha;
            }
            Executor executor2 = executor;
            C3222a c3222a = aj.charlie;
            ArrayList arrayList = new ArrayList(this.delta);
            List alpha = c3222a.alpha(executor2);
            arrayList.addAll(alpha);
            List charlie = c3222a.charlie();
            int size = charlie.size();
            ArrayList arrayList2 = this.charlie;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
            arrayList3.add(new b(0));
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(charlie);
            return new at(factory2, this.bravo, Collections.unmodifiableList(arrayList3), size, Collections.unmodifiableList(arrayList), alpha.size(), executor2);
        }
        throw new IllegalStateException("Base URL required.");
    }

    public final void charlie(OkHttpClient okHttpClient) {
        Objects.requireNonNull(okHttpClient, "client == null");
        this.alpha = okHttpClient;
    }

    public as(at atVar) {
        this.alpha = atVar.bravo;
        this.bravo = atVar.charlie;
        List list = atVar.delta;
        int size = list.size() - atVar.echo;
        for (int i4 = 1; i4 < size; i4++) {
            this.charlie.add((l) list.get(i4));
        }
        List list2 = atVar.foxtrot;
        int size2 = list2.size() - atVar.golf;
        for (int i5 = 0; i5 < size2; i5++) {
            this.delta.add((e) list2.get(i5));
        }
        this.echo = atVar.hotel;
    }
}
