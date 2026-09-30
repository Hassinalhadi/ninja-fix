package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import delivery.samurai.android.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.widget.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0487w0 {
    public static C0487w0 india;
    public WeakHashMap alpha;
    public bv.aw bravo;
    public bv.ax charlie;
    public final WeakHashMap delta = new WeakHashMap(0);
    public TypedValue echo;
    public boolean foxtrot;
    public av.ao golf;
    public static final PorterDuff.Mode hotel = PorterDuff.Mode.SRC_IN;
    public static final C0483u0 juliet = new bv.w(6);

    public static synchronized C0487w0 delta() {
        C0487w0 c0487w0;
        synchronized (C0487w0.class) {
            try {
                if (india == null) {
                    C0487w0 c0487w02 = new C0487w0();
                    india = c0487w02;
                    juliet(c0487w02);
                }
                c0487w0 = india;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0487w0;
    }

    public static synchronized PorterDuffColorFilter hotel(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0487w0.class) {
            C0483u0 c0483u0 = juliet;
            c0483u0.getClass();
            int i5 = (31 + i4) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c0483u0.charlie(Integer.valueOf(mode.hashCode() + i5));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i4, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void juliet(C0487w0 c0487w0) {
        if (Build.VERSION.SDK_INT < 24) {
            c0487w0.alpha("vector", new C0485v0(3));
            c0487w0.alpha("animated-vector", new C0485v0(2));
            c0487w0.alpha("animated-selector", new C0485v0(1));
            c0487w0.alpha("drawable", new C0485v0(0));
        }
    }

    public final void alpha(String str, C0485v0 c0485v0) {
        if (this.bravo == null) {
            this.bravo = new bv.aw(0);
        }
        this.bravo.put(str, c0485v0);
    }

    public final synchronized void bravo(Context context, long j5, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                bv.u uVar = (bv.u) this.delta.get(context);
                if (uVar == null) {
                    uVar = new bv.u((Object) null);
                    this.delta.put(context, uVar);
                }
                uVar.hotel(j5, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable charlie(int i4, Context context) {
        if (this.echo == null) {
            this.echo = new TypedValue();
        }
        TypedValue typedValue = this.echo;
        context.getResources().getValue(i4, typedValue, true);
        long j5 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable echo = echo(context, j5);
        if (echo != null) {
            return echo;
        }
        LayerDrawable layerDrawable = null;
        if (this.golf != null) {
            if (i4 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{foxtrot(R.drawable.abc_cab_background_internal_bg, context), foxtrot(R.drawable.abc_cab_background_top_mtrl_alpha, context)});
            } else if (i4 == R.drawable.abc_ratingbar_material) {
                layerDrawable = av.ao.whiskey(this, context, R.dimen.abc_star_big);
            } else if (i4 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = av.ao.whiskey(this, context, R.dimen.abc_star_medium);
            } else if (i4 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = av.ao.whiskey(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            bravo(context, j5, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable echo(Context context, long j5) {
        bv.u uVar = (bv.u) this.delta.get(context);
        if (uVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) uVar.delta(j5);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            uVar.india(j5);
        }
        return null;
    }

    public final synchronized Drawable foxtrot(int i4, Context context) {
        return golf(context, i4, false);
    }

    public final synchronized Drawable golf(Context context, int i4, boolean z2) {
        Drawable kilo;
        try {
            if (!this.foxtrot) {
                this.foxtrot = true;
                Drawable foxtrot = foxtrot(R.drawable.abc_vector_test, context);
                if (foxtrot == null || (!(foxtrot instanceof androidx.vectordrawable.graphics.drawable.p) && !"android.graphics.drawable.VectorDrawable".equals(foxtrot.getClass().getName()))) {
                    this.foxtrot = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            kilo = kilo(i4, context);
            if (kilo == null) {
                kilo = charlie(i4, context);
            }
            if (kilo == null) {
                kilo = context.getDrawable(i4);
            }
            if (kilo != null) {
                kilo = november(context, i4, z2, kilo);
            }
            if (kilo != null) {
                S.alpha(kilo);
            }
        } catch (Throwable th) {
            throw th;
        }
        return kilo;
    }

    public final synchronized ColorStateList india(int i4, Context context) {
        ColorStateList colorStateList;
        bv.ax axVar;
        WeakHashMap weakHashMap = this.alpha;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (axVar = (bv.ax) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) axVar.delta(i4);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            av.ao aoVar = this.golf;
            if (aoVar != null) {
                colorStateList2 = aoVar.zulu(i4, context);
            }
            if (colorStateList2 != null) {
                if (this.alpha == null) {
                    this.alpha = new WeakHashMap();
                }
                bv.ax axVar2 = (bv.ax) this.alpha.get(context);
                if (axVar2 == null) {
                    axVar2 = new bv.ax(0);
                    this.alpha.put(context, axVar2);
                }
                axVar2.alpha(i4, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable kilo(int i4, Context context) {
        int next;
        bv.aw awVar = this.bravo;
        if (awVar != null && !awVar.isEmpty()) {
            bv.ax axVar = this.charlie;
            if (axVar != null) {
                String str = (String) axVar.delta(i4);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null && this.bravo.get(str) == null) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                this.charlie = new bv.ax(0);
            }
            if (this.echo == null) {
                this.echo = new TypedValue();
            }
            TypedValue typedValue = this.echo;
            Resources resources = context.getResources();
            resources.getValue(i4, typedValue, true);
            long j5 = (typedValue.assetCookie << 32) | typedValue.data;
            Drawable echo = echo(context, j5);
            if (echo != null) {
                return echo;
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xml = resources.getXml(i4);
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        String name = xml.getName();
                        this.charlie.alpha(i4, name);
                        C0485v0 c0485v0 = (C0485v0) this.bravo.get(name);
                        if (c0485v0 != null) {
                            echo = c0485v0.alpha(context, xml, asAttributeSet, context.getTheme());
                        }
                        if (echo != null) {
                            echo.setChangingConfigurations(typedValue.changingConfigurations);
                            bravo(context, j5, echo);
                        }
                    } else {
                        throw new XmlPullParserException("No start tag found");
                    }
                } catch (Exception e) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
                }
            }
            if (echo == null) {
                this.charlie.alpha(i4, "appcompat_skip_skip");
            }
            return echo;
        }
        return null;
    }

    public final synchronized void lima(Context context) {
        bv.u uVar = (bv.u) this.delta.get(context);
        if (uVar != null) {
            uVar.bravo();
        }
    }

    public final synchronized void mike(av.ao aoVar) {
        this.golf = aoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable november(Context context, int i4, boolean z2, Drawable drawable) {
        int i5;
        boolean z10;
        int round;
        ColorStateList india2 = india(i4, context);
        PorterDuff.Mode mode = null;
        if (india2 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(india2);
            if (this.golf != null && i4 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (this.golf != null) {
            if (i4 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int charlie = S0.charlie(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode2 = C0488x.bravo;
                av.ao.emerald(findDrawableByLayerId, charlie, mode2);
                av.ao.emerald(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), S0.charlie(R.attr.colorControlNormal, context), mode2);
                av.ao.emerald(layerDrawable.findDrawableByLayerId(android.R.id.progress), S0.charlie(R.attr.colorControlActivated, context), mode2);
                return drawable;
            }
            if (i4 == R.drawable.abc_ratingbar_material || i4 == R.drawable.abc_ratingbar_indicator_material || i4 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int bravo = S0.bravo(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode3 = C0488x.bravo;
                av.ao.emerald(findDrawableByLayerId2, bravo, mode3);
                av.ao.emerald(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), S0.charlie(R.attr.colorControlActivated, context), mode3);
                av.ao.emerald(layerDrawable2.findDrawableByLayerId(android.R.id.progress), S0.charlie(R.attr.colorControlActivated, context), mode3);
                return drawable;
            }
        }
        av.ao aoVar = this.golf;
        boolean z11 = false;
        if (aoVar != null) {
            PorterDuff.Mode mode4 = C0488x.bravo;
            if (av.ao.hotel(i4, (int[]) aoVar.alpha)) {
                i5 = R.attr.colorControlNormal;
            } else if (av.ao.hotel(i4, (int[]) aoVar.red)) {
                i5 = R.attr.colorControlActivated;
            } else {
                if (av.ao.hotel(i4, (int[]) aoVar.silver)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i4 == R.drawable.abc_list_divider_mtrl_alpha) {
                    round = Math.round(40.8f);
                    i5 = 16842800;
                    z10 = true;
                    if (z10) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(C0488x.charlie(S0.charlie(i5, context), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z11 = true;
                    }
                } else if (i4 != R.drawable.abc_dialog_material_background) {
                    i5 = 0;
                    z10 = false;
                    round = -1;
                    if (z10) {
                    }
                }
                i5 = 16842801;
            }
            z10 = true;
            round = -1;
            if (z10) {
            }
        }
        if (!z11 && z2) {
            return null;
        }
        return drawable;
    }
}
