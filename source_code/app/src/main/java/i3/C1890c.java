package i3;

import android.graphics.Bitmap;
import android.widget.ImageView;
import k1.C1998a;

/* renamed from: i3.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1890c extends V3.a {
    public final /* synthetic */ ImageView teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1890c(ImageView imageView) {
        super(imageView, 0);
        this.teal = imageView;
    }

    @Override // V3.a
    /* renamed from: foxtrot, reason: merged with bridge method [inline-methods] */
    public final void hotel(Bitmap bitmap) {
        if (bitmap != null) {
            ImageView imageView = this.teal;
            C1998a c1998a = new C1998a(imageView.getContext().getResources(), bitmap);
            c1998a.bravo();
            imageView.setImageDrawable(c1998a);
            return;
        }
        super.hotel(bitmap);
    }
}
