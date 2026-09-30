package B9;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import delivery.samurai.android.R;
import t6.S3;

/* loaded from: classes2.dex */
public final class J {
    public final ImageView alpha;
    public final LinearLayout bravo;
    public final TextView charlie;

    public J(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView) {
        this.alpha = imageView;
        this.bravo = linearLayout2;
        this.charlie = textView;
    }

    public static J alpha(View view) {
        int i4 = R.id.iv_type_icon;
        ImageView imageView = (ImageView) S3.bravo(R.id.iv_type_icon, view);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) S3.bravo(R.id.tv_type_title, view);
            if (textView != null) {
                return new J(linearLayout, imageView, linearLayout, textView);
            }
            i4 = R.id.tv_type_title;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
