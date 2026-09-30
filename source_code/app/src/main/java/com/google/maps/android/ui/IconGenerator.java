package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.R;

/* loaded from: classes2.dex */
public class IconGenerator {
    public static final int STYLE_BLUE = 4;
    public static final int STYLE_DEFAULT = 1;
    public static final int STYLE_GREEN = 5;
    public static final int STYLE_ORANGE = 7;
    public static final int STYLE_PURPLE = 6;
    public static final int STYLE_RED = 3;
    public static final int STYLE_WHITE = 2;
    private float mAnchorU = 0.5f;
    private float mAnchorV = 1.0f;
    private BubbleDrawable mBackground;
    private ViewGroup mContainer;
    private View mContentView;
    private final Context mContext;
    private int mRotation;
    private RotationLayout mRotationLayout;
    private TextView mTextView;

    public IconGenerator(Context context) {
        this.mContext = context;
        this.mBackground = new BubbleDrawable(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
        this.mContainer = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.mRotationLayout = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(R.id.amu_text);
        this.mTextView = textView;
        this.mContentView = textView;
        setStyle(1);
    }

    private static int getStyleColor(int i4) {
        if (i4 == 3) {
            return -3407872;
        }
        if (i4 == 4) {
            return -16737844;
        }
        if (i4 == 5) {
            return -10053376;
        }
        if (i4 != 6) {
            return i4 != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    private static int getTextStyle(int i4) {
        if (i4 != 3 && i4 != 4 && i4 != 5 && i4 != 6 && i4 != 7) {
            return R.style.amu_Bubble_TextAppearance_Dark;
        }
        return R.style.amu_Bubble_TextAppearance_Light;
    }

    private float rotateAnchor(float f5, float f10) {
        int i4 = this.mRotation;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        return f10;
                    }
                    throw new IllegalStateException();
                }
                return 1.0f - f5;
            }
            return 1.0f - f10;
        }
        return f5;
    }

    public float getAnchorU() {
        return rotateAnchor(this.mAnchorU, this.mAnchorV);
    }

    public float getAnchorV() {
        return rotateAnchor(this.mAnchorV, this.mAnchorU);
    }

    public Bitmap makeIcon(CharSequence charSequence) {
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return makeIcon();
    }

    public void setBackground(Drawable drawable) {
        this.mContainer.setBackgroundDrawable(drawable);
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            this.mContainer.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        this.mContainer.setPadding(0, 0, 0, 0);
    }

    public void setColor(int i4) {
        this.mBackground.setColor(i4);
        setBackground(this.mBackground);
    }

    public void setContentPadding(int i4, int i5, int i10, int i11) {
        this.mContentView.setPadding(i4, i5, i10, i11);
    }

    public void setContentRotation(int i4) {
        this.mRotationLayout.setViewRotation(i4);
    }

    public void setContentView(View view) {
        TextView textView;
        this.mRotationLayout.removeAllViews();
        this.mRotationLayout.addView(view);
        this.mContentView = view;
        View findViewById = this.mRotationLayout.findViewById(R.id.amu_text);
        if (findViewById instanceof TextView) {
            textView = (TextView) findViewById;
        } else {
            textView = null;
        }
        this.mTextView = textView;
    }

    public void setRotation(int i4) {
        this.mRotation = ((i4 + 360) % 360) / 90;
    }

    public void setStyle(int i4) {
        setColor(getStyleColor(i4));
        setTextAppearance(this.mContext, getTextStyle(i4));
    }

    public void setTextAppearance(Context context, int i4) {
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    public void setTextAppearance(int i4) {
        setTextAppearance(this.mContext, i4);
    }

    public Bitmap makeIcon() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mContainer.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.mContainer.getMeasuredWidth();
        int measuredHeight = this.mContainer.getMeasuredHeight();
        this.mContainer.layout(0, 0, measuredWidth, measuredHeight);
        int i4 = this.mRotation;
        if (i4 == 1 || i4 == 3) {
            measuredHeight = this.mContainer.getMeasuredWidth();
            measuredWidth = this.mContainer.getMeasuredHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        int i5 = this.mRotation;
        if (i5 == 1) {
            canvas.translate(measuredWidth, 0.0f);
            canvas.rotate(90.0f);
        } else if (i5 == 2) {
            canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
        } else if (i5 == 3) {
            canvas.translate(0.0f, measuredHeight);
            canvas.rotate(270.0f);
        }
        this.mContainer.draw(canvas);
        return createBitmap;
    }
}
