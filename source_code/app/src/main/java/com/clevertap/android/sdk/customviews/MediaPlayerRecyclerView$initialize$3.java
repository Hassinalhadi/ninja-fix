package com.clevertap.android.sdk.customviews;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.i;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class MediaPlayerRecyclerView$initialize$3 extends i implements Function0<Drawable> {
    public MediaPlayerRecyclerView$initialize$3(Object obj) {
        super(0, 0, MediaPlayerRecyclerView.class, obj, "artworkAsset", "artworkAsset()Landroid/graphics/drawable/Drawable;");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        Drawable artworkAsset;
        artworkAsset = ((MediaPlayerRecyclerView) this.receiver).artworkAsset();
        return artworkAsset;
    }
}
