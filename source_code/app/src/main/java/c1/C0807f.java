package c1;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.mlkit.vision.barcode.common.Barcode;

/* renamed from: c1.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0807f {
    public final ConstraintLayout alpha;
    public int bravo;
    public int charlie;
    public int delta;
    public int echo;
    public int foxtrot;
    public int golf;
    public final /* synthetic */ ConstraintLayout hotel;

    public C0807f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.hotel = constraintLayout;
        this.alpha = constraintLayout2;
    }

    public static boolean alpha(int i4, int i5, int i10) {
        if (i4 != i5) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            if (mode2 == 1073741824) {
                if ((mode == Integer.MIN_VALUE || mode == 0) && i10 == size) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bravo(Z0.d dVar, a1.b bVar) {
        int makeMeasureSpec;
        int i4;
        int mike;
        int makeMeasureSpec2;
        Z0.e eVar;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int baseline;
        int i5;
        int i10;
        boolean z15;
        int i11;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i12;
        boolean z20;
        boolean z21;
        int i13;
        if (dVar != null) {
            if (dVar.white == 8) {
                bVar.echo = 0;
                bVar.foxtrot = 0;
                bVar.golf = 0;
                return;
            }
            if (dVar.magenta != null) {
                C0821t c0821t = ConstraintLayout.f3029i;
                ConstraintLayout constraintLayout = this.hotel;
                int i14 = bVar.alpha;
                int i15 = bVar.bravo;
                int i16 = bVar.charlie;
                int i17 = bVar.delta;
                int i18 = this.bravo + this.charlie;
                int i19 = this.delta;
                View view = dVar.teal;
                int mike2 = av.q.mike(i14);
                Z0.c cVar = dVar.fuchsia;
                Z0.c cVar2 = dVar.cyan;
                if (mike2 != 0) {
                    if (mike2 != 1) {
                        if (mike2 != 2) {
                            if (mike2 != 3) {
                                i4 = 0;
                            } else {
                                int i20 = this.foxtrot;
                                if (cVar2 != null) {
                                    i13 = cVar2.golf;
                                } else {
                                    i13 = 0;
                                }
                                if (cVar != null) {
                                    i13 += cVar.golf;
                                }
                                i4 = ViewGroup.getChildMeasureSpec(i20, i19 + i13, -1);
                            }
                            mike = av.q.mike(i15);
                            if (mike == 0) {
                                if (mike != 1) {
                                    if (mike != 2) {
                                        if (mike != 3) {
                                            makeMeasureSpec2 = 0;
                                        } else {
                                            int i21 = this.golf;
                                            if (cVar2 != null) {
                                                i12 = dVar.emerald.golf;
                                            } else {
                                                i12 = 0;
                                            }
                                            if (cVar != null) {
                                                i12 += dVar.gold.golf;
                                            }
                                            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i21, i18 + i12, -1);
                                        }
                                    } else {
                                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.golf, i18, -2);
                                        if (dVar.sierra == 1) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        int i22 = bVar.juliet;
                                        if (i22 == 1 || i22 == 2) {
                                            if (view.getMeasuredWidth() == dVar.quebec()) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            if (bVar.juliet == 2 || !z18 || ((z18 && z19) || dVar.azure())) {
                                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.kilo(), 1073741824);
                                            }
                                        }
                                    }
                                } else {
                                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.golf, i18, -2);
                                }
                            } else {
                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                            }
                            eVar = (Z0.e) dVar.magenta;
                            if (eVar == null && Z0.j.charlie(constraintLayout.f3031b, Barcode.FORMAT_QR_CODE) && view.getMeasuredWidth() == dVar.quebec() && view.getMeasuredWidth() < eVar.quebec() && view.getMeasuredHeight() == dVar.kilo() && view.getMeasuredHeight() < eVar.kilo() && view.getBaseline() == dVar.pink && !dVar.zulu() && alpha(dVar.coral, i4, dVar.quebec()) && alpha(dVar.crimson, makeMeasureSpec2, dVar.kilo())) {
                                bVar.echo = dVar.quebec();
                                bVar.foxtrot = dVar.kilo();
                                bVar.golf = dVar.pink;
                                return;
                            }
                            if (i14 != 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i15 != 3) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (i15 == 4 && i15 != 1) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (i14 == 4 && i14 != 1) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (!z2 && dVar.ochre > 0.0f) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z10 && dVar.ochre > 0.0f) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (view != null) {
                                return;
                            }
                            C0806e c0806e = (C0806e) view.getLayoutParams();
                            int i23 = bVar.juliet;
                            if (i23 != 1 && i23 != 2 && z2 && dVar.romeo == 0 && z10 && dVar.sierra == 0) {
                                i10 = 0;
                                i11 = -1;
                                z15 = false;
                                baseline = 0;
                                i5 = 0;
                            } else {
                                if ((view instanceof AbstractC0822u) && (dVar instanceof Z0.g)) {
                                    ((AbstractC0822u) view).juliet((Z0.g) dVar, i4, makeMeasureSpec2);
                                } else {
                                    view.measure(i4, makeMeasureSpec2);
                                }
                                dVar.coral = i4;
                                dVar.crimson = makeMeasureSpec2;
                                dVar.golf = false;
                                int measuredWidth = view.getMeasuredWidth();
                                int measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                int i24 = dVar.uniform;
                                if (i24 > 0) {
                                    i5 = Math.max(i24, measuredWidth);
                                } else {
                                    i5 = measuredWidth;
                                }
                                int i25 = dVar.victor;
                                if (i25 > 0) {
                                    i5 = Math.min(i25, i5);
                                }
                                int i26 = dVar.xray;
                                if (i26 > 0) {
                                    i10 = Math.max(i26, measuredHeight);
                                } else {
                                    i10 = measuredHeight;
                                }
                                boolean z22 = z14;
                                int i27 = dVar.yankee;
                                if (i27 > 0) {
                                    i10 = Math.min(i27, i10);
                                }
                                if (!Z0.j.charlie(constraintLayout.f3031b, 1)) {
                                    if (z13 && z11) {
                                        i5 = (int) ((i10 * dVar.ochre) + 0.5f);
                                    } else if (z22 && z12) {
                                        i10 = (int) ((i5 / dVar.ochre) + 0.5f);
                                    }
                                }
                                if (measuredWidth == i5 && measuredHeight == i10) {
                                    i11 = -1;
                                    z15 = false;
                                } else {
                                    if (measuredWidth != i5) {
                                        i4 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                                    }
                                    if (measuredHeight != i10) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                                    }
                                    view.measure(i4, makeMeasureSpec2);
                                    dVar.coral = i4;
                                    dVar.crimson = makeMeasureSpec2;
                                    z15 = false;
                                    dVar.golf = false;
                                    i5 = view.getMeasuredWidth();
                                    i10 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                    i11 = -1;
                                }
                            }
                            if (baseline != i11) {
                                z16 = true;
                            } else {
                                z16 = z15;
                            }
                            if (i5 == bVar.charlie && i10 == bVar.delta) {
                                z17 = z15;
                            } else {
                                z17 = true;
                            }
                            bVar.india = z17;
                            if (c0806e.purple) {
                                z16 = true;
                            }
                            if (z16 && baseline != -1 && dVar.pink != baseline) {
                                bVar.india = true;
                            }
                            bVar.echo = i5;
                            bVar.foxtrot = i10;
                            bVar.hotel = z16;
                            bVar.golf = baseline;
                            return;
                        }
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.foxtrot, i19, -2);
                        if (dVar.romeo == 1) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        int i28 = bVar.juliet;
                        if (i28 == 1 || i28 == 2) {
                            if (view.getMeasuredHeight() == dVar.kilo()) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if (bVar.juliet == 2 || !z20 || ((z20 && z21) || dVar.amber())) {
                                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.quebec(), 1073741824);
                            }
                        }
                    } else {
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.foxtrot, i19, -2);
                    }
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                }
                i4 = makeMeasureSpec;
                mike = av.q.mike(i15);
                if (mike == 0) {
                }
                eVar = (Z0.e) dVar.magenta;
                if (eVar == null) {
                }
                if (i14 != 3) {
                }
                if (i15 != 3) {
                }
                if (i15 == 4) {
                }
                z11 = true;
                if (i14 == 4) {
                }
                z12 = true;
                if (!z2) {
                }
                z13 = false;
                if (!z10) {
                }
                z14 = false;
                if (view != null) {
                }
            }
        }
    }
}
