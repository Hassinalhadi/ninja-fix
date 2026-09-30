package c1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: c1.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0812k {
    public static final SparseIntArray juliet;
    public int alpha;
    public int bravo;
    public int charlie;
    public float delta;
    public float echo;
    public float foxtrot;
    public int golf;
    public String hotel;
    public int india;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        juliet = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void alpha(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0820s.golf);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            switch (juliet.get(index)) {
                case 1:
                    this.echo = obtainStyledAttributes.getFloat(index, this.echo);
                    break;
                case 2:
                    this.charlie = obtainStyledAttributes.getInt(index, this.charlie);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = X0.a.alpha[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.alpha = C0815n.foxtrot(obtainStyledAttributes, index, this.alpha);
                    break;
                case 6:
                    this.bravo = obtainStyledAttributes.getInteger(index, this.bravo);
                    break;
                case 7:
                    this.delta = obtainStyledAttributes.getFloat(index, this.delta);
                    break;
                case 8:
                    this.golf = obtainStyledAttributes.getInteger(index, this.golf);
                    break;
                case 9:
                    this.foxtrot = obtainStyledAttributes.getFloat(index, this.foxtrot);
                    break;
                case 10:
                    int i5 = obtainStyledAttributes.peekValue(index).type;
                    if (i5 == 1) {
                        this.india = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i5 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.hotel = string;
                        if (string.indexOf("/") > 0) {
                            this.india = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.india);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
