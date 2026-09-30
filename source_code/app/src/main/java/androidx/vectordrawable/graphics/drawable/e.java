package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import bv.aw;
import i1.AbstractC1881b;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s6.Q5;

/* loaded from: classes3.dex */
public final class e extends g implements Animatable {
    public static final /* synthetic */ int yellow = 0;
    public final Context red;
    public O6.b silver = null;
    public ArrayList teal = null;
    public final al.f white = new al.f(1, this);
    public final d purple = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.Drawable$ConstantState, androidx.vectordrawable.graphics.drawable.d] */
    public e(Context context) {
        this.red = context;
    }

    public final void alpha(c cVar) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(cVar.getPlatformCallback());
            return;
        }
        if (cVar != null) {
            if (this.teal == null) {
                this.teal = new ArrayList();
            }
            if (this.teal.contains(cVar)) {
                return;
            }
            this.teal.add(cVar);
            if (this.silver == null) {
                this.silver = new O6.b(4, this);
            }
            this.purple.bravo.addListener(this.silver);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.purple;
        dVar.alpha.draw(canvas);
        if (dVar.bravo.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.purple.alpha.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.purple.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.purple.alpha.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.alpha != null && Build.VERSION.SDK_INT >= 24) {
            return new P3.b(2, this.alpha.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.purple.alpha.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.purple.alpha.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.purple.alpha.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0130, code lost:
    
        if (r8.bravo != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0132, code lost:
    
        r8.bravo = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0139, code lost:
    
        r8.bravo.playTogether(r8.charlie);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0140, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r7v13, types: [bv.e, bv.aw] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser animation;
        Animator alpha;
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int i4 = 1;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            d dVar = this.purple;
            if (eventType == i4 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser xmlResourceParser = null;
                if ("animated-vector".equals(name)) {
                    TypedArray hotel = AbstractC1881b.hotel(resources, theme, attributeSet, a.echo);
                    int resourceId = hotel.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p alpha2 = p.alpha(resourceId, theme, resources);
                        alpha2.white = false;
                        alpha2.setCallback(this.white);
                        p pVar = dVar.alpha;
                        if (pVar != null) {
                            pVar.setCallback(null);
                        }
                        dVar.alpha = alpha2;
                    }
                    hotel.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.foxtrot);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(i4, 0);
                    if (resourceId2 != 0) {
                        Context context = this.red;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                alpha = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        animation = resources2.getAnimation(resourceId2);
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (IOException e) {
                                    e = e;
                                } catch (XmlPullParserException e4) {
                                    e = e4;
                                }
                                try {
                                    alpha = a.alpha(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                    animation.close();
                                } catch (IOException e5) {
                                    e = e5;
                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException.initCause(e);
                                    throw notFoundException;
                                } catch (XmlPullParserException e10) {
                                    e = e10;
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException2.initCause(e);
                                    throw notFoundException2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = animation;
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            }
                            alpha.setTarget(dVar.alpha.purple.bravo.oscar.get(string));
                            if (dVar.charlie == null) {
                                dVar.charlie = new ArrayList();
                                dVar.delta = new aw(0);
                            }
                            dVar.charlie.add(alpha);
                            dVar.delta.put(alpha, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
            i4 = 1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.purple.alpha.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.purple.bravo.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.purple.alpha.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.purple.alpha.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        return this.purple.alpha.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.purple.alpha.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else {
            this.purple.alpha.setAlpha(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.purple.alpha.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.purple.alpha.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            Q5.india(drawable, i4);
        } else {
            this.purple.alpha.setTint(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.purple.alpha.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.purple.alpha.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.setVisible(z2, z10);
        }
        this.purple.alpha.setVisible(z2, z10);
        return super.setVisible(z2, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.purple;
        if (dVar.bravo.isStarted()) {
            return;
        }
        dVar.bravo.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.purple.bravo.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
