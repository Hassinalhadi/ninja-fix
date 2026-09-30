package androidx.vectordrawable.graphics.drawable;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class j extends k {
    public final Matrix alpha;
    public final ArrayList bravo;
    public float charlie;
    public float delta;
    public float echo;
    public float foxtrot;
    public float golf;
    public float hotel;
    public float india;
    public final Matrix juliet;
    public String kilo;

    public j() {
        this.alpha = new Matrix();
        this.bravo = new ArrayList();
        this.charlie = 0.0f;
        this.delta = 0.0f;
        this.echo = 0.0f;
        this.foxtrot = 1.0f;
        this.golf = 1.0f;
        this.hotel = 0.0f;
        this.india = 0.0f;
        this.juliet = new Matrix();
        this.kilo = null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.k
    public final boolean alpha() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.bravo;
            if (i4 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i4)).alpha()) {
                return true;
            }
            i4++;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.k
    public final boolean bravo(int[] iArr) {
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.bravo;
            if (i4 < arrayList.size()) {
                z2 |= ((k) arrayList.get(i4)).bravo(iArr);
                i4++;
            } else {
                return z2;
            }
        }
    }

    public final void charlie() {
        Matrix matrix = this.juliet;
        matrix.reset();
        matrix.postTranslate(-this.delta, -this.echo);
        matrix.postScale(this.foxtrot, this.golf);
        matrix.postRotate(this.charlie, 0.0f, 0.0f);
        matrix.postTranslate(this.hotel + this.delta, this.india + this.echo);
    }

    public String getGroupName() {
        return this.kilo;
    }

    public Matrix getLocalMatrix() {
        return this.juliet;
    }

    public float getPivotX() {
        return this.delta;
    }

    public float getPivotY() {
        return this.echo;
    }

    public float getRotation() {
        return this.charlie;
    }

    public float getScaleX() {
        return this.foxtrot;
    }

    public float getScaleY() {
        return this.golf;
    }

    public float getTranslateX() {
        return this.hotel;
    }

    public float getTranslateY() {
        return this.india;
    }

    public void setPivotX(float f5) {
        if (f5 != this.delta) {
            this.delta = f5;
            charlie();
        }
    }

    public void setPivotY(float f5) {
        if (f5 != this.echo) {
            this.echo = f5;
            charlie();
        }
    }

    public void setRotation(float f5) {
        if (f5 != this.charlie) {
            this.charlie = f5;
            charlie();
        }
    }

    public void setScaleX(float f5) {
        if (f5 != this.foxtrot) {
            this.foxtrot = f5;
            charlie();
        }
    }

    public void setScaleY(float f5) {
        if (f5 != this.golf) {
            this.golf = f5;
            charlie();
        }
    }

    public void setTranslateX(float f5) {
        if (f5 != this.hotel) {
            this.hotel = f5;
            charlie();
        }
    }

    public void setTranslateY(float f5) {
        if (f5 != this.india) {
            this.india = f5;
            charlie();
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.vectordrawable.graphics.drawable.l, androidx.vectordrawable.graphics.drawable.i] */
    public j(j jVar, bv.e eVar) {
        l lVar;
        this.alpha = new Matrix();
        this.bravo = new ArrayList();
        this.charlie = 0.0f;
        this.delta = 0.0f;
        this.echo = 0.0f;
        this.foxtrot = 1.0f;
        this.golf = 1.0f;
        this.hotel = 0.0f;
        this.india = 0.0f;
        Matrix matrix = new Matrix();
        this.juliet = matrix;
        this.kilo = null;
        this.charlie = jVar.charlie;
        this.delta = jVar.delta;
        this.echo = jVar.echo;
        this.foxtrot = jVar.foxtrot;
        this.golf = jVar.golf;
        this.hotel = jVar.hotel;
        this.india = jVar.india;
        String str = jVar.kilo;
        this.kilo = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(jVar.juliet);
        ArrayList arrayList = jVar.bravo;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            Object obj = arrayList.get(i4);
            if (obj instanceof j) {
                this.bravo.add(new j((j) obj, eVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.echo = 0.0f;
                    lVar2.golf = 1.0f;
                    lVar2.hotel = 1.0f;
                    lVar2.india = 0.0f;
                    lVar2.juliet = 1.0f;
                    lVar2.kilo = 0.0f;
                    lVar2.lima = Paint.Cap.BUTT;
                    lVar2.mike = Paint.Join.MITER;
                    lVar2.november = 4.0f;
                    lVar2.delta = iVar.delta;
                    lVar2.echo = iVar.echo;
                    lVar2.golf = iVar.golf;
                    lVar2.foxtrot = iVar.foxtrot;
                    lVar2.charlie = iVar.charlie;
                    lVar2.hotel = iVar.hotel;
                    lVar2.india = iVar.india;
                    lVar2.juliet = iVar.juliet;
                    lVar2.kilo = iVar.kilo;
                    lVar2.lima = iVar.lima;
                    lVar2.mike = iVar.mike;
                    lVar2.november = iVar.november;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.bravo.add(lVar);
                Object obj2 = lVar.bravo;
                if (obj2 != null) {
                    eVar.put(obj2, lVar);
                }
            }
        }
    }
}
