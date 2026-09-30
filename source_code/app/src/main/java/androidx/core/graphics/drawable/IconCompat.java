package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import bc.d;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import d.S0;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import s6.R5;

/* loaded from: classes3.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode kilo = PorterDuff.Mode.SRC_IN;
    public int alpha;
    public Object bravo;
    public byte[] charlie;
    public Parcelable delta;
    public int echo;
    public int foxtrot;
    public ColorStateList golf;
    public PorterDuff.Mode hotel;
    public String india;
    public String juliet;

    public IconCompat() {
        this.alpha = -1;
        this.charlie = null;
        this.delta = null;
        this.echo = 0;
        this.foxtrot = 0;
        this.golf = null;
        this.hotel = kilo;
        this.india = null;
    }

    public static Bitmap alpha(Bitmap bitmap, boolean z2) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f5 = min;
        float f10 = 0.5f * f5;
        float f11 = 0.9166667f * f10;
        if (z2) {
            float f12 = 0.010416667f * f5;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f5 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(ShapeBuilder.DEFAULT_SHAPE_COLOR);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat bravo(int i4, String str) {
        str.getClass();
        if (i4 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.echo = i4;
            iconCompat.bravo = str;
            iconCompat.juliet = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int charlie() {
        int i4 = this.alpha;
        if (i4 == -1) {
            return R5.alpha(this.bravo);
        }
        if (i4 == 2) {
            return this.echo;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri delta() {
        int i4 = this.alpha;
        if (i4 == -1) {
            return R5.delta(this.bravo);
        }
        if (i4 != 4 && i4 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.bravo);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Icon echo(Context context) {
        Icon createWithBitmap;
        String str;
        InputStream openInputStream;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = this.alpha;
        switch (i5) {
            case -1:
                return (Icon) this.bravo;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.bravo);
                break;
            case 2:
                if (i5 == -1) {
                    str = R5.bravo(this.bravo);
                } else if (i5 == 2) {
                    String str2 = this.juliet;
                    if (str2 != null && !TextUtils.isEmpty(str2)) {
                        str = this.juliet;
                    } else {
                        str = ((String) this.bravo).split(":", -1)[0];
                    }
                } else {
                    throw new IllegalStateException("called getResPackage() on " + this);
                }
                createWithBitmap = Icon.createWithResource(str, this.echo);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.bravo, this.echo, this.foxtrot);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.bravo);
                break;
            case 5:
                if (i4 >= 26) {
                    createWithBitmap = S0.alpha((Bitmap) this.bravo);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(alpha((Bitmap) this.bravo, false));
                    break;
                }
            case 6:
                if (i4 >= 30) {
                    createWithBitmap = d.bravo(delta());
                    break;
                } else if (context != null) {
                    Uri delta = delta();
                    String scheme = delta.getScheme();
                    if (!Constants.KEY_CONTENT.equals(scheme) && !CTVariableUtils.FILE.equals(scheme)) {
                        try {
                            openInputStream = new FileInputStream(new File((String) this.bravo));
                        } catch (FileNotFoundException e) {
                            Log.w("IconCompat", "Unable to load image from path: " + delta, e);
                            openInputStream = null;
                            if (openInputStream != null) {
                            }
                        }
                    } else {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(delta);
                        } catch (Exception e4) {
                            Log.w("IconCompat", "Unable to load image from URI: " + delta, e4);
                            openInputStream = null;
                            if (openInputStream != null) {
                            }
                        }
                    }
                    if (openInputStream != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            createWithBitmap = S0.alpha(BitmapFactory.decodeStream(openInputStream));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(alpha(BitmapFactory.decodeStream(openInputStream), false));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + delta());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + delta());
                }
        }
        ColorStateList colorStateList = this.golf;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.hotel;
        if (mode != kilo) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.alpha == -1) {
            return String.valueOf(this.bravo);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.alpha) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.alpha) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.bravo).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.bravo).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.juliet);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(charlie())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.echo);
                if (this.foxtrot != 0) {
                    sb2.append(" off=");
                    sb2.append(this.foxtrot);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.bravo);
                break;
        }
        if (this.golf != null) {
            sb2.append(" tint=");
            sb2.append(this.golf);
        }
        if (this.hotel != kilo) {
            sb2.append(" mode=");
            sb2.append(this.hotel);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i4) {
        this.charlie = null;
        this.delta = null;
        this.echo = 0;
        this.foxtrot = 0;
        this.golf = null;
        this.hotel = kilo;
        this.india = null;
        this.alpha = i4;
    }
}
