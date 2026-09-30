package a0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.DisplayMetrics;
import b0.AbstractC0712b;
import b0.AbstractC0713c;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import s6.AbstractC2797v7;

/* loaded from: classes3.dex */
public abstract class ao {
    public static final an alpha = new Object();
    public static Method bravo;
    public static Method charlie;
    public static boolean delta;

    public static final C0348b alpha(C0352f c0352f) {
        Canvas canvas = AbstractC0349c.alpha;
        C0348b c0348b = new C0348b();
        c0348b.alpha = new Canvas(juliet(c0352f));
        return c0348b;
    }

    public static final RectF amber(Z.c cVar) {
        return new RectF(cVar.alpha, cVar.bravo, cVar.charlie, cVar.delta);
    }

    public static final Shader.TileMode azure(int i4) {
        if (i4 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i4 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i4 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i4 == 3) {
            if (Build.VERSION.SDK_INT >= 31) {
                return E0.f.echo();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int beige(long j5) {
        float[] fArr = b0.d.alpha;
        return (int) (C0366t.alpha(j5, b0.d.echo) >>> 32);
    }

    public static final Bitmap.Config black(int i4) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i4 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i4 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i4 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26 && i4 == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i5 >= 26 && i4 == 4) {
            config = Bitmap.Config.HARDWARE;
            return config;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final Z.c blue(Rect rect) {
        return new Z.c(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long bravo(float f5, float f10, float f11, float f12, AbstractC0713c abstractC0713c) {
        int i4;
        int i5;
        int i10;
        float bravo2;
        float alpha2;
        int i11;
        int i12;
        int i13;
        int i14;
        float bravo3;
        float alpha3;
        int i15;
        int i16;
        int i17;
        float f13;
        float f14;
        float f15;
        int i18 = 31;
        float f16 = 1.0f;
        float f17 = 0.0f;
        if (abstractC0713c.charlie()) {
            if (f12 < 0.0f) {
                f13 = 0.0f;
            } else {
                f13 = f12;
            }
            if (f13 > 1.0f) {
                f13 = 1.0f;
            }
            int i19 = ((int) ((f13 * 255.0f) + 0.5f)) << 24;
            if (f5 < 0.0f) {
                f14 = 0.0f;
            } else {
                f14 = f5;
            }
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            int i20 = i19 | (((int) ((f14 * 255.0f) + 0.5f)) << 16);
            if (f10 < 0.0f) {
                f15 = 0.0f;
            } else {
                f15 = f10;
            }
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i21 = i20 | (((int) ((f15 * 255.0f) + 0.5f)) << 8);
            if (f11 >= 0.0f) {
                f17 = f11;
            }
            if (f17 <= 1.0f) {
                f16 = f17;
            }
            long j5 = (i21 | ((int) ((f16 * 255.0f) + 0.5f))) << 32;
            int i22 = C0366t.lima;
            return j5;
        }
        int i23 = AbstractC0712b.echo;
        if (((int) (abstractC0713c.bravo >> 32)) != 3) {
            AbstractC0345ae.alpha("Color only works with ColorSpaces with 3 components");
        }
        int i24 = abstractC0713c.charlie;
        if (i24 == -1) {
            AbstractC0345ae.alpha("Unknown color space, please use a color space in ColorSpaces");
        }
        float bravo4 = abstractC0713c.bravo(0);
        float alpha4 = abstractC0713c.alpha(0);
        if (f5 >= bravo4) {
            bravo4 = f5;
        }
        if (bravo4 <= alpha4) {
            alpha4 = bravo4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(alpha4);
        int i25 = floatToRawIntBits >>> 31;
        int i26 = (floatToRawIntBits >>> 23) & 255;
        int i27 = floatToRawIntBits & 8388607;
        if (i26 == 255) {
            if (i27 != 0) {
                i5 = 512;
            } else {
                i5 = 0;
            }
            i4 = 31;
        } else {
            i4 = i26 - 112;
            if (i4 >= 31) {
                i4 = 49;
                i5 = 0;
            } else if (i4 <= 0) {
                if (i4 >= -10) {
                    int i28 = (i27 | 8388608) >> (1 - i4);
                    if ((i28 & 4096) != 0) {
                        i28 += 8192;
                    }
                    i5 = i28 >> 13;
                } else {
                    i5 = 0;
                }
                i4 = 0;
            } else {
                int i29 = i27 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i10 = (((i4 << 10) | i29) + 1) | (i25 << 15);
                    short s3 = (short) i10;
                    bravo2 = abstractC0713c.bravo(1);
                    alpha2 = abstractC0713c.alpha(1);
                    if (f10 >= bravo2) {
                        bravo2 = f10;
                    }
                    if (bravo2 <= alpha2) {
                        alpha2 = bravo2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(alpha2);
                    int i30 = floatToRawIntBits2 >>> 31;
                    i11 = (floatToRawIntBits2 >>> 23) & 255;
                    int i31 = floatToRawIntBits2 & 8388607;
                    if (i11 != 255) {
                        if (i31 != 0) {
                            i13 = 512;
                        } else {
                            i13 = 0;
                        }
                        i12 = 31;
                    } else {
                        i12 = i11 - 112;
                        if (i12 >= 31) {
                            i12 = 49;
                            i13 = 0;
                        } else if (i12 <= 0) {
                            if (i12 >= -10) {
                                int i32 = (i31 | 8388608) >> (1 - i12);
                                if ((i32 & 4096) != 0) {
                                    i32 += 8192;
                                }
                                i13 = i32 >> 13;
                            } else {
                                i13 = 0;
                            }
                            i12 = 0;
                        } else {
                            int i33 = i31 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i14 = (((i12 << 10) | i33) + 1) | (i30 << 15);
                                short s9 = (short) i14;
                                bravo3 = abstractC0713c.bravo(2);
                                alpha3 = abstractC0713c.alpha(2);
                                if (f11 >= bravo3) {
                                    bravo3 = f11;
                                }
                                if (bravo3 <= alpha3) {
                                    alpha3 = bravo3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(alpha3);
                                int i34 = floatToRawIntBits3 >>> 31;
                                i15 = (floatToRawIntBits3 >>> 23) & 255;
                                int i35 = 8388607 & floatToRawIntBits3;
                                if (i15 == 255) {
                                    if (i35 != 0) {
                                        i16 = 512;
                                        i17 = (i34 << 15) | (i18 << 10) | i16;
                                        short s10 = (short) i17;
                                        if (f12 >= 0.0f) {
                                            f17 = f12;
                                        }
                                        if (f17 <= 1.0f) {
                                            f16 = f17;
                                        }
                                        long j6 = ((((int) ((f16 * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s9 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & s10) << 16) | (i24 & 63);
                                        int i36 = C0366t.lima;
                                        return j6;
                                    }
                                    i16 = 0;
                                    i17 = (i34 << 15) | (i18 << 10) | i16;
                                    short s102 = (short) i17;
                                    if (f12 >= 0.0f) {
                                    }
                                    if (f17 <= 1.0f) {
                                    }
                                    long j62 = ((((int) ((f16 * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s9 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & s102) << 16) | (i24 & 63);
                                    int i362 = C0366t.lima;
                                    return j62;
                                }
                                int i37 = i15 - 112;
                                if (i37 >= 31) {
                                    i18 = 49;
                                } else {
                                    if (i37 <= 0) {
                                        if (i37 >= -10) {
                                            int i38 = (i35 | 8388608) >> (1 - i37);
                                            if ((i38 & 4096) != 0) {
                                                i38 += 8192;
                                            }
                                            i16 = i38 >> 13;
                                            i18 = 0;
                                        } else {
                                            i18 = 0;
                                        }
                                    } else {
                                        i16 = i35 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i17 = (((i37 << 10) | i16) + 1) | (i34 << 15);
                                            short s1022 = (short) i17;
                                            if (f12 >= 0.0f) {
                                            }
                                            if (f17 <= 1.0f) {
                                            }
                                            long j622 = ((((int) ((f16 * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s9 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & s1022) << 16) | (i24 & 63);
                                            int i3622 = C0366t.lima;
                                            return j622;
                                        }
                                        i18 = i37;
                                    }
                                    i17 = (i34 << 15) | (i18 << 10) | i16;
                                    short s10222 = (short) i17;
                                    if (f12 >= 0.0f) {
                                    }
                                    if (f17 <= 1.0f) {
                                    }
                                    long j6222 = ((((int) ((f16 * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s9 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & s10222) << 16) | (i24 & 63);
                                    int i36222 = C0366t.lima;
                                    return j6222;
                                }
                                i16 = 0;
                                i17 = (i34 << 15) | (i18 << 10) | i16;
                                short s102222 = (short) i17;
                                if (f12 >= 0.0f) {
                                }
                                if (f17 <= 1.0f) {
                                }
                                long j62222 = ((((int) ((f16 * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s9 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & s102222) << 16) | (i24 & 63);
                                int i362222 = C0366t.lima;
                                return j62222;
                            }
                            i13 = i33;
                        }
                    }
                    i14 = i13 | (i30 << 15) | (i12 << 10);
                    short s92 = (short) i14;
                    bravo3 = abstractC0713c.bravo(2);
                    alpha3 = abstractC0713c.alpha(2);
                    if (f11 >= bravo3) {
                    }
                    if (bravo3 <= alpha3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(alpha3);
                    int i342 = floatToRawIntBits32 >>> 31;
                    i15 = (floatToRawIntBits32 >>> 23) & 255;
                    int i352 = 8388607 & floatToRawIntBits32;
                    if (i15 == 255) {
                    }
                } else {
                    i5 = i29;
                }
            }
        }
        i10 = i5 | (i25 << 15) | (i4 << 10);
        short s32 = (short) i10;
        bravo2 = abstractC0713c.bravo(1);
        alpha2 = abstractC0713c.alpha(1);
        if (f10 >= bravo2) {
        }
        if (bravo2 <= alpha2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(alpha2);
        int i302 = floatToRawIntBits22 >>> 31;
        i11 = (floatToRawIntBits22 >>> 23) & 255;
        int i312 = floatToRawIntBits22 & 8388607;
        if (i11 != 255) {
        }
        i14 = i13 | (i302 << 15) | (i12 << 10);
        short s922 = (short) i14;
        bravo3 = abstractC0713c.bravo(2);
        alpha3 = abstractC0713c.alpha(2);
        if (f11 >= bravo3) {
        }
        if (bravo3 <= alpha3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(alpha3);
        int i3422 = floatToRawIntBits322 >>> 31;
        i15 = (floatToRawIntBits322 >>> 23) & 255;
        int i3522 = 8388607 & floatToRawIntBits322;
        if (i15 == 255) {
        }
    }

    public static final Z.c bronze(RectF rectF) {
        return new Z.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final long charlie(int i4) {
        long j5 = i4 << 32;
        int i5 = C0366t.lima;
        return j5;
    }

    public static final PorterDuff.Mode coral(int i4) {
        if (i4 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i4 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i4 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i4 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i4 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i4 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i4 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i4 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i4 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i4 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i4 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i4 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (i4 == 13) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static final void crimson(List list, ArrayList arrayList) {
        if (arrayList == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() == arrayList.size()) {
        } else {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final int cyan(float f5, float[] fArr, int i4) {
        float f10 = 0.0f;
        if (f5 >= 0.0f) {
            f10 = f5;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (Math.abs(f10 - f5) > 1.05E-6f) {
            f10 = Float.NaN;
        }
        fArr[i4] = f10;
        return !Float.isNaN(f10) ? 1 : 0;
    }

    public static final long delta(long j5) {
        long j6 = j5 << 32;
        int i4 = C0366t.lima;
        return j6;
    }

    public static long echo(int i4, int i5, int i10) {
        return charlie(((i4 & 255) << 16) | ShapeBuilder.DEFAULT_SHAPE_COLOR | ((i5 & 255) << 8) | (i10 & 255));
    }

    public static C0352f foxtrot(int i4, int i5, int i10, int i11) {
        Bitmap createBitmap;
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        b0.q qVar = b0.d.echo;
        Bitmap.Config black = black(i10);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i4, i5, black(i10), true, AbstractC0370x.alpha(qVar));
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i4, i5, black);
            createBitmap.setHasAlpha(true);
        }
        return new C0352f(createBitmap);
    }

    public static final Be.e golf() {
        return new Be.e(new Paint(7));
    }

    public static final long hotel(float f5, float f10) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
        int i4 = aw.charlie;
        return floatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long india(float f5, float f10, float f11, float f12, AbstractC0713c abstractC0713c) {
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 31;
        if (abstractC0713c.charlie()) {
            long j5 = ((((((int) ((f12 * 255.0f) + 0.5f)) << 24) | (((int) ((f5 * 255.0f) + 0.5f)) << 16)) | (((int) ((f10 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f11) + 0.5f))) << 32;
            int i18 = C0366t.lima;
            return j5;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f5);
        int i19 = floatToRawIntBits >>> 31;
        int i20 = (floatToRawIntBits >>> 23) & 255;
        int i21 = floatToRawIntBits & 8388607;
        int i22 = 512;
        int i23 = 0;
        if (i20 == 255) {
            if (i21 != 0) {
                i5 = 512;
            } else {
                i5 = 0;
            }
            i4 = 31;
        } else {
            i4 = i20 - 112;
            if (i4 >= 31) {
                i4 = 49;
                i5 = 0;
            } else if (i4 <= 0) {
                if (i4 >= -10) {
                    int i24 = (i21 | 8388608) >> (1 - i4);
                    if ((i24 & 4096) != 0) {
                        i24 += 8192;
                    }
                    i5 = i24 >> 13;
                    i4 = 0;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
            } else {
                int i25 = i21 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i10 = (((i4 << 10) | i25) + 1) | (i19 << 15);
                    short s3 = (short) i10;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f10);
                    int i26 = floatToRawIntBits2 >>> 31;
                    i11 = (floatToRawIntBits2 >>> 23) & 255;
                    int i27 = floatToRawIntBits2 & 8388607;
                    if (i11 != 255) {
                        if (i27 != 0) {
                            i13 = 512;
                        } else {
                            i13 = 0;
                        }
                        i12 = 31;
                    } else {
                        i12 = i11 - 112;
                        if (i12 >= 31) {
                            i12 = 49;
                            i13 = 0;
                        } else if (i12 <= 0) {
                            if (i12 >= -10) {
                                int i28 = (i27 | 8388608) >> (1 - i12);
                                if ((i28 & 4096) != 0) {
                                    i28 += 8192;
                                }
                                i13 = i28 >> 13;
                                i12 = 0;
                            } else {
                                i13 = 0;
                                i12 = 0;
                            }
                        } else {
                            int i29 = i27 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i14 = (((i12 << 10) | i29) + 1) | (i26 << 15);
                                short s9 = (short) i14;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f11);
                                int i30 = floatToRawIntBits3 >>> 31;
                                i15 = (floatToRawIntBits3 >>> 23) & 255;
                                int i31 = 8388607 & floatToRawIntBits3;
                                if (i15 == 255) {
                                    if (i31 == 0) {
                                        i22 = 0;
                                    }
                                    i23 = i22;
                                } else {
                                    int i32 = i15 - 112;
                                    if (i32 >= 31) {
                                        i17 = 49;
                                    } else if (i32 <= 0) {
                                        if (i32 >= -10) {
                                            int i33 = (i31 | 8388608) >> (1 - i32);
                                            if ((i33 & 4096) != 0) {
                                                i33 += 8192;
                                            }
                                            i23 = i33 >> 13;
                                            i17 = 0;
                                        } else {
                                            i17 = 0;
                                        }
                                    } else {
                                        i23 = i31 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i16 = (((i32 << 10) | i23) + 1) | (i30 << 15);
                                            long max = ((((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s9 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((short) i16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | (abstractC0713c.charlie & 63);
                                            int i34 = C0366t.lima;
                                            return max;
                                        }
                                        i17 = i32;
                                    }
                                }
                                i16 = (i17 << 10) | (i30 << 15) | i23;
                                long max2 = ((((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s9 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((short) i16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | (abstractC0713c.charlie & 63);
                                int i342 = C0366t.lima;
                                return max2;
                            }
                            i13 = i29;
                        }
                    }
                    i14 = i13 | (i26 << 15) | (i12 << 10);
                    short s92 = (short) i14;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f11);
                    int i302 = floatToRawIntBits32 >>> 31;
                    i15 = (floatToRawIntBits32 >>> 23) & 255;
                    int i312 = 8388607 & floatToRawIntBits32;
                    if (i15 == 255) {
                    }
                    i16 = (i17 << 10) | (i302 << 15) | i23;
                    long max22 = ((((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s92 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((short) i16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | (abstractC0713c.charlie & 63);
                    int i3422 = C0366t.lima;
                    return max22;
                }
                i5 = i25;
            }
        }
        i10 = i5 | (i19 << 15) | (i4 << 10);
        short s32 = (short) i10;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f10);
        int i262 = floatToRawIntBits22 >>> 31;
        i11 = (floatToRawIntBits22 >>> 23) & 255;
        int i272 = floatToRawIntBits22 & 8388607;
        if (i11 != 255) {
        }
        i14 = i13 | (i262 << 15) | (i12 << 10);
        short s922 = (short) i14;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f11);
        int i3022 = floatToRawIntBits322 >>> 31;
        i15 = (floatToRawIntBits322 >>> 23) & 255;
        int i3122 = 8388607 & floatToRawIntBits322;
        if (i15 == 255) {
        }
        i16 = (i17 << 10) | (i3022 << 15) | i23;
        long max222 = ((((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s32 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s922 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((short) i16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | (abstractC0713c.charlie & 63);
        int i34222 = C0366t.lima;
        return max222;
    }

    public static final Bitmap juliet(C0352f c0352f) {
        if (c0352f instanceof C0352f) {
            return c0352f.alpha;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long kilo(long j5, long j6) {
        float f5;
        float f10;
        long alpha2 = C0366t.alpha(j5, C0366t.foxtrot(j6));
        float delta2 = C0366t.delta(j6);
        float delta3 = C0366t.delta(alpha2);
        float f11 = 1.0f - delta3;
        float f12 = (delta2 * f11) + delta3;
        float hotel = C0366t.hotel(alpha2);
        float hotel2 = C0366t.hotel(j6);
        float f13 = 0.0f;
        if (f12 == 0.0f) {
            f5 = 0.0f;
        } else {
            f5 = (((hotel2 * delta2) * f11) + (hotel * delta3)) / f12;
        }
        float golf = C0366t.golf(alpha2);
        float golf2 = C0366t.golf(j6);
        if (f12 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((golf2 * delta2) * f11) + (golf * delta3)) / f12;
        }
        float echo = C0366t.echo(alpha2);
        float echo2 = C0366t.echo(j6);
        if (f12 != 0.0f) {
            f13 = (((echo2 * delta2) * f11) + (echo * delta3)) / f12;
        }
        return india(f5, f10, f13, f12, C0366t.foxtrot(j6));
    }

    public static final int lima(List list) {
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int ivory = CollectionsKt.ivory(list);
        for (int i5 = 1; i5 < ivory; i5++) {
            if (C0366t.delta(((C0366t) list.get(i5)).alpha) == 0.0f) {
                i4++;
            }
        }
        return i4;
    }

    public static void mike(c0.d dVar, ao aoVar, long j5) {
        c0.g gVar = c0.g.alpha;
        if (aoVar instanceof ai) {
            dVar.emerald(j5, (Float.floatToRawIntBits(r12.alpha) << 32) | (Float.floatToRawIntBits(r12.bravo) & 4294967295L), whiskey(((ai) aoVar).echo), 1.0f, gVar, 3);
            return;
        }
        if (aoVar instanceof aj) {
            aj ajVar = (aj) aoVar;
            C0354h c0354h = ajVar.foxtrot;
            if (c0354h != null) {
                dVar.echo(c0354h, j5, 1.0f, gVar);
                return;
            }
            Z.d dVar2 = ajVar.echo;
            float intBitsToFloat = Float.intBitsToFloat((int) (dVar2.hotel >> 32));
            long floatToRawIntBits = (Float.floatToRawIntBits(dVar2.bravo) & 4294967295L) | (Float.floatToRawIntBits(dVar2.alpha) << 32);
            float bravo2 = dVar2.bravo();
            float alpha2 = dVar2.alpha();
            dVar.zulu(j5, floatToRawIntBits, (Float.floatToRawIntBits(bravo2) << 32) | (Float.floatToRawIntBits(alpha2) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), gVar);
            return;
        }
        if (aoVar instanceof ah) {
            dVar.echo(((ah) aoVar).echo, j5, 1.0f, gVar);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void november(Canvas canvas, boolean z2) {
        Method method;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            if (z2) {
                AbstractC0340a.foxtrot(canvas);
                return;
            } else {
                AbstractC0340a.kilo(canvas);
                return;
            }
        }
        if (!delta) {
            try {
                if (i4 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    bravo = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    charlie = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    bravo = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    charlie = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = bravo;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = charlie;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            delta = true;
        }
        if (z2) {
            try {
                Method method4 = bravo;
                if (method4 != null) {
                    Intrinsics.checkNotNull(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z2 && (method = charlie) != null) {
            Intrinsics.checkNotNull(method);
            method.invoke(canvas, null);
        }
    }

    public static final boolean papa(float[] fArr) {
        if (fArr.length < 16 || fArr[0] != 1.0f || fArr[1] != 0.0f || fArr[2] != 0.0f || fArr[3] != 0.0f || fArr[4] != 0.0f || fArr[5] != 1.0f || fArr[6] != 0.0f || fArr[7] != 0.0f || fArr[8] != 0.0f || fArr[9] != 0.0f || fArr[10] != 1.0f || fArr[11] != 0.0f || fArr[12] != 0.0f || fArr[13] != 0.0f || fArr[14] != 0.0f || fArr[15] != 1.0f) {
            return false;
        }
        return true;
    }

    public static final long quebec(long j5, long j6, float f5) {
        b0.l lVar = b0.d.xray;
        long alpha2 = C0366t.alpha(j5, lVar);
        long alpha3 = C0366t.alpha(j6, lVar);
        float delta2 = C0366t.delta(alpha2);
        float hotel = C0366t.hotel(alpha2);
        float golf = C0366t.golf(alpha2);
        float echo = C0366t.echo(alpha2);
        float delta3 = C0366t.delta(alpha3);
        float hotel2 = C0366t.hotel(alpha3);
        float golf2 = C0366t.golf(alpha3);
        float echo2 = C0366t.echo(alpha3);
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        return C0366t.alpha(india(AbstractC2797v7.echo(hotel, hotel2, f5), AbstractC2797v7.echo(golf, golf2, f5), AbstractC2797v7.echo(echo, echo2, f5), AbstractC2797v7.echo(delta2, delta3, f5), lVar), C0366t.foxtrot(j6));
    }

    public static final float romeo(long j5) {
        AbstractC0713c foxtrot = C0366t.foxtrot(j5);
        if (!AbstractC0712b.alpha(foxtrot.bravo, AbstractC0712b.alpha)) {
            AbstractC0345ae.alpha("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC0712b.bravo(foxtrot.bravo)));
        }
        double hotel = C0366t.hotel(j5);
        b0.m mVar = ((b0.q) foxtrot).papa;
        double delta2 = mVar.delta(hotel);
        float delta3 = (float) ((mVar.delta(C0366t.echo(j5)) * 0.0722d) + (mVar.delta(C0366t.golf(j5)) * 0.7152d) + (delta2 * 0.2126d));
        if (delta3 < 0.0f) {
            delta3 = 0.0f;
        }
        if (delta3 > 1.0f) {
            return 1.0f;
        }
        return delta3;
    }

    public static final int[] sierra(int i4, List list) {
        int i5;
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i10 < size) {
                iArr[i10] = beige(((C0366t) list.get(i10)).alpha);
                i10++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i4];
        int ivory = CollectionsKt.ivory(list);
        int size2 = list.size();
        int i11 = 0;
        while (i10 < size2) {
            long j5 = ((C0366t) list.get(i10)).alpha;
            if (C0366t.delta(j5) == 0.0f) {
                if (i10 == 0) {
                    i5 = i11 + 1;
                    iArr2[i11] = beige(C0366t.bravo(0.0f, ((C0366t) list.get(1)).alpha));
                } else if (i10 == ivory) {
                    i5 = i11 + 1;
                    iArr2[i11] = beige(C0366t.bravo(0.0f, ((C0366t) list.get(i10 - 1)).alpha));
                } else {
                    int i12 = i11 + 1;
                    iArr2[i11] = beige(C0366t.bravo(0.0f, ((C0366t) list.get(i10 - 1)).alpha));
                    i11 += 2;
                    iArr2[i12] = beige(C0366t.bravo(0.0f, ((C0366t) list.get(i10 + 1)).alpha));
                }
                i11 = i5;
            } else {
                iArr2[i11] = beige(j5);
                i11++;
            }
            i10++;
        }
        return iArr2;
    }

    public static final float[] tango(ArrayList arrayList, List list, int i4) {
        float f5;
        float f10;
        float ivory;
        if (i4 == 0) {
            if (arrayList != null) {
                return CollectionsKt.w(arrayList);
            }
            return null;
        }
        float[] fArr = new float[list.size() + i4];
        if (arrayList != null) {
            f5 = ((Number) arrayList.get(0)).floatValue();
        } else {
            f5 = 0.0f;
        }
        fArr[0] = f5;
        int ivory2 = CollectionsKt.ivory(list);
        int i5 = 1;
        for (int i10 = 1; i10 < ivory2; i10++) {
            long j5 = ((C0366t) list.get(i10)).alpha;
            if (arrayList != null) {
                ivory = ((Number) arrayList.get(i10)).floatValue();
            } else {
                ivory = i10 / CollectionsKt.ivory(list);
            }
            int i11 = i5 + 1;
            fArr[i5] = ivory;
            if (C0366t.delta(j5) == 0.0f) {
                i5 += 2;
                fArr[i11] = ivory;
            } else {
                i5 = i11;
            }
        }
        if (arrayList != null) {
            f10 = ((Number) arrayList.get(CollectionsKt.ivory(list))).floatValue();
        } else {
            f10 = 1.0f;
        }
        fArr[i5] = f10;
        return fArr;
    }

    public static final void uniform(Matrix matrix, float[] fArr) {
        float f5 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[15];
        fArr[0] = f5;
        fArr[1] = f13;
        fArr[2] = f18;
        fArr[3] = f10;
        fArr[4] = f14;
        fArr[5] = f19;
        fArr[6] = f12;
        fArr[7] = f16;
        fArr[8] = f20;
        matrix.setValues(fArr);
        fArr[0] = f5;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
        fArr[4] = f13;
        fArr[5] = f14;
        fArr[6] = f15;
        fArr[7] = f16;
        fArr[8] = f17;
    }

    public static final void victor(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f5 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        fArr[0] = f5;
        fArr[1] = f12;
        fArr[2] = 0.0f;
        fArr[3] = f15;
        fArr[4] = f10;
        fArr[5] = f13;
        fArr[6] = 0.0f;
        fArr[7] = f16;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f11;
        fArr[13] = f14;
        fArr[14] = 0.0f;
        fArr[15] = f17;
    }

    public static final long whiskey(Z.c cVar) {
        float f5 = cVar.charlie - cVar.alpha;
        float f10 = cVar.delta - cVar.bravo;
        return (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }

    public static final BlendMode xray(int i4) {
        if (i4 == 0) {
            return E0.d.delta();
        }
        if (i4 == 1) {
            return E0.d.xray();
        }
        if (i4 == 2) {
            return AbstractC0340a.zulu();
        }
        if (i4 == 3) {
            return AbstractC0340a.yankee();
        }
        if (i4 == 4) {
            return AbstractC0340a.amber();
        }
        if (i4 == 5) {
            return AbstractC0340a.azure();
        }
        if (i4 == 6) {
            return AbstractC0340a.beige();
        }
        if (i4 == 7) {
            return AbstractC0340a.black();
        }
        if (i4 == 8) {
            return AbstractC0340a.mike();
        }
        if (i4 == 9) {
            return AbstractC0340a.november();
        }
        if (i4 == 10) {
            return AbstractC0340a.whiskey();
        }
        if (i4 == 11) {
            return AbstractC0340a.oscar();
        }
        if (i4 == 12) {
            return AbstractC0340a.papa();
        }
        if (i4 == 13) {
            return AbstractC0340a.quebec();
        }
        if (i4 == 14) {
            return AbstractC0340a.romeo();
        }
        if (i4 == 15) {
            return AbstractC0340a.sierra();
        }
        if (i4 == 16) {
            return AbstractC0340a.tango();
        }
        if (i4 == 17) {
            return AbstractC0340a.uniform();
        }
        if (i4 == 18) {
            return AbstractC0340a.victor();
        }
        if (i4 == 19) {
            return E0.d.whiskey();
        }
        if (i4 == 20) {
            return E0.d.yankee();
        }
        if (i4 == 21) {
            return E0.d.zulu();
        }
        if (i4 == 22) {
            return E0.d.amber();
        }
        if (i4 == 23) {
            return E0.d.azure();
        }
        if (i4 == 24) {
            return E0.d.beige();
        }
        if (i4 == 25) {
            return E0.d.black();
        }
        if (i4 == 26) {
            return AbstractC0340a.bravo();
        }
        if (i4 == 27) {
            return AbstractC0340a.juliet();
        }
        if (i4 == 28) {
            return AbstractC0340a.xray();
        }
        return AbstractC0340a.yankee();
    }

    public static final Rect yankee(Q0.l lVar) {
        return new Rect(lVar.alpha, lVar.bravo, lVar.charlie, lVar.delta);
    }

    public static final Rect zulu(Z.c cVar) {
        return new Rect((int) cVar.alpha, (int) cVar.bravo, (int) cVar.charlie, (int) cVar.delta);
    }

    public abstract Z.c oscar();
}
