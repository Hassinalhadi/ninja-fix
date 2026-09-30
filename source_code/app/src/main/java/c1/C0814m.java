package c1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: c1.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0814m {
    public static final SparseIntArray november;
    public float alpha;
    public float bravo;
    public float charlie;
    public float delta;
    public float echo;
    public float foxtrot;
    public float golf;
    public int hotel;
    public float india;
    public float juliet;
    public float kilo;
    public boolean lima;
    public float mike;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        november = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void alpha(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0820s.juliet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            switch (november.get(index)) {
                case 1:
                    this.alpha = obtainStyledAttributes.getFloat(index, this.alpha);
                    break;
                case 2:
                    this.bravo = obtainStyledAttributes.getFloat(index, this.bravo);
                    break;
                case 3:
                    this.charlie = obtainStyledAttributes.getFloat(index, this.charlie);
                    break;
                case 4:
                    this.delta = obtainStyledAttributes.getFloat(index, this.delta);
                    break;
                case 5:
                    this.echo = obtainStyledAttributes.getFloat(index, this.echo);
                    break;
                case 6:
                    this.foxtrot = obtainStyledAttributes.getDimension(index, this.foxtrot);
                    break;
                case 7:
                    this.golf = obtainStyledAttributes.getDimension(index, this.golf);
                    break;
                case 8:
                    this.india = obtainStyledAttributes.getDimension(index, this.india);
                    break;
                case 9:
                    this.juliet = obtainStyledAttributes.getDimension(index, this.juliet);
                    break;
                case 10:
                    this.kilo = obtainStyledAttributes.getDimension(index, this.kilo);
                    break;
                case 11:
                    this.lima = true;
                    this.mike = obtainStyledAttributes.getDimension(index, this.mike);
                    break;
                case 12:
                    this.hotel = C0815n.foxtrot(obtainStyledAttributes, index, this.hotel);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
