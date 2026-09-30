package db;

import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import okhttp3.internal.http2.Http2;
import s6.AbstractC2636d7;

/* renamed from: db.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1602b {
    public static final C1602b quebec;
    public static final C1602b romeo;
    public static final C1602b sierra;
    public final EnumC1601a alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final float echo;
    public final float foxtrot;
    public final long golf;
    public final long hotel;
    public final float india;
    public final long juliet;
    public final float kilo;
    public final float lima;
    public final long mike;
    public final long november;
    public final float oscar;
    public final float papa;

    static {
        float f5 = 16;
        float f10 = 8;
        C1602b c1602b = new C1602b(EnumC1601a.red, f5, f5, f5, 56, 28, AbstractC2636d7.charlie(18), AbstractC2636d7.charlie(16), 4, AbstractC2636d7.charlie(26), 12, f10, AbstractC2636d7.charlie(15), AbstractC2636d7.charlie(14), f5, f5);
        quebec = c1602b;
        float f11 = 20;
        romeo = alpha(c1602b, EnumC1601a.purple, f11, f11, 0.0f, 72, 36, AbstractC2636d7.charlie(20), AbstractC2636d7.charlie(18), 0.0f, AbstractC2636d7.charlie(30), 0.0f, 0.0f, AbstractC2636d7.charlie(16), AbstractC2636d7.charlie(15), f11, 19720);
        float f12 = 24;
        sierra = alpha(c1602b, EnumC1601a.alpha, f12, f12, f11, 96, 48, AbstractC2636d7.charlie(26), AbstractC2636d7.charlie(22), f10, AbstractC2636d7.charlie(28), 14, 10, AbstractC2636d7.charlie(16), AbstractC2636d7.charlie(15), f11, Http2.INITIAL_MAX_FRAME_SIZE);
    }

    public C1602b(EnumC1601a enumC1601a, float f5, float f10, float f11, float f12, float f13, long j5, long j6, float f14, long j7, float f15, float f16, long j10, long j11, float f17, float f18) {
        this.alpha = enumC1601a;
        this.bravo = f5;
        this.charlie = f10;
        this.delta = f11;
        this.echo = f12;
        this.foxtrot = f13;
        this.golf = j5;
        this.hotel = j6;
        this.india = f14;
        this.juliet = j7;
        this.kilo = f15;
        this.lima = f16;
        this.mike = j10;
        this.november = j11;
        this.oscar = f17;
        this.papa = f18;
    }

    public static C1602b alpha(C1602b c1602b, EnumC1601a enumC1601a, float f5, float f10, float f11, float f12, float f13, long j5, long j6, float f14, long j7, float f15, float f16, long j10, long j11, float f17, int i4) {
        return new C1602b(enumC1601a, f5, f10, (i4 & 8) != 0 ? c1602b.delta : f11, f12, f13, j5, j6, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? c1602b.india : f14, j7, (i4 & Barcode.FORMAT_UPC_E) != 0 ? c1602b.kilo : f15, (i4 & 2048) != 0 ? c1602b.lima : f16, j10, j11, c1602b.oscar, f17);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1602b) {
                C1602b c1602b = (C1602b) obj;
                if (this.alpha != c1602b.alpha || !Q0.g.alpha(this.bravo, c1602b.bravo) || !Q0.g.alpha(this.charlie, c1602b.charlie) || !Q0.g.alpha(this.delta, c1602b.delta) || !Q0.g.alpha(this.echo, c1602b.echo) || !Q0.g.alpha(this.foxtrot, c1602b.foxtrot) || !Q0.p.alpha(this.golf, c1602b.golf) || !Q0.p.alpha(this.hotel, c1602b.hotel) || !Q0.g.alpha(this.india, c1602b.india) || !Q0.p.alpha(this.juliet, c1602b.juliet) || !Q0.g.alpha(this.kilo, c1602b.kilo) || !Q0.g.alpha(this.lima, c1602b.lima) || !Q0.p.alpha(this.mike, c1602b.mike) || !Q0.p.alpha(this.november, c1602b.november) || !Q0.g.alpha(this.oscar, c1602b.oscar) || !Q0.g.alpha(this.papa, c1602b.papa)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.papa) + ad.sierra(this.oscar, (Q0.p.delta(this.november) + ((Q0.p.delta(this.mike) + ad.sierra(this.lima, ad.sierra(this.kilo, (Q0.p.delta(this.juliet) + ad.sierra(this.india, (Q0.p.delta(this.hotel) + ((Q0.p.delta(this.golf) + ad.sierra(this.foxtrot, ad.sierra(this.echo, ad.sierra(this.delta, ad.sierra(this.charlie, ad.sierra(this.bravo, this.alpha.hashCode() * 31, 31), 31), 31), 31), 31)) * 31)) * 31, 31)) * 31, 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        String bravo = Q0.g.bravo(this.bravo);
        String bravo2 = Q0.g.bravo(this.charlie);
        String bravo3 = Q0.g.bravo(this.delta);
        String bravo4 = Q0.g.bravo(this.echo);
        String bravo5 = Q0.g.bravo(this.foxtrot);
        String echo = Q0.p.echo(this.golf);
        String echo2 = Q0.p.echo(this.hotel);
        String bravo6 = Q0.g.bravo(this.india);
        String echo3 = Q0.p.echo(this.juliet);
        String bravo7 = Q0.g.bravo(this.kilo);
        String bravo8 = Q0.g.bravo(this.lima);
        String echo4 = Q0.p.echo(this.mike);
        String echo5 = Q0.p.echo(this.november);
        String bravo9 = Q0.g.bravo(this.oscar);
        String bravo10 = Q0.g.bravo(this.papa);
        StringBuilder sb2 = new StringBuilder("CashierDensity(mode=");
        sb2.append(this.alpha);
        sb2.append(", cardPadding=");
        sb2.append(bravo);
        sb2.append(", cardInnerSpacing=");
        Q0.c.azure(sb2, bravo2, ", rowSpacing=", bravo3, ", thumbnailSize=");
        Q0.c.azure(sb2, bravo4, ", thumbnailIconSize=", bravo5, ", titleSize=");
        Q0.c.azure(sb2, echo, ", titleArSize=", echo2, ", titleBlockSpacing=");
        Q0.c.azure(sb2, bravo6, ", quantitySize=", echo3, ", chipHorizontalPadding=");
        Q0.c.azure(sb2, bravo7, ", chipVerticalPadding=", bravo8, ", chipLabelSize=");
        Q0.c.azure(sb2, echo4, ", chipLabelArSize=", echo5, ", chipSpacing=");
        return com.google.android.material.datepicker.j.lima(sb2, bravo9, ", listItemSpacing=", bravo10, ")");
    }
}
