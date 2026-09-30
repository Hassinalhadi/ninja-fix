package j1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.zendesk.service.HttpConstants;
import i1.C1884e;
import i1.C1885f;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import s6.D5;

/* loaded from: classes3.dex */
public class l extends D5 {
    public static Font juliet(FontFamily fontFamily, int i4) {
        int i5;
        int i10;
        if ((i4 & 1) != 0) {
            i5 = 700;
        } else {
            i5 = HttpConstants.HTTP_BAD_REQUEST;
        }
        if ((i4 & 2) != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        FontStyle fontStyle = new FontStyle(i5, i10);
        Font font = fontFamily.getFont(0);
        int mike = mike(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int mike2 = mike(fontStyle, font2.getStyle());
            if (mike2 < mike) {
                font = font2;
                mike = mike2;
            }
        }
        return font;
    }

    public static int mike(FontStyle fontStyle, FontStyle fontStyle2) {
        int i4;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i4 = 0;
        } else {
            i4 = 2;
        }
        return abs + i4;
    }

    @Override // s6.D5
    public final Typeface alpha(Context context, C1884e c1884e, Resources resources, int i4) {
        try {
            FontFamily.Builder builder = null;
            for (C1885f c1885f : c1884e.alpha) {
                try {
                    Font build = new Font.Builder(resources, c1885f.foxtrot).setWeight(c1885f.bravo).setSlant(c1885f.charlie ? 1 : 0).setTtcIndex(c1885f.echo).setFontVariationSettings(c1885f.delta).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(juliet(build2, i4).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // s6.D5
    public final Typeface bravo(Context context, p1.h[] hVarArr, int i4) {
        try {
            FontFamily kilo = kilo(hVarArr, context.getContentResolver());
            if (kilo == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(kilo).setStyle(juliet(kilo, i4).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // s6.D5
    public final Typeface charlie(int i4, Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily kilo = kilo((p1.h[]) list.get(0), contentResolver);
            if (kilo == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(kilo);
            for (int i5 = 1; i5 < list.size(); i5++) {
                FontFamily kilo2 = kilo((p1.h[]) list.get(i5), contentResolver);
                if (kilo2 != null) {
                    customFallbackBuilder.addCustomFallback(kilo2);
                }
            }
            return customFallbackBuilder.setStyle(juliet(kilo, i4).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // s6.D5
    public final Typeface delta(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // s6.D5
    public final Typeface echo(Context context, Resources resources, int i4, String str, int i5) {
        try {
            Font build = new Font.Builder(resources, i4).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // s6.D5
    public final p1.h hotel(p1.h[] hVarArr, int i4) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final FontFamily kilo(p1.h[] hVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (p1.h hVar : hVarArr) {
            if (Objects.equals(hVar.alpha.getScheme(), "systemfont")) {
                font = lima(hVar);
            } else {
                try {
                    Uri uri = hVar.alpha;
                    str = hVar.echo;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(hVar.charlie).setSlant(hVar.delta ? 1 : 0).setTtcIndex(hVar.bravo);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font lima(p1.h hVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
