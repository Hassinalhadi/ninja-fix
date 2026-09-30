package g7;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.clevertap.android.sdk.leanplum.Constants;
import delivery.samurai.android.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class ad {
    public final int alpha;
    public final m bravo;
    public final int[][] charlie;
    public final m[] delta;
    public final ab echo;
    public final ab foxtrot;
    public final ab golf;
    public final ab hotel;

    public ad(ac acVar) {
        this.alpha = acVar.alpha;
        this.bravo = acVar.bravo;
        this.charlie = acVar.charlie;
        this.delta = acVar.delta;
        this.echo = acVar.echo;
        this.foxtrot = acVar.foxtrot;
        this.golf = acVar.golf;
        this.hotel = acVar.hotel;
    }

    public static void alpha(ac acVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals(Constants.IAP_ITEM_PARAM)) {
                        Resources resources = context.getResources();
                        int[] iArr = L6.a.beige;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        m alpha = m.alpha(context, obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0)).alpha();
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i4 = 0;
                        for (int i5 = 0; i5 < attributeCount; i5++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                            if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                int i10 = i4 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i4] = attributeNameResource;
                                i4 = i10;
                            }
                        }
                        acVar.alpha(StateSet.trimStateSet(iArr2, i4), alpha);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [g7.ac, java.lang.Object] */
    public static ad bravo(Context context, TypedArray typedArray, int i4) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i4, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        ?? obj = new Object();
        obj.bravo();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            obj.bravo();
        }
        try {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (xml.getName().equals("selector")) {
                    alpha(obj, context, xml, asAttributeSet, context.getTheme());
                }
                xml.close();
                if (obj.alpha == 0) {
                    return null;
                }
                return new ad(obj);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final m charlie() {
        m mVar = this.bravo;
        ab abVar = this.hotel;
        ab abVar2 = this.golf;
        ab abVar3 = this.foxtrot;
        ab abVar4 = this.echo;
        if (abVar4 == null && abVar3 == null && abVar2 == null && abVar == null) {
            return mVar;
        }
        l golf = mVar.golf();
        if (abVar4 != null) {
            golf.echo = abVar4.bravo;
        }
        if (abVar3 != null) {
            golf.foxtrot = abVar3.bravo;
        }
        if (abVar2 != null) {
            golf.hotel = abVar2.bravo;
        }
        if (abVar != null) {
            golf.golf = abVar.bravo;
        }
        return golf.alpha();
    }

    public final boolean delta() {
        ab abVar;
        ab abVar2;
        ab abVar3;
        ab abVar4;
        if (this.alpha > 1 || (((abVar = this.echo) != null && abVar.alpha > 1) || (((abVar2 = this.foxtrot) != null && abVar2.alpha > 1) || (((abVar3 = this.golf) != null && abVar3.alpha > 1) || ((abVar4 = this.hotel) != null && abVar4.alpha > 1))))) {
            return true;
        }
        return false;
    }
}
