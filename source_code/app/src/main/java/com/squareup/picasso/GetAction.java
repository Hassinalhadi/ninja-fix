package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;

/* loaded from: classes2.dex */
class GetAction extends Action<Void> {
    public GetAction(Picasso picasso, Request request, int i4, int i5, Object obj, String str) {
        super(picasso, null, request, i4, i5, 0, null, str, obj, false);
    }

    @Override // com.squareup.picasso.Action
    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
    }

    @Override // com.squareup.picasso.Action
    public void error(Exception exc) {
    }
}
