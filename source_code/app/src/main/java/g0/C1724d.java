package g0;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1724d {
    public final String alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final float echo;
    public final float foxtrot;
    public final float golf;
    public final float hotel;
    public final List india;
    public final ArrayList juliet;

    public C1724d(String str, float f5, float f10, float f11, float f12, float f13, float f14, float f15, List list, int i4) {
        str = (i4 & 1) != 0 ? "" : str;
        f5 = (i4 & 2) != 0 ? 0.0f : f5;
        f10 = (i4 & 4) != 0 ? 0.0f : f10;
        f11 = (i4 & 8) != 0 ? 0.0f : f11;
        f12 = (i4 & 16) != 0 ? 1.0f : f12;
        f13 = (i4 & 32) != 0 ? 1.0f : f13;
        f14 = (i4 & 64) != 0 ? 0.0f : f14;
        f15 = (i4 & 128) != 0 ? 0.0f : f15;
        list = (i4 & Barcode.FORMAT_QR_CODE) != 0 ? ah.alpha : list;
        ArrayList arrayList = new ArrayList();
        this.alpha = str;
        this.bravo = f5;
        this.charlie = f10;
        this.delta = f11;
        this.echo = f12;
        this.foxtrot = f13;
        this.golf = f14;
        this.hotel = f15;
        this.india = list;
        this.juliet = arrayList;
    }
}
