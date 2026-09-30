package al;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import bv.ax;
import bv.u;
import bv.v;

/* loaded from: classes3.dex */
public final class b extends Drawable.ConstantState {
    public final e alpha;
    public boolean amber;
    public ColorFilter azure;
    public boolean beige;
    public ColorStateList black;
    public PorterDuff.Mode blue;
    public Resources bravo;
    public boolean bronze;
    public int charlie;
    public boolean coral;
    public int[][] crimson;
    public u cyan;
    public int delta;
    public int echo;
    public ax emerald;
    public SparseArray foxtrot;
    public Drawable[] golf;
    public int hotel;
    public boolean india;
    public boolean juliet;
    public Rect kilo;
    public boolean lima;
    public boolean mike;
    public int november;
    public int oscar;
    public int papa;
    public int quebec;
    public boolean romeo;
    public int sierra;
    public boolean tango;
    public boolean uniform;
    public boolean victor;
    public boolean whiskey;
    public int xray;
    public int yankee;
    public int zulu;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i4;
        Rect rect;
        this.india = false;
        this.lima = false;
        this.whiskey = true;
        this.yankee = 0;
        this.zulu = 0;
        this.alpha = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.bravo;
        } else {
            resources2 = null;
        }
        this.bravo = resources2;
        if (bVar != null) {
            i4 = bVar.charlie;
        } else {
            i4 = 0;
        }
        int i5 = e.f2683m;
        i4 = resources != null ? resources.getDisplayMetrics().densityDpi : i4;
        i4 = i4 == 0 ? 160 : i4;
        this.charlie = i4;
        if (bVar != null) {
            this.delta = bVar.delta;
            this.echo = bVar.echo;
            this.uniform = true;
            this.victor = true;
            this.india = bVar.india;
            this.lima = bVar.lima;
            this.whiskey = bVar.whiskey;
            this.xray = bVar.xray;
            this.yankee = bVar.yankee;
            this.zulu = bVar.zulu;
            this.amber = bVar.amber;
            this.azure = bVar.azure;
            this.beige = bVar.beige;
            this.black = bVar.black;
            this.blue = bVar.blue;
            this.bronze = bVar.bronze;
            this.coral = bVar.coral;
            if (bVar.charlie == i4) {
                if (bVar.juliet) {
                    if (bVar.kilo != null) {
                        rect = new Rect(bVar.kilo);
                    } else {
                        rect = null;
                    }
                    this.kilo = rect;
                    this.juliet = true;
                }
                if (bVar.mike) {
                    this.november = bVar.november;
                    this.oscar = bVar.oscar;
                    this.papa = bVar.papa;
                    this.quebec = bVar.quebec;
                    this.mike = true;
                }
            }
            if (bVar.romeo) {
                this.sierra = bVar.sierra;
                this.romeo = true;
            }
            if (bVar.tango) {
                this.tango = true;
            }
            Drawable[] drawableArr = bVar.golf;
            this.golf = new Drawable[drawableArr.length];
            this.hotel = bVar.hotel;
            SparseArray sparseArray = bVar.foxtrot;
            if (sparseArray != null) {
                this.foxtrot = sparseArray.clone();
            } else {
                this.foxtrot = new SparseArray(this.hotel);
            }
            int i10 = this.hotel;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.foxtrot.put(i11, constantState);
                    } else {
                        this.golf[i11] = drawableArr[i11];
                    }
                }
            }
        } else {
            this.golf = new Drawable[10];
            this.hotel = 0;
        }
        if (bVar != null) {
            this.crimson = bVar.crimson;
        } else {
            this.crimson = new int[this.golf.length];
        }
        if (bVar != null) {
            this.cyan = bVar.cyan;
            this.emerald = bVar.emerald;
        } else {
            this.cyan = new u((Object) null);
            this.emerald = new ax(0);
        }
    }

    public final int alpha(Drawable drawable) {
        int i4 = this.hotel;
        if (i4 >= this.golf.length) {
            int i5 = i4 + 10;
            Drawable[] drawableArr = new Drawable[i5];
            Drawable[] drawableArr2 = this.golf;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i4);
            }
            this.golf = drawableArr;
            int[][] iArr = new int[i5];
            System.arraycopy(this.crimson, 0, iArr, 0, i4);
            this.crimson = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.alpha);
        this.golf[i4] = drawable;
        this.hotel++;
        this.echo = drawable.getChangingConfigurations() | this.echo;
        this.romeo = false;
        this.tango = false;
        this.kilo = null;
        this.juliet = false;
        this.mike = false;
        this.uniform = false;
        return i4;
    }

    public final void bravo() {
        this.mike = true;
        charlie();
        int i4 = this.hotel;
        Drawable[] drawableArr = this.golf;
        this.oscar = -1;
        this.november = -1;
        this.quebec = 0;
        this.papa = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.november) {
                this.november = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.oscar) {
                this.oscar = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.papa) {
                this.papa = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.quebec) {
                this.quebec = minimumHeight;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i4 = this.hotel;
        Drawable[] drawableArr = this.golf;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.foxtrot.get(i5);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void charlie() {
        SparseArray sparseArray = this.foxtrot;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = this.foxtrot.keyAt(i4);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.foxtrot.valueAt(i4);
                Drawable[] drawableArr = this.golf;
                Drawable newDrawable = constantState.newDrawable(this.bravo);
                newDrawable.setLayoutDirection(this.xray);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.alpha);
                drawableArr[keyAt] = mutate;
            }
            this.foxtrot = null;
        }
    }

    public final Drawable delta(int i4) {
        int indexOfKey;
        Drawable drawable = this.golf[i4];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.foxtrot;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i4)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.foxtrot.valueAt(indexOfKey)).newDrawable(this.bravo);
        newDrawable.setLayoutDirection(this.xray);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.alpha);
        this.golf[i4] = mutate;
        this.foxtrot.removeAt(indexOfKey);
        if (this.foxtrot.size() == 0) {
            this.foxtrot = null;
        }
        return mutate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final int echo(int i4) {
        ?? r5;
        if (i4 < 0) {
            return 0;
        }
        ax axVar = this.emerald;
        int i5 = 0;
        int alpha = bw.a.alpha(axVar.silver, i4, axVar.purple);
        if (alpha >= 0 && (r5 = axVar.red[alpha]) != v.charlie) {
            i5 = r5;
        }
        return i5.intValue();
    }

    public final int foxtrot(int[] iArr) {
        int[][] iArr2 = this.crimson;
        int i4 = this.hotel;
        for (int i5 = 0; i5 < i4; i5++) {
            if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.delta | this.echo;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
