package B9;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import delivery.samurai.android.R;
import t6.S3;

/* loaded from: classes2.dex */
public final class I {
    public final LinearLayout alpha;
    public final LinearProgressIndicator bravo;
    public final ShapeableImageView charlie;
    public final TextView delta;

    public I(LinearLayout linearLayout, LinearProgressIndicator linearProgressIndicator, ShapeableImageView shapeableImageView, TextView textView) {
        this.alpha = linearLayout;
        this.bravo = linearProgressIndicator;
        this.charlie = shapeableImageView;
        this.delta = textView;
    }

    public static I alpha(View view) {
        int i4 = R.id.lpi_trophy_progress;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) S3.bravo(R.id.lpi_trophy_progress, view);
        if (linearProgressIndicator != null) {
            i4 = R.id.siv_trophy_icon;
            ShapeableImageView shapeableImageView = (ShapeableImageView) S3.bravo(R.id.siv_trophy_icon, view);
            if (shapeableImageView != null) {
                i4 = R.id.tv_progress_label;
                TextView textView = (TextView) S3.bravo(R.id.tv_progress_label, view);
                if (textView != null) {
                    return new I((LinearLayout) view, linearProgressIndicator, shapeableImageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
