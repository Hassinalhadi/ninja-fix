package i3;

import android.graphics.Bitmap;
import android.widget.ImageView;
import k1.C1998a;

/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1889b extends V3.a {
    public final /* synthetic */ int teal;
    public final /* synthetic */ ImageView white;
    public final /* synthetic */ int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1889b(ImageView imageView, int i4, int i5) {
        super(imageView, 0);
        this.teal = i5;
        this.white = imageView;
        this.yellow = i4;
    }

    @Override // V3.a
    /* renamed from: foxtrot */
    public final void hotel(Bitmap bitmap) {
        switch (this.teal) {
            case 0:
                if (bitmap != null) {
                    ImageView imageView = this.white;
                    C1998a c1998a = new C1998a(imageView.getContext().getResources(), bitmap);
                    c1998a.bravo();
                    c1998a.charlie(imageView.getContext().getResources().getDimensionPixelOffset(this.yellow));
                    imageView.setImageDrawable(c1998a);
                    return;
                }
                super.hotel(bitmap);
                return;
            default:
                if (bitmap != null) {
                    ImageView imageView2 = this.white;
                    C1998a c1998a2 = new C1998a(imageView2.getContext().getResources(), bitmap);
                    c1998a2.bravo();
                    c1998a2.charlie(imageView2.getContext().getResources().getDimensionPixelOffset(this.yellow));
                    imageView2.setImageDrawable(c1998a2);
                    return;
                }
                super.hotel(bitmap);
                return;
        }
    }

    @Override // V3.a
    public final /* bridge */ /* synthetic */ void hotel(Object obj) {
        switch (this.teal) {
            case 0:
                hotel((Bitmap) obj);
                return;
            default:
                hotel((Bitmap) obj);
                return;
        }
    }
}
