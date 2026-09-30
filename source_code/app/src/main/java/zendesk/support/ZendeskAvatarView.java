package zendesk.support;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.zendesk.util.StringUtils;

/* loaded from: classes.dex */
public class ZendeskAvatarView extends FrameLayout {
    private static final int[] AVATAR_COLORS = {R.color.zs_avatar_view_color_01, R.color.zs_avatar_view_color_02, R.color.zs_avatar_view_color_03, R.color.zs_avatar_view_color_04, R.color.zs_avatar_view_color_05, R.color.zs_avatar_view_color_06, R.color.zs_avatar_view_color_07, R.color.zs_avatar_view_color_08, R.color.zs_avatar_view_color_09, R.color.zs_avatar_view_color_10, R.color.zs_avatar_view_color_11, R.color.zs_avatar_view_color_12, R.color.zs_avatar_view_color_13, R.color.zs_avatar_view_color_14, R.color.zs_avatar_view_color_15, R.color.zs_avatar_view_color_16, R.color.zs_avatar_view_color_17, R.color.zs_avatar_view_color_18, R.color.zs_avatar_view_color_19};
    private boolean enableOutline;
    private ImageView imageView;
    private int strokeColor;
    private int strokeWidth;
    private TextView textView;

    public ZendeskAvatarView(Context context) {
        this(context, null, 0);
    }

    private Drawable getBackgroundShape(int i4) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(getContext().getColor(i4));
        if (this.enableOutline) {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable2.getPaint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            paint.setColor(this.strokeColor);
            paint.setStrokeWidth(this.strokeWidth);
            return new LayerDrawable(new Drawable[]{shapeDrawable, new InsetDrawable((Drawable) shapeDrawable2, this.strokeWidth / 2)});
        }
        return shapeDrawable;
    }

    private int getColorId(Object obj) {
        int[] iArr = AVATAR_COLORS;
        return iArr[Math.abs(obj.hashCode() % iArr.length)];
    }

    private void initViews() {
        TextView textView = new TextView(getContext());
        this.textView = textView;
        textView.setId(R.id.zs_avatar_view_text_view);
        this.textView.setTextColor(getContext().getColor(R.color.zs_avatar_text_color));
        this.textView.setGravity(17);
        this.textView.setTextSize(2, 16.0f);
        ImageView imageView = new ImageView(getContext());
        this.imageView = imageView;
        imageView.setId(R.id.zs_avatar_view_image_view);
        addView(this.textView);
        addView(this.imageView);
    }

    private void setTextView(String str) {
        setBackground(getBackgroundShape(getColorId(str)));
        this.textView.setText(String.valueOf(Character.toUpperCase(str.charAt(0))));
    }

    public void setStroke(int i4, int i5) {
        this.strokeColor = i4;
        this.strokeWidth = i5;
        this.enableOutline = true;
    }

    public void showUserWithAvatarImage(Picasso picasso, String str, String str2, int i4) {
        this.imageView.setVisibility(0);
        this.imageView.setImageResource(R.color.zs_color_transparent);
        if (StringUtils.hasLength(str2)) {
            this.textView.setVisibility(0);
            setTextView(str2);
        }
        this.imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        com.squareup.picasso.RequestCreator load = picasso.load(str);
        int i5 = i4 * 2;
        load.resize(i5, i5).centerCrop().noPlaceholder().transform(PicassoTransformations.getRoundWithBorderTransformation(i4, this.strokeColor, this.strokeWidth)).into(this.imageView);
    }

    public void showUserWithIdentifier(Object obj) {
        if (obj != null) {
            setBackground(getBackgroundShape(getColorId(obj)));
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setImageResource(R.drawable.zs_request_list_account_icon);
            this.textView.setVisibility(4);
            this.imageView.setVisibility(0);
        }
    }

    public void showUserWithName(String str) {
        if (StringUtils.hasLength(str)) {
            setTextView(str);
            this.textView.setVisibility(0);
            this.imageView.setVisibility(4);
        }
    }

    public ZendeskAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZendeskAvatarView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.enableOutline = false;
        this.strokeColor = 0;
        this.strokeWidth = 0;
        initViews();
    }
}
