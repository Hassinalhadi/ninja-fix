package an;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import ao.o;
import ao.s;
import d.S0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l1.InterfaceMenuItemC2052a;

/* loaded from: classes3.dex */
public final class h {
    public final Menu alpha;
    public CharSequence amber;
    public CharSequence azure;
    public final /* synthetic */ i blue;
    public boolean hotel;
    public int india;
    public int juliet;
    public CharSequence kilo;
    public CharSequence lima;
    public int mike;
    public char november;
    public int oscar;
    public char papa;
    public int quebec;
    public int romeo;
    public boolean sierra;
    public boolean tango;
    public boolean uniform;
    public int victor;
    public int whiskey;
    public String xray;
    public String yankee;
    public o zulu;
    public ColorStateList beige = null;
    public PorterDuff.Mode black = null;
    public int bravo = 0;
    public int charlie = 0;
    public int delta = 0;
    public int echo = 0;
    public boolean foxtrot = true;
    public boolean golf = true;

    public h(i iVar, Menu menu) {
        this.blue = iVar;
        this.alpha = menu;
    }

    public final Object alpha(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.blue.charlie.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.MenuItem$OnMenuItemClickListener, java.lang.Object, an.g] */
    public final void bravo(MenuItem menuItem) {
        boolean z2;
        MenuItem enabled = menuItem.setChecked(this.sierra).setVisible(this.tango).setEnabled(this.uniform);
        boolean z10 = false;
        if (this.romeo >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        enabled.setCheckable(z2).setTitleCondensed(this.lima).setIcon(this.mike);
        int i4 = this.victor;
        if (i4 >= 0) {
            menuItem.setShowAsAction(i4);
        }
        String str = this.yankee;
        i iVar = this.blue;
        if (str != null) {
            if (!iVar.charlie.isRestricted()) {
                if (iVar.delta == null) {
                    iVar.delta = i.alpha(iVar.charlie);
                }
                Object obj = iVar.delta;
                String str2 = this.yankee;
                ?? obj2 = new Object();
                obj2.alpha = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.bravo = cls.getMethod(str2, g.charlie);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e) {
                    StringBuilder victor = Q0.c.victor("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    victor.append(cls.getName());
                    InflateException inflateException = new InflateException(victor.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.romeo >= 2) {
            if (menuItem instanceof ao.n) {
                ((ao.n) menuItem).foxtrot(true);
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                try {
                    Method method = sVar.teal;
                    InterfaceMenuItemC2052a interfaceMenuItemC2052a = sVar.silver;
                    if (method == null) {
                        sVar.teal = interfaceMenuItemC2052a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.teal.invoke(interfaceMenuItemC2052a, Boolean.TRUE);
                } catch (Exception e4) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e4);
                }
            }
        }
        String str3 = this.xray;
        if (str3 != null) {
            menuItem.setActionView((View) alpha(str3, i.echo, iVar.alpha));
            z10 = true;
        }
        int i5 = this.whiskey;
        if (i5 > 0) {
            if (!z10) {
                menuItem.setActionView(i5);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        o oVar = this.zulu;
        if (oVar != null) {
            if (menuItem instanceof InterfaceMenuItemC2052a) {
                ((InterfaceMenuItemC2052a) menuItem).bravo(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.amber;
        boolean z11 = menuItem instanceof InterfaceMenuItemC2052a;
        if (z11) {
            ((InterfaceMenuItemC2052a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            S0.november(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.azure;
        if (z11) {
            ((InterfaceMenuItemC2052a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            S0.romeo(menuItem, charSequence2);
        }
        char c3 = this.november;
        int i10 = this.oscar;
        if (z11) {
            ((InterfaceMenuItemC2052a) menuItem).setAlphabeticShortcut(c3, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            S0.mike(menuItem, c3, i10);
        }
        char c4 = this.papa;
        int i11 = this.quebec;
        if (z11) {
            ((InterfaceMenuItemC2052a) menuItem).setNumericShortcut(c4, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            S0.quebec(menuItem, c4, i11);
        }
        PorterDuff.Mode mode = this.black;
        if (mode != null) {
            if (z11) {
                ((InterfaceMenuItemC2052a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                S0.papa(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.beige;
        if (colorStateList != null) {
            if (z11) {
                ((InterfaceMenuItemC2052a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                S0.oscar(menuItem, colorStateList);
            }
        }
    }
}
