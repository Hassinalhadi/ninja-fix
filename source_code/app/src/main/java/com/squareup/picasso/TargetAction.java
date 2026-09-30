package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TargetAction extends Action<Target> {
    public TargetAction(Picasso picasso, Target target, Request request, int i4, int i5, Drawable drawable, String str, Object obj, int i10) {
        super(picasso, target, request, i4, i5, i10, drawable, str, obj, false);
    }

    @Override // com.squareup.picasso.Action
    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap != null) {
            Target target = getTarget();
            if (target != null) {
                target.onBitmapLoaded(bitmap, loadedFrom);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError("Attempted to complete action with no result!\n" + this);
    }

    @Override // com.squareup.picasso.Action
    public void error(Exception exc) {
        Target target = getTarget();
        if (target != null) {
            if (this.errorResId != 0) {
                target.onBitmapFailed(exc, this.picasso.context.getResources().getDrawable(this.errorResId));
            } else {
                target.onBitmapFailed(exc, this.errorDrawable);
            }
        }
    }
}
