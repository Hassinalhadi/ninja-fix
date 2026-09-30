package zendesk.classic.messaging.ui;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import java.io.File;
import zendesk.commonui.PicassoTransformations;

/* loaded from: classes.dex */
class UtilsCellView {
    private UtilsCellView() {
    }

    public static void loadImageWithRoundedCorners(final Picasso picasso, final String str, final ImageView imageView, final int i4, final Drawable drawable) {
        imageView.post(new Runnable() { // from class: zendesk.classic.messaging.ui.UtilsCellView.1
            @Override // java.lang.Runnable
            public void run() {
                Picasso.this.load(str).placeholder(drawable).resize(imageView.getMeasuredWidth(), imageView.getMeasuredHeight()).transform(PicassoTransformations.getRoundedTransformation(i4)).centerCrop().into(imageView);
            }
        });
    }

    public static void loadImageWithRoundedCornersFromFile(final Picasso picasso, final File file, final ImageView imageView, final int i4, final Drawable drawable) {
        imageView.post(new Runnable() { // from class: zendesk.classic.messaging.ui.UtilsCellView.2
            @Override // java.lang.Runnable
            public void run() {
                Picasso.this.load(file).placeholder(drawable).resize(imageView.getMeasuredWidth(), imageView.getMeasuredHeight()).transform(PicassoTransformations.getRoundedTransformation(i4)).centerCrop().into(imageView);
            }
        });
    }
}
