package N6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import s6.AbstractC2719n0;

/* loaded from: classes2.dex */
public final class b {
    public final BadgeState$State alpha;
    public final BadgeState$State bravo = new BadgeState$State();
    public final float charlie;
    public final float delta;
    public final float echo;
    public final float foxtrot;
    public final float golf;
    public final float hotel;
    public final int india;
    public final int juliet;
    public final int kilo;
    public final int lima;

    public b(Context context) {
        AttributeSet attributeSet;
        int i4;
        boolean z2;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int i5;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int intValue13;
        int intValue14;
        int intValue15;
        int intValue16;
        boolean booleanValue;
        Locale locale;
        int next;
        Locale.Category unused;
        BadgeState$State badgeState$State = new BadgeState$State();
        int i10 = badgeState$State.alpha;
        if (i10 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        attributeSet = asAttributeSet;
                        i4 = asAttributeSet.getStyleAttribute();
                    } else {
                        throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i4 = 0;
        }
        TypedArray golf = z.golf(context, attributeSet, L6.a.charlie, R.attr.badgeStyle, i4 == 0 ? 2132083878 : i4, new int[0]);
        Resources resources = context.getResources();
        this.charlie = golf.getDimensionPixelSize(5, -1);
        this.india = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.juliet = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.delta = golf.getDimensionPixelSize(15, -1);
        this.echo = golf.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.golf = golf.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.foxtrot = golf.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.hotel = golf.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.kilo = golf.getInt(25, 1);
        this.lima = golf.getInt(2, 0);
        BadgeState$State badgeState$State2 = this.bravo;
        int i11 = badgeState$State.f7823b;
        badgeState$State2.f7823b = i11 == -2 ? 255 : i11;
        int i12 = badgeState$State.f7825d;
        if (i12 != -2) {
            badgeState$State2.f7825d = i12;
        } else if (golf.hasValue(24)) {
            this.bravo.f7825d = golf.getInt(24, 0);
        } else {
            this.bravo.f7825d = -1;
        }
        String str = badgeState$State.f7824c;
        if (str != null) {
            this.bravo.f7824c = str;
        } else if (golf.hasValue(8)) {
            this.bravo.f7824c = golf.getString(8);
        }
        BadgeState$State badgeState$State3 = this.bravo;
        badgeState$State3.f7828h = badgeState$State.f7828h;
        CharSequence charSequence = badgeState$State.f7829i;
        badgeState$State3.f7829i = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        BadgeState$State badgeState$State4 = this.bravo;
        int i13 = badgeState$State.f7830j;
        badgeState$State4.f7830j = i13 == 0 ? R.plurals.mtrl_badge_content_description : i13;
        int i14 = badgeState$State.f7831k;
        badgeState$State4.f7831k = i14 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i14;
        Boolean bool = badgeState$State.f7833m;
        if (bool != null && !bool.booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        badgeState$State4.f7833m = Boolean.valueOf(z2);
        BadgeState$State badgeState$State5 = this.bravo;
        int i15 = badgeState$State.e;
        badgeState$State5.e = i15 == -2 ? golf.getInt(22, -2) : i15;
        BadgeState$State badgeState$State6 = this.bravo;
        int i16 = badgeState$State.f7826f;
        badgeState$State6.f7826f = i16 == -2 ? golf.getInt(23, -2) : i16;
        BadgeState$State badgeState$State7 = this.bravo;
        Integer num = badgeState$State.teal;
        if (num == null) {
            intValue = golf.getResourceId(6, 2132083138);
        } else {
            intValue = num.intValue();
        }
        badgeState$State7.teal = Integer.valueOf(intValue);
        BadgeState$State badgeState$State8 = this.bravo;
        Integer num2 = badgeState$State.white;
        if (num2 == null) {
            intValue2 = golf.getResourceId(7, 0);
        } else {
            intValue2 = num2.intValue();
        }
        badgeState$State8.white = Integer.valueOf(intValue2);
        BadgeState$State badgeState$State9 = this.bravo;
        Integer num3 = badgeState$State.yellow;
        if (num3 == null) {
            intValue3 = golf.getResourceId(16, 2132083138);
        } else {
            intValue3 = num3.intValue();
        }
        badgeState$State9.yellow = Integer.valueOf(intValue3);
        BadgeState$State badgeState$State10 = this.bravo;
        Integer num4 = badgeState$State.f7822a;
        if (num4 == null) {
            intValue4 = golf.getResourceId(17, 0);
        } else {
            intValue4 = num4.intValue();
        }
        badgeState$State10.f7822a = Integer.valueOf(intValue4);
        BadgeState$State badgeState$State11 = this.bravo;
        Integer num5 = badgeState$State.purple;
        if (num5 == null) {
            intValue5 = AbstractC2719n0.alpha(context, golf, 1).getDefaultColor();
        } else {
            intValue5 = num5.intValue();
        }
        badgeState$State11.purple = Integer.valueOf(intValue5);
        BadgeState$State badgeState$State12 = this.bravo;
        Integer num6 = badgeState$State.silver;
        if (num6 == null) {
            intValue6 = golf.getResourceId(9, 2132083324);
        } else {
            intValue6 = num6.intValue();
        }
        badgeState$State12.silver = Integer.valueOf(intValue6);
        Integer num7 = badgeState$State.red;
        if (num7 != null) {
            this.bravo.red = num7;
        } else if (golf.hasValue(10)) {
            this.bravo.red = Integer.valueOf(AbstractC2719n0.alpha(context, golf, 10).getDefaultColor());
        } else {
            int intValue17 = this.bravo.silver.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue17, aj.a.xray);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList alpha = AbstractC2719n0.alpha(context, obtainStyledAttributes, 3);
            AbstractC2719n0.alpha(context, obtainStyledAttributes, 4);
            AbstractC2719n0.alpha(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            if (obtainStyledAttributes.hasValue(12)) {
                i5 = 12;
            } else {
                i5 = 10;
            }
            obtainStyledAttributes.getResourceId(i5, 0);
            obtainStyledAttributes.getString(i5);
            obtainStyledAttributes.getBoolean(14, false);
            AbstractC2719n0.alpha(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue17, L6.a.blue);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            if (Build.VERSION.SDK_INT >= 26) {
                obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
            }
            obtainStyledAttributes2.recycle();
            this.bravo.red = Integer.valueOf(alpha.getDefaultColor());
        }
        BadgeState$State badgeState$State13 = this.bravo;
        Integer num8 = badgeState$State.f7832l;
        if (num8 == null) {
            intValue7 = golf.getInt(3, 8388661);
        } else {
            intValue7 = num8.intValue();
        }
        badgeState$State13.f7832l = Integer.valueOf(intValue7);
        BadgeState$State badgeState$State14 = this.bravo;
        Integer num9 = badgeState$State.f7834n;
        if (num9 == null) {
            intValue8 = golf.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            intValue8 = num9.intValue();
        }
        badgeState$State14.f7834n = Integer.valueOf(intValue8);
        BadgeState$State badgeState$State15 = this.bravo;
        Integer num10 = badgeState$State.f7835o;
        if (num10 == null) {
            intValue9 = golf.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding));
        } else {
            intValue9 = num10.intValue();
        }
        badgeState$State15.f7835o = Integer.valueOf(intValue9);
        BadgeState$State badgeState$State16 = this.bravo;
        Integer num11 = badgeState$State.f7836p;
        if (num11 == null) {
            intValue10 = golf.getDimensionPixelOffset(19, 0);
        } else {
            intValue10 = num11.intValue();
        }
        badgeState$State16.f7836p = Integer.valueOf(intValue10);
        BadgeState$State badgeState$State17 = this.bravo;
        Integer num12 = badgeState$State.f7837q;
        if (num12 == null) {
            intValue11 = golf.getDimensionPixelOffset(26, 0);
        } else {
            intValue11 = num12.intValue();
        }
        badgeState$State17.f7837q = Integer.valueOf(intValue11);
        BadgeState$State badgeState$State18 = this.bravo;
        Integer num13 = badgeState$State.f7838r;
        if (num13 == null) {
            intValue12 = golf.getDimensionPixelOffset(20, badgeState$State18.f7836p.intValue());
        } else {
            intValue12 = num13.intValue();
        }
        badgeState$State18.f7838r = Integer.valueOf(intValue12);
        BadgeState$State badgeState$State19 = this.bravo;
        Integer num14 = badgeState$State.f7839s;
        if (num14 == null) {
            intValue13 = golf.getDimensionPixelOffset(27, badgeState$State19.f7837q.intValue());
        } else {
            intValue13 = num14.intValue();
        }
        badgeState$State19.f7839s = Integer.valueOf(intValue13);
        BadgeState$State badgeState$State20 = this.bravo;
        Integer num15 = badgeState$State.f7842v;
        if (num15 == null) {
            intValue14 = golf.getDimensionPixelOffset(21, 0);
        } else {
            intValue14 = num15.intValue();
        }
        badgeState$State20.f7842v = Integer.valueOf(intValue14);
        BadgeState$State badgeState$State21 = this.bravo;
        Integer num16 = badgeState$State.f7840t;
        if (num16 == null) {
            intValue15 = 0;
        } else {
            intValue15 = num16.intValue();
        }
        badgeState$State21.f7840t = Integer.valueOf(intValue15);
        BadgeState$State badgeState$State22 = this.bravo;
        Integer num17 = badgeState$State.f7841u;
        if (num17 == null) {
            intValue16 = 0;
        } else {
            intValue16 = num17.intValue();
        }
        badgeState$State22.f7841u = Integer.valueOf(intValue16);
        BadgeState$State badgeState$State23 = this.bravo;
        Boolean bool2 = badgeState$State.f7843w;
        if (bool2 == null) {
            booleanValue = golf.getBoolean(0, false);
        } else {
            booleanValue = bool2.booleanValue();
        }
        badgeState$State23.f7843w = Boolean.valueOf(booleanValue);
        golf.recycle();
        Locale locale2 = badgeState$State.f7827g;
        if (locale2 == null) {
            BadgeState$State badgeState$State24 = this.bravo;
            if (Build.VERSION.SDK_INT >= 24) {
                unused = Locale.Category.FORMAT;
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            badgeState$State24.f7827g = locale;
        } else {
            this.bravo.f7827g = locale2;
        }
        this.alpha = badgeState$State;
    }
}
