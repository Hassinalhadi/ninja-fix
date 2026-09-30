package com.canhub.cropper;

import a4.aa;
import a4.ab;
import a4.ac;
import a4.ad;
import a4.ae;
import a4.af;
import a4.ag;
import a4.ai;
import a4.al;
import a4.h;
import a4.i;
import a4.l;
import a4.r;
import a4.v;
import a4.x;
import a4.y;
import a4.z;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import delivery.samurai.android.R;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ao;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u000bM\u009f\u0001Gf'\u001e\u001a!$AB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101R\"\u00104\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u0010\rR(\u0010<\u001a\u0004\u0018\u00010.2\b\u00107\u001a\u0004\u0018\u00010.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R$\u0010@\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00109\u001a\u0004\b>\u0010;\"\u0004\b?\u00101R$\u0010B\u001a\u00020A2\u0006\u0010B\u001a\u00020A8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR(\u0010H\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010G8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR(\u0010N\u001a\u0004\u0018\u00010M2\b\u0010N\u001a\u0004\u0018\u00010M8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010T\u001a\u00020\t2\u0006\u0010S\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u00105\"\u0004\bU\u0010\rR$\u0010W\u001a\u00020V2\u0006\u0010W\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010_\u001a\u00020V2\u0006\u0010\\\u001a\u00020V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010Y\"\u0004\b^\u0010[R$\u0010a\u001a\u00020\t2\u0006\u0010`\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u00105\"\u0004\bb\u0010\rR$\u0010d\u001a\u00020\t2\u0006\u0010c\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u00105\"\u0004\be\u0010\rR(\u0010g\u001a\u0004\u0018\u00010f2\b\u0010g\u001a\u0004\u0018\u00010f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001d\u0010o\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020V0l8F¢\u0006\u0006\u001a\u0004\bm\u0010nR$\u0010q\u001a\u00020\t2\u0006\u0010p\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u00105\"\u0004\br\u0010\rR$\u0010t\u001a\u00020\t2\u0006\u0010s\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u00105\"\u0004\bu\u0010\rR$\u0010w\u001a\u00020\t2\u0006\u0010v\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u00105\"\u0004\bx\u0010\rR$\u0010z\u001a\u00020y2\u0006\u0010z\u001a\u00020y8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R(\u0010\u0083\u0001\u001a\u00020\u00162\u0006\u0010\u007f\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0005\b\u0082\u0001\u0010\u0019R(\u0010\u0084\u0001\u001a\u00020V2\u0007\u0010\u0084\u0001\u001a\u00020V8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010Y\"\u0005\b\u0086\u0001\u0010[R(\u0010\u008a\u0001\u001a\u00020V2\u0007\u0010\u0087\u0001\u001a\u00020V8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0088\u0001\u0010Y\"\u0005\b\u0089\u0001\u0010[R\u0017\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R0\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008b\u00012\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008b\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0090\u0001\u0010\u008d\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0015\u0010\u009b\u0001\u001a\u00030\u0098\u00018F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u009e\u0001\u001a\u0004\u0018\u00010*8F¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001¨\u0006 \u0001"}, d2 = {"Lcom/canhub/cropper/CropImageView;", "Landroid/widget/FrameLayout;", "La4/af;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "multiTouchEnabled", "", "setMultiTouchEnabled", "(Z)V", "centerMoveEnabled", "setCenterMoveEnabled", "fixAspectRatio", "setFixedAspectRatio", "Lcom/canhub/cropper/CropImageOptions;", "options", "setImageCropOptions", "(Lcom/canhub/cropper/CropImageOptions;)V", "", "snapRadius", "setSnapRadius", "(F)V", "La4/ab;", "listener", "setOnSetCropOverlayReleasedListener", "(La4/ab;)V", "La4/aa;", "setOnSetCropOverlayMovedListener", "(La4/aa;)V", "La4/ac;", "setOnCropWindowChangedListener", "(La4/ac;)V", "La4/ad;", "setOnSetImageUriCompleteListener", "(La4/ad;)V", "La4/z;", "setOnCropImageCompleteListener", "(La4/z;)V", "Landroid/graphics/Bitmap;", "bitmap", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "Landroid/net/Uri;", "uri", "setImageUriAsync", "(Landroid/net/Uri;)V", "k", "Z", "isSaveBitmapToInstanceState", "()Z", "setSaveBitmapToInstanceState", "<set-?>", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE, "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "imageUri", "F", "getCustomOutputUri", "setCustomOutputUri", "customOutputUri", "La4/ae;", "scaleType", "getScaleType", "()La4/ae;", "setScaleType", "(La4/ae;)V", "La4/x;", "cropShape", "getCropShape", "()La4/x;", "setCropShape", "(La4/x;)V", "La4/v;", "cornerShape", "getCornerShape", "()La4/v;", "setCornerShape", "(La4/v;)V", "autoZoomEnabled", "isAutoZoomEnabled", "setAutoZoomEnabled", "", "maxZoom", "getMaxZoom", "()I", "setMaxZoom", "(I)V", "degrees", "getRotatedDegrees", "setRotatedDegrees", "rotatedDegrees", "flipHorizontally", "isFlippedHorizontally", "setFlippedHorizontally", "flipVertically", "isFlippedVertically", "setFlippedVertically", "La4/y;", "guidelines", "getGuidelines", "()La4/y;", "setGuidelines", "(La4/y;)V", "Landroid/util/Pair;", "getAspectRatio", "()Landroid/util/Pair;", Constants.INAPP_ASPECT_RATIO, "showProgressBar", "isShowProgressBar", "setShowProgressBar", "showCropOverlay", "isShowCropOverlay", "setShowCropOverlay", "showCropLabel", "isShowCropLabel", "setShowCropLabel", "", "cropLabelText", "getCropLabelText", "()Ljava/lang/String;", "setCropLabelText", "(Ljava/lang/String;)V", "textSize", "getCropLabelTextSize", "()F", "setCropLabelTextSize", "cropLabelTextSize", "cropLabelTextColor", "getCropLabelTextColor", "setCropLabelTextColor", "resId", "getImageResource", "setImageResource", "imageResource", "Landroid/graphics/Rect;", "getWholeImageRect", "()Landroid/graphics/Rect;", "wholeImageRect", "rect", "getCropRect", "setCropRect", "(Landroid/graphics/Rect;)V", "cropRect", "Landroid/graphics/RectF;", "getCropWindowRect", "()Landroid/graphics/RectF;", "cropWindowRect", "", "getCropPoints", "()[F", "cropPoints", "getCroppedImage", "()Landroid/graphics/Bitmap;", "croppedImage", "a4/w", "cropper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class CropImageView extends FrameLayout implements af {
    public RectF A;
    public int B;
    public boolean C;

    /* renamed from: D, reason: collision with root package name */
    public WeakReference f3669D;

    /* renamed from: E, reason: collision with root package name */
    public WeakReference f3670E;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public Uri customOutputUri;

    /* renamed from: a, reason: collision with root package name */
    public r f3672a;
    public final ImageView alpha;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f3673b;

    /* renamed from: c, reason: collision with root package name */
    public int f3674c;

    /* renamed from: d, reason: collision with root package name */
    public int f3675d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3676f;

    /* renamed from: g, reason: collision with root package name */
    public int f3677g;

    /* renamed from: h, reason: collision with root package name */
    public int f3678h;

    /* renamed from: i, reason: collision with root package name */
    public int f3679i;

    /* renamed from: j, reason: collision with root package name */
    public ae f3680j;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean isSaveBitmapToInstanceState;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3682l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3683m;

    /* renamed from: n, reason: collision with root package name */
    public String f3684n;

    /* renamed from: o, reason: collision with root package name */
    public float f3685o;

    /* renamed from: p, reason: collision with root package name */
    public int f3686p;
    public final CropOverlayView purple;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3687q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3688r;
    public final Matrix red;

    /* renamed from: s, reason: collision with root package name */
    public int f3689s;
    public final Matrix silver;

    /* renamed from: t, reason: collision with root package name */
    public ad f3690t;
    public final ProgressBar teal;

    /* renamed from: u, reason: collision with root package name */
    public z f3691u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Uri imageUri;

    /* renamed from: w, reason: collision with root package name */
    public int f3693w;
    public final float[] white;

    /* renamed from: x, reason: collision with root package name */
    public float f3694x;

    /* renamed from: y, reason: collision with root package name */
    public float f3695y;
    public final float[] yellow;

    /* renamed from: z, reason: collision with root package name */
    public float f3696z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        if (r6 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CropImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Activity activity;
        CropImageOptions cropImageOptions;
        boolean z2;
        Intent intent;
        Bundle bundleExtra;
        Intrinsics.echo(context, "context");
        this.red = new Matrix();
        this.silver = new Matrix();
        this.white = new float[8];
        this.yellow = new float[8];
        this.f3682l = true;
        this.f3684n = "";
        this.f3685o = 20.0f;
        this.f3686p = -1;
        this.f3687q = true;
        this.f3688r = true;
        this.f3693w = 1;
        this.f3694x = 1.0f;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity != null && (intent = activity.getIntent()) != null && (bundleExtra = intent.getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE")) != null) {
            Object parcelable = bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
            cropImageOptions = (CropImageOptions) (parcelable instanceof CropImageOptions ? parcelable : null);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, al.alpha, 0, 0);
            Intrinsics.delta(obtainStyledAttributes, "context.obtainStyledAttr…able.CropImageView, 0, 0)");
            CropImageOptions cropImageOptions2 = new CropImageOptions(null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -1, -1);
            try {
                this.isSaveBitmapToInstanceState = obtainStyledAttributes.getBoolean(29, this.isSaveBitmapToInstanceState);
                ae aeVar = ae.values()[obtainStyledAttributes.getInt(30, cropImageOptions2.f3636b.ordinal())];
                x xVar = x.values()[obtainStyledAttributes.getInt(31, cropImageOptions2.red.ordinal())];
                v vVar = v.values()[obtainStyledAttributes.getInt(0, cropImageOptions2.silver.ordinal())];
                y yVar = y.values()[obtainStyledAttributes.getInt(17, cropImageOptions2.f3634a.ordinal())];
                int integer = obtainStyledAttributes.getInteger(1, cropImageOptions2.f3655m);
                int integer2 = obtainStyledAttributes.getInteger(2, cropImageOptions2.f3656n);
                boolean z10 = obtainStyledAttributes.getBoolean(3, cropImageOptions2.f3645g);
                boolean z11 = obtainStyledAttributes.getBoolean(28, cropImageOptions2.f3647h);
                boolean z12 = obtainStyledAttributes.getBoolean(11, cropImageOptions2.f3649i);
                float dimension = obtainStyledAttributes.getDimension(13, cropImageOptions2.teal);
                float dimension2 = obtainStyledAttributes.getDimension(35, cropImageOptions2.white);
                float dimension3 = obtainStyledAttributes.getDimension(36, cropImageOptions2.yellow);
                float f5 = obtainStyledAttributes.getFloat(20, cropImageOptions2.f3653k);
                int integer3 = obtainStyledAttributes.getInteger(12, cropImageOptions2.f3663u);
                float dimension4 = obtainStyledAttributes.getDimension(10, cropImageOptions2.f3657o);
                int integer4 = obtainStyledAttributes.getInteger(9, cropImageOptions2.f3658p);
                float dimension5 = obtainStyledAttributes.getDimension(8, cropImageOptions2.f3659q);
                float dimension6 = obtainStyledAttributes.getDimension(7, cropImageOptions2.f3660r);
                float dimension7 = obtainStyledAttributes.getDimension(6, cropImageOptions2.f3661s);
                int integer5 = obtainStyledAttributes.getInteger(5, cropImageOptions2.f3662t);
                float dimension8 = obtainStyledAttributes.getDimension(19, cropImageOptions2.f3664v);
                int integer6 = obtainStyledAttributes.getInteger(18, cropImageOptions2.f3665w);
                int integer7 = obtainStyledAttributes.getInteger(4, cropImageOptions2.f3666x);
                int dimension9 = (int) obtainStyledAttributes.getDimension(27, cropImageOptions2.f3667y);
                int dimension10 = (int) obtainStyledAttributes.getDimension(26, cropImageOptions2.f3668z);
                int i4 = (int) obtainStyledAttributes.getFloat(25, cropImageOptions2.A);
                int i5 = (int) obtainStyledAttributes.getFloat(24, cropImageOptions2.B);
                int i10 = (int) obtainStyledAttributes.getFloat(22, cropImageOptions2.C);
                int i11 = (int) obtainStyledAttributes.getFloat(21, cropImageOptions2.f3612D);
                boolean z13 = obtainStyledAttributes.getBoolean(15, cropImageOptions2.f3627T);
                boolean z14 = obtainStyledAttributes.getBoolean(15, cropImageOptions2.f3628U);
                float dimension11 = obtainStyledAttributes.getDimension(39, cropImageOptions2.f3637b0);
                int integer8 = obtainStyledAttributes.getInteger(38, cropImageOptions2.f3639c0);
                boolean z15 = obtainStyledAttributes.getBoolean(33, cropImageOptions2.f3640d);
                int integer9 = obtainStyledAttributes.getInteger(23, cropImageOptions2.f3651j);
                boolean z16 = obtainStyledAttributes.getBoolean(32, cropImageOptions2.f3638c);
                boolean z17 = obtainStyledAttributes.getBoolean(34, cropImageOptions2.e);
                String string = obtainStyledAttributes.getString(37);
                if (!obtainStyledAttributes.getBoolean(14, cropImageOptions2.f3654l) && (!obtainStyledAttributes.hasValue(1) || !obtainStyledAttributes.hasValue(1))) {
                    z2 = false;
                    CropImageOptions cropImageOptions3 = new CropImageOptions(xVar, vVar, dimension, dimension2, dimension3, yVar, aeVar, z16, z15, z17, z10, z11, z12, integer9, f5, z2, integer, integer2, dimension4, integer4, dimension5, dimension6, dimension7, integer5, integer3, dimension8, integer6, integer7, dimension9, dimension10, i4, i5, i10, i11, z13, z14, dimension11, integer8, string, 4099, 530579424);
                    obtainStyledAttributes.recycle();
                    cropImageOptions = cropImageOptions3;
                }
                z2 = true;
                CropImageOptions cropImageOptions32 = new CropImageOptions(xVar, vVar, dimension, dimension2, dimension3, yVar, aeVar, z16, z15, z17, z10, z11, z12, integer9, f5, z2, integer, integer2, dimension4, integer4, dimension5, dimension6, dimension7, integer5, integer3, dimension8, integer6, integer7, dimension9, dimension10, i4, i5, i10, i11, z13, z14, dimension11, integer8, string, 4099, 530579424);
                obtainStyledAttributes.recycle();
                cropImageOptions = cropImageOptions32;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            cropImageOptions = new CropImageOptions(null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -1, -1);
        }
        this.f3680j = cropImageOptions.f3636b;
        this.f3688r = cropImageOptions.f3645g;
        this.f3689s = cropImageOptions.f3651j;
        this.f3685o = cropImageOptions.f3637b0;
        this.f3683m = cropImageOptions.f3640d;
        this.f3682l = cropImageOptions.f3638c;
        this.f3687q = cropImageOptions.e;
        this.e = cropImageOptions.f3627T;
        this.f3676f = cropImageOptions.f3628U;
        View inflate = LayoutInflater.from(context).inflate(R.layout.crop_image_view, (ViewGroup) this, true);
        View findViewById = inflate.findViewById(R.id.ImageView_image);
        Intrinsics.delta(findViewById, "v.findViewById(R.id.ImageView_image)");
        ImageView imageView = (ImageView) findViewById;
        this.alpha = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) inflate.findViewById(R.id.CropOverlayView);
        this.purple = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(this);
        cropOverlayView.setInitialAttributeValues(cropImageOptions);
        View findViewById2 = inflate.findViewById(R.id.CropProgressBar);
        Intrinsics.delta(findViewById2, "v.findViewById(R.id.CropProgressBar)");
        ProgressBar progressBar = (ProgressBar) findViewById2;
        this.teal = progressBar;
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(cropImageOptions.f3643f));
        hotel();
    }

    public final void alpha(float f5, float f10, boolean z2, boolean z10) {
        float f11;
        float f12;
        float max;
        if (this.f3673b != null) {
            float f13 = 0.0f;
            if (f5 > 0.0f && f10 > 0.0f) {
                Matrix matrix = this.red;
                Matrix matrix2 = this.silver;
                matrix.invert(matrix2);
                CropOverlayView cropOverlayView = this.purple;
                Intrinsics.checkNotNull(cropOverlayView);
                RectF cropWindowRect = cropOverlayView.getCropWindowRect();
                matrix2.mapRect(cropWindowRect);
                matrix.reset();
                float f14 = 2;
                matrix.postTranslate((f5 - r0.getWidth()) / f14, (f10 - r0.getHeight()) / f14);
                delta();
                int i4 = this.f3675d;
                float[] fArr = this.white;
                if (i4 > 0) {
                    matrix.postRotate(i4, l.mike(fArr), l.november(fArr));
                    delta();
                }
                float min = Math.min(f5 / l.tango(fArr), f10 / l.papa(fArr));
                ae aeVar = this.f3680j;
                ae aeVar2 = ae.alpha;
                ae aeVar3 = ae.purple;
                if (aeVar != aeVar2 && ((aeVar != ae.red || min >= 1.0f) && (min <= 1.0f || !this.f3688r))) {
                    if (aeVar == aeVar3) {
                        this.f3694x = Math.max(getWidth() / l.tango(fArr), getHeight() / l.papa(fArr));
                    }
                } else {
                    matrix.postScale(min, min, l.mike(fArr), l.november(fArr));
                    delta();
                }
                if (this.e) {
                    f11 = -this.f3694x;
                } else {
                    f11 = this.f3694x;
                }
                if (this.f3676f) {
                    f12 = -this.f3694x;
                } else {
                    f12 = this.f3694x;
                }
                matrix.postScale(f11, f12, l.mike(fArr), l.november(fArr));
                delta();
                matrix.mapRect(cropWindowRect);
                if (this.f3680j == aeVar3 && z2 && !z10) {
                    this.f3695y = 0.0f;
                    this.f3696z = 0.0f;
                } else if (z2) {
                    if (f5 > l.tango(fArr)) {
                        max = 0.0f;
                    } else {
                        max = Math.max(Math.min((f5 / f14) - cropWindowRect.centerX(), -l.quebec(fArr)), getWidth() - l.romeo(fArr)) / f11;
                    }
                    this.f3695y = max;
                    if (f10 <= l.papa(fArr)) {
                        f13 = Math.max(Math.min((f10 / f14) - cropWindowRect.centerY(), -l.sierra(fArr)), getHeight() - l.lima(fArr)) / f12;
                    }
                    this.f3696z = f13;
                } else {
                    this.f3695y = Math.min(Math.max(this.f3695y * f11, -cropWindowRect.left), (-cropWindowRect.right) + f5) / f11;
                    this.f3696z = Math.min(Math.max(this.f3696z * f12, -cropWindowRect.top), (-cropWindowRect.bottom) + f10) / f12;
                }
                matrix.postTranslate(this.f3695y * f11, this.f3696z * f12);
                cropWindowRect.offset(this.f3695y * f11, this.f3696z * f12);
                cropOverlayView.setCropWindowRect(cropWindowRect);
                delta();
                cropOverlayView.invalidate();
                ImageView imageView = this.alpha;
                if (z10) {
                    r rVar = this.f3672a;
                    Intrinsics.checkNotNull(rVar);
                    rVar.getClass();
                    System.arraycopy(fArr, 0, rVar.silver, 0, 8);
                    rVar.white.set(rVar.purple.getCropWindowRect());
                    matrix.getValues(rVar.f2617a);
                    imageView.startAnimation(this.f3672a);
                } else {
                    imageView.setImageMatrix(matrix);
                }
                india(false);
            }
        }
    }

    public final void bravo() {
        Bitmap bitmap = this.f3673b;
        if (bitmap != null && (this.f3679i > 0 || this.imageUri != null)) {
            Intrinsics.checkNotNull(bitmap);
            bitmap.recycle();
        }
        this.f3673b = null;
        this.f3679i = 0;
        this.imageUri = null;
        this.f3693w = 1;
        this.f3675d = 0;
        this.f3694x = 1.0f;
        this.f3695y = 0.0f;
        this.f3696z = 0.0f;
        this.red.reset();
        this.A = null;
        this.B = 0;
        this.alpha.setImageBitmap(null);
        golf();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void charlie(boolean z2, boolean z10) {
        float f5;
        int width = getWidth();
        int height = getHeight();
        if (this.f3673b != null && width > 0 && height > 0) {
            CropOverlayView cropOverlayView = this.purple;
            Intrinsics.checkNotNull(cropOverlayView);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            if (z2) {
                if (cropWindowRect.left < 0.0f || cropWindowRect.top < 0.0f || cropWindowRect.right > width || cropWindowRect.bottom > height) {
                    alpha(width, height, false, false);
                    return;
                }
                return;
            }
            float f10 = 1.0f;
            if (this.f3688r || this.f3694x > 1.0f) {
                if (this.f3694x < this.f3689s) {
                    float f11 = width;
                    if (cropWindowRect.width() < f11 * 0.5f) {
                        float f12 = height;
                        if (cropWindowRect.height() < 0.5f * f12) {
                            f5 = Math.min(this.f3689s, Math.min(f11 / ((cropWindowRect.width() / this.f3694x) / 0.64f), f12 / ((cropWindowRect.height() / this.f3694x) / 0.64f)));
                            if (this.f3694x > 1.0f) {
                                float f13 = width;
                                if (cropWindowRect.width() > f13 * 0.65f || cropWindowRect.height() > height * 0.65f) {
                                    f5 = Math.max(1.0f, Math.min(f13 / ((cropWindowRect.width() / this.f3694x) / 0.51f), height / ((cropWindowRect.height() / this.f3694x) / 0.51f)));
                                }
                            }
                            if (this.f3688r) {
                                f10 = f5;
                            }
                            if (f10 <= 0.0f && f10 != this.f3694x) {
                                if (z10) {
                                    if (this.f3672a == null) {
                                        this.f3672a = new r(this.alpha, cropOverlayView);
                                    }
                                    r rVar = this.f3672a;
                                    Intrinsics.checkNotNull(rVar);
                                    Matrix imageMatrix = this.red;
                                    rVar.getClass();
                                    float[] boundPoints = this.white;
                                    Intrinsics.echo(boundPoints, "boundPoints");
                                    Intrinsics.echo(imageMatrix, "imageMatrix");
                                    rVar.reset();
                                    System.arraycopy(boundPoints, 0, rVar.red, 0, 8);
                                    rVar.teal.set(rVar.purple.getCropWindowRect());
                                    imageMatrix.getValues(rVar.yellow);
                                }
                                this.f3694x = f10;
                                alpha(width, height, true, z10);
                                return;
                            }
                        }
                    }
                }
                f5 = 0.0f;
                if (this.f3694x > 1.0f) {
                }
                if (this.f3688r) {
                }
                if (f10 <= 0.0f) {
                }
            }
        }
    }

    public final void delta() {
        float[] fArr = this.white;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Intrinsics.checkNotNull(this.f3673b);
        fArr[2] = r4.getWidth();
        fArr[3] = 0.0f;
        Intrinsics.checkNotNull(this.f3673b);
        fArr[4] = r6.getWidth();
        Intrinsics.checkNotNull(this.f3673b);
        fArr[5] = r6.getHeight();
        fArr[6] = 0.0f;
        Intrinsics.checkNotNull(this.f3673b);
        fArr[7] = r9.getHeight();
        Matrix matrix = this.red;
        matrix.mapPoints(fArr);
        float[] fArr2 = this.yellow;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 100.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 100.0f;
        fArr2[5] = 100.0f;
        fArr2[6] = 0.0f;
        fArr2[7] = 100.0f;
        matrix.mapPoints(fArr2);
    }

    public final void echo(int i4) {
        int i5;
        boolean z2;
        float width;
        float height;
        if (this.f3673b != null) {
            if (i4 < 0) {
                i5 = (i4 % 360) + 360;
            } else {
                i5 = i4 % 360;
            }
            CropOverlayView cropOverlayView = this.purple;
            Intrinsics.checkNotNull(cropOverlayView);
            if (!cropOverlayView.f3717s && ((46 <= i5 && i5 < 135) || (216 <= i5 && i5 < 305))) {
                z2 = true;
            } else {
                z2 = false;
            }
            RectF rectF = l.charlie;
            rectF.set(cropOverlayView.getCropWindowRect());
            if (z2) {
                width = rectF.height();
            } else {
                width = rectF.width();
            }
            float f5 = width / 2.0f;
            if (z2) {
                height = rectF.width();
            } else {
                height = rectF.height();
            }
            float f10 = height / 2.0f;
            if (z2) {
                boolean z10 = this.e;
                this.e = this.f3676f;
                this.f3676f = z10;
            }
            Matrix matrix = this.red;
            Matrix matrix2 = this.silver;
            matrix.invert(matrix2);
            float[] fArr = l.delta;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            matrix2.mapPoints(fArr);
            this.f3675d = (this.f3675d + i5) % 360;
            alpha(getWidth(), getHeight(), true, false);
            float[] fArr2 = l.echo;
            matrix.mapPoints(fArr2, fArr);
            float sqrt = this.f3694x / ((float) Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d)));
            this.f3694x = sqrt;
            this.f3694x = Math.max(sqrt, 1.0f);
            alpha(getWidth(), getHeight(), true, false);
            matrix.mapPoints(fArr2, fArr);
            float sqrt2 = (float) Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d));
            float f11 = f5 * sqrt2;
            float f12 = f10 * sqrt2;
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            rectF.set(f13 - f11, f14 - f12, f13 + f11, f14 + f12);
            cropOverlayView.golf();
            cropOverlayView.setCropWindowRect(rectF);
            alpha(getWidth(), getHeight(), true, false);
            charlie(false, false);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            cropOverlayView.echo(cropWindowRect);
            cropOverlayView.yellow.alpha.set(cropWindowRect);
        }
    }

    public final void foxtrot(Bitmap bitmap, int i4, Uri uri, int i5, int i10) {
        Bitmap bitmap2 = this.f3673b;
        if (bitmap2 == null || !Intrinsics.areEqual(bitmap2, bitmap)) {
            bravo();
            this.f3673b = bitmap;
            this.alpha.setImageBitmap(bitmap);
            this.imageUri = uri;
            this.f3679i = i4;
            this.f3693w = i5;
            this.f3675d = i10;
            alpha(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.purple;
            if (cropOverlayView != null) {
                cropOverlayView.golf();
                golf();
            }
        }
    }

    @NotNull
    public final Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        return new Pair<>(Integer.valueOf(cropOverlayView.getF3718t()), Integer.valueOf(cropOverlayView.getF3719u()));
    }

    @Nullable
    public final v getCornerShape() {
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.getCornerShape();
    }

    @NotNull
    /* renamed from: getCropLabelText, reason: from getter */
    public final String getF3684n() {
        return this.f3684n;
    }

    /* renamed from: getCropLabelTextColor, reason: from getter */
    public final int getF3686p() {
        return this.f3686p;
    }

    /* renamed from: getCropLabelTextSize, reason: from getter */
    public final float getF3685o() {
        return this.f3685o;
    }

    @NotNull
    public final float[] getCropPoints() {
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        float f5 = cropWindowRect.left;
        float f10 = cropWindowRect.top;
        float f11 = cropWindowRect.right;
        float f12 = cropWindowRect.bottom;
        float[] fArr = {f5, f10, f11, f10, f11, f12, f5, f12};
        Matrix matrix = this.red;
        Matrix matrix2 = this.silver;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        float[] fArr2 = new float[8];
        for (int i4 = 0; i4 < 8; i4++) {
            fArr2[i4] = fArr[i4] * this.f3693w;
        }
        return fArr2;
    }

    @Nullable
    public final Rect getCropRect() {
        int i4 = this.f3693w;
        Bitmap bitmap = this.f3673b;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i4;
        int height = bitmap.getHeight() * i4;
        Rect rect = l.alpha;
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        return l.oscar(cropPoints, width, height, cropOverlayView.f3717s, cropOverlayView.getF3718t(), cropOverlayView.getF3719u());
    }

    @Nullable
    public final x getCropShape() {
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.getCropShape();
    }

    @Nullable
    public final RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.purple;
        if (cropOverlayView != null) {
            return cropOverlayView.getCropWindowRect();
        }
        return null;
    }

    @Nullable
    public final Bitmap getCroppedImage() {
        int i4;
        int i5;
        Bitmap bitmap;
        Bitmap bitmap2 = this.f3673b;
        if (bitmap2 != null) {
            Uri uri = this.imageUri;
            CropOverlayView cropOverlayView = this.purple;
            if (uri == null || this.f3693w <= 1) {
                i4 = 0;
                i5 = 0;
                Rect rect = l.alpha;
                float[] cropPoints = getCropPoints();
                int i10 = this.f3675d;
                Intrinsics.checkNotNull(cropOverlayView);
                bitmap = (Bitmap) l.echo(bitmap2, cropPoints, i10, cropOverlayView.f3717s, cropOverlayView.getF3718t(), cropOverlayView.getF3719u(), this.e, this.f3676f).red;
            } else {
                Intrinsics.checkNotNull(bitmap2);
                int width = bitmap2.getWidth() * this.f3693w;
                Bitmap bitmap3 = this.f3673b;
                Intrinsics.checkNotNull(bitmap3);
                int height = bitmap3.getHeight() * this.f3693w;
                Rect rect2 = l.alpha;
                Context context = getContext();
                Intrinsics.delta(context, "context");
                Uri uri2 = this.imageUri;
                float[] cropPoints2 = getCropPoints();
                int i11 = this.f3675d;
                Intrinsics.checkNotNull(cropOverlayView);
                Fe.c charlie = l.charlie(context, uri2, cropPoints2, i11, width, height, cropOverlayView.f3717s, cropOverlayView.getF3718t(), cropOverlayView.getF3719u(), 0, 0, this.e, this.f3676f);
                i4 = 0;
                i5 = 0;
                bitmap = (Bitmap) charlie.red;
            }
            return l.uniform(bitmap, i4, i5, 1);
        }
        return null;
    }

    @Nullable
    public final Uri getCustomOutputUri() {
        return this.customOutputUri;
    }

    @Nullable
    public final y getGuidelines() {
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.getGuidelines();
    }

    /* renamed from: getImageResource, reason: from getter */
    public final int getF3679i() {
        return this.f3679i;
    }

    @Nullable
    public final Uri getImageUri() {
        return this.imageUri;
    }

    /* renamed from: getMaxZoom, reason: from getter */
    public final int getF3689s() {
        return this.f3689s;
    }

    /* renamed from: getRotatedDegrees, reason: from getter */
    public final int getF3675d() {
        return this.f3675d;
    }

    @NotNull
    /* renamed from: getScaleType, reason: from getter */
    public final ae getF3680j() {
        return this.f3680j;
    }

    @Nullable
    public final Rect getWholeImageRect() {
        int i4 = this.f3693w;
        Bitmap bitmap = this.f3673b;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i4, bitmap.getHeight() * i4);
    }

    public final void golf() {
        int i4;
        CropOverlayView cropOverlayView = this.purple;
        if (cropOverlayView != null) {
            if (this.f3682l && this.f3673b != null) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            cropOverlayView.setVisibility(i4);
        }
    }

    public final void hotel() {
        boolean z2;
        int i4 = 0;
        if (this.f3687q && ((this.f3673b == null && this.f3669D != null) || this.f3670E != null)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            i4 = 4;
        }
        this.teal.setVisibility(i4);
    }

    public final void india(boolean z2) {
        float[] fArr;
        Bitmap bitmap = this.f3673b;
        CropOverlayView cropOverlayView = this.purple;
        if (bitmap != null && !z2) {
            Rect rect = l.alpha;
            float[] fArr2 = this.yellow;
            float tango = (this.f3693w * 100.0f) / l.tango(fArr2);
            float papa = (this.f3693w * 100.0f) / l.papa(fArr2);
            Intrinsics.checkNotNull(cropOverlayView);
            float width = getWidth();
            float height = getHeight();
            ai aiVar = cropOverlayView.yellow;
            aiVar.echo = width;
            aiVar.foxtrot = height;
            aiVar.kilo = tango;
            aiVar.lima = papa;
        }
        Intrinsics.checkNotNull(cropOverlayView);
        if (z2) {
            fArr = null;
        } else {
            fArr = this.white;
        }
        cropOverlayView.hotel(getWidth(), getHeight(), fArr);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        if (this.f3677g > 0 && this.f3678h > 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = this.f3677g;
            layoutParams.height = this.f3678h;
            setLayoutParams(layoutParams);
            if (this.f3673b != null) {
                float f5 = i10 - i4;
                float f10 = i11 - i5;
                alpha(f5, f10, true, false);
                RectF rectF = this.A;
                if (rectF != null) {
                    int i12 = this.B;
                    if (i12 != this.f3674c) {
                        this.f3675d = i12;
                        alpha(f5, f10, true, false);
                        this.B = 0;
                    }
                    this.red.mapRect(this.A);
                    CropOverlayView cropOverlayView = this.purple;
                    if (cropOverlayView != null) {
                        cropOverlayView.setCropWindowRect(rectF);
                    }
                    charlie(false, false);
                    if (cropOverlayView != null) {
                        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
                        cropOverlayView.echo(cropWindowRect);
                        cropOverlayView.yellow.alpha.set(cropWindowRect);
                    }
                    this.A = null;
                    return;
                }
                if (this.C) {
                    this.C = false;
                    charlie(false, false);
                    return;
                }
                return;
            }
            india(true);
            return;
        }
        india(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        double d4;
        double d9;
        int width;
        int i10;
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        Bitmap bitmap = this.f3673b;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            if (size < bitmap.getWidth()) {
                d4 = size / bitmap.getWidth();
            } else {
                d4 = Double.POSITIVE_INFINITY;
            }
            if (size2 < bitmap.getHeight()) {
                d9 = size2 / bitmap.getHeight();
            } else {
                d9 = Double.POSITIVE_INFINITY;
            }
            if (d4 == Double.POSITIVE_INFINITY && d9 == Double.POSITIVE_INFINITY) {
                width = bitmap.getWidth();
                i10 = bitmap.getHeight();
            } else if (d4 <= d9) {
                i10 = (int) (bitmap.getHeight() * d4);
                width = size;
            } else {
                width = (int) (bitmap.getWidth() * d9);
                i10 = size2;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    size = width;
                }
            } else {
                size = Math.min(width, size);
            }
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 1073741824) {
                    size2 = i10;
                }
            } else {
                size2 = Math.min(i10, size2);
            }
            this.f3677g = size;
            this.f3678h = size2;
            setMeasuredDimension(size, size2);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onRestoreInstanceState(Parcelable state) {
        CropImageView cropImageView;
        Bitmap bitmap;
        Bitmap bitmap2;
        Intrinsics.echo(state, "state");
        if (state instanceof Bundle) {
            Parcelable parcelable = null;
            if (this.f3669D == null && this.imageUri == null && this.f3673b == null && this.f3679i == 0) {
                Bundle bundle = (Bundle) state;
                Object parcelable2 = bundle.getParcelable("LOADED_IMAGE_URI");
                if (!(parcelable2 instanceof Uri)) {
                    parcelable2 = null;
                }
                Uri uri = (Uri) parcelable2;
                if (uri != null) {
                    String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        Pair pair = l.golf;
                        if (pair != null) {
                            if (Intrinsics.areEqual(pair.first, string)) {
                                bitmap2 = (Bitmap) ((WeakReference) pair.second).get();
                            } else {
                                bitmap2 = null;
                            }
                            bitmap = bitmap2;
                        } else {
                            bitmap = null;
                        }
                        l.golf = null;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            cropImageView = this;
                            cropImageView.foxtrot(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                            if (cropImageView.imageUri == null) {
                                setImageUriAsync(uri);
                            }
                        }
                    }
                    cropImageView = this;
                    if (cropImageView.imageUri == null) {
                    }
                } else {
                    cropImageView = this;
                    int i4 = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i4 > 0) {
                        setImageResource(i4);
                    } else {
                        Parcelable parcelable3 = bundle.getParcelable("LOADING_IMAGE_URI");
                        if (!(parcelable3 instanceof Uri)) {
                            parcelable3 = null;
                        }
                        Uri uri2 = (Uri) parcelable3;
                        if (uri2 != null) {
                            setImageUriAsync(uri2);
                        }
                    }
                }
                int i5 = bundle.getInt("DEGREES_ROTATED");
                cropImageView.B = i5;
                cropImageView.f3675d = i5;
                Parcelable parcelable4 = bundle.getParcelable("INITIAL_CROP_RECT");
                if (!(parcelable4 instanceof Rect)) {
                    parcelable4 = null;
                }
                Rect rect = (Rect) parcelable4;
                CropOverlayView cropOverlayView = cropImageView.purple;
                if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                    Intrinsics.checkNotNull(cropOverlayView);
                    cropOverlayView.setInitialCropWindowRect(rect);
                }
                Parcelable parcelable5 = bundle.getParcelable("CROP_WINDOW_RECT");
                if (!(parcelable5 instanceof RectF)) {
                    parcelable5 = null;
                }
                RectF rectF = (RectF) parcelable5;
                if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                    cropImageView.A = rectF;
                }
                Intrinsics.checkNotNull(cropOverlayView);
                String string2 = bundle.getString("CROP_SHAPE");
                Intrinsics.checkNotNull(string2);
                cropOverlayView.setCropShape(x.valueOf(string2));
                cropImageView.f3688r = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                cropImageView.f3689s = bundle.getInt("CROP_MAX_ZOOM");
                cropImageView.e = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
                cropImageView.f3676f = bundle.getBoolean("CROP_FLIP_VERTICALLY");
                boolean z2 = bundle.getBoolean("SHOW_CROP_LABEL");
                cropImageView.f3683m = z2;
                cropOverlayView.setCropperTextLabelVisibility(z2);
            }
            Parcelable parcelable6 = ((Bundle) state).getParcelable("instanceState");
            if (parcelable6 != null) {
                parcelable = parcelable6;
            }
            super.onRestoreInstanceState(parcelable);
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Uri uri;
        if (this.imageUri == null && this.f3673b == null && this.f3679i < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        if (this.isSaveBitmapToInstanceState && this.imageUri == null && this.f3679i < 1) {
            Rect rect = l.alpha;
            Context context = getContext();
            Intrinsics.delta(context, "context");
            Bitmap bitmap = this.f3673b;
            Uri uri2 = this.customOutputUri;
            try {
                Intrinsics.checkNotNull(bitmap);
                uri = l.victor(context, bitmap, Bitmap.CompressFormat.JPEG, 95, uri2);
            } catch (Exception e) {
                Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e);
                uri = null;
            }
        } else {
            uri = this.imageUri;
        }
        if (uri != null && this.f3673b != null) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.delta(uuid, "randomUUID().toString()");
            Rect rect2 = l.alpha;
            l.golf = new Pair(uuid, new WeakReference(this.f3673b));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference weakReference = this.f3669D;
        if (weakReference != null) {
            Intrinsics.checkNotNull(weakReference);
            i iVar = (i) weakReference.get();
            if (iVar != null) {
                bundle.putParcelable("LOADING_IMAGE_URI", iVar.purple);
            }
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f3679i);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.f3693w);
        bundle.putInt("DEGREES_ROTATED", this.f3675d);
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getF3697D());
        RectF rectF = l.charlie;
        rectF.set(cropOverlayView.getCropWindowRect());
        Matrix matrix = this.red;
        Matrix matrix2 = this.silver;
        matrix.invert(matrix2);
        matrix2.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        x cropShape = cropOverlayView.getCropShape();
        Intrinsics.checkNotNull(cropShape);
        bundle.putString("CROP_SHAPE", cropShape.name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f3688r);
        bundle.putInt("CROP_MAX_ZOOM", this.f3689s);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.e);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f3676f);
        bundle.putBoolean("SHOW_CROP_LABEL", this.f3683m);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i10, int i11) {
        boolean z2;
        super.onSizeChanged(i4, i5, i10, i11);
        if (i10 > 0 && i11 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.C = z2;
    }

    public final void setAutoZoomEnabled(boolean z2) {
        if (this.f3688r != z2) {
            this.f3688r = z2;
            charlie(false, false);
            CropOverlayView cropOverlayView = this.purple;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean centerMoveEnabled) {
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        if (cropOverlayView.white != centerMoveEnabled) {
            cropOverlayView.white = centerMoveEnabled;
            charlie(false, false);
            cropOverlayView.invalidate();
        }
    }

    public final void setCornerShape(@Nullable v vVar) {
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        Intrinsics.checkNotNull(vVar);
        cropOverlayView.setCropCornerShape(vVar);
    }

    public final void setCropLabelText(@NotNull String cropLabelText) {
        Intrinsics.echo(cropLabelText, "cropLabelText");
        this.f3684n = cropLabelText;
        CropOverlayView cropOverlayView = this.purple;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelText(cropLabelText);
        }
    }

    public final void setCropLabelTextColor(int i4) {
        this.f3686p = i4;
        CropOverlayView cropOverlayView = this.purple;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i4);
        }
    }

    public final void setCropLabelTextSize(float f5) {
        this.f3685o = getF3685o();
        CropOverlayView cropOverlayView = this.purple;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextSize(f5);
        }
    }

    public final void setCropRect(@Nullable Rect rect) {
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(rect);
    }

    public final void setCropShape(@Nullable x xVar) {
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        Intrinsics.checkNotNull(xVar);
        cropOverlayView.setCropShape(xVar);
    }

    public final void setCustomOutputUri(@Nullable Uri uri) {
        this.customOutputUri = uri;
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setFixedAspectRatio(fixAspectRatio);
    }

    public final void setFlippedHorizontally(boolean z2) {
        if (this.e != z2) {
            this.e = z2;
            alpha(getWidth(), getHeight(), true, false);
        }
    }

    public final void setFlippedVertically(boolean z2) {
        if (this.f3676f != z2) {
            this.f3676f = z2;
            alpha(getWidth(), getHeight(), true, false);
        }
    }

    public final void setGuidelines(@Nullable y yVar) {
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        Intrinsics.checkNotNull(yVar);
        cropOverlayView.setGuidelines(yVar);
    }

    public final void setImageBitmap(@Nullable Bitmap bitmap) {
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(null);
        foxtrot(bitmap, 0, null, 1, 0);
    }

    public final void setImageCropOptions(@NotNull CropImageOptions options) {
        Intrinsics.echo(options, "options");
        setScaleType(options.f3636b);
        this.customOutputUri = options.f3616H;
        CropOverlayView cropOverlayView = this.purple;
        if (cropOverlayView != null) {
            cropOverlayView.setInitialAttributeValues(options);
        }
        setMultiTouchEnabled(options.f3647h);
        setCenterMoveEnabled(options.f3649i);
        boolean z2 = options.f3638c;
        setShowCropOverlay(z2);
        boolean z10 = options.e;
        setShowProgressBar(z10);
        boolean z11 = options.f3645g;
        setAutoZoomEnabled(z11);
        setMaxZoom(options.f3651j);
        setFlippedHorizontally(options.f3627T);
        setFlippedVertically(options.f3628U);
        this.f3688r = z11;
        this.f3682l = z2;
        this.f3687q = z10;
        this.teal.setIndeterminateTintList(ColorStateList.valueOf(options.f3643f));
    }

    public final void setImageResource(int i4) {
        if (i4 != 0) {
            CropOverlayView cropOverlayView = this.purple;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            foxtrot(BitmapFactory.decodeResource(getResources(), i4), i4, null, 1, 0);
        }
    }

    public final void setImageUriAsync(@Nullable Uri uri) {
        i iVar;
        if (uri != null) {
            WeakReference weakReference = this.f3669D;
            if (weakReference != null) {
                Intrinsics.checkNotNull(weakReference);
                iVar = (i) weakReference.get();
            } else {
                iVar = null;
            }
            if (iVar != null) {
                iVar.white.foxtrot(null);
            }
            bravo();
            CropOverlayView cropOverlayView = this.purple;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            Context context = getContext();
            Intrinsics.delta(context, "context");
            WeakReference weakReference2 = new WeakReference(new i(context, this, uri));
            this.f3669D = weakReference2;
            Intrinsics.checkNotNull(weakReference2);
            Object obj = weakReference2.get();
            Intrinsics.checkNotNull(obj);
            i iVar2 = (i) obj;
            iVar2.getClass();
            iVar2.white = vf.ad.zulu(iVar2, ao.alpha, null, new h(iVar2, null), 2);
            hotel();
        }
    }

    public final void setMaxZoom(int i4) {
        if (this.f3689s != i4 && i4 > 0) {
            this.f3689s = i4;
            charlie(false, false);
            CropOverlayView cropOverlayView = this.purple;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setMultiTouchEnabled(boolean multiTouchEnabled) {
        CropOverlayView cropOverlayView = this.purple;
        Intrinsics.checkNotNull(cropOverlayView);
        if (cropOverlayView.teal != multiTouchEnabled) {
            cropOverlayView.teal = multiTouchEnabled;
            if (multiTouchEnabled && cropOverlayView.silver == null) {
                cropOverlayView.silver = new ScaleGestureDetector(cropOverlayView.getContext(), new ag(cropOverlayView));
            }
            charlie(false, false);
            cropOverlayView.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(@Nullable z listener) {
        this.f3691u = listener;
    }

    public final void setOnCropWindowChangedListener(@Nullable ac listener) {
    }

    public final void setOnSetCropOverlayMovedListener(@Nullable aa listener) {
    }

    public final void setOnSetCropOverlayReleasedListener(@Nullable ab listener) {
    }

    public final void setOnSetImageUriCompleteListener(@Nullable ad listener) {
        this.f3690t = listener;
    }

    public final void setRotatedDegrees(int i4) {
        int i5 = this.f3675d;
        if (i5 != i4) {
            echo(i4 - i5);
        }
    }

    public final void setSaveBitmapToInstanceState(boolean z2) {
        this.isSaveBitmapToInstanceState = z2;
    }

    public final void setScaleType(@NotNull ae scaleType) {
        Intrinsics.echo(scaleType, "scaleType");
        if (scaleType != this.f3680j) {
            this.f3680j = scaleType;
            this.f3694x = 1.0f;
            this.f3696z = 0.0f;
            this.f3695y = 0.0f;
            CropOverlayView cropOverlayView = this.purple;
            if (cropOverlayView != null) {
                cropOverlayView.golf();
            }
            requestLayout();
        }
    }

    public final void setShowCropLabel(boolean z2) {
        if (this.f3683m != z2) {
            this.f3683m = z2;
            CropOverlayView cropOverlayView = this.purple;
            if (cropOverlayView != null) {
                cropOverlayView.setCropperTextLabelVisibility(z2);
            }
        }
    }

    public final void setShowCropOverlay(boolean z2) {
        if (this.f3682l != z2) {
            this.f3682l = z2;
            golf();
        }
    }

    public final void setShowProgressBar(boolean z2) {
        if (this.f3687q != z2) {
            this.f3687q = z2;
            hotel();
        }
    }

    public final void setSnapRadius(float snapRadius) {
        if (snapRadius >= 0.0f) {
            CropOverlayView cropOverlayView = this.purple;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setSnapRadius(snapRadius);
        }
    }
}
