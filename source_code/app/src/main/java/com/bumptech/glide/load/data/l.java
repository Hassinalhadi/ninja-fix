package com.bumptech.glide.load.data;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class l implements f {
    public final G3.g alpha;

    public l(G3.g gVar) {
        this.alpha = gVar;
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class alpha() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.f
    public final g bravo(Object obj) {
        return new h((InputStream) obj, this.alpha);
    }
}
