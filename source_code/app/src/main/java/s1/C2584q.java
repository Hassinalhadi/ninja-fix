package s1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: s1.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2584q {
    public ViewParent alpha;
    public ViewParent bravo;
    public final ViewGroup charlie;
    public boolean delta;
    public int[] echo;

    public C2584q(ViewGroup viewGroup) {
        this.charlie = viewGroup;
    }

    public final boolean alpha(float f5, float f10, boolean z2) {
        ViewParent echo;
        if (this.delta && (echo = echo(0)) != null) {
            try {
                return echo.onNestedFling(this.charlie, f5, f10, z2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + echo + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    public final boolean bravo(float f5, float f10) {
        ViewParent echo;
        if (this.delta && (echo = echo(0)) != null) {
            try {
                return echo.onNestedPreFling(this.charlie, f5, f10);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + echo + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    public final boolean charlie(int i4, int i5, int[] iArr, int[] iArr2, int i10) {
        ViewParent echo;
        int i11;
        int i12;
        if (!this.delta || (echo = echo(i10)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.charlie;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i11 = iArr2[0];
            i12 = iArr2[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr == null) {
            if (this.echo == null) {
                this.echo = new int[2];
            }
            iArr = this.echo;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (echo instanceof r) {
            ((r) echo).onNestedPreScroll(viewGroup, i4, i5, iArr3, i10);
        } else if (i10 == 0) {
            try {
                echo.onNestedPreScroll(viewGroup, i4, i5, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + echo + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i11;
            iArr2[1] = iArr2[1] - i12;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean delta(int i4, int i5, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        ViewParent echo;
        int i13;
        int i14;
        int[] iArr3;
        if (this.delta && (echo = echo(i12)) != null) {
            if (i4 == 0 && i5 == 0 && i10 == 0 && i11 == 0) {
                if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    return false;
                }
            } else {
                ViewGroup viewGroup = this.charlie;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i13 = iArr[0];
                    i14 = iArr[1];
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                if (iArr2 == null) {
                    if (this.echo == null) {
                        this.echo = new int[2];
                    }
                    int[] iArr4 = this.echo;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (echo instanceof InterfaceC2585s) {
                    ((InterfaceC2585s) echo).onNestedScroll(viewGroup, i4, i5, i10, i11, i12, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i10;
                    iArr3[1] = iArr3[1] + i11;
                    if (echo instanceof r) {
                        ((r) echo).onNestedScroll(viewGroup, i4, i5, i10, i11, i12);
                    } else if (i12 == 0) {
                        try {
                            echo.onNestedScroll(viewGroup, i4, i5, i10, i11);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + echo + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i13;
                    iArr[1] = iArr[1] - i14;
                }
                return true;
            }
        }
        return false;
    }

    public final ViewParent echo(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                return null;
            }
            return this.bravo;
        }
        return this.alpha;
    }

    public final boolean foxtrot(int i4) {
        if (echo(i4) != null) {
            return true;
        }
        return false;
    }

    public final boolean golf(int i4, int i5) {
        boolean onStartNestedScroll;
        if (!foxtrot(i5)) {
            if (this.delta) {
                View view = this.charlie;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z2 = parent instanceof r;
                    if (z2) {
                        onStartNestedScroll = ((r) parent).onStartNestedScroll(view2, view, i4, i5);
                    } else {
                        if (i5 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i4);
                            } catch (AbstractMethodError e) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i5 != 0) {
                            if (i5 == 1) {
                                this.bravo = parent;
                            }
                        } else {
                            this.alpha = parent;
                        }
                        if (z2) {
                            ((r) parent).onNestedScrollAccepted(view2, view, i4, i5);
                        } else if (i5 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i4);
                            } catch (AbstractMethodError e4) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e4);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void hotel(int i4) {
        ViewParent echo = echo(i4);
        if (echo != null) {
            boolean z2 = echo instanceof r;
            ViewGroup viewGroup = this.charlie;
            if (z2) {
                ((r) echo).onStopNestedScroll(viewGroup, i4);
            } else if (i4 == 0) {
                try {
                    echo.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + echo + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i4 != 0) {
                if (i4 == 1) {
                    this.bravo = null;
                    return;
                }
                return;
            }
            this.alpha = null;
        }
    }
}
