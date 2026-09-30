package cb;

import com.google.android.material.datepicker.j;
import g0.C1726f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: cb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0838c {
    public final String alpha;
    public final boolean amber;
    public final String azure;
    public final String beige;
    public final List black;
    public final String bravo;
    public final String charlie;
    public final EnumC0839d delta;
    public final String echo;
    public final String foxtrot;
    public final List golf;
    public final List hotel;
    public final C0841f india;
    public final boolean juliet;
    public final String kilo;
    public final String lima;
    public final String mike;
    public final C1726f november;
    public final boolean oscar;
    public final C1726f papa;
    public final List quebec;
    public final String romeo;
    public final boolean sierra;
    public final boolean tango;
    public final boolean uniform;
    public final boolean victor;
    public final boolean whiskey;
    public final String xray;
    public final String yankee;
    public final boolean zulu;

    public C0838c(String str, String subtitle, String locationLabel, EnumC0839d enumC0839d, String str2, String str3, List items, List cabinets, C0841f c0841f, boolean z2, String str4, String str5, String str6, C1726f c1726f, boolean z10, C1726f taskIcon, List orderItems, String str7, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str8, String str9, boolean z16, boolean z17, String str10, String str11, List deliveryProofImagePaths) {
        Intrinsics.echo(subtitle, "subtitle");
        Intrinsics.echo(locationLabel, "locationLabel");
        Intrinsics.echo(items, "items");
        Intrinsics.echo(cabinets, "cabinets");
        Intrinsics.echo(taskIcon, "taskIcon");
        Intrinsics.echo(orderItems, "orderItems");
        Intrinsics.echo(deliveryProofImagePaths, "deliveryProofImagePaths");
        this.alpha = str;
        this.bravo = subtitle;
        this.charlie = locationLabel;
        this.delta = enumC0839d;
        this.echo = str2;
        this.foxtrot = str3;
        this.golf = items;
        this.hotel = cabinets;
        this.india = c0841f;
        this.juliet = z2;
        this.kilo = str4;
        this.lima = str5;
        this.mike = str6;
        this.november = c1726f;
        this.oscar = z10;
        this.papa = taskIcon;
        this.quebec = orderItems;
        this.romeo = str7;
        this.sierra = z11;
        this.tango = z12;
        this.uniform = z13;
        this.victor = z14;
        this.whiskey = z15;
        this.xray = str8;
        this.yankee = str9;
        this.zulu = z16;
        this.amber = z17;
        this.azure = str10;
        this.beige = str11;
        this.black = deliveryProofImagePaths;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0838c) {
                C0838c c0838c = (C0838c) obj;
                if (!Intrinsics.areEqual(this.alpha, c0838c.alpha) || !Intrinsics.areEqual(this.bravo, c0838c.bravo) || !Intrinsics.areEqual(this.charlie, c0838c.charlie) || this.delta != c0838c.delta || !Intrinsics.areEqual(this.echo, c0838c.echo) || !Intrinsics.areEqual(this.foxtrot, c0838c.foxtrot) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.golf, c0838c.golf) || !Intrinsics.areEqual(this.hotel, c0838c.hotel) || !Intrinsics.areEqual(this.india, c0838c.india) || this.juliet != c0838c.juliet || !Intrinsics.areEqual(this.kilo, c0838c.kilo) || !Intrinsics.areEqual(this.lima, c0838c.lima) || !Intrinsics.areEqual(this.mike, c0838c.mike) || !Intrinsics.areEqual(this.november, c0838c.november) || this.oscar != c0838c.oscar || !Intrinsics.areEqual(this.papa, c0838c.papa) || !Intrinsics.areEqual(this.quebec, c0838c.quebec) || !Intrinsics.areEqual(this.romeo, c0838c.romeo) || this.sierra != c0838c.sierra || this.tango != c0838c.tango || this.uniform != c0838c.uniform || this.victor != c0838c.victor || this.whiskey != c0838c.whiskey || !Intrinsics.areEqual(this.xray, c0838c.xray) || !Intrinsics.areEqual(this.yankee, c0838c.yankee) || this.zulu != c0838c.zulu || this.amber != c0838c.amber || !Intrinsics.areEqual(this.azure, c0838c.azure) || !Intrinsics.areEqual(this.beige, c0838c.beige) || !Intrinsics.areEqual(this.black, c0838c.black)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i4;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int i5;
        int hashCode8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int hashCode9;
        int hashCode10;
        int i15;
        int hashCode11;
        int hashCode12 = (this.delta.hashCode() + AbstractC2327c.sierra(AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo), 31, this.charlie)) * 31;
        int i16 = 0;
        String str = this.echo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i17 = (hashCode12 + hashCode) * 31;
        String str2 = this.foxtrot;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int golf = j.golf(j.golf((i17 + hashCode2) * 961, 31, this.golf), 31, this.hotel);
        C0841f c0841f = this.india;
        if (c0841f == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c0841f.hashCode();
        }
        int i18 = (golf + hashCode3) * 31;
        int i19 = 1237;
        if (this.juliet) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i20 = (i18 + i4) * 31;
        String str3 = this.kilo;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i21 = (i20 + hashCode4) * 31;
        String str4 = this.lima;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i22 = (i21 + hashCode5) * 31;
        String str5 = this.mike;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i23 = (i22 + hashCode6) * 31;
        C1726f c1726f = this.november;
        if (c1726f == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c1726f.hashCode();
        }
        int i24 = (i23 + hashCode7) * 31;
        if (this.oscar) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int golf2 = j.golf((this.papa.hashCode() + ((i24 + i5) * 31)) * 31, 31, this.quebec);
        String str6 = this.romeo;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i25 = (golf2 + hashCode8) * 31;
        if (this.sierra) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i26 = (i25 + i10) * 31;
        if (this.tango) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i27 = (i26 + i11) * 31;
        if (this.uniform) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i28 = (i27 + i12) * 31;
        if (this.victor) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i29 = (i28 + i13) * 31;
        if (this.whiskey) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i30 = (i29 + i14) * 31;
        String str7 = this.xray;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i31 = (i30 + hashCode9) * 31;
        String str8 = this.yankee;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i32 = (i31 + hashCode10) * 31;
        if (this.zulu) {
            i15 = 1231;
        } else {
            i15 = 1237;
        }
        int i33 = (i32 + i15) * 31;
        if (this.amber) {
            i19 = 1231;
        }
        int i34 = (i33 + i19) * 31;
        String str9 = this.azure;
        if (str9 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str9.hashCode();
        }
        int i35 = (i34 + hashCode11) * 31;
        String str10 = this.beige;
        if (str10 != null) {
            i16 = str10.hashCode();
        }
        return this.black.hashCode() + ((i35 + i16) * 31);
    }

    public final String toString() {
        return "ActiveOrderTaskData(title=" + this.alpha + ", subtitle=" + this.bravo + ", locationLabel=" + this.charlie + ", state=" + this.delta + ", orderNumber=" + this.echo + ", merchantTag=" + this.foxtrot + ", cabinetNumber=null, items=" + this.golf + ", cabinets=" + this.hotel + ", handshakeSection=" + this.india + ", payAsYouGoBadge=" + this.juliet + ", payAsYouGoBadgeText=" + this.kilo + ", storeRef=" + this.lima + ", actionLabel=" + this.mike + ", actionIcon=" + this.november + ", actionEnabled=" + this.oscar + ", taskIcon=" + this.papa + ", orderItems=" + this.quebec + ", backendImageUrl=" + this.romeo + ", showUploadInvoiceAndProofRow=" + this.sierra + ", showUploadInvoiceInRow=" + this.tango + ", showProofOfPickupInRow=" + this.uniform + ", hasProofAttached=" + this.victor + ", hasInvoiceAttached=" + this.whiskey + ", invoiceImagePath=" + this.xray + ", proofImagePath=" + this.yankee + ", showDeliveryProofRow=" + this.zulu + ", hasDeliveryProofAttached=" + this.amber + ", deliveryProofImagePath=" + this.azure + ", deliveryProofLabel=" + this.beige + ", deliveryProofImagePaths=" + this.black + ")";
    }
}
