package i1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.lifecycle.RunnableC0643m;
import bv.w;
import j1.AbstractC1933g;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public abstract class k {
    public static final ThreadLocal alpha = new ThreadLocal();
    public static final WeakHashMap bravo = new WeakHashMap(0);
    public static final Object charlie = new Object();

    public static void alpha(i iVar, int i4, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (charlie) {
            try {
                WeakHashMap weakHashMap = bravo;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(iVar, sparseArray);
                }
                sparseArray.append(i4, new h(colorStateList, iVar.alpha.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface bravo(Context context, int i4, TypedValue typedValue, int i5, AbstractC1881b abstractC1881b, boolean z2, boolean z10) {
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (!charSequence2.startsWith("res/")) {
                if (abstractC1881b != null) {
                    abstractC1881b.alpha(-3);
                }
            } else {
                int i10 = typedValue.assetCookie;
                w wVar = AbstractC1933g.bravo;
                Typeface typeface2 = (Typeface) wVar.charlie(AbstractC1933g.bravo(resources, i4, charSequence2, i10, i5));
                if (typeface2 != null) {
                    if (abstractC1881b != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0643m(23, abstractC1881b, typeface2));
                    }
                    typeface = typeface2;
                } else if (!z10) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            InterfaceC1883d kilo = AbstractC1881b.kilo(resources.getXml(i4), resources);
                            if (kilo == null) {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                if (abstractC1881b != null) {
                                    abstractC1881b.alpha(-3);
                                }
                            } else {
                                typeface = AbstractC1933g.alpha(context, kilo, resources, i4, charSequence2, typedValue.assetCookie, i5, abstractC1881b, z2);
                            }
                        } else {
                            int i11 = typedValue.assetCookie;
                            Typeface echo = AbstractC1933g.alpha.echo(context, resources, i4, charSequence2, i5);
                            if (echo != null) {
                                wVar.delta(AbstractC1933g.bravo(resources, i4, charSequence2, i11, i5), echo);
                            }
                            if (abstractC1881b != null) {
                                if (echo != null) {
                                    new Handler(Looper.getMainLooper()).post(new RunnableC0643m(23, abstractC1881b, echo));
                                } else {
                                    abstractC1881b.alpha(-3);
                                }
                            }
                            typeface = echo;
                        }
                    } catch (IOException e) {
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                        if (abstractC1881b != null) {
                            abstractC1881b.alpha(-3);
                        }
                        if (typeface != null) {
                        }
                        return typeface;
                    } catch (XmlPullParserException e4) {
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e4);
                        if (abstractC1881b != null) {
                        }
                        if (typeface != null) {
                        }
                        return typeface;
                    }
                }
            }
            if (typeface != null && abstractC1881b == null && !z10) {
                throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i4) + " could not be retrieved.");
            }
            return typeface;
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i4) + "\" (" + Integer.toHexString(i4) + ") is not a Font: " + typedValue);
    }
}
