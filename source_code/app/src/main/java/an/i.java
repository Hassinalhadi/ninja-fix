package an;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.appcompat.widget.S;
import ao.o;
import com.clevertap.android.sdk.leanplum.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import g1.AbstractC1735d;
import java.io.IOException;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class i extends MenuInflater {
    public static final Class[] echo;
    public static final Class[] foxtrot;
    public final Object[] alpha;
    public final Object[] bravo;
    public final Context charlie;
    public Object delta;

    static {
        Class[] clsArr = {Context.class};
        echo = clsArr;
        foxtrot = clsArr;
    }

    public i(Context context) {
        super(context);
        this.charlie = context;
        Object[] objArr = {context};
        this.alpha = objArr;
        this.bravo = objArr;
    }

    public static Object alpha(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return alpha(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void bravo(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i4;
        XmlResourceParser xmlResourceParser2;
        boolean z2;
        char charAt;
        char charAt2;
        boolean z10;
        ColorStateList colorStateList;
        int resourceId;
        h hVar = new h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i4 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        while (!z11) {
            if (eventType != r4) {
                if (eventType != i4) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z12 && name2.equals(str)) {
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = r4;
                            z12 = false;
                            str = null;
                            eventType = xmlResourceParser2.next();
                            r4 = z2;
                            i4 = 2;
                            z12 = z12;
                        } else if (name2.equals(CTVariableUtils.DICTIONARY)) {
                            hVar.bravo = 0;
                            hVar.charlie = 0;
                            hVar.delta = 0;
                            hVar.echo = 0;
                            hVar.foxtrot = r4;
                            hVar.golf = r4;
                        } else if (name2.equals(Constants.IAP_ITEM_PARAM)) {
                            if (!hVar.hotel) {
                                o oVar = hVar.zulu;
                                if (oVar != null && oVar.bravo.hasSubMenu()) {
                                    hVar.hotel = r4;
                                    hVar.bravo(hVar.alpha.addSubMenu(hVar.bravo, hVar.india, hVar.juliet, hVar.kilo).getItem());
                                } else {
                                    hVar.hotel = r4;
                                    hVar.bravo(hVar.alpha.add(hVar.bravo, hVar.india, hVar.juliet, hVar.kilo));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = r4;
                            z11 = z2;
                        }
                    }
                    xmlResourceParser2 = xmlResourceParser;
                    z2 = r4;
                } else {
                    if (!z12) {
                        String name3 = xmlResourceParser.getName();
                        boolean equals = name3.equals(CTVariableUtils.DICTIONARY);
                        i iVar = hVar.blue;
                        if (equals) {
                            TypedArray obtainStyledAttributes = iVar.charlie.obtainStyledAttributes(attributeSet, aj.a.quebec);
                            hVar.bravo = obtainStyledAttributes.getResourceId(r4, 0);
                            hVar.charlie = obtainStyledAttributes.getInt(3, 0);
                            hVar.delta = obtainStyledAttributes.getInt(4, 0);
                            hVar.echo = obtainStyledAttributes.getInt(5, 0);
                            hVar.foxtrot = obtainStyledAttributes.getBoolean(2, r4);
                            hVar.golf = obtainStyledAttributes.getBoolean(0, r4);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals(Constants.IAP_ITEM_PARAM)) {
                                Context context = iVar.charlie;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, aj.a.romeo);
                                hVar.india = obtainStyledAttributes2.getResourceId(2, 0);
                                hVar.juliet = (obtainStyledAttributes2.getInt(5, hVar.charlie) & (-65536)) | (obtainStyledAttributes2.getInt(6, hVar.delta) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                                hVar.kilo = obtainStyledAttributes2.getText(7);
                                hVar.lima = obtainStyledAttributes2.getText(8);
                                hVar.mike = obtainStyledAttributes2.getResourceId(0, 0);
                                String string = obtainStyledAttributes2.getString(9);
                                if (string == null) {
                                    charAt = 0;
                                } else {
                                    charAt = string.charAt(0);
                                }
                                hVar.november = charAt;
                                hVar.oscar = obtainStyledAttributes2.getInt(16, 4096);
                                String string2 = obtainStyledAttributes2.getString(10);
                                if (string2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = string2.charAt(0);
                                }
                                hVar.papa = charAt2;
                                hVar.quebec = obtainStyledAttributes2.getInt(20, 4096);
                                if (obtainStyledAttributes2.hasValue(11)) {
                                    hVar.romeo = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                                } else {
                                    hVar.romeo = hVar.echo;
                                }
                                hVar.sierra = obtainStyledAttributes2.getBoolean(3, false);
                                hVar.tango = obtainStyledAttributes2.getBoolean(4, hVar.foxtrot);
                                hVar.uniform = obtainStyledAttributes2.getBoolean(1, hVar.golf);
                                hVar.victor = obtainStyledAttributes2.getInt(21, -1);
                                hVar.yankee = obtainStyledAttributes2.getString(12);
                                hVar.whiskey = obtainStyledAttributes2.getResourceId(13, 0);
                                hVar.xray = obtainStyledAttributes2.getString(15);
                                String string3 = obtainStyledAttributes2.getString(14);
                                if (string3 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && hVar.whiskey == 0 && hVar.xray == null) {
                                    hVar.zulu = (o) hVar.alpha(string3, foxtrot, iVar.bravo);
                                } else {
                                    if (z10) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    hVar.zulu = null;
                                }
                                hVar.amber = obtainStyledAttributes2.getText(17);
                                hVar.azure = obtainStyledAttributes2.getText(22);
                                if (obtainStyledAttributes2.hasValue(19)) {
                                    hVar.black = S.bravo(obtainStyledAttributes2.getInt(19, -1), hVar.black);
                                } else {
                                    hVar.black = null;
                                }
                                if (obtainStyledAttributes2.hasValue(18)) {
                                    if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC1735d.charlie(resourceId, context)) == null) {
                                        colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                    }
                                    hVar.beige = colorStateList;
                                } else {
                                    hVar.beige = null;
                                }
                                obtainStyledAttributes2.recycle();
                                hVar.hotel = false;
                                xmlResourceParser2 = xmlResourceParser;
                                z2 = true;
                            } else if (name3.equals("menu")) {
                                z2 = true;
                                hVar.hotel = true;
                                SubMenu addSubMenu = hVar.alpha.addSubMenu(hVar.bravo, hVar.india, hVar.juliet, hVar.kilo);
                                hVar.bravo(addSubMenu.getItem());
                                xmlResourceParser2 = xmlResourceParser;
                                bravo(xmlResourceParser2, attributeSet, addSubMenu);
                            } else {
                                xmlResourceParser2 = xmlResourceParser;
                                z2 = true;
                                str = name3;
                                z12 = true;
                            }
                            eventType = xmlResourceParser2.next();
                            r4 = z2;
                            i4 = 2;
                            z12 = z12;
                        }
                    }
                    xmlResourceParser2 = xmlResourceParser;
                    z2 = r4;
                }
                eventType = xmlResourceParser2.next();
                r4 = z2;
                i4 = 2;
                z12 = z12;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i4, Menu menu) {
        if (!(menu instanceof ao.l)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z2 = false;
        try {
            try {
                xmlResourceParser = this.charlie.getResources().getLayout(i4);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof ao.l) {
                    ao.l lVar = (ao.l) menu;
                    if (!lVar.f3210i) {
                        lVar.whiskey();
                        z2 = true;
                    }
                }
                bravo(xmlResourceParser, asAttributeSet, menu);
                if (z2) {
                    ((ao.l) menu).victor();
                }
                xmlResourceParser.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (z2) {
                ((ao.l) menu).victor();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
