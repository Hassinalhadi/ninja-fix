package y2;

import android.os.Parcel;
import android.util.SparseIntArray;
import androidx.appcompat.widget.P0;
import bv.aw;
import bv.e;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3393b extends AbstractC3392a {
    public final SparseIntArray delta;
    public final Parcel echo;
    public final int foxtrot;
    public final int golf;
    public final String hotel;
    public int india;
    public int juliet;
    public int kilo;

    /* JADX WARN: Type inference failed for: r5v0, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r6v0, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r7v0, types: [bv.e, bv.aw] */
    public C3393b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new aw(0), new aw(0), new aw(0));
    }

    @Override // y2.AbstractC3392a
    public final C3393b alpha() {
        Parcel parcel = this.echo;
        int dataPosition = parcel.dataPosition();
        int i4 = this.juliet;
        if (i4 == this.foxtrot) {
            i4 = this.golf;
        }
        return new C3393b(parcel, dataPosition, i4, P0.gold(new StringBuilder(), this.hotel, "  "), this.alpha, this.bravo, this.charlie);
    }

    @Override // y2.AbstractC3392a
    public final boolean echo(int i4) {
        while (this.juliet < this.golf) {
            int i5 = this.kilo;
            if (i5 != i4) {
                if (String.valueOf(i5).compareTo(String.valueOf(i4)) <= 0) {
                    int i10 = this.juliet;
                    Parcel parcel = this.echo;
                    parcel.setDataPosition(i10);
                    int readInt = parcel.readInt();
                    this.kilo = parcel.readInt();
                    this.juliet += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.kilo == i4) {
            return true;
        }
        return false;
    }

    @Override // y2.AbstractC3392a
    public final void india(int i4) {
        int i5 = this.india;
        SparseIntArray sparseIntArray = this.delta;
        Parcel parcel = this.echo;
        if (i5 >= 0) {
            int i10 = sparseIntArray.get(i5);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i10);
            parcel.writeInt(dataPosition - i10);
            parcel.setDataPosition(dataPosition);
        }
        this.india = i4;
        sparseIntArray.put(i4, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i4);
    }

    public C3393b(Parcel parcel, int i4, int i5, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.delta = new SparseIntArray();
        this.india = -1;
        this.kilo = -1;
        this.echo = parcel;
        this.foxtrot = i4;
        this.golf = i5;
        this.juliet = i4;
        this.hotel = str;
    }
}
